package com.dnsxo.app;

/**
 * @author GAOFENG (http://www.dnsxo.com)
 * @date 2020年1月9日 下午11:02:24
 * @desc 补丁包中压缩文件的类型
 */
public enum ZipFileType {
    dm("0","元数据"),jar("1","代码");

    public String code;
    public String name;

    ZipFileType(String code, String name){
        this.code = code;
        this.name = name;
    }

}
