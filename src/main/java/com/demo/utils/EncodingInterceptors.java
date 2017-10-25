package com.demo.utils;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EncodingInterceptors implements Interceptor {
    @Override
    public void destroy() {
        // destroy 销毁 [dɪˈstrɔɪ]
    }

    @Override
    public void init() {
        // initialization 初始化\ [ɪ,nɪʃəlaɪ'zeɪʃən]
    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        //修改请求的编码方式
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setCharacterEncoding("UTF-8");

        //修改响应的编码方式
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setCharacterEncoding("UTF-8");
        System.out.println("经过了Encoding拦截器");
        //将请求交给action
        return invocation.invoke();
    }
}
