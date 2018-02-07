package com.lanou.redis;

import redis.clients.jedis.Jedis;

public class Demo1 {
	public static void main(String[] args) {
		//链接服务器
		//gjgjhy
		Jedis j = new Jedis("127.0.0.1",6379);
		//权限认证
		j.auth("123456");
		j.select(0);
		
	}
	
	
	
	
	
	
	
}
