package com.zhenghao.ecoupon.web;

import com.zhenghao.ecoupon.dto.PromotionActivity;
import com.zhenghao.ecoupon.service.CouponRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/promotion_activity")
public class PromotionActivityController {

    @Autowired
    private CouponRuleService couponRuleService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String ruleList(Model model) {
        List<PromotionActivity> promotionActivities = couponRuleService.queryAvailablePromotionActivity();
        model.addAttribute("promotionActivities", promotionActivities);
        return "promotionActivities";
    }
}
