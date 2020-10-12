CREATE TABLE MultiplicityType (
	__IDMultiplicityType__ Integer NOT NULL,
	lower Integer,
	upper Integer,
	isOrdered Boolean,
	isUnique Boolean,
	PRIMARY KEY MultiplicityType (__IDMultiplicityType__)
) ;

CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY ModelElement (__IDModelElement__)
) ;

CREATE TABLE Feature (
	__IDFeature__ Integer NOT NULL,
	ownerScope text,
	visibility text,
	FOREIGN KEY owner (__FKowner__) REFERENCES Classifier (__IDClassifier__),
	PRIMARY KEY Feature (__IDFeature__),
	__FKowner__ Integer
) ;

CREATE TABLE NameSpace (
	__IDNameSpace__ Integer NOT NULL,
	PRIMARY KEY NameSpace (__IDNameSpace__)
) ;

CREATE TABLE GeneralizableElement (
	__IDGeneralizableElement__ Integer NOT NULL,
	isRoot Boolean,
	isLeaf Boolean,
	isAbstract Boolean,
	PRIMARY KEY GeneralizableElement (__IDGeneralizableElement__)
) ;

CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	PRIMARY KEY Classifier (__IDClassifier__)
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	isActive Boolean,
	PRIMARY KEY Class (__IDClass__)
) ;

CREATE TABLE StructuralFeature (
	__IDStructuralFeature__ Integer NOT NULL,
	FOREIGN KEY multiplicity (__FKmultiplicity__) REFERENCES MultiplicityType (__IDMultiplicityType__),
	isChangeable Boolean,
	targetScope text,
	PRIMARY KEY StructuralFeature (__IDStructuralFeature__),
	__FKmultiplicity__ Integer
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	initialValue text,
	PRIMARY KEY Attribute (__IDAttribute__)
) ;

CREATE TABLE BehavioralFeature (
	__IDBehavioralFeature__ Integer NOT NULL,
	isQuery Boolean,
	PRIMARY KEY BehavioralFeature (__IDBehavioralFeature__)
) ;

CREATE TABLE Operation (
	__IDOperation__ Integer NOT NULL,
	isRoot Boolean,
	isLeaf Boolean,
	isAbstract Boolean,
	specification text,
	PRIMARY KEY Operation (__IDOperation__)
) ;

CREATE TABLE Classifier_feature_Feature (
	__IDClassifier__ Integer NOT NULL,
	__IDFeature__ Integer NOT NULL
) ;
