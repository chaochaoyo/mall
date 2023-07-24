package org.chao.mall.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.chao.mall.model.UmsMember;
import org.chao.mall.model.UmsMemberExample;

public interface UmsMemberMapper {
    long countByExample(UmsMemberExample example);

    int deleteByExample(UmsMemberExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMember row);

    int insertSelective(UmsMember row);

    List<UmsMember> selectByExample(UmsMemberExample example);

    UmsMember selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsMember row, @Param("example") UmsMemberExample example);

    int updateByExample(@Param("row") UmsMember row, @Param("example") UmsMemberExample example);

    int updateByPrimaryKeySelective(UmsMember row);

    int updateByPrimaryKey(UmsMember row);
}