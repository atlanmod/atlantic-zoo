( declare SeminarSchedulingSystem_SeminarSchedulingSystem )
( declare SeminarSchedulingSystem_Presenter )
( declare SeminarSchedulingSystem_Seminar )
( declare SeminarSchedulingSystem_Offering )
( declare SeminarSchedulingSystem_Date )
( declare SeminarSchedulingSystem_Attendee )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def SeminarSchedulingSystem ( struct-map
	KM3_Package
	:contents[( def SeminarSchedulingSystem_SeminarSchedulingSystem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "presenter"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SeminarSchedulingSystem_SeminarSchedulingSystem
			:type SeminarSchedulingSystem_Presenter
			:location "17:3-17:74"
			:isContainer false
			:opposite seminarSchedulingSystem
		) ( struct-map
			KM3_Reference
			:name "seminar"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SeminarSchedulingSystem_SeminarSchedulingSystem
			:type SeminarSchedulingSystem_Seminar
			:location "18:3-18:70"
			:isContainer false
			:opposite seminarSchedulingSystem
		)]
	) ) ( def SeminarSchedulingSystem_Presenter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SeminarSchedulingSystem_Presenter
			:type String
			:location "22:3-22:27"
		) ( struct-map
			KM3_Reference
			:name "seminarSchedulingSystem"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SeminarSchedulingSystem_Presenter
			:type SeminarSchedulingSystem_SeminarSchedulingSystem
			:location "23:3-23:84"
			:isContainer false
			:opposite presenter
		) ( struct-map
			KM3_Reference
			:name "qualifiedFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SeminarSchedulingSystem_Presenter
			:type SeminarSchedulingSystem_Seminar
			:location "24:3-24:61"
			:isContainer false
			:opposite qualified
		) ( struct-map
			KM3_Reference
			:name "offering"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SeminarSchedulingSystem_Presenter
			:type SeminarSchedulingSystem_Offering
			:location "25:3-25:66"
			:isContainer false
			:opposite presenter
		)]
	) ) ( def SeminarSchedulingSystem_Seminar ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SeminarSchedulingSystem_Seminar
			:type String
			:location "29:3-29:28"
		) ( struct-map
			KM3_Reference
			:name "seminarSchedulingSystem"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SeminarSchedulingSystem_Seminar
			:type SeminarSchedulingSystem_SeminarSchedulingSystem
			:location "30:3-30:82"
			:isContainer false
			:opposite seminar
		) ( struct-map
			KM3_Reference
			:name "qualified"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SeminarSchedulingSystem_Seminar
			:type SeminarSchedulingSystem_Presenter
			:location "31:3-31:63"
			:isContainer false
			:opposite qualifiedFor
		) ( struct-map
			KM3_Reference
			:name "offering"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SeminarSchedulingSystem_Seminar
			:type SeminarSchedulingSystem_Offering
			:location "32:3-32:64"
			:isContainer false
			:opposite seminar
		)]
	) ) ( def SeminarSchedulingSystem_Offering ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "is_cancelled"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SeminarSchedulingSystem_Offering
			:type Boolean
			:location "36:3-36:36"
		) ( struct-map
			KM3_Reference
			:name "date"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SeminarSchedulingSystem_Offering
			:type SeminarSchedulingSystem_Date
			:location "37:3-37:25"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "attendee"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SeminarSchedulingSystem_Offering
			:type SeminarSchedulingSystem_Attendee
			:location "38:3-38:57"
			:isContainer false
			:opposite offering
		) ( struct-map
			KM3_Reference
			:name "presenter"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SeminarSchedulingSystem_Offering
			:type SeminarSchedulingSystem_Presenter
			:location "39:3-39:61"
			:isContainer false
			:opposite offering
		) ( struct-map
			KM3_Reference
			:name "seminar"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SeminarSchedulingSystem_Offering
			:type SeminarSchedulingSystem_Seminar
			:location "40:3-40:57"
			:isContainer false
			:opposite offering
		)]
	) ) ( def SeminarSchedulingSystem_Date ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SeminarSchedulingSystem_Date
			:type Integer
			:location "44:3-44:28"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SeminarSchedulingSystem_Date
			:type Integer
			:location "45:3-45:29"
		) ( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SeminarSchedulingSystem_Date
			:type Integer
			:location "46:3-46:27"
		)]
	) ) ( def SeminarSchedulingSystem_Attendee ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SeminarSchedulingSystem_Attendee
			:type String
			:location "50:3-50:27"
		) ( struct-map
			KM3_Reference
			:name "offering"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SeminarSchedulingSystem_Attendee
			:type SeminarSchedulingSystem_Offering
			:location "51:3-51:57"
			:isContainer false
			:opposite attendee
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "56:2-56:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "57:2-57:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "58:2-58:18"
	) )]
) )
