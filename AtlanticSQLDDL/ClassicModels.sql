CREATE TABLE AddressInfo (
	__IDAddressInfo__ Integer NOT NULL,
	phone text,
	addressLine1 text,
	addressLine2 text,
	city text,
	state text,
	postalCode text,
	country text,
	PRIMARY KEY AddressInfo (__IDAddressInfo__)
) ;

CREATE TABLE Date (
	__IDDate__ Integer NOT NULL,
	year Integer,
	month Integer,
	day Integer,
	PRIMARY KEY Date (__IDDate__)
) ;

CREATE TABLE ClassicModels (
	__IDClassicModels__ Integer NOT NULL,
	PRIMARY KEY ClassicModels (__IDClassicModels__)
) ;

CREATE TABLE ProductLine (
	__IDProductLine__ Integer NOT NULL,
	FOREIGN KEY productLineOwner (__FKproductLineOwner__) REFERENCES ClassicModels (__IDClassicModels__),
	name text,
	textDescription text,
	htmlDescription text,
	PRIMARY KEY ProductLine (__IDProductLine__),
	__FKproductLineOwner__ Integer
) ;

CREATE TABLE Product (
	__IDProduct__ Integer NOT NULL,
	FOREIGN KEY productLine (__FKproductLine__) REFERENCES ProductLine (__IDProductLine__),
	code text,
	name text,
	scale text,
	vendor text,
	description text,
	quantityInStock Integer,
	buyPrice "Double",
	MSRP "Double",
	PRIMARY KEY Product (__IDProduct__),
	__FKproductLine__ Integer
) ;

CREATE TABLE Office (
	__IDOffice__ Integer NOT NULL,
	FOREIGN KEY officeOwner (__FKofficeOwner__) REFERENCES ClassicModels (__IDClassicModels__),
	code text,
	territory text,
	PRIMARY KEY Office (__IDOffice__),
	__FKofficeOwner__ Integer
) ;

CREATE TABLE Employee (
	__IDEmployee__ Integer NOT NULL,
	FOREIGN KEY office (__FKoffice__) REFERENCES Office (__IDOffice__),
	number Integer,
	lastName text,
	firstName text,
	extension text,
	email text,
	FOREIGN KEY reportsTo (__FKreportsTo__) REFERENCES Employee (__IDEmployee__),
	jobTitle text,
	PRIMARY KEY Employee (__IDEmployee__),
	__FKoffice__ Integer,
	__FKreportsTo__ Integer
) ;

CREATE TABLE Customer (
	__IDCustomer__ Integer NOT NULL,
	FOREIGN KEY customerOwner (__FKcustomerOwner__) REFERENCES ClassicModels (__IDClassicModels__),
	number Integer,
	FOREIGN KEY salesRepEmployee (__FKsalesRepEmployee__) REFERENCES Employee (__IDEmployee__),
	name text,
	contactLastName text,
	contactFirstName text,
	creditLimit "Double",
	PRIMARY KEY Customer (__IDCustomer__),
	__FKsalesRepEmployee__ Integer,
	__FKcustomerOwner__ Integer
) ;

CREATE TABLE Payment (
	__IDPayment__ Integer NOT NULL,
	FOREIGN KEY customer (__FKcustomer__) REFERENCES Customer (__IDCustomer__),
	checkNumber text,
	FOREIGN KEY date (__FKdate__) REFERENCES Date (__IDDate__),
	amount "Double",
	PRIMARY KEY Payment (__IDPayment__),
	__FKdate__ Integer,
	__FKcustomer__ Integer
) ;

CREATE TABLE "Order" (
	__IDOrder__ Integer NOT NULL,
	FOREIGN KEY customer (__FKcustomer__) REFERENCES Customer (__IDCustomer__),
	number Integer,
	FOREIGN KEY date (__FKdate__) REFERENCES Date (__IDDate__),
	FOREIGN KEY requiredDate (__FKrequiredDate__) REFERENCES Date (__IDDate__),
	FOREIGN KEY shippedDate (__FKshippedDate__) REFERENCES Date (__IDDate__),
	status text,
	comments text,
	PRIMARY KEY "Order" (__IDOrder__),
	__FKrequiredDate__ Integer,
	__FKcustomer__ Integer,
	__FKshippedDate__ Integer,
	__FKdate__ Integer
) ;

CREATE TABLE OrderDetail (
	__IDOrderDetail__ Integer NOT NULL,
	FOREIGN KEY "order" (__FKorder__) REFERENCES "Order" (__IDOrder__),
	FOREIGN KEY product (__FKproduct__) REFERENCES Product (__IDProduct__),
	quantityOrdered Integer,
	priceEach "Double",
	PRIMARY KEY OrderDetail (__IDOrderDetail__),
	__FKorder__ Integer,
	__FKproduct__ Integer
) ;

CREATE TABLE Employee_employeeCustomers_Customer (
	__IDEmployee__ Integer NOT NULL,
	__IDCustomer__ Integer NOT NULL
) ;

CREATE TABLE ClassicModels_customers_Customer (
	__IDClassicModels__ Integer NOT NULL,
	__IDCustomer__ Integer NOT NULL
) ;

CREATE TABLE Customer_orders_Order (
	__IDCustomer__ Integer NOT NULL,
	__IDOrder__ Integer NOT NULL
) ;

CREATE TABLE Office_employees_Employee (
	__IDOffice__ Integer NOT NULL,
	__IDEmployee__ Integer NOT NULL
) ;

CREATE TABLE Customer_payments_Payment (
	__IDCustomer__ Integer NOT NULL,
	__IDPayment__ Integer NOT NULL
) ;

CREATE TABLE ProductLine_products_Product (
	__IDProductLine__ Integer NOT NULL,
	__IDProduct__ Integer NOT NULL
) ;

CREATE TABLE Order_orderDetails_OrderDetail (
	__IDOrder__ Integer NOT NULL,
	__IDOrderDetail__ Integer NOT NULL
) ;

CREATE TABLE ClassicModels_offices_Office (
	__IDClassicModels__ Integer NOT NULL,
	__IDOffice__ Integer NOT NULL
) ;

CREATE TABLE ClassicModels_productLines_ProductLine (
	__IDClassicModels__ Integer NOT NULL,
	__IDProductLine__ Integer NOT NULL
) ;
