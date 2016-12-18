package com.littlepj.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lzy on 2016/12/18.
 */
public class HelloAction extends ActionSupport {


    @Override
    public String execute() throws Exception {
        System.out.print("ok");
        return "success";
    }
}
