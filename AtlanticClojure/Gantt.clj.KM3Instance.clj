( declare Gantt_Project )
( declare Gantt_Tasks )
( declare Gantt_Task )
( declare Gantt_Depend )
( declare Gantt_Ressource )
( declare Gantt_Date )
( declare Gantt_Allocation )
( declare Gantt_Vacation )
( declare Gantt_Description )
( declare Gantt_Previous )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Boolean )
( def Gantt ( struct-map
	KM3_Package
	:contents[( def Gantt_Project ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Project
			:type String
			:location "23:3-23:27"
		) ( struct-map
			KM3_Attribute
			:name "company"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Project
			:type String
			:location "24:3-24:30"
		) ( struct-map
			KM3_Attribute
			:name "viewDate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Project
			:type Date
			:location "25:3-25:29"
		) ( struct-map
			KM3_Attribute
			:name "viewIndex"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Project
			:type Date
			:location "26:3-26:30"
		) ( struct-map
			KM3_Attribute
			:name "ganttDividerLocation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Project
			:type Integer
			:location "27:3-27:44"
		) ( struct-map
			KM3_Attribute
			:name "ressourceDividerLocation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Project
			:type Integer
			:location "28:3-28:48"
		) ( struct-map
			KM3_Attribute
			:name "webLink"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Project
			:type String
			:location "29:3-29:30"
		) ( struct-map
			KM3_Reference
			:name "tasks"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Project
			:type Gantt_Tasks
			:location "30:3-30:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ressources"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Gantt_Project
			:type Gantt_Ressource
			:location "31:3-31:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "allocations"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Gantt_Project
			:type Gantt_Allocation
			:location "32:3-32:59"
			:isContainer true
		)]
	) ) ( def Gantt_Tasks ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "color"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Tasks
			:type String
			:location "36:3-36:28"
		) ( struct-map
			KM3_Reference
			:name "tasks"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Gantt_Tasks
			:type Gantt_Task
			:location "37:3-37:47"
			:isContainer true
		)]
	) ) ( def Gantt_Task ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Task
			:type String
			:location "41:3-41:25"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Task
			:type String
			:location "42:3-42:27"
		) ( struct-map
			KM3_Attribute
			:name "meeting"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Task
			:type Boolean
			:location "43:3-43:31"
		) ( struct-map
			KM3_Attribute
			:name "color"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Task
			:type String
			:location "44:3-44:29"
		) ( struct-map
			KM3_Attribute
			:name "expand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Task
			:type Boolean
			:location "45:3-45:30"
		) ( struct-map
			KM3_Attribute
			:name "complete"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Task
			:type Integer
			:location "46:3-46:32"
		) ( struct-map
			KM3_Attribute
			:name "duration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Task
			:type Integer
			:location "47:3-47:32"
		) ( struct-map
			KM3_Attribute
			:name "priority"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Task
			:type Integer
			:location "48:3-48:32"
		) ( struct-map
			KM3_Attribute
			:name "start"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Task
			:type Date
			:location "49:3-49:26"
		) ( struct-map
			KM3_Reference
			:name "depends"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Gantt_Task
			:type Gantt_Depend
			:location "50:3-50:51"
			:isContainer true
		)]
	) ) ( def Gantt_Depend ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Depend
			:type String
			:location "54:3-54:25"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Depend
			:type Integer
			:location "55:3-55:28"
		) ( struct-map
			KM3_Attribute
			:name "difference"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Depend
			:type Integer
			:location "56:3-56:34"
		) ( struct-map
			KM3_Attribute
			:name "hardness"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Depend
			:type String
			:location "57:3-57:31"
		) ( struct-map
			KM3_Reference
			:name "task"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Depend
			:type Gantt_Task
			:location "58:3-58:25"
			:isContainer false
		)]
	) ) ( def Gantt_Ressource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "Id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Ressource
			:type String
			:location "62:3-62:25"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Ressource
			:type String
			:location "63:3-63:27"
		) ( struct-map
			KM3_Attribute
			:name "fonction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Ressource
			:type String
			:location "64:3-64:30"
		) ( struct-map
			KM3_Attribute
			:name "contact"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Ressource
			:type String
			:location "65:3-65:30"
		) ( struct-map
			KM3_Attribute
			:name "phone"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Ressource
			:type String
			:location "66:3-66:28"
		)]
	) ) ( def Gantt_Date ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Date
			:type Integer
			:location "70:3-70:28"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Date
			:type Integer
			:location "71:3-71:29"
		) ( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Date
			:type Integer
			:location "72:3-72:27"
		)]
	) ) ( def Gantt_Allocation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "taskId"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Allocation
			:type String
			:location "76:3-76:29"
		) ( struct-map
			KM3_Attribute
			:name "ressourceId"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Allocation
			:type String
			:location "77:3-77:34"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Allocation
			:type String
			:location "78:3-78:27"
		) ( struct-map
			KM3_Attribute
			:name "function"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Allocation
			:type String
			:location "79:3-79:31"
		) ( struct-map
			KM3_Attribute
			:name "responsible"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Allocation
			:type Boolean
			:location "80:3-80:35"
		) ( struct-map
			KM3_Attribute
			:name "load"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Gantt_Allocation
			:type Integer
			:location "81:3-81:28"
		)]
	) ) ( def Gantt_Vacation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Gantt_Description ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Gantt_Previous ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "93:2-93:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "94:2-94:19"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "95:2-95:19"
	) )]
) )
