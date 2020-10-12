CREATE TABLE UIML (
	__IDUIML__ Integer NOT NULL,
	FOREIGN KEY head (__FKhead__) REFERENCES Header (__IDHeader__),
	PRIMARY KEY UIML (__IDUIML__),
	__FKhead__ Integer
) ;

CREATE TABLE Header (
	__IDHeader__ Integer NOT NULL,
	PRIMARY KEY Header (__IDHeader__)
) ;

CREATE TABLE MetaData (
	__IDMetaData__ Integer NOT NULL,
	name text,
	content text,
	PRIMARY KEY MetaData (__IDMetaData__)
) ;

CREATE TABLE ExtensibleElement (
	__IDExtensibleElement__ Integer NOT NULL,
	PRIMARY KEY ExtensibleElement (__IDExtensibleElement__)
) ;

CREATE TABLE Source (
	__IDSource__ Integer NOT NULL,
	PRIMARY KEY Source (__IDSource__)
) ;

CREATE TABLE LocalSource (
	__IDLocalSource__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES ExtensibleElement (__IDExtensibleElement__),
	PRIMARY KEY LocalSource (__IDLocalSource__),
	__FKsource__ Integer
) ;

CREATE TABLE RemoteSource (
	__IDRemoteSource__ Integer NOT NULL,
	location text,
	PRIMARY KEY RemoteSource (__IDRemoteSource__)
) ;

CREATE TABLE Interface (
	__IDInterface__ Integer NOT NULL,
	id text,
	how text,
	export text,
	FOREIGN KEY source (__FKsource__) REFERENCES Source (__IDSource__),
	PRIMARY KEY Interface (__IDInterface__),
	__FKsource__ Integer
) ;

CREATE TABLE Structure (
	__IDStructure__ Integer NOT NULL,
	id text,
	how text,
	export text,
	FOREIGN KEY source (__FKsource__) REFERENCES Source (__IDSource__),
	PRIMARY KEY Structure (__IDStructure__),
	__FKsource__ Integer
) ;

CREATE TABLE Part (
	__IDPart__ Integer NOT NULL,
	id text,
	how text,
	export text,
	class text,
	wherePart text,
	FOREIGN KEY source (__FKsource__) REFERENCES Source (__IDSource__),
	FOREIGN KEY style (__FKstyle__) REFERENCES Style (__IDStyle__),
	FOREIGN KEY content (__FKcontent__) REFERENCES Content (__IDContent__),
	FOREIGN KEY behavior (__FKbehavior__) REFERENCES Behavior (__IDBehavior__),
	PRIMARY KEY Part (__IDPart__),
	__FKbehavior__ Integer,
	__FKsource__ Integer,
	__FKstyle__ Integer,
	__FKcontent__ Integer
) ;

CREATE TABLE Style (
	__IDStyle__ Integer NOT NULL,
	id text,
	how text,
	export text,
	FOREIGN KEY source (__FKsource__) REFERENCES Source (__IDSource__),
	PRIMARY KEY Style (__IDStyle__),
	__FKsource__ Integer
) ;

CREATE TABLE Property (
	__IDProperty__ Integer NOT NULL,
	name text,
	how text,
	export text,
	FOREIGN KEY source (__FKsource__) REFERENCES Source (__IDSource__),
	PRIMARY KEY Property (__IDProperty__),
	__FKsource__ Integer
) ;

CREATE TABLE Content (
	__IDContent__ Integer NOT NULL,
	id text,
	how text,
	export text,
	FOREIGN KEY source (__FKsource__) REFERENCES Source (__IDSource__),
	PRIMARY KEY Content (__IDContent__),
	__FKsource__ Integer
) ;

CREATE TABLE Behavior (
	__IDBehavior__ Integer NOT NULL,
	id text,
	how text,
	export text,
	FOREIGN KEY source (__FKsource__) REFERENCES Source (__IDSource__),
	PRIMARY KEY Behavior (__IDBehavior__),
	__FKsource__ Integer
) ;

CREATE TABLE "Repeat" (
	__IDRepeat__ Integer NOT NULL,
	FOREIGN KEY iterator (__FKiterator__) REFERENCES Iterator (__IDIterator__),
	PRIMARY KEY "Repeat" (__IDRepeat__),
	__FKiterator__ Integer
) ;

