package com.car.dao;
import com.car.model.MpurchasePlan;
import com.car.model.MpurchasePlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface MpurchasePlanMapper {
	long countByExample(MpurchasePlanExample example);
	int deleteByExample(MpurchasePlanExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(MpurchasePlan record);
	int insertSelective(MpurchasePlan record);
	List<MpurchasePlan> selectByExample(MpurchasePlanExample example);
	MpurchasePlan selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") MpurchasePlan record, @Param("example") MpurchasePlanExample example);
	int updateByExample(@Param("record") MpurchasePlan record, @Param("example") MpurchasePlanExample example);
	int updateByPrimaryKeySelective(MpurchasePlan record);
	int updateByPrimaryKey(MpurchasePlan record);
}
