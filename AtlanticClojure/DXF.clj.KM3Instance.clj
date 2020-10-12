( declare DXF_DXF )
( declare DXF_Mesh )
( declare DXF_Point )
( declare PrimitiveTypes_Double )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def DXF ( struct-map
	KM3_Package
	:contents[( def DXF_DXF ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "meshes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DXF_DXF
			:type DXF_Mesh
			:location "11:3-11:48"
			:isContainer true
		)]
	) ) ( def DXF_Mesh ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DXF_Mesh
			:type String
			:location "15:3-15:27"
		) ( struct-map
			KM3_Reference
			:name "points"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DXF_Mesh
			:type DXF_Point
			:location "16:3-16:65"
			:isContainer true
			:opposite mesh
		)]
	) ) ( def DXF_Point ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DXF_Point
			:type String
			:location "20:3-20:27"
		) ( struct-map
			KM3_Attribute
			:name "x"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DXF_Point
			:type Double
			:location "22:3-22:24"
		) ( struct-map
			KM3_Attribute
			:name "y"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DXF_Point
			:type Double
			:location "23:3-23:24"
		) ( struct-map
			KM3_Attribute
			:name "z"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DXF_Point
			:type Double
			:location "24:3-24:24"
		) ( struct-map
			KM3_Reference
			:name "mesh"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DXF_Point
			:type DXF_Mesh
			:location "21:3-21:43"
			:isContainer false
			:opposite points
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "30:2-30:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "31:2-31:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "32:2-32:18"
	) )]
) )
