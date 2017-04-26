package org.sgyz.springboot;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * Created by P0093203 on 2017/4/26.
 */
@Component
@Service(version = "1.0.0")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String hello(String name) {
        name = name + "-----------sgyz-----------测试";
        return name;
    }
}