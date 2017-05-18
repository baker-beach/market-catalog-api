package com.bakerbeach.market.xcatalog.model;

import java.util.List;
import java.util.Map;

public interface Assets {

	List<Asset> get(String tag, String size);

	void add(String tag, Map<String, Asset> assetGroup);

}
