package org.joseph.hello.util;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class JsonUtil {

	public static String toJson(Object object) {
		return JSON.toJSONString(object);
	}

	public static <T> T parseObject(String jsonString, Class<T> clazz) {
		return JSON.parseObject(jsonString, clazz);
	}

	public static <T> List<T> parseArray(String jsonString, Class<T> clazz) {
		return JSON.parseArray(jsonString, clazz);
	}

	public static List<Map<String, Object>> getJsonToListMap(String jsonString) {
		return JSON.parseObject(jsonString, new TypeReference<List<Map<String, Object>>>() {
		});
	}
}
