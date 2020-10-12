( declare DatadiagramMLTextFormat_DateTimeType )
( declare DatadiagramMLTextFormat_CellType )
( declare DatadiagramMLTextFormat_VisioDocument )
( declare DatadiagramMLTextFormat_DocumentPropertiesCollection )
( declare DatadiagramMLTextFormat_CustomPropertiesCollection )
( declare DatadiagramMLTextFormat_CustomProperty )
( declare DatadiagramMLTextFormat_ColorsTable )
( declare DatadiagramMLTextFormat_ColorEntry )
( declare DatadiagramMLTextFormat_FontsTable )
( declare DatadiagramMLTextFormat_FontEntry )
( declare DatadiagramMLTextFormat_FaceNamesTable )
( declare DatadiagramMLTextFormat_FaceName )
( declare DatadiagramMLTextFormat_VBProjectData )
( declare DatadiagramMLTextFormat_EmailRoutingData )
( declare DatadiagramMLTextFormat_StyleSheetsCollection )
( declare DatadiagramMLTextFormat_StyleSheet )
( declare DatadiagramMLTextFormat_DocumentSheet )
( declare DatadiagramMLTextFormat_PageSheet )
( declare DatadiagramMLTextFormat_NamedElt )
( declare DatadiagramMLTextFormat_IdentifiedElt )
( declare DatadiagramMLTextFormat_UniqueIdElt )
( declare DatadiagramMLTextFormat_Shape )
( declare DatadiagramMLTextFormat_ShapeElt )
( declare DatadiagramMLTextFormat_IXElt )
( declare DatadiagramMLTextFormat_DelElt )
( declare DatadiagramMLTextFormat_Geom )
( declare DatadiagramMLTextFormat_XYElt )
( declare DatadiagramMLTextFormat_LineTo )
( declare DatadiagramMLTextFormat_MoveTo )
( declare DatadiagramMLTextFormat_XYAElt )
( declare DatadiagramMLTextFormat_ArcTo )
( declare DatadiagramMLTextFormat_SplineKnot )
( declare DatadiagramMLTextFormat_PolylineTo )
( declare DatadiagramMLTextFormat_XYABElt )
( declare DatadiagramMLTextFormat_InfiniteLine )
( declare DatadiagramMLTextFormat_XYABCDElt )
( declare DatadiagramMLTextFormat_Ellipse )
( declare DatadiagramMLTextFormat_EllipticalArcTo )
( declare DatadiagramMLTextFormat_SplineStart )
( declare DatadiagramMLTextFormat_XYABCDEElt )
( declare DatadiagramMLTextFormat_NURBSTo )
( declare DatadiagramMLTextFormat_Text )
( declare DatadiagramMLTextFormat_TextElt )
( declare DatadiagramMLTextFormat_IXrequiredElt )
( declare DatadiagramMLTextFormat_Cp )
( declare DatadiagramMLTextFormat_Pp )
( declare DatadiagramMLTextFormat_Tp )
( declare DatadiagramMLTextFormat_Fld )
( declare DatadiagramMLTextFormat_StringElt )
( declare DatadiagramMLTextFormat_Char )
( declare DatadiagramMLTextFormat_Para )
( declare DatadiagramMLTextFormat_TabsCollection )
( declare DatadiagramMLTextFormat_Tab )
( declare DatadiagramMLTextFormat_Field )
( declare DatadiagramMLTextFormat_MastersCollection )
( declare DatadiagramMLTextFormat_MasterShortCut )
( declare DatadiagramMLTextFormat_Icon )
( declare DatadiagramMLTextFormat_Master )
( declare DatadiagramMLTextFormat_ShapesCollection )
( declare DatadiagramMLTextFormat_ConnectsCollection )
( declare DatadiagramMLTextFormat_Connect )
( declare DatadiagramMLTextFormat_MasterElt )
( declare DatadiagramMLTextFormat_PagesCollection )
( declare DatadiagramMLTextFormat_Page )
( declare DatadiagramMLTextFormat_PageElt )
( declare DatadiagramMLTextFormat_DocumentSettingsElt )
( declare DatadiagramMLTextFormat_PrintSetup )
( declare DatadiagramMLTextFormat_WindowsInfo )
( declare DatadiagramMLTextFormat_EventList )
( declare DatadiagramMLTextFormat_HeaderFooter )
( declare DatadiagramMLTextFormat_SolutionXML )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def DatadiagramMLTextFormat ( struct-map
	KM3_Package
	:contents[( def DatadiagramMLTextFormat_DateTimeType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_DateTimeType
			:type Integer
			:location "16:3-16:28"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_DateTimeType
			:type Integer
			:location "17:3-17:29"
		) ( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_DateTimeType
			:type Integer
			:location "18:3-18:27"
		) ( struct-map
			KM3_Attribute
			:name "hour"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_DateTimeType
			:type Integer
			:location "19:3-19:28"
		) ( struct-map
			KM3_Attribute
			:name "minute"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_DateTimeType
			:type Integer
			:location "20:3-20:30"
		) ( struct-map
			KM3_Attribute
			:name "second"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_DateTimeType
			:type Integer
			:location "21:3-21:30"
		)]
	) ) ( def DatadiagramMLTextFormat_CellType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "unit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_CellType
			:type String
			:location "27:3-27:32"
		) ( struct-map
			KM3_Attribute
			:name "formula"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_CellType
			:type String
			:location "29:3-29:35"
		) ( struct-map
			KM3_Attribute
			:name "err"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_CellType
			:type String
			:location "31:3-31:31"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_CellType
			:type String
			:location "33:3-33:33"
		)]
	) ) ( def DatadiagramMLTextFormat_VisioDocument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "start"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_VisioDocument
			:type Integer
			:location "44:3-44:34"
		) ( struct-map
			KM3_Attribute
			:name "key"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_VisioDocument
			:type String
			:location "46:3-46:31"
		) ( struct-map
			KM3_Attribute
			:name "metric"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_VisioDocument
			:type Boolean
			:location "48:3-48:35"
		) ( struct-map
			KM3_Attribute
			:name "buildnum"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_VisioDocument
			:type Integer
			:location "50:3-50:37"
		) ( struct-map
			KM3_Attribute
			:name "version"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_VisioDocument
			:type String
			:location "52:3-52:35"
		) ( struct-map
			KM3_Attribute
			:name "docLangId"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_VisioDocument
			:type Integer
			:location "54:3-54:38"
		) ( struct-map
			KM3_Reference
			:name "docProps"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_VisioDocument
			:type DatadiagramMLTextFormat_DocumentPropertiesCollection
			:location "57:3-57:97"
			:isContainer true
			:opposite dps_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docSettings"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_VisioDocument
			:type DatadiagramMLTextFormat_DocumentSettingsElt
			:location "59:3-59:91"
			:isContainer true
			:opposite dss_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docColors"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_VisioDocument
			:type DatadiagramMLTextFormat_ColorsTable
			:location "61:3-61:80"
			:isContainer true
			:opposite cs_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docPrintSetup"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_VisioDocument
			:type DatadiagramMLTextFormat_PrintSetup
			:location "63:3-63:83"
			:isContainer true
			:opposite ps_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docFonts"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_VisioDocument
			:type DatadiagramMLTextFormat_FontsTable
			:location "65:3-65:78"
			:isContainer true
			:opposite fs_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docFaceNames"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_VisioDocument
			:type DatadiagramMLTextFormat_FaceNamesTable
			:location "67:3-67:87"
			:isContainer true
			:opposite fns_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docStyleSheets"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_VisioDocument
			:type DatadiagramMLTextFormat_StyleSheetsCollection
			:location "69:3-69:96"
			:isContainer true
			:opposite sss_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docDocumentSheet"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_VisioDocument
			:type DatadiagramMLTextFormat_DocumentSheet
			:location "71:3-71:89"
			:isContainer true
			:opposite ds_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docMasters"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_VisioDocument
			:type DatadiagramMLTextFormat_MastersCollection
			:location "73:3-73:87"
			:isContainer true
			:opposite ms_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docPages"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_VisioDocument
			:type DatadiagramMLTextFormat_PagesCollection
			:location "75:3-75:83"
			:isContainer true
			:opposite ps_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docWindows"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_VisioDocument
			:type DatadiagramMLTextFormat_WindowsInfo
			:location "77:3-77:81"
			:isContainer true
			:opposite ws_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docEventList"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_VisioDocument
			:type DatadiagramMLTextFormat_EventList
			:location "79:3-79:81"
			:isContainer true
			:opposite el_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docHeaderFooter"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_VisioDocument
			:type DatadiagramMLTextFormat_HeaderFooter
			:location "81:3-81:87"
			:isContainer true
			:opposite ef_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docVBProjectData"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_VisioDocument
			:type DatadiagramMLTextFormat_VBProjectData
			:location "83:3-83:90"
			:isContainer true
			:opposite vpd_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docEmailRoutingData"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_VisioDocument
			:type DatadiagramMLTextFormat_EmailRoutingData
			:location "85:3-85:96"
			:isContainer true
			:opposite erd_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docSolutionXML"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_VisioDocument
			:type DatadiagramMLTextFormat_SolutionXML
			:location "87:3-87:91"
			:isContainer true
			:opposite sx_visioDocument
		)]
	) ) ( def DatadiagramMLTextFormat_DocumentPropertiesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_DocumentPropertiesCollection
			:type String
			:location "96:3-96:33"
		) ( struct-map
			KM3_Attribute
			:name "subject"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_DocumentPropertiesCollection
			:type String
			:location "98:3-98:35"
		) ( struct-map
			KM3_Attribute
			:name "creator"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_DocumentPropertiesCollection
			:type String
			:location "100:3-100:35"
		) ( struct-map
			KM3_Attribute
			:name "manager"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_DocumentPropertiesCollection
			:type String
			:location "102:3-102:35"
		) ( struct-map
			KM3_Attribute
			:name "company"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_DocumentPropertiesCollection
			:type String
			:location "104:3-104:35"
		) ( struct-map
			KM3_Attribute
			:name "category"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_DocumentPropertiesCollection
			:type String
			:location "106:3-106:36"
		) ( struct-map
			KM3_Attribute
			:name "keywords"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_DocumentPropertiesCollection
			:type String
			:location "108:3-108:36"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_DocumentPropertiesCollection
			:type String
			:location "111:3-111:39"
		) ( struct-map
			KM3_Attribute
			:name "hyperlinkBase_href"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_DocumentPropertiesCollection
			:type String
			:location "113:3-113:46"
		) ( struct-map
			KM3_Attribute
			:name "alternateNames"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_DocumentPropertiesCollection
			:type String
			:location "115:3-115:42"
		) ( struct-map
			KM3_Attribute
			:name "template"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_DocumentPropertiesCollection
			:type String
			:location "117:3-117:36"
		) ( struct-map
			KM3_Attribute
			:name "buildNumberCreated"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_DocumentPropertiesCollection
			:type String
			:location "119:3-119:46"
		) ( struct-map
			KM3_Attribute
			:name "buildNumberEdited"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_DocumentPropertiesCollection
			:type String
			:location "121:3-121:45"
		) ( struct-map
			KM3_Reference
			:name "dps_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_DocumentPropertiesCollection
			:type DatadiagramMLTextFormat_VisioDocument
			:location "92:3-92:67"
			:isContainer false
			:opposite docProps
		) ( struct-map
			KM3_Reference
			:name "customProps"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_DocumentPropertiesCollection
			:type DatadiagramMLTextFormat_CustomPropertiesCollection
			:location "126:3-126:92"
			:isContainer true
			:opposite cps_docProp
		) ( struct-map
			KM3_Reference
			:name "timeCreated"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_DocumentPropertiesCollection
			:type DatadiagramMLTextFormat_DateTimeType
			:location "128:3-128:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "timeSaved"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_DocumentPropertiesCollection
			:type DatadiagramMLTextFormat_DateTimeType
			:location "130:3-130:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "timeEdited"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_DocumentPropertiesCollection
			:type DatadiagramMLTextFormat_DateTimeType
			:location "132:3-132:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "timePrinted"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_DocumentPropertiesCollection
			:type DatadiagramMLTextFormat_DateTimeType
			:location "134:3-134:55"
			:isContainer true
		)]
	) ) ( def DatadiagramMLTextFormat_CustomPropertiesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cps_docProp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_CustomPropertiesCollection
			:type DatadiagramMLTextFormat_DocumentPropertiesCollection
			:location "139:3-139:79"
			:isContainer false
			:opposite customProps
		) ( struct-map
			KM3_Reference
			:name "cps_customProps"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_CustomPropertiesCollection
			:type DatadiagramMLTextFormat_CustomProperty
			:location "142:3-142:93"
			:isContainer true
			:opposite cp_customProps
		)]
	) ) ( def DatadiagramMLTextFormat_CustomProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_CustomProperty
			:type String
			:location "150:3-150:32"
		) ( struct-map
			KM3_Attribute
			:name "dataType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_CustomProperty
			:type String
			:location "152:3-152:36"
		) ( struct-map
			KM3_Reference
			:name "cp_customProps"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_CustomProperty
			:type DatadiagramMLTextFormat_CustomPropertiesCollection
			:location "147:3-147:85"
			:isContainer false
			:opposite cps_customProps
		)]
	) ) ( def DatadiagramMLTextFormat_ColorsTable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cs_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_ColorsTable
			:type DatadiagramMLTextFormat_VisioDocument
			:location "157:3-157:67"
			:isContainer false
			:opposite docColors
		) ( struct-map
			KM3_Reference
			:name "colorEntries"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_ColorsTable
			:type DatadiagramMLTextFormat_ColorEntry
			:location "160:3-160:81"
			:isContainer true
			:opposite ce_colors
		)]
	) ) ( def DatadiagramMLTextFormat_ColorEntry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_IXrequiredElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "rgb"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_ColorEntry
			:type String
			:location "168:3-168:26"
		) ( struct-map
			KM3_Reference
			:name "ce_colors"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_ColorEntry
			:type DatadiagramMLTextFormat_ColorsTable
			:location "165:3-165:61"
			:isContainer false
			:opposite colorEntries
		)]
	) ) ( def DatadiagramMLTextFormat_FontsTable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fs_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_FontsTable
			:type DatadiagramMLTextFormat_VisioDocument
			:location "174:3-174:66"
			:isContainer false
			:opposite docFonts
		) ( struct-map
			KM3_Reference
			:name "fontEntries"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_FontsTable
			:type DatadiagramMLTextFormat_FontEntry
			:location "177:3-177:78"
			:isContainer true
			:opposite fe_fonts
		)]
	) ) ( def DatadiagramMLTextFormat_FontEntry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_IdentifiedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_FontEntry
			:type String
			:location "185:3-185:27"
		) ( struct-map
			KM3_Attribute
			:name "charSet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_FontEntry
			:type String
			:location "186:3-186:30"
		) ( struct-map
			KM3_Attribute
			:name "pitchAndFamily"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_FontEntry
			:type String
			:location "187:3-187:37"
		) ( struct-map
			KM3_Attribute
			:name "attributes"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_FontEntry
			:type Integer
			:location "188:3-188:34"
		) ( struct-map
			KM3_Attribute
			:name "weight"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_FontEntry
			:type Integer
			:location "189:3-189:30"
		) ( struct-map
			KM3_Attribute
			:name "unicode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_FontEntry
			:type Boolean
			:location "190:3-190:31"
		) ( struct-map
			KM3_Reference
			:name "fe_fonts"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_FontEntry
			:type DatadiagramMLTextFormat_FontsTable
			:location "183:3-183:58"
			:isContainer false
			:opposite fontEntries
		)]
	) ) ( def DatadiagramMLTextFormat_FaceNamesTable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fns_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_FaceNamesTable
			:type DatadiagramMLTextFormat_VisioDocument
			:location "195:3-195:71"
			:isContainer false
			:opposite docFaceNames
		) ( struct-map
			KM3_Reference
			:name "faceNameEntries"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_FaceNamesTable
			:type DatadiagramMLTextFormat_FaceName
			:location "198:3-198:85"
			:isContainer true
			:opposite fn_faceNames
		)]
	) ) ( def DatadiagramMLTextFormat_FaceName ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_IdentifiedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_FaceName
			:type String
			:location "206:3-206:27"
		) ( struct-map
			KM3_Attribute
			:name "unicodeRanges"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_FaceName
			:type String
			:location "208:3-208:36"
		) ( struct-map
			KM3_Attribute
			:name "charSet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_FaceName
			:type String
			:location "210:3-210:30"
		) ( struct-map
			KM3_Attribute
			:name "panos"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_FaceName
			:type String
			:location "212:3-212:28"
		) ( struct-map
			KM3_Attribute
			:name "flags"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_FaceName
			:type Integer
			:location "214:3-214:29"
		) ( struct-map
			KM3_Reference
			:name "fn_faceNames"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_FaceName
			:type DatadiagramMLTextFormat_FaceNamesTable
			:location "203:3-203:70"
			:isContainer false
			:opposite faceNameEntries
		)]
	) ) ( def DatadiagramMLTextFormat_VBProjectData ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_VBProjectData
			:type String
			:location "222:3-222:27"
		) ( struct-map
			KM3_Reference
			:name "vpd_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_VBProjectData
			:type DatadiagramMLTextFormat_VisioDocument
			:location "219:3-219:75"
			:isContainer false
			:opposite docVBProjectData
		)]
	) ) ( def DatadiagramMLTextFormat_EmailRoutingData ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_EmailRoutingData
			:type String
			:location "230:3-230:27"
		) ( struct-map
			KM3_Attribute
			:name "size"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_EmailRoutingData
			:type Integer
			:location "232:3-232:33"
		) ( struct-map
			KM3_Reference
			:name "erd_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_EmailRoutingData
			:type DatadiagramMLTextFormat_VisioDocument
			:location "227:3-227:78"
			:isContainer false
			:opposite docEmailRoutingData
		)]
	) ) ( def DatadiagramMLTextFormat_StyleSheetsCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sss_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_StyleSheetsCollection
			:type DatadiagramMLTextFormat_VisioDocument
			:location "237:3-237:73"
			:isContainer false
			:opposite docStyleSheets
		) ( struct-map
			KM3_Reference
			:name "stylesSheets"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_StyleSheetsCollection
			:type DatadiagramMLTextFormat_StyleSheet
			:location "240:3-240:87"
			:isContainer true
			:opposite ss_stylesSheets
		)]
	) ) ( def DatadiagramMLTextFormat_StyleSheet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_Shape DatadiagramMLTextFormat_IdentifiedElt DatadiagramMLTextFormat_NamedElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ss_stylesSheets"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_StyleSheet
			:type DatadiagramMLTextFormat_StyleSheetsCollection
			:location "245:3-245:77"
			:isContainer false
			:opposite stylesSheets
		)]
	) ) ( def DatadiagramMLTextFormat_DocumentSheet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_PageSheet DatadiagramMLTextFormat_NamedElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ds_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_DocumentSheet
			:type DatadiagramMLTextFormat_VisioDocument
			:location "250:3-250:74"
			:isContainer false
			:opposite docDocumentSheet
		)]
	) ) ( def DatadiagramMLTextFormat_PageSheet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_Shape DatadiagramMLTextFormat_UniqueIdElt DatadiagramMLTextFormat_MasterElt DatadiagramMLTextFormat_PageElt]
		:structuralFeatures[]
	) ) ( def DatadiagramMLTextFormat_NamedElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_NamedElt
			:type String
			:location "259:3-259:32"
		) ( struct-map
			KM3_Attribute
			:name "nameU"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_NamedElt
			:type String
			:location "261:3-261:33"
		)]
	) ) ( def DatadiagramMLTextFormat_IdentifiedElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "ID"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_IdentifiedElt
			:type Integer
			:location "267:3-267:26"
		)]
	) ) ( def DatadiagramMLTextFormat_UniqueIdElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "UniqueID"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_UniqueIdElt
			:type String
			:location "273:3-273:36"
		)]
	) ) ( def DatadiagramMLTextFormat_Shape ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "lineStyle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Shape
			:type Integer
			:location "284:3-284:38"
		) ( struct-map
			KM3_Attribute
			:name "fillStyle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Shape
			:type Integer
			:location "286:3-286:38"
		) ( struct-map
			KM3_Attribute
			:name "textStyle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Shape
			:type Integer
			:location "288:3-288:38"
		) ( struct-map
			KM3_Reference
			:name "ss_shapes"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_Shape
			:type DatadiagramMLTextFormat_ShapesCollection
			:location "281:3-281:60"
			:isContainer false
			:opposite shapes
		) ( struct-map
			KM3_Reference
			:name "shapeElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_Shape
			:type DatadiagramMLTextFormat_ShapeElt
			:location "291:3-291:81"
			:isContainer true
			:opposite sse_shapeSheet
		)]
	) ) ( def DatadiagramMLTextFormat_ShapeElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sse_shapeSheet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_ShapeElt
			:type DatadiagramMLTextFormat_Shape
			:location "296:3-296:57"
			:isContainer false
			:opposite shapeElts
		)]
	) ) ( def DatadiagramMLTextFormat_IXElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "iX"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_IXElt
			:type Integer
			:location "302:3-302:31"
		)]
	) ) ( def DatadiagramMLTextFormat_DelElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "del"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_DelElt
			:type Boolean
			:location "308:3-308:32"
		)]
	) ) ( def DatadiagramMLTextFormat_Geom ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_ShapeElt DatadiagramMLTextFormat_IXElt DatadiagramMLTextFormat_DelElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "noFill"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Geom
			:type DatadiagramMLTextFormat_CellType
			:location "317:3-317:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "noLine"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Geom
			:type DatadiagramMLTextFormat_CellType
			:location "319:3-319:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "noShow"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Geom
			:type DatadiagramMLTextFormat_CellType
			:location "321:3-321:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "noSnap"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Geom
			:type DatadiagramMLTextFormat_CellType
			:location "323:3-323:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "linesTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_Geom
			:type DatadiagramMLTextFormat_LineTo
			:location "325:3-325:70"
			:isContainer true
			:opposite lt_geom
		) ( struct-map
			KM3_Reference
			:name "movesTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_Geom
			:type DatadiagramMLTextFormat_MoveTo
			:location "326:3-326:70"
			:isContainer true
			:opposite mt_geom
		) ( struct-map
			KM3_Reference
			:name "arcsTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_Geom
			:type DatadiagramMLTextFormat_ArcTo
			:location "327:3-327:68"
			:isContainer true
			:opposite ac_geom
		) ( struct-map
			KM3_Reference
			:name "splineKnots"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_Geom
			:type DatadiagramMLTextFormat_SplineKnot
			:location "328:3-328:78"
			:isContainer true
			:opposite sk_geom
		) ( struct-map
			KM3_Reference
			:name "polylinesTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_Geom
			:type DatadiagramMLTextFormat_PolylineTo
			:location "329:3-329:78"
			:isContainer true
			:opposite pt_geom
		) ( struct-map
			KM3_Reference
			:name "infiniteLines"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_Geom
			:type DatadiagramMLTextFormat_InfiniteLine
			:location "330:3-330:82"
			:isContainer true
			:opposite il_geom
		) ( struct-map
			KM3_Reference
			:name "ellipses"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_Geom
			:type DatadiagramMLTextFormat_Ellipse
			:location "331:3-331:71"
			:isContainer true
			:opposite e_geom
		) ( struct-map
			KM3_Reference
			:name "ellipticalArcsTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_Geom
			:type DatadiagramMLTextFormat_EllipticalArcTo
			:location "332:3-332:89"
			:isContainer true
			:opposite eat_geom
		) ( struct-map
			KM3_Reference
			:name "splineStarts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_Geom
			:type DatadiagramMLTextFormat_SplineStart
			:location "333:3-333:80"
			:isContainer true
			:opposite ss_geom
		) ( struct-map
			KM3_Reference
			:name "nurbsTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_Geom
			:type DatadiagramMLTextFormat_NURBSTo
			:location "334:3-334:71"
			:isContainer true
			:opposite nt_geom
		)]
	) ) ( def DatadiagramMLTextFormat_XYElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DatadiagramMLTextFormat_IXElt DatadiagramMLTextFormat_DelElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "x"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_XYElt
			:type DatadiagramMLTextFormat_CellType
			:location "339:3-339:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "y"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_XYElt
			:type DatadiagramMLTextFormat_CellType
			:location "340:3-340:41"
			:isContainer true
		)]
	) ) ( def DatadiagramMLTextFormat_LineTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_XYElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "lt_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_LineTo
			:type DatadiagramMLTextFormat_Geom
			:location "345:3-345:47"
			:isContainer false
			:opposite linesTo
		)]
	) ) ( def DatadiagramMLTextFormat_MoveTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_XYElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mt_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_MoveTo
			:type DatadiagramMLTextFormat_Geom
			:location "350:3-350:47"
			:isContainer false
			:opposite movesTo
		)]
	) ) ( def DatadiagramMLTextFormat_XYAElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DatadiagramMLTextFormat_XYElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "a"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_XYAElt
			:type DatadiagramMLTextFormat_CellType
			:location "355:3-355:41"
			:isContainer true
		)]
	) ) ( def DatadiagramMLTextFormat_ArcTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_XYAElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ac_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_ArcTo
			:type DatadiagramMLTextFormat_Geom
			:location "360:3-360:46"
			:isContainer false
			:opposite arcsTo
		)]
	) ) ( def DatadiagramMLTextFormat_SplineKnot ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_XYAElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sk_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_SplineKnot
			:type DatadiagramMLTextFormat_Geom
			:location "365:3-365:51"
			:isContainer false
			:opposite splineKnots
		)]
	) ) ( def DatadiagramMLTextFormat_PolylineTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_XYAElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pt_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_PolylineTo
			:type DatadiagramMLTextFormat_Geom
			:location "370:3-370:51"
			:isContainer false
			:opposite polylinesTo
		)]
	) ) ( def DatadiagramMLTextFormat_XYABElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DatadiagramMLTextFormat_XYAElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "b"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_XYABElt
			:type DatadiagramMLTextFormat_CellType
			:location "375:3-375:41"
			:isContainer true
		)]
	) ) ( def DatadiagramMLTextFormat_InfiniteLine ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_XYABElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "il_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_InfiniteLine
			:type DatadiagramMLTextFormat_Geom
			:location "380:3-380:53"
			:isContainer false
			:opposite infiniteLines
		)]
	) ) ( def DatadiagramMLTextFormat_XYABCDElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DatadiagramMLTextFormat_XYABElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "c"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_XYABCDElt
			:type DatadiagramMLTextFormat_CellType
			:location "385:3-385:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "d"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_XYABCDElt
			:type DatadiagramMLTextFormat_CellType
			:location "386:3-386:41"
			:isContainer true
		)]
	) ) ( def DatadiagramMLTextFormat_Ellipse ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_XYABCDElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "e_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_Ellipse
			:type DatadiagramMLTextFormat_Geom
			:location "391:3-391:47"
			:isContainer false
			:opposite ellipses
		)]
	) ) ( def DatadiagramMLTextFormat_EllipticalArcTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_XYABCDElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "eat_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_EllipticalArcTo
			:type DatadiagramMLTextFormat_Geom
			:location "396:3-396:57"
			:isContainer false
			:opposite ellipticalArcsTo
		)]
	) ) ( def DatadiagramMLTextFormat_SplineStart ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_XYABCDElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ss_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_SplineStart
			:type DatadiagramMLTextFormat_Geom
			:location "401:3-401:52"
			:isContainer false
			:opposite splineStarts
		)]
	) ) ( def DatadiagramMLTextFormat_XYABCDEElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DatadiagramMLTextFormat_XYABCDElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "e"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_XYABCDEElt
			:type DatadiagramMLTextFormat_CellType
			:location "406:3-406:41"
			:isContainer true
		)]
	) ) ( def DatadiagramMLTextFormat_NURBSTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_XYABCDEElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "nt_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_NURBSTo
			:type DatadiagramMLTextFormat_Geom
			:location "411:3-411:47"
			:isContainer false
			:opposite nurbsTo
		)]
	) ) ( def DatadiagramMLTextFormat_Text ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_ShapeElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "textElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_Text
			:type DatadiagramMLTextFormat_TextElt
			:location "421:3-421:72"
			:isContainer true
			:opposite te_text
		)]
	) ) ( def DatadiagramMLTextFormat_TextElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "te_text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_TextElt
			:type DatadiagramMLTextFormat_Text
			:location "426:3-426:48"
			:isContainer false
			:opposite textElts
		)]
	) ) ( def DatadiagramMLTextFormat_IXrequiredElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "iX"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_IXrequiredElt
			:type Integer
			:location "432:3-432:26"
		)]
	) ) ( def DatadiagramMLTextFormat_Cp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_IXrequiredElt DatadiagramMLTextFormat_TextElt]
		:structuralFeatures[]
	) ) ( def DatadiagramMLTextFormat_Pp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_IXrequiredElt DatadiagramMLTextFormat_TextElt]
		:structuralFeatures[]
	) ) ( def DatadiagramMLTextFormat_Tp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_IXrequiredElt DatadiagramMLTextFormat_TextElt]
		:structuralFeatures[]
	) ) ( def DatadiagramMLTextFormat_Fld ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_IXrequiredElt DatadiagramMLTextFormat_TextElt]
		:structuralFeatures[]
	) ) ( def DatadiagramMLTextFormat_StringElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_TextElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_StringElt
			:type String
			:location "449:3-449:28"
		)]
	) ) ( def DatadiagramMLTextFormat_Char ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_ShapeElt DatadiagramMLTextFormat_IXElt DatadiagramMLTextFormat_DelElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "font"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Char
			:type DatadiagramMLTextFormat_CellType
			:location "455:3-455:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "color"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Char
			:type DatadiagramMLTextFormat_CellType
			:location "457:3-457:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "style"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Char
			:type DatadiagramMLTextFormat_CellType
			:location "459:3-459:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "case"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Char
			:type DatadiagramMLTextFormat_CellType
			:location "461:3-461:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "pos"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Char
			:type DatadiagramMLTextFormat_CellType
			:location "463:3-463:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "fontScale"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Char
			:type DatadiagramMLTextFormat_CellType
			:location "465:3-465:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "size"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Char
			:type DatadiagramMLTextFormat_CellType
			:location "467:3-467:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "dblUnderline"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Char
			:type DatadiagramMLTextFormat_CellType
			:location "469:3-469:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "overline"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Char
			:type DatadiagramMLTextFormat_CellType
			:location "471:3-471:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "strikethru"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Char
			:type DatadiagramMLTextFormat_CellType
			:location "473:3-473:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "doubleStrikethrough"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Char
			:type DatadiagramMLTextFormat_CellType
			:location "475:3-475:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rtlText"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Char
			:type DatadiagramMLTextFormat_CellType
			:location "477:3-477:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "runVertical"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Char
			:type DatadiagramMLTextFormat_CellType
			:location "479:3-479:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "letterspace"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Char
			:type DatadiagramMLTextFormat_CellType
			:location "481:3-481:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "colorTrans"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Char
			:type DatadiagramMLTextFormat_CellType
			:location "483:3-483:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "localizeFont"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Char
			:type DatadiagramMLTextFormat_CellType
			:location "485:3-485:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "langID"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Char
			:type DatadiagramMLTextFormat_CellType
			:location "487:3-487:46"
			:isContainer true
		)]
	) ) ( def DatadiagramMLTextFormat_Para ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_ShapeElt DatadiagramMLTextFormat_IXElt DatadiagramMLTextFormat_DelElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "indFirst"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Para
			:type DatadiagramMLTextFormat_CellType
			:location "493:3-493:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "indLeft"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Para
			:type DatadiagramMLTextFormat_CellType
			:location "495:3-495:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "indRight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Para
			:type DatadiagramMLTextFormat_CellType
			:location "497:3-497:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "spLine"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Para
			:type DatadiagramMLTextFormat_CellType
			:location "499:3-499:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "spBefore"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Para
			:type DatadiagramMLTextFormat_CellType
			:location "501:3-501:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "spAfter"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Para
			:type DatadiagramMLTextFormat_CellType
			:location "503:3-503:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "horzAlign"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Para
			:type DatadiagramMLTextFormat_CellType
			:location "505:3-505:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "bullet"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Para
			:type DatadiagramMLTextFormat_CellType
			:location "507:3-507:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "bulletStr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Para
			:type DatadiagramMLTextFormat_CellType
			:location "509:3-509:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "bulletFont"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Para
			:type DatadiagramMLTextFormat_CellType
			:location "511:3-511:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "localizeBulletFont"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Para
			:type DatadiagramMLTextFormat_CellType
			:location "513:3-513:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "bulletFontSize"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Para
			:type DatadiagramMLTextFormat_CellType
			:location "515:3-515:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "textPosAfterBullet"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Para
			:type DatadiagramMLTextFormat_CellType
			:location "517:3-517:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "flags"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Para
			:type DatadiagramMLTextFormat_CellType
			:location "519:3-519:45"
			:isContainer true
		)]
	) ) ( def DatadiagramMLTextFormat_TabsCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_ShapeElt DatadiagramMLTextFormat_IXElt DatadiagramMLTextFormat_DelElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tabs"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_TabsCollection
			:type DatadiagramMLTextFormat_Tab
			:location "524:3-524:63"
			:isContainer true
			:opposite t_tabs
		)]
	) ) ( def DatadiagramMLTextFormat_Tab ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_IXElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "t_tabs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_Tab
			:type DatadiagramMLTextFormat_TabsCollection
			:location "529:3-529:53"
			:isContainer false
			:opposite tabs
		) ( struct-map
			KM3_Reference
			:name "position"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Tab
			:type DatadiagramMLTextFormat_CellType
			:location "531:3-531:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "alignment"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Tab
			:type DatadiagramMLTextFormat_CellType
			:location "533:3-533:49"
			:isContainer true
		)]
	) ) ( def DatadiagramMLTextFormat_Field ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_ShapeElt DatadiagramMLTextFormat_IXElt DatadiagramMLTextFormat_DelElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Field
			:type DatadiagramMLTextFormat_CellType
			:location "539:3-539:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "editMode"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Field
			:type DatadiagramMLTextFormat_CellType
			:location "541:3-541:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "format"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Field
			:type DatadiagramMLTextFormat_CellType
			:location "543:3-543:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Field
			:type DatadiagramMLTextFormat_CellType
			:location "545:3-545:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "uiCat"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Field
			:type DatadiagramMLTextFormat_CellType
			:location "547:3-547:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "uiCode"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Field
			:type DatadiagramMLTextFormat_CellType
			:location "549:3-549:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "uiFmt"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Field
			:type DatadiagramMLTextFormat_CellType
			:location "551:3-551:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "calendar"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Field
			:type DatadiagramMLTextFormat_CellType
			:location "553:3-553:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "objectKind"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Field
			:type DatadiagramMLTextFormat_CellType
			:location "555:3-555:50"
			:isContainer true
		)]
	) ) ( def DatadiagramMLTextFormat_MastersCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ms_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_MastersCollection
			:type DatadiagramMLTextFormat_VisioDocument
			:location "565:3-565:68"
			:isContainer false
			:opposite docMasters
		) ( struct-map
			KM3_Reference
			:name "masters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_MastersCollection
			:type DatadiagramMLTextFormat_Master
			:location "568:3-568:72"
			:isContainer true
			:opposite m_masters
		) ( struct-map
			KM3_Reference
			:name "masterShortCuts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_MastersCollection
			:type DatadiagramMLTextFormat_MasterShortCut
			:location "570:3-570:96"
			:isContainer true
			:opposite m_masterShortCuts
		)]
	) ) ( def DatadiagramMLTextFormat_MasterShortCut ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_IdentifiedElt DatadiagramMLTextFormat_NamedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "iconSize"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_MasterShortCut
			:type Integer
			:location "578:3-578:37"
		) ( struct-map
			KM3_Attribute
			:name "patternFlags"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_MasterShortCut
			:type Integer
			:location "580:3-580:42"
		) ( struct-map
			KM3_Attribute
			:name "prompt"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_MasterShortCut
			:type String
			:location "582:3-582:34"
		) ( struct-map
			KM3_Attribute
			:name "shortcutURL"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_MasterShortCut
			:type String
			:location "584:3-584:39"
		) ( struct-map
			KM3_Attribute
			:name "shortcutHelp"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_MasterShortCut
			:type String
			:location "586:3-586:41"
		) ( struct-map
			KM3_Attribute
			:name "alignName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_MasterShortCut
			:type Integer
			:location "588:3-588:38"
		) ( struct-map
			KM3_Reference
			:name "m_masterShortCuts"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_MasterShortCut
			:type DatadiagramMLTextFormat_MastersCollection
			:location "575:3-575:78"
			:isContainer false
			:opposite masterShortCuts
		) ( struct-map
			KM3_Reference
			:name "icons"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_MasterShortCut
			:type DatadiagramMLTextFormat_Icon
			:location "591:3-591:75"
			:isContainer true
			:opposite i_masterShortCut
		)]
	) ) ( def DatadiagramMLTextFormat_Icon ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_MasterElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_Icon
			:type String
			:location "599:3-599:28"
		) ( struct-map
			KM3_Reference
			:name "i_masterShortCut"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_Icon
			:type DatadiagramMLTextFormat_MasterShortCut
			:location "596:3-596:64"
			:isContainer false
			:opposite icons
		)]
	) ) ( def DatadiagramMLTextFormat_Master ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_IdentifiedElt DatadiagramMLTextFormat_UniqueIdElt DatadiagramMLTextFormat_NamedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "baseID"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Master
			:type String
			:location "607:3-607:34"
		) ( struct-map
			KM3_Attribute
			:name "matchByName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Master
			:type Boolean
			:location "609:3-609:40"
		) ( struct-map
			KM3_Attribute
			:name "iconSize"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Master
			:type Integer
			:location "611:3-611:37"
		) ( struct-map
			KM3_Attribute
			:name "patternFlags"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Master
			:type Integer
			:location "613:3-613:42"
		) ( struct-map
			KM3_Attribute
			:name "prompt"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Master
			:type String
			:location "615:3-615:34"
		) ( struct-map
			KM3_Attribute
			:name "hidden"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Master
			:type Boolean
			:location "617:3-617:35"
		) ( struct-map
			KM3_Attribute
			:name "iconUpdate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Master
			:type Boolean
			:location "619:3-619:40"
		) ( struct-map
			KM3_Attribute
			:name "alignName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Master
			:type Integer
			:location "621:3-621:38"
		) ( struct-map
			KM3_Reference
			:name "m_masters"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_Master
			:type DatadiagramMLTextFormat_MastersCollection
			:location "604:3-604:62"
			:isContainer false
			:opposite masters
		) ( struct-map
			KM3_Reference
			:name "masterElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_Master
			:type DatadiagramMLTextFormat_MasterElt
			:location "624:3-624:78"
			:isContainer true
			:opposite me_master
		)]
	) ) ( def DatadiagramMLTextFormat_ShapesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_MasterElt DatadiagramMLTextFormat_PageElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "shapes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_ShapesCollection
			:type DatadiagramMLTextFormat_Shape
			:location "630:3-630:70"
			:isContainer true
			:opposite ss_shapes
		)]
	) ) ( def DatadiagramMLTextFormat_ConnectsCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_MasterElt DatadiagramMLTextFormat_PageElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "connections"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_ConnectsCollection
			:type DatadiagramMLTextFormat_Connect
			:location "636:3-636:78"
			:isContainer true
			:opposite c_connects
		)]
	) ) ( def DatadiagramMLTextFormat_Connect ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "fromSheet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_Connect
			:type Integer
			:location "644:3-644:33"
		) ( struct-map
			KM3_Attribute
			:name "toSheet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_Connect
			:type Integer
			:location "646:3-646:31"
		) ( struct-map
			KM3_Attribute
			:name "fromCell"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Connect
			:type String
			:location "648:3-648:37"
		) ( struct-map
			KM3_Attribute
			:name "toCell"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Connect
			:type String
			:location "650:3-650:34"
		) ( struct-map
			KM3_Attribute
			:name "fromPart"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Connect
			:type Integer
			:location "652:3-652:37"
		) ( struct-map
			KM3_Attribute
			:name "toPart"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Connect
			:type Integer
			:location "654:3-654:35"
		) ( struct-map
			KM3_Reference
			:name "c_connects"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_Connect
			:type DatadiagramMLTextFormat_ConnectsCollection
			:location "641:3-641:68"
			:isContainer false
			:opposite connections
		)]
	) ) ( def DatadiagramMLTextFormat_MasterElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "me_master"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_MasterElt
			:type DatadiagramMLTextFormat_Master
			:location "659:3-659:54"
			:isContainer false
			:opposite masterElts
		)]
	) ) ( def DatadiagramMLTextFormat_PagesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ps_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_PagesCollection
			:type DatadiagramMLTextFormat_VisioDocument
			:location "664:3-664:66"
			:isContainer false
			:opposite docPages
		) ( struct-map
			KM3_Reference
			:name "pages"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_PagesCollection
			:type DatadiagramMLTextFormat_Page
			:location "667:3-667:66"
			:isContainer true
			:opposite p_pages
		)]
	) ) ( def DatadiagramMLTextFormat_Page ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLTextFormat_IdentifiedElt DatadiagramMLTextFormat_NamedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "background"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Page
			:type Boolean
			:location "675:3-675:40"
		) ( struct-map
			KM3_Attribute
			:name "backPage"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Page
			:type Integer
			:location "677:3-677:38"
		) ( struct-map
			KM3_Attribute
			:name "viewScale"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Page
			:type Double
			:location "679:3-679:38"
		) ( struct-map
			KM3_Attribute
			:name "viewCenterX"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Page
			:type Double
			:location "681:3-681:39"
		) ( struct-map
			KM3_Attribute
			:name "ViewCenterY"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Page
			:type Double
			:location "683:3-683:40"
		) ( struct-map
			KM3_Attribute
			:name "reviewerID"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Page
			:type Integer
			:location "685:3-685:39"
		) ( struct-map
			KM3_Attribute
			:name "associatedPage"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLTextFormat_Page
			:type Integer
			:location "687:3-687:43"
		) ( struct-map
			KM3_Reference
			:name "p_pages"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_Page
			:type DatadiagramMLTextFormat_PagesCollection
			:location "672:3-672:56"
			:isContainer false
			:opposite pages
		) ( struct-map
			KM3_Reference
			:name "pageElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLTextFormat_Page
			:type DatadiagramMLTextFormat_PageElt
			:location "690:3-690:72"
			:isContainer true
			:opposite pe_page
		)]
	) ) ( def DatadiagramMLTextFormat_PageElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pe_page"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_PageElt
			:type DatadiagramMLTextFormat_Page
			:location "695:3-695:48"
			:isContainer false
			:opposite pageElts
		)]
	) ) ( def DatadiagramMLTextFormat_DocumentSettingsElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dss_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_DocumentSettingsElt
			:type DatadiagramMLTextFormat_VisioDocument
			:location "705:3-705:70"
			:isContainer false
			:opposite docSettings
		)]
	) ) ( def DatadiagramMLTextFormat_PrintSetup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ps_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_PrintSetup
			:type DatadiagramMLTextFormat_VisioDocument
			:location "711:3-711:71"
			:isContainer false
			:opposite docPrintSetup
		)]
	) ) ( def DatadiagramMLTextFormat_WindowsInfo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ws_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_WindowsInfo
			:type DatadiagramMLTextFormat_VisioDocument
			:location "717:3-717:68"
			:isContainer false
			:opposite docWindows
		)]
	) ) ( def DatadiagramMLTextFormat_EventList ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "el_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_EventList
			:type DatadiagramMLTextFormat_VisioDocument
			:location "723:3-723:70"
			:isContainer false
			:opposite docEventList
		)]
	) ) ( def DatadiagramMLTextFormat_HeaderFooter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ef_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_HeaderFooter
			:type DatadiagramMLTextFormat_VisioDocument
			:location "729:3-729:73"
			:isContainer false
			:opposite docHeaderFooter
		)]
	) ) ( def DatadiagramMLTextFormat_SolutionXML ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sx_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLTextFormat_SolutionXML
			:type DatadiagramMLTextFormat_VisioDocument
			:location "735:3-735:72"
			:isContainer false
			:opposite docSolutionXML
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "746:2-746:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "747:2-747:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "748:2-748:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "749:2-749:18"
	) )]
) )
