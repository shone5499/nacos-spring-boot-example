package com.shone.nacos.configexmaple;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//使用 @NacosPropertySource 加载 dataId 为 example 的配置源，并开启自动更新：
@NacosPropertySource(dataId = "springboot-config-example",autoRefreshed = true)

@SpringBootApplication
public class ConfigexmapleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigexmapleApplication.class, args);
    }

}
