package com.topplus.search.dao;

import com.topplus.search.entity.TiledMapEntity;
import com.topplus.search.entity.WallCrackEntity;
import com.topplus.search.entity.WaterLeakEntity;
import com.topplus.search.entity.vo.TileImageParamVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * (TiledMapEntity)表数据库访问层
 *
 * @author PENGXJ
 * @since 2020-04-29 15:09:06
 */
 @Mapper
public interface TiledMapMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 对象
     */
    TiledMapEntity queryById(Object tid);




    /**
     * 通过实体作为筛选条件查询
     * @param param 参数
     * @return 对象
     */
    List<TiledMapEntity> selectMileage(TileImageParamVo param);


    /**
     * 掺水瓦片请求
     * @param param 参数
     * @return 对象
     */
    List<WaterLeakEntity> selectTileImageSeep(TileImageParamVo param);

    /**
     * 掺水数据
     * @param param 参数
     * @return 对象
     */
    List<WaterLeakEntity> selectSeep(TileImageParamVo param);

    /**
     * 裂缝瓦片图
     * @param param 参数
     * @return 对象
     */
    List<WallCrackEntity> selectTileImageCrack(TileImageParamVo param);

    /**
     * 裂缝信息
     * @param param 参数
     * @return 对象
     */
    List<WallCrackEntity> selectCrack(TileImageParamVo param);
}
