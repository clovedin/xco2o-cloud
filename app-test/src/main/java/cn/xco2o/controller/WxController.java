package cn.xco2o.controller;

import cn.xco2o.manager.WxAccessTokenManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WxController {

    @Autowired
    private WxAccessTokenManager wxAccessTokenManager;

    @RequestMapping("/token")
    public String token() {
        wxAccessTokenManager.getAccessToken();
    }

}
