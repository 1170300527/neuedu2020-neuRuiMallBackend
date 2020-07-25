package com.hit.neuruimall.model;

import java.io.Serializable;

public class AdminUserModel implements Serializable {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminUserModel adminUserModel = (AdminUserModel) o;

        if (getUsername() != null ? !getUsername().equals(adminUserModel.getUsername()) : adminUserModel.getUsername() != null) return false;
        return getPassword() != null ? getPassword().equals(adminUserModel.getPassword()) : adminUserModel.getPassword() == null;
    }

    @Override
    public int hashCode() {
        int result = getUsername() != null ? getUsername().hashCode() : 0;
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AdminUserModel{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
