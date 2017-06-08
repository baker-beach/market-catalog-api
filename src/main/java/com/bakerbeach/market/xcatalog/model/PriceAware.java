package com.bakerbeach.market.xcatalog.model;

import java.util.List;
import java.util.Map;

public interface PriceAware {

	List<Price> getPrices();

	void setPrices(List<Price> prices);

	void addPrice(Price price);

	Map<String, Price> getCachedPrices();

	void setCachedPrices(Map<String, Price> cachedPrices);

}
