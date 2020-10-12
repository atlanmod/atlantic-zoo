CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	PRIMARY KEY Classifier (__IDClassifier__)
) ;

CREATE TABLE Instance (
	__IDInstance__ Integer NOT NULL,
	PRIMARY KEY Instance (__IDInstance__)
) ;

CREATE TABLE Actor (
	__IDActor__ Integer NOT NULL,
	PRIMARY KEY Actor (__IDActor__)
) ;

CREATE TABLE UseCase (
	__IDUseCase__ Integer NOT NULL,
	FOREIGN KEY includeAddition (__FKincludeAddition__) REFERENCES Include (__IDInclude__),
	FOREIGN KEY includeBase (__FKincludeBase__) REFERENCES Include (__IDInclude__),
	FOREIGN KEY extendExtension (__FKextendExtension__) REFERENCES Extend (__IDExtend__),
	FOREIGN KEY extendBase (__FKextendBase__) REFERENCES Extend (__IDExtend__),
	PRIMARY KEY UseCase (__IDUseCase__),
	__FKincludeAddition__ Integer,
	__FKincludeBase__ Integer,
	__FKextendExtension__ Integer,
	__FKextendBase__ Integer
) ;

CREATE TABLE UseCaseInstance (
	__IDUseCaseInstance__ Integer NOT NULL,
	PRIMARY KEY UseCaseInstance (__IDUseCaseInstance__)
) ;

CREATE TABLE RelationShip (
	__IDRelationShip__ Integer NOT NULL,
	PRIMARY KEY RelationShip (__IDRelationShip__)
) ;

CREATE TABLE Include (
	__IDInclude__ Integer NOT NULL,
	FOREIGN KEY addition (__FKaddition__) REFERENCES UseCase (__IDUseCase__),
	FOREIGN KEY base (__FKbase__) REFERENCES UseCase (__IDUseCase__),
	PRIMARY KEY Include (__IDInclude__),
	__FKaddition__ Integer,
	__FKbase__ Integer
) ;

CREATE TABLE Extend (
	__IDExtend__ Integer NOT NULL,
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES BooleanExpression (__IDBooleanExpression__),
	FOREIGN KEY extension (__FKextension__) REFERENCES UseCase (__IDUseCase__),
	FOREIGN KEY base (__FKbase__) REFERENCES UseCase (__IDUseCase__),
	PRIMARY KEY Extend (__IDExtend__),
	__FKcondition__ Integer,
	__FKextension__ Integer,
	__FKbase__ Integer
) ;

CREATE TABLE BooleanExpression (
	__IDBooleanExpression__ Integer NOT NULL,
	value text,
	PRIMARY KEY BooleanExpression (__IDBooleanExpression__)
) ;

CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	PRIMARY KEY ModelElement (__IDModelElement__)
) ;

CREATE TABLE ExtensionPoint (
	__IDExtensionPoint__ Integer NOT NULL,
	FOREIGN KEY location (__FKlocation__) REFERENCES LocationReference (__IDLocationReference__),
	PRIMARY KEY ExtensionPoint (__IDExtensionPoint__),
	__FKlocation__ Integer
) ;

CREATE TABLE LocationReference (
	__IDLocationReference__ Integer NOT NULL,
	value text,
	PRIMARY KEY LocationReference (__IDLocationReference__)
) ;

CREATE TABLE Classifier_instance_Instance (
	__IDClassifier__ Integer NOT NULL,
	__IDInstance__ Integer NOT NULL
) ;

CREATE TABLE Instance_classifier_Classifier (
	__IDInstance__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE UseCase_extensionPoints_ExtensionPoint (
	__IDUseCase__ Integer NOT NULL,
	__IDExtensionPoint__ Integer NOT NULL
) ;

CREATE TABLE Extend_extensionPoint_ExtensionPoint (
	__IDExtend__ Integer NOT NULL,
	__IDExtensionPoint__ Integer NOT NULL
) ;

CREATE TABLE ExtensionPoint_extend_Extend (
	__IDExtensionPoint__ Integer NOT NULL,
	__IDExtend__ Integer NOT NULL
) ;

CREATE TABLE ExtensionPoint_useCase_UseCase (
	__IDExtensionPoint__ Integer NOT NULL,
	__IDUseCase__ Integer NOT NULL
) ;
