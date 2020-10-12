( declare EG_MOF_ExecutionGraph )
( declare EG_MOF_Node )
( declare EG_MOF_Start )
( declare EG_MOF_End )
( declare EG_MOF_Control )
( declare EG_MOF_Basic )
( declare EG_MOF_Branch )
( declare EG_MOF_Loop )
( declare EG_MOF_Fork )
( declare EG_MOF_Join )
( declare EG_MOF_Acquire )
( declare EG_MOF_Release )
( declare EG_MOF_Split )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def EG_MOF ( struct-map
	KM3_Package
	:contents[( def EG_MOF_ExecutionGraph ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "node"
			:upper -1
			:lower 1
			:isOrdered false
			:owner EG_MOF_ExecutionGraph
			:type EG_MOF_Node
			:location "12:3-12:66"
			:isContainer true
			:opposite executionGraph
		) ( struct-map
			KM3_Reference
			:name "nodeNested"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EG_MOF_ExecutionGraph
			:type EG_MOF_Node
			:location "13:3-13:49"
			:isContainer false
			:opposite nested
		)]
	) ) ( def EG_MOF_Node ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "predecessor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner EG_MOF_Node
			:type EG_MOF_Node
			:location "18:3-18:57"
			:isContainer false
			:opposite successor
		) ( struct-map
			KM3_Reference
			:name "successor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner EG_MOF_Node
			:type EG_MOF_Node
			:location "19:3-19:57"
			:isContainer false
			:opposite predecessor
		) ( struct-map
			KM3_Reference
			:name "executionGraph"
			:upper 1
			:lower 1
			:isOrdered false
			:owner EG_MOF_Node
			:type EG_MOF_ExecutionGraph
			:location "20:3-20:61"
			:isContainer false
			:opposite node
		) ( struct-map
			KM3_Reference
			:name "nested"
			:upper -1
			:lower 0
			:isOrdered false
			:owner EG_MOF_Node
			:type EG_MOF_ExecutionGraph
			:location "21:3-21:62"
			:isContainer false
			:opposite nodeNested
		)]
	) ) ( def EG_MOF_Start ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EG_MOF_Node]
		:structuralFeatures[]
	) ) ( def EG_MOF_End ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EG_MOF_Node]
		:structuralFeatures[]
	) ) ( def EG_MOF_Control ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EG_MOF_Node]
		:structuralFeatures[]
	) ) ( def EG_MOF_Basic ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EG_MOF_Node]
		:structuralFeatures[]
	) ) ( def EG_MOF_Branch ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EG_MOF_Control]
		:structuralFeatures[]
	) ) ( def EG_MOF_Loop ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EG_MOF_Control]
		:structuralFeatures[]
	) ) ( def EG_MOF_Fork ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EG_MOF_Control]
		:structuralFeatures[]
	) ) ( def EG_MOF_Join ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EG_MOF_Control]
		:structuralFeatures[]
	) ) ( def EG_MOF_Acquire ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EG_MOF_Control]
		:structuralFeatures[]
	) ) ( def EG_MOF_Release ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EG_MOF_Control]
		:structuralFeatures[]
	) ) ( def EG_MOF_Split ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[EG_MOF_Control]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "81:2-81:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "82:2-82:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "83:2-83:19"
	) )]
) )
