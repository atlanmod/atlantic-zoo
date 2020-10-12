CREATE TABLE ReuseContract (
	__IDReuseContract__ Integer NOT NULL,
	FOREIGN KEY supplier (__FKsupplier__) REFERENCES ProviderClause (__IDProviderClause__),
	FOREIGN KEY client (__FKclient__) REFERENCES ReuserClause (__IDReuserClause__),
	PRIMARY KEY ReuseContract (__IDReuseContract__),
	__FKclient__ Integer,
	__FKsupplier__ Integer
) ;

CREATE TABLE Dependency (
	__IDDependency__ Integer NOT NULL,
	FOREIGN KEY owningDependency (__FKowningDependency__) REFERENCES Dependency (__IDDependency__),
	PRIMARY KEY Dependency (__IDDependency__),
	__FKowningDependency__ Integer
) ;

CREATE TABLE ProviderClause (
	__IDProviderClause__ Integer NOT NULL,
	PRIMARY KEY ProviderClause (__IDProviderClause__)
) ;

CREATE TABLE Package (
	__IDPackage__ Integer NOT NULL,
	PRIMARY KEY Package (__IDPackage__)
) ;

CREATE TABLE ReuserClause (
	__IDReuserClause__ Integer NOT NULL,
	PRIMARY KEY ReuserClause (__IDReuserClause__)
) ;

CREATE TABLE CompositeProvider (
	__IDCompositeProvider__ Integer NOT NULL,
	FOREIGN KEY subcontract (__FKsubcontract__) REFERENCES ReuseContract (__IDReuseContract__),
	PRIMARY KEY CompositeProvider (__IDCompositeProvider__),
	__FKsubcontract__ Integer
) ;

CREATE TABLE BasicProvider (
	__IDBasicProvider__ Integer NOT NULL,
	PRIMARY KEY BasicProvider (__IDBasicProvider__)
) ;

CREATE TABLE CompositeReuser (
	__IDCompositeReuser__ Integer NOT NULL,
	PRIMARY KEY CompositeReuser (__IDCompositeReuser__)
) ;

CREATE TABLE BasicReuser (
	__IDBasicReuser__ Integer NOT NULL,
	PRIMARY KEY BasicReuser (__IDBasicReuser__)
) ;

CREATE TABLE CompositeReuser_subreuser_ReuserClause (
	__IDCompositeReuser__ Integer NOT NULL,
	__IDReuserClause__ Integer NOT NULL
) ;

CREATE TABLE Dependency_subDependency_Dependency (
	__IDDependency__ Integer NOT NULL,
	__IDDependency__ Integer NOT NULL
) ;
