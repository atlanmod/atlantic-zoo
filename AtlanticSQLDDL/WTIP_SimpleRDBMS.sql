CREATE TABLE "Table" (
	__IDTable__ Integer NOT NULL,
	name text,
	PRIMARY KEY "Table" (__IDTable__)
) ;

CREATE TABLE "Column" (
	__IDColumn__ Integer NOT NULL,
	name text,
	type text,
	PRIMARY KEY "Column" (__IDColumn__)
) ;

CREATE TABLE FKey (
	__IDFKey__ Integer NOT NULL,
	FOREIGN KEY "references" (__FKreferences__) REFERENCES "Table" (__IDTable__),
	PRIMARY KEY FKey (__IDFKey__),
	__FKreferences__ Integer
) ;

CREATE TABLE Table_cols_Column (
	__IDTable__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;

CREATE TABLE Table_pkey_Column (
	__IDTable__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;

CREATE TABLE Table_fkeys_FKey (
	__IDTable__ Integer NOT NULL,
	__IDFKey__ Integer NOT NULL
) ;

CREATE TABLE FKey_cols_Column (
	__IDFKey__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;
