package com.wolfogre.domain;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Jason Song(wolfogre.com) on 2016/5/5.
 */
@Entity
@Table(name = "dc-combiner")
public class DcCombiner {
	@Id
	private Integer id;
	private String 厂家;
	private String 型号;
	private String 输入路数;
	private Double 输入电流上限;
	@Type(type="org.hibernate.type.TrueFalseType")
	private Boolean 有直流断路器;
	@Type(type="org.hibernate.type.TrueFalseType")
	private Boolean 有防雷失效监控;
	@Type(type="org.hibernate.type.TrueFalseType")
	private Boolean 有监控单元;
	private String 辅助电源;
	private Double 价格下限;
	private Double 价格上限;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String get厂家() {
		return 厂家;
	}

	public void set厂家(String 厂家) {
		this.厂家 = 厂家;
	}

	public String get型号() {
		return 型号;
	}

	public void set型号(String 型号) {
		this.型号 = 型号;
	}

	public String get输入路数() {
		return 输入路数;
	}

	public void set输入路数(String 输入路数) {
		this.输入路数 = 输入路数;
	}

	public Double get输入电流上限() {
		return 输入电流上限;
	}

	public void set输入电流上限(Double 输入电流上限) {
		this.输入电流上限 = 输入电流上限;
	}

	public Boolean get有直流断路器() {
		return 有直流断路器;
	}

	public void set有直流断路器(Boolean 有直流断路器) {
		this.有直流断路器 = 有直流断路器;
	}

	public Boolean get有防雷失效监控() {
		return 有防雷失效监控;
	}

	public void set有防雷失效监控(Boolean 有防雷失效监控) {
		this.有防雷失效监控 = 有防雷失效监控;
	}

	public Boolean get有监控单元() {
		return 有监控单元;
	}

	public void set有监控单元(Boolean 有监控单元) {
		this.有监控单元 = 有监控单元;
	}

	public String get辅助电源() {
		return 辅助电源;
	}

	public void set辅助电源(String 辅助电源) {
		this.辅助电源 = 辅助电源;
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
