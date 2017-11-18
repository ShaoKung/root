package com.sample.action;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import com.sample.model.FileInfo;
import com.sample.util.DBUtil;

@javax.jws.WebService(targetNamespace = "http://action.sample.com/", serviceName = "FileManagerService", portName = "FileManagerPort")
public class FileManagerDelegate {

	com.sample.action.FileManager fileManager = new com.sample.action.FileManager();

	public String addFileInfo(FileInfo fileInfo) {
		return fileManager.addFileInfo(fileInfo);
	}

	public String deleteFileInfoByID(FileInfo fileInfo) {
		return fileManager.deleteFileInfoByID(fileInfo);
	}

	public String readFileInfoByID(FileInfo fileInfo) {
		return fileManager.readFileInfoByID(fileInfo);
	}

	public String updateFileInfo(FileInfo fileInfo) {
		return fileManager.updateFileInfo(fileInfo);
	}

}