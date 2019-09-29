package com.puffer.discovery.serviceregistry;

import com.puffer.discovery.configuration.RedisDisvoeryProperties;
import org.springframework.cloud.client.serviceregistry.Registration;

import java.net.URI;
import java.util.Map;

/**
 * redis注册
 *
 * @author buyi
 * @date 2019年09月29日 15:33:22
 * @since 1.0.0
 */
public class RedisRegistration implements Registration {

    private RedisDisvoeryProperties redisDisvoeryProperties;

    public RedisRegistration(RedisDisvoeryProperties redisDisvoeryProperties) {
        this.redisDisvoeryProperties = redisDisvoeryProperties;
    }

    @Override
    public String getServiceId() {
        return redisDisvoeryProperties.getServiceName();
    }

    @Override
    public String getHost() {
        return redisDisvoeryProperties.getHost();
    }

    @Override
    public int getPort() {
        return redisDisvoeryProperties.getPort();
    }

    @Override
    public boolean isSecure() {
        return false;
    }

    @Override
    public URI getUri() {
        return null;
    }

    @Override
    public Map<String, String> getMetadata() {
        return null;
    }
}
