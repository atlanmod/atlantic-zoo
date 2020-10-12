CREATE TABLE Matlab (
	__IDMatlab__ Integer NOT NULL,
	PRIMARY KEY Matlab (__IDMatlab__)
) ;

CREATE TABLE BlockDefaults (
	__IDBlockDefaults__ Integer NOT NULL,
	blockDefaults text,
	FOREIGN KEY model (__FKmodel__) REFERENCES Model (__IDModel__),
	PRIMARY KEY BlockDefaults (__IDBlockDefaults__),
	__FKmodel__ Integer
) ;

CREATE TABLE Model (
	__IDModel__ Integer NOT NULL,
	name text,
	FOREIGN KEY matlab (__FKmatlab__) REFERENCES Matlab (__IDMatlab__),
	FOREIGN KEY simulink (__FKsimulink__) REFERENCES Simulink (__IDSimulink__),
	PRIMARY KEY Model (__IDModel__),
	__FKmatlab__ Integer,
	__FKsimulink__ Integer
) ;

CREATE TABLE AnnotationDefaults (
	__IDAnnotationDefaults__ Integer NOT NULL,
	annotationDefaults text,
	FOREIGN KEY model (__FKmodel__) REFERENCES Model (__IDModel__),
	PRIMARY KEY AnnotationDefaults (__IDAnnotationDefaults__),
	__FKmodel__ Integer
) ;

CREATE TABLE LineDefaults (
	__IDLineDefaults__ Integer NOT NULL,
	lineDefaults text,
	FOREIGN KEY model (__FKmodel__) REFERENCES Model (__IDModel__),
	PRIMARY KEY LineDefaults (__IDLineDefaults__),
	__FKmodel__ Integer
) ;

CREATE TABLE System (
	__IDSystem__ Integer NOT NULL,
	name text,
	FOREIGN KEY model (__FKmodel__) REFERENCES Model (__IDModel__),
	FOREIGN KEY parentSubsystem (__FKparentSubsystem__) REFERENCES Subsystem (__IDSubsystem__),
	PRIMARY KEY System (__IDSystem__),
	__FKmodel__ Integer,
	__FKparentSubsystem__ Integer
) ;

CREATE TABLE Subsystem (
	__IDSubsystem__ Integer NOT NULL,
	FOREIGN KEY system (__FKsystem__) REFERENCES System (__IDSystem__),
	PRIMARY KEY Subsystem (__IDSubsystem__),
	__FKsystem__ Integer
) ;

CREATE TABLE Block (
	__IDBlock__ Integer NOT NULL,
	name text,
	blockType text,
	description text,
	priority text,
	tag text,
	position text,
	FOREIGN KEY mySystem (__FKmySystem__) REFERENCES System (__IDSystem__),
	PRIMARY KEY Block (__IDBlock__),
	__FKmySystem__ Integer
) ;

CREATE TABLE Annotation (
	__IDAnnotation__ Integer NOT NULL,
	position text,
	text text,
	FOREIGN KEY system (__FKsystem__) REFERENCES System (__IDSystem__),
	PRIMARY KEY Annotation (__IDAnnotation__),
	__FKsystem__ Integer
) ;

CREATE TABLE Line (
	__IDLine__ Integer NOT NULL,
	points text,
	id text,
	FOREIGN KEY srcPort (__FKsrcPort__) REFERENCES OutputPort (__IDOutputPort__),
	FOREIGN KEY system (__FKsystem__) REFERENCES System (__IDSystem__),
	PRIMARY KEY Line (__IDLine__),
	__FKsrcPort__ Integer,
	__FKsystem__ Integer
) ;

CREATE TABLE DirectLine (
	__IDDirectLine__ Integer NOT NULL,
	FOREIGN KEY destPort1 (__FKdestPort1__) REFERENCES InputPort (__IDInputPort__),
	PRIMARY KEY DirectLine (__IDDirectLine__),
	__FKdestPort1__ Integer
) ;

CREATE TABLE InputPort (
	__IDInputPort__ Integer NOT NULL,
	FOREIGN KEY owningDirectLine (__FKowningDirectLine__) REFERENCES DirectLine (__IDDirectLine__),
	FOREIGN KEY owningDirectBranch (__FKowningDirectBranch__) REFERENCES DirectBranch (__IDDirectBranch__),
	PRIMARY KEY InputPort (__IDInputPort__),
	__FKowningDirectBranch__ Integer,
	__FKowningDirectLine__ Integer
) ;

CREATE TABLE Branch (
	__IDBranch__ Integer NOT NULL,
	points text,
	FOREIGN KEY branchedLine (__FKbranchedLine__) REFERENCES BranchedLine (__IDBranchedLine__),
	FOREIGN KEY nestedBranch (__FKnestedBranch__) REFERENCES NestedBranch (__IDNestedBranch__),
	PRIMARY KEY Branch (__IDBranch__),
	__FKnestedBranch__ Integer,
	__FKbranchedLine__ Integer
) ;

