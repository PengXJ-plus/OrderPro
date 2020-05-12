package com.topplus.search.entity.vo;

import com.topplus.search.entity.TiledMapEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * TileImageParamVo
 *
 * @author PengXJ
 * @version 2.0
 * @date 2020/4/29 10:30
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TileImageParamVo {

    private Integer mileageStart;
    private Integer mileageEnd;
    private List<Object> tileImageArray;
    private String time;


}
