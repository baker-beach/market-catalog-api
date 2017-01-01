package com.bakerbeach.market.catalog.model;

import java.util.List;

public interface RawItem {
	String getName();

	void setName(String name);

	String getParent();

	void setParent(String parent);

	Boolean isRequired();

	Boolean getIsRequired();

	void setIsRequired(Boolean required);

	Integer getMinQty();

	void setMinQty(Integer minQty);

	Integer getMaxQty();

	void setMaxQty(Integer maxQty);

	Boolean isMultiselect();

	Boolean getIsMultiselect();

	void setIsMultiselect(Boolean isMultiselect);

	List<RawOption> getOptions();

	void setOptions(List<RawOption> options);

}
