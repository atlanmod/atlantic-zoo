( declare UMLWithReuseContrats_ReuseContract )
( declare UMLWithReuseContrats_Dependency )
( declare UMLWithReuseContrats_ProviderClause )
( declare UMLWithReuseContrats_Package )
( declare UMLWithReuseContrats_ReuserClause )
( declare UMLWithReuseContrats_CompositeProvider )
( declare UMLWithReuseContrats_BasicProvider )
( declare UMLWithReuseContrats_CompositeReuser )
( declare UMLWithReuseContrats_BasicReuser )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def UMLWithReuseContrats ( struct-map
	KM3_Package
	:contents[( def UMLWithReuseContrats_ReuseContract ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UMLWithReuseContrats_Dependency]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "supplier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLWithReuseContrats_ReuseContract
			:type UMLWithReuseContrats_ProviderClause
			:location "17:3-17:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "client"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLWithReuseContrats_ReuseContract
			:type UMLWithReuseContrats_ReuserClause
			:location "18:3-18:41"
			:isContainer false
		)]
	) ) ( def UMLWithReuseContrats_Dependency ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owningDependency"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UMLWithReuseContrats_Dependency
			:type UMLWithReuseContrats_Dependency
			:location "22:3-22:74"
			:isContainer false
			:opposite subDependency
		) ( struct-map
			KM3_Reference
			:name "subDependency"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UMLWithReuseContrats_Dependency
			:type UMLWithReuseContrats_Dependency
			:location "23:3-23:82"
			:isContainer true
			:opposite owningDependency
		)]
	) ) ( def UMLWithReuseContrats_ProviderClause ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UMLWithReuseContrats_Package]
		:structuralFeatures[]
	) ) ( def UMLWithReuseContrats_Package ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def UMLWithReuseContrats_ReuserClause ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UMLWithReuseContrats_Package]
		:structuralFeatures[]
	) ) ( def UMLWithReuseContrats_CompositeProvider ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UMLWithReuseContrats_ProviderClause]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "subcontract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UMLWithReuseContrats_CompositeProvider
			:type UMLWithReuseContrats_ReuseContract
			:location "33:3-33:57"
			:isContainer true
		)]
	) ) ( def UMLWithReuseContrats_BasicProvider ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UMLWithReuseContrats_ProviderClause]
		:structuralFeatures[]
	) ) ( def UMLWithReuseContrats_CompositeReuser ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UMLWithReuseContrats_ReuserClause]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "subreuser"
			:upper -1
			:lower 0
			:isOrdered true
			:owner UMLWithReuseContrats_CompositeReuser
			:type UMLWithReuseContrats_ReuserClause
			:location "39:3-39:60"
			:isContainer true
		)]
	) ) ( def UMLWithReuseContrats_BasicReuser ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[UMLWithReuseContrats_ReuserClause]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "46:2-46:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "47:2-47:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "48:2-48:18"
	) )]
) )
