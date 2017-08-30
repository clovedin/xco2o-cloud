package cn.xco2o.cloud.wx.push;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class WxPush {
	@JacksonXmlProperty(localName="ToUserName")
	private String toUserName;
	@JacksonXmlProperty(localName="FromUserName")
	private String fromUserName;
	@JacksonXmlProperty(localName="CreateTime")
	private Long createTime;
	@JacksonXmlProperty(localName="MsgType")
	private String msgType;
	@JacksonXmlProperty(localName="Event")
	private String event;
	@JacksonXmlProperty(localName="EventKey")
	private String eventKey;
	
	public String getToUserName() {
		return toUserName;
	}
	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}
	public String getFromUserName() {
		return fromUserName;
	}
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getEventKey() {
		return eventKey;
	}
	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}
	
	
}
