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
 * �ļ������� v1.0 ��������ɾ�Ĳ飬���в�ѯֻ֧�ֵ�����¼��ѯ
 * */
public class FileManager {

	/**
	 * 
	 * �����ļ�������Ϣ ������FileInfo����
	 * 
	 * **/

	public String addFileInfo(FileInfo fileInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		DBUtil util = new DBUtil();
		Logger log = Logger.getLogger(FileManager.class);

		log.debug("�����ļ��������ݿ�ʼ" + "|" + fileInfo.getFileName() + "|"
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
			map.put("desc", "�����ɹ�");
			map.put("oper", "save");
		}
		JSONObject js = new JSONObject(map);
		log.debug("�����ļ��������ݽ���" + "|" + fileInfo.getFileName() + "|"
				+ fileInfo.getFileSize() + "|" + fileInfo.getOwner() + "|"
				+ fileInfo.getFileType() + "|" + fileInfo.getIsDeleted() + "|"
				+ null);
		return js.toString();
	}

	/**
	 * 
	 * ����IDɾ���ļ���Ϣ ������FileInfo����
	 * 
	 * **/

	public String deleteFileInfoByID(FileInfo fileInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		DBUtil util = new DBUtil();
		Logger log = Logger.getLogger(FileManager.class);

		log.debug("�h���ļ��������ݿ�ʼ" + "|" + fileInfo.getFileName() + "|"
				+ fileInfo.getFileSize() + "|" + fileInfo.getOwner() + "|"
				+ fileInfo.getFileType() + "|" + fileInfo.getIsDeleted() + "|"
				+ null);

		int uresult = util.update(
				"DELETE FROM T_FILE_BASIC_INFO A WHERE A.ID=?",
				fileInfo.getId());
		if (uresult != 0) {
			map.put("result", 0);
			map.put("desc", "�����ɹ�");
			map.put("oper", "delete");
		}
		JSONObject js = new JSONObject(map);

		log.debug("�h���ļ��������ݽ���" + "|" + fileInfo.getFileName() + "|"
				+ fileInfo.getFileSize() + "|" + fileInfo.getOwner() + "|"
				+ fileInfo.getFileType() + "|" + fileInfo.getIsDeleted() + "|"
				+ null);
		return js.toString();
	}

	/**
	 * 
	 * ����ID��ȡ�ļ���Ϣ ������FileInfo����
	 * 
	 * **/

	public String readFileInfoByID(FileInfo fileInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		DBUtil util = new DBUtil();
		FileInfo fileInfoReturn = new FileInfo();
		JSONObject js = null;
		Logger log = Logger.getLogger(FileManager.class);

		log.debug("��ȡ�ļ��������ݿ�ʼ" + fileInfo.getId());

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
			map.put("desc", "�����ɹ�");
			map.put("oper", "read");
			map.put("fileInfo", fileInfoReturn);
			js = new JSONObject(map);
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}
		log.debug("��ȡ�ļ��������ݽ���" + fileInfo.getId());
		return js.toString();
	}

	/**
	 * 
	 * ����ID�����ļ���Ϣ ������FileInfo����
	 * 
	 * **/

	public String updateFileInfo(FileInfo fileInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		DBUtil util = new DBUtil();
		Logger log = Logger.getLogger(FileManager.class);

		log.debug("�����ļ��������ݿ�ʼ" + fileInfo.getId() + "|"
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
			map.put("desc", "�����ɹ�");
			map.put("oper", "update");
		}
		JSONObject js = new JSONObject(map);
		log.debug("�����ļ��������ݽ���" + fileInfo.getId() + "|"
				+ fileInfo.getFileName() + "|" + fileInfo.getFileSize() + "|"
				+ fileInfo.getOwner() + "|" + fileInfo.getFileType() + "|"
				+ fileInfo.getIsDeleted() + "|" + fileInfo.getId());

		return js.toString();
	}
}
