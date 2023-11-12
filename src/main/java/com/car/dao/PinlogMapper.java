package com.car.dao;
import com.car.model.Pinlog;
import com.car.model.PinlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface PinlogMapper {
	long countByExample(PinlogExample example);
	int deleteByExample(PinlogExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(Pinlog record);
	int insertSelective(Pinlog record);
	List<Pinlog> selectByExample(PinlogExample example);
	Pinlog selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") Pinlog record, @Param("example") PinlogExample example);
	int updateByExample(@Param("record") Pinlog record, @Param("example") PinlogExample example);
	int updateByPrimaryKeySelective(Pinlog record);
	int updateByPrimaryKey(Pinlog record);
}
