( declare M_IdentifiedElement )
( declare M_MElement )
( declare M_MElementReference )
( declare M_Module )
( declare M_ModuleMember )
( declare M_ImportDirective )
( declare M_ExportDirective )
( declare M_Value )
( declare M_NumericalValue )
( declare M_StringValue )
( declare M_IntegerValue )
( declare M_DecimalValue )
( declare M_BooleanValue )
( declare Types_DerivedType )
( declare Types_TypeReference )
( declare Types_IntrinsicTypeReference )
( declare Types_DerivedTypeReference )
( declare Types_Field )
( declare Types_Collection )
( declare Types_ComputedValue )
( declare Expressions_Expression )
( declare Expressions_InitializationExpression )
( declare Expressions_WhereExpression )
( declare Expressions_IdentityExpression )
( declare Expressions_QueryExpression )
( declare Expressions_EqualExpression )
( declare Expressions_InExpression )
( declare Expressions_CollectionExpression )
( declare Expressions_ValueExpression )
( declare Expressions_DefaultValueExpression )
( declare Expressions_StandardValueExpression )
( declare Languages_Language )
( declare ObjectModel_Entity )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Double )
( declare PrimitiveTypes_String )
( def M ( struct-map
	KM3_Package
	:contents[( def M_IdentifiedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "qualifiers"
			:upper -1
			:lower 0
			:isOrdered true
			:owner M_IdentifiedElement
			:type String
			:location "11:3-11:44"
		) ( struct-map
			KM3_Attribute
			:name "identifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner M_IdentifiedElement
			:type String
			:location "12:3-12:33"
		)]
	) ) ( def M_MElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[M_IdentifiedElement]
		:structuralFeatures[]
	) ) ( def M_MElementReference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "alias"
			:upper 1
			:lower 0
			:isOrdered false
			:owner M_MElementReference
			:type String
			:location "20:3-20:33"
		) ( struct-map
			KM3_Reference
			:name "referencedElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner M_MElementReference
			:type M_MElement
			:location "21:3-21:42"
			:isContainer false
		)]
	) ) ( def M_Module ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[M_MElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "imports"
			:upper -1
			:lower 0
			:isOrdered true
			:owner M_Module
			:type M_ImportDirective
			:location "25:3-25:78"
			:isContainer true
			:opposite module
		) ( struct-map
			KM3_Reference
			:name "exports"
			:upper -1
			:lower 0
			:isOrdered true
			:owner M_Module
			:type M_ExportDirective
			:location "26:3-26:78"
			:isContainer true
			:opposite module
		) ( struct-map
			KM3_Reference
			:name "moduleMembers"
			:upper -1
			:lower 0
			:isOrdered true
			:owner M_Module
			:type M_ModuleMember
			:location "27:3-27:81"
			:isContainer true
			:opposite module
		)]
	) ) ( def M_ModuleMember ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[M_MElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "module"
			:upper 1
			:lower 1
			:isOrdered false
			:owner M_ModuleMember
			:type M_Module
			:location "31:3-31:54"
			:isContainer false
			:opposite moduleMembers
		)]
	) ) ( def M_ImportDirective ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "module"
			:upper 1
			:lower 1
			:isOrdered false
			:owner M_ImportDirective
			:type M_Module
			:location "35:3-35:48"
			:isContainer false
			:opposite imports
		) ( struct-map
			KM3_Reference
			:name "importedElements"
			:upper -1
			:lower 1
			:isOrdered true
			:owner M_ImportDirective
			:type M_MElementReference
			:location "36:3-36:73"
			:isContainer true
		)]
	) ) ( def M_ExportDirective ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "module"
			:upper 1
			:lower 1
			:isOrdered false
			:owner M_ExportDirective
			:type M_Module
			:location "40:3-40:48"
			:isContainer false
			:opposite exports
		) ( struct-map
			KM3_Reference
			:name "exportedElements"
			:upper -1
			:lower 1
			:isOrdered true
			:owner M_ExportDirective
			:type M_ModuleMember
			:location "41:3-41:58"
			:isContainer false
		)]
	) ) ( def M_Value ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def M_NumericalValue ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[M_Value]
		:structuralFeatures[]
	) ) ( def M_StringValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[M_Value]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner M_StringValue
			:type String
			:location "53:3-53:28"
		)]
	) ) ( def M_IntegerValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[M_NumericalValue]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner M_IntegerValue
			:type Integer
			:location "57:3-57:29"
		)]
	) ) ( def M_DecimalValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[M_NumericalValue]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner M_DecimalValue
			:type Double
			:location "61:3-61:28"
		)]
	) ) ( def M_BooleanValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[M_Value]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner M_BooleanValue
			:type Boolean
			:location "65:3-65:29"
		)]
	) ) ( def Types ( struct-map
		KM3_Package
		:contents[( def Types_DerivedType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[M_ModuleMember]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "supertypes"
				:upper -1
				:lower 0
				:isOrdered true
				:owner Types_DerivedType
				:type Types_TypeReference
				:location "71:4-71:81"
				:isContainer true
				:opposite subtype
			) ( struct-map
				KM3_Reference
				:name "fields"
				:upper -1
				:lower 0
				:isOrdered true
				:owner Types_DerivedType
				:type Types_Field
				:location "72:4-72:67"
				:isContainer true
				:opposite owner
			) ( struct-map
				KM3_Reference
				:name "initializationExpression"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Types_DerivedType
				:type Expressions_InitializationExpression
				:location "73:4-73:97"
				:isContainer true
				:opposite type
			) ( struct-map
				KM3_Reference
				:name "whereExpression"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Types_DerivedType
				:type Expressions_WhereExpression
				:location "74:4-74:79"
				:isContainer true
				:opposite type
			) ( struct-map
				KM3_Reference
				:name "expression"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Types_DerivedType
				:type Expressions_Expression
				:location "75:4-75:53"
				:isContainer true
			)]
		) ) ( def Types_TypeReference ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "lowerBound"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Types_TypeReference
				:type Integer
				:location "81:4-81:40"
			) ( struct-map
				KM3_Attribute
				:name "upperBound"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Types_TypeReference
				:type Integer
				:location "82:4-82:40"
			) ( struct-map
				KM3_Reference
				:name "subtype"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Types_TypeReference
				:type Types_DerivedType
				:location "79:4-79:63"
				:isContainer false
				:opposite supertypes
			) ( struct-map
				KM3_Reference
				:name "field"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Types_TypeReference
				:type Types_Field
				:location "80:4-80:49"
				:isContainer false
				:opposite type
			)]
		) ) ( def Types_IntrinsicTypeReference ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Types_TypeReference]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "typeIdentifier"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Types_IntrinsicTypeReference
				:type String
				:location "86:4-86:38"
			)]
		) ) ( def Types_DerivedTypeReference ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Types_TypeReference]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "type"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Types_DerivedTypeReference
				:type Types_DerivedType
				:location "90:4-90:33"
				:isContainer false
			)]
		) ) ( def Types_Field ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[M_IdentifiedElement]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "owner"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Types_Field
				:type Types_DerivedType
				:location "94:4-94:52"
				:isContainer false
				:opposite fields
			) ( struct-map
				KM3_Reference
				:name "type"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Types_Field
				:type Types_TypeReference
				:location "95:4-95:62"
				:isContainer true
				:opposite field
			)]
		) ) ( def Types_Collection ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[M_IdentifiedElement]
			:structuralFeatures[]
		) ) ( def Types_ComputedValue ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[M_IdentifiedElement]
			:structuralFeatures[]
		) )]
	) ) ( def Expressions ( struct-map
		KM3_Package
		:contents[( def Expressions_Expression ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[]
		) ) ( def Expressions_InitializationExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Expressions_Expression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "type"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Expressions_InitializationExpression
				:type Types_DerivedType
				:location "114:4-114:69"
				:isContainer false
				:opposite initializationExpression
			) ( struct-map
				KM3_Reference
				:name "values"
				:upper -1
				:lower 0
				:isOrdered true
				:owner Expressions_InitializationExpression
				:type M_Value
				:location "115:4-115:50"
				:isContainer true
			)]
		) ) ( def Expressions_WhereExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Expressions_Expression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "type"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Expressions_WhereExpression
				:type Types_DerivedType
				:location "119:4-119:60"
				:isContainer false
				:opposite whereExpression
			) ( struct-map
				KM3_Reference
				:name "queryExpressions"
				:upper -1
				:lower 0
				:isOrdered true
				:owner Expressions_WhereExpression
				:type Expressions_QueryExpression
				:location "120:4-120:97"
				:isContainer true
				:opposite whereExpression
			)]
		) ) ( def Expressions_IdentityExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Expressions_WhereExpression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "identity"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Expressions_IdentityExpression
				:type Types_Field
				:location "124:4-124:31"
				:isContainer false
			)]
		) ) ( def Expressions_QueryExpression ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[Expressions_Expression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "whereExpression"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Expressions_QueryExpression
				:type Expressions_WhereExpression
				:location "128:4-128:76"
				:isContainer false
				:opposite queryExpressions
			)]
		) ) ( def Expressions_EqualExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Expressions_QueryExpression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "leftValue"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Expressions_EqualExpression
				:type Expressions_ValueExpression
				:location "132:4-132:52"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "rightValue"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Expressions_EqualExpression
				:type Expressions_ValueExpression
				:location "133:4-133:53"
				:isContainer true
			)]
		) ) ( def Expressions_InExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Expressions_QueryExpression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "value"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Expressions_InExpression
				:type Expressions_ValueExpression
				:location "137:4-137:48"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "collection"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Expressions_InExpression
				:type Expressions_CollectionExpression
				:location "138:4-138:82"
				:isContainer true
				:opposite inExpression
			)]
		) ) ( def Expressions_CollectionExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Expressions_Expression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "inExpression"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Expressions_CollectionExpression
				:type Expressions_InExpression
				:location "142:4-142:64"
				:isContainer false
				:opposite collection
			) ( struct-map
				KM3_Reference
				:name "collectionValue"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Expressions_CollectionExpression
				:type Expressions_ValueExpression
				:location "143:4-143:58"
				:isContainer true
			)]
		) ) ( def Expressions_ValueExpression ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[Expressions_Expression]
			:structuralFeatures[]
		) ) ( def Expressions_DefaultValueExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Expressions_ValueExpression]
			:structuralFeatures[]
		) ) ( def Expressions_StandardValueExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Expressions_ValueExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "value"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Expressions_StandardValueExpression
				:type String
				:location "156:4-156:29"
			) ( struct-map
				KM3_Reference
				:name "context"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Expressions_StandardValueExpression
				:type Expressions_ValueExpression
				:location "155:4-155:55"
				:isContainer true
			)]
		) )]
	) ) ( def Languages ( struct-map
		KM3_Package
		:contents[( def Languages_Language ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[M_ModuleMember]
			:structuralFeatures[]
		) )]
	) ) ( def ObjectModel ( struct-map
		KM3_Package
		:contents[( def ObjectModel_Entity ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[M_ModuleMember]
			:structuralFeatures[]
		) )]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "177:2-177:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "179:2-179:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "181:2-181:18"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "183:2-183:18"
	) )]
) )
