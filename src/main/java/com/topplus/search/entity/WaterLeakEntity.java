package com.topplus.search.entity;

import lombok.Data;

/**
 * (WaterLeakEntity)表实体类渗漏水信息表
 *
 * @author makejava
 * @since 2020-04-29 18:29:30
 */
@Data
public class WaterLeakEntity {

    private Integer seepId;

    private String irbrect;

    private String vrect;

    private String irpoint;

    private String vpoint;

    private Object area;

    private Object tid;

    /**
     * 瓦片图实体
     *
     */
    private Integer tileimage_id;

    private String tpath;

    private String vimpath;

    private String iimpath;

    private String dimpath;

    private Integer mileage;

    private Integer preset;

    private Integer angle;




}
