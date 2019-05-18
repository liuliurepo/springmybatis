package com.share.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.share.entity.BusinessManager;
import com.share.mapper.BusinessManagerMapper;
import com.share.service.BusinessManagerService;

@Service
public class BusinessManagerServiceImpl implements BusinessManagerService {

	@Resource
	private BusinessManagerMapper businessManagerMapper;

	@Override
	public List<BusinessManager> getAllBusinessManager() {
		List<BusinessManager> businessManagerList = businessManagerMapper.getAllBusinessManager();
		if (businessManagerList == null) {
			businessManagerList = new ArrayList<BusinessManager>();
		}
		return businessManagerList;
	}

	@Override
	public List<BusinessManager> getBusinessManagerByAddress(BigDecimal longitude, BigDecimal latitude) {
		List<BusinessManager> businessManagerList = businessManagerMapper.getBusinessManagerByAddress(longitude,
				latitude);
		if (businessManagerList == null) {
			businessManagerList = new ArrayList<BusinessManager>();
		}
		return businessManagerList;
	}

}
