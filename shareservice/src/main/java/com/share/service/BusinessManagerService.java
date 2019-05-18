package com.share.service;

import java.math.BigDecimal;
import java.util.List;

import com.share.entity.BusinessManager;

public interface BusinessManagerService {
	/**
	 * 获取所有商户管理信息
	 * @return
	 */
	public List<BusinessManager> getAllBusinessManager();
	
	/**
	 * 根据经纬度获取商户管理信息
	 * @param longitude
	 * @param latitude
	 * @return
	 */
	public List<BusinessManager> getBusinessManagerByAddress(BigDecimal longitude, BigDecimal latitude);
}
