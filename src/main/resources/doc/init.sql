/*
SQLyog Ultimate v9.62 
MySQL - 5.7.17-log : Database - rainbow-api
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`rainbow-api` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `rainbow-api`;

/*Table structure for table `t_comment` */

DROP TABLE IF EXISTS `t_comment`;

CREATE TABLE `t_comment` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `type` int(4) NOT NULL COMMENT '类别',
  `news_info` int(11) DEFAULT NULL COMMENT '资讯信息',
  `picture_info` int(11) DEFAULT NULL COMMENT '图片信息',
  `goods_info` int(11) DEFAULT NULL COMMENT '商品信息',
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `content` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '评论内容',
  `sort` decimal(4,2) NOT NULL COMMENT '排序',
  `username` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='评论表';

/*Data for the table `t_comment` */

insert  into `t_comment`(`id`,`type`,`news_info`,`picture_info`,`goods_info`,`created_time`,`content`,`sort`,`username`) values (1,1,1,NULL,NULL,'2018-02-05 17:52:39','江宇测试新闻资讯评论1','1.00','Rain01'),(2,2,NULL,NULL,1,'2018-02-05 17:52:42','江宇测试商品评论','1.00','Rain02'),(3,3,NULL,1,0,'2018-02-05 17:52:45','江宇测试图片评论','1.00','Rain03'),(4,1,1,NULL,NULL,'2018-02-05 17:52:49','江宇测试新闻资讯评论2','2.00','Rain04'),(5,1,1,NULL,NULL,'2018-02-05 17:52:53','江宇测试新闻资讯评论3','3.00','Rain05'),(6,1,1,NULL,NULL,'2018-02-05 17:52:57','江宇测试新闻资讯评论4','4.00','Rain06'),(7,1,1,NULL,NULL,'2018-02-05 17:53:00','江宇测试新闻资讯评论5','8.00','Rain07'),(8,1,1,NULL,NULL,'2018-02-05 17:53:03','江宇测试新闻资讯评论6','6.00','Rain08'),(9,1,1,NULL,NULL,'2018-02-05 17:53:06','江宇测试新闻资讯评论7','9.00','Rain09'),(10,1,1,NULL,NULL,'2018-02-05 17:53:09','江宇测试新闻资讯评论8','5.00','Rain10'),(11,1,1,NULL,NULL,'2018-02-05 17:53:13','江宇测试新闻资讯评论9','7.00','Rain11'),(12,1,1,NULL,NULL,'2018-02-05 19:26:27',NULL,'1.00',NULL),(13,1,1,NULL,NULL,'2018-02-05 19:31:03',NULL,'1.00',NULL),(14,1,1,NULL,NULL,'2018-02-05 19:33:17',NULL,'1.00',NULL);

/*Table structure for table `t_cover_picture` */

DROP TABLE IF EXISTS `t_cover_picture`;

CREATE TABLE `t_cover_picture` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `image` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '图片',
  `sort` decimal(4,2) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `t_cover_picture` */

insert  into `t_cover_picture`(`id`,`image`,`sort`) values (1,'http://jhonrainproject.oss-cn-shanghai.aliyuncs.com/vue/timg.jpg','1.00'),(2,'http://jhonrainproject.oss-cn-shanghai.aliyuncs.com/vue/timg (2).jpg','2.00'),(3,'http://jhonrainproject.oss-cn-shanghai.aliyuncs.com/vue/timg (1).jpg','3.00');

/*Table structure for table `t_goods_detail` */

DROP TABLE IF EXISTS `t_goods_detail`;

CREATE TABLE `t_goods_detail` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `goods_info` int(11) NOT NULL COMMENT '商品信息',
  `description` text COLLATE utf8_unicode_ci COMMENT '商品图文描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='商品详情表';

/*Data for the table `t_goods_detail` */

insert  into `t_goods_detail`(`id`,`goods_info`,`description`) values (1,1,'MacBook Pro 新年版，是2018年最新的一款，你值得拥有，让你写代码如行云流水般的顺畅！'),(2,2,'Phone 8 的设计焕然一新，机身前后皆采用坚固的玻璃面板，并配备更先进的摄像头、强劲的全新芯片 A11 仿生，以及无线充电技术');

/*Table structure for table `t_goods_info` */

