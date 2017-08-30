package cn.xco2o.cloud.wx.service.impl;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.xco2o.cloud.wx.model.AccessToken;
import cn.xco2o.cloud.wx.model.WxAppProp;
import cn.xco2o.cloud.wx.service.AccessTokenService;
import cn.xco2o.cloud.wx.service.WxIpService;
import cn.xco2o.cloud.common.utils.HttpUtils;

@Component
public class WxIpServiceImpl implements WxIpService {
	
	@Autowired
	private AccessTokenService accessTokenManager;

	public static final String IpUrl = "https://api.weixin.qq.com/cgi-bin/getcallbackip";
	public static Map<String, AccessToken> accessTokenMap = new ConcurrentHashMap<>();
	
	public String getUrl(WxAppProp prop){
		 AccessToken accessToken = accessTokenManager.getAccessToken(prop);
		if(null == accessToken){
			return null;
		}
		StringBuffer buf = new StringBuffer();
		buf.append(IpUrl);
		buf.append("?access_token"+accessToken.getAccess_token());
		return buf.toString();
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<String> getIp(WxAppProp prop){
		String url = getUrl(prop);
		if(null == url){
			return null;
		}
		Map<String, List<String>> ips = HttpUtils.get(url, Map.class);
		List<String> ipList = ips.get("ip_list");
		return ipList;
	}
}
