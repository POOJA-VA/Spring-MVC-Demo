# Spring-MVC-Demo

# Login Register using Spring-MVC
Developed login and register application using Spring mvc.
 
 
## Description
 
- The user can be able to login and register once login successful, in the home page all the users who have registered will visible.
 
 
## 🛠 Technology used
 
- Spring MVC
- JSP
- JDBC
- CSS
- Bootstrap
- MySQL
 
## 🛠 Tools used
 
- IntelliJ
- MySQL Workbench
 
## 🔲 Architecture
 
- Controller
 
        1. Auth Controller
        2. Home Controller
        3. User Controller
 
- DAO
  
- User Dao
 
- DB
 
        1. Database Connection
 
-Models

User
 
 
## 🔃Working of project
 
- Auth Controller
 
        - Initially Auth Controller starts runs.
        - In web.xml, i have given the servlet mapping url pattern as (/) where in auth Controller in get mapping index .jsp page navigates
        - After submitting the form in index.jsp again the auth controller starts authentication
 
- User Controller
 
        - There will be a register button in index.jsp after clicking it, user.jsp page works.
        - Once after submitting the register user controller runs where it will check validation for field required and password match.
        - Finally the index page navigates where the user can login now.
 
- Home Controller
 
        - After login, the datum in the workbence will  be stored in the list using home Dao.
        - I used the model.addattribute and set the list.
        - Now the page navigates to the home.jsp page where the list will be looped and displayed in the table.
## For Storage purpose,
 
Used MySQL workbench for Storage purpose.
