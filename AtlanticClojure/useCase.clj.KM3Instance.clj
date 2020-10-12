( declare UseCase_Actor )
( declare UseCase_UseCase )
( declare UseCase_Extend )
( declare UseCase_Include )
( declare UseCase_UseCaseContainer )
( declare UseCase_BehavioredClassifier )
( declare UseCase_NamedElement )
( declare UseCase_Association )
( declare PrimitiveTypes_String )
( def UseCase ( struct-map
	KM3_Package
	:contents[( def UseCase_Actor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UseCase_NamedElement]
		:structuralFeatures[]
	) ) ( def UseCase_UseCase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UseCase_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "include"
			:upper -1
			:lower 1
			:isOrdered true
			:owner UseCase_UseCase
			:type UseCase_Include
			:location "14:3-14:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "extend"
			:upper -1
			:lower 1
			:isOrdered true
			:owner UseCase_UseCase
			:type UseCase_Extend
			:location "15:3-15:52"
			:isContainer true
		)]
	) ) ( def UseCase_Extend ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "extension"
			:upper -1
			:lower 1
			:isOrdered true
			:owner UseCase_Extend
			:type UseCase_UseCase
			:location "19:3-19:46"
			:isContainer false
		)]
	) ) ( def UseCase_Include ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "includingCase"
			:upper -1
			:lower 1
			:isOrdered true
			:owner UseCase_Include
			:type UseCase_UseCase
			:location "23:3-23:50"
			:isContainer false
		)]
	) ) ( def UseCase_UseCaseContainer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedElement"
			:upper -1
			:lower 0
			:isOrdered true
			:owner UseCase_UseCaseContainer
			:type UseCase_NamedElement
			:location "27:3-27:62"
			:isContainer true
		)]
	) ) ( def UseCase_BehavioredClassifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def UseCase_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UseCase_NamedElement
			:type String
			:location "35:3-35:33"
		)]
	) ) ( def UseCase_Association ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UseCase_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "actor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UseCase_Association
			:type UseCase_Actor
			:location "39:3-39:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "useCase"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UseCase_Association
			:type UseCase_UseCase
			:location "40:3-40:36"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "44:5-44:21"
	) )]
) )
