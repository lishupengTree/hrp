package com.lsp.his.exception;

/**
 * @author lishupeng
 * @Description
 * @Date 2017/10/24 13:32
 */
public interface IHugException {
    /**
     * 获取错误编码
     * @return
     */
    int getErrorCode();

    /**
     * 获取消息
     * @return
     */
    String getMsg();

    /**
     * 获取 源Throwable
     * @return
     */
    Throwable getCaluse();
}
