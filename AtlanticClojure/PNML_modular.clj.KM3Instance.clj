( declare PNML_IdedElement )
( declare PNML_URI )
( declare PNML_Color )
( declare PNML_AnyElement )
( declare PNML_NCName )
( declare PNML_RotationType )
( declare PNML_ShapeType )
( declare PNML_StyleType )
( declare PNML_DecorationType )
( declare PNML_AlignType )
( declare PNML_PNMLDocument )
( declare PNML_Module )
( declare PNML_Interface )
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
( declare PNML_Instance )
( declare PNML_ImportNode )
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
		:location "37:3-37:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "rthorizontal"
		:location "38:3-38:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "rtdiagonal"
		:location "39:3-39:22"
	)] ) ) ( def ShapeType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "shtline"
		:location "44:3-44:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "shtcurve"
		:location "45:3-45:20"
	)] ) ) ( def StyleType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "sttsolid"
		:location "50:3-50:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "sttdash"
		:location "51:3-51:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "sttdot"
		:location "52:3-52:18"
	)] ) ) ( def DecorationType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "dtunderligne"
		:location "57:3-57:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "dtoverligne"
		:location "58:3-58:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "dtlinethrough"
		:location "59:3-59:25"
	)] ) ) ( def AlignType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "atleft"
		:location "64:3-64:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "atcenter"
		:location "65:3-65:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "atright"
		:location "66:3-66:19"
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
	) ) ( def PNML_NCName ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_NCName
			:type String
			:location "32:3-32:28"
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
			:location "73:3-73:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "nets"
			:upper -1
			:lower 1
			:isOrdered false
			:owner PNML_PNMLDocument
			:type PNML_NetElement
			:location "74:3-74:66"
			:isContainer true
			:opposite document
		) ( struct-map
			KM3_Reference
			:name "modules"
			:upper -1
			:lower 1
			:isOrdered false
			:owner PNML_PNMLDocument
			:type PNML_Module
			:location "75:3-75:65"
			:isContainer true
			:opposite document
		)]
	) ) ( def PNML_Module ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_IdedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "interfaces"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_Module
			:type PNML_Interface
			:location "80:3-80:67"
			:isContainer true
			:opposite module
		) ( struct-map
			KM3_Reference
			:name "netcontents"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_Module
			:type PNML_NetContent
			:location "81:3-81:69"
			:isContainer true
			:opposite module
		) ( struct-map
			KM3_Reference
			:name "document"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Module
			:type PNML_PNMLDocument
			:location "82:3-82:56"
			:isContainer false
			:opposite modules
		)]
	) ) ( def PNML_Interface ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "module"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Interface
			:type PNML_Module
			:location "86:3-86:51"
			:isContainer false
			:opposite interfaces
		) ( struct-map
			KM3_Reference
			:name "importplace"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_Interface
			:type PNML_Node
			:location "87:3-87:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "exportplace"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_Interface
			:type PNML_Reference
			:location "88:3-88:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "importtransition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_Interface
			:type PNML_Node
			:location "89:3-89:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "exporttransition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_Interface
			:type PNML_Reference
			:location "90:3-90:45"
			:isContainer false
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
			:location "96:3-96:34"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "document"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_NetElement
			:type PNML_PNMLDocument
			:location "97:3-97:53"
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
			:location "98:3-98:63"
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
			:location "99:3-99:62"
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
			:location "100:3-100:69"
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
			:location "101:3-101:55"
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
			:location "106:3-106:50"
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
			:location "107:3-107:62"
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
			:location "108:3-108:50"
			:isContainer false
			:opposite contents
		) ( struct-map
			KM3_Reference
			:name "module"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_NetContent
			:type PNML_Module
			:location "109:3-109:58"
			:isContainer false
			:opposite netcontents
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
			:location "114:3-114:27"
		) ( struct-map
			KM3_Attribute
			:name "version"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_ToolSpecific
			:type String
			:location "115:3-115:30"
		) ( struct-map
			KM3_Reference
			:name "anyelement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_ToolSpecific
			:type PNML_AnyElement
			:location "116:3-116:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "net"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_ToolSpecific
			:type PNML_NetElement
			:location "117:3-117:52"
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
			:location "118:3-118:45"
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
			:location "119:3-119:47"
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
			:location "120:3-120:47"
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
			:location "125:3-125:65"
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
			:location "126:3-126:92"
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
			:location "131:3-131:27"
		) ( struct-map
			KM3_Reference
			:name "namedelement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Label
			:type PNML_LabeledElement
			:location "132:3-132:61"
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
			:location "136:3-136:51"
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
			:location "137:3-137:58"
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
			:location "141:3-141:46"
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
			:location "145:3-145:53"
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
			:location "150:3-150:64"
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
			:location "156:3-156:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Arc
			:type PNML_NetContentElement
			:location "157:3-157:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "tools"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_Arc
			:type PNML_ToolSpecific
			:location "158:3-158:62"
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
			:location "159:3-159:71"
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
			:location "160:3-160:69"
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
			:location "164:3-164:64"
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
			:location "165:3-165:63"
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
			:location "166:3-166:72"
			:isContainer true
			:opposite page
		)]
	) ) ( def PNML_Reference ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[PNML_Node]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "instance"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Reference
			:type PNML_Node
			:location "172:3-172:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ref"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Reference
			:type PNML_NCName
			:location "173:3-173:36"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "importnode"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Reference
			:type PNML_ImportNode
			:location "174:3-174:57"
			:isContainer false
			:opposite ref
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
	) ) ( def PNML_Instance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PNML_NetContent PNML_IdedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ref"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Instance
			:type PNML_URI
			:location "188:3-188:33"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "importplace"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_Instance
			:type PNML_ImportNode
			:location "189:3-189:76"
			:isContainer true
			:opposite instanceplace
		) ( struct-map
			KM3_Reference
			:name "importtransition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PNML_Instance
			:type PNML_ImportNode
			:location "190:3-190:86"
			:isContainer true
			:opposite instancetransition
		)]
	) ) ( def PNML_ImportNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "parameter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_ImportNode
			:type PNML_NCName
			:location "194:3-194:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ref"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_ImportNode
			:type PNML_Reference
			:location "195:3-195:61"
			:isContainer true
			:opposite importnode
		) ( struct-map
			KM3_Reference
			:name "instanceplace"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_ImportNode
			:type PNML_Instance
			:location "196:3-196:66"
			:isContainer false
			:opposite importplace
		) ( struct-map
			KM3_Reference
			:name "instancetransition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_ImportNode
			:type PNML_Instance
			:location "197:3-197:76"
			:isContainer false
			:opposite importtransition
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
			:location "202:3-202:77"
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
			:location "203:3-203:63"
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
			:location "204:3-204:72"
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
			:location "209:3-209:77"
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
			:location "224:3-224:53"
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
			:location "229:3-229:49"
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
			:location "230:3-230:67"
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
			:location "231:3-231:74"
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
			:location "232:3-232:64"
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
			:location "233:3-233:64"
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
			:location "238:3-238:47"
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
			:location "239:3-239:70"
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
			:location "240:3-240:64"
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
			:location "241:3-241:64"
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
			:location "247:3-247:73"
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
			:location "248:3-248:69"
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
			:location "249:3-249:70"
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
			:location "250:3-250:70"
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
			:location "251:3-251:70"
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
			:location "256:3-256:49"
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
			:location "264:3-264:25"
		) ( struct-map
			KM3_Attribute
			:name "y"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Coordinate
			:type Integer
			:location "265:3-265:25"
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
			:location "269:3-269:66"
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
			:location "270:3-270:66"
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
			:location "274:3-274:71"
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
			:location "278:3-278:29"
		) ( struct-map
			KM3_Attribute
			:name "height"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Dimension
			:type Integer
			:location "279:3-279:30"
		) ( struct-map
			KM3_Reference
			:name "nodegraphics"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Dimension
			:type PNML_NodeGraphics
			:location "280:3-280:62"
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
			:location "284:3-284:50"
		) ( struct-map
			KM3_Reference
			:name "interiorcolor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Fill
			:type PNML_Color
			:location "285:3-285:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "gradientcolor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Fill
			:type PNML_Color
			:location "286:3-286:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "image"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Fill
			:type PNML_URI
			:location "287:3-287:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "nodegraphics"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Fill
			:type PNML_NodeGraphics
			:location "288:3-288:62"
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
			:location "289:3-289:62"
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
			:location "290:3-290:74"
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
			:location "295:3-295:34"
		) ( struct-map
			KM3_Attribute
			:name "shape"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Line
			:type ShapeType
			:location "296:3-296:36"
		) ( struct-map
			KM3_Attribute
			:name "style"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Line
			:type StyleType
			:location "297:3-297:36"
		) ( struct-map
			KM3_Reference
			:name "color"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Line
			:type PNML_Color
			:location "294:3-294:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "nodegraphics"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Line
			:type PNML_NodeGraphics
			:location "298:3-298:62"
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
			:location "299:3-299:62"
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
			:location "300:3-300:74"
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
			:location "305:3-305:34"
		) ( struct-map
			KM3_Attribute
			:name "style"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Font
			:type String
			:location "306:3-306:33"
		) ( struct-map
			KM3_Attribute
			:name "weight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Font
			:type String
			:location "307:3-307:34"
		) ( struct-map
			KM3_Attribute
			:name "size"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Font
			:type String
			:location "308:3-308:32"
		) ( struct-map
			KM3_Attribute
			:name "decoration"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Font
			:type DecorationType
			:location "309:3-309:46"
		) ( struct-map
			KM3_Attribute
			:name "align"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Font
			:type AlignType
			:location "310:3-310:36"
		) ( struct-map
			KM3_Attribute
			:name "rotation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PNML_Font
			:type Integer
			:location "311:3-311:37"
		) ( struct-map
			KM3_Reference
			:name "annotationgraphics"
			:upper 1
			:lower 1
			:isOrdered false
			:owner PNML_Font
			:type PNML_AnnotationGraphics
			:location "312:3-312:69"
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
		:location "320:2-320:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "321:2-321:18"
	) )]
) )