CREATE TABLE BranchedLine (
	__IDBranchedLine__ Integer NOT NULL,
	PRIMARY KEY BranchedLine (__IDBranchedLine__)
) ;

CREATE TABLE Primitive (
	__IDPrimitive__ Integer NOT NULL,
	id text,
	FOREIGN KEY refPort (__FKrefPort__) REFERENCES Port (__IDPort__),
	PRIMARY KEY Primitive (__IDPrimitive__),
	__FKrefPort__ Integer
) ;

CREATE TABLE Port (
	__IDPort__ Integer NOT NULL,
	id text,
	number text,
	FOREIGN KEY portBlock (__FKportBlock__) REFERENCES Block (__IDBlock__),
	FOREIGN KEY primitive (__FKprimitive__) REFERENCES Primitive (__IDPrimitive__),
	PRIMARY KEY Port (__IDPort__),
	__FKportBlock__ Integer,
	__FKprimitive__ Integer
) ;

CREATE TABLE Reference (
	__IDReference__ Integer NOT NULL,
	sourceType text,
	sourceBlock text,
	PRIMARY KEY Reference (__IDReference__)
) ;

CREATE TABLE Masked (
	__IDMasked__ Integer NOT NULL,
	PRIMARY KEY Masked (__IDMasked__)
) ;

CREATE TABLE Normal (
	__IDNormal__ Integer NOT NULL,
	PRIMARY KEY Normal (__IDNormal__)
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	name text,
	FOREIGN KEY le_reference (__FKle_reference__) REFERENCES Reference (__IDReference__),
	FOREIGN KEY primitive (__FKprimitive__) REFERENCES Primitive (__IDPrimitive__),
	PRIMARY KEY Parameter (__IDParameter__),
	__FKle_reference__ Integer,
	__FKprimitive__ Integer
) ;

CREATE TABLE OutputPort (
	__IDOutputPort__ Integer NOT NULL,
	FOREIGN KEY owningLine (__FKowningLine__) REFERENCES Line (__IDLine__),
	PRIMARY KEY OutputPort (__IDOutputPort__),
	__FKowningLine__ Integer
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	value text,
	PRIMARY KEY Type (__IDType__)
) ;

CREATE TABLE "Double" (
	__IDDouble__ Integer NOT NULL,
	value text,
	PRIMARY KEY "Double" (__IDDouble__)
) ;

CREATE TABLE INteger (
	__IDINteger__ Integer NOT NULL,
	value text,
	PRIMARY KEY INteger (__IDINteger__)
) ;

CREATE TABLE Enumeration (
	__IDEnumeration__ Integer NOT NULL,
	value text,
	PRIMARY KEY Enumeration (__IDEnumeration__)
) ;

CREATE TABLE BOolean (
	__IDBOolean__ Integer NOT NULL,
	value text,
	PRIMARY KEY BOolean (__IDBOolean__)
) ;

CREATE TABLE Text (
	__IDText__ Integer NOT NULL,
	value text,
	PRIMARY KEY Text (__IDText__)
) ;

CREATE TABLE Vector (
	__IDVector__ Integer NOT NULL,
	value text,
	PRIMARY KEY Vector (__IDVector__)
) ;

CREATE TABLE DirectBranch (
	__IDDirectBranch__ Integer NOT NULL,
	id text,
	FOREIGN KEY destPort (__FKdestPort__) REFERENCES InputPort (__IDInputPort__),
	PRIMARY KEY DirectBranch (__IDDirectBranch__),
	__FKdestPort__ Integer
) ;

CREATE TABLE NestedBranch (
	__IDNestedBranch__ Integer NOT NULL,
	PRIMARY KEY NestedBranch (__IDNestedBranch__)
) ;

CREATE TABLE Machine (
	__IDMachine__ Integer NOT NULL,
	name text,
	id text,
	FOREIGN KEY stateFlow (__FKstateFlow__) REFERENCES StateFlow (__IDStateFlow__),
	PRIMARY KEY Machine (__IDMachine__),
	__FKstateFlow__ Integer
) ;

CREATE TABLE Junction (
	__IDJunction__ Integer NOT NULL,
	_id text,
	id text,
	type text,
	position text,
	FOREIGN KEY state (__FKstate__) REFERENCES State (__IDState__),
	FOREIGN KEY chart (__FKchart__) REFERENCES Chart (__IDChart__),
	PRIMARY KEY Junction (__IDJunction__),
	__FKstate__ Integer,
	__FKchart__ Integer
) ;

