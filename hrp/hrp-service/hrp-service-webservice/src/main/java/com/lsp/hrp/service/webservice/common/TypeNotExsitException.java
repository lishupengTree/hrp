package com.lsp.hrp.service.webservice.common;
/**
 * 算法类异常
 * @author bjyuan
 *
 */
public class TypeNotExsitException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public TypeNotExsitException(String msg){
    	super(msg);
    }
}
