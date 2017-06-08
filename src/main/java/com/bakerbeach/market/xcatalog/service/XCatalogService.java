package com.bakerbeach.market.xcatalog.service;

import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.bakerbeach.market.xcatalog.model.Facets;
import com.bakerbeach.market.xcatalog.model.Group;
import com.bakerbeach.market.xcatalog.model.Pager;
import com.bakerbeach.market.xcatalog.model.Price;
import com.bakerbeach.market.xcatalog.model.Product;
import com.bakerbeach.market.xcatalog.model.Product.Option;
import com.bakerbeach.market.xcatalog.model.Product.Status;
import com.bakerbeach.market.xcatalog.model.SearchResult;

public interface XCatalogService {

	List<Product> rawByGtin(String shopCode, Status status, Collection<String> codes);

	Group groupByCode(String shopCode, Product.Status status, Locale locale, String priceGroup, Currency currency,
			String countryOfDelivery, Date date, String groupBy, String code) throws XCatalogServiceException;

	SearchResult groupByIndexQuery(String shopCode, Status status, Locale locale, String priceGroup, Currency currency,
			String countryOfDelivery, Date date, Facets facets, String query, List<String> filterQueries,
			String groupBy, Pager pager, String sort);

	void save(String shopCode, Product product);

	void groupSave(String shopCode, Group group);

	List<String> productCodes(String shopCode, Collection<Product.Type> types, Collection<Status> status,
			Integer pageSize, Integer currentPage, String sort);

	Map<String, Price> getCurrentPrices(List<Price> prices, Currency currency, String priceGroup, Date date);

	Map<String, Price> getCurrentPrices(Product product, Currency currency, String priceGroup, Date date);

	Map<String, Price> getCurrentPrices(Option option, Currency currency, String priceGroup, Date date);

}
