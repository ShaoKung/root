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
	 * JavaBean转换为JSON
	 * 
	 * **/
	public void javaBean2JSON() {
		User user = new User();
		user.setAddress("江苏南京浦口");
		user.setAge(30);
		user.setMajor(new String[] { "英语", "会计" });
		user.setName("邵清");
		user.setPostCode("200001");
		user.setSex("男");
		JSONObject json = new JSONObject(user);
		System.out.println(json.toString());
	}

	/**
	 * Map转换为JSON
	 * 
	 * **/
	public void map2JSON() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "邵清");
		map.put("sex", "男");
		map.put("age", "30");
		map.put("id", "342225198604064414");
		map.put("major", new String[] { "英语", "数学" });
		JSONObject json = new JSONObject(map);
		System.out.println(json.toString());
	}

	/**
	 * JSON转换为JaveBean
	 * 
	 * **/
	public void json2JavaBean() {
		Map<String, Object> map = new HashMap<String, Object>();
		User user=new User();
		map.put("name", "邵清");
		map.put("sex", "男");
		map.put("age", 30);
		map.put("id", "342225198604064414");
		map.put("major", new String[] { "英语", "数学" });
		JSONObject json = new JSONObject(map);
		
		try {
			log.debug("JSON转换为JaveBean开始");
			user.setName(json.get("name").toString());
			user.setSex(json.get("sex").toString());
			user.setAge((Integer) (json.get("age")));
			user.setPostCode((String)json.get("id"));
			user.setMajor((String [])json.get("major"));
			log.debug("JSON转换为JaveBean结束");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(user.toString());
	}

	/**
	 * JSON对象初始化
	 * 
	 * **/
	public void jsonInit() {
		JSONObject json = new JSONObject();
		try {
			log.debug("初始化JSON开始");
			json.put("name", "邵清");
			json.put("age", 30);
			json.put("id", "342225198604064414");
			json.put("sex", "男");
			json.put("address", "江苏南京浦口");
			json.put("major", new String[]{"体育","数学"});
			System.out.println(json.toString());
		} catch (JSONException e) {
			log.debug("初始化JSON异常");
			e.printStackTrace();
		} finally {
			log.debug("初始化JSON结束");
		}

	}
}
