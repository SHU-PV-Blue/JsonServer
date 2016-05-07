package com.wolfogre.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Jason Song(wolfogre.com) on 2016/5/7.
 */
@Entity
@Table(name = "switch")
public class Switch {
	@Id
	private Integer id;
	private String 类型;
	private String 品牌;
	private String 型号;
	private String 母线额定电流;
	private Double 额定电压;
	private Double 额定频率;
	private String 防护等级;
	private String 用途;
	private String 结构形式;
	private Double 价格下限;
	private Double 价格上限;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String get类型() {
		return 类型;
	}

	public void set类型(String 类型) {
		this.类型 = 类型;
	}

	public String get品牌() {
		return 品牌;
	}

	public void set品牌(String 品牌) {
		this.品牌 = 品牌;
	}

	public String get型号() {
		return 型号;
	}

	public void set型号(String 型号) {
		this.型号 = 型号;
	}

	public String get母线额定电流() {
		return 母线额定电流;
	}

	public void set母线额定电流(String 母线额定电流) {
		this.母线额定电流 = 母线额定电流;
	}

	public Double get额定电压() {
		return 额定电压;
	}

	public void set额定电压(Double 额定电压) {
		this.额定电压 = 额定电压;
	}

	public Double get额定频率() {
		return 额定频率;
	}

	public void set额定频率(Double 额定频率) {
		this.额定频率 = 额定频率;
	}

	public String get防护等级() {
		return 防护等级;
	}

	public void set防护等级(String 防护等级) {
		this.防护等级 = 防护等级;
	}

	public String get用途() {
		return 用途;
	}

	public void set用途(String 用途) {
		this.用途 = 用途;
	}

	public String get结构形式() {
		return 结构形式;
	}

	public void set结构形式(String 结构形式) {
		this.结构形式 = 结构形式;
	}

	public Double get价格下限() {
		return 价格下限;
	}

	public void set价格下限(Double 价格下限) {
		this.价格下限 = 价格下限;
	}

	public Double get价格上限() {
		return 价格上限;
	}

	public void set价格上限(Double 价格上限) {
		this.价格上限 = 价格上限;
	}
}
