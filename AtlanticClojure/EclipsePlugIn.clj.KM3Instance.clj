( declare EclipsePlugIn_Application )
( declare EclipsePlugIn_ExtensionPoint )
( declare EclipsePlugIn_Description )
( declare EclipsePlugIn_Extension )
( declare EclipsePlugIn_PlugIn )
( declare EclipsePlugIn_Librairy )
( declare EclipsePlugIn_Class )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def EclipsePlugIn ( struct-map
	KM3_Package
	:contents[( def EclipsePlugIn_Application ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_Application
			:type String
			:location "12:3-12:27"
		) ( struct-map
			KM3_Attribute
			:name "version"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_Application
			:type String
			:location "13:3-13:30"
		) ( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_Application
			:type String
			:location "14:3-14:29"
		) ( struct-map
			KM3_Reference
			:name "extensionPoints"
			:upper -1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_Application
			:type EclipsePlugIn_ExtensionPoint
			:location "15:3-15:84"
			:isContainer true
			:opposite application
		)]
	) ) ( def EclipsePlugIn_ExtensionPoint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_ExtensionPoint
			:type String
			:location "19:3-19:27"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_ExtensionPoint
			:type String
			:location "20:3-20:25"
		) ( struct-map
			KM3_Reference
			:name "application"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_ExtensionPoint
			:type EclipsePlugIn_Application
			:location "21:3-21:66"
			:isContainer false
			:opposite extensionPoints
		) ( struct-map
			KM3_Reference
			:name "descriptions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner EclipsePlugIn_ExtensionPoint
			:type EclipsePlugIn_Description
			:location "22:3-22:70"
			:isContainer false
			:opposite extensionPoints
		) ( struct-map
			KM3_Reference
			:name "plugIn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_ExtensionPoint
			:type EclipsePlugIn_PlugIn
			:location "23:3-23:56"
			:isContainer false
			:opposite extensionPoints
		)]
	) ) ( def EclipsePlugIn_Description ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "xmlSchema"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_Description
			:type String
			:location "27:3-27:32"
		) ( struct-map
			KM3_Reference
			:name "extensionPoints"
			:upper -1
			:lower 0
			:isOrdered false
			:owner EclipsePlugIn_Description
			:type EclipsePlugIn_ExtensionPoint
			:location "28:3-28:73"
			:isContainer false
			:opposite descriptions
		)]
	) ) ( def EclipsePlugIn_Extension ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_Extension
			:type String
			:location "32:3-32:27"
		) ( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_Extension
			:type String
			:location "33:3-33:25"
		) ( struct-map
			KM3_Reference
			:name "isConfiguredInto"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_Extension
			:type EclipsePlugIn_ExtensionPoint
			:location "34:3-34:47"
			:isContainer false
		)]
	) ) ( def EclipsePlugIn_PlugIn ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_PlugIn
			:type String
			:location "38:3-38:25"
		) ( struct-map
			KM3_Attribute
			:name "displayableName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_PlugIn
			:type String
			:location "39:3-39:38"
		) ( struct-map
			KM3_Attribute
			:name "version"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_PlugIn
			:type String
			:location "40:3-40:30"
		) ( struct-map
			KM3_Attribute
			:name "supplier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_PlugIn
			:type String
			:location "41:3-41:31"
		) ( struct-map
			KM3_Reference
			:name "configures"
			:upper -1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_PlugIn
			:type EclipsePlugIn_Extension
			:location "42:3-42:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "extensionPoints"
			:upper -1
			:lower 0
			:isOrdered false
			:owner EclipsePlugIn_PlugIn
			:type EclipsePlugIn_ExtensionPoint
			:location "43:3-43:77"
			:isContainer true
			:opposite plugIn
		) ( struct-map
			KM3_Reference
			:name "requires"
			:upper -1
			:lower 0
			:isOrdered false
			:owner EclipsePlugIn_PlugIn
			:type EclipsePlugIn_PlugIn
			:location "45:3-45:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "uses"
			:upper -1
			:lower 0
			:isOrdered false
			:owner EclipsePlugIn_PlugIn
			:type EclipsePlugIn_Librairy
			:location "46:3-46:50"
			:isContainer false
			:opposite plugIn
		)]
	) ) ( def EclipsePlugIn_Librairy ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_Librairy
			:type String
			:location "51:3-51:27"
		) ( struct-map
			KM3_Reference
			:name "plugIn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_Librairy
			:type EclipsePlugIn_PlugIn
			:location "52:3-52:45"
			:isContainer false
			:opposite uses
		) ( struct-map
			KM3_Reference
			:name "classes"
			:upper -1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_Librairy
			:type EclipsePlugIn_Class
			:location "53:3-53:64"
			:isContainer true
			:opposite librairy
		)]
	) ) ( def EclipsePlugIn_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_Class
			:type String
			:location "57:3-57:27"
		) ( struct-map
			KM3_Reference
			:name "librairy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipsePlugIn_Class
			:type EclipsePlugIn_Librairy
			:location "58:3-58:52"
			:isContainer false
			:opposite classes
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "64:2-64:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "65:2-65:18"
	) )]
) )
