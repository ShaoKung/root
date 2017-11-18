package com.sample.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {

	private static String driver = "oracle.jdbc.driver.OracleDriver";

	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";

	private String user = "fileManager";// oracle���ݿ���û���
	private String pwd = "fileManager";// oracle���ݿ���û�����
	private PreparedStatement sta = null;
	private ResultSet rs = null;
	private Connection conn = null;

	/**
	 * ������������
	 */
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return ���Ӷ���
	 */
	public Connection getConn() {
		try {
			conn = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * @param sql
	 *            sql��� ���ӣ�ɾ�����޸�
	 * @param obj
	 *            ����
	 * @return
	 */
	public int update(String sql, Object... obj) {
		int count = 0;
		conn = getConn();
		try {
			sta = conn.prepareStatement(sql);
			if (obj != null) {
				for (int i = 0; i < obj.length; i++) {
					sta.setObject(i + 1, obj[i]);
				}
			}
			count = sta.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			close();
		}
		return count;
	}

	/**
	 * @param sql
	 *            sql���
	 * @param obj
	 *            ����
	 * @return ���ݼ���
	 */
	public ResultSet Query(String sql, Object... obj) {
		conn = getConn();
		try {
			sta = conn.prepareStatement(sql);
			if (obj != null) {
				for (int i = 0; i < obj.length; i++) {
					sta.setObject(i + 1, obj[i]);
				}
			}
			rs = sta.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	/**
	 * �ر���Դ
	 */
	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (sta != null) {
					sta.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			} finally {
				if (conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}