module QoSCharacteristic {

	type QoSCharacteristic {
		Invariant_Ref : BooleanExpression;
		Parallel_and_composition_Ref : MappingExpression;
		Parallel_or_composition_Ref : MappingExpression;
		Sequential_composition_Ref : MappingExpression;
		Values_Ref : MappingExpression;
		StatisticalAttribute_ContRef : StatisticalAttributekindKind*;
		Parameter_ContRef : Parameter;
		Domain_Ref : Domain;
	};

	type BooleanExpression {
		Value_Att : Text;
	};

	type MappingExpression {
		Value_Att : Text;
	};

	type StatisticalAttributekindKind;

	type Parameter;

	type DataType;

	type Domain : DataType {
		Direction_Ref : DirectionKind;
	};

	type DirectionKind {
		Value_Att : Text;
	};

	type Numeric : Domain;

	type Set : Domain {
		StringSet_ContRef : StringSet+;
	};

	type Enumeration : Domain;

	type StringSet {
		String_Att : Text;
	};
}