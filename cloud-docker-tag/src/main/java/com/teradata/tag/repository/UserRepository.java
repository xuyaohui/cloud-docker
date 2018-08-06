package com.teradata.tag.repository;

import com.teradata.tag.bean.SysUserVO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by xuyaohui
 */

@Repository
public interface UserRepository {

    List<SysUserVO> getUserByUserId(HashMap<String, Object> hashMap);

    int getCountByuserIdAndDepartName(HashMap<String, Object> hashMap);

    List<SysUserVO> getUserByUserIdAndPassWd(HashMap<String, Object> hashMap);
}
