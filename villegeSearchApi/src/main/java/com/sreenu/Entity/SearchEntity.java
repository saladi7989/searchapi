package com.sreenu.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "search")
@Entity
public class SearchEntity {

	@Id
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "country")
	private String country;
	@Column(name = "state")
	private String state;
	@Column(name = "district")
	private String district;
	@Column(name = "mandal")
	private String mandal;
	@Column(name = "villege")
	private String villege;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getMandal() {
		return mandal;
	}

	public void setMandal(String mandal) {
		this.mandal = mandal;
	}

	public String getVillege() {
		return villege;
	}

	public void setVillege(String villege) {
		this.villege = villege;
	}

}
