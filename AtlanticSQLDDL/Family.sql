CREATE TABLE Family (
	__IDFamily__ Integer NOT NULL,
	name text,
	PRIMARY KEY Family (__IDFamily__)
) ;

CREATE TABLE Person (
	__IDPerson__ Integer NOT NULL,
	firstName text,
	FOREIGN KEY closestFriend (__FKclosestFriend__) REFERENCES Person (__IDPerson__),
	PRIMARY KEY Person (__IDPerson__),
	__FKclosestFriend__ Integer
) ;

CREATE TABLE Family_members_Person (
	__IDFamily__ Integer NOT NULL,
	__IDPerson__ Integer NOT NULL
) ;
