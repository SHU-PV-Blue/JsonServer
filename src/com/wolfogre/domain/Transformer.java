package com.wolfogre.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Jason Song(wolfogre.com) on 2016/5/7.
 */
@Entity
@Table(name = "transformer")
public class Transformer {
	@Id
	private Integer id;
	private String 类型;
	private String 产品名;
	private String 分类;
	private String 额定容量;
	private String 额定电压;
	private String 高压分接范围;
	private String 联结组标号;
	private String 空载损耗;
	private String 负载损耗;
	private Double 空载电流;
	private Double 短路阻抗;

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

	public String get产品名() {
		return 产品名;
	}

	public void set产品名(String 产品名) {
		this.产品名 = 产品名;
	}

	public String get分类() {
		return 分类;
	}

	public void set分类(String 分类) {
		this.分类 = 分类;
	}

	public String get额定容量() {
		return 额定容量;
	}

	public void set额定容量(String 额定容量) {
		this.额定容量 = 额定容量;
	}

	public String get额定电压() {
		return 额定电压;
	}

	public void set额定电压(String 额定电压) {
		this.额定电压 = 额定电压;
	}

	public String get高压分接范围() {
		return 高压分接范围;
	}

	public void set高压分接范围(String 高压分接范围) {
		this.高压分接范围 = 高压分接范围;
	}

	public String get联结组标号() {
		return 联结组标号;
	}

	public void set联结组标号(String 联结组标号) {
		this.联结组标号 = 联结组标号;
	}

	public String get空载损耗() {
		return 空载损耗;
	}

	public void set空载损耗(String 空载损耗) {
		this.空载损耗 = 空载损耗;
	}

	public String get负载损耗() {
		return 负载损耗;
	}

	public void set负载损耗(String 负载损耗) {
		this.负载损耗 = 负载损耗;
	}

	public Double get空载电流() {
		return 空载电流;
	}

	public void set空载电流(Double 空载电流) {
		this.空载电流 = 空载电流;
	}

	public Double get短路阻抗() {
		return 短路阻抗;
	}

	public void set短路阻抗(Double 短路阻抗) {
		this.短路阻抗 = 短路阻抗;
	}
}
