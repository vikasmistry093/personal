package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORY")
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CATEGORY_ID")
	private long categoryId;

	@Column(name="CATEGORY_NAME")
	private String name;
	
	@Column(name="PARENT_CATEGORY")
	private Category parentCategory;
	
	@Column(name="STATUS")
	private String status;
	
}
