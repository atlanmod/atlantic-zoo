( defstruct ActionElement )
( defstruct AbstractActionRelationship )
( defstruct ControlFlow :to :from )
( defstruct Calls :to :from )
( defstruct Creates :to :from )
( defstruct Reads :to :from )
( defstruct Writes :to :from )
( defstruct CompliesTo :to :from )
( defstruct Flow :to :from )
( defstruct TrueFlow :to :from )
( defstruct FalseFlow :to :from )
( defstruct GuardedFlow :to :from )
( defstruct UsesType :to :from )
( defstruct Addresses :to :from )
( defstruct ActionRelationship :to :from )
( defstruct Throws :to :from )
( defstruct Dispatches :to :from )
( defstruct EntryFlow :to :from )
( defstruct BlockUnit )
( defstruct ExceptionUnit )
( defstruct TryUnit )
( defstruct FinallyUnit )
( defstruct CatchUnit )
( defstruct ExitFlow :to :from )
( defstruct ExceptionFlow :to :from )
( defstruct AbstractBuildElement )
( defstruct BuildResource )
( defstruct BuildDescription )
( defstruct SymbolicLink )
( defstruct AbstractBuildRelationship )
( defstruct LinksTo :to :from )
( defstruct Consumes :to :from )
( defstruct BuildModel )
( defstruct BuildComponent )
( defstruct Supplier )
( defstruct Tool )
( defstruct BuildElement )
( defstruct BuildRelationship :to :from )
( defstruct SuppliedBy :to :from )
( defstruct Library )
( defstruct BuildStep )
( defstruct Produces :to :from )
( defstruct SupportedBy :to :from )
( defstruct BuildProduct )
( defstruct DescribedBy :to :from )
( defstruct AbstractCodeElement )
( defstruct CodeItem )
( defstruct ComputationalObject )
( defstruct ControlElement )
( defstruct MethodUnit )
( defstruct Module )
( defstruct CodeAssembly )
( defstruct CallableUnit )
( defstruct Datatype )
( defstruct TemplateUnit )
( defstruct TemplateParameter )
( defstruct AbstractCodeRelationship )
( defstruct InstanceOf :to :from )
( defstruct CompilationUnit )
( defstruct CodeModel )
( defstruct DerivedType :itemUnit )
( defstruct ArrayType :indexUnit :itemUnit )
( defstruct PrimitiveType )
( defstruct BooleanType )
( defstruct CharType )
( defstruct ClassUnit )
( defstruct CompositeType )
( defstruct RecordType )
( defstruct EnumeratedType )
( defstruct Extends :to :from )
( defstruct ScaledType )
( defstruct FloatType )
( defstruct HasType :to :from )
( defstruct ImplementationOf :to :from )
( defstruct Implements :to :from )
( defstruct IntegerType )
( defstruct InterfaceUnit )
( defstruct PointerType :itemUnit )
( defstruct DefinedType :type )
( defstruct TypeUnit :type )
( defstruct RangeType :itemUnit )
( defstruct Signature )
( defstruct DataElement :type )
( defstruct StringType )
( defstruct ChoiceType )
( defstruct NamespaceUnit )
( defstruct VisibleIn :to :from )
( defstruct CommentUnit )
( defstruct SharedUnit )
( defstruct DecimalType )
( defstruct DateType )
( defstruct TimeType )
( defstruct VoidType )
( defstruct ValueElement :type )
( defstruct Value :type )
( defstruct ValueList :type )
( defstruct StorableUnit :type )
( defstruct MemberUnit :type )
( defstruct ParameterUnit :type )
( defstruct ItemUnit :type )
( defstruct IndexUnit :type )
( defstruct SynonymType :type )
( defstruct SequenceType :itemUnit )
( defstruct BagType :itemUnit )
( defstruct SetType :itemUnit )
( defstruct CodeElement )
( defstruct CodeRelationship :to :from )
( defstruct LanguageUnit )
( defstruct OrdinalType )
( defstruct BitstringType )
( defstruct OctetType )
( defstruct OctetstringType )
( defstruct BitType )
( defstruct Imports :to :from )
( defstruct Package )
( defstruct ParameterTo :to :from )
( defstruct TemplateType )
( defstruct PreprocessorDirective )
( defstruct MacroDirective )
( defstruct MacroUnit )
( defstruct ConditionalDirective )
( defstruct IncludeDirective )
( defstruct VariantTo :to :from )
( defstruct Expands :to :from )
( defstruct Redefines :to :from )
( defstruct GeneratedFrom :to :from )
( defstruct Includes :to :from )
( defstruct HasValue :to :from )
( defstruct ConceptualModel )
( defstruct AbstractConceptualElement )
( defstruct TermUnit )
( defstruct ConceptualContainer )
( defstruct FactUnit )
( defstruct AbstractConceptualRelationship )
( defstruct ConceptualRelationship :to :from )
( defstruct BehaviorUnit )
( defstruct RuleUnit )
( defstruct ScenarioUnit )
( defstruct ConceptualFlow :to :from )
( defstruct ConceptualElement )
( defstruct ConceptualRole :conceptualElement )
( defstruct Element )
( defstruct ModelElement )
( defstruct KDMEntity )
( defstruct KDMRelationship )
( defstruct AggregatedRelationship :from :to )
( defstruct DataModel )
( defstruct AbstractDataElement )
( defstruct DataResource )
( defstruct IndexElement )
( defstruct UniqueKey )
( defstruct Index )
( defstruct AbstractDataRelationship )
( defstruct KeyRelation :to :from )
( defstruct ReferenceKey )
( defstruct DataContainer )
( defstruct Catalog )
( defstruct RelationalSchema )
( defstruct ColumnSet )
( defstruct RelationalTable )
( defstruct RelationalView )
( defstruct RecordFile )
( defstruct DataEvent )
( defstruct XMLSchema )
( defstruct AbstractContentElement )
( defstruct ComplexContentType )
( defstruct AllContent )
( defstruct SeqContent )
( defstruct ChoiceContent )
( defstruct ContentItem )
( defstruct GroupContent )
( defstruct ContentRestriction )
( defstruct SimpleContentType )
( defstruct ExtendedDataElement )
( defstruct DataRelationship :to :from )
( defstruct MixedContent )
( defstruct ContentReference )
( defstruct DataAction )
( defstruct ReadsColumnSet :to :from )
( defstruct ContentAttribute )
( defstruct TypedBy :to :from )
( defstruct ReferenceTo :to :from )
( defstruct RestrictionOf :to :from )
( defstruct ExtensionTo :to :from )
( defstruct DatatypeOf :to :from )
( defstruct HasContent :to :from )
( defstruct WritesColumnSet :to :from )
( defstruct ProducesDataEvent :to :from )
( defstruct DataSegment )
( defstruct ContentElement )
( defstruct ManagesData :to :from )
( defstruct EventModel )
( defstruct AbstractEventElement )
( defstruct Event )
( defstruct AbstractEventRelationship )
( defstruct EventRelationship :to :from )
( defstruct EventResource )
( defstruct State )
( defstruct Transition )
( defstruct OnEntry )
( defstruct OnExit )
( defstruct EventAction )
( defstruct ReadsState :to :from )
( defstruct ProducesEvent :to :from )
( defstruct ConsumesEvent :to :from )
( defstruct NextState :to :from )
( defstruct InitialState )
( defstruct EventElement )
( defstruct HasState :to :from )
( defstruct SourceRef )
( defstruct SourceRegion )
( defstruct InventoryModel )
( defstruct AbstractInventoryElement )
( defstruct InventoryItem )
( defstruct SourceFile )
( defstruct Image )
( defstruct ResourceDescription )
( defstruct Configuration )
( defstruct InventoryContainer )
( defstruct Directory )
( defstruct Project )
( defstruct AbstractInventoryRelationship )
( defstruct BinaryFile )
( defstruct ExecutableFile )
( defstruct DependsOn :to :from )
( defstruct InventoryElement )
( defstruct InventoryRelationship :to :from )
( defstruct AbstractPlatformElement )
( defstruct PlatformModel )
( defstruct AbstractPlatformRelationship )
( defstruct Requires :to :from )
( defstruct ResourceType )
( defstruct NamingResource )
( defstruct MarshalledResource )
( defstruct MessagingResource )
( defstruct FileResource )
( defstruct ExecutionResource )
( defstruct PlatformAction )
( defstruct ExternalActor )
( defstruct DataManager )
( defstruct BindsTo :to :from )
( defstruct PlatformElement )
( defstruct PlatformRelationship :to :from )
( defstruct PlatformEvent )
( defstruct LockResource )
( defstruct DeployedSoftwareSystem )
( defstruct Machine )
( defstruct DeployedComponent )
( defstruct DeployedResource )
( defstruct Loads :to :from )
( defstruct Spawns :to :from )
( defstruct RuntimeResource )
( defstruct Thread )
( defstruct Process )
( defstruct ReadsResource :to :from )
( defstruct WritesResource :to :from )
( defstruct ManagesResource :to :from )
( defstruct DefinedBy :to :from )
( defstruct StreamResource )
( defstruct AbstractStructureElement )
( defstruct Subsystem )
( defstruct Layer )
( defstruct StructureModel )
( defstruct Component )
( defstruct SoftwareSystem )
( defstruct AbstractStructureRelationship )
( defstruct StructureRelationship :to :from )
( defstruct ArchitectureView )
( defstruct StructureElement )
( defstruct KDMFramework )
( defstruct KDMModel )
( defstruct Audit )
( defstruct Segment )
( defstruct Attribute )
( defstruct Annotation )
( defstruct TagDefinition )
( defstruct ExtendedValue :tag )
( defstruct Stereotype )
( defstruct ExtensionFamily )
( defstruct TaggedRef :reference :tag )
( defstruct TaggedValue :tag )
( defstruct AbstractUIElement )
( defstruct UIResource )
( defstruct UIDisplay )
( defstruct Screen )
( defstruct Report )
( defstruct UIModel )
( defstruct AbstractUIRelationship )
( defstruct UILayout :to :from )
( defstruct UIField )
( defstruct DisplaysImage :to :from )
( defstruct Displays :to :from )
( defstruct UIFlow :to :from )
( defstruct UIElement )
( defstruct UIRelationship :to :from )
( defstruct UIAction )
( defstruct UIEvent )
( defstruct ReadsUI :to :from )
( defstruct WritesUI :to :from )
( defstruct ManagesUI :to :from )