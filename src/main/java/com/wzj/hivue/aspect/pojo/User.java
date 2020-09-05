package com.wzj.hivue.aspect.pojo;

import com.wzj.hivue.aspect.enumeration.SexEnum;

public class User {
    private Long id;
    private String userName;
    private SexEnum sex = null;
    private String note;

    /* setter and getter */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }
}
