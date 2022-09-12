package com.inspire.Imp;

import com.inspire.controller;
import org.apache.dubbo.config.annotation.Service;

@Service
public class serviceProvider implements controller {
    @Override
    public void test() {
        System.out.println(9999999);
    }
}
