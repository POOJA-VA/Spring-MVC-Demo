<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Registration</title>
</head>
<body>
    <form:form action="/processRegister" modelAttribute="user">
        <h1>Student Information</h1>

        <div>
            <label for="name">Name:</label>
            <form:input path="name" id="name" />
        </div>

        <div>
            <label for="email">Email:</label>
            <form:input path="email" id="email" />
        </div>

        <div>
            <label for="password">Password:</label>
            <form:password path="password" id="password" />
        </div>

        <div>
            <label for="bloodGroup">Blood Group:</label>
            <form:select path="bloodGroup" id="bloodGroup">
                <form:option value="A+" label="A+" />
                <form:option value="A-" label="A-" />
                <form:option value="B+" label="B+" />
                <form:option value="B-" label="B-" />
                <form:option value="O+" label="O+" />
                <form:option value="O-" label="O-" />
                <form:option value="AB+" label="AB+" />
                <form:option value="AB-" label="AB-" />
            </form:select>
        </div>

        <div>
            <input type="submit" value="Submit" />
        </div>
    </form:form>
</body>
</html>