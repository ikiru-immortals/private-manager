package cn.com.immortals.endpoint.impl;

import cn.com.immortals.endpoint.HelloEndpoint;
import org.springframework.stereotype.Service;

/**
 * Created by panzh on 2017/7/12.
 */
@Service
public class HelloEndpointImpl implements HelloEndpoint{


    public String hello() {
        return "hello";
    }

}
