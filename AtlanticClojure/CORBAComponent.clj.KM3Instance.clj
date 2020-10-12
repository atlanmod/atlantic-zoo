( declare CORBAComponent_InterfaceDef )
( declare CORBAComponent_OperationDef )
( declare CORBAComponent_ValueDef )
( declare CORBAComponent_ComponentDef )
( declare CORBAComponent_ProvidesDef )
( declare CORBAComponent_UsesDef )
( declare CORBAComponent_EventDef )
( declare CORBAComponent_EmitsDef )
( declare CORBAComponent_PublishesDef )
( declare CORBAComponent_ConsumesDef )
( declare CORBAComponent_HomeDef )
( declare CORBAComponent_FactoryDef )
( declare CORBAComponent_FinderDef )
( declare CORBAComponent_PrimaryKeyDef )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def CORBAComponent ( struct-map
	KM3_Package
	:contents[( def CORBAComponent_InterfaceDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def CORBAComponent_OperationDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def CORBAComponent_ValueDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def CORBAComponent_ComponentDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CORBAComponent_InterfaceDef]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isBasic"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CORBAComponent_ComponentDef
			:type Boolean
			:location "25:3-25:31"
		) ( struct-map
			KM3_Reference
			:name "facets"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CORBAComponent_ComponentDef
			:type CORBAComponent_ProvidesDef
			:location "26:3-26:67"
			:isContainer true
			:opposite prd_home
		) ( struct-map
			KM3_Reference
			:name "receptacles"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CORBAComponent_ComponentDef
			:type CORBAComponent_UsesDef
			:location "27:3-27:67"
			:isContainer true
			:opposite ud_home
		) ( struct-map
			KM3_Reference
			:name "supports"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CORBAComponent_ComponentDef
			:type CORBAComponent_InterfaceDef
			:location "28:3-28:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "emits"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CORBAComponent_ComponentDef
			:type CORBAComponent_EmitsDef
			:location "29:3-29:62"
			:isContainer true
			:opposite ed_home
		) ( struct-map
			KM3_Reference
			:name "publishes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CORBAComponent_ComponentDef
			:type CORBAComponent_PublishesDef
			:location "30:3-30:71"
			:isContainer true
			:opposite pud_home
		) ( struct-map
			KM3_Reference
			:name "consumes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CORBAComponent_ComponentDef
			:type CORBAComponent_ConsumesDef
			:location "31:3-31:68"
			:isContainer true
			:opposite cd_home
		)]
	) ) ( def CORBAComponent_ProvidesDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "provides"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CORBAComponent_ProvidesDef
			:type CORBAComponent_InterfaceDef
			:location "35:3-35:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "prd_home"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CORBAComponent_ProvidesDef
			:type CORBAComponent_ComponentDef
			:location "36:3-36:55"
			:isContainer false
			:opposite facets
		)]
	) ) ( def CORBAComponent_UsesDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "multiple"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CORBAComponent_UsesDef
			:type Boolean
			:location "40:3-40:32"
		) ( struct-map
			KM3_Reference
			:name "uses"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CORBAComponent_UsesDef
			:type CORBAComponent_InterfaceDef
			:location "41:3-41:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "ud_home"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CORBAComponent_UsesDef
			:type CORBAComponent_ComponentDef
			:location "42:3-42:59"
			:isContainer false
			:opposite receptacles
		)]
	) ) ( def CORBAComponent_EventDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CORBAComponent_EventDef
			:type CORBAComponent_ValueDef
			:location "46:3-46:29"
			:isContainer false
		)]
	) ) ( def CORBAComponent_EmitsDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CORBAComponent_EventDef]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ed_home"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CORBAComponent_EmitsDef
			:type CORBAComponent_ComponentDef
			:location "50:3-50:53"
			:isContainer false
			:opposite emits
		)]
	) ) ( def CORBAComponent_PublishesDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CORBAComponent_EventDef]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pud_home"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CORBAComponent_PublishesDef
			:type CORBAComponent_ComponentDef
			:location "54:3-54:58"
			:isContainer false
			:opposite publishes
		)]
	) ) ( def CORBAComponent_ConsumesDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CORBAComponent_EventDef]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cd_home"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CORBAComponent_ConsumesDef
			:type CORBAComponent_ComponentDef
			:location "58:3-58:56"
			:isContainer false
			:opposite consumes
		)]
	) ) ( def CORBAComponent_HomeDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CORBAComponent_InterfaceDef]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "manages"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CORBAComponent_HomeDef
			:type CORBAComponent_ComponentDef
			:location "62:3-62:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "factories"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CORBAComponent_HomeDef
			:type CORBAComponent_FactoryDef
			:location "63:3-63:68"
			:isContainer true
			:opposite fa_home
		) ( struct-map
			KM3_Reference
			:name "finders"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CORBAComponent_HomeDef
			:type CORBAComponent_FinderDef
			:location "64:3-64:65"
			:isContainer true
			:opposite fi_home
		) ( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 0
			:isOrdered false
			:owner CORBAComponent_HomeDef
			:type CORBAComponent_PrimaryKeyDef
			:location "65:3-65:68"
			:isContainer true
			:opposite pkd_home
		)]
	) ) ( def CORBAComponent_FactoryDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CORBAComponent_OperationDef]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fa_home"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CORBAComponent_FactoryDef
			:type CORBAComponent_HomeDef
			:location "69:3-69:52"
			:isContainer false
			:opposite factories
		)]
	) ) ( def CORBAComponent_FinderDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CORBAComponent_OperationDef]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fi_home"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CORBAComponent_FinderDef
			:type CORBAComponent_HomeDef
			:location "73:3-73:50"
			:isContainer false
			:opposite finders
		)]
	) ) ( def CORBAComponent_PrimaryKeyDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pkd_home"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CORBAComponent_PrimaryKeyDef
			:type CORBAComponent_HomeDef
			:location "77:3-77:47"
			:isContainer false
			:opposite key
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CORBAComponent_PrimaryKeyDef
			:type CORBAComponent_ValueDef
			:location "78:3-78:29"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "88:2-88:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "89:2-89:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "90:2-90:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "91:2-91:18"
	) )]
) )
