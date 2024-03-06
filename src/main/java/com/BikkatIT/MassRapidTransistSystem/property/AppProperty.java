package com.BikkatIT.MassRapidTransistSystem.property;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@EnableConfigurationProperties
@ConfigurationProperties("app1")
@Configuration
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppProperty {

	private Map<String, String> messages=new HashMap<>(); 
	
}
