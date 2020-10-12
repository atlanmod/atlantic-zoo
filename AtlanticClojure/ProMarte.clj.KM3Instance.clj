( declare MARTE_TimeBase )
( declare MARTE_Instant )
( declare MARTE_TimeValue )
( declare MARTE_TimeInterval )
( declare MARTE_Interval )
( declare MARTE_SingleTimeBase )
( declare MARTE_SingleInstant )
( declare MARTE_SingleInterval )
( declare MARTE_SingleTimeValue )
( declare MARTE_SingleTimeInterval )
( declare MARTE_DiscreteTimeBase )
( declare MARTE_DiscreteInstant )
( declare MARTE_Event )
( declare MARTE_EventOccurence )
( declare MARTE_PhysicalTime )
( declare MARTE_PhysicalInstant )
( declare MARTE_Duration )
( declare MARTE_MultipleTimeBase )
( declare MARTE_CoincidencePoint )
( declare MARTE_MultipleInterval )
( declare MARTE_MultipleTimeValue )
( declare MARTE_MetricTimeValue )
( declare MARTE_DiscreteTimeValue )
( declare MARTE_MetricTimeInterval )
( declare MARTE_DiscreteTimeInterval )
( declare MARTE_SimultaneousEventOccurrence )
( declare MARTE_TimedEvent )
( declare MARTE_TimedEventOccurence )
( declare MARTE_TimedAction )
( declare MARTE_Delay )
( declare MARTE_TimingMechanism )
( declare MARTE_Clock )
( declare MARTE_Timer )
( declare MARTE_TimeOut )
( declare MARTE_ClockInterrupt )
( declare MARTE_System )
( declare MARTE_Model )
( declare MARTE_AnnotatedModel )
( declare MARTE_ModelElement )
( declare MARTE_AnnotatedModelElement )
( declare MARTE_NFP )
( declare MARTE_NFPLibrary )
( declare MARTE_NFPCategory )
( declare MARTE_ModelingConcern )
( declare MARTE_AnalysisConcern )
( declare MARTE_DesignConcern )
( declare MARTE_Quantity )
( declare MARTE_BasicQuantity )
( declare MARTE_DerivedQuantity )
( declare MARTE_QualitativeNFP )
( declare MARTE_QuantitativeNFP )
( declare MARTE_Realization )
( declare MARTE_Measure )
( declare MARTE_ComplexNFP )
( declare MARTE_BasicNFP )
( declare MARTE_NFPType )
( declare MARTE_NFPInstantType )
( declare MARTE_NFPurationType )
( declare MARTE_NFPRateType )
( declare MARTE_NFPProbabilityType )
( declare MARTE_NFPSizeType )
( declare MARTE_NFPValueSpecification )
( declare MARTE_NFPConstant )
( declare MARTE_NFPListConstant )
( declare MARTE_NFPStringConstant )
( declare MARTE_NFPIntegerConstant )
( declare MARTE_NFPRealConstant )
( declare MARTE_NFPBooleanConstant )
( declare MARTE_NFPVariable )
( declare MARTE_NFPExpression )
( declare MARTE_SourceKinds )
( declare MARTE_DirectionKinds )
( declare MARTE_StatisticalQualifierKinds )
( declare MARTE_InstantUnitKinds )
( declare MARTE_DurationUnitKinds )
( declare MARTE_RateUnitKinds )
( declare MARTE_ProbabilityUnitKinds )
( declare MARTE_SizeUnitKinds )
( declare MARTE_Classifier )
( declare MARTE_ResourceClassifier )
( declare MARTE_ResourceServiceClassifier )
( declare MARTE_InstanceSpecification )
( declare MARTE_ResourceInstanceSpecification )
( declare MARTE_ResourceServiceInstanceSpecification )
( declare MARTE_Hardware )
( declare MARTE_HardwareLibrary )
( declare MARTE_HardwareEntity )
( declare MARTE_HardwareDeployment )
( declare MARTE_HardwareEntityInstance )
( declare MARTE_ECUInstance )
( declare MARTE_ChannelInstance )
( declare MARTE_ECUGateInstance )
( declare MARTE_ECU )
( declare MARTE_ECUGate )
( declare MARTE_Channel )
( declare MARTE_AnalysisContext )
( declare MARTE_Workload )
( declare MARTE_Transaction )
( declare MARTE_Trigger )
( declare MARTE_Response )
( declare MARTE_Behavior )
( declare MARTE_Scenario )
( declare MARTE_Step )
( declare MARTE_Resource )
( declare MARTE_BasicResource )
( declare MARTE_StructuredResource )
( declare MARTE_ProcessingResource )
( declare MARTE_Link )
( declare MARTE_ProcessResource )
( declare MARTE_Component )
( declare MARTE_StructuredComponent )
( declare MARTE_BasicComponent )
( declare MARTE_LogicalResource )
( declare MARTE_ServerResource )
( declare MARTE_Service )
( declare MARTE_Interface )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Boolean )
( def MARTE ( struct-map
	KM3_Package
	:contents[( def SourceKinds ( :literals[( struct-map
		KM3_EnumLiteral
		:name "est"
		:location "502:3-502:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "meas"
		:location "503:3-503:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "req"
		:location "504:3-504:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "implicit"
		:location "505:3-505:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "calc"
		:location "506:3-506:16"
	)] ) ) ( def DirectionKinds ( :literals[( struct-map
		KM3_EnumLiteral
		:name "increasing"
		:location "512:3-512:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "decreasing"
		:location "513:3-513:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "undefined"
		:location "514:3-514:21"
	)] ) ) ( def StatisticalQualifierKinds ( :literals[( struct-map
		KM3_EnumLiteral
		:name "max"
		:location "520:3-520:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "min"
		:location "521:3-521:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "range"
		:location "522:3-522:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "mean"
		:location "523:3-523:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "variance"
		:location "524:3-524:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "standardDeviation"
		:location "525:3-525:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "percentil"
		:location "526:3-526:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "frequency"
		:location "527:3-527:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "moment"
		:location "528:3-528:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "distribution"
		:location "529:3-529:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "instantaneous"
		:location "530:3-530:25"
	)] ) ) ( def InstantUnitKinds ( :literals[( struct-map
		KM3_EnumLiteral
		:name "TAI"
		:location "536:3-536:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "UT0"
		:location "537:3-537:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "UT1"
		:location "538:3-538:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "UTC"
		:location "539:3-539:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "TT"
		:location "540:3-540:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "TDB"
		:location "541:3-541:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "TCG"
		:location "542:3-542:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "TCB"
		:location "543:3-543:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "Sideral"
		:location "544:3-544:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "Local"
		:location "545:3-545:17"
	)] ) ) ( def DurationUnitKinds ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ns"
		:location "551:3-551:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "us"
		:location "552:3-552:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "ms"
		:location "553:3-553:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "s"
		:location "554:3-554:13"
	) ( struct-map
		KM3_EnumLiteral
		:name "min"
		:location "555:3-555:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "hrs"
		:location "556:3-556:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "dys"
		:location "557:3-557:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "wks"
		:location "558:3-558:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "mos"
		:location "559:3-559:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "yrs"
		:location "560:3-560:15"
	)] ) ) ( def RateUnitKinds ( :literals[( struct-map
		KM3_EnumLiteral
		:name "kbs"
		:location "566:3-566:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "MIPS"
		:location "567:3-567:16"
	)] ) ) ( def ProbabilityUnitKinds ( :literals[( struct-map
		KM3_EnumLiteral
		:name "us"
		:location "573:3-573:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "s"
		:location "574:3-574:13"
	)] ) ) ( def SizeUnitKinds ( :literals[( struct-map
		KM3_EnumLiteral
		:name "bits"
		:location "580:3-580:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "bytes"
		:location "581:3-581:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "Mb"
		:location "582:3-582:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "MB"
		:location "583:3-583:14"
	)] ) ) ( def MARTE_TimeBase ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_TimeBase
			:type String
			:location "17:3-17:27"
		) ( struct-map
			KM3_Reference
			:name "instants"
			:upper -1
			:lower 0
			:isOrdered true
			:owner MARTE_TimeBase
			:type MARTE_Instant
			:location "18:3-18:70"
			:isContainer true
			:opposite owner
		)]
	) ) ( def MARTE_Instant ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isBefore"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Instant
			:type Boolean
			:location "24:3-24:32"
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Instant
			:type MARTE_TimeBase
			:location "25:3-25:50"
			:isContainer false
			:opposite instants
		) ( struct-map
			KM3_Reference
			:name "timeValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Instant
			:type MARTE_TimeValue
			:location "26:3-26:61"
			:isContainer false
			:opposite denotedInstant
		)]
	) ) ( def MARTE_TimeValue ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "denotedInstant"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_TimeValue
			:type MARTE_Instant
			:location "32:3-32:62"
			:isContainer false
			:opposite timeValue
		) ( struct-map
			KM3_Reference
			:name "ref"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_TimeValue
			:type MARTE_TimeBase
			:location "33:3-33:28"
			:isContainer false
		)]
	) ) ( def MARTE_TimeInterval ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "endValues"
			:upper -1
			:lower 2
			:isOrdered false
			:owner MARTE_TimeInterval
			:type MARTE_TimeValue
			:location "39:3-39:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "denotedInterval"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_TimeInterval
			:type MARTE_Interval
			:location "40:3-40:67"
			:isContainer false
			:opposite timeInterval
		)]
	) ) ( def MARTE_Interval ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "includingMin"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Interval
			:type Boolean
			:location "46:3-46:36"
		) ( struct-map
			KM3_Attribute
			:name "includingMax"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Interval
			:type Boolean
			:location "47:3-47:36"
		) ( struct-map
			KM3_Reference
			:name "base"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Interval
			:type MARTE_TimeBase
			:location "48:3-48:29"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "timeInterval"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Interval
			:type MARTE_TimeInterval
			:location "49:3-49:68"
			:isContainer false
			:opposite denotedInterval
		) ( struct-map
			KM3_Reference
			:name "instants"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_Interval
			:type MARTE_Instant
			:location "50:3-50:36"
			:isContainer false
		)]
	) ) ( def MARTE_SingleTimeBase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_TimeBase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "currentValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_SingleTimeBase
			:type MARTE_SingleTimeValue
			:location "58:3-58:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "maximumValue"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MARTE_SingleTimeBase
			:type MARTE_SingleTimeValue
			:location "59:3-59:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "currentInstant"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_SingleTimeBase
			:type MARTE_SingleInstant
			:location "60:3-60:44"
			:isContainer false
		)]
	) ) ( def MARTE_SingleInstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_Instant]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "coPoint"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_SingleInstant
			:type MARTE_CoincidencePoint
			:location "66:3-66:71"
			:isContainer false
			:opposite coincidenceInstants
		)]
	) ) ( def MARTE_SingleInterval ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_Interval]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "first"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_SingleInterval
			:type MARTE_SingleInstant
			:location "72:3-72:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "last"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_SingleInterval
			:type MARTE_SingleInstant
			:location "73:3-73:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "members"
			:upper -1
			:lower 0
			:isOrdered true
			:owner MARTE_SingleInterval
			:type MARTE_SingleInstant
			:location "74:3-74:48"
			:isContainer false
		)]
	) ) ( def MARTE_SingleTimeValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_TimeValue]
		:structuralFeatures[]
	) ) ( def MARTE_SingleTimeInterval ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_TimeInterval]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "start"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_SingleTimeInterval
			:type MARTE_SingleTimeValue
			:location "85:3-85:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "end"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_SingleTimeInterval
			:type MARTE_SingleTimeValue
			:location "86:3-86:35"
			:isContainer false
		)]
	) ) ( def MARTE_DiscreteTimeBase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_TimeBase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "refEvent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_DiscreteTimeBase
			:type MARTE_Event
			:location "95:3-95:30"
			:isContainer false
		)]
	) ) ( def MARTE_DiscreteInstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_Instant]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "next"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MARTE_DiscreteInstant
			:type MARTE_DiscreteInstant
			:location "102:3-102:61"
			:isContainer false
			:opposite previous
		) ( struct-map
			KM3_Reference
			:name "previous"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MARTE_DiscreteInstant
			:type MARTE_DiscreteInstant
			:location "103:3-103:61"
			:isContainer false
			:opposite next
		) ( struct-map
			KM3_Reference
			:name "refOcc"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_DiscreteInstant
			:type MARTE_EventOccurence
			:location "104:3-104:37"
			:isContainer false
		)]
	) ) ( def MARTE_Event ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "occ"
			:upper -1
			:lower 0
			:isOrdered true
			:owner MARTE_Event
			:type MARTE_EventOccurence
			:location "110:3-110:55"
			:isContainer true
		)]
	) ) ( def MARTE_EventOccurence ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def MARTE_PhysicalTime ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "physicalInstants"
			:upper -1
			:lower 0
			:isOrdered true
			:owner MARTE_PhysicalTime
			:type MARTE_PhysicalInstant
			:location "122:3-122:69"
			:isContainer true
		)]
	) ) ( def MARTE_PhysicalInstant ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "measurement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_PhysicalInstant
			:type MARTE_MetricTimeValue
			:location "128:3-128:46"
			:isContainer false
		)]
	) ) ( def MARTE_Duration ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "start"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Duration
			:type MARTE_PhysicalInstant
			:location "134:3-134:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "end"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Duration
			:type MARTE_PhysicalInstant
			:location "135:3-135:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "measurement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_Duration
			:type MARTE_MetricTimeInterval
			:location "136:3-136:49"
			:isContainer false
		)]
	) ) ( def MARTE_MultipleTimeBase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_TimeBase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "bases"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_MultipleTimeBase
			:type MARTE_SingleTimeBase
			:location "144:3-144:51"
			:isContainer true
		)]
	) ) ( def MARTE_CoincidencePoint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_Instant]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "coincidenceInstants"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_CoincidencePoint
			:type MARTE_SingleInstant
			:location "150:3-150:73"
			:isContainer false
			:opposite coPoint
		)]
	) ) ( def MARTE_MultipleInterval ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_Interval]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "first"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_MultipleInterval
			:type MARTE_CoincidencePoint
			:location "156:3-156:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "last"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_MultipleInterval
			:type MARTE_CoincidencePoint
			:location "157:3-157:42"
			:isContainer false
		)]
	) ) ( def MARTE_MultipleTimeValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_TimeValue]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "values"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_MultipleTimeValue
			:type MARTE_SingleTimeValue
			:location "163:3-163:43"
			:isContainer false
		)]
	) ) ( def MARTE_MetricTimeValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_DiscreteTimeValue]
		:structuralFeatures[]
	) ) ( def MARTE_DiscreteTimeValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_TimeValue]
		:structuralFeatures[]
	) ) ( def MARTE_MetricTimeInterval ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_DiscreteTimeInterval]
		:structuralFeatures[]
	) ) ( def MARTE_DiscreteTimeInterval ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_TimeInterval]
		:structuralFeatures[]
	) ) ( def MARTE_SimultaneousEventOccurrence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "at"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_SimultaneousEventOccurrence
			:type MARTE_Instant
			:location "189:3-189:26"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "occurence"
			:upper -1
			:lower 2
			:isOrdered false
			:owner MARTE_SimultaneousEventOccurrence
			:type MARTE_TimedEventOccurence
			:location "190:3-190:50"
			:isContainer false
		)]
	) ) ( def MARTE_TimedEvent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "timestamp"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_TimedEvent
			:type MARTE_MetricTimeValue
			:location "196:3-196:46"
			:isContainer false
		)]
	) ) ( def MARTE_TimedEventOccurence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_EventOccurence]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "at"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_TimedEventOccurence
			:type MARTE_Instant
			:location "202:3-202:26"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "timestamp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_TimedEventOccurence
			:type MARTE_TimeValue
			:location "203:3-203:35"
			:isContainer false
		)]
	) ) ( def MARTE_TimedAction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_Scenario]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "duration"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_TimedAction
			:type MARTE_TimeInterval
			:location "209:3-209:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "start"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_TimedAction
			:type MARTE_TimeValue
			:location "210:3-210:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "end"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_TimedAction
			:type MARTE_TimeValue
			:location "211:3-211:32"
			:isContainer false
		)]
	) ) ( def MARTE_Delay ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_TimedAction]
		:structuralFeatures[]
	) ) ( def MARTE_TimingMechanism ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "stability"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_TimingMechanism
			:type String
			:location "223:3-223:32"
		) ( struct-map
			KM3_Attribute
			:name "drift"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_TimingMechanism
			:type String
			:location "224:3-224:28"
		) ( struct-map
			KM3_Attribute
			:name "skew"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_TimingMechanism
			:type String
			:location "225:3-225:27"
		) ( struct-map
			KM3_Attribute
			:name "state"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_TimingMechanism
			:type String
			:location "231:3-231:28"
		) ( struct-map
			KM3_Reference
			:name "origin"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_TimingMechanism
			:type MARTE_TimedEvent
			:location "226:3-226:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "resolution"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_TimingMechanism
			:type MARTE_MetricTimeInterval
			:location "227:3-227:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "refClock"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_TimingMechanism
			:type MARTE_Clock
			:location "228:3-228:30"
			:isContainer false
		)]
	) ) ( def MARTE_Clock ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_DiscreteTimeBase MARTE_TimingMechanism]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "accuracy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Clock
			:type MARTE_MetricTimeInterval
			:location "237:3-237:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "offset"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Clock
			:type MARTE_MetricTimeInterval
			:location "238:3-238:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "generatedInterrupt"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_Clock
			:type MARTE_ClockInterrupt
			:location "239:3-239:52"
			:isContainer false
		)]
	) ) ( def MARTE_Timer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_TimingMechanism]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isPeriodic"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Timer
			:type Boolean
			:location "245:3-245:34"
		) ( struct-map
			KM3_Reference
			:name "duration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Timer
			:type MARTE_MetricTimeValue
			:location "246:3-246:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "genratedTimeOuts"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_Timer
			:type MARTE_TimeOut
			:location "247:3-247:43"
			:isContainer false
		)]
	) ) ( def MARTE_TimeOut ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def MARTE_ClockInterrupt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def MARTE_System ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dimension"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_System
			:type MARTE_Quantity
			:location "266:3-266:36"
			:isContainer false
		)]
	) ) ( def MARTE_Model ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_Model
			:type MARTE_ModelElement
			:location "272:3-272:54"
			:isContainer false
			:opposite owner
		)]
	) ) ( def MARTE_AnnotatedModel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_Model]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "conformsTo"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_AnnotatedModel
			:type MARTE_ModelingConcern
			:location "278:3-278:71"
			:isContainer false
			:opposite annotedModel
		) ( struct-map
			KM3_Reference
			:name "import"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_AnnotatedModel
			:type MARTE_NFPLibrary
			:location "279:3-279:36"
			:isContainer false
		)]
	) ) ( def MARTE_ModelElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_ModelElement
			:type MARTE_Model
			:location "285:3-285:44"
			:isContainer false
			:opposite ownes
		)]
	) ) ( def MARTE_AnnotatedModelElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "annotation"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_AnnotatedModelElement
			:type MARTE_NFP
			:location "291:3-291:33"
			:isContainer false
		)]
	) ) ( def MARTE_NFP ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "measurementQuantity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_NFP
			:type MARTE_Quantity
			:location "297:3-297:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "storedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_NFP
			:type MARTE_NFPLibrary
			:location "298:3-298:57"
			:isContainer false
			:opposite usedNFP
		) ( struct-map
			KM3_Reference
			:name "groupedBy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_NFP
			:type MARTE_NFPCategory
			:location "299:3-299:54"
			:isContainer false
			:opposite setOf
		)]
	) ) ( def MARTE_NFPLibrary ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "refersTo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_NFPLibrary
			:type MARTE_NFPLibrary
			:location "305:3-305:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "usedNFP"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_NFPLibrary
			:type MARTE_NFP
			:location "306:3-306:50"
			:isContainer false
			:opposite storedBy
		)]
	) ) ( def MARTE_NFPCategory ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "setOf"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_NFPCategory
			:type MARTE_NFP
			:location "312:3-312:61"
			:isContainer true
			:opposite groupedBy
		) ( struct-map
			KM3_Reference
			:name "ownes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_NFPCategory
			:type MARTE_NFPCategory
			:location "313:3-313:53"
			:isContainer false
			:opposite owner
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MARTE_NFPCategory
			:type MARTE_NFPCategory
			:location "314:3-314:55"
			:isContainer false
			:opposite ownes
		)]
	) ) ( def MARTE_ModelingConcern ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "relevantQuantity"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_ModelingConcern
			:type MARTE_Quantity
			:location "320:3-320:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "annotedModel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_ModelingConcern
			:type MARTE_AnnotatedModel
			:location "321:3-321:65"
			:isContainer false
			:opposite conformsTo
		)]
	) ) ( def MARTE_AnalysisConcern ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_ModelingConcern]
		:structuralFeatures[]
	) ) ( def MARTE_DesignConcern ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_ModelingConcern]
		:structuralFeatures[]
	) ) ( def MARTE_Quantity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def MARTE_BasicQuantity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def MARTE_DerivedQuantity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def MARTE_QualitativeNFP ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_NFP]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "parameter"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_QualitativeNFP
			:type MARTE_NFP
			:location "349:3-349:32"
			:isContainer false
		)]
	) ) ( def MARTE_QuantitativeNFP ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_NFP]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sampleSet"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_QuantitativeNFP
			:type MARTE_Realization
			:location "355:3-355:67"
			:isContainer true
			:opposite owner
		) ( struct-map
			KM3_Reference
			:name "measure"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_QuantitativeNFP
			:type MARTE_Measure
			:location "356:3-356:61"
			:isContainer true
			:opposite owner
		)]
	) ) ( def MARTE_Realization ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "function"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_Realization
			:type MARTE_Measure
			:location "362:3-362:56"
			:isContainer false
			:opposite appliesTo
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Realization
			:type MARTE_QuantitativeNFP
			:location "363:3-363:58"
			:isContainer false
			:opposite sampleSet
		)]
	) ) ( def MARTE_Measure ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "appliesTo"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_Measure
			:type MARTE_Realization
			:location "369:3-369:62"
			:isContainer false
			:opposite function
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Measure
			:type MARTE_QuantitativeNFP
			:location "370:3-370:56"
			:isContainer false
			:opposite measure
		)]
	) ) ( def MARTE_ComplexNFP ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_NFP]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "parent"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_ComplexNFP
			:type MARTE_ComplexNFP
			:location "378:3-378:53"
			:isContainer false
			:opposite child
		) ( struct-map
			KM3_Reference
			:name "child"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_ComplexNFP
			:type MARTE_ComplexNFP
			:location "379:3-379:53"
			:isContainer false
			:opposite parent
		) ( struct-map
			KM3_Reference
			:name "ownes"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_ComplexNFP
			:type MARTE_BasicNFP
			:location "380:3-380:68"
			:isContainer true
			:opposite dimensionOf
		)]
	) ) ( def MARTE_BasicNFP ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "statisticalQualifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_BasicNFP
			:type StatisticalQualifierKinds
			:location "386:3-386:62"
		) ( struct-map
			KM3_Attribute
			:name "directon"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_BasicNFP
			:type DirectionKinds
			:location "387:3-387:39"
		) ( struct-map
			KM3_Reference
			:name "typedBy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_BasicNFP
			:type MARTE_NFPType
			:location "388:3-388:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "valuedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_BasicNFP
			:type MARTE_NFPValueSpecification
			:location "389:3-389:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dimensionOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_BasicNFP
			:type MARTE_ComplexNFP
			:location "390:3-390:68"
			:isContainer true
			:opposite ownes
		)]
	) ) ( def MARTE_NFPType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "valueSpecificationLanguage"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_NFPType
			:type String
			:location "398:3-398:49"
		) ( struct-map
			KM3_Attribute
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MARTE_NFPType
			:type SourceKinds
			:location "399:3-399:39"
		) ( struct-map
			KM3_Reference
			:name "constrainedSpec"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_NFPType
			:type MARTE_NFPValueSpecification
			:location "400:3-400:81"
			:isContainer false
			:opposite constrainedBy
		)]
	) ) ( def MARTE_NFPInstantType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_NFPType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_NFPInstantType
			:type String
			:location "406:3-406:28"
		) ( struct-map
			KM3_Attribute
			:name "unit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MARTE_NFPInstantType
			:type InstantUnitKinds
			:location "407:3-407:42"
		)]
	) ) ( def MARTE_NFPurationType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_NFPType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_NFPurationType
			:type String
			:location "413:3-413:28"
		) ( struct-map
			KM3_Attribute
			:name "unit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MARTE_NFPurationType
			:type DurationUnitKinds
			:location "414:3-414:43"
		)]
	) ) ( def MARTE_NFPRateType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_NFPType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_NFPRateType
			:type String
			:location "420:3-420:28"
		) ( struct-map
			KM3_Attribute
			:name "unit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MARTE_NFPRateType
			:type RateUnitKinds
			:location "421:3-421:39"
		)]
	) ) ( def MARTE_NFPProbabilityType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_NFPType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_NFPProbabilityType
			:type String
			:location "427:3-427:28"
		) ( struct-map
			KM3_Attribute
			:name "unit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MARTE_NFPProbabilityType
			:type ProbabilityUnitKinds
			:location "428:3-428:46"
		)]
	) ) ( def MARTE_NFPSizeType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_NFPType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_NFPSizeType
			:type String
			:location "434:3-434:28"
		) ( struct-map
			KM3_Attribute
			:name "unit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MARTE_NFPSizeType
			:type SizeUnitKinds
			:location "435:3-435:39"
		)]
	) ) ( def MARTE_NFPValueSpecification ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constrainedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_NFPValueSpecification
			:type MARTE_NFPType
			:location "443:3-443:67"
			:isContainer false
			:opposite constrainedSpec
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MARTE_NFPValueSpecification
			:type MARTE_NFPExpression
			:location "444:3-444:64"
			:isContainer false
			:opposite operand
		)]
	) ) ( def MARTE_NFPConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_NFPValueSpecification]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownerList"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MARTE_NFPConstant
			:type MARTE_NFPListConstant
			:location "450:3-450:70"
			:isContainer false
			:opposite listElements
		)]
	) ) ( def MARTE_NFPListConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_NFPConstant]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "listElements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner MARTE_NFPListConstant
			:type MARTE_NFPConstant
			:location "456:3-456:72"
			:isContainer false
			:opposite ownerList
		)]
	) ) ( def MARTE_NFPStringConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_NFPConstant]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_NFPStringConstant
			:type String
			:location "462:3-462:27"
		)]
	) ) ( def MARTE_NFPIntegerConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_NFPConstant]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_NFPIntegerConstant
			:type Integer
			:location "468:3-468:28"
		)]
	) ) ( def MARTE_NFPRealConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_NFPConstant]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "bodyBeforeComa"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_NFPRealConstant
			:type Integer
			:location "474:3-474:38"
		) ( struct-map
			KM3_Attribute
			:name "bodyAfterComa"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_NFPRealConstant
			:type Integer
			:location "475:3-475:37"
		)]
	) ) ( def MARTE_NFPBooleanConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_NFPConstant]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_NFPBooleanConstant
			:type Boolean
			:location "481:3-481:28"
		)]
	) ) ( def MARTE_NFPVariable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_NFPValueSpecification]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "varName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_NFPVariable
			:type String
			:location "487:3-487:30"
		)]
	) ) ( def MARTE_NFPExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_NFPValueSpecification]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "body"
			:upper -1
			:lower 1
			:isOrdered true
			:owner MARTE_NFPExpression
			:type String
			:location "493:3-493:40"
		) ( struct-map
			KM3_Reference
			:name "operand"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_NFPExpression
			:type MARTE_NFPValueSpecification
			:location "494:3-494:80"
			:isContainer true
			:opposite expression
		)]
	) ) ( def MARTE_Classifier ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MARTE_AnnotatedModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "instances"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_Classifier
			:type MARTE_InstanceSpecification
			:location "592:3-592:66"
			:isContainer false
			:opposite type
		)]
	) ) ( def MARTE_ResourceClassifier ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MARTE_Classifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "offeredService"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_ResourceClassifier
			:type MARTE_ResourceServiceClassifier
			:location "598:3-598:80"
			:isContainer false
			:opposite resType
		)]
	) ) ( def MARTE_ResourceServiceClassifier ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MARTE_Classifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "resType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_ResourceServiceClassifier
			:type MARTE_ResourceClassifier
			:location "604:3-604:68"
			:isContainer false
			:opposite offeredService
		)]
	) ) ( def MARTE_InstanceSpecification ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MARTE_AnnotatedModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_InstanceSpecification
			:type MARTE_Classifier
			:location "610:3-610:57"
			:isContainer false
			:opposite instances
		)]
	) ) ( def MARTE_ResourceInstanceSpecification ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MARTE_InstanceSpecification]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "offeredServiceInstance"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_ResourceInstanceSpecification
			:type MARTE_ResourceServiceInstanceSpecification
			:location "616:3-616:102"
			:isContainer false
			:opposite resintSpec
		)]
	) ) ( def MARTE_ResourceServiceInstanceSpecification ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MARTE_InstanceSpecification]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "resintSpec"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_ResourceServiceInstanceSpecification
			:type MARTE_ResourceInstanceSpecification
			:location "622:3-622:90"
			:isContainer false
			:opposite offeredServiceInstance
		)]
	) ) ( def MARTE_Hardware ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Hardware
			:type MARTE_Hardware
			:location "631:3-631:50"
			:isContainer false
			:opposite containH
		) ( struct-map
			KM3_Reference
			:name "containH"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_Hardware
			:type MARTE_Hardware
			:location "632:3-632:53"
			:isContainer false
			:opposite owner
		) ( struct-map
			KM3_Reference
			:name "containHL"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_Hardware
			:type MARTE_HardwareLibrary
			:location "633:3-633:61"
			:isContainer false
			:opposite owner
		) ( struct-map
			KM3_Reference
			:name "containHE"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_Hardware
			:type MARTE_HardwareEntity
			:location "634:3-634:60"
			:isContainer false
			:opposite owner
		) ( struct-map
			KM3_Reference
			:name "deploymentConfiguration"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_Hardware
			:type MARTE_HardwareDeployment
			:location "635:3-635:78"
			:isContainer false
			:opposite owner
		)]
	) ) ( def MARTE_HardwareLibrary ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_HardwareLibrary
			:type MARTE_Hardware
			:location "641:3-641:51"
			:isContainer false
			:opposite containHL
		)]
	) ) ( def MARTE_HardwareEntity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_HardwareEntity
			:type MARTE_Hardware
			:location "647:3-647:51"
			:isContainer false
			:opposite containHE
		)]
	) ) ( def MARTE_HardwareDeployment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_HardwareDeployment
			:type MARTE_Hardware
			:location "653:3-653:65"
			:isContainer false
			:opposite deploymentConfiguration
		) ( struct-map
			KM3_Reference
			:name "contain"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_HardwareDeployment
			:type MARTE_HardwareEntityInstance
			:location "654:3-654:68"
			:isContainer false
			:opposite owner
		)]
	) ) ( def MARTE_HardwareEntityInstance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_HardwareEntityInstance
			:type MARTE_HardwareDeployment
			:location "661:3-661:59"
			:isContainer false
			:opposite contain
		)]
	) ) ( def MARTE_ECUInstance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_HardwareEntityInstance]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "composedOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_ECUInstance
			:type MARTE_ECUGateInstance
			:location "667:3-667:55"
			:isContainer true
		)]
	) ) ( def MARTE_ChannelInstance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_HardwareEntityInstance]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "gateInstances"
			:upper -1
			:lower 2
			:isOrdered false
			:owner MARTE_ChannelInstance
			:type MARTE_ECUGateInstance
			:location "673:3-673:69"
			:isContainer false
			:opposite channel
		)]
	) ) ( def MARTE_ECUGateInstance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "channel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_ECUGateInstance
			:type MARTE_ChannelInstance
			:location "679:3-679:64"
			:isContainer false
			:opposite gateInstances
		)]
	) ) ( def MARTE_ECU ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_HardwareEntity]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "contain"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_ECU
			:type MARTE_ECUGate
			:location "687:3-687:63"
			:isContainer true
			:opposite owner
		)]
	) ) ( def MARTE_ECUGate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_ECUGate
			:type MARTE_ECU
			:location "693:3-693:44"
			:isContainer false
			:opposite contain
		) ( struct-map
			KM3_Reference
			:name "kindOf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_ECUGate
			:type MARTE_Channel
			:location "694:3-694:49"
			:isContainer false
			:opposite specify
		)]
	) ) ( def MARTE_Channel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "specify"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MARTE_Channel
			:type MARTE_ECUGate
			:location "700:3-700:54"
			:isContainer false
			:opposite kindOf
		)]
	) ) ( def MARTE_AnalysisContext ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "global"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_AnalysisContext
			:type MARTE_ComplexNFP
			:location "710:3-710:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "workload"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MARTE_AnalysisContext
			:type MARTE_Workload
			:location "711:3-711:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "behavior"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MARTE_AnalysisContext
			:type MARTE_Behavior
			:location "712:3-712:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "usedResources"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_AnalysisContext
			:type MARTE_Resource
			:location "713:3-713:53"
			:isContainer true
		)]
	) ) ( def MARTE_Workload ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "transaction"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_Workload
			:type MARTE_Transaction
			:location "721:3-721:64"
			:isContainer false
			:opposite workload
		)]
	) ) ( def MARTE_Transaction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "workload"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_Transaction
			:type MARTE_Workload
			:location "727:3-727:61"
			:isContainer false
			:opposite transaction
		) ( struct-map
			KM3_Reference
			:name "trigger"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_Transaction
			:type MARTE_Trigger
			:location "728:3-728:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "response"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Transaction
			:type MARTE_Response
			:location "729:3-729:43"
			:isContainer true
		)]
	) ) ( def MARTE_Trigger ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "arrivalPattern"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Trigger
			:type MARTE_ComplexNFP
			:location "735:3-735:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "effect"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_Trigger
			:type MARTE_Response
			:location "736:3-736:53"
			:isContainer false
			:opposite cause
		)]
	) ) ( def MARTE_Response ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "efficiency"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Response
			:type MARTE_ComplexNFP
			:location "742:3-742:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "endToEndLatency"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Response
			:type MARTE_ComplexNFP
			:location "743:3-743:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "cause"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_Response
			:type MARTE_Trigger
			:location "744:3-744:52"
			:isContainer false
			:opposite effect
		) ( struct-map
			KM3_Reference
			:name "behavior"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_Response
			:type MARTE_Scenario
			:location "745:3-745:66"
			:isContainer false
			:opposite endToEndResponse
		)]
	) ) ( def MARTE_Behavior ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "scenario"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_Behavior
			:type MARTE_Scenario
			:location "753:3-753:68"
			:isContainer true
			:opposite behavior
		)]
	) ) ( def MARTE_Scenario ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "behavior"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_Scenario
			:type MARTE_Behavior
			:location "759:3-759:58"
			:isContainer false
			:opposite scenario
		) ( struct-map
			KM3_Reference
			:name "scenarionLatency"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_Scenario
			:type MARTE_ComplexNFP
			:location "760:3-760:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "steps"
			:upper -1
			:lower 1
			:isOrdered true
			:owner MARTE_Scenario
			:type MARTE_Step
			:location "761:3-761:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "root"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Scenario
			:type MARTE_Step
			:location "762:3-762:25"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "endToEndResponse"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Scenario
			:type MARTE_Response
			:location "763:3-763:61"
			:isContainer false
			:opposite behavior
		)]
	) ) ( def MARTE_Step ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_Scenario]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "predecessor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_Step
			:type MARTE_Step
			:location "769:3-769:56"
			:isContainer false
			:opposite successor
		) ( struct-map
			KM3_Reference
			:name "successor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_Step
			:type MARTE_Step
			:location "770:3-770:56"
			:isContainer false
			:opposite predecessor
		) ( struct-map
			KM3_Reference
			:name "stepLatency"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_Step
			:type MARTE_ComplexNFP
			:location "771:3-771:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "usedResourceService"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_Step
			:type MARTE_Service
			:location "772:3-772:46"
			:isContainer false
		)]
	) ) ( def MARTE_Resource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def MARTE_BasicResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_Resource]
		:structuralFeatures[]
	) ) ( def MARTE_StructuredResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_Resource]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "basicResource"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_StructuredResource
			:type MARTE_BasicResource
			:location "788:3-788:53"
			:isContainer true
		)]
	) ) ( def MARTE_ProcessingResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_StructuredResource]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "links"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MARTE_ProcessingResource
			:type MARTE_Link
			:location "794:3-794:29"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "components"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_ProcessingResource
			:type MARTE_Component
			:location "795:3-795:41"
			:isContainer false
		)]
	) ) ( def MARTE_Link ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def MARTE_ProcessResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_StructuredResource]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "components"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_ProcessResource
			:type MARTE_Component
			:location "805:3-805:60"
			:isContainer false
			:opposite process
		)]
	) ) ( def MARTE_Component ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "process"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_Component
			:type MARTE_ProcessResource
			:location "811:3-811:66"
			:isContainer false
			:opposite components
		) ( struct-map
			KM3_Reference
			:name "interfaces"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_Component
			:type MARTE_Interface
			:location "812:3-812:41"
			:isContainer false
		)]
	) ) ( def MARTE_StructuredComponent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_Component]
		:structuralFeatures[]
	) ) ( def MARTE_BasicComponent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_Component]
		:structuralFeatures[]
	) ) ( def MARTE_LogicalResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_StructuredResource]
		:structuralFeatures[]
	) ) ( def MARTE_ServerResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MARTE_StructuredResource]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "services"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MARTE_ServerResource
			:type MARTE_Service
			:location "830:3-830:57"
			:isContainer false
			:opposite resource
		)]
	) ) ( def MARTE_Service ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "resource"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Service
			:type MARTE_ServerResource
			:location "836:3-836:59"
			:isContainer false
			:opposite services
		) ( struct-map
			KM3_Reference
			:name "interface"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Service
			:type MARTE_Interface
			:location "837:3-837:54"
			:isContainer false
			:opposite service
		)]
	) ) ( def MARTE_Interface ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "service"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MARTE_Interface
			:type MARTE_Service
			:location "843:3-843:52"
			:isContainer false
			:opposite interface
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "853:2-853:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "854:2-854:19"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "855:2-855:19"
	) )]
) )
