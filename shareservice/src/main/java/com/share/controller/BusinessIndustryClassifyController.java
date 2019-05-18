package com.share.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.jboss.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.share.controller.response.CommonRepsonse;
import com.share.entity.BusinessIndustryClassify;
import com.share.service.BusinessIndustryClassifyService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/sharebusiness")
public class BusinessIndustryClassifyController {
	
	private static Logger logger = Logger.getLogger(BusinessIndustryClassifyController.class);

	@Resource
	private BusinessIndustryClassifyService businessIndustryClassifyService;
	
	/**
	 * 获取所有商户行业分类信息（开发者用）
	 * @return
	 * @throws Exception 
	 */
	@ApiOperation(value = "获取所有商户行业分类信息（开发者用）", notes = "获取所有商户行业分类信息（开发者用）")
	@RequestMapping(value="/allbusiness", method = RequestMethod.POST,  produces = 
	"application/JSON")
	public CommonRepsonse<List<BusinessIndustryClassify>> getAllBusinessIndustryClassify() {
		CommonRepsonse<List<BusinessIndustryClassify>> response = new CommonRepsonse<List<BusinessIndustryClassify>>();
		logger.info("获取所有商户行业分类信息（开发者用）");
		try {
			List<BusinessIndustryClassify> list = businessIndustryClassifyService.getAllBusinessIndustryClassify();
			response.setState("ok");
			response.setResult(list);
		} catch (Exception e) {
			response.setState("fail");
			response.setReason("getAllBusinessIndustryClassify fail, reason is: " + e);
		}
		return response;
	}

}
