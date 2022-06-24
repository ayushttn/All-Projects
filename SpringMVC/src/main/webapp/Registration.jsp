<%--
  Created by IntelliJ IDEA.
  User: ayushtyagi
  Date: 25/05/22
  Time: 5:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html  PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><html>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/free-jqgrid/4.15.5/jquery.jqgrid.min.js"></script>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/free-jqgrid/4.15.5/css/ui.jqgrid.min.css">
    <script type="text/javascript">
        jQuery(document).ready(function () {
            $("#show").click(function () {
                jQuery("#result_table").jqGrid({
                    url: "showAll",
                    datatype: "json",
                    jsonReader: {repeatitems: false, id: "ref"},
                    colNames: ['First Name', 'Last Name', 'Age', 'Gender', 'Address', 'Contact'],
                    colModel: [
                        {name: 'firstName', index: 'firstName', width: 100},
                        {name: 'lastName', index: 'lastName', width: 100},
                        {name: 'age', index: 'age', width: 100},
                        {name: 'gender', index: 'gender', width: 100},
                        {name: 'address', index: 'address', width: 500},
                        {name: 'contactNo', index: 'contactNo', width: 500}
                    ],
                    rowNum: 30,
                    rowList: [10,20,30],
                    height: 250,
                    viewrecords: true,
                    caption: "User Data"
                });
            });
        });
    $(document).ready(function() {
        $("#register").click(function () {
            var developerData = {};
            var addressArray = new Array();
            $("input[name=address]").each(function() {
                addressArray.push($(this).val());
            });
            var contactArray = new Array();
            $("input[name=contact]").each(function() {
                contactArray.push($(this).val());
            });
            $.ajax({
                type: "post",
                url: "/register",
                cache: false,
                data:{
                    "firstName":$("#firstName").val(),
                    "lastName":$("#lastName").val(),
                    "age":$("#age").val(),
                    "gender":$("input[name='gender']:checked").val(),
                    "addresses":addressArray,
                    "contacts":contactArray
                },
                success: function(data){
                    console.log("Success", data);
                    //$('#result_table').text(data.firstName+" "+data.lastName+" "+data.age+" "+data.gender+" ");
                    alert("hi");
                },
                error: function(){
                    alert('Error while request..');
                }
            });
        });
    });
    $(function() {
        $("#addAddress").click(function(e) {
            // var row = $(this).closest('tr').clone();
            // row.find('input').val('');
            // $(this).closest('tr').after("<br/><input type='text' name='address' placeholder='Address'/><br/>");
            $("#newAddress").append("<br/><input type='text' name='address' placeholder='Address'/><br/>");
            e.preventDefault();
        });
    });
    $(function() {
        $("#addContact").click(function(e) {
            // var row = $(this).closest('tr').clone();
            // row.find('input').val('');
            $("#newContact").append("<br/><input type='text' name='contact' placeholder='Contact Number'/><br/>");
            e.preventDefault();
            //$("#table").append("<br/><input type='text' name='contact' placeholder='Contact Number'/><br/>");
            // $('input[type="button"]', row).removeClass('AddNew')
            //     .addClass('RemoveRow').val('Remove item');
        });
    });
</script>
    <style type="text/css">
        label{
            display: inline-block;
            width: 200px;
            margin: 5px 5px 5px 5px;
            text-align: left;
        }
        button{
            margin: 5px 5px 5px 5px;
            padding: 10px;
        }
        input[type=radio]{
            display: inline-block;
            margin-left: 0px;
        }
        input[type=text]{
            display: inline-block;
            width: 200px;
            margin: 5px 5px 5px 5px;
            text-align: left;
        }
    </style>
</head>
<body>
<div class="form-group" align="center">
    <h1>User Registration</h1>
    <table border="1" id="table" class="table table-striped">
        <form name="registerForm" method="post">
            <tr><td>
                First Name:<td><div class="col-sm"><input type="text" name="firstName" id="firstName" value="" placeholder="First Name"></div></td></tr>
            <tr><td>
                Last Name:<td><div class="col-sm"><input type="text" name="lastName" id="lastName" value="" placeholder="Last Name"></div></td></tr>
            <tr><td>
                Age:<td><div class="col-sm"><input type="text" name="age" id="age" value="" placeholder="Age"></div></td></tr>
            <div id="address_div" class="row">
                <tr><td>
                    Address:<td><div class="col-lg" id="newAddress"><input name="address" type="text" id="address" placeholder="Address">
                    <button id="addAddress" class="btn btn-secondary">Add Address</button></div></td></tr>
            </div>
            <div class="row" id="contact_div">
                <tr><td>
                    Contact No:<td><div class="col-lg" id="newContact"> <input name="contact" type="text" id="contact" placeholder="Contact Number">
                    <button id="addContact" class="btn btn-secondary">Add Contact</button></div></td></tr>
            </div>
            <tr><td>
                <label name="gender" id="gender">Gender:</label><td><div class="col-sm">
                <input type="radio" name="gender" value="Male" id="male"/>Male
                <input type="radio" name="gender" value="Female" id="female"/>Female
                <input type="radio" name="gender" value="Other" id="other"/>Other
                </div>
            </td></tr>
            <tr align="center"><td>
                <button type="button" id="register" class="btn btn-primary">Register</button>
                <td>
                <button type="button" id="show" class="btn btn-primary">Show Data</button>
            </td></tr>
        </form>
    </table>
</div>
<div id="result" align="center">
    <table id="result_table" border="2" class="table table-striped">

    </table>
</div>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script></body>
</body>
</html>

