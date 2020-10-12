( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Double )
( declare DOT_Label )
( declare DOT_SimpleLabel )
( declare DOT_ComplexLabel )
( declare DOT_Compartment )
( declare DOT_VerticalCompartment )
( declare DOT_HorizontalCompartment )
( declare DOT_SimpleCompartment )
( declare DOT_Anchor )
( declare DOT_GraphElement )
( declare DOT_Graph )
( declare DOT_Layer )
( declare DOT_Nodelike )
( declare DOT_SubGraph )
( declare DOT_Node )
( declare DOT_Arc )
( declare DOT_DirectedArc )
( declare DOT_UndirectedArc )
( declare DOT_Shape )
( declare DOT_NodeShape )
( declare DOT_SimpleNodeShape )
( declare DOT_PointNodeShape )
( declare DOT_ComplexNodeShape )
( declare DOT_PolygonNodeShape )
( declare DOT_MNodeShape )
( declare DOT_RecordNodeShape )
( declare DOT_ArrowShape )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "12:2-12:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "13:2-13:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "14:2-14:18"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "15:2-15:18"
	) )]
) )
( def DOT ( struct-map
	KM3_Package
	:contents[( def DOT_Label ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "element"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_Label
			:type DOT_GraphElement
			:location "22:3-22:53"
			:isContainer false
			:opposite label
		)]
	) ) ( def DOT_SimpleLabel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_Label]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "content"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_SimpleLabel
			:type String
			:location "26:3-26:30"
		)]
	) ) ( def DOT_ComplexLabel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_Label]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "compartments"
			:upper -1
			:lower 1
			:isOrdered true
			:owner DOT_ComplexLabel
			:type DOT_Compartment
			:location "30:3-30:87"
			:isContainer true
			:opposite complexLabel
		)]
	) ) ( def DOT_Compartment ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "complexLabel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_Compartment
			:type DOT_ComplexLabel
			:location "34:3-34:65"
			:isContainer false
			:opposite compartments
		) ( struct-map
			KM3_Reference
			:name "compartments"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Compartment
			:type DOT_Compartment
			:location "35:3-35:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "anchor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Compartment
			:type DOT_Anchor
			:location "36:3-36:52"
			:isContainer false
			:opposite source
		)]
	) ) ( def DOT_VerticalCompartment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_Compartment]
		:structuralFeatures[]
	) ) ( def DOT_HorizontalCompartment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_Compartment]
		:structuralFeatures[]
	) ) ( def DOT_SimpleCompartment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_Compartment]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "content"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_SimpleCompartment
			:type String
			:location "46:3-46:30"
		)]
	) ) ( def DOT_Anchor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_Anchor
			:type String
			:location "50:3-50:27"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Anchor
			:type DOT_Compartment
			:location "51:3-51:57"
			:isContainer false
			:opposite anchor
		)]
	) ) ( def DOT_GraphElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_GraphElement
			:type String
			:location "57:3-57:27"
		) ( struct-map
			KM3_Attribute
			:name "style"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_GraphElement
			:type String
			:location "59:3-59:33"
		) ( struct-map
			KM3_Attribute
			:name "color"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_GraphElement
			:type String
			:location "60:3-60:33"
		) ( struct-map
			KM3_Reference
			:name "label"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_GraphElement
			:type DOT_Label
			:location "58:3-58:61"
			:isContainer true
			:opposite element
		)]
	) ) ( def DOT_Graph ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_GraphElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_Graph
			:type String
			:location "64:3-64:27"
		) ( struct-map
			KM3_Attribute
			:name "rankDir"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Graph
			:type String
			:location "65:3-65:35"
		) ( struct-map
			KM3_Attribute
			:name "labeljust"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Graph
			:type String
			:location "66:3-66:37"
		) ( struct-map
			KM3_Attribute
			:name "labelloc"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Graph
			:type String
			:location "67:3-67:36"
		) ( struct-map
			KM3_Attribute
			:name "concentrate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Graph
			:type Boolean
			:location "68:3-68:40"
		) ( struct-map
			KM3_Attribute
			:name "boundingBox"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Graph
			:type String
			:location "70:3-70:39"
		) ( struct-map
			KM3_Attribute
			:name "compound"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Graph
			:type Boolean
			:location "71:3-71:37"
		) ( struct-map
			KM3_Attribute
			:name "nodeSeparation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Graph
			:type Double
			:location "73:3-73:42"
		) ( struct-map
			KM3_Attribute
			:name "ordering"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Graph
			:type String
			:location "74:3-74:36"
		) ( struct-map
			KM3_Attribute
			:name "size"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Graph
			:type String
			:location "75:3-75:32"
		) ( struct-map
			KM3_Attribute
			:name "ratio"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Graph
			:type String
			:location "76:3-76:33"
		) ( struct-map
			KM3_Attribute
			:name "center"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Graph
			:type Boolean
			:location "77:3-77:35"
		) ( struct-map
			KM3_Reference
			:name "nodes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DOT_Graph
			:type DOT_Nodelike
			:location "69:3-69:68"
			:isContainer true
			:opposite graph
		) ( struct-map
			KM3_Reference
			:name "layers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DOT_Graph
			:type DOT_Layer
			:location "72:3-72:58"
			:isContainer true
			:opposite graph
		)]
	) ) ( def DOT_Layer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_GraphElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "layerSeparator"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Layer
			:type String
			:location "84:3-84:42"
		) ( struct-map
			KM3_Reference
			:name "nodes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DOT_Layer
			:type DOT_Nodelike
			:location "81:3-81:51"
			:isContainer false
			:opposite layers
		) ( struct-map
			KM3_Reference
			:name "arcs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DOT_Layer
			:type DOT_Arc
			:location "82:3-82:45"
			:isContainer false
			:opposite layers
		) ( struct-map
			KM3_Reference
			:name "graph"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_Layer
			:type DOT_Graph
			:location "83:3-83:45"
			:isContainer false
			:opposite layers
		)]
	) ) ( def DOT_Nodelike ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DOT_GraphElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Nodelike
			:type DOT_SubGraph
			:location "88:3-88:52"
			:isContainer false
			:opposite nodes
		) ( struct-map
			KM3_Reference
			:name "refers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DOT_Nodelike
			:type DOT_Arc
			:location "89:3-89:49"
			:isContainer false
			:opposite fromNode
		) ( struct-map
			KM3_Reference
			:name "referredBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DOT_Nodelike
			:type DOT_Arc
			:location "90:3-90:51"
			:isContainer false
			:opposite toNode
		) ( struct-map
			KM3_Reference
			:name "graph"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Nodelike
			:type DOT_Graph
			:location "91:3-91:49"
			:isContainer false
			:opposite nodes
		) ( struct-map
			KM3_Reference
			:name "layers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DOT_Nodelike
			:type DOT_Layer
			:location "92:3-92:48"
			:isContainer false
			:opposite nodes
		)]
	) ) ( def DOT_SubGraph ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_Nodelike]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "labelloc"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_SubGraph
			:type String
			:location "97:3-97:36"
		) ( struct-map
			KM3_Reference
			:name "nodes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DOT_SubGraph
			:type DOT_Nodelike
			:location "96:3-96:68"
			:isContainer true
			:opposite owner
		)]
	) ) ( def DOT_Node ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_Nodelike]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "fixedSize"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Node
			:type Boolean
			:location "101:3-101:38"
		) ( struct-map
			KM3_Attribute
			:name "fontname"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Node
			:type String
			:location "102:3-102:36"
		) ( struct-map
			KM3_Attribute
			:name "fontsize"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Node
			:type Integer
			:location "103:3-103:37"
		) ( struct-map
			KM3_Attribute
			:name "height"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Node
			:type Integer
			:location "104:3-104:35"
		) ( struct-map
			KM3_Attribute
			:name "width"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Node
			:type Integer
			:location "105:3-105:34"
		) ( struct-map
			KM3_Reference
			:name "shape"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Node
			:type DOT_NodeShape
			:location "106:3-106:46"
			:isContainer true
		)]
	) ) ( def DOT_Arc ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DOT_GraphElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "constraint"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Arc
			:type Boolean
			:location "115:3-115:39"
		) ( struct-map
			KM3_Attribute
			:name "group"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Arc
			:type String
			:location "116:3-116:33"
		) ( struct-map
			KM3_Attribute
			:name "minlen"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Arc
			:type Integer
			:location "117:3-117:35"
		) ( struct-map
			KM3_Attribute
			:name "sameHead"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Arc
			:type String
			:location "118:3-118:36"
		) ( struct-map
			KM3_Attribute
			:name "sameTail"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Arc
			:type String
			:location "119:3-119:36"
		) ( struct-map
			KM3_Attribute
			:name "decorate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Arc
			:type Boolean
			:location "122:3-122:37"
		) ( struct-map
			KM3_Reference
			:name "fromNode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_Arc
			:type DOT_Nodelike
			:location "112:3-112:51"
			:isContainer false
			:opposite refers
		) ( struct-map
			KM3_Reference
			:name "toNode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_Arc
			:type DOT_Nodelike
			:location "113:3-113:53"
			:isContainer false
			:opposite referredBy
		) ( struct-map
			KM3_Reference
			:name "layers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DOT_Arc
			:type DOT_Layer
			:location "114:3-114:47"
			:isContainer false
			:opposite arcs
		) ( struct-map
			KM3_Reference
			:name "lhead"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Arc
			:type DOT_Nodelike
			:location "120:3-120:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "ltail"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_Arc
			:type DOT_Nodelike
			:location "121:3-121:35"
			:isContainer false
		)]
	) ) ( def DOT_DirectedArc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_Arc]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "tail_lp"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_DirectedArc
			:type Double
			:location "130:3-130:35"
		) ( struct-map
			KM3_Attribute
			:name "head_lp"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_DirectedArc
			:type Double
			:location "131:3-131:35"
		) ( struct-map
			KM3_Reference
			:name "arrowHead"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_DirectedArc
			:type DOT_ArrowShape
			:location "126:3-126:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "headlabel"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_DirectedArc
			:type DOT_Label
			:location "127:3-127:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "taillabel"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_DirectedArc
			:type DOT_Label
			:location "128:3-128:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "arrowTail"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_DirectedArc
			:type DOT_ArrowShape
			:location "129:3-129:51"
			:isContainer true
		)]
	) ) ( def DOT_UndirectedArc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_Arc]
		:structuralFeatures[]
	) ) ( def DOT_Shape ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DOT_GraphElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "width"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_Shape
			:type Integer
			:location "140:3-140:29"
		) ( struct-map
			KM3_Attribute
			:name "height"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_Shape
			:type Integer
			:location "141:3-141:30"
		) ( struct-map
			KM3_Attribute
			:name "peripheries"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_Shape
			:type Integer
			:location "142:3-142:35"
		)]
	) ) ( def DOT_NodeShape ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DOT_Shape]
		:structuralFeatures[]
	) ) ( def DOT_SimpleNodeShape ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_NodeShape]
		:structuralFeatures[]
	) ) ( def DOT_PointNodeShape ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_NodeShape]
		:structuralFeatures[]
	) ) ( def DOT_ComplexNodeShape ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DOT_NodeShape]
		:structuralFeatures[]
	) ) ( def DOT_PolygonNodeShape ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_ComplexNodeShape]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "sides"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_PolygonNodeShape
			:type Integer
			:location "165:3-165:29"
		) ( struct-map
			KM3_Attribute
			:name "skew"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_PolygonNodeShape
			:type Integer
			:location "166:3-166:28"
		) ( struct-map
			KM3_Attribute
			:name "distortion"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_PolygonNodeShape
			:type Integer
			:location "167:3-167:34"
		) ( struct-map
			KM3_Attribute
			:name "isRegular"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_PolygonNodeShape
			:type Boolean
			:location "168:3-168:33"
		) ( struct-map
			KM3_Attribute
			:name "orientation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_PolygonNodeShape
			:type Integer
			:location "169:3-169:35"
		)]
	) ) ( def DOT_MNodeShape ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_ComplexNodeShape]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "toplabel"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_MNodeShape
			:type DOT_Label
			:location "174:3-174:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "bottomlabel"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DOT_MNodeShape
			:type DOT_Label
			:location "175:3-175:48"
			:isContainer true
		)]
	) ) ( def DOT_RecordNodeShape ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_ComplexNodeShape]
		:structuralFeatures[]
	) ) ( def DOT_ArrowShape ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DOT_Shape]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "clipping"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_ArrowShape
			:type String
			:location "188:3-188:31"
		) ( struct-map
			KM3_Attribute
			:name "isPlain"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_ArrowShape
			:type Boolean
			:location "189:3-189:31"
		) ( struct-map
			KM3_Attribute
			:name "size"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DOT_ArrowShape
			:type Integer
			:location "190:3-190:28"
		)]
	) )]
) )