CREATE TABLE Constant (
	__IDConstant__ Integer NOT NULL,
	id text,
	how text,
	export text,
	model text,
	value text,
	FOREIGN KEY source (__FKsource__) REFERENCES Source (__IDSource__),
	PRIMARY KEY Constant (__IDConstant__),
	__FKsource__ Integer
) ;

CREATE TABLE Reference (
	__IDReference__ Integer NOT NULL,
	FOREIGN KEY constant (__FKconstant__) REFERENCES Constant (__IDConstant__),
	PRIMARY KEY Reference (__IDReference__),
	__FKconstant__ Integer
) ;

CREATE TABLE Rule (
	__IDRule__ Integer NOT NULL,
	id text,
	how text,
	export text,
	FOREIGN KEY source (__FKsource__) REFERENCES Source (__IDSource__),
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES "Condition" (__IDCondition__),
	FOREIGN KEY action (__FKaction__) REFERENCES Action (__IDAction__),
	PRIMARY KEY Rule (__IDRule__),
	__FKaction__ Integer,
	__FKsource__ Integer,
	__FKcondition__ Integer
) ;

CREATE TABLE "Condition" (
	__IDCondition__ Integer NOT NULL,
	PRIMARY KEY "Condition" (__IDCondition__)
) ;

CREATE TABLE EventCondition (
	__IDEventCondition__ Integer NOT NULL,
	FOREIGN KEY event (__FKevent__) REFERENCES Event (__IDEvent__),
	PRIMARY KEY EventCondition (__IDEventCondition__),
	__FKevent__ Integer
) ;

CREATE TABLE EqualCondition (
	__IDEqualCondition__ Integer NOT NULL,
	FOREIGN KEY equal (__FKequal__) REFERENCES Equal (__IDEqual__),
	PRIMARY KEY EqualCondition (__IDEqualCondition__),
	__FKequal__ Integer
) ;

CREATE TABLE OpCondition (
	__IDOpCondition__ Integer NOT NULL,
	FOREIGN KEY op (__FKop__) REFERENCES Operation (__IDOperation__),
	PRIMARY KEY OpCondition (__IDOpCondition__),
	__FKop__ Integer
) ;

CREATE TABLE Action (
	__IDAction__ Integer NOT NULL,
	PRIMARY KEY Action (__IDAction__)
) ;

CREATE TABLE Action_1 (
	__IDAction_1__ Integer NOT NULL,
	FOREIGN KEY event (__FKevent__) REFERENCES Event (__IDEvent__),
	PRIMARY KEY Action_1 (__IDAction_1__),
	__FKevent__ Integer
) ;

CREATE TABLE Action_2 (
	__IDAction_2__ Integer NOT NULL,
	FOREIGN KEY whenTrue (__FKwhenTrue__) REFERENCES WhenTrue (__IDWhenTrue__),
	FOREIGN KEY whenFalse (__FKwhenFalse__) REFERENCES WhenFalse (__IDWhenFalse__),
	FOREIGN KEY byDefault (__FKbyDefault__) REFERENCES ByDefault (__IDByDefault__),
	PRIMARY KEY Action_2 (__IDAction_2__),
	__FKwhenFalse__ Integer,
	__FKbyDefault__ Integer,
	__FKwhenTrue__ Integer
) ;

CREATE TABLE "Call" (
	__IDCall__ Integer NOT NULL,
	name text,
	PRIMARY KEY "Call" (__IDCall__)
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	name text,
	PRIMARY KEY Parameter (__IDParameter__)
) ;

CREATE TABLE PropertyParameter (
	__IDPropertyParameter__ Integer NOT NULL,
	FOREIGN KEY property (__FKproperty__) REFERENCES Property (__IDProperty__),
	PRIMARY KEY PropertyParameter (__IDPropertyParameter__),
	__FKproperty__ Integer
) ;

CREATE TABLE ReferenceParameter (
	__IDReferenceParameter__ Integer NOT NULL,
	FOREIGN KEY reference (__FKreference__) REFERENCES Reference (__IDReference__),
	PRIMARY KEY ReferenceParameter (__IDReferenceParameter__),
	__FKreference__ Integer
) ;

CREATE TABLE CallParameter (
	__IDCallParameter__ Integer NOT NULL,
	FOREIGN KEY "call" (__FKcall__) REFERENCES "Call" (__IDCall__),
	PRIMARY KEY CallParameter (__IDCallParameter__),
	__FKcall__ Integer
) ;

