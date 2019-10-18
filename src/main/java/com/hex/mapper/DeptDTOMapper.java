package com.hex.mapper;

import com.hex.model.DeptDTO;
import com.hex.model.DeptDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptDTOMapper {
    int countByExample(DeptDTOExample example);

    int deleteByExample(DeptDTOExample example);

    int deleteByPrimaryKey(Long deptNo);

    int insert(DeptDTO record);

    int insertSelective(DeptDTO record);

    List<DeptDTO> selectByExample(DeptDTOExample example);

    DeptDTO selectByPrimaryKey(Long deptNo);

    int updateByExampleSelective(@Param("record") DeptDTO record, @Param("example") DeptDTOExample example);

    int updateByExample(@Param("record") DeptDTO record, @Param("example") DeptDTOExample example);

    int updateByPrimaryKeySelective(DeptDTO record);

    int updateByPrimaryKey(DeptDTO record);
}