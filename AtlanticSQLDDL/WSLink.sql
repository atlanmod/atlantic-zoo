CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE Network (
	__IDNetwork__ Integer NOT NULL,
	name text,
	PRIMARY KEY Network (__IDNetwork__)
) ;

CREATE TABLE Services (
	__IDServices__ Integer NOT NULL,
	name text,
	URL text,
	descriptions text,
	PRIMARY KEY Services (__IDServices__)
) ;

CREATE TABLE WebService (
	__IDWebService__ Integer NOT NULL,
	PRIMARY KEY WebService (__IDWebService__)
) ;

CREATE TABLE RSS (
	__IDRSS__ Integer NOT NULL,
	PRIMARY KEY RSS (__IDRSS__)
) ;

CREATE TABLE Network_services_Services (
	__IDNetwork__ Integer NOT NULL,
	__IDServices__ Integer NOT NULL
) ;

CREATE TABLE WebService_linkedServices_Services (
	__IDWebService__ Integer NOT NULL,
	__IDServices__ Integer NOT NULL
) ;
