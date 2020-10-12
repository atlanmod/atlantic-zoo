( declare SoftwareQualityControl_DateType )
( declare SoftwareQualityControl_ControlsSequence )
( declare SoftwareQualityControl_Control )
( declare SoftwareQualityControl_ControlType )
( declare SoftwareQualityControl_BugTracking )
( declare SoftwareQualityControl_Bug )
( declare SoftwareQualityControl_BugStatusType )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def SoftwareQualityControl ( struct-map
	KM3_Package
	:contents[( def BugStatusType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "bst_open"
		:location "93:3-93:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "bst_closed"
		:location "94:3-94:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "bst_skipped"
		:location "95:3-95:23"
	)] ) ) ( def SoftwareQualityControl_DateType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SoftwareQualityControl_DateType
			:type Integer
			:location "14:3-14:27"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SoftwareQualityControl_DateType
			:type Integer
			:location "15:3-15:29"
		) ( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SoftwareQualityControl_DateType
			:type Integer
			:location "16:3-16:28"
		)]
	) ) ( def SoftwareQualityControl_ControlsSequence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "controls"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SoftwareQualityControl_ControlsSequence
			:type SoftwareQualityControl_Control
			:location "21:3-21:83"
			:isContainer true
			:opposite c_controlsSequence
		)]
	) ) ( def SoftwareQualityControl_Control ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "responsible"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SoftwareQualityControl_Control
			:type String
			:location "29:3-29:34"
		) ( struct-map
			KM3_Attribute
			:name "component"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SoftwareQualityControl_Control
			:type String
			:location "31:3-31:32"
		) ( struct-map
			KM3_Attribute
			:name "developmentPhase"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SoftwareQualityControl_Control
			:type String
			:location "33:3-33:39"
		) ( struct-map
			KM3_Attribute
			:name "scope"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SoftwareQualityControl_Control
			:type String
			:location "35:3-35:28"
		) ( struct-map
			KM3_Attribute
			:name "controlledElt"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SoftwareQualityControl_Control
			:type String
			:location "39:3-39:41"
		) ( struct-map
			KM3_Attribute
			:name "eltRef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SoftwareQualityControl_Control
			:type String
			:location "41:3-41:34"
		) ( struct-map
			KM3_Attribute
			:name "eltAuthor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SoftwareQualityControl_Control
			:type String
			:location "43:3-43:37"
		) ( struct-map
			KM3_Attribute
			:name "formRef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SoftwareQualityControl_Control
			:type String
			:location "45:3-45:35"
		) ( struct-map
			KM3_Reference
			:name "c_controlsSequence"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SoftwareQualityControl_Control
			:type SoftwareQualityControl_ControlsSequence
			:location "26:3-26:71"
			:isContainer false
			:opposite controls
		) ( struct-map
			KM3_Reference
			:name "date"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SoftwareQualityControl_Control
			:type SoftwareQualityControl_DateType
			:location "37:3-37:39"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SoftwareQualityControl_Control
			:type SoftwareQualityControl_ControlType
			:location "48:3-48:64"
			:isContainer true
			:opposite ct_control
		)]
	) ) ( def SoftwareQualityControl_ControlType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ct_control"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SoftwareQualityControl_ControlType
			:type SoftwareQualityControl_Control
			:location "58:3-58:50"
			:isContainer false
			:opposite type
		)]
	) ) ( def SoftwareQualityControl_BugTracking ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SoftwareQualityControl_ControlType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "bugs"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SoftwareQualityControl_BugTracking
			:type SoftwareQualityControl_Bug
			:location "64:3-64:70"
			:isContainer true
			:opposite b_bugTracking
		)]
	) ) ( def SoftwareQualityControl_Bug ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "number"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SoftwareQualityControl_Bug
			:type Integer
			:location "72:3-72:30"
		) ( struct-map
			KM3_Attribute
			:name "componentVersion"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SoftwareQualityControl_Bug
			:type String
			:location "74:3-74:39"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SoftwareQualityControl_Bug
			:type String
			:location "76:3-76:34"
		) ( struct-map
			KM3_Attribute
			:name "status"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SoftwareQualityControl_Bug
			:type BugStatusType
			:location "78:3-78:36"
		) ( struct-map
			KM3_Attribute
			:name "originator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SoftwareQualityControl_Bug
			:type String
			:location "80:3-80:33"
		) ( struct-map
			KM3_Attribute
			:name "responsible"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SoftwareQualityControl_Bug
			:type String
			:location "82:3-82:39"
		) ( struct-map
			KM3_Attribute
			:name "commentsAnswers"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SoftwareQualityControl_Bug
			:type String
			:location "84:3-84:43"
		) ( struct-map
			KM3_Attribute
			:name "openDate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SoftwareQualityControl_Bug
			:type String
			:location "86:3-86:31"
		) ( struct-map
			KM3_Attribute
			:name "closeDate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SoftwareQualityControl_Bug
			:type String
			:location "88:3-88:37"
		) ( struct-map
			KM3_Reference
			:name "b_bugTracking"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SoftwareQualityControl_Bug
			:type SoftwareQualityControl_BugTracking
			:location "69:3-69:57"
			:isContainer false
			:opposite bugs
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "105:2-105:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "106:2-106:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "107:2-107:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "108:2-108:18"
	) )]
) )
