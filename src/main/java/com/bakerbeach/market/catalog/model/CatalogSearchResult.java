package com.bakerbeach.market.catalog.model;

import java.util.ArrayList;
import java.util.Collection;

import com.bakerbeach.market.core.api.model.FilterList;

public class CatalogSearchResult {
	private Collection<GroupedProduct> products = new ArrayList<GroupedProduct>();
	private FilterList filterList;
	private Pager pager;
	private String filterUrl;
	private CategoryInfo categoryInfo;

	public Collection<GroupedProduct> getProducts() {
		return products;
	}

	public void setProducts(Collection<GroupedProduct> products) {
		this.products = products;
	}

	public FilterList getFilterList() {
		return filterList;
	}

	public void setFilterList(FilterList filterList) {
		this.filterList = filterList;
	}

	public Pager getPager() {
		return pager;
	}
	
	public void setPager(Pager pager) {
		this.pager = pager;
	}

	public String getFilterUrl() {
		return filterUrl;
	}

	public void setFilterUrl(String filterUrl) {
		this.filterUrl = filterUrl;
	}

	public CategoryInfo getCategoryInfo() {
		return categoryInfo;
	}

	public void setCategoryInfo(CategoryInfo categoryInfo) {
		this.categoryInfo = categoryInfo;
	}

}
