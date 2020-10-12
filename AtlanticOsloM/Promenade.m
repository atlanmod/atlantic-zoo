module Promenade {

	type Strong : DynPrecedence, BasPrecedence;

	type Start : DynPrecedence, BasPrecedence;

	type End : DynPrecedence, BasPrecedence;

	type FeedBack : DynPrecedence, BasPrecedence;

	type Weak : DynPrecedence, DerPrecedence;

	type Grouping : DynPrecedence, DerPrecedence;

	type Precedence {
		Deprecs_Ref : DerPrecedence*;
		Parbind_Ref : ParBinding*;
	};

	type DynPrecedence : Precedence;

	type DerPrecedence : Precedence {
		Precs_Ref : Precedence+;
		AuxTasks_Ref : MetaTaskOccurence*;
	};

	type BasPrecedence : Precedence;

	type MetaTaskOccurence : ModelElement {
		Dprecs_Ref : DerPrecedence*;
		TaskCl_Ref : MetaTask*;
	};

	type ParBinding {
		Inclusion_Att : Logical;
		Precs_Ref : Precedence+;
		TargetPar_Ref : ParameterPrec;
		SourcePar_Ref : ParameterPrec;
	};

	type ParameterPrec : ParameterUML {
		ParbindsTar_Ref : ParBinding+;
		ParbindsSour_Ref : ParBinding+;
		DstParams_Ref : ParameterPrec+;
		OrParams_Ref : ParameterPrec+;
	};

	type ModelElement {
		DependencyUMLsupp_Ref : DependancyUML;
		DependencyUMLcli_Ref : DependancyUML;
	};

	type DependancyUML {
		Suppier_Ref : ModelElement+;
		Client_Ref : ModelElement+;
	};

	type MetaTask : ModelElement {
		Params_Ref : ParameterUML+;
		Occurs_Ref : MetaTaskOccurence*;
	};

	type ParameterUML {
		Task_Ref : MetaTask;
		Doc_Ref : MetaDocument+;
	};

	type MetaDocument {
		Params_Ref : ParameterUML+;
	};
}