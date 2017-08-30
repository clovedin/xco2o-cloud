package cn.xco2o.cloud.wx.push.event;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SendPicsInfoEvent {
	
	@JacksonXmlProperty(localName="Count", isAttribute=true)
	private Integer count;
	@JacksonXmlProperty(localName="item")
	@JacksonXmlElementWrapper(localName="PicList")
	private List<ItemEvent> items;
	
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public List<ItemEvent> getItems() {
		return items;
	}
	public void setItems(List<ItemEvent> items) {
		this.items = items;
	}
	
}
