package com.lsp.hrp.service.webservice.common;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/**
 * xml工具类
 * @author bjyuan
 *
 */
public class XmlUtil {
	
	public static Document str2Doc(String xml) {
		InputStream in = null;
		try {
			in = new ByteArrayInputStream(xml.getBytes("utf-8"));
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		SAXReader reader = new SAXReader();
		Document doc = null;
		try {
			doc = reader.read(in);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doc;
	}

	/**
	 * 文本转Document
	 * @param xml
	 * @return
	 */
	public static Document chenageToDocument(String xml){
		InputStream in = null;
		try {
			in = new ByteArrayInputStream(xml.getBytes("utf-8"));
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		SAXReader reader = new SAXReader();
		Document doc = null;
		try {
			doc = reader.read(in);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doc;
	}
	
	/**
	 * 读取class目录相对地址为url的xml文件
	 * @param url
	 * @return
	 */
	public static Document loadXml(String url){
		Document document = null;
	    SAXReader reader = new SAXReader();
	    try {
	    	FileInputStream stream = (FileInputStream) Thread.currentThread().getContextClassLoader().getResourceAsStream(url);
	      /*path = path + url;
	      FileInputStream stream = new FileInputStream(path);*/
	      	document = reader.read(stream);
	    } catch (Exception e) {
	      	e.printStackTrace();
	    }
	    return document;

	}
}
