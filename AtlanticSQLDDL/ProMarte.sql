CREATE TABLE TimeBase (
	__IDTimeBase__ Integer NOT NULL,
	name text,
	PRIMARY KEY TimeBase (__IDTimeBase__)
) ;

CREATE TABLE Instant (
	__IDInstant__ Integer NOT NULL,
	isBefore Boolean,
	FOREIGN KEY owner (__FKowner__) REFERENCES TimeBase (__IDTimeBase__),
	FOREIGN KEY timeValue (__FKtimeValue__) REFERENCES TimeValue (__IDTimeValue__),
	PRIMARY KEY Instant (__IDInstant__),
	__FKowner__ Integer,
	__FKtimeValue__ Integer
) ;

CREATE TABLE TimeValue (
	__IDTimeValue__ Integer NOT NULL,
	FOREIGN KEY ref (__FKref__) REFERENCES TimeBase (__IDTimeBase__),
	PRIMARY KEY TimeValue (__IDTimeValue__),
	__FKref__ Integer
) ;

CREATE TABLE TimeInterval (
	__IDTimeInterval__ Integer NOT NULL,
	PRIMARY KEY TimeInterval (__IDTimeInterval__)
) ;

CREATE TABLE "Interval" (
	__IDInterval__ Integer NOT NULL,
	includingMin Boolean,
	includingMax Boolean,
	FOREIGN KEY base (__FKbase__) REFERENCES TimeBase (__IDTimeBase__),
	FOREIGN KEY timeInterval (__FKtimeInterval__) REFERENCES TimeInterval (__IDTimeInterval__),
	PRIMARY KEY "Interval" (__IDInterval__),
	__FKbase__ Integer,
	__FKtimeInterval__ Integer
) ;

CREATE TABLE SingleTimeBase (
	__IDSingleTimeBase__ Integer NOT NULL,
	FOREIGN KEY currentValue (__FKcurrentValue__) REFERENCES SingleTimeValue (__IDSingleTimeValue__),
	FOREIGN KEY maximumValue (__FKmaximumValue__) REFERENCES SingleTimeValue (__IDSingleTimeValue__),
	FOREIGN KEY currentInstant (__FKcurrentInstant__) REFERENCES SingleInstant (__IDSingleInstant__),
	PRIMARY KEY SingleTimeBase (__IDSingleTimeBase__),
	__FKcurrentValue__ Integer,
	__FKmaximumValue__ Integer,
	__FKcurrentInstant__ Integer
) ;

CREATE TABLE SingleInstant (
	__IDSingleInstant__ Integer NOT NULL,
	FOREIGN KEY coPoint (__FKcoPoint__) REFERENCES CoincidencePoint (__IDCoincidencePoint__),
	PRIMARY KEY SingleInstant (__IDSingleInstant__),
	__FKcoPoint__ Integer
) ;

CREATE TABLE SingleInterval (
	__IDSingleInterval__ Integer NOT NULL,
	FOREIGN KEY first (__FKfirst__) REFERENCES SingleInstant (__IDSingleInstant__),
	FOREIGN KEY last (__FKlast__) REFERENCES SingleInstant (__IDSingleInstant__),
	PRIMARY KEY SingleInterval (__IDSingleInterval__),
	__FKfirst__ Integer,
	__FKlast__ Integer
) ;

CREATE TABLE SingleTimeValue (
	__IDSingleTimeValue__ Integer NOT NULL,
	PRIMARY KEY SingleTimeValue (__IDSingleTimeValue__)
) ;

CREATE TABLE SingleTimeInterval (
	__IDSingleTimeInterval__ Integer NOT NULL,
	FOREIGN KEY start (__FKstart__) REFERENCES SingleTimeValue (__IDSingleTimeValue__),
	FOREIGN KEY end (__FKend__) REFERENCES SingleTimeValue (__IDSingleTimeValue__),
	PRIMARY KEY SingleTimeInterval (__IDSingleTimeInterval__),
	__FKstart__ Integer,
	__FKend__ Integer
) ;

CREATE TABLE DiscreteTimeBase (
	__IDDiscreteTimeBase__ Integer NOT NULL,
	FOREIGN KEY refEvent (__FKrefEvent__) REFERENCES Event (__IDEvent__),
	PRIMARY KEY DiscreteTimeBase (__IDDiscreteTimeBase__),
	__FKrefEvent__ Integer
) ;

CREATE TABLE DiscreteInstant (
	__IDDiscreteInstant__ Integer NOT NULL,
	FOREIGN KEY next (__FKnext__) REFERENCES DiscreteInstant (__IDDiscreteInstant__),
	FOREIGN KEY previous (__FKprevious__) REFERENCES DiscreteInstant (__IDDiscreteInstant__),
	FOREIGN KEY refOcc (__FKrefOcc__) REFERENCES EventOccurence (__IDEventOccurence__),
	PRIMARY KEY DiscreteInstant (__IDDiscreteInstant__),
	__FKnext__ Integer,
	__FKprevious__ Integer,
	__FKrefOcc__ Integer
) ;

CREATE TABLE Event (
	__IDEvent__ Integer NOT NULL,
	PRIMARY KEY Event (__IDEvent__)
) ;

CREATE TABLE EventOccurence (
	__IDEventOccurence__ Integer NOT NULL,
	PRIMARY KEY EventOccurence (__IDEventOccurence__)
) ;

CREATE TABLE PhysicalTime (
	__IDPhysicalTime__ Integer NOT NULL,
	PRIMARY KEY PhysicalTime (__IDPhysicalTime__)
) ;

