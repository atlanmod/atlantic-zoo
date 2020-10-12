module OCLOperations {

	type OperationExp;

	type PropertyOperation : OperationExp {
		IsMarkedPre_Att : Logical;
		Source_ContRef : OclExpression;
	};

	type OclOperation : OperationExp {
		Arguments_ContRef : OclExpression;
	};

	type ConstExp : OperationExp;

	type IntegerConstExp : ConstExp {
		Value_Att : Integer32;
	};

	type StringConstExp : ConstExp {
		Value_Att : Text;
	};

	type RealConstExp : ConstExp {
		Value_Att : Double;
	};

	type AttributeExp : PropertyOperation {
		Attr_ContRef : Attribute;
	};

	type Attribute {
		AttrExp_Ref : AttributeExp*;
	};

	type NaviguationExp : PropertyOperation {
		AssEnd_ContRef : AssocationEnd;
		QualifierValues_ContRef : OclExpression;
	};

	type AssocationEnd {
		NavExp_Ref : NaviguationExp*;
	};

	type ClassifierOperation : PropertyOperation {
		Op_ContRef : Operation;
		Arguments_ContRef : OclExpression;
	};

	type Operation {
		ClassOp_Ref : ClassifierOperation*;
	};

	type OclExpression {
		PropertyOperations_Ref : PropertyOperation*;
		NaviguationExps_Ref : NaviguationExp*;
		ClassifierOperations_Ref : ClassifierOperation*;
		OclOperations_Ref : OclOperation*;
	};
}