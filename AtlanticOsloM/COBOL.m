module COBOL {

	type COBOLUsageValue {"cuv_binary", "cuv_dbcs", "cuv_double", "cuv_display", "cuv_float", "cuv_index", "cuv_objectReference", "cuv_packedDecimal", "cuv_pointer", "cuv_procedurePointer"};

	type COBOLInitialValueKind {"civk_string_value", "civk_low_value", "civk_high_value", "civk_zero_value", "civk_quotes", "civk_null", "civk_all_literal"};

	type COBOLElement {
		Level_Att : Text;
		Refined_Att : Logical;
		Name_Att : Text;
		SharedType_Ref : COBOLClassifier;
		Group_Ref : COBOLComposedType?;
		Initial_Ref : COBOLElementInitialValue*;
		Contains_ContRef : COBOL88Element*;
		Source_Ref : COBOLSourceText;
		Array_ContRef : COBOLFixedLengthArray?;
	};

	type COBOLClassifier {
		Typeded_Att : Logical;
		Name_Att : Text;
		TypedElements_Ref : COBOLElement*;
	};

	type COBOLSimpleType : COBOLClassifier {
		UsageValue_Att : COBOLUsageValue;
		PictureString_Att : Text;
		Usage_Att : Logical;
	};

	type COBOLComposedType : COBOLClassifier {
		Elements_ContRef : COBOLElement*;
	};

	type COBOLElementInitialValue {
		InitVal_Att : Text;
		ValueKind_Att : COBOLInitialValueKind;
	};

	type COBOL88Element {
		Name_Att : Text;
		Has_ContRef : COBOL88ElementValue+;
	};

	type COBOL88ElementValue {
		LowerLimit_Att : Text;
		UpperLimit_Att : Text;
		Range_Att : Logical;
	};

	type COBOLRedefiningElement : COBOLElement {
		Redefines_Ref : COBOLElement;
	};

	type COBOL66Element {
		Name_Att : Text;
		End_Ref : COBOLElement?;
		Start_Ref : COBOLElement;
	};

	type COBOLSourceText {
		Source_Att : Text;
		FileName_Att : Text;
	};

	type COBOLFixedLengthArray {
		MaxUpper_Att : Integer32;
	};

	type COBOLVariableLengthArray : COBOLFixedLengthArray {
		MinUpper_Att : Integer32;
		DependingOn_Ref : COBOLElement;
	};
}