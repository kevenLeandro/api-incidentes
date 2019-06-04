package br.com.uol.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Solver implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2254887711385173953L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="solver_Id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="solved_day")
	private String solved_day;
	
	@Column(name="is_solved")
	private Boolean is_solved;
	
	
	public Solver(String solved_day,String name ) {
		this.name = name;
		this.solved_day = solved_day;
	}
	
	public Solver() {  
	}  

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSolved_day() {
		return solved_day;
	}

	public void setSolved_day(String solved_day) {
		this.solved_day = solved_day;
	}

	public Boolean getIs_solved() {
		return is_solved;
	}

	public void setIs_solved(Boolean is_solved) {
		this.is_solved = is_solved;
	}
	   
}
