package cn.xco2o.cloud.wx.service;

import cn.xco2o.cloud.wx.model.MenuButton;
import cn.xco2o.cloud.wx.model.WxAppProp;
import cn.xco2o.cloud.wx.model.WxResponse;

public interface WxMenuService {

	public abstract MenuButton getMenu(String appid, String appsecret);

	public abstract WxResponse createMenu(WxAppProp prop, MenuButton menuButton);

}