CREATE TABLE OperationParameter (
	__IDOperationParameter__ Integer NOT NULL,
	FOREIGN KEY op (__FKop__) REFERENCES Operation (__IDOperation__),
	PRIMARY KEY OperationParameter (__IDOperationParameter__),
	__FKop__ Integer
) ;

CREATE TABLE EventParameter (
	__IDEventParameter__ Integer NOT NULL,
	FOREIGN KEY event (__FKevent__) REFERENCES Event (__IDEvent__),
	PRIMARY KEY EventParameter (__IDEventParameter__),
	__FKevent__ Integer
) ;

CREATE TABLE ConstantParameter (
	__IDConstantParameter__ Integer NOT NULL,
	FOREIGN KEY constant (__FKconstant__) REFERENCES Constant (__IDConstant__),
	PRIMARY KEY ConstantParameter (__IDConstantParameter__),
	__FKconstant__ Integer
) ;

CREATE TABLE IteratorParameter (
	__IDIteratorParameter__ Integer NOT NULL,
	FOREIGN KEY iterator (__FKiterator__) REFERENCES Iterator (__IDIterator__),
	PRIMARY KEY IteratorParameter (__IDIteratorParameter__),
	__FKiterator__ Integer
) ;

CREATE TABLE Iterator (
	__IDIterator__ Integer NOT NULL,
	id text,
	PRIMARY KEY Iterator (__IDIterator__)
) ;

CREATE TABLE ConstantIterator (
	__IDConstantIterator__ Integer NOT NULL,
	FOREIGN KEY constant (__FKconstant__) REFERENCES Constant (__IDConstant__),
	PRIMARY KEY ConstantIterator (__IDConstantIterator__),
	__FKconstant__ Integer
) ;

CREATE TABLE PropertyIterator (
	__IDPropertyIterator__ Integer NOT NULL,
	FOREIGN KEY property (__FKproperty__) REFERENCES Property (__IDProperty__),
	PRIMARY KEY PropertyIterator (__IDPropertyIterator__),
	__FKproperty__ Integer
) ;

CREATE TABLE CallIterator (
	__IDCallIterator__ Integer NOT NULL,
	FOREIGN KEY "call" (__FKcall__) REFERENCES "Call" (__IDCall__),
	PRIMARY KEY CallIterator (__IDCallIterator__),
	__FKcall__ Integer
) ;

CREATE TABLE TextIterator (
	__IDTextIterator__ Integer NOT NULL,
	value Integer,
	PRIMARY KEY TextIterator (__IDTextIterator__)
) ;

CREATE TABLE Event (
	__IDEvent__ Integer NOT NULL,
	class text,
	PRIMARY KEY Event (__IDEvent__)
) ;

CREATE TABLE Equal (
	__IDEqual__ Integer NOT NULL,
	FOREIGN KEY event (__FKevent__) REFERENCES Event (__IDEvent__),
	PRIMARY KEY Equal (__IDEqual__),
	__FKevent__ Integer
) ;

CREATE TABLE EqualToConstant (
	__IDEqualToConstant__ Integer NOT NULL,
	FOREIGN KEY constant (__FKconstant__) REFERENCES Constant (__IDConstant__),
	PRIMARY KEY EqualToConstant (__IDEqualToConstant__),
	__FKconstant__ Integer
) ;

CREATE TABLE EqualToProperty (
	__IDEqualToProperty__ Integer NOT NULL,
	FOREIGN KEY property (__FKproperty__) REFERENCES Property (__IDProperty__),
	PRIMARY KEY EqualToProperty (__IDEqualToProperty__),
	__FKproperty__ Integer
) ;

CREATE TABLE EqualToReference (
	__IDEqualToReference__ Integer NOT NULL,
	FOREIGN KEY reference (__FKreference__) REFERENCES Reference (__IDReference__),
	PRIMARY KEY EqualToReference (__IDEqualToReference__),
	__FKreference__ Integer
) ;

CREATE TABLE EqualToOperation (
	__IDEqualToOperation__ Integer NOT NULL,
	FOREIGN KEY op (__FKop__) REFERENCES Operation (__IDOperation__),
	PRIMARY KEY EqualToOperation (__IDEqualToOperation__),
	__FKop__ Integer
) ;

