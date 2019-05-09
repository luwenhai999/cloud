package com.tedu.sp04.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tedu.sp01.pojo.User;
import com.tedu.web.util.JsonResult;

@Component
public class UserFeignServiceFB implements UserFeignService {

	@Override
	public JsonResult<User> getUser(Integer userId) {
		// TODO Auto-generated method stub
		if(Math.random()<0.4) {
			return JsonResult.ok(new User(userId, "缓存name"+userId, "缓存pwd"+userId));
		}
		return JsonResult.err("获取用户失败了lu");
	}

	@Override
	public JsonResult addScore(Integer userId, Integer score) {
		// TODO Auto-generated method stub
		return JsonResult.err("添加分数失败了lu");
	}
}
