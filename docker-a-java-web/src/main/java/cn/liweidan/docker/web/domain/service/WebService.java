package cn.liweidan.docker.web.domain.service;

import java.util.Map;

/**
 * Web服务层
 * @author liweidan
 * @date   2018.04.15 下午4:18
 * @email  toweidan@126.com
 */
public interface WebService {

    /**
     * 用于接收请求，记录请求的IP，以及返回现在所处于的环境
     * @return
     */
    Map<String,String> helloWorld();

}
