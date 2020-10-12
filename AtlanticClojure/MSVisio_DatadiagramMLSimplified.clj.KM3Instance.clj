( declare DatadiagramMLSimplified_CellType )
( declare DatadiagramMLSimplified_VisioDocument )
( declare DatadiagramMLSimplified_PageSheet )
( declare DatadiagramMLSimplified_NamedElt )
( declare DatadiagramMLSimplified_IdentifiedElt )
( declare DatadiagramMLSimplified_UniqueIdElt )
( declare DatadiagramMLSimplified_Shape )
( declare DatadiagramMLSimplified_ShapeElt )
( declare DatadiagramMLSimplified_IXElt )
( declare DatadiagramMLSimplified_DelElt )
( declare DatadiagramMLSimplified_Geom )
( declare DatadiagramMLSimplified_XYElt )
( declare DatadiagramMLSimplified_LineTo )
( declare DatadiagramMLSimplified_MoveTo )
( declare DatadiagramMLSimplified_XYAElt )
( declare DatadiagramMLSimplified_ArcTo )
( declare DatadiagramMLSimplified_SplineKnot )
( declare DatadiagramMLSimplified_PolylineTo )
( declare DatadiagramMLSimplified_XYABElt )
( declare DatadiagramMLSimplified_InfiniteLine )
( declare DatadiagramMLSimplified_XYABCDElt )
( declare DatadiagramMLSimplified_Ellipse )
( declare DatadiagramMLSimplified_EllipticalArcTo )
( declare DatadiagramMLSimplified_SplineStart )
( declare DatadiagramMLSimplified_XYABCDEElt )
( declare DatadiagramMLSimplified_NURBSTo )
( declare DatadiagramMLSimplified_Text )
( declare DatadiagramMLSimplified_TextElt )
( declare DatadiagramMLSimplified_StringElt )
( declare DatadiagramMLSimplified_MastersCollection )
( declare DatadiagramMLSimplified_MasterShortCut )
( declare DatadiagramMLSimplified_Icon )
( declare DatadiagramMLSimplified_Master )
( declare DatadiagramMLSimplified_ShapesCollection )
( declare DatadiagramMLSimplified_ConnectsCollection )
( declare DatadiagramMLSimplified_Connect )
( declare DatadiagramMLSimplified_MasterElt )
( declare DatadiagramMLSimplified_PagesCollection )
( declare DatadiagramMLSimplified_Page )
( declare DatadiagramMLSimplified_PageElt )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def DatadiagramMLSimplified ( struct-map
	KM3_Package
	:contents[( def DatadiagramMLSimplified_CellType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "unit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_CellType
			:type String
			:location "16:3-16:32"
		) ( struct-map
			KM3_Attribute
			:name "formula"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_CellType
			:type String
			:location "18:3-18:35"
		) ( struct-map
			KM3_Attribute
			:name "err"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_CellType
			:type String
			:location "20:3-20:31"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_CellType
			:type String
			:location "22:3-22:33"
		)]
	) ) ( def DatadiagramMLSimplified_VisioDocument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "docMasters"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_VisioDocument
			:type DatadiagramMLSimplified_MastersCollection
			:location "33:3-33:87"
			:isContainer true
			:opposite ms_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docPages"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_VisioDocument
			:type DatadiagramMLSimplified_PagesCollection
			:location "35:3-35:83"
			:isContainer true
			:opposite ps_visioDocument
		)]
	) ) ( def DatadiagramMLSimplified_PageSheet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLSimplified_Shape DatadiagramMLSimplified_UniqueIdElt DatadiagramMLSimplified_MasterElt DatadiagramMLSimplified_PageElt]
		:structuralFeatures[]
	) ) ( def DatadiagramMLSimplified_NamedElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_NamedElt
			:type String
			:location "44:3-44:32"
		) ( struct-map
			KM3_Attribute
			:name "nameU"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_NamedElt
			:type String
			:location "46:3-46:33"
		)]
	) ) ( def DatadiagramMLSimplified_IdentifiedElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "ID"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_IdentifiedElt
			:type Integer
			:location "52:3-52:26"
		)]
	) ) ( def DatadiagramMLSimplified_UniqueIdElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "UniqueID"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_UniqueIdElt
			:type String
			:location "58:3-58:36"
		)]
	) ) ( def DatadiagramMLSimplified_Shape ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "lineStyle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Shape
			:type Integer
			:location "69:3-69:38"
		) ( struct-map
			KM3_Attribute
			:name "fillStyle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Shape
			:type Integer
			:location "71:3-71:38"
		) ( struct-map
			KM3_Attribute
			:name "textStyle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Shape
			:type Integer
			:location "73:3-73:38"
		) ( struct-map
			KM3_Reference
			:name "ss_shapes"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_Shape
			:type DatadiagramMLSimplified_ShapesCollection
			:location "66:3-66:60"
			:isContainer false
			:opposite shapes
		) ( struct-map
			KM3_Reference
			:name "shapeElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLSimplified_Shape
			:type DatadiagramMLSimplified_ShapeElt
			:location "76:3-76:81"
			:isContainer true
			:opposite sse_shapeSheet
		)]
	) ) ( def DatadiagramMLSimplified_ShapeElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sse_shapeSheet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_ShapeElt
			:type DatadiagramMLSimplified_Shape
			:location "81:3-81:57"
			:isContainer false
			:opposite shapeElts
		)]
	) ) ( def DatadiagramMLSimplified_IXElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "iX"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_IXElt
			:type Integer
			:location "87:3-87:31"
		)]
	) ) ( def DatadiagramMLSimplified_DelElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "del"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_DelElt
			:type Boolean
			:location "93:3-93:32"
		)]
	) ) ( def DatadiagramMLSimplified_Geom ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLSimplified_ShapeElt DatadiagramMLSimplified_IXElt DatadiagramMLSimplified_DelElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "noFill"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Geom
			:type DatadiagramMLSimplified_CellType
			:location "102:3-102:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "noLine"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Geom
			:type DatadiagramMLSimplified_CellType
			:location "104:3-104:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "noShow"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Geom
			:type DatadiagramMLSimplified_CellType
			:location "106:3-106:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "noSnap"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Geom
			:type DatadiagramMLSimplified_CellType
			:location "108:3-108:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "linesTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLSimplified_Geom
			:type DatadiagramMLSimplified_LineTo
			:location "110:3-110:70"
			:isContainer true
			:opposite lt_geom
		) ( struct-map
			KM3_Reference
			:name "movesTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLSimplified_Geom
			:type DatadiagramMLSimplified_MoveTo
			:location "111:3-111:70"
			:isContainer true
			:opposite mt_geom
		) ( struct-map
			KM3_Reference
			:name "arcsTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLSimplified_Geom
			:type DatadiagramMLSimplified_ArcTo
			:location "112:3-112:68"
			:isContainer true
			:opposite ac_geom
		) ( struct-map
			KM3_Reference
			:name "splineKnots"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLSimplified_Geom
			:type DatadiagramMLSimplified_SplineKnot
			:location "113:3-113:78"
			:isContainer true
			:opposite sk_geom
		) ( struct-map
			KM3_Reference
			:name "polylinesTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLSimplified_Geom
			:type DatadiagramMLSimplified_PolylineTo
			:location "114:3-114:78"
			:isContainer true
			:opposite pt_geom
		) ( struct-map
			KM3_Reference
			:name "infiniteLines"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLSimplified_Geom
			:type DatadiagramMLSimplified_InfiniteLine
			:location "115:3-115:82"
			:isContainer true
			:opposite il_geom
		) ( struct-map
			KM3_Reference
			:name "ellipses"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLSimplified_Geom
			:type DatadiagramMLSimplified_Ellipse
			:location "116:3-116:71"
			:isContainer true
			:opposite e_geom
		) ( struct-map
			KM3_Reference
			:name "ellipticalArcsTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLSimplified_Geom
			:type DatadiagramMLSimplified_EllipticalArcTo
			:location "117:3-117:89"
			:isContainer true
			:opposite eat_geom
		) ( struct-map
			KM3_Reference
			:name "splineStarts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLSimplified_Geom
			:type DatadiagramMLSimplified_SplineStart
			:location "118:3-118:80"
			:isContainer true
			:opposite ss_geom
		) ( struct-map
			KM3_Reference
			:name "nurbsTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLSimplified_Geom
			:type DatadiagramMLSimplified_NURBSTo
			:location "119:3-119:71"
			:isContainer true
			:opposite nt_geom
		)]
	) ) ( def DatadiagramMLSimplified_XYElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DatadiagramMLSimplified_IXElt DatadiagramMLSimplified_DelElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "x"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_XYElt
			:type DatadiagramMLSimplified_CellType
			:location "124:3-124:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "y"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_XYElt
			:type DatadiagramMLSimplified_CellType
			:location "125:3-125:41"
			:isContainer true
		)]
	) ) ( def DatadiagramMLSimplified_LineTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLSimplified_XYElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "lt_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_LineTo
			:type DatadiagramMLSimplified_Geom
			:location "130:3-130:47"
			:isContainer false
			:opposite linesTo
		)]
	) ) ( def DatadiagramMLSimplified_MoveTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLSimplified_XYElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mt_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_MoveTo
			:type DatadiagramMLSimplified_Geom
			:location "135:3-135:47"
			:isContainer false
			:opposite movesTo
		)]
	) ) ( def DatadiagramMLSimplified_XYAElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DatadiagramMLSimplified_XYElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "a"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_XYAElt
			:type DatadiagramMLSimplified_CellType
			:location "140:3-140:41"
			:isContainer true
		)]
	) ) ( def DatadiagramMLSimplified_ArcTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLSimplified_XYAElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ac_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_ArcTo
			:type DatadiagramMLSimplified_Geom
			:location "145:3-145:46"
			:isContainer false
			:opposite arcsTo
		)]
	) ) ( def DatadiagramMLSimplified_SplineKnot ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLSimplified_XYAElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sk_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_SplineKnot
			:type DatadiagramMLSimplified_Geom
			:location "150:3-150:51"
			:isContainer false
			:opposite splineKnots
		)]
	) ) ( def DatadiagramMLSimplified_PolylineTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLSimplified_XYAElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pt_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_PolylineTo
			:type DatadiagramMLSimplified_Geom
			:location "155:3-155:51"
			:isContainer false
			:opposite polylinesTo
		)]
	) ) ( def DatadiagramMLSimplified_XYABElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DatadiagramMLSimplified_XYAElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "b"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_XYABElt
			:type DatadiagramMLSimplified_CellType
			:location "160:3-160:41"
			:isContainer true
		)]
	) ) ( def DatadiagramMLSimplified_InfiniteLine ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLSimplified_XYABElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "il_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_InfiniteLine
			:type DatadiagramMLSimplified_Geom
			:location "165:3-165:53"
			:isContainer false
			:opposite infiniteLines
		)]
	) ) ( def DatadiagramMLSimplified_XYABCDElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DatadiagramMLSimplified_XYABElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "c"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_XYABCDElt
			:type DatadiagramMLSimplified_CellType
			:location "170:3-170:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "d"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_XYABCDElt
			:type DatadiagramMLSimplified_CellType
			:location "171:3-171:41"
			:isContainer true
		)]
	) ) ( def DatadiagramMLSimplified_Ellipse ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLSimplified_XYABCDElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "e_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_Ellipse
			:type DatadiagramMLSimplified_Geom
			:location "176:3-176:47"
			:isContainer false
			:opposite ellipses
		)]
	) ) ( def DatadiagramMLSimplified_EllipticalArcTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLSimplified_XYABCDElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "eat_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_EllipticalArcTo
			:type DatadiagramMLSimplified_Geom
			:location "181:3-181:57"
			:isContainer false
			:opposite ellipticalArcsTo
		)]
	) ) ( def DatadiagramMLSimplified_SplineStart ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLSimplified_XYABCDElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ss_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_SplineStart
			:type DatadiagramMLSimplified_Geom
			:location "186:3-186:52"
			:isContainer false
			:opposite splineStarts
		)]
	) ) ( def DatadiagramMLSimplified_XYABCDEElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DatadiagramMLSimplified_XYABCDElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "e"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_XYABCDEElt
			:type DatadiagramMLSimplified_CellType
			:location "191:3-191:41"
			:isContainer true
		)]
	) ) ( def DatadiagramMLSimplified_NURBSTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLSimplified_XYABCDEElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "nt_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_NURBSTo
			:type DatadiagramMLSimplified_Geom
			:location "196:3-196:47"
			:isContainer false
			:opposite nurbsTo
		)]
	) ) ( def DatadiagramMLSimplified_Text ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLSimplified_ShapeElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "textElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLSimplified_Text
			:type DatadiagramMLSimplified_TextElt
			:location "206:3-206:72"
			:isContainer true
			:opposite te_text
		)]
	) ) ( def DatadiagramMLSimplified_TextElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "te_text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_TextElt
			:type DatadiagramMLSimplified_Text
			:location "211:3-211:48"
			:isContainer false
			:opposite textElts
		)]
	) ) ( def DatadiagramMLSimplified_StringElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLSimplified_TextElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_StringElt
			:type String
			:location "216:3-216:28"
		)]
	) ) ( def DatadiagramMLSimplified_MastersCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ms_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_MastersCollection
			:type DatadiagramMLSimplified_VisioDocument
			:location "224:3-224:68"
			:isContainer false
			:opposite docMasters
		) ( struct-map
			KM3_Reference
			:name "masters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLSimplified_MastersCollection
			:type DatadiagramMLSimplified_Master
			:location "227:3-227:72"
			:isContainer true
			:opposite m_masters
		) ( struct-map
			KM3_Reference
			:name "masterShortCuts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLSimplified_MastersCollection
			:type DatadiagramMLSimplified_MasterShortCut
			:location "229:3-229:96"
			:isContainer true
			:opposite m_masterShortCuts
		)]
	) ) ( def DatadiagramMLSimplified_MasterShortCut ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLSimplified_IdentifiedElt DatadiagramMLSimplified_NamedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "iconSize"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_MasterShortCut
			:type Integer
			:location "237:3-237:37"
		) ( struct-map
			KM3_Attribute
			:name "patternFlags"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_MasterShortCut
			:type Integer
			:location "239:3-239:42"
		) ( struct-map
			KM3_Attribute
			:name "prompt"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_MasterShortCut
			:type String
			:location "241:3-241:34"
		) ( struct-map
			KM3_Attribute
			:name "shortcutURL"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_MasterShortCut
			:type String
			:location "243:3-243:39"
		) ( struct-map
			KM3_Attribute
			:name "shortcutHelp"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_MasterShortCut
			:type String
			:location "245:3-245:41"
		) ( struct-map
			KM3_Attribute
			:name "alignName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_MasterShortCut
			:type Integer
			:location "247:3-247:38"
		) ( struct-map
			KM3_Reference
			:name "m_masterShortCuts"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_MasterShortCut
			:type DatadiagramMLSimplified_MastersCollection
			:location "234:3-234:78"
			:isContainer false
			:opposite masterShortCuts
		) ( struct-map
			KM3_Reference
			:name "icons"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLSimplified_MasterShortCut
			:type DatadiagramMLSimplified_Icon
			:location "250:3-250:75"
			:isContainer true
			:opposite i_masterShortCut
		)]
	) ) ( def DatadiagramMLSimplified_Icon ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLSimplified_MasterElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_Icon
			:type String
			:location "258:3-258:28"
		) ( struct-map
			KM3_Reference
			:name "i_masterShortCut"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_Icon
			:type DatadiagramMLSimplified_MasterShortCut
			:location "255:3-255:64"
			:isContainer false
			:opposite icons
		)]
	) ) ( def DatadiagramMLSimplified_Master ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLSimplified_IdentifiedElt DatadiagramMLSimplified_UniqueIdElt DatadiagramMLSimplified_NamedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "baseID"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Master
			:type String
			:location "266:3-266:34"
		) ( struct-map
			KM3_Attribute
			:name "matchByName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Master
			:type Boolean
			:location "268:3-268:40"
		) ( struct-map
			KM3_Attribute
			:name "iconSize"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Master
			:type Integer
			:location "270:3-270:37"
		) ( struct-map
			KM3_Attribute
			:name "patternFlags"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Master
			:type Integer
			:location "272:3-272:42"
		) ( struct-map
			KM3_Attribute
			:name "prompt"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Master
			:type String
			:location "274:3-274:34"
		) ( struct-map
			KM3_Attribute
			:name "hidden"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Master
			:type Boolean
			:location "276:3-276:35"
		) ( struct-map
			KM3_Attribute
			:name "iconUpdate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Master
			:type Boolean
			:location "278:3-278:40"
		) ( struct-map
			KM3_Attribute
			:name "alignName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Master
			:type Integer
			:location "280:3-280:38"
		) ( struct-map
			KM3_Reference
			:name "m_masters"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_Master
			:type DatadiagramMLSimplified_MastersCollection
			:location "263:3-263:62"
			:isContainer false
			:opposite masters
		) ( struct-map
			KM3_Reference
			:name "masterElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLSimplified_Master
			:type DatadiagramMLSimplified_MasterElt
			:location "283:3-283:78"
			:isContainer true
			:opposite me_master
		)]
	) ) ( def DatadiagramMLSimplified_ShapesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLSimplified_MasterElt DatadiagramMLSimplified_PageElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "shapes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLSimplified_ShapesCollection
			:type DatadiagramMLSimplified_Shape
			:location "289:3-289:70"
			:isContainer true
			:opposite ss_shapes
		)]
	) ) ( def DatadiagramMLSimplified_ConnectsCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLSimplified_MasterElt DatadiagramMLSimplified_PageElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "connections"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLSimplified_ConnectsCollection
			:type DatadiagramMLSimplified_Connect
			:location "295:3-295:78"
			:isContainer true
			:opposite c_connects
		)]
	) ) ( def DatadiagramMLSimplified_Connect ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "fromSheet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_Connect
			:type Integer
			:location "303:3-303:33"
		) ( struct-map
			KM3_Attribute
			:name "toSheet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_Connect
			:type Integer
			:location "305:3-305:31"
		) ( struct-map
			KM3_Attribute
			:name "fromCell"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Connect
			:type String
			:location "307:3-307:37"
		) ( struct-map
			KM3_Attribute
			:name "toCell"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Connect
			:type String
			:location "309:3-309:34"
		) ( struct-map
			KM3_Attribute
			:name "fromPart"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Connect
			:type Integer
			:location "311:3-311:37"
		) ( struct-map
			KM3_Attribute
			:name "toPart"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Connect
			:type Integer
			:location "313:3-313:35"
		) ( struct-map
			KM3_Reference
			:name "c_connects"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_Connect
			:type DatadiagramMLSimplified_ConnectsCollection
			:location "300:3-300:68"
			:isContainer false
			:opposite connections
		)]
	) ) ( def DatadiagramMLSimplified_MasterElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "me_master"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_MasterElt
			:type DatadiagramMLSimplified_Master
			:location "318:3-318:54"
			:isContainer false
			:opposite masterElts
		)]
	) ) ( def DatadiagramMLSimplified_PagesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ps_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_PagesCollection
			:type DatadiagramMLSimplified_VisioDocument
			:location "323:3-323:66"
			:isContainer false
			:opposite docPages
		) ( struct-map
			KM3_Reference
			:name "pages"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLSimplified_PagesCollection
			:type DatadiagramMLSimplified_Page
			:location "326:3-326:66"
			:isContainer true
			:opposite p_pages
		)]
	) ) ( def DatadiagramMLSimplified_Page ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLSimplified_IdentifiedElt DatadiagramMLSimplified_NamedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "background"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Page
			:type Boolean
			:location "334:3-334:40"
		) ( struct-map
			KM3_Attribute
			:name "backPage"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Page
			:type Integer
			:location "336:3-336:38"
		) ( struct-map
			KM3_Attribute
			:name "viewScale"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Page
			:type Double
			:location "338:3-338:38"
		) ( struct-map
			KM3_Attribute
			:name "viewCenterX"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Page
			:type Double
			:location "340:3-340:39"
		) ( struct-map
			KM3_Attribute
			:name "ViewCenterY"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Page
			:type Double
			:location "342:3-342:40"
		) ( struct-map
			KM3_Attribute
			:name "reviewerID"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Page
			:type Integer
			:location "344:3-344:39"
		) ( struct-map
			KM3_Attribute
			:name "associatedPage"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLSimplified_Page
			:type Integer
			:location "346:3-346:43"
		) ( struct-map
			KM3_Reference
			:name "p_pages"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_Page
			:type DatadiagramMLSimplified_PagesCollection
			:location "331:3-331:56"
			:isContainer false
			:opposite pages
		) ( struct-map
			KM3_Reference
			:name "pageElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLSimplified_Page
			:type DatadiagramMLSimplified_PageElt
			:location "349:3-349:72"
			:isContainer true
			:opposite pe_page
		)]
	) ) ( def DatadiagramMLSimplified_PageElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pe_page"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLSimplified_PageElt
			:type DatadiagramMLSimplified_Page
			:location "354:3-354:48"
			:isContainer false
			:opposite pageElts
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "364:2-364:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "365:2-365:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "366:2-366:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "367:2-367:18"
	) )]
) )
