CREATE TABLE Process (
	__IDProcess__ Integer NOT NULL,
	name text,
	targetNamespace text,
	queryLanguage text,
	expressionLanguage text,
	suppressJoinFailure text,
	variableAccessSerializable text,
	FOREIGN KEY partnerLinks (__FKpartnerLinks__) REFERENCES PartnerLinks (__IDPartnerLinks__),
	FOREIGN KEY variables (__FKvariables__) REFERENCES Variables (__IDVariables__),
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY faultHandlers (__FKfaultHandlers__) REFERENCES FaultHandler (__IDFaultHandler__),
	FOREIGN KEY eventHandlers (__FKeventHandlers__) REFERENCES EventHandler (__IDEventHandler__),
	FOREIGN KEY correlationSets (__FKcorrelationSets__) REFERENCES CorrelationSets (__IDCorrelationSets__),
	FOREIGN KEY extensions (__FKextensions__) REFERENCES Extensions (__IDExtensions__),
	exitOnStandardFault text,
	PRIMARY KEY Process (__IDProcess__),
	__FKextensions__ Integer,
	__FKeventHandlers__ Integer,
	__FKactivity__ Integer,
	__FKcorrelationSets__ Integer,
	__FKfaultHandlers__ Integer,
	__FKvariables__ Integer,
	__FKpartnerLinks__ Integer
) ;

CREATE TABLE PartnerLink (
	__IDPartnerLink__ Integer NOT NULL,
	name text,
	FOREIGN KEY myRole (__FKmyRole__) REFERENCES Role (__IDRole__),
	FOREIGN KEY partnerRole (__FKpartnerRole__) REFERENCES Role (__IDRole__),
	FOREIGN KEY PartnerLinkType (__FKPartnerLinkType__) REFERENCES PartnerLinkType (__IDPartnerLinkType__),
	initializePartnerRole text,
	PRIMARY KEY PartnerLink (__IDPartnerLink__),
	__FKpartnerRole__ Integer,
	__FKmyRole__ Integer,
	__FKPartnerLinkType__ Integer
) ;

CREATE TABLE FaultHandler (
	__IDFaultHandler__ Integer NOT NULL,
	FOREIGN KEY catchAll (__FKcatchAll__) REFERENCES CatchAll (__IDCatchAll__),
	PRIMARY KEY FaultHandler (__IDFaultHandler__),
	__FKcatchAll__ Integer
) ;

CREATE TABLE Activity (
	__IDActivity__ Integer NOT NULL,
	name text,
	suppressJoinFailure text,
	FOREIGN KEY targets (__FKtargets__) REFERENCES Targets (__IDTargets__),
	FOREIGN KEY sources (__FKsources__) REFERENCES Sources (__IDSources__),
	PRIMARY KEY Activity (__IDActivity__),
	__FKsources__ Integer,
	__FKtargets__ Integer
) ;

CREATE TABLE CorrelationSet (
	__IDCorrelationSet__ Integer NOT NULL,
	name text,
	PRIMARY KEY CorrelationSet (__IDCorrelationSet__)
) ;

CREATE TABLE Invoke (
	__IDInvoke__ Integer NOT NULL,
	FOREIGN KEY outputVariable (__FKoutputVariable__) REFERENCES Variable (__IDVariable__),
	FOREIGN KEY inputVariable (__FKinputVariable__) REFERENCES Variable (__IDVariable__),
	FOREIGN KEY compensationHandler (__FKcompensationHandler__) REFERENCES CompensationHandler (__IDCompensationHandler__),
	FOREIGN KEY faultHandler (__FKfaultHandler__) REFERENCES FaultHandler (__IDFaultHandler__),
	PRIMARY KEY Invoke (__IDInvoke__),
	__FKinputVariable__ Integer,
	__FKoutputVariable__ Integer,
	__FKfaultHandler__ Integer,
	__FKcompensationHandler__ Integer
) ;

CREATE TABLE Link (
	__IDLink__ Integer NOT NULL,
	name text,
	PRIMARY KEY Link (__IDLink__)
) ;

CREATE TABLE Catch (
	__IDCatch__ Integer NOT NULL,
	faultName text,
	FOREIGN KEY faultVariable (__FKfaultVariable__) REFERENCES Variable (__IDVariable__),
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY faultMessageType (__FKfaultMessageType__) REFERENCES Message (__IDMessage__),
	FOREIGN KEY faultElement (__FKfaultElement__) REFERENCES XSDElementDeclaration (__IDXSDElementDeclaration__),
	PRIMARY KEY Catch (__IDCatch__),
	__FKfaultMessageType__ Integer,
	__FKfaultElement__ Integer,
	__FKfaultVariable__ Integer,
	__FKactivity__ Integer
) ;

CREATE TABLE Reply (
	__IDReply__ Integer NOT NULL,
	faultName text,
	FOREIGN KEY variable (__FKvariable__) REFERENCES Variable (__IDVariable__),
	PRIMARY KEY Reply (__IDReply__),
	__FKvariable__ Integer
) ;

CREATE TABLE PartnerActivity (
	__IDPartnerActivity__ Integer NOT NULL,
	FOREIGN KEY partnerLink (__FKpartnerLink__) REFERENCES PartnerLink (__IDPartnerLink__),
	FOREIGN KEY correlations (__FKcorrelations__) REFERENCES Correlations (__IDCorrelations__),
	FOREIGN KEY portType (__FKportType__) REFERENCES PortType (__IDPortType__),
	FOREIGN KEY operation (__FKoperation__) REFERENCES Operation (__IDOperation__),
	PRIMARY KEY PartnerActivity (__IDPartnerActivity__),
	__FKpartnerLink__ Integer,
	__FKoperation__ Integer,
	__FKportType__ Integer,
	__FKcorrelations__ Integer
) ;

CREATE TABLE Receive (
	__IDReceive__ Integer NOT NULL,
	createInstance text,
	FOREIGN KEY variable (__FKvariable__) REFERENCES Variable (__IDVariable__),
	PRIMARY KEY Receive (__IDReceive__),
	__FKvariable__ Integer
) ;

CREATE TABLE "Exit" (
	__IDExit__ Integer NOT NULL,
	PRIMARY KEY "Exit" (__IDExit__)
) ;

CREATE TABLE Throw (
	__IDThrow__ Integer NOT NULL,
	faultName text,
	FOREIGN KEY faultVariable (__FKfaultVariable__) REFERENCES Variable (__IDVariable__),
	PRIMARY KEY Throw (__IDThrow__),
	__FKfaultVariable__ Integer
) ;

