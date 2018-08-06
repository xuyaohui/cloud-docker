package com.teradata.starter.repository;

import com.teradata.starter.bean.UserBean;
import org.springframework.stereotype.Repository;

/**
 * @author xuyaohui
 * @date 2018/7/31 0031 上午 10:08
 */

@Repository
public interface UserService {

    /**
     * 通过用户名获取用户基本信息
     * @param userName
     * @return
     */
    UserBean getUserByName(String userName);
}
