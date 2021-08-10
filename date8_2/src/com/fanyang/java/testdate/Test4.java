package com.fanyang.java.testdate;

import org.junit.Test;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * @project_name: continue_study01
 * @project_description:Instant的时间测试
 * @author: FanYang
 * @create_date: 2021-08-02 11:16
 */
public class Test4 {
    @Test
    public void testInstance(){
        Instant now = Instant.now();
        System.out.println(now);
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
        System.out.println(now.toEpochMilli());
        System.out.println(now.ofEpochMilli(1627874885838l));
    }
}
