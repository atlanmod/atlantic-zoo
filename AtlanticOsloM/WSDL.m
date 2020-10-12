module WSDL {

	type Port {
		Name_Att : Text;
		Service_Ref : Service;
		Binding_Ref : Binding;
	};

	type Service {
		Name_Att : Text;
		Ports_ContRef : Port*;
	};

	type Param {
		Name_Att : Text;
		Message_Ref : Message;
	};

	type Input : Param {
		Operation_Ref : Operation;
	};

	type Output : Param {
		Operation_Ref : Operation;
	};

	type PortType {
		Name_Att : Text;
		Operations_ContRef : Operation*;
		Bindings_Ref : Binding*;
	};

	type Operation {
		Name_Att : Text;
		Input_ContRef : Input?;
		Output_ContRef : Output?;
		Type_Ref : PortType;
		Faults_ContRef : Fault*;
	};

	type StartWithExtensions;

	type Binding : StartWithExtensions {
		Name_Att : Text;
		Ports_Ref : Port*;
		Type_Ref : PortType;
		Operations_ContRef : BindingOperation*;
	};

	type BindingFault : StartWithExtensions {
		Operation_ContRef : BindingOperation;
		Binding_Ref : Fault;
	};

	type BindingOperation : StartWithExtensions {
		Name_Att : Text;
		Bind_Ref : Binding;
		Binding_Ref : Operation;
		Input_Ref : StartWithExtensions?;
		Output_Ref : StartWithExtensions?;
		Faults_ContRef : BindingFault*;
	};

	type Fault {
		Name_Att : Text;
		Operation_Ref : Operation;
		Message_Ref : Message;
	};

	type Message {
		Name_Att : Text;
		Params_Ref : Param*;
		Faults_Ref : Fault*;
		Parts_Ref : Part*;
	};

	type Part {
		Name_Att : Text;
		Message_Ref : Message;
	};
}