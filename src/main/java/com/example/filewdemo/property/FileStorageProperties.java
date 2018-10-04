package com.example.filewdemo.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "file")
//binds all properties with the prefix "file"
//to the corresponding fields of the POJO class.

public class FileStorageProperties {
	
	public String getUploadDir() {
		return uploadDir;
	}

	public void setUploadDir(String uploadDir) {
		this.uploadDir = uploadDir;
	}

	private String uploadDir;

}
