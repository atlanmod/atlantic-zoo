( declare FeatureDiagrams_Node )
( declare FeatureDiagrams_Attribute )
( declare FeatureDiagrams_Root )
( declare FeatureDiagrams_Child )
( declare FeatureDiagrams_XORGroup )
( declare FeatureDiagrams_ORGroup )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def FeatureDiagrams ( struct-map
	KM3_Package
	:contents[( def FeatureDiagrams_Node ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FeatureDiagrams_Node
			:type String
			:location "16:3-16:34"
		) ( struct-map
			KM3_Attribute
			:name "preliminary"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FeatureDiagrams_Node
			:type Boolean
			:location "17:3-17:35"
		) ( struct-map
			KM3_Attribute
			:name "object"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FeatureDiagrams_Node
			:type String
			:location "18:3-18:29"
		) ( struct-map
			KM3_Reference
			:name "attributes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FeatureDiagrams_Node
			:type FeatureDiagrams_Attribute
			:location "19:3-19:65"
			:isContainer true
			:opposite node
		) ( struct-map
			KM3_Reference
			:name "no_dst"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FeatureDiagrams_Node
			:type FeatureDiagrams_ORGroup
			:location "20:3-20:51"
			:isContainer false
			:opposite no_src
		) ( struct-map
			KM3_Reference
			:name "nx_dst"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FeatureDiagrams_Node
			:type FeatureDiagrams_XORGroup
			:location "21:3-21:52"
			:isContainer false
			:opposite nx_src
		) ( struct-map
			KM3_Reference
			:name "cn_dst"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FeatureDiagrams_Node
			:type FeatureDiagrams_Child
			:location "22:3-22:49"
			:isContainer false
			:opposite cn_src
		)]
	) ) ( def FeatureDiagrams_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FeatureDiagrams_Attribute
			:type String
			:location "27:3-27:34"
		) ( struct-map
			KM3_Attribute
			:name "editable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FeatureDiagrams_Attribute
			:type Boolean
			:location "28:3-28:32"
		) ( struct-map
			KM3_Attribute
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FeatureDiagrams_Attribute
			:type Boolean
			:location "29:3-29:27"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FeatureDiagrams_Attribute
			:type String
			:location "30:3-30:28"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FeatureDiagrams_Attribute
			:type String
			:location "31:3-31:27"
		) ( struct-map
			KM3_Reference
			:name "node"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FeatureDiagrams_Attribute
			:type FeatureDiagrams_Node
			:location "32:3-32:47"
			:isContainer false
			:opposite attributes
		)]
	) ) ( def FeatureDiagrams_Root ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[FeatureDiagrams_Node]
		:structuralFeatures[]
	) ) ( def FeatureDiagrams_Child ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[FeatureDiagrams_Node]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cn_src"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FeatureDiagrams_Child
			:type FeatureDiagrams_Node
			:location "40:3-40:48"
			:isContainer false
			:opposite cn_dst
		) ( struct-map
			KM3_Reference
			:name "cx_src"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FeatureDiagrams_Child
			:type FeatureDiagrams_XORGroup
			:location "41:3-41:52"
			:isContainer false
			:opposite cx_dst
		) ( struct-map
			KM3_Reference
			:name "co_src"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FeatureDiagrams_Child
			:type FeatureDiagrams_ORGroup
			:location "42:3-42:51"
			:isContainer false
			:opposite co_dst
		)]
	) ) ( def FeatureDiagrams_XORGroup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "preliminary"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FeatureDiagrams_XORGroup
			:type Boolean
			:location "47:3-47:35"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FeatureDiagrams_XORGroup
			:type String
			:location "48:3-48:27"
		) ( struct-map
			KM3_Reference
			:name "nx_src"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FeatureDiagrams_XORGroup
			:type FeatureDiagrams_Node
			:location "49:3-49:48"
			:isContainer false
			:opposite nx_dst
		) ( struct-map
			KM3_Reference
			:name "cx_dst"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FeatureDiagrams_XORGroup
			:type FeatureDiagrams_Child
			:location "50:3-50:49"
			:isContainer false
			:opposite cx_src
		)]
	) ) ( def FeatureDiagrams_ORGroup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "preliminary"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FeatureDiagrams_ORGroup
			:type Boolean
			:location "55:3-55:35"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner FeatureDiagrams_ORGroup
			:type String
			:location "56:3-56:27"
		) ( struct-map
			KM3_Reference
			:name "no_src"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FeatureDiagrams_ORGroup
			:type FeatureDiagrams_Node
			:location "57:3-57:48"
			:isContainer false
			:opposite no_dst
		) ( struct-map
			KM3_Reference
			:name "co_dst"
			:upper -1
			:lower 0
			:isOrdered false
			:owner FeatureDiagrams_ORGroup
			:type FeatureDiagrams_Child
			:location "58:3-58:49"
			:isContainer false
			:opposite co_src
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "68:2-68:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "69:2-69:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "70:2-70:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "71:2-71:18"
	) )]
) )
