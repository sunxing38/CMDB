package com.cmdb.cmdb.entity;

public class CmdbUser {
    private Integer id;

    private String username;

    private String password;

    private String name;

    private Integer role_Id;

    private Integer creator_Id;

    private String e_Mail;

    private Long phone;

    private Integer flag;

    private Integer receive_Messages;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getRoleId() {
        return role_Id;
    }

    public void setRoleId(Integer roleId) {
        this.role_Id = roleId;
    }

    public Integer getCreatorId() {
        return creator_Id;
    }

    public void setCreatorId(Integer creatorId) {
        this.creator_Id = creatorId;
    }

    public String geteMail() {
        return e_Mail;
    }

    public void seteMail(String eMail) {
        this.e_Mail = eMail == null ? null : eMail.trim();
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getReceiveMessages() {
        return receive_Messages;
    }

    public void setReceiveMessages(Integer receiveMessages) {
        this.receive_Messages = receiveMessages;
    }
}