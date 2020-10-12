CREATE TABLE RModelElement (
	__IDRModelElement__ Integer NOT NULL,
	kind text,
	name text,
	PRIMARY KEY RModelElement (__IDRModelElement__)
) ;

CREATE TABLE "Schema" (
	__IDSchema__ Integer NOT NULL,
	PRIMARY KEY "Schema" (__IDSchema__)
) ;

CREATE TABLE "Table" (
	__IDTable__ Integer NOT NULL,
	FOREIGN KEY "schema" (__FKschema__) REFERENCES "Schema" (__IDSchema__),
	PRIMARY KEY "Table" (__IDTable__),
	__FKschema__ Integer
) ;

CREATE TABLE "Column" (
	__IDColumn__ Integer NOT NULL,
	type text,
	FOREIGN KEY owner (__FKowner__) REFERENCES "Table" (__IDTable__),
	PRIMARY KEY "Column" (__IDColumn__),
	__FKowner__ Integer
) ;

CREATE TABLE "Key" (
	__IDKey__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES "Table" (__IDTable__),
	PRIMARY KEY "Key" (__IDKey__),
	__FKowner__ Integer
) ;

CREATE TABLE ForeignKey (
	__IDForeignKey__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES "Table" (__IDTable__),
	FOREIGN KEY refersTo (__FKrefersTo__) REFERENCES "Key" (__IDKey__),
	PRIMARY KEY ForeignKey (__IDForeignKey__),
	__FKowner__ Integer,
	__FKrefersTo__ Integer
) ;

CREATE TABLE Column_foreignKey_ForeignKey (
	__IDColumn__ Integer NOT NULL,
	__IDForeignKey__ Integer NOT NULL
) ;

CREATE TABLE Schema_tables_Table (
	__IDSchema__ Integer NOT NULL,
	__IDTable__ Integer NOT NULL
) ;

CREATE TABLE Table_column_Column (
	__IDTable__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;

CREATE TABLE ForeignKey_column_Column (
	__IDForeignKey__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;

CREATE TABLE Key_refersToOpposite_ForeignKey (
	__IDKey__ Integer NOT NULL,
	__IDForeignKey__ Integer NOT NULL
) ;

CREATE TABLE Table_key_Key (
	__IDTable__ Integer NOT NULL,
	__IDKey__ Integer NOT NULL
) ;

CREATE TABLE Key_column_Column (
	__IDKey__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;

CREATE TABLE Column_key_Key (
	__IDColumn__ Integer NOT NULL,
	__IDKey__ Integer NOT NULL
) ;

CREATE TABLE Table_foreignKey_ForeignKey (
	__IDTable__ Integer NOT NULL,
	__IDForeignKey__ Integer NOT NULL
) ;