DROP TABLE IF EXISTS `t_goods_info`;

CREATE TABLE `t_goods_info` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(128) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '名称',
  `description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '介绍',
  `product_info` int(11) DEFAULT NULL COMMENT '品牌',
  `scan` int(4) DEFAULT '0' COMMENT '浏览量',
  `market_price` decimal(10,2) DEFAULT '0.00' COMMENT '市场价',
  `sell_price` decimal(10,2) DEFAULT '0.00' COMMENT '销售价',
  `add_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '上架时间',
  `cover_img` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '封面图片',
  `serial_num` varchar(128) COLLATE utf8_unicode_ci NOT NULL COMMENT '商品编号',
  `stock_quantity` int(4) DEFAULT '0' COMMENT '库存',
  `sort` decimal(4,2) NOT NULL COMMENT '排序',
  `tag` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '标签',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='商品信息表';

/*Data for the table `t_goods_info` */

insert  into `t_goods_info`(`id`,`name`,`description`,`product_info`,`scan`,`market_price`,`sell_price`,`add_time`,`cover_img`,`serial_num`,`stock_quantity`,`sort`,`tag`) values (1,'MacBook Pro 新年版','2018新年大促销，年货节，优惠大甩卖。',1,111,'3998.00','4100.00','2018-02-06 09:37:42','http://vuelearn.oss-cn-shenzhen.aliyuncs.com/2018-01-25_224203.png','21231231975768321',10,'1.00','热卖中'),(2,'苹果 Apple iPhone 8(联通三网通)','买不了IphoneX,也得有个Iphone 8.',1,3332,'4900.00','4599.00','2018-02-06 09:37:49','http://vuelearn.oss-cn-shenzhen.aliyuncs.com/2018-01-25_224203.png','20932309423434685',5,'2.00','热卖中');

/*Table structure for table `t_news_info` */

DROP TABLE IF EXISTS `t_news_info`;

