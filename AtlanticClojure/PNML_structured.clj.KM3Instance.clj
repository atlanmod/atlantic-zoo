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
( declare PNML_Page )
( declare PNML_Reference )
( declare PNML_ReferencePlace )
( declare PNML_ReferenceTransition )
( declare PNML_Node )
( declare PNML_Place )
( declare PNML_Transition )
( declare PNML_Graphics )
( declare PNML_NetGraphics )
( declare PNML_NodeGraphics )
( declare PNML_EdgeGraphics )
( declare PNML_AnnotationGraphics )
( declare PNML_PageGraphics )
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
		:location "33:3-33:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "rthorizontal"
		:location "34:3-34:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "rtdiagonal"
		:location "35:3-35:22"
	)] ) ) ( def ShapeType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "shtline"
		:location "40:3-40:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "shtcurve"
		:location "41:3-41:20"
	)] ) ) ( def StyleType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "sttsolid"
		:location "46:3-46:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "sttdash"
		:location "47:3-47:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "sttdot"
		:location "48:3-48:18"
	)] ) ) ( def DecorationType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "dtunderligne"
		:location "53:3-53:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "dtoverligne"
		:location "54:3-54:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "dtlinethrough"
		:location "55:3-55:25"
	)] ) ) ( def AlignType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "atleft"
		:location "60:3-60:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "atcenter"
		:location "61:3-61:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "atright"
		:location "62:3-62:19"
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
			:location "19:3-19:28"
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
			:location "27:3-27:27"
		) ( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_AnyElement
			:type String
			:location "28:3-28:27"
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
			:location "69:3-69:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "nets"
			:upper -1
			:lower 1
			:isOrdered false
			:owner PNML_PNMLDocument
			:type PNML_NetElement
			:location "70:3-70:66"
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
			:location "76:3-76:34"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "document"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_NetElement
			:type PNML_PNMLDocument
			:location "77:3-77:53"
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
			:location "78:3-78:63"
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
			:location "79:3-79:62"
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
			:location "80:3-80:69"
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
			:location "81:3-81:55"
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
			:location "86:3-86:50"
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
			:location "87:3-87:62"
			:isContainer true
			:opposite netcontent
		) ( struct-map
			KM3_Reference
			:name "page"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_NetContent
			:type PNML_Page
			:location "88:3-88:50"
			:isContainer false
			:opposite contents
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
		) ( struct-map
			KM3_Reference
			:name "page"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_ToolSpecific
			:type PNML_Page
			:location "99:3-99:47"
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
			:location "104:3-104:65"
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
			:location "105:3-105:92"
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
			:location "110:3-110:27"
		) ( struct-map
			KM3_Reference
			:name "namedelement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Label
			:type PNML_LabeledElement
			:location "111:3-111:61"
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
			:location "115:3-115:51"
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
			:location "116:3-116:58"
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
			:location "120:3-120:46"
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
			:location "124:3-124:53"
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
			:location "129:3-129:64"
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
			:location "135:3-135:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Arc
			:type PNML_NetContentElement
			:location "136:3-136:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "tools"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_Arc
			:type PNML_ToolSpecific
			:location "137:3-137:62"
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
			:location "138:3-138:71"
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
			:location "139:3-139:69"
			:isContainer true
			:opposite arc
		)]
	) ) ( def PNML_Page ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_NetContent PNML_IdedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_Page
			:type PNML_NetContent
			:location "143:3-143:64"
			:isContainer true
			:opposite page
		) ( struct-map
			KM3_Reference
			:name "tools"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_Page
			:type PNML_ToolSpecific
			:location "144:3-144:63"
			:isContainer true
			:opposite page
		) ( struct-map
			KM3_Reference
			:name "pagegraphics"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Page
			:type PNML_PageGraphics
			:location "145:3-145:72"
			:isContainer true
			:opposite page
		)]
	) ) ( def PNML_Reference ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[PNML_Node]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ref"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Reference
			:type PNML_Node
			:location "149:3-149:34"
			:isContainer true
		)]
	) ) ( def PNML_ReferencePlace ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_NetContent PNML_Reference]
		:structuralFeatures[]
	) ) ( def PNML_ReferenceTransition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_NetContent PNML_Reference]
		:structuralFeatures[]
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
			:location "162:3-162:77"
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
			:location "163:3-163:63"
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
			:location "164:3-164:72"
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
			:location "169:3-169:77"
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
			:location "184:3-184:53"
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
			:location "189:3-189:49"
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
			:location "190:3-190:67"
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
			:location "191:3-191:74"
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
			:location "192:3-192:64"
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
			:location "193:3-193:64"
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
			:location "198:3-198:47"
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
			:location "199:3-199:70"
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
			:location "200:3-200:64"
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
			:location "201:3-201:64"
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
			:location "207:3-207:73"
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
			:location "208:3-208:69"
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
			:location "209:3-209:70"
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
			:location "210:3-210:70"
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
			:location "211:3-211:70"
			:isContainer true
			:opposite annotationgraphics
		)]
	) ) ( def PNML_PageGraphics ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_Graphics]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "page"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_PageGraphics
			:type PNML_Page
			:location "216:3-216:49"
			:isContainer false
			:opposite pagegraphics
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
			:location "224:3-224:25"
		) ( struct-map
			KM3_Attribute
			:name "y"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Coordinate
			:type Integer
			:location "225:3-225:25"
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
			:location "229:3-229:66"
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
			:location "230:3-230:66"
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
			:location "234:3-234:71"
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
			:location "238:3-238:29"
		) ( struct-map
			KM3_Attribute
			:name "height"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Dimension
			:type Integer
			:location "239:3-239:30"
		) ( struct-map
			KM3_Reference
			:name "nodegraphics"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Dimension
			:type PNML_NodeGraphics
			:location "240:3-240:62"
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
			:location "244:3-244:50"
		) ( struct-map
			KM3_Reference
			:name "interiorcolor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Fill
			:type PNML_Color
			:location "245:3-245:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "gradientcolor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Fill
			:type PNML_Color
			:location "246:3-246:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "image"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Fill
			:type PNML_URI
			:location "247:3-247:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "nodegraphics"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Fill
			:type PNML_NodeGraphics
			:location "248:3-248:62"
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
			:location "249:3-249:62"
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
			:location "250:3-250:74"
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
			:location "255:3-255:34"
		) ( struct-map
			KM3_Attribute
			:name "shape"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Line
			:type ShapeType
			:location "256:3-256:36"
		) ( struct-map
			KM3_Attribute
			:name "style"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Line
			:type StyleType
			:location "257:3-257:36"
		) ( struct-map
			KM3_Reference
			:name "color"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Line
			:type PNML_Color
			:location "254:3-254:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "nodegraphics"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Line
			:type PNML_NodeGraphics
			:location "258:3-258:62"
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
			:location "259:3-259:62"
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
			:location "260:3-260:74"
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
			:location "265:3-265:34"
		) ( struct-map
			KM3_Attribute
			:name "style"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Font
			:type String
			:location "266:3-266:33"
		) ( struct-map
			KM3_Attribute
			:name "weight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Font
			:type String
			:location "267:3-267:34"
		) ( struct-map
			KM3_Attribute
			:name "size"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Font
			:type String
			:location "268:3-268:32"
		) ( struct-map
			KM3_Attribute
			:name "decoration"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Font
			:type DecorationType
			:location "269:3-269:46"
		) ( struct-map
			KM3_Attribute
			:name "align"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Font
			:type AlignType
			:location "270:3-270:36"
		) ( struct-map
			KM3_Attribute
			:name "rotation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Font
			:type Integer
			:location "271:3-271:37"
		) ( struct-map
			KM3_Reference
			:name "annotationgraphics"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Font
			:type PNML_AnnotationGraphics
			:location "272:3-272:69"
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
		:location "280:2-280:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "281:2-281:18"
	) )]
) )
