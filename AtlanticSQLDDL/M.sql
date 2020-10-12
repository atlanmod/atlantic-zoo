CREATE TABLE IdentifiedElement (
	__IDIdentifiedElement__ Integer NOT NULL,
	identifier text,
	PRIMARY KEY IdentifiedElement (__IDIdentifiedElement__)
) ;

CREATE TABLE MElement (
	__IDMElement__ Integer NOT NULL,
	PRIMARY KEY MElement (__IDMElement__)
) ;

CREATE TABLE MElementReference (
	__IDMElementReference__ Integer NOT NULL,
	alias text,
	FOREIGN KEY referencedElement (__FKreferencedElement__) REFERENCES MElement (__IDMElement__),
	PRIMARY KEY MElementReference (__IDMElementReference__),
	__FKreferencedElement__ Integer
) ;

CREATE TABLE Module (
	__IDModule__ Integer NOT NULL,
	PRIMARY KEY Module (__IDModule__)
) ;

CREATE TABLE ModuleMember (
	__IDModuleMember__ Integer NOT NULL,
	FOREIGN KEY module (__FKmodule__) REFERENCES Module (__IDModule__),
	PRIMARY KEY ModuleMember (__IDModuleMember__),
	__FKmodule__ Integer
) ;

CREATE TABLE ImportDirective (
	__IDImportDirective__ Integer NOT NULL,
	FOREIGN KEY module (__FKmodule__) REFERENCES Module (__IDModule__),
	PRIMARY KEY ImportDirective (__IDImportDirective__),
	__FKmodule__ Integer
) ;

CREATE TABLE ExportDirective (
	__IDExportDirective__ Integer NOT NULL,
	FOREIGN KEY module (__FKmodule__) REFERENCES Module (__IDModule__),
	PRIMARY KEY ExportDirective (__IDExportDirective__),
	__FKmodule__ Integer
) ;

CREATE TABLE Value (
	__IDValue__ Integer NOT NULL,
	PRIMARY KEY Value (__IDValue__)
) ;

CREATE TABLE NumericalValue (
	__IDNumericalValue__ Integer NOT NULL,
	PRIMARY KEY NumericalValue (__IDNumericalValue__)
) ;

CREATE TABLE StringValue (
	__IDStringValue__ Integer NOT NULL,
	value text,
	PRIMARY KEY StringValue (__IDStringValue__)
) ;

CREATE TABLE IntegerValue (
	__IDIntegerValue__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY IntegerValue (__IDIntegerValue__)
) ;

CREATE TABLE DecimalValue (
	__IDDecimalValue__ Integer NOT NULL,
	value "Double",
	PRIMARY KEY DecimalValue (__IDDecimalValue__)
) ;

CREATE TABLE BooleanValue (
	__IDBooleanValue__ Integer NOT NULL,
	value Boolean,
	PRIMARY KEY BooleanValue (__IDBooleanValue__)
) ;

CREATE TABLE Module_imports_ImportDirective (
	__IDModule__ Integer NOT NULL,
	__IDImportDirective__ Integer NOT NULL
) ;

CREATE TABLE Module_exports_ExportDirective (
	__IDModule__ Integer NOT NULL,
	__IDExportDirective__ Integer NOT NULL
) ;

CREATE TABLE Module_moduleMembers_ModuleMember (
	__IDModule__ Integer NOT NULL,
	__IDModuleMember__ Integer NOT NULL
) ;

CREATE TABLE ImportDirective_importedElements_MElementReference (
	__IDImportDirective__ Integer NOT NULL,
	__IDMElementReference__ Integer NOT NULL
) ;

CREATE TABLE ExportDirective_exportedElements_ModuleMember (
	__IDExportDirective__ Integer NOT NULL,
	__IDModuleMember__ Integer NOT NULL
) ;
