package com.sbms.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Component
@ToString
@Getter
@Setter
@ConfigurationProperties("config.email")
public class EmailConfig {
	private String host;
	private int id;
	

}
