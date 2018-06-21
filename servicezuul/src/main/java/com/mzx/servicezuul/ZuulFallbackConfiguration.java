package com.mzx.servicezuul;


import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;


/**
 * Created by mozhixun on 2018/6/21.
 */
@Configuration
public class ZuulFallbackConfiguration{



    @Bean

    public HelloWorldFallback helloWorldFallback(){

        return new HelloWorldFallback();

    }

}