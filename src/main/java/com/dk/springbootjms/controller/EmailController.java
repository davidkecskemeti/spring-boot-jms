package com.dk.springbootjms.controller;

import com.dk.springbootjms.bean.Email;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/email")
public class EmailController {

  @Autowired
  private JmsTemplate jmsTemplate;

  @PostMapping("/send")
  public void send(@RequestBody Email email) {
    log.info("Sending a email:"+email.toString());
    jmsTemplate.convertAndSend("emailQueue", email);
  }
}