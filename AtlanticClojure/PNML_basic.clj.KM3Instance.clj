( declare PNML_IdedElement )
( declare PNML_URI )
( declare PNML_Color )
( declare PNML_AnyElement )
( declare PNML_RotationType )
( declare PNML_ShapeType )
( declare PNML_StyleType )
( declare PNML_DecorationType )
( declare PNML_AlignType )
( declare PNML_PNMLDocument )
( declare PNML_NetElement )
( declare PNML_NetContent )
( declare PNML_ToolSpecific )
( declare PNML_LabeledElement )
( declare PNML_Label )
( declare PNML_Name )
( declare PNML_Inscription )
( declare PNML_InitialMarking )
( declare PNML_NetContentElement )
( declare PNML_Arc )
( declare PNML_Node )
( declare PNML_Place )
( declare PNML_Transition )
( declare PNML_Graphics )
( declare PNML_NetGraphics )
( declare PNML_NodeGraphics )
( declare PNML_EdgeGraphics )
( declare PNML_AnnotationGraphics )
( declare PNML_Coordinate )
( declare PNML_Position )
( declare PNML_Offset )
( declare PNML_Dimension )
( declare PNML_Fill )
( declare PNML_Line )
( declare PNML_Font )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def PNML ( struct-map
	KM3_Package
	:contents[( def RotationType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "rtvertical"
		:location "34:3-34:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "rthorizontal"
		:location "35:3-35:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "rtdiagonal"
		:location "36:3-36:22"
	)] ) ) ( def ShapeType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "shtline"
		:location "41:3-41:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "shtcurve"
		:location "42:3-42:20"
	)] ) ) ( def StyleType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "sttsolid"
		:location "47:3-47:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "sttdash"
		:location "48:3-48:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "sttdot"
		:location "49:3-49:18"
	)] ) ) ( def DecorationType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "dtunderligne"
		:location "54:3-54:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "dtoverligne"
		:location "55:3-55:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "dtlinethrough"
		:location "56:3-56:25"
	)] ) ) ( def AlignType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "atleft"
		:location "61:3-61:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "atcenter"
		:location "62:3-62:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "atright"
		:location "63:3-63:19"
	)] ) ) ( def PNML_IdedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_IdedElement
			:type String
			:location "13:3-13:25"
		)]
	) ) ( def PNML_URI ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_URI
			:type String
			:location "20:3-20:28"
		)]
	) ) ( def PNML_Color ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def PNML_AnyElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_AnyElement
			:type String
			:location "28:3-28:27"
		) ( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_AnyElement
			:type String
			:location "29:3-29:27"
		)]
	) ) ( def PNML_PNMLDocument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "xmlns"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_PNMLDocument
			:type PNML_URI
			:location "70:3-70:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "nets"
			:upper -1
			:lower 1
			:isOrdered false
			:owner PNML_PNMLDocument
			:type PNML_NetElement
			:location "71:3-71:66"
			:isContainer true
			:opposite document
		)]
	) ) ( def PNML_NetElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_IdedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_NetElement
			:type PNML_URI
			:location "77:3-77:34"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "document"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_NetElement
			:type PNML_PNMLDocument
			:location "78:3-78:53"
			:isContainer false
			:opposite nets
		) ( struct-map
			KM3_Reference
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_NetElement
			:type PNML_NetContent
			:location "79:3-79:63"
			:isContainer true
			:opposite net
		) ( struct-map
			KM3_Reference
			:name "tools"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_NetElement
			:type PNML_ToolSpecific
			:location "80:3-80:62"
			:isContainer true
			:opposite net
		) ( struct-map
			KM3_Reference
			:name "netgraphics"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_NetElement
			:type PNML_NetGraphics
			:location "81:3-81:69"
			:isContainer true
			:opposite net
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_NetElement
			:type PNML_Name
			:location "82:3-82:55"
			:isContainer true
			:opposite net
		)]
	) ) ( def PNML_NetContent ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "net"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_NetContent
			:type PNML_NetElement
			:location "87:3-87:50"
			:isContainer false
			:opposite contents
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_NetContent
			:type PNML_Name
			:location "88:3-88:62"
			:isContainer true
			:opposite netcontent
		)]
	) ) ( def PNML_ToolSpecific ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "tool"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_ToolSpecific
			:type String
			:location "93:3-93:27"
		) ( struct-map
			KM3_Attribute
			:name "version"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_ToolSpecific
			:type String
			:location "94:3-94:30"
		) ( struct-map
			KM3_Reference
			:name "anyelement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_ToolSpecific
			:type PNML_AnyElement
			:location "95:3-95:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "net"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_ToolSpecific
			:type PNML_NetElement
			:location "96:3-96:52"
			:isContainer false
			:opposite tools
		) ( struct-map
			KM3_Reference
			:name "arc"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_ToolSpecific
			:type PNML_Arc
			:location "97:3-97:45"
			:isContainer false
			:opposite tools
		) ( struct-map
			KM3_Reference
			:name "node"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_ToolSpecific
			:type PNML_Node
			:location "98:3-98:47"
			:isContainer false
			:opposite tools
		)]
	) ) ( def PNML_LabeledElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "labels"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_LabeledElement
			:type PNML_Label
			:location "103:3-103:65"
			:isContainer true
			:opposite namedelement
		) ( struct-map
			KM3_Reference
			:name "annotationgraphics"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_LabeledElement
			:type PNML_AnnotationGraphics
			:location "104:3-104:92"
			:isContainer true
			:opposite namedelement
		)]
	) ) ( def PNML_Label ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Label
			:type String
			:location "109:3-109:27"
		) ( struct-map
			KM3_Reference
			:name "namedelement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Label
			:type PNML_LabeledElement
			:location "110:3-110:61"
			:isContainer false
			:opposite labels
		)]
	) ) ( def PNML_Name ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_LabeledElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "net"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Name
			:type PNML_NetElement
			:location "114:3-114:51"
			:isContainer false
			:opposite name
		) ( struct-map
			KM3_Reference
			:name "netcontent"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Name
			:type PNML_NetContent
			:location "115:3-115:58"
			:isContainer false
			:opposite name
		)]
	) ) ( def PNML_Inscription ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_LabeledElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "arc"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Inscription
			:type PNML_Arc
			:location "119:3-119:46"
			:isContainer false
			:opposite inscription
		)]
	) ) ( def PNML_InitialMarking ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_LabeledElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "place"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_InitialMarking
			:type PNML_Place
			:location "123:3-123:53"
			:isContainer false
			:opposite initialmarking
		)]
	) ) ( def PNML_NetContentElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[PNML_NetContent]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "node"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_NetContentElement
			:type PNML_Node
			:location "128:3-128:64"
			:isContainer true
			:opposite netcontentelement
		)]
	) ) ( def PNML_Arc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_NetContent PNML_IdedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Arc
			:type PNML_NetContentElement
			:location "134:3-134:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Arc
			:type PNML_NetContentElement
			:location "135:3-135:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "tools"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_Arc
			:type PNML_ToolSpecific
			:location "136:3-136:62"
			:isContainer true
			:opposite arc
		) ( struct-map
			KM3_Reference
			:name "edgegraphics"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Arc
			:type PNML_EdgeGraphics
			:location "137:3-137:71"
			:isContainer true
			:opposite arc
		) ( struct-map
			KM3_Reference
			:name "inscription"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Arc
			:type PNML_Inscription
			:location "138:3-138:69"
			:isContainer true
			:opposite arc
		)]
	) ) ( def PNML_Node ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_IdedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "netcontentelement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Node
			:type PNML_NetContentElement
			:location "143:3-143:77"
			:isContainer true
			:opposite node
		) ( struct-map
			KM3_Reference
			:name "tools"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_Node
			:type PNML_ToolSpecific
			:location "144:3-144:63"
			:isContainer true
			:opposite node
		) ( struct-map
			KM3_Reference
			:name "nodegraphics"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Node
			:type PNML_NodeGraphics
			:location "145:3-145:72"
			:isContainer true
			:opposite node
		)]
	) ) ( def PNML_Place ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_NetContentElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "initialmarking"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Place
			:type PNML_InitialMarking
			:location "150:3-150:77"
			:isContainer true
			:opposite place
		)]
	) ) ( def PNML_Transition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_NetContentElement]
		:structuralFeatures[]
	) ) ( def PNML_Graphics ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def PNML_NetGraphics ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_Graphics]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "net"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_NetGraphics
			:type PNML_NetElement
			:location "166:3-166:53"
			:isContainer false
			:opposite netgraphics
		)]
	) ) ( def PNML_NodeGraphics ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_Graphics]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "node"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_NodeGraphics
			:type PNML_Node
			:location "171:3-171:49"
			:isContainer false
			:opposite nodegraphics
		) ( struct-map
			KM3_Reference
			:name "position"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_NodeGraphics
			:type PNML_Position
			:location "172:3-172:67"
			:isContainer true
			:opposite nodegraphics
		) ( struct-map
			KM3_Reference
			:name "dimension"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_NodeGraphics
			:type PNML_Dimension
			:location "173:3-173:74"
			:isContainer true
			:opposite nodegraphics
		) ( struct-map
			KM3_Reference
			:name "fill"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_NodeGraphics
			:type PNML_Fill
			:location "174:3-174:64"
			:isContainer true
			:opposite nodegraphics
		) ( struct-map
			KM3_Reference
			:name "line"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_NodeGraphics
			:type PNML_Line
			:location "175:3-175:64"
			:isContainer true
			:opposite nodegraphics
		)]
	) ) ( def PNML_EdgeGraphics ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_Graphics]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "arc"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_EdgeGraphics
			:type PNML_Arc
			:location "180:3-180:47"
			:isContainer false
			:opposite edgegraphics
		) ( struct-map
			KM3_Reference
			:name "position"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_EdgeGraphics
			:type PNML_Position
			:location "181:3-181:70"
			:isContainer true
			:opposite edgegraphics
		) ( struct-map
			KM3_Reference
			:name "fill"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_EdgeGraphics
			:type PNML_Fill
			:location "182:3-182:64"
			:isContainer true
			:opposite edgegraphics
		) ( struct-map
			KM3_Reference
			:name "line"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_EdgeGraphics
			:type PNML_Line
			:location "183:3-183:64"
			:isContainer true
			:opposite edgegraphics
		)]
	) ) ( def PNML_AnnotationGraphics ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_Graphics]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "namedelement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_AnnotationGraphics
			:type PNML_LabeledElement
			:location "189:3-189:73"
			:isContainer false
			:opposite annotationgraphics
		) ( struct-map
			KM3_Reference
			:name "offset"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_AnnotationGraphics
			:type PNML_Offset
			:location "190:3-190:69"
			:isContainer true
			:opposite annotationgraphics
		) ( struct-map
			KM3_Reference
			:name "font"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_AnnotationGraphics
			:type PNML_Font
			:location "191:3-191:70"
			:isContainer true
			:opposite annotationgraphics
		) ( struct-map
			KM3_Reference
			:name "fill"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_AnnotationGraphics
			:type PNML_Fill
			:location "192:3-192:70"
			:isContainer true
			:opposite annotationgraphics
		) ( struct-map
			KM3_Reference
			:name "line"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_AnnotationGraphics
			:type PNML_Line
			:location "193:3-193:70"
			:isContainer true
			:opposite annotationgraphics
		)]
	) ) ( def PNML_Coordinate ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "x"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Coordinate
			:type Integer
			:location "198:3-198:25"
		) ( struct-map
			KM3_Attribute
			:name "y"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Coordinate
			:type Integer
			:location "199:3-199:25"
		)]
	) ) ( def PNML_Position ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_Coordinate]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "nodegraphics"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Position
			:type PNML_NodeGraphics
			:location "203:3-203:66"
			:isContainer false
			:opposite position
		) ( struct-map
			KM3_Reference
			:name "edgegraphics"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Position
			:type PNML_EdgeGraphics
			:location "204:3-204:66"
			:isContainer false
			:opposite position
		)]
	) ) ( def PNML_Offset ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_Coordinate]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "annotationgraphics"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Offset
			:type PNML_AnnotationGraphics
			:location "208:3-208:71"
			:isContainer false
			:opposite offset
		)]
	) ) ( def PNML_Dimension ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "width"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Dimension
			:type Integer
			:location "212:3-212:29"
		) ( struct-map
			KM3_Attribute
			:name "height"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Dimension
			:type Integer
			:location "213:3-213:30"
		) ( struct-map
			KM3_Reference
			:name "nodegraphics"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Dimension
			:type PNML_NodeGraphics
			:location "214:3-214:62"
			:isContainer false
			:opposite dimension
		)]
	) ) ( def PNML_Fill ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "gradientrotation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Fill
			:type RotationType
			:location "218:3-218:50"
		) ( struct-map
			KM3_Reference
			:name "interiorcolor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Fill
			:type PNML_Color
			:location "219:3-219:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "gradientcolor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Fill
			:type PNML_Color
			:location "220:3-220:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "image"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Fill
			:type PNML_URI
			:location "221:3-221:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "nodegraphics"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Fill
			:type PNML_NodeGraphics
			:location "222:3-222:62"
			:isContainer false
			:opposite fill
		) ( struct-map
			KM3_Reference
			:name "edgegraphics"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Fill
			:type PNML_EdgeGraphics
			:location "223:3-223:62"
			:isContainer false
			:opposite fill
		) ( struct-map
			KM3_Reference
			:name "annotationgraphics"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Fill
			:type PNML_AnnotationGraphics
			:location "224:3-224:74"
			:isContainer false
			:opposite fill
		)]
	) ) ( def PNML_Line ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "width"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Line
			:type Integer
			:location "229:3-229:34"
		) ( struct-map
			KM3_Attribute
			:name "shape"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Line
			:type ShapeType
			:location "230:3-230:36"
		) ( struct-map
			KM3_Attribute
			:name "style"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Line
			:type StyleType
			:location "231:3-231:36"
		) ( struct-map
			KM3_Reference
			:name "color"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Line
			:type PNML_Color
			:location "228:3-228:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "nodegraphics"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Line
			:type PNML_NodeGraphics
			:location "232:3-232:62"
			:isContainer false
			:opposite line
		) ( struct-map
			KM3_Reference
			:name "edgegraphics"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Line
			:type PNML_EdgeGraphics
			:location "233:3-233:62"
			:isContainer false
			:opposite line
		) ( struct-map
			KM3_Reference
			:name "annotationgraphics"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Line
			:type PNML_AnnotationGraphics
			:location "234:3-234:74"
			:isContainer false
			:opposite line
		)]
	) ) ( def PNML_Font ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "family"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Font
			:type String
			:location "239:3-239:34"
		) ( struct-map
			KM3_Attribute
			:name "style"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Font
			:type String
			:location "240:3-240:33"
		) ( struct-map
			KM3_Attribute
			:name "weight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Font
			:type String
			:location "241:3-241:34"
		) ( struct-map
			KM3_Attribute
			:name "size"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Font
			:type String
			:location "242:3-242:32"
		) ( struct-map
			KM3_Attribute
			:name "decoration"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Font
			:type DecorationType
			:location "243:3-243:46"
		) ( struct-map
			KM3_Attribute
			:name "align"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Font
			:type AlignType
			:location "244:3-244:36"
		) ( struct-map
			KM3_Attribute
			:name "rotation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Font
			:type Integer
			:location "245:3-245:37"
		) ( struct-map
			KM3_Reference
			:name "annotationgraphics"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Font
			:type PNML_AnnotationGraphics
			:location "246:3-246:69"
			:isContainer false
			:opposite font
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "254:2-254:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "255:2-255:18"
	) )]
) )
