/*
 * 类参考DefaultCommentGenerator具体实现
 * Copyright (C) 2006-2015 Tuniu All rights reserved
 * Author: chujun
 * Date: 2015-11-26
 * Description: 
 */
package com.chujun.spring.demo.mybatisAutoGenerate;

import java.util.Date;
import java.util.Properties;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.InnerEnum;
import org.mybatis.generator.api.dom.java.JavaElement;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.MergeConstants;
import org.mybatis.generator.internal.DefaultCommentGenerator;

/**
 * 自定义产生注释类 suppressDate:默认不产生时间，true：阻止产生时间注释，false：不阻止产生时间注释
 * 
 * @author chujun
 * 
 */
public class MyCommentGenerator extends DefaultCommentGenerator {
	private Properties properties;
	private boolean suppressDate;

	public MyCommentGenerator() {
		super();
		properties = new Properties();
		// 不产生时间注释
		suppressDate = true;
	}

	@Override
	public void addJavaFileComment(CompilationUnit compilationUnit) {
		// super.addJavaFileComment(compilationUnit);
	}

	@Override
	public void addComment(XmlElement xmlElement) {
		xmlElement.addElement(new TextElement("<!--")); //$NON-NLS-1$
        StringBuilder sb = new StringBuilder();        
        sb.append(MergeConstants.NEW_ELEMENT_TAG);
        xmlElement.addElement(new TextElement(sb.toString()));                
        xmlElement.addElement(new TextElement("-->")); //$NON-NLS-1$
		// super.addComment(xmlElement);
	}

	@Override
	public void addRootComment(XmlElement rootElement) {
		// super.addRootComment(rootElement);
	}

	@Override
	public void addConfigurationProperties(Properties properties) {
		super.addConfigurationProperties(properties);
	}

	@Override
	protected void addJavadocTag(JavaElement javaElement,
			boolean markAsDoNotDelete) {
		super.addJavadocTag(javaElement, markAsDoNotDelete);
	}

	@Override
	protected String getDateString() {
		// return super.getDateString();
		if (suppressDate) {
			return null;
		} else {
			return new Date().toString();
		}
	}

	@Override
	public void addClassComment(InnerClass innerClass,
			IntrospectedTable introspectedTable) {
		// super.addClassComment(innerClass, introspectedTable);
	}

	@Override
	public void addEnumComment(InnerEnum innerEnum,
			IntrospectedTable introspectedTable) {
		// super.addEnumComment(innerEnum, introspectedTable);
	}

	@Override
	public void addFieldComment(Field field,
			IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		// 自定义类属性
		StringBuilder sb = new StringBuilder();

		field.addJavaDocLine("/**"); //$NON-NLS-1$
		field.addJavaDocLine(" * "+introspectedColumn.getRemarks());		
		sb.append(introspectedColumn.getActualColumnName());
		field.addJavaDocLine(" * "+sb.toString());
		field.addJavaDocLine(" */"); //$NON-NLS-1$
		// super.addFieldComment(field, introspectedTable, introspectedColumn);
	}

	@Override
	public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
		StringBuilder sb = new StringBuilder();

		field.addJavaDocLine("/**"); //$NON-NLS-1$		
		sb.append(introspectedTable.getFullyQualifiedTable());
		field.addJavaDocLine(" * "+sb.toString());
		field.addJavaDocLine(" */"); //$NON-NLS-1$
		//super.addFieldComment(field, introspectedTable);
	}

	@Override
	public void addGeneralMethodComment(Method method,
			IntrospectedTable introspectedTable) {		
		//super.addGeneralMethodComment(method, introspectedTable);
	}

	@Override
	public void addGetterComment(Method method,
			IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {		
		//super.addGetterComment(method, introspectedTable, introspectedColumn);
	}

	@Override
	public void addSetterComment(Method method,
			IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {		
		//super.addSetterComment(method, introspectedTable, introspectedColumn);
	}

	@Override
	public void addClassComment(InnerClass innerClass,
			IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {		
		//super.addClassComment(innerClass, introspectedTable, markAsDoNotDelete);
	}
}
