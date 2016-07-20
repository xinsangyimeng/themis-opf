package org.jason.themis.core.domain;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.Serializable;

/**
 * Created by Albert.Liu on 15/10/24.
 * Created by Jason.Xia on 16/7/19.
 */
public class Serialize implements Serializable {

    public Serialize() {
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this, SerializerFeature.WriteMapNullValue, SerializerFeature
                .DisableCircularReferenceDetect);
    }
}
