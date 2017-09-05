package cn.xco2o.cloud.cloud.common.utils;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class HttpUtils {
	
	private static OkHttpClient client = new OkHttpClient();
	
	public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

	public static String get(String url) {
		String result = null;
		Request request = new Request.Builder().url(url).build();
		try {
			Response response = client.newCall(request).execute();
			result = response.body().string();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static <T> T get(String url, Class<T> clz){
		T t = null;
		String rspJson = get(url);
		if(null != rspJson){
			t = JsonUtils.decode(rspJson, clz);
		}
		return t;
	}
	
	public static String postJson(String url, String json){
		String rspJson = null;
		RequestBody body = RequestBody.create(JSON, json);
		Request request = new Request.Builder().url(url).post(body).build();
		try {
			Response response = client.newCall(request).execute();
			rspJson = response.body().string();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rspJson;
	}

	public static <T> T postJson(String url, String json, Class<T> clz) {
		T t = null;
		String rspJson = postJson(url, json);
		if(null != rspJson){
			t = JsonUtils.decode(rspJson, clz);
		}
		return t;
	}
}