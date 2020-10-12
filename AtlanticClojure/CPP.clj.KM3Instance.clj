( declare CPP_CDerived )
( declare CPP_CStructured )
( declare CPP_CBehavorialFeature )
( declare CPP_CFunction )
( declare CPP_CStructureContents )
( declare CPP_CField )
( declare CPP_CDerivableType )
( declare CPP_VisibilityKind )
( declare CPP_CPPReference )
( declare CPP_CPPExtern )
( declare CPP_CPPConst )
( declare CPP_CPPTemplate )
( declare CPP_CPPClass )
( declare CPP_CPPGeneralization )
( declare CPP_CPPOperation )
( declare CPP_CPPOperator )
( declare CPP_CPPMember )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def CPP ( struct-map
	KM3_Package
	:contents[( def VisibilityKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "vk_public"
		:location "35:3-35:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_private"
		:location "36:3-36:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_protected"
		:location "37:3-37:24"
	)] ) ) ( def CPP_CDerived ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def CPP_CStructured ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def CPP_CBehavorialFeature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def CPP_CFunction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPP_CBehavorialFeature]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isVsrArg"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CFunction
			:type Boolean
			:location "20:3-20:32"
		)]
	) ) ( def CPP_CStructureContents ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def CPP_CField ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def CPP_CDerivableType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def CPP_CPPReference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPP_CDerived]
		:structuralFeatures[]
	) ) ( def CPP_CPPExtern ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPP_CDerived]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "linkage"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CPPExtern
			:type String
			:location "43:3-43:30"
		)]
	) ) ( def CPP_CPPConst ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPP_CDerived]
		:structuralFeatures[]
	) ) ( def CPP_CPPTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPP_CDerived]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "classes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CPP_CPPTemplate
			:type CPP_CPPClass
			:location "49:3-49:56"
			:isContainer false
			:opposite templates
		)]
	) ) ( def CPP_CPPClass ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPP_CStructured]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CPPClass
			:type Boolean
			:location "53:3-53:34"
		) ( struct-map
			KM3_Attribute
			:name "isVolatile"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CPPClass
			:type Boolean
			:location "54:3-54:34"
		) ( struct-map
			KM3_Attribute
			:name "visibility"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CPPClass
			:type VisibilityKind
			:location "55:3-55:41"
		) ( struct-map
			KM3_Reference
			:name "templates"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CPP_CPPClass
			:type CPP_CPPTemplate
			:location "56:3-56:59"
			:isContainer false
			:opposite classes
		) ( struct-map
			KM3_Reference
			:name "generalizations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CPP_CPPClass
			:type CPP_CPPGeneralization
			:location "57:3-57:52"
			:isContainer false
		)]
	) ) ( def CPP_CPPGeneralization ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "visibility"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CPPGeneralization
			:type VisibilityKind
			:location "61:3-61:41"
		) ( struct-map
			KM3_Attribute
			:name "isVirtual"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CPPGeneralization
			:type Boolean
			:location "62:3-62:33"
		) ( struct-map
			KM3_Reference
			:name "supertype"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CPPGeneralization
			:type CPP_CPPClass
			:location "63:3-63:34"
			:isContainer false
		)]
	) ) ( def CPP_CPPOperation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPP_CFunction CPP_CStructureContents]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isStatic"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CPPOperation
			:type Boolean
			:location "67:3-67:32"
		) ( struct-map
			KM3_Attribute
			:name "isExtern"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CPPOperation
			:type Boolean
			:location "68:3-68:32"
		) ( struct-map
			KM3_Attribute
			:name "isInline"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CPPOperation
			:type Boolean
			:location "69:3-69:32"
		) ( struct-map
			KM3_Attribute
			:name "isVirtual"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CPPOperation
			:type Boolean
			:location "70:3-70:33"
		) ( struct-map
			KM3_Attribute
			:name "isPure"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CPPOperation
			:type Boolean
			:location "71:3-71:30"
		) ( struct-map
			KM3_Attribute
			:name "visibility"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CPPOperation
			:type VisibilityKind
			:location "72:3-72:41"
		) ( struct-map
			KM3_Attribute
			:name "isCtor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CPPOperation
			:type Boolean
			:location "73:3-73:30"
		) ( struct-map
			KM3_Attribute
			:name "isDtor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CPPOperation
			:type Boolean
			:location "74:3-74:30"
		) ( struct-map
			KM3_Reference
			:name "throws"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CPP_CPPOperation
			:type CPP_CPPClass
			:location "75:3-75:34"
			:isContainer false
		)]
	) ) ( def CPP_CPPOperator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CPP_CStructureContents]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isInline"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CPPOperator
			:type Boolean
			:location "79:3-79:32"
		) ( struct-map
			KM3_Attribute
			:name "visibility"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CPPOperator
			:type VisibilityKind
			:location "80:3-80:41"
		)]
	) ) ( def CPP_CPPMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isStatic"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CPPMember
			:type Boolean
			:location "84:3-84:32"
		) ( struct-map
			KM3_Attribute
			:name "isVolatile"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CPPMember
			:type Boolean
			:location "85:3-85:34"
		) ( struct-map
			KM3_Attribute
			:name "isRegister"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CPPMember
			:type Boolean
			:location "86:3-86:34"
		) ( struct-map
			KM3_Attribute
			:name "visibility"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CPP_CPPMember
			:type VisibilityKind
			:location "87:3-87:41"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "97:2-97:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "98:2-98:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "99:2-99:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "100:2-100:18"
	) )]
) )
