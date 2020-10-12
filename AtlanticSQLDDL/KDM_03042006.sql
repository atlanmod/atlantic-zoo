CREATE TABLE Subsystem (
	__IDSubsystem__ Integer NOT NULL,
	PRIMARY KEY Subsystem (__IDSubsystem__)
) ;

CREATE TABLE Layer (
	__IDLayer__ Integer NOT NULL,
	PRIMARY KEY Layer (__IDLayer__)
) ;

CREATE TABLE StructureModel (
	__IDStructureModel__ Integer NOT NULL,
	PRIMARY KEY StructureModel (__IDStructureModel__)
) ;

CREATE TABLE StructureGroup (
	__IDStructureGroup__ Integer NOT NULL,
	PRIMARY KEY StructureGroup (__IDStructureGroup__)
) ;

CREATE TABLE StructureElement (
	__IDStructureElement__ Integer NOT NULL,
	PRIMARY KEY StructureElement (__IDStructureElement__)
) ;

CREATE TABLE Component (
	__IDComponent__ Integer NOT NULL,
	PRIMARY KEY Component (__IDComponent__)
) ;

CREATE TABLE SoftwareSystem (
	__IDSoftwareSystem__ Integer NOT NULL,
	PRIMARY KEY SoftwareSystem (__IDSoftwareSystem__)
) ;

CREATE TABLE StructureContainer (
	__IDStructureContainer__ Integer NOT NULL,
	PRIMARY KEY StructureContainer (__IDStructureContainer__)
) ;

CREATE TABLE PlatformElement (
	__IDPlatformElement__ Integer NOT NULL,
	PRIMARY KEY PlatformElement (__IDPlatformElement__)
) ;

CREATE TABLE PlatformGroup (
	__IDPlatformGroup__ Integer NOT NULL,
	PRIMARY KEY PlatformGroup (__IDPlatformGroup__)
) ;

CREATE TABLE PlatformModel (
	__IDPlatformModel__ Integer NOT NULL,
	PRIMARY KEY PlatformModel (__IDPlatformModel__)
) ;

CREATE TABLE Requires (
	__IDRequires__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES DeployedComponent (__IDDeployedComponent__),
	PRIMARY KEY Requires (__IDRequires__),
	__FKfrom__ Integer
) ;

CREATE TABLE ResourceProvider (
	__IDResourceProvider__ Integer NOT NULL,
	PRIMARY KEY ResourceProvider (__IDResourceProvider__)
) ;

CREATE TABLE TechnologyRelationship (
	__IDTechnologyRelationship__ Integer NOT NULL,
	PRIMARY KEY TechnologyRelationship (__IDTechnologyRelationship__)
) ;

CREATE TABLE CompliesTo (
	__IDCompliesTo__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES ResourceInstance (__IDResourceInstance__),
	PRIMARY KEY CompliesTo (__IDCompliesTo__),
	__FKfrom__ Integer
) ;

CREATE TABLE PlatformPart (
	__IDPlatformPart__ Integer NOT NULL,
	PRIMARY KEY PlatformPart (__IDPlatformPart__)
) ;

CREATE TABLE ResourceElement (
	__IDResourceElement__ Integer NOT NULL,
	PRIMARY KEY ResourceElement (__IDResourceElement__)
) ;

CREATE TABLE ResourceType (
	__IDResourceType__ Integer NOT NULL,
	PRIMARY KEY ResourceType (__IDResourceType__)
) ;

CREATE TABLE ResourceInstance (
	__IDResourceInstance__ Integer NOT NULL,
	PRIMARY KEY ResourceInstance (__IDResourceInstance__)
) ;

