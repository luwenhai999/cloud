package com.tedu.sp04.order.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.sp01.pojo.Item;
import com.tedu.sp01.pojo.Order;
import com.tedu.sp01.pojo.User;
import com.tedu.sp01.service.OrderService;
import com.tedu.web.util.JsonResult;

@Service
public class OrderServiceImpl implements OrderService {
	private static Logger log = LoggerFactory.getLogger(OrderServiceImpl.class);
	@Autowired
	ItemFeingService itemFeignService;
	@Autowired
	UserFeignService userFeingService;

	public Order getOrder(String orderId) {
		// TODO: 调用user-service获取用户信息
		JsonResult<User> user = userFeingService.getUser(7);
		// TODO: 调用item-service获取商品信息
		JsonResult<List<Item>> items = itemFeignService.getItems(orderId);
		Order order = new Order();
		order.setId(orderId);
		order.setUser(user.getData());
		order.setItems(items.getData());
		return order;
	}

	@Override
	public void addOrder(Order order) {
		// TODO: 调用item-service减少商品库存
		itemFeignService.decreaseNumber(order.getItems());
		// TODO: 调用user-service增加用户积分
		userFeingService.addScore(7, 100);
		log.info("保存订单：" + order);
	}
}
