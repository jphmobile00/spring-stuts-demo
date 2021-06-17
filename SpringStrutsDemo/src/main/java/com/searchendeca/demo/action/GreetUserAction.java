package com.searchendeca.demo.action;

import com.opensymphony.xwork2.ActionSupport;

public class GreetUserAction extends ActionSupport {

private String message;


    public String getMessage() {
	return message;
}


public void setMessage(String message) {
	this.message = message;
}


	@Override
    public String execute() throws Exception {
        return SUCCESS;
    }


}