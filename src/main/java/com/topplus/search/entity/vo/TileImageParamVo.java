package com.topplus.search.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

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
public class TileImageParamVo implements Serializable {

    private Integer mileageStart;
    private Integer mileageEnd;
    private List<Object> tileImageArray;
    private String time;


}
