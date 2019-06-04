package br.com.uol.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Devs implements Serializable {
   
	/**
	 * 
	 */
	
    
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Dev_Id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="phoneNumber")
	private String phoneNumber;
	
	@Column(name="orderPositionDay")
	private int orderPositionDay;
	
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getOrderPositionDay() {
		return orderPositionDay;
	}
	
	public void setOrderPositionDay(int orderPositionDay) {
		this.orderPositionDay = orderPositionDay;
	}
	
    @Override
    public String toString() {
        return "Devs [name=" + name + ", phoneNumber=" + phoneNumber + ", orderPositionDay=" + orderPositionDay + "]";
    }
    
}

