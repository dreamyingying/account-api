package com.menglei.account.api.accountapi.entity;/**
  * @className Resource
  * Description 资源实体
  * @date 2018/12/13 11:46
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
public class Resource extends BaseEntity {
    private static final long serialVersionUID = 6417176599994023557L;

    /**
     * 父ID
     */
    private Long parentId;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 资源级别
     */
    private Byte level;

    /**
     * 类型级别
     */
    private Byte type;

    /**
     * 排序级别
     */
    private Byte sort;

    /**
     * 资源key
     */
    private String resourceKey;

    /**
     * 资源url
     */
    private String resourceUrl;

    /**
     * 状态
     */
    private Byte status;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getSort() {
        return sort;
    }

    public void setSort(Byte sort) {
        this.sort = sort;
    }

    public String getResourceKey() {
        return resourceKey;
    }

    public void setResourceKey(String resourceKey) {
        this.resourceKey = resourceKey;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "parentId=" + parentId +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", type=" + type +
                ", sort=" + sort +
                ", resourceKey='" + resourceKey + '\'' +
                ", resourceUrl='" + resourceUrl + '\'' +
                ", status=" + status +
                "} " + super.toString();
    }
}
