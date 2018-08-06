package com.teradata.tag.repository;

import com.teradata.tag.bean.BizAtomExtDef;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xuyaohui
 * @date 2018/7/27 0027 上午 10:45
 */

@Repository
public interface AtomOpenService {

    List<BizAtomExtDef> getExtAtomsByAtomId(String[] atoms);
}
