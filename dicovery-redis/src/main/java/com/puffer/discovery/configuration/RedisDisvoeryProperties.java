package com.puffer.discovery.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * redis服务发现配置
 *
 * @author buyi
 * @date 2019年09月29日 15:40:26
 * @since 1.0.0.
 */
@ConfigurationProperties(RedisDisvoeryProperties.REDIS_DISVOERY_PREFIX)
@Data
public class RedisDisvoeryProperties {
    public static final String REDIS_DISVOERY_PREFIX = "spring.cloud.redis.discovery";

    private String serviceName;
    private String instanceId;
    private String host;
    private Integer port;

}
