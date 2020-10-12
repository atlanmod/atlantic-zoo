( declare ArchitecturalDescription_Architecture )
( declare ArchitecturalDescription_ArchitectureDescription )
( declare ArchitecturalDescription_ArchitectureView )
( declare ArchitecturalDescription_ArchitectureViewPoint )
( declare ArchitecturalDescription_MainView )
( declare ArchitecturalDescription_ModelElement )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def ArchitecturalDescription ( struct-map
	KM3_Package
	:contents[( def ArchitecturalDescription_Architecture ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "describedBy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ArchitecturalDescription_Architecture
			:type ArchitecturalDescription_ArchitectureDescription
			:location "16:3-16:51"
			:isContainer false
		)]
	) ) ( def ArchitecturalDescription_ArchitectureDescription ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "selects"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ArchitecturalDescription_ArchitectureDescription
			:type ArchitecturalDescription_ArchitectureView
			:location "20:3-20:68"
			:isContainer false
			:opposite selectedBy
		) ( struct-map
			KM3_Reference
			:name "organizedBy"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ArchitecturalDescription_ArchitectureDescription
			:type ArchitecturalDescription_ArchitectureView
			:location "21:3-21:60"
			:isContainer true
		)]
	) ) ( def ArchitecturalDescription_ArchitectureView ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "selectedBy"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ArchitecturalDescription_ArchitectureView
			:type ArchitecturalDescription_ArchitectureDescription
			:location "25:3-25:75"
			:isContainer false
			:opposite selects
		) ( struct-map
			KM3_Reference
			:name "constituents"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ArchitecturalDescription_ArchitectureView
			:type ArchitecturalDescription_ModelElement
			:location "26:3-26:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "conformsTo"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ArchitecturalDescription_ArchitectureView
			:type ArchitecturalDescription_ArchitectureViewPoint
			:location "27:3-27:71"
			:isContainer false
			:opposite views
		)]
	) ) ( def ArchitecturalDescription_ArchitectureViewPoint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "defines"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ArchitecturalDescription_ArchitectureViewPoint
			:type ArchitecturalDescription_MainView
			:location "31:3-31:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "views"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ArchitecturalDescription_ArchitectureViewPoint
			:type ArchitecturalDescription_ArchitectureView
			:location "32:3-32:66"
			:isContainer false
			:opposite conformsTo
		)]
	) ) ( def ArchitecturalDescription_MainView ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isProjectedOnto"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ArchitecturalDescription_MainView
			:type ArchitecturalDescription_ArchitectureView
			:location "36:3-36:54"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "consistsOf"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ArchitecturalDescription_MainView
			:type ArchitecturalDescription_ModelElement
			:location "37:3-37:55"
			:isContainer true
		)]
	) ) ( def ArchitecturalDescription_ModelElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "44:2-44:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "45:2-45:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "46:2-46:18"
	) )]
) )
