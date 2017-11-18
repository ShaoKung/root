package com.junit;

import com.client.FileInfo;
import com.client.FileManagerDelegate;
import com.client.FileManagerService;

public class FileManagerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileInfo fileInfo = new FileInfo();
		fileInfo.setFileName("为生活创造更多可能");
		fileInfo.setFileSize("96352");
		fileInfo.setFileType("docx");
		fileInfo.setOwner("莫扎特");
		fileInfo.setId("15");
		fileInfo.setIsDeleted(0);
		FileManagerService fs=new FileManagerService();
		FileManagerDelegate fmd=fs.getFileManagerPort();
		String result=fmd.readFileInfoByID(fileInfo);
		System.out.println(result);
		
		
	}

}
