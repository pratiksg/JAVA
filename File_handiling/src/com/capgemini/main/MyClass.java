package com.capgemini.main;

public class MyClass {
	private String className;

	public MyClass() {
		super();
		
	}

	public MyClass(String className) {
		super();
		this.className = className;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "MyClass [className=" + className + ", getClassName()=" + getClassName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((className == null) ? 0 : className.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		if (className == null) {
			if (other.className != null)
				return false;
		} else if (!className.equals(other.className))
			return false;
		return true;
	}
	
	
}
/*

6) create a class "MyClass".
create 5 different objects of it.
add them in an arraylist.
store arraylist in file.
Now open a file, read arraylist and display all objects.
HINT:- Use Serialization and Desrialization with Collection





*/