CREATE TABLE Operation (
	__IDOperation__ Integer NOT NULL,
	name text,
	PRIMARY KEY Operation (__IDOperation__)
) ;

CREATE TABLE Restructure (
	__IDRestructure__ Integer NOT NULL,
	how text,
	FOREIGN KEY atPart (__FKatPart__) REFERENCES Part (__IDPart__),
	FOREIGN KEY wherePart (__FKwherePart__) REFERENCES Part (__IDPart__),
	FOREIGN KEY source (__FKsource__) REFERENCES Source (__IDSource__),
	FOREIGN KEY template (__FKtemplate__) REFERENCES Template (__IDTemplate__),
	PRIMARY KEY Restructure (__IDRestructure__),
	__FKsource__ Integer,
	__FKwherePart__ Integer,
	__FKatPart__ Integer,
	__FKtemplate__ Integer
) ;

CREATE TABLE Branch (
	__IDBranch__ Integer NOT NULL,
	FOREIGN KEY restructure (__FKrestructure__) REFERENCES Restructure (__IDRestructure__),
	FOREIGN KEY op (__FKop__) REFERENCES Operation (__IDOperation__),
	FOREIGN KEY equal (__FKequal__) REFERENCES Equal (__IDEqual__),
	FOREIGN KEY event (__FKevent__) REFERENCES Event (__IDEvent__),
	PRIMARY KEY Branch (__IDBranch__),
	__FKevent__ Integer,
	__FKop__ Integer,
	__FKequal__ Integer,
	__FKrestructure__ Integer
) ;

CREATE TABLE WhenTrue (
	__IDWhenTrue__ Integer NOT NULL,
	PRIMARY KEY WhenTrue (__IDWhenTrue__)
) ;

CREATE TABLE WhenFalse (
	__IDWhenFalse__ Integer NOT NULL,
	PRIMARY KEY WhenFalse (__IDWhenFalse__)
) ;

CREATE TABLE ByDefault (
	__IDByDefault__ Integer NOT NULL,
	PRIMARY KEY ByDefault (__IDByDefault__)
) ;

CREATE TABLE Peer (
	__IDPeer__ Integer NOT NULL,
	id text,
	how text,
	export text,
	FOREIGN KEY source (__FKsource__) REFERENCES Source (__IDSource__),
	PRIMARY KEY Peer (__IDPeer__),
	__FKsource__ Integer
) ;

CREATE TABLE Presentation (
	__IDPresentation__ Integer NOT NULL,
	id text,
	how text,
	export text,
	base text,
	FOREIGN KEY source (__FKsource__) REFERENCES Source (__IDSource__),
	PRIMARY KEY Presentation (__IDPresentation__),
	__FKsource__ Integer
) ;

CREATE TABLE Logic (
	__IDLogic__ Integer NOT NULL,
	id text,
	how text,
	export text,
	FOREIGN KEY source (__FKsource__) REFERENCES Source (__IDSource__),
	PRIMARY KEY Logic (__IDLogic__),
	__FKsource__ Integer
) ;

CREATE TABLE DComponent (
	__IDDComponent__ Integer NOT NULL,
	id text,
	how text,
	export text,
	mapsTo text,
	location text,
	FOREIGN KEY source (__FKsource__) REFERENCES Source (__IDSource__),
	PRIMARY KEY DComponent (__IDDComponent__),
	__FKsource__ Integer
) ;

CREATE TABLE DClass (
	__IDDClass__ Integer NOT NULL,
	id text,
	how text,
	export text,
	mapsTo text,
	mapsType text,
	FOREIGN KEY source (__FKsource__) REFERENCES Source (__IDSource__),
	PRIMARY KEY DClass (__IDDClass__),
	__FKsource__ Integer
) ;

CREATE TABLE DProperty (
	__IDDProperty__ Integer NOT NULL,
	id text,
	mapsType text,
	mapsTo text,
	returnType text,
	PRIMARY KEY DProperty (__IDDProperty__)
) ;

CREATE TABLE DMethod (
	__IDDMethod__ Integer NOT NULL,
	id text,
	how text,
	export text,
	mapsTo text,
	returnType text,
	FOREIGN KEY source (__FKsource__) REFERENCES Source (__IDSource__),
	FOREIGN KEY script (__FKscript__) REFERENCES Script (__IDScript__),
	PRIMARY KEY DMethod (__IDDMethod__),
	__FKscript__ Integer,
	__FKsource__ Integer
) ;

