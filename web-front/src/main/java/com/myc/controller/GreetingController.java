package com.myc.controller;

import com.myc.api.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Front web Requests.
 *
 * <p>route configuration
 */
@RestController
public class GreetingController {

  /** RPC {@link GreetingService} */
  @Resource private GreetingService greetingService;

  /** REST {@link RestTemplate} */
  @Resource private RestTemplate restTemplate;

  /**
   * Greeting route. Called RPC {@link GreetingService}
   *
   * @param name param
   * @return
   */
  @GetMapping("/greeting/{name}")
  public String greeting(@PathVariable("name") String name) {
    return greetingService.say(name);
  }

  /**
   * Hello route. Called REST {@inheritDoc springboot-dubbo-hello}
   *
   * @param name param
   * @return
   */
  @GetMapping("/hello/{name}")
  public String hello(@PathVariable("name") String name) {
    return restTemplate.getForObject("http://localhost:8081/hello/" + name, String.class);
  }
}
