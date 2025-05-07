package com.spring.boot.jsf.app.bean;


import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("helloBean")
@RequestScoped
public class HelloBean {
    private String name = "JSF and Spring Boot";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