CREATE TABLE Wait (
	__IDWait__ Integer NOT NULL,
	FOREIGN KEY "for" (__FKfor__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY until (__FKuntil__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY Wait (__IDWait__),
	__FKfor__ Integer,
	__FKuntil__ Integer
) ;

CREATE TABLE Empty (
	__IDEmpty__ Integer NOT NULL,
	PRIMARY KEY Empty (__IDEmpty__)
) ;

CREATE TABLE Sequence (
	__IDSequence__ Integer NOT NULL,
	PRIMARY KEY Sequence (__IDSequence__)
) ;

CREATE TABLE Switch (
	__IDSwitch__ Integer NOT NULL,
	FOREIGN KEY otherwise (__FKotherwise__) REFERENCES Otherwise (__IDOtherwise__),
	PRIMARY KEY Switch (__IDSwitch__),
	__FKotherwise__ Integer
) ;

CREATE TABLE "Case" (
	__IDCase__ Integer NOT NULL,
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES "Condition" (__IDCondition__),
	PRIMARY KEY "Case" (__IDCase__),
	__FKcondition__ Integer,
	__FKactivity__ Integer
) ;

CREATE TABLE "While" (
	__IDWhile__ Integer NOT NULL,
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES "Condition" (__IDCondition__),
	PRIMARY KEY "While" (__IDWhile__),
	__FKcondition__ Integer,
	__FKactivity__ Integer
) ;

CREATE TABLE Pick (
	__IDPick__ Integer NOT NULL,
	createInstance text,
	PRIMARY KEY Pick (__IDPick__)
) ;

CREATE TABLE Flow (
	__IDFlow__ Integer NOT NULL,
	FOREIGN KEY links (__FKlinks__) REFERENCES Links (__IDLinks__),
	FOREIGN KEY completionCondition (__FKcompletionCondition__) REFERENCES CompletionCondition (__IDCompletionCondition__),
	PRIMARY KEY Flow (__IDFlow__),
	__FKlinks__ Integer,
	__FKcompletionCondition__ Integer
) ;

CREATE TABLE OnAlarm (
	__IDOnAlarm__ Integer NOT NULL,
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY "for" (__FKfor__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY until (__FKuntil__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY repeatEvery (__FKrepeatEvery__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY OnAlarm (__IDOnAlarm__),
	__FKactivity__ Integer,
	__FKrepeatEvery__ Integer,
	__FKfor__ Integer,
	__FKuntil__ Integer
) ;

CREATE TABLE Assign (
	__IDAssign__ Integer NOT NULL,
	validate text,
	PRIMARY KEY Assign (__IDAssign__)
) ;

CREATE TABLE Copy (
	__IDCopy__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES "To" (__IDTo__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES "From" (__IDFrom__),
	keepSrcElementName text,
	PRIMARY KEY Copy (__IDCopy__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE Extension (
	__IDExtension__ Integer NOT NULL,
	namespace text,
	mustUnderstand text,
	PRIMARY KEY Extension (__IDExtension__)
) ;

CREATE TABLE Scope (
	__IDScope__ Integer NOT NULL,
	isolated text,
	FOREIGN KEY faultHandlers (__FKfaultHandlers__) REFERENCES FaultHandler (__IDFaultHandler__),
	FOREIGN KEY compensationHandler (__FKcompensationHandler__) REFERENCES CompensationHandler (__IDCompensationHandler__),
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY variables (__FKvariables__) REFERENCES Variables (__IDVariables__),
	FOREIGN KEY correlationSets (__FKcorrelationSets__) REFERENCES CorrelationSets (__IDCorrelationSets__),
	FOREIGN KEY eventHandlers (__FKeventHandlers__) REFERENCES EventHandler (__IDEventHandler__),
	FOREIGN KEY partnerLinks (__FKpartnerLinks__) REFERENCES PartnerLinks (__IDPartnerLinks__),
	FOREIGN KEY terminationHandler (__FKterminationHandler__) REFERENCES TerminationHandler (__IDTerminationHandler__),
	PRIMARY KEY Scope (__IDScope__),
	__FKactivity__ Integer,
	__FKcompensationHandler__ Integer,
	__FKpartnerLinks__ Integer,
	__FKterminationHandler__ Integer,
	__FKfaultHandlers__ Integer,
	__FKvariables__ Integer,
	__FKeventHandlers__ Integer,
	__FKcorrelationSets__ Integer
) ;

CREATE TABLE Compensate (
	__IDCompensate__ Integer NOT NULL,
	FOREIGN KEY scope (__FKscope__) REFERENCES EObject (__IDEObject__),
	PRIMARY KEY Compensate (__IDCompensate__),
	__FKscope__ Integer
) ;

CREATE TABLE CompensationHandler (
	__IDCompensationHandler__ Integer NOT NULL,
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY CompensationHandler (__IDCompensationHandler__),
	__FKactivity__ Integer
) ;

CREATE TABLE "To" (
	__IDTo__ Integer NOT NULL,
	FOREIGN KEY variable (__FKvariable__) REFERENCES Variable (__IDVariable__),
	FOREIGN KEY part (__FKpart__) REFERENCES Part (__IDPart__),
	FOREIGN KEY partnerLink (__FKpartnerLink__) REFERENCES PartnerLink (__IDPartnerLink__),
	FOREIGN KEY property (__FKproperty__) REFERENCES Property (__IDProperty__),
	FOREIGN KEY query (__FKquery__) REFERENCES BPELQuery (__IDBPELQuery__),
	PRIMARY KEY "To" (__IDTo__),
	__FKproperty__ Integer,
	__FKvariable__ Integer,
	__FKpart__ Integer,
	__FKquery__ Integer,
	__FKpartnerLink__ Integer
) ;

CREATE TABLE "From" (
	__IDFrom__ Integer NOT NULL,
	opaque text,
	endpointReference text,
	literal text,
	unsafeLiteral text,
	FOREIGN KEY expression (__FKexpression__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY serviceRef (__FKserviceRef__) REFERENCES ServiceRef (__IDServiceRef__),
	FOREIGN KEY type (__FKtype__) REFERENCES XSDTypeDefinition (__IDXSDTypeDefinition__),
	PRIMARY KEY "From" (__IDFrom__),
	__FKserviceRef__ Integer,
	__FKtype__ Integer,
	__FKexpression__ Integer
) ;

CREATE TABLE OnMessage (
	__IDOnMessage__ Integer NOT NULL,
	FOREIGN KEY variable (__FKvariable__) REFERENCES Variable (__IDVariable__),
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY portType (__FKportType__) REFERENCES PortType (__IDPortType__),
	FOREIGN KEY partnerLink (__FKpartnerLink__) REFERENCES PartnerLink (__IDPartnerLink__),
	FOREIGN KEY correlations (__FKcorrelations__) REFERENCES Correlations (__IDCorrelations__),
	FOREIGN KEY operation (__FKoperation__) REFERENCES Operation (__IDOperation__),
	PRIMARY KEY OnMessage (__IDOnMessage__),
	__FKportType__ Integer,
	__FKoperation__ Integer,
	__FKvariable__ Integer,
	__FKpartnerLink__ Integer,
	__FKactivity__ Integer,
	__FKcorrelations__ Integer
) ;

CREATE TABLE Expression (
	__IDExpression__ Integer NOT NULL,
	body text,
	expressionLanguage text,
	opaque text,
	PRIMARY KEY Expression (__IDExpression__)
) ;

CREATE TABLE BooleanExpression (
	__IDBooleanExpression__ Integer NOT NULL,
	PRIMARY KEY BooleanExpression (__IDBooleanExpression__)
) ;

CREATE TABLE Correlation (
	__IDCorrelation__ Integer NOT NULL,
	initiate text,
	pattern text,
	FOREIGN KEY "set" (__FKset__) REFERENCES CorrelationSet (__IDCorrelationSet__),
	PRIMARY KEY Correlation (__IDCorrelation__),
	__FKset__ Integer
) ;

CREATE TABLE EventHandler (
	__IDEventHandler__ Integer NOT NULL,
	PRIMARY KEY EventHandler (__IDEventHandler__)
) ;

CREATE TABLE Source (
	__IDSource__ Integer NOT NULL,
	FOREIGN KEY Link (__FKLink__) REFERENCES Link (__IDLink__),
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY transitionCondition (__FKtransitionCondition__) REFERENCES "Condition" (__IDCondition__),
	PRIMARY KEY Source (__IDSource__),
	__FKLink__ Integer,
	__FKtransitionCondition__ Integer,
	__FKactivity__ Integer
) ;

CREATE TABLE Target (
	__IDTarget__ Integer NOT NULL,
	FOREIGN KEY Link (__FKLink__) REFERENCES Link (__IDLink__),
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY Target (__IDTarget__),
	__FKLink__ Integer,
	__FKactivity__ Integer
) ;

CREATE TABLE PartnerLinks (
	__IDPartnerLinks__ Integer NOT NULL,
	PRIMARY KEY PartnerLinks (__IDPartnerLinks__)
) ;

CREATE TABLE Variables (
	__IDVariables__ Integer NOT NULL,
	PRIMARY KEY Variables (__IDVariables__)
) ;

CREATE TABLE CorrelationSets (
	__IDCorrelationSets__ Integer NOT NULL,
	PRIMARY KEY CorrelationSets (__IDCorrelationSets__)
) ;

CREATE TABLE Links (
	__IDLinks__ Integer NOT NULL,
	PRIMARY KEY Links (__IDLinks__)
) ;

CREATE TABLE CatchAll (
	__IDCatchAll__ Integer NOT NULL,
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY CatchAll (__IDCatchAll__),
	__FKactivity__ Integer
) ;

CREATE TABLE Correlations (
	__IDCorrelations__ Integer NOT NULL,
	PRIMARY KEY Correlations (__IDCorrelations__)
) ;

CREATE TABLE Variable (
	__IDVariable__ Integer NOT NULL,
	name text,
	FOREIGN KEY messageType (__FKmessageType__) REFERENCES Message (__IDMessage__),
	FOREIGN KEY XSDElement (__FKXSDElement__) REFERENCES XSDElementDeclaration (__IDXSDElementDeclaration__),
	FOREIGN KEY type (__FKtype__) REFERENCES XSDTypeDefinition (__IDXSDTypeDefinition__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES "From" (__IDFrom__),
	PRIMARY KEY Variable (__IDVariable__),
	__FKtype__ Integer,
	__FKfrom__ Integer,
	__FKXSDElement__ Integer,
	__FKmessageType__ Integer
) ;

CREATE TABLE Otherwise (
	__IDOtherwise__ Integer NOT NULL,
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY Otherwise (__IDOtherwise__),
	__FKactivity__ Integer
) ;

CREATE TABLE UnknownExtensibilityAttribute (
	__IDUnknownExtensibilityAttribute__ Integer NOT NULL,
	PRIMARY KEY UnknownExtensibilityAttribute (__IDUnknownExtensibilityAttribute__)
) ;

CREATE TABLE OnEvent (
	__IDOnEvent__ Integer NOT NULL,
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY variable (__FKvariable__) REFERENCES Variable (__IDVariable__),
	FOREIGN KEY partnerLink (__FKpartnerLink__) REFERENCES PartnerLink (__IDPartnerLink__),
	FOREIGN KEY correlations (__FKcorrelations__) REFERENCES Correlations (__IDCorrelations__),
	FOREIGN KEY operation (__FKoperation__) REFERENCES Operation (__IDOperation__),
	FOREIGN KEY portType (__FKportType__) REFERENCES PortType (__IDPortType__),
	FOREIGN KEY messageType (__FKmessageType__) REFERENCES Message (__IDMessage__),
	FOREIGN KEY correlationSets (__FKcorrelationSets__) REFERENCES CorrelationSets (__IDCorrelationSets__),
	PRIMARY KEY OnEvent (__IDOnEvent__),
	__FKvariable__ Integer,
	__FKportType__ Integer,
	__FKmessageType__ Integer,
	__FKactivity__ Integer,
	__FKpartnerLink__ Integer,
	__FKcorrelations__ Integer,
	__FKcorrelationSets__ Integer,
	__FKoperation__ Integer
) ;

CREATE TABLE BPELImport (
	__IDBPELImport__ Integer NOT NULL,
	namespace text,
	location text,
	importType text,
	PRIMARY KEY BPELImport (__IDBPELImport__)
) ;

CREATE TABLE Rethrow (
	__IDRethrow__ Integer NOT NULL,
	PRIMARY KEY Rethrow (__IDRethrow__)
) ;

CREATE TABLE "Condition" (
	__IDCondition__ Integer NOT NULL,
	PRIMARY KEY "Condition" (__IDCondition__)
) ;

CREATE TABLE Targets (
	__IDTargets__ Integer NOT NULL,
	FOREIGN KEY joinCondition (__FKjoinCondition__) REFERENCES "Condition" (__IDCondition__),
	PRIMARY KEY Targets (__IDTargets__),
	__FKjoinCondition__ Integer
) ;

CREATE TABLE Sources (
	__IDSources__ Integer NOT NULL,
	PRIMARY KEY Sources (__IDSources__)
) ;

CREATE TABLE BPELQuery (
	__IDBPELQuery__ Integer NOT NULL,
	value text,
	queryLanguage text,
	PRIMARY KEY BPELQuery (__IDBPELQuery__)
) ;

CREATE TABLE ServiceRef (
	__IDServiceRef__ Integer NOT NULL,
	referenceScheme text,
	value text,
	PRIMARY KEY ServiceRef (__IDServiceRef__)
) ;

CREATE TABLE Extensions (
	__IDExtensions__ Integer NOT NULL,
	PRIMARY KEY Extensions (__IDExtensions__)
) ;

CREATE TABLE ExtensionActivity (
	__IDExtensionActivity__ Integer NOT NULL,
	PRIMARY KEY ExtensionActivity (__IDExtensionActivity__)
) ;

CREATE TABLE FromPart (
	__IDFromPart__ Integer NOT NULL,
	part text,
	FOREIGN KEY "to" (__FKto__) REFERENCES "To" (__IDTo__),
	PRIMARY KEY FromPart (__IDFromPart__),
	__FKto__ Integer
) ;

CREATE TABLE ToPart (
	__IDToPart__ Integer NOT NULL,
	part text,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES "From" (__IDFrom__),
	PRIMARY KEY ToPart (__IDToPart__),
	__FKfrom__ Integer
) ;

CREATE TABLE OpaqueActivity (
	__IDOpaqueActivity__ Integer NOT NULL,
	PRIMARY KEY OpaqueActivity (__IDOpaqueActivity__)
) ;

CREATE TABLE ForEach (
	__IDForEach__ Integer NOT NULL,
	parallel text,
	FOREIGN KEY counterName (__FKcounterName__) REFERENCES Variable (__IDVariable__),
	FOREIGN KEY completionCondition (__FKcompletionCondition__) REFERENCES CompletionCondition (__IDCompletionCondition__),
	FOREIGN KEY iterator (__FKiterator__) REFERENCES Iterator (__IDIterator__),
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY ForEach (__IDForEach__),
	__FKcounterName__ Integer,
	__FKcompletionCondition__ Integer,
	__FKactivity__ Integer,
	__FKiterator__ Integer
) ;

CREATE TABLE RepeatUntil (
	__IDRepeatUntil__ Integer NOT NULL,
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES "Condition" (__IDCondition__),
	PRIMARY KEY RepeatUntil (__IDRepeatUntil__),
	__FKcondition__ Integer,
	__FKactivity__ Integer
) ;

CREATE TABLE TerminationHandler (
	__IDTerminationHandler__ Integer NOT NULL,
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY TerminationHandler (__IDTerminationHandler__),
	__FKactivity__ Integer
) ;

CREATE TABLE Validate (
	__IDValidate__ Integer NOT NULL,
	PRIMARY KEY Validate (__IDValidate__)
) ;

CREATE TABLE "If" (
	__IDIf__ Integer NOT NULL,
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES "Condition" (__IDCondition__),
	FOREIGN KEY "then" (__FKthen__) REFERENCES "Then" (__IDThen__),
	FOREIGN KEY "else" (__FKelse__) REFERENCES "Else" (__IDElse__),
	PRIMARY KEY "If" (__IDIf__),
	__FKcondition__ Integer,
	__FKelse__ Integer,
	__FKthen__ Integer
) ;

CREATE TABLE "Then" (
	__IDThen__ Integer NOT NULL,
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY "Then" (__IDThen__),
	__FKactivity__ Integer
) ;

CREATE TABLE "ElseIf" (
	__IDElseIf__ Integer NOT NULL,
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES "Condition" (__IDCondition__),
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY "ElseIf" (__IDElseIf__),
	__FKactivity__ Integer,
	__FKcondition__ Integer
) ;

CREATE TABLE "Else" (
	__IDElse__ Integer NOT NULL,
	FOREIGN KEY activity (__FKactivity__) REFERENCES Activity (__IDActivity__),
	PRIMARY KEY "Else" (__IDElse__),
	__FKactivity__ Integer
) ;

CREATE TABLE CompletionCondition (
	__IDCompletionCondition__ Integer NOT NULL,
	FOREIGN KEY branches (__FKbranches__) REFERENCES Branches (__IDBranches__),
	PRIMARY KEY CompletionCondition (__IDCompletionCondition__),
	__FKbranches__ Integer
) ;

CREATE TABLE Branches (
	__IDBranches__ Integer NOT NULL,
	countCompletedBranchesOnly text,
	PRIMARY KEY Branches (__IDBranches__)
) ;

CREATE TABLE BPELExtensibleElement (
	__IDBPELExtensibleElement__ Integer NOT NULL,
	FOREIGN KEY documentation (__FKdocumentation__) REFERENCES Documentation (__IDDocumentation__),
	PRIMARY KEY BPELExtensibleElement (__IDBPELExtensibleElement__),
	__FKdocumentation__ Integer
) ;

CREATE TABLE Documentation (
	__IDDocumentation__ Integer NOT NULL,
	lang text,
	source text,
	value text,
	PRIMARY KEY Documentation (__IDDocumentation__)
) ;

CREATE TABLE Iterator (
	__IDIterator__ Integer NOT NULL,
	FOREIGN KEY finalCounterValue (__FKfinalCounterValue__) REFERENCES Expression (__IDExpression__),
	FOREIGN KEY startCounterValue (__FKstartCounterValue__) REFERENCES Expression (__IDExpression__),
	PRIMARY KEY Iterator (__IDIterator__),
	__FKstartCounterValue__ Integer,
	__FKfinalCounterValue__ Integer
) ;

CREATE TABLE Property (
	__IDProperty__ Integer NOT NULL,
	qName text,
	name text,
	type text,
	ID text,
	PRIMARY KEY Property (__IDProperty__)
) ;

CREATE TABLE PropertyAlias (
	__IDPropertyAlias__ Integer NOT NULL,
	messageType text,
	part text,
	propertyName text,
	ID text,
	FOREIGN KEY wsdlPart (__FKwsdlPart__) REFERENCES Part (__IDPart__),
	FOREIGN KEY query (__FKquery__) REFERENCES messagepropertiesQuery (__IDmessagepropertiesQuery__),
	type text,
	XSDElement text,
	PRIMARY KEY PropertyAlias (__IDPropertyAlias__),
	__FKwsdlPart__ Integer,
	__FKquery__ Integer
) ;

CREATE TABLE messagepropertiesQuery (
	__IDmessagepropertiesQuery__ Integer NOT NULL,
	queryLanguage text,
	value text,
	PRIMARY KEY messagepropertiesQuery (__IDmessagepropertiesQuery__)
) ;

CREATE TABLE WSDLElement (
	__IDWSDLElement__ Integer NOT NULL,
	documentationElement text,
	element text,
	PRIMARY KEY WSDLElement (__IDWSDLElement__)
) ;

CREATE TABLE PortType (
	__IDPortType__ Integer NOT NULL,
	qName text,
	undefined text,
	proxy text,
	resourceURI text,
	PRIMARY KEY PortType (__IDPortType__)
) ;

CREATE TABLE Operation (
	__IDOperation__ Integer NOT NULL,
	style text,
	name text,
	undefined text,
	proxy text,
	resourceURI text,
	FOREIGN KEY eInput (__FKeInput__) REFERENCES Input (__IDInput__),
	FOREIGN KEY eOutput (__FKeOutput__) REFERENCES Output (__IDOutput__),
	PRIMARY KEY Operation (__IDOperation__),
	__FKeInput__ Integer,
	__FKeOutput__ Integer
) ;

CREATE TABLE Message (
	__IDMessage__ Integer NOT NULL,
	qName text,
	undefined text,
	proxy text,
	resourceURI text,
	PRIMARY KEY Message (__IDMessage__)
) ;

CREATE TABLE Part (
	__IDPart__ Integer NOT NULL,
	name text,
	elementName text,
	typeName text,
	FOREIGN KEY typeDefinition (__FKtypeDefinition__) REFERENCES XSDTypeDefinition (__IDXSDTypeDefinition__),
	FOREIGN KEY elementDeclaration (__FKelementDeclaration__) REFERENCES XSDElementDeclaration (__IDXSDElementDeclaration__),
	FOREIGN KEY eMessage (__FKeMessage__) REFERENCES Message (__IDMessage__),
	PRIMARY KEY Part (__IDPart__),
	__FKtypeDefinition__ Integer,
	__FKeMessage__ Integer,
	__FKelementDeclaration__ Integer
) ;

CREATE TABLE Binding (
	__IDBinding__ Integer NOT NULL,
	qName text,
	undefined text,
	proxy text,
	resourceURI text,
	FOREIGN KEY ePortType (__FKePortType__) REFERENCES PortType (__IDPortType__),
	PRIMARY KEY Binding (__IDBinding__),
	__FKePortType__ Integer
) ;

CREATE TABLE BindingOperation (
	__IDBindingOperation__ Integer NOT NULL,
	name text,
	FOREIGN KEY eOperation (__FKeOperation__) REFERENCES Operation (__IDOperation__),
	FOREIGN KEY eBindingInput (__FKeBindingInput__) REFERENCES BindingInput (__IDBindingInput__),
	FOREIGN KEY eBindingOutput (__FKeBindingOutput__) REFERENCES BindingOutput (__IDBindingOutput__),
	PRIMARY KEY BindingOperation (__IDBindingOperation__),
	__FKeOperation__ Integer,
	__FKeBindingOutput__ Integer,
	__FKeBindingInput__ Integer
) ;

CREATE TABLE Service (
	__IDService__ Integer NOT NULL,
	qName text,
	undefined text,
	proxy text,
	resourceURI text,
	PRIMARY KEY Service (__IDService__)
) ;

CREATE TABLE Port (
	__IDPort__ Integer NOT NULL,
	name text,
	FOREIGN KEY eBinding (__FKeBinding__) REFERENCES Binding (__IDBinding__),
	PRIMARY KEY Port (__IDPort__),
	__FKeBinding__ Integer
) ;

CREATE TABLE ExtensibilityElement (
	__IDExtensibilityElement__ Integer NOT NULL,
	required text,
	elementType text,
	PRIMARY KEY ExtensibilityElement (__IDExtensibilityElement__)
) ;

CREATE TABLE Definition (
	__IDDefinition__ Integer NOT NULL,
	targetNamespace text,
	location text,
	qName text,
	encoding text,
	FOREIGN KEY eTypes (__FKeTypes__) REFERENCES Types (__IDTypes__),
	PRIMARY KEY Definition (__IDDefinition__),
	__FKeTypes__ Integer
) ;

CREATE TABLE WSDLImport (
	__IDWSDLImport__ Integer NOT NULL,
	namespaceURI text,
	locationURI text,
	FOREIGN KEY eDefinition (__FKeDefinition__) REFERENCES Definition (__IDDefinition__),
	FOREIGN KEY eSchema (__FKeSchema__) REFERENCES XSDSchema (__IDXSDSchema__),
	PRIMARY KEY WSDLImport (__IDWSDLImport__),
	__FKeSchema__ Integer,
	__FKeDefinition__ Integer
) ;

CREATE TABLE WSDLExtensibleElement (
	__IDWSDLExtensibleElement__ Integer NOT NULL,
	PRIMARY KEY WSDLExtensibleElement (__IDWSDLExtensibleElement__)
) ;

CREATE TABLE Input (
	__IDInput__ Integer NOT NULL,
	PRIMARY KEY Input (__IDInput__)
) ;

CREATE TABLE Output (
	__IDOutput__ Integer NOT NULL,
	PRIMARY KEY Output (__IDOutput__)
) ;

CREATE TABLE Fault (
	__IDFault__ Integer NOT NULL,
	PRIMARY KEY Fault (__IDFault__)
) ;

CREATE TABLE BindingInput (
	__IDBindingInput__ Integer NOT NULL,
	name text,
	FOREIGN KEY eInput (__FKeInput__) REFERENCES Input (__IDInput__),
	PRIMARY KEY BindingInput (__IDBindingInput__),
	__FKeInput__ Integer
) ;

CREATE TABLE BindingOutput (
	__IDBindingOutput__ Integer NOT NULL,
	name text,
	FOREIGN KEY eOutput (__FKeOutput__) REFERENCES Output (__IDOutput__),
	PRIMARY KEY BindingOutput (__IDBindingOutput__),
	__FKeOutput__ Integer
) ;

CREATE TABLE BindingFault (
	__IDBindingFault__ Integer NOT NULL,
	name text,
	FOREIGN KEY eFault (__FKeFault__) REFERENCES Fault (__IDFault__),
	PRIMARY KEY BindingFault (__IDBindingFault__),
	__FKeFault__ Integer
) ;

CREATE TABLE Namespace (
	__IDNamespace__ Integer NOT NULL,
	URI text,
	prefix text,
	PRIMARY KEY Namespace (__IDNamespace__)
) ;

CREATE TABLE IPortType (
	__IDIPortType__ Integer NOT NULL,
	PRIMARY KEY IPortType (__IDIPortType__)
) ;

CREATE TABLE IOperation (
	__IDIOperation__ Integer NOT NULL,
	PRIMARY KEY IOperation (__IDIOperation__)
) ;

CREATE TABLE IInput (
	__IDIInput__ Integer NOT NULL,
	PRIMARY KEY IInput (__IDIInput__)
) ;

CREATE TABLE IOutput (
	__IDIOutput__ Integer NOT NULL,
	PRIMARY KEY IOutput (__IDIOutput__)
) ;

CREATE TABLE IFault (
	__IDIFault__ Integer NOT NULL,
	PRIMARY KEY IFault (__IDIFault__)
) ;

CREATE TABLE IMessage (
	__IDIMessage__ Integer NOT NULL,
	PRIMARY KEY IMessage (__IDIMessage__)
) ;

CREATE TABLE IPart (
	__IDIPart__ Integer NOT NULL,
	PRIMARY KEY IPart (__IDIPart__)
) ;

CREATE TABLE IService (
	__IDIService__ Integer NOT NULL,
	PRIMARY KEY IService (__IDIService__)
) ;

CREATE TABLE IPort (
	__IDIPort__ Integer NOT NULL,
	PRIMARY KEY IPort (__IDIPort__)
) ;

CREATE TABLE IBinding (
	__IDIBinding__ Integer NOT NULL,
	PRIMARY KEY IBinding (__IDIBinding__)
) ;

CREATE TABLE IBindingOperation (
	__IDIBindingOperation__ Integer NOT NULL,
	PRIMARY KEY IBindingOperation (__IDIBindingOperation__)
) ;

CREATE TABLE IBindingInput (
	__IDIBindingInput__ Integer NOT NULL,
	PRIMARY KEY IBindingInput (__IDIBindingInput__)
) ;

CREATE TABLE IBindingOutput (
	__IDIBindingOutput__ Integer NOT NULL,
	PRIMARY KEY IBindingOutput (__IDIBindingOutput__)
) ;

CREATE TABLE IBindingFault (
	__IDIBindingFault__ Integer NOT NULL,
	PRIMARY KEY IBindingFault (__IDIBindingFault__)
) ;

CREATE TABLE IExtensibilityElement (
	__IDIExtensibilityElement__ Integer NOT NULL,
	PRIMARY KEY IExtensibilityElement (__IDIExtensibilityElement__)
) ;

CREATE TABLE IDefinition (
	__IDIDefinition__ Integer NOT NULL,
	PRIMARY KEY IDefinition (__IDIDefinition__)
) ;

CREATE TABLE IImport (
	__IDIImport__ Integer NOT NULL,
	PRIMARY KEY IImport (__IDIImport__)
) ;

CREATE TABLE IList (
	__IDIList__ Integer NOT NULL,
	PRIMARY KEY IList (__IDIList__)
) ;

CREATE TABLE IMap (
	__IDIMap__ Integer NOT NULL,
	PRIMARY KEY IMap (__IDIMap__)
) ;

CREATE TABLE IURL (
	__IDIURL__ Integer NOT NULL,
	PRIMARY KEY IURL (__IDIURL__)
) ;

CREATE TABLE IExtensionRegistry (
	__IDIExtensionRegistry__ Integer NOT NULL,
	PRIMARY KEY IExtensionRegistry (__IDIExtensionRegistry__)
) ;

CREATE TABLE Types (
	__IDTypes__ Integer NOT NULL,
	PRIMARY KEY Types (__IDTypes__)
) ;

CREATE TABLE IIterator (
	__IDIIterator__ Integer NOT NULL,
	PRIMARY KEY IIterator (__IDIIterator__)
) ;

CREATE TABLE ITypes (
	__IDITypes__ Integer NOT NULL,
	PRIMARY KEY ITypes (__IDITypes__)
) ;

CREATE TABLE UnknownExtensibilityElement (
	__IDUnknownExtensibilityElement__ Integer NOT NULL,
	PRIMARY KEY UnknownExtensibilityElement (__IDUnknownExtensibilityElement__)
) ;

CREATE TABLE XSDSchemaExtensibilityElement (
	__IDXSDSchemaExtensibilityElement__ Integer NOT NULL,
	FOREIGN KEY "schema" (__FKschema__) REFERENCES XSDSchema (__IDXSDSchema__),
	PRIMARY KEY XSDSchemaExtensibilityElement (__IDXSDSchemaExtensibilityElement__),
	__FKschema__ Integer
) ;

CREATE TABLE MessageReference (
	__IDMessageReference__ Integer NOT NULL,
	name text,
	FOREIGN KEY eMessage (__FKeMessage__) REFERENCES Message (__IDMessage__),
	PRIMARY KEY MessageReference (__IDMessageReference__),
	__FKeMessage__ Integer
) ;

CREATE TABLE PartnerLinkType (
	__IDPartnerLinkType__ Integer NOT NULL,
	name text,
	ID text,
	PRIMARY KEY PartnerLinkType (__IDPartnerLinkType__)
) ;

CREATE TABLE Role (
	__IDRole__ Integer NOT NULL,
	ID text,
	name text,
	portType text,
	PRIMARY KEY Role (__IDRole__)
) ;

CREATE TABLE EObject (
	__IDEObject__ Integer NOT NULL,
	PRIMARY KEY EObject (__IDEObject__)
) ;

CREATE TABLE XSDAnnotation (
	__IDXSDAnnotation__ Integer NOT NULL,
	PRIMARY KEY XSDAnnotation (__IDXSDAnnotation__)
) ;

CREATE TABLE XSDAttributeDeclaration (
	__IDXSDAttributeDeclaration__ Integer NOT NULL,
	attributeDeclarationReference text,
	FOREIGN KEY annotation (__FKannotation__) REFERENCES XSDAnnotation (__IDXSDAnnotation__),
	FOREIGN KEY anonymousTypeDefinition (__FKanonymousTypeDefinition__) REFERENCES XSDSimpleTypeDefinition (__IDXSDSimpleTypeDefinition__),
	FOREIGN KEY typeDefinition (__FKtypeDefinition__) REFERENCES XSDSimpleTypeDefinition (__IDXSDSimpleTypeDefinition__),
	FOREIGN KEY resolvedAttributeDeclaration (__FKresolvedAttributeDeclaration__) REFERENCES XSDAttributeDeclaration (__IDXSDAttributeDeclaration__),
	PRIMARY KEY XSDAttributeDeclaration (__IDXSDAttributeDeclaration__),
	__FKannotation__ Integer,
	__FKtypeDefinition__ Integer,
	__FKresolvedAttributeDeclaration__ Integer,
	__FKanonymousTypeDefinition__ Integer
) ;

CREATE TABLE XSDAttributeGroupContent (
	__IDXSDAttributeGroupContent__ Integer NOT NULL,
	PRIMARY KEY XSDAttributeGroupContent (__IDXSDAttributeGroupContent__)
) ;

CREATE TABLE XSDAttributeGroupDefinition (
	__IDXSDAttributeGroupDefinition__ Integer NOT NULL,
	attributeGroupDefinitionReference text,
	FOREIGN KEY annotation (__FKannotation__) REFERENCES XSDAnnotation (__IDXSDAnnotation__),
	FOREIGN KEY attributeWildcardContent (__FKattributeWildcardContent__) REFERENCES XSDWildcard (__IDXSDWildcard__),
	FOREIGN KEY attributeWildcard (__FKattributeWildcard__) REFERENCES XSDWildcard (__IDXSDWildcard__),
	FOREIGN KEY resolvedAttributeGroupDefinition (__FKresolvedAttributeGroupDefinition__) REFERENCES XSDAttributeGroupDefinition (__IDXSDAttributeGroupDefinition__),
	FOREIGN KEY syntheticWildcard (__FKsyntheticWildcard__) REFERENCES XSDWildcard (__IDXSDWildcard__),
	PRIMARY KEY XSDAttributeGroupDefinition (__IDXSDAttributeGroupDefinition__),
	__FKresolvedAttributeGroupDefinition__ Integer,
	__FKattributeWildcard__ Integer,
	__FKsyntheticWildcard__ Integer,
	__FKannotation__ Integer,
	__FKattributeWildcardContent__ Integer
) ;

CREATE TABLE XSDAttributeUse (
	__IDXSDAttributeUse__ Integer NOT NULL,
	required text,
	value text,
	"constraint" text,
	"use" text,
	lexicalValue text,
	FOREIGN KEY attributeDeclaration (__FKattributeDeclaration__) REFERENCES XSDAttributeDeclaration (__IDXSDAttributeDeclaration__),
	FOREIGN KEY content (__FKcontent__) REFERENCES XSDAttributeDeclaration (__IDXSDAttributeDeclaration__),
	PRIMARY KEY XSDAttributeUse (__IDXSDAttributeUse__),
	__FKattributeDeclaration__ Integer,
	__FKcontent__ Integer
) ;

CREATE TABLE XSDBoundedFacet (
	__IDXSDBoundedFacet__ Integer NOT NULL,
	value text,
	PRIMARY KEY XSDBoundedFacet (__IDXSDBoundedFacet__)
) ;

CREATE TABLE XSDCardinalityFacet (
	__IDXSDCardinalityFacet__ Integer NOT NULL,
	value text,
	PRIMARY KEY XSDCardinalityFacet (__IDXSDCardinalityFacet__)
) ;

CREATE TABLE XSDComplexTypeContent (
	__IDXSDComplexTypeContent__ Integer NOT NULL,
	PRIMARY KEY XSDComplexTypeContent (__IDXSDComplexTypeContent__)
) ;

CREATE TABLE XSDComplexTypeDefinition (
	__IDXSDComplexTypeDefinition__ Integer NOT NULL,
	derivationMethod text,
	abstract text,
	contentTypeCategory text,
	mixed text,
	FOREIGN KEY contentAnnotation (__FKcontentAnnotation__) REFERENCES XSDAnnotation (__IDXSDAnnotation__),
	FOREIGN KEY baseTypeDefinition (__FKbaseTypeDefinition__) REFERENCES XSDTypeDefinition (__IDXSDTypeDefinition__),
	FOREIGN KEY content (__FKcontent__) REFERENCES XSDComplexTypeContent (__IDXSDComplexTypeContent__),
	FOREIGN KEY contentType (__FKcontentType__) REFERENCES XSDComplexTypeContent (__IDXSDComplexTypeContent__),
	FOREIGN KEY attributeWildcard (__FKattributeWildcard__) REFERENCES XSDWildcard (__IDXSDWildcard__),
	FOREIGN KEY attributeWildcardContent (__FKattributeWildcardContent__) REFERENCES XSDWildcard (__IDXSDWildcard__),
	FOREIGN KEY rootTypeDefinition (__FKrootTypeDefinition__) REFERENCES XSDTypeDefinition (__IDXSDTypeDefinition__),
	FOREIGN KEY syntheticParticle (__FKsyntheticParticle__) REFERENCES XSDParticle (__IDXSDParticle__),
	FOREIGN KEY syntheticWildcard (__FKsyntheticWildcard__) REFERENCES XSDWildcard (__IDXSDWildcard__),
	PRIMARY KEY XSDComplexTypeDefinition (__IDXSDComplexTypeDefinition__),
	__FKattributeWildcard__ Integer,
	__FKrootTypeDefinition__ Integer,
	__FKcontent__ Integer,
	__FKsyntheticParticle__ Integer,
	__FKcontentType__ Integer,
	__FKbaseTypeDefinition__ Integer,
	__FKsyntheticWildcard__ Integer,
	__FKattributeWildcardContent__ Integer,
	__FKcontentAnnotation__ Integer
) ;

CREATE TABLE XSDComponent (
	__IDXSDComponent__ Integer NOT NULL,
	PRIMARY KEY XSDComponent (__IDXSDComponent__)
) ;

CREATE TABLE XSDConcreteComponent (
	__IDXSDConcreteComponent__ Integer NOT NULL,
	element text,
	FOREIGN KEY container (__FKcontainer__) REFERENCES XSDConcreteComponent (__IDXSDConcreteComponent__),
	FOREIGN KEY rootContainer (__FKrootContainer__) REFERENCES XSDConcreteComponent (__IDXSDConcreteComponent__),
	FOREIGN KEY "schema" (__FKschema__) REFERENCES XSDSchema (__IDXSDSchema__),
	PRIMARY KEY XSDConcreteComponent (__IDXSDConcreteComponent__),
	__FKrootContainer__ Integer,
	__FKschema__ Integer,
	__FKcontainer__ Integer
) ;

CREATE TABLE XSDConstrainingFacet (
	__IDXSDConstrainingFacet__ Integer NOT NULL,
	PRIMARY KEY XSDConstrainingFacet (__IDXSDConstrainingFacet__)
) ;

CREATE TABLE XSDDiagnostic (
	__IDXSDDiagnostic__ Integer NOT NULL,
	severity text,
	message text,
	locationURI text,
	line text,
	"column" text,
	node text,
	annotationURI text,
	"key" text,
	FOREIGN KEY primaryComponent (__FKprimaryComponent__) REFERENCES XSDConcreteComponent (__IDXSDConcreteComponent__),
	PRIMARY KEY XSDDiagnostic (__IDXSDDiagnostic__),
	__FKprimaryComponent__ Integer
) ;

CREATE TABLE XSDElementDeclaration (
	__IDXSDElementDeclaration__ Integer NOT NULL,
	nillable text,
	abstract text,
	elementDeclarationReference text,
	circular text,
	FOREIGN KEY annotation (__FKannotation__) REFERENCES XSDAnnotation (__IDXSDAnnotation__),
	FOREIGN KEY anonymousTypeDefinition (__FKanonymousTypeDefinition__) REFERENCES XSDTypeDefinition (__IDXSDTypeDefinition__),
	FOREIGN KEY typeDefinition (__FKtypeDefinition__) REFERENCES XSDTypeDefinition (__IDXSDTypeDefinition__),
	FOREIGN KEY resolvedElementDeclaration (__FKresolvedElementDeclaration__) REFERENCES XSDElementDeclaration (__IDXSDElementDeclaration__),
	FOREIGN KEY substitutionGroupAffiliation (__FKsubstitutionGroupAffiliation__) REFERENCES XSDElementDeclaration (__IDXSDElementDeclaration__),
	PRIMARY KEY XSDElementDeclaration (__IDXSDElementDeclaration__),
	__FKanonymousTypeDefinition__ Integer,
	__FKsubstitutionGroupAffiliation__ Integer,
	__FKannotation__ Integer,
	__FKresolvedElementDeclaration__ Integer,
	__FKtypeDefinition__ Integer
) ;

CREATE TABLE XSDEnumerationFacet (
	__IDXSDEnumerationFacet__ Integer NOT NULL,
	PRIMARY KEY XSDEnumerationFacet (__IDXSDEnumerationFacet__)
) ;

CREATE TABLE XSDFacet (
	__IDXSDFacet__ Integer NOT NULL,
	lexicalValue text,
	facetName text,
	effectiveValue text,
	FOREIGN KEY annotation (__FKannotation__) REFERENCES XSDAnnotation (__IDXSDAnnotation__),
	FOREIGN KEY simpleTypeDefinition (__FKsimpleTypeDefinition__) REFERENCES XSDSimpleTypeDefinition (__IDXSDSimpleTypeDefinition__),
	PRIMARY KEY XSDFacet (__IDXSDFacet__),
	__FKannotation__ Integer,
	__FKsimpleTypeDefinition__ Integer
) ;

CREATE TABLE XSDFeature (
	__IDXSDFeature__ Integer NOT NULL,
	value text,
	"constraint" text,
	form text,
	lexicalValue text,
	global text,
	featureReference text,
	FOREIGN KEY scope (__FKscope__) REFERENCES XSDScope (__IDXSDScope__),
	FOREIGN KEY resolvedFeature (__FKresolvedFeature__) REFERENCES XSDFeature (__IDXSDFeature__),
	FOREIGN KEY type (__FKtype__) REFERENCES XSDTypeDefinition (__IDXSDTypeDefinition__),
	PRIMARY KEY XSDFeature (__IDXSDFeature__),
	__FKscope__ Integer,
	__FKresolvedFeature__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE XSDFixedFacet (
	__IDXSDFixedFacet__ Integer NOT NULL,
	fixed text,
	PRIMARY KEY XSDFixedFacet (__IDXSDFixedFacet__)
) ;

CREATE TABLE XSDFractionDigitsFacet (
	__IDXSDFractionDigitsFacet__ Integer NOT NULL,
	value text,
	PRIMARY KEY XSDFractionDigitsFacet (__IDXSDFractionDigitsFacet__)
) ;

CREATE TABLE XSDFundamentalFacet (
	__IDXSDFundamentalFacet__ Integer NOT NULL,
	PRIMARY KEY XSDFundamentalFacet (__IDXSDFundamentalFacet__)
) ;

CREATE TABLE XSDIdentityConstraintDefinition (
	__IDXSDIdentityConstraintDefinition__ Integer NOT NULL,
	identityConstraintCategory text,
	FOREIGN KEY annotation (__FKannotation__) REFERENCES XSDAnnotation (__IDXSDAnnotation__),
	FOREIGN KEY referencedKey (__FKreferencedKey__) REFERENCES XSDIdentityConstraintDefinition (__IDXSDIdentityConstraintDefinition__),
	FOREIGN KEY selector (__FKselector__) REFERENCES XSDXPathDefinition (__IDXSDXPathDefinition__),
	PRIMARY KEY XSDIdentityConstraintDefinition (__IDXSDIdentityConstraintDefinition__),
	__FKreferencedKey__ Integer,
	__FKannotation__ Integer,
	__FKselector__ Integer
) ;

CREATE TABLE XSDImport (
	__IDXSDImport__ Integer NOT NULL,
	namespace text,
	FOREIGN KEY annotation (__FKannotation__) REFERENCES XSDAnnotation (__IDXSDAnnotation__),
	PRIMARY KEY XSDImport (__IDXSDImport__),
	__FKannotation__ Integer
) ;

CREATE TABLE XSDInclude (
	__IDXSDInclude__ Integer NOT NULL,
	FOREIGN KEY annotation (__FKannotation__) REFERENCES XSDAnnotation (__IDXSDAnnotation__),
	PRIMARY KEY XSDInclude (__IDXSDInclude__),
	__FKannotation__ Integer
) ;

CREATE TABLE XSDLengthFacet (
	__IDXSDLengthFacet__ Integer NOT NULL,
	value text,
	PRIMARY KEY XSDLengthFacet (__IDXSDLengthFacet__)
) ;

CREATE TABLE XSDMaxExclusiveFacet (
	__IDXSDMaxExclusiveFacet__ Integer NOT NULL,
	PRIMARY KEY XSDMaxExclusiveFacet (__IDXSDMaxExclusiveFacet__)
) ;

CREATE TABLE XSDMaxFacet (
	__IDXSDMaxFacet__ Integer NOT NULL,
	value text,
	inclusive text,
	exclusive text,
	PRIMARY KEY XSDMaxFacet (__IDXSDMaxFacet__)
) ;

CREATE TABLE XSDMaxInclusiveFacet (
	__IDXSDMaxInclusiveFacet__ Integer NOT NULL,
	PRIMARY KEY XSDMaxInclusiveFacet (__IDXSDMaxInclusiveFacet__)
) ;

CREATE TABLE XSDMaxLengthFacet (
	__IDXSDMaxLengthFacet__ Integer NOT NULL,
	value text,
	PRIMARY KEY XSDMaxLengthFacet (__IDXSDMaxLengthFacet__)
) ;

CREATE TABLE XSDMinExclusiveFacet (
	__IDXSDMinExclusiveFacet__ Integer NOT NULL,
	PRIMARY KEY XSDMinExclusiveFacet (__IDXSDMinExclusiveFacet__)
) ;

CREATE TABLE XSDMinFacet (
	__IDXSDMinFacet__ Integer NOT NULL,
	value text,
	inclusive text,
	exclusive text,
	PRIMARY KEY XSDMinFacet (__IDXSDMinFacet__)
) ;

CREATE TABLE XSDMinInclusiveFacet (
	__IDXSDMinInclusiveFacet__ Integer NOT NULL,
	PRIMARY KEY XSDMinInclusiveFacet (__IDXSDMinInclusiveFacet__)
) ;

CREATE TABLE XSDMinLengthFacet (
	__IDXSDMinLengthFacet__ Integer NOT NULL,
	value text,
	PRIMARY KEY XSDMinLengthFacet (__IDXSDMinLengthFacet__)
) ;

CREATE TABLE XSDModelGroup (
	__IDXSDModelGroup__ Integer NOT NULL,
	compositor text,
	FOREIGN KEY annotation (__FKannotation__) REFERENCES XSDAnnotation (__IDXSDAnnotation__),
	PRIMARY KEY XSDModelGroup (__IDXSDModelGroup__),
	__FKannotation__ Integer
) ;

CREATE TABLE XSDModelGroupDefinition (
	__IDXSDModelGroupDefinition__ Integer NOT NULL,
	modelGroupDefinitionReference text,
	FOREIGN KEY annotation (__FKannotation__) REFERENCES XSDAnnotation (__IDXSDAnnotation__),
	FOREIGN KEY modelGroup (__FKmodelGroup__) REFERENCES XSDModelGroup (__IDXSDModelGroup__),
	FOREIGN KEY resolvedModelGroupDefinition (__FKresolvedModelGroupDefinition__) REFERENCES XSDModelGroupDefinition (__IDXSDModelGroupDefinition__),
	PRIMARY KEY XSDModelGroupDefinition (__IDXSDModelGroupDefinition__),
	__FKmodelGroup__ Integer,
	__FKresolvedModelGroupDefinition__ Integer,
	__FKannotation__ Integer
) ;

CREATE TABLE XSDNamedComponent (
	__IDXSDNamedComponent__ Integer NOT NULL,
	name text,
	targetNamespace text,
	aliasName text,
	uRI text,
	aliasURI text,
	qName text,
	PRIMARY KEY XSDNamedComponent (__IDXSDNamedComponent__)
) ;

CREATE TABLE XSDNotationDeclaration (
	__IDXSDNotationDeclaration__ Integer NOT NULL,
	systemIdentifier text,
	publicIdentifier text,
	FOREIGN KEY annotation (__FKannotation__) REFERENCES XSDAnnotation (__IDXSDAnnotation__),
	PRIMARY KEY XSDNotationDeclaration (__IDXSDNotationDeclaration__),
	__FKannotation__ Integer
) ;

CREATE TABLE XSDNumericFacet (
	__IDXSDNumericFacet__ Integer NOT NULL,
	value text,
	PRIMARY KEY XSDNumericFacet (__IDXSDNumericFacet__)
) ;

CREATE TABLE XSDOrderedFacet (
	__IDXSDOrderedFacet__ Integer NOT NULL,
	value text,
	PRIMARY KEY XSDOrderedFacet (__IDXSDOrderedFacet__)
) ;

CREATE TABLE XSDParticle (
	__IDXSDParticle__ Integer NOT NULL,
	minOccurs text,
	maxOccurs text,
	FOREIGN KEY content (__FKcontent__) REFERENCES XSDParticleContent (__IDXSDParticleContent__),
	FOREIGN KEY term (__FKterm__) REFERENCES XSDTerm (__IDXSDTerm__),
	PRIMARY KEY XSDParticle (__IDXSDParticle__),
	__FKterm__ Integer,
	__FKcontent__ Integer
) ;

CREATE TABLE XSDParticleContent (
	__IDXSDParticleContent__ Integer NOT NULL,
	PRIMARY KEY XSDParticleContent (__IDXSDParticleContent__)
) ;

CREATE TABLE XSDPatternFacet (
	__IDXSDPatternFacet__ Integer NOT NULL,
	PRIMARY KEY XSDPatternFacet (__IDXSDPatternFacet__)
) ;

CREATE TABLE XSDRedefinableComponent (
	__IDXSDRedefinableComponent__ Integer NOT NULL,
	circular text,
	PRIMARY KEY XSDRedefinableComponent (__IDXSDRedefinableComponent__)
) ;

CREATE TABLE XSDRedefineContent (
	__IDXSDRedefineContent__ Integer NOT NULL,
	PRIMARY KEY XSDRedefineContent (__IDXSDRedefineContent__)
) ;

CREATE TABLE XSDRedefine (
	__IDXSDRedefine__ Integer NOT NULL,
	PRIMARY KEY XSDRedefine (__IDXSDRedefine__)
) ;

CREATE TABLE XSDRepeatableFacet (
	__IDXSDRepeatableFacet__ Integer NOT NULL,
	PRIMARY KEY XSDRepeatableFacet (__IDXSDRepeatableFacet__)
) ;

CREATE TABLE XSDSchema (
	__IDXSDSchema__ Integer NOT NULL,
	document text,
	schemaLocation text,
	targetNamespace text,
	attributeFormDefault text,
	elementFormDefault text,
	version text,
	FOREIGN KEY rootVersion (__FKrootVersion__) REFERENCES XSDSchema (__IDXSDSchema__),
	FOREIGN KEY originalVersion (__FKoriginalVersion__) REFERENCES XSDSchema (__IDXSDSchema__),
	FOREIGN KEY schemaForSchema (__FKschemaForSchema__) REFERENCES XSDSchema (__IDXSDSchema__),
	PRIMARY KEY XSDSchema (__IDXSDSchema__),
	__FKschemaForSchema__ Integer,
	__FKoriginalVersion__ Integer,
	__FKrootVersion__ Integer
) ;

CREATE TABLE XSDSchemaCompositor (
	__IDXSDSchemaCompositor__ Integer NOT NULL,
	FOREIGN KEY incorporatedSchema (__FKincorporatedSchema__) REFERENCES XSDSchema (__IDXSDSchema__),
	PRIMARY KEY XSDSchemaCompositor (__IDXSDSchemaCompositor__),
	__FKincorporatedSchema__ Integer
) ;

CREATE TABLE XSDSchemaContent (
	__IDXSDSchemaContent__ Integer NOT NULL,
	PRIMARY KEY XSDSchemaContent (__IDXSDSchemaContent__)
) ;

CREATE TABLE XSDSchemaDirective (
	__IDXSDSchemaDirective__ Integer NOT NULL,
	schemaLocation text,
	FOREIGN KEY resolvedSchema (__FKresolvedSchema__) REFERENCES XSDSchema (__IDXSDSchema__),
	PRIMARY KEY XSDSchemaDirective (__IDXSDSchemaDirective__),
	__FKresolvedSchema__ Integer
) ;

CREATE TABLE XSDScope (
	__IDXSDScope__ Integer NOT NULL,
	PRIMARY KEY XSDScope (__IDXSDScope__)
) ;

CREATE TABLE XSDSimpleTypeDefinition (
	__IDXSDSimpleTypeDefinition__ Integer NOT NULL,
	variety text,
	FOREIGN KEY baseTypeDefinition (__FKbaseTypeDefinition__) REFERENCES XSDSimpleTypeDefinition (__IDXSDSimpleTypeDefinition__),
	FOREIGN KEY primitiveTypeDefinition (__FKprimitiveTypeDefinition__) REFERENCES XSDSimpleTypeDefinition (__IDXSDSimpleTypeDefinition__),
	FOREIGN KEY itemTypeDefinition (__FKitemTypeDefinition__) REFERENCES XSDSimpleTypeDefinition (__IDXSDSimpleTypeDefinition__),
	FOREIGN KEY rootTypeDefinition (__FKrootTypeDefinition__) REFERENCES XSDSimpleTypeDefinition (__IDXSDSimpleTypeDefinition__),
	FOREIGN KEY minFacet (__FKminFacet__) REFERENCES XSDMinFacet (__IDXSDMinFacet__),
	FOREIGN KEY maxFacet (__FKmaxFacet__) REFERENCES XSDMaxFacet (__IDXSDMaxFacet__),
	FOREIGN KEY maxInclusiveFacet (__FKmaxInclusiveFacet__) REFERENCES XSDMaxInclusiveFacet (__IDXSDMaxInclusiveFacet__),
	FOREIGN KEY minInclusiveFacet (__FKminInclusiveFacet__) REFERENCES XSDMinInclusiveFacet (__IDXSDMinInclusiveFacet__),
	FOREIGN KEY minExclusiveFacet (__FKminExclusiveFacet__) REFERENCES XSDMinExclusiveFacet (__IDXSDMinExclusiveFacet__),
	FOREIGN KEY maxExclusiveFacet (__FKmaxExclusiveFacet__) REFERENCES XSDMaxExclusiveFacet (__IDXSDMaxExclusiveFacet__),
	FOREIGN KEY lengthFacet (__FKlengthFacet__) REFERENCES XSDLengthFacet (__IDXSDLengthFacet__),
	FOREIGN KEY whiteSpaceFacet (__FKwhiteSpaceFacet__) REFERENCES XSDWhiteSpaceFacet (__IDXSDWhiteSpaceFacet__),
	FOREIGN KEY cardinalityFacet (__FKcardinalityFacet__) REFERENCES XSDCardinalityFacet (__IDXSDCardinalityFacet__),
	FOREIGN KEY numericFacet (__FKnumericFacet__) REFERENCES XSDNumericFacet (__IDXSDNumericFacet__),
	FOREIGN KEY maxLengthFacet (__FKmaxLengthFacet__) REFERENCES XSDMaxLengthFacet (__IDXSDMaxLengthFacet__),
	FOREIGN KEY minLengthFacet (__FKminLengthFacet__) REFERENCES XSDMinLengthFacet (__IDXSDMinLengthFacet__),
	FOREIGN KEY totalDigitsFacet (__FKtotalDigitsFacet__) REFERENCES XSDTotalDigitsFacet (__IDXSDTotalDigitsFacet__),
	FOREIGN KEY fractionDigitsFacet (__FKfractionDigitsFacet__) REFERENCES XSDFractionDigitsFacet (__IDXSDFractionDigitsFacet__),
	FOREIGN KEY orderedFacet (__FKorderedFacet__) REFERENCES XSDOrderedFacet (__IDXSDOrderedFacet__),
	FOREIGN KEY boundedFacet (__FKboundedFacet__) REFERENCES XSDBoundedFacet (__IDXSDBoundedFacet__),
	FOREIGN KEY effectiveMaxFacet (__FKeffectiveMaxFacet__) REFERENCES XSDMaxFacet (__IDXSDMaxFacet__),
	FOREIGN KEY effectiveWhiteSpaceFacet (__FKeffectiveWhiteSpaceFacet__) REFERENCES XSDWhiteSpaceFacet (__IDXSDWhiteSpaceFacet__),
	FOREIGN KEY effectiveMaxLengthFacet (__FKeffectiveMaxLengthFacet__) REFERENCES XSDMaxLengthFacet (__IDXSDMaxLengthFacet__),
	FOREIGN KEY effectiveFractionDigitsFacet (__FKeffectiveFractionDigitsFacet__) REFERENCES XSDFractionDigitsFacet (__IDXSDFractionDigitsFacet__),
	FOREIGN KEY effectivePatternFacet (__FKeffectivePatternFacet__) REFERENCES XSDPatternFacet (__IDXSDPatternFacet__),
	FOREIGN KEY effectiveEnumerationFacet (__FKeffectiveEnumerationFacet__) REFERENCES XSDEnumerationFacet (__IDXSDEnumerationFacet__),
	FOREIGN KEY effectiveTotalDigitsFacet (__FKeffectiveTotalDigitsFacet__) REFERENCES XSDTotalDigitsFacet (__IDXSDTotalDigitsFacet__),
	FOREIGN KEY effectiveMinLengthFacet (__FKeffectiveMinLengthFacet__) REFERENCES XSDMinLengthFacet (__IDXSDMinLengthFacet__),
	FOREIGN KEY effectiveLengthFacet (__FKeffectiveLengthFacet__) REFERENCES XSDLengthFacet (__IDXSDLengthFacet__),
	FOREIGN KEY effectiveMinFacet (__FKeffectiveMinFacet__) REFERENCES XSDMinFacet (__IDXSDMinFacet__),
	PRIMARY KEY XSDSimpleTypeDefinition (__IDXSDSimpleTypeDefinition__),
	__FKminLengthFacet__ Integer,
	__FKnumericFacet__ Integer,
	__FKeffectiveTotalDigitsFacet__ Integer,
	__FKeffectiveEnumerationFacet__ Integer,
	__FKmaxInclusiveFacet__ Integer,
	__FKeffectiveMaxLengthFacet__ Integer,
	__FKlengthFacet__ Integer,
	__FKmaxFacet__ Integer,
	__FKeffectivePatternFacet__ Integer,
	__FKminInclusiveFacet__ Integer,
	__FKmaxLengthFacet__ Integer,
	__FKbaseTypeDefinition__ Integer,
	__FKboundedFacet__ Integer,
	__FKwhiteSpaceFacet__ Integer,
	__FKeffectiveMinLengthFacet__ Integer,
	__FKminFacet__ Integer,
	__FKeffectiveMaxFacet__ Integer,
	__FKcardinalityFacet__ Integer,
	__FKeffectiveFractionDigitsFacet__ Integer,
	__FKeffectiveMinFacet__ Integer,
	__FKeffectiveWhiteSpaceFacet__ Integer,
	__FKprimitiveTypeDefinition__ Integer,
	__FKorderedFacet__ Integer,
	__FKminExclusiveFacet__ Integer,
	__FKfractionDigitsFacet__ Integer,
	__FKmaxExclusiveFacet__ Integer,
	__FKitemTypeDefinition__ Integer,
	__FKeffectiveLengthFacet__ Integer,
	__FKtotalDigitsFacet__ Integer,
	__FKrootTypeDefinition__ Integer
) ;

CREATE TABLE XSDTerm (
	__IDXSDTerm__ Integer NOT NULL,
	PRIMARY KEY XSDTerm (__IDXSDTerm__)
) ;

CREATE TABLE XSDTotalDigitsFacet (
	__IDXSDTotalDigitsFacet__ Integer NOT NULL,
	value text,
	PRIMARY KEY XSDTotalDigitsFacet (__IDXSDTotalDigitsFacet__)
) ;

CREATE TABLE XSDTypeDefinition (
	__IDXSDTypeDefinition__ Integer NOT NULL,
	FOREIGN KEY annotation (__FKannotation__) REFERENCES XSDAnnotation (__IDXSDAnnotation__),
	FOREIGN KEY derivationAnnotation (__FKderivationAnnotation__) REFERENCES XSDAnnotation (__IDXSDAnnotation__),
	FOREIGN KEY rootType (__FKrootType__) REFERENCES XSDTypeDefinition (__IDXSDTypeDefinition__),
	FOREIGN KEY baseType (__FKbaseType__) REFERENCES XSDTypeDefinition (__IDXSDTypeDefinition__),
	FOREIGN KEY simpleType (__FKsimpleType__) REFERENCES XSDSimpleTypeDefinition (__IDXSDSimpleTypeDefinition__),
	FOREIGN KEY complexType (__FKcomplexType__) REFERENCES XSDParticle (__IDXSDParticle__),
	PRIMARY KEY XSDTypeDefinition (__IDXSDTypeDefinition__),
	__FKrootType__ Integer,
	__FKderivationAnnotation__ Integer,
	__FKsimpleType__ Integer,
	__FKbaseType__ Integer,
	__FKcomplexType__ Integer,
	__FKannotation__ Integer
) ;

CREATE TABLE XSDWhiteSpaceFacet (
	__IDXSDWhiteSpaceFacet__ Integer NOT NULL,
	value text,
	PRIMARY KEY XSDWhiteSpaceFacet (__IDXSDWhiteSpaceFacet__)
) ;

CREATE TABLE XSDWildcard (
	__IDXSDWildcard__ Integer NOT NULL,
	namespaceConstraintCategory text,
	processContents text,
	FOREIGN KEY annotation (__FKannotation__) REFERENCES XSDAnnotation (__IDXSDAnnotation__),
	PRIMARY KEY XSDWildcard (__IDXSDWildcard__),
	__FKannotation__ Integer
) ;

CREATE TABLE XSDXPathDefinition (
	__IDXSDXPathDefinition__ Integer NOT NULL,
	variety text,
	value text,
	FOREIGN KEY annotation (__FKannotation__) REFERENCES XSDAnnotation (__IDXSDAnnotation__),
	PRIMARY KEY XSDXPathDefinition (__IDXSDXPathDefinition__),
	__FKannotation__ Integer
) ;

CREATE TABLE Definition_eServices_Service (
	__IDDefinition__ Integer NOT NULL,
	__IDService__ Integer NOT NULL
) ;

CREATE TABLE XSDSimpleTypeDefinition_syntheticFacets_XSDFacet (
	__IDXSDSimpleTypeDefinition__ Integer NOT NULL,
	__IDXSDFacet__ Integer NOT NULL
) ;

CREATE TABLE XSDSimpleTypeDefinition_contents_XSDSimpleTypeDefinition (
	__IDXSDSimpleTypeDefinition__ Integer NOT NULL,
	__IDXSDSimpleTypeDefinition__ Integer NOT NULL
) ;

CREATE TABLE EventHandler_alarm_OnAlarm (
	__IDEventHandler__ Integer NOT NULL,
	__IDOnAlarm__ Integer NOT NULL
) ;

CREATE TABLE BindingOperation_eBindingFaults_BindingFault (
	__IDBindingOperation__ Integer NOT NULL,
	__IDBindingFault__ Integer NOT NULL
) ;

CREATE TABLE WSDLExtensibleElement_eExtensibilityElements_ExtensibilityElement (
	__IDWSDLExtensibleElement__ Integer NOT NULL,
	__IDExtensibilityElement__ Integer NOT NULL
) ;

CREATE TABLE Targets_children_Target (
	__IDTargets__ Integer NOT NULL,
	__IDTarget__ Integer NOT NULL
) ;

CREATE TABLE XSDSchema_allDiagnostics_XSDDiagnostic (
	__IDXSDSchema__ Integer NOT NULL,
	__IDXSDDiagnostic__ Integer NOT NULL
) ;

CREATE TABLE UnknownExtensibilityElement_children_UnknownExtensibilityElement (
	__IDUnknownExtensibilityElement__ Integer NOT NULL,
	__IDUnknownExtensibilityElement__ Integer NOT NULL
) ;

CREATE TABLE CorrelationSets_children_CorrelationSet (
	__IDCorrelationSets__ Integer NOT NULL,
	__IDCorrelationSet__ Integer NOT NULL
) ;

CREATE TABLE Assign_copy_Copy (
	__IDAssign__ Integer NOT NULL,
	__IDCopy__ Integer NOT NULL
) ;

CREATE TABLE PartnerLinks_children_PartnerLink (
	__IDPartnerLinks__ Integer NOT NULL,
	__IDPartnerLink__ Integer NOT NULL
) ;

CREATE TABLE XSDTypeDefinition_annotations_XSDAnnotation (
	__IDXSDTypeDefinition__ Integer NOT NULL,
	__IDXSDAnnotation__ Integer NOT NULL
) ;

CREATE TABLE Receive_fromPart_FromPart (
	__IDReceive__ Integer NOT NULL,
	__IDFromPart__ Integer NOT NULL
) ;

CREATE TABLE Link_sources_Source (
	__IDLink__ Integer NOT NULL,
	__IDSource__ Integer NOT NULL
) ;

CREATE TABLE XSDAttributeGroupDefinition_contents_XSDAttributeGroupContent (
	__IDXSDAttributeGroupDefinition__ Integer NOT NULL,
	__IDXSDAttributeGroupContent__ Integer NOT NULL
) ;

CREATE TABLE XSDConcreteComponent_diagnostics_XSDDiagnostic (
	__IDXSDConcreteComponent__ Integer NOT NULL,
	__IDXSDDiagnostic__ Integer NOT NULL
) ;

CREATE TABLE Message_eParts_Part (
	__IDMessage__ Integer NOT NULL,
	__IDPart__ Integer NOT NULL
) ;

CREATE TABLE Invoke_toPart_ToPart (
	__IDInvoke__ Integer NOT NULL,
	__IDToPart__ Integer NOT NULL
) ;

CREATE TABLE Flow_activities_Activity (
	__IDFlow__ Integer NOT NULL,
	__IDActivity__ Integer NOT NULL
) ;

CREATE TABLE XSDSimpleTypeDefinition_patternFacets_XSDPatternFacet (
	__IDXSDSimpleTypeDefinition__ Integer NOT NULL,
	__IDXSDPatternFacet__ Integer NOT NULL
) ;

CREATE TABLE XSDElementDeclaration_substitutionGroup_XSDElementDeclaration (
	__IDXSDElementDeclaration__ Integer NOT NULL,
	__IDXSDElementDeclaration__ Integer NOT NULL
) ;

CREATE TABLE If_elseIf_ElseIf (
	__IDIf__ Integer NOT NULL,
	__IDElseIf__ Integer NOT NULL
) ;

CREATE TABLE Binding_eBindingOperations_BindingOperation (
	__IDBinding__ Integer NOT NULL,
	__IDBindingOperation__ Integer NOT NULL
) ;

CREATE TABLE EventHandler_events_OnEvent (
	__IDEventHandler__ Integer NOT NULL,
	__IDOnEvent__ Integer NOT NULL
) ;

CREATE TABLE XSDSchema_contents_XSDSchemaContent (
	__IDXSDSchema__ Integer NOT NULL,
	__IDXSDSchemaContent__ Integer NOT NULL
) ;

CREATE TABLE Pick_messages_OnMessage (
	__IDPick__ Integer NOT NULL,
	__IDOnMessage__ Integer NOT NULL
) ;

CREATE TABLE Definition_eMessages_Message (
	__IDDefinition__ Integer NOT NULL,
	__IDMessage__ Integer NOT NULL
) ;

CREATE TABLE XSDModelGroup_particles_XSDParticle (
	__IDXSDModelGroup__ Integer NOT NULL,
	__IDXSDParticle__ Integer NOT NULL
) ;

CREATE TABLE XSDComplexTypeDefinition_attributeUses_XSDAttributeUse (
	__IDXSDComplexTypeDefinition__ Integer NOT NULL,
	__IDXSDAttributeUse__ Integer NOT NULL
) ;

CREATE TABLE OnMessage_fromPart_FromPart (
	__IDOnMessage__ Integer NOT NULL,
	__IDFromPart__ Integer NOT NULL
) ;

CREATE TABLE XSDModelGroup_contents_XSDParticle (
	__IDXSDModelGroup__ Integer NOT NULL,
	__IDXSDParticle__ Integer NOT NULL
) ;

CREATE TABLE XSDSimpleTypeDefinition_memberTypeDefinitions_XSDSimpleTypeDefinition (
	__IDXSDSimpleTypeDefinition__ Integer NOT NULL,
	__IDXSDSimpleTypeDefinition__ Integer NOT NULL
) ;

CREATE TABLE XSDSchema_typeDefinitions_XSDTypeDefinition (
	__IDXSDSchema__ Integer NOT NULL,
	__IDXSDTypeDefinition__ Integer NOT NULL
) ;

CREATE TABLE XSDSchema_annotations_XSDAnnotation (
	__IDXSDSchema__ Integer NOT NULL,
	__IDXSDAnnotation__ Integer NOT NULL
) ;

CREATE TABLE Invoke_fromPart_FromPart (
	__IDInvoke__ Integer NOT NULL,
	__IDFromPart__ Integer NOT NULL
) ;

CREATE TABLE Correlations_children_Correlation (
	__IDCorrelations__ Integer NOT NULL,
	__IDCorrelation__ Integer NOT NULL
) ;

CREATE TABLE Extensions_children_Extension (
	__IDExtensions__ Integer NOT NULL,
	__IDExtension__ Integer NOT NULL
) ;

CREATE TABLE XSDSchema_identityConstraintDefinitions_XSDIdentityConstraintDefinition (
	__IDXSDSchema__ Integer NOT NULL,
	__IDXSDIdentityConstraintDefinition__ Integer NOT NULL
) ;

CREATE TABLE XSDRedefine_annotations_XSDAnnotation (
	__IDXSDRedefine__ Integer NOT NULL,
	__IDXSDAnnotation__ Integer NOT NULL
) ;

CREATE TABLE Operation_eParameterOrdering_Part (
	__IDOperation__ Integer NOT NULL,
	__IDPart__ Integer NOT NULL
) ;

CREATE TABLE Process_imports_BPELImport (
	__IDProcess__ Integer NOT NULL,
	__IDBPELImport__ Integer NOT NULL
) ;

CREATE TABLE Service_ePorts_Port (
	__IDService__ Integer NOT NULL,
	__IDPort__ Integer NOT NULL
) ;

CREATE TABLE PortType_eOperations_Operation (
	__IDPortType__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE Pick_alarm_OnAlarm (
	__IDPick__ Integer NOT NULL,
	__IDOnAlarm__ Integer NOT NULL
) ;

CREATE TABLE XSDSimpleTypeDefinition_fundamentalFacets_XSDFundamentalFacet (
	__IDXSDSimpleTypeDefinition__ Integer NOT NULL,
	__IDXSDFundamentalFacet__ Integer NOT NULL
) ;

CREATE TABLE Definition_eImports_WSDLImport (
	__IDDefinition__ Integer NOT NULL,
	__IDWSDLImport__ Integer NOT NULL
) ;

CREATE TABLE Sequence_activities_Activity (
	__IDSequence__ Integer NOT NULL,
	__IDActivity__ Integer NOT NULL
) ;

CREATE TABLE XSDSchema_incorporatedVersions_XSDSchema (
	__IDXSDSchema__ Integer NOT NULL,
	__IDXSDSchema__ Integer NOT NULL
) ;

CREATE TABLE Operation_eFaults_Fault (
	__IDOperation__ Integer NOT NULL,
	__IDFault__ Integer NOT NULL
) ;

CREATE TABLE XSDSchema_modelGroupDefinitions_XSDModelGroupDefinition (
	__IDXSDSchema__ Integer NOT NULL,
	__IDXSDModelGroupDefinition__ Integer NOT NULL
) ;

CREATE TABLE PartnerLinkType_role_Role (
	__IDPartnerLinkType__ Integer NOT NULL,
	__IDRole__ Integer NOT NULL
) ;

CREATE TABLE XSDSimpleTypeDefinition_enumerationFacets_XSDEnumerationFacet (
	__IDXSDSimpleTypeDefinition__ Integer NOT NULL,
	__IDXSDEnumerationFacet__ Integer NOT NULL
) ;

CREATE TABLE Variables_children_Variable (
	__IDVariables__ Integer NOT NULL,
	__IDVariable__ Integer NOT NULL
) ;

CREATE TABLE XSDSchema_referencingDirectives_XSDSchemaDirective (
	__IDXSDSchema__ Integer NOT NULL,
	__IDXSDSchemaDirective__ Integer NOT NULL
) ;

CREATE TABLE Reply_toPart_ToPart (
	__IDReply__ Integer NOT NULL,
	__IDToPart__ Integer NOT NULL
) ;

CREATE TABLE XSDAttributeGroupDefinition_attributeUses_XSDAttributeUse (
	__IDXSDAttributeGroupDefinition__ Integer NOT NULL,
	__IDXSDAttributeUse__ Integer NOT NULL
) ;

CREATE TABLE XSDSchema_elementDeclarations_XSDElementDeclaration (
	__IDXSDSchema__ Integer NOT NULL,
	__IDXSDElementDeclaration__ Integer NOT NULL
) ;

CREATE TABLE FaultHandler_catch_Catch (
	__IDFaultHandler__ Integer NOT NULL,
	__IDCatch__ Integer NOT NULL
) ;

CREATE TABLE XSDComplexTypeDefinition_attributeContents_XSDAttributeGroupContent (
	__IDXSDComplexTypeDefinition__ Integer NOT NULL,
	__IDXSDAttributeGroupContent__ Integer NOT NULL
) ;

CREATE TABLE XSDElementDeclaration_identityConstraintDefinitions_XSDIdentityConstraintDefinition (
	__IDXSDElementDeclaration__ Integer NOT NULL,
	__IDXSDIdentityConstraintDefinition__ Integer NOT NULL
) ;

CREATE TABLE XSDSchema_notationDeclarations_XSDNotationDeclaration (
	__IDXSDSchema__ Integer NOT NULL,
	__IDXSDNotationDeclaration__ Integer NOT NULL
) ;

CREATE TABLE XSDIdentityConstraintDefinition_fields_XSDXPathDefinition (
	__IDXSDIdentityConstraintDefinition__ Integer NOT NULL,
	__IDXSDXPathDefinition__ Integer NOT NULL
) ;

CREATE TABLE OnEvent_fromPart_FromPart (
	__IDOnEvent__ Integer NOT NULL,
	__IDFromPart__ Integer NOT NULL
) ;

CREATE TABLE Links_children_Link (
	__IDLinks__ Integer NOT NULL,
	__IDLink__ Integer NOT NULL
) ;

CREATE TABLE XSDSimpleTypeDefinition_facets_XSDConstrainingFacet (
	__IDXSDSimpleTypeDefinition__ Integer NOT NULL,
	__IDXSDConstrainingFacet__ Integer NOT NULL
) ;

CREATE TABLE Switch_cases_Case (
	__IDSwitch__ Integer NOT NULL,
	__IDCase__ Integer NOT NULL
) ;

CREATE TABLE XSDSchema_attributeGroupDefinitions_XSDAttributeGroupDefinition (
	__IDXSDSchema__ Integer NOT NULL,
	__IDXSDAttributeGroupDefinition__ Integer NOT NULL
) ;

CREATE TABLE XSDWildcard_annotations_XSDAnnotation (
	__IDXSDWildcard__ Integer NOT NULL,
	__IDXSDAnnotation__ Integer NOT NULL
) ;

CREATE TABLE XSDSimpleTypeDefinition_facetContents_XSDConstrainingFacet (
	__IDXSDSimpleTypeDefinition__ Integer NOT NULL,
	__IDXSDConstrainingFacet__ Integer NOT NULL
) ;

CREATE TABLE Definition_eBindings_Binding (
	__IDDefinition__ Integer NOT NULL,
	__IDBinding__ Integer NOT NULL
) ;

CREATE TABLE XSDSchema_attributeDeclarations_XSDAttributeDeclaration (
	__IDXSDSchema__ Integer NOT NULL,
	__IDXSDAttributeDeclaration__ Integer NOT NULL
) ;

CREATE TABLE Definition_eNamespaces_Namespace (
	__IDDefinition__ Integer NOT NULL,
	__IDNamespace__ Integer NOT NULL
) ;

CREATE TABLE XSDRedefine_contents_XSDRedefineContent (
	__IDXSDRedefine__ Integer NOT NULL,
	__IDXSDRedefineContent__ Integer NOT NULL
) ;

CREATE TABLE Link_targets_Target (
	__IDLink__ Integer NOT NULL,
	__IDTarget__ Integer NOT NULL
) ;

CREATE TABLE Sources_children_Source (
	__IDSources__ Integer NOT NULL,
	__IDSource__ Integer NOT NULL
) ;

CREATE TABLE CorrelationSet_properties_Property (
	__IDCorrelationSet__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Definition_ePortTypes_PortType (
	__IDDefinition__ Integer NOT NULL,
	__IDPortType__ Integer NOT NULL
) ;

CREATE TABLE XSDRepeatableFacet_annotations_XSDAnnotation (
	__IDXSDRepeatableFacet__ Integer NOT NULL,
	__IDXSDAnnotation__ Integer NOT NULL
) ;

CREATE TABLE Validate_variables_Variable (
	__IDValidate__ Integer NOT NULL,
	__IDVariable__ Integer NOT NULL
) ;

CREATE TABLE XSDDiagnostic_components_XSDConcreteComponent (
	__IDXSDDiagnostic__ Integer NOT NULL,
	__IDXSDConcreteComponent__ Integer NOT NULL
) ;
