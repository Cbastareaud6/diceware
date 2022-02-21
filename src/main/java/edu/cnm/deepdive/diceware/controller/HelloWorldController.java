package edu.cnm.deepdive.diceware.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public String get(@RequestParam(required = false, defaultValue = "DDC coder") String user){

    return "Hello, "+ user;


  }

}
