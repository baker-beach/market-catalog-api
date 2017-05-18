package com.bakerbeach.market.xcatalog.model;

public interface FacetOption {

	Facet getFacet();

	void setFacet(Facet filter);

	String getCode();

	String getValue();

	void setValue(String value);

	Long getCount();

	void setCount(Long count);

	String getSort();

	void setSort(String sort);

	Boolean isSelected();

	void setSelected(Boolean selected);

	Boolean isTranslated();

}