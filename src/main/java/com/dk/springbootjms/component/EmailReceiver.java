package com.dk.springbootjms.component;

import com.dk.springbootjms.bean.Email;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EmailReceiver {

  @JmsListener(destination = "emailQueue", containerFactory = "myFactory")
  public void receiveMessage(Email email) {
    log.info("Received <" + email + ">");
  }

}