package com.bakerbeach.market.catalog.model;

import java.math.BigDecimal;
import java.util.List;

import com.bakerbeach.market.core.api.model.Assets;
import com.bakerbeach.market.core.api.model.Product;

public interface GroupedProduct {

	String getCode();

	List<Product> getMembers();

	BigDecimal getMinPrice();

	void setMinPrice(BigDecimal minPrice);

	BigDecimal getMaxPrice();

	void setMaxPrice(BigDecimal maxPrice);

	BigDecimal getMinStdPrice();

	void setMinStdPrice(BigDecimal minStdPrice);

	BigDecimal getMaxStdPrice();

	void setMaxStdPrice(BigDecimal maxStdPrice);

	BigDecimal getMinDiscountOnStandardPrice();

	void setMinDiscountOnStandardPrice(BigDecimal minDiscountOnStandardPrice);

	BigDecimal getMaxDiscountOnStandardPrice();

	void setMaxDiscountOnStandardPrice(BigDecimal maxDiscountOnStandardPrice);

	Variants getVariants();

	void setVariants(Variants variants);

	Boolean isAvailable();

	void setIsAvailable(Boolean isAvailable);

	List<String> getCategories();

	void setCategories(List<String> categories);

	String getDim1();

	String getDim2();

	String getMainCategory();

	void setMainCategory(String mainCategory);

	String getTemplate();

	// commons ---

	Assets getAssets();

	void setAssets(Assets assets);

}
