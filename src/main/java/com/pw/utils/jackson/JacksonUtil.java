package com.pw.utils.jackson;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionLikeType;

public class JacksonUtil {
	//简单类型转String
	public static String ObjectToJson(Object obj) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(obj);
	}
	
	//String转简单类型
	public static Object JsonToObject(String json,Class c) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(json, c);
	}
	
	//String转List<Map>
	public static List<Map> JsonToListAndMap(String json) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		CollectionLikeType type = mapper.getTypeFactory().constructCollectionLikeType(List.class,Map.class);
		return mapper.readValue(json, type);
	}
	
}
