package com.topplus.search;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 4/28
 *
 * @author PENGXJ
 */
@SpringBootApplication
@MapperScan("com.topplus.search.dao")
public class SearchProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SearchProjectApplication.class, args);
    }

}