CREATE TABLE PhysicalInstant (
	__IDPhysicalInstant__ Integer NOT NULL,
	PRIMARY KEY PhysicalInstant (__IDPhysicalInstant__)
) ;

CREATE TABLE Duration (
	__IDDuration__ Integer NOT NULL,
	FOREIGN KEY start (__FKstart__) REFERENCES PhysicalInstant (__IDPhysicalInstant__),
	FOREIGN KEY end (__FKend__) REFERENCES PhysicalInstant (__IDPhysicalInstant__),
	PRIMARY KEY Duration (__IDDuration__),
	__FKstart__ Integer,
	__FKend__ Integer
) ;

CREATE TABLE MultipleTimeBase (
	__IDMultipleTimeBase__ Integer NOT NULL,
	PRIMARY KEY MultipleTimeBase (__IDMultipleTimeBase__)
) ;

CREATE TABLE CoincidencePoint (
	__IDCoincidencePoint__ Integer NOT NULL,
	PRIMARY KEY CoincidencePoint (__IDCoincidencePoint__)
) ;

CREATE TABLE MultipleInterval (
	__IDMultipleInterval__ Integer NOT NULL,
	PRIMARY KEY MultipleInterval (__IDMultipleInterval__)
) ;

CREATE TABLE MultipleTimeValue (
	__IDMultipleTimeValue__ Integer NOT NULL,
	PRIMARY KEY MultipleTimeValue (__IDMultipleTimeValue__)
) ;

CREATE TABLE MetricTimeValue (
	__IDMetricTimeValue__ Integer NOT NULL,
	PRIMARY KEY MetricTimeValue (__IDMetricTimeValue__)
) ;

CREATE TABLE DiscreteTimeValue (
	__IDDiscreteTimeValue__ Integer NOT NULL,
	PRIMARY KEY DiscreteTimeValue (__IDDiscreteTimeValue__)
) ;

CREATE TABLE MetricTimeInterval (
	__IDMetricTimeInterval__ Integer NOT NULL,
	PRIMARY KEY MetricTimeInterval (__IDMetricTimeInterval__)
) ;

CREATE TABLE DiscreteTimeInterval (
	__IDDiscreteTimeInterval__ Integer NOT NULL,
	PRIMARY KEY DiscreteTimeInterval (__IDDiscreteTimeInterval__)
) ;

CREATE TABLE SimultaneousEventOccurrence (
	__IDSimultaneousEventOccurrence__ Integer NOT NULL,
	FOREIGN KEY at (__FKat__) REFERENCES Instant (__IDInstant__),
	PRIMARY KEY SimultaneousEventOccurrence (__IDSimultaneousEventOccurrence__),
	__FKat__ Integer
) ;

CREATE TABLE TimedEvent (
	__IDTimedEvent__ Integer NOT NULL,
	PRIMARY KEY TimedEvent (__IDTimedEvent__)
) ;

CREATE TABLE TimedEventOccurence (
	__IDTimedEventOccurence__ Integer NOT NULL,
	FOREIGN KEY at (__FKat__) REFERENCES Instant (__IDInstant__),
	FOREIGN KEY timestamp (__FKtimestamp__) REFERENCES TimeValue (__IDTimeValue__),
	PRIMARY KEY TimedEventOccurence (__IDTimedEventOccurence__),
	__FKat__ Integer,
	__FKtimestamp__ Integer
) ;

CREATE TABLE TimedAction (
	__IDTimedAction__ Integer NOT NULL,
	PRIMARY KEY TimedAction (__IDTimedAction__)
) ;

CREATE TABLE Delay (
	__IDDelay__ Integer NOT NULL,
	PRIMARY KEY Delay (__IDDelay__)
) ;

CREATE TABLE TimingMechanism (
	__IDTimingMechanism__ Integer NOT NULL,
	stability text,
	drift text,
	skew text,
	FOREIGN KEY origin (__FKorigin__) REFERENCES TimedEvent (__IDTimedEvent__),
	FOREIGN KEY resolution (__FKresolution__) REFERENCES MetricTimeInterval (__IDMetricTimeInterval__),
	FOREIGN KEY refClock (__FKrefClock__) REFERENCES Clock (__IDClock__),
	state text,
	PRIMARY KEY TimingMechanism (__IDTimingMechanism__),
	__FKorigin__ Integer,
	__FKresolution__ Integer,
	__FKrefClock__ Integer
) ;

CREATE TABLE Clock (
	__IDClock__ Integer NOT NULL,
	FOREIGN KEY accuracy (__FKaccuracy__) REFERENCES MetricTimeInterval (__IDMetricTimeInterval__),
	FOREIGN KEY offset (__FKoffset__) REFERENCES MetricTimeInterval (__IDMetricTimeInterval__),
	PRIMARY KEY Clock (__IDClock__),
	__FKaccuracy__ Integer,
	__FKoffset__ Integer
) ;

CREATE TABLE Timer (
	__IDTimer__ Integer NOT NULL,
	isPeriodic Boolean,
	FOREIGN KEY duration (__FKduration__) REFERENCES MetricTimeValue (__IDMetricTimeValue__),
	PRIMARY KEY Timer (__IDTimer__),
	__FKduration__ Integer
) ;

CREATE TABLE TimeOut (
	__IDTimeOut__ Integer NOT NULL,
	PRIMARY KEY TimeOut (__IDTimeOut__)
) ;

