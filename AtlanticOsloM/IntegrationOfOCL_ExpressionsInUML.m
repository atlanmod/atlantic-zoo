module OCLExpression {

	type PreCondition : @[Core.Constraint];

	type PortCondition : @[Core.Constraint];

	type Invariant : @[Core.Constraint];

	type Guard : @[Core.Constraint];

	type @[Core.ModelElement] {
		Constraint_Ref : @[Core.Constraint]+;
	};

	type @[Core.Constraint] : @[Core.ModelElement] {
		ConstrainedElement_Ref : @[Core.ModelElement]+;
		Body_Ref : @[DataTypes.BooleanExpression];
	};

	type @[DataTypes.Expression] {
		Body_Ref : @[OCl.OCLExpression]?;
	};

	type @[DataTypes.BooleanExpression] : @[DataTypes.Expression] {
		Constraint_ContRef : @[Core.Constraint]?;
	};

	type @[OCl.OCLExpression] {
		Owner_Ref : @[DataTypes.Expression]?;
	};
}