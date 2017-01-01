package com.bakerbeach.market.catalog.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.bakerbeach.market.core.api.model.Assets;
import com.bakerbeach.market.core.api.model.ScaledPrice;
import com.bakerbeach.market.core.api.model.Status;
import com.bakerbeach.market.core.api.model.TaxCode;
import com.bakerbeach.market.core.api.model.Type;

public interface RawProduct extends Map<String, Object> {

	String getGtin();

	String getBrand();

	String getName();

	Type getType();

	Status getStatus();

	RawGroupTag getPrimaryGroup();

	RawGroupTag getSecondaryGroup();

	String getMainCategory();

	List<String> getCategories();

	Boolean isVisible();

	Boolean isIndex();

	Boolean isSingle();

	Map<String, TaxCode> getTaxCodes();

	List<ScaledPrice> getStdPrices();

	List<ScaledPrice> getPrices();

	String getSize();

	String getColor();

	String getDiet();

	String getVariant1();

	String getVariant1Sort();

	String getVariant2();

	String getVariant2Sort();

	BigDecimal getNetWeight();

	BigDecimal getGrossWeight();

	Map<String, List<String>> getLogos();

	Map<String, List<String>> getTags();

	Assets getAssets();

	Date getStartDate();

	String getSort();

	String getUrl();

}
