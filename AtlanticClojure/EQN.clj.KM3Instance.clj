( declare EQN_RoutingChain )
( declare EQN_QueuingNetwork )
( declare EQN_ExecutionGraph )
( declare EQN_Center )
( declare EQN_Node )
( declare EQN_Special )
( declare EQN_ActiveCenter )
( declare EQN_PassiveCenter )
( declare EQN_Source )
( declare EQN_Sink )
( declare EQN_Fork )
( declare EQN_Join )
( declare EQN_Split )
( declare EQN_Allocate )
( declare EQN_Release )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def EQN ( struct-map
	KM3_Package
	:contents[( def EQN_RoutingChain ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "queuingNetwork"
			:upper -1
			:lower 0
			:isOrdered false
			:owner EQN_RoutingChain
			:type EQN_QueuingNetwork
			:location "12:3-12:70"
			:isContainer false
			:opposite workLoad
		)]
	) ) ( def EQN_QueuingNetwork ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "center"
			:upper -1
			:lower 1
			:isOrdered false
			:owner EQN_QueuingNetwork
			:type EQN_Center
			:location "17:3-17:71"
			:isContainer true
			:opposite queuingNetwork
		) ( struct-map
			KM3_Reference
			:name "workLoad"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EQN_QueuingNetwork
			:type EQN_RoutingChain
			:location "18:3-18:73"
			:isContainer true
			:opposite queuingNetwork
		)]
	) ) ( def EQN_ExecutionGraph ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "nodeNested"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EQN_ExecutionGraph
			:type EQN_Node
			:location "23:3-23:49"
			:isContainer false
			:opposite nested
		) ( struct-map
			KM3_Reference
			:name "node"
			:upper -1
			:lower 1
			:isOrdered false
			:owner EQN_ExecutionGraph
			:type EQN_Node
			:location "24:3-24:67"
			:isContainer true
			:opposite executionGraph
		)]
	) ) ( def EQN_Center ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "node"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EQN_Center
			:type EQN_Node
			:location "29:3-29:44"
			:isContainer false
			:opposite demand
		) ( struct-map
			KM3_Reference
			:name "queuingNetwork"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EQN_Center
			:type EQN_QueuingNetwork
			:location "30:3-30:63"
			:isContainer false
			:opposite center
		)]
	) ) ( def EQN_Node ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "nested"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EQN_Node
			:type EQN_ExecutionGraph
			:location "35:3-35:60"
			:isContainer false
			:opposite nodeNested
		) ( struct-map
			KM3_Reference
			:name "executionGraph"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EQN_Node
			:type EQN_ExecutionGraph
			:location "36:3-36:61"
			:isContainer false
			:opposite node
		) ( struct-map
			KM3_Reference
			:name "demand"
			:upper -1
			:lower 1
			:isOrdered false
			:owner EQN_Node
			:type EQN_Center
			:location "37:3-37:53"
			:isContainer false
			:opposite node
		)]
	) ) ( def EQN_Special ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EQN_Center]
		:structuralFeatures[]
	) ) ( def EQN_ActiveCenter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EQN_Center]
		:structuralFeatures[]
	) ) ( def EQN_PassiveCenter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EQN_Center]
		:structuralFeatures[]
	) ) ( def EQN_Source ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EQN_Special]
		:structuralFeatures[]
	) ) ( def EQN_Sink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EQN_Special]
		:structuralFeatures[]
	) ) ( def EQN_Fork ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EQN_Special]
		:structuralFeatures[]
	) ) ( def EQN_Join ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EQN_Special]
		:structuralFeatures[]
	) ) ( def EQN_Split ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EQN_Special]
		:structuralFeatures[]
	) ) ( def EQN_Allocate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EQN_Special]
		:structuralFeatures[]
	) ) ( def EQN_Release ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EQN_Special]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "92:2-92:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "93:2-93:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "94:2-94:19"
	) )]
) )
