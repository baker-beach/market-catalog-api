package com.bakerbeach.market.catalog.model;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import com.bakerbeach.market.core.api.model.Assets;

public class GroupTag {
	private String code;
	private String brand;
	private Map<Locale, String> name = new HashMap<Locale, String>(5);
	private Map<Locale, String> description1 = new HashMap<Locale, String>(5);
	private Map<Locale, String> description2 = new HashMap<Locale, String>(5);
	private Assets assets = null;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Map<Locale, String> getName() {
		return name;
	}
	public void setName(Map<Locale, String> name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Map<Locale, String> getDescription1() {
		return description1;
	}
	
	public void setDescription1(Map<Locale, String> description1) {
		this.description1 = description1;
	}
	
	public Map<Locale, String> getDescription2() {
		return description2;
	}
	public void setDescription2(Map<Locale, String> description2) {
		this.description2 = description2;
	}
	
	public Assets getAssets() {
		return assets;
	}
	
	public void setAssets(Assets assets) {
		this.assets = assets;
	}

//	public Map<String, List<Map<String, String>>> getImages() {
//		return images;
//	}
//
//	public void setImages(Map<String, List<Map<String, String>>> images) {
//		this.images = images;
//	}

}
