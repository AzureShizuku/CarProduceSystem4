CREATE DATABASE IF NOT EXISTS `car_pro_sys` default charset utf8 COLLATE utf8_general_ci;

USE `car_pro_sys`;
drop TABLE if EXISTS `admin_msg`;
CREATE TABLE IF NOT EXISTS `admin_msg` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `login_name` varchar(255) DEFAULT NULL COMMENT '登录名',
 `password` varchar(255) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='管理员';


drop TABLE if EXISTS `staff_msg`;
CREATE TABLE IF NOT EXISTS `staff_msg` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `staff_no` varchar(255) DEFAULT NULL COMMENT '员工号',
 `password` varchar(255) DEFAULT NULL COMMENT '密码',
 `real_name` varchar(255) DEFAULT NULL COMMENT '姓名',
 `cel_phone` varchar(255) DEFAULT NULL COMMENT '联系电话',
 `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
 `staff_type` int(11) DEFAULT NULL COMMENT '权限类型',
 `create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='员工';


drop TABLE if EXISTS `provider`;
CREATE TABLE IF NOT EXISTS `provider` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `login_name` varchar(255) DEFAULT NULL COMMENT '登录名',
 `password` varchar(255) DEFAULT NULL COMMENT '密码',
 `cel_phone` varchar(255) DEFAULT NULL COMMENT '联系电话',
 `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
 `address` varchar(255) DEFAULT NULL COMMENT '地址',
 `remark` varchar(255) DEFAULT NULL COMMENT '备注',
 `create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
 `gysdj` int(11) DEFAULT NULL COMMENT '供应商等级',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='供应商';


drop TABLE if EXISTS `sale_plan`;
CREATE TABLE IF NOT EXISTS `sale_plan` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `plan_name` varchar(255) DEFAULT NULL COMMENT '计划名',
 `plan_detail` text  COLLATE utf8_bin DEFAULT NULL COMMENT '计划详情',
 `ks_date` varchar(30) DEFAULT NULL COMMENT '开始日期',
 `js_date` varchar(30) DEFAULT NULL COMMENT '结束日期',
 `create_date` varchar(30) DEFAULT NULL COMMENT '创建日期',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='销售计划';


drop TABLE if EXISTS `stock_msg`;
CREATE TABLE IF NOT EXISTS `stock_msg` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `pro_no` varchar(255) DEFAULT NULL COMMENT '商品编号',
 `pro_name` varchar(255) DEFAULT NULL COMMENT '商品名',
 `gg` varchar(255) DEFAULT NULL COMMENT '规格',
 `dw` varchar(255) DEFAULT NULL COMMENT '单位',
 `price` double(10,2) DEFAULT NULL COMMENT '单价',
 `num` int(11) DEFAULT NULL COMMENT '数量',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='库存台账';


drop TABLE if EXISTS `pro_request`;
CREATE TABLE IF NOT EXISTS `pro_request` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `stock_id` int(11) DEFAULT NULL COMMENT '库存台账ID',
 `pro_no` varchar(255) DEFAULT NULL COMMENT '商品编号',
 `pro_name` varchar(255) DEFAULT NULL COMMENT '商品名',
 `need_num` int(11) DEFAULT NULL COMMENT '需求数量',
 `jf_date` varchar(30) DEFAULT NULL COMMENT '交付日期',
 `request_intro` varchar(255) DEFAULT NULL COMMENT '请求说明',
 `request_file` varchar(200) DEFAULT NULL COMMENT '附件',
 `create_date` varchar(30) DEFAULT NULL COMMENT '创建日期',
 `request_status` int(11) DEFAULT NULL COMMENT '请求状态',
 `check_remark` varchar(255) DEFAULT NULL COMMENT '审核备注',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='生产请求';


drop TABLE if EXISTS `pro_plan`;
CREATE TABLE IF NOT EXISTS `pro_plan` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `pname` varchar(255) DEFAULT NULL COMMENT '计划名',
 `pintro` varchar(1000) DEFAULT NULL COMMENT '生产介绍',
 `pdetail` varchar(200) DEFAULT NULL COMMENT '生产详情单',
 `ks_date` varchar(30) DEFAULT NULL COMMENT '开始日期',
 `js_date` varchar(30) DEFAULT NULL COMMENT '结束日期',
 `create_date` varchar(30) DEFAULT NULL COMMENT '创建日期',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='生产计划';


drop TABLE if EXISTS `material_info`;
CREATE TABLE IF NOT EXISTS `material_info` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `mno` varchar(255) DEFAULT NULL COMMENT '物料编号',
 `mname` varchar(255) DEFAULT NULL COMMENT '物料名',
 `mintro` varchar(255) DEFAULT NULL COMMENT '物料介绍',
 `stock_num` double(10,2) DEFAULT NULL COMMENT '库存量',
 `dw` varchar(255) DEFAULT NULL COMMENT '单位',
 `gg` varchar(255) DEFAULT NULL COMMENT '规格',
 `provider_id` int(11) DEFAULT NULL COMMENT '供应商',
 `jsbz` varchar(255) DEFAULT NULL COMMENT '技术标准',
 `price` double(10,2) DEFAULT NULL COMMENT '参考价格',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='物料台账';


drop TABLE if EXISTS `minlog`;
CREATE TABLE IF NOT EXISTS `minlog` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `material_id` int(11) DEFAULT NULL COMMENT '物料ID',
 `num` int(11) DEFAULT NULL COMMENT '入库数量',
 `in_remark` varchar(255) DEFAULT NULL COMMENT '入库备注',
 `create_date` varchar(30) DEFAULT NULL COMMENT '创建日期',
 `is_comfirm` int(11) DEFAULT NULL COMMENT '是否确认',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='物料入库单';