CREATE TABLE DParam (
	__IDDParam__ Integer NOT NULL,
	id text,
	type text,
	value text,
	PRIMARY KEY DParam (__IDDParam__)
) ;

CREATE TABLE Script (
	__IDScript__ Integer NOT NULL,
	id text,
	type text,
	how text,
	export text,
	value text,
	source text,
	PRIMARY KEY Script (__IDScript__)
) ;

CREATE TABLE Listener (
	__IDListener__ Integer NOT NULL,
	class text,
	attacher text,
	PRIMARY KEY Listener (__IDListener__)
) ;

CREATE TABLE Template (
	__IDTemplate__ Integer NOT NULL,
	id text,
	PRIMARY KEY Template (__IDTemplate__)
) ;

CREATE TABLE BehaviorTemplate (
	__IDBehaviorTemplate__ Integer NOT NULL,
	FOREIGN KEY behavior (__FKbehavior__) REFERENCES Behavior (__IDBehavior__),
	PRIMARY KEY BehaviorTemplate (__IDBehaviorTemplate__),
	__FKbehavior__ Integer
) ;

CREATE TABLE DClassTemplate (
	__IDDClassTemplate__ Integer NOT NULL,
	FOREIGN KEY dClass (__FKdClass__) REFERENCES DClass (__IDDClass__),
	PRIMARY KEY DClassTemplate (__IDDClassTemplate__),
	__FKdClass__ Integer
) ;

CREATE TABLE DComponentTemplate (
	__IDDComponentTemplate__ Integer NOT NULL,
	FOREIGN KEY dComponent (__FKdComponent__) REFERENCES DComponent (__IDDComponent__),
	PRIMARY KEY DComponentTemplate (__IDDComponentTemplate__),
	__FKdComponent__ Integer
) ;

CREATE TABLE ConstantTemplate (
	__IDConstantTemplate__ Integer NOT NULL,
	FOREIGN KEY constant (__FKconstant__) REFERENCES Constant (__IDConstant__),
	PRIMARY KEY ConstantTemplate (__IDConstantTemplate__),
	__FKconstant__ Integer
) ;

CREATE TABLE ContentTemplate (
	__IDContentTemplate__ Integer NOT NULL,
	FOREIGN KEY content (__FKcontent__) REFERENCES Content (__IDContent__),
	PRIMARY KEY ContentTemplate (__IDContentTemplate__),
	__FKcontent__ Integer
) ;

CREATE TABLE InterfaceTemplate (
	__IDInterfaceTemplate__ Integer NOT NULL,
	FOREIGN KEY interface (__FKinterface__) REFERENCES Interface (__IDInterface__),
	PRIMARY KEY InterfaceTemplate (__IDInterfaceTemplate__),
	__FKinterface__ Integer
) ;

CREATE TABLE LogicTemplate (
	__IDLogicTemplate__ Integer NOT NULL,
	FOREIGN KEY logic (__FKlogic__) REFERENCES Logic (__IDLogic__),
	PRIMARY KEY LogicTemplate (__IDLogicTemplate__),
	__FKlogic__ Integer
) ;

CREATE TABLE PartTemplate (
	__IDPartTemplate__ Integer NOT NULL,
	FOREIGN KEY part (__FKpart__) REFERENCES Part (__IDPart__),
	PRIMARY KEY PartTemplate (__IDPartTemplate__),
	__FKpart__ Integer
) ;

CREATE TABLE PeerTemplate (
	__IDPeerTemplate__ Integer NOT NULL,
	FOREIGN KEY peer (__FKpeer__) REFERENCES Peer (__IDPeer__),
	PRIMARY KEY PeerTemplate (__IDPeerTemplate__),
	__FKpeer__ Integer
) ;

CREATE TABLE PresentationTemplate (
	__IDPresentationTemplate__ Integer NOT NULL,
	FOREIGN KEY presentation (__FKpresentation__) REFERENCES Presentation (__IDPresentation__),
	PRIMARY KEY PresentationTemplate (__IDPresentationTemplate__),
	__FKpresentation__ Integer
) ;

