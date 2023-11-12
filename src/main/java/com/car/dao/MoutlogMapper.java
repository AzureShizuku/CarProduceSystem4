package com.car.dao;
import com.car.model.Moutlog;
import com.car.model.MoutlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface MoutlogMapper {
	long countByExample(MoutlogExample example);
	int deleteByExample(MoutlogExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(Moutlog record);
	int insertSelective(Moutlog record);
	List<Moutlog> selectByExample(MoutlogExample example);
	Moutlog selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") Moutlog record, @Param("example") MoutlogExample example);
	int updateByExample(@Param("record") Moutlog record, @Param("example") MoutlogExample example);
	int updateByPrimaryKeySelective(Moutlog record);
	int updateByPrimaryKey(Moutlog record);
}