drop TABLE if EXISTS `mneed_msg`;
CREATE TABLE IF NOT EXISTS `mneed_msg` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `title` varchar(255) DEFAULT NULL COMMENT '标题',
 `nintro` varchar(255) DEFAULT NULL COMMENT '需求说明',
 `ndetail` varchar(200) DEFAULT NULL COMMENT '需求详情',
 `create_date` varchar(30) DEFAULT NULL COMMENT '创建日期',
 `jf_date` varchar(30) DEFAULT NULL COMMENT '交付日期',
 `check_status` int(11) DEFAULT NULL COMMENT '请求状态',
 `check_remark` varchar(255) DEFAULT NULL COMMENT '审核备注',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='物料需求单';


drop TABLE if EXISTS `mpurchase_app`;
CREATE TABLE IF NOT EXISTS `mpurchase_app` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `no` varchar(255) DEFAULT NULL COMMENT '物料编号',
 `name` varchar(255) DEFAULT NULL COMMENT '物料名',
 `gg` varchar(255) DEFAULT NULL COMMENT '规格',
 `mtype` varchar(255) DEFAULT NULL COMMENT '型号',
 `pintro` varchar(255) DEFAULT NULL COMMENT '采购说明',
 `mstandard` varchar(255) DEFAULT NULL COMMENT '技术标准',
 `num` int(11) DEFAULT NULL COMMENT '数量',
 `price` double(10,2) DEFAULT NULL COMMENT '参考价格',
 `plan_price` double(10,2) DEFAULT NULL COMMENT '预购价格',
 `total_amount` double(10,2) DEFAULT NULL COMMENT '总金额',
 `dh_date` varchar(30) DEFAULT NULL COMMENT '到货日期',
 `check_status` int(11) DEFAULT NULL COMMENT '审核状态',
 `shbz` varchar(255) DEFAULT NULL COMMENT '审核备注',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='物料申购单';


drop TABLE if EXISTS `mpurchase_plan`;
CREATE TABLE IF NOT EXISTS `mpurchase_plan` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `title` varchar(255) DEFAULT NULL COMMENT '标题',
 `pintro` varchar(255) DEFAULT NULL COMMENT '采购说明',
 `pdetail` varchar(200) DEFAULT NULL COMMENT '采购详情',
 `total_amount` double(10,2) DEFAULT NULL COMMENT '采购总额',
 `jf_date` varchar(30) DEFAULT NULL COMMENT '交付日期',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='物料采购计划';


drop TABLE if EXISTS `purchase_log`;
CREATE TABLE IF NOT EXISTS `purchase_log` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `no` varchar(255) DEFAULT NULL COMMENT '订货单编号',
 `name` varchar(255) DEFAULT NULL COMMENT '物料名',
 `gg` varchar(255) DEFAULT NULL COMMENT '规格',
 `dw` varchar(255) DEFAULT NULL COMMENT '单位',
 `jsbz` varchar(255) DEFAULT NULL COMMENT '技术标准',
 `sl` int(11) DEFAULT NULL COMMENT '数量',
 `price` double(10,2) DEFAULT NULL COMMENT '采购价格',
 `total_amount` double(10,2) DEFAULT NULL COMMENT '总金额',
 `jf_date` varchar(30) DEFAULT NULL COMMENT '交付日期',
 `check_status` int(11) DEFAULT NULL COMMENT '审核状态',
 `check_remark` varchar(255) DEFAULT NULL COMMENT '审核备注',
 `provider_id` int(11) DEFAULT NULL COMMENT '供应商ID',
 `create_date` varchar(30) DEFAULT NULL COMMENT '创建日期',
 `purchase_status` int(11) DEFAULT NULL COMMENT '订货单类型',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='订货单';


drop TABLE if EXISTS `moutlog`;
CREATE TABLE IF NOT EXISTS `moutlog` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `material_id` int(11) DEFAULT NULL COMMENT '物料ID',
 `mno` varchar(255) DEFAULT NULL COMMENT '物料编号',
 `mname` varchar(255) DEFAULT NULL COMMENT '物料名',
 `num` int(11) DEFAULT NULL COMMENT '出库数量',
 `remark` varchar(255) DEFAULT NULL COMMENT '出库备注',
 `ck_date` varchar(30) DEFAULT NULL COMMENT '出库日期',
 `is_comfirm` int(11) DEFAULT NULL COMMENT '是否确认',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='物料出库';


drop TABLE if EXISTS `pro_log`;
CREATE TABLE IF NOT EXISTS `pro_log` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `pro_no` varchar(255) DEFAULT NULL COMMENT '生产编号',
 `stock_id` int(11) DEFAULT NULL COMMENT '库存台账ID',
 `stock_pro_no` varchar(255) DEFAULT NULL COMMENT '商品编号',
 `stock_pro_name` varchar(255) DEFAULT NULL COMMENT '商品名',
 `check_intro` varchar(255) DEFAULT NULL COMMENT '质检说明',
 `check_file` varchar(200) DEFAULT NULL COMMENT '质检证书',
 `create_date` varchar(30) DEFAULT NULL COMMENT '创建日期',
 `in_status` int(11) DEFAULT NULL COMMENT '入库状态',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='生产记录';


drop TABLE if EXISTS `pinlog`;
CREATE TABLE IF NOT EXISTS `pinlog` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `stock_id` int(11) DEFAULT NULL COMMENT '台账ID',
 `pro_no` varchar(255) DEFAULT NULL COMMENT '商品编号',
 `pro_name` varchar(255) DEFAULT NULL COMMENT '商品名',
 `num` int(11) DEFAULT NULL COMMENT '商品数',
 `remark` varchar(255) DEFAULT NULL COMMENT '入库备注',
 `status` int(11) DEFAULT NULL COMMENT '确认状态',
 `create_date` varchar(30) DEFAULT NULL COMMENT '创建日期',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='入库记录';


drop TABLE if EXISTS `poutlog`;
CREATE TABLE IF NOT EXISTS `poutlog` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `stock_id` int(11) DEFAULT NULL COMMENT '库存台账ID',
 `pro_no` varchar(255) DEFAULT NULL COMMENT '商品编号',
 `pro_name` varchar(255) DEFAULT NULL COMMENT '商品名',
 `out_num` int(11) DEFAULT NULL COMMENT '出库数量',
 `remark` varchar(255) DEFAULT NULL COMMENT '出库备注',
 `create_date` varchar(30) DEFAULT NULL COMMENT '创建日期',
 `status` int(11) DEFAULT NULL COMMENT '确认状态',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='出库单';


