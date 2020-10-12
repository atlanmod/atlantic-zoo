CREATE TABLE Value (
	__IDValue__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY Value (__IDValue__),
	__FKtype__ Integer
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	PRIMARY KEY Type (__IDType__)
) ;

CREATE TABLE BasicValue (
	__IDBasicValue__ Integer NOT NULL,
	PRIMARY KEY BasicValue (__IDBasicValue__)
) ;

CREATE TABLE IntegerValue (
	__IDIntegerValue__ Integer NOT NULL,
	val Integer,
	PRIMARY KEY IntegerValue (__IDIntegerValue__)
) ;

CREATE TABLE RealValue (
	__IDRealValue__ Integer NOT NULL,
	val "Double",
	PRIMARY KEY RealValue (__IDRealValue__)
) ;

CREATE TABLE StringValue (
	__IDStringValue__ Integer NOT NULL,
	val text,
	PRIMARY KEY StringValue (__IDStringValue__)
) ;

CREATE TABLE BooleanValue (
	__IDBooleanValue__ Integer NOT NULL,
	val Boolean,
	PRIMARY KEY BooleanValue (__IDBooleanValue__)
) ;

CREATE TABLE ObjectValue (
	__IDObjectValue__ Integer NOT NULL,
	FOREIGN KEY object (__FKobject__) REFERENCES Object (__IDObject__),
	PRIMARY KEY ObjectValue (__IDObjectValue__),
	__FKobject__ Integer
) ;

CREATE TABLE Object (
	__IDObject__ Integer NOT NULL,
	FOREIGN KEY objectValue (__FKobjectValue__) REFERENCES ObjectValue (__IDObjectValue__),
	PRIMARY KEY Object (__IDObject__),
	__FKobjectValue__ Integer
) ;

CREATE TABLE EnumValue (
	__IDEnumValue__ Integer NOT NULL,
	FOREIGN KEY enumLiteral (__FKenumLiteral__) REFERENCES EnumLiteral (__IDEnumLiteral__),
	PRIMARY KEY EnumValue (__IDEnumValue__),
	__FKenumLiteral__ Integer
) ;

CREATE TABLE EnumLiteral (
	__IDEnumLiteral__ Integer NOT NULL,
	FOREIGN KEY enumValue (__FKenumValue__) REFERENCES EnumValue (__IDEnumValue__),
	PRIMARY KEY EnumLiteral (__IDEnumLiteral__),
	__FKenumValue__ Integer
) ;

CREATE TABLE UndefinedValue (
	__IDUndefinedValue__ Integer NOT NULL,
	PRIMARY KEY UndefinedValue (__IDUndefinedValue__)
) ;

CREATE TABLE CollectionValue (
	__IDCollectionValue__ Integer NOT NULL,
	PRIMARY KEY CollectionValue (__IDCollectionValue__)
) ;

CREATE TABLE BagValue (
	__IDBagValue__ Integer NOT NULL,
	PRIMARY KEY BagValue (__IDBagValue__)
) ;

CREATE TABLE SequenceValue (
	__IDSequenceValue__ Integer NOT NULL,
	PRIMARY KEY SequenceValue (__IDSequenceValue__)
) ;

CREATE TABLE SetValue (
	__IDSetValue__ Integer NOT NULL,
	PRIMARY KEY SetValue (__IDSetValue__)
) ;

CREATE TABLE Count (
	__IDCount__ Integer NOT NULL,
	num Integer,
	PRIMARY KEY Count (__IDCount__)
) ;

CREATE TABLE Value_bagValue_BagValue (
	__IDValue__ Integer NOT NULL,
	__IDBagValue__ Integer NOT NULL
) ;

CREATE TABLE SetValue_elements_Value (
	__IDSetValue__ Integer NOT NULL,
	__IDValue__ Integer NOT NULL
) ;

CREATE TABLE Value_sequenceValue_SequenceValue (
	__IDValue__ Integer NOT NULL,
	__IDSequenceValue__ Integer NOT NULL
) ;

CREATE TABLE SequenceValue_elements_Value (
	__IDSequenceValue__ Integer NOT NULL,
	__IDValue__ Integer NOT NULL
) ;

CREATE TABLE BagValue_elements_Value (
	__IDBagValue__ Integer NOT NULL,
	__IDValue__ Integer NOT NULL
) ;

CREATE TABLE Value_setValue_SetValue (
	__IDValue__ Integer NOT NULL,
	__IDSetValue__ Integer NOT NULL
) ;

CREATE TABLE Type_value_Value (
	__IDType__ Integer NOT NULL,
	__IDValue__ Integer NOT NULL
) ;
