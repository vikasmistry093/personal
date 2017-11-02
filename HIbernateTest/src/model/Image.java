package model;

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
	private long imageId;

	public long getImageId() {
		return imageId;
	}

	public void setImageId(long imageId) {
		this.imageId = imageId;
	}
	
}
