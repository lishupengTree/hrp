package com.lsp.hrp.common.bean;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lishupeng
 * @Description
 * @Author lishupeng
 * @Date 2017/10/24 13:14
 */
public class Reply implements Serializable{
    private static final int RES_SUCCESS = 0;
    private static final long serialVersionUID = -6606894688235947269L;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private int res;
    private String msg;
    private Object data;
    private String time;

    public Reply(){
        this.res = RES_SUCCESS;
        this.time = getNowTimeStr();
    }

    public Reply(int res, String msg) {
        this.res = res;
        this.msg = msg;
        this.time = getNowTimeStr();
    }

    public static String getNowTimeStr() {
        return sdf.format(new Date());
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public Reply(Object data, int res, String msg) {
        this.data = data;
        this.res = res;
        this.msg = msg;
        this.time = getNowTimeStr();
    }
}
