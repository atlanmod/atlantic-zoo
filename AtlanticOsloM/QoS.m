module QoSConceptualModel {

	type QoSComponent {
		Profile_Ref : QoSProfile*;
		Operations_ContRef : Operation;
	};

	type QoSProfile {
		For_Ref : QoSComponent;
		Provide_Ref : QoSStatement+;
		Uses_Ref : QoSStatement+;
	};

	type QoSContraints : QoSCharacteristic;

	type Operation;

	type CompoundProfile : QoSProfile {
		ProfileTransition_Ref : ProfileTransition*;
		SimpleProfile_ContRef : SimpleProfile+;
	};

	type SimpleProfile : QoSProfile {
		CompoundProfile_Ref : CompoundProfile;
		Use_Ref : QoSStatement;
		Provides_Ref : QoSStatement;
	};

	type ProfileTransition {
		Operations_Ref : Operation*;
		From_Ref : SimpleProfile;
		To_Ref : SimpleProfile;
		CompoundProfile_ContRef : CompoundProfile;
	};

	type QoSStatement {
		Contraints_ContRef : QoSContraints+;
		Relation_Ref : CoumpoundQoSStatement;
		Parameter_ContRef : Parameter*;
	};

	type SingleQoSStatement : QoSStatement {
		Contraint_ContRef : QoSContraint;
	};

	type CoumpoundQoSStatement : QoSStatement {
		Statement_ContRef : QoSStatement#2 ..;
	};

	type QoSContraint {
		Qualification_Ref : QualificationKind;
	};

	type QualificationKind : QoSCharacteristic {
		Value_Att : Text;
	};

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