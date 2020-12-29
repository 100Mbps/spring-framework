package com.dgyt.debug.nshandler;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class<?> getBeanClass(Element element) {
		String className = element.getAttribute("class");
		if (StringUtils.hasText(className)) {
			try {
				return Class.forName(className);
			} catch (Exception e) {
				throw new IllegalStateException(String.format("[%s] not found", className));
			}
		} else {
			throw new IllegalArgumentException("element must have class attribute");
		}
	}
	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		super.doParse(element, builder);
		String name = element.getAttribute("name");
		Integer age = Integer.valueOf(element.getAttribute("age"));

		builder.addPropertyValue("name", name);
		builder.addPropertyValue("age", age);

	}
}
