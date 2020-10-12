CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY ModelElement (__IDModelElement__)
) ;

CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	PRIMARY KEY Classifier (__IDClassifier__)
) ;

CREATE TABLE Operation (
	__IDOperation__ Integer NOT NULL,
	PRIMARY KEY Operation (__IDOperation__)
) ;

CREATE TABLE Service (
	__IDService__ Integer NOT NULL,
	PRIMARY KEY Service (__IDService__)
) ;

CREATE TABLE BusinessObject (
	__IDBusinessObject__ Integer NOT NULL,
	PRIMARY KEY BusinessObject (__IDBusinessObject__)
) ;

CREATE TABLE ServiceOperation (
	__IDServiceOperation__ Integer NOT NULL,
	PRIMARY KEY ServiceOperation (__IDServiceOperation__)
) ;

CREATE TABLE BusinessObjectOperation (
	__IDBusinessObjectOperation__ Integer NOT NULL,
	PRIMARY KEY BusinessObjectOperation (__IDBusinessObjectOperation__)
) ;

CREATE TABLE BusinessRule (
	__IDBusinessRule__ Integer NOT NULL,
	expr text,
	PRIMARY KEY BusinessRule (__IDBusinessRule__)
) ;

CREATE TABLE Flow (
	__IDFlow__ Integer NOT NULL,
	source text,
	target text,
	PRIMARY KEY Flow (__IDFlow__)
) ;

CREATE TABLE Service2BusinessObjectFlow (
	__IDService2BusinessObjectFlow__ Integer NOT NULL,
	PRIMARY KEY Service2BusinessObjectFlow (__IDService2BusinessObjectFlow__)
) ;

CREATE TABLE BusinessObjectOperation_rules_BusinessRule (
	__IDBusinessObjectOperation__ Integer NOT NULL,
	__IDBusinessRule__ Integer NOT NULL
) ;

CREATE TABLE ServiceOperation_BOFlows_Service2BusinessObjectFlow (
	__IDServiceOperation__ Integer NOT NULL,
	__IDService2BusinessObjectFlow__ Integer NOT NULL
) ;

CREATE TABLE BusinessObject_operations_BusinessObjectOperation (
	__IDBusinessObject__ Integer NOT NULL,
	__IDBusinessObjectOperation__ Integer NOT NULL
) ;

CREATE TABLE ServiceOperation_rules_BusinessRule (
	__IDServiceOperation__ Integer NOT NULL,
	__IDBusinessRule__ Integer NOT NULL
) ;

CREATE TABLE Service_operations_ServiceOperation (
	__IDService__ Integer NOT NULL,
	__IDServiceOperation__ Integer NOT NULL
) ;
