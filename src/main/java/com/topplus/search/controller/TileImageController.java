package com.topplus.search.controller;

import com.topplus.search.entity.vo.TileImageParamVo;
import com.topplus.search.service.ITiledMapServiceService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * (TileImage)表控制层
 *
 * @author makejava
 * @since 2020-04-28 17:41:17
 */
@RestController
@RequestMapping("test")
@AllArgsConstructor
public class TileImageController {

    private ITiledMapServiceService tiledMapService;

    /**
     * 瓦片图请求
     *
     * @return 单条数据
     */
    @RequestMapping(value = "tile_image", method = {RequestMethod.POST,RequestMethod.GET})
    public ResponseEntity<TileImageParamVo> getTileImages(TileImageParamVo param) {
        getDefaultStartAndEnd(param);
        return new ResponseEntity<>(tiledMapService.selectMileage(param), HttpStatus.OK);
    }


    /**
     * 渗水瓦片请求
     *
     * @return 单条数据
     */
    @RequestMapping(value = "tile_image_seep", method = {RequestMethod.POST,RequestMethod.GET})
    public ResponseEntity<Object> getTileImageSeep(TileImageParamVo param) {
        getDefaultStartAndEnd(param);
        return new ResponseEntity<>(tiledMapService.selectTileImageSeep(param), HttpStatus.OK);
    }


    /**
     * 渗水请求
     *
     * @return 单条数据
     */
    @RequestMapping(value = "seep", method = {RequestMethod.POST,RequestMethod.GET})
    public ResponseEntity<Object> getSeeps(@RequestBody TileImageParamVo param) {
        getDefaultStartAndEnd(param);
        return new ResponseEntity<>(tiledMapService.selectSeep(param), HttpStatus.OK);
    }

    /**
     * 裂缝瓦片请求
     *
     * @return 单条数据
     */
    @RequestMapping(value = "tile_image_crack", method = {RequestMethod.POST,RequestMethod.GET})
    public ResponseEntity<Object> getTileImageCrack(@RequestBody TileImageParamVo param) {
        getDefaultStartAndEnd(param);
        return new ResponseEntity<>(tiledMapService.selectTileImageCrack(param), HttpStatus.OK);
    }


    /**
     * 裂缝瓦片请求
     *
     * @return 单条数据
     */
    @RequestMapping(value = "crack", method = {RequestMethod.POST,RequestMethod.GET})
    public ResponseEntity<Object> getCrack(@RequestBody TileImageParamVo param) {
        getDefaultStartAndEnd(param);
        return new ResponseEntity<>(tiledMapService.selectCrack(param), HttpStatus.OK);
    }




    /**
     * 默认值
     * @param param
     */
    private void getDefaultStartAndEnd(TileImageParamVo param) {
        param.setMileageStart("".equals(param.getMileageStart()) || param.getMileageStart() == null ? 0 : param.getMileageStart());
        param.setMileageEnd("".equals(param.getMileageEnd()) || param.getMileageEnd() == null ? 1000 : param.getMileageEnd());
    }

}
