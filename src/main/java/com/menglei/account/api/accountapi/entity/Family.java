package com.menglei.account.api.accountapi.entity;

import java.math.BigDecimal;

/**
  * @className Family
  * @Description 家庭实体
  * @date 2018/12/13 12:19
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
public class Family extends BaseEntity {
    private static final long serialVersionUID = -4312999143778346354L;

    /**
     * 家庭名称
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 家长ID
     */
    private Long userId;

    /**
     * 家庭存款汇总
     */
    private BigDecimal deposit;

    /**
     * 应收汇总
     */
    private BigDecimal receivable;

    /**
     * 应付汇总
     */
    private BigDecimal payable;

    /**
     * 家庭地址
     */
    private String address;

    /**
     * 状态
     */
    private Byte status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public BigDecimal getReceivable() {
        return receivable;
    }

    public void setReceivable(BigDecimal receivable) {
        this.receivable = receivable;
    }

    public BigDecimal getPayable() {
        return payable;
    }

    public void setPayable(BigDecimal payable) {
        this.payable = payable;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", userId=" + userId +
                ", deposit=" + deposit +
                ", receivable=" + receivable +
                ", payable=" + payable +
                ", address='" + address + '\'' +
                ", status=" + status +
                "} " + super.toString();
    }
}
