package com.gome.util;

/**
 * @Description:
 * @Author: WangJinYue
 * @Date: 2020/8/13 23:20
 * @Modified By:
 */
public class ArrayUtil {
    public static Boolean strayEqual(String[] str1, String[] str2) {
        if (str1.equals(str2)) {
            return true;
        }
        if (str1.length != str2.length) {
            return false;
        }


        int count = 0;
        for (int i = 0; i < str1.length; i++) {
            for (int j =0;j<str2.length;j++){
                if(str1[i].equals(str2[j])){
                    System.out.println(str1[i]+"===="+str2[j]);
                    count++;
                    break;
                }
            }

            if(i==str1.length-1){
                System.out.println("count:"+count);
                if(count==str1.length){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
