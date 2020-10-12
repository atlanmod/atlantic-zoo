( declare UseCases_Classifier )
( declare UseCases_Instance )
( declare UseCases_Actor )
( declare UseCases_UseCase )
( declare UseCases_UseCaseInstance )
( declare UseCases_RelationShip )
( declare UseCases_Include )
( declare UseCases_Extend )
( declare UseCases_BooleanExpression )
( declare UseCases_ModelElement )
( declare UseCases_ExtensionPoint )
( declare UseCases_LocationReference )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def UseCases ( struct-map
	KM3_Package
	:contents[( def UseCases_Classifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "instance"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UseCases_Classifier
			:type UseCases_Instance
			:location "20:3-20:58"
			:isContainer false
			:opposite classifier
		)]
	) ) ( def UseCases_Instance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "classifier"
			:upper -1
			:lower 1
			:isOrdered false
			:owner UseCases_Instance
			:type UseCases_Classifier
			:location "24:3-24:62"
			:isContainer false
			:opposite instance
		)]
	) ) ( def UseCases_Actor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UseCases_Classifier]
		:structuralFeatures[]
	) ) ( def UseCases_UseCase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UseCases_Classifier]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "extensionPoint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UseCases_UseCase
			:type String
			:location "31:3-31:40"
		) ( struct-map
			KM3_Reference
			:name "includeAddition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UseCases_UseCase
			:type UseCases_Include
			:location "32:3-32:59"
			:isContainer false
			:opposite addition
		) ( struct-map
			KM3_Reference
			:name "includeBase"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UseCases_UseCase
			:type UseCases_Include
			:location "33:3-33:51"
			:isContainer false
			:opposite base
		) ( struct-map
			KM3_Reference
			:name "extendExtension"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UseCases_UseCase
			:type UseCases_Extend
			:location "34:3-34:59"
			:isContainer false
			:opposite extension
		) ( struct-map
			KM3_Reference
			:name "extendBase"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UseCases_UseCase
			:type UseCases_Extend
			:location "35:3-35:49"
			:isContainer false
			:opposite base
		) ( struct-map
			KM3_Reference
			:name "extensionPoints"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UseCases_UseCase
			:type UseCases_ExtensionPoint
			:location "36:3-36:68"
			:isContainer false
			:opposite useCase
		)]
	) ) ( def UseCases_UseCaseInstance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UseCases_Instance]
		:structuralFeatures[]
	) ) ( def UseCases_RelationShip ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def UseCases_Include ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UseCases_RelationShip]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "addition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UseCases_Include
			:type UseCases_UseCase
			:location "45:3-45:59"
			:isContainer false
			:opposite includeAddition
		) ( struct-map
			KM3_Reference
			:name "base"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UseCases_Include
			:type UseCases_UseCase
			:location "46:3-46:51"
			:isContainer false
			:opposite includeBase
		)]
	) ) ( def UseCases_Extend ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UseCases_RelationShip]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UseCases_Extend
			:type UseCases_BooleanExpression
			:location "50:3-50:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "extension"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UseCases_Extend
			:type UseCases_UseCase
			:location "51:3-51:60"
			:isContainer false
			:opposite extendExtension
		) ( struct-map
			KM3_Reference
			:name "base"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UseCases_Extend
			:type UseCases_UseCase
			:location "52:3-52:50"
			:isContainer false
			:opposite extendBase
		) ( struct-map
			KM3_Reference
			:name "extensionPoint"
			:upper -1
			:lower 1
			:isOrdered true
			:owner UseCases_Extend
			:type UseCases_ExtensionPoint
			:location "53:3-53:76"
			:isContainer false
			:opposite extend
		)]
	) ) ( def UseCases_BooleanExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UseCases_BooleanExpression
			:type String
			:location "57:3-57:28"
		)]
	) ) ( def UseCases_ModelElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def UseCases_ExtensionPoint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UseCases_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UseCases_ExtensionPoint
			:type UseCases_LocationReference
			:location "63:3-63:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "extend"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UseCases_ExtensionPoint
			:type UseCases_Extend
			:location "64:3-64:58"
			:isContainer false
			:opposite extensionPoint
		) ( struct-map
			KM3_Reference
			:name "useCase"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UseCases_ExtensionPoint
			:type UseCases_UseCase
			:location "65:3-65:61"
			:isContainer false
			:opposite extensionPoints
		)]
	) ) ( def UseCases_LocationReference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UseCases_LocationReference
			:type String
			:location "69:3-69:28"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "74:2-74:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "75:2-75:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "76:2-76:18"
	) )]
) )
