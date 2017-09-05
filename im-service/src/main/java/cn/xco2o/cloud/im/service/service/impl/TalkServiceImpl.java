package cn.xco2o.cloud.im.service.service.impl;

import cn.xco2o.cloud.im.service.RedisKeyConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.BoundListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class TalkServiceImpl {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public void talk(Long userId, Long friendUserId, Integer type, String msg){
        BoundHashOperations<String, String, String> hashOps = redisTemplate.boundHashOps(RedisKeyConstant.TalkFriendPrefix+userId);
        String chTagId = hashOps.get(friendUserId+"");
        if(null == chTagId || "-1".equals(chTagId)){
            hashOps.put(friendUserId+"", userId+"#"+friendUserId);
        }
        BoundListOperations<String, String> talkChannel = redisTemplate.boundListOps(RedisKeyConstant.TalkChannelPrefix+chTagId);
        talkChannel.leftPush(System.currentTimeMillis()/1000+"@"+type+"#"+msg);
    }
}
