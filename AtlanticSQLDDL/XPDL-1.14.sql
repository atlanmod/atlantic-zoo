CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	id text,
	name text,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE Package (
	__IDPackage__ Integer NOT NULL,
	FOREIGN KEY script (__FKscript__) REFERENCES Script (__IDScript__),
	PRIMARY KEY Package (__IDPackage__),
	__FKscript__ Integer
) ;

CREATE TABLE MessageFlow (
	__IDMessageFlow__ Integer NOT NULL,
	FOREIGN KEY targetActivity (__FKtargetActivity__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY sourceActivity (__FKsourceActivity__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY targetPool (__FKtargetPool__) REFERENCES Pool (__IDPool__),
	FOREIGN KEY sourcePool (__FKsourcePool__) REFERENCES Pool (__IDPool__),
	FOREIGN KEY object (__FKobject__) REFERENCES Object (__IDObject__),
	PRIMARY KEY MessageFlow (__IDMessageFlow__),
	__FKsourcePool__ Integer,
	__FKtargetActivity__ Integer,
	__FKsourceActivity__ Integer,
	__FKobject__ Integer,
	__FKtargetPool__ Integer
) ;

CREATE TABLE Association (
	__IDAssociation__ Integer NOT NULL,
	associationDirection text,
	FOREIGN KEY targetArtifact (__FKtargetArtifact__) REFERENCES Artifact (__IDArtifact__),
	FOREIGN KEY sourceArtifact (__FKsourceArtifact__) REFERENCES Artifact (__IDArtifact__),
	FOREIGN KEY targetPool (__FKtargetPool__) REFERENCES Pool (__IDPool__),
	FOREIGN KEY sourcePool (__FKsourcePool__) REFERENCES Pool (__IDPool__),
	FOREIGN KEY targetActivity (__FKtargetActivity__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY sourceActivity (__FKsourceActivity__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY object (__FKobject__) REFERENCES Object (__IDObject__),
	PRIMARY KEY Association (__IDAssociation__),
	__FKtargetArtifact__ Integer,
	__FKsourceActivity__ Integer,
	__FKobject__ Integer,
	__FKsourcePool__ Integer,
	__FKsourceArtifact__ Integer,
	__FKtargetActivity__ Integer,
	__FKtargetPool__ Integer
) ;

CREATE TABLE Pool (
	__IDPool__ Integer NOT NULL,
	orientation text,
	boundaryVisible Boolean,
	FOREIGN KEY object (__FKobject__) REFERENCES Object (__IDObject__),
	FOREIGN KEY participant (__FKparticipant__) REFERENCES Participant (__IDParticipant__),
	FOREIGN KEY process (__FKprocess__) REFERENCES Process (__IDProcess__),
	PRIMARY KEY Pool (__IDPool__),
	__FKparticipant__ Integer,
	__FKobject__ Integer,
	__FKprocess__ Integer
) ;

CREATE TABLE Lane (
	__IDLane__ Integer NOT NULL,
	FOREIGN KEY object (__FKobject__) REFERENCES Object (__IDObject__),
	FOREIGN KEY parentLane (__FKparentLane__) REFERENCES Lane (__IDLane__),
	FOREIGN KEY parentPool (__FKparentPool__) REFERENCES Pool (__IDPool__),
	PRIMARY KEY Lane (__IDLane__),
	__FKparentLane__ Integer,
	__FKparentPool__ Integer,
	__FKobject__ Integer
) ;

CREATE TABLE Participant (
	__IDParticipant__ Integer NOT NULL,
	PRIMARY KEY Participant (__IDParticipant__)
) ;

CREATE TABLE Artifact (
	__IDArtifact__ Integer NOT NULL,
	textAnnotation text,
	"group" text,
	FOREIGN KEY object (__FKobject__) REFERENCES Object (__IDObject__),
	FOREIGN KEY dataObject (__FKdataObject__) REFERENCES DataObject (__IDDataObject__),
	PRIMARY KEY Artifact (__IDArtifact__),
	__FKdataObject__ Integer,
	__FKobject__ Integer
) ;

CREATE TABLE DataObject (
	__IDDataObject__ Integer NOT NULL,
	state text,
	requiredForStart Boolean,
	producedAtCompletion Boolean,
	PRIMARY KEY DataObject (__IDDataObject__)
) ;

CREATE TABLE "Group" (
	__IDGroup__ Integer NOT NULL,
	PRIMARY KEY "Group" (__IDGroup__)
) ;

CREATE TABLE Annotation (
	__IDAnnotation__ Integer NOT NULL,
	PRIMARY KEY Annotation (__IDAnnotation__)
) ;

CREATE TABLE TypeDeclaration (
	__IDTypeDeclaration__ Integer NOT NULL,
	PRIMARY KEY TypeDeclaration (__IDTypeDeclaration__)
) ;

CREATE TABLE Application (
	__IDApplication__ Integer NOT NULL,
	PRIMARY KEY Application (__IDApplication__)
) ;

CREATE TABLE ParametrizedApplication (
	__IDParametrizedApplication__ Integer NOT NULL,
	PRIMARY KEY ParametrizedApplication (__IDParametrizedApplication__)
) ;

CREATE TABLE ReferencedApplication (
	__IDReferencedApplication__ Integer NOT NULL,
	FOREIGN KEY externalReference (__FKexternalReference__) REFERENCES ExternalReference (__IDExternalReference__),
	PRIMARY KEY ReferencedApplication (__IDReferencedApplication__),
	__FKexternalReference__ Integer
) ;

CREATE TABLE Activity (
	__IDActivity__ Integer NOT NULL,
	isStartActivity Boolean,
	status text,
	startMode text,
	finishMode text,
	startQuantity Integer,
	isATransaction Boolean,
	FOREIGN KEY object (__FKobject__) REFERENCES Object (__IDObject__),
	PRIMARY KEY Activity (__IDActivity__),
	__FKobject__ Integer
) ;

CREATE TABLE Task (
	__IDTask__ Integer NOT NULL,
	PRIMARY KEY Task (__IDTask__)
) ;

CREATE TABLE TaskService (
	__IDTaskService__ Integer NOT NULL,
	implementation text,
	PRIMARY KEY TaskService (__IDTaskService__)
) ;

CREATE TABLE TaskReceive (
	__IDTaskReceive__ Integer NOT NULL,
	instantiate Boolean,
	implementation text,
	PRIMARY KEY TaskReceive (__IDTaskReceive__)
) ;

CREATE TABLE TaskManual (
	__IDTaskManual__ Integer NOT NULL,
	PRIMARY KEY TaskManual (__IDTaskManual__)
) ;

CREATE TABLE TaskReference (
	__IDTaskReference__ Integer NOT NULL,
	FOREIGN KEY taskRef (__FKtaskRef__) REFERENCES Task (__IDTask__),
	PRIMARY KEY TaskReference (__IDTaskReference__),
	__FKtaskRef__ Integer
) ;

CREATE TABLE TaskScript (
	__IDTaskScript__ Integer NOT NULL,
	FOREIGN KEY script (__FKscript__) REFERENCES Script (__IDScript__),
	PRIMARY KEY TaskScript (__IDTaskScript__),
	__FKscript__ Integer
) ;

CREATE TABLE TaskSend (
	__IDTaskSend__ Integer NOT NULL,
	implementation text,
	PRIMARY KEY TaskSend (__IDTaskSend__)
) ;

CREATE TABLE TaskUser (
	__IDTaskUser__ Integer NOT NULL,
	implementation text,
	PRIMARY KEY TaskUser (__IDTaskUser__)
) ;

CREATE TABLE TaskApplication (
	__IDTaskApplication__ Integer NOT NULL,
	FOREIGN KEY packageRef (__FKpackageRef__) REFERENCES Package (__IDPackage__),
	PRIMARY KEY TaskApplication (__IDTaskApplication__),
	__FKpackageRef__ Integer
) ;

CREATE TABLE Route (
	__IDRoute__ Integer NOT NULL,
	gatewayType text,
	instantiate Boolean,
	markerVisiable Boolean,
	PRIMARY KEY Route (__IDRoute__)
) ;

CREATE TABLE SubFlow (
	__IDSubFlow__ Integer NOT NULL,
	execution text,
	instanceDataField text,
	FOREIGN KEY packageRef (__FKpackageRef__) REFERENCES Package (__IDPackage__),
	FOREIGN KEY startActivitySet (__FKstartActivitySet__) REFERENCES ActivitySet (__IDActivitySet__),
	FOREIGN KEY startActivity (__FKstartActivity__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY SubFlow (__IDSubFlow__),
	__FKstartActivity__ Integer,
	__FKpackageRef__ Integer,
	__FKstartActivitySet__ Integer
) ;

CREATE TABLE BlockActivity (
	__IDBlockActivity__ Integer NOT NULL,
	FOREIGN KEY activitySet (__FKactivitySet__) REFERENCES ActivitySet (__IDActivitySet__),
	FOREIGN KEY startActivity (__FKstartActivity__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY BlockActivity (__IDBlockActivity__),
	__FKactivitySet__ Integer,
	__FKstartActivity__ Integer
) ;

CREATE TABLE Event (
	__IDEvent__ Integer NOT NULL,
	triggerKind text,
	implementation text,
	FOREIGN KEY "trigger" (__FKtrigger__) REFERENCES "Trigger" (__IDTrigger__),
	PRIMARY KEY Event (__IDEvent__),
	__FKtrigger__ Integer
) ;

CREATE TABLE "Trigger" (
	__IDTrigger__ Integer NOT NULL,
	PRIMARY KEY "Trigger" (__IDTrigger__)
) ;

CREATE TABLE ResultCompensation (
	__IDResultCompensation__ Integer NOT NULL,
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY ResultCompensation (__IDResultCompensation__),
	__FKactivity__ Integer
) ;

CREATE TABLE ResultError (
	__IDResultError__ Integer NOT NULL,
	errorCode text,
	PRIMARY KEY ResultError (__IDResultError__)
) ;

CREATE TABLE ResultMultiple (
	__IDResultMultiple__ Integer NOT NULL,
	PRIMARY KEY ResultMultiple (__IDResultMultiple__)
) ;

CREATE TABLE TriggerResultLink (
	__IDTriggerResultLink__ Integer NOT NULL,
	FOREIGN KEY processRef (__FKprocessRef__) REFERENCES Process (__IDProcess__),
	PRIMARY KEY TriggerResultLink (__IDTriggerResultLink__),
	__FKprocessRef__ Integer
) ;

CREATE TABLE TriggerResultMessage (
	__IDTriggerResultMessage__ Integer NOT NULL,
	PRIMARY KEY TriggerResultMessage (__IDTriggerResultMessage__)
) ;

CREATE TABLE TriggerIntermediateMultiple (
	__IDTriggerIntermediateMultiple__ Integer NOT NULL,
	PRIMARY KEY TriggerIntermediateMultiple (__IDTriggerIntermediateMultiple__)
) ;

CREATE TABLE TriggerMultiple (
	__IDTriggerMultiple__ Integer NOT NULL,
	PRIMARY KEY TriggerMultiple (__IDTriggerMultiple__)
) ;

CREATE TABLE TriggerRule (
	__IDTriggerRule__ Integer NOT NULL,
	ruleName text,
	PRIMARY KEY TriggerRule (__IDTriggerRule__)
) ;

CREATE TABLE TriggerTimer (
	__IDTriggerTimer__ Integer NOT NULL,
	timeDate text,
	timeCycle text,
	PRIMARY KEY TriggerTimer (__IDTriggerTimer__)
) ;

CREATE TABLE StartEvent (
	__IDStartEvent__ Integer NOT NULL,
	PRIMARY KEY StartEvent (__IDStartEvent__)
) ;

CREATE TABLE IntermediateEvent (
	__IDIntermediateEvent__ Integer NOT NULL,
	FOREIGN KEY target (__FKtarget__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY IntermediateEvent (__IDIntermediateEvent__),
	__FKtarget__ Integer
) ;

CREATE TABLE EndEvent (
	__IDEndEvent__ Integer NOT NULL,
	PRIMARY KEY EndEvent (__IDEndEvent__)
) ;

CREATE TABLE Gateway (
	__IDGateway__ Integer NOT NULL,
	PRIMARY KEY Gateway (__IDGateway__)
) ;

CREATE TABLE Process (
	__IDProcess__ Integer NOT NULL,
	accessLevel text,
	processType text,
	status text,
	suppressJoinFailure Boolean,
	enableInstanceCompensation Boolean,
	adHoc Boolean,
	adHocOrdering text,
	adHocCompletionCondition text,
	FOREIGN KEY dataField (__FKdataField__) REFERENCES DataField (__IDDataField__),
	FOREIGN KEY object (__FKobject__) REFERENCES Object (__IDObject__),
	FOREIGN KEY defaultStartActivitySet (__FKdefaultStartActivitySet__) REFERENCES ActivitySet (__IDActivitySet__),
	FOREIGN KEY defaultStartActivity (__FKdefaultStartActivity__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY Process (__IDProcess__),
	__FKobject__ Integer,
	__FKdefaultStartActivitySet__ Integer,
	__FKdataField__ Integer,
	__FKdefaultStartActivity__ Integer
) ;

CREATE TABLE Transition (
	__IDTransition__ Integer NOT NULL,
	quantity Integer,
	FOREIGN KEY object (__FKobject__) REFERENCES Object (__IDObject__),
	FOREIGN KEY "to" (__FKto__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY Transition (__IDTransition__),
	__FKto__ Integer,
	__FKobject__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE ActivitySet (
	__IDActivitySet__ Integer NOT NULL,
	adHoc Boolean,
	adHocOrdering text,
	adHocCompletionCondition text,
	FOREIGN KEY defaultStartActivity (__FKdefaultStartActivity__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY object (__FKobject__) REFERENCES Object (__IDObject__),
	PRIMARY KEY ActivitySet (__IDActivitySet__),
	__FKobject__ Integer,
	__FKdefaultStartActivity__ Integer
) ;

CREATE TABLE ExternalReference (
	__IDExternalReference__ Integer NOT NULL,
	xref text,
	location text,
	namespace text,
	PRIMARY KEY ExternalReference (__IDExternalReference__)
) ;

CREATE TABLE Object (
	__IDObject__ Integer NOT NULL,
	PRIMARY KEY Object (__IDObject__)
) ;

CREATE TABLE ExternalPackage (
	__IDExternalPackage__ Integer NOT NULL,
	href text,
	PRIMARY KEY ExternalPackage (__IDExternalPackage__)
) ;

CREATE TABLE Category (
	__IDCategory__ Integer NOT NULL,
	PRIMARY KEY Category (__IDCategory__)
) ;

CREATE TABLE DataField (
	__IDDataField__ Integer NOT NULL,
	isArray Boolean,
	correlation Boolean,
	FOREIGN KEY dataType (__FKdataType__) REFERENCES TypeDeclaration (__IDTypeDeclaration__),
	PRIMARY KEY DataField (__IDDataField__),
	__FKdataType__ Integer
) ;

CREATE TABLE Script (
	__IDScript__ Integer NOT NULL,
	type text,
	version text,
	grammar text,
	PRIMARY KEY Script (__IDScript__)
) ;

CREATE TABLE Process_participant_Participant (
	__IDProcess__ Integer NOT NULL,
	__IDParticipant__ Integer NOT NULL
) ;

CREATE TABLE Process_activitySets_ActivitySet (
	__IDProcess__ Integer NOT NULL,
	__IDActivitySet__ Integer NOT NULL
) ;

CREATE TABLE Package_participants_Participant (
	__IDPackage__ Integer NOT NULL,
	__IDParticipant__ Integer NOT NULL
) ;

CREATE TABLE Process_activities_Activity (
	__IDProcess__ Integer NOT NULL,
	__IDActivity__ Integer NOT NULL
) ;

CREATE TABLE Package_workflowProcesses_Process (
	__IDPackage__ Integer NOT NULL,
	__IDProcess__ Integer NOT NULL
) ;

CREATE TABLE Package_externalPackages_ExternalPackage (
	__IDPackage__ Integer NOT NULL,
	__IDExternalPackage__ Integer NOT NULL
) ;

CREATE TABLE Object_categories_Category (
	__IDObject__ Integer NOT NULL,
	__IDCategory__ Integer NOT NULL
) ;

CREATE TABLE Package_applications_Application (
	__IDPackage__ Integer NOT NULL,
	__IDApplication__ Integer NOT NULL
) ;

CREATE TABLE DataObject_dataFields_DataField (
	__IDDataObject__ Integer NOT NULL,
	__IDDataField__ Integer NOT NULL
) ;

CREATE TABLE Package_dataFields_DataField (
	__IDPackage__ Integer NOT NULL,
	__IDDataField__ Integer NOT NULL
) ;

CREATE TABLE Package_typeDeclarations_TypeDeclaration (
	__IDPackage__ Integer NOT NULL,
	__IDTypeDeclaration__ Integer NOT NULL
) ;

CREATE TABLE Package_artifacts_Artifact (
	__IDPackage__ Integer NOT NULL,
	__IDArtifact__ Integer NOT NULL
) ;

CREATE TABLE Package_pools_Pool (
	__IDPackage__ Integer NOT NULL,
	__IDPool__ Integer NOT NULL
) ;

CREATE TABLE ActivitySet_transitions_Transition (
	__IDActivitySet__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE Package_messageFlows_MessageFlow (
	__IDPackage__ Integer NOT NULL,
	__IDMessageFlow__ Integer NOT NULL
) ;

CREATE TABLE Pool_lanes_Lane (
	__IDPool__ Integer NOT NULL,
	__IDLane__ Integer NOT NULL
) ;

CREATE TABLE ActivitySet_activities_Activity (
	__IDActivitySet__ Integer NOT NULL,
	__IDActivity__ Integer NOT NULL
) ;

CREATE TABLE Process_transitions_Transition (
	__IDProcess__ Integer NOT NULL,
	__IDTransition__ Integer NOT NULL
) ;

CREATE TABLE Activity_dataFields_DataField (
	__IDActivity__ Integer NOT NULL,
	__IDDataField__ Integer NOT NULL
) ;

CREATE TABLE Package_associations_Association (
	__IDPackage__ Integer NOT NULL,
	__IDAssociation__ Integer NOT NULL
) ;

CREATE TABLE Process_applications_Application (
	__IDProcess__ Integer NOT NULL,
	__IDApplication__ Integer NOT NULL
) ;
