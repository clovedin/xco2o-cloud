package cn.xco2o.cloud.cloud.common.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlUtils {

	public static <T> T decode(String xml, Class<T> clz){
		T t = null;
		JacksonXmlModule module = new JacksonXmlModule();
		module.setDefaultUseWrapper(false);
		ObjectMapper xmlMapper = new XmlMapper(module);
		try {
			t = xmlMapper.readValue(xml, clz);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}
	
/*	
	public static void main(String[] args) {
		String xmlStr = "<xml><ToUserName><![CDATA[gh_e136c6e50636]]></ToUserName>"
				+"<FromUserName><![CDATA[oMgHVjngRipVsoxg6TuX3vz6glDg]]></FromUserName>"
				+"<CreateTime>1408090651</CreateTime>"
				+"<MsgType><![CDATA[event]]></MsgType>"
				+"<Event><![CDATA[pic_sysphoto]]></Event>"
				+"<EventKey><![CDATA[6]]></EventKey>"
				+"<SendPicsInfo><Count>3</Count>"
				+"<PicList>"
				+"<item>"
				+"<PicMd5Sum><![CDATA[1b5f7c23b5bf75682a53e7b6d163e185]]></PicMd5Sum>"
				+"</item>"
				+"<item>"
				+"<PicMd5Sum><![CDATA[1b5f7c23b5bf75682a53e7b6d163e185]]></PicMd5Sum>"
				+"</item>"
				+"<item>"
				+"<PicMd5Sum><![CDATA[1b5f7c23b5bf75682a53e7b6d163e185]]></PicMd5Sum>"
				+"</item>"
				+"</PicList>"
				+"</SendPicsInfo>"
				+"</xml>";
		PicEvent event = decode(xmlStr, PicEvent.class);
		System.out.println(event.toString());
		
		
		xmlStr = "<xml>"
				+"<ToUserName><![CDATA[toUser]]></ToUserName>"
				+"<FromUserName><![CDATA[FromUser]]></FromUserName>"
				+"<CreateTime>123456789</CreateTime>"
				+"<MsgType><![CDATA[event]]></MsgType>"
				+"<Event><![CDATA[VIEW]]></Event>"
				+"<EventKey><![CDATA[www.qq.com]]></EventKey>"
				+"<MenuId>MENUID</MenuId>"
				+"</xml>";
		ClickMenuEvent event = decode(xmlStr, ClickMenuEvent.class);
		System.out.println(event.toString());
		
	}
	*/
}
