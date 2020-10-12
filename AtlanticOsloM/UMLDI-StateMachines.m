module MetamodelRoot {

	type @[Common_Behavior.Signal] : @[Core.Classifier];

	type @[Common_Behavior.Action] : @[Core.ModelElement] {
		ActualArgument_ContRef : @[Common_Behavior.Argument]*;
		ActionSequence_Ref : @[Common_Behavior.ActionSequence]?;
		Recurrence_ContRef : @[Data_Types.IterationExpression]?;
		Target_ContRef : @[Data_Types.ObjectSetExpression]?;
		IsAsynchronous_Att : Logical;
		Script_ContRef : @[Data_Types.ActionExpression]?;
	};

	type @[Common_Behavior.CreateAction] : @[Common_Behavior.Action] {
		Instantiation_Ref : @[Core.Classifier];
	};

	type @[Common_Behavior.DestroyAction] : @[Common_Behavior.Action];

	type @[Common_Behavior.UninterpretedAction] : @[Common_Behavior.Action];

	type @[Common_Behavior.CallAction] : @[Common_Behavior.Action] {
		Operation_Ref : @[Core.Operation];
	};

	type @[Common_Behavior.SendAction] : @[Common_Behavior.Action] {
		Signal_Ref : @[Common_Behavior.Signal];
	};

	type @[Common_Behavior.ActionSequence] : @[Common_Behavior.Action] {
		Action_ContRef : @[Common_Behavior.Action]*;
	};

	type @[Common_Behavior.Argument] : @[Core.ModelElement] {
		Action_Ref : @[Common_Behavior.Action]?;
		Value_ContRef : @[Data_Types.Expression];
	};

	type @[Common_Behavior.Reception] : @[Core.BehavioralFeature] {
		Signal_Ref : @[Common_Behavior.Signal];
		Specification_Att : Text;
		IsRoot_Att : Logical;
		IsLeaf_Att : Logical;
		IsAbstract_Att : Logical;
	};

	type @[Common_Behavior.ReturnAction] : @[Common_Behavior.Action];

	type @[Common_Behavior.TerminateAction] : @[Common_Behavior.Action];

	type @[Common_Behavior.Exception] : @[Common_Behavior.Signal];

	type @[Data_Types.CallConcurrencyKind] {"cck_sequential", "cck_guarded", "cck_concurrent"};

	type @[Data_Types.ParameterDirectionKind] {"pdk_in", "pdk_inout", "pdk_out", "pdk_return"};

	type @[Data_Types.ScopeKind] {"sk_instance", "sk_classifier"};

	type @[Data_Types.VisibilityKind] {"vk_public", "vk_protected", "vk_private", "vk_package"};

	type @[Data_Types.Expression] {
		Language_Att : Text;
		Body_Att : Text;
	};

	type @[Data_Types.BooleanExpression] : @[Data_Types.Expression];

	type @[Data_Types.ObjectSetExpression] : @[Data_Types.Expression];

	type @[Data_Types.ActionExpression] : @[Data_Types.Expression];

	type @[Data_Types.IterationExpression] : @[Data_Types.Expression];

	type @[Data_Types.TimeExpression] : @[Data_Types.Expression];

	type @[Data_Types.PseudostateKind] {"pk_choice", "pk_deepHistory", "pk_fork", "pk_initial", "pk_join", "pk_junction", "pk_shallowHistory"};

	type @[State_Machines.StateMachine] : @[Core.ModelElement] {
		Context_Ref : @[Core.ModelElement]?;
		SubmachineState_Ref : @[State_Machines.SubmachineState]*;
		Top_ContRef : @[State_Machines.State];
		Transitions_ContRef : @[State_Machines.Transition]*;
	};

	type @[State_Machines.Event] : @[Core.ModelElement] {
		Parameter_ContRef : @[Core.Parameter]*;
	};

	type @[State_Machines.StateVertex] : @[Core.ModelElement] {
		Container_Ref : @[State_Machines.CompositeState]?;
		Incoming_Ref : @[State_Machines.Transition]*;
		Outgoing_Ref : @[State_Machines.Transition]*;
	};

	type @[State_Machines.State] : @[State_Machines.StateVertex] {
		DeferrableEvent_Ref : @[State_Machines.Event]*;
		InternalTransition_ContRef : @[State_Machines.Transition]*;
		Exit_ContRef : @[Common_Behavior.Action]?;
		DoActivity_ContRef : @[Common_Behavior.Action]?;
		Entry_ContRef : @[Common_Behavior.Action]?;
		StateMachine_Ref : @[State_Machines.StateMachine]?;
	};

	type @[State_Machines.TimeEvent] : @[State_Machines.Event] {
		When_ContRef : @[Data_Types.TimeExpression];
	};

	type @[State_Machines.CallEvent] : @[State_Machines.Event] {
		Operation_Ref : @[Core.Operation];
	};

	type @[State_Machines.SignalEvent] : @[State_Machines.Event] {
		Signal_Ref : @[Common_Behavior.Signal];
	};

	type @[State_Machines.Transition] : @[Core.ModelElement] {
		Target_Ref : @[State_Machines.StateVertex];
		Trigger_Ref : @[State_Machines.Event]?;
		StateMachine_Ref : @[State_Machines.StateMachine]?;
		Source_Ref : @[State_Machines.StateVertex];
		Effect_ContRef : @[Common_Behavior.Action]?;
		Guard_ContRef : @[State_Machines.Guard]?;
	};

	type @[State_Machines.CompositeState] : @[State_Machines.State] {
		Subvertex_ContRef : @[State_Machines.StateVertex]*;
		IsConcurrent_Att : Logical;
	};

	type @[State_Machines.ChangeEvent] : @[State_Machines.Event] {
		ChangeExpression_ContRef : @[Data_Types.BooleanExpression];
	};

	type @[State_Machines.Guard] : @[Core.ModelElement] {
		Transition_Ref : @[State_Machines.Transition];
		Expression_ContRef : @[Data_Types.BooleanExpression];
	};

	type @[State_Machines.Pseudostate] : @[State_Machines.StateVertex] {
		Kind_Att : @[Data_Types.PseudostateKind];
	};

	type @[State_Machines.SimpleState] : @[State_Machines.State];

	type @[State_Machines.SubmachineState] : @[State_Machines.CompositeState] {
		Submachine_Ref : @[State_Machines.StateMachine];
	};

	type @[State_Machines.SynchState] : @[State_Machines.StateVertex] {
		Bound_Att : Integer32;
	};

	type @[State_Machines.StubState] : @[State_Machines.StateVertex] {
		ReferenceState_Att : Text;
	};

	type @[State_Machines.FinalState] : @[State_Machines.State];

	type @[Core.Element];

	type @[Core.ModelElement] : @[Core.Element] {
		Namespace_Ref : @[Core.Namespace]?;
		Name_Att : Text;
		Visibility_Att : @[Data_Types.VisibilityKind]?;
		IsSpecification_Att : Logical;
	};

	type @[Core.GeneralizableElement] : @[Core.ModelElement] {
		Generalization_Ref : @[Core.Generalization]*;
		IsRoot_Att : Logical;
		IsLeaf_Att : Logical;
		IsAbstract_Att : Logical;
	};

	type @[Core.Namespace] : @[Core.ModelElement] {
		OwnedElement_ContRef : @[Core.ModelElement]*;
	};

	type @[Core.Classifier] : @[Core.GeneralizableElement], @[Core.Namespace] {
		PowertypeRange_Ref : @[Core.Generalization]*;
		Feature_ContRef : @[Core.Feature]*;
	};

	type @[Core.Feature] : @[Core.ModelElement] {
		Owner_Ref : @[Core.Classifier]?;
		OwnerScope_Att : @[Data_Types.ScopeKind];
	};

	type @[Core.Relationship] : @[Core.ModelElement];

	type @[Core.BehavioralFeature] : @[Core.Feature] {
		Parameter_ContRef : @[Core.Parameter]*;
		IsQuery_Att : Logical;
	};

	type @[Core.Operation] : @[Core.BehavioralFeature] {
		Concurrency_Att : @[Data_Types.CallConcurrencyKind]?;
		IsRoot_Att : Logical;
		IsLeaf_Att : Logical;
		IsAbstract_Att : Logical;
		Specification_Att : Text;
	};

	type @[Core.Parameter] : @[Core.ModelElement] {
		Type_Ref : @[Core.Classifier];
		BehavioralFeature_Ref : @[Core.BehavioralFeature]?;
		DefaultValue_ContRef : @[Data_Types.Expression]?;
		Kind_Att : @[Data_Types.ParameterDirectionKind];
	};

	type @[Core.Generalization] : @[Core.Relationship] {
		Parent_Ref : @[Core.GeneralizableElement];
		Powertype_Ref : @[Core.Classifier]?;
		Child_Ref : @[Core.GeneralizableElement];
		Discriminator_Att : Text;
	};
}