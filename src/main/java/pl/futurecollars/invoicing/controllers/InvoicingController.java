package pl.futurecollars.invoicing.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoicingController {

  @GetMapping
  public String hello() {
    return "Hello World";
  }

  @GetMapping("hello")
  public String hello2() {
    return "Hello World 2";
  }

}