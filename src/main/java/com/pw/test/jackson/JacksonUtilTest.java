package com.pw.test.jackson;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.pw.bean.jackson.Student;
import com.pw.utils.jackson.JacksonUtil;

public class JacksonUtilTest {
	public static void main(String[] args) throws Exception {
		Student stu1 = new Student();
		stu1.setId("100");
		stu1.setName("ÕÅÈý");
		stu1.setBirthday(new Date());
		stu1.setAge(20);
		String stu1Json = JacksonUtil.ObjectToJson(stu1);
		System.out.println(stu1Json);
		
		Student stu1_1 = (Student) JacksonUtil.JsonToObject(stu1Json, Student.class);
		System.out.println(stu1_1.toString());
		
		List<Map> stulist = new ArrayList<>();
		Map map = new HashMap();
		map.put("stu", stu1);
		stulist.add(map);
		String objectToJson = JacksonUtil.ObjectToJson(stulist);
		System.out.println(objectToJson);
		
		List<Map> jsonToListAndMap = JacksonUtil.JsonToListAndMap(objectToJson);
		System.out.println(jsonToListAndMap);
		Map map2 = jsonToListAndMap.get(0);
		Object stu1_2 = (Object)map2.get("stu");
		System.out.println(stu1_2.toString());
		System.out.println(stu1);
	}
}