CREATE TABLE BindsTo (
	__IDBindsTo__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES CodeResource (__IDCodeResource__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES ResourceInstance (__IDResourceInstance__),
	PRIMARY KEY BindsTo (__IDBindsTo__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE PlatformContainer (
	__IDPlatformContainer__ Integer NOT NULL,
	PRIMARY KEY PlatformContainer (__IDPlatformContainer__)
) ;

CREATE TABLE Provides (
	__IDProvides__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES PlatformElement (__IDPlatformElement__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES ResourceProvider (__IDResourceProvider__),
	PRIMARY KEY Provides (__IDProvides__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE NamingResource (
	__IDNamingResource__ Integer NOT NULL,
	PRIMARY KEY NamingResource (__IDNamingResource__)
) ;

CREATE TABLE MarshalledResource (
	__IDMarshalledResource__ Integer NOT NULL,
	PRIMARY KEY MarshalledResource (__IDMarshalledResource__)
) ;

CREATE TABLE MessagingResource (
	__IDMessagingResource__ Integer NOT NULL,
	PRIMARY KEY MessagingResource (__IDMessagingResource__)
) ;

CREATE TABLE DataResource (
	__IDDataResource__ Integer NOT NULL,
	PRIMARY KEY DataResource (__IDDataResource__)
) ;

CREATE TABLE ExecutionResource (
	__IDExecutionResource__ Integer NOT NULL,
	PRIMARY KEY ExecutionResource (__IDExecutionResource__)
) ;

CREATE TABLE ExternalActor (
	__IDExternalActor__ Integer NOT NULL,
	PRIMARY KEY ExternalActor (__IDExternalActor__)
) ;

CREATE TABLE ExternalRelations (
	__IDExternalRelations__ Integer NOT NULL,
	PRIMARY KEY ExternalRelations (__IDExternalRelations__)
) ;

CREATE TABLE Uses (
	__IDUses__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES ResourceInstance (__IDResourceInstance__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES ExternalActor (__IDExternalActor__),
	PRIMARY KEY Uses (__IDUses__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE DataPortResource (
	__IDDataPortResource__ Integer NOT NULL,
	PRIMARY KEY DataPortResource (__IDDataPortResource__)
) ;

CREATE TABLE DynamicData (
	__IDDynamicData__ Integer NOT NULL,
	PRIMARY KEY DynamicData (__IDDynamicData__)
) ;

CREATE TABLE DataManager (
	__IDDataManager__ Integer NOT NULL,
	PRIMARY KEY DataManager (__IDDataManager__)
) ;

CREATE TABLE PlatformRelationship (
	__IDPlatformRelationship__ Integer NOT NULL,
	PRIMARY KEY PlatformRelationship (__IDPlatformRelationship__)
) ;

CREATE TABLE PlatformService (
	__IDPlatformService__ Integer NOT NULL,
	PRIMARY KEY PlatformService (__IDPlatformService__)
) ;

CREATE TABLE MarshalledCall (
	__IDMarshalledCall__ Integer NOT NULL,
	PRIMARY KEY MarshalledCall (__IDMarshalledCall__)
) ;

CREATE TABLE Registration (
	__IDRegistration__ Integer NOT NULL,
	PRIMARY KEY Registration (__IDRegistration__)
) ;

CREATE TABLE Activation (
	__IDActivation__ Integer NOT NULL,
	PRIMARY KEY Activation (__IDActivation__)
) ;

CREATE TABLE AsynchCall (
	__IDAsynchCall__ Integer NOT NULL,
	PRIMARY KEY AsynchCall (__IDAsynchCall__)
) ;

CREATE TABLE UsesResource (
	__IDUsesResource__ Integer NOT NULL,
	PRIMARY KEY UsesResource (__IDUsesResource__)
) ;

CREATE TABLE ResourceRelationship (
	__IDResourceRelationship__ Integer NOT NULL,
	PRIMARY KEY ResourceRelationship (__IDResourceRelationship__)
) ;

CREATE TABLE BindsResource (
	__IDBindsResource__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES ResourceInstance (__IDResourceInstance__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES ResourceInstance (__IDResourceInstance__),
	PRIMARY KEY BindsResource (__IDBindsResource__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE ResourceDefinition (
	__IDResourceDefinition__ Integer NOT NULL,
	PRIMARY KEY ResourceDefinition (__IDResourceDefinition__)
) ;

CREATE TABLE Image (
	__IDImage__ Integer NOT NULL,
	PRIMARY KEY Image (__IDImage__)
) ;

CREATE TABLE BuildDescription (
	__IDBuildDescription__ Integer NOT NULL,
	PRIMARY KEY BuildDescription (__IDBuildDescription__)
) ;

CREATE TABLE DependsOn (
	__IDDependsOn__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES BuildElement (__IDBuildElement__),
	FOREIGN KEY "to" (__FKto__) REFERENCES BuildElement (__IDBuildElement__),
	PRIMARY KEY DependsOn (__IDDependsOn__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE SymbolicLink (
	__IDSymbolicLink__ Integer NOT NULL,
	PRIMARY KEY SymbolicLink (__IDSymbolicLink__)
) ;

CREATE TABLE LinksTo (
	__IDLinksTo__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES BuildElement (__IDBuildElement__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES SymbolicLink (__IDSymbolicLink__),
	PRIMARY KEY LinksTo (__IDLinksTo__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE BuildGroup (
	__IDBuildGroup__ Integer NOT NULL,
	PRIMARY KEY BuildGroup (__IDBuildGroup__)
) ;

CREATE TABLE BuildElement (
	__IDBuildElement__ Integer NOT NULL,
	PRIMARY KEY BuildElement (__IDBuildElement__)
) ;

CREATE TABLE TransformsInto (
	__IDTransformsInto__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES BuildElement (__IDBuildElement__),
	FOREIGN KEY "to" (__FKto__) REFERENCES BuildElement (__IDBuildElement__),
	PRIMARY KEY TransformsInto (__IDTransformsInto__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE SourceFile (
	__IDSourceFile__ Integer NOT NULL,
	language text,
	PRIMARY KEY SourceFile (__IDSourceFile__)
) ;

CREATE TABLE BuildResource (
	__IDBuildResource__ Integer NOT NULL,
	version text,
	path text,
	PRIMARY KEY BuildResource (__IDBuildResource__)
) ;

CREATE TABLE BuildRelationship (
	__IDBuildRelationship__ Integer NOT NULL,
	PRIMARY KEY BuildRelationship (__IDBuildRelationship__)
) ;

CREATE TABLE BuildContainer (
	__IDBuildContainer__ Integer NOT NULL,
	PRIMARY KEY BuildContainer (__IDBuildContainer__)
) ;

CREATE TABLE BuildModel (
	__IDBuildModel__ Integer NOT NULL,
	PRIMARY KEY BuildModel (__IDBuildModel__)
) ;

CREATE TABLE Directory (
	__IDDirectory__ Integer NOT NULL,
	path text,
	PRIMARY KEY Directory (__IDDirectory__)
) ;

CREATE TABLE BuildComponent (
	__IDBuildComponent__ Integer NOT NULL,
	PRIMARY KEY BuildComponent (__IDBuildComponent__)
) ;

CREATE TABLE IntermediateFile (
	__IDIntermediateFile__ Integer NOT NULL,
	PRIMARY KEY IntermediateFile (__IDIntermediateFile__)
) ;

CREATE TABLE Origin (
	__IDOrigin__ Integer NOT NULL,
	PRIMARY KEY Origin (__IDOrigin__)
) ;

CREATE TABLE Tool (
	__IDTool__ Integer NOT NULL,
	PRIMARY KEY Tool (__IDTool__)
) ;

CREATE TABLE KDMEntity (
	__IDKDMEntity__ Integer NOT NULL,
	name text,
	PRIMARY KEY KDMEntity (__IDKDMEntity__)
) ;

CREATE TABLE KDMContainer (
	__IDKDMContainer__ Integer NOT NULL,
	PRIMARY KEY KDMContainer (__IDKDMContainer__)
) ;

CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	FOREIGN KEY stereotype (__FKstereotype__) REFERENCES Stereotype (__IDStereotype__),
	PRIMARY KEY ModelElement (__IDModelElement__),
	__FKstereotype__ Integer
) ;

CREATE TABLE KDMRelationship (
	__IDKDMRelationship__ Integer NOT NULL,
	PRIMARY KEY KDMRelationship (__IDKDMRelationship__)
) ;

CREATE TABLE KDMAggregatedRelationship (
	__IDKDMAggregatedRelationship__ Integer NOT NULL,
	density text,
	PRIMARY KEY KDMAggregatedRelationship (__IDKDMAggregatedRelationship__)
) ;

CREATE TABLE Attribute (
	__IDAttribute__ Integer NOT NULL,
	tag text,
	value text,
	PRIMARY KEY Attribute (__IDAttribute__)
) ;

CREATE TABLE Annotation (
	__IDAnnotation__ Integer NOT NULL,
	note text,
	PRIMARY KEY Annotation (__IDAnnotation__)
) ;

CREATE TABLE KDMGroup (
	__IDKDMGroup__ Integer NOT NULL,
	PRIMARY KEY KDMGroup (__IDKDMGroup__)
) ;

CREATE TABLE KDMExtensionFamily (
	__IDKDMExtensionFamily__ Integer NOT NULL,
	name text,
	PRIMARY KEY KDMExtensionFamily (__IDKDMExtensionFamily__)
) ;

CREATE TABLE TagDefinition (
	__IDTagDefinition__ Integer NOT NULL,
	tag text,
	type text,
	PRIMARY KEY TagDefinition (__IDTagDefinition__)
) ;

CREATE TABLE TaggedValue (
	__IDTaggedValue__ Integer NOT NULL,
	FOREIGN KEY tag (__FKtag__) REFERENCES TagDefinition (__IDTagDefinition__),
	value text,
	PRIMARY KEY TaggedValue (__IDTaggedValue__),
	__FKtag__ Integer
) ;

CREATE TABLE Stereotype (
	__IDStereotype__ Integer NOT NULL,
	FOREIGN KEY family (__FKfamily__) REFERENCES KDMExtensionFamily (__IDKDMExtensionFamily__),
	baseClass text,
	name text,
	PRIMARY KEY Stereotype (__IDStereotype__),
	__FKfamily__ Integer
) ;

CREATE TABLE Screen (
	__IDScreen__ Integer NOT NULL,
	PRIMARY KEY Screen (__IDScreen__)
) ;

CREATE TABLE Report (
	__IDReport__ Integer NOT NULL,
	PRIMARY KEY Report (__IDReport__)
) ;

CREATE TABLE UIModel (
	__IDUIModel__ Integer NOT NULL,
	PRIMARY KEY UIModel (__IDUIModel__)
) ;

CREATE TABLE UIElement (
	__IDUIElement__ Integer NOT NULL,
	PRIMARY KEY UIElement (__IDUIElement__)
) ;

CREATE TABLE UIContainer (
	__IDUIContainer__ Integer NOT NULL,
	PRIMARY KEY UIContainer (__IDUIContainer__)
) ;

CREATE TABLE UsesLayout (
	__IDUsesLayout__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES UIContainer (__IDUIContainer__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES Display (__IDDisplay__),
	PRIMARY KEY UsesLayout (__IDUsesLayout__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE DisplayUnit (
	__IDDisplayUnit__ Integer NOT NULL,
	PRIMARY KEY DisplayUnit (__IDDisplayUnit__)
) ;

CREATE TABLE VariableDisplayUnit (
	__IDVariableDisplayUnit__ Integer NOT NULL,
	PRIMARY KEY VariableDisplayUnit (__IDVariableDisplayUnit__)
) ;

CREATE TABLE FixedDisplayUnit (
	__IDFixedDisplayUnit__ Integer NOT NULL,
	PRIMARY KEY FixedDisplayUnit (__IDFixedDisplayUnit__)
) ;

CREATE TABLE UsesImage (
	__IDUsesImage__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES Image (__IDImage__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES DisplayUnit (__IDDisplayUnit__),
	PRIMARY KEY UsesImage (__IDUsesImage__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE DisplaysData (
	__IDDisplaysData__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES StorableElement (__IDStorableElement__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES VariableDisplayUnit (__IDVariableDisplayUnit__),
	PRIMARY KEY DisplaysData (__IDDisplaysData__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE Displays (
	__IDDisplays__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES CallableElement (__IDCallableElement__),
	FOREIGN KEY "to" (__FKto__) REFERENCES UIElement (__IDUIElement__),
	PRIMARY KEY Displays (__IDDisplays__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE Display (
	__IDDisplay__ Integer NOT NULL,
	PRIMARY KEY Display (__IDDisplay__)
) ;

CREATE TABLE UIFlow (
	__IDUIFlow__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES Display (__IDDisplay__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES Display (__IDDisplay__),
	PRIMARY KEY UIFlow (__IDUIFlow__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE Renders (
	__IDRenders__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES Display (__IDDisplay__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES "Trigger" (__IDTrigger__),
	PRIMARY KEY Renders (__IDRenders__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE UIRelationship (
	__IDUIRelationship__ Integer NOT NULL,
	PRIMARY KEY UIRelationship (__IDUIRelationship__)
) ;

CREATE TABLE UIGroup (
	__IDUIGroup__ Integer NOT NULL,
	PRIMARY KEY UIGroup (__IDUIGroup__)
) ;

CREATE TABLE ActionElement (
	__IDActionElement__ Integer NOT NULL,
	PRIMARY KEY ActionElement (__IDActionElement__)
) ;

CREATE TABLE ControlFlow (
	__IDControlFlow__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES ActionElement (__IDActionElement__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES ActionElement (__IDActionElement__),
	PRIMARY KEY ControlFlow (__IDControlFlow__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE UsesCallable (
	__IDUsesCallable__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES ActionElement (__IDActionElement__),
	FOREIGN KEY "to" (__FKto__) REFERENCES CallableElement (__IDCallableElement__),
	PRIMARY KEY UsesCallable (__IDUsesCallable__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE Calls (
	__IDCalls__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES CallableElement (__IDCallableElement__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES ActionElement (__IDActionElement__),
	PRIMARY KEY Calls (__IDCalls__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE Creates (
	__IDCreates__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES StorableElement (__IDStorableElement__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES ActionElement (__IDActionElement__),
	PRIMARY KEY Creates (__IDCreates__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE "Reads" (
	__IDReads__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES StorableElement (__IDStorableElement__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES ActionElement (__IDActionElement__),
	PRIMARY KEY "Reads" (__IDReads__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE UsesData (
	__IDUsesData__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES StorableElement (__IDStorableElement__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES ActionElement (__IDActionElement__),
	PRIMARY KEY UsesData (__IDUsesData__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE Writes (
	__IDWrites__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES ActionElement (__IDActionElement__),
	FOREIGN KEY "to" (__FKto__) REFERENCES StorableElement (__IDStorableElement__),
	PRIMARY KEY Writes (__IDWrites__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE Destroys (
	__IDDestroys__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES StorableElement (__IDStorableElement__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES ActionElement (__IDActionElement__),
	PRIMARY KEY Destroys (__IDDestroys__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE DataRelationship (
	__IDDataRelationship__ Integer NOT NULL,
	PRIMARY KEY DataRelationship (__IDDataRelationship__)
) ;

CREATE TABLE CallableRelationship (
	__IDCallableRelationship__ Integer NOT NULL,
	PRIMARY KEY CallableRelationship (__IDCallableRelationship__)
) ;

CREATE TABLE UsesPrototype (
	__IDUsesPrototype__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES ActionElement (__IDActionElement__),
	FOREIGN KEY "to" (__FKto__) REFERENCES PrototypeUnit (__IDPrototypeUnit__),
	PRIMARY KEY UsesPrototype (__IDUsesPrototype__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE ImportDirective (
	__IDImportDirective__ Integer NOT NULL,
	PRIMARY KEY ImportDirective (__IDImportDirective__)
) ;

CREATE TABLE Imports (
	__IDImports__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES CodeResource (__IDCodeResource__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES ImportDirective (__IDImportDirective__),
	PRIMARY KEY Imports (__IDImports__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE UsesType (
	__IDUsesType__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES ActionElement (__IDActionElement__),
	FOREIGN KEY "to" (__FKto__) REFERENCES TypeElement (__IDTypeElement__),
	PRIMARY KEY UsesType (__IDUsesType__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE Expands (
	__IDExpands__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES MacroUnit (__IDMacroUnit__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES ActionElement (__IDActionElement__),
	PRIMARY KEY Expands (__IDExpands__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE ImportRelationship (
	__IDImportRelationship__ Integer NOT NULL,
	PRIMARY KEY ImportRelationship (__IDImportRelationship__)
) ;

CREATE TABLE MacroRelationship (
	__IDMacroRelationship__ Integer NOT NULL,
	PRIMARY KEY MacroRelationship (__IDMacroRelationship__)
) ;

CREATE TABLE FlowRelationship (
	__IDFlowRelationship__ Integer NOT NULL,
	PRIMARY KEY FlowRelationship (__IDFlowRelationship__)
) ;

CREATE TABLE ActionRelationship (
	__IDActionRelationship__ Integer NOT NULL,
	PRIMARY KEY ActionRelationship (__IDActionRelationship__)
) ;

CREATE TABLE EntryFlow (
	__IDEntryFlow__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES ActionElement (__IDActionElement__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES CallableElement (__IDCallableElement__),
	PRIMARY KEY EntryFlow (__IDEntryFlow__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE Flow (
	__IDFlow__ Integer NOT NULL,
	PRIMARY KEY Flow (__IDFlow__)
) ;

CREATE TABLE TrueFlow (
	__IDTrueFlow__ Integer NOT NULL,
	PRIMARY KEY TrueFlow (__IDTrueFlow__)
) ;

CREATE TABLE FalseFlow (
	__IDFalseFlow__ Integer NOT NULL,
	PRIMARY KEY FalseFlow (__IDFalseFlow__)
) ;

CREATE TABLE GuardedFlow (
	__IDGuardedFlow__ Integer NOT NULL,
	PRIMARY KEY GuardedFlow (__IDGuardedFlow__)
) ;

CREATE TABLE Initializes (
	__IDInitializes__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES StorableElement (__IDStorableElement__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES ActionElement (__IDActionElement__),
	PRIMARY KEY Initializes (__IDInitializes__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE Invokes (
	__IDInvokes__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES NamedTypeUnit (__IDNamedTypeUnit__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES ActionElement (__IDActionElement__),
	PRIMARY KEY Invokes (__IDInvokes__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE ActionGroup (
	__IDActionGroup__ Integer NOT NULL,
	PRIMARY KEY ActionGroup (__IDActionGroup__)
) ;

CREATE TABLE KDMModelRoot (
	__IDKDMModelRoot__ Integer NOT NULL,
	PRIMARY KEY KDMModelRoot (__IDKDMModelRoot__)
) ;

CREATE TABLE KDMRoot (
	__IDKDMRoot__ Integer NOT NULL,
	PRIMARY KEY KDMRoot (__IDKDMRoot__)
) ;

CREATE TABLE KDMFramework (
	__IDKDMFramework__ Integer NOT NULL,
	name text,
	PRIMARY KEY KDMFramework (__IDKDMFramework__)
) ;

CREATE TABLE KDMModel (
	__IDKDMModel__ Integer NOT NULL,
	PRIMARY KEY KDMModel (__IDKDMModel__)
) ;

CREATE TABLE Audit (
	__IDAudit__ Integer NOT NULL,
	description text,
	duthor text,
	date text,
	PRIMARY KEY Audit (__IDAudit__)
) ;

CREATE TABLE KDMSegment (
	__IDKDMSegment__ Integer NOT NULL,
	PRIMARY KEY KDMSegment (__IDKDMSegment__)
) ;

CREATE TABLE RuntimeElement (
	__IDRuntimeElement__ Integer NOT NULL,
	PRIMARY KEY RuntimeElement (__IDRuntimeElement__)
) ;

CREATE TABLE RuntimeModel (
	__IDRuntimeModel__ Integer NOT NULL,
	PRIMARY KEY RuntimeModel (__IDRuntimeModel__)
) ;

CREATE TABLE RuntimeContainer (
	__IDRuntimeContainer__ Integer NOT NULL,
	PRIMARY KEY RuntimeContainer (__IDRuntimeContainer__)
) ;

CREATE TABLE Process (
	__IDProcess__ Integer NOT NULL,
	PRIMARY KEY Process (__IDProcess__)
) ;

CREATE TABLE Thread (
	__IDThread__ Integer NOT NULL,
	PRIMARY KEY Thread (__IDThread__)
) ;

CREATE TABLE RuntimeRelation (
	__IDRuntimeRelation__ Integer NOT NULL,
	PRIMARY KEY RuntimeRelation (__IDRuntimeRelation__)
) ;

CREATE TABLE Machine (
	__IDMachine__ Integer NOT NULL,
	PRIMARY KEY Machine (__IDMachine__)
) ;

CREATE TABLE DeployedSoftwareSystem (
	__IDDeployedSoftwareSystem__ Integer NOT NULL,
	FOREIGN KEY system (__FKsystem__) REFERENCES SoftwareSystem (__IDSoftwareSystem__),
	PRIMARY KEY DeployedSoftwareSystem (__IDDeployedSoftwareSystem__),
	__FKsystem__ Integer
) ;

CREATE TABLE DeployedComponent (
	__IDDeployedComponent__ Integer NOT NULL,
	FOREIGN KEY deployment (__FKdeployment__) REFERENCES DeployedSoftwareSystem (__IDDeployedSoftwareSystem__),
	PRIMARY KEY DeployedComponent (__IDDeployedComponent__),
	__FKdeployment__ Integer
) ;

CREATE TABLE LoadingService (
	__IDLoadingService__ Integer NOT NULL,
	PRIMARY KEY LoadingService (__IDLoadingService__)
) ;

CREATE TABLE SpawningService (
	__IDSpawningService__ Integer NOT NULL,
	PRIMARY KEY SpawningService (__IDSpawningService__)
) ;

CREATE TABLE Loads (
	__IDLoads__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES DeployedComponent (__IDDeployedComponent__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES LoadingService (__IDLoadingService__),
	PRIMARY KEY Loads (__IDLoads__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE RuntimeGroup (
	__IDRuntimeGroup__ Integer NOT NULL,
	PRIMARY KEY RuntimeGroup (__IDRuntimeGroup__)
) ;

CREATE TABLE RuntimeService (
	__IDRuntimeService__ Integer NOT NULL,
	PRIMARY KEY RuntimeService (__IDRuntimeService__)
) ;

CREATE TABLE Spawns (
	__IDSpawns__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES SpawningService (__IDSpawningService__),
	FOREIGN KEY "to" (__FKto__) REFERENCES RunnableElement (__IDRunnableElement__),
	PRIMARY KEY Spawns (__IDSpawns__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE RunnableElement (
	__IDRunnableElement__ Integer NOT NULL,
	PRIMARY KEY RunnableElement (__IDRunnableElement__)
) ;

CREATE TABLE DeployedResource (
	__IDDeployedResource__ Integer NOT NULL,
	PRIMARY KEY DeployedResource (__IDDeployedResource__)
) ;

CREATE TABLE SourceRef (
	__IDSourceRef__ Integer NOT NULL,
	language text,
	snippet text,
	PRIMARY KEY SourceRef (__IDSourceRef__)
) ;

CREATE TABLE SourceRegion (
	__IDSourceRegion__ Integer NOT NULL,
	FOREIGN KEY file (__FKfile__) REFERENCES SourceFile (__IDSourceFile__),
	startLine text,
	startPosition text,
	endLine text,
	endPosition text,
	language text,
	path text,
	PRIMARY KEY SourceRegion (__IDSourceRegion__),
	__FKfile__ Integer
) ;

CREATE TABLE CodeElement (
	__IDCodeElement__ Integer NOT NULL,
	PRIMARY KEY CodeElement (__IDCodeElement__)
) ;

CREATE TABLE PrototypeRelationship (
	__IDPrototypeRelationship__ Integer NOT NULL,
	PRIMARY KEY PrototypeRelationship (__IDPrototypeRelationship__)
) ;

CREATE TABLE CallableElement (
	__IDCallableElement__ Integer NOT NULL,
	isExternal Boolean,
	PRIMARY KEY CallableElement (__IDCallableElement__)
) ;

CREATE TABLE PrototypeUnit (
	__IDPrototypeUnit__ Integer NOT NULL,
	PRIMARY KEY PrototypeUnit (__IDPrototypeUnit__)
) ;

CREATE TABLE PrototypedBy (
	__IDPrototypedBy__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES PrototypeUnit (__IDPrototypeUnit__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES CodeResource (__IDCodeResource__),
	PRIMARY KEY PrototypedBy (__IDPrototypedBy__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE MethodUnit (
	__IDMethodUnit__ Integer NOT NULL,
	PRIMARY KEY MethodUnit (__IDMethodUnit__)
) ;

CREATE TABLE CodeAssembly (
	__IDCodeAssembly__ Integer NOT NULL,
	PRIMARY KEY CodeAssembly (__IDCodeAssembly__)
) ;

CREATE TABLE MacroUnit (
	__IDMacroUnit__ Integer NOT NULL,
	PRIMARY KEY MacroUnit (__IDMacroUnit__)
) ;

CREATE TABLE CodeGroup (
	__IDCodeGroup__ Integer NOT NULL,
	PRIMARY KEY CodeGroup (__IDCodeGroup__)
) ;

CREATE TABLE CallableUnit (
	__IDCallableUnit__ Integer NOT NULL,
	PRIMARY KEY CallableUnit (__IDCallableUnit__)
) ;

CREATE TABLE TemplateUnit (
	__IDTemplateUnit__ Integer NOT NULL,
	PRIMARY KEY TemplateUnit (__IDTemplateUnit__)
) ;

CREATE TABLE TemplateParameter (
	__IDTemplateParameter__ Integer NOT NULL,
	PRIMARY KEY TemplateParameter (__IDTemplateParameter__)
) ;

CREATE TABLE TemplateInstance (
	__IDTemplateInstance__ Integer NOT NULL,
	PRIMARY KEY TemplateInstance (__IDTemplateInstance__)
) ;

CREATE TABLE Instantiates (
	__IDInstantiates__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES TemplateUnit (__IDTemplateUnit__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES TemplateInstance (__IDTemplateInstance__),
	PRIMARY KEY Instantiates (__IDInstantiates__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE BlockUnit (
	__IDBlockUnit__ Integer NOT NULL,
	PRIMARY KEY BlockUnit (__IDBlockUnit__)
) ;

CREATE TABLE ConstructorUnit (
	__IDConstructorUnit__ Integer NOT NULL,
	PRIMARY KEY ConstructorUnit (__IDConstructorUnit__)
) ;

CREATE TABLE InstanceOf (
	__IDInstanceOf__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES CodeResource (__IDCodeResource__),
	FOREIGN KEY "to" (__FKto__) REFERENCES CodeResource (__IDCodeResource__),
	PRIMARY KEY InstanceOf (__IDInstanceOf__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE CodeContainer (
	__IDCodeContainer__ Integer NOT NULL,
	PRIMARY KEY CodeContainer (__IDCodeContainer__)
) ;

CREATE TABLE CompilationUnit (
	__IDCompilationUnit__ Integer NOT NULL,
	PRIMARY KEY CompilationUnit (__IDCompilationUnit__)
) ;

CREATE TABLE CodeModel (
	__IDCodeModel__ Integer NOT NULL,
	PRIMARY KEY CodeModel (__IDCodeModel__)
) ;

CREATE TABLE OperatorUnit (
	__IDOperatorUnit__ Integer NOT NULL,
	PRIMARY KEY OperatorUnit (__IDOperatorUnit__)
) ;

CREATE TABLE TemplateRelationship (
	__IDTemplateRelationship__ Integer NOT NULL,
	PRIMARY KEY TemplateRelationship (__IDTemplateRelationship__)
) ;

CREATE TABLE ArrayUnit (
	__IDArrayUnit__ Integer NOT NULL,
	PRIMARY KEY ArrayUnit (__IDArrayUnit__)
) ;

CREATE TABLE BooleanUnit (
	__IDBooleanUnit__ Integer NOT NULL,
	PRIMARY KEY BooleanUnit (__IDBooleanUnit__)
) ;

CREATE TABLE CharUnit (
	__IDCharUnit__ Integer NOT NULL,
	PRIMARY KEY CharUnit (__IDCharUnit__)
) ;

CREATE TABLE ClassUnit (
	__IDClassUnit__ Integer NOT NULL,
	isAbstract Boolean,
	isInterface Boolean,
	PRIMARY KEY ClassUnit (__IDClassUnit__)
) ;

CREATE TABLE CompositeUnit (
	__IDCompositeUnit__ Integer NOT NULL,
	PRIMARY KEY CompositeUnit (__IDCompositeUnit__)
) ;

CREATE TABLE EnumeratedLiteral (
	__IDEnumeratedLiteral__ Integer NOT NULL,
	PRIMARY KEY EnumeratedLiteral (__IDEnumeratedLiteral__)
) ;

CREATE TABLE EnumeratedUnit (
	__IDEnumeratedUnit__ Integer NOT NULL,
	PRIMARY KEY EnumeratedUnit (__IDEnumeratedUnit__)
) ;

CREATE TABLE Extends (
	__IDExtends__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES TypeElement (__IDTypeElement__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES TypeElement (__IDTypeElement__),
	PRIMARY KEY Extends (__IDExtends__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE FixedPointUnit (
	__IDFixedPointUnit__ Integer NOT NULL,
	PRIMARY KEY FixedPointUnit (__IDFixedPointUnit__)
) ;

CREATE TABLE FloatUnit (
	__IDFloatUnit__ Integer NOT NULL,
	PRIMARY KEY FloatUnit (__IDFloatUnit__)
) ;

CREATE TABLE HasType (
	__IDHasType__ Integer NOT NULL,
	FOREIGN KEY "to" (__FKto__) REFERENCES TypeElement (__IDTypeElement__),
	FOREIGN KEY "from" (__FKfrom__) REFERENCES CodeResource (__IDCodeResource__),
	PRIMARY KEY HasType (__IDHasType__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE ImplementationOf (
	__IDImplementationOf__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES CodeResource (__IDCodeResource__),
	FOREIGN KEY "to" (__FKto__) REFERENCES Signature (__IDSignature__),
	PRIMARY KEY ImplementationOf (__IDImplementationOf__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE Implements (
	__IDImplements__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES CodeResource (__IDCodeResource__),
	FOREIGN KEY "to" (__FKto__) REFERENCES Interface (__IDInterface__),
	PRIMARY KEY Implements (__IDImplements__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE IntegerUnit (
	__IDIntegerUnit__ Integer NOT NULL,
	PRIMARY KEY IntegerUnit (__IDIntegerUnit__)
) ;

CREATE TABLE Interface (
	__IDInterface__ Integer NOT NULL,
	PRIMARY KEY Interface (__IDInterface__)
) ;

CREATE TABLE InterfaceRelationship (
	__IDInterfaceRelationship__ Integer NOT NULL,
	PRIMARY KEY InterfaceRelationship (__IDInterfaceRelationship__)
) ;

CREATE TABLE PointerUnit (
	__IDPointerUnit__ Integer NOT NULL,
	PRIMARY KEY PointerUnit (__IDPointerUnit__)
) ;

CREATE TABLE PredefinedTypeElement (
	__IDPredefinedTypeElement__ Integer NOT NULL,
	PRIMARY KEY PredefinedTypeElement (__IDPredefinedTypeElement__)
) ;

CREATE TABLE NamedTypeUnit (
	__IDNamedTypeUnit__ Integer NOT NULL,
	PRIMARY KEY NamedTypeUnit (__IDNamedTypeUnit__)
) ;

CREATE TABLE RefinementUnit (
	__IDRefinementUnit__ Integer NOT NULL,
	PRIMARY KEY RefinementUnit (__IDRefinementUnit__)
) ;

CREATE TABLE Signature (
	__IDSignature__ Integer NOT NULL,
	FOREIGN KEY "return" (__FKreturn__) REFERENCES TypeElement (__IDTypeElement__),
	PRIMARY KEY Signature (__IDSignature__),
	__FKreturn__ Integer
) ;

CREATE TABLE StorableElement (
	__IDStorableElement__ Integer NOT NULL,
	PRIMARY KEY StorableElement (__IDStorableElement__)
) ;

CREATE TABLE StringUnit (
	__IDStringUnit__ Integer NOT NULL,
	PRIMARY KEY StringUnit (__IDStringUnit__)
) ;

CREATE TABLE TypeElement (
	__IDTypeElement__ Integer NOT NULL,
	kind text,
	PRIMARY KEY TypeElement (__IDTypeElement__)
) ;

CREATE TABLE TypeRelationship (
	__IDTypeRelationship__ Integer NOT NULL,
	PRIMARY KEY TypeRelationship (__IDTypeRelationship__)
) ;

CREATE TABLE UnionUnit (
	__IDUnionUnit__ Integer NOT NULL,
	PRIMARY KEY UnionUnit (__IDUnionUnit__)
) ;

CREATE TABLE CodeRelationship (
	__IDCodeRelationship__ Integer NOT NULL,
	PRIMARY KEY CodeRelationship (__IDCodeRelationship__)
) ;

CREATE TABLE TypeContainer (
	__IDTypeContainer__ Integer NOT NULL,
	PRIMARY KEY TypeContainer (__IDTypeContainer__)
) ;

CREATE TABLE CompositeTypeElement (
	__IDCompositeTypeElement__ Integer NOT NULL,
	PRIMARY KEY CompositeTypeElement (__IDCompositeTypeElement__)
) ;

CREATE TABLE DerivedTypeElement (
	__IDDerivedTypeElement__ Integer NOT NULL,
	FOREIGN KEY baseType (__FKbaseType__) REFERENCES TypeElement (__IDTypeElement__),
	PRIMARY KEY DerivedTypeElement (__IDDerivedTypeElement__),
	__FKbaseType__ Integer
) ;

CREATE TABLE NamespaceUnit (
	__IDNamespaceUnit__ Integer NOT NULL,
	PRIMARY KEY NamespaceUnit (__IDNamespaceUnit__)
) ;

CREATE TABLE VisibleIn (
	__IDVisibleIn__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES CodeResource (__IDCodeResource__),
	FOREIGN KEY "to" (__FKto__) REFERENCES CodeResource (__IDCodeResource__),
	PRIMARY KEY VisibleIn (__IDVisibleIn__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE CommentUnit (
	__IDCommentUnit__ Integer NOT NULL,
	PRIMARY KEY CommentUnit (__IDCommentUnit__)
) ;

CREATE TABLE SharedUnit (
	__IDSharedUnit__ Integer NOT NULL,
	PRIMARY KEY SharedUnit (__IDSharedUnit__)
) ;

CREATE TABLE DecimalUnit (
	__IDDecimalUnit__ Integer NOT NULL,
	PRIMARY KEY DecimalUnit (__IDDecimalUnit__)
) ;

CREATE TABLE DateUnit (
	__IDDateUnit__ Integer NOT NULL,
	PRIMARY KEY DateUnit (__IDDateUnit__)
) ;

CREATE TABLE TimeUnit (
	__IDTimeUnit__ Integer NOT NULL,
	PRIMARY KEY TimeUnit (__IDTimeUnit__)
) ;

CREATE TABLE SimpleTypeElement (
	__IDSimpleTypeElement__ Integer NOT NULL,
	PRIMARY KEY SimpleTypeElement (__IDSimpleTypeElement__)
) ;

CREATE TABLE CodeResource (
	__IDCodeResource__ Integer NOT NULL,
	PRIMARY KEY CodeResource (__IDCodeResource__)
) ;

CREATE TABLE Module (
	__IDModule__ Integer NOT NULL,
	PRIMARY KEY Module (__IDModule__)
) ;

CREATE TABLE ConceptualModel (
	__IDConceptualModel__ Integer NOT NULL,
	PRIMARY KEY ConceptualModel (__IDConceptualModel__)
) ;

CREATE TABLE ConceptualElement (
	__IDConceptualElement__ Integer NOT NULL,
	PRIMARY KEY ConceptualElement (__IDConceptualElement__)
) ;

CREATE TABLE TermUnit (
	__IDTermUnit__ Integer NOT NULL,
	PRIMARY KEY TermUnit (__IDTermUnit__)
) ;

CREATE TABLE FactUnit (
	__IDFactUnit__ Integer NOT NULL,
	PRIMARY KEY FactUnit (__IDFactUnit__)
) ;

CREATE TABLE ConceptualContainer (
	__IDConceptualContainer__ Integer NOT NULL,
	PRIMARY KEY ConceptualContainer (__IDConceptualContainer__)
) ;

CREATE TABLE ConceptualGroup (
	__IDConceptualGroup__ Integer NOT NULL,
	PRIMARY KEY ConceptualGroup (__IDConceptualGroup__)
) ;

CREATE TABLE BehaviorGroup (
	__IDBehaviorGroup__ Integer NOT NULL,
	PRIMARY KEY BehaviorGroup (__IDBehaviorGroup__)
) ;

CREATE TABLE BehaviorUnit (
	__IDBehaviorUnit__ Integer NOT NULL,
	PRIMARY KEY BehaviorUnit (__IDBehaviorUnit__)
) ;

CREATE TABLE ScenarioUnit (
	__IDScenarioUnit__ Integer NOT NULL,
	PRIMARY KEY ScenarioUnit (__IDScenarioUnit__)
) ;

CREATE TABLE RuleUnit (
	__IDRuleUnit__ Integer NOT NULL,
	PRIMARY KEY RuleUnit (__IDRuleUnit__)
) ;

CREATE TABLE BehaviorModel (
	__IDBehaviorModel__ Integer NOT NULL,
	PRIMARY KEY BehaviorModel (__IDBehaviorModel__)
) ;

CREATE TABLE BehaviorElement (
	__IDBehaviorElement__ Integer NOT NULL,
	PRIMARY KEY BehaviorElement (__IDBehaviorElement__)
) ;

CREATE TABLE BehaviorContainer (
	__IDBehaviorContainer__ Integer NOT NULL,
	PRIMARY KEY BehaviorContainer (__IDBehaviorContainer__)
) ;

CREATE TABLE DataModel (
	__IDDataModel__ Integer NOT NULL,
	PRIMARY KEY DataModel (__IDDataModel__)
) ;

CREATE TABLE DataContainer (
	__IDDataContainer__ Integer NOT NULL,
	PRIMARY KEY DataContainer (__IDDataContainer__)
) ;

CREATE TABLE DataElement (
	__IDDataElement__ Integer NOT NULL,
	PRIMARY KEY DataElement (__IDDataElement__)
) ;

CREATE TABLE DataGroup (
	__IDDataGroup__ Integer NOT NULL,
	PRIMARY KEY DataGroup (__IDDataGroup__)
) ;

CREATE TABLE UniqueKey (
	__IDUniqueKey__ Integer NOT NULL,
	PRIMARY KEY UniqueKey (__IDUniqueKey__)
) ;

CREATE TABLE "Index" (
	__IDIndex__ Integer NOT NULL,
	PRIMARY KEY "Index" (__IDIndex__)
) ;

CREATE TABLE KeyRelation (
	__IDKeyRelation__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES ReferenceKey (__IDReferenceKey__),
	FOREIGN KEY "to" (__FKto__) REFERENCES UniqueKey (__IDUniqueKey__),
	PRIMARY KEY KeyRelation (__IDKeyRelation__),
	__FKto__ Integer,
	__FKfrom__ Integer
) ;

CREATE TABLE ReferenceKey (
	__IDReferenceKey__ Integer NOT NULL,
	PRIMARY KEY ReferenceKey (__IDReferenceKey__)
) ;

CREATE TABLE DataRelation (
	__IDDataRelation__ Integer NOT NULL,
	PRIMARY KEY DataRelation (__IDDataRelation__)
) ;

CREATE TABLE Catalog (
	__IDCatalog__ Integer NOT NULL,
	PRIMARY KEY Catalog (__IDCatalog__)
) ;

CREATE TABLE DBSchema (
	__IDDBSchema__ Integer NOT NULL,
	PRIMARY KEY DBSchema (__IDDBSchema__)
) ;

CREATE TABLE "Table" (
	__IDTable__ Integer NOT NULL,
	PRIMARY KEY "Table" (__IDTable__)
) ;

CREATE TABLE View (
	__IDView__ Integer NOT NULL,
	PRIMARY KEY View (__IDView__)
) ;

CREATE TABLE Query (
	__IDQuery__ Integer NOT NULL,
	PRIMARY KEY Query (__IDQuery__)
) ;

CREATE TABLE RecordFile (
	__IDRecordFile__ Integer NOT NULL,
	PRIMARY KEY RecordFile (__IDRecordFile__)
) ;

CREATE TABLE ColumnSet (
	__IDColumnSet__ Integer NOT NULL,
	PRIMARY KEY ColumnSet (__IDColumnSet__)
) ;

CREATE TABLE DBTrigger (
	__IDDBTrigger__ Integer NOT NULL,
	PRIMARY KEY DBTrigger (__IDDBTrigger__)
) ;

CREATE TABLE ProgramElement (
	__IDProgramElement__ Integer NOT NULL,
	PRIMARY KEY ProgramElement (__IDProgramElement__)
) ;

CREATE TABLE StoredProcedure (
	__IDStoredProcedure__ Integer NOT NULL,
	PRIMARY KEY StoredProcedure (__IDStoredProcedure__)
) ;

CREATE TABLE XMLSchema (
	__IDXMLSchema__ Integer NOT NULL,
	PRIMARY KEY XMLSchema (__IDXMLSchema__)
) ;

CREATE TABLE XMLElement (
	__IDXMLElement__ Integer NOT NULL,
	PRIMARY KEY XMLElement (__IDXMLElement__)
) ;

CREATE TABLE XMLComplexType (
	__IDXMLComplexType__ Integer NOT NULL,
	PRIMARY KEY XMLComplexType (__IDXMLComplexType__)
) ;

CREATE TABLE XMLAll (
	__IDXMLAll__ Integer NOT NULL,
	PRIMARY KEY XMLAll (__IDXMLAll__)
) ;

CREATE TABLE XMLSeq (
	__IDXMLSeq__ Integer NOT NULL,
	PRIMARY KEY XMLSeq (__IDXMLSeq__)
) ;

CREATE TABLE XMLChoice (
	__IDXMLChoice__ Integer NOT NULL,
	PRIMARY KEY XMLChoice (__IDXMLChoice__)
) ;

CREATE TABLE XMLOccurs (
	__IDXMLOccurs__ Integer NOT NULL,
	PRIMARY KEY XMLOccurs (__IDXMLOccurs__)
) ;

CREATE TABLE XMLGroup (
	__IDXMLGroup__ Integer NOT NULL,
	PRIMARY KEY XMLGroup (__IDXMLGroup__)
) ;

CREATE TABLE XMLAny (
	__IDXMLAny__ Integer NOT NULL,
	PRIMARY KEY XMLAny (__IDXMLAny__)
) ;

CREATE TABLE XMLRestriction (
	__IDXMLRestriction__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES SimpleTypeElement (__IDSimpleTypeElement__),
	PRIMARY KEY XMLRestriction (__IDXMLRestriction__),
	__FKtype__ Integer
) ;

CREATE TABLE XMLSimpleType (
	__IDXMLSimpleType__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES SimpleTypeElement (__IDSimpleTypeElement__),
	PRIMARY KEY XMLSimpleType (__IDXMLSimpleType__),
	__FKtype__ Integer
) ;

CREATE TABLE EventModel (
	__IDEventModel__ Integer NOT NULL,
	PRIMARY KEY EventModel (__IDEventModel__)
) ;

CREATE TABLE EventElement (
	__IDEventElement__ Integer NOT NULL,
	PRIMARY KEY EventElement (__IDEventElement__)
) ;

CREATE TABLE "Trigger" (
	__IDTrigger__ Integer NOT NULL,
	PRIMARY KEY "Trigger" (__IDTrigger__)
) ;

CREATE TABLE Triggers (
	__IDTriggers__ Integer NOT NULL,
	PRIMARY KEY Triggers (__IDTriggers__)
) ;

CREATE TABLE EventRelationship (
	__IDEventRelationship__ Integer NOT NULL,
	PRIMARY KEY EventRelationship (__IDEventRelationship__)
) ;

CREATE TABLE Message (
	__IDMessage__ Integer NOT NULL,
	PRIMARY KEY Message (__IDMessage__)
) ;

CREATE TABLE EventGroup (
	__IDEventGroup__ Integer NOT NULL,
	PRIMARY KEY EventGroup (__IDEventGroup__)
) ;

CREATE TABLE EventContainer (
	__IDEventContainer__ Integer NOT NULL,
	PRIMARY KEY EventContainer (__IDEventContainer__)
) ;

CREATE TABLE HasSignature (
	__IDHasSignature__ Integer NOT NULL,
	FOREIGN KEY "from" (__FKfrom__) REFERENCES EventElement (__IDEventElement__),
	FOREIGN KEY "to" (__FKto__) REFERENCES Signature (__IDSignature__),
	PRIMARY KEY HasSignature (__IDHasSignature__),
	__FKfrom__ Integer,
	__FKto__ Integer
) ;

CREATE TABLE UIEvent (
	__IDUIEvent__ Integer NOT NULL,
	PRIMARY KEY UIEvent (__IDUIEvent__)
) ;

CREATE TABLE ActionElement_inEntry_EntryFlow (
	__IDActionElement__ Integer NOT NULL,
	__IDEntryFlow__ Integer NOT NULL
) ;

CREATE TABLE ConceptualContainer_conceptualElement_ConceptualElement (
	__IDConceptualContainer__ Integer NOT NULL,
	__IDConceptualElement__ Integer NOT NULL
) ;

CREATE TABLE Module_codeElement_CodeElement (
	__IDModule__ Integer NOT NULL,
	__IDCodeElement__ Integer NOT NULL
) ;

CREATE TABLE RunnableElement_inSpawns_Spawns (
	__IDRunnableElement__ Integer NOT NULL,
	__IDSpawns__ Integer NOT NULL
) ;

CREATE TABLE ResourceDefinition_element_CodeResource (
	__IDResourceDefinition__ Integer NOT NULL,
	__IDCodeResource__ Integer NOT NULL
) ;

CREATE TABLE KDMModelRoot_buildModel_BuildModel (
	__IDKDMModelRoot__ Integer NOT NULL,
	__IDBuildModel__ Integer NOT NULL
) ;

CREATE TABLE Display_inRenders_Renders (
	__IDDisplay__ Integer NOT NULL,
	__IDRenders__ Integer NOT NULL
) ;

CREATE TABLE ActionElement_outInitializes_Initializes (
	__IDActionElement__ Integer NOT NULL,
	__IDInitializes__ Integer NOT NULL
) ;

CREATE TABLE DBSchema_trigger_DBTrigger (
	__IDDBSchema__ Integer NOT NULL,
	__IDDBTrigger__ Integer NOT NULL
) ;

CREATE TABLE ResourceProvider_outProvides_Provides (
	__IDResourceProvider__ Integer NOT NULL,
	__IDProvides__ Integer NOT NULL
) ;

CREATE TABLE PlatformElement_inProvides_Provides (
	__IDPlatformElement__ Integer NOT NULL,
	__IDProvides__ Integer NOT NULL
) ;

CREATE TABLE KDMFramework_audit_Audit (
	__IDKDMFramework__ Integer NOT NULL,
	__IDAudit__ Integer NOT NULL
) ;

CREATE TABLE Machine_resource_DeployedResource (
	__IDMachine__ Integer NOT NULL,
	__IDDeployedResource__ Integer NOT NULL
) ;

CREATE TABLE CodeResource_outInstanceOf_InstanceOf (
	__IDCodeResource__ Integer NOT NULL,
	__IDInstanceOf__ Integer NOT NULL
) ;

CREATE TABLE ResourceInstance_outComplies_CompliesTo (
	__IDResourceInstance__ Integer NOT NULL,
	__IDCompliesTo__ Integer NOT NULL
) ;

CREATE TABLE TemplateInstance_instance_CodeResource (
	__IDTemplateInstance__ Integer NOT NULL,
	__IDCodeResource__ Integer NOT NULL
) ;

CREATE TABLE XMLSchema_xmlElement_XMLElement (
	__IDXMLSchema__ Integer NOT NULL,
	__IDXMLElement__ Integer NOT NULL
) ;

CREATE TABLE StructureElement_structureGroup_StructureGroup (
	__IDStructureElement__ Integer NOT NULL,
	__IDStructureGroup__ Integer NOT NULL
) ;

CREATE TABLE ConceptualElement_conceptualGroup_ConceptualGroup (
	__IDConceptualElement__ Integer NOT NULL,
	__IDConceptualGroup__ Integer NOT NULL
) ;

CREATE TABLE Display_outUsesLayout_UsesLayout (
	__IDDisplay__ Integer NOT NULL,
	__IDUsesLayout__ Integer NOT NULL
) ;

CREATE TABLE ActionElement_outUsesPrototype_UsesPrototype (
	__IDActionElement__ Integer NOT NULL,
	__IDUsesPrototype__ Integer NOT NULL
) ;

CREATE TABLE BuildModel_buildElement_BuildElement (
	__IDBuildModel__ Integer NOT NULL,
	__IDBuildElement__ Integer NOT NULL
) ;

CREATE TABLE CodeModel_actionRelation_ActionRelationship (
	__IDCodeModel__ Integer NOT NULL,
	__IDActionRelationship__ Integer NOT NULL
) ;

CREATE TABLE ActionElement_outUsesData_UsesData (
	__IDActionElement__ Integer NOT NULL,
	__IDUsesData__ Integer NOT NULL
) ;

CREATE TABLE BuildResource_codeElement_Module (
	__IDBuildResource__ Integer NOT NULL,
	__IDModule__ Integer NOT NULL
) ;

CREATE TABLE KDMModelRoot_codeModel_CodeModel (
	__IDKDMModelRoot__ Integer NOT NULL,
	__IDCodeModel__ Integer NOT NULL
) ;

CREATE TABLE ActionElement_outWrites_Writes (
	__IDActionElement__ Integer NOT NULL,
	__IDWrites__ Integer NOT NULL
) ;

CREATE TABLE ActionElement_outUsesCallable_UsesCallable (
	__IDActionElement__ Integer NOT NULL,
	__IDUsesCallable__ Integer NOT NULL
) ;

CREATE TABLE RuntimeGroup_runtimeElement_RuntimeElement (
	__IDRuntimeGroup__ Integer NOT NULL,
	__IDRuntimeElement__ Integer NOT NULL
) ;

CREATE TABLE EventModel_relation_EventRelationship (
	__IDEventModel__ Integer NOT NULL,
	__IDEventRelationship__ Integer NOT NULL
) ;

CREATE TABLE DataModel_relation_DataRelation (
	__IDDataModel__ Integer NOT NULL,
	__IDDataRelation__ Integer NOT NULL
) ;

CREATE TABLE SpawningService_outSpawns_Spawns (
	__IDSpawningService__ Integer NOT NULL,
	__IDSpawns__ Integer NOT NULL
) ;

CREATE TABLE SymbolicLink_outLinksTo_LinksTo (
	__IDSymbolicLink__ Integer NOT NULL,
	__IDLinksTo__ Integer NOT NULL
) ;

CREATE TABLE Element_attribute_Attribute (
	__IDElement__ Integer NOT NULL,
	__IDAttribute__ Integer NOT NULL
) ;

CREATE TABLE Interface_inComplies_CompliesTo (
	__IDInterface__ Integer NOT NULL,
	__IDCompliesTo__ Integer NOT NULL
) ;

CREATE TABLE BuildContainer_buildElement_BuildElement (
	__IDBuildContainer__ Integer NOT NULL,
	__IDBuildElement__ Integer NOT NULL
) ;

CREATE TABLE Signature_parameter_TypeElement (
	__IDSignature__ Integer NOT NULL,
	__IDTypeElement__ Integer NOT NULL
) ;

CREATE TABLE ActionElement_outFlow_ControlFlow (
	__IDActionElement__ Integer NOT NULL,
	__IDControlFlow__ Integer NOT NULL
) ;

CREATE TABLE CodeModel_codeRelation_CodeRelationship (
	__IDCodeModel__ Integer NOT NULL,
	__IDCodeRelationship__ Integer NOT NULL
) ;

CREATE TABLE ImportDirective_outImports_Imports (
	__IDImportDirective__ Integer NOT NULL,
	__IDImports__ Integer NOT NULL
) ;

CREATE TABLE ResourceType_binding_ResourceElement (
	__IDResourceType__ Integer NOT NULL,
	__IDResourceElement__ Integer NOT NULL
) ;

CREATE TABLE Catalog_schema_DBSchema (
	__IDCatalog__ Integer NOT NULL,
	__IDDBSchema__ Integer NOT NULL
) ;

CREATE TABLE Display_inUIFlow_UIFlow (
	__IDDisplay__ Integer NOT NULL,
	__IDUIFlow__ Integer NOT NULL
) ;

CREATE TABLE ResourceInstance_inResource_BindsResource (
	__IDResourceInstance__ Integer NOT NULL,
	__IDBindsResource__ Integer NOT NULL
) ;

CREATE TABLE KDMModelRoot_platformModel_PlatformModel (
	__IDKDMModelRoot__ Integer NOT NULL,
	__IDPlatformModel__ Integer NOT NULL
) ;

CREATE TABLE VariableDisplayUnit_outDisplay_DisplaysData (
	__IDVariableDisplayUnit__ Integer NOT NULL,
	__IDDisplaysData__ Integer NOT NULL
) ;

CREATE TABLE ResourceType_definition_ResourceDefinition (
	__IDResourceType__ Integer NOT NULL,
	__IDResourceDefinition__ Integer NOT NULL
) ;

CREATE TABLE UIGroup_uiElement_UIElement (
	__IDUIGroup__ Integer NOT NULL,
	__IDUIElement__ Integer NOT NULL
) ;

CREATE TABLE RuntimeModel_runtimeElement_RuntimeElement (
	__IDRuntimeModel__ Integer NOT NULL,
	__IDRuntimeElement__ Integer NOT NULL
) ;

CREATE TABLE EventElement_outHasSignature_HasSignature (
	__IDEventElement__ Integer NOT NULL,
	__IDHasSignature__ Integer NOT NULL
) ;

CREATE TABLE RuntimeModel_relation_RuntimeRelation (
	__IDRuntimeModel__ Integer NOT NULL,
	__IDRuntimeRelation__ Integer NOT NULL
) ;

CREATE TABLE DeployedResource_provider_ResourceProvider (
	__IDDeployedResource__ Integer NOT NULL,
	__IDResourceProvider__ Integer NOT NULL
) ;

CREATE TABLE TemplateUnit_templateElement_CodeResource (
	__IDTemplateUnit__ Integer NOT NULL,
	__IDCodeResource__ Integer NOT NULL
) ;

CREATE TABLE ColumnSet_column_PredefinedTypeElement (
	__IDColumnSet__ Integer NOT NULL,
	__IDPredefinedTypeElement__ Integer NOT NULL
) ;

CREATE TABLE ActionElement_inFlow_ControlFlow (
	__IDActionElement__ Integer NOT NULL,
	__IDControlFlow__ Integer NOT NULL
) ;

CREATE TABLE ActionElement_outCalls_Calls (
	__IDActionElement__ Integer NOT NULL,
	__IDCalls__ Integer NOT NULL
) ;

CREATE TABLE PrototypeUnit_inPrototypedBy_PrototypedBy (
	__IDPrototypeUnit__ Integer NOT NULL,
	__IDPrototypedBy__ Integer NOT NULL
) ;

CREATE TABLE KDMAggregatedRelationship_relation_KDMRelationship (
	__IDKDMAggregatedRelationship__ Integer NOT NULL,
	__IDKDMRelationship__ Integer NOT NULL
) ;

CREATE TABLE CompositeTypeElement_field_TypeElement (
	__IDCompositeTypeElement__ Integer NOT NULL,
	__IDTypeElement__ Integer NOT NULL
) ;

CREATE TABLE Element_annotation_Annotation (
	__IDElement__ Integer NOT NULL,
	__IDAnnotation__ Integer NOT NULL
) ;

CREATE TABLE BuildElement_inDependsOn_DependsOn (
	__IDBuildElement__ Integer NOT NULL,
	__IDDependsOn__ Integer NOT NULL
) ;

CREATE TABLE BuildElement_outTransformsInto_TransformsInto (
	__IDBuildElement__ Integer NOT NULL,
	__IDTransformsInto__ Integer NOT NULL
) ;

CREATE TABLE XMLComplexType_element_XMLElement (
	__IDXMLComplexType__ Integer NOT NULL,
	__IDXMLElement__ Integer NOT NULL
) ;

CREATE TABLE KDMModelRoot_dataModel_DataModel (
	__IDKDMModelRoot__ Integer NOT NULL,
	__IDDataModel__ Integer NOT NULL
) ;

CREATE TABLE PlatformPart_resourceType_ResourceType (
	__IDPlatformPart__ Integer NOT NULL,
	__IDResourceType__ Integer NOT NULL
) ;

CREATE TABLE DBSchema_index_Index (
	__IDDBSchema__ Integer NOT NULL,
	__IDIndex__ Integer NOT NULL
) ;

CREATE TABLE CodeResource_codeGroup_CodeGroup (
	__IDCodeResource__ Integer NOT NULL,
	__IDCodeGroup__ Integer NOT NULL
) ;

CREATE TABLE DeployedComponent_inLoads_Loads (
	__IDDeployedComponent__ Integer NOT NULL,
	__IDLoads__ Integer NOT NULL
) ;

CREATE TABLE TypeElement_outExtends_Extends (
	__IDTypeElement__ Integer NOT NULL,
	__IDExtends__ Integer NOT NULL
) ;

CREATE TABLE CodeResource_outVisible_VisibleIn (
	__IDCodeResource__ Integer NOT NULL,
	__IDVisibleIn__ Integer NOT NULL
) ;

CREATE TABLE UIModel_relation_UIRelationship (
	__IDUIModel__ Integer NOT NULL,
	__IDUIRelationship__ Integer NOT NULL
) ;

CREATE TABLE Display_outUIFlow_UIFlow (
	__IDDisplay__ Integer NOT NULL,
	__IDUIFlow__ Integer NOT NULL
) ;

CREATE TABLE ResourceElement_instance_ResourceInstance (
	__IDResourceElement__ Integer NOT NULL,
	__IDResourceInstance__ Integer NOT NULL
) ;

CREATE TABLE ActionElement_outInvokes_Invokes (
	__IDActionElement__ Integer NOT NULL,
	__IDInvokes__ Integer NOT NULL
) ;

CREATE TABLE CodeResource_outPrototypedBy_PrototypedBy (
	__IDCodeResource__ Integer NOT NULL,
	__IDPrototypedBy__ Integer NOT NULL
) ;

CREATE TABLE BuildElement_inLinksTo_LinksTo (
	__IDBuildElement__ Integer NOT NULL,
	__IDLinksTo__ Integer NOT NULL
) ;

CREATE TABLE BuildGroup_buildElement_BuildElement (
	__IDBuildGroup__ Integer NOT NULL,
	__IDBuildElement__ Integer NOT NULL
) ;

CREATE TABLE DeployedComponent_component_CodeAssembly (
	__IDDeployedComponent__ Integer NOT NULL,
	__IDCodeAssembly__ Integer NOT NULL
) ;

CREATE TABLE EventModel_eventElement_EventElement (
	__IDEventModel__ Integer NOT NULL,
	__IDEventElement__ Integer NOT NULL
) ;

CREATE TABLE ConceptualModel_conceptualElement_ConceptualElement (
	__IDConceptualModel__ Integer NOT NULL,
	__IDConceptualElement__ Integer NOT NULL
) ;

CREATE TABLE DisplayUnit_outImage_UsesImage (
	__IDDisplayUnit__ Integer NOT NULL,
	__IDUsesImage__ Integer NOT NULL
) ;

CREATE TABLE XMLComplexType_attributes_SimpleTypeElement (
	__IDXMLComplexType__ Integer NOT NULL,
	__IDSimpleTypeElement__ Integer NOT NULL
) ;

CREATE TABLE DataModel_dataElement_DataElement (
	__IDDataModel__ Integer NOT NULL,
	__IDDataElement__ Integer NOT NULL
) ;

CREATE TABLE UIContainer_inUsesLayout_UsesLayout (
	__IDUIContainer__ Integer NOT NULL,
	__IDUsesLayout__ Integer NOT NULL
) ;

CREATE TABLE UIElement_inDisplays_Displays (
	__IDUIElement__ Integer NOT NULL,
	__IDDisplays__ Integer NOT NULL
) ;

CREATE TABLE KDMFramework_extension_KDMExtensionFamily (
	__IDKDMFramework__ Integer NOT NULL,
	__IDKDMExtensionFamily__ Integer NOT NULL
) ;

CREATE TABLE KDMModelRoot_runtimeModel_RuntimeModel (
	__IDKDMModelRoot__ Integer NOT NULL,
	__IDRuntimeModel__ Integer NOT NULL
) ;

CREATE TABLE KDMModelRoot_conceptualModel_ConceptualModel (
	__IDKDMModelRoot__ Integer NOT NULL,
	__IDConceptualModel__ Integer NOT NULL
) ;

CREATE TABLE ResourceInstance_outBinds_BindsTo (
	__IDResourceInstance__ Integer NOT NULL,
	__IDBindsTo__ Integer NOT NULL
) ;

CREATE TABLE BehaviorModel_behaviorElement_BehaviorElement (
	__IDBehaviorModel__ Integer NOT NULL,
	__IDBehaviorElement__ Integer NOT NULL
) ;

CREATE TABLE ActionElement_actionGroup_ActionGroup (
	__IDActionElement__ Integer NOT NULL,
	__IDActionGroup__ Integer NOT NULL
) ;

CREATE TABLE Stereotype_extendedElement_ModelElement (
	__IDStereotype__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE KDMModelRoot_structureModel_StructureModel (
	__IDKDMModelRoot__ Integer NOT NULL,
	__IDStructureModel__ Integer NOT NULL
) ;

CREATE TABLE DeployedResource_instance_ResourceInstance (
	__IDDeployedResource__ Integer NOT NULL,
	__IDResourceInstance__ Integer NOT NULL
) ;

CREATE TABLE StructureModel_structureElement_StructureElement (
	__IDStructureModel__ Integer NOT NULL,
	__IDStructureElement__ Integer NOT NULL
) ;

CREATE TABLE BehaviorElement_behaviorGroup_BehaviorGroup (
	__IDBehaviorElement__ Integer NOT NULL,
	__IDBehaviorGroup__ Integer NOT NULL
) ;

CREATE TABLE CodeResource_outImplementation_ImplementationOf (
	__IDCodeResource__ Integer NOT NULL,
	__IDImplementationOf__ Integer NOT NULL
) ;

CREATE TABLE SourceRef_region_SourceRegion (
	__IDSourceRef__ Integer NOT NULL,
	__IDSourceRegion__ Integer NOT NULL
) ;

CREATE TABLE KDMModelRoot_uiModel_UIModel (
	__IDKDMModelRoot__ Integer NOT NULL,
	__IDUIModel__ Integer NOT NULL
) ;

CREATE TABLE TypeElement_inHasType_HasType (
	__IDTypeElement__ Integer NOT NULL,
	__IDHasType__ Integer NOT NULL
) ;

CREATE TABLE ActionElement_outReads_Reads (
	__IDActionElement__ Integer NOT NULL,
	__IDReads__ Integer NOT NULL
) ;

CREATE TABLE ActionElement_outCreates_Creates (
	__IDActionElement__ Integer NOT NULL,
	__IDCreates__ Integer NOT NULL
) ;

CREATE TABLE Interface_type_TypeElement (
	__IDInterface__ Integer NOT NULL,
	__IDTypeElement__ Integer NOT NULL
) ;

CREATE TABLE Machine_component_DeployedComponent (
	__IDMachine__ Integer NOT NULL,
	__IDDeployedComponent__ Integer NOT NULL
) ;

CREATE TABLE StructureGroup_codeElement_CodeResource (
	__IDStructureGroup__ Integer NOT NULL,
	__IDCodeResource__ Integer NOT NULL
) ;

CREATE TABLE PlatformModel_relation_PlatformRelationship (
	__IDPlatformModel__ Integer NOT NULL,
	__IDPlatformRelationship__ Integer NOT NULL
) ;

CREATE TABLE BuildModel_relation_BuildRelationship (
	__IDBuildModel__ Integer NOT NULL,
	__IDBuildRelationship__ Integer NOT NULL
) ;

CREATE TABLE KDMModelRoot_behaviorModel_BehaviorModel (
	__IDKDMModelRoot__ Integer NOT NULL,
	__IDBehaviorModel__ Integer NOT NULL
) ;

CREATE TABLE ResourceInstance_inUses_Uses (
	__IDResourceInstance__ Integer NOT NULL,
	__IDUses__ Integer NOT NULL
) ;

CREATE TABLE LoadingService_outLoads_Loads (
	__IDLoadingService__ Integer NOT NULL,
	__IDLoads__ Integer NOT NULL
) ;

CREATE TABLE ClassUnit_constructor_ConstructorUnit (
	__IDClassUnit__ Integer NOT NULL,
	__IDConstructorUnit__ Integer NOT NULL
) ;

CREATE TABLE TemplateInstance_outInstantiates_Instantiates (
	__IDTemplateInstance__ Integer NOT NULL,
	__IDInstantiates__ Integer NOT NULL
) ;

CREATE TABLE Signature_inImplementation_ImplementationOf (
	__IDSignature__ Integer NOT NULL,
	__IDImplementationOf__ Integer NOT NULL
) ;

CREATE TABLE CodeGroup_codeElement_CodeResource (
	__IDCodeGroup__ Integer NOT NULL,
	__IDCodeResource__ Integer NOT NULL
) ;

CREATE TABLE StructureGroup_structureElement_StructureElement (
	__IDStructureGroup__ Integer NOT NULL,
	__IDStructureElement__ Integer NOT NULL
) ;

CREATE TABLE Process_thread_Thread (
	__IDProcess__ Integer NOT NULL,
	__IDThread__ Integer NOT NULL
) ;

CREATE TABLE ClassUnit_operator_OperatorUnit (
	__IDClassUnit__ Integer NOT NULL,
	__IDOperatorUnit__ Integer NOT NULL
) ;

CREATE TABLE ClassUnit_method_MethodUnit (
	__IDClassUnit__ Integer NOT NULL,
	__IDMethodUnit__ Integer NOT NULL
) ;

CREATE TABLE UIContainer_uiElement_UIElement (
	__IDUIContainer__ Integer NOT NULL,
	__IDUIElement__ Integer NOT NULL
) ;

CREATE TABLE Stereotype_tag_TagDefinition (
	__IDStereotype__ Integer NOT NULL,
	__IDTagDefinition__ Integer NOT NULL
) ;

CREATE TABLE BehaviorContainer_behaviorElement_BehaviorElement (
	__IDBehaviorContainer__ Integer NOT NULL,
	__IDBehaviorElement__ Integer NOT NULL
) ;

CREATE TABLE TemplateUnit_inInstantiates_Instantiates (
	__IDTemplateUnit__ Integer NOT NULL,
	__IDInstantiates__ Integer NOT NULL
) ;

CREATE TABLE Interface_inImplements_Implements (
	__IDInterface__ Integer NOT NULL,
	__IDImplements__ Integer NOT NULL
) ;

CREATE TABLE UniqueKey_inKey_KeyRelation (
	__IDUniqueKey__ Integer NOT NULL,
	__IDKeyRelation__ Integer NOT NULL
) ;

CREATE TABLE EventGroup_eventElement_EventElement (
	__IDEventGroup__ Integer NOT NULL,
	__IDEventElement__ Integer NOT NULL
) ;

CREATE TABLE KDMRoot_segment_KDMSegment (
	__IDKDMRoot__ Integer NOT NULL,
	__IDKDMSegment__ Integer NOT NULL
) ;

CREATE TABLE BuildElement_buildGroup_BuildGroup (
	__IDBuildElement__ Integer NOT NULL,
	__IDBuildGroup__ Integer NOT NULL
) ;

CREATE TABLE UIContainer_event_UIEvent (
	__IDUIContainer__ Integer NOT NULL,
	__IDUIEvent__ Integer NOT NULL
) ;

CREATE TABLE BuildElement_outDependsOn_DependsOn (
	__IDBuildElement__ Integer NOT NULL,
	__IDDependsOn__ Integer NOT NULL
) ;

CREATE TABLE TemplateUnit_parameter_TemplateParameter (
	__IDTemplateUnit__ Integer NOT NULL,
	__IDTemplateParameter__ Integer NOT NULL
) ;

CREATE TABLE RecordFile_index_Index (
	__IDRecordFile__ Integer NOT NULL,
	__IDIndex__ Integer NOT NULL
) ;

CREATE TABLE DeployedResource_element_ResourceElement (
	__IDDeployedResource__ Integer NOT NULL,
	__IDResourceElement__ Integer NOT NULL
) ;

CREATE TABLE ExternalActor_outUses_Uses (
	__IDExternalActor__ Integer NOT NULL,
	__IDUses__ Integer NOT NULL
) ;

CREATE TABLE DataElement_dataGroup_DataGroup (
	__IDDataElement__ Integer NOT NULL,
	__IDDataGroup__ Integer NOT NULL
) ;

CREATE TABLE ModelElement_taggedValue_TaggedValue (
	__IDModelElement__ Integer NOT NULL,
	__IDTaggedValue__ Integer NOT NULL
) ;

CREATE TABLE ConceptualGroup_conceptualElement_ConceptualElement (
	__IDConceptualGroup__ Integer NOT NULL,
	__IDConceptualElement__ Integer NOT NULL
) ;

CREATE TABLE ResourceType_instance_ResourceInstance (
	__IDResourceType__ Integer NOT NULL,
	__IDResourceInstance__ Integer NOT NULL
) ;

CREATE TABLE CodeModel_codeElement_CodeElement (
	__IDCodeModel__ Integer NOT NULL,
	__IDCodeElement__ Integer NOT NULL
) ;

CREATE TABLE RuntimeElement_runtimeGroup_RuntimeGroup (
	__IDRuntimeElement__ Integer NOT NULL,
	__IDRuntimeGroup__ Integer NOT NULL
) ;

CREATE TABLE StructureContainer_structureElement_StructureElement (
	__IDStructureContainer__ Integer NOT NULL,
	__IDStructureElement__ Integer NOT NULL
) ;

CREATE TABLE CallableElement_codeElement_CodeElement (
	__IDCallableElement__ Integer NOT NULL,
	__IDCodeElement__ Integer NOT NULL
) ;

CREATE TABLE DataGroup_dataElement_DataElement (
	__IDDataGroup__ Integer NOT NULL,
	__IDDataElement__ Integer NOT NULL
) ;

CREATE TABLE DeployedSoftwareSystem_component_DeployedComponent (
	__IDDeployedSoftwareSystem__ Integer NOT NULL,
	__IDDeployedComponent__ Integer NOT NULL
) ;

CREATE TABLE RecordFile_record_CompositeTypeElement (
	__IDRecordFile__ Integer NOT NULL,
	__IDCompositeTypeElement__ Integer NOT NULL
) ;

CREATE TABLE BehaviorGroup_behaviorElement_BehaviorElement (
	__IDBehaviorGroup__ Integer NOT NULL,
	__IDBehaviorElement__ Integer NOT NULL
) ;

CREATE TABLE ActionElement_outDestroys_Destroys (
	__IDActionElement__ Integer NOT NULL,
	__IDDestroys__ Integer NOT NULL
) ;

CREATE TABLE BuildElement_inTransformsInto_TransformsInto (
	__IDBuildElement__ Integer NOT NULL,
	__IDTransformsInto__ Integer NOT NULL
) ;

CREATE TABLE ConceptualGroup_definition_ProgramElement (
	__IDConceptualGroup__ Integer NOT NULL,
	__IDProgramElement__ Integer NOT NULL
) ;

CREATE TABLE Process_component_DeployedComponent (
	__IDProcess__ Integer NOT NULL,
	__IDDeployedComponent__ Integer NOT NULL
) ;

CREATE TABLE CodeResource_outHasType_HasType (
	__IDCodeResource__ Integer NOT NULL,
	__IDHasType__ Integer NOT NULL
) ;

CREATE TABLE DBSchema_columnSet_ColumnSet (
	__IDDBSchema__ Integer NOT NULL,
	__IDColumnSet__ Integer NOT NULL
) ;

CREATE TABLE EventContainer_eventElement_EventElement (
	__IDEventContainer__ Integer NOT NULL,
	__IDEventElement__ Integer NOT NULL
) ;

CREATE TABLE KDMModelRoot_eventModel_EventModel (
	__IDKDMModelRoot__ Integer NOT NULL,
	__IDEventModel__ Integer NOT NULL
) ;

CREATE TABLE MacroUnit_codeElement_CodeElement (
	__IDMacroUnit__ Integer NOT NULL,
	__IDCodeElement__ Integer NOT NULL
) ;

CREATE TABLE BehaviorGroup_actionElement_ActionElement (
	__IDBehaviorGroup__ Integer NOT NULL,
	__IDActionElement__ Integer NOT NULL
) ;

CREATE TABLE Interface_signature_TypeElement (
	__IDInterface__ Integer NOT NULL,
	__IDTypeElement__ Integer NOT NULL
) ;

CREATE TABLE UIModel_uiElement_UIElement (
	__IDUIModel__ Integer NOT NULL,
	__IDUIElement__ Integer NOT NULL
) ;

CREATE TABLE ActionGroup_actionElement_ActionElement (
	__IDActionGroup__ Integer NOT NULL,
	__IDActionElement__ Integer NOT NULL
) ;

CREATE TABLE ResourceInstance_outResource_BindsResource (
	__IDResourceInstance__ Integer NOT NULL,
	__IDBindsResource__ Integer NOT NULL
) ;

CREATE TABLE CodeResource_inInstanceOf_InstanceOf (
	__IDCodeResource__ Integer NOT NULL,
	__IDInstanceOf__ Integer NOT NULL
) ;

CREATE TABLE ClassUnit_member_TypeElement (
	__IDClassUnit__ Integer NOT NULL,
	__IDTypeElement__ Integer NOT NULL
) ;

CREATE TABLE KDMExtensionFamily_stereotype_Stereotype (
	__IDKDMExtensionFamily__ Integer NOT NULL,
	__IDStereotype__ Integer NOT NULL
) ;

CREATE TABLE ActionElement_outUsesType_UsesType (
	__IDActionElement__ Integer NOT NULL,
	__IDUsesType__ Integer NOT NULL
) ;

CREATE TABLE ReferenceKey_outKey_KeyRelation (
	__IDReferenceKey__ Integer NOT NULL,
	__IDKeyRelation__ Integer NOT NULL
) ;

CREATE TABLE TypeElement_inExtends_Extends (
	__IDTypeElement__ Integer NOT NULL,
	__IDExtends__ Integer NOT NULL
) ;

CREATE TABLE ActionElement_outExpands_Expands (
	__IDActionElement__ Integer NOT NULL,
	__IDExpands__ Integer NOT NULL
) ;

CREATE TABLE CodeResource_inVisible_VisibleIn (
	__IDCodeResource__ Integer NOT NULL,
	__IDVisibleIn__ Integer NOT NULL
) ;

CREATE TABLE CodeResource_outInterface_Implements (
	__IDCodeResource__ Integer NOT NULL,
	__IDImplements__ Integer NOT NULL
) ;

CREATE TABLE EventElement_eventGroup_EventGroup (
	__IDEventElement__ Integer NOT NULL,
	__IDEventGroup__ Integer NOT NULL
) ;

CREATE TABLE UIElement_uiGroup_UIGroup (
	__IDUIElement__ Integer NOT NULL,
	__IDUIGroup__ Integer NOT NULL
) ;

CREATE TABLE DBSchema_procedure_StoredProcedure (
	__IDDBSchema__ Integer NOT NULL,
	__IDStoredProcedure__ Integer NOT NULL
) ;
