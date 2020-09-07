package com.gome.util;

/**
 * @Description: 自定义返回json
 * @Author: WangJinYue
 * @Date: 2020/8/3 19:59
 * @Modified By:
 */
public class ResultUtil {
    private Integer status;
    private String msg;
    private Object data;

    public static ResultUtil ok(Object data) {
        return new ResultUtil(data);
    }

    public static ResultUtil ok() {
        return new ResultUtil(null);
    }

    public static ResultUtil build(Integer status, String msg) {
        return new ResultUtil(status, msg, null);
    }

    public static ResultUtil build(Integer status, String msg, Object data) {
        return new ResultUtil(status, msg, data);
    }

    public ResultUtil() {
    }

    public ResultUtil(Object data) {
        this.status = 200;
        this.msg = "成功";
        this.data = data;
    }

    public ResultUtil(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
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
}
