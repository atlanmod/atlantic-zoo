( declare Client_ClientPage )
( declare Client_ClientPageModule )
( declare Client_LogicInterface )
( declare Client_DesignElement )
( declare WebApplication_HyperLink )
( declare Server_ServerPage )
( declare Server_BusinessLogic )
( declare Server_DesignTemplate )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def WebApplication ( struct-map
	KM3_Package
	:contents[( def Client ( struct-map
		KM3_Package
		:contents[( def Client_ClientPage ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "hyperlink"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Client_ClientPage
				:type WebApplication_HyperLink
				:location "19:4-19:36"
				:isContainer false
			)]
		) ) ( def Client_ClientPageModule ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "consistsOf"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Client_ClientPageModule
				:type Client_ClientPage
				:location "23:4-23:48"
				:isContainer true
			)]
		) ) ( def Client_LogicInterface ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Client_ClientPageModule]
			:structuralFeatures[]
		) ) ( def Client_DesignElement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Client_ClientPageModule]
			:structuralFeatures[]
		) )]
	) ) ( def WebApplication_HyperLink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "server"
			:upper -1
			:lower 0
			:isOrdered false
			:owner WebApplication_HyperLink
			:type Server_ServerPage
			:location "34:3-34:53"
			:isContainer false
			:opposite link
		)]
	) ) ( def Server ( struct-map
		KM3_Package
		:contents[( def Server_ServerPage ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "useBusinessLogic"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Server_ServerPage
				:type Server_BusinessLogic
				:location "39:4-39:47"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "useDesignTemplate"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Server_ServerPage
				:type Server_DesignTemplate
				:location "40:4-40:49"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "generates"
				:upper -1
				:lower 0
				:isOrdered false
				:owner Server_ServerPage
				:type Client_ClientPage
				:location "41:4-41:41"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "link"
				:upper -1
				:lower 0
				:isOrdered false
				:owner Server_ServerPage
				:type WebApplication_HyperLink
				:location "42:4-42:53"
				:isContainer false
				:opposite server
			)]
		) ) ( def Server_BusinessLogic ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[]
		) ) ( def Server_DesignTemplate ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[]
		) )]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "52:2-52:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "53:2-53:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "54:2-54:18"
	) )]
) )
