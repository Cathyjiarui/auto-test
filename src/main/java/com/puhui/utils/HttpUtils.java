package com.puhui.utils;

import com.google.gson.JsonObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.*;

/**
 * @ClassName HttpUtils
 * @Description HttpGet和HttpPost工具类
 * @Author JiaZhang
 * @Date 2018/11/26 2:08 PM
 * @Version 1.0
 **/
public class HttpUtils {

    public static String Get(String url){
        /**
         * @author JiaZhang
         * @Description 无参数的Get请求
         * @Date 2:30 PM 2018/11/26
         * @param url
         * @return java.lang.String
        **/
        String httpEntityContent = "";
        try{
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(url);
            CloseableHttpResponse response = httpClient.execute(httpGet);
            httpEntityContent = getHttpEntityContent(response);
            httpGet.abort();

        }catch (Exception e){
            e.printStackTrace();
        }
        return httpEntityContent;
    }

    public static String Get(String url, Map<String,String> paramMap){
        /**
         * @author JiaZhang
         * @Description 有参数的Get请求
         * @Date 7:16 PM 2018/11/26
         * @param url
         * @param paramMap
         * @return java.lang.String
        **/
        String httpEntityContent = "";
        try{
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet();
            List<NameValuePair> params = setHttpParams(paramMap);
            String param = URLEncodedUtils.format(params,"UTF-8");
            httpGet.setURI(URI.create(url + "?" + param));
            CloseableHttpResponse response = httpClient.execute(httpGet);
            httpEntityContent = getHttpEntityContent(response);
            httpGet.abort();
        }catch (Exception e){
            e.printStackTrace();
        }
        return httpEntityContent;
    }

    public static String Post(String url,Map<String,String> paramMap){
        /**
         * @author JiaZhang
         * @Description POST方法
         * @Date 9:24 PM 2018/11/26
         * @param url
         * @param paramMap
         * @return java.lang.String
        **/
        String httpEntityContent = "";
        try{
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(url);
            List<NameValuePair> params = setHttpParams(paramMap);
            UrlEncodedFormEntity param = new UrlEncodedFormEntity(params,"UTF-8");
            httpPost.setEntity(param);
            CloseableHttpResponse response = httpClient.execute(httpPost);
            httpEntityContent = getHttpEntityContent(response);
            httpPost.abort();
        }catch (Exception e){
            e.printStackTrace();
        }
        return httpEntityContent;
    }

    public static String getHttpEntityContent(HttpResponse response){
        /**
         * @author JiaZhang
         * @Description 获得响应HTTP实体内容
         * @Date 2:16 PM 2018/11/26
         * @param response
         * @return java.lang.String
        **/
        HttpEntity entity = response.getEntity();
        try{
            if(entity != null){
                InputStream inputStream = entity.getContent();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
                String line = bufferedReader.readLine();
                StringBuilder stringBuilder = new StringBuilder();
                while(line != null){
                    stringBuilder.append(line + "\n");
                    line = bufferedReader.readLine();
                }
                bufferedReader.close();
                inputStream.close();
                return stringBuilder.toString();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
    
    private static List<NameValuePair> setHttpParams(Map<String,String> paramMap){
        /**
         * @author JiaZhang
         * @Description 请求参数的公共方法
         * @Date 2:26 PM 2018/11/26
         * @param paramMap
         * @return java.util.List<org.apache.http.NameValuePair>
        **/
        List<NameValuePair> params = new ArrayList<>();
        Set<Map.Entry<String,String>> set = paramMap.entrySet();
        for(Map.Entry<String,String> entry : set){
            params.add(new BasicNameValuePair(entry.getKey(),entry.getValue()));
        }
        return params;
    }
}
