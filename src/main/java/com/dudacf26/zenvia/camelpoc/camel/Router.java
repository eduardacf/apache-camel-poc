package com.dudacf26.zenvia.camelpoc.camel;

import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Router extends RouteBuilder {

    private final static Logger logger = Logger.getLogger(Router.class);

    @Override
    public void configure() throws Exception {
        from("timer://foo?fixedRate=true&period=4000")
       .to ("log: a cada 4 segundos ele irá imprimir");    }
}