CREATE TABLE Transition (
	__IDTransition__ Integer NOT NULL,
	_id text,
	dataLimites text,
	id text,
	"trigger" text,
	"condition" text,
	conditionAction text,
	action text,
	FOREIGN KEY chart (__FKchart__) REFERENCES Chart (__IDChart__),
	FOREIGN KEY state (__FKstate__) REFERENCES State (__IDState__),
	PRIMARY KEY Transition (__IDTransition__),
	__FKstate__ Integer,
	__FKchart__ Integer
) ;

CREATE TABLE Event (
	__IDEvent__ Integer NOT NULL,
	name text,
	id text,
	scope text,
	description text,
	"trigger" text,
	FOREIGN KEY machine (__FKmachine__) REFERENCES Machine (__IDMachine__),
	FOREIGN KEY chart (__FKchart__) REFERENCES Chart (__IDChart__),
	FOREIGN KEY state (__FKstate__) REFERENCES State (__IDState__),
	PRIMARY KEY Event (__IDEvent__),
	__FKstate__ Integer,
	__FKchart__ Integer,
	__FKmachine__ Integer
) ;

CREATE TABLE Data (
	__IDData__ Integer NOT NULL,
	name text,
	id text,
	scope text,
	description text,
	units text,
	dataType text,
	FOREIGN KEY state (__FKstate__) REFERENCES State (__IDState__),
	FOREIGN KEY chart (__FKchart__) REFERENCES Chart (__IDChart__),
	FOREIGN KEY machine (__FKmachine__) REFERENCES Machine (__IDMachine__),
	PRIMARY KEY Data (__IDData__),
	__FKmachine__ Integer,
	__FKstate__ Integer,
	__FKchart__ Integer
) ;

CREATE TABLE Instance (
	__IDInstance__ Integer NOT NULL,
	_id text,
	id text,
	name text,
	FOREIGN KEY machine (__FKmachine__) REFERENCES Machine (__IDMachine__),
	PRIMARY KEY Instance (__IDInstance__),
	__FKmachine__ Integer
) ;

CREATE TABLE Target (
	__IDTarget__ Integer NOT NULL,
	name text,
	id text,
	codeCommand text,
	description text,
	makeCommand text,
	codeFlags text,
	checksumOld text,
	FOREIGN KEY machine (__FKmachine__) REFERENCES Machine (__IDMachine__),
	PRIMARY KEY Target (__IDTarget__),
	__FKmachine__ Integer
) ;

CREATE TABLE Chart (
	__IDChart__ Integer NOT NULL,
	name text,
	id text,
	_id text,
	decomposotion text,
	updateMethode text,
	sampleTime text,
	PRIMARY KEY Chart (__IDChart__)
) ;

CREATE TABLE State (
	__IDState__ Integer NOT NULL,
	name text,
	id text,
	_id text,
	type text,
	entryAction text,
	exitAction text,
	duringAction text,
	eventActions text,
	decomposition text,
	position text,
	FOREIGN KEY chart (__FKchart__) REFERENCES Chart (__IDChart__),
	PRIMARY KEY State (__IDState__),
	__FKchart__ Integer
) ;

CREATE TABLE Props (
	__IDProps__ Integer NOT NULL,
	initialValue text,
	FOREIGN KEY data (__FKdata__) REFERENCES Data (__IDData__),
	PRIMARY KEY Props (__IDProps__),
	__FKdata__ Integer
) ;

CREATE TABLE Range (
	__IDRange__ Integer NOT NULL,
	maximum text,
	minimum text,
	FOREIGN KEY props (__FKprops__) REFERENCES Props (__IDProps__),
	PRIMARY KEY Range (__IDRange__),
	__FKprops__ Integer
) ;

CREATE TABLE Array (
	__IDArray__ Integer NOT NULL,
	firstIndex text,
	size text,
	FOREIGN KEY props (__FKprops__) REFERENCES Props (__IDProps__),
	PRIMARY KEY Array (__IDArray__),
	__FKprops__ Integer
) ;

CREATE TABLE StateFlow (
	__IDStateFlow__ Integer NOT NULL,
	stateFlow text,
	FOREIGN KEY simulink (__FKsimulink__) REFERENCES Simulink (__IDSimulink__),
	PRIMARY KEY StateFlow (__IDStateFlow__),
	__FKsimulink__ Integer
) ;

CREATE TABLE TransitionTerminal (
	__IDTransitionTerminal__ Integer NOT NULL,
	_id text,
	PRIMARY KEY TransitionTerminal (__IDTransitionTerminal__)
) ;

CREATE TABLE Simulink (
	__IDSimulink__ Integer NOT NULL,
	simulink text,
	PRIMARY KEY Simulink (__IDSimulink__)
) ;

