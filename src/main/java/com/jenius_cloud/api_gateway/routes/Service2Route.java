package com.jenius_cloud.api_gateway.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Service2Route extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("rest:get:/service2")
            .to("http://localhost:8082/service2")
            .log("Request routed to service2");
    }
}
