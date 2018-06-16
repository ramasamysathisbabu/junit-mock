package org.springbootstarter.controller;

import org.springframework.stereotype.Component;

@Component
public class ChildBean1 {
	private String childMember1;

	public String getChildMember1() {
		return childMember1;
	}

	public void setChildMember1(String childMember1) {
		this.childMember1 = childMember1;
	}


}
