( declare CompanyStructure_Company )
( declare CompanyStructure_CorporateHQ )
( declare CompanyStructure_Store )
( declare CompanyStructure_CorporateHQBackOffice )
( declare CompanyStructure_StoreBackOffice )
( declare CompanyStructure_Employee )
( declare CompanyStructure_CashRegister )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def CompanyStructure ( struct-map
	KM3_Package
	:contents[( def CompanyStructure_Company ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "corporateHQ"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CompanyStructure_Company
			:type CompanyStructure_CorporateHQ
			:location "16:3-16:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "Store"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CompanyStructure_Company
			:type CompanyStructure_Store
			:location "17:3-17:41"
			:isContainer true
		)]
	) ) ( def CompanyStructure_CorporateHQ ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "manages"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CompanyStructure_CorporateHQ
			:type CompanyStructure_Store
			:location "21:3-21:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "corporateHQBackOffice"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CompanyStructure_CorporateHQ
			:type CompanyStructure_CorporateHQBackOffice
			:location "22:3-22:69"
			:isContainer true
		)]
	) ) ( def CompanyStructure_Store ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "storeBackOffice"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CompanyStructure_Store
			:type CompanyStructure_StoreBackOffice
			:location "26:3-26:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "employee"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CompanyStructure_Store
			:type CompanyStructure_Employee
			:location "27:3-27:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "cashRegister"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CompanyStructure_Store
			:type CompanyStructure_CashRegister
			:location "28:3-28:55"
			:isContainer true
		)]
	) ) ( def CompanyStructure_CorporateHQBackOffice ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def CompanyStructure_StoreBackOffice ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def CompanyStructure_Employee ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def CompanyStructure_CashRegister ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "41:2-41:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "42:2-42:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "43:2-43:18"
	) )]
) )
