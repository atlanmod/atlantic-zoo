( declare Client_ClientPage )
( declare Client_ClientPageModule )
( declare Client_LogicInterface )
( declare Client_DesignElement )
( declare CompleteWebApplication_HyperLink )
( declare Server_ServerPage )
( declare Server_ServerPageModule )
( declare Server_DesignModule )
( declare Server_LogicModule )
( declare Server_Link )
( declare Server_BeginUseCase )
( declare Server_UseCase )
( declare Server_LogicElement )
( declare Server_Alternative )
( declare Server_UserDecision )
( declare Server_ServerDecision )
( declare Server_Processor )
( declare Server_Renderer )
( declare Server_Data )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def CompleteWebApplication ( struct-map
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
				:type CompleteWebApplication_HyperLink
				:location "17:4-17:36"
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
				:location "21:4-21:48"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "representsSMP"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Client_ClientPageModule
				:type Server_ServerPageModule
				:location "22:4-22:47"
				:isContainer false
			)]
		) ) ( def Client_LogicInterface ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Client_ClientPageModule]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "represents"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Client_LogicInterface
				:type Server_LogicModule
				:location "26:4-26:39"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "generatedBy"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Client_LogicInterface
				:type Server_Renderer
				:location "27:4-27:37"
				:isContainer false
			)]
		) ) ( def Client_DesignElement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Client_ClientPageModule]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "represents"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Client_DesignElement
				:type Server_DesignModule
				:location "31:4-31:40"
				:isContainer false
			)]
		) )]
	) ) ( def CompleteWebApplication_HyperLink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "server"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CompleteWebApplication_HyperLink
			:type Server_ServerPage
			:location "36:3-36:53"
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
				:name "link"
				:upper -1
				:lower 0
				:isOrdered false
				:owner Server_ServerPage
				:type CompleteWebApplication_HyperLink
				:location "41:4-41:53"
				:isContainer false
				:opposite server
			) ( struct-map
				KM3_Reference
				:name "generates"
				:upper -1
				:lower 0
				:isOrdered false
				:owner Server_ServerPage
				:type Client_ClientPage
				:location "42:4-42:41"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "module"
				:upper -1
				:lower 1
				:isOrdered false
				:owner Server_ServerPage
				:type Server_ServerPageModule
				:location "43:4-43:76"
				:isContainer true
				:opposite contains
			)]
		) ) ( def Server_ServerPageModule ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "contains"
				:upper -1
				:lower 1
				:isOrdered false
				:owner Server_ServerPageModule
				:type Server_ServerPage
				:location "47:4-47:60"
				:isContainer false
				:opposite module
			) ( struct-map
				KM3_Reference
				:name "link"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Server_ServerPageModule
				:type Server_Link
				:location "48:4-48:26"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "containsModule"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Server_ServerPageModule
				:type Server_DesignModule
				:location "49:4-49:54"
				:isContainer true
			)]
		) ) ( def Server_DesignModule ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Server_ServerPageModule]
			:structuralFeatures[]
		) ) ( def Server_LogicModule ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Server_ServerPageModule]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "useCase"
				:upper -1
				:lower 1
				:isOrdered false
				:owner Server_LogicModule
				:type Server_UseCase
				:location "55:4-55:47"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "logicElement"
				:upper -1
				:lower 1
				:isOrdered false
				:owner Server_LogicModule
				:type Server_LogicElement
				:location "56:4-56:57"
				:isContainer true
			)]
		) ) ( def Server_Link ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "page"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Server_Link
				:type Server_ServerPage
				:location "60:4-60:32"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "posts"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Server_Link
				:type Server_Data
				:location "61:4-61:27"
				:isContainer false
			)]
		) ) ( def Server_BeginUseCase ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Server_Link]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "useCase"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Server_BeginUseCase
				:type Server_UseCase
				:location "65:4-65:32"
				:isContainer false
			)]
		) ) ( def Server_UseCase ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Server_Link]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "logicElem"
				:upper -1
				:lower 1
				:isOrdered false
				:owner Server_UseCase
				:type Server_LogicElement
				:location "69:4-69:71"
				:isContainer true
				:opposite uses
			)]
		) ) ( def Server_LogicElement ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "uses"
				:upper -1
				:lower 1
				:isOrdered false
				:owner Server_LogicElement
				:type Server_UseCase
				:location "73:4-73:56"
				:isContainer false
				:opposite logicElem
			) ( struct-map
				KM3_Reference
				:name "generatedBy"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Server_LogicElement
				:type Server_LogicElement
				:location "74:4-74:57"
				:isContainer false
				:opposite next
			) ( struct-map
				KM3_Reference
				:name "next"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Server_LogicElement
				:type Server_LogicElement
				:location "75:4-75:57"
				:isContainer false
				:opposite generatedBy
			)]
		) ) ( def Server_Alternative ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Server_LogicElement]
			:structuralFeatures[]
		) ) ( def Server_UserDecision ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Server_LogicElement]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "allows"
				:upper -1
				:lower 1
				:isOrdered false
				:owner Server_UserDecision
				:type Server_Alternative
				:location "81:4-81:51"
				:isContainer true
			)]
		) ) ( def Server_ServerDecision ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Server_LogicElement]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "evaluatesResultOf"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Server_ServerDecision
				:type Server_Processor
				:location "85:4-85:44"
				:isContainer false
			)]
		) ) ( def Server_Processor ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Server_LogicElement]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "persistentData"
				:upper -1
				:lower 0
				:isOrdered false
				:owner Server_Processor
				:type Server_Data
				:location "89:4-89:59"
				:isContainer false
				:opposite persist
			) ( struct-map
				KM3_Reference
				:name "inputData"
				:upper -1
				:lower 0
				:isOrdered false
				:owner Server_Processor
				:type Server_Data
				:location "90:4-90:51"
				:isContainer false
				:opposite uses
			) ( struct-map
				KM3_Reference
				:name "outputData"
				:upper -1
				:lower 1
				:isOrdered false
				:owner Server_Processor
				:type Server_Data
				:location "91:4-91:58"
				:isContainer false
				:opposite computes
			)]
		) ) ( def Server_Renderer ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Server_LogicElement]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "renders"
				:upper -1
				:lower 1
				:isOrdered false
				:owner Server_Renderer
				:type Server_Data
				:location "95:4-95:55"
				:isContainer false
				:opposite renderer
			)]
		) ) ( def Server_Data ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "renderer"
				:upper -1
				:lower 0
				:isOrdered false
				:owner Server_Data
				:type Server_Renderer
				:location "99:4-99:57"
				:isContainer false
				:opposite renders
			) ( struct-map
				KM3_Reference
				:name "persist"
				:upper -1
				:lower 0
				:isOrdered false
				:owner Server_Data
				:type Server_Processor
				:location "100:4-100:64"
				:isContainer false
				:opposite persistentData
			) ( struct-map
				KM3_Reference
				:name "uses"
				:upper -1
				:lower 0
				:isOrdered false
				:owner Server_Data
				:type Server_Processor
				:location "101:4-101:56"
				:isContainer false
				:opposite inputData
			) ( struct-map
				KM3_Reference
				:name "computes"
				:upper -1
				:lower 0
				:isOrdered false
				:owner Server_Data
				:type Server_Processor
				:location "102:4-102:61"
				:isContainer false
				:opposite outputData
			)]
		) )]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "108:2-108:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "109:2-109:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "110:2-110:18"
	) )]
) )
