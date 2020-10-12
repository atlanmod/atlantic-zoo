CREATE TABLE METAHFile (
	__IDMETAHFile__ Integer NOT NULL,
	PRIMARY KEY METAHFile (__IDMETAHFile__)
) ;

CREATE TABLE METAHEntry (
	__IDMETAHEntry__ Integer NOT NULL,
	PRIMARY KEY METAHEntry (__IDMETAHEntry__)
) ;

CREATE TABLE Package (
	__IDPackage__ Integer NOT NULL,
	packName text,
	PRIMARY KEY Package (__IDPackage__)
) ;

CREATE TABLE PackageImplementation (
	__IDPackageImplementation__ Integer NOT NULL,
	implementationName text,
	implements text,
	PRIMARY KEY PackageImplementation (__IDPackageImplementation__)
) ;

CREATE TABLE Data (
	__IDData__ Integer NOT NULL,
	dataName text,
	PRIMARY KEY Data (__IDData__)
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	attName text,
	attValue Integer,
	attValueType text,
	attType text,
	PRIMARY KEY Attribute (__IDAttribute__)
) ;

CREATE TABLE ProcessDeclaration (
	__IDProcessDeclaration__ Integer NOT NULL,
	procDecName text,
	PRIMARY KEY ProcessDeclaration (__IDProcessDeclaration__)
) ;

CREATE TABLE ProcessImplementation (
	__IDProcessImplementation__ Integer NOT NULL,
	procImpName text,
	declaration text,
	PRIMARY KEY ProcessImplementation (__IDProcessImplementation__)
) ;

CREATE TABLE ProcessAttribute (
	__IDProcessAttribute__ Integer NOT NULL,
	attName text,
	attValue Integer,
	attValueType text,
	PRIMARY KEY ProcessAttribute (__IDProcessAttribute__)
) ;

CREATE TABLE Process (
	__IDProcess__ Integer NOT NULL,
	procName text,
	periodic text,
	declaration text,
	implementation text,
	PRIMARY KEY Process (__IDProcess__)
) ;

CREATE TABLE Port (
	__IDPort__ Integer NOT NULL,
	portName text,
	portCom text,
	portPackage text,
	portType text,
	PRIMARY KEY Port (__IDPort__)
) ;

CREATE TABLE "Connection" (
	__IDConnection__ Integer NOT NULL,
	compSrc text,
	portSrc text,
	compDest text,
	portDest text,
	PRIMARY KEY "Connection" (__IDConnection__)
) ;

CREATE TABLE MacroDeclaration (
	__IDMacroDeclaration__ Integer NOT NULL,
	name text,
	PRIMARY KEY MacroDeclaration (__IDMacroDeclaration__)
) ;

CREATE TABLE MacroImplementation (
	__IDMacroImplementation__ Integer NOT NULL,
	macroImpName text,
	declaration text,
	PRIMARY KEY MacroImplementation (__IDMacroImplementation__)
) ;

CREATE TABLE ProcessDeclaration_ports_Port (
	__IDProcessDeclaration__ Integer NOT NULL,
	__IDPort__ Integer NOT NULL
) ;

CREATE TABLE ProcessImplementation_processAttributes_ProcessAttribute (
	__IDProcessImplementation__ Integer NOT NULL,
	__IDProcessAttribute__ Integer NOT NULL
) ;

CREATE TABLE MacroImplementation_connections_Connection (
	__IDMacroImplementation__ Integer NOT NULL,
	__IDConnection__ Integer NOT NULL
) ;

CREATE TABLE PackageImplementation_attributes_Attribute (
	__IDPackageImplementation__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;

CREATE TABLE MacroImplementation_process_Process (
	__IDMacroImplementation__ Integer NOT NULL,
	__IDProcess__ Integer NOT NULL
) ;

CREATE TABLE MacroDeclaration_ports_Port (
	__IDMacroDeclaration__ Integer NOT NULL,
	__IDPort__ Integer NOT NULL
) ;

CREATE TABLE Package_data_Data (
	__IDPackage__ Integer NOT NULL,
	__IDData__ Integer NOT NULL
) ;

CREATE TABLE METAHFile_entries_METAHEntry (
	__IDMETAHFile__ Integer NOT NULL,
	__IDMETAHEntry__ Integer NOT NULL
) ;
