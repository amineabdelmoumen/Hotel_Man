package dao;

import java.util.List;

import metier.entities.Hotel;

public class TestDao {

	public static void main(String[] args) {
	HotelDaoImpl dao=new HotelDaoImpl();
	Hotel h=new Hotel();
	h.setName("Hotem marine2");
	h.setAdresse("Ain sbaa casablanca");
	h.setPrice(1200.00);
	h.setServiceQuality(4);
	Hotel h3=dao.save(h);
	Hotel h2=dao.save(new Hotel("Lesmarques","Elkhair settat",3,800.00));
	List<Hotel> hotels=dao.chercherParVille("%casablanca%");
	for(Hotel h1:hotels) {
		System.out.println(h1.toString());
	}
	
	

	}

}
