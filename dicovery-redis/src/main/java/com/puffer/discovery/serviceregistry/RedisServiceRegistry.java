package com.puffer.discovery.serviceregistry;

import org.springframework.cloud.client.serviceregistry.ServiceRegistry;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

/**
 * @author buyi
 * @date 2019年09月29日 15:57:19
 * @since
 */
public class RedisServiceRegistry implements ServiceRegistry<RedisRegistration> {
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void register(RedisRegistration registration) {
        //注册到服务中心
        stringRedisTemplate.opsForList().leftPush(registration.getServiceId(), registration.getHost() + ":" + registration.getPort());
    }

    @Override
    public void deregister(RedisRegistration registration) {
        //注销
        stringRedisTemplate.opsForList().remove(registration.getServiceId(), 1, registration.getHost() + ":" + registration.getPort());
    }

    @Override
    public void close() {

    }

    @Override
    public void setStatus(RedisRegistration registration, String status) {

    }

    @Override
    public <T> T getStatus(RedisRegistration registration) {
        return null;
    }
}