CREATE TABLE ClockInterrupt (
	__IDClockInterrupt__ Integer NOT NULL,
	PRIMARY KEY ClockInterrupt (__IDClockInterrupt__)
) ;

CREATE TABLE System (
	__IDSystem__ Integer NOT NULL,
	PRIMARY KEY System (__IDSystem__)
) ;

CREATE TABLE Model (
	__IDModel__ Integer NOT NULL,
	PRIMARY KEY Model (__IDModel__)
) ;

CREATE TABLE AnnotatedModel (
	__IDAnnotatedModel__ Integer NOT NULL,
	PRIMARY KEY AnnotatedModel (__IDAnnotatedModel__)
) ;

CREATE TABLE ModelElement (
	__IDModelElement__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES Model (__IDModel__),
	PRIMARY KEY ModelElement (__IDModelElement__),
	__FKowner__ Integer
) ;

CREATE TABLE AnnotatedModelElement (
	__IDAnnotatedModelElement__ Integer NOT NULL,
	PRIMARY KEY AnnotatedModelElement (__IDAnnotatedModelElement__)
) ;

CREATE TABLE NFP (
	__IDNFP__ Integer NOT NULL,
	FOREIGN KEY measurementQuantity (__FKmeasurementQuantity__) REFERENCES Quantity (__IDQuantity__),
	FOREIGN KEY groupedBy (__FKgroupedBy__) REFERENCES NFPCategory (__IDNFPCategory__),
	PRIMARY KEY NFP (__IDNFP__),
	__FKmeasurementQuantity__ Integer,
	__FKgroupedBy__ Integer
) ;

CREATE TABLE NFPLibrary (
	__IDNFPLibrary__ Integer NOT NULL,
	PRIMARY KEY NFPLibrary (__IDNFPLibrary__)
) ;

CREATE TABLE NFPCategory (
	__IDNFPCategory__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES NFPCategory (__IDNFPCategory__),
	PRIMARY KEY NFPCategory (__IDNFPCategory__),
	__FKowner__ Integer
) ;

CREATE TABLE ModelingConcern (
	__IDModelingConcern__ Integer NOT NULL,
	FOREIGN KEY annotedModel (__FKannotedModel__) REFERENCES AnnotatedModel (__IDAnnotatedModel__),
	PRIMARY KEY ModelingConcern (__IDModelingConcern__),
	__FKannotedModel__ Integer
) ;

CREATE TABLE AnalysisConcern (
	__IDAnalysisConcern__ Integer NOT NULL,
	PRIMARY KEY AnalysisConcern (__IDAnalysisConcern__)
) ;

CREATE TABLE DesignConcern (
	__IDDesignConcern__ Integer NOT NULL,
	PRIMARY KEY DesignConcern (__IDDesignConcern__)
) ;

CREATE TABLE Quantity (
	__IDQuantity__ Integer NOT NULL,
	PRIMARY KEY Quantity (__IDQuantity__)
) ;

CREATE TABLE BasicQuantity (
	__IDBasicQuantity__ Integer NOT NULL,
	PRIMARY KEY BasicQuantity (__IDBasicQuantity__)
) ;

CREATE TABLE DerivedQuantity (
	__IDDerivedQuantity__ Integer NOT NULL,
	PRIMARY KEY DerivedQuantity (__IDDerivedQuantity__)
) ;

CREATE TABLE QualitativeNFP (
	__IDQualitativeNFP__ Integer NOT NULL,
	PRIMARY KEY QualitativeNFP (__IDQualitativeNFP__)
) ;

CREATE TABLE QuantitativeNFP (
	__IDQuantitativeNFP__ Integer NOT NULL,
	PRIMARY KEY QuantitativeNFP (__IDQuantitativeNFP__)
) ;

CREATE TABLE Realization (
	__IDRealization__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES QuantitativeNFP (__IDQuantitativeNFP__),
	PRIMARY KEY Realization (__IDRealization__),
	__FKowner__ Integer
) ;

CREATE TABLE Measure (
	__IDMeasure__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES QuantitativeNFP (__IDQuantitativeNFP__),
	PRIMARY KEY Measure (__IDMeasure__),
	__FKowner__ Integer
) ;

CREATE TABLE ComplexNFP (
	__IDComplexNFP__ Integer NOT NULL,
	PRIMARY KEY ComplexNFP (__IDComplexNFP__)
) ;

CREATE TABLE BasicNFP (
	__IDBasicNFP__ Integer NOT NULL,
	statisticalQualifier text,
	directon text,
	FOREIGN KEY typedBy (__FKtypedBy__) REFERENCES NFPType (__IDNFPType__),
	PRIMARY KEY BasicNFP (__IDBasicNFP__),
	__FKtypedBy__ Integer
) ;

CREATE TABLE NFPType (
	__IDNFPType__ Integer NOT NULL,
	valueSpecificationLanguage text,
	source text,
	PRIMARY KEY NFPType (__IDNFPType__)
) ;

CREATE TABLE NFPInstantType (
	__IDNFPInstantType__ Integer NOT NULL,
	value text,
	unit text,
	PRIMARY KEY NFPInstantType (__IDNFPInstantType__)
) ;

CREATE TABLE NFPurationType (
	__IDNFPurationType__ Integer NOT NULL,
	value text,
	unit text,
	PRIMARY KEY NFPurationType (__IDNFPurationType__)
) ;

