package com.bakerbeach.market.xcatalog.model;

import java.util.Collection;

public interface Facets {

	Collection<Facet> getAvailable();

	Collection<Facet> getActive();

	Collection<Facet> getActive(Boolean url);

	Collection<Facet> getUrlRelevant();

	Collection<Facet> getUrlRelevantExcluding(Facet _filter);

	Collection<Facet> getActiveFiltersWithGetParamtersIncluding(Facet _filter);

	Collection<Facet> getActiveFiltersWithGetParamtersExcluding(Facet _filter);

	Collection<Facet> getInactive();

	boolean containsId(String id);

	Facet get(String id);

	void add(Facet filter);

	void remove(String filterId);

	Collection<Facet> getUrlRelevantIncluding(Facet _filter);

}