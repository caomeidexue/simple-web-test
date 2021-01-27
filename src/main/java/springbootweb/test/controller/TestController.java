package springbootweb.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈功能概述〉<br>
 *
 * @author: yiche
 * @date: 2021/1/27 6:00 下午
 */
@RestController
public class TestController {


    @RequestMapping("/test")
    public Object test(){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","成功");
        return map;
    }
}
