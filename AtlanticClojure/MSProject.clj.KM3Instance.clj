( declare MSProject_MSProject )
( declare MSProject_NamedElement )
( declare MSProject_Task )
( declare PrimitiveTypes_String )
( def MSProject ( struct-map
	KM3_Package
	:contents[( def MSProject_MSProject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tasks"
			:upper -1
			:lower 1
			:isOrdered false
			:owner MSProject_MSProject
			:type MSProject_Task
			:location "11:3-11:41"
			:isContainer true
		)]
	) ) ( def MSProject_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MSProject_NamedElement
			:type String
			:location "15:3-15:27"
		)]
	) ) ( def MSProject_Task ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MSProject_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "UID"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MSProject_Task
			:type String
			:location "19:3-19:26"
		) ( struct-map
			KM3_Reference
			:name "predecessors"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MSProject_Task
			:type MSProject_Task
			:location "20:3-20:36"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "25:2-25:18"
	) )]
) )
