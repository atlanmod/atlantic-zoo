( declare DatadiagramMLXForm_DateTimeType )
( declare DatadiagramMLXForm_CellType )
( declare DatadiagramMLXForm_VisioDocument )
( declare DatadiagramMLXForm_DocumentPropertiesCollection )
( declare DatadiagramMLXForm_CustomPropertiesCollection )
( declare DatadiagramMLXForm_CustomProperty )
( declare DatadiagramMLXForm_DocumentSettingsElt )
( declare DatadiagramMLXForm_SnapAnglesCollection )
( declare DatadiagramMLXForm_SnapAngle )
( declare DatadiagramMLXForm_ColorsTable )
( declare DatadiagramMLXForm_ColorEntry )
( declare DatadiagramMLXForm_PrintSetup )
( declare DatadiagramMLXForm_FontsTable )
( declare DatadiagramMLXForm_FontEntry )
( declare DatadiagramMLXForm_FaceNamesTable )
( declare DatadiagramMLXForm_FaceName )
( declare DatadiagramMLXForm_VBProjectData )
( declare DatadiagramMLXForm_EmailRoutingData )
( declare DatadiagramMLXForm_StyleSheetsCollection )
( declare DatadiagramMLXForm_StyleSheet )
( declare DatadiagramMLXForm_DocumentSheet )
( declare DatadiagramMLXForm_PageSheet )
( declare DatadiagramMLXForm_NamedElt )
( declare DatadiagramMLXForm_IdentifiedElt )
( declare DatadiagramMLXForm_UniqueIdElt )
( declare DatadiagramMLXForm_Shape )
( declare DatadiagramMLXForm_ShapeElt )
( declare DatadiagramMLXForm_IXElt )
( declare DatadiagramMLXForm_DelElt )
( declare DatadiagramMLXForm_Geom )
( declare DatadiagramMLXForm_XYElt )
( declare DatadiagramMLXForm_LineTo )
( declare DatadiagramMLXForm_MoveTo )
( declare DatadiagramMLXForm_XYAElt )
( declare DatadiagramMLXForm_ArcTo )
( declare DatadiagramMLXForm_SplineKnot )
( declare DatadiagramMLXForm_PolylineTo )
( declare DatadiagramMLXForm_XYABElt )
( declare DatadiagramMLXForm_InfiniteLine )
( declare DatadiagramMLXForm_XYABCDElt )
( declare DatadiagramMLXForm_Ellipse )
( declare DatadiagramMLXForm_EllipticalArcTo )
( declare DatadiagramMLXForm_SplineStart )
( declare DatadiagramMLXForm_XYABCDEElt )
( declare DatadiagramMLXForm_NURBSTo )
( declare DatadiagramMLXForm_Text )
( declare DatadiagramMLXForm_TextElt )
( declare DatadiagramMLXForm_IXrequiredElt )
( declare DatadiagramMLXForm_Cp )
( declare DatadiagramMLXForm_Pp )
( declare DatadiagramMLXForm_Tp )
( declare DatadiagramMLXForm_Fld )
( declare DatadiagramMLXForm_StringElt )
( declare DatadiagramMLXForm_Char )
( declare DatadiagramMLXForm_Para )
( declare DatadiagramMLXForm_TabsCollection )
( declare DatadiagramMLXForm_Tab )
( declare DatadiagramMLXForm_Field )
( declare DatadiagramMLXForm_XForm )
( declare DatadiagramMLXForm_MastersCollection )
( declare DatadiagramMLXForm_MasterShortCut )
( declare DatadiagramMLXForm_Icon )
( declare DatadiagramMLXForm_Master )
( declare DatadiagramMLXForm_ShapesCollection )
( declare DatadiagramMLXForm_ConnectsCollection )
( declare DatadiagramMLXForm_Connect )
( declare DatadiagramMLXForm_MasterElt )
( declare DatadiagramMLXForm_PagesCollection )
( declare DatadiagramMLXForm_Page )
( declare DatadiagramMLXForm_PageElt )
( declare DatadiagramMLXForm_WindowsInfo )
( declare DatadiagramMLXForm_EventList )
( declare DatadiagramMLXForm_HeaderFooter )
( declare DatadiagramMLXForm_SolutionXML )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def DatadiagramMLXForm ( struct-map
	KM3_Package
	:contents[( def DatadiagramMLXForm_DateTimeType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_DateTimeType
			:type Integer
			:location "16:3-16:28"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_DateTimeType
			:type Integer
			:location "17:3-17:29"
		) ( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_DateTimeType
			:type Integer
			:location "18:3-18:27"
		) ( struct-map
			KM3_Attribute
			:name "hour"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_DateTimeType
			:type Integer
			:location "19:3-19:28"
		) ( struct-map
			KM3_Attribute
			:name "minute"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_DateTimeType
			:type Integer
			:location "20:3-20:30"
		) ( struct-map
			KM3_Attribute
			:name "second"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_DateTimeType
			:type Integer
			:location "21:3-21:30"
		)]
	) ) ( def DatadiagramMLXForm_CellType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "unit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_CellType
			:type String
			:location "27:3-27:32"
		) ( struct-map
			KM3_Attribute
			:name "formula"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_CellType
			:type String
			:location "29:3-29:35"
		) ( struct-map
			KM3_Attribute
			:name "err"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_CellType
			:type String
			:location "31:3-31:31"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_CellType
			:type String
			:location "33:3-33:33"
		)]
	) ) ( def DatadiagramMLXForm_VisioDocument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "start"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_VisioDocument
			:type Integer
			:location "44:3-44:34"
		) ( struct-map
			KM3_Attribute
			:name "key"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_VisioDocument
			:type String
			:location "46:3-46:31"
		) ( struct-map
			KM3_Attribute
			:name "metric"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_VisioDocument
			:type Boolean
			:location "48:3-48:35"
		) ( struct-map
			KM3_Attribute
			:name "buildnum"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_VisioDocument
			:type Integer
			:location "50:3-50:37"
		) ( struct-map
			KM3_Attribute
			:name "version"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_VisioDocument
			:type String
			:location "52:3-52:35"
		) ( struct-map
			KM3_Attribute
			:name "docLangId"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_VisioDocument
			:type Integer
			:location "54:3-54:38"
		) ( struct-map
			KM3_Reference
			:name "docProps"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_VisioDocument
			:type DatadiagramMLXForm_DocumentPropertiesCollection
			:location "57:3-57:97"
			:isContainer true
			:opposite dps_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docSettings"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_VisioDocument
			:type DatadiagramMLXForm_DocumentSettingsElt
			:location "59:3-59:91"
			:isContainer true
			:opposite dss_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docColors"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_VisioDocument
			:type DatadiagramMLXForm_ColorsTable
			:location "61:3-61:80"
			:isContainer true
			:opposite cs_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docPrintSetup"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_VisioDocument
			:type DatadiagramMLXForm_PrintSetup
			:location "63:3-63:83"
			:isContainer true
			:opposite ps_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docFonts"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_VisioDocument
			:type DatadiagramMLXForm_FontsTable
			:location "65:3-65:78"
			:isContainer true
			:opposite fs_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docFaceNames"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_VisioDocument
			:type DatadiagramMLXForm_FaceNamesTable
			:location "67:3-67:87"
			:isContainer true
			:opposite fns_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docStyleSheets"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_VisioDocument
			:type DatadiagramMLXForm_StyleSheetsCollection
			:location "69:3-69:96"
			:isContainer true
			:opposite sss_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docDocumentSheet"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_VisioDocument
			:type DatadiagramMLXForm_DocumentSheet
			:location "71:3-71:89"
			:isContainer true
			:opposite ds_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docMasters"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_VisioDocument
			:type DatadiagramMLXForm_MastersCollection
			:location "73:3-73:87"
			:isContainer true
			:opposite ms_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docPages"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_VisioDocument
			:type DatadiagramMLXForm_PagesCollection
			:location "75:3-75:83"
			:isContainer true
			:opposite ps_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docWindows"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_VisioDocument
			:type DatadiagramMLXForm_WindowsInfo
			:location "77:3-77:81"
			:isContainer true
			:opposite ws_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docEventList"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_VisioDocument
			:type DatadiagramMLXForm_EventList
			:location "79:3-79:81"
			:isContainer true
			:opposite el_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docHeaderFooter"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_VisioDocument
			:type DatadiagramMLXForm_HeaderFooter
			:location "81:3-81:87"
			:isContainer true
			:opposite ef_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docVBProjectData"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_VisioDocument
			:type DatadiagramMLXForm_VBProjectData
			:location "83:3-83:90"
			:isContainer true
			:opposite vpd_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docEmailRoutingData"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_VisioDocument
			:type DatadiagramMLXForm_EmailRoutingData
			:location "85:3-85:96"
			:isContainer true
			:opposite erd_visioDocument
		) ( struct-map
			KM3_Reference
			:name "docSolutionXML"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_VisioDocument
			:type DatadiagramMLXForm_SolutionXML
			:location "87:3-87:91"
			:isContainer true
			:opposite sx_visioDocument
		)]
	) ) ( def DatadiagramMLXForm_DocumentPropertiesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentPropertiesCollection
			:type String
			:location "96:3-96:33"
		) ( struct-map
			KM3_Attribute
			:name "subject"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentPropertiesCollection
			:type String
			:location "98:3-98:35"
		) ( struct-map
			KM3_Attribute
			:name "creator"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentPropertiesCollection
			:type String
			:location "100:3-100:35"
		) ( struct-map
			KM3_Attribute
			:name "manager"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentPropertiesCollection
			:type String
			:location "102:3-102:35"
		) ( struct-map
			KM3_Attribute
			:name "company"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentPropertiesCollection
			:type String
			:location "104:3-104:35"
		) ( struct-map
			KM3_Attribute
			:name "category"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentPropertiesCollection
			:type String
			:location "106:3-106:36"
		) ( struct-map
			KM3_Attribute
			:name "keywords"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentPropertiesCollection
			:type String
			:location "108:3-108:36"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentPropertiesCollection
			:type String
			:location "111:3-111:39"
		) ( struct-map
			KM3_Attribute
			:name "hyperlinkBase_href"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentPropertiesCollection
			:type String
			:location "113:3-113:46"
		) ( struct-map
			KM3_Attribute
			:name "alternateNames"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentPropertiesCollection
			:type String
			:location "115:3-115:42"
		) ( struct-map
			KM3_Attribute
			:name "template"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentPropertiesCollection
			:type String
			:location "117:3-117:36"
		) ( struct-map
			KM3_Attribute
			:name "buildNumberCreated"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentPropertiesCollection
			:type String
			:location "119:3-119:46"
		) ( struct-map
			KM3_Attribute
			:name "buildNumberEdited"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentPropertiesCollection
			:type String
			:location "121:3-121:45"
		) ( struct-map
			KM3_Reference
			:name "dps_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentPropertiesCollection
			:type DatadiagramMLXForm_VisioDocument
			:location "92:3-92:67"
			:isContainer false
			:opposite docProps
		) ( struct-map
			KM3_Reference
			:name "customProps"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentPropertiesCollection
			:type DatadiagramMLXForm_CustomPropertiesCollection
			:location "126:3-126:92"
			:isContainer true
			:opposite cps_docProp
		) ( struct-map
			KM3_Reference
			:name "timeCreated"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentPropertiesCollection
			:type DatadiagramMLXForm_DateTimeType
			:location "128:3-128:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "timeSaved"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentPropertiesCollection
			:type DatadiagramMLXForm_DateTimeType
			:location "130:3-130:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "timeEdited"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentPropertiesCollection
			:type DatadiagramMLXForm_DateTimeType
			:location "132:3-132:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "timePrinted"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentPropertiesCollection
			:type DatadiagramMLXForm_DateTimeType
			:location "134:3-134:55"
			:isContainer true
		)]
	) ) ( def DatadiagramMLXForm_CustomPropertiesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cps_docProp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_CustomPropertiesCollection
			:type DatadiagramMLXForm_DocumentPropertiesCollection
			:location "139:3-139:79"
			:isContainer false
			:opposite customProps
		) ( struct-map
			KM3_Reference
			:name "cps_customProps"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_CustomPropertiesCollection
			:type DatadiagramMLXForm_CustomProperty
			:location "142:3-142:93"
			:isContainer true
			:opposite cp_customProps
		)]
	) ) ( def DatadiagramMLXForm_CustomProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_CustomProperty
			:type String
			:location "150:3-150:32"
		) ( struct-map
			KM3_Attribute
			:name "dataType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_CustomProperty
			:type String
			:location "152:3-152:36"
		) ( struct-map
			KM3_Reference
			:name "cp_customProps"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_CustomProperty
			:type DatadiagramMLXForm_CustomPropertiesCollection
			:location "147:3-147:85"
			:isContainer false
			:opposite cps_customProps
		)]
	) ) ( def DatadiagramMLXForm_DocumentSettingsElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "glueSettings"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentSettingsElt
			:type Integer
			:location "170:3-170:41"
		) ( struct-map
			KM3_Attribute
			:name "snapSettings"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentSettingsElt
			:type Integer
			:location "172:3-172:41"
		) ( struct-map
			KM3_Attribute
			:name "snapExtensions"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentSettingsElt
			:type Integer
			:location "174:3-174:43"
		) ( struct-map
			KM3_Attribute
			:name "dynamicGridEnabled"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentSettingsElt
			:type Boolean
			:location "178:3-178:47"
		) ( struct-map
			KM3_Attribute
			:name "protectStyles"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentSettingsElt
			:type Boolean
			:location "180:3-180:42"
		) ( struct-map
			KM3_Attribute
			:name "protectShapes"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentSettingsElt
			:type Boolean
			:location "182:3-182:42"
		) ( struct-map
			KM3_Attribute
			:name "protectMasters"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentSettingsElt
			:type Boolean
			:location "184:3-184:43"
		) ( struct-map
			KM3_Attribute
			:name "protectBkgnds"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentSettingsElt
			:type Boolean
			:location "186:3-186:42"
		) ( struct-map
			KM3_Attribute
			:name "customMenusFile"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentSettingsElt
			:type String
			:location "188:3-188:43"
		) ( struct-map
			KM3_Attribute
			:name "customToolbarsFile"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentSettingsElt
			:type String
			:location "190:3-190:46"
		) ( struct-map
			KM3_Attribute
			:name "attachedToolbars"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentSettingsElt
			:type String
			:location "192:3-192:44"
		) ( struct-map
			KM3_Reference
			:name "dss_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentSettingsElt
			:type DatadiagramMLXForm_VisioDocument
			:location "157:3-157:70"
			:isContainer false
			:opposite docSettings
		) ( struct-map
			KM3_Reference
			:name "topPage"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentSettingsElt
			:type DatadiagramMLXForm_Page
			:location "159:3-159:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "defaultTextStyle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentSettingsElt
			:type DatadiagramMLXForm_StyleSheet
			:location "161:3-161:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "defaultLineStyle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentSettingsElt
			:type DatadiagramMLXForm_StyleSheet
			:location "163:3-163:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "defaultFillStyle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentSettingsElt
			:type DatadiagramMLXForm_StyleSheet
			:location "165:3-165:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "defaultGuideStyle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentSettingsElt
			:type DatadiagramMLXForm_StyleSheet
			:location "167:3-167:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ds_snapAngles"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentSettingsElt
			:type DatadiagramMLXForm_SnapAnglesCollection
			:location "176:3-176:91"
			:isContainer true
			:opposite sa_docSettings
		)]
	) ) ( def DatadiagramMLXForm_SnapAnglesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sa_docSettings"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_SnapAnglesCollection
			:type DatadiagramMLXForm_DocumentSettingsElt
			:location "197:3-197:75"
			:isContainer false
			:opposite ds_snapAngles
		) ( struct-map
			KM3_Reference
			:name "snapAngles"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_SnapAnglesCollection
			:type DatadiagramMLXForm_SnapAngle
			:location "199:3-199:82"
			:isContainer true
			:opposite sa_snapAngles
		)]
	) ) ( def DatadiagramMLXForm_SnapAngle ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "angleValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_SnapAngle
			:type Double
			:location "206:3-206:33"
		) ( struct-map
			KM3_Reference
			:name "sa_snapAngles"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_SnapAngle
			:type DatadiagramMLXForm_SnapAnglesCollection
			:location "204:3-204:72"
			:isContainer false
			:opposite snapAngles
		)]
	) ) ( def DatadiagramMLXForm_ColorsTable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cs_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_ColorsTable
			:type DatadiagramMLXForm_VisioDocument
			:location "211:3-211:67"
			:isContainer false
			:opposite docColors
		) ( struct-map
			KM3_Reference
			:name "colorEntries"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_ColorsTable
			:type DatadiagramMLXForm_ColorEntry
			:location "214:3-214:81"
			:isContainer true
			:opposite ce_colors
		)]
	) ) ( def DatadiagramMLXForm_ColorEntry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_IXrequiredElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "rgb"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_ColorEntry
			:type String
			:location "222:3-222:26"
		) ( struct-map
			KM3_Reference
			:name "ce_colors"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_ColorEntry
			:type DatadiagramMLXForm_ColorsTable
			:location "219:3-219:61"
			:isContainer false
			:opposite colorEntries
		)]
	) ) ( def DatadiagramMLXForm_PrintSetup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ps_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_PrintSetup
			:type DatadiagramMLXForm_VisioDocument
			:location "228:3-228:71"
			:isContainer false
			:opposite docPrintSetup
		)]
	) ) ( def DatadiagramMLXForm_FontsTable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fs_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_FontsTable
			:type DatadiagramMLXForm_VisioDocument
			:location "235:3-235:66"
			:isContainer false
			:opposite docFonts
		) ( struct-map
			KM3_Reference
			:name "fontEntries"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_FontsTable
			:type DatadiagramMLXForm_FontEntry
			:location "238:3-238:78"
			:isContainer true
			:opposite fe_fonts
		)]
	) ) ( def DatadiagramMLXForm_FontEntry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_IdentifiedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_FontEntry
			:type String
			:location "246:3-246:27"
		) ( struct-map
			KM3_Attribute
			:name "charSet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_FontEntry
			:type String
			:location "247:3-247:30"
		) ( struct-map
			KM3_Attribute
			:name "pitchAndFamily"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_FontEntry
			:type String
			:location "248:3-248:37"
		) ( struct-map
			KM3_Attribute
			:name "attributes"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_FontEntry
			:type Integer
			:location "249:3-249:34"
		) ( struct-map
			KM3_Attribute
			:name "weight"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_FontEntry
			:type Integer
			:location "250:3-250:30"
		) ( struct-map
			KM3_Attribute
			:name "unicode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_FontEntry
			:type Boolean
			:location "251:3-251:31"
		) ( struct-map
			KM3_Reference
			:name "fe_fonts"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_FontEntry
			:type DatadiagramMLXForm_FontsTable
			:location "244:3-244:58"
			:isContainer false
			:opposite fontEntries
		)]
	) ) ( def DatadiagramMLXForm_FaceNamesTable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fns_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_FaceNamesTable
			:type DatadiagramMLXForm_VisioDocument
			:location "256:3-256:71"
			:isContainer false
			:opposite docFaceNames
		) ( struct-map
			KM3_Reference
			:name "faceNameEntries"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_FaceNamesTable
			:type DatadiagramMLXForm_FaceName
			:location "259:3-259:85"
			:isContainer true
			:opposite fn_faceNames
		)]
	) ) ( def DatadiagramMLXForm_FaceName ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_IdentifiedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_FaceName
			:type String
			:location "267:3-267:27"
		) ( struct-map
			KM3_Attribute
			:name "unicodeRanges"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_FaceName
			:type String
			:location "269:3-269:36"
		) ( struct-map
			KM3_Attribute
			:name "charSet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_FaceName
			:type String
			:location "271:3-271:30"
		) ( struct-map
			KM3_Attribute
			:name "panos"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_FaceName
			:type String
			:location "273:3-273:28"
		) ( struct-map
			KM3_Attribute
			:name "flags"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_FaceName
			:type Integer
			:location "275:3-275:29"
		) ( struct-map
			KM3_Reference
			:name "fn_faceNames"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_FaceName
			:type DatadiagramMLXForm_FaceNamesTable
			:location "264:3-264:70"
			:isContainer false
			:opposite faceNameEntries
		)]
	) ) ( def DatadiagramMLXForm_VBProjectData ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_VBProjectData
			:type String
			:location "283:3-283:27"
		) ( struct-map
			KM3_Reference
			:name "vpd_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_VBProjectData
			:type DatadiagramMLXForm_VisioDocument
			:location "280:3-280:75"
			:isContainer false
			:opposite docVBProjectData
		)]
	) ) ( def DatadiagramMLXForm_EmailRoutingData ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_EmailRoutingData
			:type String
			:location "291:3-291:27"
		) ( struct-map
			KM3_Attribute
			:name "size"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_EmailRoutingData
			:type Integer
			:location "293:3-293:33"
		) ( struct-map
			KM3_Reference
			:name "erd_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_EmailRoutingData
			:type DatadiagramMLXForm_VisioDocument
			:location "288:3-288:78"
			:isContainer false
			:opposite docEmailRoutingData
		)]
	) ) ( def DatadiagramMLXForm_StyleSheetsCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sss_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_StyleSheetsCollection
			:type DatadiagramMLXForm_VisioDocument
			:location "298:3-298:73"
			:isContainer false
			:opposite docStyleSheets
		) ( struct-map
			KM3_Reference
			:name "stylesSheets"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_StyleSheetsCollection
			:type DatadiagramMLXForm_StyleSheet
			:location "301:3-301:87"
			:isContainer true
			:opposite ss_stylesSheets
		)]
	) ) ( def DatadiagramMLXForm_StyleSheet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_Shape DatadiagramMLXForm_IdentifiedElt DatadiagramMLXForm_NamedElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ss_stylesSheets"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_StyleSheet
			:type DatadiagramMLXForm_StyleSheetsCollection
			:location "306:3-306:77"
			:isContainer false
			:opposite stylesSheets
		)]
	) ) ( def DatadiagramMLXForm_DocumentSheet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_PageSheet DatadiagramMLXForm_NamedElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ds_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_DocumentSheet
			:type DatadiagramMLXForm_VisioDocument
			:location "311:3-311:74"
			:isContainer false
			:opposite docDocumentSheet
		)]
	) ) ( def DatadiagramMLXForm_PageSheet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_Shape DatadiagramMLXForm_UniqueIdElt DatadiagramMLXForm_MasterElt DatadiagramMLXForm_PageElt]
		:structuralFeatures[]
	) ) ( def DatadiagramMLXForm_NamedElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_NamedElt
			:type String
			:location "320:3-320:32"
		) ( struct-map
			KM3_Attribute
			:name "nameU"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_NamedElt
			:type String
			:location "322:3-322:33"
		)]
	) ) ( def DatadiagramMLXForm_IdentifiedElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "ID"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_IdentifiedElt
			:type Integer
			:location "328:3-328:26"
		)]
	) ) ( def DatadiagramMLXForm_UniqueIdElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "UniqueID"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_UniqueIdElt
			:type String
			:location "334:3-334:36"
		)]
	) ) ( def DatadiagramMLXForm_Shape ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "lineStyle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Shape
			:type Integer
			:location "345:3-345:38"
		) ( struct-map
			KM3_Attribute
			:name "fillStyle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Shape
			:type Integer
			:location "347:3-347:38"
		) ( struct-map
			KM3_Attribute
			:name "textStyle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Shape
			:type Integer
			:location "349:3-349:38"
		) ( struct-map
			KM3_Reference
			:name "ss_shapes"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_Shape
			:type DatadiagramMLXForm_ShapesCollection
			:location "342:3-342:60"
			:isContainer false
			:opposite shapes
		) ( struct-map
			KM3_Reference
			:name "shapeElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_Shape
			:type DatadiagramMLXForm_ShapeElt
			:location "352:3-352:81"
			:isContainer true
			:opposite sse_shapeSheet
		)]
	) ) ( def DatadiagramMLXForm_ShapeElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sse_shapeSheet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_ShapeElt
			:type DatadiagramMLXForm_Shape
			:location "357:3-357:57"
			:isContainer false
			:opposite shapeElts
		)]
	) ) ( def DatadiagramMLXForm_IXElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "iX"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_IXElt
			:type Integer
			:location "363:3-363:31"
		)]
	) ) ( def DatadiagramMLXForm_DelElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "del"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_DelElt
			:type Boolean
			:location "369:3-369:32"
		)]
	) ) ( def DatadiagramMLXForm_Geom ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_ShapeElt DatadiagramMLXForm_IXElt DatadiagramMLXForm_DelElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "noFill"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Geom
			:type DatadiagramMLXForm_CellType
			:location "378:3-378:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "noLine"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Geom
			:type DatadiagramMLXForm_CellType
			:location "380:3-380:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "noShow"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Geom
			:type DatadiagramMLXForm_CellType
			:location "382:3-382:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "noSnap"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Geom
			:type DatadiagramMLXForm_CellType
			:location "384:3-384:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "linesTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_Geom
			:type DatadiagramMLXForm_LineTo
			:location "386:3-386:70"
			:isContainer true
			:opposite lt_geom
		) ( struct-map
			KM3_Reference
			:name "movesTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_Geom
			:type DatadiagramMLXForm_MoveTo
			:location "387:3-387:70"
			:isContainer true
			:opposite mt_geom
		) ( struct-map
			KM3_Reference
			:name "arcsTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_Geom
			:type DatadiagramMLXForm_ArcTo
			:location "388:3-388:68"
			:isContainer true
			:opposite ac_geom
		) ( struct-map
			KM3_Reference
			:name "splineKnots"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_Geom
			:type DatadiagramMLXForm_SplineKnot
			:location "389:3-389:78"
			:isContainer true
			:opposite sk_geom
		) ( struct-map
			KM3_Reference
			:name "polylinesTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_Geom
			:type DatadiagramMLXForm_PolylineTo
			:location "390:3-390:78"
			:isContainer true
			:opposite pt_geom
		) ( struct-map
			KM3_Reference
			:name "infiniteLines"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_Geom
			:type DatadiagramMLXForm_InfiniteLine
			:location "391:3-391:82"
			:isContainer true
			:opposite il_geom
		) ( struct-map
			KM3_Reference
			:name "ellipses"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_Geom
			:type DatadiagramMLXForm_Ellipse
			:location "392:3-392:71"
			:isContainer true
			:opposite e_geom
		) ( struct-map
			KM3_Reference
			:name "ellipticalArcsTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_Geom
			:type DatadiagramMLXForm_EllipticalArcTo
			:location "393:3-393:89"
			:isContainer true
			:opposite eat_geom
		) ( struct-map
			KM3_Reference
			:name "splineStarts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_Geom
			:type DatadiagramMLXForm_SplineStart
			:location "394:3-394:80"
			:isContainer true
			:opposite ss_geom
		) ( struct-map
			KM3_Reference
			:name "nurbsTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_Geom
			:type DatadiagramMLXForm_NURBSTo
			:location "395:3-395:71"
			:isContainer true
			:opposite nt_geom
		)]
	) ) ( def DatadiagramMLXForm_XYElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DatadiagramMLXForm_IXElt DatadiagramMLXForm_DelElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "x"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_XYElt
			:type DatadiagramMLXForm_CellType
			:location "400:3-400:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "y"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_XYElt
			:type DatadiagramMLXForm_CellType
			:location "401:3-401:41"
			:isContainer true
		)]
	) ) ( def DatadiagramMLXForm_LineTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_XYElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "lt_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_LineTo
			:type DatadiagramMLXForm_Geom
			:location "406:3-406:47"
			:isContainer false
			:opposite linesTo
		)]
	) ) ( def DatadiagramMLXForm_MoveTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_XYElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mt_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_MoveTo
			:type DatadiagramMLXForm_Geom
			:location "411:3-411:47"
			:isContainer false
			:opposite movesTo
		)]
	) ) ( def DatadiagramMLXForm_XYAElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DatadiagramMLXForm_XYElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "a"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_XYAElt
			:type DatadiagramMLXForm_CellType
			:location "416:3-416:41"
			:isContainer true
		)]
	) ) ( def DatadiagramMLXForm_ArcTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_XYAElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ac_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_ArcTo
			:type DatadiagramMLXForm_Geom
			:location "421:3-421:46"
			:isContainer false
			:opposite arcsTo
		)]
	) ) ( def DatadiagramMLXForm_SplineKnot ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_XYAElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sk_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_SplineKnot
			:type DatadiagramMLXForm_Geom
			:location "426:3-426:51"
			:isContainer false
			:opposite splineKnots
		)]
	) ) ( def DatadiagramMLXForm_PolylineTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_XYAElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pt_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_PolylineTo
			:type DatadiagramMLXForm_Geom
			:location "431:3-431:51"
			:isContainer false
			:opposite polylinesTo
		)]
	) ) ( def DatadiagramMLXForm_XYABElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DatadiagramMLXForm_XYAElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "b"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_XYABElt
			:type DatadiagramMLXForm_CellType
			:location "436:3-436:41"
			:isContainer true
		)]
	) ) ( def DatadiagramMLXForm_InfiniteLine ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_XYABElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "il_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_InfiniteLine
			:type DatadiagramMLXForm_Geom
			:location "441:3-441:53"
			:isContainer false
			:opposite infiniteLines
		)]
	) ) ( def DatadiagramMLXForm_XYABCDElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DatadiagramMLXForm_XYABElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "c"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_XYABCDElt
			:type DatadiagramMLXForm_CellType
			:location "446:3-446:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "d"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_XYABCDElt
			:type DatadiagramMLXForm_CellType
			:location "447:3-447:41"
			:isContainer true
		)]
	) ) ( def DatadiagramMLXForm_Ellipse ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_XYABCDElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "e_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_Ellipse
			:type DatadiagramMLXForm_Geom
			:location "452:3-452:47"
			:isContainer false
			:opposite ellipses
		)]
	) ) ( def DatadiagramMLXForm_EllipticalArcTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_XYABCDElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "eat_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_EllipticalArcTo
			:type DatadiagramMLXForm_Geom
			:location "457:3-457:57"
			:isContainer false
			:opposite ellipticalArcsTo
		)]
	) ) ( def DatadiagramMLXForm_SplineStart ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_XYABCDElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ss_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_SplineStart
			:type DatadiagramMLXForm_Geom
			:location "462:3-462:52"
			:isContainer false
			:opposite splineStarts
		)]
	) ) ( def DatadiagramMLXForm_XYABCDEElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DatadiagramMLXForm_XYABCDElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "e"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_XYABCDEElt
			:type DatadiagramMLXForm_CellType
			:location "467:3-467:41"
			:isContainer true
		)]
	) ) ( def DatadiagramMLXForm_NURBSTo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_XYABCDEElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "nt_geom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_NURBSTo
			:type DatadiagramMLXForm_Geom
			:location "472:3-472:47"
			:isContainer false
			:opposite nurbsTo
		)]
	) ) ( def DatadiagramMLXForm_Text ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_ShapeElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "textElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_Text
			:type DatadiagramMLXForm_TextElt
			:location "482:3-482:72"
			:isContainer true
			:opposite te_text
		)]
	) ) ( def DatadiagramMLXForm_TextElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "te_text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_TextElt
			:type DatadiagramMLXForm_Text
			:location "487:3-487:48"
			:isContainer false
			:opposite textElts
		)]
	) ) ( def DatadiagramMLXForm_IXrequiredElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "iX"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_IXrequiredElt
			:type Integer
			:location "493:3-493:26"
		)]
	) ) ( def DatadiagramMLXForm_Cp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_IXrequiredElt DatadiagramMLXForm_TextElt]
		:structuralFeatures[]
	) ) ( def DatadiagramMLXForm_Pp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_IXrequiredElt DatadiagramMLXForm_TextElt]
		:structuralFeatures[]
	) ) ( def DatadiagramMLXForm_Tp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_IXrequiredElt DatadiagramMLXForm_TextElt]
		:structuralFeatures[]
	) ) ( def DatadiagramMLXForm_Fld ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_IXrequiredElt DatadiagramMLXForm_TextElt]
		:structuralFeatures[]
	) ) ( def DatadiagramMLXForm_StringElt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_TextElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_StringElt
			:type String
			:location "510:3-510:28"
		)]
	) ) ( def DatadiagramMLXForm_Char ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_ShapeElt DatadiagramMLXForm_IXElt DatadiagramMLXForm_DelElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "font"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Char
			:type DatadiagramMLXForm_CellType
			:location "516:3-516:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "color"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Char
			:type DatadiagramMLXForm_CellType
			:location "518:3-518:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "style"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Char
			:type DatadiagramMLXForm_CellType
			:location "520:3-520:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "case"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Char
			:type DatadiagramMLXForm_CellType
			:location "522:3-522:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "pos"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Char
			:type DatadiagramMLXForm_CellType
			:location "524:3-524:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "fontScale"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Char
			:type DatadiagramMLXForm_CellType
			:location "526:3-526:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "size"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Char
			:type DatadiagramMLXForm_CellType
			:location "528:3-528:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "dblUnderline"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Char
			:type DatadiagramMLXForm_CellType
			:location "530:3-530:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "overline"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Char
			:type DatadiagramMLXForm_CellType
			:location "532:3-532:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "strikethru"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Char
			:type DatadiagramMLXForm_CellType
			:location "534:3-534:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "doubleStrikethrough"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Char
			:type DatadiagramMLXForm_CellType
			:location "536:3-536:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rtlText"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Char
			:type DatadiagramMLXForm_CellType
			:location "538:3-538:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "runVertical"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Char
			:type DatadiagramMLXForm_CellType
			:location "540:3-540:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "letterspace"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Char
			:type DatadiagramMLXForm_CellType
			:location "542:3-542:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "colorTrans"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Char
			:type DatadiagramMLXForm_CellType
			:location "544:3-544:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "localizeFont"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Char
			:type DatadiagramMLXForm_CellType
			:location "546:3-546:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "langID"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Char
			:type DatadiagramMLXForm_CellType
			:location "548:3-548:46"
			:isContainer true
		)]
	) ) ( def DatadiagramMLXForm_Para ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_ShapeElt DatadiagramMLXForm_IXElt DatadiagramMLXForm_DelElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "indFirst"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Para
			:type DatadiagramMLXForm_CellType
			:location "554:3-554:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "indLeft"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Para
			:type DatadiagramMLXForm_CellType
			:location "556:3-556:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "indRight"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Para
			:type DatadiagramMLXForm_CellType
			:location "558:3-558:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "spLine"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Para
			:type DatadiagramMLXForm_CellType
			:location "560:3-560:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "spBefore"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Para
			:type DatadiagramMLXForm_CellType
			:location "562:3-562:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "spAfter"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Para
			:type DatadiagramMLXForm_CellType
			:location "564:3-564:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "horzAlign"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Para
			:type DatadiagramMLXForm_CellType
			:location "566:3-566:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "bullet"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Para
			:type DatadiagramMLXForm_CellType
			:location "568:3-568:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "bulletStr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Para
			:type DatadiagramMLXForm_CellType
			:location "570:3-570:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "bulletFont"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Para
			:type DatadiagramMLXForm_CellType
			:location "572:3-572:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "localizeBulletFont"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Para
			:type DatadiagramMLXForm_CellType
			:location "574:3-574:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "bulletFontSize"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Para
			:type DatadiagramMLXForm_CellType
			:location "576:3-576:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "textPosAfterBullet"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Para
			:type DatadiagramMLXForm_CellType
			:location "578:3-578:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "flags"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Para
			:type DatadiagramMLXForm_CellType
			:location "580:3-580:45"
			:isContainer true
		)]
	) ) ( def DatadiagramMLXForm_TabsCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_ShapeElt DatadiagramMLXForm_IXElt DatadiagramMLXForm_DelElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tabs"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_TabsCollection
			:type DatadiagramMLXForm_Tab
			:location "585:3-585:63"
			:isContainer true
			:opposite t_tabs
		)]
	) ) ( def DatadiagramMLXForm_Tab ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_IXElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "t_tabs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_Tab
			:type DatadiagramMLXForm_TabsCollection
			:location "590:3-590:53"
			:isContainer false
			:opposite tabs
		) ( struct-map
			KM3_Reference
			:name "position"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Tab
			:type DatadiagramMLXForm_CellType
			:location "592:3-592:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "alignment"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Tab
			:type DatadiagramMLXForm_CellType
			:location "594:3-594:49"
			:isContainer true
		)]
	) ) ( def DatadiagramMLXForm_Field ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_ShapeElt DatadiagramMLXForm_IXElt DatadiagramMLXForm_DelElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Field
			:type DatadiagramMLXForm_CellType
			:location "600:3-600:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "editMode"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Field
			:type DatadiagramMLXForm_CellType
			:location "602:3-602:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "format"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Field
			:type DatadiagramMLXForm_CellType
			:location "604:3-604:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Field
			:type DatadiagramMLXForm_CellType
			:location "606:3-606:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "uiCat"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Field
			:type DatadiagramMLXForm_CellType
			:location "608:3-608:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "uiCode"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Field
			:type DatadiagramMLXForm_CellType
			:location "610:3-610:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "uiFmt"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Field
			:type DatadiagramMLXForm_CellType
			:location "612:3-612:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "calendar"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Field
			:type DatadiagramMLXForm_CellType
			:location "614:3-614:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "objectKind"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Field
			:type DatadiagramMLXForm_CellType
			:location "616:3-616:50"
			:isContainer true
		)]
	) ) ( def DatadiagramMLXForm_XForm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_ShapeElt DatadiagramMLXForm_DelElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pinX"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_XForm
			:type DatadiagramMLXForm_CellType
			:location "627:3-627:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "pinY"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_XForm
			:type DatadiagramMLXForm_CellType
			:location "629:3-629:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "width"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_XForm
			:type DatadiagramMLXForm_CellType
			:location "631:3-631:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "height"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_XForm
			:type DatadiagramMLXForm_CellType
			:location "633:3-633:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "locPinX"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_XForm
			:type DatadiagramMLXForm_CellType
			:location "635:3-635:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "locPinY"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_XForm
			:type DatadiagramMLXForm_CellType
			:location "637:3-637:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "angle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_XForm
			:type DatadiagramMLXForm_CellType
			:location "639:3-639:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "flipX"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_XForm
			:type DatadiagramMLXForm_CellType
			:location "641:3-641:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "flipY"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_XForm
			:type DatadiagramMLXForm_CellType
			:location "643:3-643:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "resizeMode"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_XForm
			:type DatadiagramMLXForm_CellType
			:location "645:3-645:50"
			:isContainer true
		)]
	) ) ( def DatadiagramMLXForm_MastersCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ms_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_MastersCollection
			:type DatadiagramMLXForm_VisioDocument
			:location "655:3-655:68"
			:isContainer false
			:opposite docMasters
		) ( struct-map
			KM3_Reference
			:name "masters"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_MastersCollection
			:type DatadiagramMLXForm_Master
			:location "658:3-658:72"
			:isContainer true
			:opposite m_masters
		) ( struct-map
			KM3_Reference
			:name "masterShortCuts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_MastersCollection
			:type DatadiagramMLXForm_MasterShortCut
			:location "660:3-660:96"
			:isContainer true
			:opposite m_masterShortCuts
		)]
	) ) ( def DatadiagramMLXForm_MasterShortCut ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_IdentifiedElt DatadiagramMLXForm_NamedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "iconSize"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_MasterShortCut
			:type Integer
			:location "668:3-668:37"
		) ( struct-map
			KM3_Attribute
			:name "patternFlags"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_MasterShortCut
			:type Integer
			:location "670:3-670:42"
		) ( struct-map
			KM3_Attribute
			:name "prompt"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_MasterShortCut
			:type String
			:location "672:3-672:34"
		) ( struct-map
			KM3_Attribute
			:name "shortcutURL"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_MasterShortCut
			:type String
			:location "674:3-674:39"
		) ( struct-map
			KM3_Attribute
			:name "shortcutHelp"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_MasterShortCut
			:type String
			:location "676:3-676:41"
		) ( struct-map
			KM3_Attribute
			:name "alignName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_MasterShortCut
			:type Integer
			:location "678:3-678:38"
		) ( struct-map
			KM3_Reference
			:name "m_masterShortCuts"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_MasterShortCut
			:type DatadiagramMLXForm_MastersCollection
			:location "665:3-665:78"
			:isContainer false
			:opposite masterShortCuts
		) ( struct-map
			KM3_Reference
			:name "icons"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_MasterShortCut
			:type DatadiagramMLXForm_Icon
			:location "681:3-681:75"
			:isContainer true
			:opposite i_masterShortCut
		)]
	) ) ( def DatadiagramMLXForm_Icon ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_MasterElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_Icon
			:type String
			:location "689:3-689:28"
		) ( struct-map
			KM3_Reference
			:name "i_masterShortCut"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_Icon
			:type DatadiagramMLXForm_MasterShortCut
			:location "686:3-686:64"
			:isContainer false
			:opposite icons
		)]
	) ) ( def DatadiagramMLXForm_Master ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_IdentifiedElt DatadiagramMLXForm_UniqueIdElt DatadiagramMLXForm_NamedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "baseID"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Master
			:type String
			:location "697:3-697:34"
		) ( struct-map
			KM3_Attribute
			:name "matchByName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Master
			:type Boolean
			:location "699:3-699:40"
		) ( struct-map
			KM3_Attribute
			:name "iconSize"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Master
			:type Integer
			:location "701:3-701:37"
		) ( struct-map
			KM3_Attribute
			:name "patternFlags"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Master
			:type Integer
			:location "703:3-703:42"
		) ( struct-map
			KM3_Attribute
			:name "prompt"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Master
			:type String
			:location "705:3-705:34"
		) ( struct-map
			KM3_Attribute
			:name "hidden"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Master
			:type Boolean
			:location "707:3-707:35"
		) ( struct-map
			KM3_Attribute
			:name "iconUpdate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Master
			:type Boolean
			:location "709:3-709:40"
		) ( struct-map
			KM3_Attribute
			:name "alignName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Master
			:type Integer
			:location "711:3-711:38"
		) ( struct-map
			KM3_Reference
			:name "m_masters"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_Master
			:type DatadiagramMLXForm_MastersCollection
			:location "694:3-694:62"
			:isContainer false
			:opposite masters
		) ( struct-map
			KM3_Reference
			:name "masterElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_Master
			:type DatadiagramMLXForm_MasterElt
			:location "714:3-714:78"
			:isContainer true
			:opposite me_master
		)]
	) ) ( def DatadiagramMLXForm_ShapesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_MasterElt DatadiagramMLXForm_PageElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "shapes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_ShapesCollection
			:type DatadiagramMLXForm_Shape
			:location "720:3-720:70"
			:isContainer true
			:opposite ss_shapes
		)]
	) ) ( def DatadiagramMLXForm_ConnectsCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_MasterElt DatadiagramMLXForm_PageElt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "connections"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_ConnectsCollection
			:type DatadiagramMLXForm_Connect
			:location "726:3-726:78"
			:isContainer true
			:opposite c_connects
		)]
	) ) ( def DatadiagramMLXForm_Connect ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "fromSheet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_Connect
			:type Integer
			:location "734:3-734:33"
		) ( struct-map
			KM3_Attribute
			:name "toSheet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_Connect
			:type Integer
			:location "736:3-736:31"
		) ( struct-map
			KM3_Attribute
			:name "fromCell"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Connect
			:type String
			:location "738:3-738:37"
		) ( struct-map
			KM3_Attribute
			:name "toCell"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Connect
			:type String
			:location "740:3-740:34"
		) ( struct-map
			KM3_Attribute
			:name "fromPart"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Connect
			:type Integer
			:location "742:3-742:37"
		) ( struct-map
			KM3_Attribute
			:name "toPart"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Connect
			:type Integer
			:location "744:3-744:35"
		) ( struct-map
			KM3_Reference
			:name "c_connects"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_Connect
			:type DatadiagramMLXForm_ConnectsCollection
			:location "731:3-731:68"
			:isContainer false
			:opposite connections
		)]
	) ) ( def DatadiagramMLXForm_MasterElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "me_master"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_MasterElt
			:type DatadiagramMLXForm_Master
			:location "749:3-749:54"
			:isContainer false
			:opposite masterElts
		)]
	) ) ( def DatadiagramMLXForm_PagesCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ps_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_PagesCollection
			:type DatadiagramMLXForm_VisioDocument
			:location "754:3-754:66"
			:isContainer false
			:opposite docPages
		) ( struct-map
			KM3_Reference
			:name "pages"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_PagesCollection
			:type DatadiagramMLXForm_Page
			:location "757:3-757:66"
			:isContainer true
			:opposite p_pages
		)]
	) ) ( def DatadiagramMLXForm_Page ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DatadiagramMLXForm_IdentifiedElt DatadiagramMLXForm_NamedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "background"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Page
			:type Boolean
			:location "765:3-765:40"
		) ( struct-map
			KM3_Attribute
			:name "backPage"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Page
			:type Integer
			:location "767:3-767:38"
		) ( struct-map
			KM3_Attribute
			:name "viewScale"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Page
			:type Double
			:location "769:3-769:38"
		) ( struct-map
			KM3_Attribute
			:name "viewCenterX"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Page
			:type Double
			:location "771:3-771:39"
		) ( struct-map
			KM3_Attribute
			:name "ViewCenterY"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Page
			:type Double
			:location "773:3-773:40"
		) ( struct-map
			KM3_Attribute
			:name "reviewerID"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Page
			:type Integer
			:location "775:3-775:39"
		) ( struct-map
			KM3_Attribute
			:name "associatedPage"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DatadiagramMLXForm_Page
			:type Integer
			:location "777:3-777:43"
		) ( struct-map
			KM3_Reference
			:name "p_pages"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_Page
			:type DatadiagramMLXForm_PagesCollection
			:location "762:3-762:56"
			:isContainer false
			:opposite pages
		) ( struct-map
			KM3_Reference
			:name "pageElts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner DatadiagramMLXForm_Page
			:type DatadiagramMLXForm_PageElt
			:location "780:3-780:72"
			:isContainer true
			:opposite pe_page
		)]
	) ) ( def DatadiagramMLXForm_PageElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pe_page"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_PageElt
			:type DatadiagramMLXForm_Page
			:location "785:3-785:48"
			:isContainer false
			:opposite pageElts
		)]
	) ) ( def DatadiagramMLXForm_WindowsInfo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ws_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_WindowsInfo
			:type DatadiagramMLXForm_VisioDocument
			:location "795:3-795:68"
			:isContainer false
			:opposite docWindows
		)]
	) ) ( def DatadiagramMLXForm_EventList ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "el_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_EventList
			:type DatadiagramMLXForm_VisioDocument
			:location "801:3-801:70"
			:isContainer false
			:opposite docEventList
		)]
	) ) ( def DatadiagramMLXForm_HeaderFooter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ef_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_HeaderFooter
			:type DatadiagramMLXForm_VisioDocument
			:location "807:3-807:73"
			:isContainer false
			:opposite docHeaderFooter
		)]
	) ) ( def DatadiagramMLXForm_SolutionXML ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sx_visioDocument"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DatadiagramMLXForm_SolutionXML
			:type DatadiagramMLXForm_VisioDocument
			:location "813:3-813:72"
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
		:location "824:2-824:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "825:2-825:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "826:2-826:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "827:2-827:18"
	) )]
) )
