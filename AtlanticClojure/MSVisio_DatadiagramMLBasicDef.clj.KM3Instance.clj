( declare DatadiagramMLBasicDef_DateTimeType )
( declare DatadiagramMLBasicDef_CellType )
( declare DatadiagramMLBasicDef_VisioDocument )
( declare DatadiagramMLBasicDef_DocumentPropertiesCollection )
( declare DatadiagramMLBasicDef_CustomPropertiesCollection )
( declare DatadiagramMLBasicDef_CustomProperty )
( declare DatadiagramMLBasicDef_VBProjectData )
( declare DatadiagramMLBasicDef_EmailRoutingData )
( declare DatadiagramMLBasicDef_StyleSheetsCollection )
( declare DatadiagramMLBasicDef_StyleSheet )
( declare DatadiagramMLBasicDef_DocumentSheet )
( declare DatadiagramMLBasicDef_PageSheet )
( declare DatadiagramMLBasicDef_NamedElt )
( declare DatadiagramMLBasicDef_IdentifiedElt )
( declare DatadiagramMLBasicDef_UniqueIdElt )
( declare DatadiagramMLBasicDef_Shape )
( declare DatadiagramMLBasicDef_ShapeElt )
( declare DatadiagramMLBasicDef_IXElt )
( declare DatadiagramMLBasicDef_DelElt )
( declare DatadiagramMLBasicDef_Geom )
( declare DatadiagramMLBasicDef_XYElt )
( declare DatadiagramMLBasicDef_LineTo )
( declare DatadiagramMLBasicDef_MoveTo )
( declare DatadiagramMLBasicDef_XYAElt )
( declare DatadiagramMLBasicDef_ArcTo )
( declare DatadiagramMLBasicDef_SplineKnot )
( declare DatadiagramMLBasicDef_PolylineTo )
( declare DatadiagramMLBasicDef_XYABElt )
( declare DatadiagramMLBasicDef_InfiniteLine )
( declare DatadiagramMLBasicDef_XYABCDElt )
( declare DatadiagramMLBasicDef_Ellipse )
( declare DatadiagramMLBasicDef_EllipticalArcTo )
( declare DatadiagramMLBasicDef_SplineStart )
( declare DatadiagramMLBasicDef_XYABCDEElt )
( declare DatadiagramMLBasicDef_NURBSTo )
( declare DatadiagramMLBasicDef_Text )
( declare DatadiagramMLBasicDef_TextElt )
( declare DatadiagramMLBasicDef_StringElt )
( declare DatadiagramMLBasicDef_MastersCollection )
( declare DatadiagramMLBasicDef_MasterShortCut )
( declare DatadiagramMLBasicDef_Icon )
( declare DatadiagramMLBasicDef_Master )
( declare DatadiagramMLBasicDef_ShapesCollection )
( declare DatadiagramMLBasicDef_ConnectsCollection )
( declare DatadiagramMLBasicDef_Connect )
( declare DatadiagramMLBasicDef_MasterElt )
( declare DatadiagramMLBasicDef_PagesCollection )
( declare DatadiagramMLBasicDef_Page )
( declare DatadiagramMLBasicDef_PageElt )
( declare DatadiagramMLBasicDef_DocumentSettingsElt )
( declare DatadiagramMLBasicDef_ColorsTable )
( declare DatadiagramMLBasicDef_PrintSetup )
( declare DatadiagramMLBasicDef_FontsTable )
( declare DatadiagramMLBasicDef_FaceNamesTable )
( declare DatadiagramMLBasicDef_WindowsInfo )
( declare DatadiagramMLBasicDef_EventList )
( declare DatadiagramMLBasicDef_HeaderFooter )
( declare DatadiagramMLBasicDef_SolutionXML )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def DatadiagramMLBasicDef ( struct-map
	KM3_Package
	:contents[( def DatadiagramMLBasicDef_DateTimeType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_DateTimeType
			:type Integer
			:location "16:3-16:28"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_DateTimeType
			:type Integer
			:location "17:3-17:29"
		) ( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_DateTimeType
			:type Integer
			:location "18:3-18:27"
		) ( struct-map
			KM3_Attribute
			:name "hour"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_DateTimeType
			:type Integer
			:location "19:3-19:28"
		) ( struct-map
			KM3_Attribute
			:name "minute"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_DateTimeType
			:type Integer
			:location "20:3-20:30"
		) ( struct-map
			KM3_Attribute
			:name "second"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_DateTimeType
			:type Integer
			:location "21:3-21:30"
		)]
	) ) ( def DatadiagramMLBasicDef_CellType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "unit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_CellType
			:type String
			:location "27:3-27:32"
		) ( struct-map
			KM3_Attribute
			:name "formula"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_CellType
			:type String
			:location "29:3-29:35"
		) ( struct-map
			KM3_Attribute
			:name "err"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_CellType
			:type String
			:location "31:3-31:31"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_CellType
			:type String
			:location "33:3-33:33"
		)]
	) ) ( def DatadiagramMLBasicDef_VisioDocument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "start"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_VisioDocument
			:type Integer
			:location "44:3-44:34"
		) ( struct-map
			KM3_Attribute
			:name "key"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_VisioDocument
			:type String
			:location "46:3-46:31"
		) ( struct-map
			KM3_Attribute
			:name "metric"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_VisioDocument
			:type Boolean
			:location "48:3-48:35"
		) ( struct-map
			KM3_Attribute
			:name "buildnum"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_VisioDocument
			:type Integer
			:location "50:3-50:37"
		) ( struct-map
			KM3_Attribute
			:name "version"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_VisioDocument
			:type String
			:location "52:3-52:35"
		) ( struct-map
			KM3_Attribute
			:name "docLangId"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_VisioDocument
			:type Integer
			:location "54:3-54:38"
		) ( struct-map
			KM3_Reference
			:name "docProps"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_VisioDocument
			:type DatadiagramMLBasicDef_DocumentPropertiesCollection
			:location "57:3-57:97"
			:isContainer true
			:opposite dps_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docSettings"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_VisioDocument
			:type DatadiagramMLBasicDef_DocumentSettingsElt
			:location "59:3-59:91"
			:isContainer true
			:opposite dss_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docColors"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_VisioDocument
			:type DatadiagramMLBasicDef_ColorsTable
			:location "61:3-61:80"
			:isContainer true
			:opposite cs_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docPrintSetup"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_VisioDocument
			:type DatadiagramMLBasicDef_PrintSetup
			:location "63:3-63:83"
			:isContainer true
			:opposite ps_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docFonts"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_VisioDocument
			:type DatadiagramMLBasicDef_FontsTable
			:location "65:3-65:78"
			:isContainer true
			:opposite fs_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docFaceNames"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_VisioDocument
			:type DatadiagramMLBasicDef_FaceNamesTable
			:location "67:3-67:87"
			:isContainer true
			:opposite fns_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docStyleSheets"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_VisioDocument
			:type DatadiagramMLBasicDef_StyleSheetsCollection
			:location "69:3-69:96"
			:isContainer true
			:opposite sss_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docDocumentSheet"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_VisioDocument
			:type DatadiagramMLBasicDef_DocumentSheet
			:location "71:3-71:89"
			:isContainer true
			:opposite ds_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docMasters"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_VisioDocument
			:type DatadiagramMLBasicDef_MastersCollection
			:location "73:3-73:87"
			:isContainer true
			:opposite ms_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docPages"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_VisioDocument
			:type DatadiagramMLBasicDef_PagesCollection
			:location "75:3-75:83"
			:isContainer true
			:opposite ps_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docWindows"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_VisioDocument
			:type DatadiagramMLBasicDef_WindowsInfo
			:location "77:3-77:81"
			:isContainer true
			:opposite ws_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docEventList"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_VisioDocument
			:type DatadiagramMLBasicDef_EventList
			:location "79:3-79:81"
			:isContainer true
			:opposite el_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docHeaderFooter"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_VisioDocument
			:type DatadiagramMLBasicDef_HeaderFooter
			:location "81:3-81:87"
			:isContainer true
			:opposite ef_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docVBProjectData"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_VisioDocument
			:type DatadiagramMLBasicDef_VBProjectData
			:location "83:3-83:90"
			:isContainer true
			:opposite vpd_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docEmailRoutingData"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_VisioDocument
			:type DatadiagramMLBasicDef_EmailRoutingData
			:location "85:3-85:96"
			:isContainer true
			:opposite erd_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docSolutionXML"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_VisioDocument
			:type DatadiagramMLBasicDef_SolutionXML
			:location "87:3-87:91"
			:isContainer true
			:opposite sx_visioDocument
		)]
	) ) ( def DatadiagramMLBasicDef_DocumentPropertiesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "96:3-96:33"
		) ( struct-map
			KM3_Attribute
			:name "subject"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "98:3-98:35"
		) ( struct-map
			KM3_Attribute
			:name "creator"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "100:3-100:35"
		) ( struct-map
			KM3_Attribute
			:name "manager"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "102:3-102:35"
		) ( struct-map
			KM3_Attribute
			:name "company"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "104:3-104:35"
		) ( struct-map
			KM3_Attribute
			:name "category"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "106:3-106:36"
		) ( struct-map
			KM3_Attribute
			:name "keywords"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "108:3-108:36"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "111:3-111:39"
		) ( struct-map
			KM3_Attribute
			:name "hyperlinkBase_href"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "113:3-113:46"
		) ( struct-map
			KM3_Attribute
			:name "alternateNames"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "115:3-115:42"
		) ( struct-map
			KM3_Attribute
			:name "template"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "117:3-117:36"
		) ( struct-map
			KM3_Attribute
			:name "buildNumberCreated"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "119:3-119:46"
		) ( struct-map
			KM3_Attribute
			:name "buildNumberEdited"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_DocumentPropertiesCollection
			:type String
			:location "121:3-121:45"
		) ( struct-map
			KM3_Reference
			:name "dps_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_DocumentPropertiesCollection
			:type DatadiagramMLBasicDef_VisioDocument
			:location "92:3-92:67"
			:isContainer false
			:opposite docProps
		) ( struct-map
			KM3_Reference
			:name "customProps"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_DocumentPropertiesCollection
			:type DatadiagramMLBasicDef_CustomPropertiesCollection
			:location "126:3-126:92"
			:isContainer true
			:opposite cps_docProp
		) ( struct-map
			KM3_Reference
			:name "timeCreated"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_DocumentPropertiesCollection
			:type DatadiagramMLBasicDef_DateTimeType
			:location "128:3-128:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "timeSaved"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_DocumentPropertiesCollection
			:type DatadiagramMLBasicDef_DateTimeType
			:location "130:3-130:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "timeEdited"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_DocumentPropertiesCollection
			:type DatadiagramMLBasicDef_DateTimeType
			:location "132:3-132:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "timePrinted"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_DocumentPropertiesCollection
			:type DatadiagramMLBasicDef_DateTimeType
			:location "134:3-134:55"
			:isContainer true
		)]
	) ) ( def DatadiagramMLBasicDef_CustomPropertiesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cps_docProp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_CustomPropertiesCollection
			:type DatadiagramMLBasicDef_DocumentPropertiesCollection
			:location "139:3-139:79"
			:isContainer false
			:opposite customProps
		) ( struct-map
			KM3_Reference
			:name "cps_customProps"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_CustomPropertiesCollection
			:type DatadiagramMLBasicDef_CustomProperty
			:location "142:3-142:93"
			:isContainer true
			:opposite cp_customProps
		)]
	) ) ( def DatadiagramMLBasicDef_CustomProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_CustomProperty
			:type String
			:location "150:3-150:32"
		) ( struct-map
			KM3_Attribute
			:name "dataType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_CustomProperty
			:type String
			:location "152:3-152:36"
		) ( struct-map
			KM3_Reference
			:name "cp_customProps"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_CustomProperty
			:type DatadiagramMLBasicDef_CustomPropertiesCollection
			:location "147:3-147:85"
			:isContainer false
			:opposite cps_customProps
		)]
	) ) ( def DatadiagramMLBasicDef_VBProjectData ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_VBProjectData
			:type String
			:location "160:3-160:27"
		) ( struct-map
			KM3_Reference
			:name "vpd_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_VBProjectData
			:type DatadiagramMLBasicDef_VisioDocument
			:location "157:3-157:75"
			:isContainer false
			:opposite docVBProjectData
		)]
	) ) ( def DatadiagramMLBasicDef_EmailRoutingData ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_EmailRoutingData
			:type String
			:location "168:3-168:27"
		) ( struct-map
			KM3_Attribute
			:name "size"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_EmailRoutingData
			:type Integer
			:location "170:3-170:33"
		) ( struct-map
			KM3_Reference
			:name "erd_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_EmailRoutingData
			:type DatadiagramMLBasicDef_VisioDocument
			:location "165:3-165:78"
			:isContainer false
			:opposite docEmailRoutingData
		)]
	) ) ( def DatadiagramMLBasicDef_StyleSheetsCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sss_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_StyleSheetsCollection
			:type DatadiagramMLBasicDef_VisioDocument
			:location "175:3-175:73"
			:isContainer false
			:opposite docStyleSheets
		) ( struct-map
			KM3_Reference
			:name "stylesSheets"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_StyleSheetsCollection
			:type DatadiagramMLBasicDef_StyleSheet
			:location "178:3-178:87"
			:isContainer true
			:opposite ss_stylesSheets
		)]
	) ) ( def DatadiagramMLBasicDef_StyleSheet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_Shape DatadiagramMLBasicDef_IdentifiedElt DatadiagramMLBasicDef_NamedElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ss_stylesSheets"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_StyleSheet
			:type DatadiagramMLBasicDef_StyleSheetsCollection
			:location "183:3-183:77"
			:isContainer false
			:opposite stylesSheets
		)]
	) ) ( def DatadiagramMLBasicDef_DocumentSheet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_PageSheet DatadiagramMLBasicDef_NamedElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ds_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_DocumentSheet
			:type DatadiagramMLBasicDef_VisioDocument
			:location "188:3-188:74"
			:isContainer false
			:opposite docDocumentSheet
		)]
	) ) ( def DatadiagramMLBasicDef_PageSheet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_Shape DatadiagramMLBasicDef_UniqueIdElt DatadiagramMLBasicDef_MasterElt DatadiagramMLBasicDef_PageElt]
		:structuralFeatures[]
	) ) ( def DatadiagramMLBasicDef_NamedElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_NamedElt
			:type String
			:location "197:3-197:32"
		) ( struct-map
			KM3_Attribute
			:name "nameU"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_NamedElt
			:type String
			:location "199:3-199:33"
		)]
	) ) ( def DatadiagramMLBasicDef_IdentifiedElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "ID"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_IdentifiedElt
			:type Integer
			:location "205:3-205:26"
		)]
	) ) ( def DatadiagramMLBasicDef_UniqueIdElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "UniqueID"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_UniqueIdElt
			:type String
			:location "211:3-211:36"
		)]
	) ) ( def DatadiagramMLBasicDef_Shape ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "lineStyle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Shape
			:type Integer
			:location "222:3-222:38"
		) ( struct-map
			KM3_Attribute
			:name "fillStyle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Shape
			:type Integer
			:location "224:3-224:38"
		) ( struct-map
			KM3_Attribute
			:name "textStyle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Shape
			:type Integer
			:location "226:3-226:38"
		) ( struct-map
			KM3_Reference
			:name "ss_shapes"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_Shape
			:type DatadiagramMLBasicDef_ShapesCollection
			:location "219:3-219:60"
			:isContainer false
			:opposite shapes
		) ( struct-map
			KM3_Reference
			:name "shapeElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_Shape
			:type DatadiagramMLBasicDef_ShapeElt
			:location "229:3-229:81"
			:isContainer true
			:opposite sse_shapeSheet
		)]
	) ) ( def DatadiagramMLBasicDef_ShapeElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sse_shapeSheet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_ShapeElt
			:type DatadiagramMLBasicDef_Shape
			:location "234:3-234:57"
			:isContainer false
			:opposite shapeElts
		)]
	) ) ( def DatadiagramMLBasicDef_IXElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "iX"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_IXElt
			:type Integer
			:location "240:3-240:31"
		)]
	) ) ( def DatadiagramMLBasicDef_DelElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "del"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_DelElt
			:type Boolean
			:location "246:3-246:32"
		)]
	) ) ( def DatadiagramMLBasicDef_Geom ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_ShapeElt DatadiagramMLBasicDef_IXElt DatadiagramMLBasicDef_DelElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "noFill"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Geom
			:type DatadiagramMLBasicDef_CellType
			:location "255:3-255:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "noLine"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Geom
			:type DatadiagramMLBasicDef_CellType
			:location "257:3-257:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "noShow"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Geom
			:type DatadiagramMLBasicDef_CellType
			:location "259:3-259:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "noSnap"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Geom
			:type DatadiagramMLBasicDef_CellType
			:location "261:3-261:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "linesTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_Geom
			:type DatadiagramMLBasicDef_LineTo
			:location "263:3-263:70"
			:isContainer true
			:opposite lt_geom
		) ( struct-map
			KM3_Reference
			:name "movesTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_Geom
			:type DatadiagramMLBasicDef_MoveTo
			:location "264:3-264:70"
			:isContainer true
			:opposite mt_geom
		) ( struct-map
			KM3_Reference
			:name "arcsTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_Geom
			:type DatadiagramMLBasicDef_ArcTo
			:location "265:3-265:68"
			:isContainer true
			:opposite ac_geom
		) ( struct-map
			KM3_Reference
			:name "splineKnots"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_Geom
			:type DatadiagramMLBasicDef_SplineKnot
			:location "266:3-266:78"
			:isContainer true
			:opposite sk_geom
		) ( struct-map
			KM3_Reference
			:name "polylinesTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_Geom
			:type DatadiagramMLBasicDef_PolylineTo
			:location "267:3-267:78"
			:isContainer true
			:opposite pt_geom
		) ( struct-map
			KM3_Reference
			:name "infiniteLines"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_Geom
			:type DatadiagramMLBasicDef_InfiniteLine
			:location "268:3-268:82"
			:isContainer true
			:opposite il_geom
		) ( struct-map
			KM3_Reference
			:name "ellipses"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_Geom
			:type DatadiagramMLBasicDef_Ellipse
			:location "269:3-269:71"
			:isContainer true
			:opposite e_geom
		) ( struct-map
			KM3_Reference
			:name "ellipticalArcsTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_Geom
			:type DatadiagramMLBasicDef_EllipticalArcTo
			:location "270:3-270:89"
			:isContainer true
			:opposite eat_geom
		) ( struct-map
			KM3_Reference
			:name "splineStarts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_Geom
			:type DatadiagramMLBasicDef_SplineStart
			:location "271:3-271:80"
			:isContainer true
			:opposite ss_geom
		) ( struct-map
			KM3_Reference
			:name "nurbsTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_Geom
			:type DatadiagramMLBasicDef_NURBSTo
			:location "272:3-272:71"
			:isContainer true
			:opposite nt_geom
		)]
	) ) ( def DatadiagramMLBasicDef_XYElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DatadiagramMLBasicDef_IXElt DatadiagramMLBasicDef_DelElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "x"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_XYElt
			:type DatadiagramMLBasicDef_CellType
			:location "277:3-277:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "y"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_XYElt
			:type DatadiagramMLBasicDef_CellType
			:location "278:3-278:41"
			:isContainer true
		)]
	) ) ( def DatadiagramMLBasicDef_LineTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_XYElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "lt_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_LineTo
			:type DatadiagramMLBasicDef_Geom
			:location "283:3-283:47"
			:isContainer false
			:opposite linesTo
		)]
	) ) ( def DatadiagramMLBasicDef_MoveTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_XYElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mt_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_MoveTo
			:type DatadiagramMLBasicDef_Geom
			:location "288:3-288:47"
			:isContainer false
			:opposite movesTo
		)]
	) ) ( def DatadiagramMLBasicDef_XYAElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DatadiagramMLBasicDef_XYElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "a"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_XYAElt
			:type DatadiagramMLBasicDef_CellType
			:location "293:3-293:41"
			:isContainer true
		)]
	) ) ( def DatadiagramMLBasicDef_ArcTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_XYAElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ac_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_ArcTo
			:type DatadiagramMLBasicDef_Geom
			:location "298:3-298:46"
			:isContainer false
			:opposite arcsTo
		)]
	) ) ( def DatadiagramMLBasicDef_SplineKnot ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_XYAElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sk_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_SplineKnot
			:type DatadiagramMLBasicDef_Geom
			:location "303:3-303:51"
			:isContainer false
			:opposite splineKnots
		)]
	) ) ( def DatadiagramMLBasicDef_PolylineTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_XYAElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pt_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_PolylineTo
			:type DatadiagramMLBasicDef_Geom
			:location "308:3-308:51"
			:isContainer false
			:opposite polylinesTo
		)]
	) ) ( def DatadiagramMLBasicDef_XYABElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DatadiagramMLBasicDef_XYAElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "b"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_XYABElt
			:type DatadiagramMLBasicDef_CellType
			:location "313:3-313:41"
			:isContainer true
		)]
	) ) ( def DatadiagramMLBasicDef_InfiniteLine ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_XYABElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "il_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_InfiniteLine
			:type DatadiagramMLBasicDef_Geom
			:location "318:3-318:53"
			:isContainer false
			:opposite infiniteLines
		)]
	) ) ( def DatadiagramMLBasicDef_XYABCDElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DatadiagramMLBasicDef_XYABElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "c"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_XYABCDElt
			:type DatadiagramMLBasicDef_CellType
			:location "323:3-323:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "d"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_XYABCDElt
			:type DatadiagramMLBasicDef_CellType
			:location "324:3-324:41"
			:isContainer true
		)]
	) ) ( def DatadiagramMLBasicDef_Ellipse ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_XYABCDElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "e_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_Ellipse
			:type DatadiagramMLBasicDef_Geom
			:location "329:3-329:47"
			:isContainer false
			:opposite ellipses
		)]
	) ) ( def DatadiagramMLBasicDef_EllipticalArcTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_XYABCDElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "eat_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_EllipticalArcTo
			:type DatadiagramMLBasicDef_Geom
			:location "334:3-334:57"
			:isContainer false
			:opposite ellipticalArcsTo
		)]
	) ) ( def DatadiagramMLBasicDef_SplineStart ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_XYABCDElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ss_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_SplineStart
			:type DatadiagramMLBasicDef_Geom
			:location "339:3-339:52"
			:isContainer false
			:opposite splineStarts
		)]
	) ) ( def DatadiagramMLBasicDef_XYABCDEElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DatadiagramMLBasicDef_XYABCDElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "e"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_XYABCDEElt
			:type DatadiagramMLBasicDef_CellType
			:location "344:3-344:41"
			:isContainer true
		)]
	) ) ( def DatadiagramMLBasicDef_NURBSTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_XYABCDEElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "nt_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_NURBSTo
			:type DatadiagramMLBasicDef_Geom
			:location "349:3-349:47"
			:isContainer false
			:opposite nurbsTo
		)]
	) ) ( def DatadiagramMLBasicDef_Text ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_ShapeElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "textElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_Text
			:type DatadiagramMLBasicDef_TextElt
			:location "359:3-359:72"
			:isContainer true
			:opposite te_text
		)]
	) ) ( def DatadiagramMLBasicDef_TextElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "te_text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_TextElt
			:type DatadiagramMLBasicDef_Text
			:location "364:3-364:48"
			:isContainer false
			:opposite textElts
		)]
	) ) ( def DatadiagramMLBasicDef_StringElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_TextElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_StringElt
			:type String
			:location "369:3-369:28"
		)]
	) ) ( def DatadiagramMLBasicDef_MastersCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ms_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_MastersCollection
			:type DatadiagramMLBasicDef_VisioDocument
			:location "377:3-377:68"
			:isContainer false
			:opposite docMasters
		) ( struct-map
			KM3_Reference
			:name "masters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_MastersCollection
			:type DatadiagramMLBasicDef_Master
			:location "380:3-380:72"
			:isContainer true
			:opposite m_masters
		) ( struct-map
			KM3_Reference
			:name "masterShortCuts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_MastersCollection
			:type DatadiagramMLBasicDef_MasterShortCut
			:location "382:3-382:96"
			:isContainer true
			:opposite m_masterShortCuts
		)]
	) ) ( def DatadiagramMLBasicDef_MasterShortCut ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_IdentifiedElt DatadiagramMLBasicDef_NamedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "iconSize"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_MasterShortCut
			:type Integer
			:location "390:3-390:37"
		) ( struct-map
			KM3_Attribute
			:name "patternFlags"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_MasterShortCut
			:type Integer
			:location "392:3-392:42"
		) ( struct-map
			KM3_Attribute
			:name "prompt"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_MasterShortCut
			:type String
			:location "394:3-394:34"
		) ( struct-map
			KM3_Attribute
			:name "shortcutURL"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_MasterShortCut
			:type String
			:location "396:3-396:39"
		) ( struct-map
			KM3_Attribute
			:name "shortcutHelp"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_MasterShortCut
			:type String
			:location "398:3-398:41"
		) ( struct-map
			KM3_Attribute
			:name "alignName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_MasterShortCut
			:type Integer
			:location "400:3-400:38"
		) ( struct-map
			KM3_Reference
			:name "m_masterShortCuts"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_MasterShortCut
			:type DatadiagramMLBasicDef_MastersCollection
			:location "387:3-387:78"
			:isContainer false
			:opposite masterShortCuts
		) ( struct-map
			KM3_Reference
			:name "icons"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_MasterShortCut
			:type DatadiagramMLBasicDef_Icon
			:location "403:3-403:75"
			:isContainer true
			:opposite i_masterShortCut
		)]
	) ) ( def DatadiagramMLBasicDef_Icon ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_MasterElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_Icon
			:type String
			:location "411:3-411:28"
		) ( struct-map
			KM3_Reference
			:name "i_masterShortCut"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_Icon
			:type DatadiagramMLBasicDef_MasterShortCut
			:location "408:3-408:64"
			:isContainer false
			:opposite icons
		)]
	) ) ( def DatadiagramMLBasicDef_Master ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_IdentifiedElt DatadiagramMLBasicDef_UniqueIdElt DatadiagramMLBasicDef_NamedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "baseID"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Master
			:type String
			:location "419:3-419:34"
		) ( struct-map
			KM3_Attribute
			:name "matchByName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Master
			:type Boolean
			:location "421:3-421:40"
		) ( struct-map
			KM3_Attribute
			:name "iconSize"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Master
			:type Integer
			:location "423:3-423:37"
		) ( struct-map
			KM3_Attribute
			:name "patternFlags"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Master
			:type Integer
			:location "425:3-425:42"
		) ( struct-map
			KM3_Attribute
			:name "prompt"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Master
			:type String
			:location "427:3-427:34"
		) ( struct-map
			KM3_Attribute
			:name "hidden"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Master
			:type Boolean
			:location "429:3-429:35"
		) ( struct-map
			KM3_Attribute
			:name "iconUpdate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Master
			:type Boolean
			:location "431:3-431:40"
		) ( struct-map
			KM3_Attribute
			:name "alignName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Master
			:type Integer
			:location "433:3-433:38"
		) ( struct-map
			KM3_Reference
			:name "m_masters"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_Master
			:type DatadiagramMLBasicDef_MastersCollection
			:location "416:3-416:62"
			:isContainer false
			:opposite masters
		) ( struct-map
			KM3_Reference
			:name "masterElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_Master
			:type DatadiagramMLBasicDef_MasterElt
			:location "436:3-436:78"
			:isContainer true
			:opposite me_master
		)]
	) ) ( def DatadiagramMLBasicDef_ShapesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_MasterElt DatadiagramMLBasicDef_PageElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "shapes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_ShapesCollection
			:type DatadiagramMLBasicDef_Shape
			:location "442:3-442:70"
			:isContainer true
			:opposite ss_shapes
		)]
	) ) ( def DatadiagramMLBasicDef_ConnectsCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_MasterElt DatadiagramMLBasicDef_PageElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "connections"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_ConnectsCollection
			:type DatadiagramMLBasicDef_Connect
			:location "448:3-448:78"
			:isContainer true
			:opposite c_connects
		)]
	) ) ( def DatadiagramMLBasicDef_Connect ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "fromSheet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_Connect
			:type Integer
			:location "456:3-456:33"
		) ( struct-map
			KM3_Attribute
			:name "toSheet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_Connect
			:type Integer
			:location "458:3-458:31"
		) ( struct-map
			KM3_Attribute
			:name "fromCell"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Connect
			:type String
			:location "460:3-460:37"
		) ( struct-map
			KM3_Attribute
			:name "toCell"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Connect
			:type String
			:location "462:3-462:34"
		) ( struct-map
			KM3_Attribute
			:name "fromPart"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Connect
			:type Integer
			:location "464:3-464:37"
		) ( struct-map
			KM3_Attribute
			:name "toPart"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Connect
			:type Integer
			:location "466:3-466:35"
		) ( struct-map
			KM3_Reference
			:name "c_connects"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_Connect
			:type DatadiagramMLBasicDef_ConnectsCollection
			:location "453:3-453:68"
			:isContainer false
			:opposite connections
		)]
	) ) ( def DatadiagramMLBasicDef_MasterElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "me_master"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_MasterElt
			:type DatadiagramMLBasicDef_Master
			:location "471:3-471:54"
			:isContainer false
			:opposite masterElts
		)]
	) ) ( def DatadiagramMLBasicDef_PagesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ps_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_PagesCollection
			:type DatadiagramMLBasicDef_VisioDocument
			:location "476:3-476:66"
			:isContainer false
			:opposite docPages
		) ( struct-map
			KM3_Reference
			:name "pages"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_PagesCollection
			:type DatadiagramMLBasicDef_Page
			:location "479:3-479:66"
			:isContainer true
			:opposite p_pages
		)]
	) ) ( def DatadiagramMLBasicDef_Page ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLBasicDef_IdentifiedElt DatadiagramMLBasicDef_NamedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "background"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Page
			:type Boolean
			:location "487:3-487:40"
		) ( struct-map
			KM3_Attribute
			:name "backPage"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Page
			:type Integer
			:location "489:3-489:38"
		) ( struct-map
			KM3_Attribute
			:name "viewScale"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Page
			:type Double
			:location "491:3-491:38"
		) ( struct-map
			KM3_Attribute
			:name "viewCenterX"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Page
			:type Double
			:location "493:3-493:39"
		) ( struct-map
			KM3_Attribute
			:name "ViewCenterY"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Page
			:type Double
			:location "495:3-495:40"
		) ( struct-map
			KM3_Attribute
			:name "reviewerID"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Page
			:type Integer
			:location "497:3-497:39"
		) ( struct-map
			KM3_Attribute
			:name "associatedPage"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLBasicDef_Page
			:type Integer
			:location "499:3-499:43"
		) ( struct-map
			KM3_Reference
			:name "p_pages"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_Page
			:type DatadiagramMLBasicDef_PagesCollection
			:location "484:3-484:56"
			:isContainer false
			:opposite pages
		) ( struct-map
			KM3_Reference
			:name "pageElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLBasicDef_Page
			:type DatadiagramMLBasicDef_PageElt
			:location "502:3-502:72"
			:isContainer true
			:opposite pe_page
		)]
	) ) ( def DatadiagramMLBasicDef_PageElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pe_page"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_PageElt
			:type DatadiagramMLBasicDef_Page
			:location "507:3-507:48"
			:isContainer false
			:opposite pageElts
		)]
	) ) ( def DatadiagramMLBasicDef_DocumentSettingsElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dss_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_DocumentSettingsElt
			:type DatadiagramMLBasicDef_VisioDocument
			:location "517:3-517:70"
			:isContainer false
			:opposite docSettings
		)]
	) ) ( def DatadiagramMLBasicDef_ColorsTable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cs_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_ColorsTable
			:type DatadiagramMLBasicDef_VisioDocument
			:location "523:3-523:67"
			:isContainer false
			:opposite docColors
		)]
	) ) ( def DatadiagramMLBasicDef_PrintSetup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ps_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_PrintSetup
			:type DatadiagramMLBasicDef_VisioDocument
			:location "529:3-529:71"
			:isContainer false
			:opposite docPrintSetup
		)]
	) ) ( def DatadiagramMLBasicDef_FontsTable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fs_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_FontsTable
			:type DatadiagramMLBasicDef_VisioDocument
			:location "535:3-535:66"
			:isContainer false
			:opposite docFonts
		)]
	) ) ( def DatadiagramMLBasicDef_FaceNamesTable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fns_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_FaceNamesTable
			:type DatadiagramMLBasicDef_VisioDocument
			:location "541:3-541:71"
			:isContainer false
			:opposite docFaceNames
		)]
	) ) ( def DatadiagramMLBasicDef_WindowsInfo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ws_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_WindowsInfo
			:type DatadiagramMLBasicDef_VisioDocument
			:location "547:3-547:68"
			:isContainer false
			:opposite docWindows
		)]
	) ) ( def DatadiagramMLBasicDef_EventList ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "el_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_EventList
			:type DatadiagramMLBasicDef_VisioDocument
			:location "553:3-553:70"
			:isContainer false
			:opposite docEventList
		)]
	) ) ( def DatadiagramMLBasicDef_HeaderFooter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ef_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_HeaderFooter
			:type DatadiagramMLBasicDef_VisioDocument
			:location "559:3-559:73"
			:isContainer false
			:opposite docHeaderFooter
		)]
	) ) ( def DatadiagramMLBasicDef_SolutionXML ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sx_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLBasicDef_SolutionXML
			:type DatadiagramMLBasicDef_VisioDocument
			:location "565:3-565:72"
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
		:location "576:2-576:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "577:2-577:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "578:2-578:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "579:2-579:18"
	) )]
) )
