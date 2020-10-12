module M {

	type IdentifiedElement {
		Qualifiers_Att : Text;
		Identifier_Att : Text;
	};

	type MElement : IdentifiedElement;

	type MElementReference {
		Alias_Att : Text;
		ReferencedElement_Ref : MElement;
	};

	type Module : MElement {
		Imports_ContRef : ImportDirective*;
		Exports_ContRef : ExportDirective*;
		ModuleMembers_ContRef : ModuleMember*;
	};

	type ModuleMember : MElement {
		Module_Ref : Module;
	};

	type ImportDirective {
		Module_Ref : Module;
		ImportedElements_ContRef : MElementReference+;
	};

	type ExportDirective {
		Module_Ref : Module;
		ExportedElements_Ref : ModuleMember+;
	};

	type Value;

	type NumericalValue : Value;

	type StringValue : Value {
		Value_Att : Text;
	};

	type IntegerValue : NumericalValue {
		Value_Att : Integer32;
	};

	type DecimalValue : NumericalValue {
		Value_Att : Double;
	};

	type BooleanValue : Value {
		Value_Att : Logical;
	};

	type @[Types.DerivedType] : ModuleMember {
		Supertypes_ContRef : @[Types.TypeReference]*;
		Fields_ContRef : @[Types.Field]*;
		InitializationExpression_ContRef : @[Expressions.InitializationExpression]?;
		WhereExpression_ContRef : @[Expressions.WhereExpression]?;
		Expression_ContRef : @[Expressions.Expression]?;
	};

	type @[Types.TypeReference] {
		Subtype_Ref : @[Types.DerivedType]?;
		Field_Ref : @[Types.Field]?;
		LowerBound_Att : Integer32;
		UpperBound_Att : Integer32;
	};

	type @[Types.IntrinsicTypeReference] : @[Types.TypeReference] {
		TypeIdentifier_Att : Text;
	};

	type @[Types.DerivedTypeReference] : @[Types.TypeReference] {
		Type_Ref : @[Types.DerivedType];
	};

	type @[Types.Field] : IdentifiedElement {
		Owner_Ref : @[Types.DerivedType];
		Type_ContRef : @[Types.TypeReference];
	};

	type @[Types.Collection] : IdentifiedElement;

	type @[Types.ComputedValue] : IdentifiedElement;

	type @[Expressions.Expression];

	type @[Expressions.InitializationExpression] : @[Expressions.Expression] {
		Type_Ref : @[Types.DerivedType];
		Values_ContRef : Value*;
	};

	type @[Expressions.WhereExpression] : @[Expressions.Expression] {
		Type_Ref : @[Types.DerivedType];
		QueryExpressions_ContRef : @[Expressions.QueryExpression]*;
	};

	type @[Expressions.IdentityExpression] : @[Expressions.WhereExpression] {
		Identity_Ref : @[Types.Field];
	};

	type @[Expressions.QueryExpression] : @[Expressions.Expression] {
		WhereExpression_Ref : @[Expressions.WhereExpression];
	};

	type @[Expressions.EqualExpression] : @[Expressions.QueryExpression] {
		LeftValue_ContRef : @[Expressions.ValueExpression];
		RightValue_ContRef : @[Expressions.ValueExpression];
	};

	type @[Expressions.InExpression] : @[Expressions.QueryExpression] {
		Value_ContRef : @[Expressions.ValueExpression];
		Collection_ContRef : @[Expressions.CollectionExpression];
	};

	type @[Expressions.CollectionExpression] : @[Expressions.Expression] {
		InExpression_Ref : @[Expressions.InExpression];
		CollectionValue_ContRef : @[Expressions.ValueExpression];
	};

	type @[Expressions.ValueExpression] : @[Expressions.Expression];

	type @[Expressions.DefaultValueExpression] : @[Expressions.ValueExpression];

	type @[Expressions.StandardValueExpression] : @[Expressions.ValueExpression] {
		Context_ContRef : @[Expressions.ValueExpression]?;
		Value_Att : Text;
	};

	type @[Languages.Language] : ModuleMember;

	type @[ObjectModel.Entity] : ModuleMember;
}