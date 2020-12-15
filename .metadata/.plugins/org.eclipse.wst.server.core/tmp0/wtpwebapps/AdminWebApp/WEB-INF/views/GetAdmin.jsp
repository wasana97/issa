<%@page import="com.oop.model.Admin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel = "stylesheet"
   type = "text/css"
   href = "Admin.css" />
<meta charset="UTF-8">
<title>SLIIT OOP Admin Management</title>
</head>
<body>

	<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>

	<h2 class="h2">Get Admin Page</h2>

	SLIIT Admin Management App for OOP jsp servlet.
	<br>
	<br>
	<%
		Admin admin = (Admin) request.getAttribute("admin");
	%>

	<form method="POST" action="UpdateAdminServlet">
		<table>
			<tr>
				<td>Index Number</td>
				<td><input type="text" name="indexID" disabled="disabled"
					value="<%=admin.getIndexID()%>" /></td>
			</tr>
			<tr>
				<td>Customer ID</td>
				<td><input type="text" name="customerID"
					value="<%=admin.getCustermorID()%>" /></td>
			</tr>
			<tr>
				<td>Customer Name</td>
				<td><input type="text" name="customerName"
					value="<%=admin.getCustemorName()%>" /></td>
			</tr>
			<tr>
				<td>Driver Name</td>
				<td><input type="text" name="driverName"
					value="<%=admin.getDriverName()%>" /></td>
			</tr>
			<tr>
				<td>Vehicle Number</td>
				<td><input type="text" name="vehicleNumber"
					value="<%=admin.getVehicleNumber()%>" /></td>
			</tr>
			<tr>
				<td>Amount</td>
				<td><input type="text" name="amount"
					value="<%=admin.getAmount()%>" /></td>
			</tr>
			
			<tr>
				<td colspan="2"><input type="hidden" name="indexID"
					value="<%=admin.getIndexID()%>" /> <input type="submit"
					value="Update Admin" class="update-button"/></td>
			</tr>
			
		</table>
	</form>

	<table>
		<tr>
			<td colspan="2">
				<form method="POST" action="DeleteAdminServlet">
					<input type="hidden" name="indexID"
						value="<%=admin.getIndexID()%>" /> <input type="submit"
						value="Delete Admin" class="delete-button"/>
				</form>
			</td>
		</tr>
	</table>

	<jsp:include page="/WEB-INF/views/footer.jsp"></jsp:include>

</body>
</html>