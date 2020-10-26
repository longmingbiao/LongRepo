package com.result;

/**
 * 此类作用：作为数据响应对象
 */
public  class Result {

    private Integer id;
    private String message;
    private Object object;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Result(Integer id, String message, Object object) {
        this.id = id;
        this.message = message;
        this.object = object;
    }
}
