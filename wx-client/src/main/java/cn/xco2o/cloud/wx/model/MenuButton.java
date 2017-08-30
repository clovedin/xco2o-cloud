package cn.xco2o.cloud.wx.model;

import java.util.List;

public class MenuButton {

	private MenuButtonType type;
	private String name;
	private String key;
	private String media_id;
	private String url;
	private String appid;
	private String pagepath;
	private List<MenuButton> sub_button;
	
	public MenuButtonType getType() {
		return type;
	}
	public void setType(MenuButtonType type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getMedia_id() {
		return media_id;
	}
	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getPagepath() {
		return pagepath;
	}
	public void setPagepath(String pagepath) {
		this.pagepath = pagepath;
	}
	public List<MenuButton> getSub_button() {
		return sub_button;
	}
	public void setSub_button(List<MenuButton> sub_button) {
		this.sub_button = sub_button;
	}
	
}
