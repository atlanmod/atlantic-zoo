CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	PRIMARY KEY Node (__IDNode__)
) ;

CREATE TABLE Resource (
	__IDResource__ Integer NOT NULL,
	FOREIGN KEY context (__FKcontext__) REFERENCES Package (__IDPackage__),
	PRIMARY KEY Resource (__IDResource__),
	__FKcontext__ Integer
) ;

CREATE TABLE Literal (
	__IDLiteral__ Integer NOT NULL,
	PRIMARY KEY Literal (__IDLiteral__)
) ;

CREATE TABLE Fact (
	__IDFact__ Integer NOT NULL,
	FOREIGN KEY object (__FKobject__) REFERENCES Node (__IDNode__),
	FOREIGN KEY subject (__FKsubject__) REFERENCES Resource (__IDResource__),
	FOREIGN KEY predicate (__FKpredicate__) REFERENCES Resource (__IDResource__),
	FOREIGN KEY context (__FKcontext__) REFERENCES Package (__IDPackage__),
	PRIMARY KEY Fact (__IDFact__),
	__FKcontext__ Integer,
	__FKobject__ Integer,
	__FKsubject__ Integer,
	__FKpredicate__ Integer
) ;

CREATE TABLE Package (
	__IDPackage__ Integer NOT NULL,
	PRIMARY KEY Package (__IDPackage__)
) ;

CREATE TABLE Ontology (
	__IDOntology__ Integer NOT NULL,
	PRIMARY KEY Ontology (__IDOntology__)
) ;

CREATE TABLE Ontology_imports_Package (
	__IDOntology__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;
