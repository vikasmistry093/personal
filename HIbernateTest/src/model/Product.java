package model;

import java.sql.Timestamp;
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

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="PRODUCT")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PRODUCT_ID")
	private long productId;
	
	@Column(name="PRODUCT_TITLE")
	private String productTitle;
	
	@Column(name="PRICE")
	private double price;
	
	@Column(name="DISCOUNT")
	private double discount;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="FEATURES")
	private String features;
	
	@Column(name="RATING")
	private int rating;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="PRODUCT_CATEGORY", joinColumns={@JoinColumn(name="PRODUCT_ID")}, inverseJoinColumns={@JoinColumn(name="CATEGORY_ID")})
	private List<Category> productCategory;
	
	@OneToMany
	@JoinTable(name="PRODUCT_IMAGE", joinColumns={@JoinColumn(name="PRODUCT_ID")}, inverseJoinColumns={@JoinColumn(name="IMAGE_ID")})
	private List<Image> prouctImages;

	@Column(name="STATUS")
	private String status;
	
	@Column(name="CREATED_TIMESTAMP")
	@CreationTimestamp
	private Timestamp createdTimestamp;
	
	@Column(name="UPDATED_TIMESTAMP")
	@UpdateTimestamp
	private Timestamp updatedTimestamp;
	
	
}