package com.puffer.discovery.serviceregistry;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author buyi
 * @date 2019年09月29日 16:33:45
 * @since
 */
public class RedisDiscoveryClient implements DiscoveryClient {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public String description() {
        return "redis注册中心服务发现";
    }

    @Override
    public ServiceInstance getLocalServiceInstance() {
        return null;
    }

    @Override
    public List<ServiceInstance> getInstances(String serviceId) {
        //获取注册服务列表

        return null;
    }

    @Override
    public List<String> getServices() {
        List<String> list = new ArrayList<>();
        list.addAll(stringRedisTemplate.keys("*"));
        return list;
    }
}
