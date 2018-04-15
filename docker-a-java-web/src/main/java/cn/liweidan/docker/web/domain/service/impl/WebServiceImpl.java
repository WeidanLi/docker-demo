package cn.liweidan.docker.web.domain.service.impl;

import cn.liweidan.docker.web.domain.service.WebService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liweidan
 */
@Service
public class WebServiceImpl implements WebService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Environment env;

    public Map<String, String> helloWorld() {
        ServletRequestAttributes ra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ra.getRequest();

        String remoteHost = request.getRemoteHost();
        logger.info("IP为{}对该项目进行了访问", remoteHost);

        Map<String, String> res = new HashMap<>();
        res.put("active profile", Arrays.toString(env.getActiveProfiles()));
        return res;
    }

}
