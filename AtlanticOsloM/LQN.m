module LQN {

	type LQN {
		Name_Att : Text;
		Comment_Att : Text;
		Author_Att : Text;
		Created_On_ContRef : Date;
		Modified_On_ContRef : Date;
		Task_ContRef : Task+;
		Processor_ContRef : Processor+;
	};

	type Task {
		Name_Att : Text;
		Type_Att : TaskType;
		Priority_Att : Integer32;
		Mutliplicity_Att : Integer32;
		Replicas_Att : Integer32;
		Entry_ContRef : Entry+;
		Processor_Ref : Processor;
		Lqn_Ref : LQN;
		Activity_Ref : Activity+;
	};

	type Processor {
		Name_Att : Text;
		Scheduling_Att : SchedulingType;
		Mutliplicity_Att : Integer32;
		Replicas_Att : Integer32;
		Spped_Att : Integer32;
		Task_Ref : Task;
		Lqn_Ref : LQN;
	};

	type Entry {
		Name_Att : Text;
		Num_Phase_Att : Integer32;
		Arrival_Rate_Att : Integer32;
		Contained_In_ContRef : Task;
		Replay_To_ContRef : Entry;
		Callreceives_Ref : Call;
		Callsends_Ref : Call;
		Phase_Ref : Phase+;
		Activity_ContRef : Activity?;
		Task_Ref : Task;
	};

	type Phase {
		Number_Att : Integer32;
		Type_Att : PhaseType;
		Think_Time_Att : Integer32;
		Execution_Demand_Att : Integer32;
		COV_Att : Integer32;
		Entry_Ref : Entry;
		Activity_Ref : Activity;
	};

	type Activity {
		Name_Att : Text;
		Arrival_Rate_Att : Integer32;
		Contained_In_ContRef : Task;
		Replay_To_ContRef : Entry;
		LinkPrecedes_Ref : Link+;
		Linkfollows_Ref : Link+;
		Call_Ref : Call*;
		Phase_Ref : Phase;
		Entry_Ref : Entry;
		Task_Ref : Task;
	};

	type Link {
		Type_Att : LinkType;
		Mean_Links_Att : Integer32;
		FromActivity_ContRef : Activity;
		ToActivity_ContRef : Activity;
		ActivityPrecedes_Ref : Activity;
		Activityfollows_Ref : Activity;
	};

	type CallPhase {
		Mean_Calls_Att : Integer32;
		Refers_To_ContRef : Phase;
		Call_Ref : Call+;
	};

	type Call {
		ToEntry_ContRef : Entry;
		Num_Phases_Att : Integer32;
		Type_Att : CallType;
		CallPhase_Ref : CallPhase+;
		Activity_Ref : Activity;
		Entryreceives_Ref : Entry?;
		Entrysends_Ref : Entry?;
	};

	type EntryCall : Call {
		From_Entry_ContRef : Entry;
	};

	type ActivityCall : Call {
		FromActivity_ContRef : Activity;
	};

	type Date {
		Day_Att : Text;
		Month_Att : Text;
		Year_Att : Text;
	};

	type SchedulingType {"FCFS", "preemptive_Priority", "head_of_line", "random"};

	type PhaseType {"stochastic", "deterministic"};

	type CallType {"synchronous", "asynchronous", "forwording"};

	type LinkType {"and_Fork", "and_join", "basic", "or_Fork", "or_join"};

	type TaskType {"a_reference", "non_reference"};
}