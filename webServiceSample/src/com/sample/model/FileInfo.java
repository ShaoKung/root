package com.sample.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "fileInfo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "id", "fileName", "owner", "fileSize", "fileType",
		"isDeleted" })
public class FileInfo {

	public String id;
	public String fileName;
	public String owner;
	public String fileSize;
	public String fileType;
	public int isDeleted;

	public FileInfo(String fileName, String owner, String fileSize,
			String fileType, int isDeleted) {
		super();
		this.fileName = fileName;
		this.fileSize = fileSize;
		this.fileType = fileType;
		this.isDeleted = isDeleted;
		this.owner = owner;
	}

	public FileInfo() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getFileSize() {
		return fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
}

