package com.demo.rpc.test;

/**
 * @ClassName:
 * @author:
 * @Description:
 * @Date
 **/
public class DemoServiceImpl {
    public String sayHello(String param) {
        System.out.println("param" + param);
        return "hello:" + param;
    }
}
