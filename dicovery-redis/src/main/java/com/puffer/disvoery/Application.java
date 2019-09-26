package com.puffer.admin;

import com.puffer.core.context.mybatis.PufferMapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * spring boot 启动类
 *
 * @author puffer
 * @date 2017年11月30日上午11:18:22
 * @since 1.0.0
 */
@SpringBootApplication
@EnableTransactionManagement
@PufferMapperScan(value = "${mybatis.mapper-scan-path}")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
