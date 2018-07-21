package com.zhoumin.wechat.service;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhoumin
 * @create 2018-07-11 15:33
 */
public interface MessageService {
    String newMessageRequest(HttpServletRequest request);
}
