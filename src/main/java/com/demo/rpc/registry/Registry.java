package com.demo.rpc.registry;

import org.apache.curator.x.discovery.ServiceInstance;

import java.util.List;

/**
 * @ClassName:
 * @author:
 * @Description:
 * @Date
 **/
public interface Registry<T> {
    void registerService(ServiceInstance<T> service) throws Exception;

    void unregisterService(ServiceInstance<T> service) throws Exception;

    List<ServiceInstance<T>> queryForInstances(String name);
}
