( declare TaskUsiXML_Task )
( declare TaskUsiXML_Operator )
( declare TaskUsiXML_BinaryOperator )
( declare TaskUsiXML_UnaryOperator )
( declare TaskUsiXML_FiniteInteration )
( declare TaskUsiXML_BinaryType )
( declare TaskUsiXML_UnaryType )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def TaskUsiXML ( struct-map
	KM3_Package
	:contents[( def BinaryType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Enabling"
		:location "68:4-68:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "Disabling"
		:location "69:4-69:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "SuspendResume"
		:location "70:4-70:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "OrderIndependence"
		:location "71:4-71:30"
	) ( struct-map
		KM3_EnumLiteral
		:name "IndependentConcurrency"
		:location "72:4-72:35"
	) ( struct-map
		KM3_EnumLiteral
		:name "ConcurencyWithInformationPassing"
		:location "73:4-73:45"
	) ( struct-map
		KM3_EnumLiteral
		:name "UnderterministicChoice"
		:location "74:4-74:35"
	) ( struct-map
		KM3_EnumLiteral
		:name "EnablingWithInformationPassing"
		:location "75:4-75:43"
	)] ) ) ( def UnaryType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Optional"
		:location "79:4-79:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "Iteration"
		:location "80:4-80:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "finitIteration"
		:location "81:4-81:27"
	)] ) ) ( def TaskUsiXML_Task ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TaskUsiXML_Task
			:type String
			:location "27:4-27:26"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TaskUsiXML_Task
			:type String
			:location "28:5-28:29"
		) ( struct-map
			KM3_Attribute
			:name "category"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TaskUsiXML_Task
			:type String
			:location "29:5-29:33"
		) ( struct-map
			KM3_Attribute
			:name "frequency"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TaskUsiXML_Task
			:type Integer
			:location "30:5-30:35"
		) ( struct-map
			KM3_Attribute
			:name "importance"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TaskUsiXML_Task
			:type Integer
			:location "31:5-31:36"
		) ( struct-map
			KM3_Attribute
			:name "structurationLevel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TaskUsiXML_Task
			:type Integer
			:location "32:5-32:44"
		) ( struct-map
			KM3_Attribute
			:name "complexityLevel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TaskUsiXML_Task
			:type Integer
			:location "33:5-33:41"
		) ( struct-map
			KM3_Attribute
			:name "criticity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TaskUsiXML_Task
			:type Integer
			:location "34:5-34:35"
		) ( struct-map
			KM3_Attribute
			:name "centrality"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TaskUsiXML_Task
			:type Integer
			:location "35:5-35:36"
		) ( struct-map
			KM3_Attribute
			:name "terminationValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TaskUsiXML_Task
			:type String
			:location "36:5-36:41"
		) ( struct-map
			KM3_Attribute
			:name "taskType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TaskUsiXML_Task
			:type String
			:location "37:5-37:33"
		) ( struct-map
			KM3_Attribute
			:name "taskItem"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TaskUsiXML_Task
			:type String
			:location "38:5-38:33"
		) ( struct-map
			KM3_Reference
			:name "decompositionTasks"
			:upper -1
			:lower 0
			:isOrdered true
			:owner TaskUsiXML_Task
			:type TaskUsiXML_Task
			:location "40:5-40:88"
			:isContainer true
			:opposite decomposedTask
		) ( struct-map
			KM3_Reference
			:name "decomposedTask"
			:upper 1
			:lower 0
			:isOrdered false
			:owner TaskUsiXML_Task
			:type TaskUsiXML_Task
			:location "41:5-41:72"
			:isContainer false
			:opposite decompositionTasks
		) ( struct-map
			KM3_Reference
			:name "leftOperator"
			:upper 1
			:lower 0
			:isOrdered false
			:owner TaskUsiXML_Task
			:type TaskUsiXML_BinaryOperator
			:location "42:5-42:71"
			:isContainer false
			:opposite rightTask
		) ( struct-map
			KM3_Reference
			:name "rightOperator"
			:upper 1
			:lower 0
			:isOrdered false
			:owner TaskUsiXML_Task
			:type TaskUsiXML_BinaryOperator
			:location "43:5-43:71"
			:isContainer false
			:opposite leftTask
		) ( struct-map
			KM3_Reference
			:name "decoration"
			:upper 1
			:lower 0
			:isOrdered false
			:owner TaskUsiXML_Task
			:type TaskUsiXML_UnaryOperator
			:location "44:5-44:72"
			:isContainer false
			:opposite decoratedTask
		)]
	) ) ( def TaskUsiXML_Operator ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TaskUsiXML_Operator
			:type String
			:location "48:3-48:25"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TaskUsiXML_Operator
			:type String
			:location "49:3-49:27"
		)]
	) ) ( def TaskUsiXML_BinaryOperator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[TaskUsiXML_Operator]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TaskUsiXML_BinaryOperator
			:type BinaryType
			:location "53:5-53:33"
		) ( struct-map
			KM3_Reference
			:name "leftTask"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TaskUsiXML_BinaryOperator
			:type TaskUsiXML_Task
			:location "54:4-54:55"
			:isContainer false
			:opposite rightOperator
		) ( struct-map
			KM3_Reference
			:name "rightTask"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TaskUsiXML_BinaryOperator
			:type TaskUsiXML_Task
			:location "55:2-55:53"
			:isContainer false
			:opposite leftOperator
		)]
	) ) ( def TaskUsiXML_UnaryOperator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[TaskUsiXML_Operator]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "UnaryType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TaskUsiXML_UnaryOperator
			:type UnaryType
			:location "59:6-59:38"
		) ( struct-map
			KM3_Reference
			:name "decoratedTask"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TaskUsiXML_UnaryOperator
			:type TaskUsiXML_Task
			:location "60:4-60:57"
			:isContainer false
			:opposite decoration
		)]
	) ) ( def TaskUsiXML_FiniteInteration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[TaskUsiXML_UnaryOperator]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "interation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner TaskUsiXML_FiniteInteration
			:type Integer
			:location "64:4-64:35"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "86:1-86:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "87:1-87:18"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "88:1-88:17"
	) )]
) )
