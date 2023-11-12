package com.car.dao;
import com.car.model.ProLog;
import com.car.model.ProLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface ProLogMapper {
	long countByExample(ProLogExample example);
	int deleteByExample(ProLogExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(ProLog record);
	int insertSelective(ProLog record);
	List<ProLog> selectByExample(ProLogExample example);
	ProLog selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") ProLog record, @Param("example") ProLogExample example);
	int updateByExample(@Param("record") ProLog record, @Param("example") ProLogExample example);
	int updateByPrimaryKeySelective(ProLog record);
	int updateByPrimaryKey(ProLog record);
}
