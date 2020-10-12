( declare JAVA_Modifier )
( declare JAVA_Class )
( declare JAVA_Interface )
( declare JAVA_Method )
( declare JAVA_Field )
( declare JAVA_Value )
( declare JAVA_Parameter )
( declare JAVA_Type )
( declare JAVA_ReferenceType )
( declare JAVA_PrimitiveType )
( declare JAVA_Int )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( def JAVA ( struct-map
	KM3_Package
	:contents[( def JAVA_Modifier ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "visibility"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_Modifier
			:type String
			:location "11:3-11:33"
		) ( struct-map
			KM3_Attribute
			:name "state"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_Modifier
			:type String
			:location "12:3-12:28"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_Modifier
			:type String
			:location "13:3-13:27"
		)]
	) ) ( def JAVA_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JAVA_Modifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "superClass"
			:upper 1
			:lower 0
			:isOrdered false
			:owner JAVA_Class
			:type JAVA_Class
			:location "17:3-17:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "implement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner JAVA_Class
			:type JAVA_Interface
			:location "18:3-18:63"
			:isContainer false
			:opposite implementedBy
		) ( struct-map
			KM3_Reference
			:name "methods"
			:upper -1
			:lower 0
			:isOrdered false
			:owner JAVA_Class
			:type JAVA_Method
			:location "19:3-19:62"
			:isContainer true
			:opposite class
		) ( struct-map
			KM3_Reference
			:name "fields"
			:upper -1
			:lower 0
			:isOrdered false
			:owner JAVA_Class
			:type JAVA_Field
			:location "20:3-20:60"
			:isContainer true
			:opposite class
		)]
	) ) ( def JAVA_Interface ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JAVA_Modifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "superInterface"
			:upper -1
			:lower 0
			:isOrdered false
			:owner JAVA_Interface
			:type JAVA_Interface
			:location "24:3-24:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "implementedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner JAVA_Interface
			:type JAVA_Class
			:location "25:3-25:59"
			:isContainer false
			:opposite implement
		) ( struct-map
			KM3_Reference
			:name "abstractMethods"
			:upper -1
			:lower 0
			:isOrdered false
			:owner JAVA_Interface
			:type JAVA_Method
			:location "26:3-26:72"
			:isContainer true
			:opposite interface
		) ( struct-map
			KM3_Reference
			:name "constants"
			:upper -1
			:lower 0
			:isOrdered false
			:owner JAVA_Interface
			:type JAVA_Field
			:location "27:3-27:65"
			:isContainer true
			:opposite interface
		)]
	) ) ( def JAVA_Method ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JAVA_Modifier]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "share"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_Method
			:type Boolean
			:location "31:3-31:29"
		) ( struct-map
			KM3_Reference
			:name "class"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_Method
			:type JAVA_Class
			:location "32:3-32:48"
			:isContainer false
			:opposite methods
		) ( struct-map
			KM3_Reference
			:name "interface"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_Method
			:type JAVA_Interface
			:location "33:3-33:62"
			:isContainer false
			:opposite abstractMethods
		) ( struct-map
			KM3_Reference
			:name "resultOf"
			:upper 1
			:lower 0
			:isOrdered false
			:owner JAVA_Method
			:type JAVA_Type
			:location "34:3-34:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner JAVA_Method
			:type JAVA_Parameter
			:location "35:3-35:66"
			:isContainer true
			:opposite owner
		)]
	) ) ( def JAVA_Field ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JAVA_Modifier]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "share"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_Field
			:type Boolean
			:location "39:3-39:29"
		) ( struct-map
			KM3_Reference
			:name "class"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_Field
			:type JAVA_Class
			:location "40:3-40:47"
			:isContainer false
			:opposite fields
		) ( struct-map
			KM3_Reference
			:name "interface"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_Field
			:type JAVA_Interface
			:location "41:3-41:56"
			:isContainer false
			:opposite constants
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_Field
			:type JAVA_Value
			:location "42:3-42:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "typeOf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_Field
			:type JAVA_Type
			:location "43:3-43:27"
			:isContainer false
		)]
	) ) ( def JAVA_Value ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def JAVA_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_Parameter
			:type String
			:location "49:3-49:27"
		) ( struct-map
			KM3_Reference
			:name "typeOf"
			:upper 1
			:lower 0
			:isOrdered false
			:owner JAVA_Parameter
			:type JAVA_Type
			:location "50:3-50:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_Parameter
			:type JAVA_Method
			:location "51:3-51:50"
			:isContainer false
			:opposite parameters
		)]
	) ) ( def JAVA_Type ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def JAVA_ReferenceType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JAVA_Type]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "reference"
			:upper 1
			:lower 1
			:isOrdered false
			:owner JAVA_ReferenceType
			:type JAVA_Class
			:location "57:3-57:33"
			:isContainer false
		)]
	) ) ( def JAVA_PrimitiveType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JAVA_Type]
		:structuralFeatures[]
	) ) ( def JAVA_Int ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[JAVA_PrimitiveType]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "67:2-67:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "68:2-68:19"
	) )]
) )
