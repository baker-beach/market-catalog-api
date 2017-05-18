package com.bakerbeach.market.xcatalog.model;

public class Pager {

	private Integer currentPage;
	private Integer pageSize;
	private Integer totalPages = 0;
	private Integer totalItems = 0;
	private Integer fromItem;
	private Integer toItem;

	public Pager(Integer pageSize, Integer currentPage, Integer totalItems) {
		this.pageSize = pageSize;
		this.currentPage = currentPage;
		this.totalPages = Math.max(1, (int) Math.ceil(1.0 * totalItems / pageSize));
		this.totalItems = totalItems;
		this.fromItem = (pageSize * currentPage) - pageSize + 1;
		this.toItem = Math.min(pageSize * currentPage, totalItems);
	}

	public Pager(Integer pageSize, Integer currentPage) {
		this.pageSize = pageSize;
		this.currentPage = currentPage;
		this.fromItem = (pageSize * currentPage) - pageSize + 1;
		this.toItem = Math.min(pageSize * currentPage, totalItems);
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public Integer getFromItem() {
		return fromItem;
	}

	public Integer getToItem() {
		return toItem;
	}

	public Integer getTotalItems() {
		return totalItems;
	}
	
}
