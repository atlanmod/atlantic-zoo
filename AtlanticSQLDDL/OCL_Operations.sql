CREATE TABLE OperationExp (
	__IDOperationExp__ Integer NOT NULL,
	PRIMARY KEY OperationExp (__IDOperationExp__)
) ;

CREATE TABLE PropertyOperation (
	__IDPropertyOperation__ Integer NOT NULL,
	isMarkedPre Boolean,
	FOREIGN KEY source (__FKsource__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY PropertyOperation (__IDPropertyOperation__),
	__FKsource__ Integer
) ;

CREATE TABLE OclOperation (
	__IDOclOperation__ Integer NOT NULL,
	FOREIGN KEY arguments (__FKarguments__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY OclOperation (__IDOclOperation__),
	__FKarguments__ Integer
) ;

CREATE TABLE ConstExp (
	__IDConstExp__ Integer NOT NULL,
	PRIMARY KEY ConstExp (__IDConstExp__)
) ;

CREATE TABLE IntegerConstExp (
	__IDIntegerConstExp__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY IntegerConstExp (__IDIntegerConstExp__)
) ;

CREATE TABLE StringConstExp (
	__IDStringConstExp__ Integer NOT NULL,
	value text,
	PRIMARY KEY StringConstExp (__IDStringConstExp__)
) ;

CREATE TABLE RealConstExp (
	__IDRealConstExp__ Integer NOT NULL,
	value "Double",
	PRIMARY KEY RealConstExp (__IDRealConstExp__)
) ;

CREATE TABLE AttributeExp (
	__IDAttributeExp__ Integer NOT NULL,
	FOREIGN KEY attr (__FKattr__) REFERENCES Attribute (__IDAttribute__),
	PRIMARY KEY AttributeExp (__IDAttributeExp__),
	__FKattr__ Integer
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	PRIMARY KEY Attribute (__IDAttribute__)
) ;

CREATE TABLE NaviguationExp (
	__IDNaviguationExp__ Integer NOT NULL,
	FOREIGN KEY assEnd (__FKassEnd__) REFERENCES AssocationEnd (__IDAssocationEnd__),
	FOREIGN KEY qualifierValues (__FKqualifierValues__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY NaviguationExp (__IDNaviguationExp__),
	__FKqualifierValues__ Integer,
	__FKassEnd__ Integer
) ;

CREATE TABLE AssocationEnd (
	__IDAssocationEnd__ Integer NOT NULL,
	PRIMARY KEY AssocationEnd (__IDAssocationEnd__)
) ;

CREATE TABLE ClassifierOperation (
	__IDClassifierOperation__ Integer NOT NULL,
	FOREIGN KEY op (__FKop__) REFERENCES Operation (__IDOperation__),
	FOREIGN KEY arguments (__FKarguments__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY ClassifierOperation (__IDClassifierOperation__),
	__FKop__ Integer,
	__FKarguments__ Integer
) ;

CREATE TABLE Operation (
	__IDOperation__ Integer NOT NULL,
	PRIMARY KEY Operation (__IDOperation__)
) ;

CREATE TABLE OclExpression (
	__IDOclExpression__ Integer NOT NULL,
	PRIMARY KEY OclExpression (__IDOclExpression__)
) ;

CREATE TABLE AssocationEnd_navExp_NaviguationExp (
	__IDAssocationEnd__ Integer NOT NULL,
	__IDNaviguationExp__ Integer NOT NULL
) ;

CREATE TABLE Attribute_attrExp_AttributeExp (
	__IDAttribute__ Integer NOT NULL,
	__IDAttributeExp__ Integer NOT NULL
) ;

CREATE TABLE OclExpression_classifierOperations_ClassifierOperation (
	__IDOclExpression__ Integer NOT NULL,
	__IDClassifierOperation__ Integer NOT NULL
) ;

CREATE TABLE OclExpression_propertyOperations_PropertyOperation (
	__IDOclExpression__ Integer NOT NULL,
	__IDPropertyOperation__ Integer NOT NULL
) ;

CREATE TABLE Operation_classOp_ClassifierOperation (
	__IDOperation__ Integer NOT NULL,
	__IDClassifierOperation__ Integer NOT NULL
) ;

CREATE TABLE OclExpression_oclOperations_OclOperation (
	__IDOclExpression__ Integer NOT NULL,
	__IDOclOperation__ Integer NOT NULL
) ;

CREATE TABLE OclExpression_naviguationExps_NaviguationExp (
	__IDOclExpression__ Integer NOT NULL,
	__IDNaviguationExp__ Integer NOT NULL
) ;
