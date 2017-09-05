package cn.xco2o.cloud.cloud.common.utils;

import com.google.gson.Gson;

public class JsonUtils {

	private static Gson gson = new Gson();
	
	/**
	 * 解码
	 * @param json
	 * @param clz
	 * @return
	 */
	public static <T> T decode(String json, Class<T> clz){
		return gson.fromJson(json, clz);
	}
	
	/**
	 * 编码
	 * @param t
	 * @return
	 */
	public static <T> String encode(T t){
		return gson.toJson(t);
	}
}
