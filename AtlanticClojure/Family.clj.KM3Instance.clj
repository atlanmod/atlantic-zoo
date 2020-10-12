( declare Family_String )
( declare Family_Integer )
( declare Family_Family )
( declare Family_Person )
( def Family ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "10:2-10:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "11:2-11:19"
	) ) ( def Family_Family ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Family_Family
			:type String
			:location "14:3-14:27"
		) ( struct-map
			KM3_Reference
			:name "members"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Family_Family
			:type Family_Person
			:location "15:3-15:33"
			:isContainer false
		)]
	) ) ( def Family_Person ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "firstName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Family_Person
			:type String
			:location "19:3-19:32"
		) ( struct-map
			KM3_Attribute
			:name "emailAddresses"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Family_Person
			:type String
			:location "21:3-21:40"
		) ( struct-map
			KM3_Reference
			:name "closestFriend"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Family_Person
			:type Family_Person
			:location "20:3-20:36"
			:isContainer false
		)]
	) )]
) )
