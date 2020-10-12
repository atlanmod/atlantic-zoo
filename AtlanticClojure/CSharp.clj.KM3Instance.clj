( declare CSharp_Member )
( declare CSharp_TypedAttribute )
( declare CSharp_Field )
( declare CSharp_Property )
( declare CSharp_MethodBase )
( declare CSharp_Constructor )
( declare CSharp_Method )
( declare CSharp_Type )
( declare CSharp_Parameter )
( declare CSharp_Assembly )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def CSharp ( struct-map
	KM3_Package
	:contents[( def CSharp_Member ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSharp_Member
			:type String
			:location "14:3-14:27"
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CSharp_Member
			:type CSharp_Type
			:location "15:3-15:50"
			:isContainer false
			:opposite members
		)]
	) ) ( def CSharp_TypedAttribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSharp_Member]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSharp_TypedAttribute
			:type CSharp_Type
			:location "19:3-19:25"
			:isContainer false
		)]
	) ) ( def CSharp_Field ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSharp_TypedAttribute]
		:structuralFeatures[]
	) ) ( def CSharp_Property ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSharp_TypedAttribute]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isReadable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSharp_Property
			:type Boolean
			:location "25:3-25:34"
		) ( struct-map
			KM3_Attribute
			:name "isWritable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSharp_Property
			:type Boolean
			:location "26:3-26:34"
		)]
	) ) ( def CSharp_MethodBase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSharp_Member]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "visibility"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSharp_MethodBase
			:type String
			:location "30:3-30:33"
		) ( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSharp_MethodBase
			:type Boolean
			:location "31:3-31:34"
		) ( struct-map
			KM3_Attribute
			:name "isFinal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSharp_MethodBase
			:type Boolean
			:location "32:3-32:31"
		) ( struct-map
			KM3_Attribute
			:name "isStatic"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSharp_MethodBase
			:type Boolean
			:location "33:3-33:32"
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CSharp_MethodBase
			:type CSharp_Parameter
			:location "34:3-34:67"
			:isContainer true
			:opposite method
		)]
	) ) ( def CSharp_Constructor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSharp_MethodBase]
		:structuralFeatures[]
	) ) ( def CSharp_Method ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSharp_MethodBase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "returnType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSharp_Method
			:type CSharp_Type
			:location "40:3-40:31"
			:isContainer false
		)]
	) ) ( def CSharp_Type ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CSharp_Member]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "qualifiedName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSharp_Type
			:type String
			:location "44:3-44:36"
		) ( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSharp_Type
			:type Boolean
			:location "45:3-45:34"
		) ( struct-map
			KM3_Attribute
			:name "visibility"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSharp_Type
			:type String
			:location "46:3-46:33"
		) ( struct-map
			KM3_Attribute
			:name "isSealed"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSharp_Type
			:type Boolean
			:location "47:3-47:32"
		) ( struct-map
			KM3_Attribute
			:name "nameSpace"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSharp_Type
			:type String
			:location "48:3-48:32"
		) ( struct-map
			KM3_Reference
			:name "members"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CSharp_Type
			:type CSharp_Member
			:location "49:3-49:60"
			:isContainer true
			:opposite owner
		) ( struct-map
			KM3_Reference
			:name "t_container"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CSharp_Type
			:type CSharp_Assembly
			:location "50:3-50:60"
			:isContainer false
			:opposite content
		) ( struct-map
			KM3_Reference
			:name "super"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CSharp_Type
			:type CSharp_Type
			:location "51:3-51:31"
			:isContainer false
		)]
	) ) ( def CSharp_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isIn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSharp_Parameter
			:type Boolean
			:location "55:3-55:28"
		) ( struct-map
			KM3_Attribute
			:name "isOut"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSharp_Parameter
			:type Boolean
			:location "56:3-56:29"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSharp_Parameter
			:type Boolean
			:location "57:3-57:28"
		) ( struct-map
			KM3_Attribute
			:name "position"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSharp_Parameter
			:type Integer
			:location "58:3-58:32"
		) ( struct-map
			KM3_Reference
			:name "method"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSharp_Parameter
			:type CSharp_MethodBase
			:location "59:3-59:55"
			:isContainer false
			:opposite parameters
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSharp_Parameter
			:type CSharp_Type
			:location "60:3-60:25"
			:isContainer false
		)]
	) ) ( def CSharp_Assembly ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CSharp_Assembly
			:type String
			:location "64:3-64:27"
		) ( struct-map
			KM3_Reference
			:name "content"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CSharp_Assembly
			:type CSharp_Type
			:location "65:3-65:65"
			:isContainer true
			:opposite t_container
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "75:2-75:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "76:2-76:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "77:2-77:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "78:2-78:18"
	) )]
) )
