package me.cxis.mini.dubbo;

/**
 * Created by Neo on 2018-04-14 09:20.
 */
public class HelloWorldServiceImpl1 implements HelloWorldService1 {
    public String sayHello(String name) {
        return "我接到你的消息了：" + name;
    }
}
