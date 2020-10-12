( declare bpmn_Activity )
( declare bpmn_ActivityType )
( declare bpmn_ActivityTypeObject )
( declare bpmn_Artifact )
( declare bpmn_ArtifactsContainer )
( declare bpmn_Association )
( declare bpmn_BpmnDiagram )
( declare bpmn_DataObject )
( declare bpmn_DirectionType )
( declare bpmn_DirectionTypeObject )
( declare bpmn_Graph )
( declare bpmn_Group )
( declare bpmn_Identifiable )
( declare bpmn_IdentifiableNode )
( declare bpmn_Lane )
( declare bpmn_MessagingEdge )
( declare bpmn_NamedBpmnObject )
( declare bpmn_Pool )
( declare bpmn_SequenceEdge )
( declare bpmn_SubProcess )
( declare bpmn_TextAnnotation )
( declare bpmn_Vertex )
( declare type_AnySimpleType )
( declare type_AnyURI )
( declare type_Base64Binary )
( declare type_Boolean )
( declare type_BooleanObject )
( declare type_Byte )
( declare type_ByteObject )
( declare type_Date )
( declare type_DateTime )
( declare type_Decimal )
( declare type_Double )
( declare type_DoubleObject )
( declare type_Duration )
( declare type_ENTITIES )
( declare type_ENTITIESBase )
( declare type_ENTITY )
( declare type_Float )
( declare type_FloatObject )
( declare type_GDay )
( declare type_GMonth )
( declare type_GMonthDay )
( declare type_GYear )
( declare type_GYearMonth )
( declare type_HexBinary )
( declare type_ID )
( declare type_IDREF )
( declare type_IDREFS )
( declare type_IDREFSBase )
( declare type_Int )
( declare type_Integer )
( declare type_IntObject )
( declare type_Language )
( declare type_Long )
( declare type_LongObject )
( declare type_Name )
( declare type_NCName )
( declare type_NegativeInteger )
( declare type_NMTOKEN )
( declare type_NMTOKENS )
( declare type_NMTOKENSBase )
( declare type_NonNegativeInteger )
( declare type_NonPositiveInteger )
( declare type_NormalizedString )
( declare type_NOTATION )
( declare type_PositiveInteger )
( declare type_QName )
( declare type_Short )
( declare type_ShortObject )
( declare type_String )
( declare type_Time )
( declare type_Token )
( declare type_UnsignedByte )
( declare type_UnsignedByteObject )
( declare type_UnsignedInt )
( declare type_UnsignedIntObject )
( declare type_UnsignedLong )
( declare type_UnsignedShort )
( declare type_UnsignedShortObject )
( def bpmn ( struct-map
	KM3_Package
	:contents[( def ActivityType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "SubProcess"
		:location "22:3-22:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventEndMultiple"
		:location "23:3-23:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventEndMessage"
		:location "24:3-24:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventIntermediateMessage"
		:location "25:3-25:36"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventStartMultiple"
		:location "26:3-26:30"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventIntermediateMultiple"
		:location "27:3-27:37"
	) ( struct-map
		KM3_EnumLiteral
		:name "GatewayParallel"
		:location "28:3-28:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventStartTimer"
		:location "29:3-29:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventStartEmpty"
		:location "30:3-30:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventIntermediateCancel"
		:location "31:3-31:35"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventEndError"
		:location "32:3-32:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventStartRule"
		:location "33:3-33:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventEndTerminate"
		:location "34:3-34:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventStartLink"
		:location "35:3-35:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventIntermediateLink"
		:location "36:3-36:33"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventEndCancel"
		:location "37:3-37:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventEndLink"
		:location "38:3-38:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventIntermediateEmpty"
		:location "39:3-39:34"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventIntermediateCompensation"
		:location "40:3-40:41"
	) ( struct-map
		KM3_EnumLiteral
		:name "Task"
		:location "41:3-41:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "GatewayDataBasedExclusive"
		:location "42:3-42:37"
	) ( struct-map
		KM3_EnumLiteral
		:name "GatewayComplex"
		:location "43:3-43:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventEndEmpty"
		:location "44:3-44:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventIntermediateError"
		:location "45:3-45:34"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventIntermediateTimer"
		:location "46:3-46:34"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventEndCompensation"
		:location "47:3-47:32"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventStartMessage"
		:location "48:3-48:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "GatewayDataBasedInclusive"
		:location "49:3-49:37"
	) ( struct-map
		KM3_EnumLiteral
		:name "GatewayEventBasedExclusive"
		:location "50:3-50:38"
	) ( struct-map
		KM3_EnumLiteral
		:name "EventIntermediateRule"
		:location "51:3-51:33"
	)] ) ) ( def DirectionType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Both"
		:location "83:3-83:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "From"
		:location "84:3-84:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "To"
		:location "85:3-85:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "None"
		:location "86:3-86:16"
	)] ) ) ( def bpmn_Activity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bpmn_Vertex bpmn_NamedBpmnObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "orderedMessages"
			:upper -1
			:lower 0
			:isOrdered true
			:owner bpmn_Activity
			:type MessagingEdge
			:location "11:3-11:56"
		) ( struct-map
			KM3_Attribute
			:name "activityType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_Activity
			:type ActivityType
			:location "15:3-15:46"
		) ( struct-map
			KM3_Attribute
			:name "looping"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_Activity
			:type Boolean
			:location "18:3-18:36"
		) ( struct-map
			KM3_Reference
			:name "incomingMessages"
			:upper -1
			:lower 0
			:isOrdered true
			:owner bpmn_Activity
			:type bpmn_MessagingEdge
			:location "12:3-12:75"
			:isContainer false
			:opposite target
		) ( struct-map
			KM3_Reference
			:name "outgoingMessages"
			:upper -1
			:lower 0
			:isOrdered true
			:owner bpmn_Activity
			:type bpmn_MessagingEdge
			:location "13:3-13:75"
			:isContainer false
			:opposite source
		) ( struct-map
			KM3_Reference
			:name "groups"
			:upper -1
			:lower 0
			:isOrdered true
			:owner bpmn_Activity
			:type bpmn_Group
			:location "14:3-14:61"
			:isContainer false
			:opposite activities
		) ( struct-map
			KM3_Reference
			:name "eventHandlerFor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_Activity
			:type bpmn_SubProcess
			:location "16:3-16:72"
			:isContainer false
			:opposite eventHandlers
		) ( struct-map
			KM3_Reference
			:name "lane"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_Activity
			:type bpmn_Lane
			:location "17:3-17:52"
			:isContainer false
			:opposite activities
		)]
	) ) ( def ptyp_ActivityTypeObject ( struct-map
		KM3_DataType
		:name "ActivityTypeObject"
		:location "54:2-54:30"
	) ) ( def bpmn_Artifact ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bpmn_Identifiable bpmn_NamedBpmnObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "associations"
			:upper -1
			:lower 0
			:isOrdered true
			:owner bpmn_Artifact
			:type bpmn_Association
			:location "57:3-57:79"
			:isContainer true
			:opposite source
		) ( struct-map
			KM3_Reference
			:name "artifactsContainer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_Artifact
			:type bpmn_ArtifactsContainer
			:location "58:3-58:79"
			:isContainer false
			:opposite artifacts
		)]
	) ) ( def bpmn_ArtifactsContainer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bpmn_NamedBpmnObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "artifacts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner bpmn_ArtifactsContainer
			:type bpmn_Artifact
			:location "62:3-62:85"
			:isContainer true
			:opposite artifactsContainer
		)]
	) ) ( def bpmn_Association ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "direction"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_Association
			:type DirectionType
			:location "66:3-66:44"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_Association
			:type bpmn_Artifact
			:location "67:3-67:60"
			:isContainer false
			:opposite associations
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_Association
			:type bpmn_IdentifiableNode
			:location "68:3-68:68"
			:isContainer false
			:opposite associations
		)]
	) ) ( def bpmn_BpmnDiagram ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bpmn_Identifiable bpmn_ArtifactsContainer]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_BpmnDiagram
			:type String
			:location "74:3-74:34"
		) ( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_BpmnDiagram
			:type String
			:location "75:3-75:33"
		) ( struct-map
			KM3_Reference
			:name "pools"
			:upper -1
			:lower 0
			:isOrdered true
			:owner bpmn_BpmnDiagram
			:type bpmn_Pool
			:location "72:3-72:70"
			:isContainer true
			:opposite bpmnDiagram
		) ( struct-map
			KM3_Reference
			:name "messages"
			:upper -1
			:lower 0
			:isOrdered true
			:owner bpmn_BpmnDiagram
			:type bpmn_MessagingEdge
			:location "73:3-73:82"
			:isContainer true
			:opposite bpmnDiagram
		)]
	) ) ( def bpmn_DataObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bpmn_Artifact]
		:structuralFeatures[]
	) ) ( def ptyp_DirectionTypeObject ( struct-map
		KM3_DataType
		:name "DirectionTypeObject"
		:location "89:2-89:31"
	) ) ( def bpmn_Graph ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bpmn_IdentifiableNode bpmn_ArtifactsContainer]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "vertices"
			:upper -1
			:lower 0
			:isOrdered true
			:owner bpmn_Graph
			:type bpmn_Vertex
			:location "92:3-92:69"
			:isContainer true
			:opposite graph
		) ( struct-map
			KM3_Reference
			:name "sequenceEdges"
			:upper -1
			:lower 0
			:isOrdered true
			:owner bpmn_Graph
			:type bpmn_SequenceEdge
			:location "93:3-93:80"
			:isContainer true
			:opposite graph
		)]
	) ) ( def bpmn_Group ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bpmn_Artifact]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "activities"
			:upper -1
			:lower 0
			:isOrdered true
			:owner bpmn_Group
			:type bpmn_Activity
			:location "97:3-97:64"
			:isContainer false
			:opposite groups
		)]
	) ) ( def bpmn_Identifiable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "iD"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_Identifiable
			:type ID
			:location "101:3-101:26"
		)]
	) ) ( def bpmn_IdentifiableNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bpmn_Identifiable]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "associations"
			:upper -1
			:lower 0
			:isOrdered true
			:owner bpmn_IdentifiableNode
			:type bpmn_Association
			:location "105:3-105:69"
			:isContainer false
			:opposite target
		)]
	) ) ( def bpmn_Lane ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bpmn_Identifiable bpmn_NamedBpmnObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "activities"
			:upper -1
			:lower 0
			:isOrdered true
			:owner bpmn_Lane
			:type bpmn_Activity
			:location "109:3-109:62"
			:isContainer false
			:opposite lane
		) ( struct-map
			KM3_Reference
			:name "pool"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_Lane
			:type bpmn_Pool
			:location "110:3-110:47"
			:isContainer false
			:opposite lanes
		)]
	) ) ( def bpmn_MessagingEdge ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bpmn_Identifiable bpmn_NamedBpmnObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "bpmnDiagram"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_MessagingEdge
			:type bpmn_BpmnDiagram
			:location "114:3-114:64"
			:isContainer false
			:opposite messages
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_MessagingEdge
			:type bpmn_Activity
			:location "115:3-115:64"
			:isContainer false
			:opposite outgoingMessages
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_MessagingEdge
			:type bpmn_Activity
			:location "116:3-116:64"
			:isContainer false
			:opposite incomingMessages
		)]
	) ) ( def bpmn_NamedBpmnObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "documentation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_NamedBpmnObject
			:type String
			:location "120:3-120:41"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_NamedBpmnObject
			:type String
			:location "121:3-121:32"
		) ( struct-map
			KM3_Attribute
			:name "ncname"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_NamedBpmnObject
			:type String
			:location "122:3-122:34"
		)]
	) ) ( def bpmn_Pool ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bpmn_Graph bpmn_NamedBpmnObject]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "lanes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner bpmn_Pool
			:type bpmn_Lane
			:location "126:3-126:63"
			:isContainer true
			:opposite pool
		) ( struct-map
			KM3_Reference
			:name "bpmnDiagram"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_Pool
			:type bpmn_BpmnDiagram
			:location "127:3-127:61"
			:isContainer false
			:opposite pools
		)]
	) ) ( def bpmn_SequenceEdge ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bpmn_Identifiable bpmn_NamedBpmnObject]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isDefault"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_SequenceEdge
			:type Boolean
			:location "132:3-132:38"
		) ( struct-map
			KM3_Reference
			:name "graph"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_SequenceEdge
			:type bpmn_Graph
			:location "131:3-131:57"
			:isContainer false
			:opposite sequenceEdges
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_SequenceEdge
			:type bpmn_Vertex
			:location "133:3-133:59"
			:isContainer false
			:opposite outgoingEdges
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_SequenceEdge
			:type bpmn_Vertex
			:location "134:3-134:59"
			:isContainer false
			:opposite incomingEdges
		)]
	) ) ( def bpmn_SubProcess ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bpmn_Activity bpmn_Graph]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isTransaction"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_SubProcess
			:type Boolean
			:location "139:3-139:42"
		) ( struct-map
			KM3_Reference
			:name "eventHandlers"
			:upper -1
			:lower 0
			:isOrdered true
			:owner bpmn_SubProcess
			:type bpmn_Activity
			:location "138:3-138:86"
			:isContainer true
			:opposite eventHandlerFor
		)]
	) ) ( def bpmn_TextAnnotation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bpmn_Artifact]
		:structuralFeatures[]
	) ) ( def bpmn_Vertex ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[bpmn_IdentifiableNode]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "outgoingEdges"
			:upper -1
			:lower 0
			:isOrdered true
			:owner bpmn_Vertex
			:type bpmn_SequenceEdge
			:location "147:3-147:71"
			:isContainer false
			:opposite source
		) ( struct-map
			KM3_Reference
			:name "incomingEdges"
			:upper -1
			:lower 0
			:isOrdered true
			:owner bpmn_Vertex
			:type bpmn_SequenceEdge
			:location "148:3-148:71"
			:isContainer false
			:opposite target
		) ( struct-map
			KM3_Reference
			:name "graph"
			:upper 1
			:lower 0
			:isOrdered false
			:owner bpmn_Vertex
			:type bpmn_Graph
			:location "149:3-149:52"
			:isContainer false
			:opposite vertices
		)]
	) )]
) )
( def type ( struct-map
	KM3_Package
	:contents[( def ptyp_AnySimpleType ( struct-map
		KM3_DataType
		:name "AnySimpleType"
		:location "176:2-176:25"
	) ) ( def ptyp_AnyURI ( struct-map
		KM3_DataType
		:name "AnyURI"
		:location "178:2-178:18"
	) ) ( def ptyp_Base64Binary ( struct-map
		KM3_DataType
		:name "Base64Binary"
		:location "180:2-180:24"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "182:2-182:19"
	) ) ( def ptyp_BooleanObject ( struct-map
		KM3_DataType
		:name "BooleanObject"
		:location "184:2-184:25"
	) ) ( def ptyp_Byte ( struct-map
		KM3_DataType
		:name "Byte"
		:location "186:2-186:16"
	) ) ( def ptyp_ByteObject ( struct-map
		KM3_DataType
		:name "ByteObject"
		:location "188:2-188:22"
	) ) ( def ptyp_Date ( struct-map
		KM3_DataType
		:name "Date"
		:location "190:2-190:16"
	) ) ( def ptyp_DateTime ( struct-map
		KM3_DataType
		:name "DateTime"
		:location "192:2-192:20"
	) ) ( def ptyp_Decimal ( struct-map
		KM3_DataType
		:name "Decimal"
		:location "194:2-194:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "196:2-196:18"
	) ) ( def ptyp_DoubleObject ( struct-map
		KM3_DataType
		:name "DoubleObject"
		:location "198:2-198:24"
	) ) ( def ptyp_Duration ( struct-map
		KM3_DataType
		:name "Duration"
		:location "200:2-200:20"
	) ) ( def ptyp_ENTITIES ( struct-map
		KM3_DataType
		:name "ENTITIES"
		:location "202:2-202:20"
	) ) ( def ptyp_ENTITIESBase ( struct-map
		KM3_DataType
		:name "ENTITIESBase"
		:location "204:2-204:24"
	) ) ( def ptyp_ENTITY ( struct-map
		KM3_DataType
		:name "ENTITY"
		:location "206:2-206:18"
	) ) ( def ptyp_Float ( struct-map
		KM3_DataType
		:name "Float"
		:location "208:2-208:17"
	) ) ( def ptyp_FloatObject ( struct-map
		KM3_DataType
		:name "FloatObject"
		:location "210:2-210:23"
	) ) ( def ptyp_GDay ( struct-map
		KM3_DataType
		:name "GDay"
		:location "212:2-212:16"
	) ) ( def ptyp_GMonth ( struct-map
		KM3_DataType
		:name "GMonth"
		:location "214:2-214:18"
	) ) ( def ptyp_GMonthDay ( struct-map
		KM3_DataType
		:name "GMonthDay"
		:location "216:2-216:21"
	) ) ( def ptyp_GYear ( struct-map
		KM3_DataType
		:name "GYear"
		:location "218:2-218:17"
	) ) ( def ptyp_GYearMonth ( struct-map
		KM3_DataType
		:name "GYearMonth"
		:location "220:2-220:22"
	) ) ( def ptyp_HexBinary ( struct-map
		KM3_DataType
		:name "HexBinary"
		:location "222:2-222:21"
	) ) ( def ptyp_ID ( struct-map
		KM3_DataType
		:name "ID"
		:location "224:2-224:14"
	) ) ( def ptyp_IDREF ( struct-map
		KM3_DataType
		:name "IDREF"
		:location "226:2-226:17"
	) ) ( def ptyp_IDREFS ( struct-map
		KM3_DataType
		:name "IDREFS"
		:location "228:2-228:18"
	) ) ( def ptyp_IDREFSBase ( struct-map
		KM3_DataType
		:name "IDREFSBase"
		:location "230:2-230:22"
	) ) ( def ptyp_Int ( struct-map
		KM3_DataType
		:name "Int"
		:location "232:2-232:15"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "234:2-234:19"
	) ) ( def ptyp_IntObject ( struct-map
		KM3_DataType
		:name "IntObject"
		:location "236:2-236:21"
	) ) ( def ptyp_Language ( struct-map
		KM3_DataType
		:name "Language"
		:location "238:2-238:20"
	) ) ( def ptyp_Long ( struct-map
		KM3_DataType
		:name "Long"
		:location "240:2-240:16"
	) ) ( def ptyp_LongObject ( struct-map
		KM3_DataType
		:name "LongObject"
		:location "242:2-242:22"
	) ) ( def ptyp_Name ( struct-map
		KM3_DataType
		:name "Name"
		:location "244:2-244:16"
	) ) ( def ptyp_NCName ( struct-map
		KM3_DataType
		:name "NCName"
		:location "246:2-246:18"
	) ) ( def ptyp_NegativeInteger ( struct-map
		KM3_DataType
		:name "NegativeInteger"
		:location "248:2-248:27"
	) ) ( def ptyp_NMTOKEN ( struct-map
		KM3_DataType
		:name "NMTOKEN"
		:location "250:2-250:19"
	) ) ( def ptyp_NMTOKENS ( struct-map
		KM3_DataType
		:name "NMTOKENS"
		:location "252:2-252:20"
	) ) ( def ptyp_NMTOKENSBase ( struct-map
		KM3_DataType
		:name "NMTOKENSBase"
		:location "254:2-254:24"
	) ) ( def ptyp_NonNegativeInteger ( struct-map
		KM3_DataType
		:name "NonNegativeInteger"
		:location "256:2-256:30"
	) ) ( def ptyp_NonPositiveInteger ( struct-map
		KM3_DataType
		:name "NonPositiveInteger"
		:location "258:2-258:30"
	) ) ( def ptyp_NormalizedString ( struct-map
		KM3_DataType
		:name "NormalizedString"
		:location "260:2-260:28"
	) ) ( def ptyp_NOTATION ( struct-map
		KM3_DataType
		:name "NOTATION"
		:location "262:2-262:20"
	) ) ( def ptyp_PositiveInteger ( struct-map
		KM3_DataType
		:name "PositiveInteger"
		:location "264:2-264:27"
	) ) ( def ptyp_QName ( struct-map
		KM3_DataType
		:name "QName"
		:location "266:2-266:17"
	) ) ( def ptyp_Short ( struct-map
		KM3_DataType
		:name "Short"
		:location "268:2-268:17"
	) ) ( def ptyp_ShortObject ( struct-map
		KM3_DataType
		:name "ShortObject"
		:location "270:2-270:23"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "272:2-272:18"
	) ) ( def ptyp_Time ( struct-map
		KM3_DataType
		:name "Time"
		:location "274:2-274:16"
	) ) ( def ptyp_Token ( struct-map
		KM3_DataType
		:name "Token"
		:location "276:2-276:17"
	) ) ( def ptyp_UnsignedByte ( struct-map
		KM3_DataType
		:name "UnsignedByte"
		:location "278:2-278:24"
	) ) ( def ptyp_UnsignedByteObject ( struct-map
		KM3_DataType
		:name "UnsignedByteObject"
		:location "280:2-280:30"
	) ) ( def ptyp_UnsignedInt ( struct-map
		KM3_DataType
		:name "UnsignedInt"
		:location "282:2-282:23"
	) ) ( def ptyp_UnsignedIntObject ( struct-map
		KM3_DataType
		:name "UnsignedIntObject"
		:location "284:2-284:29"
	) ) ( def ptyp_UnsignedLong ( struct-map
		KM3_DataType
		:name "UnsignedLong"
		:location "286:2-286:24"
	) ) ( def ptyp_UnsignedShort ( struct-map
		KM3_DataType
		:name "UnsignedShort"
		:location "288:2-288:25"
	) ) ( def ptyp_UnsignedShortObject ( struct-map
		KM3_DataType
		:name "UnsignedShortObject"
		:location "290:2-290:31"
	) )]
) )
