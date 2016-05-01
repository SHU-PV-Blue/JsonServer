package com.wolfogre.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Jason Song(wolfogre.com) on 2016/5/1.
 */
@Entity
@Table(name = "weather")
public class Weather {
	@EmbeddedId
	private WeatherPK pk;
	private Double Jan;
	private Double Feb;
	private Double Mar;
	private Double Apr;
	private Double May;
	private Double Jun;
	private Double Jul;
	private Double Aug;
	private Double Sep;
	private Double Oct;
	private Double Nov;
	private Double Dec;

	public WeatherPK getPk() {
		return pk;
	}

	public void setPk(WeatherPK pk) {
		this.pk = pk;
	}

	public Double getJan() {
		return Jan;
	}

	public void setJan(Double jan) {
		Jan = jan;
	}

	public Double getFeb() {
		return Feb;
	}

	public void setFeb(Double feb) {
		Feb = feb;
	}

	public Double getMar() {
		return Mar;
	}

	public void setMar(Double mar) {
		Mar = mar;
	}

	public Double getApr() {
		return Apr;
	}

	public void setApr(Double apr) {
		Apr = apr;
	}

	public Double getMay() {
		return May;
	}

	public void setMay(Double may) {
		May = may;
	}

	public Double getJun() {
		return Jun;
	}

	public void setJun(Double jun) {
		Jun = jun;
	}

	public Double getJul() {
		return Jul;
	}

	public void setJul(Double jul) {
		Jul = jul;
	}

	public Double getAug() {
		return Aug;
	}

	public void setAug(Double aug) {
		Aug = aug;
	}

	public Double getSep() {
		return Sep;
	}

	public void setSep(Double sep) {
		Sep = sep;
	}

	public Double getOct() {
		return Oct;
	}

	public void setOct(Double oct) {
		Oct = oct;
	}

	public Double getNov() {
		return Nov;
	}

	public void setNov(Double nov) {
		Nov = nov;
	}

	public Double getDec() {
		return Dec;
	}

	public void setDec(Double dec) {
		Dec = dec;
	}
}
