CREATE TABLE Root (
	__IDRoot__ Integer NOT NULL,
	PRIMARY KEY Root (__IDRoot__)
) ;

CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	objectName text,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE Representation (
	__IDRepresentation__ Integer NOT NULL,
	FOREIGN KEY meaning (__FKmeaning__) REFERENCES Meaning (__IDMeaning__),
	PRIMARY KEY Representation (__IDRepresentation__),
	__FKmeaning__ Integer
) ;

CREATE TABLE Designation (
	__IDDesignation__ Integer NOT NULL,
	FOREIGN KEY text (__FKtext__) REFERENCES Text (__IDText__),
	PRIMARY KEY Designation (__IDDesignation__),
	__FKtext__ Integer
) ;

CREATE TABLE Text (
	__IDText__ Integer NOT NULL,
	value text,
	PRIMARY KEY Text (__IDText__)
) ;

CREATE TABLE Meaning (
	__IDMeaning__ Integer NOT NULL,
	PRIMARY KEY Meaning (__IDMeaning__)
) ;

CREATE TABLE Concept (
	__IDConcept__ Integer NOT NULL,
	PRIMARY KEY Concept (__IDConcept__)
) ;

CREATE TABLE NounConcept (
	__IDNounConcept__ Integer NOT NULL,
	PRIMARY KEY NounConcept (__IDNounConcept__)
) ;

CREATE TABLE ObjectType (
	__IDObjectType__ Integer NOT NULL,
	FOREIGN KEY specializes (__FKspecializes__) REFERENCES ObjectType (__IDObjectType__),
	PRIMARY KEY ObjectType (__IDObjectType__),
	__FKspecializes__ Integer
) ;

CREATE TABLE IndividualConcept (
	__IDIndividualConcept__ Integer NOT NULL,
	FOREIGN KEY instanceOf (__FKinstanceOf__) REFERENCES ObjectType (__IDObjectType__),
	PRIMARY KEY IndividualConcept (__IDIndividualConcept__),
	__FKinstanceOf__ Integer
) ;

CREATE TABLE DataType (
	__IDDataType__ Integer NOT NULL,
	PRIMARY KEY DataType (__IDDataType__)
) ;

CREATE TABLE NonEmptyString (
	__IDNonEmptyString__ Integer NOT NULL,
	value text,
	PRIMARY KEY NonEmptyString (__IDNonEmptyString__)
) ;

CREATE TABLE NonNegativeInteger (
	__IDNonNegativeInteger__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY NonNegativeInteger (__IDNonNegativeInteger__)
) ;

CREATE TABLE FactType (
	__IDFactType__ Integer NOT NULL,
	PRIMARY KEY FactType (__IDFactType__)
) ;

CREATE TABLE BinaryFactType (
	__IDBinaryFactType__ Integer NOT NULL,
	FOREIGN KEY role1 (__FKrole1__) REFERENCES FactTypeRole (__IDFactTypeRole__),
	FOREIGN KEY role2 (__FKrole2__) REFERENCES FactTypeRole (__IDFactTypeRole__),
	PRIMARY KEY BinaryFactType (__IDBinaryFactType__),
	__FKrole1__ Integer,
	__FKrole2__ Integer
) ;

CREATE TABLE IsPropertyOfFactType (
	__IDIsPropertyOfFactType__ Integer NOT NULL,
	PRIMARY KEY IsPropertyOfFactType (__IDIsPropertyOfFactType__)
) ;

CREATE TABLE AssociativeFactType (
	__IDAssociativeFactType__ Integer NOT NULL,
	PRIMARY KEY AssociativeFactType (__IDAssociativeFactType__)
) ;

CREATE TABLE CategorizationFactType (
	__IDCategorizationFactType__ Integer NOT NULL,
	PRIMARY KEY CategorizationFactType (__IDCategorizationFactType__)
) ;

CREATE TABLE ObjectificationFactType (
	__IDObjectificationFactType__ Integer NOT NULL,
	PRIMARY KEY ObjectificationFactType (__IDObjectificationFactType__)
) ;

CREATE TABLE Role (
	__IDRole__ Integer NOT NULL,
	FOREIGN KEY nounConcept (__FKnounConcept__) REFERENCES NounConcept (__IDNounConcept__),
	PRIMARY KEY Role (__IDRole__),
	__FKnounConcept__ Integer
) ;

CREATE TABLE FactTypeRole (
	__IDFactTypeRole__ Integer NOT NULL,
	PRIMARY KEY FactTypeRole (__IDFactTypeRole__)
) ;

CREATE TABLE LogicalFormulation (
	__IDLogicalFormulation__ Integer NOT NULL,
	PRIMARY KEY LogicalFormulation (__IDLogicalFormulation__)
) ;

