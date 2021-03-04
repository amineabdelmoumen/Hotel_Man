package dao;

import java.util.List;


import metier.entities.Hotel;
import metier.entities.reservation;

public interface hotelDaoInt {
	public Hotel save(Hotel hotel);
	public List<Hotel> chercherParVille(String ville);
	public Hotel getHotel(Long id);
	public void deleteReservation(Long id);
	public reservation saveRservation(reservation r);
	public List<reservation> findAllreservation();

}
