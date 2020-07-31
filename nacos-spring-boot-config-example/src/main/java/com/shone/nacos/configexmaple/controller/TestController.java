package com.shone.nacos.configexmaple.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoClass
 *
 * @author Xiao GuoJian
 * @date 2020/7/31 下午2:53
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @NacosValue(value = "${springboot.config.example.name}",autoRefreshed = true)
    private String name;

    @NacosValue(value = "${springboot.config.example.sex}",autoRefreshed = true)
    private String sex;

    @RequestMapping("/value")
    public String value(){
        return name+" "+sex;
    }

}
