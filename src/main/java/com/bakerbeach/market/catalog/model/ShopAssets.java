package com.bakerbeach.market.catalog.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShopAssets extends HashMap<String, List<ShopAssetGroup>> {
	private static final long serialVersionUID = 1L;

	public List<ShopAsset> get(String tag, String size) {
		List<ShopAsset> toBeReturned = new ArrayList<ShopAsset>();
		
		List<ShopAssetGroup> assetGroups = get(tag);
		if (assetGroups != null) {
			for (ShopAssetGroup assetGroup : assetGroups) {
				ShopAsset asset = assetGroup.get(size);
				if (asset != null) {
					toBeReturned.add(asset);
				}
			}			
		}
		
		return toBeReturned;
	}

	public void add(String tag, ShopAssetGroup assetGroup) {
		if (!containsKey(tag)) {
			put(tag, new ArrayList<ShopAssetGroup>());
		}
		get(tag).add(assetGroup);
	}
}
