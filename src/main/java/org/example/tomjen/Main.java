package org.example.tomjen;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {


        new SpringApplicationBuilder(Main.class).sources(Main.class)
                .run(args);


    }
}