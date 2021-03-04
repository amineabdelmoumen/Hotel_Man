package web;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HotelDaoImpl;
import dao.hotelDaoInt;
import metier.entities.Hotel;
import metier.entities.reservation;

public class controlleur extends HttpServlet{
	
	hotelDaoInt dao;
	@Override
	public void init() throws ServletException {
		dao=new HotelDaoImpl();
		super.init();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path=request.getServletPath();
		if (path.equals("/index.org")) {
			request.getRequestDispatcher("hotels.jsp").forward(request, response);
		}
		else if (path.equals("/chercher.org")) {
			String ville=request.getParameter("ville");
			model model=new model();
			model.setVille(ville);
			List<Hotel> hotels=dao.chercherParVille("%"+ville+"%");
			model.setHotels(hotels);
			request.setAttribute("model",model);
			request.getRequestDispatcher("hotels.jsp").forward(request, response);
			
		}
		else if (path.equals("/add.org")) {
			System.out.print("i'm in");
			request.getRequestDispatcher("add.jsp").forward(request,response);
			
		}
		else if (path.equals("save.org")&&(request.getMethod().equals("post"))){
			System.out.print("i'm in");
			Hotel h=new Hotel();
			h.setName(request.getParameter("nom"));
			h.setAdresse(request.getParameter("adresse"));
			int servicequality=Integer.parseInt(request.getParameter("servicequality"));
			Double price=Double.parseDouble(request.getParameter("price"));
			h.setServiceQuality(servicequality);
			h.setPrice(price);
			Hotel h1=dao.save(h);
			request.getRequestDispatcher("hotels.jsp").forward(request, response);
			
		}
		else if (path.equals("/reserver.org")) {
			System.out.print("i'm in");
			Long id=Long.parseLong(request.getParameter("id"));
			Hotel h1=dao.getHotel(id);
			request.setAttribute("h1", h1);
			request.getRequestDispatcher("reservation.jsp").forward(request, response);
			
		}
		else if (path.equals("/reservations.org")) {
			List<reservation> reservations=dao.findAllreservation();
			model model=new model();
			model.setReservations(reservations);
			request.setAttribute("model",model);
			request.getRequestDispatcher("allreservations.jsp").forward(request, response);
		}
		else if (path.equals("/delete.org")) {
			Long id =Long.parseLong(request.getParameter("id"));
			dao.deleteReservation(id);
			request.getRequestDispatcher("allreservations.jsp").forward(request, response);
			
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path=request.getServletPath();
		if (path.equals("/save.org")){
			System.out.print("i'm in");
			Hotel h=new Hotel();
			h.setName(request.getParameter("nom"));
			h.setAdresse(request.getParameter("adresse"));
			int servicequality=Integer.parseInt(request.getParameter("servicequality"));
			Double price=Double.parseDouble(request.getParameter("price"));
			h.setServiceQuality(servicequality);
			h.setPrice(price);
			Hotel h1=dao.save(h);
			request.getRequestDispatcher("hotels.jsp").forward(request, response);
			
		}
		else if (path.equals("/saveReservation.org")) {
			reservation r=new reservation();
			r.setHotelname(request.getParameter("hotelname"));
			r.setClientname(request.getParameter("clientname"));
			r.setReservationdate(request.getParameter("date"));
			int nbrjour=Integer.parseInt(request.getParameter("nbrjour"));
			r.setNbrjour(nbrjour);
	        reservation r1=dao.saveRservation(r);
	        request.getRequestDispatcher("hotels.jsp").forward(request, response);
			
			
			
		}
	}

}






