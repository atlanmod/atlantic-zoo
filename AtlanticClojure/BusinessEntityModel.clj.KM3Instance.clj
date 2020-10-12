( declare BusinessEntityModel_DataType )
( declare BusinessEntityModel_Action )
( declare BusinessEntityModel_Class )
( declare BusinessEntityModel_BusinessEntityPropertySet )
( declare BusinessEntityModel_BusinessRole )
( declare BusinessEntityModel_Task )
( declare BusinessEntityModel_ArtifactRole )
( declare BusinessEntityModel_PerformerRole )
( declare BusinessEntityModel_OrganisationalUnit )
( declare BusinessEntityModel_BusinessEntity )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def BusinessEntityModel ( struct-map
	KM3_Package
	:contents[( def BusinessEntityModel_DataType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def BusinessEntityModel_Action ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def BusinessEntityModel_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def BusinessEntityModel_BusinessEntityPropertySet ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BusinessEntityModel_DataType]
		:structuralFeatures[]
	) ) ( def BusinessEntityModel_BusinessRole ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BusinessEntityModel_Action]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "characterisedby"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BusinessEntityModel_BusinessRole
			:type BusinessEntityModel_BusinessEntityPropertySet
			:location "25:3-25:57"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "typ"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BusinessEntityModel_BusinessRole
			:type BusinessEntityModel_Class
			:location "26:3-26:25"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "task"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BusinessEntityModel_BusinessRole
			:type BusinessEntityModel_Task
			:location "27:3-27:55"
			:isContainer false
			:opposite associatedWith
		) ( struct-map
			KM3_Reference
			:name "fille"
			:upper -1
			:lower 1
			:isOrdered false
			:owner BusinessEntityModel_BusinessRole
			:type BusinessEntityModel_BusinessEntity
			:location "28:3-28:63"
			:isContainer false
			:opposite placehold
		)]
	) ) ( def BusinessEntityModel_Task ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "associatedWith"
			:upper -1
			:lower 1
			:isOrdered false
			:owner BusinessEntityModel_Task
			:type BusinessEntityModel_BusinessRole
			:location "32:3-32:64"
			:isContainer false
			:opposite task
		) ( struct-map
			KM3_Reference
			:name "needs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BusinessEntityModel_Task
			:type BusinessEntityModel_ArtifactRole
			:location "33:3-33:37"
			:isContainer false
		)]
	) ) ( def BusinessEntityModel_ArtifactRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessEntityModel_BusinessRole]
		:structuralFeatures[]
	) ) ( def BusinessEntityModel_PerformerRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessEntityModel_BusinessRole]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "perform"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BusinessEntityModel_PerformerRole
			:type BusinessEntityModel_Task
			:location "39:3-39:28"
			:isContainer false
		)]
	) ) ( def BusinessEntityModel_OrganisationalUnit ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessEntityModel_BusinessRole]
		:structuralFeatures[]
	) ) ( def BusinessEntityModel_BusinessEntity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BusinessEntityModel_Class]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "placehold"
			:upper -1
			:lower 1
			:isOrdered false
			:owner BusinessEntityModel_BusinessEntity
			:type BusinessEntityModel_BusinessRole
			:location "45:3-45:61"
			:isContainer false
			:opposite fille
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "51:2-51:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "52:2-52:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "53:2-53:18"
	) )]
) )
