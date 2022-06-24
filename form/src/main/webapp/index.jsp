<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html  PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<head>
    <title>Registration Form</title>
    <script>
        $(document).ready(function(){
            $("button").click(function(){
                $.ajax({
                    type:'post',
                    data:'firstName=' + $("#firstName").val() + "&lastName=" + $("#lastName").val() + "&age=" + $("#age").val() + "&address=" + $("#address").val() + "&gender=" + $("#gender").val(),
                    url:'/form/add.htm',
                    success: function (response){
                        $('#result').html("");
                        alert("111")
                        //var obj = JSON.parse(response);
                        //$('#result').html("First Name:- " + obj.firstName +"</br>Last Name:- " + obj.lastName  + "</br>Age:- " + obj.age + "</br>Address:- " + obj.address + "</br>Gender:- " + obj.gender);
                    },
                    error: function(){
                        alert('Error while request..');
                    }
                });
            });
        });
    </script>
</head>
<body>
<form name="FormServlet" method="post">
    First Name: <input id = "firstName" type="text" name="firstName"/><br>
    Last Name:  <input id = "lastName" type="text" name="lastName"/><br>
    Age: <input id = "age" type="number" name="age"/><br>
    Address: <input id = "address" type="text" name="address"/><br>
    <label for="gender">Gender</label>
    <select id = "gender" name="gender">
        <option value="none" selected>Gender</option>
        <option value="male">Male</option>
        <option value="female">Female</option>
        <option value="other">Other</option>
    </select><br>
    <button>Register</button>
</form>
</body>
</html>