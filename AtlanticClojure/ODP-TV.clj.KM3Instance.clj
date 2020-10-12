( declare ODPTV_TechnologyObject )
( declare ODPTV_Implementation )
( declare ODPTV_IXIT )
( declare ODPTV_ImplementableStandard )
( def ODPTV ( struct-map
	KM3_Package
	:contents[( def ODPTV_TechnologyObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "implStandard"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPTV_TechnologyObject
			:type ODPTV_ImplementableStandard
			:location "12:4-12:79"
			:isContainer false
			:opposite techObject
		) ( struct-map
			KM3_Reference
			:name "toImplementation"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPTV_TechnologyObject
			:type ODPTV_Implementation
			:location "14:4-14:77"
			:isContainer false
			:opposite implProduct
		)]
	) ) ( def ODPTV_Implementation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "implIXIT"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPTV_Implementation
			:type ODPTV_IXIT
			:location "19:4-19:66"
			:isContainer false
			:opposite ixitImplementation
		) ( struct-map
			KM3_Reference
			:name "implProduct"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPTV_Implementation
			:type ODPTV_TechnologyObject
			:location "21:4-21:79"
			:isContainer false
			:opposite toImplementation
		)]
	) ) ( def ODPTV_IXIT ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ixitImplementation"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPTV_IXIT
			:type ODPTV_Implementation
			:location "26:4-26:76"
			:isContainer false
			:opposite implIXIT
		)]
	) ) ( def ODPTV_ImplementableStandard ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "techObject"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPTV_ImplementableStandard
			:type ODPTV_TechnologyObject
			:location "31:4-31:74"
			:isContainer false
			:opposite implStandard
		)]
	) )]
) )
