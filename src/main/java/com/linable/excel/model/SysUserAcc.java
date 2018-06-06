package com.linable.excel.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.util.Date;

/**
 * sys_user_acc
 *
 * @author hangyang.lin 2018-06-01
 */
public class SysUserAcc extends BaseRowModel {

    /**
     * 主键序号
     */
    private Long id;

    /**
     * 嘉宾ID
     */
    @ExcelProperty(index = 0)
    private Long accId;

    /**
     * 嘉宾名称
     */
    @ExcelProperty(index = 1)
    private String accName;

    /**
     * 手机
     */
    @ExcelProperty(index = 2)
    private String mobile;

    /**
     * 用户ID
     */
    private Long lynkcoUserId;

    /**
     * 系统保留字段，记录数据创建用户，用于审计，无业务含义，如果是单据，可以作为制单人使用
     */
    private Long createdBy;

    /**
     * 系统保留字段，记录数据创建时间，用于系统审计，无实际业务含义
     */
    private Date createdTime;

    /**
     * 系统保留字段，记录数据最后更新用户，用于审计，无业务含义
     */
    private Long updatedBy;

    /**
     * 系统保留字段，记录数据最后时间，用于审计，无业务含义
     */
    private Date updatedTime;

    /**
     * 系统保留字段，表示当前数据版本，用于控制业务并发，无其它业务含义
     */
    private Integer ver;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccId() {
        return accId;
    }

    public void setAccId(Long accId) {
        this.accId = accId;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName == null ? null : accName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Long getLynkcoUserId() {
        return lynkcoUserId;
    }

    public void setLynkcoUserId(Long lynkcoUserId) {
        this.lynkcoUserId = lynkcoUserId;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Integer getVer() {
        return ver;
    }

    public void setVer(Integer ver) {
        this.ver = ver;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", accId=").append(accId);
        sb.append(", accName=").append(accName);
        sb.append(", mobile=").append(mobile);
        sb.append(", lynkcoUserId=").append(lynkcoUserId);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", ver=").append(ver);
        sb.append("]");
        return sb.toString();
    }
}