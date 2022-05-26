package com.example.demo.controller;


import org.springframework.http.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import java.net.URI;
import java.util.Map;

import java.util.Map;

@RestController
public class HelloWorldController
{

//    @RequestMapping("/")
//    public String hello()
//    {
//        return "Hello javaTpoint";
//    }

    @RequestMapping("/welcome")
    public String welcome()
    {
        return "welcome API";
    }

    @RequestMapping("/search")
    public String login()
    {
        return "search works here";
    }

//    @PostMapping (value = "/redirect")
//    public RedirectView redirect(@RequestParam Map<String,String> input){
//        System.out.println(input);
//        RedirectView redirectView = new RedirectView();
//        redirectView.setUrl("https://fullstackdeveloper.guru");
//
//    return redirectView;
//    }

    @PostMapping(value = "/redirect")
    public ResponseEntity<Void> redirect(@RequestParam Map<String,String> input){

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("SAMLResponse",
                "dskfhsldfhsdlfjdslk");

        System.out.println(input);

        return ResponseEntity.status(HttpStatus.FOUND).location(URI.create("https://fullstackdeveloper.guru")).headers(responseHeaders ).build();
    }

//    @PostMapping(value = "/redirect")
//    public RedirectView redirect(@RequestParam Map<String,String> input){
//
//        System.out.println(input);
//
//
//        RedirectView redirectView = new RedirectView();
//        b  b da.setUrl("https://fullstackdeveloper.guru");
//
//        return redirectView;
//
//    }

}