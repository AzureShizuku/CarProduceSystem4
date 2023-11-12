package com.car.dao;
import com.car.model.PurchaseLog;
import com.car.model.PurchaseLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface PurchaseLogMapper {
	long countByExample(PurchaseLogExample example);
	int deleteByExample(PurchaseLogExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(PurchaseLog record);
	int insertSelective(PurchaseLog record);
	List<PurchaseLog> selectByExample(PurchaseLogExample example);
	PurchaseLog selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") PurchaseLog record, @Param("example") PurchaseLogExample example);
	int updateByExample(@Param("record") PurchaseLog record, @Param("example") PurchaseLogExample example);
	int updateByPrimaryKeySelective(PurchaseLog record);
	int updateByPrimaryKey(PurchaseLog record);
}
