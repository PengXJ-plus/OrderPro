package com.topplus.search.entity;

import lombok.Data;

/**
 * (WallCrackEntity)表实体类裂缝
 *
 * @author makejava
 * @since 2020-04-30 15:41:01
 */

@Data
public class WallCrackEntity {

    private Integer cackid;

    private String vrect;

    private String vpoint;

    private Object cracklen;

    private Object crackwid;

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
