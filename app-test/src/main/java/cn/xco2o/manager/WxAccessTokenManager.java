package cn.xco2o.manager;

import cn.xco2o.cloud.wx.service.AccessTokenService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("wx-accesstoken")
public interface WxAccessTokenManager extends AccessTokenService {
}
