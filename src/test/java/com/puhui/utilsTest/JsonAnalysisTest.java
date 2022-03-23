package com.puhui.utilsTest;

import com.puhui.utils.DataConversion;

import java.util.Map;

/**
 * @ClassName JsonAnalysisTest
 * @Description TODO
 * @Author JiaZhang
 * @Date 2018/7/18 上午11:00
 * @Version 1.0
 **/
public class JsonAnalysisTest {

    public static void main(String[] args){
        String json = "{\n" +
                "  \"current\": 0,\n" +
                "  \"pages\": 0,\n" +
                "  \"records\": {},\n" +
                "  \"size\": 0,\n" +
                "  \"total\": 0\n" +
                "}";
        DataConversion jsonAnalysis = new DataConversion();
        //Map<String,Object> map = jsonAnalysis.getJson(json);

    }
}
