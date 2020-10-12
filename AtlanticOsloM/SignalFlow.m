module SignalFlow {

	type RootFolder {
		CompoundComponent_ContRef : CompoundComponent*;
	};

	type CompoundComponent : BaseComponent {
		RootFolder_Ref : RootFolder;
		BaseComponent_ContRef : BaseComponent*;
		LocalPort_ContRef : LocalPort*;
	};

	type PrimitiveComponent : BaseComponent;

	type BaseComponent {
		Name_Att : Text;
		Position_Att : Text;
		Signal_ContRef : Signal*;
		OutputPort_ContRef : OutputPort*;
		InputPort_ContRef : InputPort*;
		CompoundComponent_Ref : CompoundComponent;
	};

	type InputPort : PortBase {
		BaseComponent_Ref : BaseComponent;
	};

	type LocalPort : PortBase {
		CompoundComponent_Ref : CompoundComponent;
	};

	type OutputPort : PortBase {
		BaseComponent_Ref : BaseComponent;
	};

	type PortBase {
		Name_Att : Text;
		Position_Att : Text;
		AssociationPortBase_PortBasesrc_Ref : AssociationPortBase_PortBase;
		AssociationPortBase_PortBasedst_Ref : AssociationPortBase_PortBase;
	};

	type Signal {
		Name_Att : Text;
		Position_Att : Text;
		BaseComponent_Ref : BaseComponent;
		AssociationPortBase_PortBase_Ref : AssociationPortBase_PortBase;
	};

	type AssociationPortBase_PortBase {
		SrcPortBase_Ref : PortBase+;
		DstPortBase_Ref : PortBase+;
		Signal_Ref : Signal;
	};
}