package com.puffer.discovery.serviceregistry;

import org.springframework.cloud.client.serviceregistry.AbstractAutoServiceRegistration;
import org.springframework.cloud.client.serviceregistry.ServiceRegistry;

/**
 * @author buyi
 * @date 2019年09月29日 16:30:44
 * @since
 */
public class RedisAutoServiceRegistration extends AbstractAutoServiceRegistration<RedisRegistration> {
    protected RedisAutoServiceRegistration(ServiceRegistry<RedisRegistration> serviceRegistry) {
        super(serviceRegistry);
    }

    @Override
    protected RedisRegistration getRegistration() {
        return getRegistration();
    }

    @Override
    protected RedisRegistration getManagementRegistration() {
        return null;
    }

    @Override
    protected int getConfiguredPort() {
        return 0;
    }

    @Override
    protected void setConfiguredPort(int port) {

    }

    @Override
    protected Object getConfiguration() {
        return null;
    }

    @Override
    protected boolean isEnabled() {
        return false;
    }
}
