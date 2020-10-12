( declare SimulinkStateFlow_Simulink )
( declare SimulinkStateFlow_System )
( declare SimulinkStateFlow_Connector )
( declare SimulinkStateFlow_Line )
( declare SimulinkStateFlow_BranchPoint )
( declare SimulinkStateFlow_Port )
( declare SimulinkStateFlow_Block )
( declare SimulinkStateFlow_BlockRef )
( declare SimulinkStateFlow_Primitive )
( declare SimulinkStateFlow_OutPut )
( declare SimulinkStateFlow_TriggerPort )
( declare SimulinkStateFlow_EnablePort )
( declare SimulinkStateFlow_Reference )
( declare SimulinkStateFlow_Annotation )
( declare SimulinkStateFlow_Parameter )
( declare SimulinkStateFlow_Units )
( declare SimulinkStateFlow_TriggerEnum )
( declare SimulinkStateFlow_EnableEnum )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def SimulinkStateFlow ( struct-map
	KM3_Package
	:contents[( def Units ( :literals[( struct-map
		KM3_EnumLiteral
		:name "alpha"
		:location "113:3-113:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "beta"
		:location "114:3-114:16"
	)] ) ) ( def TriggerEnum ( :literals[( struct-map
		KM3_EnumLiteral
		:name "alpha"
		:location "119:3-119:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "beta"
		:location "120:3-120:16"
	)] ) ) ( def EnableEnum ( :literals[( struct-map
		KM3_EnumLiteral
		:name "alpha"
		:location "125:3-125:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "beta"
		:location "126:3-126:16"
	)] ) ) ( def SimulinkStateFlow_Simulink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "subSystem"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimulinkStateFlow_Simulink
			:type SimulinkStateFlow_System
			:location "12:3-12:65"
			:isContainer true
			:opposite simulink
		)]
	) ) ( def SimulinkStateFlow_System ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_System
			:type String
			:location "17:3-17:27"
		) ( struct-map
			KM3_Reference
			:name "simulink"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_System
			:type SimulinkStateFlow_Simulink
			:location "19:3-19:54"
			:isContainer false
			:opposite subSystem
		) ( struct-map
			KM3_Reference
			:name "blocks"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_System
			:type SimulinkStateFlow_Block
			:location "20:3-20:46"
			:isContainer false
			:opposite system
		) ( struct-map
			KM3_Reference
			:name "lines"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_System
			:type SimulinkStateFlow_Line
			:location "21:3-21:44"
			:isContainer false
			:opposite system
		) ( struct-map
			KM3_Reference
			:name "subSystem"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimulinkStateFlow_System
			:type SimulinkStateFlow_System
			:location "22:3-22:45"
			:isContainer true
		)]
	) ) ( def SimulinkStateFlow_Connector ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def SimulinkStateFlow_Line ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_Line
			:type String
			:location "33:3-33:27"
		) ( struct-map
			KM3_Reference
			:name "block"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_Line
			:type SimulinkStateFlow_Block
			:location "35:3-35:44"
			:isContainer false
			:opposite lines
		) ( struct-map
			KM3_Reference
			:name "system"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_Line
			:type SimulinkStateFlow_System
			:location "36:3-36:46"
			:isContainer false
			:opposite lines
		)]
	) ) ( def SimulinkStateFlow_BranchPoint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimulinkStateFlow_Connector]
		:structuralFeatures[]
	) ) ( def SimulinkStateFlow_Port ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimulinkStateFlow_Connector]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "units"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_Port
			:type Units
			:location "46:3-46:27"
		)]
	) ) ( def SimulinkStateFlow_Block ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_Block
			:type String
			:location "51:3-51:34"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_Block
			:type String
			:location "52:3-52:27"
		) ( struct-map
			KM3_Attribute
			:name "priority"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_Block
			:type String
			:location "53:3-53:31"
		) ( struct-map
			KM3_Attribute
			:name "natagme"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_Block
			:type String
			:location "54:3-54:30"
		) ( struct-map
			KM3_Attribute
			:name "blockType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_Block
			:type String
			:location "55:3-55:32"
		) ( struct-map
			KM3_Reference
			:name "lines"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimulinkStateFlow_Block
			:type SimulinkStateFlow_Line
			:location "57:3-57:56"
			:isContainer true
			:opposite block
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimulinkStateFlow_Block
			:type SimulinkStateFlow_Parameter
			:location "58:3-58:66"
			:isContainer true
			:opposite block
		) ( struct-map
			KM3_Reference
			:name "annotations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimulinkStateFlow_Block
			:type SimulinkStateFlow_Annotation
			:location "59:3-59:68"
			:isContainer true
			:opposite block
		) ( struct-map
			KM3_Reference
			:name "blockRefs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimulinkStateFlow_Block
			:type SimulinkStateFlow_BlockRef
			:location "60:3-60:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "system"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_Block
			:type SimulinkStateFlow_System
			:location "61:3-61:47"
			:isContainer false
			:opposite blocks
		)]
	) ) ( def SimulinkStateFlow_BlockRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def SimulinkStateFlow_Primitive ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimulinkStateFlow_Block]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "deadLine"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_Primitive
			:type String
			:location "71:3-71:31"
		) ( struct-map
			KM3_Attribute
			:name "period"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_Primitive
			:type String
			:location "72:3-72:29"
		) ( struct-map
			KM3_Attribute
			:name "executionTime"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_Primitive
			:type String
			:location "73:3-73:36"
		)]
	) ) ( def SimulinkStateFlow_OutPut ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimulinkStateFlow_Port]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "number"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_OutPut
			:type Integer
			:location "78:3-78:30"
		)]
	) ) ( def SimulinkStateFlow_TriggerPort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimulinkStateFlow_Port]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "triggerType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_TriggerPort
			:type TriggerEnum
			:location "83:3-83:39"
		)]
	) ) ( def SimulinkStateFlow_EnablePort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimulinkStateFlow_Port]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "statesWhenEnabling"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_EnablePort
			:type EnableEnum
			:location "88:3-88:45"
		)]
	) ) ( def SimulinkStateFlow_Reference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimulinkStateFlow_Block]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "sourceBlock"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_Reference
			:type String
			:location "93:3-93:34"
		) ( struct-map
			KM3_Attribute
			:name "sourceType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_Reference
			:type String
			:location "94:3-94:33"
		)]
	) ) ( def SimulinkStateFlow_Annotation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_Annotation
			:type String
			:location "99:3-99:27"
		) ( struct-map
			KM3_Reference
			:name "block"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_Annotation
			:type SimulinkStateFlow_Block
			:location "101:3-101:50"
			:isContainer false
			:opposite annotations
		)]
	) ) ( def SimulinkStateFlow_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_Parameter
			:type String
			:location "106:3-106:28"
		) ( struct-map
			KM3_Reference
			:name "block"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimulinkStateFlow_Parameter
			:type SimulinkStateFlow_Block
			:location "108:3-108:49"
			:isContainer false
			:opposite parameters
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "131:2-131:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "132:2-132:19"
	) )]
) )
