/*
SPDX-FileCopyrightText: Copyright (c) 2022-2023 Andrea Binello ("andbin")
SPDX-License-Identifier: MIT
*/

package dev.andbin.springboot.demo.model;

public class AppInfo {
    private String javaRuntimeVersion;
    private String springVersion;
    private String springBootVersion;
    private String thymeleafVersion;
    private String serverInfo;

    public String getJavaRuntimeVersion() {
        return javaRuntimeVersion;
    }

    public void setJavaRuntimeVersion(String javaRuntimeVersion) {
        this.javaRuntimeVersion = javaRuntimeVersion;
    }

    public String getSpringVersion() {
        return springVersion;
    }

    public void setSpringVersion(String springVersion) {
        this.springVersion = springVersion;
    }

    public String getSpringBootVersion() {
        return springBootVersion;
    }

    public void setSpringBootVersion(String springBootVersion) {
        this.springBootVersion = springBootVersion;
    }

    public String getThymeleafVersion() {
        return thymeleafVersion;
    }

    public void setThymeleafVersion(String thymeleafVersion) {
        this.thymeleafVersion = thymeleafVersion;
    }

    public String getServerInfo() {
        return serverInfo;
    }

    public void setServerInfo(String serverInfo) {
        this.serverInfo = serverInfo;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "["
                + "javaRuntimeVersion=" + javaRuntimeVersion + ", "
                + "springVersion=" + springVersion + ", "
                + "springBootVersion=" + springBootVersion + ", "
                + "thymeleafVersion=" + thymeleafVersion + ", "
                + "serverInfo=" + serverInfo
                + "]";
    }
}