CREATE TABLE NFPRateType (
	__IDNFPRateType__ Integer NOT NULL,
	value text,
	unit text,
	PRIMARY KEY NFPRateType (__IDNFPRateType__)
) ;

CREATE TABLE NFPProbabilityType (
	__IDNFPProbabilityType__ Integer NOT NULL,
	value text,
	unit text,
	PRIMARY KEY NFPProbabilityType (__IDNFPProbabilityType__)
) ;

CREATE TABLE NFPSizeType (
	__IDNFPSizeType__ Integer NOT NULL,
	value text,
	unit text,
	PRIMARY KEY NFPSizeType (__IDNFPSizeType__)
) ;

CREATE TABLE NFPValueSpecification (
	__IDNFPValueSpecification__ Integer NOT NULL,
	FOREIGN KEY expression (__FKexpression__) REFERENCES NFPExpression (__IDNFPExpression__),
	PRIMARY KEY NFPValueSpecification (__IDNFPValueSpecification__),
	__FKexpression__ Integer
) ;

CREATE TABLE NFPConstant (
	__IDNFPConstant__ Integer NOT NULL,
	FOREIGN KEY ownerList (__FKownerList__) REFERENCES NFPListConstant (__IDNFPListConstant__),
	PRIMARY KEY NFPConstant (__IDNFPConstant__),
	__FKownerList__ Integer
) ;

CREATE TABLE NFPListConstant (
	__IDNFPListConstant__ Integer NOT NULL,
	PRIMARY KEY NFPListConstant (__IDNFPListConstant__)
) ;

CREATE TABLE NFPStringConstant (
	__IDNFPStringConstant__ Integer NOT NULL,
	body text,
	PRIMARY KEY NFPStringConstant (__IDNFPStringConstant__)
) ;

CREATE TABLE NFPIntegerConstant (
	__IDNFPIntegerConstant__ Integer NOT NULL,
	body Integer,
	PRIMARY KEY NFPIntegerConstant (__IDNFPIntegerConstant__)
) ;

CREATE TABLE NFPRealConstant (
	__IDNFPRealConstant__ Integer NOT NULL,
	bodyBeforeComa Integer,
	bodyAfterComa Integer,
	PRIMARY KEY NFPRealConstant (__IDNFPRealConstant__)
) ;

CREATE TABLE NFPBooleanConstant (
	__IDNFPBooleanConstant__ Integer NOT NULL,
	body Boolean,
	PRIMARY KEY NFPBooleanConstant (__IDNFPBooleanConstant__)
) ;

CREATE TABLE NFPVariable (
	__IDNFPVariable__ Integer NOT NULL,
	varName text,
	PRIMARY KEY NFPVariable (__IDNFPVariable__)
) ;

CREATE TABLE NFPExpression (
	__IDNFPExpression__ Integer NOT NULL,
	PRIMARY KEY NFPExpression (__IDNFPExpression__)
) ;

CREATE TABLE Classifier (
	__IDClassifier__ Integer NOT NULL,
	PRIMARY KEY Classifier (__IDClassifier__)
) ;

CREATE TABLE ResourceClassifier (
	__IDResourceClassifier__ Integer NOT NULL,
	PRIMARY KEY ResourceClassifier (__IDResourceClassifier__)
) ;

CREATE TABLE ResourceServiceClassifier (
	__IDResourceServiceClassifier__ Integer NOT NULL,
	FOREIGN KEY resType (__FKresType__) REFERENCES ResourceClassifier (__IDResourceClassifier__),
	PRIMARY KEY ResourceServiceClassifier (__IDResourceServiceClassifier__),
	__FKresType__ Integer
) ;

CREATE TABLE InstanceSpecification (
	__IDInstanceSpecification__ Integer NOT NULL,
	PRIMARY KEY InstanceSpecification (__IDInstanceSpecification__)
) ;

CREATE TABLE ResourceInstanceSpecification (
	__IDResourceInstanceSpecification__ Integer NOT NULL,
	PRIMARY KEY ResourceInstanceSpecification (__IDResourceInstanceSpecification__)
) ;

CREATE TABLE ResourceServiceInstanceSpecification (
	__IDResourceServiceInstanceSpecification__ Integer NOT NULL,
	FOREIGN KEY resintSpec (__FKresintSpec__) REFERENCES ResourceInstanceSpecification (__IDResourceInstanceSpecification__),
	PRIMARY KEY ResourceServiceInstanceSpecification (__IDResourceServiceInstanceSpecification__),
	__FKresintSpec__ Integer
) ;

CREATE TABLE Hardware (
	__IDHardware__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES Hardware (__IDHardware__),
	PRIMARY KEY Hardware (__IDHardware__),
	__FKowner__ Integer
) ;

CREATE TABLE HardwareLibrary (
	__IDHardwareLibrary__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES Hardware (__IDHardware__),
	PRIMARY KEY HardwareLibrary (__IDHardwareLibrary__),
	__FKowner__ Integer
) ;

CREATE TABLE HardwareEntity (
	__IDHardwareEntity__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES Hardware (__IDHardware__),
	PRIMARY KEY HardwareEntity (__IDHardwareEntity__),
	__FKowner__ Integer
) ;

CREATE TABLE HardwareDeployment (
	__IDHardwareDeployment__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES Hardware (__IDHardware__),
	PRIMARY KEY HardwareDeployment (__IDHardwareDeployment__),
	__FKowner__ Integer
) ;

