package com.bakerbeach.market.catalog.model;

import java.util.Locale.Category;
import java.util.Map;

public class CategoryInfo {
	private TreeNode<Category> categoryTree;
	private Map<String, Category> categoryMap;

	public TreeNode<Category> getCategoryTree() {
		return categoryTree;
	}

	public void setCategoryTree(TreeNode<Category> categoryTree) {
		this.categoryTree = categoryTree;
	}

	public Map<String, Category> getCategoryMap() {
		return categoryMap;
	}

	public void setCategoryMap(Map<String, Category> categoryMap) {
		this.categoryMap = categoryMap;
	}
}
