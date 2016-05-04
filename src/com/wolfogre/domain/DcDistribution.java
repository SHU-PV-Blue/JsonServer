package com.wolfogre.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Jason Song(wolfogre.com) on 2016/5/5.
 */
@Entity
@Table(name = "dc-distribution")
public class DcDistribution {
	@Id
	private Integer id;
	private String 公司;
	private String 型号;
	private String 接入直流路数;
	private Double 输入直流功率上限;
	private String 输入输出总电流上限;
	private Double 接入开路电压上限;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String get公司() {
		return 公司;
	}

	public void set公司(String 公司) {
		this.公司 = 公司;
	}

	public String get型号() {
		return 型号;
	}

	public void set型号(String 型号) {
		this.型号 = 型号;
	}

	public String get接入直流路数() {
		return 接入直流路数;
	}

	public void set接入直流路数(String 接入直流路数) {
		this.接入直流路数 = 接入直流路数;
	}

	public Double get输入直流功率上限() {
		return 输入直流功率上限;
	}

	public void set输入直流功率上限(Double 输入直流功率上限) {
		this.输入直流功率上限 = 输入直流功率上限;
	}

	public String get输入输出总电流上限() {
		return 输入输出总电流上限;
	}

	public void set输入输出总电流上限(String 输入输出总电流上限) {
		this.输入输出总电流上限 = 输入输出总电流上限;
	}

	public Double get接入开路电压上限() {
		return 接入开路电压上限;
	}

	public void set接入开路电压上限(Double 接入开路电压上限) {
		this.接入开路电压上限 = 接入开路电压上限;
	}
}
