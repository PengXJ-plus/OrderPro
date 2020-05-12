package com.topplus.search.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * (TiledMapEntity)实体类
 *
 * @author makejava
 * @since 2020-04-29 15:09:06
 */
@Data
@TableName("TileMap")
public class TiledMapEntity implements Serializable {
    private static final long serialVersionUID = 685014799935704955L;

    private String tileimage_id;

    private String tpath;

    private String vimpath;

    private String iimpath;

    private String dimpath;

    private Integer mileage;

    private Integer preset;

    private Integer angle;



}
