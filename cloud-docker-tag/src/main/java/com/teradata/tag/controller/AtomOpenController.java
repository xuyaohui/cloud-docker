package com.teradata.tag.controller;

import com.teradata.tag.annotation.MyRequireRole;
import com.teradata.tag.bean.SysUserVO;
import com.teradata.tag.repository.AtomOpenService;
import com.teradata.tag.repository.UserRepository;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * @author xuyaohui
 * @date 2018/7/27 0027 上午 10:59
 */
@RestController
public class AtomOpenController {

    @Autowired
    private AtomOpenService atomOpenService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/401")
    public String error401(){
        return "未登录";
    }

    @MyRequireRole("test")
    @GetMapping("/getAtomDetil")
    public String getAtomDetil(){

        String test="70230";
        String[] temp = test.split("#");
        HashMap<String,Object> map=new HashMap<>();
        map.put("userId","xuxinli");
        List<SysUserVO> result = userRepository.getUserByUserId(map);

        return result.get(0).toString();
    }
}
