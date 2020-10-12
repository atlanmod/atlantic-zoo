CREATE TABLE LinkPackage (
	__IDLinkPackage__ Integer NOT NULL,
	type text,
	FOREIGN KEY dataObject (__FKdataObject__) REFERENCES DataObject (__IDDataObject__),
	FOREIGN KEY value (__FKvalue__) REFERENCES Value (__IDValue__),
	FOREIGN KEY "column" (__FKcolumn__) REFERENCES "Column" (__IDColumn__),
	FOREIGN KEY columnSet (__FKcolumnSet__) REFERENCES ColumnSet (__IDColumnSet__),
	PRIMARY KEY LinkPackage (__IDLinkPackage__),
	__FKcolumnSet__ Integer,
	__FKdataObject__ Integer,
	__FKcolumn__ Integer,
	__FKvalue__ Integer
) ;
