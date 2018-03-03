package com.solane.mapper.model;

import java.io.Serializable;

public class ImageInfo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long imageId;
	private String imageTitle;
	private String imageURL;
	private String status;
	
	public ImageInfo() {}

	public ImageInfo(Long imageId, String imageTitle, String imageURL, String status) {
		super();
		this.imageId = imageId;
		this.imageTitle = imageTitle;
		this.imageURL = imageURL;
		this.status = status;
	}

	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	public String getImageTitle() {
		return imageTitle;
	}

	public void setImageTitle(String imageTitle) {
		this.imageTitle = imageTitle;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Image [imageId=" + imageId + ", imageTitle=" + imageTitle + ", imageURL=" + imageURL + ", status="
				+ status + "]";
	}

}
