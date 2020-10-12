CREATE TABLE Project (
	__IDProject__ Integer NOT NULL,
	id text,
	groupId text,
	artifactId text,
	name text,
	description text,
	FOREIGN KEY build (__FKbuild__) REFERENCES Build (__IDBuild__),
	PRIMARY KEY Project (__IDProject__),
	__FKbuild__ Integer
) ;

CREATE TABLE Build (
	__IDBuild__ Integer NOT NULL,
	defaultGoal text,
	sourceDirectory text,
	unitTestSourceDirectory text,
	PRIMARY KEY Build (__IDBuild__)
) ;

CREATE TABLE Resource (
	__IDResource__ Integer NOT NULL,
	targetPath text,
	filtering text,
	directory text,
	includes text,
	excludes text,
	PRIMARY KEY Resource (__IDResource__)
) ;

CREATE TABLE MailingList (
	__IDMailingList__ Integer NOT NULL,
	name text,
	subscribe text,
	unsubscribe text,
	post text,
	archive text,
	otherArchives text,
	PRIMARY KEY MailingList (__IDMailingList__)
) ;

CREATE TABLE Person (
	__IDPerson__ Integer NOT NULL,
	name text,
	email text,
	url text,
	organization text,
	organizationUrl text,
	roles text,
	timezone text,
	properties text,
	PRIMARY KEY Person (__IDPerson__)
) ;

CREATE TABLE Developer (
	__IDDeveloper__ Integer NOT NULL,
	id text,
	PRIMARY KEY Developer (__IDDeveloper__)
) ;

CREATE TABLE Contributor (
	__IDContributor__ Integer NOT NULL,
	PRIMARY KEY Contributor (__IDContributor__)
) ;

CREATE TABLE Build_resources_Resource (
	__IDBuild__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE Project_mailingLists_MailingList (
	__IDProject__ Integer NOT NULL,
	__IDMailingList__ Integer NOT NULL
) ;

CREATE TABLE Project_developersAndContributors_Person (
	__IDProject__ Integer NOT NULL,
	__IDPerson__ Integer NOT NULL
) ;

CREATE TABLE Build_uniTest_Resource (
	__IDBuild__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE Project_dependencies_Project (
	__IDProject__ Integer NOT NULL,
	__IDProject__ Integer NOT NULL
) ;
