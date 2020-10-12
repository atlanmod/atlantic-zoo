CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE "Database" (
	__IDDatabase__ Integer NOT NULL,
	PRIMARY KEY "Database" (__IDDatabase__)
) ;

CREATE TABLE "Table" (
	__IDTable__ Integer NOT NULL,
	FOREIGN KEY "database" (__FKdatabase__) REFERENCES "Database" (__IDDatabase__),
	PRIMARY KEY "Table" (__IDTable__),
	__FKdatabase__ Integer
) ;

CREATE TABLE TableElement (
	__IDTableElement__ Integer NOT NULL,
	FOREIGN KEY "table" (__FKtable__) REFERENCES "Table" (__IDTable__),
	PRIMARY KEY TableElement (__IDTableElement__),
	__FKtable__ Integer
) ;

CREATE TABLE "Column" (
	__IDColumn__ Integer NOT NULL,
	name text,
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	canBeNull Boolean,
	FOREIGN KEY "default" (__FKdefault__) REFERENCES Value (__IDValue__),
	PRIMARY KEY "Column" (__IDColumn__),
	__FKdefault__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE "Key" (
	__IDKey__ Integer NOT NULL,
	isUnique Boolean,
	name text,
	PRIMARY KEY "Key" (__IDKey__)
) ;

CREATE TABLE SimpleKey (
	__IDSimpleKey__ Integer NOT NULL,
	PRIMARY KEY SimpleKey (__IDSimpleKey__)
) ;

CREATE TABLE PrimaryKey (
	__IDPrimaryKey__ Integer NOT NULL,
	PRIMARY KEY PrimaryKey (__IDPrimaryKey__)
) ;

CREATE TABLE ForeignKey (
	__IDForeignKey__ Integer NOT NULL,
	FOREIGN KEY referencedTable (__FKreferencedTable__) REFERENCES "Table" (__IDTable__),
	PRIMARY KEY ForeignKey (__IDForeignKey__),
	__FKreferencedTable__ Integer
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	isUnsigned Boolean,
	PRIMARY KEY Type (__IDType__)
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	FOREIGN KEY "table" (__FKtable__) REFERENCES "Table" (__IDTable__),
	FOREIGN KEY value (__FKvalue__) REFERENCES Value (__IDValue__),
	PRIMARY KEY Parameter (__IDParameter__),
	__FKvalue__ Integer,
	__FKtable__ Integer
) ;

CREATE TABLE Value (
	__IDValue__ Integer NOT NULL,
	PRIMARY KEY Value (__IDValue__)
) ;

CREATE TABLE IntegerVal (
	__IDIntegerVal__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY IntegerVal (__IDIntegerVal__)
) ;

CREATE TABLE NullVal (
	__IDNullVal__ Integer NOT NULL,
	PRIMARY KEY NullVal (__IDNullVal__)
) ;

CREATE TABLE StringVal (
	__IDStringVal__ Integer NOT NULL,
	value text,
	PRIMARY KEY StringVal (__IDStringVal__)
) ;

CREATE TABLE Column_referencedBy_ForeignKey (
	__IDColumn__ Integer NOT NULL,
	__IDForeignKey__ Integer NOT NULL
) ;

CREATE TABLE Table_parameters_Parameter (
	__IDTable__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Table_elements_TableElement (
	__IDTable__ Integer NOT NULL,
	__IDTableElement__ Integer NOT NULL
) ;

CREATE TABLE Key_columns_Column (
	__IDKey__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;

CREATE TABLE Column_keys_Key (
	__IDColumn__ Integer NOT NULL,
	__IDKey__ Integer NOT NULL
) ;

CREATE TABLE ForeignKey_referencedColumns_Column (
	__IDForeignKey__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;

CREATE TABLE Table_referencedBy_ForeignKey (
	__IDTable__ Integer NOT NULL,
	__IDForeignKey__ Integer NOT NULL
) ;

CREATE TABLE Database_tables_Table (
	__IDDatabase__ Integer NOT NULL,
	__IDTable__ Integer NOT NULL
) ;
