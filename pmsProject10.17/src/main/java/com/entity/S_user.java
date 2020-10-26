package com.entity;

import java.io.Serializable;

/**
 * 系统用户实体类
 */
public class S_user implements Serializable {
    private static final long serialVersionUID = 1L;
    private int s_id;//主键
    private String s_userName;//用户名
    private String s_password;//用户密码
    private String s_email;//邮箱
    private Long s_phone;//电话
    private int s_grade;//等级

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_userName() {
        return s_userName;
    }

    public void setS_userName(String s_userName) {
        this.s_userName = s_userName;
    }

    public String getS_password() {
        return s_password;
    }

    public void setS_password(String s_password) {
        this.s_password = s_password;
    }

    public String getS_email() {
        return s_email;
    }

    public void setS_email(String s_email) {
        this.s_email = s_email;
    }

    public Long getS_phone() {
        return s_phone;
    }

    public void setS_phone(Long s_phone) {
        this.s_phone = s_phone;
    }

    public int getS_grade() {
        return s_grade;
    }

    public void setS_grade(int s_grade) {
        this.s_grade = s_grade;
    }

    @Override
    public String toString() {
        return "S_user{" +
                "s_id=" + s_id +
                ", s_userName='" + s_userName + '\'' +
                ", s_password='" + s_password + '\'' +
                ", s_email='" + s_email + '\'' +
                ", s_phone=" + s_phone +
                ", s_grade=" + s_grade +
                '}';
    }
}
