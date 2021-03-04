package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.entities.Hotel;
import metier.entities.reservation;

public class HotelDaoImpl implements hotelDaoInt{

	@Override
	public Hotel save(Hotel hotel) {
		Connection con=singleton.getConnection();
		 
		try {
			PreparedStatement ps = con.prepareStatement(
					"INSERT INTO hotels4 (nom,adresse,serviceQuality,price) VALUES (?,?,?,?)");
			ps.setString(1, hotel.getName());
			ps.setString(2, hotel.getAdresse());
			ps.setInt(3, hotel.getServiceQuality());
			ps.setDouble(4, hotel.getPrice());
			ps.executeUpdate();
			ps.close();
			PreparedStatement ps2 = con.prepareStatement(
					"SELECT MAX(ID) AS MAX_ID FROM hotels4");
			ResultSet rs = ps2.executeQuery();
			if (rs.next()) {
				hotel.setId(rs.getLong("MAX_ID"));
			}
			
			ps2.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return hotel;
	}

	@Override
	public List<Hotel> chercherParVille(String ville) {
		List<Hotel> hotels=new ArrayList<Hotel>();
		Connection con=singleton.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(
					"SELECT * FROM hotels4 WHERE adresse LIKE ?");
			ps.setString(1, ville);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Hotel h1=new Hotel();
				h1.setId(rs.getLong("ID"));
				h1.setName(rs.getString("nom"));
				h1.setAdresse(rs.getString("adresse"));
				h1.setServiceQuality(rs.getInt("serviceQuality"));
				h1.setPrice(rs.getDouble("price"));
				hotels.add(h1);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hotels;
	}

	@Override
	public String toString() {
		return "HotelDaoImpl []";
	}

	@Override
	public Hotel getHotel(Long id) {
		Connection con=singleton.getConnection();
		Hotel h1=new Hotel();
		try {
			PreparedStatement ps = con.prepareStatement(
					"SELECT * FROM hotels4 WHERE ID=?");
			ps.setLong(1, id);
			ResultSet rs=ps.executeQuery();
			
			if (rs.next()) {	
				h1.setName(rs.getString("nom"));
				h1.setAdresse(rs.getString("adresse"));
				h1.setServiceQuality(rs.getInt("serviceQuality"));
				h1.setPrice(rs.getDouble("price"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return h1;
	}

	

	

	@Override
	public reservation saveRservation(reservation r) {
		Connection con=singleton.getConnection();
		reservation r1=new reservation();
		 
		try {
			PreparedStatement ps = con.prepareStatement(
					"INSERT INTO reservation1 (hotelname,clientsname,Nbrjour,reservationdate) VALUES (?,?,?,?)");
			ps.setString(1, r.getHotelname());
			ps.setString(2, r.getClientname());
			ps.setInt(3, r.getNbrjour());
			ps.setString(4, r.getReservationdate());
			ps.executeUpdate();
			ps.close();
			PreparedStatement ps2 = con.prepareStatement(
					"SELECT MAX(ID) AS MAX_ID FROM reservation1");
			ResultSet rs = ps2.executeQuery();
			if (rs.next()) {
				r1.setId(rs.getLong("MAX_ID"));
			}
			
			ps2.close();
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   return null;
}

	@Override
	public List<reservation> findAllreservation() {
		List<reservation> reservations=new ArrayList<>();
		Connection con=singleton.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(
					"SELECT * FROM reservation1");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				reservation h1=new reservation();
				h1.setId(rs.getLong("ID"));
				h1.setHotelname(rs.getString("hotelname"));
				h1.setClientname(rs.getString("clientsname"));
				h1.setNbrjour(rs.getInt("Nbrjour"));
				h1.setReservationdate(rs.getString("reservationdate"));
				reservations.add(h1);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reservations;
	}

	@Override
	public void deleteReservation(Long id) {
		Connection con=singleton.getConnection();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(
					"DELETE FROM reservation1 WHERE ID=?");
			ps.setLong(1, id);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}		
}