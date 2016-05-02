package com.wolfogre.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Jason Song(wolfogre.com) on 2016/5/2.
 */
@Entity
@Table(name = "inverter-tandem")
public class InverterTandem {
	@Id
	private Integer id;
	private String 厂家;
	private String 型号;
	private Double 最大输入功率;
	private Double 最大输入电压;
	private Double 启动电压;
	private Double 额定输入电压;
	private Double MPP电压下限;
	private Double MPP电压上限;
	private Double MPPT数量;
	private Double 最大输入电流;
	private Double 输入端子最大允许电流;
	private Double 额定输出功率;
	private Double 最大输出功率;
	private Double 最大输出电流;
	private Double 最大效率;

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

	public Double get最大输入功率() {
		return 最大输入功率;
	}

	public void set最大输入功率(Double 最大输入功率) {
		this.最大输入功率 = 最大输入功率;
	}

	public Double get最大输入电压() {
		return 最大输入电压;
	}

	public void set最大输入电压(Double 最大输入电压) {
		this.最大输入电压 = 最大输入电压;
	}

	public Double get启动电压() {
		return 启动电压;
	}

	public void set启动电压(Double 启动电压) {
		this.启动电压 = 启动电压;
	}

	public Double get额定输入电压() {
		return 额定输入电压;
	}

	public void set额定输入电压(Double 额定输入电压) {
		this.额定输入电压 = 额定输入电压;
	}

	public Double getMPP电压下限() {
		return MPP电压下限;
	}

	public void setMPP电压下限(Double MPP电压下限) {
		this.MPP电压下限 = MPP电压下限;
	}

	public Double getMPP电压上限() {
		return MPP电压上限;
	}

	public void setMPP电压上限(Double MPP电压上限) {
		this.MPP电压上限 = MPP电压上限;
	}

	public Double getMPPT数量() {
		return MPPT数量;
	}

	public void setMPPT数量(Double MPPT数量) {
		this.MPPT数量 = MPPT数量;
	}

	public Double get最大输入电流() {
		return 最大输入电流;
	}

	public void set最大输入电流(Double 最大输入电流) {
		this.最大输入电流 = 最大输入电流;
	}

	public Double get输入端子最大允许电流() {
		return 输入端子最大允许电流;
	}

	public void set输入端子最大允许电流(Double 输入端子最大允许电流) {
		this.输入端子最大允许电流 = 输入端子最大允许电流;
	}

	public Double get额定输出功率() {
		return 额定输出功率;
	}

	public void set额定输出功率(Double 额定输出功率) {
		this.额定输出功率 = 额定输出功率;
	}

	public Double get最大输出功率() {
		return 最大输出功率;
	}

	public void set最大输出功率(Double 最大输出功率) {
		this.最大输出功率 = 最大输出功率;
	}

	public Double get最大输出电流() {
		return 最大输出电流;
	}

	public void set最大输出电流(Double 最大输出电流) {
		this.最大输出电流 = 最大输出电流;
	}

	public Double get最大效率() {
		return 最大效率;
	}

	public void set最大效率(Double 最大效率) {
		this.最大效率 = 最大效率;
	}
}
