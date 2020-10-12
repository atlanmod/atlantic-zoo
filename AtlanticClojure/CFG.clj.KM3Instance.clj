( declare CFG_AbstractNode )
( declare CFG_Node )
( declare CFG_ConditionalNode )
( declare CFG_Expression )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def CFG ( struct-map
	KM3_Package
	:contents[( def CFG_AbstractNode ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CFG_AbstractNode
			:type CFG_Expression
			:location "11:3-11:47"
			:isContainer true
		)]
	) ) ( def CFG_Node ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CFG_AbstractNode]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "inNode"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CFG_Node
			:type CFG_Node
			:location "15:3-15:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "outNode"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CFG_Node
			:type CFG_Node
			:location "16:3-16:34"
			:isContainer false
		)]
	) ) ( def CFG_ConditionalNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CFG_AbstractNode]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "trueConditionNode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CFG_ConditionalNode
			:type CFG_Node
			:location "20:3-20:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "falseConditionNode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CFG_ConditionalNode
			:type CFG_Node
			:location "21:3-21:39"
			:isContainer false
		)]
	) ) ( def CFG_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "expressionName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CFG_Expression
			:type String
			:location "26:3-26:37"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "32:3-32:20"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "33:3-33:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "34:3-34:20"
	) )]
) )
