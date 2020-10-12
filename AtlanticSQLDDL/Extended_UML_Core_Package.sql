CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES Name (__IDName__),
	PRIMARY KEY ModelElement (__IDModelElement__),
	__FKname__ Integer
) ;

CREATE TABLE Name (
	__IDName__ Integer NOT NULL,
	PRIMARY KEY Name (__IDName__)
) ;

CREATE TABLE AssociationEnd (
	__IDAssociationEnd__ Integer NOT NULL,
	isNavigable Boolean,
	isOrdered Boolean,
	FOREIGN KEY aggregation (__FKaggregation__) REFERENCES AggregationKind (__IDAggregationKind__),
	FOREIGN KEY multiplicity (__FKmultiplicity__) REFERENCES Multiplicity (__IDMultiplicity__),
	FOREIGN KEY changeable (__FKchangeable__) REFERENCES ChangeableKind (__IDChangeableKind__),
	FOREIGN KEY TargetScope (__FKTargetScope__) REFERENCES ScopeKind (__IDScopeKind__),
	FOREIGN KEY rfIntegrety (__FKrfIntegrety__) REFERENCES RlIntegretyKind (__IDRlIntegretyKind__),
	FOREIGN KEY rlIntegrety (__FKrlIntegrety__) REFERENCES RlIntegretyKind (__IDRlIntegretyKind__),
	PRIMARY KEY AssociationEnd (__IDAssociationEnd__),
	__FKrlIntegrety__ Integer,
	__FKrfIntegrety__ Integer,
	__FKchangeable__ Integer,
	__FKTargetScope__ Integer,
	__FKaggregation__ Integer,
	__FKmultiplicity__ Integer
) ;

CREATE TABLE AggregationKind (
	__IDAggregationKind__ Integer NOT NULL,
	PRIMARY KEY AggregationKind (__IDAggregationKind__)
) ;

CREATE TABLE Multiplicity (
	__IDMultiplicity__ Integer NOT NULL,
	PRIMARY KEY Multiplicity (__IDMultiplicity__)
) ;

CREATE TABLE ChangeableKind (
	__IDChangeableKind__ Integer NOT NULL,
	PRIMARY KEY ChangeableKind (__IDChangeableKind__)
) ;

CREATE TABLE ScopeKind (
	__IDScopeKind__ Integer NOT NULL,
	PRIMARY KEY ScopeKind (__IDScopeKind__)
) ;

CREATE TABLE RfIntegretyKind (
	__IDRfIntegretyKind__ Integer NOT NULL,
	PRIMARY KEY RfIntegretyKind (__IDRfIntegretyKind__)
) ;

CREATE TABLE RlIntegretyKind (
	__IDRlIntegretyKind__ Integer NOT NULL,
	PRIMARY KEY RlIntegretyKind (__IDRlIntegretyKind__)
) ;

CREATE TABLE Namespace (
	__IDNamespace__ Integer NOT NULL,
	PRIMARY KEY Namespace (__IDNamespace__)
) ;

CREATE TABLE GeneralizableElement (
	__IDGeneralizableElement__ Integer NOT NULL,
	PRIMARY KEY GeneralizableElement (__IDGeneralizableElement__)
) ;

CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	PRIMARY KEY Classifier (__IDClassifier__)
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	isActive Boolean,
	FOREIGN KEY mutliplicity (__FKmutliplicity__) REFERENCES Multiplicity (__IDMultiplicity__),
	PRIMARY KEY Class (__IDClass__),
	__FKmutliplicity__ Integer
) ;

CREATE TABLE "Key" (
	__IDKey__ Integer NOT NULL,
	FOREIGN KEY classOwner (__FKclassOwner__) REFERENCES Class (__IDClass__),
	PRIMARY KEY "Key" (__IDKey__),
	__FKclassOwner__ Integer
) ;

CREATE TABLE Feature (
	__IDFeature__ Integer NOT NULL,
	PRIMARY KEY Feature (__IDFeature__)
) ;

CREATE TABLE StructureFeature (
	__IDStructureFeature__ Integer NOT NULL,
	PRIMARY KEY StructureFeature (__IDStructureFeature__)
) ;

CREATE TABLE "Constraint" (
	__IDConstraint__ Integer NOT NULL,
	PRIMARY KEY "Constraint" (__IDConstraint__)
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	FOREIGN KEY initialValue (__FKinitialValue__) REFERENCES Expression (__IDExpression__),
	isKey Boolean,
	isUnique Boolean,
	PRIMARY KEY Attribute (__IDAttribute__),
	__FKinitialValue__ Integer
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	PRIMARY KEY Expression (__IDExpression__)
) ;

CREATE TABLE Class_key_Key (
	__IDClass__ Integer NOT NULL,
	__IDKey__ Integer NOT NULL
) ;
