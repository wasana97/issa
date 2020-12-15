package com.oop.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Admin;
import com.oop.service.AdminServiceImpl;
import com.oop.service.IAdmintService;

/**
 * Update admins servlet
 */
public class UpdateAdminServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateAdminServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		Admin admin = new Admin();
		String indexID = request.getParameter("indexID");	
		admin.setIndexID(indexID);
		admin.setCustermorID(request.getParameter("customerID"));
		admin.setCustemorName(request.getParameter("customerName"));
		admin.setDriverName(request.getParameter("driverName"));
		admin.setVehicleNumber(request.getParameter("vehicleNumber"));
		admin.setAmount(request.getParameter("amount"));

		
		IAdmintService iAdminService = new AdminServiceImpl();
		iAdminService.updateAdmin(indexID, admin);

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/views/ListAdmins.jsp");
		dispatcher.forward(request, response);
	}

}
