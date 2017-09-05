package cn.xco2o.cloud.cloud.im.service.service.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import cn.xco2o.cloud.cloud.im.service.model.FileMsg;

public interface FileMsgRepository extends MongoRepository<FileMsg, String> {
}
