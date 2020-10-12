CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE "DataBase" (
	__IDDataBase__ Integer NOT NULL,
	PRIMARY KEY "DataBase" (__IDDataBase__)
) ;

CREATE TABLE "Table" (
	__IDTable__ Integer NOT NULL,
	FOREIGN KEY "database" (__FKdatabase__) REFERENCES "DataBase" (__IDDataBase__),
	PRIMARY KEY "Table" (__IDTable__),
	__FKdatabase__ Integer
) ;

CREATE TABLE "Column" (
	__IDColumn__ Integer NOT NULL,
	type text,
	isPrimaryKey Boolean,
	"null" Boolean,
	defaultValue text,
	comment text,
	FOREIGN KEY "table" (__FKtable__) REFERENCES "Table" (__IDTable__),
	PRIMARY KEY "Column" (__IDColumn__),
	__FKtable__ Integer
) ;

CREATE TABLE IntegerColumn (
	__IDIntegerColumn__ Integer NOT NULL,
	isAutoIncrement Boolean,
	PRIMARY KEY IntegerColumn (__IDIntegerColumn__)
) ;

CREATE TABLE EnumColumn (
	__IDEnumColumn__ Integer NOT NULL,
	FOREIGN KEY enumSet (__FKenumSet__) REFERENCES EnumSet (__IDEnumSet__),
	PRIMARY KEY EnumColumn (__IDEnumColumn__),
	__FKenumSet__ Integer
) ;

CREATE TABLE EnumSet (
	__IDEnumSet__ Integer NOT NULL,
	PRIMARY KEY EnumSet (__IDEnumSet__)
) ;

CREATE TABLE EnumItem (
	__IDEnumItem__ Integer NOT NULL,
	FOREIGN KEY enumSet (__FKenumSet__) REFERENCES EnumSet (__IDEnumSet__),
	PRIMARY KEY EnumItem (__IDEnumItem__),
	__FKenumSet__ Integer
) ;

CREATE TABLE DataBase_tables_Table (
	__IDDataBase__ Integer NOT NULL,
	__IDTable__ Integer NOT NULL
) ;

CREATE TABLE EnumSet_enumItems_EnumItem (
	__IDEnumSet__ Integer NOT NULL,
	__IDEnumItem__ Integer NOT NULL
) ;

CREATE TABLE Table_columns_Column (
	__IDTable__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;