CREATE TABLE HardwareEntityInstance (
	__IDHardwareEntityInstance__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES HardwareDeployment (__IDHardwareDeployment__),
	PRIMARY KEY HardwareEntityInstance (__IDHardwareEntityInstance__),
	__FKowner__ Integer
) ;

CREATE TABLE ECUInstance (
	__IDECUInstance__ Integer NOT NULL,
	PRIMARY KEY ECUInstance (__IDECUInstance__)
) ;

CREATE TABLE ChannelInstance (
	__IDChannelInstance__ Integer NOT NULL,
	PRIMARY KEY ChannelInstance (__IDChannelInstance__)
) ;

CREATE TABLE ECUGateInstance (
	__IDECUGateInstance__ Integer NOT NULL,
	FOREIGN KEY channel (__FKchannel__) REFERENCES ChannelInstance (__IDChannelInstance__),
	PRIMARY KEY ECUGateInstance (__IDECUGateInstance__),
	__FKchannel__ Integer
) ;

CREATE TABLE ECU (
	__IDECU__ Integer NOT NULL,
	PRIMARY KEY ECU (__IDECU__)
) ;

CREATE TABLE ECUGate (
	__IDECUGate__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES ECU (__IDECU__),
	FOREIGN KEY kindOf (__FKkindOf__) REFERENCES Channel (__IDChannel__),
	PRIMARY KEY ECUGate (__IDECUGate__),
	__FKowner__ Integer,
	__FKkindOf__ Integer
) ;

CREATE TABLE Channel (
	__IDChannel__ Integer NOT NULL,
	FOREIGN KEY specify (__FKspecify__) REFERENCES ECUGate (__IDECUGate__),
	PRIMARY KEY Channel (__IDChannel__),
	__FKspecify__ Integer
) ;

CREATE TABLE AnalysisContext (
	__IDAnalysisContext__ Integer NOT NULL,
	FOREIGN KEY workload (__FKworkload__) REFERENCES Workload (__IDWorkload__),
	FOREIGN KEY behavior (__FKbehavior__) REFERENCES Behavior (__IDBehavior__),
	PRIMARY KEY AnalysisContext (__IDAnalysisContext__),
	__FKworkload__ Integer,
	__FKbehavior__ Integer
) ;

CREATE TABLE Workload (
	__IDWorkload__ Integer NOT NULL,
	PRIMARY KEY Workload (__IDWorkload__)
) ;

CREATE TABLE Transaction (
	__IDTransaction__ Integer NOT NULL,
	FOREIGN KEY response (__FKresponse__) REFERENCES Response (__IDResponse__),
	PRIMARY KEY Transaction (__IDTransaction__),
	__FKresponse__ Integer
) ;

CREATE TABLE "Trigger" (
	__IDTrigger__ Integer NOT NULL,
	FOREIGN KEY arrivalPattern (__FKarrivalPattern__) REFERENCES ComplexNFP (__IDComplexNFP__),
	PRIMARY KEY "Trigger" (__IDTrigger__),
	__FKarrivalPattern__ Integer
) ;

CREATE TABLE Response (
	__IDResponse__ Integer NOT NULL,
	FOREIGN KEY efficiency (__FKefficiency__) REFERENCES ComplexNFP (__IDComplexNFP__),
	FOREIGN KEY endToEndLatency (__FKendToEndLatency__) REFERENCES ComplexNFP (__IDComplexNFP__),
	PRIMARY KEY Response (__IDResponse__),
	__FKefficiency__ Integer,
	__FKendToEndLatency__ Integer
) ;

CREATE TABLE Behavior (
	__IDBehavior__ Integer NOT NULL,
	PRIMARY KEY Behavior (__IDBehavior__)
) ;

CREATE TABLE Scenario (
	__IDScenario__ Integer NOT NULL,
	FOREIGN KEY root (__FKroot__) REFERENCES Step (__IDStep__),
	FOREIGN KEY endToEndResponse (__FKendToEndResponse__) REFERENCES Response (__IDResponse__),
	PRIMARY KEY Scenario (__IDScenario__),
	__FKroot__ Integer,
	__FKendToEndResponse__ Integer
) ;

CREATE TABLE Step (
	__IDStep__ Integer NOT NULL,
	PRIMARY KEY Step (__IDStep__)
) ;

CREATE TABLE Resource (
	__IDResource__ Integer NOT NULL,
	PRIMARY KEY Resource (__IDResource__)
) ;

CREATE TABLE BasicResource (
	__IDBasicResource__ Integer NOT NULL,
	PRIMARY KEY BasicResource (__IDBasicResource__)
) ;

CREATE TABLE StructuredResource (
	__IDStructuredResource__ Integer NOT NULL,
	FOREIGN KEY basicResource (__FKbasicResource__) REFERENCES BasicResource (__IDBasicResource__),
	PRIMARY KEY StructuredResource (__IDStructuredResource__),
	__FKbasicResource__ Integer
) ;

CREATE TABLE ProcessingResource (
	__IDProcessingResource__ Integer NOT NULL,
	PRIMARY KEY ProcessingResource (__IDProcessingResource__)
) ;

CREATE TABLE Link (
	__IDLink__ Integer NOT NULL,
	PRIMARY KEY Link (__IDLink__)
) ;

CREATE TABLE ProcessResource (
	__IDProcessResource__ Integer NOT NULL,
	PRIMARY KEY ProcessResource (__IDProcessResource__)
) ;

CREATE TABLE Component (
	__IDComponent__ Integer NOT NULL,
	PRIMARY KEY Component (__IDComponent__)
) ;

