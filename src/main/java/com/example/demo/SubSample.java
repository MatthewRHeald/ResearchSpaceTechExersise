package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SubSample {
	private String name;

	@Override
	public String toString() {
		return "SubSample [name=" + name + "]";
	}
}
