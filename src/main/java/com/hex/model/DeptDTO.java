package com.hex.model;

import java.io.Serializable;

public class DeptDTO implements Serializable {
    private Long deptNo;

    private String deptName;

    private String dbSource;

    private static final long serialVersionUID = 1L;

    public Long getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Long deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource == null ? null : dbSource.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DeptDTO other = (DeptDTO) that;
        return (this.getDeptNo() == null ? other.getDeptNo() == null : this.getDeptNo().equals(other.getDeptNo()))
            && (this.getDeptName() == null ? other.getDeptName() == null : this.getDeptName().equals(other.getDeptName()))
            && (this.getDbSource() == null ? other.getDbSource() == null : this.getDbSource().equals(other.getDbSource()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDeptNo() == null) ? 0 : getDeptNo().hashCode());
        result = prime * result + ((getDeptName() == null) ? 0 : getDeptName().hashCode());
        result = prime * result + ((getDbSource() == null) ? 0 : getDbSource().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deptNo=").append(deptNo);
        sb.append(", deptName=").append(deptName);
        sb.append(", dbSource=").append(dbSource);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}