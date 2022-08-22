package com.globllogic.springTest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
int cus_id;
	@Column
String cname;
	public Category(int cid, String cname) {
		super();
		this.cus_id = cid;
		this.cname = cname;
	}
	public Category() {
		super();
		
	}
	public int getCid() {
		return cus_id;
	}
	public void setCid(int cid) {
		this.cus_id = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Category [cid=" + cus_id + ", cname=" + cname + "]";
	}

}
