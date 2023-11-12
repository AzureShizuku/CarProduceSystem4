package com.car.dao;
import com.car.model.ProRequest;
import com.car.model.ProRequestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface ProRequestMapper {
	long countByExample(ProRequestExample example);
	int deleteByExample(ProRequestExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(ProRequest record);
	int insertSelective(ProRequest record);
	List<ProRequest> selectByExample(ProRequestExample example);
	ProRequest selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") ProRequest record, @Param("example") ProRequestExample example);
	int updateByExample(@Param("record") ProRequest record, @Param("example") ProRequestExample example);
	int updateByPrimaryKeySelective(ProRequest record);
	int updateByPrimaryKey(ProRequest record);
}
