package com.car.dao;
import com.car.model.SalePlan;
import com.car.model.SalePlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface SalePlanMapper {
	long countByExample(SalePlanExample example);
	int deleteByExample(SalePlanExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(SalePlan record);
	int insertSelective(SalePlan record);
	List<SalePlan> selectByExample(SalePlanExample example);
	SalePlan selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") SalePlan record, @Param("example") SalePlanExample example);
	int updateByExample(@Param("record") SalePlan record, @Param("example") SalePlanExample example);
	int updateByPrimaryKeySelective(SalePlan record);
	int updateByPrimaryKey(SalePlan record);
}
