package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo saludo = (Saludo) context.getBean("saludo");

        System.out.println(saludo.imprimirSaludo());
    }
}
