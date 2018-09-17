package com.github.toolsrepo.zuul.simple.config;

import com.github.toolsrepo.zuul.simple.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CommandLineAppStarterRunner implements CommandLineRunner {

    private HelloService helloService;

    public CommandLineAppStarterRunner(HelloService helloService){

        this.helloService = helloService;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info(helloService.getHelloMessage());
    }
}
