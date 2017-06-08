package com.bakerbeach.market.xcatalog.model;

import java.util.List;
import java.util.Map;

import com.bakerbeach.market.xcatalog.model.Product.Status;

public interface Group {

	String getCode();

	void setCode(String code);

	String getShopCode();

	void setShopCode(String shopCode);

	Status getStatus();

	void setStatus(Status status);

	String getDim1();

	void setDim1(String dim1);

	String getDim2();

	void setDim2(String dim2);

	String getTemplate();

	void setTemplate(String template);

	List<Product> getMembers();

	void setMembers(List<Product> members);

	void setCachedMinPrices(Map<String, Price> cachedMinPrices);

}
