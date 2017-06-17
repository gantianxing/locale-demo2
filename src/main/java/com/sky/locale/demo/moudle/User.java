package com.sky.locale.demo.moudle;

import com.sky.locale.demo.formatter.ann.MyDateFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by gantianxing on 2017/6/8.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull(message="{user.name.null}")
    @Size(min=2,max =5,message = "{user.name.error}")
    private String name;//姓名

    @NotNull(message="{user.birthday.null}")
    @Past(message="{user.birthday.error}")
    @MyDateFormat
    private Date birthday;//生日

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date regDate;//注册时间

    @NotNull(message="{user.money.null}")
    @Digits(integer=3,fraction=2,message="{user.money.error}")
    @NumberFormat(pattern = "￥#.##")
    private BigDecimal money;//资产

    @NotNull(message="{user.phoneNum.null}")
    @Pattern(regexp="\\d{11}",message="{user.phoneNum.error}")
    private String phoneNum;//手机号

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
}
