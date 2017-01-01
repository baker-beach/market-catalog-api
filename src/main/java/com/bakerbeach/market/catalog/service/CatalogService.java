package com.bakerbeach.market.catalog.service;

import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.bakerbeach.market.catalog.model.CatalogSearchResult;
import com.bakerbeach.market.catalog.model.Pager;
import com.bakerbeach.market.catalog.model.RawProduct;
import com.bakerbeach.market.catalog.model.ShopProduct;
import com.bakerbeach.market.core.api.model.FilterList;
import com.bakerbeach.market.core.api.model.Product;
import com.bakerbeach.market.core.api.model.ShopContext;

public interface CatalogService {

	CatalogSearchResult groupIndexQuery(Locale locale, String priceGroup, Currency currency, String assortmentCode,
			String countryOfDelivery, Date date, FilterList filterList, String query, String groupBy, Pager pager,
			String sort);

	List<RawProduct> findRawByGtin(String status, List<String> gtin);

	List<RawProduct> findRawByField(String status, String key, List<String> values);

	List<String> findGtin(String status, Boolean index);

	CatalogSearchResult findGroupByGroupCode(Locale locale, String priceGroup, Currency currency,
			String countryOfDelivery, Date date, Collection<String> primaryGroups);

	// CatalogSearchResult findGroupedProductsByGtin(Locale locale, String
	// priceGroup, Currency currency,
	// String countryOfDelivery, Date now, Collection<String> gtins);

	// to be checked ---

	List<Product> findByGtin(Locale locale, String priceGroup, Currency currency, String countryOfDelivery, Date date,
			Collection<String> gtins);

	ShopProduct findShopProductByGtin(ShopContext shopContext, String gtin);

	Map<String, Integer> getBom(String shopCode, String ean, String string);

	CatalogSearchResult findGroupedProductByPrimaryGroup(ShopContext cmsContext, String primary_group);

}
