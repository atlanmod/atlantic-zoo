CREATE TABLE Company (
	__IDCompany__ Integer NOT NULL,
	FOREIGN KEY corporateHQ (__FKcorporateHQ__) REFERENCES CorporateHQ (__IDCorporateHQ__),
	PRIMARY KEY Company (__IDCompany__),
	__FKcorporateHQ__ Integer
) ;

CREATE TABLE CorporateHQ (
	__IDCorporateHQ__ Integer NOT NULL,
	FOREIGN KEY corporateHQBackOffice (__FKcorporateHQBackOffice__) REFERENCES CorporateHQBackOffice (__IDCorporateHQBackOffice__),
	PRIMARY KEY CorporateHQ (__IDCorporateHQ__),
	__FKcorporateHQBackOffice__ Integer
) ;

CREATE TABLE Store (
	__IDStore__ Integer NOT NULL,
	FOREIGN KEY storeBackOffice (__FKstoreBackOffice__) REFERENCES StoreBackOffice (__IDStoreBackOffice__),
	PRIMARY KEY Store (__IDStore__),
	__FKstoreBackOffice__ Integer
) ;

CREATE TABLE CorporateHQBackOffice (
	__IDCorporateHQBackOffice__ Integer NOT NULL,
	PRIMARY KEY CorporateHQBackOffice (__IDCorporateHQBackOffice__)
) ;

CREATE TABLE StoreBackOffice (
	__IDStoreBackOffice__ Integer NOT NULL,
	PRIMARY KEY StoreBackOffice (__IDStoreBackOffice__)
) ;

CREATE TABLE Employee (
	__IDEmployee__ Integer NOT NULL,
	PRIMARY KEY Employee (__IDEmployee__)
) ;

CREATE TABLE CashRegister (
	__IDCashRegister__ Integer NOT NULL,
	PRIMARY KEY CashRegister (__IDCashRegister__)
) ;

CREATE TABLE Store_employee_Employee (
	__IDStore__ Integer NOT NULL,
	__IDEmployee__ Integer NOT NULL
) ;

CREATE TABLE Company_Store_Store (
	__IDCompany__ Integer NOT NULL,
	__IDStore__ Integer NOT NULL
) ;

CREATE TABLE Store_cashRegister_CashRegister (
	__IDStore__ Integer NOT NULL,
	__IDCashRegister__ Integer NOT NULL
) ;

CREATE TABLE CorporateHQ_manages_Store (
	__IDCorporateHQ__ Integer NOT NULL,
	__IDStore__ Integer NOT NULL
) ;
