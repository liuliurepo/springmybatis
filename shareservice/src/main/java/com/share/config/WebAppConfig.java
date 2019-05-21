package com.share.config;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.share.interceptor.Interceptor;

/** 
 * 
 * 注册拦截器 
 * Created by SYSTEM on 2017/8/16. 
 */  
public class WebAppConfig extends WebMvcConfigurerAdapter {  
  
    @Override  
    public void addInterceptors(InterceptorRegistry registry) {  
        //注册自定义拦截器，添加拦截路径和排除拦截路径  
        registry.addInterceptor(new Interceptor()).addPathPatterns("shareservice/**").excludePathPatterns("shareservice/**/login");  
    }  
}