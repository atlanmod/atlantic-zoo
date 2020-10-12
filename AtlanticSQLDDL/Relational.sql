CREATE TABLE Named (
	__IDNamed__ Integer NOT NULL,
	name text,
	PRIMARY KEY Named (__IDNamed__)
) ;

CREATE TABLE "Table" (
	__IDTable__ Integer NOT NULL,
	PRIMARY KEY "Table" (__IDTable__)
) ;

CREATE TABLE "Column" (
	__IDColumn__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES "Table" (__IDTable__),
	FOREIGN KEY keyOf (__FKkeyOf__) REFERENCES "Table" (__IDTable__),
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY "Column" (__IDColumn__),
	__FKowner__ Integer,
	__FKkeyOf__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	PRIMARY KEY Type (__IDType__)
) ;

CREATE TABLE Table_key_Column (
	__IDTable__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;

CREATE TABLE Table_col_Column (
	__IDTable__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;
