package com.puffer.discovery.configuration;

import com.puffer.discovery.serviceregistry.RedisAutoServiceRegistration;
import com.puffer.discovery.serviceregistry.RedisServiceRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author buyi
 * @date 2019年09月29日 16:37:03
 * @since
 */
@Configuration
// @EnableConfigurationProperties(RedisConfig.class)
public class RedisAutoServiceRegistrationAutoConfiguration {

    // @Bean
    // public RedisServiceRegistry redisServiceRegistry(RedisConfig redisConfig) {
    //
    //     return new RedisServiceRegistry();
    // }
    //
    // @Bean
    // public RedisAutoServiceRegistration redisAutoServiceRegistration(RedisServiceRegistry redisServiceRegistry) {
    //     return new RedisAutoServiceRegistration(redisServiceRegistry, new AutoServiceRegistrationProperties());
    // }
    //
    // @Bean
    // @Primary
    // RedisDiscoveryClient redisDiscoveryClient() {
    //     return new RedisDiscoveryClient();
    // }
}
