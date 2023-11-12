package com.car.dao;
import com.car.model.Minlog;
import com.car.model.MinlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface MinlogMapper {
	long countByExample(MinlogExample example);
	int deleteByExample(MinlogExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(Minlog record);
	int insertSelective(Minlog record);
	List<Minlog> selectByExample(MinlogExample example);
	Minlog selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") Minlog record, @Param("example") MinlogExample example);
	int updateByExample(@Param("record") Minlog record, @Param("example") MinlogExample example);
	int updateByPrimaryKeySelective(Minlog record);
	int updateByPrimaryKey(Minlog record);
}
