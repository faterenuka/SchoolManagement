package com.app.dto;

public class TeacherDto {

    private Integer id;
	private String first_name;
	private String last_name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public TeacherDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeacherDto(Integer id, String first_name, String last_name) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		
	}
	
	
}
