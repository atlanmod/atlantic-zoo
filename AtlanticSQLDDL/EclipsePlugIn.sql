CREATE TABLE Application (
	__IDApplication__ Integer NOT NULL,
	name text,
	version text,
	author text,
	PRIMARY KEY Application (__IDApplication__)
) ;

CREATE TABLE ExtensionPoint (
	__IDExtensionPoint__ Integer NOT NULL,
	name text,
	id text,
	FOREIGN KEY application (__FKapplication__) REFERENCES Application (__IDApplication__),
	FOREIGN KEY plugIn (__FKplugIn__) REFERENCES PlugIn (__IDPlugIn__),
	PRIMARY KEY ExtensionPoint (__IDExtensionPoint__),
	__FKapplication__ Integer,
	__FKplugIn__ Integer
) ;

CREATE TABLE Description (
	__IDDescription__ Integer NOT NULL,
	xmlSchema text,
	PRIMARY KEY Description (__IDDescription__)
) ;

CREATE TABLE Extension (
	__IDExtension__ Integer NOT NULL,
	name text,
	id text,
	FOREIGN KEY isConfiguredInto (__FKisConfiguredInto__) REFERENCES ExtensionPoint (__IDExtensionPoint__),
	PRIMARY KEY Extension (__IDExtension__),
	__FKisConfiguredInto__ Integer
) ;

CREATE TABLE PlugIn (
	__IDPlugIn__ Integer NOT NULL,
	id text,
	displayableName text,
	version text,
	supplier text,
	PRIMARY KEY PlugIn (__IDPlugIn__)
) ;

CREATE TABLE Librairy (
	__IDLibrairy__ Integer NOT NULL,
	name text,
	FOREIGN KEY plugIn (__FKplugIn__) REFERENCES PlugIn (__IDPlugIn__),
	PRIMARY KEY Librairy (__IDLibrairy__),
	__FKplugIn__ Integer
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	name text,
	FOREIGN KEY librairy (__FKlibrairy__) REFERENCES Librairy (__IDLibrairy__),
	PRIMARY KEY Class (__IDClass__),
	__FKlibrairy__ Integer
) ;

CREATE TABLE Description_extensionPoints_ExtensionPoint (
	__IDDescription__ Integer NOT NULL,
	__IDExtensionPoint__ Integer NOT NULL
) ;

CREATE TABLE ExtensionPoint_descriptions_Description (
	__IDExtensionPoint__ Integer NOT NULL,
	__IDDescription__ Integer NOT NULL
) ;

CREATE TABLE Application_extensionPoints_ExtensionPoint (
	__IDApplication__ Integer NOT NULL,
	__IDExtensionPoint__ Integer NOT NULL
) ;

CREATE TABLE PlugIn_uses_Librairy (
	__IDPlugIn__ Integer NOT NULL,
	__IDLibrairy__ Integer NOT NULL
) ;

CREATE TABLE Librairy_classes_Class (
	__IDLibrairy__ Integer NOT NULL,
	__IDClass__ Integer NOT NULL
) ;

CREATE TABLE PlugIn_extensionPoints_ExtensionPoint (
	__IDPlugIn__ Integer NOT NULL,
	__IDExtensionPoint__ Integer NOT NULL
) ;

CREATE TABLE PlugIn_requires_PlugIn (
	__IDPlugIn__ Integer NOT NULL,
	__IDPlugIn__ Integer NOT NULL
) ;

CREATE TABLE PlugIn_configures_Extension (
	__IDPlugIn__ Integer NOT NULL,
	__IDExtension__ Integer NOT NULL
) ;
