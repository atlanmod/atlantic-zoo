CREATE TABLE "Table" (
	__IDTable__ Integer NOT NULL,
	PRIMARY KEY "Table" (__IDTable__)
) ;

CREATE TABLE Row (
	__IDRow__ Integer NOT NULL,
	PRIMARY KEY Row (__IDRow__)
) ;

CREATE TABLE Cell (
	__IDCell__ Integer NOT NULL,
	content text,
	PRIMARY KEY Cell (__IDCell__)
) ;

CREATE TABLE Row_cells_Cell (
	__IDRow__ Integer NOT NULL,
	__IDCell__ Integer NOT NULL
) ;

CREATE TABLE Table_rows_Row (
	__IDTable__ Integer NOT NULL,
	__IDRow__ Integer NOT NULL
) ;
