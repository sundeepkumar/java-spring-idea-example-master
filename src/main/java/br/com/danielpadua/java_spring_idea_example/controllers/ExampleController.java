package br.com.danielpadua.java_spring_idea_example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ExampleController
 *
 * @author danielpadua
 *
 */
@RestController
@RequestMapping("/api/example")
//this is a controller 
public class ExampleController {

    @GetMapping("/hello-world")
    //fixed issue with branch
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello  World!");
    }

}
