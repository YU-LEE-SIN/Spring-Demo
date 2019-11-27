package com.entity;


import lombok.Data;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

@Data
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
}
