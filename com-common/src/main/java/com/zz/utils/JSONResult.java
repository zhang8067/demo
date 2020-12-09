package com.zz.utils;

/**
 * 				200：表示成功
 * 				500：表示错误，错误信息在msg字段中
 * 				501：bean验证错误，不管多少个错误都以map形式返回
 * 				502：拦截器拦截到用户token出错
 * 				555：异常抛出信息
 */
public class JSONResult {

    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    private String ok;	// 不使用

    public static com.zz.utils.JSONResult build(Integer status, String msg, Object data) {
        return new com.zz.utils.JSONResult(status, msg, data);
    }

    public static com.zz.utils.JSONResult ok(Object data) {
        return new com.zz.utils.JSONResult(data);
    }

    public static com.zz.utils.JSONResult ok() {
        return new com.zz.utils.JSONResult(null);
    }

    public static com.zz.utils.JSONResult errorMsg(String msg) {
        return new com.zz.utils.JSONResult(500, msg, null);
    }

    public static com.zz.utils.JSONResult errorMap(Object data) {
        return new com.zz.utils.JSONResult(501, "error", data);
    }

    public static com.zz.utils.JSONResult errorTokenMsg(String msg) {
        return new com.zz.utils.JSONResult(502, msg, null);
    }

    public static com.zz.utils.JSONResult errorException(String msg) {
        return new com.zz.utils.JSONResult(555, msg, null);
    }

    public JSONResult() {

    }

    public JSONResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public JSONResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Boolean isOK() {
        return this.status == 200;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }

}

