CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	PRIMARY KEY ModelElement (__IDModelElement__)
) ;

CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	PRIMARY KEY Classifier (__IDClassifier__)
) ;

CREATE TABLE StructuralFeature (
	__IDStructuralFeature__ Integer NOT NULL,
	PRIMARY KEY StructuralFeature (__IDStructuralFeature__)
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES String (__IDString__),
	PRIMARY KEY Class (__IDClass__),
	__FKname__ Integer
) ;

CREATE TABLE DataType (
	__IDDataType__ Integer NOT NULL,
	FOREIGN KEY attribute (__FKattribute__) REFERENCES Attribute (__IDAttribute__),
	PRIMARY KEY DataType (__IDDataType__),
	__FKattribute__ Integer
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	FOREIGN KEY class (__FKclass__) REFERENCES Class (__IDClass__),
	FOREIGN KEY has (__FKhas__) REFERENCES DataType (__IDDataType__),
	PRIMARY KEY Attribute (__IDAttribute__),
	__FKhas__ Integer,
	__FKclass__ Integer
) ;

CREATE TABLE Concept (
	__IDConcept__ Integer NOT NULL,
	PRIMARY KEY Concept (__IDConcept__)
) ;

CREATE TABLE ColumnSet (
	__IDColumnSet__ Integer NOT NULL,
	PRIMARY KEY ColumnSet (__IDColumnSet__)
) ;

CREATE TABLE "Column" (
	__IDColumn__ Integer NOT NULL,
	PRIMARY KEY "Column" (__IDColumn__)
) ;

CREATE TABLE FeatureAttribute (
	__IDFeatureAttribute__ Integer NOT NULL,
	PRIMARY KEY FeatureAttribute (__IDFeatureAttribute__)
) ;

CREATE TABLE Value (
	__IDValue__ Integer NOT NULL,
	PRIMARY KEY Value (__IDValue__)
) ;

CREATE TABLE RoleRestriction (
	__IDRoleRestriction__ Integer NOT NULL,
	PRIMARY KEY RoleRestriction (__IDRoleRestriction__)
) ;

CREATE TABLE Integer (
	__IDInteger__ Integer NOT NULL,
	PRIMARY KEY Integer (__IDInteger__)
) ;

CREATE TABLE String (
	__IDString__ Integer NOT NULL,
	PRIMARY KEY String (__IDString__)
) ;

CREATE TABLE DomainDataType (
	__IDDomainDataType__ Integer NOT NULL,
	PRIMARY KEY DomainDataType (__IDDomainDataType__)
) ;

CREATE TABLE Class_attributes_Attribute (
	__IDClass__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;
