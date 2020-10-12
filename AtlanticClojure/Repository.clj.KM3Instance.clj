( declare Repository_Subsystem )
( declare Repository_Relation )
( declare Repository_Class )
( declare Repository_Feature )
( declare Repository_Type )
( declare Repository_Entity )
( declare Repository_Routine )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def Repository ( struct-map
	KM3_Package
	:contents[( def Repository_Subsystem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "classes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Repository_Subsystem
			:type Repository_Class
			:location "12:3-12:69"
			:isContainer true
			:opposite parentSubsystem
		) ( struct-map
			KM3_Reference
			:name "relations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Repository_Subsystem
			:type Repository_Relation
			:location "13:3-13:68"
			:isContainer true
			:opposite subsystem
		)]
	) ) ( def Repository_Relation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "subsystem"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Repository_Relation
			:type Repository_Subsystem
			:location "18:3-18:56"
			:isContainer false
			:opposite relations
		) ( struct-map
			KM3_Reference
			:name "classes"
			:upper 2
			:lower 2
			:isOrdered false
			:owner Repository_Relation
			:type Repository_Class
			:location "19:3-19:55"
			:isContainer false
			:opposite relations
		)]
	) ) ( def Repository_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Repository_Class
			:type String
			:location "24:3-24:27"
		) ( struct-map
			KM3_Attribute
			:name "is_deferred"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Repository_Class
			:type Boolean
			:location "25:3-25:35"
		) ( struct-map
			KM3_Reference
			:name "features"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Repository_Class
			:type Repository_Feature
			:location "26:3-26:65"
			:isContainer true
			:opposite theClass
		) ( struct-map
			KM3_Reference
			:name "parentSubsystem"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Repository_Class
			:type Repository_Subsystem
			:location "27:3-27:60"
			:isContainer false
			:opposite classes
		) ( struct-map
			KM3_Reference
			:name "subsystem"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Repository_Class
			:type Repository_Subsystem
			:location "28:3-28:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "relations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Repository_Class
			:type Repository_Relation
			:location "29:3-29:57"
			:isContainer false
			:opposite classes
		)]
	) ) ( def Repository_Feature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "theClass"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Repository_Feature
			:type Repository_Class
			:location "34:3-34:50"
			:isContainer false
			:opposite features
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Repository_Feature
			:type Repository_Type
			:location "35:3-35:25"
			:isContainer false
		)]
	) ) ( def Repository_Type ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Repository_Type
			:type String
			:location "40:3-40:27"
		)]
	) ) ( def Repository_Entity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Repository_Feature]
		:structuralFeatures[]
	) ) ( def Repository_Routine ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Repository_Feature]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "55:2-55:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "56:2-56:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "57:2-57:19"
	) )]
) )
