( declare ComponentUML_Entity )
( declare ComponentUML_AssociationEnd )
( declare ComponentUML_Association )
( declare ComponentUML_Method )
( declare ComponentUML_Attribute )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def ComponentUML ( struct-map
	KM3_Package
	:contents[( def ComponentUML_Entity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "methods"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ComponentUML_Entity
			:type ComponentUML_Method
			:location "12:3-12:51"
			:isContainer false
			:opposite entity
		) ( struct-map
			KM3_Reference
			:name "attributes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ComponentUML_Entity
			:type ComponentUML_Attribute
			:location "13:3-13:57"
			:isContainer false
			:opposite entity
		) ( struct-map
			KM3_Reference
			:name "associationEnds"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ComponentUML_Entity
			:type ComponentUML_AssociationEnd
			:location "14:3-14:65"
			:isContainer false
			:opposite type
		)]
	) ) ( def ComponentUML_AssociationEnd ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ComponentUML_AssociationEnd
			:type ComponentUML_Entity
			:location "19:3-19:54"
			:isContainer false
			:opposite associationEnds
		) ( struct-map
			KM3_Reference
			:name "association"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ComponentUML_AssociationEnd
			:type ComponentUML_Association
			:location "20:3-20:66"
			:isContainer false
			:opposite associationEnds
		)]
	) ) ( def ComponentUML_Association ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "associationEnds"
			:upper 2
			:lower 2
			:isOrdered false
			:owner ComponentUML_Association
			:type ComponentUML_AssociationEnd
			:location "25:3-25:74"
			:isContainer false
			:opposite association
		)]
	) ) ( def ComponentUML_Method ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "entity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ComponentUML_Method
			:type ComponentUML_Entity
			:location "30:3-30:49"
			:isContainer false
			:opposite methods
		)]
	) ) ( def ComponentUML_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "entity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ComponentUML_Attribute
			:type ComponentUML_Entity
			:location "35:3-35:51"
			:isContainer false
			:opposite attributes
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "40:2-40:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "41:2-41:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "42:2-42:19"
	) )]
) )
