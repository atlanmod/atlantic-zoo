module MetamodelRoot {

	type @[CaseRepresentation.Case] : @[SimplfiedMiningMart.ModelElement] {
		Name_Att : Text;
		CaseMode_Att : Logical;
		CaseInput_Ref : @[CaseRepresentation.Parameter];
		Documentation_Att : Text;
		ListOfStep_ContRef : @[CaseRepresentation.Step]+;
	};

	type @[CaseRepresentation.Step] : @[SimplfiedMiningMart.ModelElement] {
		Name_Att : Text;
		Description_Att : Text;
		BelongsToCase_Ref : @[CaseRepresentation.Case];
		EmbedsOperator_Ref : @[CaseRepresentation.Operator];
		Predecessors_Ref : @[CaseRepresentation.Step]*;
		Successors_Ref : @[CaseRepresentation.Step]*;
	};

	type @[CaseRepresentation.LoopStep] : @[CaseRepresentation.Step];

	type @[CaseRepresentation.MultiStep] : @[CaseRepresentation.Step] {
		IterationCondition_Att : Text;
	};

	type @[CaseRepresentation.Operator] : @[SimplfiedMiningMart.ModelElement] {
		Loopable_Att : Logical;
		NumberOfInputParameters_Att : Integer32;
		NumberOfOutputParameters_Att : Integer32;
		Manual_Att : Logical;
		Tool_Att : Text;
		Input_Ref : @[CaseRepresentation.Parameter]+;
		Output_Ref : @[CaseRepresentation.Parameter]+;
		Realizes_Ref : @[CaseRepresentation.ExecutionElement];
	};

	type @[CaseRepresentation.Parameter] {
		Name_Att : Text;
		Place_Att : Text;
		ParameterType_Ref : @[CaseRepresentation.ParameterType];
		BelongsToOperator_Ref : @[CaseRepresentation.Operator];
	};

	type @[CaseRepresentation.ParameterType] {"Value", "Concept", "RelationShip", "FeatureAttribute"};

	type @[CaseRepresentation.FeatureConstruction] : @[CaseRepresentation.Operator] {
		ScalingFactor_Att : Integer32;
	};

	type @[CaseRepresentation.DataMinStep] : @[CaseRepresentation.Operator];

	type @[CaseRepresentation.TimeOperator] : @[CaseRepresentation.Operator];

	type @[CaseRepresentation.FeatureSelection] : @[CaseRepresentation.Operator];

	type @[CaseRepresentation.MultiRelFeatureConstr] : @[CaseRepresentation.Operator];

	type @[CaseRepresentation.RowSelection] : @[CaseRepresentation.Operator];

	type @[CaseRepresentation.Agregation] : @[CaseRepresentation.MultiRelFeatureConstr];

	type @[CaseRepresentation.Scaling] : @[CaseRepresentation.FeatureConstruction];

	type @[CaseRepresentation.Discretization] : @[CaseRepresentation.FeatureConstruction];

	type @[CaseRepresentation.Segmentation] : @[CaseRepresentation.RowSelection];

	type @[CaseRepresentation.Sampling] : @[CaseRepresentation.RowSelection];

	type @[CaseRepresentation.ExecutionElement] {
		Source_Ref : @[CaseRepresentation.DataObject];
		Target_Ref : @[CaseRepresentation.DataObject];
	};

	type @[CaseRepresentation.DataObject] {
		Source_Ref : @[CaseRepresentation.ExecutionElement];
		Target_Ref : @[CaseRepresentation.ExecutionElement];
	};

	type @[CaseRepresentation.MSL-Tool] : @[CaseRepresentation.ExecutionElement];

	type @[CaseRepresentation.TransformationGroup] : @[CaseRepresentation.ExecutionElement] {
		Transformation_ContRef : @[CaseRepresentation.Transformation]*;
	};

	type @[CaseRepresentation.Transformation] : @[CaseRepresentation.ExecutionElement] {
		TransformationGroup_Ref : @[CaseRepresentation.TransformationGroup];
	};

	type @[CaseRepresentation.Function] : @[CaseRepresentation.Transformation] {
		NameOf_Att : Text;
		Signature_Att : Text;
	};

	type @[CaseRepresentation.StoredProcedure] : @[CaseRepresentation.Transformation] {
		NameOf_Att : Text;
		Signature_Att : Text;
	};

	type @[CaseRepresentation.SQLQuery] : @[CaseRepresentation.Transformation];

	type @[SimplfiedMiningMart.ModelElement];

	type @[SimplfiedMiningMart.Classifier] : @[SimplfiedMiningMart.ModelElement];

	type @[SimplfiedMiningMart.StructuralFeature] : @[SimplfiedMiningMart.ModelElement];

	type @[SimplfiedMiningMart.Class] : @[SimplfiedMiningMart.Classifier] {
		Name_Att : Text;
		Attributes_ContRef : @[SimplfiedMiningMart.Attribute]+;
	};

	type @[SimplfiedMiningMart.DataType] : @[SimplfiedMiningMart.Classifier] {
		Attribute_Ref : @[SimplfiedMiningMart.Attribute];
	};

	type @[SimplfiedMiningMart.Attribute] : @[SimplfiedMiningMart.StructuralFeature] {
		Class_Ref : @[SimplfiedMiningMart.Class];
		Has_Ref : @[SimplfiedMiningMart.DataType];
	};
}