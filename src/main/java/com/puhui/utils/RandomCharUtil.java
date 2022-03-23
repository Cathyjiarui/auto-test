package com.puhui.utils;

import java.util.Random;

/**
 * @ClassName RandomCharUtil
 * @Description 生成随机数
 * @Author JiaZhang
 * @Date 2018/6/19 上午11:48
 * @Version 1.0
 **/
public class RandomCharUtil {

    public static final String allChar = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String letterChar = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String upperLetterChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String lowerLetterChar = "abcdefghijklmnopqrstuvwxyz";
    public static final String numberChar = "0123456789";
    public static final String numberLowerLetterChar = "0123456789abcdefghijklmnopqrstuvwxyz";
    public static final String numberUpperLetterChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String getRandomALLChar(int n) {
        /**
         * @author JiaZhang
         * @Description 全部字符
         * @Date 上午11:49 2018/6/19
         * @param n
         * @return java.lang.String
        **/
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for(int i = 0; i < n; i++) {
            sb.append( allChar.charAt( random.nextInt( allChar.length() ) ) );
        }
        return sb.toString();
    }

    public static String getRandomLetterChar(int n) {
        /**
         * @author JiaZhang
         * @Description 字母字符
         * @Date 上午11:49 2018/6/19
         * @param n
         * @return java.lang.String
        **/
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for(int i = 0; i < n; i++) {
            sb.append( letterChar.charAt( random.nextInt( letterChar.length() ) ) );
        }
        return sb.toString();
    }

    public static String getRandomUpperLetterChar(int n) {
        /**
         * @author JiaZhang
         * @Description 大写字母字符
         * @Date 上午11:50 2018/6/19
         * @param n
         * @return java.lang.String
        **/
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for(int i = 0; i < n; i++) {
            sb.append( upperLetterChar.charAt( random.nextInt( upperLetterChar.length() ) ) );
        }
        return sb.toString();
    }

    public static String getRandomLowerLetterChar(int n) {
        /**
         * @author JiaZhang
         * @Description 小写字母字符
         * @Date 上午11:51 2018/6/19
         * @param n
         * @return java.lang.String
        **/
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for(int i = 0; i < n; i++) {
            sb.append( lowerLetterChar.charAt( random.nextInt( lowerLetterChar.length() ) ) );
        }
        return sb.toString();
    }

    public static String getRandomNumberChar(int n) {
        /**
         * @author JiaZhang
         * @Description 数字字符
         * @Date 上午11:51 2018/6/19
         * @param n
         * @return java.lang.String
        **/
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for(int i = 0; i < n; i++) {
            sb.append( numberChar.charAt( random.nextInt( numberChar.length() ) ) );
        }
        return sb.toString();
    }

    public static String getRandomNumberLowerLetterChar(int n) {
        /**
         * @author JiaZhang
         * @Description 数字加小写字母字符
         * @Date 上午11:52 2018/6/19
         * @param n
         * @return java.lang.String
        **/
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for(int i = 0; i < n; i++) {
            sb.append( numberLowerLetterChar.charAt( random.nextInt( numberLowerLetterChar.length() ) ) );
        }
        return sb.toString();
    }

    public static String getRandomNumberUpperLetterChar(int n) {
        /**
         * @author JiaZhang
         * @Description 数字加大写字母字符
         * @Date 上午11:53 2018/6/19
         * @param n
         * @return java.lang.String
        **/
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for(int i = 0; i < n; i++) {
            sb.append( numberUpperLetterChar.charAt( random.nextInt( numberUpperLetterChar.length() ) ) );
        }
        return sb.toString();
    }
}