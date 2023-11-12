package com.car.dao;
import com.car.model.SendLog;
import com.car.model.SendLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface SendLogMapper {
	long countByExample(SendLogExample example);
	int deleteByExample(SendLogExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(SendLog record);
	int insertSelective(SendLog record);
	List<SendLog> selectByExample(SendLogExample example);
	SendLog selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") SendLog record, @Param("example") SendLogExample example);
	int updateByExample(@Param("record") SendLog record, @Param("example") SendLogExample example);
	int updateByPrimaryKeySelective(SendLog record);
	int updateByPrimaryKey(SendLog record);
}
