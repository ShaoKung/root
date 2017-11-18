package com.json.sample;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.json.JSONException;
import org.json.JSONObject;

import com.json.sample.model.User;

public class JSONSample {

	Logger log = Logger.getLogger(JSONSample.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JSONSample js = new JSONSample();
		js.json2JavaBean();
	}

	/**
	 * JavaBeanת��ΪJSON
	 * 
	 * **/
	public void javaBean2JSON() {
		User user = new User();
		user.setAddress("�����Ͼ��ֿ�");
		user.setAge(30);
		user.setMajor(new String[] { "Ӣ��", "���" });
		user.setName("����");
		user.setPostCode("200001");
		user.setSex("��");
		JSONObject json = new JSONObject(user);
		System.out.println(json.toString());
	}

	/**
	 * Mapת��ΪJSON
	 * 
	 * **/
	public void map2JSON() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "����");
		map.put("sex", "��");
		map.put("age", "30");
		map.put("id", "342225198604064414");
		map.put("major", new String[] { "Ӣ��", "��ѧ" });
		JSONObject json = new JSONObject(map);
		System.out.println(json.toString());
	}

	/**
	 * JSONת��ΪJaveBean
	 * 
	 * **/
	public void json2JavaBean() {
		Map<String, Object> map = new HashMap<String, Object>();
		User user=new User();
		map.put("name", "����");
		map.put("sex", "��");
		map.put("age", 30);
		map.put("id", "342225198604064414");
		map.put("major", new String[] { "Ӣ��", "��ѧ" });
		JSONObject json = new JSONObject(map);
		
		try {
			log.debug("JSONת��ΪJaveBean��ʼ");
			user.setName(json.get("name").toString());
			user.setSex(json.get("sex").toString());
			user.setAge((Integer) (json.get("age")));
			user.setPostCode((String)json.get("id"));
			user.setMajor((String [])json.get("major"));
			log.debug("JSONת��ΪJaveBean����");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(user.toString());
	}

	/**
	 * JSON�����ʼ��
	 * 
	 * **/
	public void jsonInit() {
		JSONObject json = new JSONObject();
		try {
			log.debug("��ʼ��JSON��ʼ");
			json.put("name", "����");
			json.put("age", 30);
			json.put("id", "342225198604064414");
			json.put("sex", "��");
			json.put("address", "�����Ͼ��ֿ�");
			json.put("major", new String[]{"����","��ѧ"});
			System.out.println(json.toString());
		} catch (JSONException e) {
			log.debug("��ʼ��JSON�쳣");
			e.printStackTrace();
		} finally {
			log.debug("��ʼ��JSON����");
		}

	}
}
