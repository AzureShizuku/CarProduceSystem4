package com.car.dao;
import com.car.model.MneedMsg;
import com.car.model.MneedMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface MneedMsgMapper {
	long countByExample(MneedMsgExample example);
	int deleteByExample(MneedMsgExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(MneedMsg record);
	int insertSelective(MneedMsg record);
	List<MneedMsg> selectByExample(MneedMsgExample example);
	MneedMsg selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") MneedMsg record, @Param("example") MneedMsgExample example);
	int updateByExample(@Param("record") MneedMsg record, @Param("example") MneedMsgExample example);
	int updateByPrimaryKeySelective(MneedMsg record);
	int updateByPrimaryKey(MneedMsg record);
}
