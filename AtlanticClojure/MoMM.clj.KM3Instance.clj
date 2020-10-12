( declare MoMM_ModelElement )
( declare MoMM_Attribute )
( declare MoMM_Relationship )
( declare MoMM_Generalization )
( declare MoMM_Association )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def MoMM ( struct-map
	KM3_Package
	:contents[( def MoMM_ModelElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "level"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoMM_ModelElement
			:type Integer
			:location "16:3-16:29"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoMM_ModelElement
			:type String
			:location "17:3-17:27"
		) ( struct-map
			KM3_Attribute
			:name "potency"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoMM_ModelElement
			:type String
			:location "18:3-18:30"
		) ( struct-map
			KM3_Reference
			:name "hasClass"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoMM_ModelElement
			:type MoMM_ModelElement
			:location "19:3-19:61"
			:isContainer false
			:opposite classElement
		) ( struct-map
			KM3_Reference
			:name "classElement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MoMM_ModelElement
			:type MoMM_ModelElement
			:location "20:3-20:65"
			:isContainer false
			:opposite hasClass
		) ( struct-map
			KM3_Reference
			:name "elementTarget"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoMM_ModelElement
			:type MoMM_Relationship
			:location "21:3-21:60"
			:isContainer false
			:opposite target
		) ( struct-map
			KM3_Reference
			:name "elementSource"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoMM_ModelElement
			:type MoMM_Relationship
			:location "22:3-22:60"
			:isContainer false
			:opposite source
		) ( struct-map
			KM3_Reference
			:name "attributes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MoMM_ModelElement
			:type MoMM_Attribute
			:location "23:3-23:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "attType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoMM_ModelElement
			:type MoMM_Attribute
			:location "24:3-24:49"
			:isContainer false
			:opposite type
		)]
	) ) ( def MoMM_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoMM_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoMM_Attribute
			:type MoMM_ModelElement
			:location "28:3-28:52"
			:isContainer false
			:opposite attType
		)]
	) ) ( def MoMM_Relationship ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[MoMM_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoMM_Relationship
			:type MoMM_ModelElement
			:location "32:3-32:60"
			:isContainer false
			:opposite elementTarget
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoMM_Relationship
			:type MoMM_ModelElement
			:location "33:3-33:60"
			:isContainer false
			:opposite elementSource
		)]
	) ) ( def MoMM_Generalization ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoMM_Relationship]
		:structuralFeatures[]
	) ) ( def MoMM_Association ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MoMM_Relationship]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "maxSource"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoMM_Association
			:type String
			:location "39:4-39:33"
		) ( struct-map
			KM3_Attribute
			:name "maxTarget"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoMM_Association
			:type String
			:location "40:4-40:33"
		) ( struct-map
			KM3_Attribute
			:name "minSource"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoMM_Association
			:type String
			:location "41:4-41:33"
		) ( struct-map
			KM3_Attribute
			:name "minTarget"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MoMM_Association
			:type String
			:location "42:4-42:33"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "47:2-47:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "48:2-48:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "49:2-49:18"
	) )]
) )
