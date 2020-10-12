module MetamodelRoot {

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

	type @[DataRepresentation.Concept] : @[SimplfiedMiningMart.Class], @[DataRepresentation.Parameter] {
		SubConceptRestriction_Att : Text;
		IsA_Ref : @[DataRepresentation.Concept];
		FromConcept_Ref : @[DataRepresentation.RelationShip];
		ToConcept_Ref : @[DataRepresentation.RelationShip];
		CorrespondsToColumnSet_Ref : @[DataRepresentation.ColumnSet]?;
	};

	type @[DataRepresentation.RelationShip] : @[SimplfiedMiningMart.ModelElement], @[DataRepresentation.Parameter] {
		Name_Att : Text;
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

	type @[DataRepresentation.Value] : @[SimplfiedMiningMart.Attribute], @[DataRepresentation.Parameter] {
		Name_Att : Text;
		DomainDataType_Ref : @[DataRepresentation.DomainDataType];
		BelongsToUserInput_ContRef : @[DataRepresentation.UserInput]+;
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

	type @[DataRepresentation.Parameter];
}