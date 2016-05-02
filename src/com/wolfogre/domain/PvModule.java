package com.wolfogre.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Jason Song(wolfogre.com) on 2016/5/2.
 */
@Entity
@Table(name = "pv-module")
public class PvModule {
	@Id
	private Integer id;
	private String 公司;
	private String 类型;
	private String 系列;
	private String 型号;
	private Integer 峰值功率;
	private Double 开路电压;
	private Double 最大功率点电压;
	private Double 最大功率点电流;
	private Double 短路电流;
	private Double 转换效率;
	private Double 开路电压温度系数;
	private Double 最大功率温度系数;
	private Double 短路电流温度系数;
	private Double 长度;
	private Double 宽度;
	private Double 重量;
	private Double 工作温度下限;
	private Double 工作温度上限;

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

	public String get类型() {
		return 类型;
	}

	public void set类型(String 类型) {
		this.类型 = 类型;
	}

	public String get系列() {
		return 系列;
	}

	public void set系列(String 系列) {
		this.系列 = 系列;
	}

	public String get型号() {
		return 型号;
	}

	public void set型号(String 型号) {
		this.型号 = 型号;
	}

	public Integer get峰值功率() {
		return 峰值功率;
	}

	public void set峰值功率(Integer 峰值功率) {
		this.峰值功率 = 峰值功率;
	}

	public Double get开路电压() {
		return 开路电压;
	}

	public void set开路电压(Double 开路电压) {
		this.开路电压 = 开路电压;
	}

	public Double get最大功率点电压() {
		return 最大功率点电压;
	}

	public void set最大功率点电压(Double 最大功率点电压) {
		this.最大功率点电压 = 最大功率点电压;
	}

	public Double get最大功率点电流() {
		return 最大功率点电流;
	}

	public void set最大功率点电流(Double 最大功率点电流) {
		this.最大功率点电流 = 最大功率点电流;
	}

	public Double get短路电流() {
		return 短路电流;
	}

	public void set短路电流(Double 短路电流) {
		this.短路电流 = 短路电流;
	}

	public Double get转换效率() {
		return 转换效率;
	}

	public void set转换效率(Double 转换效率) {
		this.转换效率 = 转换效率;
	}

	public Double get开路电压温度系数() {
		return 开路电压温度系数;
	}

	public void set开路电压温度系数(Double 开路电压温度系数) {
		this.开路电压温度系数 = 开路电压温度系数;
	}

	public Double get最大功率温度系数() {
		return 最大功率温度系数;
	}

	public void set最大功率温度系数(Double 最大功率温度系数) {
		this.最大功率温度系数 = 最大功率温度系数;
	}

	public Double get短路电流温度系数() {
		return 短路电流温度系数;
	}

	public void set短路电流温度系数(Double 短路电流温度系数) {
		this.短路电流温度系数 = 短路电流温度系数;
	}

	public Double get长度() {
		return 长度;
	}

	public void set长度(Double 长度) {
		this.长度 = 长度;
	}

	public Double get宽度() {
		return 宽度;
	}

	public void set宽度(Double 宽度) {
		this.宽度 = 宽度;
	}

	public Double get重量() {
		return 重量;
	}

	public void set重量(Double 重量) {
		this.重量 = 重量;
	}

	public Double get工作温度下限() {
		return 工作温度下限;
	}

	public void set工作温度下限(Double 工作温度下限) {
		this.工作温度下限 = 工作温度下限;
	}

	public Double get工作温度上限() {
		return 工作温度上限;
	}

	public void set工作温度上限(Double 工作温度上限) {
		this.工作温度上限 = 工作温度上限;
	}
}
