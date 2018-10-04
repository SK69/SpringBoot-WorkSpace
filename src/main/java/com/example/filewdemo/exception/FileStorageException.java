package com.example.filewdemo.exception;

public class FileStorageException extends RuntimeException{

	public FileStorageException(String message)
	{
		super(message);
	}
	
	public FileStorageException(String message, Throwable clause)
	{
		super(message, clause);
	}
}
