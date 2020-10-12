( declare Promenade_Strong )
( declare Promenade_Start )
( declare Promenade_End )
( declare Promenade_FeedBack )
( declare Promenade_Weak )
( declare Promenade_Grouping )
( declare Promenade_Precedence )
( declare Promenade_DynPrecedence )
( declare Promenade_DerPrecedence )
( declare Promenade_BasPrecedence )
( declare Promenade_MetaTaskOccurence )
( declare Promenade_ParBinding )
( declare Promenade_ParameterPrec )
( declare Promenade_ModelElement )
( declare Promenade_DependancyUML )
( declare Promenade_MetaTask )
( declare Promenade_ParameterUML )
( declare Promenade_MetaDocument )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def Promenade ( struct-map
	KM3_Package
	:contents[( def Promenade_Strong ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Promenade_DynPrecedence Promenade_BasPrecedence]
		:structuralFeatures[]
	) ) ( def Promenade_Start ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Promenade_DynPrecedence Promenade_BasPrecedence]
		:structuralFeatures[]
	) ) ( def Promenade_End ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Promenade_DynPrecedence Promenade_BasPrecedence]
		:structuralFeatures[]
	) ) ( def Promenade_FeedBack ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Promenade_DynPrecedence Promenade_BasPrecedence]
		:structuralFeatures[]
	) ) ( def Promenade_Weak ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Promenade_DynPrecedence Promenade_DerPrecedence]
		:structuralFeatures[]
	) ) ( def Promenade_Grouping ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Promenade_DynPrecedence Promenade_DerPrecedence]
		:structuralFeatures[]
	) ) ( def Promenade_Precedence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "deprecs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Promenade_Precedence
			:type Promenade_DerPrecedence
			:location "44:3-44:60"
			:isContainer false
			:opposite precs
		) ( struct-map
			KM3_Reference
			:name "parbind"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Promenade_Precedence
			:type Promenade_ParBinding
			:location "45:3-45:57"
			:isContainer false
			:opposite precs
		)]
	) ) ( def Promenade_DynPrecedence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Promenade_Precedence]
		:structuralFeatures[]
	) ) ( def Promenade_DerPrecedence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Promenade_Precedence]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "precs"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Promenade_DerPrecedence
			:type Promenade_Precedence
			:location "55:3-55:57"
			:isContainer false
			:opposite deprecs
		) ( struct-map
			KM3_Reference
			:name "auxTasks"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Promenade_DerPrecedence
			:type Promenade_MetaTaskOccurence
			:location "56:3-56:64"
			:isContainer false
			:opposite dprecs
		)]
	) ) ( def Promenade_BasPrecedence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Promenade_Precedence]
		:structuralFeatures[]
	) ) ( def Promenade_MetaTaskOccurence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Promenade_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dprecs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Promenade_MetaTaskOccurence
			:type Promenade_DerPrecedence
			:location "67:3-67:60"
			:isContainer false
			:opposite auxTasks
		) ( struct-map
			KM3_Reference
			:name "taskCl"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Promenade_MetaTaskOccurence
			:type Promenade_MetaTask
			:location "68:3-68:53"
			:isContainer false
			:opposite occurs
		)]
	) ) ( def Promenade_ParBinding ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "inclusion"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Promenade_ParBinding
			:type Boolean
			:location "73:3-73:33"
		) ( struct-map
			KM3_Reference
			:name "precs"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Promenade_ParBinding
			:type Promenade_Precedence
			:location "74:3-74:57"
			:isContainer false
			:opposite parbind
		) ( struct-map
			KM3_Reference
			:name "targetPar"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Promenade_ParBinding
			:type Promenade_ParameterPrec
			:location "75:3-75:62"
			:isContainer false
			:opposite parbindsTar
		) ( struct-map
			KM3_Reference
			:name "sourcePar"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Promenade_ParBinding
			:type Promenade_ParameterPrec
			:location "76:3-76:63"
			:isContainer false
			:opposite parbindsSour
		)]
	) ) ( def Promenade_ParameterPrec ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Promenade_ParameterUML]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "parbindsTar"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Promenade_ParameterPrec
			:type Promenade_ParBinding
			:location "81:3-81:65"
			:isContainer false
			:opposite targetPar
		) ( struct-map
			KM3_Reference
			:name "parbindsSour"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Promenade_ParameterPrec
			:type Promenade_ParBinding
			:location "82:3-82:66"
			:isContainer false
			:opposite sourcePar
		) ( struct-map
			KM3_Reference
			:name "dstParams"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Promenade_ParameterPrec
			:type Promenade_ParameterPrec
			:location "83:3-83:65"
			:isContainer false
			:opposite orParams
		) ( struct-map
			KM3_Reference
			:name "orParams"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Promenade_ParameterPrec
			:type Promenade_ParameterPrec
			:location "84:3-84:65"
			:isContainer false
			:opposite dstParams
		)]
	) ) ( def Promenade_ModelElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dependencyUMLsupp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Promenade_ModelElement
			:type Promenade_DependancyUML
			:location "89:3-89:66"
			:isContainer false
			:opposite suppier
		) ( struct-map
			KM3_Reference
			:name "dependencyUMLcli"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Promenade_ModelElement
			:type Promenade_DependancyUML
			:location "90:3-90:64"
			:isContainer false
			:opposite client
		)]
	) ) ( def Promenade_DependancyUML ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "suppier"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Promenade_DependancyUML
			:type Promenade_ModelElement
			:location "95:3-95:70"
			:isContainer false
			:opposite dependencyUMLsupp
		) ( struct-map
			KM3_Reference
			:name "client"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Promenade_DependancyUML
			:type Promenade_ModelElement
			:location "96:3-96:68"
			:isContainer false
			:opposite dependencyUMLcli
		)]
	) ) ( def Promenade_MetaTask ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Promenade_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "params"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Promenade_MetaTask
			:type Promenade_ParameterUML
			:location "101:3-101:56"
			:isContainer false
			:opposite task
		) ( struct-map
			KM3_Reference
			:name "occurs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Promenade_MetaTask
			:type Promenade_MetaTaskOccurence
			:location "102:3-102:62"
			:isContainer false
			:opposite taskCl
		)]
	) ) ( def Promenade_ParameterUML ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "task"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Promenade_ParameterUML
			:type Promenade_MetaTask
			:location "107:3-107:47"
			:isContainer false
			:opposite params
		) ( struct-map
			KM3_Reference
			:name "doc"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Promenade_ParameterUML
			:type Promenade_MetaDocument
			:location "108:3-108:56"
			:isContainer false
			:opposite params
		)]
	) ) ( def Promenade_MetaDocument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "params"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Promenade_MetaDocument
			:type Promenade_ParameterUML
			:location "113:3-113:56"
			:isContainer false
			:opposite doc
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "118:2-118:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "119:2-119:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "120:2-120:19"
	) )]
) )
