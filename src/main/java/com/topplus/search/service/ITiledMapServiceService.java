package com.topplus.search.service;

import com.topplus.search.entity.vo.TileImageParamVo;

/**
 * (TiledMapEntity)表服务接口
 *
 * @author makejava
 * @since 2020-04-29 15:09:06
 */
public interface ITiledMapServiceService {



    /**
     * 查询多条数据
     * @param param 参数
     * @return 对象
     */
    TileImageParamVo selectMileage(TileImageParamVo param);

    /**
     * 掺水瓦片数据
     * @param param 参数
     * @return 对象
     */
    TileImageParamVo selectTileImageSeep(TileImageParamVo param);

    /**
     * 渗水数据
     * @param param 参数
     * @return 对象
     */
    TileImageParamVo selectSeep(TileImageParamVo param);

    /**
     * 裂缝瓦片图数据
     * @param param 参数
     * @return 对象
     */
    TileImageParamVo selectTileImageCrack(TileImageParamVo param);

    /**
     * 裂缝数据
     * @param param 参数
     * @return 对象
     */
    TileImageParamVo selectCrack(TileImageParamVo param);
}
