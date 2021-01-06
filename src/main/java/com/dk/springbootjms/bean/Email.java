package com.dk.springbootjms.bean;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Email implements Serializable {

    private String to;
    private String body;
}