package com.bakerbeach.market.xcatalog.model;

import java.util.List;

public interface Facet {

	String getId();

	String getIndexFieldName();

	String getLabel();

	void setLabel(String label);

	Boolean isActive();

	void setActive(Boolean active);

	List<FacetOption> getOptions();

	void addOption(FacetOption option);

	List<FacetOption> getSelectedOptions();

	Boolean hasOptions();

	FacetOption getOption(String translationKey);

	Boolean isMultiSelect();

	void setMultiSelect(Boolean multiSelect);

	Boolean isUrlRelevant();

	void setUrlRelevant(Boolean urlRelevant);

	String toUrl(FacetOption currentOption);
//	String toUrl(Option currentOption, Locale locale,
//			MessageSource messageSource);

	Object toGetParameter(FacetOption currentOption);
//	String toGetParameter(Option currentOption, Locale locale,
//			MessageSource messageSource);

	Boolean getMultiValue();

	void setMultiValue(Boolean multiValue);


}
