CREATE TABLE MantisRoot (
	__IDMantisRoot__ Integer NOT NULL,
	PRIMARY KEY MantisRoot (__IDMantisRoot__)
) ;

CREATE TABLE IdentifiedElt (
	__IDIdentifiedElt__ Integer NOT NULL,
	id Integer,
	PRIMARY KEY IdentifiedElt (__IDIdentifiedElt__)
) ;

CREATE TABLE PrivateElt (
	__IDPrivateElt__ Integer NOT NULL,
	private Boolean,
	PRIMARY KEY PrivateElt (__IDPrivateElt__)
) ;

CREATE TABLE Issue (
	__IDIssue__ Integer NOT NULL,
	FOREIGN KEY i_mantisRoot (__FKi_mantisRoot__) REFERENCES MantisRoot (__IDMantisRoot__),
	FOREIGN KEY project (__FKproject__) REFERENCES ValueWithId (__IDValueWithId__),
	category text,
	FOREIGN KEY priority (__FKpriority__) REFERENCES ValueWithId (__IDValueWithId__),
	FOREIGN KEY severity (__FKseverity__) REFERENCES ValueWithId (__IDValueWithId__),
	FOREIGN KEY status (__FKstatus__) REFERENCES ValueWithId (__IDValueWithId__),
	FOREIGN KEY reporter (__FKreporter__) REFERENCES Person (__IDPerson__),
	summary text,
	description text,
	version text,
	build text,
	platform text,
	os text,
	osVersion text,
	FOREIGN KEY reproducibility (__FKreproducibility__) REFERENCES ValueWithId (__IDValueWithId__),
	stepsToReproduce text,
	additionalInfo text,
	dateSubmitted Integer,
	FOREIGN KEY assignedTo (__FKassignedTo__) REFERENCES Person (__IDPerson__),
	FOREIGN KEY projection (__FKprojection__) REFERENCES ValueWithId (__IDValueWithId__),
	FOREIGN KEY eta (__FKeta__) REFERENCES ValueWithId (__IDValueWithId__),
	FOREIGN KEY resolution (__FKresolution__) REFERENCES ValueWithId (__IDValueWithId__),
	fixedInVersion text,
	lastUpdate Integer,
	PRIMARY KEY Issue (__IDIssue__),
	__FKprojection__ Integer,
	__FKassignedTo__ Integer,
	__FKreporter__ Integer,
	__FKstatus__ Integer,
	__FKseverity__ Integer,
	__FKi_mantisRoot__ Integer,
	__FKproject__ Integer,
	__FKpriority__ Integer,
	__FKreproducibility__ Integer,
	__FKeta__ Integer,
	__FKresolution__ Integer
) ;

CREATE TABLE ValueWithId (
	__IDValueWithId__ Integer NOT NULL,
	value text,
	PRIMARY KEY ValueWithId (__IDValueWithId__)
) ;

CREATE TABLE Person (
	__IDPerson__ Integer NOT NULL,
	login text,
	PRIMARY KEY Person (__IDPerson__)
) ;

CREATE TABLE Relationship (
	__IDRelationship__ Integer NOT NULL,
	type text,
	PRIMARY KEY Relationship (__IDRelationship__)
) ;

CREATE TABLE TimeStampedElt (
	__IDTimeStampedElt__ Integer NOT NULL,
	timestamp Integer,
	PRIMARY KEY TimeStampedElt (__IDTimeStampedElt__)
) ;

CREATE TABLE Note (
	__IDNote__ Integer NOT NULL,
	FOREIGN KEY author (__FKauthor__) REFERENCES Person (__IDPerson__),
	text text,
	PRIMARY KEY Note (__IDNote__),
	__FKauthor__ Integer
) ;

CREATE TABLE Attachment (
	__IDAttachment__ Integer NOT NULL,
	filename text,
	size Integer,
	contentType text,
	downloadUrl text,
	PRIMARY KEY Attachment (__IDAttachment__)
) ;

CREATE TABLE MantisRoot_issues_Issue (
	__IDMantisRoot__ Integer NOT NULL,
	__IDIssue__ Integer NOT NULL
) ;

CREATE TABLE Issue_attachments_Attachment (
	__IDIssue__ Integer NOT NULL,
	__IDAttachment__ Integer NOT NULL
) ;

CREATE TABLE Issue_relationships_Relationship (
	__IDIssue__ Integer NOT NULL,
	__IDRelationship__ Integer NOT NULL
) ;

CREATE TABLE Issue_notes_Note (
	__IDIssue__ Integer NOT NULL,
	__IDNote__ Integer NOT NULL
) ;
