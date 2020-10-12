( declare MetaH_METAHFile )
( declare MetaH_METAHEntry )
( declare MetaH_Package )
( declare MetaH_PackageImplementation )
( declare MetaH_Data )
( declare MetaH_Attribute )
( declare MetaH_ProcessDeclaration )
( declare MetaH_ProcessImplementation )
( declare MetaH_ProcessAttribute )
( declare MetaH_Process )
( declare MetaH_Port )
( declare MetaH_Connection )
( declare MetaH_MacroDeclaration )
( declare MetaH_MacroImplementation )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def MetaH ( struct-map
	KM3_Package
	:contents[( def MetaH_METAHFile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "entries"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MetaH_METAHFile
			:type MetaH_METAHEntry
			:location "13:3-13:47"
			:isContainer true
		)]
	) ) ( def MetaH_METAHEntry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def MetaH_Package ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MetaH_METAHEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "packName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_Package
			:type String
			:location "27:3-27:31"
		) ( struct-map
			KM3_Reference
			:name "data"
			:upper -1
			:lower 0
			:isOrdered true
			:owner MetaH_Package
			:type MetaH_Data
			:location "28:3-28:47"
			:isContainer true
		)]
	) ) ( def MetaH_PackageImplementation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MetaH_METAHEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "implementationName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_PackageImplementation
			:type String
			:location "34:3-34:41"
		) ( struct-map
			KM3_Attribute
			:name "implements"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_PackageImplementation
			:type String
			:location "35:3-35:33"
		) ( struct-map
			KM3_Reference
			:name "attributes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner MetaH_PackageImplementation
			:type MetaH_Attribute
			:location "36:3-36:58"
			:isContainer true
		)]
	) ) ( def MetaH_Data ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dataName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_Data
			:type String
			:location "43:3-43:31"
		)]
	) ) ( def MetaH_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "attName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_Attribute
			:type String
			:location "49:3-49:30"
		) ( struct-map
			KM3_Attribute
			:name "attValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_Attribute
			:type Integer
			:location "50:3-50:32"
		) ( struct-map
			KM3_Attribute
			:name "attValueType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_Attribute
			:type String
			:location "51:3-51:35"
		) ( struct-map
			KM3_Attribute
			:name "attType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_Attribute
			:type String
			:location "52:3-52:30"
		)]
	) ) ( def MetaH_ProcessDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MetaH_METAHEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "procDecName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_ProcessDeclaration
			:type String
			:location "60:3-60:34"
		) ( struct-map
			KM3_Reference
			:name "ports"
			:upper -1
			:lower 0
			:isOrdered true
			:owner MetaH_ProcessDeclaration
			:type MetaH_Port
			:location "61:3-61:48"
			:isContainer true
		)]
	) ) ( def MetaH_ProcessImplementation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MetaH_METAHEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "procImpName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_ProcessImplementation
			:type String
			:location "67:3-67:34"
		) ( struct-map
			KM3_Attribute
			:name "declaration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_ProcessImplementation
			:type String
			:location "68:3-68:34"
		) ( struct-map
			KM3_Reference
			:name "processAttributes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner MetaH_ProcessImplementation
			:type MetaH_ProcessAttribute
			:location "69:3-69:72"
			:isContainer true
		)]
	) ) ( def MetaH_ProcessAttribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "attName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_ProcessAttribute
			:type String
			:location "75:3-75:30"
		) ( struct-map
			KM3_Attribute
			:name "attValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_ProcessAttribute
			:type Integer
			:location "76:3-76:32"
		) ( struct-map
			KM3_Attribute
			:name "attValueType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_ProcessAttribute
			:type String
			:location "77:3-77:35"
		)]
	) ) ( def MetaH_Process ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "procName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_Process
			:type String
			:location "83:3-83:31"
		) ( struct-map
			KM3_Attribute
			:name "periodic"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_Process
			:type String
			:location "84:3-84:31"
		) ( struct-map
			KM3_Attribute
			:name "declaration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_Process
			:type String
			:location "85:3-85:34"
		) ( struct-map
			KM3_Attribute
			:name "implementation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_Process
			:type String
			:location "86:3-86:37"
		)]
	) ) ( def MetaH_Port ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "portName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_Port
			:type String
			:location "93:3-93:31"
		) ( struct-map
			KM3_Attribute
			:name "portCom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_Port
			:type String
			:location "94:3-94:30"
		) ( struct-map
			KM3_Attribute
			:name "portPackage"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_Port
			:type String
			:location "95:3-95:34"
		) ( struct-map
			KM3_Attribute
			:name "portType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_Port
			:type String
			:location "96:3-96:31"
		)]
	) ) ( def MetaH_Connection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MetaH_METAHEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "compSrc"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_Connection
			:type String
			:location "104:3-104:30"
		) ( struct-map
			KM3_Attribute
			:name "portSrc"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_Connection
			:type String
			:location "105:3-105:30"
		) ( struct-map
			KM3_Attribute
			:name "compDest"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_Connection
			:type String
			:location "106:3-106:31"
		) ( struct-map
			KM3_Attribute
			:name "portDest"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_Connection
			:type String
			:location "107:3-107:31"
		)]
	) ) ( def MetaH_MacroDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MetaH_METAHEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_MacroDeclaration
			:type String
			:location "116:3-116:27"
		) ( struct-map
			KM3_Reference
			:name "ports"
			:upper -1
			:lower 0
			:isOrdered true
			:owner MetaH_MacroDeclaration
			:type MetaH_Port
			:location "117:3-117:48"
			:isContainer true
		)]
	) ) ( def MetaH_MacroImplementation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MetaH_METAHEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "macroImpName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_MacroImplementation
			:type String
			:location "123:3-123:35"
		) ( struct-map
			KM3_Attribute
			:name "declaration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MetaH_MacroImplementation
			:type String
			:location "124:3-124:34"
		) ( struct-map
			KM3_Reference
			:name "process"
			:upper -1
			:lower 0
			:isOrdered true
			:owner MetaH_MacroImplementation
			:type MetaH_Process
			:location "125:3-125:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "connections"
			:upper -1
			:lower 0
			:isOrdered true
			:owner MetaH_MacroImplementation
			:type MetaH_Connection
			:location "126:3-126:60"
			:isContainer true
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "132:2-132:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "133:2-133:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "134:2-134:18"
	) )]
) )
