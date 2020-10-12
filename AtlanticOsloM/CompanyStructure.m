module CompanyStructure {

	type Company {
		CorporateHQ_ContRef : CorporateHQ;
		Store_ContRef : Store*;
	};

	type CorporateHQ {
		Manages_Ref : Store*;
		CorporateHQBackOffice_ContRef : CorporateHQBackOffice;
	};

	type Store {
		StoreBackOffice_ContRef : StoreBackOffice;
		Employee_ContRef : Employee*;
		CashRegister_ContRef : CashRegister*;
	};

	type CorporateHQBackOffice;

	type StoreBackOffice;

	type Employee;

	type CashRegister;
}