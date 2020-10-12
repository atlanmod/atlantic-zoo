( declare PDG_MProgramDependenceGraph )
( declare PDG_EnterNode )
( declare PDG_ExpressionNode )
( declare PDG_Expression )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def PDG ( struct-map
	KM3_Package
	:contents[( def PDG_MProgramDependenceGraph ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "node"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PDG_MProgramDependenceGraph
			:type PDG_EnterNode
			:location "24:3-24:41"
			:isContainer true
		)]
	) ) ( def PDG_EnterNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PDG_EnterNode
			:type String
			:location "28:3-28:27"
		) ( struct-map
			KM3_Reference
			:name "controlDependenceNodes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PDG_EnterNode
			:type PDG_ExpressionNode
			:location "29:3-29:67"
			:isContainer true
		)]
	) ) ( def PDG_ExpressionNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PDG_ExpressionNode
			:type String
			:location "34:3-34:27"
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PDG_ExpressionNode
			:type PDG_Expression
			:location "35:3-35:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "dataDependenceNodes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PDG_ExpressionNode
			:type PDG_ExpressionNode
			:location "36:3-36:53"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "controlDependenceNodes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PDG_ExpressionNode
			:type PDG_ExpressionNode
			:location "37:3-37:66"
			:isContainer true
		)]
	) ) ( def PDG_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PDG_Expression
			:type String
			:location "43:3-43:27"
		) ( struct-map
			KM3_Attribute
			:name "isIdentifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PDG_Expression
			:type Boolean
			:location "44:3-44:36"
		) ( struct-map
			KM3_Reference
			:name "innerExpressions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner PDG_Expression
			:type PDG_Expression
			:location "45:3-45:65"
			:isContainer true
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "51:3-51:20"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "52:3-52:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "53:3-53:20"
	) )]
) )
