CREATE TABLE COBOLElement (
	__IDCOBOLElement__ Integer NOT NULL,
	level text,
	refined Boolean,
	name text,
	FOREIGN KEY sharedType (__FKsharedType__) REFERENCES COBOLClassifier (__IDCOBOLClassifier__),
	FOREIGN KEY "group" (__FKgroup__) REFERENCES COBOLComposedType (__IDCOBOLComposedType__),
	FOREIGN KEY source (__FKsource__) REFERENCES COBOLSourceText (__IDCOBOLSourceText__),
	FOREIGN KEY array (__FKarray__) REFERENCES COBOLFixedLengthArray (__IDCOBOLFixedLengthArray__),
	PRIMARY KEY COBOLElement (__IDCOBOLElement__),
	__FKsharedType__ Integer,
	__FKgroup__ Integer,
	__FKarray__ Integer,
	__FKsource__ Integer
) ;

CREATE TABLE COBOLClassifier (
	__IDCOBOLClassifier__ Integer NOT NULL,
	typeded Boolean,
	name text,
	PRIMARY KEY COBOLClassifier (__IDCOBOLClassifier__)
) ;

CREATE TABLE COBOLSimpleType (
	__IDCOBOLSimpleType__ Integer NOT NULL,
	usageValue text,
	pictureString text,
	"usage" Boolean,
	PRIMARY KEY COBOLSimpleType (__IDCOBOLSimpleType__)
) ;

CREATE TABLE COBOLComposedType (
	__IDCOBOLComposedType__ Integer NOT NULL,
	PRIMARY KEY COBOLComposedType (__IDCOBOLComposedType__)
) ;

CREATE TABLE COBOLElementInitialValue (
	__IDCOBOLElementInitialValue__ Integer NOT NULL,
	initVal text,
	valueKind text,
	PRIMARY KEY COBOLElementInitialValue (__IDCOBOLElementInitialValue__)
) ;

CREATE TABLE COBOL88Element (
	__IDCOBOL88Element__ Integer NOT NULL,
	name text,
	PRIMARY KEY COBOL88Element (__IDCOBOL88Element__)
) ;

CREATE TABLE COBOL88ElementValue (
	__IDCOBOL88ElementValue__ Integer NOT NULL,
	lowerLimit text,
	upperLimit text,
	range Boolean,
	PRIMARY KEY COBOL88ElementValue (__IDCOBOL88ElementValue__)
) ;

CREATE TABLE COBOLRedefiningElement (
	__IDCOBOLRedefiningElement__ Integer NOT NULL,
	FOREIGN KEY redefines (__FKredefines__) REFERENCES COBOLElement (__IDCOBOLElement__),
	PRIMARY KEY COBOLRedefiningElement (__IDCOBOLRedefiningElement__),
	__FKredefines__ Integer
) ;

CREATE TABLE COBOL66Element (
	__IDCOBOL66Element__ Integer NOT NULL,
	name text,
	FOREIGN KEY end (__FKend__) REFERENCES COBOLElement (__IDCOBOLElement__),
	FOREIGN KEY start (__FKstart__) REFERENCES COBOLElement (__IDCOBOLElement__),
	PRIMARY KEY COBOL66Element (__IDCOBOL66Element__),
	__FKstart__ Integer,
	__FKend__ Integer
) ;

CREATE TABLE COBOLSourceText (
	__IDCOBOLSourceText__ Integer NOT NULL,
	source text,
	fileName text,
	PRIMARY KEY COBOLSourceText (__IDCOBOLSourceText__)
) ;

CREATE TABLE COBOLFixedLengthArray (
	__IDCOBOLFixedLengthArray__ Integer NOT NULL,
	maxUpper Integer,
	PRIMARY KEY COBOLFixedLengthArray (__IDCOBOLFixedLengthArray__)
) ;

CREATE TABLE COBOLVariableLengthArray (
	__IDCOBOLVariableLengthArray__ Integer NOT NULL,
	minUpper Integer,
	FOREIGN KEY dependingOn (__FKdependingOn__) REFERENCES COBOLElement (__IDCOBOLElement__),
	PRIMARY KEY COBOLVariableLengthArray (__IDCOBOLVariableLengthArray__),
	__FKdependingOn__ Integer
) ;

CREATE TABLE COBOLClassifier_typedElements_COBOLElement (
	__IDCOBOLClassifier__ Integer NOT NULL,
	__IDCOBOLElement__ Integer NOT NULL
) ;

CREATE TABLE COBOL88Element_has_COBOL88ElementValue (
	__IDCOBOL88Element__ Integer NOT NULL,
	__IDCOBOL88ElementValue__ Integer NOT NULL
) ;

CREATE TABLE COBOLElement_initial_COBOLElementInitialValue (
	__IDCOBOLElement__ Integer NOT NULL,
	__IDCOBOLElementInitialValue__ Integer NOT NULL
) ;

CREATE TABLE COBOLComposedType_elements_COBOLElement (
	__IDCOBOLComposedType__ Integer NOT NULL,
	__IDCOBOLElement__ Integer NOT NULL
) ;

CREATE TABLE COBOLElement_contains_COBOL88Element (
	__IDCOBOLElement__ Integer NOT NULL,
	__IDCOBOL88Element__ Integer NOT NULL
) ;
