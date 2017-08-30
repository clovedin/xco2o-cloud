package cn.xco2o.cloud.wx.service;

import java.util.List;

import cn.xco2o.cloud.wx.model.WxAppProp;

public interface WxIpService {

	public abstract List<String> getIp(WxAppProp prop);

}