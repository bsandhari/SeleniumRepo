package com.project1.pageObjects;

public class TestJava {

	public String name;
	public int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {

		TestJava t = new TestJava();
		t.setId(102);
		t.setName("bharath");
		System.out.println(t.getId());
		System.out.println(t.getName());
		
	}

}
