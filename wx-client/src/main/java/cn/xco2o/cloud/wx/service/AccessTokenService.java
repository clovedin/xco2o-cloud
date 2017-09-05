package cn.xco2o.cloud.wx.service;

import cn.xco2o.cloud.wx.model.AccessToken;
import cn.xco2o.cloud.wx.model.WxAppProp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.xml.ws.RequestWrapper;

@RequestMapping("/accesstoken")
public interface AccessTokenService {

	/**
	 * 获取access_token
	 * @param appid
	 * @param appsecret
	 * @return
	 */
	@RequestMapping(value = "/get", method = RequestMethod.POST)
	public abstract AccessToken getAccessToken(WxAppProp prop);

}