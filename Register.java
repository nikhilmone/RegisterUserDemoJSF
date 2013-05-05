package com.test;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
@ManagedBean
@ViewScoped
public class Register implements Serializable{

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	
	public Register(){
		user = new User();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public User getUser() {
		return user;
	}
	
public void submit(){
	
	FacesMessage message = new FacesMessage("Registration Successful");
	FacesContext.getCurrentInstance().addMessage(null, message);
	
}
	

}
