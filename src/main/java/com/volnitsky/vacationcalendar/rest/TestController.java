package com.volnitsky.vacationcalendar.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
@Slf4j
public class TestController {

  @GetMapping
  public String testPage() {
    return "test";
  }

}
