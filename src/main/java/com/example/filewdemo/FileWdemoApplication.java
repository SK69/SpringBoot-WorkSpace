package com.example.filewdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.filewdemo.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
	FileStorageProperties.class
})
public class FileWdemoApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(FileWdemoApplication.class, args);
	}
}
