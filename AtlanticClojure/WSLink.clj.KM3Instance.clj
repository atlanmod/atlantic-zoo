( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare WSLink_LocatedElement )
( declare WSLink_Network )
( declare WSLink_Services )
( declare WSLink_WebService )
( declare WSLink_RSS )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "10:2-10:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "12:2-12:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "14:2-14:18"
	) )]
) )
( def WSLink ( struct-map
	KM3_Package
	:contents[( def WSLink_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSLink_LocatedElement
			:type String
			:location "20:3-20:31"
		) ( struct-map
			KM3_Attribute
			:name "commentsBefore"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WSLink_LocatedElement
			:type String
			:location "21:3-21:48"
		) ( struct-map
			KM3_Attribute
			:name "commentsAfter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WSLink_LocatedElement
			:type String
			:location "22:3-22:47"
		)]
	) ) ( def WSLink_Network ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WSLink_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner WSLink_Network
			:type String
			:location "27:3-27:32"
		) ( struct-map
			KM3_Reference
			:name "services"
			:upper -1
			:lower 0
			:isOrdered true
			:owner WSLink_Network
			:type WSLink_Services
			:location "26:3-26:54"
			:isContainer true
		)]
	) ) ( def WSLink_Services ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[WSLink_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSLink_Services
			:type String
			:location "31:3-31:27"
		) ( struct-map
			KM3_Attribute
			:name "URL"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSLink_Services
			:type String
			:location "32:3-32:26"
		) ( struct-map
			KM3_Attribute
			:name "descriptions"
			:upper 1
			:lower 1
			:isOrdered false
			:owner WSLink_Services
			:type String
			:location "33:3-33:35"
		)]
	) ) ( def WSLink_WebService ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WSLink_Services]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "linkedServices"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WSLink_WebService
			:type WSLink_Services
			:location "37:3-37:42"
			:isContainer false
		)]
	) ) ( def WSLink_RSS ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[WSLink_Services]
		:structuralFeatures[]
	) )]
) )
