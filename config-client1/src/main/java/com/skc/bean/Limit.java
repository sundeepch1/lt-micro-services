package com.skc.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("reduction")
public class Limit {
	
	private Integer minValue;
	private Integer maxValue;
	public Integer getMinValue() {
		return minValue;
	}
	public void setMinValue(Integer minValue) {
		this.minValue = minValue;
	}
	public Integer getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(Integer maxValue) {
		this.maxValue = maxValue;
	}
}
