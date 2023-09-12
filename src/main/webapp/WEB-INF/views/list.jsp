<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ZED MOT SERVICES<br></h1>
	<h2><br>Employees<br></h2>
	<c:forEach items="${employee}" var="obj1">
 			<p><br>${obj1.toString()} <a href="/deleteEmployee?id=${obj1.getId()}">[Delete Employee]</a> </p>
	</c:forEach>
	<h2><br>Customers<br></h2>
	<c:forEach items="${customer}" var="obj3">
 			<p><br>${obj3.toString()} <a href="/deleteCustomer?id=${obj3.getId()}">[Delete Customer]</a></p>
	</c:forEach>
	<h2><br>Vehicles<br></h2>
	<c:forEach items="${vehicle}" var="obj2">
 			<p><br>${obj2.toString()} <a href="/deleteVehicle?id=${obj2.getVIN()}">[Delete Vehicle]</a></p>
	</c:forEach>
	<h2><br>Vehicle Reports<br></h2>
	<c:forEach items="${report}" var="obj4">
 			<p><br>${obj4.toString()} <a href="/deleteReport?id=${obj4.getId()}">[Delete Report]</a></p>
	</c:forEach>
</body>
</html>