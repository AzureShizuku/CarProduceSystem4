package com.car.dao;
import com.car.model.Provider;
import com.car.model.ProviderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface ProviderMapper {
	long countByExample(ProviderExample example);
	int deleteByExample(ProviderExample example);
	int deleteByPrimaryKey(Integer id);
	int insert(Provider record);
	int insertSelective(Provider record);
	List<Provider> selectByExample(ProviderExample example);
	Provider selectByPrimaryKey(Integer id);
	int updateByExampleSelective(@Param("record") Provider record, @Param("example") ProviderExample example);
	int updateByExample(@Param("record") Provider record, @Param("example") ProviderExample example);
	int updateByPrimaryKeySelective(Provider record);
	int updateByPrimaryKey(Provider record);
}
