module HierarchicalSignalFlow {

	type Port {
		Asso_Port_Signalsrc_Ref : Asso_Port_Signal;
		Asso_Port_Signaldst_Ref : Asso_Port_Signal;
	};

	type Signal {
		Base_Ref : Base;
		Asso_Port_Signal_Ref : Asso_Port_Signal;
	};

	type Base {
		Compound_Ref : Compound;
		InputPort_ContRef : InputPort*;
		OutputPort_ContRef : OutputPort*;
		Signal_ContRef : Signal*;
	};

	type Compound : Base {
		LocalPort_ContRef : LocalPort*;
		Base_ContRef : Base*;
	};

	type InputPort : Port {
		Base_Ref : Base;
	};

	type OutputPort : Port {
		Base_Ref : Base;
	};

	type LocalPort : Port {
		Compound_Ref : Compound;
	};

	type Primitive : Base;

	type Asso_Port_Signal {
		Src_Ref : Port+;
		Dst_Ref : Port+;
		Signal_Ref : Signal;
	};
}