( declare TextualPathExp_TextualPathExp )
( declare TextualPathExp_Path )
( declare TextualPathExp_Transition )
( declare TextualPathExp_AlternativeTrans )
( declare TextualPathExp_PrimitiveTrans )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( def TextualPathExp ( struct-map
	KM3_Package
	:contents[( def TextualPathExp_TextualPathExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "path"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TextualPathExp_TextualPathExp
			:type TextualPathExp_Path
			:location "11:3-11:35"
			:isContainer true
		)]
	) ) ( def TextualPathExp_Path ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "transitions"
			:upper -1
			:lower 1
			:isOrdered true
			:owner TextualPathExp_Path
			:type TextualPathExp_Transition
			:location "15:3-15:62"
			:isContainer true
		)]
	) ) ( def TextualPathExp_Transition ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isMultiple"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TextualPathExp_Transition
			:type Boolean
			:location "19:3-19:34"
		)]
	) ) ( def TextualPathExp_AlternativeTrans ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[TextualPathExp_Transition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "altPaths"
			:upper -1
			:lower 1
			:isOrdered true
			:owner TextualPathExp_AlternativeTrans
			:type TextualPathExp_Path
			:location "23:3-23:53"
			:isContainer true
		)]
	) ) ( def TextualPathExp_PrimitiveTrans ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[TextualPathExp_Transition]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TextualPathExp_PrimitiveTrans
			:type String
			:location "27:3-27:27"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "33:2-33:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "34:2-34:19"
	) )]
) )