CREATE TABLE StructuredComponent (
	__IDStructuredComponent__ Integer NOT NULL,
	PRIMARY KEY StructuredComponent (__IDStructuredComponent__)
) ;

CREATE TABLE BasicComponent (
	__IDBasicComponent__ Integer NOT NULL,
	PRIMARY KEY BasicComponent (__IDBasicComponent__)
) ;

CREATE TABLE LogicalResource (
	__IDLogicalResource__ Integer NOT NULL,
	PRIMARY KEY LogicalResource (__IDLogicalResource__)
) ;

CREATE TABLE ServerResource (
	__IDServerResource__ Integer NOT NULL,
	PRIMARY KEY ServerResource (__IDServerResource__)
) ;

CREATE TABLE Service (
	__IDService__ Integer NOT NULL,
	FOREIGN KEY resource (__FKresource__) REFERENCES ServerResource (__IDServerResource__),
	FOREIGN KEY interface (__FKinterface__) REFERENCES Interface (__IDInterface__),
	PRIMARY KEY Service (__IDService__),
	__FKresource__ Integer,
	__FKinterface__ Integer
) ;

CREATE TABLE Interface (
	__IDInterface__ Integer NOT NULL,
	FOREIGN KEY service (__FKservice__) REFERENCES Service (__IDService__),
	PRIMARY KEY Interface (__IDInterface__),
	__FKservice__ Integer
) ;

CREATE TABLE TimeBase_instants_Instant (
	__IDTimeBase__ Integer NOT NULL,
	__IDInstant__ Integer NOT NULL
) ;

CREATE TABLE TimeValue_denotedInstant_Instant (
	__IDTimeValue__ Integer NOT NULL,
	__IDInstant__ Integer NOT NULL
) ;

CREATE TABLE TimeInterval_endValues_TimeValue (
	__IDTimeInterval__ Integer NOT NULL,
	__IDTimeValue__ Integer NOT NULL
) ;

CREATE TABLE TimeInterval_denotedInterval_Interval (
	__IDTimeInterval__ Integer NOT NULL,
	__IDInterval__ Integer NOT NULL
) ;

CREATE TABLE Interval_instants_Instant (
	__IDInterval__ Integer NOT NULL,
	__IDInstant__ Integer NOT NULL
) ;

CREATE TABLE SingleInterval_members_SingleInstant (
	__IDSingleInterval__ Integer NOT NULL,
	__IDSingleInstant__ Integer NOT NULL
) ;

CREATE TABLE Event_occ_EventOccurence (
	__IDEvent__ Integer NOT NULL,
	__IDEventOccurence__ Integer NOT NULL
) ;

CREATE TABLE PhysicalTime_physicalInstants_PhysicalInstant (
	__IDPhysicalTime__ Integer NOT NULL,
	__IDPhysicalInstant__ Integer NOT NULL
) ;

CREATE TABLE PhysicalInstant_measurement_MetricTimeValue (
	__IDPhysicalInstant__ Integer NOT NULL,
	__IDMetricTimeValue__ Integer NOT NULL
) ;

CREATE TABLE Duration_measurement_MetricTimeInterval (
	__IDDuration__ Integer NOT NULL,
	__IDMetricTimeInterval__ Integer NOT NULL
) ;

CREATE TABLE MultipleTimeBase_bases_SingleTimeBase (
	__IDMultipleTimeBase__ Integer NOT NULL,
	__IDSingleTimeBase__ Integer NOT NULL
) ;

CREATE TABLE CoincidencePoint_coincidenceInstants_SingleInstant (
	__IDCoincidencePoint__ Integer NOT NULL,
	__IDSingleInstant__ Integer NOT NULL
) ;

CREATE TABLE MultipleInterval_first_CoincidencePoint (
	__IDMultipleInterval__ Integer NOT NULL,
	__IDCoincidencePoint__ Integer NOT NULL
) ;

CREATE TABLE MultipleInterval_last_CoincidencePoint (
	__IDMultipleInterval__ Integer NOT NULL,
	__IDCoincidencePoint__ Integer NOT NULL
) ;

CREATE TABLE MultipleTimeValue_values_SingleTimeValue (
	__IDMultipleTimeValue__ Integer NOT NULL,
	__IDSingleTimeValue__ Integer NOT NULL
) ;

CREATE TABLE SimultaneousEventOccurrence_occurence_TimedEventOccurence (
	__IDSimultaneousEventOccurrence__ Integer NOT NULL,
	__IDTimedEventOccurence__ Integer NOT NULL
) ;

CREATE TABLE TimedEvent_timestamp_MetricTimeValue (
	__IDTimedEvent__ Integer NOT NULL,
	__IDMetricTimeValue__ Integer NOT NULL
) ;

CREATE TABLE TimedAction_duration_TimeInterval (
	__IDTimedAction__ Integer NOT NULL,
	__IDTimeInterval__ Integer NOT NULL
) ;

CREATE TABLE TimedAction_start_TimeValue (
	__IDTimedAction__ Integer NOT NULL,
	__IDTimeValue__ Integer NOT NULL
) ;

CREATE TABLE TimedAction_end_TimeValue (
	__IDTimedAction__ Integer NOT NULL,
	__IDTimeValue__ Integer NOT NULL
) ;

CREATE TABLE Clock_generatedInterrupt_ClockInterrupt (
	__IDClock__ Integer NOT NULL,
	__IDClockInterrupt__ Integer NOT NULL
) ;

