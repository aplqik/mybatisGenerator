package com.hex.mapper;

import com.hex.model.Dept;

public interface DeptMapper {
    int deleteByPrimaryKey(Long deptNo);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Long deptNo);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}