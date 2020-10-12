( declare OCCAM_OCCAM_Program )
( declare OCCAM_OCCAM_Element )
( declare OCCAM_Process )
( declare OCCAM_Channel )
( declare OCCAM_Action )
( declare OCCAM_Assignment )
( declare OCCAM_Input )
( declare OCCAM_Output )
( declare OCCAM_Constructor )
( declare OCCAM_Buckel )
( declare OCCAM_If )
( declare OCCAM_While )
( declare OCCAM_Condition )
( declare OCCAM_Sequential )
( declare OCCAM_Parallel )
( declare OCCAM_Alternative )
( declare OCCAM_DataType )
( declare OCCAM_Library )
( declare OCCAM_File )
( declare OCCAM_Server )
( declare OCCAM_Declaration )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def OCCAM ( struct-map
	KM3_Package
	:contents[( def OCCAM_OCCAM_Program ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "occam_Elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCCAM_OCCAM_Program
			:type OCCAM_OCCAM_Element
			:location "12:3-12:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "files"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCCAM_OCCAM_Program
			:type OCCAM_File
			:location "13:3-13:40"
			:isContainer true
		)]
	) ) ( def OCCAM_OCCAM_Element ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner OCCAM_OCCAM_Element
			:type String
			:location "19:3-19:33"
		)]
	) ) ( def OCCAM_Process ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCCAM_OCCAM_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "declaration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_Process
			:type OCCAM_Declaration
			:location "25:3-25:68"
			:isContainer true
			:opposite process
		) ( struct-map
			KM3_Reference
			:name "constructors"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCCAM_Process
			:type OCCAM_Constructor
			:location "26:3-26:73"
			:isContainer true
			:opposite process
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCCAM_Process
			:type OCCAM_DataType
			:location "27:3-27:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "libraries"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCCAM_Process
			:type OCCAM_Library
			:location "28:3-28:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "toChannel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_Process
			:type OCCAM_Channel
			:location "29:3-29:33"
			:isContainer false
		)]
	) ) ( def OCCAM_Channel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_Channel
			:type String
			:location "36:3-36:27"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_Channel
			:type String
			:location "37:3-37:27"
		) ( struct-map
			KM3_Reference
			:name "toServer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_Channel
			:type OCCAM_Server
			:location "38:3-38:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "toProcess"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_Channel
			:type OCCAM_Process
			:location "39:3-39:33"
			:isContainer false
		)]
	) ) ( def OCCAM_Action ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCCAM_OCCAM_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constructor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_Action
			:type OCCAM_Constructor
			:location "45:3-45:58"
			:isContainer false
			:opposite actions
		) ( struct-map
			KM3_Reference
			:name "while"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_Action
			:type OCCAM_While
			:location "46:3-46:46"
			:isContainer false
			:opposite actions
		) ( struct-map
			KM3_Reference
			:name "if"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_Action
			:type OCCAM_If
			:location "47:3-47:40"
			:isContainer false
			:opposite actions
		)]
	) ) ( def OCCAM_Assignment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCCAM_Action]
		:structuralFeatures[]
	) ) ( def OCCAM_Input ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCCAM_Action]
		:structuralFeatures[]
	) ) ( def OCCAM_Output ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCCAM_Action]
		:structuralFeatures[]
	) ) ( def OCCAM_Constructor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCCAM_OCCAM_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "process"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_Constructor
			:type OCCAM_Process
			:location "71:3-71:55"
			:isContainer false
			:opposite constructors
		) ( struct-map
			KM3_Reference
			:name "actions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCCAM_Constructor
			:type OCCAM_Action
			:location "72:3-72:67"
			:isContainer true
			:opposite constructor
		) ( struct-map
			KM3_Reference
			:name "buckels"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCCAM_Constructor
			:type OCCAM_Buckel
			:location "73:3-73:67"
			:isContainer true
			:opposite constructor
		) ( struct-map
			KM3_Reference
			:name "childrens"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCCAM_Constructor
			:type OCCAM_Constructor
			:location "74:3-74:51"
			:isContainer true
		)]
	) ) ( def OCCAM_Buckel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constructor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_Buckel
			:type OCCAM_Constructor
			:location "80:3-80:58"
			:isContainer false
			:opposite buckels
		)]
	) ) ( def OCCAM_If ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCCAM_Buckel]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "conditions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCCAM_If
			:type OCCAM_Condition
			:location "86:3-86:63"
			:isContainer true
			:opposite if
		) ( struct-map
			KM3_Reference
			:name "actions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCCAM_If
			:type OCCAM_Action
			:location "87:3-87:58"
			:isContainer true
			:opposite if
		)]
	) ) ( def OCCAM_While ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCCAM_Buckel]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "conditions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCCAM_While
			:type OCCAM_Condition
			:location "93:3-93:66"
			:isContainer true
			:opposite while
		) ( struct-map
			KM3_Reference
			:name "actions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCCAM_While
			:type OCCAM_Action
			:location "94:3-94:61"
			:isContainer true
			:opposite while
		)]
	) ) ( def OCCAM_Condition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "elementRight"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_Condition
			:type String
			:location "100:3-100:35"
		) ( struct-map
			KM3_Attribute
			:name "elementLeft"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_Condition
			:type String
			:location "101:3-101:34"
		) ( struct-map
			KM3_Attribute
			:name "typeCondition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_Condition
			:type String
			:location "102:3-102:36"
		) ( struct-map
			KM3_Reference
			:name "if"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_Condition
			:type OCCAM_If
			:location "103:3-103:42"
			:isContainer false
			:opposite conditions
		) ( struct-map
			KM3_Reference
			:name "while"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_Condition
			:type OCCAM_While
			:location "104:3-104:49"
			:isContainer false
			:opposite conditions
		)]
	) ) ( def OCCAM_Sequential ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCCAM_Constructor]
		:structuralFeatures[]
	) ) ( def OCCAM_Parallel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCCAM_Constructor]
		:structuralFeatures[]
	) ) ( def OCCAM_Alternative ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCCAM_Constructor]
		:structuralFeatures[]
	) ) ( def OCCAM_DataType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[OCCAM_OCCAM_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dataType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_DataType
			:type String
			:location "122:3-122:31"
		)]
	) ) ( def OCCAM_Library ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_Library
			:type String
			:location "128:3-128:27"
		)]
	) ) ( def OCCAM_File ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_File
			:type String
			:location "134:3-134:27"
		)]
	) ) ( def OCCAM_Server ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_Server
			:type String
			:location "140:3-140:27"
		) ( struct-map
			KM3_Reference
			:name "toChannel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_Server
			:type OCCAM_Channel
			:location "141:3-141:33"
			:isContainer false
		)]
	) ) ( def OCCAM_Declaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_Declaration
			:type String
			:location "147:3-147:27"
		) ( struct-map
			KM3_Reference
			:name "process"
			:upper 1
			:lower 1
			:isOrdered false
			:owner OCCAM_Declaration
			:type OCCAM_Process
			:location "148:3-148:54"
			:isContainer false
			:opposite declaration
		) ( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner OCCAM_Declaration
			:type OCCAM_DataType
			:location "149:3-149:47"
			:isContainer true
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "155:2-155:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "156:2-156:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "157:2-157:19"
	) )]
) )
