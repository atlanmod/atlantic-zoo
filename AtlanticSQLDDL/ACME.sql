CREATE TABLE ACMEFile (
	__IDACMEFile__ Integer NOT NULL,
	PRIMARY KEY ACMEFile (__IDACMEFile__)
) ;

CREATE TABLE ACMEEntry (
	__IDACMEEntry__ Integer NOT NULL,
	PRIMARY KEY ACMEEntry (__IDACMEEntry__)
) ;

CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	PRIMARY KEY Type (__IDType__)
) ;

CREATE TABLE System (
	__IDSystem__ Integer NOT NULL,
	PRIMARY KEY System (__IDSystem__)
) ;

CREATE TABLE Representation (
	__IDRepresentation__ Integer NOT NULL,
	PRIMARY KEY Representation (__IDRepresentation__)
) ;

CREATE TABLE Component (
	__IDComponent__ Integer NOT NULL,
	PRIMARY KEY Component (__IDComponent__)
) ;

CREATE TABLE ComponentInstance (
	__IDComponentInstance__ Integer NOT NULL,
	instanceOf text,
	PRIMARY KEY ComponentInstance (__IDComponentInstance__)
) ;

CREATE TABLE ComponentType (
	__IDComponentType__ Integer NOT NULL,
	extend text,
	PRIMARY KEY ComponentType (__IDComponentType__)
) ;

CREATE TABLE Port (
	__IDPort__ Integer NOT NULL,
	PRIMARY KEY Port (__IDPort__)
) ;

CREATE TABLE Connector (
	__IDConnector__ Integer NOT NULL,
	FOREIGN KEY system (__FKsystem__) REFERENCES System (__IDSystem__),
	PRIMARY KEY Connector (__IDConnector__),
	__FKsystem__ Integer
) ;

CREATE TABLE Role (
	__IDRole__ Integer NOT NULL,
	PRIMARY KEY Role (__IDRole__)
) ;

CREATE TABLE Property (
	__IDProperty__ Integer NOT NULL,
	name text,
	val text,
	PRIMARY KEY Property (__IDProperty__)
) ;

CREATE TABLE Link (
	__IDLink__ Integer NOT NULL,
	FOREIGN KEY systemBinding (__FKsystemBinding__) REFERENCES System (__IDSystem__),
	FOREIGN KEY systemAttachment (__FKsystemAttachment__) REFERENCES System (__IDSystem__),
	PRIMARY KEY Link (__IDLink__),
	__FKsystemAttachment__ Integer,
	__FKsystemBinding__ Integer
) ;

CREATE TABLE Attachment (
	__IDAttachment__ Integer NOT NULL,
	comp text,
	port text,
	con text,
	role text,
	PRIMARY KEY Attachment (__IDAttachment__)
) ;

CREATE TABLE Binding (
	__IDBinding__ Integer NOT NULL,
	compSrc text,
	portSrc text,
	compDest text,
	portDest text,
	PRIMARY KEY Binding (__IDBinding__)
) ;

CREATE TABLE Component_ports_Port (
	__IDComponent__ Integer NOT NULL,
	__IDPort__ Integer NOT NULL
) ;

CREATE TABLE ACMEFile_entries_ACMEEntry (
	__IDACMEFile__ Integer NOT NULL,
	__IDACMEEntry__ Integer NOT NULL
) ;

CREATE TABLE System_componentDeclaration_ComponentInstance (
	__IDSystem__ Integer NOT NULL,
	__IDComponentInstance__ Integer NOT NULL
) ;

CREATE TABLE System_connectorDeclaration_Connector (
	__IDSystem__ Integer NOT NULL,
	__IDConnector__ Integer NOT NULL
) ;

CREATE TABLE Representation_systems_System (
	__IDRepresentation__ Integer NOT NULL,
	__IDSystem__ Integer NOT NULL
) ;

CREATE TABLE System_bindings_Link (
	__IDSystem__ Integer NOT NULL,
	__IDLink__ Integer NOT NULL
) ;

CREATE TABLE System_attachments_Link (
	__IDSystem__ Integer NOT NULL,
	__IDLink__ Integer NOT NULL
) ;

CREATE TABLE Element_representations_Representation (
	__IDElement__ Integer NOT NULL,
	__IDRepresentation__ Integer NOT NULL
) ;

CREATE TABLE Connector_roles_Role (
	__IDConnector__ Integer NOT NULL,
	__IDRole__ Integer NOT NULL
) ;

CREATE TABLE Element_property_Property (
	__IDElement__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;
