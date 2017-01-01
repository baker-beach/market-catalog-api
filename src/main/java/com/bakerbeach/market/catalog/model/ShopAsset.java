package com.bakerbeach.market.catalog.model;

import java.io.Serializable;

public class ShopAsset implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static String TYPE_IMAGE = "image";
	public static String TYPE_VIDEO = "video";
	public static String TYPE_YOUTUBE = "youtube";
	public static String TYPE_PDF = "pdf";
	
	private String type;
	private String path;
	private String alt;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getAlt() {
		return alt;
	}
	
	public void setAlt(String alt) {
		this.alt = alt;
	}

}
