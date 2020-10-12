( declare SVG_Element )
( declare SVG_StructuralElement )
( declare SVG_Image )
( declare SVG_Svg )
( declare SVG_GroupingElement )
( declare SVG_G )
( declare SVG_Defs )
( declare SVG_Symbol )
( declare SVG_Use )
( declare SVG_GraphicalElement )
( declare SVG_Shape )
( declare SVG_TextElement )
( declare SVG_Rect )
( declare SVG_Circle )
( declare SVG_Ellipse )
( declare SVG_Line )
( declare SVG_Polyline )
( declare SVG_Polygon )
( declare SVG_Path )
( declare SVG_Point )
( declare SVG_Marker )
( declare SVG_Text )
( declare SVG_Tspan )
( declare SVG_Tref )
( declare SVG_Attribute )
( declare SVG_Transform )
( declare SVG_Scale )
( declare SVG_Translate )
( declare SVG_Rotate )
( declare SVG_Visibility )
( declare SVG_FontWeight )
( declare SVG_FontStyle )
( declare SVG_Dimension )
( declare SVG_Coordinates )
( declare SVG_RelativeCoord )
( declare SVG_AbsoluteCoord )
( declare SVG_ReferencedFile )
( declare SVG_SvgFile )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Double )
( def SVG ( struct-map
	KM3_Package
	:contents[( def SVG_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "fill"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Element
			:type String
			:location "19:3-19:32"
		) ( struct-map
			KM3_Attribute
			:name "viewBox"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Element
			:type String
			:location "20:3-20:35"
		) ( struct-map
			KM3_Attribute
			:name "identifier"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Element
			:type String
			:location "22:3-22:38"
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SVG_Element
			:type SVG_SvgFile
			:location "13:3-13:52"
			:isContainer false
			:opposite elements
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SVG_Element
			:type SVG_Use
			:location "14:3-14:44"
			:isContainer false
			:opposite use
		) ( struct-map
			KM3_Reference
			:name "attribute"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SVG_Element
			:type SVG_Attribute
			:location "15:3-15:60"
			:isContainer false
			:opposite attOwner
		) ( struct-map
			KM3_Reference
			:name "position"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Element
			:type SVG_Coordinates
			:location "16:3-16:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "size"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Element
			:type SVG_Dimension
			:location "17:3-17:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "root"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Element
			:type SVG_Svg
			:location "18:3-18:49"
			:isContainer false
			:opposite children
		) ( struct-map
			KM3_Reference
			:name "group"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Element
			:type SVG_GroupingElement
			:location "21:3-21:66"
			:isContainer false
			:opposite groupContent
		) ( struct-map
			KM3_Reference
			:name "drawsMarker"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Element
			:type SVG_Marker
			:location "23:3-23:58"
			:isContainer false
			:opposite drawing
		)]
	) ) ( def SVG_StructuralElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SVG_Element]
		:structuralFeatures[]
	) ) ( def SVG_Image ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_StructuralElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "referee"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SVG_Image
			:type SVG_ReferencedFile
			:location "32:3-32:60"
			:isContainer false
			:opposite referer
		)]
	) ) ( def SVG_Svg ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_StructuralElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "namespace"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Svg
			:type String
			:location "38:3-38:37"
		) ( struct-map
			KM3_Attribute
			:name "version"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Svg
			:type String
			:location "39:3-39:35"
		) ( struct-map
			KM3_Attribute
			:name "baseProfile"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Svg
			:type String
			:location "40:3-40:39"
		) ( struct-map
			KM3_Reference
			:name "owner_SVG"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SVG_Svg
			:type SVG_SvgFile
			:location "36:3-36:51"
			:isContainer false
			:opposite tag
		) ( struct-map
			KM3_Reference
			:name "children"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SVG_Svg
			:type SVG_Element
			:location "37:3-37:69"
			:isContainer true
			:opposite root
		)]
	) ) ( def SVG_GroupingElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SVG_StructuralElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "groupContent"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SVG_GroupingElement
			:type SVG_Element
			:location "44:3-44:74"
			:isContainer true
			:opposite group
		)]
	) ) ( def SVG_G ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_GroupingElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_G
			:type String
			:location "48:3-48:32"
		)]
	) ) ( def SVG_Defs ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_GroupingElement]
		:structuralFeatures[]
	) ) ( def SVG_Symbol ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_GroupingElement]
		:structuralFeatures[]
	) ) ( def SVG_Use ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_StructuralElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "use"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SVG_Use
			:type SVG_Element
			:location "58:3-58:48"
			:isContainer false
			:opposite target
		)]
	) ) ( def SVG_GraphicalElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SVG_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "stroke"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_GraphicalElement
			:type String
			:location "62:3-62:34"
		)]
	) ) ( def SVG_Shape ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SVG_GraphicalElement]
		:structuralFeatures[]
	) ) ( def SVG_TextElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SVG_GraphicalElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "rotate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_TextElement
			:type Double
			:location "69:3-69:34"
		) ( struct-map
			KM3_Attribute
			:name "textLength"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_TextElement
			:type String
			:location "70:3-70:38"
		) ( struct-map
			KM3_Attribute
			:name "fontSize"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_TextElement
			:type String
			:location "71:3-71:36"
		)]
	) ) ( def SVG_Rect ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_Shape]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "rx"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Rect
			:type Double
			:location "76:3-76:30"
		) ( struct-map
			KM3_Attribute
			:name "ry"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Rect
			:type Double
			:location "77:3-77:30"
		)]
	) ) ( def SVG_Circle ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_Shape]
		:structuralFeatures[]
	) ) ( def SVG_Ellipse ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_Shape]
		:structuralFeatures[]
	) ) ( def SVG_Line ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_Shape]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "markerEnd"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Line
			:type String
			:location "88:3-88:37"
		) ( struct-map
			KM3_Attribute
			:name "markerStart"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Line
			:type String
			:location "89:3-89:39"
		) ( struct-map
			KM3_Reference
			:name "between"
			:upper 2
			:lower 2
			:isOrdered false
			:owner SVG_Line
			:type SVG_Point
			:location "87:3-87:34"
			:isContainer false
		)]
	) ) ( def SVG_Polyline ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_Shape]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "strokeDashArray"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Polyline
			:type String
			:location "94:3-94:43"
		) ( struct-map
			KM3_Attribute
			:name "markerEnd"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Polyline
			:type String
			:location "95:3-95:37"
		) ( struct-map
			KM3_Attribute
			:name "markerStart"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Polyline
			:type String
			:location "96:3-96:39"
		) ( struct-map
			KM3_Reference
			:name "waypoints"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SVG_Polyline
			:type SVG_Point
			:location "93:3-93:52"
			:isContainer true
		)]
	) ) ( def SVG_Polygon ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_Shape]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "markerEnd"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Polygon
			:type String
			:location "101:3-101:37"
		) ( struct-map
			KM3_Attribute
			:name "markerStart"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Polygon
			:type String
			:location "102:3-102:39"
		) ( struct-map
			KM3_Reference
			:name "waypoints"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SVG_Polygon
			:type SVG_Point
			:location "100:3-100:42"
			:isContainer false
		)]
	) ) ( def SVG_Path ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_Shape]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "pathLength"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Path
			:type Double
			:location "106:3-106:38"
		) ( struct-map
			KM3_Attribute
			:name "d"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SVG_Path
			:type String
			:location "107:3-107:24"
		) ( struct-map
			KM3_Attribute
			:name "markerEnd"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Path
			:type String
			:location "108:3-108:37"
		) ( struct-map
			KM3_Attribute
			:name "markerStart"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Path
			:type String
			:location "109:3-109:39"
		)]
	) ) ( def SVG_Point ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_Shape]
		:structuralFeatures[]
	) ) ( def SVG_Marker ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_Shape]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "markerUnits"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Marker
			:type String
			:location "116:3-116:39"
		) ( struct-map
			KM3_Attribute
			:name "refX"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Marker
			:type Double
			:location "117:3-117:32"
		) ( struct-map
			KM3_Attribute
			:name "refY"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Marker
			:type Double
			:location "118:3-118:32"
		) ( struct-map
			KM3_Attribute
			:name "markerWidth"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Marker
			:type Double
			:location "119:3-119:39"
		) ( struct-map
			KM3_Attribute
			:name "markerHeight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Marker
			:type Double
			:location "120:3-120:40"
		) ( struct-map
			KM3_Attribute
			:name "orient"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Marker
			:type String
			:location "121:3-121:34"
		) ( struct-map
			KM3_Reference
			:name "drawing"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SVG_Marker
			:type SVG_Element
			:location "122:3-122:67"
			:isContainer true
			:opposite drawsMarker
		)]
	) ) ( def SVG_Text ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_TextElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "lengthAdjust"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Text
			:type String
			:location "128:3-128:40"
		) ( struct-map
			KM3_Attribute
			:name "content"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SVG_Text
			:type String
			:location "129:3-129:30"
		)]
	) ) ( def SVG_Tspan ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_TextElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "content"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SVG_Tspan
			:type String
			:location "133:3-133:35"
		)]
	) ) ( def SVG_Tref ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_TextElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "xlinkHref"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SVG_Tref
			:type SVG_TextElement
			:location "137:3-137:37"
			:isContainer false
		)]
	) ) ( def SVG_Attribute ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "attOwner"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SVG_Attribute
			:type SVG_Element
			:location "143:3-143:58"
			:isContainer false
			:opposite attribute
		)]
	) ) ( def SVG_Transform ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SVG_Attribute]
		:structuralFeatures[]
	) ) ( def SVG_Scale ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_Transform]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "sx"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SVG_Scale
			:type Double
			:location "150:3-150:25"
		) ( struct-map
			KM3_Attribute
			:name "sy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SVG_Scale
			:type Double
			:location "151:3-151:25"
		)]
	) ) ( def SVG_Translate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_Transform]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "tx"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SVG_Translate
			:type Double
			:location "155:3-155:25"
		) ( struct-map
			KM3_Attribute
			:name "ty"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SVG_Translate
			:type Double
			:location "156:3-156:25"
		)]
	) ) ( def SVG_Rotate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_Transform]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "angle"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SVG_Rotate
			:type Double
			:location "160:3-160:28"
		) ( struct-map
			KM3_Attribute
			:name "cx"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SVG_Rotate
			:type Double
			:location "161:3-161:25"
		) ( struct-map
			KM3_Attribute
			:name "cy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SVG_Rotate
			:type Double
			:location "162:3-162:25"
		)]
	) ) ( def SVG_Visibility ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_Attribute]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "visible"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SVG_Visibility
			:type Boolean
			:location "166:3-166:31"
		)]
	) ) ( def SVG_FontWeight ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_Attribute]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "bold"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SVG_FontWeight
			:type Boolean
			:location "170:3-170:28"
		)]
	) ) ( def SVG_FontStyle ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_Attribute]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "italic"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SVG_FontStyle
			:type Boolean
			:location "174:3-174:30"
		)]
	) ) ( def SVG_Dimension ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "width"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SVG_Dimension
			:type Double
			:location "181:3-181:28"
		) ( struct-map
			KM3_Attribute
			:name "height"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SVG_Dimension
			:type Double
			:location "182:3-182:29"
		)]
	) ) ( def SVG_Coordinates ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "x"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SVG_Coordinates
			:type Double
			:location "187:3-187:24"
		) ( struct-map
			KM3_Attribute
			:name "y"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SVG_Coordinates
			:type Double
			:location "188:3-188:24"
		)]
	) ) ( def SVG_RelativeCoord ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_Coordinates]
		:structuralFeatures[]
	) ) ( def SVG_AbsoluteCoord ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_Coordinates]
		:structuralFeatures[]
	) ) ( def SVG_ReferencedFile ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SVG_ReferencedFile
			:type String
			:location "202:3-202:27"
		) ( struct-map
			KM3_Reference
			:name "referer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SVG_ReferencedFile
			:type SVG_Image
			:location "201:3-201:51"
			:isContainer false
			:opposite referee
		)]
	) ) ( def SVG_SvgFile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SVG_ReferencedFile]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tag"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SVG_SvgFile
			:type SVG_Svg
			:location "207:3-207:44"
			:isContainer false
			:opposite owner_SVG
		) ( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SVG_SvgFile
			:type SVG_Element
			:location "208:3-208:52"
			:isContainer false
			:opposite owner
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "214:2-214:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "215:2-215:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "216:2-216:18"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "217:2-217:18"
	) )]
) )
