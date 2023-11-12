package com.car.dao;
import com.car.model.ProviderApp;
import com.car.model.ProviderAppExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface ProviderAppMapper {
	long countByExample(ProviderAppExample example);
	int deleteByExample(ProviderAppExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(ProviderApp record);
	int insertSelective(ProviderApp record);
	List<ProviderApp> selectByExample(ProviderAppExample example);
	ProviderApp selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") ProviderApp record, @Param("example") ProviderAppExample example);
	int updateByExample(@Param("record") ProviderApp record, @Param("example") ProviderAppExample example);
	int updateByPrimaryKeySelective(ProviderApp record);
	int updateByPrimaryKey(ProviderApp record);
}
