package com.dnsxo.app;

/**
 * @author GAOFENG (http://www.dnsxo.com)
 * @date 2020年1月9日 下午11:02:24
 * @desc 字符串工具类
 */
public class StringUtil {

    /** 获取哈希值 */
    public static int getHashCode(String str){
        int hashcode = str.hashCode();
        if(hashcode < 0){
            hashcode  *= -1;
        }
        return hashcode;
    }
}
