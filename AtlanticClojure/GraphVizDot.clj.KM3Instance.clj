( declare DOT_LocatedElement )
( declare DOT_NamedElement )
( declare DOT_Graph )
( declare DOT_GraphElement )
( declare DOT_Node )
( declare DOT_DirectedArc )
( declare DOT_Constraint )
( declare DOT_SubGraph )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def DOT ( struct-map
	KM3_Package
	:contents[( def DOT_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_LocatedElement
			:type String
			:location "12:3-12:36"
		) ( struct-map
			KM3_Attribute
			:name "commentsBefore"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DOT_LocatedElement
			:type String
			:location "13:3-13:48"
		) ( struct-map
			KM3_Attribute
			:name "commentsAfter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DOT_LocatedElement
			:type String
			:location "14:3-14:47"
		)]
	) ) ( def DOT_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DOT_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_NamedElement
			:type String
			:location "20:3-20:27"
		)]
	) ) ( def DOT_Graph ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Graph
			:type String
			:location "24:3-24:32"
		) ( struct-map
			KM3_Attribute
			:name "rankDir"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Graph
			:type String
			:location "25:3-25:35"
		) ( struct-map
			KM3_Attribute
			:name "dim"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Graph
			:type Integer
			:location "26:3-26:32"
		) ( struct-map
			KM3_Reference
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DOT_Graph
			:type DOT_GraphElement
			:location "28:3-28:76"
			:isContainer true
			:opposite graph
		)]
	) ) ( def DOT_GraphElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DOT_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "label"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_GraphElement
			:type String
			:location "32:3-32:33"
		) ( struct-map
			KM3_Attribute
			:name "color"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_GraphElement
			:type String
			:location "33:3-33:33"
		) ( struct-map
			KM3_Attribute
			:name "z"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_GraphElement
			:type Integer
			:location "34:3-34:30"
		) ( struct-map
			KM3_Reference
			:name "graph"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_GraphElement
			:type DOT_Graph
			:location "36:3-36:47"
			:isContainer false
			:opposite contents
		)]
	) ) ( def DOT_Node ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_GraphElement DOT_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "shape"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_Node
			:type String
			:location "40:3-40:28"
		) ( struct-map
			KM3_Attribute
			:name "style"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_Node
			:type String
			:location "41:3-41:28"
		)]
	) ) ( def DOT_DirectedArc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_GraphElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "sourceNode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_DirectedArc
			:type String
			:location "46:3-46:33"
		) ( struct-map
			KM3_Attribute
			:name "sourcePart"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_DirectedArc
			:type String
			:location "47:3-47:38"
		) ( struct-map
			KM3_Attribute
			:name "targetNode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_DirectedArc
			:type String
			:location "48:3-48:33"
		) ( struct-map
			KM3_Attribute
			:name "targetPart"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_DirectedArc
			:type String
			:location "49:3-49:38"
		) ( struct-map
			KM3_Attribute
			:name "shape"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_DirectedArc
			:type String
			:location "50:3-50:33"
		)]
	) ) ( def DOT_Constraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_GraphElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Constraint
			:type String
			:location "54:3-54:31"
		) ( struct-map
			KM3_Attribute
			:name "refers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DOT_Constraint
			:type String
			:location "55:3-55:32"
		)]
	) ) ( def DOT_SubGraph ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_Graph DOT_GraphElement]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "66:2-66:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "67:2-67:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "68:2-68:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "69:2-69:18"
	) )]
) )
