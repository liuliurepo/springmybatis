package com.share.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.Bidi;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BusinessManager implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("business_id")
	private Integer businessId;    
	
	@JsonProperty("business_name")
    private String businessName; //商户名称
	
	@JsonProperty("fk_industry_id")
    private Integer fkIndustryId;   // 商户行业分类id
	
	@JsonProperty("province_id")
    private Integer provinceId;   // 省id
	
	@JsonProperty("province_name")
    private String provinceName; //省名
	
	@JsonProperty("city_id")
    private Integer cityId;   // 城市id
	
	@JsonProperty("city_name")
    private String cityName; //城市名
	
	@JsonProperty("county_id")
    private Integer countyId;   // 县ID
	
	@JsonProperty("county_name")
    private String countyName; //县名
	
	@JsonProperty("detail_address")
    private String detailAddress; //详细地址
	
	@JsonProperty("phone")
    private String phone; //电话
	
	@JsonProperty("account_status")
    private String accountStatus; //商户状态（enable:启动,disable:禁用）
	
	@JsonProperty("longitude")
    private BigDecimal longitude; //经度
	
	@JsonProperty("latitude")
    private BigDecimal latitude; //纬度
	
	@JsonProperty("create_time")
    private Date createTime;
	
	@JsonProperty("active_time")
    private Date activeTime; // 活跃时间

	public BusinessManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Integer businessId) {
		this.businessId = businessId;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public Integer getFkIndustryId() {
		return fkIndustryId;
	}

	public void setFkIndustryId(Integer fkIndustryId) {
		this.fkIndustryId = fkIndustryId;
	}

	public Integer getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Integer getCountyId() {
		return countyId;
	}

	public void setCountyId(Integer countyId) {
		this.countyId = countyId;
	}

	public String getCountyName() {
		return countyName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public String getDetailAddress() {
		return detailAddress;
	}

	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getCreateTime() {
		return createTime;
	}

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	public Date getActiveTime() {
		return activeTime;
	}
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public void setActiveTime(Date activeTime) {
		this.activeTime = activeTime;
	}
	
}