CREATE TABLE `t_news_info` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(128) COLLATE utf8_unicode_ci NOT NULL COMMENT '标题',
  `summary` varchar(512) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '摘要',
  `scan` int(4) DEFAULT '0' COMMENT '浏览量',
  `cover_img` varchar(512) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '封面图片',
  `author` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '作者',
  `content` text COLLATE utf8_unicode_ci COMMENT '内容',
  `publish_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '发布时间',
  `sort` decimal(4,2) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='资讯表';

/*Data for the table `t_news_info` */

insert  into `t_news_info`(`id`,`title`,`summary`,`scan`,`cover_img`,`author`,`content`,`publish_time`,`sort`) values (1,'幸福资讯','能和心爱的人一起睡觉，是件幸福的事情；可是，打呼噜怎么办？',156,'../../../statics/mui/images/shuijiao.jpg','Rain01','<p>　　作为一个喜欢折腾的90后，之前的<a href=\"http://www.jiang-yu.cn\">技术博客</a>已经落地有一段时间了，最近想开启一个生活博客来记录生活中值得被记住的那些瞬间。<img src=\"http://jhonrain.oss-cn-shanghai.aliyuncs.com/learn-blog/device-main.jpg\" alt=\"Persistent\" width=\"400px;\" title=\"\" />一个不小心入了IT行，成为一名码农，那又怎样，通往牛逼的道路千万条，何必单恋一枝花。</p><p>　　<img src=\"http://odrarykf5.bkt.clouddn.com/avatar02.png\" alt=\"Persistent\" title=\"\" /></p><p>　　一个人熬的时候，总会有坚持不住的时候，辛苦了那么久，总是希望能够稍微放纵一下自己因为人对自己，总是有太多的借口。</p><p>　　坚持下去，不断的发现自己，总能找到属于自己的那条牛逼之路。</p>','2018-02-05 14:17:37','1.00'),(2,'木屋资讯','想要这样一间小木屋，夏天挫冰吃瓜，冬天围炉取暖.',112,'../../../statics/mui/images/muwu.jpg','Rain02',NULL,'2018-02-05 11:56:31','2.00'),(3,'CBD资讯','烤炉模式的城，到黄昏，如同打翻的调色盘一般.',22,'../../../statics/mui/images/cbd.jpg','Rain03',NULL,'2018-02-05 11:56:38','3.00');

/*Table structure for table `t_picture_category` */

DROP TABLE IF EXISTS `t_picture_category`;

CREATE TABLE `t_picture_category` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(128) COLLATE utf8_unicode_ci NOT NULL COMMENT '名称',
  `sort` decimal(4,2) NOT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='图片分类';

/*Data for the table `t_picture_category` */

insert  into `t_picture_category`(`id`,`name`,`sort`) values (1,'生活家居','1.00'),(2,'数码科技','2.00'),(3,'极限运动','3.00'),(4,'IT世界','4.00'),(5,'香车美女','5.00');

/*Table structure for table `t_picture_info` */

DROP TABLE IF EXISTS `t_picture_info`;

CREATE TABLE `t_picture_info` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(128) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '标题',
  `cover_img` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '封面图片',
  `summary` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '摘要',
  `picture_category` int(11) NOT NULL COMMENT '图片类别',
  `sort` decimal(4,2) NOT NULL COMMENT '排序',
  `add_Time` datetime DEFAULT NULL COMMENT '添加时间',
  `scan` int(4) DEFAULT NULL COMMENT '浏览量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='图片详情表';

/*Data for the table `t_picture_info` */

insert  into `t_picture_info`(`id`,`title`,`cover_img`,`summary`,`picture_category`,`sort`,`add_Time`,`scan`) values (1,'ECIT•那些年•2010-2014','http://jhonrain.oss-cn-shanghai.aliyuncs.com/20161001/school.jpg','那些年，有一种时光叫：“从2010到2014，从大一到大四，诞生了路人甲乙丙丁，造就了1321的神奇。',1,'1.00','2018-02-06 15:28:22',111),(2,'Peacetime Of Life Blog Is Online','http://jhonrain.oss-cn-shanghai.aliyuncs.com/travel/IMG_0246.JPG','作为一个喜欢折腾的90后，之前的技术博客已经落地有一段时间了，最近想开启一个生活博客来记录生活中值得被记住的那些瞬间。',1,'2.00','2018-02-05 15:28:24',1223);

/*Table structure for table `t_picture_thum` */

DROP TABLE IF EXISTS `t_picture_thum`;

CREATE TABLE `t_picture_thum` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `src_url` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '缩略图',
  `picture_info` int(11) NOT NULL COMMENT '图片详情',
  `sort` decimal(4,2) NOT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='图片信息缩略图表';

/*Data for the table `t_picture_thum` */

insert  into `t_picture_thum`(`id`,`src_url`,`picture_info`,`sort`) values (1,'http://jhonrain.oss-cn-shanghai.aliyuncs.com/20161001/sunup.jpg',1,'1.00'),(2,'http://jhonrain.oss-cn-shanghai.aliyuncs.com/2012snow/P30309-145407.jpg',1,'2.00'),(3,'http://jhonrain.oss-cn-shanghai.aliyuncs.com/20161001/IMG_0804.JPG',1,'3.00'),(4,'http://jhonrain.oss-cn-shanghai.aliyuncs.com/school/sushegongyue.png',1,'4.00'),(5,'http://jhonrain.oss-cn-shanghai.aliyuncs.com/20161001/sushe.jpg',1,'5.00'),(6,'http://jhonrain.oss-cn-shanghai.aliyuncs.com/school/%E7%85%A7%E7%89%871029.jpg',1,'6.00'),(7,'http://jhonrain.oss-cn-shanghai.aliyuncs.com/school/2016-10-06_192807.png',1,'7.00'),(8,'http://jhonrain.oss-cn-shanghai.aliyuncs.com/school/lol.png',1,'8.00');

/*Table structure for table `t_product_info` */

DROP TABLE IF EXISTS `t_product_info`;

CREATE TABLE `t_product_info` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(128) COLLATE utf8_unicode_ci NOT NULL COMMENT '名称',
  `sort` decimal(4,2) NOT NULL COMMENT '排序',
  `add_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='商品品牌信息表';

/*Data for the table `t_product_info` */

insert  into `t_product_info`(`id`,`name`,`sort`,`add_time`) values (1,'Apple','1.00','2018-02-06 08:55:17'),(2,'DELL','2.00','2018-02-06 08:55:26'),(3,'HP','3.00','2018-02-06 08:55:50');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
