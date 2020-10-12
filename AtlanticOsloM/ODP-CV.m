module ODPCV {

	type EnvironmentContract {
		Ec_to_a_Ref : Action+;
		Specifier_ec_Ref : ComputationalTemplate;
	};

	type ComputationalTemplate {
		Ct_to_ec_Ref : EnvironmentContract;
		Ct_to_bh_Ref : Behaviour*;
	};

	type ComputationalObject {
		Co_to_i_Ref : Interface+;
		Co_to_bh_Ref : Behaviour;
		Specifier_co_Ref : ComputationalObjectTemplate;
		Co_to_st_ContRef : State;
	};

	type BindingObject : ComputationalObject;

	type ComputationalObjectTemplate : ComputationalTemplate {
		Cot_to_co_Ref : ComputationalObject*;
		Part_provide_Ref : ComputationalInterfaceTemplate*;
		Part_request_Ref : ComputationalInterfaceTemplate*;
	};

	type ComputationalInterfaceTemplate : ComputationalTemplate {
		Cit_to_i_Ref : Interface*;
		Aggregate_provide_Ref : ComputationalObjectTemplate*;
		Aggregate_request_Ref : ComputationalObjectTemplate*;
		Cit_to_intsig_ContRef : InterfaceSignature;
	};

	type Interface {
		Owner_i_Ref : ComputationalObject;
		I_to_bd_Ref : Binding?;
		Specifier_i_Ref : ComputationalInterfaceTemplate;
		I_to_ina_ContRef : Interaction+;
	};

	type Binding {
		Bd_to_i_Ref : Interface#2 ..;
	};

	type SignalInterface : Interface;

	type OperationInterface : Interface;

	type StreamInterface : Interface;

	type InterfaceSignature {
		Intsig_to_cit_Ref : ComputationalInterfaceTemplate;
	};

	type SignalInterfaceSignature : InterfaceSignature {
		Sgisig_to_ssig_ContRef : SignalSignature*;
	};

	type OperationInterfaceSignature : InterfaceSignature {
		Optisig_to_ansig_ContRef : AnnouncementSignature*;
		Optisig_to_intsig_ContRef : InterrogationSignature*;
	};

	type StreamInterfaceSignature : InterfaceSignature {
		Strisig_to_fsig_ContRef : FlowSignature*;
	};

	type InteractionSignature {
		Isig_to_at_Ref : ActionTemplate;
		Isig_to_param_ContRef : Parameter*;
	};

	type Parameter {
		Param_to_isig_Ref : InteractionSignature;
	};

	type AnnouncementSignature : InteractionSignature {
		Ansig_to_optisig_Ref : OperationInterfaceSignature;
	};

	type InterrogationSignature : InteractionSignature {
		Intsig_to_optisig_Ref : OperationInterfaceSignature;
		Intsig_to_tersig_ContRef : TerminationSignature+;
	};

	type TerminationSignature : InteractionSignature {
		Tersig_to_intsig_Ref : InterrogationSignature;
	};

	type SignalSignature : InteractionSignature {
		Ssig_to_sgisig_Ref : SignalInterfaceSignature;
	};

	type FlowSignature : InteractionSignature {
		Fsig_to_strisig_Ref : StreamInterfaceSignature;
	};

	type ActionTemplate {
		At_to_a_Ref : Action+;
		At_to_isig_ContRef : InteractionSignature;
	};

	type Behaviour {
		Specifier_bh_Ref : ComputationalTemplate;
		Owner_bh_Ref : ComputationalObject;
		Bh_to_a_ContRef : Action+;
	};

	type Action {
		Constrainer_ec_Ref : EnvironmentContract*;
		ChangedState_Ref : State*;
		Specifier_a_Ref : ActionTemplate;
		A_to_bh_Ref : Behaviour;
	};

	type State {
		StartState_Ref : State;
		EndState_Ref : State;
		Changer_Ref : Action*;
		St_to_co_Ref : ComputationalObject;
	};

	type InternalAction : Action;

	type Interaction : Action {
		Ina_to_i_Ref : Interface;
	};

	type Flow : Interaction;

	type Signal : Interaction;

	type Operation : Interaction {
		Opt_to_inv_ContRef : Invocation;
	};

	type Announcement : Operation;

	type Interrogation : Operation {
		Int_to_ter_Ref : Termination?;
	};

	type Invocation : Interaction {
		Inv_to_ter_Ref : Termination;
		Inv_to_opt_Ref : Operation;
	};

	type Termination : Interaction {
		Owner_ter_Ref : Interrogation;
		Ter_to_inv_Ref : Invocation;
	};
}