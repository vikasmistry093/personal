package com.solane.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="CATEGORY")
public class Category implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CATEGORY_ID")
	private Long categoryId;

	@Column(name="CATEGORY_NAME")
	private String name;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="CREATED_TIMESTAMP")
	@CreationTimestamp
	private Timestamp createdTimestamp;
	
	@Column(name="UPDATED_TIMESTAMP")
	@CreationTimestamp
	private Timestamp updatedTimestamp;

	public Category() {}

	public Category(Long categoryId, String name, String status, Timestamp createdTimestamp,
			Timestamp updatedTimestamp) {
		super();
		this.categoryId = categoryId;
		this.name = name;
		this.status = status;
		this.createdTimestamp = createdTimestamp;
		this.updatedTimestamp = updatedTimestamp;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Timestamp createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public Timestamp getUpdatedTimestamp() {
		return updatedTimestamp;
	}

	public void setUpdatedTimestamp(Timestamp updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", name=" + name + ", status=" + status + ", createdTimestamp="
				+ createdTimestamp + ", updatedTimestamp=" + updatedTimestamp + "]";
	}
	
}
