package com.sample.action;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import com.sample.model.FileInfo;
import com.sample.util.DBUtil;

/**
 * 文件管理类 v1.0 方法有增删改查，其中查询只支持单条记录查询
 * */
public class FileManager {

	/**
	 * 
	 * 新增文件基本信息 参数：FileInfo对象
	 * 
	 * **/

	public String addFileInfo(FileInfo fileInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		DBUtil util = new DBUtil();
		Logger log = Logger.getLogger(FileManager.class);

		log.debug("生成文件基本数据开始" + "|" + fileInfo.getFileName() + "|"
				+ fileInfo.getFileSize() + "|" + fileInfo.getOwner() + "|"
				+ fileInfo.getFileType() + "|" + fileInfo.getIsDeleted() + "|"
				+ null);

		int uresult = util
				.update("INSERT INTO T_FILE_BASIC_INFO VALUES (SEQ_FILE_BASIC_INFO_ID.NEXTVAL,?,?,?,?,?,?)",
						fileInfo.getFileName(), fileInfo.getFileSize(),
						fileInfo.getOwner(), fileInfo.getFileType(),
						fileInfo.getIsDeleted(), null);
		if (uresult != 0) {
			map.put("result", 0);
			map.put("desc", "操作成功");
			map.put("oper", "save");
		}
		JSONObject js = new JSONObject(map);
		log.debug("生成文件基本数据结束" + "|" + fileInfo.getFileName() + "|"
				+ fileInfo.getFileSize() + "|" + fileInfo.getOwner() + "|"
				+ fileInfo.getFileType() + "|" + fileInfo.getIsDeleted() + "|"
				+ null);
		return js.toString();
	}

	/**
	 * 
	 * 按照ID删除文件信息 参数：FileInfo对象
	 * 
	 * **/

	public String deleteFileInfoByID(FileInfo fileInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		DBUtil util = new DBUtil();
		Logger log = Logger.getLogger(FileManager.class);

		log.debug("刪除文件基本数据开始" + "|" + fileInfo.getFileName() + "|"
				+ fileInfo.getFileSize() + "|" + fileInfo.getOwner() + "|"
				+ fileInfo.getFileType() + "|" + fileInfo.getIsDeleted() + "|"
				+ null);

		int uresult = util.update(
				"DELETE FROM T_FILE_BASIC_INFO A WHERE A.ID=?",
				fileInfo.getId());
		if (uresult != 0) {
			map.put("result", 0);
			map.put("desc", "操作成功");
			map.put("oper", "delete");
		}
		JSONObject js = new JSONObject(map);

		log.debug("刪除文件基本数据结束" + "|" + fileInfo.getFileName() + "|"
				+ fileInfo.getFileSize() + "|" + fileInfo.getOwner() + "|"
				+ fileInfo.getFileType() + "|" + fileInfo.getIsDeleted() + "|"
				+ null);
		return js.toString();
	}

	/**
	 * 
	 * 按照ID获取文件信息 参数：FileInfo对象
	 * 
	 * **/

	public String readFileInfoByID(FileInfo fileInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		DBUtil util = new DBUtil();
		FileInfo fileInfoReturn = new FileInfo();
		JSONObject js = null;
		Logger log = Logger.getLogger(FileManager.class);

		log.debug("获取文件基本数据开始" + fileInfo.getId());

		ResultSet rs = util.Query("SELECT * FROM T_FILE_BASIC_INFO WHERE ID=?",
				fileInfo.getId());
		try {
			while (rs.next()) {
				fileInfoReturn.setFileName(rs.getString("FILENAME"));
				fileInfoReturn.setId(rs.getString("ID"));
				fileInfoReturn.setFileSize(rs.getString("FILESIZE"));
				fileInfoReturn.setOwner(rs.getString("OWNER"));
				fileInfoReturn.setFileType(rs.getString("FILETYPE"));
				fileInfoReturn.setIsDeleted(rs.getInt("ISDELETED"));
			}
			map.put("result", 0);
			map.put("desc", "操作成功");
			map.put("oper", "read");
			map.put("fileInfo", fileInfoReturn);
			js = new JSONObject(map);
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}
		log.debug("获取文件基本数据结束" + fileInfo.getId());
		return js.toString();
	}

	/**
	 * 
	 * 按照ID更新文件信息 参数：FileInfo对象
	 * 
	 * **/

	public String updateFileInfo(FileInfo fileInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		DBUtil util = new DBUtil();
		Logger log = Logger.getLogger(FileManager.class);

		log.debug("更新文件基本数据开始" + fileInfo.getId() + "|"
				+ fileInfo.getFileName() + "|" + fileInfo.getFileSize() + "|"
				+ fileInfo.getOwner() + "|" + fileInfo.getFileType() + "|"
				+ fileInfo.getIsDeleted() + "|" + fileInfo.getId());

		int uresult = util
				.update("UPDATE T_FILE_BASIC_INFO SET FILENAME=?,FILESIZE=?,OWNER=?,FILETYPE=?,ISDELETED=? WHERE ID=?",
						fileInfo.getFileName(), fileInfo.getFileSize(),
						fileInfo.getOwner(), fileInfo.getFileType(),
						fileInfo.getIsDeleted(), fileInfo.getId());
		if (uresult != 0) {
			map.put("result", 0);
			map.put("desc", "操作成功");
			map.put("oper", "update");
		}
		JSONObject js = new JSONObject(map);
		log.debug("更新文件基本数据结束" + fileInfo.getId() + "|"
				+ fileInfo.getFileName() + "|" + fileInfo.getFileSize() + "|"
				+ fileInfo.getOwner() + "|" + fileInfo.getFileType() + "|"
				+ fileInfo.getIsDeleted() + "|" + fileInfo.getId());

		return js.toString();
	}
}
