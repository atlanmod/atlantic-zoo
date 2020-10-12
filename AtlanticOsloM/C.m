module C {

	type CDataType : CClassifier;

	type CIntegral : CDataType;

	type CFloating : CDataType;

	type CBitField : CDataType;

	type CVoid : CDataType;

	type CEnumeration : CIntegral;

	type CInt : CIntegral;

	type CChar : CIntegral;

	type CDouble : CFloating;

	type CFloat : CFloating;

	type CLongDouble : CFloating;

	type CUnsignedInt : CInt;

	type CLong : CInt;

	type CLongLong : CInt;

	type CShort : CInt;

	type CSignedChar : CChar;

	type CUnsignedChar : CChar;

	type CWChar : CChar;

	type UnsignedLong : CUnsignedInt;

	type UnsignedLongLong : CUnsignedInt;

	type UnsignedShort : CUnsignedInt;

	type CClassifier;

	type Derived : CClassifier;

	type CStructureContents {
		Sc_container_Ref : CStructured?;
	};

	type CStructured : CClassifier, CStructureContents {
		Contains_ContRef : CStructureContents*;
	};

	type CStruct : CStructured;

	type CUnion : CStructured;

	type CSourceText {
		Source_Att : Text;
		FileName_Att : Text;
	};

	type CTypedElement {
		Type_Ref : CClassifier;
		Source_Ref : CSourceText;
	};

	type CStructuralFeature : CStructureContents, CTypedElement;

	type CField : CStructuralFeature;

	type CParameter : CTypedElement {
		BehavioralFeature_Ref : BehavioralFeature?;
	};

	type BehavioralFeature {
		Parameters_ContRef : CParameter*;
	};

	type CFunction : BehavioralFeature {
		IsVarArg_Att : Logical;
	};
}