( declare PIF_BusinessTemplate )
( declare PIF_BusinessContact )
( declare PIF_BusinessService )
( declare PIF_BusinessEntity )
( declare PIF_IdentifierBag )
( declare PIF_TModel )
( declare PIF_OverviewDocument )
( def PIF ( struct-map
	KM3_Package
	:contents[( def PIF_BusinessTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def PIF_BusinessContact ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def PIF_BusinessService ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def PIF_BusinessEntity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "businessContacts"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PIF_BusinessEntity
			:type PIF_BusinessContact
			:location "18:3-18:52"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "businessServices"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PIF_BusinessEntity
			:type PIF_BusinessService
			:location "19:3-19:62"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "identifierBag"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PIF_BusinessEntity
			:type PIF_IdentifierBag
			:location "20:3-20:49"
			:isContainer false
		)]
	) ) ( def PIF_IdentifierBag ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def PIF_TModel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "overviewDocuments"
			:upper -1
			:lower 0
			:isOrdered false
			:owner PIF_TModel
			:type PIF_OverviewDocument
			:location "26:3-26:64"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "identifierBag"
			:upper 1
			:lower 0
			:isOrdered false
			:owner PIF_TModel
			:type PIF_IdentifierBag
			:location "27:3-27:49"
			:isContainer false
		)]
	) ) ( def PIF_OverviewDocument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) )]
) )
