
drop database if exists ecoupon;
create database ecoupon;
use ecoupon;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- 1.Table structure for `administrator`
-- ----------------------------
DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator` (
  `administrator_id` bigint NOT NULL AUTO_INCREMENT COMMENT '管理员id',
  `name` varchar(50) NOT NULL COMMENT '管理员名',
  `password` varchar(50) NOT NULL COMMENT '管理员密码',
  PRIMARY KEY (`administrator_id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='管理员表';

-- ----------------------------
-- Records of administrator
-- ----------------------------

-- ----------------------------
-- 2.Table structure for `consumer`
-- ----------------------------
DROP TABLE IF EXISTS `consumer`;
CREATE TABLE `consumer` (
  `consumer_id` bigint NOT NULL AUTO_INCREMENT COMMENT '消费者id',
  `account` bigint NOT NULL COMMENT '手机号',
  `name` varchar(50) NOT NULL COMMENT '姓名',
  `password` varchar(50) NOT NULL COMMENT '密码',
  PRIMARY KEY (`consumer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='消费者表';

-- ----------------------------
-- Records of consumer
-- ----------------------------
insert into 
	consumer(account, name, password)
values  
	('18458115811', '小明', '123456');

-- ----------------------------
-- 3.Table structure for `coupon`
-- ----------------------------
DROP TABLE IF EXISTS `coupon`;
CREATE TABLE `coupon` (
  `coupon_id` bigint NOT NULL AUTO_INCREMENT COMMENT '优惠券id',
  `rule_id` bigint NOT NULL COMMENT '发行规则id',
  `owner_id` bigint NOT NULL COMMENT '持有者id',
  `status` int NOT NULL DEFAULT 0 COMMENT '状态，0：未发放；1：已发放未使用；2：已使用；-1：作废',
  PRIMARY KEY (`coupon_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6666 DEFAULT CHARSET=utf8 COMMENT='优惠券';

-- ----------------------------
-- Records of coupon
-- ----------------------------

-- ----------------------------
-- 4.Table structure for `coupon_application`
-- ----------------------------
DROP TABLE IF EXISTS `coupon_application`;
CREATE TABLE `coupon_application` (
  `coupon_application_id` bigint NOT NULL AUTO_INCREMENT COMMENT '申请id',
  `consumer_id` bigint NOT NULL COMMENT '消费者id',
  `merchant_id` bigint NOT NULL COMMENT '商户id',
  `rule_id` bigint NOT NULL COMMENT '规则id',
  `coupon_number` int NOT NULL DEFAULT 0 COMMENT '申请优惠券数量',
  `status` int NOT NULL DEFAULT 0 COMMENT '状态，0：处理中；1：接受；2：优惠券不够；-1：拒绝',
  `application_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '申请时间',
  PRIMARY KEY (`coupon_application_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7777 DEFAULT CHARSET=utf8 COMMENT='获取优惠券申请表';

-- ----------------------------
-- Records of coupon_application
-- ----------------------------

-- ----------------------------
-- 5.Table structure for `coupon_circulation`
-- ----------------------------

-- ----------------------------
-- Records of coupon_circulation
-- ----------------------------

-- ----------------------------
-- 6.Table structure for `coupon_pay_application`
-- ----------------------------
DROP TABLE IF EXISTS `coupon_pay_application`;
CREATE TABLE `coupon_pay_application` (
  `coupon_pay_application_id` bigint NOT NULL AUTO_INCREMENT COMMENT '优惠券使用申请id',
  `consumer_id` bigint NOT NULL COMMENT '消费者id',
  `merchant_id` bigint NOT NULL COMMENT '商户id',
  `coupon_ids` varchar(1000) NOT NULL COMMENT '使用的优惠券的id集合',
  `status` int NOT NULL DEFAULT 0 COMMENT '状态，0：处理中；1：接受；-1：拒绝',
  `consume_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发生时间',
  PRIMARY KEY (`coupon_pay_application_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9999 DEFAULT CHARSET=utf8 COMMENT='使用优惠券申请表';

-- ----------------------------
-- Records of coupon_pay_application
-- ----------------------------


-- ----------------------------
-- 7.Table structure for `coupon_rule`
-- ----------------------------
DROP TABLE IF EXISTS `coupon_rule`;
CREATE TABLE `coupon_rule` (
  `coupon_rule_id` bigint NOT NULL AUTO_INCREMENT COMMENT '规则id',
  `merchant_id` bigint NOT NULL COMMENT '商户id',
  `over` int NOT NULL COMMENT '满',
  `send` int NOT NULL COMMENT '送',
  `is_accumulation` int NOT NULL COMMENT '是否累加:0：不是；1：是',
  `quote` int NOT NULL COMMENT '封顶金额，每单最高优惠金额',
  `total_amount` int NOT NULL COMMENT '发行的总额',
  `valid_start_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '有效期起始',
  `valid_end_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '有效期到期',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '生成时间',
  `status` int NOT NULL DEFAULT 1 COMMENT '状态，1：发行中；-1：结束发行',
  PRIMARY KEY (`coupon_rule_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3333 DEFAULT CHARSET=utf8 COMMENT='优惠券发放规则表';

-- ----------------------------
-- Records of coupon_rule
-- ----------------------------

-- ----------------------------
-- 8.Table structure for `merchant`
-- ----------------------------
DROP TABLE IF EXISTS `merchant`;
CREATE TABLE `merchant` (
  `merchant_id` bigint NOT NULL AUTO_INCREMENT COMMENT '商户id',
  `account` bigint NOT NULL COMMENT '手机号',
  `name` varchar(50) NOT NULL COMMENT '商家名',
  `password` varchar(50) NOT NULL COMMENT '密码',
  `balance` int NOT NULL DEFAULT 0 COMMENT '余额',
  PRIMARY KEY (`merchant_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2000 DEFAULT CHARSET=utf8 COMMENT='商户表';

-- ----------------------------
-- Records of merchant
-- ----------------------------
insert into 
	merchant(account, name, password, balance)
values  
	('13844445555', '外婆家', '123456', '20000'),
	('15366667777', '绿茶', '123456', '30000');

-- ----------------------------
-- 9.Table structure for `merchant_application`
-- ----------------------------
DROP TABLE IF EXISTS `merchant_application`;
CREATE TABLE `merchant_application` (
  `merchant_application_id` bigint NOT NULL AUTO_INCREMENT COMMENT '商家申请id',
  `account` bigint NOT NULL COMMENT '手机号',
  `password` varchar(50) NOT NULL COMMENT '密码',
  `name` varchar(50) NOT NULL COMMENT '商户名',
  `balance` int NOT NULL COMMENT '余额',
  `status` int NOT NULL DEFAULT 0 COMMENT '状态，0：审核中；1：同意；-1：拒绝',
  PRIMARY KEY (`merchant_application_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11111 DEFAULT CHARSET=utf8 COMMENT='商家申请表';

-- ----------------------------
-- Records of merchant_application
-- ----------------------------