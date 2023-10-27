package de.manu.springtest;

import lombok.Getter;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath*:*.xml"});
        context.registerShutdownHook();
    }
}