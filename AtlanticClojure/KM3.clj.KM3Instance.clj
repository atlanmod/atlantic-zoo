( declare KM3_LocatedElement )
( declare KM3_ModelElement )
( declare KM3_Classifier )
( declare KM3_DataType )
( declare KM3_Enumeration )
( declare KM3_EnumLiteral )
( declare KM3_Class )
( declare KM3_StructuralFeature )
( declare KM3_Attribute )
( declare KM3_Reference )
( declare KM3_Package )
( declare KM3_Metamodel )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def KM3 ( struct-map
	KM3_Package
	:contents[( def KM3_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KM3_LocatedElement
			:type String
			:location "11:3-11:31"
		)]
	) ) ( def KM3_ModelElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[KM3_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KM3_ModelElement
			:type String
			:location "15:3-15:27"
		) ( struct-map
			KM3_Reference
			:name "package"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KM3_ModelElement
			:type KM3_Package
			:location "16:3-16:53"
			:isContainer false
			:opposite contents
		)]
	) ) ( def KM3_Classifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KM3_ModelElement]
		:structuralFeatures[]
	) ) ( def KM3_DataType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KM3_Classifier]
		:structuralFeatures[]
	) ) ( def KM3_Enumeration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KM3_Classifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "literals"
			:upper -1
			:lower 0
			:isOrdered true
			:owner KM3_Enumeration
			:type KM3_EnumLiteral
			:location "24:3-24:57"
			:isContainer true
		)]
	) ) ( def KM3_EnumLiteral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KM3_ModelElement]
		:structuralFeatures[]
	) ) ( def KM3_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KM3_Classifier]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KM3_Class
			:type Boolean
			:location "30:3-30:34"
		) ( struct-map
			KM3_Reference
			:name "supertypes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner KM3_Class
			:type KM3_Class
			:location "31:3-31:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "structuralFeatures"
			:upper -1
			:lower 0
			:isOrdered true
			:owner KM3_Class
			:type KM3_StructuralFeature
			:location "32:3-32:90"
			:isContainer true
			:opposite owner
		)]
	) ) ( def KM3_StructuralFeature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KM3_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "lower"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KM3_StructuralFeature
			:type Integer
			:location "36:3-36:29"
		) ( struct-map
			KM3_Attribute
			:name "upper"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KM3_StructuralFeature
			:type Integer
			:location "37:3-37:29"
		) ( struct-map
			KM3_Attribute
			:name "isOrdered"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KM3_StructuralFeature
			:type Boolean
			:location "38:3-38:33"
		) ( struct-map
			KM3_Attribute
			:name "isUnique"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KM3_StructuralFeature
			:type Boolean
			:location "39:3-39:32"
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KM3_StructuralFeature
			:type KM3_Class
			:location "40:3-40:57"
			:isContainer false
			:opposite structuralFeatures
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KM3_StructuralFeature
			:type KM3_Classifier
			:location "41:3-41:31"
			:isContainer false
		)]
	) ) ( def KM3_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KM3_StructuralFeature]
		:structuralFeatures[]
	) ) ( def KM3_Reference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KM3_StructuralFeature]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isContainer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KM3_Reference
			:type Boolean
			:location "47:3-47:35"
		) ( struct-map
			KM3_Reference
			:name "opposite"
			:upper 1
			:lower 0
			:isOrdered false
			:owner KM3_Reference
			:type KM3_Reference
			:location "48:3-48:39"
			:isContainer false
		)]
	) ) ( def KM3_Package ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KM3_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered true
			:owner KM3_Package
			:type KM3_ModelElement
			:location "52:3-52:79"
			:isContainer true
			:opposite package
		) ( struct-map
			KM3_Reference
			:name "metamodel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner KM3_Package
			:type KM3_Metamodel
			:location "53:3-53:55"
			:isContainer false
			:opposite contents
		)]
	) ) ( def KM3_Metamodel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[KM3_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered true
			:owner KM3_Metamodel
			:type KM3_Package
			:location "57:3-57:74"
			:isContainer true
			:opposite metamodel
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "62:2-62:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "63:2-63:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "64:2-64:18"
	) )]
) )
