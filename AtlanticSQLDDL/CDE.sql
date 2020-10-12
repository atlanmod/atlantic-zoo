CREATE TABLE IUmlType (
	__IDIUmlType__ Integer NOT NULL,
	PRIMARY KEY IUmlType (__IDIUmlType__)
) ;

CREATE TABLE ICdeComponentSpec (
	__IDICdeComponentSpec__ Integer NOT NULL,
	PRIMARY KEY ICdeComponentSpec (__IDICdeComponentSpec__)
) ;

CREATE TABLE IUmlClass (
	__IDIUmlClass__ Integer NOT NULL,
	PRIMARY KEY IUmlClass (__IDIUmlClass__)
) ;

CREATE TABLE IUmlComponent (
	__IDIUmlComponent__ Integer NOT NULL,
	PRIMARY KEY IUmlComponent (__IDIUmlComponent__)
) ;

CREATE TABLE ICdeServer (
	__IDICdeServer__ Integer NOT NULL,
	PRIMARY KEY ICdeServer (__IDICdeServer__)
) ;

CREATE TABLE ICdeComponent (
	__IDICdeComponent__ Integer NOT NULL,
	PRIMARY KEY ICdeComponent (__IDICdeComponent__)
) ;

CREATE TABLE IUmlMember (
	__IDIUmlMember__ Integer NOT NULL,
	PRIMARY KEY IUmlMember (__IDIUmlMember__)
) ;

CREATE TABLE ICdeMember (
	__IDICdeMember__ Integer NOT NULL,
	PRIMARY KEY ICdeMember (__IDICdeMember__)
) ;

CREATE TABLE ICdeMemberExe (
	__IDICdeMemberExe__ Integer NOT NULL,
	executionPerformance text,
	resourceNeeded text,
	executionDetails text,
	PRIMARY KEY ICdeMemberExe (__IDICdeMemberExe__)
) ;

CREATE TABLE IUmlType_members_IUmlMember (
	__IDIUmlType__ Integer NOT NULL,
	__IDIUmlMember__ Integer NOT NULL
) ;

CREATE TABLE ICdeServer_implements_ICdeComponent (
	__IDICdeServer__ Integer NOT NULL,
	__IDICdeComponent__ Integer NOT NULL
) ;
