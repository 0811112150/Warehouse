package com.nyb.warehouse.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import  java.util.*;

/**
 * Created by aa on 2016/12/7.
 */
@Entity
@Table(name = "user", schema = "warehouse", catalog = "")
public class UserEntity {
    private String id;
    private String loginName;
    private String name;
    private String email;
    private String address;
    private String mobile;
    private String telephone;
    private String roleId;
    private Byte isValid;
    private Timestamp createDateTime;
    private Timestamp lastLoginTime;

    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "LoginName")
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "Mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "Telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "RoleID")
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "IsValid")
    public Byte getIsValid() {
        return isValid;
    }

    public void setIsValid(Byte isValid) {
        this.isValid = isValid;
    }

    @Basic
    @Column(name = "CreateDateTime")
    public Timestamp getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Timestamp createDateTime) {
        this.createDateTime = createDateTime;
    }

    @Basic
    @Column(name = "LastLoginTime")
    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (loginName != null ? !loginName.equals(that.loginName) : that.loginName != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (telephone != null ? !telephone.equals(that.telephone) : that.telephone != null) return false;
        if (roleId != null ? !roleId.equals(that.roleId) : that.roleId != null) return false;
        if (isValid != null ? !isValid.equals(that.isValid) : that.isValid != null) return false;
        if (createDateTime != null ? !createDateTime.equals(that.createDateTime) : that.createDateTime != null)
            return false;
        if (lastLoginTime != null ? !lastLoginTime.equals(that.lastLoginTime) : that.lastLoginTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (loginName != null ? loginName.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (roleId != null ? roleId.hashCode() : 0);
        result = 31 * result + (isValid != null ? isValid.hashCode() : 0);
        result = 31 * result + (createDateTime != null ? createDateTime.hashCode() : 0);
        result = 31 * result + (lastLoginTime != null ? lastLoginTime.hashCode() : 0);
        return result;
    }
}
