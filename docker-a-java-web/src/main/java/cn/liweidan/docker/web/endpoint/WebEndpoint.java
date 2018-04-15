package cn.liweidan.docker.web.endpoint;

import cn.liweidan.docker.web.domain.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 一个开放的接口
 * @author liweidan
 * @date   2018.04.15 下午4:17
 * @email  toweidan@126.com
 */
@RestController
public class WebEndpoint {

    @Autowired
    private WebService webService;

    @GetMapping("hello")
    public Map<String, String> helloWorld() {
        return webService.helloWorld();
    }

}
