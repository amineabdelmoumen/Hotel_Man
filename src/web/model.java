package web;

import java.util.ArrayList;
import java.util.List;

import metier.entities.Hotel;
import metier.entities.reservation;

public class model {
	private String ville;
	private List<reservation> reservations=new ArrayList<reservation>();
	public List<reservation> getReservations() {
		return reservations;
	}
	public void setReservations(List<reservation> reservations) {
		this.reservations = reservations;
	}
	private List<Hotel> hotels=new ArrayList<Hotel>();
	public model() {
		super();
	}
	public model(String ville, List<Hotel> hotels) {
		super();
		this.ville = ville;
		this.hotels = hotels;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public List<Hotel> getHotels() {
		return hotels;
	}
	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}

}
