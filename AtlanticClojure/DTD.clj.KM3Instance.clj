( declare DTD_Occurence )
( declare DTD_OtherAttributeTypeEnum )
( declare DTD_TypeDescription )
( declare DTD_Notation )
( declare DTD_Entity )
( declare DTD_Element )
( declare DTD_AnyElement )
( declare DTD_RestrictedElement )
( declare DTD_ElementContent )
( declare DTD_Mixed )
( declare DTD_Children )
( declare DTD_Sequence )
( declare DTD_Leaf )
( declare DTD_Choice )
( declare DTD_AttributeList )
( declare DTD_AttributeDescription )
( declare DTD_NoDefaultValue )
( declare DTD_DefaultValue )
( declare DTD_AttributeType )
( declare DTD_Enumeration )
( declare DTD_OtherAttributeType )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( def DTD ( struct-map
	KM3_Package
	:contents[( def Occurence ( :literals[( struct-map
		KM3_EnumLiteral
		:name "zeroOrOne"
		:location "14:3-14:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "zeroOrMore"
		:location "15:3-15:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "oneOrMore"
		:location "16:3-16:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "one"
		:location "17:3-17:15"
	)] ) ) ( def OtherAttributeTypeEnum ( :literals[( struct-map
		KM3_EnumLiteral
		:name "cdata"
		:location "21:3-21:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "id"
		:location "22:3-22:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "idref"
		:location "23:3-23:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "entityType"
		:location "24:3-24:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "entities"
		:location "25:3-25:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "nmtoken"
		:location "26:3-26:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "nmtakens"
		:location "27:3-27:20"
	)] ) ) ( def DTD_TypeDescription ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DTD_TypeDescription
			:type String
			:location "34:3-34:27"
		)]
	) ) ( def DTD_Notation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DTD_TypeDescription]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "content"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DTD_Notation
			:type String
			:location "38:3-38:30"
		)]
	) ) ( def DTD_Entity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DTD_TypeDescription]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "content"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DTD_Entity
			:type String
			:location "42:3-42:30"
		) ( struct-map
			KM3_Attribute
			:name "isInternal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DTD_Entity
			:type Boolean
			:location "43:3-43:34"
		)]
	) ) ( def DTD_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DTD_TypeDescription]
		:structuralFeatures[]
	) ) ( def DTD_AnyElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DTD_Element]
		:structuralFeatures[]
	) ) ( def DTD_RestrictedElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DTD_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "content"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DTD_RestrictedElement
			:type DTD_ElementContent
			:location "56:3-56:53"
			:isContainer true
		)]
	) ) ( def DTD_ElementContent ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def DTD_Mixed ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DTD_ElementContent]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "elements"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DTD_Mixed
			:type String
			:location "63:3-63:31"
		)]
	) ) ( def DTD_Children ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DTD_ElementContent]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "occ"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DTD_Children
			:type Occurence
			:location "67:3-67:29"
		)]
	) ) ( def DTD_Sequence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DTD_Children]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "children"
			:upper -1
			:lower 2
			:isOrdered true
			:owner DTD_Sequence
			:type DTD_Children
			:location "71:3-71:46"
			:isContainer false
		)]
	) ) ( def DTD_Leaf ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DTD_Children]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "elementName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DTD_Leaf
			:type String
			:location "75:3-75:34"
		)]
	) ) ( def DTD_Choice ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DTD_Children]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "childrenChoice"
			:upper -1
			:lower 2
			:isOrdered false
			:owner DTD_Choice
			:type DTD_Children
			:location "79:3-79:44"
			:isContainer false
		)]
	) ) ( def DTD_AttributeList ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DTD_TypeDescription]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "containsAttributes"
			:upper -1
			:lower 1
			:isOrdered false
			:owner DTD_AttributeList
			:type DTD_AttributeDescription
			:location "85:3-85:85"
			:isContainer false
			:opposite attributeList
		)]
	) ) ( def DTD_AttributeDescription ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DTD_TypeDescription]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "attributeList"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DTD_AttributeDescription
			:type DTD_AttributeList
			:location "90:3-90:73"
			:isContainer false
			:opposite containsAttributes
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DTD_AttributeDescription
			:type DTD_AttributeType
			:location "91:3-91:44"
			:isContainer true
		)]
	) ) ( def DTD_NoDefaultValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DTD_AttributeDescription]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isRequired"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DTD_NoDefaultValue
			:type Boolean
			:location "95:3-95:34"
		)]
	) ) ( def DTD_DefaultValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DTD_AttributeDescription]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DTD_DefaultValue
			:type String
			:location "99:3-99:28"
		) ( struct-map
			KM3_Attribute
			:name "isFixed"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DTD_DefaultValue
			:type Boolean
			:location "100:3-100:31"
		)]
	) ) ( def DTD_AttributeType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def DTD_Enumeration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DTD_AttributeType]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "values"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DTD_Enumeration
			:type String
			:location "108:3-108:29"
		)]
	) ) ( def DTD_OtherAttributeType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DTD_OtherAttributeType
			:type OtherAttributeTypeEnum
			:location "112:3-112:43"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "120:2-120:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "121:2-121:19"
	) )]
) )
