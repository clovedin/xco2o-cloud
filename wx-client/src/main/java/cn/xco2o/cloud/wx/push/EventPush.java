package cn.xco2o.cloud.wx.push;

import cn.xco2o.cloud.wx.push.event.SendLocationInfoEvent;
import cn.xco2o.cloud.wx.push.event.SendPicsInfoEvent;
import cn.xco2o.cloud.wx.push.event.ScanCodeInfoEvent;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class EventPush extends WxPush {

	@JacksonXmlProperty(localName="MenuId", isAttribute=true)
	private String menuId;
	@JacksonXmlProperty(localName="SendLocationInfo")
	private SendLocationInfoEvent sendLocationInfo;
	@JacksonXmlProperty(localName="SendPicsInfo")
	private SendPicsInfoEvent sendPicsInfo;
	@JacksonXmlProperty(localName="ScanCodeInfo")
	private ScanCodeInfoEvent scanCodeInfo;
	
}
