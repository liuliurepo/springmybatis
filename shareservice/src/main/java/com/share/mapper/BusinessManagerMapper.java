package com.share.mapper;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.share.entity.BusinessIndustryClassify;
import com.share.entity.BusinessManager;

@Mapper
public interface BusinessManagerMapper {
	public List<BusinessManager> getAllBusinessManager();

	public List<BusinessManager> getBusinessManagerByAddress(@Param(value = "longitude") BigDecimal longitude,
			@Param(value = "latitude") BigDecimal latitude);
}
