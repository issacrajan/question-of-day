## CRUD operations using JDBC
Create tables using the file: tables_detail.sql

#### Table Names
1. employee
2. employee_address
3. employee_login_logout

#### Use JDBC for all insert / updates.

#### create a Spring boot app.
#### add web, database driver (mysql / postgresql)

#### create endpoints for below operations using REST controllers
* /employee/create  -- POST
* /employee/update  -- PUT
* /employee/listall -- GET 


#### sample Payload
{ "EmployeeId": "1001",
  "EmployeeName": "Name1",
  "JoinDate": "2000-01-14"
}

#### create endpoints for Login time and Logout time
* /employee/login -- POST
* /employee/logout -- PUT

{ "EmployeeId": "1001",
  "LoginDate": "2000-01-14",
  "loginTs": "2000-01-14 10:12:00"
}

