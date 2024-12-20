package com.springboot_cache.controller;


import com.springboot_cache.service.HeavyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.PanelUI;

@RestController
@RequestMapping("/api/data")
public class MyController {

    @Autowired
    private HeavyService heavyService;

    @GetMapping
    public String getData(){
        return heavyService.getSomeData();
    }


}
