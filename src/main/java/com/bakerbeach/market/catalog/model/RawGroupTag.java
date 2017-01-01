package com.bakerbeach.market.catalog.model;

import com.bakerbeach.market.core.api.model.Assets;

public interface RawGroupTag {

	String getCode();

	String getBrand();

	Assets getAssets();

	String getDim1();

	String getDim2();
	
	String getSort();

}
