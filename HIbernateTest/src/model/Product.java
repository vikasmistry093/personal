package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PRODUCT_ID")
	private long productId;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="PRODUCT_CATEGORY", joinColumns={@JoinColumn(name="PRODUCT_ID")}, inverseJoinColumns={@JoinColumn(name="CATEGORY_ID")})
	private List<Category> productCategory;
	
	@OneToMany
	@JoinTable(name="PRODUCT_IMAGE", joinColumns={@JoinColumn(name="PRODUCT_ID")}, inverseJoinColumns={@JoinColumn(name="IMAGE_ID")})
	private List<Image> prouctImages;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public List<Category> getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(List<Category> productCategory) {
		this.productCategory = productCategory;
	}

	public List<Image> getProuctImages() {
		return prouctImages;
	}

	public void setProuctImages(List<Image> prouctImages) {
		this.prouctImages = prouctImages;
	}

}