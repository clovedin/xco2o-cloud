package cn.xco2o.cloud.wx.service;

import cn.xco2o.cloud.wx.model.AccessToken;
import cn.xco2o.cloud.wx.model.WxAppProp;

public interface AccessTokenService {

	/**
	 * 获取access_token
	 * @param appid
	 * @param appsecret
	 * @return
	 */
	public abstract AccessToken getAccessToken(WxAppProp prop);

}