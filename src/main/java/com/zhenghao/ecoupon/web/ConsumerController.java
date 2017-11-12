package com.zhenghao.ecoupon.web;

import com.zhenghao.ecoupon.dto.PromotionActivity;
import com.zhenghao.ecoupon.entity.Consumer;
import com.zhenghao.ecoupon.entity.Coupon;
import com.zhenghao.ecoupon.entity.CouponApplication;
import com.zhenghao.ecoupon.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/consumer")
public class ConsumerController {

//    @Autowired
//    private ConsumerService consumerService;

    @Autowired
    private CouponRuleService couponRuleService;

    @Autowired
    private CouponService couponService;

    @Autowired
    private CouponApplicationService couponApplicationService;

//    @Autowired
//    private MerchantService merchantService;

    @RequestMapping(value = "/activity_list", method = RequestMethod.GET)
    public String activity_list(Model model) {
        List<PromotionActivity> promotionActivityList = couponRuleService.queryAvailablePromotionActivity();
        model.addAttribute("promotionActivityList", promotionActivityList);
        return "consumerActivityList";
    }

    @RequestMapping(value = "/coupon_list", method = RequestMethod.GET)
    public String coupon_list(Model model, HttpSession session) {
        Consumer consumer = (Consumer) session.getAttribute("consumer");
        long consumerId = consumer.getConsumerId();
        List<Coupon> couponList = couponService.queryAllCoupon(consumerId);
        model.addAttribute("couponList", couponList);
        return "consumerCouponList";
    }

    @RequestMapping(value = "/application_list", method = RequestMethod.GET)
    public String application_list(Model model, HttpSession session) {
        Consumer consumer = (Consumer) session.getAttribute("consumer");
        long consumerId = consumer.getConsumerId();
        List<CouponApplication> couponApplicationList = couponApplicationService.queryAllApplicationByConsumerId(consumerId);
        System.out.println(couponApplicationList);
        model.addAttribute("couponApplicationList", couponApplicationList);

        return "consumerCouponApplicationList";
    }

    @RequestMapping(value = "/apply_coupon", method = RequestMethod.GET)
    public String apply_coupon(Model model, HttpSession session, HttpServletRequest request) {
        Consumer consumer = (Consumer) session.getAttribute("consumer");
        long consumerId = consumer.getConsumerId();
        //TODO if don't get
        System.out.println(request.getParameter("merchantId"));
        System.out.println(request.getParameter("ruleId"));
        long merchantId = Long.valueOf(request.getParameter("merchantId"));
        long ruleId = Long.valueOf(request.getParameter("ruleId"));
        //TODO if failed
        couponApplicationService.applyCoupon(consumerId, merchantId, ruleId);
        return "redirect:/consumer/application_list";
    }

}
