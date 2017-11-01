package com.zhenghao.ecoupon.dao;

import com.zhenghao.ecoupon.entity.Merchant;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

public class MerchantDaoTest extends BasicTest {

    @Resource
    private MerchantDao merchantDao;

    @Test
    public void queryByAccount() throws Exception {
        Merchant merchant = merchantDao.queryByAccount(13844445555L);
        assertEquals("外婆家", merchant.getName());
        assertEquals("123456", merchant.getPassword());
        assertEquals(20000, merchant.getBalance());
        assertEquals("玉泉", merchant.getAddress());
    }

}