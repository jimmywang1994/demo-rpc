package com.demo.rpc.test;

import com.demo.rpc.proxy.DemoRpcProxy;
import com.demo.rpc.registry.ServerInfo;
import com.demo.rpc.registry.ZookeeperRegistry;

/**
 * @ClassName:
 * @author:
 * @Description:
 * @Date
 **/
public class Consumer {
    public static void main(String[] args) throws Exception {
// 创建ZookeeperRegister对象
        ZookeeperRegistry<ServerInfo> discovery = new ZookeeperRegistry<>();
        discovery.start();

        // 创建代理对象，通过代理调用远端Server
        DemoService demoService = DemoRpcProxy.newInstance(DemoService.class, discovery);
        // 调用sayHello()方法，并输出结果
        String result = demoService.sayHello("hello world");
        System.out.println(result);
        Thread.sleep(10000000L);
    }
}
