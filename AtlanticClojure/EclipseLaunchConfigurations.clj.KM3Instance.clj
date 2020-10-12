( declare EclipseLaunchConfigurations_LaunchConfiguration )
( declare EclipseLaunchConfigurations_Attribute )
( declare EclipseLaunchConfigurations_StringAttribute )
( declare EclipseLaunchConfigurations_BooleanAttribute )
( declare EclipseLaunchConfigurations_MapAttribute )
( declare EclipseLaunchConfigurations_MapEntry )
( declare EclipseLaunchConfigurations_ListAttribute )
( declare EclipseLaunchConfigurations_ListEntry )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( def EclipseLaunchConfigurations ( struct-map
	KM3_Package
	:contents[( def EclipseLaunchConfigurations_LaunchConfiguration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipseLaunchConfigurations_LaunchConfiguration
			:type String
			:location "12:3-12:27"
		) ( struct-map
			KM3_Reference
			:name "attributes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner EclipseLaunchConfigurations_LaunchConfiguration
			:type EclipseLaunchConfigurations_Attribute
			:location "13:3-13:59"
			:isContainer true
		)]
	) ) ( def EclipseLaunchConfigurations_Attribute ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipseLaunchConfigurations_Attribute
			:type String
			:location "17:3-17:26"
		)]
	) ) ( def EclipseLaunchConfigurations_StringAttribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EclipseLaunchConfigurations_Attribute]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipseLaunchConfigurations_StringAttribute
			:type String
			:location "21:3-21:28"
		)]
	) ) ( def EclipseLaunchConfigurations_BooleanAttribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EclipseLaunchConfigurations_Attribute]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipseLaunchConfigurations_BooleanAttribute
			:type Boolean
			:location "25:3-25:29"
		)]
	) ) ( def EclipseLaunchConfigurations_MapAttribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EclipseLaunchConfigurations_Attribute]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "entries"
			:upper -1
			:lower 0
			:isOrdered true
			:owner EclipseLaunchConfigurations_MapAttribute
			:type EclipseLaunchConfigurations_MapEntry
			:location "29:3-29:79"
			:isContainer true
			:opposite mapAttribute
		)]
	) ) ( def EclipseLaunchConfigurations_MapEntry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EclipseLaunchConfigurations_StringAttribute]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mapAttribute"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipseLaunchConfigurations_MapEntry
			:type EclipseLaunchConfigurations_MapAttribute
			:location "33:3-33:60"
			:isContainer false
			:opposite entries
		)]
	) ) ( def EclipseLaunchConfigurations_ListAttribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EclipseLaunchConfigurations_Attribute]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "entries"
			:upper -1
			:lower 0
			:isOrdered true
			:owner EclipseLaunchConfigurations_ListAttribute
			:type EclipseLaunchConfigurations_ListEntry
			:location "37:3-37:81"
			:isContainer true
			:opposite listAttribute
		)]
	) ) ( def EclipseLaunchConfigurations_ListEntry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipseLaunchConfigurations_ListEntry
			:type String
			:location "42:3-42:28"
		) ( struct-map
			KM3_Reference
			:name "listAttribute"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EclipseLaunchConfigurations_ListEntry
			:type EclipseLaunchConfigurations_ListAttribute
			:location "41:3-41:62"
			:isContainer false
			:opposite entries
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "48:2-48:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "49:2-49:19"
	) )]
) )
