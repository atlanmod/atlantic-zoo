module Express_metamodel {

	type @[Express_metamodel::java::lang::void];

	type @[Express_metamodel::java::lang::int];

	type @[Rules.Express_metamodel::Rules::ONEOFConstraint] : @[Rules.Express_metamodel::Rules::SubtypeConstraint];

	type @[Rules.Express_metamodel::Rules::SupertypeRule] : @[Core.Express_metamodel::Core::CommonElement] {
		@[Express_metamodel::Rules::SupertypeRule::named-supertype_Ref] : @[Core.Express_metamodel::Core::EntityType];
		@[Express_metamodel::Rules::SupertypeRule::constraints_ContRef] : @[Rules.Express_metamodel::Rules::SubtypeConstraint]*;
		AssertsAbstract_Att : Logical;
	};

	type @[Rules.Express_metamodel::Rules::SubtypeConstraint] {
		@[Express_metamodel::Rules::SubtypeConstraint::constrained-subtypes_Ref] : @[Rules.Express_metamodel::Rules::Extent]+;
		@[Express_metamodel::Rules::SubtypeConstraint::equivalent-rule_ContRef] : @[Core.Express_metamodel::Core::Expression];
		@[Express_metamodel::Rules::SubtypeConstraint::collection_Ref] : @[Rules.Express_metamodel::Rules::SupertypeRule];
	};

	type @[Rules.Express_metamodel::Rules::Extent] : @[Instances.Express_metamodel::Instances::SETValue] {
		@[Express_metamodel::Rules::Extent::constraints_Ref] : @[Rules.Express_metamodel::Rules::SubtypeConstraint]*;
		@[Express_metamodel::Rules::Extent::content_Ref] : @[Instances.Express_metamodel::Instances::EntityInstance]*;
		@[Express_metamodel::Rules::Extent::within-population_Ref] : @[Instances.Express_metamodel::Instances::Population];
		@[Express_metamodel::Rules::Extent::constraint-rules_Ref] : @[Rules.Express_metamodel::Rules::GlobalRule]*;
		@[Express_metamodel::Rules::Extent::for-type_Ref] : @[Core.Express_metamodel::Core::EntityType];
		Id_ContRef : @[Core.Express_metamodel::Core::ScopedId];
	};

	type @[Rules.Express_metamodel::Rules::TOTAL_OVERConstraint] : @[Rules.Express_metamodel::Rules::SubtypeConstraint];

	type @[Rules.Express_metamodel::Rules::ANDConstraint] : @[Rules.Express_metamodel::Rules::SubtypeConstraint];

	type @[Rules.Express_metamodel::Rules::GlobalRule] : @[Core.Express_metamodel::Core::SchemaElement], @[Core.Express_metamodel::Core::AlgorithmScope] {
		@[Express_metamodel::Rules::GlobalRule::supporting-body_ContRef] : @[Algorithms.Express_metamodel::Algorithms::Statement]?;
		@[Express_metamodel::Rules::GlobalRule::constrained-extents_Ref] : @[Rules.Express_metamodel::Rules::Extent]+;
		@[Express_metamodel::Rules::GlobalRule::contains-rules_ContRef] : @[Rules.Express_metamodel::Rules::NamedRule]+;
	};

	type @[Rules.Express_metamodel::Rules::NamedRule] : @[Core.Express_metamodel::Core::LocalElement] {
		@[Express_metamodel::Rules::NamedRule::namespace_Ref] : @[Rules.Express_metamodel::Rules::GlobalRule];
		@[Express_metamodel::Rules::NamedRule::asserts-expression_ContRef] : @[Core.Express_metamodel::Core::Expression];
		Position_Att : Integer32;
	};

	type @[Statements.Express_metamodel::Statements::ProcedureCall] : @[Algorithms.Express_metamodel::Algorithms::Statement] {
		@[Express_metamodel::Statements::ProcedureCall::invokes_Ref] : @[Algorithms.Express_metamodel::Algorithms::Procedure];
		@[Express_metamodel::Statements::ProcedureCall::actual-parameters_ContRef] : @[Expressions.Express_metamodel::Expressions::ActualParameter]*;
	};

	type @[Statements.Express_metamodel::Statements::SkipStatement] : @[Statements.Express_metamodel::Statements::ControlStatement] {
		@[Express_metamodel::Statements::SkipStatement::in-block_Ref] : @[Algorithms.Express_metamodel::Algorithms::Statement];
	};

	type @[Statements.Express_metamodel::Statements::AliasStatement] : @[Algorithms.Express_metamodel::Algorithms::Statement], @[Core.Express_metamodel::Core::LocalScope] {
		@[Express_metamodel::Statements::AliasStatement::binds-to-reference_Ref] : @[Statements.Express_metamodel::Statements::VARExpression];
		@[Express_metamodel::Statements::AliasStatement::body_ContRef] : @[Algorithms.Express_metamodel::Algorithms::Statement];
		@[Express_metamodel::Statements::AliasStatement::alias-variable_ContRef] : @[Statements.Express_metamodel::Statements::AliasVariable];
	};

	type @[Statements.Express_metamodel::Statements::ControlVariable] : @[Algorithms.Express_metamodel::Algorithms::NamedVariable] {
		@[Express_metamodel::Statements::ControlVariable::bound-value_Ref] : @[Core.Express_metamodel::Core::Expression];
		@[Express_metamodel::Statements::ControlVariable::initial-value_Ref] : @[Core.Express_metamodel::Core::Expression];
		@[Express_metamodel::Statements::ControlVariable::namespace_Ref] : @[Statements.Express_metamodel::Statements::RepeatStatement];
		@[Express_metamodel::Statements::ControlVariable::increment_Ref] : @[Core.Express_metamodel::Core::Expression];
	};

	type @[Statements.Express_metamodel::Statements::AliasVariable] : @[Algorithms.Express_metamodel::Algorithms::NamedVariable], @[Algorithms.Express_metamodel::Algorithms::VARVariable] {
		@[Express_metamodel::Statements::AliasVariable::namespace_Ref] : @[Statements.Express_metamodel::Statements::AliasStatement]?;
		@[Express_metamodel::Statements::AliasVariable::referent_Ref] : @[Statements.Express_metamodel::Statements::VARExpression]?;
	};

	type @[Statements.Express_metamodel::Statements::ControlStatement] : @[Algorithms.Express_metamodel::Algorithms::Statement];

	type @[Statements.Express_metamodel::Statements::VARCell] : @[Statements.Express_metamodel::Statements::VARExpression] {
		@[Express_metamodel::Statements::VARCell::refers-to_Ref] : @[Algorithms.Express_metamodel::Algorithms::VARVariable];
		Id_Att : Logical;
	};

	type @[Statements.Express_metamodel::Statements::NullStatement] : @[Statements.Express_metamodel::Statements::ControlStatement];

	type @[Statements.Express_metamodel::Statements::VARExpression] {
		Text_Att : Logical;
	};

	type @[Statements.Express_metamodel::Statements::AttributeCell] : @[Statements.Express_metamodel::Statements::VARExpression] {
		@[Express_metamodel::Statements::AttributeCell::refers-to_Ref] : @[Core.Express_metamodel::Core::ExplicitAttribute];
		@[Express_metamodel::Statements::AttributeCell::base-entity_ContRef] : @[Statements.Express_metamodel::Statements::VARExpression];
		Id_Att : Logical;
	};

	type @[Statements.Express_metamodel::Statements::StatementBlock] : @[Algorithms.Express_metamodel::Algorithms::Statement] {
		@[Express_metamodel::Statements::StatementBlock::body-statements_Statement_ContRef] : @[Algorithms.Express_metamodel::Algorithms::Statement]*;
		Delimited_Att : Logical;
	};

	type @[Statements.Express_metamodel::Statements::CaseAction] {
		@[Express_metamodel::Statements::CaseAction::label-value_Ref] : @[Core.Express_metamodel::Core::Expression]*;
		@[Express_metamodel::Statements::CaseAction::action_ContRef] : @[Algorithms.Express_metamodel::Algorithms::Statement]?;
		IsDefault_Att : Logical;
	};

	type @[Statements.Express_metamodel::Statements::MemberCell] : @[Statements.Express_metamodel::Statements::VARExpression] {
		@[Express_metamodel::Statements::MemberCell::index-value_Ref] : @[Core.Express_metamodel::Core::Expression];
		@[Express_metamodel::Statements::MemberCell::base-aggregate_ContRef] : @[Statements.Express_metamodel::Statements::VARExpression];
	};

	type @[Statements.Express_metamodel::Statements::RepeatStatement] : @[Algorithms.Express_metamodel::Algorithms::Statement], @[Core.Express_metamodel::Core::LocalScope] {
		@[Express_metamodel::Statements::RepeatStatement::while-expression_Ref] : @[Core.Express_metamodel::Core::Expression]?;
		@[Express_metamodel::Statements::RepeatStatement::body_ContRef] : @[Algorithms.Express_metamodel::Algorithms::Statement];
		@[Express_metamodel::Statements::RepeatStatement::control-variable_ContRef] : @[Statements.Express_metamodel::Statements::ControlVariable]?;
		@[Express_metamodel::Statements::RepeatStatement::until-expression_Ref] : @[Core.Express_metamodel::Core::Expression]?;
	};

	type @[Statements.Express_metamodel::Statements::GroupCell] : @[Statements.Express_metamodel::Statements::VARExpression] {
		@[Express_metamodel::Statements::GroupCell::base-entity_ContRef] : @[Statements.Express_metamodel::Statements::VARExpression];
		@[Express_metamodel::Statements::GroupCell::refers-to_Ref] : @[Core.Express_metamodel::Core::SingleEntityType];
		Id_Att : Logical;
	};

	type @[Statements.Express_metamodel::Statements::VariableCell] : @[Statements.Express_metamodel::Statements::VARExpression] {
		@[Express_metamodel::Statements::VariableCell::refers-to_Ref] : @[Algorithms.Express_metamodel::Algorithms::Variable];
		Id_Att : Logical;
	};

	type @[Statements.Express_metamodel::Statements::CaseStatement] : @[Algorithms.Express_metamodel::Algorithms::Statement] {
		@[Express_metamodel::Statements::CaseStatement::cases_ContRef] : @[Statements.Express_metamodel::Statements::CaseAction]+;
		@[Express_metamodel::Statements::CaseStatement::selection-expression_Ref] : @[Core.Express_metamodel::Core::Expression];
	};

	type @[Statements.Express_metamodel::Statements::IfStatement] : @[Algorithms.Express_metamodel::Algorithms::Statement] {
		@[Express_metamodel::Statements::IfStatement::if-condition_ContRef] : @[Core.Express_metamodel::Core::Expression];
		@[Express_metamodel::Statements::IfStatement::else-actions_ContRef] : @[Algorithms.Express_metamodel::Algorithms::Statement]?;
		@[Express_metamodel::Statements::IfStatement::then-actions_ContRef] : @[Algorithms.Express_metamodel::Algorithms::Statement];
	};

	type @[Statements.Express_metamodel::Statements::EscapeStatement] : @[Statements.Express_metamodel::Statements::ControlStatement] {
		@[Express_metamodel::Statements::EscapeStatement::in-block_Ref] : @[Algorithms.Express_metamodel::Algorithms::Statement];
	};

	type @[Statements.Express_metamodel::Statements::ReturnStatement] : @[Statements.Express_metamodel::Statements::ControlStatement] {
		@[Express_metamodel::Statements::ReturnStatement::return-value_Ref] : @[Core.Express_metamodel::Core::Expression]?;
	};

	type @[Statements.Express_metamodel::Statements::Assignment] : @[Algorithms.Express_metamodel::Algorithms::Statement] {
		@[Express_metamodel::Statements::Assignment::assigned-value_Ref] : @[Core.Express_metamodel::Core::Expression];
		@[Express_metamodel::Statements::Assignment::variable_Ref] : @[Statements.Express_metamodel::Statements::VARExpression];
	};

	type @[Expressions.Express_metamodel::Expressions::Selector] : @[Core.Express_metamodel::Core::Expression] {
		@[Express_metamodel::Expressions::Selector::entity-instance_Ref] : @[Core.Express_metamodel::Core::Expression];
	};

	type @[Expressions.Express_metamodel::Expressions::RepeatCount] {
		@[Express_metamodel::Expressions::RepeatCount::derivation_Ref] : @[Core.Express_metamodel::Core::Expression]?;
	};

	type @[Expressions.Express_metamodel::Expressions::EnumItemRef] : @[Expressions.Express_metamodel::Expressions::Primary] {
		@[Express_metamodel::Expressions::EnumItemRef::refers-to_Ref] : @[Instances.Express_metamodel::Instances::EnumerationItem];
		Id_Att : Logical;
	};

	type @[Expressions.Express_metamodel::Expressions::Literal] : @[Expressions.Express_metamodel::Expressions::Primary] {
		@[Express_metamodel::Expressions::Literal::refers-to_Ref] : @[Instances.Express_metamodel::Instances::SimpleValue];
	};

	type @[Expressions.Express_metamodel::Expressions::BinaryIndex] : @[Expressions.Express_metamodel::Expressions::IndexOperation] {
		@[Express_metamodel::Expressions::BinaryIndex::first-bit_Ref] : @[Core.Express_metamodel::Core::Expression];
		@[Express_metamodel::Expressions::BinaryIndex::last-bit_Ref] : @[Core.Express_metamodel::Core::Expression]?;
	};

	type @[Expressions.Express_metamodel::Expressions::IndeterminateRef] : @[Expressions.Express_metamodel::Expressions::Primary] {
		@[Express_metamodel::Expressions::IndeterminateRef::refers-to_Ref] : @[Instances.Express_metamodel::Instances::Indeterminate];
	};

	type @[Expressions.Express_metamodel::Expressions::SELFRef] : @[Expressions.Express_metamodel::Expressions::Primary];

	type @[Expressions.Express_metamodel::Expressions::IndexOperation] : @[Core.Express_metamodel::Core::Expression] {
		@[Express_metamodel::Expressions::IndexOperation::base-value_Ref] : @[Core.Express_metamodel::Core::Expression];
	};

	type @[Expressions.Express_metamodel::Expressions::BinaryOperation] : @[Expressions.Express_metamodel::Expressions::Operation] {
		@[Express_metamodel::Expressions::BinaryOperation::left-operand_Ref] : @[Core.Express_metamodel::Core::Expression];
		@[Express_metamodel::Expressions::BinaryOperation::right-operand_Ref] : @[Core.Express_metamodel::Core::Expression];
		Operator_Att : Logical;
	};

	type @[Expressions.Express_metamodel::Expressions::AggregateInitializer] : @[Core.Express_metamodel::Core::Expression] {
		@[Express_metamodel::Expressions::AggregateInitializer::result-value_Ref] : @[Instances.Express_metamodel::Instances::GenericAggregate]?;
		@[Express_metamodel::Expressions::AggregateInitializer::bindings_ContRef] : @[Expressions.Express_metamodel::Expressions::MemberBinding]*;
	};

	type @[Expressions.Express_metamodel::Expressions::StringIndex] : @[Expressions.Express_metamodel::Expressions::IndexOperation] {
		@[Express_metamodel::Expressions::StringIndex::first-code_Ref] : @[Core.Express_metamodel::Core::Expression];
		@[Express_metamodel::Expressions::StringIndex::last-code_Ref] : @[Core.Express_metamodel::Core::Expression]?;
	};

	type @[Expressions.Express_metamodel::Expressions::PartialEntityConstructor] : @[Core.Express_metamodel::Core::Expression] {
		@[Express_metamodel::Expressions::PartialEntityConstructor::result-value_Ref] : @[Instances.Express_metamodel::Instances::PartialEntityValue]?;
		@[Express_metamodel::Expressions::PartialEntityConstructor::attribute-group_Ref] : @[Core.Express_metamodel::Core::SingleEntityType];
		@[Express_metamodel::Expressions::PartialEntityConstructor::bindings_ContRef] : @[Expressions.Express_metamodel::Expressions::AttributeBinding]*;
		Id_Att : Logical;
	};

	type @[Expressions.Express_metamodel::Expressions::Coercion] : @[Expressions.Express_metamodel::Expressions::Operation] {
		@[Express_metamodel::Expressions::Coercion::operand_Ref] : @[Core.Express_metamodel::Core::Expression];
		@[Express_metamodel::Expressions::Coercion::target-type_Ref] : @[Core.Express_metamodel::Core::VariableType];
	};

	type @[Expressions.Express_metamodel::Expressions::Primary] : @[Core.Express_metamodel::Core::Expression];

	type @[Expressions.Express_metamodel::Expressions::ActualParameter] {
		@[Express_metamodel::Expressions::ActualParameter::in-ProcedureCall_Ref] : @[Statements.Express_metamodel::Statements::ProcedureCall]?;
		@[Express_metamodel::Expressions::ActualParameter::in-FunctionCall_Ref] : @[Expressions.Express_metamodel::Expressions::FunctionCall]?;
		@[Express_metamodel::Expressions::ActualParameter::formal-parameter_Ref] : @[Algorithms.Express_metamodel::Algorithms::Parameter];
		@[Express_metamodel::Expressions::ActualParameter::actual-referent_Ref] : @[Statements.Express_metamodel::Statements::VARExpression]?;
		@[Express_metamodel::Expressions::ActualParameter::actual-value_Ref] : @[Core.Express_metamodel::Core::Expression]?;
		Position_Att : Integer32;
	};

	type @[Expressions.Express_metamodel::Expressions::ParameterRef] : @[Expressions.Express_metamodel::Expressions::Primary] {
		@[Express_metamodel::Expressions::ParameterRef::refers-to_Ref] : @[Algorithms.Express_metamodel::Algorithms::Parameter];
		Id_Att : Logical;
	};

	type @[Expressions.Express_metamodel::Expressions::AttributeRef] : @[Expressions.Express_metamodel::Expressions::Selector] {
		@[Express_metamodel::Expressions::AttributeRef::refers-to_Ref] : @[Core.Express_metamodel::Core::Attribute];
		Id_Att : Logical;
	};

	type @[Expressions.Express_metamodel::Expressions::AggregateIndex] : @[Expressions.Express_metamodel::Expressions::IndexOperation] {
		@[Express_metamodel::Expressions::AggregateIndex::index-value_ContRef] : @[Core.Express_metamodel::Core::Expression];
	};

	type @[Expressions.Express_metamodel::Expressions::GroupRef] : @[Expressions.Express_metamodel::Expressions::Selector] {
		@[Express_metamodel::Expressions::GroupRef::refers-to_Ref] : @[Core.Express_metamodel::Core::SingleEntityType];
		Id_Att : Logical;
	};

	type @[Expressions.Express_metamodel::Expressions::UnaryOperation] : @[Expressions.Express_metamodel::Expressions::Operation] {
		@[Express_metamodel::Expressions::UnaryOperation::unary-operand_Ref] : @[Core.Express_metamodel::Core::Expression];
		Operator_Att : Logical;
	};

	type @[Expressions.Express_metamodel::Expressions::UsedInRef] : @[Expressions.Express_metamodel::Expressions::Selector] {
		@[Express_metamodel::Expressions::UsedInRef::inverse-of_Ref] : @[Core.Express_metamodel::Core::Attribute];
	};

	type @[Expressions.Express_metamodel::Expressions::ConstantRef] : @[Expressions.Express_metamodel::Expressions::Primary] {
		@[Express_metamodel::Expressions::ConstantRef::refers-to_Ref] : @[Instances.Express_metamodel::Instances::Constant];
		Id_Att : Logical;
	};

	type @[Expressions.Express_metamodel::Expressions::QueryExpression] : @[Core.Express_metamodel::Core::LocalScope], @[Core.Express_metamodel::Core::Expression] {
		@[Express_metamodel::Expressions::QueryExpression::select-condition_ContRef] : @[Core.Express_metamodel::Core::Expression];
		@[Express_metamodel::Expressions::QueryExpression::query-variable_Ref] : @[Expressions.Express_metamodel::Expressions::QueryVariable];
		@[Express_metamodel::Expressions::QueryExpression::aggregate-operand_Ref] : @[Core.Express_metamodel::Core::Expression];
	};

	type @[Expressions.Express_metamodel::Expressions::QueryVariable] : @[Algorithms.Express_metamodel::Algorithms::NamedVariable] {
		@[Express_metamodel::Expressions::QueryVariable::namespace_Ref] : @[Expressions.Express_metamodel::Expressions::QueryExpression];
	};

	type @[Expressions.Express_metamodel::Expressions::Operation] : @[Core.Express_metamodel::Core::Expression];

	type @[Expressions.Express_metamodel::Expressions::AttributeBinding] {
		@[Express_metamodel::Expressions::AttributeBinding::attribute-value_Ref] : @[Core.Express_metamodel::Core::Expression];
		@[Express_metamodel::Expressions::AttributeBinding::to-value_Ref] : @[Instances.Express_metamodel::Instances::AttributeValue]?;
		@[Express_metamodel::Expressions::AttributeBinding::attribute_Ref] : @[Core.Express_metamodel::Core::ExplicitAttribute];
		Position_Att : Integer32;
	};

	type @[Expressions.Express_metamodel::Expressions::FunctionCall] : @[Core.Express_metamodel::Core::Expression] {
		@[Express_metamodel::Expressions::FunctionCall::actual-parameters_ContRef] : @[Expressions.Express_metamodel::Expressions::ActualParameter]*;
		@[Express_metamodel::Expressions::FunctionCall::invokes-function_Ref] : @[Algorithms.Express_metamodel::Algorithms::Function];
		@[Express_metamodel::Expressions::FunctionCall::/returns-result_Ref] : @[Algorithms.Express_metamodel::Algorithms::FunctionResult];
	};

	type @[Expressions.Express_metamodel::Expressions::MemberBinding] {
		@[Express_metamodel::Expressions::MemberBinding::repetition_ContRef] : @[Expressions.Express_metamodel::Expressions::RepeatCount]?;
		@[Express_metamodel::Expressions::MemberBinding::to-slot_Ref] : @[Instances.Express_metamodel::Instances::ListMember]*;
		@[Express_metamodel::Expressions::MemberBinding::member-value_Ref] : @[Core.Express_metamodel::Core::Expression];
		Position_Att : Integer32;
	};

	type @[Expressions.Express_metamodel::Expressions::ExtentRef] : @[Expressions.Express_metamodel::Expressions::Primary] {
		@[Express_metamodel::Expressions::ExtentRef::refers-to_Ref] : @[Core.Express_metamodel::Core::NamedType];
		Id_Att : Logical;
	};

	type @[Expressions.Express_metamodel::Expressions::VariableRef] : @[Expressions.Express_metamodel::Expressions::Primary] {
		@[Express_metamodel::Expressions::VariableRef::refers-to_Ref] : @[Algorithms.Express_metamodel::Algorithms::NamedVariable];
		Id_Att : Logical;
	};

	type @[Core.Express_metamodel::Core::TypeElement] : @[Core.Express_metamodel::Core::NamedElement] {
		@[Express_metamodel::Core::TypeElement::namespace_Ref] : @[Core.Express_metamodel::Core::NamedType];
	};

	type @[Core.Express_metamodel::Core::SingleEntityType] {
		@[Express_metamodel::Core::SingleEntityType::declares_ExplicitAttribute_Ref] : @[Core.Express_metamodel::Core::ExplicitAttribute]*;
		@[Express_metamodel::Core::SingleEntityType::declares_Attribute_ContRef] : @[Core.Express_metamodel::Core::Attribute]*;
		@[Express_metamodel::Core::SingleEntityType::declared-in_Ref] : @[Core.Express_metamodel::Core::EntityType];
		@[Express_metamodel::Core::SingleEntityType::equivalent_Ref] : @[Core.Express_metamodel::Core::PartialEntityType];
		Id_ContRef : @[Core.Express_metamodel::Core::ScopedId];
	};

	type @[Core.Express_metamodel::Core::AGGREGATEType] : @[Core.Express_metamodel::Core::GeneralizedType] {
		@[Express_metamodel::Core::AGGREGATEType::upper-bound_ContRef] : @[Core.Express_metamodel::Core::SizeConstraint]?;
		@[Express_metamodel::Core::AGGREGATEType::member-type_Ref] : @[Core.Express_metamodel::Core::ParameterType];
		@[Express_metamodel::Core::AGGREGATEType::constraint_Ref] : @[Algorithms.Express_metamodel::Algorithms::ActualStructureConstraint]?;
		@[Express_metamodel::Core::AGGREGATEType::lower-bound_ContRef] : @[Core.Express_metamodel::Core::SizeConstraint]?;
	};

	type @[Core.Express_metamodel::Core::GeneralBAGType] : @[Core.Express_metamodel::Core::GeneralAggregationType];

	type @[Core.Express_metamodel::Core::DomainRule] : @[Core.Express_metamodel::Core::DomainConstraint], @[Core.Express_metamodel::Core::TypeElement] {
		@[Express_metamodel::Core::DomainRule::domain_Ref] : @[Core.Express_metamodel::Core::NamedType];
		Position_Att : Integer32;
	};

	type @[Core.Express_metamodel::Core::GeneralAggregationType] : @[Core.Express_metamodel::Core::GeneralizedType], @[Core.Express_metamodel::Core::AggregationType] {
		@[Express_metamodel::Core::GeneralAggregationType::member-type_Ref] : @[Core.Express_metamodel::Core::GeneralizedType];
	};

	type @[Core.Express_metamodel::Core::ConcreteType] : @[Core.Express_metamodel::Core::InstantiableType];

	type @[Core.Express_metamodel::Core::Expression] {
		@[Express_metamodel::Core::Expression::evaluation_Ref] : @[Core.Express_metamodel::Core::Instance]?;
		@[Express_metamodel::Core::Expression::interpretation-context_Ref] : @[Core.Express_metamodel::Core::Scope]?;
		@[Express_metamodel::Core::Expression::data-type_Ref] : @[Core.Express_metamodel::Core::DataType]?;
		Text_Att : Logical;
	};

	type @[Core.Express_metamodel::Core::InverseAttribute] : @[Core.Express_metamodel::Core::Attribute] {
		@[Express_metamodel::Core::InverseAttribute::models-role_Ref] : @[Core.Express_metamodel::Core::DomainRole];
		@[Express_metamodel::Core::InverseAttribute::explicit_Ref] : @[Core.Express_metamodel::Core::InvertibleAttribute];
		IsUnique_Att : Logical;
	};

	type @[Core.Express_metamodel::Core::EnumerationType] : @[Core.Express_metamodel::Core::DefinedType] {
		@[Express_metamodel::Core::EnumerationType::values_Ref] : @[Instances.Express_metamodel::Instances::EnumerationItem]*;
		@[Express_metamodel::Core::EnumerationType::declared-items_Ref] : @[Instances.Express_metamodel::Instances::EnumerationItem]*;
		@[Express_metamodel::Core::EnumerationType::extension_Ref] : @[Core.Express_metamodel::Core::EnumerationType]*;
		@[Express_metamodel::Core::EnumerationType::base_Ref] : @[Core.Express_metamodel::Core::EnumerationType];
		IsExtensible_Att : Logical;
	};

	type @[Core.Express_metamodel::Core::VariableType] : @[Core.Express_metamodel::Core::DataType], @[Core.Express_metamodel::Core::AttributeType];

	type @[Core.Express_metamodel::Core::ArrayBound] {
		@[Express_metamodel::Core::ArrayBound::bound-expression_Ref] : @[Core.Express_metamodel::Core::Expression];
		Bound_Att : Integer32;
	};

	type @[Core.Express_metamodel::Core::GeneralSETType] : @[Core.Express_metamodel::Core::GeneralAggregationType];

	type @[Core.Express_metamodel::Core::LISTType] : @[Core.Express_metamodel::Core::ConcreteAggregationType];

	type @[Core.Express_metamodel::Core::Redeclaration] {
		@[Express_metamodel::Core::Redeclaration::derivation_Ref] : @[Core.Express_metamodel::Core::Expression]?;
		@[Express_metamodel::Core::Redeclaration::restricted-type_Ref] : @[Core.Express_metamodel::Core::AttributeType];
		@[Express_metamodel::Core::Redeclaration::refines_Ref] : @[Core.Express_metamodel::Core::Redeclaration]?;
		@[Express_metamodel::Core::Redeclaration::upper-bound_ContRef] : @[Core.Express_metamodel::Core::SizeConstraint]?;
		@[Express_metamodel::Core::Redeclaration::lower-bound_ContRef] : @[Core.Express_metamodel::Core::SizeConstraint]?;
		@[Express_metamodel::Core::Redeclaration::scope_Ref] : @[Core.Express_metamodel::Core::EntityType];
		@[Express_metamodel::Core::Redeclaration::original-attribute_Ref] : @[Core.Express_metamodel::Core::Attribute];
		@[Express_metamodel::Core::Redeclaration::refined-role_Ref] : @[Core.Express_metamodel::Core::Role]?;
		Position_Att : Integer32;
		IsMandatory_Att : Logical;
		Alias_ContRef : @[Core.Express_metamodel::Core::ScopedId]?;
	};

	type @[Core.Express_metamodel::Core::EntityType] : @[Core.Express_metamodel::Core::NamedType], @[Core.Express_metamodel::Core::InstantiableType] {
		@[Express_metamodel::Core::EntityType::plays-role_Ref] : @[Core.Express_metamodel::Core::Role]*;
		@[Express_metamodel::Core::EntityType::redeclarations_ContRef] : @[Core.Express_metamodel::Core::Redeclaration]*;
		@[Express_metamodel::Core::EntityType::attributes_Ref] : @[Core.Express_metamodel::Core::Attribute]*;
		@[Express_metamodel::Core::EntityType::plays-range-role_Ref] : @[Core.Express_metamodel::Core::RangeRole]*;
		@[Express_metamodel::Core::EntityType::declares_Ref] : @[Core.Express_metamodel::Core::SingleEntityType];
		@[Express_metamodel::Core::EntityType::extension_Ref] : @[Rules.Express_metamodel::Rules::Extent]*;
		@[Express_metamodel::Core::EntityType::invertible_attributes_Ref] : @[Core.Express_metamodel::Core::InvertibleAttribute]*;
		@[Express_metamodel::Core::EntityType::plays-domain-role_Ref] : @[Core.Express_metamodel::Core::DomainRole]*;
		@[Express_metamodel::Core::EntityType::instances_Ref] : @[Instances.Express_metamodel::Instances::EntityInstance]*;
		@[Express_metamodel::Core::EntityType::unique-rules_Ref] : @[Core.Express_metamodel::Core::UniqueRule]*;
		@[Express_metamodel::Core::EntityType::used-in_Ref] : @[Core.Express_metamodel::Core::InvertibleAttribute]*;
		@[Express_metamodel::Core::EntityType::subtype-of_Ref] : @[Core.Express_metamodel::Core::EntityType]*;
		IsAbstract_Att : Logical;
	};

	type @[Core.Express_metamodel::Core::DataType] {
		@[Express_metamodel::Core::DataType::instances_Ref] : @[Core.Express_metamodel::Core::Instance]*;
	};

	type @[Core.Express_metamodel::Core::PartialEntityType] : @[Core.Express_metamodel::Core::DataType] {
		@[Express_metamodel::Core::PartialEntityType::components_Ref] : @[Core.Express_metamodel::Core::SingleEntityType]+;
	};

	type @[Core.Express_metamodel::Core::Schema] : @[Core.Express_metamodel::Core::Scope] {
		@[Express_metamodel::Core::Schema::documentation_Ref] : @[Core.Express_metamodel::Core::Remark]*;
		@[Express_metamodel::Core::Schema::interfaces_ContRef] : @[Core.Express_metamodel::Core::InterfacedElement]*;
		@[Express_metamodel::Core::Schema::schema-elements_Ref] : @[Core.Express_metamodel::Core::SchemaElement]*;
		@[Express_metamodel::Core::Schema::interfaced-elements_Ref] : @[Core.Express_metamodel::Core::SchemaElement]*;
		Name_Att : Logical;
		Version_Att : Logical;
	};

	type @[Core.Express_metamodel::Core::InvertibleAttribute] : @[Core.Express_metamodel::Core::ExplicitAttribute] {
		@[Express_metamodel::Core::InvertibleAttribute::inverse_Ref] : @[Core.Express_metamodel::Core::InverseAttribute]*;
		@[Express_metamodel::Core::InvertibleAttribute::range-type_Ref] : @[Core.Express_metamodel::Core::EntityType]+;
		@[Express_metamodel::Core::InvertibleAttribute::creates-relationship_Ref] : @[Core.Express_metamodel::Core::Relationship];
		@[Express_metamodel::Core::InvertibleAttribute::referencing-type_Ref] : @[Core.Express_metamodel::Core::EntityType]+;
		@[Express_metamodel::Core::InvertibleAttribute::models-role_Ref] : @[Core.Express_metamodel::Core::RangeRole];
	};

	type @[Core.Express_metamodel::Core::GeneralizedType] : @[Core.Express_metamodel::Core::ParameterType], @[Core.Express_metamodel::Core::AttributeType] {
		@[Express_metamodel::Core::GeneralizedType::occurs-in_Ref] : @[Core.Express_metamodel::Core::ParameterType]+;
	};

	type @[Core.Express_metamodel::Core::InterfacedElement] {
		@[Express_metamodel::Core::InterfacedElement::interfacing-schema_Ref] : @[Core.Express_metamodel::Core::Schema];
		@[Express_metamodel::Core::InterfacedElement::refers-to_Ref] : @[Core.Express_metamodel::Core::SchemaElement];
		IsUSE_Att : Logical;
		InterfacedId_ContRef : @[Core.Express_metamodel::Core::ScopedId]?;
	};

	type @[Core.Express_metamodel::Core::NumericType] : @[Core.Express_metamodel::Core::SimpleType];

	type @[Core.Express_metamodel::Core::DefinedType] : @[Core.Express_metamodel::Core::NamedType], @[Core.Express_metamodel::Core::ConcreteType];

	type @[Core.Express_metamodel::Core::UniqueRule] : @[Core.Express_metamodel::Core::TypeElement] {
		@[Express_metamodel::Core::UniqueRule::domain_Ref] : @[Core.Express_metamodel::Core::EntityType];
		@[Express_metamodel::Core::UniqueRule::key-component_Ref] : @[Core.Express_metamodel::Core::Attribute]+;
		Position_Att : Integer32;
	};

	type @[Core.Express_metamodel::Core::DomainRole] : @[Core.Express_metamodel::Core::Role] {
		@[Express_metamodel::Core::DomainRole::range-view_Ref] : @[Core.Express_metamodel::Core::InverseAttribute]?;
		@[Express_metamodel::Core::DomainRole::domain_Ref] : @[Core.Express_metamodel::Core::EntityType];
		@[Express_metamodel::Core::DomainRole::in-relationship_Ref] : @[Core.Express_metamodel::Core::Relationship];
		Id_ContRef : @[Core.Express_metamodel::Core::ScopedId]?;
	};

	type @[Core.Express_metamodel::Core::DomainConstraint] {
		@[Express_metamodel::Core::DomainConstraint::domain_Ref] : @[Core.Express_metamodel::Core::AttributeType];
		@[Express_metamodel::Core::DomainConstraint::asserts_ContRef] : @[Core.Express_metamodel::Core::Expression]?;
	};

	type @[Core.Express_metamodel::Core::InstantiableType] : @[Core.Express_metamodel::Core::ParameterType], @[Core.Express_metamodel::Core::VariableType] {
		@[Express_metamodel::Core::InstantiableType::fundamental-type_Ref] : @[Core.Express_metamodel::Core::InstantiableType];
	};

	type @[Core.Express_metamodel::Core::GeneralLISTType] : @[Core.Express_metamodel::Core::GeneralAggregationType];

	type @[Core.Express_metamodel::Core::NamedElement] {
		@[Express_metamodel::Core::NamedElement::namespace_Ref] : @[Core.Express_metamodel::Core::Scope];
		@[Express_metamodel::Core::NamedElement::documentation_Ref] : @[Core.Express_metamodel::Core::Remark]*;
		Id_ContRef : @[Core.Express_metamodel::Core::ScopedId]?;
	};

	type @[Core.Express_metamodel::Core::Attribute] : @[Core.Express_metamodel::Core::TypeElement] {
		@[Express_metamodel::Core::Attribute::attribute-type_Ref] : @[Core.Express_metamodel::Core::AttributeType];
		@[Express_metamodel::Core::Attribute::of-entity_Ref] : @[Core.Express_metamodel::Core::SingleEntityType];
		IsAbstract_Att : Logical;
		Position_Att : Integer32;
	};

	type @[Core.Express_metamodel::Core::BAGType] : @[Core.Express_metamodel::Core::ConcreteAggregationType];

	type @[Core.Express_metamodel::Core::RealType] : @[Core.Express_metamodel::Core::NumericType] {
		Precision_Att : Integer32;
	};

	type @[Core.Express_metamodel::Core::LogicType] : @[Core.Express_metamodel::Core::SimpleType];

	type @[Core.Express_metamodel::Core::GenericType] : @[Core.Express_metamodel::Core::GeneralizedType] {
		@[Express_metamodel::Core::GenericType::constraint_Ref] : @[Algorithms.Express_metamodel::Algorithms::ActualTypeConstraint]?;
		IsEntity_Att : Logical;
	};

	type @[Core.Express_metamodel::Core::StringType] : @[Core.Express_metamodel::Core::SimpleType] {
		@[Express_metamodel::Core::StringType::string-length-constraint_ContRef] : @[Core.Express_metamodel::Core::LengthConstraint]?;
	};

	type @[Core.Express_metamodel::Core::AnonymousType] : @[Core.Express_metamodel::Core::ConcreteType], @[Core.Express_metamodel::Core::InstantiableType] {
		@[Express_metamodel::Core::AnonymousType::specializes_Ref] : @[Core.Express_metamodel::Core::AnonymousType]*;
	};

	type @[Core.Express_metamodel::Core::AlgorithmScope] : @[Core.Express_metamodel::Core::LocalScope] {
		@[Express_metamodel::Core::AlgorithmScope::common-elements_Ref] : @[Core.Express_metamodel::Core::CommonElement]*;
		@[Express_metamodel::Core::AlgorithmScope::variables_Ref] : @[Algorithms.Express_metamodel::Algorithms::Variable]*;
	};

	type @[Core.Express_metamodel::Core::Instance] {
		@[Express_metamodel::Core::Instance::appears-in-population_Ref] : @[Instances.Express_metamodel::Instances::Population]*;
		@[Express_metamodel::Core::Instance::of-type_Ref] : @[Core.Express_metamodel::Core::DataType]+;
	};

	type @[Core.Express_metamodel::Core::AttributeType] {
		@[Express_metamodel::Core::AttributeType::role_Ref] : @[Core.Express_metamodel::Core::Attribute]*;
		@[Express_metamodel::Core::AttributeType::constraints_Ref] : @[Core.Express_metamodel::Core::DomainConstraint]*;
	};

	type @[Core.Express_metamodel::Core::DerivedAttribute] : @[Core.Express_metamodel::Core::Attribute] {
		@[Express_metamodel::Core::DerivedAttribute::derivation_Ref] : @[Core.Express_metamodel::Core::Expression];
	};

	type @[Core.Express_metamodel::Core::RangeRole] : @[Core.Express_metamodel::Core::Role] {
		@[Express_metamodel::Core::RangeRole::domain-view_Ref] : @[Core.Express_metamodel::Core::InvertibleAttribute];
		@[Express_metamodel::Core::RangeRole::in-relationship_Ref] : @[Core.Express_metamodel::Core::Relationship];
		@[Express_metamodel::Core::RangeRole::range_Ref] : @[Core.Express_metamodel::Core::EntityType];
		Id_ContRef : @[Core.Express_metamodel::Core::ScopedId];
	};

	type @[Core.Express_metamodel::Core::LocalElement] : @[Core.Express_metamodel::Core::NamedElement] {
		@[Express_metamodel::Core::LocalElement::namespace_Ref] : @[Core.Express_metamodel::Core::LocalScope];
	};

	type @[Core.Express_metamodel::Core::Remark] {
		@[Express_metamodel::Core::Remark::describes-schema_Ref] : @[Core.Express_metamodel::Core::Schema]*;
		@[Express_metamodel::Core::Remark::appears-in_Ref] : @[Core.Express_metamodel::Core::Scope];
		@[Express_metamodel::Core::Remark::describes-element_Ref] : @[Core.Express_metamodel::Core::NamedElement]*;
		IsTagged_Att : Logical;
		IsTail_Att : Logical;
		Text_Att : Logical;
	};

	type @[Core.Express_metamodel::Core::SizeConstraint] : @[Core.Express_metamodel::Core::DomainConstraint] {
		@[Express_metamodel::Core::SizeConstraint::asserts_ContRef] : @[Core.Express_metamodel::Core::Expression]?;
		Bound_Att : Integer32;
	};

	type @[Core.Express_metamodel::Core::Role] {
		@[Express_metamodel::Core::Role::in-relationship_Ref] : @[Core.Express_metamodel::Core::Relationship];
		@[Express_metamodel::Core::Role::of-entity_Ref] : @[Core.Express_metamodel::Core::EntityType]+;
		@[Express_metamodel::Core::Role::upper-bound_Ref] : @[Core.Express_metamodel::Core::SizeConstraint]?;
		@[Express_metamodel::Core::Role::lower-bound_Ref] : @[Core.Express_metamodel::Core::SizeConstraint]?;
	};

	type @[Core.Express_metamodel::Core::SETType] : @[Core.Express_metamodel::Core::ConcreteAggregationType];

	type @[Core.Express_metamodel::Core::SpecializedType] : @[Core.Express_metamodel::Core::DefinedType] {
		@[Express_metamodel::Core::SpecializedType::underlying-type_Ref] : @[Core.Express_metamodel::Core::ConcreteType];
	};

	type @[Core.Express_metamodel::Core::GeneralARRAYType] : @[Core.Express_metamodel::Core::GeneralAggregationType] {
		@[Express_metamodel::Core::GeneralARRAYType::hi-index_ContRef] : @[Core.Express_metamodel::Core::ArrayBound]?;
		@[Express_metamodel::Core::GeneralARRAYType::lo-index_ContRef] : @[Core.Express_metamodel::Core::ArrayBound]?;
		IsOptional_Att : Logical;
	};

	type @[Core.Express_metamodel::Core::Relationship] {
		@[Express_metamodel::Core::Relationship::domain_Ref] : @[Core.Express_metamodel::Core::DomainRole];
		@[Express_metamodel::Core::Relationship::roles_Ref] : @[Core.Express_metamodel::Core::Role]#2 .. 2;
		@[Express_metamodel::Core::Relationship::based-on_Ref] : @[Core.Express_metamodel::Core::InvertibleAttribute];
		@[Express_metamodel::Core::Relationship::range_Ref] : @[Core.Express_metamodel::Core::RangeRole];
	};

	type @[Core.Express_metamodel::Core::LengthConstraint] : @[Core.Express_metamodel::Core::DomainConstraint] {
		MaxLength_Att : Integer32;
		IsFixed_Att : Logical;
	};

	type @[Core.Express_metamodel::Core::LocalScope] : @[Core.Express_metamodel::Core::Scope] {
		@[Express_metamodel::Core::LocalScope::local-elements_Ref] : @[Core.Express_metamodel::Core::LocalElement]*;
	};

	type @[Core.Express_metamodel::Core::NamedType] : @[Core.Express_metamodel::Core::InstantiableType], @[Core.Express_metamodel::Core::Scope], @[Core.Express_metamodel::Core::CommonElement], @[Core.Express_metamodel::Core::AttributeType] {
		@[Express_metamodel::Core::NamedType::named-elements_Ref] : @[Core.Express_metamodel::Core::TypeElement]*;
		@[Express_metamodel::Core::NamedType::instantiates_Ref] : @[Core.Express_metamodel::Core::SelectType]*;
		@[Express_metamodel::Core::NamedType::domain-rules_Ref] : @[Core.Express_metamodel::Core::DomainRule]*;
	};

	type @[Core.Express_metamodel::Core::BinaryType] : @[Core.Express_metamodel::Core::SimpleType] {
		@[Express_metamodel::Core::BinaryType::binary-length-constraint_ContRef] : @[Core.Express_metamodel::Core::LengthConstraint]?;
	};

	type @[Core.Express_metamodel::Core::ScopedId] {
		LocalName_Att : Logical;
		DefiningScope_ContRef : @[Core.Express_metamodel::Core::Scope];
	};

	type @[Core.Express_metamodel::Core::AggregationType] {
		@[Express_metamodel::Core::AggregationType::lower-bound_ContRef] : @[Core.Express_metamodel::Core::SizeConstraint]?;
		@[Express_metamodel::Core::AggregationType::upper-bound_ContRef] : @[Core.Express_metamodel::Core::SizeConstraint]?;
		IsUnique_Att : Logical;
		Ordering_Att : Logical;
	};

	type @[Core.Express_metamodel::Core::Scope] {
		@[Express_metamodel::Core::Scope::named-elements_Ref] : @[Core.Express_metamodel::Core::NamedElement]*;
		@[Express_metamodel::Core::Scope::includes-remarks_Ref] : @[Core.Express_metamodel::Core::Remark]*;
	};

	type @[Core.Express_metamodel::Core::ParameterType] {
		@[Express_metamodel::Core::ParameterType::contains_Ref] : @[Core.Express_metamodel::Core::GeneralizedType]*;
	};

	type @[Core.Express_metamodel::Core::SelectType] : @[Core.Express_metamodel::Core::DefinedType] {
		@[Express_metamodel::Core::SelectType::allowed-types_Ref] : @[Core.Express_metamodel::Core::NamedType]*;
		@[Express_metamodel::Core::SelectType::extension_Ref] : @[Core.Express_metamodel::Core::SelectType]*;
		@[Express_metamodel::Core::SelectType::base_Ref] : @[Core.Express_metamodel::Core::SelectType];
		@[Express_metamodel::Core::SelectType::select-list_Ref] : @[Core.Express_metamodel::Core::NamedType]*;
		IsExtensible_Att : Logical;
		IsEntity_Att : Logical;
	};

	type @[Core.Express_metamodel::Core::ActualType] : @[Core.Express_metamodel::Core::VariableType] {
		@[Express_metamodel::Core::ActualType::scope_Ref] : @[Algorithms.Express_metamodel::Algorithms::Algorithm];
	};

	type @[Core.Express_metamodel::Core::ExplicitAttribute] : @[Core.Express_metamodel::Core::Attribute] {
		@[Express_metamodel::Core::ExplicitAttribute::of-entity_Ref] : @[Core.Express_metamodel::Core::SingleEntityType];
		IsOptional_Att : Logical;
	};

	type @[Core.Express_metamodel::Core::SimpleType] : @[Core.Express_metamodel::Core::AnonymousType] {
		Id_Att : Logical;
	};

	type @[Core.Express_metamodel::Core::CommonElement] : @[Core.Express_metamodel::Core::SchemaElement] {
		@[Express_metamodel::Core::CommonElement::local-scope_Ref] : @[Core.Express_metamodel::Core::AlgorithmScope]?;
	};

	type @[Core.Express_metamodel::Core::SchemaElement] : @[Core.Express_metamodel::Core::NamedElement] {
		@[Express_metamodel::Core::SchemaElement::referenced-as_Ref] : @[Core.Express_metamodel::Core::InterfacedElement]*;
		@[Express_metamodel::Core::SchemaElement::referenced-in_Ref] : @[Core.Express_metamodel::Core::Schema]*;
		@[Express_metamodel::Core::SchemaElement::defined-in_Ref] : @[Core.Express_metamodel::Core::Schema]?;
	};

	type @[Core.Express_metamodel::Core::ConcreteAggregationType] : @[Core.Express_metamodel::Core::AnonymousType], @[Core.Express_metamodel::Core::AggregationType] {
		@[Express_metamodel::Core::ConcreteAggregationType::member-type_Ref] : @[Core.Express_metamodel::Core::InstantiableType];
	};

	type @[Core.Express_metamodel::Core::ARRAYType] : @[Core.Express_metamodel::Core::ConcreteAggregationType] {
		@[Express_metamodel::Core::ARRAYType::lo-index_ContRef] : @[Core.Express_metamodel::Core::ArrayBound];
		@[Express_metamodel::Core::ARRAYType::hi-index_ContRef] : @[Core.Express_metamodel::Core::ArrayBound];
		IsOptional_Att : Logical;
	};

	type @[Algorithms.Express_metamodel::Algorithms::ActualTypeConstraint] {
		@[Express_metamodel::Algorithms::ActualTypeConstraint::matching-type_Ref] : @[Core.Express_metamodel::Core::GenericType];
		@[Express_metamodel::Algorithms::ActualTypeConstraint::required-type_Ref] : @[Algorithms.Express_metamodel::Algorithms::ActualDataType];
		Label_Att : Logical;
	};

	type @[Algorithms.Express_metamodel::Algorithms::FunctionResult] : @[Algorithms.Express_metamodel::Algorithms::Variable] {
		@[Express_metamodel::Algorithms::FunctionResult::namespace_Ref] : @[Algorithms.Express_metamodel::Algorithms::Function];
	};

	type @[Algorithms.Express_metamodel::Algorithms::Function] : @[Algorithms.Express_metamodel::Algorithms::Algorithm] {
		@[Express_metamodel::Algorithms::Function::result_ContRef] : @[Algorithms.Express_metamodel::Algorithms::FunctionResult];
	};

	type @[Algorithms.Express_metamodel::Algorithms::InParameter] : @[Algorithms.Express_metamodel::Algorithms::Parameter] {
		@[Express_metamodel::Algorithms::InParameter::variable_Ref] : @[Algorithms.Express_metamodel::Algorithms::InVariable];
	};

	type @[Algorithms.Express_metamodel::Algorithms::LocalVariable] : @[Algorithms.Express_metamodel::Algorithms::Variable] {
		@[Express_metamodel::Algorithms::LocalVariable::initial-value_Ref] : @[Core.Express_metamodel::Core::Expression]?;
	};

	type @[Algorithms.Express_metamodel::Algorithms::ActualStructure] : @[Algorithms.Express_metamodel::Algorithms::GenericElement], @[Core.Express_metamodel::Core::AGGREGATEType];

	type @[Algorithms.Express_metamodel::Algorithms::ActualGenericType] : @[Core.Express_metamodel::Core::ActualType] {
		@[Express_metamodel::Algorithms::ActualGenericType::refers-to_Ref] : @[Algorithms.Express_metamodel::Algorithms::ActualDataType];
		IsEntity_Att : Logical;
		Label_Att : Logical;
	};

	type @[Algorithms.Express_metamodel::Algorithms::Statement] {
		@[Express_metamodel::Algorithms::Statement::in-block_Ref] : @[Statements.Express_metamodel::Statements::StatementBlock]?;
		@[Express_metamodel::Algorithms::Statement::body-statements_SkipStatement_ContRef] : @[Statements.Express_metamodel::Statements::SkipStatement]*;
		@[Express_metamodel::Algorithms::Statement::body-statements_EscapeStatement_ContRef] : @[Statements.Express_metamodel::Statements::EscapeStatement]*;
		@[Express_metamodel::Algorithms::Statement::controlled-by_Ref] : @[Statements.Express_metamodel::Statements::RepeatStatement]?;
		@[Express_metamodel::Algorithms::Statement::implements_Ref] : @[Algorithms.Express_metamodel::Algorithms::Algorithm]?;
		Text_Att : Logical;
	};

	type @[Algorithms.Express_metamodel::Algorithms::NamedVariable] : @[Core.Express_metamodel::Core::LocalElement] {
		@[Express_metamodel::Algorithms::NamedVariable::variable-type_Ref] : @[Core.Express_metamodel::Core::VariableType];
	};

	type @[Algorithms.Express_metamodel::Algorithms::InVariable] : @[Algorithms.Express_metamodel::Algorithms::Variable] {
		@[Express_metamodel::Algorithms::InVariable::source_Ref] : @[Algorithms.Express_metamodel::Algorithms::InParameter];
	};

	type @[Algorithms.Express_metamodel::Algorithms::Procedure] : @[Algorithms.Express_metamodel::Algorithms::Algorithm];

	type @[Algorithms.Express_metamodel::Algorithms::ActualARRAYType] : @[Algorithms.Express_metamodel::Algorithms::ActualAggregationType] {
		@[Express_metamodel::Algorithms::ActualARRAYType::hi-index_ContRef] : @[Core.Express_metamodel::Core::ArrayBound];
		@[Express_metamodel::Algorithms::ActualARRAYType::lo-index_ContRef] : @[Core.Express_metamodel::Core::ArrayBound];
		IsOptional_Att : Logical;
	};

	type @[Algorithms.Express_metamodel::Algorithms::ActualSETType] : @[Algorithms.Express_metamodel::Algorithms::ActualAggregationType];

	type @[Algorithms.Express_metamodel::Algorithms::ActualAGGREGATEType] : @[Core.Express_metamodel::Core::ActualType] {
		@[Express_metamodel::Algorithms::ActualAGGREGATEType::upper-bound_ContRef] : @[Core.Express_metamodel::Core::SizeConstraint]?;
		@[Express_metamodel::Algorithms::ActualAGGREGATEType::refers-to_Ref] : @[Algorithms.Express_metamodel::Algorithms::ActualStructure];
		@[Express_metamodel::Algorithms::ActualAGGREGATEType::member-type_Ref] : @[Core.Express_metamodel::Core::VariableType];
		@[Express_metamodel::Algorithms::ActualAGGREGATEType::lower-bound_ContRef] : @[Core.Express_metamodel::Core::SizeConstraint]?;
		Label_Att : Logical;
	};

	type @[Algorithms.Express_metamodel::Algorithms::Parameter] : @[Core.Express_metamodel::Core::LocalElement] {
		@[Express_metamodel::Algorithms::Parameter::namespace_Ref] : @[Algorithms.Express_metamodel::Algorithms::Algorithm];
		@[Express_metamodel::Algorithms::Parameter::structure-constraints_ContRef] : @[Algorithms.Express_metamodel::Algorithms::ActualStructureConstraint]*;
		@[Express_metamodel::Algorithms::Parameter::type-constraints_ContRef] : @[Algorithms.Express_metamodel::Algorithms::ActualTypeConstraint]*;
		@[Express_metamodel::Algorithms::Parameter::formal-parameter-type_Ref] : @[Core.Express_metamodel::Core::ParameterType];
		Inout_Att : Logical;
		Position_Att : Integer32;
	};

	type @[Algorithms.Express_metamodel::Algorithms::ActualStructureConstraint] {
		@[Express_metamodel::Algorithms::ActualStructureConstraint::matching-structure_Ref] : @[Core.Express_metamodel::Core::AGGREGATEType];
		@[Express_metamodel::Algorithms::ActualStructureConstraint::required-structure_Ref] : @[Algorithms.Express_metamodel::Algorithms::ActualStructure];
		Label_Att : Logical;
	};

	type @[Algorithms.Express_metamodel::Algorithms::Algorithm] : @[Core.Express_metamodel::Core::AlgorithmScope], @[Core.Express_metamodel::Core::CommonElement] {
		@[Express_metamodel::Algorithms::Algorithm::body_ContRef] : @[Algorithms.Express_metamodel::Algorithms::Statement]?;
		@[Express_metamodel::Algorithms::Algorithm::formal-parameters_Ref] : @[Algorithms.Express_metamodel::Algorithms::Parameter]*;
	};

	type @[Algorithms.Express_metamodel::Algorithms::ActualAggregationType] : @[Core.Express_metamodel::Core::ActualType], @[Core.Express_metamodel::Core::AggregationType] {
		@[Express_metamodel::Algorithms::ActualAggregationType::member-type_Ref] : @[Core.Express_metamodel::Core::ActualType];
	};

	type @[Algorithms.Express_metamodel::Algorithms::VARVariable];

	type @[Algorithms.Express_metamodel::Algorithms::ActualLISTType] : @[Algorithms.Express_metamodel::Algorithms::ActualAggregationType];

	type @[Algorithms.Express_metamodel::Algorithms::Variable] : @[Algorithms.Express_metamodel::Algorithms::NamedVariable] {
		@[Express_metamodel::Algorithms::Variable::namespace_Ref] : @[Core.Express_metamodel::Core::AlgorithmScope];
	};

	type @[Algorithms.Express_metamodel::Algorithms::GenericElement] : @[Core.Express_metamodel::Core::LocalElement] {
		@[Express_metamodel::Algorithms::GenericElement::occurs-in_Ref] : @[Core.Express_metamodel::Core::ParameterType];
		@[Express_metamodel::Algorithms::GenericElement::source_Ref] : @[Algorithms.Express_metamodel::Algorithms::Parameter];
		@[Express_metamodel::Algorithms::GenericElement::namespace_Ref] : @[Algorithms.Express_metamodel::Algorithms::Algorithm];
		Label_ContRef : @[Core.Express_metamodel::Core::ScopedId];
	};

	type @[Algorithms.Express_metamodel::Algorithms::VARParameter] : @[Algorithms.Express_metamodel::Algorithms::Parameter], @[Algorithms.Express_metamodel::Algorithms::VARVariable];

	type @[Algorithms.Express_metamodel::Algorithms::ActualDataType] : @[Core.Express_metamodel::Core::GenericType], @[Algorithms.Express_metamodel::Algorithms::GenericElement];

	type @[Algorithms.Express_metamodel::Algorithms::ActualBAGType] : @[Algorithms.Express_metamodel::Algorithms::ActualAggregationType];

	type @[Instances.Express_metamodel::Instances::AttributeValue] {
		@[Express_metamodel::Instances::AttributeValue::actual-value_Ref] : @[Core.Express_metamodel::Core::Instance]?;
		@[Express_metamodel::Instances::AttributeValue::attribute_Ref] : @[Core.Express_metamodel::Core::ExplicitAttribute];
	};

	type @[Instances.Express_metamodel::Instances::ARRAYValue] : @[Instances.Express_metamodel::Instances::AggregateValue] {
		@[Express_metamodel::Instances::ARRAYValue::of-type_Ref] : @[Core.Express_metamodel::Core::ARRAYType]+;
		@[Express_metamodel::Instances::ARRAYValue::member-slot_ContRef] : @[Instances.Express_metamodel::Instances::ArrayMember]+;
	};

	type @[Instances.Express_metamodel::Instances::RoleName] : @[Instances.Express_metamodel::Instances::StringValue] {
		@[Express_metamodel::Instances::RoleName::refers-to_Ref] : @[Core.Express_metamodel::Core::Attribute];
		Represents_ContRef : @[Core.Express_metamodel::Core::ScopedId];
	};

	type @[Instances.Express_metamodel::Instances::EntityInstance] : @[Instances.Express_metamodel::Instances::TypedInstance] {
		@[Express_metamodel::Instances::EntityInstance::state_Ref] : @[Instances.Express_metamodel::Instances::EntityValue];
		@[Express_metamodel::Instances::EntityInstance::instance-of_Ref] : @[Core.Express_metamodel::Core::EntityType]+;
		@[Express_metamodel::Instances::EntityInstance::appears-in-population_Ref] : @[Instances.Express_metamodel::Instances::Population]+;
		Id_Att : Logical;
	};

	type @[Instances.Express_metamodel::Instances::IntegerValue] : @[Instances.Express_metamodel::Instances::RealValue];

	type @[Instances.Express_metamodel::Instances::AggregateValue] : @[Instances.Express_metamodel::Instances::ConcreteValue] {
		@[Express_metamodel::Instances::AggregateValue::of-type_Ref] : @[Core.Express_metamodel::Core::AggregationType]+;
	};

	type @[Instances.Express_metamodel::Instances::Constant] : @[Core.Express_metamodel::Core::CommonElement] {
		@[Express_metamodel::Instances::Constant::value-expression_Ref] : @[Core.Express_metamodel::Core::Expression];
		@[Express_metamodel::Instances::Constant::actual-value_Ref] : @[Core.Express_metamodel::Core::Instance]?;
		@[Express_metamodel::Instances::Constant::data-type_Ref] : @[Core.Express_metamodel::Core::InstantiableType];
	};

	type @[Instances.Express_metamodel::Instances::LogicalValue] : @[Instances.Express_metamodel::Instances::SimpleValue];

	type @[Instances.Express_metamodel::Instances::TypedInstance] : @[Core.Express_metamodel::Core::Instance] {
		@[Express_metamodel::Instances::TypedInstance::satisfies-type_Ref] : @[Core.Express_metamodel::Core::SelectType]*;
	};

	type @[Instances.Express_metamodel::Instances::ListMember] {
		@[Express_metamodel::Instances::ListMember::member-value_Ref] : @[Core.Express_metamodel::Core::Instance];
		Position_Att : Integer32;
	};

	type @[Instances.Express_metamodel::Instances::BagMember] {
		@[Express_metamodel::Instances::BagMember::member-value_Ref] : @[Core.Express_metamodel::Core::Instance];
		Count_Att : Integer32;
	};

	type @[Instances.Express_metamodel::Instances::SingleEntityValue] {
		@[Express_metamodel::Instances::SingleEntityValue::equivalent_Ref] : @[Instances.Express_metamodel::Instances::PartialEntityValue];
		@[Express_metamodel::Instances::SingleEntityValue::of-type_Ref] : @[Core.Express_metamodel::Core::SingleEntityType];
		@[Express_metamodel::Instances::SingleEntityValue::properties_ContRef] : @[Instances.Express_metamodel::Instances::AttributeValue]*;
	};

	type @[Instances.Express_metamodel::Instances::Indeterminate] : @[Core.Express_metamodel::Core::Instance];

	type @[Instances.Express_metamodel::Instances::SingleLeafInstance] : @[Instances.Express_metamodel::Instances::EntityInstance] {
		@[Express_metamodel::Instances::SingleLeafInstance::characterizing-type_Ref] : @[Core.Express_metamodel::Core::EntityType];
	};

	type @[Instances.Express_metamodel::Instances::GenericAggregate] : @[Instances.Express_metamodel::Instances::LISTValue];

	type @[Instances.Express_metamodel::Instances::BinaryValue] : @[Instances.Express_metamodel::Instances::SimpleValue];

	type @[Instances.Express_metamodel::Instances::SpecializedValue] : @[Instances.Express_metamodel::Instances::TypedInstance] {
		@[Express_metamodel::Instances::SpecializedValue::of-type_Ref] : @[Core.Express_metamodel::Core::SpecializedType];
		@[Express_metamodel::Instances::SpecializedValue::fundamental-value_Ref] : @[Instances.Express_metamodel::Instances::ConcreteValue];
	};

	type @[Instances.Express_metamodel::Instances::BAGValue] : @[Instances.Express_metamodel::Instances::AggregateValue] {
		@[Express_metamodel::Instances::BAGValue::member-slot_ContRef] : @[Instances.Express_metamodel::Instances::BagMember]*;
		@[Express_metamodel::Instances::BAGValue::of-type_Ref] : @[Core.Express_metamodel::Core::BAGType]+;
	};

	type @[Instances.Express_metamodel::Instances::EnumerationItem] : @[Core.Express_metamodel::Core::TypeElement], @[Instances.Express_metamodel::Instances::TypedInstance], @[Instances.Express_metamodel::Instances::ConcreteValue] {
		@[Express_metamodel::Instances::EnumerationItem::of-type_Ref] : @[Core.Express_metamodel::Core::EnumerationType]+;
		@[Express_metamodel::Instances::EnumerationItem::declared-in_Ref] : @[Core.Express_metamodel::Core::EnumerationType];
		Position_Att : Integer32;
	};

	type @[Instances.Express_metamodel::Instances::EntityValue] : @[Instances.Express_metamodel::Instances::PartialEntityValue] {
		@[Express_metamodel::Instances::EntityValue::corresponds to_Ref] : @[Core.Express_metamodel::Core::EntityType]+;
		@[Express_metamodel::Instances::EntityValue::describes_Ref] : @[Instances.Express_metamodel::Instances::EntityInstance]*;
	};

	type @[Instances.Express_metamodel::Instances::SETValue] : @[Instances.Express_metamodel::Instances::AggregateValue] {
		@[Express_metamodel::Instances::SETValue::member-value_Ref] : @[Core.Express_metamodel::Core::Instance]*;
		@[Express_metamodel::Instances::SETValue::of-type_Ref] : @[Core.Express_metamodel::Core::SETType]+;
	};

	type @[Instances.Express_metamodel::Instances::ArrayMember] {
		@[Express_metamodel::Instances::ArrayMember::member-value_Ref] : @[Core.Express_metamodel::Core::Instance]?;
		Index_Att : Integer32;
	};

	type @[Instances.Express_metamodel::Instances::Population] {
		@[Express_metamodel::Instances::Population::composition_EntityInstance_Ref] : @[Instances.Express_metamodel::Instances::EntityInstance]*;
		@[Express_metamodel::Instances::Population::composition_Instance_Ref] : @[Core.Express_metamodel::Core::Instance]*;
		@[Express_metamodel::Instances::Population::governing-schema_Ref] : @[Core.Express_metamodel::Core::Schema]*;
	};

	type @[Instances.Express_metamodel::Instances::RealValue] : @[Instances.Express_metamodel::Instances::NumberValue];

	type @[Instances.Express_metamodel::Instances::BooleanValue] : @[Instances.Express_metamodel::Instances::LogicalValue];

	type @[Instances.Express_metamodel::Instances::LISTValue] : @[Core.Express_metamodel::Core::Instance], @[Instances.Express_metamodel::Instances::AggregateValue] {
		@[Express_metamodel::Instances::LISTValue::of-type_Ref] : @[Core.Express_metamodel::Core::LISTType]+;
		@[Express_metamodel::Instances::LISTValue::member-slot_ContRef] : @[Instances.Express_metamodel::Instances::ListMember]*;
	};

	type @[Instances.Express_metamodel::Instances::StringValue] : @[Instances.Express_metamodel::Instances::SimpleValue];

	type @[Instances.Express_metamodel::Instances::TypeName] : @[Instances.Express_metamodel::Instances::StringValue] {
		@[Express_metamodel::Instances::TypeName::refers-to_Ref] : @[Core.Express_metamodel::Core::NamedType];
		Represents_ContRef : @[Core.Express_metamodel::Core::ScopedId];
	};

	type @[Instances.Express_metamodel::Instances::PartialEntityValue] : @[Core.Express_metamodel::Core::Instance] {
		@[Express_metamodel::Instances::PartialEntityValue::of-type_Ref] : @[Core.Express_metamodel::Core::PartialEntityType];
		@[Express_metamodel::Instances::PartialEntityValue::components_ContRef] : @[Instances.Express_metamodel::Instances::SingleEntityValue]+;
	};

	type @[Instances.Express_metamodel::Instances::NumberValue] : @[Instances.Express_metamodel::Instances::SimpleValue];

	type @[Instances.Express_metamodel::Instances::MultiLeafInstance] : @[Instances.Express_metamodel::Instances::EntityInstance];

	type @[Instances.Express_metamodel::Instances::SimpleValue] : @[Instances.Express_metamodel::Instances::ConcreteValue] {
		@[Express_metamodel::Instances::SimpleValue::of-type_Ref] : @[Core.Express_metamodel::Core::SimpleType]+;
		Name_Att : Text;
	};

	type @[Instances.Express_metamodel::Instances::ConcreteValue] : @[Core.Express_metamodel::Core::Instance];
}