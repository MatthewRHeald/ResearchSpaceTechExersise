package com.example.demo;

import java.util.List;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sample {
	
	private String name;
	private String tags;
	private String sampleSource;
	private Optional<String> expiryDate;
	private Quantity quantity;
	private List<SubSample> subSamples;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTags() {
		return tags;
	}
	
	public void setTags(String tags) {
		this.tags = tags;
	}
	
	public String getSampleSource() {
		return sampleSource;
	}
	
	public void setSampleSource(String sampleSource) {
		this.sampleSource = sampleSource;
	}
	
	public Optional<String> getExpiryDate() {
		return expiryDate;
	}
	
	public void setExpiryDate(Optional<String> expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public Quantity getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Quantity quantity) {
		this.quantity = quantity;
	}
	
	public List<SubSample> getSubSamples() {
		return subSamples;
	}
	
	public void setSubSamples(List<SubSample> subSamples) {
		this.subSamples = subSamples;
	}

	@Override
	public String toString() {
		return "Sample [name=" + name + ", tags=" + tags + ", sampleSource=" + sampleSource + ", expiryDate="
				+ expiryDate + ", quantity=" + quantity + ", subSamples=" + subSamples + "]";
	}

}
