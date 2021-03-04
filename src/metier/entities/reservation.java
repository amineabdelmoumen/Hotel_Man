package metier.entities;

import java.io.Serializable;
import java.util.Date;

public class reservation implements Serializable{
	private Long id;
	private String Hotelname;
	private String reservationdate;
	private int nbrjour;
	private String clientname;
	public reservation() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHotelname() {
		return Hotelname;
	}
	public void setHotelname(String hotelname) {
		Hotelname = hotelname;
	}
	public String getReservationdate() {
		return reservationdate;
	}
	public void setReservationdate(String reservationdate) {
		this.reservationdate = reservationdate;
	}
	public int getNbrjour() {
		return nbrjour;
	}
	public void setNbrjour(int nbrjour) {
		this.nbrjour = nbrjour;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public reservation(String hotelname, String reservationdate, int nbrjour, String clientname) {
		super();
		Hotelname = hotelname;
		this.reservationdate = reservationdate;
		this.nbrjour = nbrjour;
		this.clientname = clientname;
	}
	}
	