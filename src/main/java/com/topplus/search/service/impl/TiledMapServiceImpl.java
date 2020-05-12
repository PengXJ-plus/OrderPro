package com.topplus.search.service.impl;

import com.topplus.search.dao.TiledMapMapper;
import com.topplus.search.entity.vo.TileImageParamVo;
import com.topplus.search.service.ITiledMapServiceService;
import com.topplus.search.utils.CommonUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * (TiledMapEntity)表服务实现类
 *
 * @author makejava
 * @since 2020-04-29 15:09:06
 */
@Service
public class TiledMapServiceImpl implements ITiledMapServiceService {
    @Resource
    private TiledMapMapper tiledMapDao;


    /**
     * 瓦片图请求数据
     * @param param 参数
     * @return 对象列表
     */
    @Override
    public TileImageParamVo selectMileage(TileImageParamVo param) {
        param.setTime(CommonUtil.localTimeToStr());
        param.setTileImageArray(tiledMapDao.selectMileage(param).stream()
                .peek(v -> {
                    v.setTpath(CommonUtil.byteToStringByBase64(v.getTpath()));
                    v.setVimpath(CommonUtil.replaceAll(v.getVimpath()));
                    v.setTpath(CommonUtil.replaceAll(v.getTpath()));
                    v.setDimpath(CommonUtil.replaceAll(v.getDimpath()));
                })
                .collect(Collectors.toList()));
        return param;
    }

    /**
     * 渗水瓦片图请求数据
     * @param param 参数
     * @return 对象
     */
    @Override
    public TileImageParamVo selectTileImageSeep(TileImageParamVo param) {
        param.setTime(CommonUtil.localTimeToStr());
        param.setTileImageArray(tiledMapDao.selectTileImageSeep(param).stream()
                .peek(x-> {
                    x.setIimpath(CommonUtil.byteToStringByBase64(x.getIimpath()));
                    x.setVimpath(CommonUtil.replaceAll(x.getVimpath()));
                    x.setTpath(CommonUtil.replaceAll(x.getTpath()));
                    x.setDimpath(CommonUtil.replaceAll(x.getDimpath()));
                })
                .collect(Collectors.toList()));
        return param;
    }

    /**
     * 渗水
     * @param param 参数
     * @return 对象
     */

    @Override
    public TileImageParamVo selectSeep(TileImageParamVo param) {
        param.setTime(CommonUtil.localTimeToStr());
        param.setTileImageArray(new ArrayList<>(tiledMapDao.selectSeep(param)));
        return param;
    }

    /**
     * 裂缝瓦片图
     * @param param 参数
     * @return 对象
     */
    @Override
    public TileImageParamVo selectTileImageCrack(TileImageParamVo param) {
        param.setTime(CommonUtil.localTimeToStr());
        param.setTileImageArray(tiledMapDao.selectTileImageCrack(param).stream()
                .peek(x-> {
                    x.setIimpath(CommonUtil.byteToStringByBase64(x.getIimpath()));
                    x.setVimpath(CommonUtil.replaceAll(x.getVimpath()));
                    x.setTpath(CommonUtil.replaceAll(x.getTpath()));
                    x.setDimpath(CommonUtil.replaceAll(x.getDimpath()));
                })
                .collect(Collectors.toList()));
        return null;
    }

    /**
     * 裂缝数据
     * @param param 参数
     * @return 对象
     */
    @Override
    public TileImageParamVo selectCrack(TileImageParamVo param) {
        param.setTime(CommonUtil.localTimeToStr());
        param.setTileImageArray(new ArrayList<>(tiledMapDao.selectCrack(param)));
        return param;
    }

}
