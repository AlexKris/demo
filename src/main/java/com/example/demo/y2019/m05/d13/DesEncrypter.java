package com.example.demo.y2019.m05.d13;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;


public class DesEncrypter {
    Cipher ecipher;
    Cipher dcipher;
    byte[] salt = {(byte) 0xA9, (byte) 0x9B, (byte) 0xC8, (byte) 0x32, (byte) 0x56, (byte) 0x35, (byte) 0xE3, (byte) 0x03};

    /**
     * 将用户的apikey传入
     *
     * @throws Exception
     * @author 曹轩
     */
    public DesEncrypter(String apiKey) throws Exception {
        /**
         * 设置算法为md5和DES加解密
         */
        int iterationCount = 2;
        KeySpec keySpec = new PBEKeySpec(apiKey.toCharArray(), salt, iterationCount);
        SecretKey key = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(keySpec);
        ecipher = Cipher.getInstance(key.getAlgorithm());
        dcipher = Cipher.getInstance(key.getAlgorithm());
        AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt, iterationCount);
        //初始化加密算法对象
        ecipher.init(Cipher.ENCRYPT_MODE, key, paramSpec);
        //初始化解密算法对象
        dcipher.init(Cipher.DECRYPT_MODE, key, paramSpec);
    }

    /**
     * @param str
     * @return
     * @throws Exception String
     * @Description(功能描述) :  加密str字符串
     * @author(作者) ：  曹轩
     * @date (开发日期)          :  2016年6月24日 上午11:43:15
     */
    public String encrypt(String str) throws Exception {
        //设置编码utf-8
        str = new String(str.getBytes(), "UTF-8");
        return Base64.encode(ecipher.doFinal(str.getBytes()));
    }

    /**
     * @param str
     * @return
     * @throws Exception String
     * @Description(功能描述) :  解密字符串str
     * @author(作者) ：  曹轩
     * @date (开发日期)          :  2016年6月24日 上午11:45:00
     */
    public String decrypt(String str) throws Exception {
        return new String(dcipher.doFinal(Base64.decode(str)), "UTF-8");
    }


    public static void main(String[] args) throws Exception {
        String apiKey = "a123456";
        DesEncrypter des = new DesEncrypter(apiKey);
        String str = "moblie=13112345678";
        System.out.println(des.encrypt(str));
        System.out.println(des.decrypt("LJU8YURQz5yJXOwvlIuaF0HbZcxFkn7U"));
    }
}
