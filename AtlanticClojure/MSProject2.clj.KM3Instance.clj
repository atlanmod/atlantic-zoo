( declare MSProject_MSPProject )
( declare MSProject_MSPTask )
( declare MSProject_MSPLink )
( declare MSProject_MSPAssignment )
( declare MSProject_MSPResource )
( declare MSProject_MSPHumanResource )
( declare MSProject_MSPMachine )
( declare MSProject_Date )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Double )
( declare PrimitiveTypes_String )
( def MSProject ( struct-map
	KM3_Package
	:contents[( def MSProject_MSPProject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "resource"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MSProject_MSPProject
			:type MSProject_MSPResource
			:location "12:3-12:68"
			:isContainer true
			:opposite project
		) ( struct-map
			KM3_Reference
			:name "link"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MSProject_MSPProject
			:type MSProject_MSPLink
			:location "13:3-13:60"
			:isContainer true
			:opposite project
		) ( struct-map
			KM3_Reference
			:name "task"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MSProject_MSPProject
			:type MSProject_MSPTask
			:location "14:3-14:60"
			:isContainer true
			:opposite project
		)]
	) ) ( def MSProject_MSPTask ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "finishDate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MSProject_MSPTask
			:type Date
			:location "18:3-18:31"
		) ( struct-map
			KM3_Attribute
			:name "startDate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MSProject_MSPTask
			:type Date
			:location "19:3-19:30"
		) ( struct-map
			KM3_Reference
			:name "project"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MSProject_MSPTask
			:type MSProject_MSPProject
			:location "20:3-20:50"
			:isContainer false
			:opposite task
		) ( struct-map
			KM3_Reference
			:name "superTask"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MSProject_MSPTask
			:type MSProject_MSPTask
			:location "21:3-21:57"
			:isContainer false
			:opposite subTask
		) ( struct-map
			KM3_Reference
			:name "subTask"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MSProject_MSPTask
			:type MSProject_MSPTask
			:location "22:3-22:55"
			:isContainer false
			:opposite superTask
		) ( struct-map
			KM3_Reference
			:name "assignment"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MSProject_MSPTask
			:type MSProject_MSPAssignment
			:location "23:3-23:59"
			:isContainer false
			:opposite task
		) ( struct-map
			KM3_Reference
			:name "inLink"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MSProject_MSPTask
			:type MSProject_MSPLink
			:location "24:3-24:49"
			:isContainer false
			:opposite succ
		) ( struct-map
			KM3_Reference
			:name "outLink"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MSProject_MSPTask
			:type MSProject_MSPLink
			:location "25:3-25:50"
			:isContainer false
			:opposite pred
		)]
	) ) ( def MSProject_MSPLink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "project"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MSProject_MSPLink
			:type MSProject_MSPProject
			:location "29:3-29:50"
			:isContainer false
			:opposite link
		) ( struct-map
			KM3_Reference
			:name "succ"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MSProject_MSPLink
			:type MSProject_MSPTask
			:location "30:3-30:46"
			:isContainer false
			:opposite inLink
		) ( struct-map
			KM3_Reference
			:name "pred"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MSProject_MSPLink
			:type MSProject_MSPTask
			:location "31:3-31:47"
			:isContainer false
			:opposite outLink
		)]
	) ) ( def MSProject_MSPAssignment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "task"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MSProject_MSPAssignment
			:type MSProject_MSPTask
			:location "35:3-35:50"
			:isContainer false
			:opposite assignment
		) ( struct-map
			KM3_Reference
			:name "resource"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MSProject_MSPAssignment
			:type MSProject_MSPResource
			:location "36:3-36:58"
			:isContainer false
			:opposite assignment
		)]
	) ) ( def MSProject_MSPResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "cost"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MSProject_MSPResource
			:type Double
			:location "40:3-40:27"
		) ( struct-map
			KM3_Reference
			:name "project"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MSProject_MSPResource
			:type MSProject_MSPProject
			:location "41:3-41:54"
			:isContainer false
			:opposite resource
		) ( struct-map
			KM3_Reference
			:name "assignment"
			:upper -1
			:lower 0
			:isOrdered false
			:owner MSProject_MSPResource
			:type MSProject_MSPAssignment
			:location "42:3-42:63"
			:isContainer false
			:opposite resource
		)]
	) ) ( def MSProject_MSPHumanResource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MSProject_MSPResource]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "email"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MSProject_MSPHumanResource
			:type String
			:location "46:3-46:28"
		)]
	) ) ( def MSProject_MSPMachine ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[MSProject_MSPResource]
		:structuralFeatures[]
	) ) ( def MSProject_Date ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MSProject_Date
			:type Integer
			:location "52:3-52:27"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MSProject_Date
			:type Integer
			:location "53:3-53:29"
		) ( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MSProject_Date
			:type Integer
			:location "54:3-54:28"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "60:2-60:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "61:2-61:18"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "62:2-62:18"
	) )]
) )
