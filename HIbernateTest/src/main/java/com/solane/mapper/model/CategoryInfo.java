package com.solane.mapper.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class CategoryInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long categoryId;
	private String name;
	private String status;
	private Timestamp createdTimestamp;
	private Timestamp updatedTimestamp;

	public CategoryInfo() {}

	public CategoryInfo(Long categoryId, String name, String status, Timestamp createdTimestamp,
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
