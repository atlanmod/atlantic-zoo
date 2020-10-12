( declare PIF_Entity )
( declare PIF_Activity )
( declare PIF_Object )
( declare PIF_Timepoint )
( declare PIF_Relation )
( declare PIF_Decision )
( declare PIF_Agent )
( declare PIF_Creates )
( declare PIF_Modifies )
( declare PIF_Before )
( declare PIF_Uses )
( declare PIF_Performs )
( declare PIF_ActivityStatus )
( declare PIF_Succesor )
( def PIF ( struct-map
	KM3_Package
	:contents[( def PIF_Entity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def PIF_Activity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PIF_Entity]
		:structuralFeatures[]
	) ) ( def PIF_Object ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PIF_Entity]
		:structuralFeatures[]
	) ) ( def PIF_Timepoint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PIF_Entity]
		:structuralFeatures[]
	) ) ( def PIF_Relation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PIF_Entity]
		:structuralFeatures[]
	) ) ( def PIF_Decision ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PIF_Activity]
		:structuralFeatures[]
	) ) ( def PIF_Agent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PIF_Object]
		:structuralFeatures[]
	) ) ( def PIF_Creates ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PIF_Relation]
		:structuralFeatures[]
	) ) ( def PIF_Modifies ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PIF_Relation]
		:structuralFeatures[]
	) ) ( def PIF_Before ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PIF_Relation]
		:structuralFeatures[]
	) ) ( def PIF_Uses ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PIF_Relation]
		:structuralFeatures[]
	) ) ( def PIF_Performs ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PIF_Relation]
		:structuralFeatures[]
	) ) ( def PIF_ActivityStatus ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PIF_Relation]
		:structuralFeatures[]
	) ) ( def PIF_Succesor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[PIF_Relation]
		:structuralFeatures[]
	) )]
) )
