( declare KDMSimplified_Element )
( declare KDMSimplified_ModelElement )
( declare KDMSimplified_KDMEntity )
( declare KDMSimplified_KDMContainer )
( declare KDMSimplified_KDMGroup )
( declare KDMSimplified_KDMRelationship )
( declare KDMSimplified_Annotation )
( declare KDMSimplified_Attribute )
( declare KDMSimplified_KDMExtensionFamily )
( declare KDMSimplified_Stereotype )
( declare KDMSimplified_TagDefinition )
( declare KDMSimplified_TaggedValue )
( declare KDMSimplified_KDMFramework )
( declare KDMSimplified_KDMModel )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def KDMSimplified ( struct-map
	KM3_Package
	:contents[( def KDMSimplified_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "annotation"
			:upper -1
			:lower 0
			:isOrdered false
			:owner KDMSimplified_Element
			:type KDMSimplified_Annotation
			:location "15:3-15:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "attribute"
			:upper -1
			:lower 0
			:isOrdered false
			:owner KDMSimplified_Element
			:type KDMSimplified_Attribute
			:location "16:3-16:50"
			:isContainer true
		)]
	) ) ( def KDMSimplified_ModelElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[KDMSimplified_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "taggedValue"
			:upper -1
			:lower 0
			:isOrdered false
			:owner KDMSimplified_ModelElement
			:type KDMSimplified_TaggedValue
			:location "21:3-21:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "stereotype"
			:upper 1
			:lower 0
			:isOrdered false
			:owner KDMSimplified_ModelElement
			:type KDMSimplified_Stereotype
			:location "22:3-22:69"
			:isContainer false
			:opposite extendedElement
		)]
	) ) ( def KDMSimplified_KDMEntity ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[KDMSimplified_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KDMSimplified_KDMEntity
			:type String
			:location "27:3-27:26"
		) ( struct-map
			KM3_Reference
			:name "inbound"
			:upper -1
			:lower 0
			:isOrdered false
			:owner KDMSimplified_KDMEntity
			:type KDMSimplified_KDMRelationship
			:location "28:3-28:56"
			:isContainer false
			:opposite to
		) ( struct-map
			KM3_Reference
			:name "outbound"
			:upper -1
			:lower 0
			:isOrdered false
			:owner KDMSimplified_KDMEntity
			:type KDMSimplified_KDMRelationship
			:location "29:3-29:59"
			:isContainer false
			:opposite from
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner KDMSimplified_KDMEntity
			:type KDMSimplified_KDMContainer
			:location "30:3-30:63"
			:isContainer false
			:opposite ownedElement
		) ( struct-map
			KM3_Reference
			:name "group"
			:upper -1
			:lower 0
			:isOrdered false
			:owner KDMSimplified_KDMEntity
			:type KDMSimplified_KDMGroup
			:location "31:3-31:59"
			:isContainer false
			:opposite groupedElement
		) ( struct-map
			KM3_Reference
			:name "model"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KDMSimplified_KDMEntity
			:type KDMSimplified_KDMModel
			:location "32:3-32:54"
			:isContainer false
			:opposite ownedElement
		)]
	) ) ( def KDMSimplified_KDMContainer ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[KDMSimplified_KDMEntity]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedElement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner KDMSimplified_KDMContainer
			:type KDMSimplified_KDMEntity
			:location "37:3-37:68"
			:isContainer true
			:opposite owner
		)]
	) ) ( def KDMSimplified_KDMGroup ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[KDMSimplified_KDMEntity]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "groupedElement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner KDMSimplified_KDMGroup
			:type KDMSimplified_KDMEntity
			:location "42:3-42:60"
			:isContainer false
			:opposite group
		)]
	) ) ( def KDMSimplified_KDMRelationship ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[KDMSimplified_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "to"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KDMSimplified_KDMRelationship
			:type KDMSimplified_KDMEntity
			:location "47:3-47:47"
			:isContainer false
			:opposite inbound
		) ( struct-map
			KM3_Reference
			:name "from"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KDMSimplified_KDMRelationship
			:type KDMSimplified_KDMEntity
			:location "48:3-48:50"
			:isContainer false
			:opposite outbound
		) ( struct-map
			KM3_Reference
			:name "model"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KDMSimplified_KDMRelationship
			:type KDMSimplified_KDMModel
			:location "49:3-49:55"
			:isContainer false
			:opposite ownedRelation
		)]
	) ) ( def KDMSimplified_Annotation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KDMSimplified_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "note"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KDMSimplified_Annotation
			:type String
			:location "56:3-56:26"
		)]
	) ) ( def KDMSimplified_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KDMSimplified_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "tag"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KDMSimplified_Attribute
			:type String
			:location "61:3-61:25"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KDMSimplified_Attribute
			:type String
			:location "62:3-62:27"
		)]
	) ) ( def KDMSimplified_KDMExtensionFamily ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KDMSimplified_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KDMSimplified_KDMExtensionFamily
			:type String
			:location "71:3-71:26"
		) ( struct-map
			KM3_Reference
			:name "stereotype"
			:upper -1
			:lower 0
			:isOrdered false
			:owner KDMSimplified_KDMExtensionFamily
			:type KDMSimplified_Stereotype
			:location "72:3-72:68"
			:isContainer true
			:opposite family
		)]
	) ) ( def KDMSimplified_Stereotype ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KDMSimplified_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "baseClass"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KDMSimplified_Stereotype
			:type String
			:location "77:3-77:31"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KDMSimplified_Stereotype
			:type String
			:location "78:3-78:26"
		) ( struct-map
			KM3_Reference
			:name "family"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KDMSimplified_Stereotype
			:type KDMSimplified_KDMExtensionFamily
			:location "79:3-79:63"
			:isContainer false
			:opposite stereotype
		) ( struct-map
			KM3_Reference
			:name "extendedElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KDMSimplified_Stereotype
			:type KDMSimplified_ModelElement
			:location "80:3-80:66"
			:isContainer false
			:opposite stereotype
		) ( struct-map
			KM3_Reference
			:name "tag"
			:upper -1
			:lower 0
			:isOrdered false
			:owner KDMSimplified_Stereotype
			:type KDMSimplified_TagDefinition
			:location "81:3-81:46"
			:isContainer true
		)]
	) ) ( def KDMSimplified_TagDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KDMSimplified_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "tag"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KDMSimplified_TagDefinition
			:type String
			:location "86:3-86:25"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KDMSimplified_TagDefinition
			:type String
			:location "87:3-87:26"
		)]
	) ) ( def KDMSimplified_TaggedValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KDMSimplified_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KDMSimplified_TaggedValue
			:type String
			:location "92:3-92:27"
		) ( struct-map
			KM3_Reference
			:name "tag"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KDMSimplified_TaggedValue
			:type KDMSimplified_TagDefinition
			:location "93:3-93:33"
			:isContainer false
		)]
	) ) ( def KDMSimplified_KDMFramework ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[KDMSimplified_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KDMSimplified_KDMFramework
			:type String
			:location "105:3-105:26"
		) ( struct-map
			KM3_Reference
			:name "extension"
			:upper -1
			:lower 0
			:isOrdered false
			:owner KDMSimplified_KDMFramework
			:type KDMSimplified_KDMExtensionFamily
			:location "106:3-106:57"
			:isContainer true
		)]
	) ) ( def KDMSimplified_KDMModel ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[KDMSimplified_KDMFramework]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedElement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner KDMSimplified_KDMModel
			:type KDMSimplified_KDMEntity
			:location "111:3-111:68"
			:isContainer true
			:opposite model
		) ( struct-map
			KM3_Reference
			:name "ownedRelation"
			:upper -1
			:lower 0
			:isOrdered false
			:owner KDMSimplified_KDMModel
			:type KDMSimplified_KDMRelationship
			:location "112:3-112:75"
			:isContainer true
			:opposite model
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "120:2-120:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "121:2-121:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "122:2-122:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "123:2-123:18"
	) )]
) )
