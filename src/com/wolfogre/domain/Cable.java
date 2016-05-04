package com.wolfogre.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Jason Song(wolfogre.com) on 2016/5/5.
 */
@Entity
@Table(name = "cable")
public class Cable {
	@Id
	private Integer id;
	private String 名称;
	private String 型号;
	private Double 导体截面;
	private Double 允许载流量;
	private Double 容量;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String get名称() {
		return 名称;
	}

	public void set名称(String 名称) {
		this.名称 = 名称;
	}

	public String get型号() {
		return 型号;
	}

	public void set型号(String 型号) {
		this.型号 = 型号;
	}

	public Double get导体截面() {
		return 导体截面;
	}

	public void set导体截面(Double 导体截面) {
		this.导体截面 = 导体截面;
	}

	public Double get允许载流量() {
		return 允许载流量;
	}

	public void set允许载流量(Double 允许载流量) {
		this.允许载流量 = 允许载流量;
	}

	public Double get容量() {
		return 容量;
	}

	public void set容量(Double 容量) {
		this.容量 = 容量;
	}
}
