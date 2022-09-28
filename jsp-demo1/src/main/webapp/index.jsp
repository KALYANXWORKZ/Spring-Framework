<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Prime Minister Details</h1>
<form action="pm" method="post">
Prime Minister Name : <input type="text" id="name" name="primeMinisterName"><br><br>
Prime Minister country : 
<label for="country">Choose a Country:</label>

<select name="country" id="coun">
  <option value="India">India</option>
  <option value="Us">USA</option>
  <option value="spain">Spain</option>
  <option value="UK">UK</option>
</select>
 <br><br>

Marriage : <input type="radio" id="marriage" name="status" value="Married">Married
		   <input type="radio" id="marriage" name="status" value="Unmarried">Unmarried <br><br>

Party : <select name="PartyName">
<option>Select</option>
<option value="BJP">BJP</option>
<option value="Congress">CONGRESS</option>
<option value="BJP">JDS</option>
</select>  <br><br>
Age : <input type="text" id="age" name="primeMinisterAge"> <br><br>

Gender : <input type="radio" id="gender" name="primeMinisterGender" value="male">Male
<input type="radio" id="gender" name="primeMinisterGender" value="female">Female
<input type="radio" id="gender" name="primeMinisterGender" value="others">Others <br><br>

Period : <input type="text" id="period" name="primeMinisterPeriod"> <br><br>

Times Represented : <select id="Times" name="timesRepresented">
<option>SELECT</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6  </option>
</select> <br><br>

<input type="submit" value="Submit"> 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="reset" value="Clear">

</form>

</body>
</html>