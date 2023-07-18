package com.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public String imprimirSaludo() {
        return "Hello world desde la clase saludo.";
    }

}
