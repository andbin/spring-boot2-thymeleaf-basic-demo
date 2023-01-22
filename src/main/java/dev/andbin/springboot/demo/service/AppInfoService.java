/*
SPDX-FileCopyrightText: Copyright (c) 2022-2023 Andrea Binello ("andbin")
SPDX-License-Identifier: MIT
*/

package dev.andbin.springboot.demo.service;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Service;
import org.thymeleaf.Thymeleaf;

import dev.andbin.springboot.demo.model.AppInfo;

@Service
public class AppInfoService {
    @Autowired
    private ServletContext servletContext;

    public AppInfo getAppInfo() {
        AppInfo appInfo = new AppInfo();
        appInfo.setJavaRuntimeVersion(getJavaRuntimeVersion());
        appInfo.setSpringVersion(getSpringVersion());
        appInfo.setSpringBootVersion(getSpringBootVersion());
        appInfo.setThymeleafVersion(getThymeleafVersion());
        appInfo.setServerInfo(getServerInfo());
        return appInfo;
    }

    private String getJavaRuntimeVersion() {
        return Runtime.version().toString();   // Java 9+
    }

    private String getSpringVersion() {
        return SpringVersion.getVersion();
    }

    private String getSpringBootVersion() {
        return SpringBootVersion.getVersion();
    }

    private String getThymeleafVersion() {
        return Thymeleaf.getVersion();
    }

    private String getServerInfo() {
        return servletContext.getServerInfo();
    }
}
