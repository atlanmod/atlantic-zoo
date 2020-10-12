CREATE TABLE Namespace (
	__IDNamespace__ Integer NOT NULL,
	PRIMARY KEY Namespace (__IDNamespace__)
) ;

CREATE TABLE Task (
	__IDTask__ Integer NOT NULL,
	PRIMARY KEY Task (__IDTask__)
) ;

CREATE TABLE DataSet (
	__IDDataSet__ Integer NOT NULL,
	PRIMARY KEY DataSet (__IDDataSet__)
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	PRIMARY KEY Parameter (__IDParameter__)
) ;

CREATE TABLE DataElement (
	__IDDataElement__ Integer NOT NULL,
	FOREIGN KEY sink (__FKsink__) REFERENCES DataFlow (__IDDataFlow__),
	FOREIGN KEY source (__FKsource__) REFERENCES DataFlow (__IDDataFlow__),
	PRIMARY KEY DataElement (__IDDataElement__),
	__FKsink__ Integer,
	__FKsource__ Integer
) ;

CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	PRIMARY KEY ModelElement (__IDModelElement__)
) ;

CREATE TABLE Flow (
	__IDFlow__ Integer NOT NULL,
	PRIMARY KEY Flow (__IDFlow__)
) ;

CREATE TABLE DataFlow (
	__IDDataFlow__ Integer NOT NULL,
	PRIMARY KEY DataFlow (__IDDataFlow__)
) ;

CREATE TABLE ControlFlow (
	__IDControlFlow__ Integer NOT NULL,
	PRIMARY KEY ControlFlow (__IDControlFlow__)
) ;

CREATE TABLE ControlPoint (
	__IDControlPoint__ Integer NOT NULL,
	PRIMARY KEY ControlPoint (__IDControlPoint__)
) ;

CREATE TABLE Input (
	__IDInput__ Integer NOT NULL,
	PRIMARY KEY Input (__IDInput__)
) ;

CREATE TABLE Output (
	__IDOutput__ Integer NOT NULL,
	PRIMARY KEY Output (__IDOutput__)
) ;

CREATE TABLE OutputSet (
	__IDOutputSet__ Integer NOT NULL,
	PRIMARY KEY OutputSet (__IDOutputSet__)
) ;

CREATE TABLE InputSet (
	__IDInputSet__ Integer NOT NULL,
	PRIMARY KEY InputSet (__IDInputSet__)
) ;

CREATE TABLE Exception (
	__IDException__ Integer NOT NULL,
	PRIMARY KEY Exception (__IDException__)
) ;

CREATE TABLE SimpleTask (
	__IDSimpleTask__ Integer NOT NULL,
	PRIMARY KEY SimpleTask (__IDSimpleTask__)
) ;

CREATE TABLE CoumpoundTask (
	__IDCoumpoundTask__ Integer NOT NULL,
	FOREIGN KEY realizes (__FKrealizes__) REFERENCES BusinessProcess (__IDBusinessProcess__),
	PRIMARY KEY CoumpoundTask (__IDCoumpoundTask__),
	__FKrealizes__ Integer
) ;

CREATE TABLE MutliTask (
	__IDMutliTask__ Integer NOT NULL,
	PRIMARY KEY MutliTask (__IDMutliTask__)
) ;

CREATE TABLE InvokerTask (
	__IDInvokerTask__ Integer NOT NULL,
	PRIMARY KEY InvokerTask (__IDInvokerTask__)
) ;

CREATE TABLE TerminatorTask (
	__IDTerminatorTask__ Integer NOT NULL,
	PRIMARY KEY TerminatorTask (__IDTerminatorTask__)
) ;

CREATE TABLE ApplicationTask (
	__IDApplicationTask__ Integer NOT NULL,
	PRIMARY KEY ApplicationTask (__IDApplicationTask__)
) ;

CREATE TABLE Decision (
	__IDDecision__ Integer NOT NULL,
	PRIMARY KEY Decision (__IDDecision__)
) ;

CREATE TABLE Clock (
	__IDClock__ Integer NOT NULL,
	PRIMARY KEY Clock (__IDClock__)
) ;

CREATE TABLE SendCommunication (
	__IDSendCommunication__ Integer NOT NULL,
	PRIMARY KEY SendCommunication (__IDSendCommunication__)
) ;

CREATE TABLE ReceiveCommunication (
	__IDReceiveCommunication__ Integer NOT NULL,
	PRIMARY KEY ReceiveCommunication (__IDReceiveCommunication__)
) ;

CREATE TABLE BusinessProcess (
	__IDBusinessProcess__ Integer NOT NULL,
	PRIMARY KEY BusinessProcess (__IDBusinessProcess__)
) ;

CREATE TABLE Task_containsDataSet_DataSet (
	__IDTask__ Integer NOT NULL,
	__IDDataSet__ Integer NOT NULL
) ;

CREATE TABLE OutputSet_containsOutput_Output (
	__IDOutputSet__ Integer NOT NULL,
	__IDOutput__ Integer NOT NULL
) ;

CREATE TABLE ControlPoint_sink_ControlFlow (
	__IDControlPoint__ Integer NOT NULL,
	__IDControlFlow__ Integer NOT NULL
) ;

CREATE TABLE Task_terminator_TerminatorTask (
	__IDTask__ Integer NOT NULL,
	__IDTerminatorTask__ Integer NOT NULL
) ;

CREATE TABLE InvokerTask_invokes_Task (
	__IDInvokerTask__ Integer NOT NULL,
	__IDTask__ Integer NOT NULL
) ;

CREATE TABLE CoumpoundTask_containsTask_Task (
	__IDCoumpoundTask__ Integer NOT NULL,
	__IDTask__ Integer NOT NULL
) ;

CREATE TABLE DataSet_source_ControlFlow (
	__IDDataSet__ Integer NOT NULL,
	__IDControlFlow__ Integer NOT NULL
) ;

CREATE TABLE DataSet_contains_DataElement (
	__IDDataSet__ Integer NOT NULL,
	__IDDataElement__ Integer NOT NULL
) ;

CREATE TABLE TerminatorTask_terminates_Task (
	__IDTerminatorTask__ Integer NOT NULL,
	__IDTask__ Integer NOT NULL
) ;

CREATE TABLE Task_containsControlPoint_ControlPoint (
	__IDTask__ Integer NOT NULL,
	__IDControlPoint__ Integer NOT NULL
) ;

CREATE TABLE CoumpoundTask_containsFlow_Flow (
	__IDCoumpoundTask__ Integer NOT NULL,
	__IDFlow__ Integer NOT NULL
) ;

CREATE TABLE InputSet_containsInput_Input (
	__IDInputSet__ Integer NOT NULL,
	__IDInput__ Integer NOT NULL
) ;

CREATE TABLE Task_invoker_InvokerTask (
	__IDTask__ Integer NOT NULL,
	__IDInvokerTask__ Integer NOT NULL
) ;

CREATE TABLE DataSet_triggers_ControlPoint (
	__IDDataSet__ Integer NOT NULL,
	__IDControlPoint__ Integer NOT NULL
) ;
