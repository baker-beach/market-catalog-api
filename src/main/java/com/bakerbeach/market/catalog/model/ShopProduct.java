package com.bakerbeach.market.catalog.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bakerbeach.market.core.api.model.Status;
import com.bakerbeach.market.core.api.model.TaxCode;

public class ShopProduct {
	private String gtin;
	private Status status;
	private String brand;
	private String name;
	private String description1;
	private String description2;
	private String primaryGroup;
	private String secondaryGroup;
	private String mainCategory;
	private List<String> categories = new ArrayList<String>();
	private Boolean visibility;
	private TaxCode taxCode = TaxCode.NORMAL;
	private BigDecimal stdPrice;
	private BigDecimal price;
	private String materialText;
	private String materialCode;
	private String technologyText;
	private String technologyCode;
	private String careText;
	private List<String> careCodes = new ArrayList<String>();
	private String size;
	private String color;
	private BigDecimal netWeight;
	private BigDecimal grossWeight;
	private Map<String, List<String>> logos = new HashMap<String, List<String>>();
	private Map<String, List<String>> tags = new HashMap<String, List<String>>();
	private ShopAssets assets = new ShopAssets();
	private String additionalText1;
	private String additionalText2;
	private Boolean available = false;

	@Deprecated
	private String ulr;

	public String getGtin() {
		return gtin;
	}

	public void setGtin(String gtin) {
		this.gtin = gtin;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription1() {
		return description1;
	}

	public void setDescription1(String description1) {
		this.description1 = description1;
	}

	public String getDescription2() {
		return description2;
	}

	public void setDescription2(String description2) {
		this.description2 = description2;
	}

	public String getPrimaryGroup() {
		return primaryGroup;
	}

	public void setPrimaryGroup(String primaryGroup) {
		this.primaryGroup = primaryGroup;
	}

	public String getSecondaryGroup() {
		return secondaryGroup;
	}

	public void setSecondaryGroup(String secondaryGroup) {
		this.secondaryGroup = secondaryGroup;
	}

	public String getMainCategory() {
		return mainCategory;
	}

	public void setMainCategory(String mainCategory) {
		this.mainCategory = mainCategory;
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public Boolean getVisibility() {
		return visibility;
	}

	public void setVisibility(Boolean visibility) {
		this.visibility = visibility;
	}

	public TaxCode getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(TaxCode taxCode) {
		this.taxCode = taxCode;
	}

	public ShopAssets getAssets() {
		return assets;
	}

	public void setAssets(ShopAssets assets) {
		this.assets = assets;
	}

	public BigDecimal getStdPrice() {
		return stdPrice;
	}

	public void setStdPrice(BigDecimal stdPrice) {
		this.stdPrice = stdPrice;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getMaterialText() {
		return materialText;
	}

	public void setMaterialText(String materialText) {
		this.materialText = materialText;
	}

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public String getTechnologyText() {
		return technologyText;
	}

	public void setTechnologyText(String technologyText) {
		this.technologyText = technologyText;
	}

	public String getTechnologyCode() {
		return technologyCode;
	}

	public void setTechnologyCode(String technologyCode) {
		this.technologyCode = technologyCode;
	}

	public String getCareText() {
		return careText;
	}

	public void setCareText(String careText) {
		this.careText = careText;
	}

	public List<String> getCareCodes() {
		return careCodes;
	}

	public void setCareCodes(List<String> careCodes) {
		this.careCodes = careCodes;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public BigDecimal getNetWeight() {
		return netWeight;
	}

	public void setNetWeight(BigDecimal netWeight) {
		this.netWeight = netWeight;
	}

	public BigDecimal getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(BigDecimal grossWeight) {
		this.grossWeight = grossWeight;
	}

	public Map<String, List<String>> getLogos() {
		return logos;
	}

	public void setLogos(Map<String, List<String>> logos) {
		this.logos = logos;
	}

	public Map<String, List<String>> getTags() {
		return tags;
	}

	public void setTags(Map<String, List<String>> tags) {
		this.tags = tags;
	}

	public BigDecimal getDiscountOnStandardPrice() {
		if (stdPrice != null) {
			return stdPrice.subtract(price);
		}

		return BigDecimal.ZERO;
	}

	public String getUlr() {
		return ulr;
	}

	public void setUlr(String ulr) {
		this.ulr = ulr;
	}

	public String getAdditionalText1() {
		return additionalText1;
	}

	public void setAdditionalText1(String additionalText1) {
		this.additionalText1 = additionalText1;
	}

	public String getAdditionalText2() {
		return additionalText2;
	}

	public void setAdditionalText2(String additionalText2) {
		this.additionalText2 = additionalText2;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

}
