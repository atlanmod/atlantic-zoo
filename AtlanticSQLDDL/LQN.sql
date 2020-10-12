CREATE TABLE LQN (
	__IDLQN__ Integer NOT NULL,
	name text,
	comment text,
	author text,
	created_On text,
	modified_On text,
	PRIMARY KEY LQN (__IDLQN__)
) ;

CREATE TABLE Task (
	__IDTask__ Integer NOT NULL,
	name text,
	type text,
	priority Integer,
	mutliplicity Integer,
	replicas Integer,
	FOREIGN KEY processor (__FKprocessor__) REFERENCES Processor (__IDProcessor__),
	FOREIGN KEY lqn (__FKlqn__) REFERENCES LQN (__IDLQN__),
	PRIMARY KEY Task (__IDTask__),
	__FKlqn__ Integer,
	__FKprocessor__ Integer
) ;

CREATE TABLE Processor (
	__IDProcessor__ Integer NOT NULL,
	name text,
	scheduling text,
	mutliplicity Integer,
	replicas Integer,
	spped Integer,
	FOREIGN KEY task (__FKtask__) REFERENCES Task (__IDTask__),
	FOREIGN KEY lqn (__FKlqn__) REFERENCES LQN (__IDLQN__),
	PRIMARY KEY Processor (__IDProcessor__),
	__FKtask__ Integer,
	__FKlqn__ Integer
) ;

CREATE TABLE Entry (
	__IDEntry__ Integer NOT NULL,
	name text,
	num_Phase Integer,
	arrival_Rate Integer,
	contained_In text,
	replay_To text,
	FOREIGN KEY callreceives (__FKcallreceives__) REFERENCES "Call" (__IDCall__),
	FOREIGN KEY callsends (__FKcallsends__) REFERENCES "Call" (__IDCall__),
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY task (__FKtask__) REFERENCES Task (__IDTask__),
	PRIMARY KEY Entry (__IDEntry__),
	__FKcallsends__ Integer,
	__FKcallreceives__ Integer,
	__FKactivity__ Integer,
	__FKtask__ Integer
) ;

CREATE TABLE Phase (
	__IDPhase__ Integer NOT NULL,
	number Integer,
	type text,
	think_Time Integer,
	execution_Demand Integer,
	COV Integer,
	FOREIGN KEY entry (__FKentry__) REFERENCES Entry (__IDEntry__),
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY Phase (__IDPhase__),
	__FKactivity__ Integer,
	__FKentry__ Integer
) ;

CREATE TABLE Activity (
	__IDActivity__ Integer NOT NULL,
	name text,
	arrival_Rate Integer,
	contained_In text,
	replay_To text,
	FOREIGN KEY phase (__FKphase__) REFERENCES Phase (__IDPhase__),
	FOREIGN KEY entry (__FKentry__) REFERENCES Entry (__IDEntry__),
	FOREIGN KEY task (__FKtask__) REFERENCES Task (__IDTask__),
	PRIMARY KEY Activity (__IDActivity__),
	__FKphase__ Integer,
	__FKtask__ Integer,
	__FKentry__ Integer
) ;

CREATE TABLE Link (
	__IDLink__ Integer NOT NULL,
	type text,
	mean_Links Integer,
	fromActivity text,
	toActivity text,
	FOREIGN KEY activityPrecedes (__FKactivityPrecedes__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY activityfollows (__FKactivityfollows__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY Link (__IDLink__),
	__FKactivityfollows__ Integer,
	__FKactivityPrecedes__ Integer
) ;

CREATE TABLE CallPhase (
	__IDCallPhase__ Integer NOT NULL,
	mean_Calls Integer,
	refers_To text,
	PRIMARY KEY CallPhase (__IDCallPhase__)
) ;

CREATE TABLE "Call" (
	__IDCall__ Integer NOT NULL,
	toEntry text,
	num_Phases Integer,
	type text,
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY entryreceives (__FKentryreceives__) REFERENCES Entry (__IDEntry__),
	FOREIGN KEY entrysends (__FKentrysends__) REFERENCES Entry (__IDEntry__),
	PRIMARY KEY "Call" (__IDCall__),
	__FKactivity__ Integer,
	__FKentryreceives__ Integer,
	__FKentrysends__ Integer
) ;

CREATE TABLE EntryCall (
	__IDEntryCall__ Integer NOT NULL,
	from_Entry text,
	PRIMARY KEY EntryCall (__IDEntryCall__)
) ;

CREATE TABLE ActivityCall (
	__IDActivityCall__ Integer NOT NULL,
	fromActivity text,
	PRIMARY KEY ActivityCall (__IDActivityCall__)
) ;

CREATE TABLE Date (
	__IDDate__ Integer NOT NULL,
	day text,
	month text,
	year text,
	PRIMARY KEY Date (__IDDate__)
) ;

CREATE TABLE LQN_task_Task (
	__IDLQN__ Integer NOT NULL,
	__IDTask__ Integer NOT NULL
) ;

CREATE TABLE CallPhase_call_Call (
	__IDCallPhase__ Integer NOT NULL,
	__IDCall__ Integer NOT NULL
) ;

CREATE TABLE LQN_processor_Processor (
	__IDLQN__ Integer NOT NULL,
	__IDProcessor__ Integer NOT NULL
) ;

CREATE TABLE Call_callPhase_CallPhase (
	__IDCall__ Integer NOT NULL,
	__IDCallPhase__ Integer NOT NULL
) ;

CREATE TABLE Entry_phase_Phase (
	__IDEntry__ Integer NOT NULL,
	__IDPhase__ Integer NOT NULL
) ;

CREATE TABLE Task_entry_Entry (
	__IDTask__ Integer NOT NULL,
	__IDEntry__ Integer NOT NULL
) ;

CREATE TABLE Activity_linkfollows_Link (
	__IDActivity__ Integer NOT NULL,
	__IDLink__ Integer NOT NULL
) ;

CREATE TABLE Activity_linkPrecedes_Link (
	__IDActivity__ Integer NOT NULL,
	__IDLink__ Integer NOT NULL
) ;

CREATE TABLE Activity_call_Call (
	__IDActivity__ Integer NOT NULL,
	__IDCall__ Integer NOT NULL
) ;

CREATE TABLE Task_activity_Activity (
	__IDTask__ Integer NOT NULL,
	__IDActivity__ Integer NOT NULL
) ;