CREATE TABLE PropertyTemplate (
	__IDPropertyTemplate__ Integer NOT NULL,
	FOREIGN KEY property (__FKproperty__) REFERENCES Property (__IDProperty__),
	PRIMARY KEY PropertyTemplate (__IDPropertyTemplate__),
	__FKproperty__ Integer
) ;

CREATE TABLE RestructureTemplate (
	__IDRestructureTemplate__ Integer NOT NULL,
	FOREIGN KEY restructure (__FKrestructure__) REFERENCES Restructure (__IDRestructure__),
	PRIMARY KEY RestructureTemplate (__IDRestructureTemplate__),
	__FKrestructure__ Integer
) ;

CREATE TABLE RuleTemplate (
	__IDRuleTemplate__ Integer NOT NULL,
	FOREIGN KEY rule (__FKrule__) REFERENCES Rule (__IDRule__),
	PRIMARY KEY RuleTemplate (__IDRuleTemplate__),
	__FKrule__ Integer
) ;

CREATE TABLE ScriptTemplate (
	__IDScriptTemplate__ Integer NOT NULL,
	FOREIGN KEY script (__FKscript__) REFERENCES Script (__IDScript__),
	PRIMARY KEY ScriptTemplate (__IDScriptTemplate__),
	__FKscript__ Integer
) ;

CREATE TABLE StructureTemplate (
	__IDStructureTemplate__ Integer NOT NULL,
	FOREIGN KEY structure (__FKstructure__) REFERENCES Structure (__IDStructure__),
	PRIMARY KEY StructureTemplate (__IDStructureTemplate__),
	__FKstructure__ Integer
) ;

CREATE TABLE StyleTemplate (
	__IDStyleTemplate__ Integer NOT NULL,
	FOREIGN KEY style (__FKstyle__) REFERENCES Style (__IDStyle__),
	PRIMARY KEY StyleTemplate (__IDStyleTemplate__),
	__FKstyle__ Integer
) ;

CREATE TABLE DProperty_dMethods_DMethod (
	__IDDProperty__ Integer NOT NULL,
	__IDDMethod__ Integer NOT NULL
) ;

CREATE TABLE Interface_content_Content (
	__IDInterface__ Integer NOT NULL,
	__IDContent__ Integer NOT NULL
) ;

CREATE TABLE Property_constants_Constant (
	__IDProperty__ Integer NOT NULL,
	__IDConstant__ Integer NOT NULL
) ;

CREATE TABLE Behavior_rules_Rule (
	__IDBehavior__ Integer NOT NULL,
	__IDRule__ Integer NOT NULL
) ;

CREATE TABLE DComponent_dMethods_DMethod (
	__IDDComponent__ Integer NOT NULL,
	__IDDMethod__ Integer NOT NULL
) ;

CREATE TABLE DClass_dProperties_DProperty (
	__IDDClass__ Integer NOT NULL,
	__IDDProperty__ Integer NOT NULL
) ;

CREATE TABLE Operation_calls_Call (
	__IDOperation__ Integer NOT NULL,
	__IDCall__ Integer NOT NULL
) ;

CREATE TABLE Part_repeats_Repeat (
	__IDPart__ Integer NOT NULL,
	__IDRepeat__ Integer NOT NULL
) ;

CREATE TABLE Event_parts_Part (
	__IDEvent__ Integer NOT NULL,
	__IDPart__ Integer NOT NULL
) ;

