package org.superbiz.moviefun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.persistence.Basic;

@SpringBootApplication
@ComponentScan({"org.superbiz.moviefun"})
public class Application {

//    ActionServlet actionServlet;
//
//    public Application(ActionServlet actionServlet){
//        this.actionServlet = actionServlet;
//    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean(ActionServlet actionServlet){
        return new ServletRegistrationBean(actionServlet, "/moviefun/*");
    }
}