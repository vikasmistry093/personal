package com.solane.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="IMAGE")
public class Image {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="IMAGE_ID")
	private Long imageId;
	
	@Column(name="IMAGE_TITLE")
	private String imageTitle;
	
	@Column(name="IMAGE_URL")
	private String imageURL;
	
	@Column(name="STATUS")
	private String status;
	
	public Image() {}

	public Image(long imageId, String imageTitle, String imageURL, String status) {
		super();
		this.imageId = imageId;
		this.imageTitle = imageTitle;
		this.imageURL = imageURL;
		this.status = status;
	}

	public long getImageId() {
		return imageId;
	}

	public void setImageId(long imageId) {
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
