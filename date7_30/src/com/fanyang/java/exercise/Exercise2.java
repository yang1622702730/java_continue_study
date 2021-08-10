package com.fanyang.java.exercise;

import org.junit.Test;

/**
 * @project_name: continue_study01
 * @project_description:将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反转为”abfedcg”
 * @author: FanYang
 * @create_date: ${}-07-30 16:24
 */
public class Exercise2 {
    public  String reverses(String str, int start, int end) {
        if (null != str && str.length() > 0) {
            char[] chars = str.toCharArray();
            for (int x =start,y =end;x<y;x++,y--){
                char temp = chars[x];
                chars[x] = chars[y];
                chars[y] = temp;
            }
            return new String(chars);
        }
        return str;
    }
    public  String reverses2(String strs, int start, int end) {
        if (null!=strs) {
            String string = "";
            string = strs.substring(0, start);
            for (int i = end; i >= start; i--) {
                string += strs.charAt(i);
            }
            string += strs.substring(end + 1);
            return string;
        }
        return strs;
    }

    public  String reverses3(String strs, int start, int end) {
        if (null!=strs) {
            StringBuilder stringBuilder = new StringBuilder(strs.length());
            stringBuilder.append(strs.substring(0, start));
            for (int i = end; i >= start; i--) {
                stringBuilder.append(strs.charAt(i));
            }
            stringBuilder.append(strs.substring(end + 1));
            return stringBuilder.toString();
        }
        return strs;
    }
    @Test
    public void test(){
        String s1 = reverses3("abcdefg",2,5);
        String s2 = reverses2("abcdefg",2,5);
        String s3 = reverses("abcdefg",2,5);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
