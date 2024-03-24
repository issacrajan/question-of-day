create table employee(
employee_id varchar(20) not null,
	employee_name varchar(100) not null,
	join_date date,
	constraint  employee_pkey primary key (employee_id)
);

create table employee_address(
employee_id varchar(20) not null,
	effective_date date not null,
	address_line1 varchar(100),
	address_city varchar(100),
	constraint employee_address_pkey primary key (employee_id, effective_date)
);

create table employee_login_logout(
employee_id varchar(20) not null,
	login_date date not null,
	login_time timestamp, 
	logout_time timestamp, 
	constraint employee_log_pkey primary key  (employee_id, login_date)
);
