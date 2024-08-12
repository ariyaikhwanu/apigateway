package com.jenius_cloud.api_gateway.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class CustomProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        // Contoh modifikasi request
        String originalBody = exchange.getIn().getBody(String.class);
        exchange.getIn().setBody(originalBody + " - processed by CustomProcessor");
    }
}
