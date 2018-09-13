package com.example.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 1400469
 * @desc
 * @time 2018/9/11 8:58
 */


@Service
public class CalcService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod  = "calcFallBack")
    public int calc(){
        return restTemplate.getForEntity("http://CALC-SERVICE/add/calc?a=10&b=20", Integer.class).getBody();
    }

    @HystrixCommand(fallbackMethod  = "typeFallBack")
    public String type(){
        return restTemplate.getForEntity("http://CALC-SERVICE/add/type", String.class).getBody();
    }

    private int calcFallBack(){
        return -1;
    }

    private String typeFallBack(){
        return "wrong";
    }
}
