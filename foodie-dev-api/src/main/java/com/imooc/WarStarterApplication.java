package com.imooc;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * WarStarterApplication
 * 打包war [4] 增加war的启动类
 * @author lxd
 * @date 2020/5/6
 **/
public class WarStarterApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        //指向Application这个springboot启动类
        return builder.sources(Application.class);
    }

}
