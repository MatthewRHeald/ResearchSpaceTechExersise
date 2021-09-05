package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quantity {

	private Double numericValue;
	private Integer unitId;
	
	@Override
	public String toString() {
		return "Quantity [numericValue=" + numericValue + ", unitId=" + unitId + "]";
	}
	
	
	public Double getNumericValue() {
		return numericValue;
	}
	
	public void setNumericValue(Double numericValue) {
		this.numericValue = numericValue;
	}
	
	public Integer getUnitId() {
		return unitId;
	}
	
	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}
	
}