drop TABLE if EXISTS `send_log`;
CREATE TABLE IF NOT EXISTS `send_log` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `title` varchar(255) DEFAULT NULL COMMENT '标题',
 `ps_intro` varchar(255) DEFAULT NULL COMMENT '配送说明',
 `address` varchar(255) DEFAULT NULL COMMENT '配送地址',
 `contact_name` varchar(255) DEFAULT NULL COMMENT '联系人',
 `contact_cel` varchar(255) DEFAULT NULL COMMENT '联系电话',
 `driver_name` varchar(255) DEFAULT NULL COMMENT '司机',
 `driver_cel` varchar(255) DEFAULT NULL COMMENT '副驾驶',
 `driver_name2` varchar(255) DEFAULT NULL COMMENT '司机电话',
 `driver_cel2` varchar(255) DEFAULT NULL COMMENT '副驾驶电话',
 `ps_detail` varchar(200) DEFAULT NULL COMMENT '配送单详情',
 `total_amount` varchar(255) DEFAULT NULL COMMENT '价值总额',
 `ps_date` varchar(30) DEFAULT NULL COMMENT '配送日期',
 `remark` varchar(255) DEFAULT NULL COMMENT '备注',
 `create_date` varchar(30) DEFAULT NULL COMMENT '创建日期',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='配送单';


drop TABLE if EXISTS `provider_app`;
CREATE TABLE IF NOT EXISTS `provider_app` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `name` varchar(255) DEFAULT NULL COMMENT '厂家名',
 `contact_name` varchar(255) DEFAULT NULL COMMENT '联系人',
 `celcontact_` varchar(255) DEFAULT NULL COMMENT '联系电话',
 `address` varchar(255) DEFAULT NULL COMMENT '地址',
 `gm` varchar(255) DEFAULT NULL COMMENT '厂家规模',
 `pro_names` varchar(255) DEFAULT NULL COMMENT '生产产品',
 `pro_detail` varchar(200) DEFAULT NULL COMMENT '产品报价单',
 `create_date` varchar(30) DEFAULT NULL COMMENT '创建日期',
 `eval_type` int(11) DEFAULT NULL COMMENT '评价等级',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='供应商申请';


drop TABLE if EXISTS `sale_log`;
CREATE TABLE IF NOT EXISTS `sale_log` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `order_no` varchar(255) DEFAULT NULL COMMENT '订单编号',
 `stock_id` int(11) DEFAULT NULL COMMENT '库存台账ID',
 `pro_no` varchar(255) DEFAULT NULL COMMENT '商品编号',
 `pro_name` varchar(255) DEFAULT NULL COMMENT '商品名',
 `num` int(11) DEFAULT NULL COMMENT '销售数量',
 `amount` double(10,2) DEFAULT NULL COMMENT '销售金额',
 `ht_file` varchar(200) DEFAULT NULL COMMENT '销售合同',
 `create_date` varchar(30) DEFAULT NULL COMMENT '创建日期',
 `staff_id` int(11) DEFAULT NULL COMMENT '销售员工',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='销售订单';