CREATE TABLE Timer_genratedTimeOuts_TimeOut (
	__IDTimer__ Integer NOT NULL,
	__IDTimeOut__ Integer NOT NULL
) ;

CREATE TABLE System_dimension_Quantity (
	__IDSystem__ Integer NOT NULL,
	__IDQuantity__ Integer NOT NULL
) ;

CREATE TABLE Model_ownes_ModelElement (
	__IDModel__ Integer NOT NULL,
	__IDModelElement__ Integer NOT NULL
) ;

CREATE TABLE AnnotatedModel_conformsTo_ModelingConcern (
	__IDAnnotatedModel__ Integer NOT NULL,
	__IDModelingConcern__ Integer NOT NULL
) ;

CREATE TABLE AnnotatedModel_import_NFPLibrary (
	__IDAnnotatedModel__ Integer NOT NULL,
	__IDNFPLibrary__ Integer NOT NULL
) ;

CREATE TABLE AnnotatedModelElement_annotation_NFP (
	__IDAnnotatedModelElement__ Integer NOT NULL,
	__IDNFP__ Integer NOT NULL
) ;

CREATE TABLE NFP_storedBy_NFPLibrary (
	__IDNFP__ Integer NOT NULL,
	__IDNFPLibrary__ Integer NOT NULL
) ;

CREATE TABLE NFPLibrary_refersTo_NFPLibrary (
	__IDNFPLibrary__ Integer NOT NULL,
	__IDNFPLibrary__ Integer NOT NULL
) ;

CREATE TABLE NFPLibrary_usedNFP_NFP (
	__IDNFPLibrary__ Integer NOT NULL,
	__IDNFP__ Integer NOT NULL
) ;

CREATE TABLE NFPCategory_setOf_NFP (
	__IDNFPCategory__ Integer NOT NULL,
	__IDNFP__ Integer NOT NULL
) ;

CREATE TABLE NFPCategory_ownes_NFPCategory (
	__IDNFPCategory__ Integer NOT NULL,
	__IDNFPCategory__ Integer NOT NULL
) ;

CREATE TABLE ModelingConcern_relevantQuantity_Quantity (
	__IDModelingConcern__ Integer NOT NULL,
	__IDQuantity__ Integer NOT NULL
) ;

CREATE TABLE QualitativeNFP_parameter_NFP (
	__IDQualitativeNFP__ Integer NOT NULL,
	__IDNFP__ Integer NOT NULL
) ;

CREATE TABLE QuantitativeNFP_sampleSet_Realization (
	__IDQuantitativeNFP__ Integer NOT NULL,
	__IDRealization__ Integer NOT NULL
) ;

CREATE TABLE QuantitativeNFP_measure_Measure (
	__IDQuantitativeNFP__ Integer NOT NULL,
	__IDMeasure__ Integer NOT NULL
) ;

CREATE TABLE Realization_function_Measure (
	__IDRealization__ Integer NOT NULL,
	__IDMeasure__ Integer NOT NULL
) ;

CREATE TABLE Measure_appliesTo_Realization (
	__IDMeasure__ Integer NOT NULL,
	__IDRealization__ Integer NOT NULL
) ;

CREATE TABLE ComplexNFP_parent_ComplexNFP (
	__IDComplexNFP__ Integer NOT NULL,
	__IDComplexNFP__ Integer NOT NULL
) ;

CREATE TABLE ComplexNFP_child_ComplexNFP (
	__IDComplexNFP__ Integer NOT NULL,
	__IDComplexNFP__ Integer NOT NULL
) ;

CREATE TABLE ComplexNFP_ownes_BasicNFP (
	__IDComplexNFP__ Integer NOT NULL,
	__IDBasicNFP__ Integer NOT NULL
) ;

CREATE TABLE BasicNFP_valuedBy_NFPValueSpecification (
	__IDBasicNFP__ Integer NOT NULL,
	__IDNFPValueSpecification__ Integer NOT NULL
) ;

CREATE TABLE BasicNFP_dimensionOf_ComplexNFP (
	__IDBasicNFP__ Integer NOT NULL,
	__IDComplexNFP__ Integer NOT NULL
) ;

CREATE TABLE NFPType_constrainedSpec_NFPValueSpecification (
	__IDNFPType__ Integer NOT NULL,
	__IDNFPValueSpecification__ Integer NOT NULL
) ;

CREATE TABLE NFPValueSpecification_constrainedBy_NFPType (
	__IDNFPValueSpecification__ Integer NOT NULL,
	__IDNFPType__ Integer NOT NULL
) ;

CREATE TABLE NFPListConstant_listElements_NFPConstant (
	__IDNFPListConstant__ Integer NOT NULL,
	__IDNFPConstant__ Integer NOT NULL
) ;

CREATE TABLE NFPExpression_operand_NFPValueSpecification (
	__IDNFPExpression__ Integer NOT NULL,
	__IDNFPValueSpecification__ Integer NOT NULL
) ;

CREATE TABLE Classifier_instances_InstanceSpecification (
	__IDClassifier__ Integer NOT NULL,
	__IDInstanceSpecification__ Integer NOT NULL
) ;

CREATE TABLE ResourceClassifier_offeredService_ResourceServiceClassifier (
	__IDResourceClassifier__ Integer NOT NULL,
	__IDResourceServiceClassifier__ Integer NOT NULL
) ;

CREATE TABLE InstanceSpecification_type_Classifier (
	__IDInstanceSpecification__ Integer NOT NULL,
	__IDClassifier__ Integer NOT NULL
) ;

