package com.car.dao;
import com.car.model.SaleLog;
import com.car.model.SaleLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface SaleLogMapper {
	long countByExample(SaleLogExample example);
	int deleteByExample(SaleLogExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(SaleLog record);
	int insertSelective(SaleLog record);
	List<SaleLog> selectByExample(SaleLogExample example);
	SaleLog selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") SaleLog record, @Param("example") SaleLogExample example);
	int updateByExample(@Param("record") SaleLog record, @Param("example") SaleLogExample example);
	int updateByPrimaryKeySelective(SaleLog record);
	int updateByPrimaryKey(SaleLog record);
}
