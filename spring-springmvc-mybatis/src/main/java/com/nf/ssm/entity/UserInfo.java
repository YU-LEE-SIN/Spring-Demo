package com.nf.ssm.entity;


import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

public class UserInfo {
    private Integer id;
    @NotEmpty
    @Size(min = 1,max = 10)
    private String username;
    private Integer gender;
    @Min(0)
    private BigDecimal salary;
    private Integer deptid;
    @FutureOrPresent
    private Date datetime;

    public UserInfo() {
    }

    public UserInfo(String username, Integer gender, BigDecimal salary, Integer deptid, Date datetime) {
        this.username = username;
        this.gender = gender;
        this.salary = salary;
        this.deptid = deptid;
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", deptid=" + deptid +
                ", datetime=" + datetime +
                '}';
    }

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
        this.username = username;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

}
