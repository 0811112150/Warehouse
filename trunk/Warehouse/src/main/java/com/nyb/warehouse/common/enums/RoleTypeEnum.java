package com.nyb.warehouse.common.enums;

/**
 * Created by aa on 2016/12/8.
 */
public enum RoleTypeEnum {
    Adminstrator(1, "管理员"),
    Worker(2, "工作人员");

    private int code;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    private RoleTypeEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
