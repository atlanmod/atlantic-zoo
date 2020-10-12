CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE "DataBase" (
	__IDDataBase__ Integer NOT NULL,
	SGBDname text,
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
	dataType text,
	"null" Boolean,
	defaultValue text,
	FOREIGN KEY owner (__FKowner__) REFERENCES "Table" (__IDTable__),
	FOREIGN KEY keyOf (__FKkeyOf__) REFERENCES "Table" (__IDTable__),
	PRIMARY KEY "Column" (__IDColumn__),
	__FKkeyOf__ Integer,
	__FKowner__ Integer
) ;

CREATE TABLE Table_columns_Column (
	__IDTable__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;

CREATE TABLE Table_key_Column (
	__IDTable__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;

CREATE TABLE DataBase_tables_Table (
	__IDDataBase__ Integer NOT NULL,
	__IDTable__ Integer NOT NULL
) ;
