CREATE TABLE PLIClassifier (
	__IDPLIClassifier__ Integer NOT NULL,
	name text,
	PRIMARY KEY PLIClassifier (__IDPLIClassifier__)
) ;

CREATE TABLE PLISimpleType (
	__IDPLISimpleType__ Integer NOT NULL,
	FOREIGN KEY alias (__FKalias__) REFERENCES PLIAlias (__IDPLIAlias__),
	PRIMARY KEY PLISimpleType (__IDPLISimpleType__),
	__FKalias__ Integer
) ;

CREATE TABLE PLINamedType (
	__IDPLINamedType__ Integer NOT NULL,
	PRIMARY KEY PLINamedType (__IDPLINamedType__)
) ;

CREATE TABLE PLIComposedType (
	__IDPLIComposedType__ Integer NOT NULL,
	PRIMARY KEY PLIComposedType (__IDPLIComposedType__)
) ;

CREATE TABLE PLIAlias (
	__IDPLIAlias__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES PLISimpleType (__IDPLISimpleType__),
	PRIMARY KEY PLIAlias (__IDPLIAlias__),
	__FKtype__ Integer
) ;

CREATE TABLE PLIAttribute (
	__IDPLIAttribute__ Integer NOT NULL,
	PRIMARY KEY PLIAttribute (__IDPLIAttribute__)
) ;

CREATE TABLE PLIComputationalType (
	__IDPLIComputationalType__ Integer NOT NULL,
	PRIMARY KEY PLIComputationalType (__IDPLIComputationalType__)
) ;

CREATE TABLE PLINonComputationalType (
	__IDPLINonComputationalType__ Integer NOT NULL,
	PRIMARY KEY PLINonComputationalType (__IDPLINonComputationalType__)
) ;

CREATE TABLE PLIElement (
	__IDPLIElement__ Integer NOT NULL,
	level text,
	name text,
	FOREIGN KEY sharedType (__FKsharedType__) REFERENCES PLIClassifier (__IDPLIClassifier__),
	FOREIGN KEY "group" (__FKgroup__) REFERENCES PLIComposedType (__IDPLIComposedType__),
	FOREIGN KEY initial (__FKinitial__) REFERENCES PLIElementInitialValue (__IDPLIElementInitialValue__),
	FOREIGN KEY source (__FKsource__) REFERENCES PLISourceText (__IDPLISourceText__),
	FOREIGN KEY array (__FKarray__) REFERENCES PLIArray (__IDPLIArray__),
	PRIMARY KEY PLIElement (__IDPLIElement__),
	__FKsource__ Integer,
	__FKgroup__ Integer,
	__FKsharedType__ Integer,
	__FKarray__ Integer,
	__FKinitial__ Integer
) ;

CREATE TABLE PLIElementInitialValue (
	__IDPLIElementInitialValue__ Integer NOT NULL,
	initialValue text,
	PRIMARY KEY PLIElementInitialValue (__IDPLIElementInitialValue__)
) ;

CREATE TABLE PLISourceText (
	__IDPLISourceText__ Integer NOT NULL,
	source text,
	fileName text,
	PRIMARY KEY PLISourceText (__IDPLISourceText__)
) ;

CREATE TABLE PLIArray (
	__IDPLIArray__ Integer NOT NULL,
	FOREIGN KEY arrayOf (__FKarrayOf__) REFERENCES PLIElement (__IDPLIElement__),
	PRIMARY KEY PLIArray (__IDPLIArray__),
	__FKarrayOf__ Integer
) ;

CREATE TABLE PLIFixedBoundArray (
	__IDPLIFixedBoundArray__ Integer NOT NULL,
	IBound Integer,
	uBound Integer,
	FOREIGN KEY referredTo (__FKreferredTo__) REFERENCES PLIElement (__IDPLIElement__),
	PRIMARY KEY PLIFixedBoundArray (__IDPLIFixedBoundArray__),
	__FKreferredTo__ Integer
) ;

CREATE TABLE PLIFixedLboundArray (
	__IDPLIFixedLboundArray__ Integer NOT NULL,
	IBound Integer,
	uBoundToAllocate text,
	FOREIGN KEY referredTo (__FKreferredTo__) REFERENCES PLIElement (__IDPLIElement__),
	PRIMARY KEY PLIFixedLboundArray (__IDPLIFixedLboundArray__),
	__FKreferredTo__ Integer
) ;

CREATE TABLE PLIHBoundArray (
	__IDPLIHBoundArray__ Integer NOT NULL,
	uBound Integer,
	IBoundToAllocate text,
	FOREIGN KEY referredTo (__FKreferredTo__) REFERENCES PLIElement (__IDPLIElement__),
	PRIMARY KEY PLIHBoundArray (__IDPLIHBoundArray__),
	__FKreferredTo__ Integer
) ;

CREATE TABLE PLIVariableBoundArray (
	__IDPLIVariableBoundArray__ Integer NOT NULL,
	IBoundToAllocate text,
	hBoundToAllocate text,
	FOREIGN KEY referredTo (__FKreferredTo__) REFERENCES PLIElement (__IDPLIElement__),
	PRIMARY KEY PLIVariableBoundArray (__IDPLIVariableBoundArray__),
	__FKreferredTo__ Integer
) ;

CREATE TABLE PLIAlias_contains_PLIAttribute (
	__IDPLIAlias__ Integer NOT NULL,
	__IDPLIAttribute__ Integer NOT NULL
) ;

CREATE TABLE PLIComposedType_elements_PLIElement (
	__IDPLIComposedType__ Integer NOT NULL,
	__IDPLIElement__ Integer NOT NULL
) ;

CREATE TABLE PLIClassifier_typedElements_PLIElement (
	__IDPLIClassifier__ Integer NOT NULL,
	__IDPLIElement__ Integer NOT NULL
) ;
