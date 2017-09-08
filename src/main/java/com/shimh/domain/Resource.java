package com.shimh.domain;

public class Resource {
	private Long id;
	
	private String name;

	public Resource() {
		super();
	}

	public Resource(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Resource [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
