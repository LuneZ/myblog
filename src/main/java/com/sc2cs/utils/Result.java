package com.sc2cs.utils;

import java.io.Serializable;

/**
 * 前后端数据交互标准
 */
public class Result<T> implements Serializable {

    private final static int ERROR = 0;
    private final static int SUCCESS = 1;

    //返回状态码，HTTP Status Code
    private int status;


    //错误信息
    private String message;


    //数据
    private T data;


    /*-----------------------构造器--------------*/
    public Result(){
    }

    public Result(T data){
        this.status = SUCCESS;
        this.data = data;
    }
    public Result(String message){//给定错误信息，状态码默认
        this.status = ERROR;
        this.message = message;
    }
    public Result(Throwable e){//捕获到异常
        this.status = ERROR;
        this.message = e.getMessage();

    }
    public Result(int status,  Throwable e) {//给定状态码就用给定的
        this.status = status;
        this.message = e.getMessage();
    }
    /*-------------------set和get--------------------*/
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result[" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +",time="+
                ']';
    }
}