CREATE TABLE Call_params_Parameter (
	__IDCall__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Constant_constants_Constant (
	__IDConstant__ Integer NOT NULL,
	__IDConstant__ Integer NOT NULL
) ;

CREATE TABLE DProperty_dParams_DParam (
	__IDDProperty__ Integer NOT NULL,
	__IDDParam__ Integer NOT NULL
) ;

CREATE TABLE Property_references_Reference (
	__IDProperty__ Integer NOT NULL,
	__IDReference__ Integer NOT NULL
) ;

CREATE TABLE Property_properties_Property (
	__IDProperty__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Action_1_restructures_Restructure (
	__IDAction_1__ Integer NOT NULL,
	__IDRestructure__ Integer NOT NULL
) ;

CREATE TABLE Operation_references_Reference (
	__IDOperation__ Integer NOT NULL,
	__IDReference__ Integer NOT NULL
) ;

CREATE TABLE Style_properties_Property (
	__IDStyle__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE DMethod_dParams_DParam (
	__IDDMethod__ Integer NOT NULL,
	__IDDParam__ Integer NOT NULL
) ;

CREATE TABLE Interface_style_Style (
	__IDInterface__ Integer NOT NULL,
	__IDStyle__ Integer NOT NULL
) ;

CREATE TABLE Part_parts_Part (
	__IDPart__ Integer NOT NULL,
	__IDPart__ Integer NOT NULL
) ;

CREATE TABLE UIML_interfaces_Interface (
	__IDUIML__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;

CREATE TABLE Peer_presentations_Presentation (
	__IDPeer__ Integer NOT NULL,
	__IDPresentation__ Integer NOT NULL
) ;

CREATE TABLE Property_parts_Part (
	__IDProperty__ Integer NOT NULL,
	__IDPart__ Integer NOT NULL
) ;

CREATE TABLE Operation_ops_Operation (
	__IDOperation__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE Structure_parts_Part (
	__IDStructure__ Integer NOT NULL,
	__IDPart__ Integer NOT NULL
) ;

CREATE TABLE Interface_structure_Structure (
	__IDInterface__ Integer NOT NULL,
	__IDStructure__ Integer NOT NULL
) ;

CREATE TABLE Property_events_Event (
	__IDProperty__ Integer NOT NULL,
	__IDEvent__ Integer NOT NULL
) ;

CREATE TABLE Header_metas_MetaData (
	__IDHeader__ Integer NOT NULL,
	__IDMetaData__ Integer NOT NULL
) ;

CREATE TABLE Logic_dComponents_DComponent (
	__IDLogic__ Integer NOT NULL,
	__IDDComponent__ Integer NOT NULL
) ;

CREATE TABLE UIML_peers_Peer (
	__IDUIML__ Integer NOT NULL,
	__IDPeer__ Integer NOT NULL
) ;

CREATE TABLE Operation_constants_Constant (
	__IDOperation__ Integer NOT NULL,
	__IDConstant__ Integer NOT NULL
) ;

CREATE TABLE Property_iterators_Iterator (
	__IDProperty__ Integer NOT NULL,
	__IDIterator__ Integer NOT NULL
) ;

CREATE TABLE Operation_properties_Property (
	__IDOperation__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Branch_properties_Property (
	__IDBranch__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Peer_logics_Logic (
	__IDPeer__ Integer NOT NULL,
	__IDLogic__ Integer NOT NULL
) ;

CREATE TABLE Branch_calls_Call (
	__IDBranch__ Integer NOT NULL,
	__IDCall__ Integer NOT NULL
) ;

CREATE TABLE DClass_dMethods_DMethod (
	__IDDClass__ Integer NOT NULL,
	__IDDMethod__ Integer NOT NULL
) ;

CREATE TABLE Interface_behavior_Behavior (
	__IDInterface__ Integer NOT NULL,
	__IDBehavior__ Integer NOT NULL
) ;

CREATE TABLE Action_1_properties_Property (
	__IDAction_1__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Content_constants_Constant (
	__IDContent__ Integer NOT NULL,
	__IDConstant__ Integer NOT NULL
) ;

CREATE TABLE Repeat_parts_Part (
	__IDRepeat__ Integer NOT NULL,
	__IDPart__ Integer NOT NULL
) ;

CREATE TABLE UIML_templates_Template (
	__IDUIML__ Integer NOT NULL,
	__IDTemplate__ Integer NOT NULL
) ;

CREATE TABLE Presentation_dClasses_DClass (
	__IDPresentation__ Integer NOT NULL,
	__IDDClass__ Integer NOT NULL
) ;

CREATE TABLE Property_calls_Call (
	__IDProperty__ Integer NOT NULL,
	__IDCall__ Integer NOT NULL
) ;

CREATE TABLE Action_1_calls_Call (
	__IDAction_1__ Integer NOT NULL,
	__IDCall__ Integer NOT NULL
) ;

CREATE TABLE DClass_events_Event (
	__IDDClass__ Integer NOT NULL,
	__IDEvent__ Integer NOT NULL
) ;

CREATE TABLE DClass_listeners_Listener (
	__IDDClass__ Integer NOT NULL,
	__IDListener__ Integer NOT NULL
) ;

CREATE TABLE Operation_events_Event (
	__IDOperation__ Integer NOT NULL,
	__IDEvent__ Integer NOT NULL
) ;
