package org.springbootstarter.controller;

import org.springframework.stereotype.Component;

@Component
public class ParentBean {
	private String parentMember1;
	private String parentMember2;
	public String getParentMember1() {
		return parentMember1;
	}
	public void setParentMember1(String parentMember1) {
		this.parentMember1 = parentMember1;
	}
	public String getParentMember2() {
		return parentMember2;
	}
	public void setParentMember2(String parentMember2) {
		this.parentMember2 = parentMember2;
	}

	
}
