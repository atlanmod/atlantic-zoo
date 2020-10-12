( declare DiagramInterchange_Dimension )
( declare DiagramInterchange_Point )
( declare DiagramInterchange_BezierPoint )
( declare DiagramInterchange_Property )
( declare DiagramInterchange_DiagramElement )
( declare DiagramInterchange_Reference )
( declare DiagramInterchange_GraphElement )
( declare DiagramInterchange_GraphEdge )
( declare DiagramInterchange_GraphNode )
( declare DiagramInterchange_GraphConnector )
( declare DiagramInterchange_DiagramLink )
( declare DiagramInterchange_SemanticModelBridge )
( declare DiagramInterchange_Diagram )
( declare DiagramInterchange_SimpleSemanticModelElement )
( declare DiagramInterchange_UML1SemanticModelBridge )
( declare DiagramInterchange_CoreSemanticModelBridge )
( declare DiagramInterchange_CoreElement )
( declare DiagramInterchange_ElementsElement )
( declare DiagramInterchange_LeafElement )
( declare DiagramInterchange_TextElement )
( declare DiagramInterchange_Image )
( declare DiagramInterchange_GraphicPrimitive )
( declare DiagramInterchange_Polyline )
( declare DiagramInterchange_Ellipse )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def DiagramInterchange ( struct-map
	KM3_Package
	:contents[( def DiagramInterchange_Dimension ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "width"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_Dimension
			:type Double
			:location "14:3-14:28"
		) ( struct-map
			KM3_Attribute
			:name "heigth"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_Dimension
			:type Double
			:location "15:3-15:29"
		)]
	) ) ( def DiagramInterchange_Point ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "x"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_Point
			:type Double
			:location "19:3-19:24"
		) ( struct-map
			KM3_Attribute
			:name "y"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_Point
			:type Double
			:location "20:3-20:24"
		)]
	) ) ( def DiagramInterchange_BezierPoint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DiagramInterchange_Point]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "controls"
			:upper 2
			:lower 0
			:isOrdered true
			:owner DiagramInterchange_BezierPoint
			:type DiagramInterchange_Point
			:location "24:3-24:43"
			:isContainer false
		)]
	) ) ( def DiagramInterchange_Property ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_Property
			:type String
			:location "33:3-33:26"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_Property
			:type String
			:location "34:3-34:28"
		)]
	) ) ( def DiagramInterchange_DiagramElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isVisible"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_DiagramElement
			:type Boolean
			:location "38:3-38:33"
		) ( struct-map
			KM3_Reference
			:name "properties"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DiagramInterchange_DiagramElement
			:type DiagramInterchange_Property
			:location "39:3-39:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "references"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DiagramInterchange_DiagramElement
			:type DiagramInterchange_Reference
			:location "40:3-40:61"
			:isContainer false
			:opposite referenced
		) ( struct-map
			KM3_Reference
			:name "de_container"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DiagramInterchange_DiagramElement
			:type DiagramInterchange_GraphElement
			:location "41:3-41:67"
			:isContainer false
			:opposite contained
		)]
	) ) ( def DiagramInterchange_Reference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DiagramInterchange_DiagramElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isIndividualRepresentation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_Reference
			:type Boolean
			:location "45:3-45:50"
		) ( struct-map
			KM3_Reference
			:name "referenced"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_Reference
			:type DiagramInterchange_DiagramElement
			:location "46:3-46:63"
			:isContainer false
			:opposite references
		)]
	) ) ( def DiagramInterchange_GraphElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DiagramInterchange_DiagramElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "position"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_GraphElement
			:type DiagramInterchange_Point
			:location "50:3-50:30"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "contained"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DiagramInterchange_GraphElement
			:type DiagramInterchange_DiagramElement
			:location "51:3-51:85"
			:isContainer true
			:opposite de_container
		) ( struct-map
			KM3_Reference
			:name "semanticModel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_GraphElement
			:type DiagramInterchange_SemanticModelBridge
			:location "52:3-52:87"
			:isContainer true
			:opposite smb_graphElement
		) ( struct-map
			KM3_Reference
			:name "anchorages"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DiagramInterchange_GraphElement
			:type DiagramInterchange_GraphConnector
			:location "53:3-53:81"
			:isContainer true
			:opposite gc_graphElement
		) ( struct-map
			KM3_Reference
			:name "links"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DiagramInterchange_GraphElement
			:type DiagramInterchange_DiagramLink
			:location "54:3-54:73"
			:isContainer true
			:opposite dl_graphElement
		)]
	) ) ( def DiagramInterchange_GraphEdge ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DiagramInterchange_GraphElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "waypoints"
			:upper 2
			:lower 0
			:isOrdered true
			:owner DiagramInterchange_GraphEdge
			:type DiagramInterchange_Point
			:location "58:3-58:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "anchors"
			:upper 2
			:lower 2
			:isOrdered true
			:owner DiagramInterchange_GraphEdge
			:type DiagramInterchange_GraphConnector
			:location "59:3-59:73"
			:isContainer false
			:opposite graphEdges
		)]
	) ) ( def DiagramInterchange_GraphNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DiagramInterchange_GraphElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "size"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DiagramInterchange_GraphNode
			:type DiagramInterchange_Dimension
			:location "63:3-63:35"
			:isContainer false
		)]
	) ) ( def DiagramInterchange_GraphConnector ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "position"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_GraphConnector
			:type DiagramInterchange_Point
			:location "67:3-67:30"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "gc_graphElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_GraphConnector
			:type DiagramInterchange_GraphElement
			:location "68:3-68:66"
			:isContainer false
			:opposite anchorages
		) ( struct-map
			KM3_Reference
			:name "graphEdges"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DiagramInterchange_GraphConnector
			:type DiagramInterchange_GraphEdge
			:location "69:3-69:58"
			:isContainer false
			:opposite anchors
		)]
	) ) ( def DiagramInterchange_DiagramLink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "zoom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_DiagramLink
			:type Double
			:location "73:3-73:27"
		) ( struct-map
			KM3_Reference
			:name "viewPort"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_DiagramLink
			:type DiagramInterchange_Point
			:location "74:3-74:30"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dl_graphElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_DiagramLink
			:type DiagramInterchange_GraphElement
			:location "75:3-75:61"
			:isContainer false
			:opposite links
		) ( struct-map
			KM3_Reference
			:name "dl_diagram"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_DiagramLink
			:type DiagramInterchange_Diagram
			:location "76:3-76:58"
			:isContainer false
			:opposite diagramLinks
		)]
	) ) ( def DiagramInterchange_SemanticModelBridge ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "presentation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_SemanticModelBridge
			:type String
			:location "80:3-80:35"
		) ( struct-map
			KM3_Reference
			:name "smb_graphElement"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DiagramInterchange_SemanticModelBridge
			:type DiagramInterchange_GraphElement
			:location "81:3-81:75"
			:isContainer false
			:opposite semanticModel
		) ( struct-map
			KM3_Reference
			:name "smb_diagram"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DiagramInterchange_SemanticModelBridge
			:type DiagramInterchange_Diagram
			:location "82:3-82:61"
			:isContainer false
			:opposite namespace
		)]
	) ) ( def DiagramInterchange_Diagram ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DiagramInterchange_GraphNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_Diagram
			:type String
			:location "86:3-86:27"
		) ( struct-map
			KM3_Attribute
			:name "zoom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_Diagram
			:type Double
			:location "87:3-87:27"
		) ( struct-map
			KM3_Reference
			:name "viewPort"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_Diagram
			:type DiagramInterchange_Point
			:location "88:3-88:30"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "diagramLinks"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DiagramInterchange_Diagram
			:type DiagramInterchange_DiagramLink
			:location "89:3-89:65"
			:isContainer false
			:opposite dl_diagram
		) ( struct-map
			KM3_Reference
			:name "namespace"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_Diagram
			:type DiagramInterchange_SemanticModelBridge
			:location "90:3-90:78"
			:isContainer true
			:opposite smb_diagram
		)]
	) ) ( def DiagramInterchange_SimpleSemanticModelElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DiagramInterchange_SemanticModelBridge]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "typeInfo"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_SimpleSemanticModelElement
			:type String
			:location "94:3-94:31"
		)]
	) ) ( def DiagramInterchange_UML1SemanticModelBridge ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DiagramInterchange_SemanticModelBridge]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "element"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_UML1SemanticModelBridge
			:type DiagramInterchange_CoreElement
			:location "98:3-98:35"
			:isContainer false
		)]
	) ) ( def DiagramInterchange_CoreSemanticModelBridge ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DiagramInterchange_SemanticModelBridge]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "element"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_CoreSemanticModelBridge
			:type DiagramInterchange_ElementsElement
			:location "102:3-102:39"
			:isContainer false
		)]
	) ) ( def DiagramInterchange_CoreElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def DiagramInterchange_ElementsElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def DiagramInterchange_LeafElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DiagramInterchange_DiagramElement]
		:structuralFeatures[]
	) ) ( def DiagramInterchange_TextElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DiagramInterchange_LeafElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_TextElement
			:type String
			:location "112:3-112:27"
		)]
	) ) ( def DiagramInterchange_Image ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DiagramInterchange_LeafElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "uri"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_Image
			:type String
			:location "116:3-116:26"
		) ( struct-map
			KM3_Attribute
			:name "mimeType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_Image
			:type String
			:location "117:3-117:31"
		)]
	) ) ( def DiagramInterchange_GraphicPrimitive ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DiagramInterchange_LeafElement]
		:structuralFeatures[]
	) ) ( def DiagramInterchange_Polyline ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DiagramInterchange_GraphicPrimitive]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "closed"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_Polyline
			:type Boolean
			:location "124:3-124:30"
		) ( struct-map
			KM3_Reference
			:name "waypoints"
			:upper -1
			:lower 2
			:isOrdered true
			:owner DiagramInterchange_Polyline
			:type DiagramInterchange_Point
			:location "123:3-123:44"
			:isContainer false
		)]
	) ) ( def DiagramInterchange_Ellipse ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DiagramInterchange_GraphicPrimitive]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "radiusX"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_Ellipse
			:type Double
			:location "129:3-129:30"
		) ( struct-map
			KM3_Attribute
			:name "radiusY"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_Ellipse
			:type Double
			:location "130:3-130:30"
		) ( struct-map
			KM3_Attribute
			:name "rotation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_Ellipse
			:type Double
			:location "131:3-131:31"
		) ( struct-map
			KM3_Attribute
			:name "startAngle"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_Ellipse
			:type Double
			:location "132:3-132:33"
		) ( struct-map
			KM3_Attribute
			:name "endAngle"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_Ellipse
			:type Double
			:location "133:3-133:31"
		) ( struct-map
			KM3_Reference
			:name "center"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DiagramInterchange_Ellipse
			:type DiagramInterchange_Point
			:location "128:3-128:28"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "143:2-143:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "144:2-144:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "145:2-145:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "146:2-146:18"
	) )]
) )
