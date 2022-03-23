package com.puhui.utils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * @ClassName DataConversion
 * @Description 数据转换
 * @Author JiaZhang
 * @Date 2018/7/18 下午10:53
 * @Version 1.0
 **/
public class DataConversion {

    public static JsonObject StringToJson(String data){
        /**
         * @author JiaZhang
         * @Description String类型转换成Map类型
         * @Date 11:39 AM 2018/12/22
         * @param data
         * @return java.util.Map<java.lang.String,java.lang.Object>
        **/
        JsonObject jsonObject = (new JsonParser()).parse(data).getAsJsonObject();
        return jsonObject;
    }
}