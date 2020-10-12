( declare GraphML_LocatedElement )
( declare GraphML_Root )
( declare GraphML_Element )
( declare GraphML_Key )
( declare GraphML_Graph )
( declare GraphML_Edge )
( declare GraphML_HyperEdge )
( declare GraphML_Node )
( declare GraphML_Port )
( declare GraphML_EndPoint )
( declare GraphML_Data )
( declare GraphML_ElemType )
( declare GraphML_AttrType )
( declare GraphML_EdgeType )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_double )
( declare PrimitiveTypes_String )
( def GraphML ( struct-map
	KM3_Package
	:contents[( def ElemType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "edge"
		:location "72:3-72:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "node"
		:location "73:3-73:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "graph"
		:location "74:3-74:17"
	)] ) ) ( def AttrType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "double"
		:location "78:3-78:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "string"
		:location "79:3-79:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "integer"
		:location "80:3-80:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "boolean"
		:location "81:3-81:19"
	)] ) ) ( def EdgeType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "directed"
		:location "85:3-85:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "undirected"
		:location "86:3-86:22"
	)] ) ) ( def GraphML_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 0
			:isOrdered false
			:owner GraphML_LocatedElement
			:type String
			:location "13:3-13:36"
		) ( struct-map
			KM3_Attribute
			:name "commentsBefore"
			:upper -1
			:lower 0
			:isOrdered true
			:owner GraphML_LocatedElement
			:type String
			:location "14:3-14:48"
		) ( struct-map
			KM3_Attribute
			:name "commentsAfter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner GraphML_LocatedElement
			:type String
			:location "15:3-15:47"
		)]
	) ) ( def GraphML_Root ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GraphML_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "keys"
			:upper -1
			:lower 0
			:isOrdered true
			:owner GraphML_Root
			:type GraphML_Key
			:location "20:3-20:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "graphs"
			:upper -1
			:lower 0
			:isOrdered true
			:owner GraphML_Root
			:type GraphML_Graph
			:location "21:3-21:48"
			:isContainer true
		)]
	) ) ( def GraphML_Element ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GraphML_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GraphML_Element
			:type String
			:location "25:3-25:25"
		) ( struct-map
			KM3_Reference
			:name "datas"
			:upper -1
			:lower 0
			:isOrdered true
			:owner GraphML_Element
			:type GraphML_Data
			:location "26:3-26:46"
			:isContainer true
		)]
	) ) ( def GraphML_Key ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GraphML_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "for"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GraphML_Key
			:type ElemType
			:location "30:3-30:28"
		) ( struct-map
			KM3_Attribute
			:name "attrName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GraphML_Key
			:type String
			:location "31:3-31:31"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GraphML_Key
			:type AttrType
			:location "32:3-32:29"
		) ( struct-map
			KM3_Attribute
			:name "defValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GraphML_Key
			:type String
			:location "33:3-33:31"
		)]
	) ) ( def GraphML_Graph ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GraphML_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "edgeDefault"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GraphML_Graph
			:type EdgeType
			:location "38:3-38:36"
		) ( struct-map
			KM3_Reference
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered true
			:owner GraphML_Graph
			:type GraphML_Element
			:location "37:3-37:53"
			:isContainer true
		)]
	) ) ( def GraphML_Edge ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GraphML_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GraphML_Edge
			:type GraphML_Node
			:location "42:3-42:27"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GraphML_Edge
			:type GraphML_Node
			:location "43:3-43:27"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "sourceport"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GraphML_Edge
			:type GraphML_Port
			:location "44:3-44:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "targetport"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GraphML_Edge
			:type GraphML_Port
			:location "45:3-45:31"
			:isContainer false
		)]
	) ) ( def GraphML_HyperEdge ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GraphML_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "endpoints"
			:upper -1
			:lower 0
			:isOrdered true
			:owner GraphML_HyperEdge
			:type GraphML_EndPoint
			:location "49:3-49:55"
			:isContainer true
		)]
	) ) ( def GraphML_Node ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GraphML_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "subgraph"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GraphML_Node
			:type GraphML_Graph
			:location "53:3-53:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ports"
			:upper -1
			:lower 0
			:isOrdered true
			:owner GraphML_Node
			:type GraphML_Port
			:location "54:3-54:47"
			:isContainer true
		)]
	) ) ( def GraphML_Port ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GraphML_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GraphML_Port
			:type String
			:location "58:3-58:27"
		)]
	) ) ( def GraphML_EndPoint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GraphML_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "node"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GraphML_EndPoint
			:type GraphML_Node
			:location "62:3-62:25"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "port"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GraphML_EndPoint
			:type GraphML_Port
			:location "63:3-63:25"
			:isContainer false
		)]
	) ) ( def GraphML_Data ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[GraphML_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GraphML_Data
			:type String
			:location "67:3-67:25"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner GraphML_Data
			:type String
			:location "68:3-68:27"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "92:4-92:21"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "93:4-93:21"
	) ) ( def ptyp_double ( struct-map
		KM3_DataType
		:name "double"
		:location "94:4-94:20"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "95:4-95:20"
	) )]
) )
