/*
package com.CompareVersions;

public class Version {
    //比较两个字符串的大小
    public static int compareStr(String v1,String v2){
        int len1 = v1.length();
        int len2 = v2.length();
        int lim = Math.min(len1, len2);
        int k = 0;
        while (k < lim) {
            char c1 = v1.charAt(k);
            char c2 = v2.charAt(k);
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }
        return len1 - len2;
    }
    public static void CompareVersion(String v1, String v2) {
        if (v1.equals(v2)) {
            System.out.println(v1+"和"+v2+"两个版本相同。");
            return;
        }
        //1.2.3  1.2.4a
        String[] v1Array = v1.split("\\.");
        String[] v2Array = v2.split("\\.");
        int count = 0;
        int length = v1Array.length < v2Array.length ? v1Array.length : v2Array.length;
        for (int i = 0; i < length; i++)
        {
            count ++;
            if(compareStr(v1Array[i],v2Array[i]) > 0 ){
                System.out.println(v1+"版本高");
                return;
            }else{
                System.out.println(v2+"版本高");
                return;
            }
        }
        if(count == length){
            System.out.print(v1Array.length > v2Array.length ? v1: v2);
        }
    }
}
*/
