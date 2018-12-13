package com.menglei.account.api.accountapi.entity;/**
  * @className Debt
  * @Description 债务实体
  * @date 2018/12/13 16:18
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
public class Debt extends BaseEntity{
    private static final long serialVersionUID = 201438507400755070L;

    /**
     * 家庭id
     */
    private Long familyId;

    /**
     * 债务名称
     */
    private String name;

    /**
     * 债务类型(1.应收 2.应付)
     */
    private Byte type;

    /**
     * 状态
     */
    private Byte status;

    public Long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Long familyId) {
        this.familyId = familyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Debt{" +
                "familyId=" + familyId +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", status=" + status +
                "} " + super.toString();
    }
}
