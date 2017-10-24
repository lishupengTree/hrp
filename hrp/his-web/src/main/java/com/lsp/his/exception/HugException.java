package com.lsp.his.exception;

/**
 * @author lishupeng
 * @Description
 * @Date 2017/10/24 13:32
 */
public class HugException extends RuntimeException implements IHugException {
    private int errorCode;
    private String msg;
    private Throwable throwable;

    public HugException(int errorCode,String msg){
        this.errorCode = errorCode;
        this.msg =msg;
    }
    public HugException(int errorCode,String msg,Throwable throwable){
        this.errorCode = errorCode;
        this.msg =msg;
        this.throwable =throwable;
    }

    @Override
    public int getErrorCode() {
        return this.errorCode;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }

    @Override
    public Throwable getCaluse() {
        return this.throwable;
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("【errorCod】e:").append(this.errorCode).append("【msg】:").append(this.msg)
                .append("【inner Caluse】:").append(null == throwable?"Inner Business Caluse":throwable.toString());
        return sb.toString();
    }
}
