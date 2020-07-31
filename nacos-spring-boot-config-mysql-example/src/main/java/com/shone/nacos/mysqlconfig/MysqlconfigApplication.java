package com.shone.nacos.mysqlconfig;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@NacosPropertySource(dataId = "springboot-mysql-config-example",autoRefreshed = true)
@SpringBootApplication
public class MysqlconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysqlconfigApplication.class, args);
    }

}
