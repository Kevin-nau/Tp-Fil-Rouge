package com.example.demo.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HomeController {

    @GetMapping("/")
    public Response home() {
        return new Response("Votre nom", "votreMail@campus-eni.fr", LocalDate.now().toString());
    }

    public static class Response {
        private String name;
        private String email;
        private String date;

        public Response(String name, String email, String date) {
            this.name = name;
            this.email = email;
            this.date = date;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getDate() {
            return date;
        }
    }
}

