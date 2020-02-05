package dplatonov.testspock.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dplatonov.testspock.service.TestService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TestController {
  private final TestService service;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  @ResponseBody
  public String getText() {
    return service.getText();
  }
}