INSERT INTO `car_pro_sys`.`admin_msg` (`id`,`login_name`,`password`)  VALUES('1','admin','123');
INSERT INTO `car_pro_sys`.`admin_msg` (`id`,`login_name`,`password`)  VALUES('2','admin1','123');
INSERT INTO `car_pro_sys`.`admin_msg` (`id`,`login_name`,`password`)  VALUES('3','admin2','123');
INSERT INTO `car_pro_sys`.`admin_msg` (`id`,`login_name`,`password`)  VALUES('4','admin3','123');
INSERT INTO `car_pro_sys`.`admin_msg` (`id`,`login_name`,`password`)  VALUES('5','admin4','123');
INSERT INTO `car_pro_sys`.`staff_msg` (`id`,`staff_no`,`password`,`real_name`,`cel_phone`,`email`,`staff_type`,`create_time`)  VALUES('1','staff','123','姓名0','13052653265','129319231@qq.com','3','2023-11-11 14:01:33');
INSERT INTO `car_pro_sys`.`staff_msg` (`id`,`staff_no`,`password`,`real_name`,`cel_phone`,`email`,`staff_type`,`create_time`)  VALUES('2','staff1','123','姓名1','13553613261','05236585@qq.com','2','2023-11-11 14:01:33');
INSERT INTO `car_pro_sys`.`staff_msg` (`id`,`staff_no`,`password`,`real_name`,`cel_phone`,`email`,`staff_type`,`create_time`)  VALUES('3','staff2','123','姓名2','13552623265','05236585@qq.com','4','2023-11-11 14:01:33');
INSERT INTO `car_pro_sys`.`staff_msg` (`id`,`staff_no`,`password`,`real_name`,`cel_phone`,`email`,`staff_type`,`create_time`)  VALUES('4','staff3','123','姓名3','13052623165','8523005@qq.com','6','2023-11-10 14:01:33');
INSERT INTO `car_pro_sys`.`staff_msg` (`id`,`staff_no`,`password`,`real_name`,`cel_phone`,`email`,`staff_type`,`create_time`)  VALUES('5','staff4','123','姓名4','13052633163','32848344234@qq.com','7','2023-11-11 14:01:33');
INSERT INTO `car_pro_sys`.`provider` (`id`,`login_name`,`password`,`cel_phone`,`email`,`address`,`remark`,`create_time`,`gysdj`)  VALUES('1','provider','123','13052653265','32848344234@qq.com','地址0','备注0','2023-11-10 14:01:33','1');
INSERT INTO `car_pro_sys`.`provider` (`id`,`login_name`,`password`,`cel_phone`,`email`,`address`,`remark`,`create_time`,`gysdj`)  VALUES('2','provider1','123','13553613261','04050495495@qq.com','地址1','备注1','2023-11-10 14:01:33','5');
INSERT INTO `car_pro_sys`.`provider` (`id`,`login_name`,`password`,`cel_phone`,`email`,`address`,`remark`,`create_time`,`gysdj`)  VALUES('3','provider2','123','13552623265','652316585@qq.com','地址2','备注2','2023-11-11 14:01:33','4');
INSERT INTO `car_pro_sys`.`provider` (`id`,`login_name`,`password`,`cel_phone`,`email`,`address`,`remark`,`create_time`,`gysdj`)  VALUES('4','provider3','123','13052623165','2443422222@qq.com','地址3','备注3','2023-11-10 14:01:33','3');
INSERT INTO `car_pro_sys`.`provider` (`id`,`login_name`,`password`,`cel_phone`,`email`,`address`,`remark`,`create_time`,`gysdj`)  VALUES('5','provider4','123','13052633163','32848344234@qq.com','地址4','备注4','2023-11-10 14:01:33','3');
INSERT INTO `car_pro_sys`.`sale_plan` (`id`,`plan_name`,`plan_detail`,`ks_date`,`js_date`,`create_date`)  VALUES('1','计划名0','测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试试测试测试测试测试测试测试测试测试测试测试','2023-11-10','2023-11-11','2023-11-11');
INSERT INTO `car_pro_sys`.`sale_plan` (`id`,`plan_name`,`plan_detail`,`ks_date`,`js_date`,`create_date`)  VALUES('2','计划名1','测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试试测试测试测试测试测试测试测试测试测试测试','2023-11-11','2023-11-10','2023-11-11');
INSERT INTO `car_pro_sys`.`sale_plan` (`id`,`plan_name`,`plan_detail`,`ks_date`,`js_date`,`create_date`)  VALUES('3','计划名2','测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试试测试测试测试测试测试测试测试测试测试测试','2023-11-10','2023-11-11','2023-11-11');
INSERT INTO `car_pro_sys`.`sale_plan` (`id`,`plan_name`,`plan_detail`,`ks_date`,`js_date`,`create_date`)  VALUES('4','计划名3','测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试试测试测试测试测试测试测试测试测试测试测试','2023-11-11','2023-11-11','2023-11-11');
INSERT INTO `car_pro_sys`.`sale_plan` (`id`,`plan_name`,`plan_detail`,`ks_date`,`js_date`,`create_date`)  VALUES('5','计划名4','测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试试测试测试测试测试测试测试测试测试测试测试','2023-11-10','2023-11-10','2023-11-10');
INSERT INTO `car_pro_sys`.`stock_msg` (`id`,`pro_no`,`pro_name`,`gg`,`dw`,`price`,`num`)  VALUES('1','商品编号0','商品名0','规格0','单位0','16.1','6');
INSERT INTO `car_pro_sys`.`stock_msg` (`id`,`pro_no`,`pro_name`,`gg`,`dw`,`price`,`num`)  VALUES('2','商品编号1','商品名1','规格1','单位1','41.4','45');
INSERT INTO `car_pro_sys`.`stock_msg` (`id`,`pro_no`,`pro_name`,`gg`,`dw`,`price`,`num`)  VALUES('3','商品编号2','商品名2','规格2','单位2','4.8','49');
INSERT INTO `car_pro_sys`.`stock_msg` (`id`,`pro_no`,`pro_name`,`gg`,`dw`,`price`,`num`)  VALUES('4','商品编号3','商品名3','规格3','单位3','1.7','52');
INSERT INTO `car_pro_sys`.`stock_msg` (`id`,`pro_no`,`pro_name`,`gg`,`dw`,`price`,`num`)  VALUES('5','商品编号4','商品名4','规格4','单位4','9.2','23');
INSERT INTO `car_pro_sys`.`pro_request` (`id`,`stock_id`,`pro_no`,`pro_name`,`need_num`,`jf_date`,`request_intro`,`request_file`,`create_date`,`request_status`,`check_remark`)  VALUES('1','3','商品编号2','商品名2','10','2023-11-11','请求说明0','/car_pro_sys/static/sources/4-1.zip','2023-11-10','2','审核备注0');
INSERT INTO `car_pro_sys`.`pro_request` (`id`,`stock_id`,`pro_no`,`pro_name`,`need_num`,`jf_date`,`request_intro`,`request_file`,`create_date`,`request_status`,`check_remark`)  VALUES('2','5','商品编号4','商品名4','95','2023-11-10','请求说明1','/car_pro_sys/static/sources/4-1.zip','2023-11-11','1','审核备注1');
INSERT INTO `car_pro_sys`.`pro_request` (`id`,`stock_id`,`pro_no`,`pro_name`,`need_num`,`jf_date`,`request_intro`,`request_file`,`create_date`,`request_status`,`check_remark`)  VALUES('3','1','商品编号0','商品名0','93','2023-11-10','请求说明2','/car_pro_sys/static/sources/4-1.zip','2023-11-11','2','审核备注2');
INSERT INTO `car_pro_sys`.`pro_request` (`id`,`stock_id`,`pro_no`,`pro_name`,`need_num`,`jf_date`,`request_intro`,`request_file`,`create_date`,`request_status`,`check_remark`)  VALUES('4','3','商品编号2','商品名2','43','2023-11-10','请求说明3','/car_pro_sys/static/sources/4-1.zip','2023-11-11','1','审核备注3');
INSERT INTO `car_pro_sys`.`pro_request` (`id`,`stock_id`,`pro_no`,`pro_name`,`need_num`,`jf_date`,`request_intro`,`request_file`,`create_date`,`request_status`,`check_remark`)  VALUES('5','4','商品编号3','商品名3','35','2023-11-10','请求说明4','/car_pro_sys/static/sources/4-1.zip','2023-11-10','3','审核备注4');
INSERT INTO `car_pro_sys`.`pro_plan` (`id`,`pname`,`pintro`,`pdetail`,`ks_date`,`js_date`,`create_date`)  VALUES('1','计划名0','生产介绍0','/car_pro_sys/static/sources/4-1.zip','2023-11-10','2023-11-11','2023-11-11');
INSERT INTO `car_pro_sys`.`pro_plan` (`id`,`pname`,`pintro`,`pdetail`,`ks_date`,`js_date`,`create_date`)  VALUES('2','计划名1','生产介绍1','/car_pro_sys/static/sources/4-1.zip','2023-11-10','2023-11-11','2023-11-11');
INSERT INTO `car_pro_sys`.`pro_plan` (`id`,`pname`,`pintro`,`pdetail`,`ks_date`,`js_date`,`create_date`)  VALUES('3','计划名2','生产介绍2','/car_pro_sys/static/sources/4-1.zip','2023-11-10','2023-11-10','2023-11-10');
INSERT INTO `car_pro_sys`.`pro_plan` (`id`,`pname`,`pintro`,`pdetail`,`ks_date`,`js_date`,`create_date`)  VALUES('4','计划名3','生产介绍3','/car_pro_sys/static/sources/4-1.zip','2023-11-10','2023-11-11','2023-11-10');
INSERT INTO `car_pro_sys`.`pro_plan` (`id`,`pname`,`pintro`,`pdetail`,`ks_date`,`js_date`,`create_date`)  VALUES('5','计划名4','生产介绍4','/car_pro_sys/static/sources/4-1.zip','2023-11-10','2023-11-11','2023-11-11');
INSERT INTO `car_pro_sys`.`material_info` (`id`,`mno`,`mname`,`mintro`,`stock_num`,`dw`,`gg`,`provider_id`,`jsbz`,`price`)  VALUES('1','物料编号0','物料名0','物料介绍0','11.5','单位0','规格0','2','技术标准0','75.7');
INSERT INTO `car_pro_sys`.`material_info` (`id`,`mno`,`mname`,`mintro`,`stock_num`,`dw`,`gg`,`provider_id`,`jsbz`,`price`)  VALUES('2','物料编号1','物料名1','物料介绍1','52.4','单位1','规格1','5','技术标准1','15.3');
INSERT INTO `car_pro_sys`.`material_info` (`id`,`mno`,`mname`,`mintro`,`stock_num`,`dw`,`gg`,`provider_id`,`jsbz`,`price`)  VALUES('3','物料编号2','物料名2','物料介绍2','75.8','单位2','规格2','4','技术标准2','3.3');
INSERT INTO `car_pro_sys`.`material_info` (`id`,`mno`,`mname`,`mintro`,`stock_num`,`dw`,`gg`,`provider_id`,`jsbz`,`price`)  VALUES('4','物料编号3','物料名3','物料介绍3','69.7','单位3','规格3','5','技术标准3','78.5');
INSERT INTO `car_pro_sys`.`material_info` (`id`,`mno`,`mname`,`mintro`,`stock_num`,`dw`,`gg`,`provider_id`,`jsbz`,`price`)  VALUES('5','物料编号4','物料名4','物料介绍4','65.5','单位4','规格4','3','技术标准4','75.8');
INSERT INTO `car_pro_sys`.`minlog` (`id`,`material_id`,`num`,`in_remark`,`create_date`,`is_comfirm`)  VALUES('1','5','32','入库备注0','2023-11-11','1');
INSERT INTO `car_pro_sys`.`minlog` (`id`,`material_id`,`num`,`in_remark`,`create_date`,`is_comfirm`)  VALUES('2','3','88','入库备注1','2023-11-11','1');
INSERT INTO `car_pro_sys`.`minlog` (`id`,`material_id`,`num`,`in_remark`,`create_date`,`is_comfirm`)  VALUES('3','2','2','入库备注2','2023-11-10','1');
INSERT INTO `car_pro_sys`.`minlog` (`id`,`material_id`,`num`,`in_remark`,`create_date`,`is_comfirm`)  VALUES('4','5','83','入库备注3','2023-11-11','2');
INSERT INTO `car_pro_sys`.`minlog` (`id`,`material_id`,`num`,`in_remark`,`create_date`,`is_comfirm`)  VALUES('5','3','69','入库备注4','2023-11-10','1');
INSERT INTO `car_pro_sys`.`mneed_msg` (`id`,`title`,`nintro`,`ndetail`,`create_date`,`jf_date`,`check_status`,`check_remark`)  VALUES('1','标题0','需求说明0','/car_pro_sys/static/sources/4-1.zip','2023-11-11','2023-11-10','1','审核备注0');
INSERT INTO `car_pro_sys`.`mneed_msg` (`id`,`title`,`nintro`,`ndetail`,`create_date`,`jf_date`,`check_status`,`check_remark`)  VALUES('2','标题1','需求说明1','/car_pro_sys/static/sources/4-1.zip','2023-11-11','2023-11-10','3','审核备注1');
INSERT INTO `car_pro_sys`.`mneed_msg` (`id`,`title`,`nintro`,`ndetail`,`create_date`,`jf_date`,`check_status`,`check_remark`)  VALUES('3','标题2','需求说明2','/car_pro_sys/static/sources/4-1.zip','2023-11-11','2023-11-11','1','审核备注2');
INSERT INTO `car_pro_sys`.`mneed_msg` (`id`,`title`,`nintro`,`ndetail`,`create_date`,`jf_date`,`check_status`,`check_remark`)  VALUES('4','标题3','需求说明3','/car_pro_sys/static/sources/4-1.zip','2023-11-11','2023-11-11','2','审核备注3');
INSERT INTO `car_pro_sys`.`mneed_msg` (`id`,`title`,`nintro`,`ndetail`,`create_date`,`jf_date`,`check_status`,`check_remark`)  VALUES('5','标题4','需求说明4','/car_pro_sys/static/sources/4-1.zip','2023-11-10','2023-11-11','2','审核备注4');
INSERT INTO `car_pro_sys`.`mpurchase_app` (`id`,`no`,`name`,`gg`,`mtype`,`pintro`,`mstandard`,`num`,`price`,`plan_price`,`total_amount`,`dh_date`,`check_status`,`shbz`)  VALUES('1','物料编号0','物料名0','规格0','型号0','采购说明0','技术标准0','49','19.4','60.9','9.2','2023-11-11','2','审核备注0');
INSERT INTO `car_pro_sys`.`mpurchase_app` (`id`,`no`,`name`,`gg`,`mtype`,`pintro`,`mstandard`,`num`,`price`,`plan_price`,`total_amount`,`dh_date`,`check_status`,`shbz`)  VALUES('2','物料编号1','物料名1','规格1','型号1','采购说明1','技术标准1','60','58.7','71.0','13.7','2023-11-10','3','审核备注1');
INSERT INTO `car_pro_sys`.`mpurchase_app` (`id`,`no`,`name`,`gg`,`mtype`,`pintro`,`mstandard`,`num`,`price`,`plan_price`,`total_amount`,`dh_date`,`check_status`,`shbz`)  VALUES('3','物料编号2','物料名2','规格2','型号2','采购说明2','技术标准2','62','12.0','53.1','4.0','2023-11-10','1','审核备注2');
INSERT INTO `car_pro_sys`.`mpurchase_app` (`id`,`no`,`name`,`gg`,`mtype`,`pintro`,`mstandard`,`num`,`price`,`plan_price`,`total_amount`,`dh_date`,`check_status`,`shbz`)  VALUES('4','物料编号3','物料名3','规格3','型号3','采购说明3','技术标准3','87','28.0','48.6','87.7','2023-11-11','2','审核备注3');
INSERT INTO `car_pro_sys`.`mpurchase_app` (`id`,`no`,`name`,`gg`,`mtype`,`pintro`,`mstandard`,`num`,`price`,`plan_price`,`total_amount`,`dh_date`,`check_status`,`shbz`)  VALUES('5','物料编号4','物料名4','规格4','型号4','采购说明4','技术标准4','29','56.6','67.1','57.7','2023-11-10','2','审核备注4');
INSERT INTO `car_pro_sys`.`mpurchase_plan` (`id`,`title`,`pintro`,`pdetail`,`total_amount`,`jf_date`)  VALUES('1','标题0','采购说明0','/car_pro_sys/static/sources/4-1.zip','59.0','2023-11-10');
INSERT INTO `car_pro_sys`.`mpurchase_plan` (`id`,`title`,`pintro`,`pdetail`,`total_amount`,`jf_date`)  VALUES('2','标题1','采购说明1','/car_pro_sys/static/sources/4-1.zip','32.8','2023-11-10');
INSERT INTO `car_pro_sys`.`mpurchase_plan` (`id`,`title`,`pintro`,`pdetail`,`total_amount`,`jf_date`)  VALUES('3','标题2','采购说明2','/car_pro_sys/static/sources/4-1.zip','46.6','2023-11-10');
INSERT INTO `car_pro_sys`.`mpurchase_plan` (`id`,`title`,`pintro`,`pdetail`,`total_amount`,`jf_date`)  VALUES('4','标题3','采购说明3','/car_pro_sys/static/sources/4-1.zip','4.0','2023-11-11');
INSERT INTO `car_pro_sys`.`mpurchase_plan` (`id`,`title`,`pintro`,`pdetail`,`total_amount`,`jf_date`)  VALUES('5','标题4','采购说明4','/car_pro_sys/static/sources/4-1.zip','57.5','2023-11-10');
INSERT INTO `car_pro_sys`.`purchase_log` (`id`,`no`,`name`,`gg`,`dw`,`jsbz`,`sl`,`price`,`total_amount`,`jf_date`,`check_status`,`check_remark`,`provider_id`,`create_date`,`purchase_status`)  VALUES('1','20231111140134937329','物料名0','规格0','单位0','技术标准0','13','55.0','72.7','2023-11-10','1','审核备注0','2','2023-11-10','1');
INSERT INTO `car_pro_sys`.`purchase_log` (`id`,`no`,`name`,`gg`,`dw`,`jsbz`,`sl`,`price`,`total_amount`,`jf_date`,`check_status`,`check_remark`,`provider_id`,`create_date`,`purchase_status`)  VALUES('2','20231111140134595389','物料名1','规格1','单位1','技术标准1','94','41.3','5.1','2023-11-11','2','审核备注1','5','2023-11-11','2');
INSERT INTO `car_pro_sys`.`purchase_log` (`id`,`no`,`name`,`gg`,`dw`,`jsbz`,`sl`,`price`,`total_amount`,`jf_date`,`check_status`,`check_remark`,`provider_id`,`create_date`,`purchase_status`)  VALUES('3','20231111140134983458','物料名2','规格2','单位2','技术标准2','54','13.6','44.7','2023-11-11','1','审核备注2','5','2023-11-10','2');
INSERT INTO `car_pro_sys`.`purchase_log` (`id`,`no`,`name`,`gg`,`dw`,`jsbz`,`sl`,`price`,`total_amount`,`jf_date`,`check_status`,`check_remark`,`provider_id`,`create_date`,`purchase_status`)  VALUES('4','20231111140134006293','物料名3','规格3','单位3','技术标准3','10','93.6','.6','2023-11-10','1','审核备注3','4','2023-11-11','2');
INSERT INTO `car_pro_sys`.`purchase_log` (`id`,`no`,`name`,`gg`,`dw`,`jsbz`,`sl`,`price`,`total_amount`,`jf_date`,`check_status`,`check_remark`,`provider_id`,`create_date`,`purchase_status`)  VALUES('5','20231111140134803232','物料名4','规格4','单位4','技术标准4','1','1.5','64.0','2023-11-10','3','审核备注4','4','2023-11-10','2');
INSERT INTO `car_pro_sys`.`moutlog` (`id`,`material_id`,`mno`,`mname`,`num`,`remark`,`ck_date`,`is_comfirm`)  VALUES('1','5','物料编号4','物料名4','47','出库备注0','2023-11-11','1');
INSERT INTO `car_pro_sys`.`moutlog` (`id`,`material_id`,`mno`,`mname`,`num`,`remark`,`ck_date`,`is_comfirm`)  VALUES('2','1','物料编号0','物料名0','0','出库备注1','2023-11-11','2');
INSERT INTO `car_pro_sys`.`moutlog` (`id`,`material_id`,`mno`,`mname`,`num`,`remark`,`ck_date`,`is_comfirm`)  VALUES('3','1','物料编号0','物料名0','74','出库备注2','2023-11-10','2');
INSERT INTO `car_pro_sys`.`moutlog` (`id`,`material_id`,`mno`,`mname`,`num`,`remark`,`ck_date`,`is_comfirm`)  VALUES('4','4','物料编号3','物料名3','68','出库备注3','2023-11-11','1');
INSERT INTO `car_pro_sys`.`moutlog` (`id`,`material_id`,`mno`,`mname`,`num`,`remark`,`ck_date`,`is_comfirm`)  VALUES('5','4','物料编号3','物料名3','90','出库备注4','2023-11-10','1');
INSERT INTO `car_pro_sys`.`pro_log` (`id`,`pro_no`,`stock_id`,`stock_pro_no`,`stock_pro_name`,`check_intro`,`check_file`,`create_date`,`in_status`)  VALUES('1','20231111140134617033','1','商品编号0','商品名0','质检说明0','/car_pro_sys/static/sources/4-1.zip','2023-11-11','1');
INSERT INTO `car_pro_sys`.`pro_log` (`id`,`pro_no`,`stock_id`,`stock_pro_no`,`stock_pro_name`,`check_intro`,`check_file`,`create_date`,`in_status`)  VALUES('2','20231111140134911597','4','商品编号3','商品名3','质检说明1','/car_pro_sys/static/sources/4-1.zip','2023-11-11','1');
INSERT INTO `car_pro_sys`.`pro_log` (`id`,`pro_no`,`stock_id`,`stock_pro_no`,`stock_pro_name`,`check_intro`,`check_file`,`create_date`,`in_status`)  VALUES('3','20231111140134353746','1','商品编号0','商品名0','质检说明2','/car_pro_sys/static/sources/4-1.zip','2023-11-11','2');
INSERT INTO `car_pro_sys`.`pro_log` (`id`,`pro_no`,`stock_id`,`stock_pro_no`,`stock_pro_name`,`check_intro`,`check_file`,`create_date`,`in_status`)  VALUES('4','20231111140134223118','1','商品编号0','商品名0','质检说明3','/car_pro_sys/static/sources/4-1.zip','2023-11-10','2');
INSERT INTO `car_pro_sys`.`pro_log` (`id`,`pro_no`,`stock_id`,`stock_pro_no`,`stock_pro_name`,`check_intro`,`check_file`,`create_date`,`in_status`)  VALUES('5','20231111140134541922','4','商品编号3','商品名3','质检说明4','/car_pro_sys/static/sources/4-1.zip','2023-11-11','1');
INSERT INTO `car_pro_sys`.`pinlog` (`id`,`stock_id`,`pro_no`,`pro_name`,`num`,`remark`,`status`,`create_date`)  VALUES('1','5','商品编号4','商品名4','82','入库备注0','2','2023-11-11');
INSERT INTO `car_pro_sys`.`pinlog` (`id`,`stock_id`,`pro_no`,`pro_name`,`num`,`remark`,`status`,`create_date`)  VALUES('2','4','商品编号3','商品名3','76','入库备注1','2','2023-11-10');
INSERT INTO `car_pro_sys`.`pinlog` (`id`,`stock_id`,`pro_no`,`pro_name`,`num`,`remark`,`status`,`create_date`)  VALUES('3','3','商品编号2','商品名2','52','入库备注2','1','2023-11-10');
INSERT INTO `car_pro_sys`.`pinlog` (`id`,`stock_id`,`pro_no`,`pro_name`,`num`,`remark`,`status`,`create_date`)  VALUES('4','4','商品编号3','商品名3','94','入库备注3','1','2023-11-11');
INSERT INTO `car_pro_sys`.`pinlog` (`id`,`stock_id`,`pro_no`,`pro_name`,`num`,`remark`,`status`,`create_date`)  VALUES('5','2','商品编号1','商品名1','70','入库备注4','1','2023-11-11');
INSERT INTO `car_pro_sys`.`poutlog` (`id`,`stock_id`,`pro_no`,`pro_name`,`out_num`,`remark`,`create_date`,`status`)  VALUES('1','4','商品编号3','商品名3','87','出库备注0','2023-11-11','1');
INSERT INTO `car_pro_sys`.`poutlog` (`id`,`stock_id`,`pro_no`,`pro_name`,`out_num`,`remark`,`create_date`,`status`)  VALUES('2','4','商品编号3','商品名3','67','出库备注1','2023-11-11','2');
INSERT INTO `car_pro_sys`.`poutlog` (`id`,`stock_id`,`pro_no`,`pro_name`,`out_num`,`remark`,`create_date`,`status`)  VALUES('3','5','商品编号4','商品名4','8','出库备注2','2023-11-11','2');
INSERT INTO `car_pro_sys`.`poutlog` (`id`,`stock_id`,`pro_no`,`pro_name`,`out_num`,`remark`,`create_date`,`status`)  VALUES('4','4','商品编号3','商品名3','0','出库备注3','2023-11-11','2');
INSERT INTO `car_pro_sys`.`poutlog` (`id`,`stock_id`,`pro_no`,`pro_name`,`out_num`,`remark`,`create_date`,`status`)  VALUES('5','2','商品编号1','商品名1','69','出库备注4','2023-11-11','1');
INSERT INTO `car_pro_sys`.`send_log` (`id`,`title`,`ps_intro`,`address`,`contact_name`,`contact_cel`,`driver_name`,`driver_cel`,`driver_name2`,`driver_cel2`,`ps_detail`,`total_amount`,`ps_date`,`remark`,`create_date`)  VALUES('1','标题0','配送说明0','配送地址0','联系人0','13052653265','司机0','副驾驶0','13052653265','13052653265','/car_pro_sys/static/sources/4-1.zip','价值总额0','2023-11-11','备注0','2023-11-11');
INSERT INTO `car_pro_sys`.`send_log` (`id`,`title`,`ps_intro`,`address`,`contact_name`,`contact_cel`,`driver_name`,`driver_cel`,`driver_name2`,`driver_cel2`,`ps_detail`,`total_amount`,`ps_date`,`remark`,`create_date`)  VALUES('2','标题1','配送说明1','配送地址1','联系人1','13553613261','司机1','副驾驶1','13553613261','13553613261','/car_pro_sys/static/sources/4-1.zip','价值总额1','2023-11-11','备注1','2023-11-11');
INSERT INTO `car_pro_sys`.`send_log` (`id`,`title`,`ps_intro`,`address`,`contact_name`,`contact_cel`,`driver_name`,`driver_cel`,`driver_name2`,`driver_cel2`,`ps_detail`,`total_amount`,`ps_date`,`remark`,`create_date`)  VALUES('3','标题2','配送说明2','配送地址2','联系人2','13552623265','司机2','副驾驶2','13552623265','13552623265','/car_pro_sys/static/sources/4-1.zip','价值总额2','2023-11-10','备注2','2023-11-11');
INSERT INTO `car_pro_sys`.`send_log` (`id`,`title`,`ps_intro`,`address`,`contact_name`,`contact_cel`,`driver_name`,`driver_cel`,`driver_name2`,`driver_cel2`,`ps_detail`,`total_amount`,`ps_date`,`remark`,`create_date`)  VALUES('4','标题3','配送说明3','配送地址3','联系人3','13052623165','司机3','副驾驶3','13052623165','13052623165','/car_pro_sys/static/sources/4-1.zip','价值总额3','2023-11-10','备注3','2023-11-10');
INSERT INTO `car_pro_sys`.`send_log` (`id`,`title`,`ps_intro`,`address`,`contact_name`,`contact_cel`,`driver_name`,`driver_cel`,`driver_name2`,`driver_cel2`,`ps_detail`,`total_amount`,`ps_date`,`remark`,`create_date`)  VALUES('5','标题4','配送说明4','配送地址4','联系人4','13052633163','司机4','副驾驶4','13052633163','13052633163','/car_pro_sys/static/sources/4-1.zip','价值总额4','2023-11-10','备注4','2023-11-10');
INSERT INTO `car_pro_sys`.`provider_app` (`id`,`name`,`contact_name`,`celcontact_`,`address`,`gm`,`pro_names`,`pro_detail`,`create_date`,`eval_type`)  VALUES('1','厂家名0','联系人0','13052653265','地址0','厂家规模0','生产产品0','/car_pro_sys/static/sources/4-1.zip','2023-11-10','4');
INSERT INTO `car_pro_sys`.`provider_app` (`id`,`name`,`contact_name`,`celcontact_`,`address`,`gm`,`pro_names`,`pro_detail`,`create_date`,`eval_type`)  VALUES('2','厂家名1','联系人1','13553613261','地址1','厂家规模1','生产产品1','/car_pro_sys/static/sources/4-1.zip','2023-11-10','4');
INSERT INTO `car_pro_sys`.`provider_app` (`id`,`name`,`contact_name`,`celcontact_`,`address`,`gm`,`pro_names`,`pro_detail`,`create_date`,`eval_type`)  VALUES('3','厂家名2','联系人2','13552623265','地址2','厂家规模2','生产产品2','/car_pro_sys/static/sources/4-1.zip','2023-11-11','1');
INSERT INTO `car_pro_sys`.`provider_app` (`id`,`name`,`contact_name`,`celcontact_`,`address`,`gm`,`pro_names`,`pro_detail`,`create_date`,`eval_type`)  VALUES('4','厂家名3','联系人3','13052623165','地址3','厂家规模3','生产产品3','/car_pro_sys/static/sources/4-1.zip','2023-11-10','5');
INSERT INTO `car_pro_sys`.`provider_app` (`id`,`name`,`contact_name`,`celcontact_`,`address`,`gm`,`pro_names`,`pro_detail`,`create_date`,`eval_type`)  VALUES('5','厂家名4','联系人4','13052633163','地址4','厂家规模4','生产产品4','/car_pro_sys/static/sources/4-1.zip','2023-11-10','4');
INSERT INTO `car_pro_sys`.`sale_log` (`id`,`order_no`,`stock_id`,`pro_no`,`pro_name`,`num`,`amount`,`ht_file`,`create_date`,`staff_id`)  VALUES('1','20231111140135231376','3','商品编号2','商品名2','8','73.1','/car_pro_sys/static/sources/4-1.zip','2023-11-10','3');
INSERT INTO `car_pro_sys`.`sale_log` (`id`,`order_no`,`stock_id`,`pro_no`,`pro_name`,`num`,`amount`,`ht_file`,`create_date`,`staff_id`)  VALUES('2','20231111140135247400','5','商品编号4','商品名4','5','78.9','/car_pro_sys/static/sources/4-1.zip','2023-11-10','2');
INSERT INTO `car_pro_sys`.`sale_log` (`id`,`order_no`,`stock_id`,`pro_no`,`pro_name`,`num`,`amount`,`ht_file`,`create_date`,`staff_id`)  VALUES('3','20231111140135074470','3','商品编号2','商品名2','36','43.4','/car_pro_sys/static/sources/4-1.zip','2023-11-10','2');
INSERT INTO `car_pro_sys`.`sale_log` (`id`,`order_no`,`stock_id`,`pro_no`,`pro_name`,`num`,`amount`,`ht_file`,`create_date`,`staff_id`)  VALUES('4','20231111140135312514','2','商品编号1','商品名1','50','84.5','/car_pro_sys/static/sources/4-1.zip','2023-11-10','2');
INSERT INTO `car_pro_sys`.`sale_log` (`id`,`order_no`,`stock_id`,`pro_no`,`pro_name`,`num`,`amount`,`ht_file`,`create_date`,`staff_id`)  VALUES('5','20231111140135753997','1','商品编号0','商品名0','24','64.9','/car_pro_sys/static/sources/4-1.zip','2023-11-10','2');