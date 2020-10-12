CREATE TABLE LaunchConfiguration (
	__IDLaunchConfiguration__ Integer NOT NULL,
	type text,
	PRIMARY KEY LaunchConfiguration (__IDLaunchConfiguration__)
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	"key" text,
	PRIMARY KEY Attribute (__IDAttribute__)
) ;

CREATE TABLE StringAttribute (
	__IDStringAttribute__ Integer NOT NULL,
	value text,
	PRIMARY KEY StringAttribute (__IDStringAttribute__)
) ;

CREATE TABLE BooleanAttribute (
	__IDBooleanAttribute__ Integer NOT NULL,
	value Boolean,
	PRIMARY KEY BooleanAttribute (__IDBooleanAttribute__)
) ;

CREATE TABLE MapAttribute (
	__IDMapAttribute__ Integer NOT NULL,
	PRIMARY KEY MapAttribute (__IDMapAttribute__)
) ;

CREATE TABLE MapEntry (
	__IDMapEntry__ Integer NOT NULL,
	FOREIGN KEY mapAttribute (__FKmapAttribute__) REFERENCES MapAttribute (__IDMapAttribute__),
	PRIMARY KEY MapEntry (__IDMapEntry__),
	__FKmapAttribute__ Integer
) ;

CREATE TABLE ListAttribute (
	__IDListAttribute__ Integer NOT NULL,
	PRIMARY KEY ListAttribute (__IDListAttribute__)
) ;

CREATE TABLE ListEntry (
	__IDListEntry__ Integer NOT NULL,
	FOREIGN KEY listAttribute (__FKlistAttribute__) REFERENCES ListAttribute (__IDListAttribute__),
	value text,
	PRIMARY KEY ListEntry (__IDListEntry__),
	__FKlistAttribute__ Integer
) ;

CREATE TABLE LaunchConfiguration_attributes_Attribute (
	__IDLaunchConfiguration__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;

CREATE TABLE MapAttribute_entries_MapEntry (
	__IDMapAttribute__ Integer NOT NULL,
	__IDMapEntry__ Integer NOT NULL
) ;

CREATE TABLE ListAttribute_entries_ListEntry (
	__IDListAttribute__ Integer NOT NULL,
	__IDListEntry__ Integer NOT NULL
) ;
