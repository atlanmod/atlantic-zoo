( declare SimpleClass_Classifier )
( declare SimpleClass_Class )
( declare SimpleClass_PrimitiveDataType )
( declare SimpleClass_Association )
( declare SimpleClass_Attribute )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( def SimpleClass ( struct-map
	KM3_Package
	:contents[( def SimpleClass_Classifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleClass_Classifier
			:type String
			:location "10:3-10:27"
		)]
	) ) ( def SimpleClass_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleClass_Classifier]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "is_persistent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleClass_Class
			:type Boolean
			:location "14:3-14:37"
		) ( struct-map
			KM3_Reference
			:name "parent"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SimpleClass_Class
			:type SimpleClass_Class
			:location "15:3-15:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "attrs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SimpleClass_Class
			:type SimpleClass_Attribute
			:location "16:3-16:44"
			:isContainer true
		)]
	) ) ( def SimpleClass_PrimitiveDataType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimpleClass_Classifier]
		:structuralFeatures[]
	) ) ( def SimpleClass_Association ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleClass_Association
			:type String
			:location "24:3-24:27"
		) ( struct-map
			KM3_Reference
			:name "src"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleClass_Association
			:type SimpleClass_Class
			:location "25:3-25:25"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dest"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleClass_Association
			:type SimpleClass_Class
			:location "26:3-26:26"
			:isContainer false
		)]
	) ) ( def SimpleClass_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleClass_Attribute
			:type String
			:location "30:3-30:27"
		) ( struct-map
			KM3_Attribute
			:name "is_primary"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleClass_Attribute
			:type Boolean
			:location "31:3-31:34"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimpleClass_Attribute
			:type SimpleClass_Classifier
			:location "32:3-32:31"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "37:2-37:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "38:2-38:19"
	) )]
) )
