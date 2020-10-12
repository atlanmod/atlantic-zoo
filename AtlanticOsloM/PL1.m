module @[PL/I] {

	type PLIClassifier {
		Name_Att : Text;
		TypedElements_Ref : PLIElement*;
	};

	type PLISimpleType : PLIClassifier {
		Alias_Ref : PLIAlias;
	};

	type PLINamedType : PLIClassifier;

	type PLIComposedType : PLIClassifier {
		Elements_ContRef : PLIElement*;
	};

	type PLIAlias {
		Type_ContRef : PLISimpleType;
		Contains_ContRef : PLIAttribute+;
	};

	type PLIAttribute;

	type PLIComputationalType : PLISimpleType;

	type PLINonComputationalType : PLISimpleType;

	type PLIElement {
		Level_Att : Text;
		Name_Att : Text;
		SharedType_Ref : PLIClassifier?;
		Group_Ref : PLIComposedType?;
		Initial_Ref : PLIElementInitialValue?;
		Source_Ref : PLISourceText;
		Array_ContRef : PLIArray?;
	};

	type PLIElementInitialValue {
		InitialValue_Att : Text;
	};

	type PLISourceText {
		Source_Att : Text;
		FileName_Att : Text;
	};

	type PLIArray {
		ArrayOf_Ref : PLIElement?;
	};

	type PLIFixedBoundArray : PLIArray {
		IBound_Att : Integer32;
		UBound_Att : Integer32;
		ReferredTo_Ref : PLIElement;
	};

	type PLIFixedLboundArray : PLIArray {
		IBound_Att : Integer32;
		UBoundToAllocate_Att : Text;
		ReferredTo_Ref : PLIElement;
	};

	type PLIHBoundArray : PLIArray {
		UBound_Att : Integer32;
		IBoundToAllocate_Att : Text;
		ReferredTo_Ref : PLIElement;
	};

	type PLIVariableBoundArray : PLIArray {
		IBoundToAllocate_Att : Text;
		HBoundToAllocate_Att : Text;
		ReferredTo_Ref : PLIElement;
	};
}