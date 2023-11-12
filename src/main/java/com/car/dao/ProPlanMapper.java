package com.car.dao;
import com.car.model.ProPlan;
import com.car.model.ProPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface ProPlanMapper {
	long countByExample(ProPlanExample example);
	int deleteByExample(ProPlanExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(ProPlan record);
	int insertSelective(ProPlan record);
	List<ProPlan> selectByExample(ProPlanExample example);
	ProPlan selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") ProPlan record, @Param("example") ProPlanExample example);
	int updateByExample(@Param("record") ProPlan record, @Param("example") ProPlanExample example);
	int updateByPrimaryKeySelective(ProPlan record);
	int updateByPrimaryKey(ProPlan record);
}
