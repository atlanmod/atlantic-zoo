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

CREATE TABLE Tuple (
	__IDTuple__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES "Table" (__IDTable__),
	PRIMARY KEY Tuple (__IDTuple__),
	__FKowner__ Integer
) ;

CREATE TABLE TupleElement (
	__IDTupleElement__ Integer NOT NULL,
	FOREIGN KEY tuple (__FKtuple__) REFERENCES Tuple (__IDTuple__),
	value text,
	PRIMARY KEY TupleElement (__IDTupleElement__),
	__FKtuple__ Integer
) ;

CREATE TABLE Tuple_elements_TupleElement (
	__IDTuple__ Integer NOT NULL,
	__IDTupleElement__ Integer NOT NULL
) ;

CREATE TABLE Table_tuples_Tuple (
	__IDTable__ Integer NOT NULL,
	__IDTuple__ Integer NOT NULL
) ;

CREATE TABLE DataBase_tables_Table (
	__IDDataBase__ Integer NOT NULL,
	__IDTable__ Integer NOT NULL
) ;
