package com.menglei.account.api.accountapi.entity;

import java.math.BigDecimal;

/**
  * @className Bill
  * Description 账单实体
  * @date 2018/12/13 16:14
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
public class Bill extends BaseEntity{
    private static final long serialVersionUID = -1411597190150544714L;

    /**
     * 账单名称
     */
    private String name;

    /**
     * 家庭Id
     */
    private Long familyId;

    /**
     * 账单类型（1.消费 2.存入 3.还债 4.收账 5.外借 6.借入）
     */
    private Byte type;

    /**
     * 额度
     */
    private BigDecimal quota;

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

    public Long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Long familyId) {
        this.familyId = familyId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public BigDecimal getQuota() {
        return quota;
    }

    public void setQuota(BigDecimal quota) {
        this.quota = quota;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "name='" + name + '\'' +
                ", familyId=" + familyId +
                ", type=" + type +
                ", quota=" + quota +
                ", status=" + status +
                "} " + super.toString();
    }
}
