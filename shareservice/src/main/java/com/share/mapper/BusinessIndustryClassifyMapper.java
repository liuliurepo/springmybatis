package com.share.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.share.entity.BusinessIndustryClassify;
@Mapper
public interface BusinessIndustryClassifyMapper {
	public List<BusinessIndustryClassify> getAllBusinessIndustryClassify();
	
}
