( declare DSLModel_Model )
( declare DSLModel_Element )
( declare DSLModel_ModelElement )
( declare DSLModel_ModelElementLink )
( declare DSLModel_EmbeddingLink )
( declare DSLModel_ReferenceLink )
( declare DSLModel_NamedElement )
( declare DSLModel_Property )
( declare DSLModel_Role )
( declare DSLModel_Value )
( declare DSLModel_IntegerValue )
( declare DSLModel_DoubleValue )
( declare DSLModel_BooleanValue )
( declare DSLModel_StringValue )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Double )
( def DSLModel ( struct-map
	KM3_Package
	:contents[( def DSLModel_Model ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "domainModel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSLModel_Model
			:type String
			:location "12:3-12:34"
		) ( struct-map
			KM3_Reference
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DSLModel_Model
			:type DSLModel_ModelElement
			:location "13:3-13:58"
			:isContainer true
		)]
	) ) ( def DSLModel_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSLModel_Element
			:type String
			:location "17:3-17:27"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSLModel_Element
			:type String
			:location "18:3-18:25"
		)]
	) ) ( def DSLModel_ModelElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DSLModel_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "parentLink"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSLModel_ModelElement
			:type DSLModel_EmbeddingLink
			:location "22:3-22:60"
			:isContainer false
			:opposite elements
		) ( struct-map
			KM3_Reference
			:name "properties"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DSLModel_ModelElement
			:type DSLModel_Property
			:location "24:3-24:65"
			:isContainer true
			:opposite owner
		) ( struct-map
			KM3_Reference
			:name "embeddinglinks"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DSLModel_ModelElement
			:type DSLModel_EmbeddingLink
			:location "26:3-26:74"
			:isContainer true
			:opposite owner
		) ( struct-map
			KM3_Reference
			:name "referencelinks"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DSLModel_ModelElement
			:type DSLModel_ReferenceLink
			:location "28:3-28:74"
			:isContainer true
			:opposite owner
		)]
	) ) ( def DSLModel_ModelElementLink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DSLModel_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "links"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DSLModel_ModelElementLink
			:type DSLModel_ReferenceLink
			:location "32:3-32:62"
			:isContainer false
			:opposite modelElement
		)]
	) ) ( def DSLModel_EmbeddingLink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DSLModel_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DSLModel_EmbeddingLink
			:type DSLModel_ModelElement
			:location "40:3-40:65"
			:isContainer false
			:opposite embeddinglinks
		) ( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DSLModel_EmbeddingLink
			:type DSLModel_ModelElement
			:location "41:3-41:72"
			:isContainer true
			:opposite parentLink
		)]
	) ) ( def DSLModel_ReferenceLink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DSLModel_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DSLModel_ReferenceLink
			:type DSLModel_ModelElement
			:location "46:3-46:65"
			:isContainer false
			:opposite referencelinks
		) ( struct-map
			KM3_Reference
			:name "modelElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSLModel_ReferenceLink
			:type DSLModel_ModelElementLink
			:location "47:3-47:62"
			:isContainer false
			:opposite links
		) ( struct-map
			KM3_Reference
			:name "roles"
			:upper 2
			:lower 2
			:isOrdered false
			:owner DSLModel_ReferenceLink
			:type DSLModel_Role
			:location "48:3-48:58"
			:isContainer true
			:opposite owner
		)]
	) ) ( def DSLModel_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSLModel_NamedElement
			:type String
			:location "53:3-53:27"
		)]
	) ) ( def DSLModel_Property ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DSLModel_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSLModel_Property
			:type DSLModel_ModelElement
			:location "57:3-57:56"
			:isContainer false
			:opposite properties
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSLModel_Property
			:type DSLModel_Value
			:location "58:3-58:37"
			:isContainer true
		)]
	) ) ( def DSLModel_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DSLModel_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "element"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSLModel_Role
			:type DSLModel_ModelElement
			:location "62:3-62:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSLModel_Role
			:type DSLModel_ReferenceLink
			:location "63:3-63:52"
			:isContainer false
			:opposite roles
		)]
	) ) ( def DSLModel_Value ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def DSLModel_IntegerValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DSLModel_Value]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSLModel_IntegerValue
			:type Integer
			:location "70:3-70:29"
		)]
	) ) ( def DSLModel_DoubleValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DSLModel_Value]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSLModel_DoubleValue
			:type Double
			:location "74:3-74:28"
		)]
	) ) ( def DSLModel_BooleanValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DSLModel_Value]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSLModel_BooleanValue
			:type Boolean
			:location "78:3-78:29"
		)]
	) ) ( def DSLModel_StringValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DSLModel_Value]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DSLModel_StringValue
			:type String
			:location "82:3-82:28"
		)]
	) ) ( def PrimitiveTypes ( struct-map
		KM3_Package
		:contents[( def ptyp_Boolean ( struct-map
			KM3_DataType
			:name "Boolean"
			:location "87:3-87:20"
		) ) ( def ptyp_Integer ( struct-map
			KM3_DataType
			:name "Integer"
			:location "88:3-88:20"
		) ) ( def ptyp_String ( struct-map
			KM3_DataType
			:name "String"
			:location "89:3-89:19"
		) ) ( def ptyp_Double ( struct-map
			KM3_DataType
			:name "Double"
			:location "90:3-90:19"
		) )]
	) )]
) )
