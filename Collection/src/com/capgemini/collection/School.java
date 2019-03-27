package com.capgemini.collection;

public class School {
	private String name;
	private String city;
	private String school_district;
	public School() {
		super();
		
	}
	public School(String name, String city, String school_district) {
		super();
		this.name = name;
		this.city = city;
		this.school_district = school_district;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSchool_district() {
		return school_district;
	}
	public void setSchool_district(String school_district) {
		this.school_district = school_district;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", school_district=" + school_district + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((school_district == null) ? 0 : school_district.hashCode());
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
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (school_district == null) {
			if (other.school_district != null)
				return false;
		} else if (!school_district.equals(other.school_district))
			return false;
		return true;
	}

	
	
}
