package com.example.ribbon.controller;

import com.example.ribbon.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 1400469
 * @desc
 * @time 2018/9/10 15:55
 */

@RestController
public class CalcController {
        @Autowired
        CalcService calcService;

        @RequestMapping("/calc")
        public int calc(){
            return calcService.calc();
        }


        @RequestMapping("/type")
        public String type(){
                return calcService.type();
        }
}
