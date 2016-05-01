package com.wolfogre.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Jason Song(wolfogre.com) on 2016/5/1.
 */
@Embeddable
public class WeatherPK implements Serializable {
	private String type;
	private Double lat;
	private Double lon;

	public WeatherPK() {
	}

	public WeatherPK(String type, Double lat, Double lon) {
		this.type = type;
		this.lat = lat;
		this.lon = lon;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLon() {
		return lon;
	}

	public void setLon(Double lon) {
		this.lon = lon;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof WeatherPK){
			WeatherPK key = (WeatherPK)obj;
			if(this.type.equals(key.getType()) && this.lat.equals(key.getLat()) && this.lon.equals(key.getLon())){
				return true ;
			}
		}
		return false ;
	}

	@Override
	public int hashCode() {
		return String.format("%s%f%f", type, lat, lon).hashCode();
	}
}
