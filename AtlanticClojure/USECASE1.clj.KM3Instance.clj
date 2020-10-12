( declare USECASE1_Task )
( declare USECASE1_User )
( declare USECASE1_Actor )
( declare USECASE1_Goal )
( declare USECASE1_UseCase )
( declare USECASE1_Service )
( declare USECASE1_Scenario )
( declare USECASE1_Context )
( declare USECASE1_PreCondition )
( declare USECASE1_PostCondition )
( declare USECASE1_Episode )
( declare USECASE1_Event )
( declare USECASE1_Action )
( declare USECASE1_Responce )
( declare USECASE1_Stimilus )
( declare USECASE1_Parameter )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def USECASE1 ( struct-map
	KM3_Package
	:contents[( def USECASE1_Task ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "service"
			:upper -1
			:lower 1
			:isOrdered false
			:owner USECASE1_Task
			:type USECASE1_Service
			:location "12:3-12:52"
			:isContainer false
			:opposite task
		)]
	) ) ( def USECASE1_User ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "useCase"
			:upper -1
			:lower 1
			:isOrdered false
			:owner USECASE1_User
			:type USECASE1_UseCase
			:location "17:3-17:52"
			:isContainer false
			:opposite user
		) ( struct-map
			KM3_Reference
			:name "actor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner USECASE1_User
			:type USECASE1_Actor
			:location "18:3-18:46"
			:isContainer false
			:opposite user
		)]
	) ) ( def USECASE1_Actor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "useCase"
			:upper -1
			:lower 1
			:isOrdered false
			:owner USECASE1_Actor
			:type USECASE1_UseCase
			:location "23:3-23:53"
			:isContainer false
			:opposite actor
		) ( struct-map
			KM3_Reference
			:name "goal"
			:upper -1
			:lower 0
			:isOrdered false
			:owner USECASE1_Actor
			:type USECASE1_Goal
			:location "24:3-24:45"
			:isContainer false
			:opposite actor
		) ( struct-map
			KM3_Reference
			:name "user"
			:upper -1
			:lower 0
			:isOrdered false
			:owner USECASE1_Actor
			:type USECASE1_User
			:location "25:3-25:45"
			:isContainer false
			:opposite actor
		)]
	) ) ( def USECASE1_Goal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "service"
			:upper -1
			:lower 1
			:isOrdered false
			:owner USECASE1_Goal
			:type USECASE1_Service
			:location "30:3-30:52"
			:isContainer false
			:opposite goal
		) ( struct-map
			KM3_Reference
			:name "actor"
			:upper -1
			:lower 1
			:isOrdered false
			:owner USECASE1_Goal
			:type USECASE1_Actor
			:location "31:3-31:48"
			:isContainer false
			:opposite goal
		)]
	) ) ( def USECASE1_UseCase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "context"
			:upper 1
			:lower 0
			:isOrdered false
			:owner USECASE1_UseCase
			:type USECASE1_Context
			:location "36:3-36:64"
			:isContainer true
			:opposite useCase
		) ( struct-map
			KM3_Reference
			:name "service"
			:upper -1
			:lower 0
			:isOrdered false
			:owner USECASE1_UseCase
			:type USECASE1_Service
			:location "37:3-37:53"
			:isContainer false
			:opposite useCase
		) ( struct-map
			KM3_Reference
			:name "user"
			:upper -1
			:lower 0
			:isOrdered false
			:owner USECASE1_UseCase
			:type USECASE1_User
			:location "38:3-38:47"
			:isContainer false
			:opposite useCase
		) ( struct-map
			KM3_Reference
			:name "actor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner USECASE1_UseCase
			:type USECASE1_Actor
			:location "39:3-39:49"
			:isContainer false
			:opposite useCase
		)]
	) ) ( def USECASE1_Service ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "useCase"
			:upper -1
			:lower 1
			:isOrdered false
			:owner USECASE1_Service
			:type USECASE1_UseCase
			:location "44:3-44:55"
			:isContainer false
			:opposite service
		) ( struct-map
			KM3_Reference
			:name "goal"
			:upper -1
			:lower 1
			:isOrdered false
			:owner USECASE1_Service
			:type USECASE1_Goal
			:location "45:3-45:49"
			:isContainer false
			:opposite service
		) ( struct-map
			KM3_Reference
			:name "task"
			:upper -1
			:lower 1
			:isOrdered false
			:owner USECASE1_Service
			:type USECASE1_Task
			:location "46:3-46:49"
			:isContainer false
			:opposite service
		)]
	) ) ( def USECASE1_Scenario ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def USECASE1_Context ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "preCondition"
			:upper -1
			:lower 1
			:isOrdered false
			:owner USECASE1_Context
			:type USECASE1_PreCondition
			:location "56:3-56:65"
			:isContainer false
			:opposite context
		) ( struct-map
			KM3_Reference
			:name "postCondition"
			:upper -1
			:lower 1
			:isOrdered false
			:owner USECASE1_Context
			:type USECASE1_PostCondition
			:location "57:3-57:67"
			:isContainer false
			:opposite context
		) ( struct-map
			KM3_Reference
			:name "useCase"
			:upper -1
			:lower 1
			:isOrdered false
			:owner USECASE1_Context
			:type USECASE1_UseCase
			:location "58:3-58:55"
			:isContainer false
			:opposite context
		)]
	) ) ( def USECASE1_PreCondition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "context"
			:upper -1
			:lower 0
			:isOrdered false
			:owner USECASE1_PreCondition
			:type USECASE1_Context
			:location "63:3-63:60"
			:isContainer false
			:opposite preCondition
		)]
	) ) ( def USECASE1_PostCondition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "context"
			:upper -1
			:lower 0
			:isOrdered false
			:owner USECASE1_PostCondition
			:type USECASE1_Context
			:location "68:3-68:61"
			:isContainer false
			:opposite postCondition
		)]
	) ) ( def USECASE1_Episode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "event"
			:upper -1
			:lower 0
			:isOrdered false
			:owner USECASE1_Episode
			:type USECASE1_Event
			:location "73:3-73:51"
			:isContainer false
			:opposite episode
		)]
	) ) ( def USECASE1_Event ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "episode"
			:upper -1
			:lower 1
			:isOrdered false
			:owner USECASE1_Event
			:type USECASE1_Episode
			:location "78:3-78:53"
			:isContainer false
			:opposite event
		)]
	) ) ( def USECASE1_Action ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[USECASE1_Event]
		:structuralFeatures[]
	) ) ( def USECASE1_Responce ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[USECASE1_Event]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "parameter"
			:upper -1
			:lower 0
			:isOrdered false
			:owner USECASE1_Responce
			:type USECASE1_Parameter
			:location "88:3-88:69"
			:isContainer true
			:opposite responce
		)]
	) ) ( def USECASE1_Stimilus ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[USECASE1_Event]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "parameter"
			:upper -1
			:lower 0
			:isOrdered false
			:owner USECASE1_Stimilus
			:type USECASE1_Parameter
			:location "93:3-93:69"
			:isContainer true
			:opposite stimilus
		)]
	) ) ( def USECASE1_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "stimilus"
			:upper -1
			:lower 1
			:isOrdered false
			:owner USECASE1_Parameter
			:type USECASE1_Stimilus
			:location "98:3-98:59"
			:isContainer false
			:opposite parameter
		) ( struct-map
			KM3_Reference
			:name "responce"
			:upper -1
			:lower 1
			:isOrdered false
			:owner USECASE1_Parameter
			:type USECASE1_Responce
			:location "99:3-99:59"
			:isContainer false
			:opposite parameter
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "106:2-106:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "107:2-107:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "108:2-108:19"
	) )]
) )
