package com.fanyang.java.biginteger;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-03 10:11
 */
public class BigIntegerTest {
    @Test
    public void test1() {
        BigInteger bi = new BigInteger("12433241123414141414124124412412414141114141141414");
        BigDecimal bd = new BigDecimal("12435.351");
        BigDecimal bd2 = new BigDecimal("11");
        System.out.println(bi);
//        System.out.println(bd.divide(bd2));
        System.out.println(bd.divide(bd2, BigDecimal.ROUND_HALF_UP));
        System.out.println(bd.divide(bd2, 15, BigDecimal.ROUND_HALF_UP));//商保留15位小数

    }
}
