package cn.xco2o.cloud.cloud.wx.service.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import cn.xco2o.cloud.cloud.common.utils.HttpUtils;
import cn.xco2o.cloud.wx.model.AccessToken;
import cn.xco2o.cloud.wx.model.WxAppProp;
import org.springframework.stereotype.Component;

import cn.xco2o.cloud.wx.service.AccessTokenService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccessTokenServiceImpl implements AccessTokenService {
	
	public static final String AccessUrl = "https://api.weixin.qq.com/cgi-bin/token";
	public static Map<String, AccessToken> accessTokenMap = new ConcurrentHashMap<>();
	
	public String getUrl(String appid, String appsecret){
		StringBuffer buf = new StringBuffer();
		buf.append(AccessUrl);
		buf.append("?grant_type=client_credential");
		buf.append("&appid="+appid);
		buf.append("&secret="+appsecret);
		return buf.toString();
	}
	
	/* (non-Javadoc)
	 * @see cn.xco2o.wx.service.AccessTokenService#getAccessToken(cn.xco2o.wx.model.WxAppProp)
	 */
	@Override
	public AccessToken getAccessToken(WxAppProp prop){
		long seconds = System.currentTimeMillis()/1000;
		AccessToken accessToken = accessTokenMap.get(prop.getAppid());
		if(null == accessToken || accessToken.getCreateTime() + accessToken.getExpires_in() < seconds - 300){
			String url = getUrl(prop.getAppid(), prop.getAppsecret());
			accessToken = HttpUtils.get(url, AccessToken.class);
			if(null != accessToken && null != accessToken.getAccess_token()){
				accessTokenMap.put(prop.getAppid(), accessToken);
			}
		}
		return accessToken;
	}

}
