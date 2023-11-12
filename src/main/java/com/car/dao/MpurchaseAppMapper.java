package com.car.dao;
import com.car.model.MpurchaseApp;
import com.car.model.MpurchaseAppExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface MpurchaseAppMapper {
	long countByExample(MpurchaseAppExample example);
	int deleteByExample(MpurchaseAppExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(MpurchaseApp record);
	int insertSelective(MpurchaseApp record);
	List<MpurchaseApp> selectByExample(MpurchaseAppExample example);
	MpurchaseApp selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") MpurchaseApp record, @Param("example") MpurchaseAppExample example);
	int updateByExample(@Param("record") MpurchaseApp record, @Param("example") MpurchaseAppExample example);
	int updateByPrimaryKeySelective(MpurchaseApp record);
	int updateByPrimaryKey(MpurchaseApp record);
}
