package cn.xco2o.cloud.wx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.xco2o.cloud.wx.model.MenuButton;
import cn.xco2o.cloud.wx.model.WxAppProp;
import cn.xco2o.cloud.wx.model.WxResponse;
import cn.xco2o.cloud.wx.service.WxMenuService;
import cn.xco2o.cloud.common.utils.HttpUtils;
import cn.xco2o.cloud.common.utils.JsonUtils;

@Component
public class WxMenuServiceImpl implements WxMenuService {

	@Autowired
	private AccessTokenServiceImpl accessTokenManager;
	
	private static final String MenuUrl = "https://api.weixin.qq.com/cgi-bin/menu/";
	
	public String createMenuUrl(String appid, String appsecret){
		StringBuffer buf = new StringBuffer();
		buf.append(MenuUrl+"create?");
		buf.append("access_token="+accessTokenManager.getUrl(appid, appsecret));
		return buf.toString();
	}
	
	public String getMenuUrl(String appid, String appsecret){
		StringBuffer buf = new StringBuffer();
		buf.append(MenuUrl+"get?");
		buf.append("access_token="+accessTokenManager.getUrl(appid, appsecret));
		return buf.toString();
	}
	
	public String deleteMenuUrl(String appid, String appsecret){
		StringBuffer buf = new StringBuffer();
		buf.append(MenuUrl+"delete?");
		buf.append("access_token="+accessTokenManager.getUrl(appid, appsecret));
		return buf.toString();
	}
	
	
	@Override
	public MenuButton getMenu(String appid, String appsecret){
		String url = getMenuUrl(appid, appsecret);
		MenuButton menuButton = HttpUtils.get(url, MenuButton.class);
		return menuButton;
	}
	
	
	@Override
	public WxResponse createMenu(WxAppProp prop, MenuButton menuButton){
		String url = createMenuUrl(prop.getAppid(), prop.getAppsecret());
		String json = JsonUtils.encode(menuButton);
		WxResponse rsp = HttpUtils.postJson(url, json, WxResponse.class);
		return rsp;
	}
}
