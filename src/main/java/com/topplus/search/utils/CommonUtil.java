package com.topplus.search.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

/**
 * CommonUtil
 *
 * @author PengXJ
 * @version 2.0
 * @date 2020/4/29 13:58
 **/
public class CommonUtil {

    /**
     * 当前时间并转换成String
     *
     * @return 时间
     */
    public static String localTimeToStr() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    /**
     * 图片转码
     *
     * @param path 路径
     * @return base64
     */
    public static String byteToStringByBase64(String path) {
        String encodeToString = null;
        try {
            if (Files.exists(Paths.get(path))) {
                encodeToString = Base64.getEncoder().encodeToString(Files.readAllBytes(Paths.get(path)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return encodeToString;
    }

}
