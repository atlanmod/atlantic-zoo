CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE "Table" (
	__IDTable__ Integer NOT NULL,
	border Integer,
	style text,
	class text,
	FOREIGN KEY caption (__FKcaption__) REFERENCES Caption (__IDCaption__),
	PRIMARY KEY "Table" (__IDTable__),
	__FKcaption__ Integer
) ;

CREATE TABLE Caption (
	__IDCaption__ Integer NOT NULL,
	content text,
	PRIMARY KEY Caption (__IDCaption__)
) ;

CREATE TABLE Row (
	__IDRow__ Integer NOT NULL,
	PRIMARY KEY Row (__IDRow__)
) ;

CREATE TABLE Cell (
	__IDCell__ Integer NOT NULL,
	isHeading Boolean,
	align text,
	style text,
	content text,
	PRIMARY KEY Cell (__IDCell__)
) ;

CREATE TABLE Table_rows_Row (
	__IDTable__ Integer NOT NULL,
	__IDRow__ Integer NOT NULL
) ;

CREATE TABLE Row_cells_Cell (
	__IDRow__ Integer NOT NULL,
	__IDCell__ Integer NOT NULL
) ;
