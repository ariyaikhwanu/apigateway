package com.jenius_cloud.api_gateway.routes;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Service1Route extends RouteBuilder {

    
    @Override
    public void configure() throws Exception {
          // Check if this method is being called
        System.out.println("Camel Route configure method called");

        restConfiguration().host("localhost").port("8089").component("netty-http").scheme("http");

        rest("/service1/data").get().to("direct:service1");
        from("direct:service1")
            .log("Received request for /service1/data")
            .setBody(constant("Dummy response for /service1/data"));

    }
}
