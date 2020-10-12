module TaskUsiXML {

	type Task {
		Id_Att : Text;
		Name_Att : Text;
		Category_Att : Text;
		Frequency_Att : Integer32;
		Importance_Att : Integer32;
		StructurationLevel_Att : Integer32;
		ComplexityLevel_Att : Integer32;
		Criticity_Att : Integer32;
		Centrality_Att : Integer32;
		TerminationValue_Att : Text;
		TaskType_Att : Text;
		TaskItem_Att : Text;
		DecompositionTasks_ContRef : Task*;
		DecomposedTask_Ref : Task?;
		LeftOperator_Ref : BinaryOperator?;
		RightOperator_Ref : BinaryOperator?;
		Decoration_Ref : UnaryOperator?;
	};

	type Operator {
		Id_Att : Text;
		Name_Att : Text;
	};

	type BinaryOperator : Operator {
		Type_Att : BinaryType;
		LeftTask_Ref : Task;
		RightTask_Ref : Task;
	};

	type UnaryOperator : Operator {
		UnaryType_Att : UnaryType;
		DecoratedTask_Ref : Task;
	};

	type FiniteInteration : UnaryOperator {
		Interation_Att : Integer32;
	};

	type BinaryType {"Enabling", "Disabling", "SuspendResume", "OrderIndependence", "IndependentConcurrency", "ConcurencyWithInformationPassing", "UnderterministicChoice", "EnablingWithInformationPassing"};

	type UnaryType {"Optional", "Iteration", "finitIteration"};
}