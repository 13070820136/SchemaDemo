package com.demo.schema;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

public class UserBeanDefinitionParser extends
		AbstractSingleBeanDefinitionParser {

	private String elementName;

	public UserBeanDefinitionParser(String elementName) {
		this.elementName = elementName;
	}

	@Override
	protected Class<?> getBeanClass(Element element) {
		return UserBean.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder bean) {
		if (elementName.equals("user")) {
			String id = element.getAttribute("id");
			String name = element.getAttribute("name");
			String sex = element.getAttribute("sex");
			int age = Integer.parseInt(element.getAttribute("age"));
			bean.addPropertyValue("id", id);
			bean.addPropertyValue("name", name);
			bean.addPropertyValue("sex", sex);
			bean.addPropertyValue("age", age);
		}
	}

}
