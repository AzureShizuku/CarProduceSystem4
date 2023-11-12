package com.car.dao;
import com.car.model.Poutlog;
import com.car.model.PoutlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface PoutlogMapper {
	long countByExample(PoutlogExample example);
	int deleteByExample(PoutlogExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(Poutlog record);
	int insertSelective(Poutlog record);
	List<Poutlog> selectByExample(PoutlogExample example);
	Poutlog selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") Poutlog record, @Param("example") PoutlogExample example);
	int updateByExample(@Param("record") Poutlog record, @Param("example") PoutlogExample example);
	int updateByPrimaryKeySelective(Poutlog record);
	int updateByPrimaryKey(Poutlog record);
}
