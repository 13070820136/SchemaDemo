package com.demo.schema;

public class UserNamespaceHandler extends
		org.springframework.beans.factory.xml.NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser("user"));
	}

}
