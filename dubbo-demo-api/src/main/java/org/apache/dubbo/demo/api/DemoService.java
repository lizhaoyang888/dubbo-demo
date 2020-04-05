package org.apache.dubbo.demo.api;


import org.apache.dubbo.demo.model.Result;
import org.apache.dubbo.demo.model.User;


public interface DemoService {
    Result sayHello();

    Result sayHello(String name);

    Result sayHello(Long id, String name);

    Result sayHello(User user);
}
