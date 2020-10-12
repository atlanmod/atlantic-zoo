( declare Klaper_Resource )
( declare Klaper_Service )
( declare Klaper_Behavior )
( declare Klaper_WorkLoad )
( declare Klaper_Step )
( declare Klaper_Start )
( declare Klaper_End )
( declare Klaper_Control )
( declare Klaper_InternalActivity )
( declare Klaper_ServiceCall )
( declare Klaper_ActualParam )
( declare Klaper_Branch )
( declare Klaper_Fork )
( declare Klaper_Join )
( declare Klaper_Acquire )
( declare Klaper_Release )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def Klaper ( struct-map
	KM3_Package
	:contents[( def Klaper_Resource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Resource
			:type String
			:location "12:3-12:27"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Resource
			:type String
			:location "13:3-13:27"
		) ( struct-map
			KM3_Attribute
			:name "capacity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Resource
			:type Integer
			:location "14:3-14:32"
		) ( struct-map
			KM3_Attribute
			:name "schedulingPolicy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Resource
			:type String
			:location "15:3-15:39"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Resource
			:type String
			:location "16:3-16:34"
		) ( struct-map
			KM3_Reference
			:name "acquire"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Resource
			:type Klaper_Acquire
			:location "17:3-17:51"
			:isContainer false
			:opposite resource
		) ( struct-map
			KM3_Reference
			:name "release"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Resource
			:type Klaper_Release
			:location "18:3-18:51"
			:isContainer false
			:opposite resource
		)]
	) ) ( def Klaper_Service ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Service
			:type String
			:location "23:3-23:27"
		) ( struct-map
			KM3_Attribute
			:name "formalParams"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Service
			:type String
			:location "24:3-24:35"
		) ( struct-map
			KM3_Attribute
			:name "speedAttr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Service
			:type String
			:location "25:3-25:32"
		) ( struct-map
			KM3_Attribute
			:name "failAttr"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Service
			:type String
			:location "26:3-26:31"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Service
			:type String
			:location "27:3-27:34"
		) ( struct-map
			KM3_Reference
			:name "behavior"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Klaper_Service
			:type Klaper_Behavior
			:location "28:3-28:58"
			:isContainer false
			:opposite service
		) ( struct-map
			KM3_Reference
			:name "behaviorUsed"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Klaper_Service
			:type Klaper_Behavior
			:location "29:3-29:64"
			:isContainer false
			:opposite usedService
		) ( struct-map
			KM3_Reference
			:name "serviceCall"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Klaper_Service
			:type Klaper_ServiceCall
			:location "30:3-30:68"
			:isContainer false
			:opposite calledService
		)]
	) ) ( def Klaper_Behavior ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "stepn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Behavior
			:type Klaper_Step
			:location "35:3-35:52"
			:isContainer false
			:opposite nestedBehavior
		) ( struct-map
			KM3_Reference
			:name "stepb"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Klaper_Behavior
			:type Klaper_Step
			:location "36:3-36:63"
			:isContainer true
			:opposite behavior
		) ( struct-map
			KM3_Reference
			:name "service"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Behavior
			:type Klaper_Service
			:location "37:3-37:51"
			:isContainer false
			:opposite behavior
		) ( struct-map
			KM3_Reference
			:name "usedService"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Klaper_Behavior
			:type Klaper_Service
			:location "38:3-38:63"
			:isContainer false
			:opposite behaviorUsed
		) ( struct-map
			KM3_Reference
			:name "workLoad"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Klaper_Behavior
			:type Klaper_WorkLoad
			:location "39:3-39:59"
			:isContainer false
			:opposite behavior
		)]
	) ) ( def Klaper_WorkLoad ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "workLoadType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_WorkLoad
			:type String
			:location "44:3-44:35"
		) ( struct-map
			KM3_Attribute
			:name "arrivalProcess"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_WorkLoad
			:type String
			:location "45:3-45:37"
		) ( struct-map
			KM3_Attribute
			:name "population"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_WorkLoad
			:type String
			:location "46:3-46:33"
		) ( struct-map
			KM3_Attribute
			:name "initialResource"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_WorkLoad
			:type String
			:location "47:3-47:38"
		) ( struct-map
			KM3_Reference
			:name "behavior"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_WorkLoad
			:type Klaper_Behavior
			:location "48:3-48:54"
			:isContainer false
			:opposite workLoad
		)]
	) ) ( def Klaper_Step ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Klaper_Behavior]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Step
			:type String
			:location "53:3-53:27"
		) ( struct-map
			KM3_Attribute
			:name "repetition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Step
			:type String
			:location "54:3-54:33"
		) ( struct-map
			KM3_Attribute
			:name "internalExecTime"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Step
			:type String
			:location "55:3-55:39"
		) ( struct-map
			KM3_Attribute
			:name "internalFailProb"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Step
			:type String
			:location "56:3-56:39"
		) ( struct-map
			KM3_Attribute
			:name "completionModel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Step
			:type String
			:location "57:3-57:38"
		) ( struct-map
			KM3_Reference
			:name "serviceCall"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Klaper_Step
			:type Klaper_ServiceCall
			:location "58:4-58:70"
			:isContainer true
			:opposite step
		) ( struct-map
			KM3_Reference
			:name "predecessor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Klaper_Step
			:type Klaper_Step
			:location "59:4-59:58"
			:isContainer false
			:opposite successor
		) ( struct-map
			KM3_Reference
			:name "successor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Klaper_Step
			:type Klaper_Step
			:location "60:4-60:58"
			:isContainer false
			:opposite predecessor
		) ( struct-map
			KM3_Reference
			:name "behavior"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Step
			:type Klaper_Behavior
			:location "61:4-61:51"
			:isContainer false
			:opposite stepb
		) ( struct-map
			KM3_Reference
			:name "nestedBehavior"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Klaper_Step
			:type Klaper_Behavior
			:location "62:4-62:63"
			:isContainer false
			:opposite stepn
		)]
	) ) ( def Klaper_Start ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Klaper_Step]
		:structuralFeatures[]
	) ) ( def Klaper_End ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Klaper_Step]
		:structuralFeatures[]
	) ) ( def Klaper_Control ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Klaper_Step]
		:structuralFeatures[]
	) ) ( def Klaper_InternalActivity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Klaper_Step]
		:structuralFeatures[]
	) ) ( def Klaper_ServiceCall ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Klaper_Step]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "resourceType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_ServiceCall
			:type String
			:location "87:3-87:35"
		) ( struct-map
			KM3_Attribute
			:name "serviceName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_ServiceCall
			:type String
			:location "88:3-88:34"
		) ( struct-map
			KM3_Attribute
			:name "isSynch"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_ServiceCall
			:type Boolean
			:location "89:3-89:31"
		) ( struct-map
			KM3_Reference
			:name "actualParam"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Klaper_ServiceCall
			:type Klaper_ActualParam
			:location "90:3-90:73"
			:isContainer false
			:opposite serviceCall
		) ( struct-map
			KM3_Reference
			:name "step"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_ServiceCall
			:type Klaper_Step
			:location "91:3-91:49"
			:isContainer false
			:opposite serviceCall
		) ( struct-map
			KM3_Reference
			:name "calledService"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Klaper_ServiceCall
			:type Klaper_Service
			:location "92:3-92:66"
			:isContainer false
			:opposite serviceCall
		)]
	) ) ( def Klaper_ActualParam ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_ActualParam
			:type String
			:location "97:3-97:28"
		) ( struct-map
			KM3_Reference
			:name "serviceCall"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_ActualParam
			:type Klaper_ServiceCall
			:location "98:3-98:62"
			:isContainer false
			:opposite actualParam
		)]
	) ) ( def Klaper_Branch ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Klaper_Control]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "branchProbs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Branch
			:type String
			:location "103:3-103:34"
		)]
	) ) ( def Klaper_Fork ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Klaper_Control]
		:structuralFeatures[]
	) ) ( def Klaper_Join ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Klaper_Control]
		:structuralFeatures[]
	) ) ( def Klaper_Acquire ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Klaper_Control]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "resourceUnits"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Acquire
			:type String
			:location "118:3-118:36"
		) ( struct-map
			KM3_Reference
			:name "resource"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Acquire
			:type Klaper_Resource
			:location "119:3-119:52"
			:isContainer false
			:opposite acquire
		)]
	) ) ( def Klaper_Release ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Klaper_Control]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "resourceUnits"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Release
			:type String
			:location "124:3-124:36"
		) ( struct-map
			KM3_Reference
			:name "resource"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Klaper_Release
			:type Klaper_Resource
			:location "125:3-125:52"
			:isContainer false
			:opposite release
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "132:2-132:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "133:2-133:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "134:2-134:19"
	) )]
) )
