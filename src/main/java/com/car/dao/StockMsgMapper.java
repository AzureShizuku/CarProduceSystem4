package com.car.dao;
import com.car.model.StockMsg;
import com.car.model.StockMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface StockMsgMapper {
	long countByExample(StockMsgExample example);
	int deleteByExample(StockMsgExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(StockMsg record);
	int insertSelective(StockMsg record);
	List<StockMsg> selectByExample(StockMsgExample example);
	StockMsg selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") StockMsg record, @Param("example") StockMsgExample example);
	int updateByExample(@Param("record") StockMsg record, @Param("example") StockMsgExample example);
	int updateByPrimaryKeySelective(StockMsg record);
	int updateByPrimaryKey(StockMsg record);
}
