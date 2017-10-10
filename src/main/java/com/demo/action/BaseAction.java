package com.demo.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class BaseAction extends ActionSupport implements ServletRequestAware,ServletResponseAware{
    //要配置的属性
    //*********************************************************************************
    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession session;
    protected ServletContext application;
    protected PrintWriter out;
    //********************************************************************************
    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request=request;
        this.session=request.getSession();
        this.application=request.getServletContext();
    }

    @Override
    public void setServletResponse(HttpServletResponse response) {
        this.response=response;
        try {
            this.out=response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