CREATE TABLE State_data_Data (
	__IDState__ Integer NOT NULL,
	__IDData__ Integer NOT NULL
) ;

CREATE TABLE Reference_parameters_Parameter (
	__IDReference__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Machine_instances_Instance (
	__IDMachine__ Integer NOT NULL,
	__IDInstance__ Integer NOT NULL
) ;

CREATE TABLE Block_ports_Port (
	__IDBlock__ Integer NOT NULL,
	__IDPort__ Integer NOT NULL
) ;

CREATE TABLE Model_lineDefaults_LineDefaults (
	__IDModel__ Integer NOT NULL,
	__IDLineDefaults__ Integer NOT NULL
) ;

CREATE TABLE Simulink_models_Model (
	__IDSimulink__ Integer NOT NULL,
	__IDModel__ Integer NOT NULL
) ;

CREATE TABLE System_blocks_Block (
	__IDSystem__ Integer NOT NULL,
	__IDBlock__ Integer NOT NULL
) ;

CREATE TABLE Machine_targets_Target (
	__IDMachine__ Integer NOT NULL,
	__IDTarget__ Integer NOT NULL
) ;

CREATE TABLE Model_system_System (
	__IDModel__ Integer NOT NULL,
	__IDSystem__ Integer NOT NULL
) ;

CREATE TABLE Chart_transitions_Transition (
	__IDChart__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE State_events_Event (
	__IDState__ Integer NOT NULL,
	__IDEvent__ Integer NOT NULL
) ;

CREATE TABLE System_lines_Line (
	__IDSystem__ Integer NOT NULL,
	__IDLine__ Integer NOT NULL
) ;

CREATE TABLE NestedBranch_branchs_Branch (
	__IDNestedBranch__ Integer NOT NULL,
	__IDBranch__ Integer NOT NULL
) ;

CREATE TABLE State_states_State (
	__IDState__ Integer NOT NULL,
	__IDState__ Integer NOT NULL
) ;

CREATE TABLE State_transitions_Transition (
	__IDState__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE Matlab_model_Model (
	__IDMatlab__ Integer NOT NULL,
	__IDModel__ Integer NOT NULL
) ;

CREATE TABLE Data_props_Props (
	__IDData__ Integer NOT NULL,
	__IDProps__ Integer NOT NULL
) ;

CREATE TABLE Model_blockDefaults_BlockDefaults (
	__IDModel__ Integer NOT NULL,
	__IDBlockDefaults__ Integer NOT NULL
) ;

CREATE TABLE Props_arrays_Array (
	__IDProps__ Integer NOT NULL,
	__IDArray__ Integer NOT NULL
) ;

CREATE TABLE State_junctions_Junction (
	__IDState__ Integer NOT NULL,
	__IDJunction__ Integer NOT NULL
) ;

CREATE TABLE StateFlow_machines_Machine (
	__IDStateFlow__ Integer NOT NULL,
	__IDMachine__ Integer NOT NULL
) ;

CREATE TABLE BranchedLine_branchs_Branch (
	__IDBranchedLine__ Integer NOT NULL,
	__IDBranch__ Integer NOT NULL
) ;

CREATE TABLE Chart_data_Data (
	__IDChart__ Integer NOT NULL,
	__IDData__ Integer NOT NULL
) ;

CREATE TABLE Machine_data_Data (
	__IDMachine__ Integer NOT NULL,
	__IDData__ Integer NOT NULL
) ;

CREATE TABLE Primitive_parameters_Parameter (
	__IDPrimitive__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Simulink_stateFlows_StateFlow (
	__IDSimulink__ Integer NOT NULL,
	__IDStateFlow__ Integer NOT NULL
) ;

CREATE TABLE Props_ranges_Range (
	__IDProps__ Integer NOT NULL,
	__IDRange__ Integer NOT NULL
) ;

CREATE TABLE Model_annotationDefaults_AnnotationDefaults (
	__IDModel__ Integer NOT NULL,
	__IDAnnotationDefaults__ Integer NOT NULL
) ;

CREATE TABLE Machine_events_Event (
	__IDMachine__ Integer NOT NULL,
	__IDEvent__ Integer NOT NULL
) ;

CREATE TABLE Chart_states_State (
	__IDChart__ Integer NOT NULL,
	__IDState__ Integer NOT NULL
) ;

CREATE TABLE Chart_junctions_Junction (
	__IDChart__ Integer NOT NULL,
	__IDJunction__ Integer NOT NULL
) ;

CREATE TABLE System_annotations_Annotation (
	__IDSystem__ Integer NOT NULL,
	__IDAnnotation__ Integer NOT NULL
) ;

CREATE TABLE Chart_events_Event (
	__IDChart__ Integer NOT NULL,
	__IDEvent__ Integer NOT NULL
) ;
