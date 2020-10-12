module MiningMart {

	type InOut {"Input", "OutPut"};

	type LinkPackage {
		Type_Att : InOut;
		DataObject_Ref : @[CaseRepresentation.DataObject];
		Value_Ref : @[DataRepresentation.Value]?;
		Column_Ref : @[DataRepresentation.Column]?;
		ColumnSet_Ref : @[DataRepresentation.ColumnSet]?;
	};

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

	type @[DataRepresentation.Column] : @[SimplfiedMiningMart.Attribute] {
		Name_Att : Text;
		DataType_Ref : @[SimplfiedMiningMart.DataType];
		Keys_Ref : @[DataRepresentation.Key]*;
		BelongsToColumnSet_Ref : @[DataRepresentation.ColumnSet];
		CorespondsToBaseAttribute_Ref : @[DataRepresentation.BaseAttribute];
		LinkPackage_Ref : LinkPackage?;
	};

	type @[DataRepresentation.ColumnSet] : @[SimplfiedMiningMart.Class] {
		Number_Att : Integer32;
		File_Att : Text;
		DbConnectString_Att : Text;
		User_Att : Text;
		HasColumn_Ref : @[DataRepresentation.Column]+;
		HasKey_Ref : @[DataRepresentation.Key]+;
		CorrespondsToConcept_Ref : @[DataRepresentation.Concept]?;
		CorrespondsToRelationShip_Ref : @[DataRepresentation.RelationShip]?;
		LinkPackage_Ref : LinkPackage?;
	};

	type @[DataRepresentation.ColumnStatistics] {
		Unique_Att : Integer32;
		Missing_Att : Integer32;
		Min_Att : Integer32;
		Max_Att : Integer32;
		Average_Att : Integer32;
		StandarDeviation_Att : Integer32;
		DistributionValue_Att : Text;
		DistributionCount_Att : Integer32;
		DistributionMin_Att : Integer32;
		DistributionMax_Att : Integer32;
		ForColumn_Ref : @[DataRepresentation.Column];
	};

	type @[DataRepresentation.ColumnSetStatistics] : @[SimplfiedMiningMart.ModelElement] {
		AllNumber_Att : Integer32;
		OrdinalNumber_Att : Integer32;
		NominalNumber_Att : Integer32;
		TimeNumber_Att : Integer32;
		ForColumnSet_Ref : @[DataRepresentation.ColumnSet];
	};

	type @[DataRepresentation.Snapshot] : @[DataRepresentation.ColumnSet];

	type @[DataRepresentation.Table] : @[DataRepresentation.ColumnSet];

	type @[DataRepresentation.View] : @[DataRepresentation.ColumnSet];

	type @[DataRepresentation.Key] : @[SimplfiedMiningMart.ModelElement] {
		IsUsedForIndex_Att : Logical;
		HasColumn_Ref : @[DataRepresentation.Column]+;
		IsAssociatedToColumnSet_Ref : @[DataRepresentation.ColumnSet];
	};

	type @[DataRepresentation.ForeignKey] : @[DataRepresentation.Key] {
		IsConnectionTo_Ref : @[DataRepresentation.Table]?;
		CorrespondsToRelationShip_Ref : @[DataRepresentation.RelationShip]?;
	};

	type @[DataRepresentation.PrimaryKey] : @[DataRepresentation.Key];

	type @[DataRepresentation.Concept] : @[SimplfiedMiningMart.Class], @[CaseRepresentation.Parameter] {
		SubConceptRestriction_Att : Text;
		IsA_Ref : @[DataRepresentation.Concept];
		FromConcept_Ref : @[DataRepresentation.RelationShip];
		ToConcept_Ref : @[DataRepresentation.RelationShip];
		CorrespondsToColumnSet_Ref : @[DataRepresentation.ColumnSet]?;
	};

	type @[DataRepresentation.RelationShip] : @[SimplfiedMiningMart.ModelElement], @[CaseRepresentation.Parameter] {
		SubRelationShipRestriction_Att : Text;
		Defined_Att : Text;
		IsA_Ref : @[DataRepresentation.RelationShip];
		CorrespondsToForeignKey_Ref : @[DataRepresentation.ForeignKey]+;
		CorrespondsToColumnSet_Ref : @[DataRepresentation.ColumnSet]?;
		FromConcept_Ref : @[DataRepresentation.Concept];
		ToConcept_Ref : @[DataRepresentation.Concept];
	};

	type @[DataRepresentation.FeatureAttribute] : @[SimplfiedMiningMart.Attribute] {
		Name_Att : Text;
		RelevanceForMining_Att : Logical;
		AttributeType_Ref : @[SimplfiedMiningMart.DataType];
		BelongsToConcept_ContRef : @[DataRepresentation.Concept];
		CorrespondsToColumns_Ref : @[DataRepresentation.Column]+;
	};

	type @[DataRepresentation.BaseAttribute] : @[DataRepresentation.FeatureAttribute] {
		IsPartMultiColumnFeature_Ref : @[DataRepresentation.MultiColumnFeature]?;
		DomainDataType_Ref : @[DataRepresentation.DomainDataType];
	};

	type @[DataRepresentation.MultiColumnFeature] : @[DataRepresentation.FeatureAttribute] {
		ConsitsOfBaseAttributes_ContRef : @[DataRepresentation.BaseAttribute]*;
	};

	type @[DataRepresentation.Value] : @[SimplfiedMiningMart.Attribute], @[CaseRepresentation.Parameter] {
		DomainDataType_Ref : @[DataRepresentation.DomainDataType];
		BelongsToUserInput_ContRef : @[DataRepresentation.UserInput]+;
		LinkPackage_Ref : LinkPackage?;
	};

	type @[DataRepresentation.UserInput] : @[SimplfiedMiningMart.Class] {
		ContainsValues_Ref : @[DataRepresentation.Value]+;
	};

	type @[DataRepresentation.Ordinal] : @[DataRepresentation.DomainDataType];

	type @[DataRepresentation.Scalar] : @[DataRepresentation.Ordinal];

	type @[DataRepresentation.Time] : @[DataRepresentation.Scalar];

	type @[DataRepresentation.Binary] : @[DataRepresentation.Scalar], @[DataRepresentation.Nominal];

	type @[DataRepresentation.Categorial] : @[DataRepresentation.Nominal];

	type @[DataRepresentation.KeyAttribute] : @[DataRepresentation.Nominal];

	type @[DataRepresentation.TimeGroup] : @[DataRepresentation.KeyAttribute];

	type @[DataRepresentation.Spatial] : @[DataRepresentation.KeyAttribute];

	type @[DataRepresentation.Constant] : @[DataRepresentation.Nominal];

	type @[DataRepresentation.RoleRestriction] : @[SimplfiedMiningMart.Attribute] {
		Name_Att : Text;
		RestrictionForRelationShip_Ref : @[DataRepresentation.RelationShip];
		RestrictionForConcept_Ref : @[DataRepresentation.Concept];
		RestrictionToConcept_Ref : @[DataRepresentation.Concept];
		Min_Att : Integer32;
		Max_Att : Integer32;
		BelongsToConcept_Ref : @[DataRepresentation.Concept];
	};

	type @[DataRepresentation.DomainDataType] : @[SimplfiedMiningMart.DataType] {
		BaseAttributeD_Ref : @[DataRepresentation.BaseAttribute];
	};

	type @[DataRepresentation.Nominal] : @[DataRepresentation.DomainDataType];

	type @[CaseRepresentation.Case] : @[SimplfiedMiningMart.ModelElement] {
		Name_Att : Text;
		CaseMode_Att : Logical;
		CaseInput_Ref : @[CaseRepresentation.Parameter];
		CaseOutput_Ref : @[DataRepresentation.Concept];
		Documentation_Att : Text;
		ListOfStep_ContRef : @[CaseRepresentation.Step]+;
		Population_Ref : @[DataRepresentation.Concept];
		TargetAttributes_Ref : @[DataRepresentation.FeatureAttribute];
	};

	type @[CaseRepresentation.Step] : @[SimplfiedMiningMart.ModelElement] {
		Name_Att : Text;
		Description_Att : Text;
		BelongsToCase_Ref : @[CaseRepresentation.Case];
		EmbedsOperator_Ref : @[CaseRepresentation.Operator];
		Predecessors_Ref : @[CaseRepresentation.Step]*;
		Successors_Ref : @[CaseRepresentation.Step]*;
	};

	type @[CaseRepresentation.LoopStep] : @[CaseRepresentation.Step] {
		IterationSet_Ref : @[DataRepresentation.FeatureAttribute]*;
		OutputSet_Ref : @[DataRepresentation.FeatureAttribute]*;
	};

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
		ParameterType_Att : @[CaseRepresentation.ParameterType];
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
		LinkPackageCaseRepresentation_Ref : LinkPackage;
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

	type @[CaseRepresentation.SQLQuery] : @[CaseRepresentation.Transformation] {
		Select_Ref : @[DataRepresentation.Column]+;
		From_Ref : @[DataRepresentation.ColumnSet]+;
		Where_Att : Text;
	};
}