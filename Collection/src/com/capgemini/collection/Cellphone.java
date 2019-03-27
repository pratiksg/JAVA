package com.capgemini.collection;

public class Cellphone {

	private String company;
	private double model;
	private String description;
	private String operatingSstem;
	private double price;
	
	public Cellphone() {
		super();
		
	}

	public Cellphone(String company, double model, String description, String operatingSstem, double price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSstem = operatingSstem;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cellphone [company=" + company + ", model=" + model + ", description=" + description
				+ ", operatingSstem=" + operatingSstem + ", price=" + price + "]";
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getModel() {
		return model;
	}

	public void setModel(double model) {
		this.model = model;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOperatingSstem() {
		return operatingSstem;
	}

	public void setOperatingSstem(String operatingSstem) {
		this.operatingSstem = operatingSstem;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		long temp;
		temp = Double.doubleToLongBits(model);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((operatingSstem == null) ? 0 : operatingSstem.hashCode());
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Cellphone other = (Cellphone) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (Double.doubleToLongBits(model) != Double.doubleToLongBits(other.model))
			return false;
		if (operatingSstem == null) {
			if (other.operatingSstem != null)
				return false;
		} else if (!operatingSstem.equals(other.operatingSstem))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	
}
