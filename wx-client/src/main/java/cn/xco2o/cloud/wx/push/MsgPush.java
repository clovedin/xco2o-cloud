package cn.xco2o.cloud.wx.push;

import cn.xco2o.cloud.wx.push.msg.ArticlesMsg;
import cn.xco2o.cloud.wx.push.msg.ImageMsg;
import cn.xco2o.cloud.wx.push.msg.MusicMsg;
import cn.xco2o.cloud.wx.push.msg.VideoMsg;
import cn.xco2o.cloud.wx.push.msg.VoiceMsg;

public class MsgPush extends WxPush {
	
	private String msgId;
	private String content;
	/**
	 * 用户未关注时，进行关注后的事件推送
	 * Event	事件类型，subscribe
	 * EventKey	事件KEY值，qrscene_为前缀，后面为二维码的参数值
	 * Ticket	二维码的ticket，可用来换取二维码图片
	 */
	private String ticket;
	/**
	 * Event	事件类型，LOCATION
	 * Latitude	地理位置纬度
	 * Longitude	地理位置经度
	 * Precision	地理位置精度
	 */
	private String latitude;
	private String longitude;
	private String precision;
	
	private ImageMsg image;
	private VoiceMsg voice;
	private MusicMsg music;
	private VideoMsg video;
	private ArticlesMsg articles;
	
	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getPrecision() {
		return precision;
	}
	public void setPrecision(String precision) {
		this.precision = precision;
	}
	public ImageMsg getImage() {
		return image;
	}
	public void setImage(ImageMsg image) {
		this.image = image;
	}
	public VoiceMsg getVoice() {
		return voice;
	}
	public void setVoice(VoiceMsg voice) {
		this.voice = voice;
	}
	public MusicMsg getMusic() {
		return music;
	}
	public void setMusic(MusicMsg music) {
		this.music = music;
	}
	public VideoMsg getVideo() {
		return video;
	}
	public void setVideo(VideoMsg video) {
		this.video = video;
	}
	public ArticlesMsg getArticles() {
		return articles;
	}
	public void setArticles(ArticlesMsg articles) {
		this.articles = articles;
	}
	
}
