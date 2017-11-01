package com.zhenghao.ecoupon.web;

import com.zhenghao.ecoupon.dto.PromotionActivity;
import com.zhenghao.ecoupon.entity.Coupon;
import com.zhenghao.ecoupon.service.ConsumerService;
import com.zhenghao.ecoupon.service.CouponRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @Autowired
    private CouponRuleService couponRuleService;

    @RequestMapping(value = "/activity_list", method = RequestMethod.GET)
    public String activity_list(Model model) {
        List<PromotionActivity> promotionActivityList = couponRuleService.queryAvailablePromotionActivity();
        model.addAttribute("promotionActivityList", promotionActivityList);
        return "consumerActivityList";
    }

//    @RequestMapping(value = "/coupon_list", method = RequestMethod.GET)
//    public String coupon_list(Model model) {
////        List<Coupon> couponList = consumerService.queryAllCoupon();
//    }

}
