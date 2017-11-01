package com.zhenghao.ecoupon.dao;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import static junit.framework.TestCase.assertEquals;

@ContextConfiguration("classpath:spring/spring-*.xml")
public abstract class BasicTest extends AbstractTransactionalJUnit4SpringContextTests {

//    @Test
//    public void testNothing() {
//        assertEquals(1, 1);
//    }
}
