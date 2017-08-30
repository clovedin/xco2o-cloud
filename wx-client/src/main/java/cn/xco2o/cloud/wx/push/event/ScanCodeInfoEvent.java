package cn.xco2o.cloud.wx.push.event;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ScanCodeInfoEvent {
	@JacksonXmlProperty(localName="ScanType",isAttribute=true)
	private String scanType;
	@JacksonXmlProperty(localName="ScanResult",isAttribute=true)
	private String scanResult;
	
	public String getScanType() {
		return scanType;
	}
	public void setScanType(String scanType) {
		this.scanType = scanType;
	}
	public String getScanResult() {
		return scanResult;
	}
	public void setScanResult(String scanResult) {
		this.scanResult = scanResult;
	}
	
}
