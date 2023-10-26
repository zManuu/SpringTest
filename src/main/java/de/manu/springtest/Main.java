package de.manu.springtest;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private final AbstractApplicationContext context;

    public static void main(String[] args) {
        var main = new Main(
                new ClassPathXmlApplicationContext(new String[] { "classpath*:*.xml" })
        );
    }

    public Main(AbstractApplicationContext context) {
        this.context = context;
        context.registerShutdownHook();
    }
}