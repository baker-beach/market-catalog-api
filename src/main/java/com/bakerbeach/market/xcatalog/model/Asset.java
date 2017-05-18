package com.bakerbeach.market.xcatalog.model;

public interface Asset {
	static String TYPE_IMAGE = "image";
	static String TYPE_VIDEO = "video";
	static String TYPE_YOUTUBE = "youtube";
	static String TYPE_PDF = "pdf";

	String getType();

	void setType(String type);

	String getPath();

	void setPath(String path);

}