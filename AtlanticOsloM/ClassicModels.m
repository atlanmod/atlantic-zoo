module ClassicModels {

	type AddressInfo {
		Phone_Att : Text;
		AddressLine1_Att : Text;
		AddressLine2_Att : Text;
		City_Att : Text;
		State_Att : Text;
		PostalCode_Att : Text;
		Country_Att : Text;
	};

	type Date {
		Year_Att : Integer32;
		Month_Att : Integer32;
		Day_Att : Integer32;
	};

	type ClassicModels {
		Offices_ContRef : Office*;
		ProductLines_ContRef : ProductLine*;
		Customers_ContRef : Customer*;
	};

	type ProductLine {
		ProductLineOwner_Ref : ClassicModels;
		Products_ContRef : Product*;
		Name_Att : Text;
		TextDescription_Att : Text;
		HtmlDescription_Att : Text;
	};

	type Product {
		ProductLine_Ref : ProductLine;
		Code_Att : Text;
		Name_Att : Text;
		Scale_Att : Text;
		Vendor_Att : Text;
		Description_Att : Text;
		QuantityInStock_Att : Integer32;
		BuyPrice_Att : Double;
		MSRP_Att : Double;
	};

	type Office : AddressInfo {
		OfficeOwner_Ref : ClassicModels;
		Code_Att : Text;
		Employees_ContRef : Employee*;
		Territory_Att : Text;
	};

	type Employee {
		Office_Ref : Office;
		Number_Att : Integer32;
		EmployeeCustomers_Ref : Customer*;
		LastName_Att : Text;
		FirstName_Att : Text;
		Extension_Att : Text;
		Email_Att : Text;
		ReportsTo_Ref : Employee;
		JobTitle_Att : Text;
	};

	type Customer : AddressInfo {
		CustomerOwner_Ref : ClassicModels;
		Number_Att : Integer32;
		Orders_ContRef : Order*;
		Payments_ContRef : Payment*;
		SalesRepEmployee_Ref : Employee;
		Name_Att : Text;
		ContactLastName_Att : Text;
		ContactFirstName_Att : Text;
		CreditLimit_Att : Double;
	};

	type Payment {
		Customer_Ref : Customer;
		CheckNumber_Att : Text;
		Date_ContRef : Date;
		Amount_Att : Double;
	};

	type Order {
		Customer_Ref : Customer;
		OrderDetails_ContRef : OrderDetail*;
		Number_Att : Integer32;
		Date_ContRef : Date;
		RequiredDate_ContRef : Date;
		ShippedDate_ContRef : Date?;
		Status_Att : Text;
		Comments_Att : Text;
	};

	type OrderDetail {
		Order_Ref : Order;
		Product_Ref : Product;
		QuantityOrdered_Att : Integer32;
		PriceEach_Att : Double;
	};
}