CREATE TABLE QueryExpression (
	__IDQueryExpression__ Integer NOT NULL,
	expresssion text,
	PRIMARY KEY QueryExpression (__IDQueryExpression__)
) ;

CREATE TABLE CheckConstraint (
	__IDCheckConstraint__ Integer NOT NULL,
	PRIMARY KEY CheckConstraint (__IDCheckConstraint__)
) ;

CREATE TABLE "Column" (
	__IDColumn__ Integer NOT NULL,
	"precision" Integer,
	scale Integer,
	isNullable Boolean,
	length Integer,
	collectionName text,
	characterSetName text,
	FOREIGN KEY type (__FKtype__) REFERENCES SQLDataType (__IDSQLDataType__),
	FOREIGN KEY owner (__FKowner__) REFERENCES ColumnSet (__IDColumnSet__),
	FOREIGN KEY optionScopeColumnSet (__FKoptionScopeColumnSet__) REFERENCES NamedColumnSet (__IDNamedColumnSet__),
	PRIMARY KEY "Column" (__IDColumn__),
	__FKoptionScopeColumnSet__ Integer,
	__FKtype__ Integer,
	__FKowner__ Integer
) ;

CREATE TABLE ColumnSet (
	__IDColumnSet__ Integer NOT NULL,
	PRIMARY KEY ColumnSet (__IDColumnSet__)
) ;

CREATE TABLE NamedColumnSet (
	__IDNamedColumnSet__ Integer NOT NULL,
	FOREIGN KEY optionScopeColumn (__FKoptionScopeColumn__) REFERENCES "Column" (__IDColumn__),
	PRIMARY KEY NamedColumnSet (__IDNamedColumnSet__),
	__FKoptionScopeColumn__ Integer
) ;

CREATE TABLE QueryColumnSet (
	__IDQueryColumnSet__ Integer NOT NULL,
	FOREIGN KEY query (__FKquery__) REFERENCES QueryExpression (__IDQueryExpression__),
	PRIMARY KEY QueryColumnSet (__IDQueryColumnSet__),
	__FKquery__ Integer
) ;

CREATE TABLE "Table" (
	__IDTable__ Integer NOT NULL,
	isTemporary Boolean,
	temporaryScope text,
	isSystem Boolean,
	PRIMARY KEY "Table" (__IDTable__)
) ;

CREATE TABLE View (
	__IDView__ Integer NOT NULL,
	isReadOnly Boolean,
	checkOption Boolean,
	FOREIGN KEY queryExpression (__FKqueryExpression__) REFERENCES QueryExpression (__IDQueryExpression__),
	PRIMARY KEY View (__IDView__),
	__FKqueryExpression__ Integer
) ;

CREATE TABLE "Trigger" (
	__IDTrigger__ Integer NOT NULL,
	FOREIGN KEY namedColumnSet (__FKnamedColumnSet__) REFERENCES NamedColumnSet (__IDNamedColumnSet__),
	PRIMARY KEY "Trigger" (__IDTrigger__),
	__FKnamedColumnSet__ Integer
) ;

CREATE TABLE SQLDataType (
	__IDSQLDataType__ Integer NOT NULL,
	typeNumber Integer,
	PRIMARY KEY SQLDataType (__IDSQLDataType__)
) ;

CREATE TABLE SQLDistinctType (
	__IDSQLDistinctType__ Integer NOT NULL,
	length Integer,
	"precision" Integer,
	scale Integer,
	FOREIGN KEY sqlSimpleType (__FKsqlSimpleType__) REFERENCES SQLSimpleType (__IDSQLSimpleType__),
	PRIMARY KEY SQLDistinctType (__IDSQLDistinctType__),
	__FKsqlSimpleType__ Integer
) ;

CREATE TABLE SQLSimpleType (
	__IDSQLSimpleType__ Integer NOT NULL,
	characterMaximumLength Integer,
	characterOctetLength Integer,
	numericPrecision Integer,
	numericPrecisionRadix Integer,
	numericScale Integer,
	dateTimePrecision Integer,
	PRIMARY KEY SQLSimpleType (__IDSQLSimpleType__)
) ;

CREATE TABLE NamedColumnSet_triggers_Trigger (
	__IDNamedColumnSet__ Integer NOT NULL,
	__IDTrigger__ Integer NOT NULL
) ;

CREATE TABLE ColumnSet_features_Column (
	__IDColumnSet__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;

CREATE TABLE CheckConstraint_constraintElements_Column (
	__IDCheckConstraint__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;

CREATE TABLE Column_column_constraints_CheckConstraint (
	__IDColumn__ Integer NOT NULL,
	__IDCheckConstraint__ Integer NOT NULL
) ;

CREATE TABLE SQLSimpleType_sqlDistinctTypes_SQLDistinctType (
	__IDSQLSimpleType__ Integer NOT NULL,
	__IDSQLDistinctType__ Integer NOT NULL
) ;

CREATE TABLE Table_table_constraints_CheckConstraint (
	__IDTable__ Integer NOT NULL,
	__IDCheckConstraint__ Integer NOT NULL
) ;

CREATE TABLE CheckConstraint_constrainedElements_Table (
	__IDCheckConstraint__ Integer NOT NULL,
	__IDTable__ Integer NOT NULL
) ;

CREATE TABLE SQLDataType_structuralFeatures_Column (
	__IDSQLDataType__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;
