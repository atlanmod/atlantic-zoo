( declare SysML_Entity )
( declare SysML_NamedElement )
( declare SysML_Dependency )
( declare SysML_Conform )
( declare SysML_Package )
( declare SysML_View )
( declare SysML_Class )
( declare SysML_Viewpoint )
( declare SysML_Comment )
( declare SysML_Rationale )
( declare SysML_Problem )
( declare SysML_Block )
( declare SysML_ConstraintBlock )
( declare SysML_Property )
( declare SysML_BlockProperty )
( declare SysML_ConstraintProperty )
( declare SysML_DistributedProperty )
( declare SysML_DataType )
( declare SysML_ValueType )
( declare SysML_Unit )
( declare SysML_Dimension )
( declare SysML_ConnectorEnd )
( declare SysML_NestedConnectorEnd )
( declare SysML_Port )
( declare SysML_FlowPort )
( declare SysML_FlowProperty )
( declare SysML_Interface )
( declare SysML_FlowSpecification )
( declare SysML_FlowDirection )
( declare SysML_Classifier )
( declare SysML_InformationItem )
( declare SysML_InformationFlow )
( declare SysML_ItemFlow )
( declare SysML_Parameter )
( declare SysML_ActivityEdge )
( declare SysML_ParameterSet )
( declare SysML_Optional )
( declare SysML_Rate )
( declare SysML_InstanceSpecification )
( declare SysML_Continous )
( declare SysML_Discrete )
( declare SysML_Probability )
( declare SysML_ValueSpecification )
( declare SysML_Behavior )
( declare SysML_Operation )
( declare SysML_ControlOperation )
( declare SysML_ObjectNode )
( declare SysML_NoBuffer )
( declare SysML_Overwrite )
( declare SysML_Abstraction )
( declare SysML_Allocate )
( declare SysML_Allocated )
( declare SysML_ActivityPartition )
( declare SysML_AllocateActivityPartition )
( declare SysML_Trace )
( declare SysML_DeriveReqt )
( declare SysML_Verify )
( declare SysML_Copy )
( declare SysML_Realization )
( declare SysML_Satisfy )
( declare SysML_Requirement )
( declare SysML_TestCase )
( declare SysML_RequirementRelated )
( declare SysML_BasicInterval )
( declare SysML_Interval )
( declare SysML_Uniform )
( declare SysML_Normal )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Boolean )
( def SysML ( struct-map
	KM3_Package
	:contents[( def FlowDirection ( :literals[( struct-map
		KM3_EnumLiteral
		:name "in"
		:location "186:3-186:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "out"
		:location "187:3-187:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "inout"
		:location "188:3-188:17"
	)] ) ) ( def SysML_Entity ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def SysML_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SysML_Entity]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SysML_NamedElement
			:type String
			:location "23:3-23:27"
		)]
	) ) ( def SysML_Dependency ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_NamedElement]
		:structuralFeatures[]
	) ) ( def SysML_Conform ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Dependency]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SysML_Conform
			:type SysML_Viewpoint
			:location "35:3-35:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SysML_Conform
			:type SysML_View
			:location "36:3-36:27"
			:isContainer false
		)]
	) ) ( def SysML_Package ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_NamedElement]
		:structuralFeatures[]
	) ) ( def SysML_View ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Package]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "conformsTo"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SysML_View
			:type SysML_Viewpoint
			:location "47:3-47:36"
			:isContainer false
		)]
	) ) ( def SysML_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Classifier]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SysML_Class
			:type String
			:location "54:3-54:28"
		)]
	) ) ( def SysML_Viewpoint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Class]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "stakeholders"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SysML_Viewpoint
			:type String
			:location "60:3-60:38"
		) ( struct-map
			KM3_Attribute
			:name "purpose"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SysML_Viewpoint
			:type String
			:location "61:3-61:30"
		) ( struct-map
			KM3_Attribute
			:name "concerns"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SysML_Viewpoint
			:type String
			:location "62:3-62:34"
		) ( struct-map
			KM3_Attribute
			:name "languages"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SysML_Viewpoint
			:type String
			:location "63:3-63:35"
		) ( struct-map
			KM3_Attribute
			:name "methods"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SysML_Viewpoint
			:type String
			:location "64:3-64:33"
		)]
	) ) ( def SysML_Comment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Entity]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "content"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SysML_Comment
			:type String
			:location "71:3-71:30"
		)]
	) ) ( def SysML_Rationale ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Comment]
		:structuralFeatures[]
	) ) ( def SysML_Problem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Comment]
		:structuralFeatures[]
	) ) ( def SysML_Block ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Class]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isEncapsulated"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SysML_Block
			:type Boolean
			:location "87:3-87:38"
		)]
	) ) ( def SysML_ConstraintBlock ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Block]
		:structuralFeatures[]
	) ) ( def SysML_Property ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Entity]
		:structuralFeatures[]
	) ) ( def SysML_BlockProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Property]
		:structuralFeatures[]
	) ) ( def SysML_ConstraintProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_BlockProperty]
		:structuralFeatures[]
	) ) ( def SysML_DistributedProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_BlockProperty]
		:structuralFeatures[]
	) ) ( def SysML_DataType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Entity]
		:structuralFeatures[]
	) ) ( def SysML_ValueType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_DataType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "unit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SysML_ValueType
			:type SysML_Unit
			:location "123:3-123:30"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dimension"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SysML_ValueType
			:type SysML_Dimension
			:location "124:3-124:40"
			:isContainer false
		)]
	) ) ( def SysML_Unit ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_ValueType]
		:structuralFeatures[]
	) ) ( def SysML_Dimension ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_ValueType]
		:structuralFeatures[]
	) ) ( def SysML_ConnectorEnd ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Entity]
		:structuralFeatures[]
	) ) ( def SysML_NestedConnectorEnd ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_ConnectorEnd]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "propertyPath"
			:upper -1
			:lower 2
			:isOrdered true
			:owner SysML_NestedConnectorEnd
			:type SysML_Property
			:location "145:3-145:60"
			:isContainer true
		)]
	) ) ( def SysML_Port ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Property]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isBehavior"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SysML_Port
			:type Boolean
			:location "155:3-155:34"
		)]
	) ) ( def SysML_FlowPort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Port]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isAtomic"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SysML_FlowPort
			:type Boolean
			:location "161:3-161:32"
		) ( struct-map
			KM3_Attribute
			:name "direction"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SysML_FlowPort
			:type FlowDirection
			:location "162:3-162:44"
		) ( struct-map
			KM3_Attribute
			:name "isConjugated"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SysML_FlowPort
			:type Boolean
			:location "163:3-163:41"
		)]
	) ) ( def SysML_FlowProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Property]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "direction"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SysML_FlowProperty
			:type FlowDirection
			:location "169:3-169:44"
		)]
	) ) ( def SysML_Interface ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Entity]
		:structuralFeatures[]
	) ) ( def SysML_FlowSpecification ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Interface]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedFlowProperty"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SysML_FlowSpecification
			:type SysML_FlowProperty
			:location "180:3-180:59"
			:isContainer true
		)]
	) ) ( def SysML_Classifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Entity]
		:structuralFeatures[]
	) ) ( def SysML_InformationItem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Classifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "represented"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SysML_InformationItem
			:type SysML_Classifier
			:location "202:3-202:41"
			:isContainer false
		)]
	) ) ( def SysML_InformationFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Entity]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "conveyed"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SysML_InformationFlow
			:type SysML_Classifier
			:location "209:3-209:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SysML_InformationFlow
			:type SysML_NamedElement
			:location "210:3-210:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SysML_InformationFlow
			:type SysML_NamedElement
			:location "211:3-211:40"
			:isContainer false
		)]
	) ) ( def SysML_ItemFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_InformationFlow]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "itemProperty"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SysML_ItemFlow
			:type SysML_BlockProperty
			:location "217:3-217:47"
			:isContainer false
		)]
	) ) ( def SysML_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Entity]
		:structuralFeatures[]
	) ) ( def SysML_ActivityEdge ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Entity]
		:structuralFeatures[]
	) ) ( def SysML_ParameterSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Entity]
		:structuralFeatures[]
	) ) ( def SysML_Optional ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Parameter]
		:structuralFeatures[]
	) ) ( def SysML_Rate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Parameter SysML_ActivityEdge]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "instance"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SysML_Rate
			:type SysML_InstanceSpecification
			:location "245:3-245:46"
			:isContainer false
		)]
	) ) ( def SysML_InstanceSpecification ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Entity]
		:structuralFeatures[]
	) ) ( def SysML_Continous ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Rate]
		:structuralFeatures[]
	) ) ( def SysML_Discrete ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Rate]
		:structuralFeatures[]
	) ) ( def SysML_Probability ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_ActivityEdge SysML_ParameterSet]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "probability"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SysML_Probability
			:type SysML_ValueSpecification
			:location "263:3-263:46"
			:isContainer false
		)]
	) ) ( def SysML_ValueSpecification ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Entity]
		:structuralFeatures[]
	) ) ( def SysML_Behavior ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Entity]
		:structuralFeatures[]
	) ) ( def SysML_Operation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Entity]
		:structuralFeatures[]
	) ) ( def SysML_ControlOperation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Behavior SysML_Operation]
		:structuralFeatures[]
	) ) ( def SysML_ObjectNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Entity]
		:structuralFeatures[]
	) ) ( def SysML_NoBuffer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_ObjectNode]
		:structuralFeatures[]
	) ) ( def SysML_Overwrite ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_ObjectNode]
		:structuralFeatures[]
	) ) ( def SysML_Abstraction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Entity]
		:structuralFeatures[]
	) ) ( def SysML_Allocate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Abstraction]
		:structuralFeatures[]
	) ) ( def SysML_Allocated ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "allocatedFrom"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SysML_Allocated
			:type SysML_NamedElement
			:location "311:3-311:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "allocatedTo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SysML_Allocated
			:type SysML_NamedElement
			:location "312:3-312:43"
			:isContainer false
		)]
	) ) ( def SysML_ActivityPartition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Entity]
		:structuralFeatures[]
	) ) ( def SysML_AllocateActivityPartition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_ActivityPartition]
		:structuralFeatures[]
	) ) ( def SysML_Trace ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Entity]
		:structuralFeatures[]
	) ) ( def SysML_DeriveReqt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Trace]
		:structuralFeatures[]
	) ) ( def SysML_Verify ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Trace]
		:structuralFeatures[]
	) ) ( def SysML_Copy ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Trace]
		:structuralFeatures[]
	) ) ( def SysML_Realization ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Entity]
		:structuralFeatures[]
	) ) ( def SysML_Satisfy ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Realization]
		:structuralFeatures[]
	) ) ( def SysML_Requirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Class]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SysML_Requirement
			:type String
			:location "355:3-355:27"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SysML_Requirement
			:type String
			:location "356:3-356:25"
		) ( struct-map
			KM3_Reference
			:name "derived"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SysML_Requirement
			:type SysML_Requirement
			:location "357:3-357:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "derivedFrom"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SysML_Requirement
			:type SysML_Requirement
			:location "358:3-358:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "satisfiedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SysML_Requirement
			:type SysML_NamedElement
			:location "359:3-359:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "refinedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SysML_Requirement
			:type SysML_NamedElement
			:location "360:3-360:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "tracedTo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SysML_Requirement
			:type SysML_NamedElement
			:location "361:3-361:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "verifiedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SysML_Requirement
			:type SysML_TestCase
			:location "362:3-362:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "master"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SysML_Requirement
			:type SysML_Requirement
			:location "363:3-363:34"
			:isContainer false
		)]
	) ) ( def SysML_TestCase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_Behavior SysML_Operation]
		:structuralFeatures[]
	) ) ( def SysML_RequirementRelated ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "verifies"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SysML_RequirementRelated
			:type SysML_Requirement
			:location "373:3-373:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "tracedFrom"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SysML_RequirementRelated
			:type SysML_Requirement
			:location "374:3-374:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "satisfies"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SysML_RequirementRelated
			:type SysML_Requirement
			:location "375:3-375:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "refines"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SysML_RequirementRelated
			:type SysML_Requirement
			:location "376:3-376:38"
			:isContainer false
		)]
	) ) ( def SysML_BasicInterval ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_DistributedProperty]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "min"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SysML_BasicInterval
			:type Integer
			:location "384:3-384:27"
		) ( struct-map
			KM3_Attribute
			:name "max"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SysML_BasicInterval
			:type Integer
			:location "385:3-385:27"
		)]
	) ) ( def SysML_Interval ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_BasicInterval]
		:structuralFeatures[]
	) ) ( def SysML_Uniform ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_BasicInterval]
		:structuralFeatures[]
	) ) ( def SysML_Normal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SysML_DistributedProperty]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "mean"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SysML_Normal
			:type Integer
			:location "399:3-399:28"
		) ( struct-map
			KM3_Attribute
			:name "standardDeviation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SysML_Normal
			:type Integer
			:location "400:3-400:41"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "410:2-410:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "411:2-411:19"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "412:2-412:19"
	) )]
) )
