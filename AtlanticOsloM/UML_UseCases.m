module UseCases {

	type Classifier {
		Instance_Ref : Instance*;
	};

	type Instance {
		Classifier_Ref : Classifier+;
	};

	type Actor : Classifier;

	type UseCase : Classifier {
		ExtensionPoint_Att : Text;
		IncludeAddition_Ref : Include;
		IncludeBase_Ref : Include;
		ExtendExtension_Ref : Extend;
		ExtendBase_Ref : Extend;
		ExtensionPoints_Ref : ExtensionPoint*;
	};

	type UseCaseInstance : Instance;

	type RelationShip;

	type Include : RelationShip {
		Addition_Ref : UseCase;
		Base_Ref : UseCase;
	};

	type Extend : RelationShip {
		Condition_Ref : BooleanExpression;
		Extension_Ref : UseCase;
		Base_Ref : UseCase;
		ExtensionPoint_Ref : ExtensionPoint+;
	};

	type BooleanExpression {
		Value_Att : Text;
	};

	type ModelElement;

	type ExtensionPoint : ModelElement {
		Location_Ref : LocationReference;
		Extend_Ref : Extend*;
		UseCase_Ref : UseCase*;
	};

	type LocationReference {
		Value_Att : Text;
	};
}