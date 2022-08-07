/*
SPDX-FileCopyrightText: Copyright (c) 2022 Andrea Binello ("andbin")
SPDX-License-Identifier: MIT
*/

package dev.andbin.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import dev.andbin.springboot.demo.service.AppInfoService;

@Controller
public class HomeController {
    @Autowired
    private AppInfoService appInfoService;

    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("appInfo", appInfoService.getAppInfo());
        return "home";   // refers to classpath resource /templates/home.html
    }
}
