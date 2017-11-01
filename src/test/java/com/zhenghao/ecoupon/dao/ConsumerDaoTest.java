package com.zhenghao.ecoupon.dao;

import com.zhenghao.ecoupon.entity.Consumer;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

public class ConsumerDaoTest extends BasicTest {

    @Resource
    private ConsumerDao consumerDao;

    @Test
    public void queryByAccount() throws Exception {
        Consumer consumer = consumerDao.queryByAccount(18458115811L);
        assertEquals("zhenghao", consumer.getName());
        assertEquals("123456", consumer.getPassword());
    }

}