package com.share.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.share.controller.response.CommonRepsonse;
import com.share.entity.BusinessIndustryClassify;
import com.share.entity.BusinessManager;
import com.share.service.BusinessManagerService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/sharemanager")
public class BusinessManagerController {
	@Resource
	private BusinessManagerService businessManagerService; 
	
	
	/**
	 * 获取所有商户管理信息（开发者用）
	 * @return
	 */
	@ApiOperation(value = "获取所有商户管理信息（开发者用）", notes = "获取所有商户管理信息（开发者用）")
	@RequestMapping(value="/allmanager", method = RequestMethod.POST,  produces = 
	        "application/JSON")
	public CommonRepsonse<List<BusinessManager>> getAllBusinessManager() {
		CommonRepsonse<List<BusinessManager>> response = new CommonRepsonse<List<BusinessManager>>();
		try {
			List<BusinessManager> list = businessManagerService.getAllBusinessManager();
			response.successResponse(list);
		} catch (Exception e) {
			response.failResponse(e);
		}
		return response;
	}

	/**
	 * 根据经纬度获取商户信息
	 * 
	 * @param longitude
	 * @param latitude
	 * @return
	 */
	@ApiOperation(value = "根据经纬度获取商户信息", notes = "根据经纬度获取商户信息")
	@RequestMapping(value = "/managerinfo", method = RequestMethod.POST, produces = "application/JSON")
	public CommonRepsonse<List<BusinessManager>> getBusinessManagerByAddress(
			@ApiParam(name = "longitude", value = "经度") @RequestParam("longitude") BigDecimal longitude,
			@ApiParam(name = "latitude", value = "纬度") @RequestParam("latitude") BigDecimal latitude) {
		CommonRepsonse<List<BusinessManager>> response = new CommonRepsonse<List<BusinessManager>>();
		try {
			List<BusinessManager> list = businessManagerService.getBusinessManagerByAddress(longitude, latitude);
			response.successResponse(list);
		} catch (Exception e) {
			response.failResponse(e);
		}
		return response;
	}
}
