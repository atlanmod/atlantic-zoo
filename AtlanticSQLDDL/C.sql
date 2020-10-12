CREATE TABLE CDataType (
	__IDCDataType__ Integer NOT NULL,
	PRIMARY KEY CDataType (__IDCDataType__)
) ;

CREATE TABLE CIntegral (
	__IDCIntegral__ Integer NOT NULL,
	PRIMARY KEY CIntegral (__IDCIntegral__)
) ;

CREATE TABLE CFloating (
	__IDCFloating__ Integer NOT NULL,
	PRIMARY KEY CFloating (__IDCFloating__)
) ;

CREATE TABLE CBitField (
	__IDCBitField__ Integer NOT NULL,
	PRIMARY KEY CBitField (__IDCBitField__)
) ;

CREATE TABLE CVoid (
	__IDCVoid__ Integer NOT NULL,
	PRIMARY KEY CVoid (__IDCVoid__)
) ;

CREATE TABLE CEnumeration (
	__IDCEnumeration__ Integer NOT NULL,
	PRIMARY KEY CEnumeration (__IDCEnumeration__)
) ;

CREATE TABLE CInt (
	__IDCInt__ Integer NOT NULL,
	PRIMARY KEY CInt (__IDCInt__)
) ;

CREATE TABLE CChar (
	__IDCChar__ Integer NOT NULL,
	PRIMARY KEY CChar (__IDCChar__)
) ;

CREATE TABLE CDouble (
	__IDCDouble__ Integer NOT NULL,
	PRIMARY KEY CDouble (__IDCDouble__)
) ;

CREATE TABLE CFloat (
	__IDCFloat__ Integer NOT NULL,
	PRIMARY KEY CFloat (__IDCFloat__)
) ;

CREATE TABLE CLongDouble (
	__IDCLongDouble__ Integer NOT NULL,
	PRIMARY KEY CLongDouble (__IDCLongDouble__)
) ;

CREATE TABLE CUnsignedInt (
	__IDCUnsignedInt__ Integer NOT NULL,
	PRIMARY KEY CUnsignedInt (__IDCUnsignedInt__)
) ;

CREATE TABLE CLong (
	__IDCLong__ Integer NOT NULL,
	PRIMARY KEY CLong (__IDCLong__)
) ;

CREATE TABLE CLongLong (
	__IDCLongLong__ Integer NOT NULL,
	PRIMARY KEY CLongLong (__IDCLongLong__)
) ;

CREATE TABLE CShort (
	__IDCShort__ Integer NOT NULL,
	PRIMARY KEY CShort (__IDCShort__)
) ;

CREATE TABLE CSignedChar (
	__IDCSignedChar__ Integer NOT NULL,
	PRIMARY KEY CSignedChar (__IDCSignedChar__)
) ;

CREATE TABLE CUnsignedChar (
	__IDCUnsignedChar__ Integer NOT NULL,
	PRIMARY KEY CUnsignedChar (__IDCUnsignedChar__)
) ;

CREATE TABLE CWChar (
	__IDCWChar__ Integer NOT NULL,
	PRIMARY KEY CWChar (__IDCWChar__)
) ;

CREATE TABLE UnsignedLong (
	__IDUnsignedLong__ Integer NOT NULL,
	PRIMARY KEY UnsignedLong (__IDUnsignedLong__)
) ;

CREATE TABLE UnsignedLongLong (
	__IDUnsignedLongLong__ Integer NOT NULL,
	PRIMARY KEY UnsignedLongLong (__IDUnsignedLongLong__)
) ;

CREATE TABLE UnsignedShort (
	__IDUnsignedShort__ Integer NOT NULL,
	PRIMARY KEY UnsignedShort (__IDUnsignedShort__)
) ;

CREATE TABLE CClassifier (
	__IDCClassifier__ Integer NOT NULL,
	PRIMARY KEY CClassifier (__IDCClassifier__)
) ;

CREATE TABLE Derived (
	__IDDerived__ Integer NOT NULL,
	PRIMARY KEY Derived (__IDDerived__)
) ;

CREATE TABLE CStructureContents (
	__IDCStructureContents__ Integer NOT NULL,
	FOREIGN KEY sc_container (__FKsc_container__) REFERENCES CStructured (__IDCStructured__),
	PRIMARY KEY CStructureContents (__IDCStructureContents__),
	__FKsc_container__ Integer
) ;

CREATE TABLE CStructured (
	__IDCStructured__ Integer NOT NULL,
	PRIMARY KEY CStructured (__IDCStructured__)
) ;

CREATE TABLE CStruct (
	__IDCStruct__ Integer NOT NULL,
	PRIMARY KEY CStruct (__IDCStruct__)
) ;

CREATE TABLE CUnion (
	__IDCUnion__ Integer NOT NULL,
	PRIMARY KEY CUnion (__IDCUnion__)
) ;

CREATE TABLE CSourceText (
	__IDCSourceText__ Integer NOT NULL,
	source text,
	fileName text,
	PRIMARY KEY CSourceText (__IDCSourceText__)
) ;

CREATE TABLE CTypedElement (
	__IDCTypedElement__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES CClassifier (__IDCClassifier__),
	FOREIGN KEY source (__FKsource__) REFERENCES CSourceText (__IDCSourceText__),
	PRIMARY KEY CTypedElement (__IDCTypedElement__),
	__FKtype__ Integer,
	__FKsource__ Integer
) ;

CREATE TABLE CStructuralFeature (
	__IDCStructuralFeature__ Integer NOT NULL,
	PRIMARY KEY CStructuralFeature (__IDCStructuralFeature__)
) ;

CREATE TABLE CField (
	__IDCField__ Integer NOT NULL,
	PRIMARY KEY CField (__IDCField__)
) ;

CREATE TABLE CParameter (
	__IDCParameter__ Integer NOT NULL,
	FOREIGN KEY behavioralFeature (__FKbehavioralFeature__) REFERENCES BehavioralFeature (__IDBehavioralFeature__),
	PRIMARY KEY CParameter (__IDCParameter__),
	__FKbehavioralFeature__ Integer
) ;

CREATE TABLE BehavioralFeature (
	__IDBehavioralFeature__ Integer NOT NULL,
	PRIMARY KEY BehavioralFeature (__IDBehavioralFeature__)
) ;

CREATE TABLE CFunction (
	__IDCFunction__ Integer NOT NULL,
	isVarArg Boolean,
	PRIMARY KEY CFunction (__IDCFunction__)
) ;

CREATE TABLE BehavioralFeature_parameters_CParameter (
	__IDBehavioralFeature__ Integer NOT NULL,
	__IDCParameter__ Integer NOT NULL
) ;

CREATE TABLE CStructured_contains_CStructureContents (
	__IDCStructured__ Integer NOT NULL,
	__IDCStructureContents__ Integer NOT NULL
) ;
