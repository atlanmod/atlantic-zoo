( declare Cristal_Condition )
( declare Cristal_CompositeParDef )
( declare Cristal_ElementaryPartDef )
( declare Cristal_ElementaryActDef )
( declare Cristal_CompositeActDef )
( declare Cristal_ActCompositeMember )
( declare Cristal_ActivityDefinition )
( declare Cristal_PartDefinition )
( declare Cristal_PartCompositeMember )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def Cristal ( struct-map
	KM3_Package
	:contents[( def Cristal_Condition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "partCompositeMembers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Cristal_Condition
			:type Cristal_PartCompositeMember
			:location "12:3-12:60"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "actCompositeMembers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Cristal_Condition
			:type Cristal_ActCompositeMember
			:location "13:3-13:58"
			:isContainer false
		)]
	) ) ( def Cristal_CompositeParDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cristal_PartDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "partCompositeMember"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Cristal_CompositeParDef
			:type Cristal_PartCompositeMember
			:location "18:3-18:69"
			:isContainer true
		)]
	) ) ( def Cristal_ElementaryPartDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cristal_PartDefinition]
		:structuralFeatures[]
	) ) ( def Cristal_ElementaryActDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cristal_ActivityDefinition]
		:structuralFeatures[]
	) ) ( def Cristal_CompositeActDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Cristal_ActivityDefinition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "actCompositeMembers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Cristal_CompositeActDef
			:type Cristal_ActCompositeMember
			:location "33:3-33:68"
			:isContainer true
		)]
	) ) ( def Cristal_ActCompositeMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "activityDefinitions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Cristal_ActCompositeMember
			:type Cristal_ActivityDefinition
			:location "38:3-38:88"
			:isContainer false
			:opposite actCompositeMember
		)]
	) ) ( def Cristal_ActivityDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "actCompositeMember"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Cristal_ActivityDefinition
			:type Cristal_ActCompositeMember
			:location "43:3-43:84"
			:isContainer false
			:opposite activityDefinitions
		)]
	) ) ( def Cristal_PartDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "partCompositeMembers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Cristal_PartDefinition
			:type Cristal_PartCompositeMember
			:location "48:3-48:87"
			:isContainer false
			:opposite partDefinitions
		)]
	) ) ( def Cristal_PartCompositeMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "partDefinitions"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Cristal_PartCompositeMember
			:type Cristal_PartDefinition
			:location "53:3-53:78"
			:isContainer false
			:opposite partCompositeMembers
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "60:2-60:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "61:2-61:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "62:2-62:19"
	) )]
) )
