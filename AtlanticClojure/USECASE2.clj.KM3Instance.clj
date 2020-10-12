( declare USECASEUML_Requirement )
( declare USECASEUML_NonFunctionnelRequirement )
( declare USECASEUML_FunctionnelRequirement )
( declare USECASEUML_UseCase )
( declare USECASEUML_Goal )
( declare USECASEUML_Role )
( declare USECASEUML_HumanRole )
( declare USECASEUML_SystemRole )
( declare USECASEUML_EventRole )
( declare USECASEUML_Manage )
( declare USECASEUML_Resource )
( declare USECASEUML_ScenarioDescription )
( declare USECASEUML_Condition )
( declare USECASEUML_Pre )
( declare USECASEUML_Post )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def USECASEUML ( struct-map
	KM3_Package
	:contents[( def USECASEUML_Requirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def USECASEUML_NonFunctionnelRequirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[USECASEUML_Requirement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "scopes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner USECASEUML_NonFunctionnelRequirement
			:type USECASEUML_UseCase
			:location "17:3-17:55"
			:isContainer false
			:opposite scoped_by
		)]
	) ) ( def USECASEUML_FunctionnelRequirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[USECASEUML_Requirement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "specifies"
			:upper -1
			:lower 0
			:isOrdered false
			:owner USECASEUML_FunctionnelRequirement
			:type USECASEUML_UseCase
			:location "22:3-22:61"
			:isContainer false
			:opposite specified_by
		)]
	) ) ( def USECASEUML_UseCase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "scenario"
			:upper -1
			:lower 0
			:isOrdered false
			:owner USECASEUML_UseCase
			:type USECASEUML_ScenarioDescription
			:location "27:3-27:67"
			:isContainer false
			:opposite useCase
		) ( struct-map
			KM3_Reference
			:name "condition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner USECASEUML_UseCase
			:type USECASEUML_Condition
			:location "28:3-28:67"
			:isContainer false
			:opposite constrained_with
		) ( struct-map
			KM3_Reference
			:name "interacter"
			:upper -1
			:lower 0
			:isOrdered false
			:owner USECASEUML_UseCase
			:type USECASEUML_Role
			:location "29:3-29:62"
			:isContainer false
			:opposite interacted_with
		) ( struct-map
			KM3_Reference
			:name "specified_by"
			:upper -1
			:lower 0
			:isOrdered false
			:owner USECASEUML_UseCase
			:type USECASEUML_FunctionnelRequirement
			:location "30:3-30:76"
			:isContainer false
			:opposite specifies
		) ( struct-map
			KM3_Reference
			:name "scoped_by"
			:upper -1
			:lower 0
			:isOrdered false
			:owner USECASEUML_UseCase
			:type USECASEUML_NonFunctionnelRequirement
			:location "31:3-31:73"
			:isContainer false
			:opposite scopes
		) ( struct-map
			KM3_Reference
			:name "meet_by"
			:upper -1
			:lower 1
			:isOrdered false
			:owner USECASEUML_UseCase
			:type USECASEUML_Goal
			:location "32:3-32:53"
			:isContainer false
			:opposite to_meet
		)]
	) ) ( def USECASEUML_Goal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "to_meet"
			:upper -1
			:lower 1
			:isOrdered false
			:owner USECASEUML_Goal
			:type USECASEUML_UseCase
			:location "37:3-37:56"
			:isContainer false
			:opposite meet_by
		)]
	) ) ( def USECASEUML_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "interacted_with"
			:upper -1
			:lower 0
			:isOrdered false
			:owner USECASEUML_Role
			:type USECASEUML_UseCase
			:location "42:3-42:65"
			:isContainer false
			:opposite interacter
		)]
	) ) ( def USECASEUML_HumanRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[USECASEUML_Role]
		:structuralFeatures[]
	) ) ( def USECASEUML_SystemRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[USECASEUML_Role]
		:structuralFeatures[]
	) ) ( def USECASEUML_EventRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[USECASEUML_Role]
		:structuralFeatures[]
	) ) ( def USECASEUML_Manage ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[USECASEUML_UseCase]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "managed_Resource"
			:upper -1
			:lower 0
			:isOrdered false
			:owner USECASEUML_Manage
			:type USECASEUML_Resource
			:location "62:3-62:45"
			:isContainer false
		)]
	) ) ( def USECASEUML_Resource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def USECASEUML_ScenarioDescription ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "useCase"
			:upper 1
			:lower 1
			:isOrdered false
			:owner USECASEUML_ScenarioDescription
			:type USECASEUML_UseCase
			:location "72:3-72:51"
			:isContainer false
			:opposite scenario
		)]
	) ) ( def USECASEUML_Condition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constrained_with"
			:upper -1
			:lower 0
			:isOrdered false
			:owner USECASEUML_Condition
			:type USECASEUML_UseCase
			:location "77:3-77:65"
			:isContainer false
			:opposite condition
		)]
	) ) ( def USECASEUML_Pre ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[USECASEUML_Condition]
		:structuralFeatures[]
	) ) ( def USECASEUML_Post ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[USECASEUML_Condition]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "93:2-93:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "94:2-94:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "95:2-95:19"
	) )]
) )
