package com.tedu.sp04.order.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tedu.sp01.pojo.Item;
import com.tedu.web.util.JsonResult;

@Component
public class ItemFeingServiceFB implements ItemFeingService {

	@SuppressWarnings("unchecked")
	@Override
	public JsonResult<List<Item>> getItems(String orderId) {
		if (Math.random() < 0.5) {
			return JsonResult.ok().data(Arrays.asList(new Item[] { new Item(1, "缓存aaa", 2), new Item(2, "缓存bbb", 1),
					new Item(3, "缓存ccc", 3), new Item(4, "缓存ddd", 1), new Item(5, "缓存eee", 5) }));
		}
		return JsonResult.err("获取订单失败了lu");
	}

	@Override
	public JsonResult decreaseNumber(List<Item> items) {
		return JsonResult.err("删除数量失败了呀lu");
	}

}
