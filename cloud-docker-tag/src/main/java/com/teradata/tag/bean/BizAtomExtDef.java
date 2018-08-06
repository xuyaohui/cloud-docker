package com.teradata.tag.bean;

import java.io.Serializable;

/**
 * @author xuyaohui
 * @date 2018/7/27 0027 上午 10:48
 */
public class BizAtomExtDef implements Serializable {

    private int bizAtomId;
    private String bizAtomName = "";


    public void setBizAtomId(int bizAtomId) {
        this.bizAtomId = bizAtomId;
    }
    public String getBizAtomName() {
        return bizAtomName;
    }
    public void setBizAtomName(String bizAtomName) {
        this.bizAtomName = bizAtomName;
    }

    public int getBizAtomId() {
        return bizAtomId;
    }

    @Override
    public String toString() {
        return "BizAtomExtDef{" +
                "bizAtomId=" + bizAtomId +
                ", bizAtomName='" + bizAtomName + '\'' +
                '}';
    }
}
