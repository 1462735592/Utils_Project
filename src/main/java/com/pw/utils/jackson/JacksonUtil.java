package com.pw.utils.jackson;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionLikeType;

public class JacksonUtil {
	//������תString
	public static String ObjectToJson(Object obj) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(obj);
	}
	
	//Stringת������
	public static Object JsonToObject(String json,Class c) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(json, c);
	}
	
	//StringתList<Map>
	public static List<Map> JsonToListAndMap(String json) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		CollectionLikeType type = mapper.getTypeFactory().constructCollectionLikeType(List.class,Map.class);
		return mapper.readValue(json, type);
	}
	
}
