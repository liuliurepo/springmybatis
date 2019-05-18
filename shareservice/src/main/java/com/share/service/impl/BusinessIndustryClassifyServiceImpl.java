package com.share.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.share.entity.BusinessIndustryClassify;
import com.share.mapper.BusinessIndustryClassifyMapper;
import com.share.service.BusinessIndustryClassifyService;

@Service
public class BusinessIndustryClassifyServiceImpl implements BusinessIndustryClassifyService {
	
	@Resource
	private BusinessIndustryClassifyMapper businessIndustryClassifyMapper;
	
	@Override
	public List<BusinessIndustryClassify> getAllBusinessIndustryClassify() {
		List<BusinessIndustryClassify> businessIndustryClassifyList = businessIndustryClassifyMapper.getAllBusinessIndustryClassify();
		if (businessIndustryClassifyList == null) {
			businessIndustryClassifyList = new ArrayList<BusinessIndustryClassify>();
		}
		return businessIndustryClassifyList;
	}

}
