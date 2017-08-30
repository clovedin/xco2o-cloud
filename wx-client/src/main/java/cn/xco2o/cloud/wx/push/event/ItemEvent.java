package cn.xco2o.cloud.wx.push.event;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ItemEvent{
	@JacksonXmlProperty(localName="PicMd5Sum", isAttribute=true)
	private String picMd5Sum;
	
	public ItemEvent(){}

	public String getPicMd5Sum() {
		return picMd5Sum;
	}

	public void setPicMd5Sum(String picMd5Sum) {
		this.picMd5Sum = picMd5Sum;
	}
	
}
