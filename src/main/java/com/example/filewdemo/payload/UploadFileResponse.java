package com.example.filewdemo.payload;

public class UploadFileResponse {

	private String fileName;

	private String fileDownloadURI;
	private String fileType;
	private long fileSize;
	
	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public String getFileDownloadURI() {
		return fileDownloadURI;
	}


	public void setFileDownloadURI(String fileDownloadURI) {
		this.fileDownloadURI = fileDownloadURI;
	}


	public String getFileType() {
		return fileType;
	}


	public void setFileType(String fileType) {
		this.fileType = fileType;
	}


	public long getFileSize() {
		return fileSize;
	}


	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}


	
	
	public UploadFileResponse(String fileName, String fileDownloadURI, String fileType, long fileSize) {
		super();
		this.fileName = fileName;
		this.fileDownloadURI = fileDownloadURI;
		this.fileType = fileType;
		this.fileSize = fileSize;
	}
	
}
