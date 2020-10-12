module BusinessProcessModel {

	type Namespace;

	type Task : Namespace {
		ContainsDataSet_ContRef : DataSet#3 ..;
		ContainsControlPoint_ContRef : ControlPoint*;
		Invoker_Ref : InvokerTask*;
		Terminator_Ref : TerminatorTask*;
	};

	type DataSet : Namespace {
		Contains_ContRef : DataElement*;
		Source_Ref : ControlFlow*;
		Triggers_Ref : ControlPoint*;
	};

	type Parameter;

	type DataElement : Parameter {
		Sink_Ref : DataFlow;
		Source_Ref : DataFlow;
	};

	type ModelElement;

	type Flow : ModelElement;

	type DataFlow : Flow;

	type ControlFlow : Flow;

	type ControlPoint : ModelElement {
		Sink_Ref : ControlFlow*;
	};

	type Input : DataElement;

	type Output : DataElement;

	type OutputSet : DataSet {
		ContainsOutput_ContRef : Output*;
	};

	type InputSet : DataSet {
		ContainsInput_ContRef : Input*;
	};

	type Exception : Output;

	type SimpleTask : Task;

	type CoumpoundTask : Task {
		ContainsTask_ContRef : Task*;
		ContainsFlow_ContRef : Flow*;
		Realizes_Ref : BusinessProcess;
	};

	type MutliTask : CoumpoundTask;

	type InvokerTask : SimpleTask {
		Invokes_Ref : Task*;
	};

	type TerminatorTask : SimpleTask {
		Terminates_Ref : Task*;
	};

	type ApplicationTask : SimpleTask;

	type Decision : ApplicationTask;

	type Clock : ApplicationTask;

	type SendCommunication : ApplicationTask;

	type ReceiveCommunication : ApplicationTask;

	type BusinessProcess : ApplicationTask;
}