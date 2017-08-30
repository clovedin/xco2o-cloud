package cn.xco2o.cloud.wx.push.event;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SendLocationInfoEvent {
	@JacksonXmlProperty(localName="LocationX",isAttribute=true)
	private String locationX;
	@JacksonXmlProperty(localName="LocationY",isAttribute=true)
	private String locationY;
	@JacksonXmlProperty(localName="Scale",isAttribute=true)
	private Integer scale;
	@JacksonXmlProperty(localName="Label",isAttribute=true)
	private String label;
	@JacksonXmlProperty(localName="Poiname",isAttribute=true)
	private String poiname;
	
	public String getLocationX() {
		return locationX;
	}
	public void setLocationX(String locationX) {
		this.locationX = locationX;
	}
	public String getLocationY() {
		return locationY;
	}
	public void setLocationY(String locationY) {
		this.locationY = locationY;
	}
	public Integer getScale() {
		return scale;
	}
	public void setScale(Integer scale) {
		this.scale = scale;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getPoiname() {
		return poiname;
	}
	public void setPoiname(String poiname) {
		this.poiname = poiname;
	}
	
}