CREATE TABLE AtomicFormulation (
	__IDAtomicFormulation__ Integer NOT NULL,
	FOREIGN KEY isBasedOn (__FKisBasedOn__) REFERENCES FactType (__IDFactType__),
	PRIMARY KEY AtomicFormulation (__IDAtomicFormulation__),
	__FKisBasedOn__ Integer
) ;

CREATE TABLE BinaryAtomicFormulation (
	__IDBinaryAtomicFormulation__ Integer NOT NULL,
	FOREIGN KEY roleBinding1 (__FKroleBinding1__) REFERENCES RoleBinding (__IDRoleBinding__),
	FOREIGN KEY roleBinding2 (__FKroleBinding2__) REFERENCES RoleBinding (__IDRoleBinding__),
	PRIMARY KEY BinaryAtomicFormulation (__IDBinaryAtomicFormulation__),
	__FKroleBinding1__ Integer,
	__FKroleBinding2__ Integer
) ;

CREATE TABLE NecessityFormulation (
	__IDNecessityFormulation__ Integer NOT NULL,
	PRIMARY KEY NecessityFormulation (__IDNecessityFormulation__)
) ;

CREATE TABLE Quantification (
	__IDQuantification__ Integer NOT NULL,
	FOREIGN KEY introducedVariable (__FKintroducedVariable__) REFERENCES Variable (__IDVariable__),
	FOREIGN KEY scopesOver (__FKscopesOver__) REFERENCES LogicalFormulation (__IDLogicalFormulation__),
	PRIMARY KEY Quantification (__IDQuantification__),
	__FKintroducedVariable__ Integer,
	__FKscopesOver__ Integer
) ;

CREATE TABLE UniversalQuantification (
	__IDUniversalQuantification__ Integer NOT NULL,
	PRIMARY KEY UniversalQuantification (__IDUniversalQuantification__)
) ;

CREATE TABLE AtLeastNQuantification (
	__IDAtLeastNQuantification__ Integer NOT NULL,
	FOREIGN KEY minCardinality (__FKminCardinality__) REFERENCES NonNegativeInteger (__IDNonNegativeInteger__),
	PRIMARY KEY AtLeastNQuantification (__IDAtLeastNQuantification__),
	__FKminCardinality__ Integer
) ;

CREATE TABLE ExactlyNQuantification (
	__IDExactlyNQuantification__ Integer NOT NULL,
	FOREIGN KEY cardinality (__FKcardinality__) REFERENCES NonNegativeInteger (__IDNonNegativeInteger__),
	PRIMARY KEY ExactlyNQuantification (__IDExactlyNQuantification__),
	__FKcardinality__ Integer
) ;

CREATE TABLE AtMostNQuantification (
	__IDAtMostNQuantification__ Integer NOT NULL,
	FOREIGN KEY maxCardinality (__FKmaxCardinality__) REFERENCES NonNegativeInteger (__IDNonNegativeInteger__),
	PRIMARY KEY AtMostNQuantification (__IDAtMostNQuantification__),
	__FKmaxCardinality__ Integer
) ;

CREATE TABLE BindableTarget (
	__IDBindableTarget__ Integer NOT NULL,
	PRIMARY KEY BindableTarget (__IDBindableTarget__)
) ;

CREATE TABLE Variable (
	__IDVariable__ Integer NOT NULL,
	FOREIGN KEY rangesOver (__FKrangesOver__) REFERENCES ObjectType (__IDObjectType__),
	PRIMARY KEY Variable (__IDVariable__),
	__FKrangesOver__ Integer
) ;

CREATE TABLE RoleBinding (
	__IDRoleBinding__ Integer NOT NULL,
	FOREIGN KEY occursIn (__FKoccursIn__) REFERENCES AtomicFormulation (__IDAtomicFormulation__),
	FOREIGN KEY isOf (__FKisOf__) REFERENCES FactType (__IDFactType__),
	FOREIGN KEY bindsTo (__FKbindsTo__) REFERENCES BindableTarget (__IDBindableTarget__),
	PRIMARY KEY RoleBinding (__IDRoleBinding__),
	__FKoccursIn__ Integer,
	__FKisOf__ Integer,
	__FKbindsTo__ Integer
) ;

CREATE TABLE Root_elements_Element (
	__IDRoot__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE Meaning_representations_Representation (
	__IDMeaning__ Integer NOT NULL,
	__IDRepresentation__ Integer NOT NULL
) ;

CREATE TABLE ObjectType_generalizes_ObjectType (
	__IDObjectType__ Integer NOT NULL,
	__IDObjectType__ Integer NOT NULL
) ;
