( declare Contact_Contact )
( declare Contact_Num_fixe )
( declare Contact_Num_portable )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( def Contact ( struct-map
	KM3_Package
	:contents[( def Contact_Contact ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "nom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Contact_Contact
			:type String
			:location "11:9-11:32"
		) ( struct-map
			KM3_Attribute
			:name "prenom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Contact_Contact
			:type String
			:location "12:9-12:34"
		) ( struct-map
			KM3_Reference
			:name "num_fixes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Contact_Contact
			:type Contact_Num_fixe
			:location "13:9-13:88"
			:isContainer true
			:opposite contact_fixe
		) ( struct-map
			KM3_Reference
			:name "num_portables"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Contact_Contact
			:type Contact_Num_portable
			:location "14:9-14:99"
			:isContainer true
			:opposite contact_portable
		)]
	) ) ( def Contact_Num_fixe ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "numero"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Contact_Num_fixe
			:type String
			:location "18:9-18:35"
		) ( struct-map
			KM3_Reference
			:name "contact_fixe"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Contact_Num_fixe
			:type Contact_Contact
			:location "19:9-19:63"
			:isContainer false
			:opposite num_fixes
		)]
	) ) ( def Contact_Num_portable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "numero"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Contact_Num_portable
			:type String
			:location "23:9-23:35"
		) ( struct-map
			KM3_Reference
			:name "contact_portable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Contact_Num_portable
			:type Contact_Contact
			:location "24:9-24:71"
			:isContainer false
			:opposite num_portables
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "29:5-29:22"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "30:5-30:21"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "31:5-31:22"
	) )]
) )
