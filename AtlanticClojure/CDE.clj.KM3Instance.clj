( declare CDE_IUmlType )
( declare CDE_ICdeComponentSpec )
( declare CDE_IUmlClass )
( declare CDE_IUmlComponent )
( declare CDE_ICdeServer )
( declare CDE_ICdeComponent )
( declare CDE_IUmlMember )
( declare CDE_ICdeMember )
( declare CDE_ICdeMemberExe )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def CDE ( struct-map
	KM3_Package
	:contents[( def CDE_IUmlType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "members"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CDE_IUmlType
			:type CDE_IUmlMember
			:location "14:3-14:37"
			:isContainer false
		)]
	) ) ( def CDE_ICdeComponentSpec ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CDE_IUmlType]
		:structuralFeatures[]
	) ) ( def CDE_IUmlClass ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CDE_IUmlType]
		:structuralFeatures[]
	) ) ( def CDE_IUmlComponent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CDE_IUmlClass]
		:structuralFeatures[]
	) ) ( def CDE_ICdeServer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CDE_IUmlComponent]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "implements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CDE_ICdeServer
			:type CDE_ICdeComponent
			:location "24:3-24:43"
			:isContainer false
		)]
	) ) ( def CDE_ICdeComponent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CDE_IUmlComponent]
		:structuralFeatures[]
	) ) ( def CDE_IUmlMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def CDE_ICdeMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CDE_IUmlMember]
		:structuralFeatures[]
	) ) ( def CDE_ICdeMemberExe ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "executionPerformance"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CDE_ICdeMemberExe
			:type String
			:location "34:3-34:43"
		) ( struct-map
			KM3_Attribute
			:name "resourceNeeded"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CDE_ICdeMemberExe
			:type String
			:location "35:3-35:37"
		) ( struct-map
			KM3_Attribute
			:name "executionDetails"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CDE_ICdeMemberExe
			:type String
			:location "36:3-36:39"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "46:2-46:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "47:2-47:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "48:2-48:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "49:2-49:18"
	) )]
) )
