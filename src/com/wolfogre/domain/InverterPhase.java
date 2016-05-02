package com.wolfogre.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Jason Song(wolfogre.com) on 2016/5/2.
 */
@Entity
@Table(name = "inverter-phase")
public class InverterPhase {
	@Id
	private Integer id;
	private String 相位;
	private String 厂家;
	private String 型号;
	private Double 额定输入电压;
	private Double 额定输入电流;
	private Double 输入电压下限;
	private Double 输入电压上限;
	private Double 额定容量;
	private Double 额定输出功率;
	private String 额定输出电压;
	private Double 额定输出电流;
	private Double 逆变效率;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String get相位() {
		return 相位;
	}

	public void set相位(String 相位) {
		this.相位 = 相位;
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

	public Double get额定输入电压() {
		return 额定输入电压;
	}

	public void set额定输入电压(Double 额定输入电压) {
		this.额定输入电压 = 额定输入电压;
	}

	public Double get额定输入电流() {
		return 额定输入电流;
	}

	public void set额定输入电流(Double 额定输入电流) {
		this.额定输入电流 = 额定输入电流;
	}

	public Double get输入电压下限() {
		return 输入电压下限;
	}

	public void set输入电压下限(Double 输入电压下限) {
		this.输入电压下限 = 输入电压下限;
	}

	public Double get输入电压上限() {
		return 输入电压上限;
	}

	public void set输入电压上限(Double 输入电压上限) {
		this.输入电压上限 = 输入电压上限;
	}

	public Double get额定容量() {
		return 额定容量;
	}

	public void set额定容量(Double 额定容量) {
		this.额定容量 = 额定容量;
	}

	public Double get额定输出功率() {
		return 额定输出功率;
	}

	public void set额定输出功率(Double 额定输出功率) {
		this.额定输出功率 = 额定输出功率;
	}

	public String get额定输出电压() {
		return 额定输出电压;
	}

	public void set额定输出电压(String 额定输出电压) {
		this.额定输出电压 = 额定输出电压;
	}

	public Double get额定输出电流() {
		return 额定输出电流;
	}

	public void set额定输出电流(Double 额定输出电流) {
		this.额定输出电流 = 额定输出电流;
	}

	public Double get逆变效率() {
		return 逆变效率;
	}

	public void set逆变效率(Double 逆变效率) {
		this.逆变效率 = 逆变效率;
	}
}
