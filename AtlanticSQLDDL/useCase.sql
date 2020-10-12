CREATE TABLE Actor (
	__IDActor__ Integer NOT NULL,
	PRIMARY KEY Actor (__IDActor__)
) ;

CREATE TABLE UseCase (
	__IDUseCase__ Integer NOT NULL,
	PRIMARY KEY UseCase (__IDUseCase__)
) ;

CREATE TABLE Extend (
	__IDExtend__ Integer NOT NULL,
	PRIMARY KEY Extend (__IDExtend__)
) ;

CREATE TABLE Include (
	__IDInclude__ Integer NOT NULL,
	PRIMARY KEY Include (__IDInclude__)
) ;

CREATE TABLE UseCaseContainer (
	__IDUseCaseContainer__ Integer NOT NULL,
	PRIMARY KEY UseCaseContainer (__IDUseCaseContainer__)
) ;

CREATE TABLE BehavioredClassifier (
	__IDBehavioredClassifier__ Integer NOT NULL,
	PRIMARY KEY BehavioredClassifier (__IDBehavioredClassifier__)
) ;

CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE Association (
	__IDAssociation__ Integer NOT NULL,
	FOREIGN KEY actor (__FKactor__) REFERENCES Actor (__IDActor__),
	FOREIGN KEY useCase (__FKuseCase__) REFERENCES UseCase (__IDUseCase__),
	PRIMARY KEY Association (__IDAssociation__),
	__FKactor__ Integer,
	__FKuseCase__ Integer
) ;

CREATE TABLE UseCase_include_Include (
	__IDUseCase__ Integer NOT NULL,
	__IDInclude__ Integer NOT NULL
) ;

CREATE TABLE UseCase_extend_Extend (
	__IDUseCase__ Integer NOT NULL,
	__IDExtend__ Integer NOT NULL
) ;

CREATE TABLE Extend_extension_UseCase (
	__IDExtend__ Integer NOT NULL,
	__IDUseCase__ Integer NOT NULL
) ;

CREATE TABLE Include_includingCase_UseCase (
	__IDInclude__ Integer NOT NULL,
	__IDUseCase__ Integer NOT NULL
) ;

CREATE TABLE UseCaseContainer_ownedElement_NamedElement (
	__IDUseCaseContainer__ Integer NOT NULL,
	__IDNamedElement__ Integer NOT NULL
) ;
