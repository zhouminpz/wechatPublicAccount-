package com.zhoumin.wechat.constant;

import lombok.Getter;
import lombok.Setter;

/**
 * 凭证
 * @author zhoumin
 * @create 2018-07-11 15:22
 */
@Setter
@Getter
public class AccessToken {
	/**
	 *  获取到的凭证
	 */
	private String accessToken;
	
	/**
	 *  凭证有效时间，单位：秒
	 */
	private int expiresIn;
}
