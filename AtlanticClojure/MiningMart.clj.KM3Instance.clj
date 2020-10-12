( declare SimplfiedMiningMart_ModelElement )
( declare SimplfiedMiningMart_Classifier )
( declare SimplfiedMiningMart_StructuralFeature )
( declare SimplfiedMiningMart_Class )
( declare SimplfiedMiningMart_DataType )
( declare SimplfiedMiningMart_Attribute )
( declare DataRepresentation_Column )
( declare DataRepresentation_ColumnSet )
( declare DataRepresentation_ColumnStatistics )
( declare DataRepresentation_ColumnSetStatistics )
( declare DataRepresentation_Snapshot )
( declare DataRepresentation_Table )
( declare DataRepresentation_View )
( declare DataRepresentation_Key )
( declare DataRepresentation_ForeignKey )
( declare DataRepresentation_PrimaryKey )
( declare DataRepresentation_Concept )
( declare DataRepresentation_RelationShip )
( declare DataRepresentation_FeatureAttribute )
( declare DataRepresentation_BaseAttribute )
( declare DataRepresentation_MultiColumnFeature )
( declare DataRepresentation_Value )
( declare DataRepresentation_UserInput )
( declare DataRepresentation_Ordinal )
( declare DataRepresentation_Scalar )
( declare DataRepresentation_Time )
( declare DataRepresentation_Binary )
( declare DataRepresentation_Categorial )
( declare DataRepresentation_KeyAttribute )
( declare DataRepresentation_TimeGroup )
( declare DataRepresentation_Spatial )
( declare DataRepresentation_Constant )
( declare DataRepresentation_RoleRestriction )
( declare DataRepresentation_DomainDataType )
( declare DataRepresentation_Nominal )
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
( declare MiningMart_InOut )
( declare MiningMart_LinkPackage )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Real )
( declare PrimitiveTypes_Boolean )
( def MiningMart ( struct-map
	KM3_Package
	:contents[( def InOut ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Input"
		:location "351:3-351:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "OutPut"
		:location "352:3-352:18"
	)] ) ) ( def SimplfiedMiningMart ( struct-map
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
				:location "27:3-27:27"
			) ( struct-map
				KM3_Reference
				:name "attributes"
				:upper -1
				:lower 1
				:isOrdered false
				:owner SimplfiedMiningMart_Class
				:type SimplfiedMiningMart_Attribute
				:location "28:3-28:70"
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
				:location "32:3-32:52"
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
				:location "36:3-36:51"
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
				:location "37:3-37:51"
				:isContainer false
				:opposite attribute
			)]
		) )]
	) ) ( def DataRepresentation ( struct-map
		KM3_Package
		:contents[( def DataRepresentation_Column ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[SimplfiedMiningMart_Attribute]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "name"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_Column
				:type String
				:location "49:3-49:27"
			) ( struct-map
				KM3_Reference
				:name "dataType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_Column
				:type SimplfiedMiningMart_DataType
				:location "50:3-50:33"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "keys"
				:upper -1
				:lower 0
				:isOrdered false
				:owner DataRepresentation_Column
				:type DataRepresentation_Key
				:location "51:3-51:48"
				:isContainer false
				:opposite hasColumn
			) ( struct-map
				KM3_Reference
				:name "belongsToColumnSet"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_Column
				:type DataRepresentation_ColumnSet
				:location "52:3-52:65"
				:isContainer false
				:opposite hasColumn
			) ( struct-map
				KM3_Reference
				:name "corespondsToBaseAttribute"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_Column
				:type DataRepresentation_BaseAttribute
				:location "53:3-53:55"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "linkPackage"
				:upper 1
				:lower 0
				:isOrdered false
				:owner DataRepresentation_Column
				:type MiningMart_LinkPackage
				:location "54:3-54:62"
				:isContainer false
				:opposite column
			)]
		) ) ( def DataRepresentation_ColumnSet ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[SimplfiedMiningMart_Class]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "number"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnSet
				:type Integer
				:location "62:3-62:30"
			) ( struct-map
				KM3_Attribute
				:name "file"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnSet
				:type String
				:location "63:3-63:27"
			) ( struct-map
				KM3_Attribute
				:name "dbConnectString"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnSet
				:type String
				:location "64:3-64:38"
			) ( struct-map
				KM3_Attribute
				:name "user"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnSet
				:type String
				:location "65:3-65:27"
			) ( struct-map
				KM3_Reference
				:name "hasColumn"
				:upper -1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnSet
				:type DataRepresentation_Column
				:location "66:3-66:67"
				:isContainer false
				:opposite belongsToColumnSet
			) ( struct-map
				KM3_Reference
				:name "hasKey"
				:upper -1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnSet
				:type DataRepresentation_Key
				:location "67:3-67:66"
				:isContainer false
				:opposite isAssociatedToColumnSet
			) ( struct-map
				KM3_Reference
				:name "correspondsToConcept"
				:upper 1
				:lower 0
				:isOrdered false
				:owner DataRepresentation_ColumnSet
				:type DataRepresentation_Concept
				:location "68:3-68:83"
				:isContainer false
				:opposite correspondsToColumnSet
			) ( struct-map
				KM3_Reference
				:name "correspondsToRelationShip"
				:upper 1
				:lower 0
				:isOrdered false
				:owner DataRepresentation_ColumnSet
				:type DataRepresentation_RelationShip
				:location "69:3-69:95"
				:isContainer false
				:opposite correspondsToColumnSet
			) ( struct-map
				KM3_Reference
				:name "linkPackage"
				:upper 1
				:lower 0
				:isOrdered false
				:owner DataRepresentation_ColumnSet
				:type MiningMart_LinkPackage
				:location "70:4-70:66"
				:isContainer false
				:opposite columnSet
			)]
		) ) ( def DataRepresentation_ColumnStatistics ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "unique"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnStatistics
				:type Integer
				:location "75:4-75:33"
			) ( struct-map
				KM3_Attribute
				:name "missing"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnStatistics
				:type Integer
				:location "76:3-76:31"
			) ( struct-map
				KM3_Attribute
				:name "min"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnStatistics
				:type Integer
				:location "77:3-77:27"
			) ( struct-map
				KM3_Attribute
				:name "max"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnStatistics
				:type Integer
				:location "78:3-78:27"
			) ( struct-map
				KM3_Attribute
				:name "average"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnStatistics
				:type Integer
				:location "79:3-79:31"
			) ( struct-map
				KM3_Attribute
				:name "standarDeviation"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnStatistics
				:type Integer
				:location "80:3-80:40"
			) ( struct-map
				KM3_Attribute
				:name "distributionValue"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnStatistics
				:type String
				:location "81:3-81:40"
			) ( struct-map
				KM3_Attribute
				:name "distributionCount"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnStatistics
				:type Integer
				:location "82:3-82:41"
			) ( struct-map
				KM3_Attribute
				:name "distributionMin"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnStatistics
				:type Integer
				:location "83:3-83:39"
			) ( struct-map
				KM3_Attribute
				:name "distributionMax"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnStatistics
				:type Integer
				:location "84:3-84:39"
			) ( struct-map
				KM3_Reference
				:name "forColumn"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnStatistics
				:type DataRepresentation_Column
				:location "85:3-85:32"
				:isContainer false
			)]
		) ) ( def DataRepresentation_ColumnSetStatistics ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[SimplfiedMiningMart_ModelElement]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "allNumber"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnSetStatistics
				:type Integer
				:location "90:3-90:33"
			) ( struct-map
				KM3_Attribute
				:name "ordinalNumber"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnSetStatistics
				:type Integer
				:location "91:3-91:37"
			) ( struct-map
				KM3_Attribute
				:name "nominalNumber"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnSetStatistics
				:type Integer
				:location "92:3-92:37"
			) ( struct-map
				KM3_Attribute
				:name "timeNumber"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnSetStatistics
				:type Integer
				:location "93:3-93:34"
			) ( struct-map
				KM3_Reference
				:name "forColumnSet"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_ColumnSetStatistics
				:type DataRepresentation_ColumnSet
				:location "94:3-94:38"
				:isContainer false
			)]
		) ) ( def DataRepresentation_Snapshot ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[DataRepresentation_ColumnSet]
			:structuralFeatures[]
		) ) ( def DataRepresentation_Table ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[DataRepresentation_ColumnSet]
			:structuralFeatures[]
		) ) ( def DataRepresentation_View ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[DataRepresentation_ColumnSet]
			:structuralFeatures[]
		) ) ( def DataRepresentation_Key ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[SimplfiedMiningMart_ModelElement]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "isUsedForIndex"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_Key
				:type Boolean
				:location "103:3-103:38"
			) ( struct-map
				KM3_Reference
				:name "hasColumn"
				:upper -1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_Key
				:type DataRepresentation_Column
				:location "104:3-104:53"
				:isContainer false
				:opposite keys
			) ( struct-map
				KM3_Reference
				:name "isAssociatedToColumnSet"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_Key
				:type DataRepresentation_ColumnSet
				:location "105:3-105:67"
				:isContainer false
				:opposite hasKey
			)]
		) ) ( def DataRepresentation_ForeignKey ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[DataRepresentation_Key]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "isConnectionTo"
				:upper 1
				:lower 0
				:isOrdered false
				:owner DataRepresentation_ForeignKey
				:type DataRepresentation_Table
				:location "109:3-109:41"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "correspondsToRelationShip"
				:upper 1
				:lower 0
				:isOrdered false
				:owner DataRepresentation_ForeignKey
				:type DataRepresentation_RelationShip
				:location "110:3-110:94"
				:isContainer false
				:opposite correspondsToForeignKey
			)]
		) ) ( def DataRepresentation_PrimaryKey ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[DataRepresentation_Key]
			:structuralFeatures[]
		) ) ( def DataRepresentation_Concept ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[SimplfiedMiningMart_Class CaseRepresentation_Parameter]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "subConceptRestriction"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_Concept
				:type String
				:location "120:3-120:44"
			) ( struct-map
				KM3_Reference
				:name "isA"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_Concept
				:type DataRepresentation_Concept
				:location "121:3-121:27"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "FromConcept"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_Concept
				:type DataRepresentation_RelationShip
				:location "122:3-122:64"
				:isContainer false
				:opposite FromConcept
			) ( struct-map
				KM3_Reference
				:name "ToConcept"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_Concept
				:type DataRepresentation_RelationShip
				:location "123:4-123:60"
				:isContainer false
				:opposite ToConcept
			) ( struct-map
				KM3_Reference
				:name "correspondsToColumnSet"
				:upper 1
				:lower 0
				:isOrdered false
				:owner DataRepresentation_Concept
				:type DataRepresentation_ColumnSet
				:location "124:4-124:86"
				:isContainer false
				:opposite correspondsToConcept
			)]
		) ) ( def DataRepresentation_RelationShip ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[SimplfiedMiningMart_ModelElement CaseRepresentation_Parameter]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "subRelationShipRestriction"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_RelationShip
				:type String
				:location "132:3-132:49"
			) ( struct-map
				KM3_Attribute
				:name "defined"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_RelationShip
				:type String
				:location "133:3-133:30"
			) ( struct-map
				KM3_Reference
				:name "isA"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_RelationShip
				:type DataRepresentation_RelationShip
				:location "134:3-134:32"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "correspondsToForeignKey"
				:upper -1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_RelationShip
				:type DataRepresentation_ForeignKey
				:location "135:3-135:93"
				:isContainer false
				:opposite correspondsToRelationShip
			) ( struct-map
				KM3_Reference
				:name "correspondsToColumnSet"
				:upper 1
				:lower 0
				:isOrdered false
				:owner DataRepresentation_RelationShip
				:type DataRepresentation_ColumnSet
				:location "136:3-136:90"
				:isContainer false
				:opposite correspondsToRelationShip
			) ( struct-map
				KM3_Reference
				:name "FromConcept"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_RelationShip
				:type DataRepresentation_Concept
				:location "137:3-137:58"
				:isContainer false
				:opposite FromConcept
			) ( struct-map
				KM3_Reference
				:name "ToConcept"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_RelationShip
				:type DataRepresentation_Concept
				:location "138:3-138:54"
				:isContainer false
				:opposite ToConcept
			)]
		) ) ( def DataRepresentation_FeatureAttribute ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[SimplfiedMiningMart_Attribute]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "name"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_FeatureAttribute
				:type String
				:location "143:3-143:27"
			) ( struct-map
				KM3_Attribute
				:name "relevanceForMining"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_FeatureAttribute
				:type Boolean
				:location "144:3-144:42"
			) ( struct-map
				KM3_Reference
				:name "attributeType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_FeatureAttribute
				:type SimplfiedMiningMart_DataType
				:location "145:3-145:38"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "belongsToConcept"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_FeatureAttribute
				:type DataRepresentation_Concept
				:location "146:3-146:50"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "correspondsToColumns"
				:upper -1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_FeatureAttribute
				:type DataRepresentation_Column
				:location "147:3-147:48"
				:isContainer false
			)]
		) ) ( def DataRepresentation_BaseAttribute ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[DataRepresentation_FeatureAttribute]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "isPartMultiColumnFeature"
				:upper 1
				:lower 0
				:isOrdered false
				:owner DataRepresentation_BaseAttribute
				:type DataRepresentation_MultiColumnFeature
				:location "152:3-152:99"
				:isContainer false
				:opposite consitsOfBaseAttributes
			) ( struct-map
				KM3_Reference
				:name "domainDataType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_BaseAttribute
				:type DataRepresentation_DomainDataType
				:location "153:3-153:71"
				:isContainer false
				:opposite baseAttributeD
			)]
		) ) ( def DataRepresentation_MultiColumnFeature ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[DataRepresentation_FeatureAttribute]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "consitsOfBaseAttributes"
				:upper -1
				:lower 0
				:isOrdered false
				:owner DataRepresentation_MultiColumnFeature
				:type DataRepresentation_BaseAttribute
				:location "158:3-158:102"
				:isContainer true
				:opposite isPartMultiColumnFeature
			)]
		) ) ( def DataRepresentation_Value ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[SimplfiedMiningMart_Attribute CaseRepresentation_Parameter]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "domainDataType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_Value
				:type DataRepresentation_DomainDataType
				:location "164:3-164:45"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "belongsToUserInput"
				:upper -1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_Value
				:type DataRepresentation_UserInput
				:location "165:3-165:59"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "linkPackage"
				:upper 1
				:lower 0
				:isOrdered false
				:owner DataRepresentation_Value
				:type MiningMart_LinkPackage
				:location "166:3-166:61"
				:isContainer false
				:opposite value
			)]
		) ) ( def DataRepresentation_UserInput ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[SimplfiedMiningMart_Class]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "containsValues"
				:upper -1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_UserInput
				:type DataRepresentation_Value
				:location "172:3-172:41"
				:isContainer false
			)]
		) ) ( def DataRepresentation_Ordinal ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[DataRepresentation_DomainDataType]
			:structuralFeatures[]
		) ) ( def DataRepresentation_Scalar ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[DataRepresentation_Ordinal]
			:structuralFeatures[]
		) ) ( def DataRepresentation_Time ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[DataRepresentation_Scalar]
			:structuralFeatures[]
		) ) ( def DataRepresentation_Binary ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[DataRepresentation_Scalar DataRepresentation_Nominal]
			:structuralFeatures[]
		) ) ( def DataRepresentation_Categorial ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[DataRepresentation_Nominal]
			:structuralFeatures[]
		) ) ( def DataRepresentation_KeyAttribute ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[DataRepresentation_Nominal]
			:structuralFeatures[]
		) ) ( def DataRepresentation_TimeGroup ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[DataRepresentation_KeyAttribute]
			:structuralFeatures[]
		) ) ( def DataRepresentation_Spatial ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[DataRepresentation_KeyAttribute]
			:structuralFeatures[]
		) ) ( def DataRepresentation_Constant ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[DataRepresentation_Nominal]
			:structuralFeatures[]
		) ) ( def DataRepresentation_RoleRestriction ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[SimplfiedMiningMart_Attribute]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "name"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_RoleRestriction
				:type String
				:location "204:3-204:27"
			) ( struct-map
				KM3_Attribute
				:name "min"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_RoleRestriction
				:type Integer
				:location "208:3-208:27"
			) ( struct-map
				KM3_Attribute
				:name "max"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_RoleRestriction
				:type Integer
				:location "209:3-209:27"
			) ( struct-map
				KM3_Reference
				:name "restrictionForRelationShip"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_RoleRestriction
				:type DataRepresentation_RelationShip
				:location "205:3-205:55"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "restrictionForConcept"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_RoleRestriction
				:type DataRepresentation_Concept
				:location "206:3-206:45"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "restrictionToConcept"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_RoleRestriction
				:type DataRepresentation_Concept
				:location "207:3-207:44"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "belongsToConcept"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_RoleRestriction
				:type DataRepresentation_Concept
				:location "210:3-210:40"
				:isContainer false
			)]
		) ) ( def DataRepresentation_DomainDataType ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[SimplfiedMiningMart_DataType]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "baseAttributeD"
				:upper 1
				:lower 1
				:isOrdered false
				:owner DataRepresentation_DomainDataType
				:type DataRepresentation_BaseAttribute
				:location "215:3-215:70"
				:isContainer false
				:opposite domainDataType
			)]
		) ) ( def DataRepresentation_Nominal ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[DataRepresentation_DomainDataType]
			:structuralFeatures[]
		) )]
	) ) ( def CaseRepresentation ( struct-map
		KM3_Package
		:contents[( def ParameterType ( :literals[( struct-map
			KM3_EnumLiteral
			:name "Value"
			:location "282:3-282:17"
		) ( struct-map
			KM3_EnumLiteral
			:name "Concept"
			:location "283:3-283:19"
		) ( struct-map
			KM3_EnumLiteral
			:name "RelationShip"
			:location "284:3-284:24"
		) ( struct-map
			KM3_EnumLiteral
			:name "FeatureAttribute"
			:location "285:3-285:28"
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
				:location "229:3-229:27"
			) ( struct-map
				KM3_Attribute
				:name "caseMode"
				:upper 1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_Case
				:type Boolean
				:location "230:3-230:32"
			) ( struct-map
				KM3_Attribute
				:name "documentation"
				:upper 1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_Case
				:type String
				:location "233:3-233:36"
			) ( struct-map
				KM3_Reference
				:name "caseInput"
				:upper 1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_Case
				:type CaseRepresentation_Parameter
				:location "231:3-231:35"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "caseOutput"
				:upper 1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_Case
				:type DataRepresentation_Concept
				:location "232:3-232:34"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "listOfStep"
				:upper -1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_Case
				:type CaseRepresentation_Step
				:location "234:3-234:71"
				:isContainer true
				:opposite belongsToCase
			) ( struct-map
				KM3_Reference
				:name "population"
				:upper 1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_Case
				:type DataRepresentation_Concept
				:location "235:3-235:34"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "targetAttributes"
				:upper 1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_Case
				:type DataRepresentation_FeatureAttribute
				:location "236:3-236:49"
				:isContainer false
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
				:location "241:3-241:27"
			) ( struct-map
				KM3_Attribute
				:name "description"
				:upper 1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_Step
				:type String
				:location "242:3-242:34"
			) ( struct-map
				KM3_Reference
				:name "belongsToCase"
				:upper 1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_Step
				:type CaseRepresentation_Case
				:location "243:3-243:56"
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
				:location "244:3-244:39"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "predecessors"
				:upper -1
				:lower 0
				:isOrdered false
				:owner CaseRepresentation_Step
				:type CaseRepresentation_Step
				:location "245:3-245:36"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "successors"
				:upper -1
				:lower 0
				:isOrdered false
				:owner CaseRepresentation_Step
				:type CaseRepresentation_Step
				:location "246:3-246:34"
				:isContainer false
			)]
		) ) ( def CaseRepresentation_LoopStep ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[CaseRepresentation_Step]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "iterationSet"
				:upper -1
				:lower 0
				:isOrdered true
				:owner CaseRepresentation_LoopStep
				:type DataRepresentation_FeatureAttribute
				:location "251:3-251:56"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "outputSet"
				:upper -1
				:lower 0
				:isOrdered true
				:owner CaseRepresentation_LoopStep
				:type DataRepresentation_FeatureAttribute
				:location "252:3-252:53"
				:isContainer false
			)]
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
				:location "257:3-257:41"
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
				:location "262:2-262:30"
			) ( struct-map
				KM3_Attribute
				:name "numberOfInputParameters"
				:upper 1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_Operator
				:type Integer
				:location "263:2-263:46"
			) ( struct-map
				KM3_Attribute
				:name "numberOfOutputParameters"
				:upper 1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_Operator
				:type Integer
				:location "264:2-264:47"
			) ( struct-map
				KM3_Attribute
				:name "manual"
				:upper 1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_Operator
				:type Boolean
				:location "265:2-265:29"
			) ( struct-map
				KM3_Attribute
				:name "tool"
				:upper 1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_Operator
				:type String
				:location "266:2-266:26"
			) ( struct-map
				KM3_Reference
				:name "input"
				:upper -1
				:lower 1
				:isOrdered true
				:owner CaseRepresentation_Operator
				:type CaseRepresentation_Parameter
				:location "267:2-267:43"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "output"
				:upper -1
				:lower 1
				:isOrdered true
				:owner CaseRepresentation_Operator
				:type CaseRepresentation_Parameter
				:location "268:2-268:44"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "realizes"
				:upper 1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_Operator
				:type CaseRepresentation_ExecutionElement
				:location "269:3-269:41"
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
				:location "274:3-274:27"
			) ( struct-map
				KM3_Attribute
				:name "place"
				:upper 1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_Parameter
				:type String
				:location "275:3-275:28"
			) ( struct-map
				KM3_Attribute
				:name "parameterType"
				:upper 1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_Parameter
				:type ParameterType
				:location "276:3-276:43"
			) ( struct-map
				KM3_Reference
				:name "belongsToOperator"
				:upper 1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_Parameter
				:type CaseRepresentation_Operator
				:location "277:3-277:42"
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
				:location "290:3-290:37"
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
				:location "309:3-309:51"
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
				:location "310:3-310:51"
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
				:location "314:3-314:57"
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
				:location "315:3-315:57"
				:isContainer false
				:opposite target
			) ( struct-map
				KM3_Reference
				:name "linkPackageCaseRepresentation"
				:upper 1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_DataObject
				:type MiningMart_LinkPackage
				:location "316:3-316:79"
				:isContainer false
				:opposite dataObject
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
				:location "322:3-322:89"
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
				:location "327:3-327:81"
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
				:location "331:2-331:28"
			) ( struct-map
				KM3_Attribute
				:name "signature"
				:upper 1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_Function
				:type String
				:location "332:2-332:31"
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
				:location "336:3-336:29"
			) ( struct-map
				KM3_Attribute
				:name "signature"
				:upper 1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_StoredProcedure
				:type String
				:location "337:4-337:33"
			)]
		) ) ( def CaseRepresentation_SQLQuery ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[CaseRepresentation_Transformation]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "where"
				:upper -1
				:lower 0
				:isOrdered false
				:owner CaseRepresentation_SQLQuery
				:type String
				:location "343:3-343:31"
			) ( struct-map
				KM3_Reference
				:name "select"
				:upper -1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_SQLQuery
				:type DataRepresentation_Column
				:location "341:3-341:34"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "from"
				:upper -1
				:lower 1
				:isOrdered false
				:owner CaseRepresentation_SQLQuery
				:type DataRepresentation_ColumnSet
				:location "342:3-342:35"
				:isContainer false
			)]
		) )]
	) ) ( def MiningMart_LinkPackage ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MiningMart_LinkPackage
			:type InOut
			:location "359:2-359:25"
		) ( struct-map
			KM3_Reference
			:name "dataObject"
			:upper 1
			:lower 1
			:isOrdered false
			:owner MiningMart_LinkPackage
			:type CaseRepresentation_DataObject
			:location "360:2-360:77"
			:isContainer false
			:opposite linkPackageCaseRepresentation
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MiningMart_LinkPackage
			:type DataRepresentation_Value
			:location "361:2-361:54"
			:isContainer false
			:opposite linkPackage
		) ( struct-map
			KM3_Reference
			:name "column"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MiningMart_LinkPackage
			:type DataRepresentation_Column
			:location "362:2-362:56"
			:isContainer false
			:opposite linkPackage
		) ( struct-map
			KM3_Reference
			:name "columnSet"
			:upper 1
			:lower 0
			:isOrdered false
			:owner MiningMart_LinkPackage
			:type DataRepresentation_ColumnSet
			:location "363:2-363:62"
			:isContainer false
			:opposite linkPackage
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "369:2-369:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "370:2-370:19"
	) ) ( def ptyp_Real ( struct-map
		KM3_DataType
		:name "Real"
		:location "371:2-371:16"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "372:2-372:19"
	) )]
) )
