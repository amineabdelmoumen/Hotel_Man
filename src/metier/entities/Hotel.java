package metier.entities;

import java.io.Serializable;

public class Hotel implements Serializable {
	private Long id;
	private String name;
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", adresse=" + adresse + ", serviceQuality=" + serviceQuality
				+ ", price=" + price + "]";
	}
	private String adresse;
	private int serviceQuality;
	private Double price;
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getServiceQuality() {
		return serviceQuality;
	}
	public void setServiceQuality(int serviceQuality) {
		this.serviceQuality = serviceQuality;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Hotel(String name, String adresse, int serviceQuality, Double price) {
		super();
		this.name = name;
		this.adresse = adresse;
		this.serviceQuality = serviceQuality;
		this.price = price;
	}
	public Hotel() {
		super();
	}
	
	

}
