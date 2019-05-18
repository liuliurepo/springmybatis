package com.share.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BusinessIndustryClassify implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("industry_id")
	private Integer industryId;    
	
	@JsonProperty("business_type")
    private String businessType; //类型(BUSINESS:商户,PUBLICPLACE:公共场所)
	
	@JsonProperty("industry_type")
    private String industryType;   // 行业分类
	
	@JsonProperty("industry_subtype")
    private String industrySubtype;   // 行业子分类
	
	@JsonProperty("industry_subtype_number")
    private String industrySubtypeNumber; //行业子分类个数
	
	@JsonProperty("create_time")
    private Date createTime;   // 创建时间

	public BusinessIndustryClassify() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIndustryId() {
		return industryId;
	}

	public void setIndustryId(Integer industryId) {
		this.industryId = industryId;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getIndustryType() {
		return industryType;
	}

	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	public String getIndustrySubtype() {
		return industrySubtype;
	}

	public void setIndustrySubtype(String industrySubtype) {
		this.industrySubtype = industrySubtype;
	}

	public String getIndustrySubtypeNumber() {
		return industrySubtypeNumber;
	}

	public void setIndustrySubtypeNumber(String industrySubtypeNumber) {
		this.industrySubtypeNumber = industrySubtypeNumber;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getCreateTime() {
		return createTime;
	}

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
