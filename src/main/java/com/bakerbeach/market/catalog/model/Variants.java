package com.bakerbeach.market.catalog.model;

import java.util.List;
import java.util.Set;

import com.bakerbeach.market.core.api.model.Product;

public interface Variants {

	void add(Product product);

	List<Product> get(Key x, Key y);

	Set<Key> getYValues(Key x);

	Set<Key> getXValues();

	Type getType();

	String getX();
	
	String getY();
	
	public interface Key extends Comparable<Key> {

		String getSort();

		String getValue();

		int compareTo(Key other);
	}

	public enum Type {
		NONE, X, Y, XY
	}

}