CREATE TABLE ResourceInstanceSpecification_offeredServiceInstance_ResourceServiceInstanceSpecification (
	__IDResourceInstanceSpecification__ Integer NOT NULL,
	__IDResourceServiceInstanceSpecification__ Integer NOT NULL
) ;

CREATE TABLE Hardware_containH_Hardware (
	__IDHardware__ Integer NOT NULL,
	__IDHardware__ Integer NOT NULL
) ;

CREATE TABLE Hardware_containHL_HardwareLibrary (
	__IDHardware__ Integer NOT NULL,
	__IDHardwareLibrary__ Integer NOT NULL
) ;

CREATE TABLE Hardware_containHE_HardwareEntity (
	__IDHardware__ Integer NOT NULL,
	__IDHardwareEntity__ Integer NOT NULL
) ;

CREATE TABLE Hardware_deploymentConfiguration_HardwareDeployment (
	__IDHardware__ Integer NOT NULL,
	__IDHardwareDeployment__ Integer NOT NULL
) ;

CREATE TABLE HardwareDeployment_contain_HardwareEntityInstance (
	__IDHardwareDeployment__ Integer NOT NULL,
	__IDHardwareEntityInstance__ Integer NOT NULL
) ;

CREATE TABLE ECUInstance_composedOf_ECUGateInstance (
	__IDECUInstance__ Integer NOT NULL,
	__IDECUGateInstance__ Integer NOT NULL
) ;

CREATE TABLE ChannelInstance_gateInstances_ECUGateInstance (
	__IDChannelInstance__ Integer NOT NULL,
	__IDECUGateInstance__ Integer NOT NULL
) ;

CREATE TABLE ECU_contain_ECUGate (
	__IDECU__ Integer NOT NULL,
	__IDECUGate__ Integer NOT NULL
) ;

CREATE TABLE AnalysisContext_global_ComplexNFP (
	__IDAnalysisContext__ Integer NOT NULL,
	__IDComplexNFP__ Integer NOT NULL
) ;

CREATE TABLE AnalysisContext_usedResources_Resource (
	__IDAnalysisContext__ Integer NOT NULL,
	__IDResource__ Integer NOT NULL
) ;

CREATE TABLE Workload_transaction_Transaction (
	__IDWorkload__ Integer NOT NULL,
	__IDTransaction__ Integer NOT NULL
) ;

CREATE TABLE Transaction_workload_Workload (
	__IDTransaction__ Integer NOT NULL,
	__IDWorkload__ Integer NOT NULL
) ;

CREATE TABLE Transaction_trigger_Trigger (
	__IDTransaction__ Integer NOT NULL,
	__IDTrigger__ Integer NOT NULL
) ;

CREATE TABLE Trigger_effect_Response (
	__IDTrigger__ Integer NOT NULL,
	__IDResponse__ Integer NOT NULL
) ;

CREATE TABLE Response_cause_Trigger (
	__IDResponse__ Integer NOT NULL,
	__IDTrigger__ Integer NOT NULL
) ;

CREATE TABLE Response_behavior_Scenario (
	__IDResponse__ Integer NOT NULL,
	__IDScenario__ Integer NOT NULL
) ;

CREATE TABLE Behavior_scenario_Scenario (
	__IDBehavior__ Integer NOT NULL,
	__IDScenario__ Integer NOT NULL
) ;

CREATE TABLE Scenario_behavior_Behavior (
	__IDScenario__ Integer NOT NULL,
	__IDBehavior__ Integer NOT NULL
) ;

CREATE TABLE Scenario_scenarionLatency_ComplexNFP (
	__IDScenario__ Integer NOT NULL,
	__IDComplexNFP__ Integer NOT NULL
) ;

CREATE TABLE Scenario_steps_Step (
	__IDScenario__ Integer NOT NULL,
	__IDStep__ Integer NOT NULL
) ;

CREATE TABLE Step_predecessor_Step (
	__IDStep__ Integer NOT NULL,
	__IDStep__ Integer NOT NULL
) ;

CREATE TABLE Step_successor_Step (
	__IDStep__ Integer NOT NULL,
	__IDStep__ Integer NOT NULL
) ;

CREATE TABLE Step_stepLatency_ComplexNFP (
	__IDStep__ Integer NOT NULL,
	__IDComplexNFP__ Integer NOT NULL
) ;

CREATE TABLE Step_usedResourceService_Service (
	__IDStep__ Integer NOT NULL,
	__IDService__ Integer NOT NULL
) ;

CREATE TABLE ProcessingResource_links_Link (
	__IDProcessingResource__ Integer NOT NULL,
	__IDLink__ Integer NOT NULL
) ;

CREATE TABLE ProcessingResource_components_Component (
	__IDProcessingResource__ Integer NOT NULL,
	__IDComponent__ Integer NOT NULL
) ;

CREATE TABLE ProcessResource_components_Component (
	__IDProcessResource__ Integer NOT NULL,
	__IDComponent__ Integer NOT NULL
) ;

CREATE TABLE Component_process_ProcessResource (
	__IDComponent__ Integer NOT NULL,
	__IDProcessResource__ Integer NOT NULL
) ;

CREATE TABLE Component_interfaces_Interface (
	__IDComponent__ Integer NOT NULL,
	__IDInterface__ Integer NOT NULL
) ;

CREATE TABLE ServerResource_services_Service (
	__IDServerResource__ Integer NOT NULL,
	__IDService__ Integer NOT NULL
) ;
