( declare SimplfiedMiningMart_ModelElement )
( declare SimplfiedMiningMart_Classifier )
( declare SimplfiedMiningMart_StructuralFeature )
( declare SimplfiedMiningMart_Class )
( declare SimplfiedMiningMart_DataType )
( declare SimplfiedMiningMart_Attribute )
( declare CaseRepresentation_Case )
( declare CaseRepresentation_Step )
( declare CaseRepresentation_LoopStep )
( declare CaseRepresentation_MultiStep )
( declare CaseRepresentation_Operator )
( declare CaseRepresentation_Parameter )
( declare CaseRepresentation_ParameterType )
( declare CaseRepresentation_FeatureConstruction )
( declare CaseRepresentation_DataMinStep )
( declare CaseRepresentation_TimeOperator )
( declare CaseRepresentation_FeatureSelection )
( declare CaseRepresentation_MultiRelFeatureConstr )
( declare CaseRepresentation_RowSelection )
( declare CaseRepresentation_Agregation )
( declare CaseRepresentation_Scaling )
( declare CaseRepresentation_Discretization )
( declare CaseRepresentation_Segmentation )
( declare CaseRepresentation_Sampling )
( declare CaseRepresentation_ExecutionElement )
( declare CaseRepresentation_DataObject )
( declare CaseRepresentation_MSL-Tool )
( declare CaseRepresentation_TransformationGroup )
( declare CaseRepresentation_Transformation )
( declare CaseRepresentation_Function )
( declare CaseRepresentation_StoredProcedure )
( declare CaseRepresentation_SQLQuery )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def SimplfiedMiningMart ( struct-map
	KM3_Package
	:contents[( def SimplfiedMiningMart_ModelElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def SimplfiedMiningMart_Classifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplfiedMiningMart_ModelElement]
		:structuralFeatures[]
	) ) ( def SimplfiedMiningMart_StructuralFeature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplfiedMiningMart_ModelElement]
		:structuralFeatures[]
	) ) ( def SimplfiedMiningMart_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplfiedMiningMart_Classifier]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimplfiedMiningMart_Class
			:type String
			:location "23:3-23:27"
		) ( struct-map
			KM3_Reference
			:name "attributes"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SimplfiedMiningMart_Class
			:type SimplfiedMiningMart_Attribute
			:location "24:3-24:70"
			:isContainer true
			:opposite class
		)]
	) ) ( def SimplfiedMiningMart_DataType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplfiedMiningMart_Classifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "attribute"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimplfiedMiningMart_DataType
			:type SimplfiedMiningMart_Attribute
			:location "28:3-28:52"
			:isContainer false
			:opposite has
		)]
	) ) ( def SimplfiedMiningMart_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplfiedMiningMart_StructuralFeature]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "class"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimplfiedMiningMart_Attribute
			:type SimplfiedMiningMart_Class
			:location "32:3-32:51"
			:isContainer false
			:opposite attributes
		) ( struct-map
			KM3_Reference
			:name "has"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SimplfiedMiningMart_Attribute
			:type SimplfiedMiningMart_DataType
			:location "33:3-33:51"
			:isContainer false
			:opposite attribute
		)]
	) )]
) )
( def CaseRepresentation ( struct-map
	KM3_Package
	:contents[( def ParameterType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Value"
		:location "98:3-98:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "Concept"
		:location "99:3-99:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "RelationShip"
		:location "100:3-100:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "FeatureAttribute"
		:location "101:3-101:28"
	)] ) ) ( def CaseRepresentation_Case ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplfiedMiningMart_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Case
			:type String
			:location "45:3-45:27"
		) ( struct-map
			KM3_Attribute
			:name "caseMode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Case
			:type Boolean
			:location "46:3-46:32"
		) ( struct-map
			KM3_Attribute
			:name "documentation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Case
			:type String
			:location "49:3-49:36"
		) ( struct-map
			KM3_Reference
			:name "caseInput"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Case
			:type CaseRepresentation_Parameter
			:location "47:3-47:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "listOfStep"
			:upper -1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Case
			:type CaseRepresentation_Step
			:location "50:3-50:71"
			:isContainer true
			:opposite belongsToCase
		)]
	) ) ( def CaseRepresentation_Step ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplfiedMiningMart_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Step
			:type String
			:location "57:3-57:27"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Step
			:type String
			:location "58:3-58:34"
		) ( struct-map
			KM3_Reference
			:name "belongsToCase"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Step
			:type CaseRepresentation_Case
			:location "59:3-59:56"
			:isContainer false
			:opposite listOfStep
		) ( struct-map
			KM3_Reference
			:name "embedsOperator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Step
			:type CaseRepresentation_Operator
			:location "60:3-60:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "predecessors"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CaseRepresentation_Step
			:type CaseRepresentation_Step
			:location "61:3-61:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "successors"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CaseRepresentation_Step
			:type CaseRepresentation_Step
			:location "62:3-62:34"
			:isContainer false
		)]
	) ) ( def CaseRepresentation_LoopStep ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CaseRepresentation_Step]
		:structuralFeatures[]
	) ) ( def CaseRepresentation_MultiStep ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CaseRepresentation_Step]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "iterationCondition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_MultiStep
			:type String
			:location "73:3-73:41"
		)]
	) ) ( def CaseRepresentation_Operator ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SimplfiedMiningMart_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "loopable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Operator
			:type Boolean
			:location "78:2-78:30"
		) ( struct-map
			KM3_Attribute
			:name "numberOfInputParameters"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Operator
			:type Integer
			:location "79:2-79:46"
		) ( struct-map
			KM3_Attribute
			:name "numberOfOutputParameters"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Operator
			:type Integer
			:location "80:2-80:47"
		) ( struct-map
			KM3_Attribute
			:name "manual"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Operator
			:type Boolean
			:location "81:2-81:29"
		) ( struct-map
			KM3_Attribute
			:name "tool"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Operator
			:type String
			:location "82:2-82:26"
		) ( struct-map
			KM3_Reference
			:name "input"
			:upper -1
			:lower 1
			:isOrdered true
			:owner CaseRepresentation_Operator
			:type CaseRepresentation_Parameter
			:location "83:2-83:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "output"
			:upper -1
			:lower 1
			:isOrdered true
			:owner CaseRepresentation_Operator
			:type CaseRepresentation_Parameter
			:location "84:2-84:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "realizes"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Operator
			:type CaseRepresentation_ExecutionElement
			:location "85:3-85:41"
			:isContainer false
		)]
	) ) ( def CaseRepresentation_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Parameter
			:type String
			:location "90:3-90:27"
		) ( struct-map
			KM3_Attribute
			:name "place"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Parameter
			:type String
			:location "91:3-91:28"
		) ( struct-map
			KM3_Reference
			:name "parameterType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Parameter
			:type CaseRepresentation_ParameterType
			:location "92:3-92:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "belongsToOperator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Parameter
			:type CaseRepresentation_Operator
			:location "93:3-93:42"
			:isContainer false
		)]
	) ) ( def CaseRepresentation_FeatureConstruction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CaseRepresentation_Operator]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "scalingFactor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_FeatureConstruction
			:type Integer
			:location "106:3-106:37"
		)]
	) ) ( def CaseRepresentation_DataMinStep ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CaseRepresentation_Operator]
		:structuralFeatures[]
	) ) ( def CaseRepresentation_TimeOperator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CaseRepresentation_Operator]
		:structuralFeatures[]
	) ) ( def CaseRepresentation_FeatureSelection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CaseRepresentation_Operator]
		:structuralFeatures[]
	) ) ( def CaseRepresentation_MultiRelFeatureConstr ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CaseRepresentation_Operator]
		:structuralFeatures[]
	) ) ( def CaseRepresentation_RowSelection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CaseRepresentation_Operator]
		:structuralFeatures[]
	) ) ( def CaseRepresentation_Agregation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CaseRepresentation_MultiRelFeatureConstr]
		:structuralFeatures[]
	) ) ( def CaseRepresentation_Scaling ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CaseRepresentation_FeatureConstruction]
		:structuralFeatures[]
	) ) ( def CaseRepresentation_Discretization ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CaseRepresentation_FeatureConstruction]
		:structuralFeatures[]
	) ) ( def CaseRepresentation_Segmentation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CaseRepresentation_RowSelection]
		:structuralFeatures[]
	) ) ( def CaseRepresentation_Sampling ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CaseRepresentation_RowSelection]
		:structuralFeatures[]
	) ) ( def CaseRepresentation_ExecutionElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_ExecutionElement
			:type CaseRepresentation_DataObject
			:location "123:3-123:51"
			:isContainer false
			:opposite source
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_ExecutionElement
			:type CaseRepresentation_DataObject
			:location "124:3-124:51"
			:isContainer false
			:opposite target
		)]
	) ) ( def CaseRepresentation_DataObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_DataObject
			:type CaseRepresentation_ExecutionElement
			:location "128:3-128:57"
			:isContainer false
			:opposite source
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_DataObject
			:type CaseRepresentation_ExecutionElement
			:location "129:3-129:57"
			:isContainer false
			:opposite target
		)]
	) ) ( def CaseRepresentation_MSL-Tool ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CaseRepresentation_ExecutionElement]
		:structuralFeatures[]
	) ) ( def CaseRepresentation_TransformationGroup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CaseRepresentation_ExecutionElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "transformation"
			:upper -1
			:lower 0
			:isOrdered false
			:owner CaseRepresentation_TransformationGroup
			:type CaseRepresentation_Transformation
			:location "135:3-135:89"
			:isContainer true
			:opposite transformationGroup
		)]
	) ) ( def CaseRepresentation_Transformation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CaseRepresentation_ExecutionElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "transformationGroup"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Transformation
			:type CaseRepresentation_TransformationGroup
			:location "140:3-140:81"
			:isContainer false
			:opposite transformation
		)]
	) ) ( def CaseRepresentation_Function ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CaseRepresentation_Transformation]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "nameOf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Function
			:type String
			:location "144:2-144:28"
		) ( struct-map
			KM3_Attribute
			:name "signature"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_Function
			:type String
			:location "145:2-145:31"
		)]
	) ) ( def CaseRepresentation_StoredProcedure ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CaseRepresentation_Transformation]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "nameOf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_StoredProcedure
			:type String
			:location "149:3-149:29"
		) ( struct-map
			KM3_Attribute
			:name "signature"
			:upper 1
			:lower 1
			:isOrdered false
			:owner CaseRepresentation_StoredProcedure
			:type String
			:location "150:4-150:33"
		)]
	) ) ( def CaseRepresentation_SQLQuery ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[CaseRepresentation_Transformation]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "163:2-163:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "164:2-164:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "165:2-165:19"
	) )]
) )
