module CWMRelationalData {

	type QueryExpression {
		Expresssion_Att : Text;
	};

	type CheckConstraint {
		ConstraintElements_Ref : Column*;
		ConstrainedElements_Ref : Table*;
	};

	type Column {
		Precision_Att : Integer32;
		Scale_Att : Integer32;
		IsNullable_Att : Logical;
		Length_Att : Integer32;
		CollectionName_Att : Text;
		CharacterSetName_Att : Text;
		Column_constraints_Ref : CheckConstraint*;
		Type_Ref : SQLDataType;
		Owner_Ref : ColumnSet?;
		OptionScopeColumnSet_Ref : NamedColumnSet?;
	};

	type ColumnSet {
		Features_ContRef : Column*;
	};

	type NamedColumnSet : ColumnSet {
		OptionScopeColumn_Ref : Column;
		Triggers_Ref : Trigger*;
	};

	type QueryColumnSet : ColumnSet {
		Query_ContRef : QueryExpression;
	};

	type Table : NamedColumnSet {
		IsTemporary_Att : Logical;
		TemporaryScope_Att : Text;
		IsSystem_Att : Logical;
		Table_constraints_Ref : CheckConstraint*;
	};

	type View : NamedColumnSet {
		IsReadOnly_Att : Logical;
		CheckOption_Att : Logical;
		QueryExpression_ContRef : QueryExpression;
	};

	type Trigger {
		NamedColumnSet_Ref : NamedColumnSet;
	};

	type SQLDataType {
		TypeNumber_Att : Integer32;
		StructuralFeatures_Ref : Column*;
	};

	type SQLDistinctType : SQLDataType {
		Length_Att : Integer32;
		Precision_Att : Integer32;
		Scale_Att : Integer32;
		SqlSimpleType_Ref : SQLSimpleType;
	};

	type SQLSimpleType : SQLDataType {
		CharacterMaximumLength_Att : Integer32;
		CharacterOctetLength_Att : Integer32;
		NumericPrecision_Att : Integer32;
		NumericPrecisionRadix_Att : Integer32;
		NumericScale_Att : Integer32;
		DateTimePrecision_Att : Integer32;
		SqlDistinctTypes_Ref : SQLDistinctType*;
	};
}