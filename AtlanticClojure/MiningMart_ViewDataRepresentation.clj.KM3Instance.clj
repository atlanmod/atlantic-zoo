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
( declare DataRepresentation_Parameter )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Boolean )
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
( def DataRepresentation ( struct-map
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
			:location "45:3-45:27"
		) ( struct-map
			KM3_Reference
			:name "dataType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_Column
			:type SimplfiedMiningMart_DataType
			:location "46:3-46:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "keys"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DataRepresentation_Column
			:type DataRepresentation_Key
			:location "47:3-47:48"
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
			:location "48:3-48:65"
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
			:location "49:3-49:55"
			:isContainer false
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
			:location "57:3-57:30"
		) ( struct-map
			KM3_Attribute
			:name "file"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_ColumnSet
			:type String
			:location "58:3-58:27"
		) ( struct-map
			KM3_Attribute
			:name "dbConnectString"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_ColumnSet
			:type String
			:location "59:3-59:38"
		) ( struct-map
			KM3_Attribute
			:name "user"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_ColumnSet
			:type String
			:location "60:3-60:27"
		) ( struct-map
			KM3_Reference
			:name "hasColumn"
			:upper -1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_ColumnSet
			:type DataRepresentation_Column
			:location "61:3-61:67"
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
			:location "62:3-62:66"
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
			:location "63:3-63:83"
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
			:location "64:3-64:95"
			:isContainer false
			:opposite correspondsToColumnSet
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
			:location "69:4-69:33"
		) ( struct-map
			KM3_Attribute
			:name "missing"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_ColumnStatistics
			:type Integer
			:location "70:3-70:31"
		) ( struct-map
			KM3_Attribute
			:name "min"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_ColumnStatistics
			:type Integer
			:location "71:3-71:27"
		) ( struct-map
			KM3_Attribute
			:name "max"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_ColumnStatistics
			:type Integer
			:location "72:3-72:27"
		) ( struct-map
			KM3_Attribute
			:name "average"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_ColumnStatistics
			:type Integer
			:location "73:3-73:31"
		) ( struct-map
			KM3_Attribute
			:name "standarDeviation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_ColumnStatistics
			:type Integer
			:location "74:3-74:40"
		) ( struct-map
			KM3_Attribute
			:name "distributionValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_ColumnStatistics
			:type String
			:location "75:3-75:40"
		) ( struct-map
			KM3_Attribute
			:name "distributionCount"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_ColumnStatistics
			:type Integer
			:location "76:3-76:41"
		) ( struct-map
			KM3_Attribute
			:name "distributionMin"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_ColumnStatistics
			:type Integer
			:location "77:3-77:39"
		) ( struct-map
			KM3_Attribute
			:name "distributionMax"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_ColumnStatistics
			:type Integer
			:location "78:3-78:39"
		) ( struct-map
			KM3_Reference
			:name "forColumn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_ColumnStatistics
			:type DataRepresentation_Column
			:location "79:3-79:32"
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
			:location "84:3-84:33"
		) ( struct-map
			KM3_Attribute
			:name "ordinalNumber"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_ColumnSetStatistics
			:type Integer
			:location "85:3-85:37"
		) ( struct-map
			KM3_Attribute
			:name "nominalNumber"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_ColumnSetStatistics
			:type Integer
			:location "86:3-86:37"
		) ( struct-map
			KM3_Attribute
			:name "timeNumber"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_ColumnSetStatistics
			:type Integer
			:location "87:3-87:34"
		) ( struct-map
			KM3_Reference
			:name "forColumnSet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_ColumnSetStatistics
			:type DataRepresentation_ColumnSet
			:location "88:3-88:38"
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
			:location "97:3-97:38"
		) ( struct-map
			KM3_Reference
			:name "hasColumn"
			:upper -1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_Key
			:type DataRepresentation_Column
			:location "98:3-98:53"
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
			:location "99:3-99:67"
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
			:location "103:3-103:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "correspondsToRelationShip"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DataRepresentation_ForeignKey
			:type DataRepresentation_RelationShip
			:location "104:3-104:94"
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
		:supertypes[SimplfiedMiningMart_Class DataRepresentation_Parameter]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "subConceptRestriction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_Concept
			:type String
			:location "114:3-114:44"
		) ( struct-map
			KM3_Reference
			:name "isA"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_Concept
			:type DataRepresentation_Concept
			:location "115:3-115:27"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "FromConcept"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_Concept
			:type DataRepresentation_RelationShip
			:location "116:3-116:64"
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
			:location "117:4-117:60"
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
			:location "118:4-118:86"
			:isContainer false
			:opposite correspondsToConcept
		)]
	) ) ( def DataRepresentation_RelationShip ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplfiedMiningMart_ModelElement DataRepresentation_Parameter]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_RelationShip
			:type String
			:location "125:3-125:27"
		) ( struct-map
			KM3_Attribute
			:name "subRelationShipRestriction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_RelationShip
			:type String
			:location "126:3-126:49"
		) ( struct-map
			KM3_Attribute
			:name "defined"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_RelationShip
			:type String
			:location "127:3-127:30"
		) ( struct-map
			KM3_Reference
			:name "isA"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_RelationShip
			:type DataRepresentation_RelationShip
			:location "128:3-128:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "correspondsToForeignKey"
			:upper -1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_RelationShip
			:type DataRepresentation_ForeignKey
			:location "129:3-129:93"
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
			:location "130:3-130:90"
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
			:location "131:3-131:58"
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
			:location "132:3-132:54"
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
			:location "137:3-137:27"
		) ( struct-map
			KM3_Attribute
			:name "relevanceForMining"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_FeatureAttribute
			:type Boolean
			:location "138:3-138:42"
		) ( struct-map
			KM3_Reference
			:name "attributeType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_FeatureAttribute
			:type SimplfiedMiningMart_DataType
			:location "139:3-139:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "belongsToConcept"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_FeatureAttribute
			:type DataRepresentation_Concept
			:location "140:3-140:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "correspondsToColumns"
			:upper -1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_FeatureAttribute
			:type DataRepresentation_Column
			:location "141:3-141:48"
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
			:location "146:3-146:99"
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
			:location "147:3-147:71"
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
			:location "152:3-152:102"
			:isContainer true
			:opposite isPartMultiColumnFeature
		)]
	) ) ( def DataRepresentation_Value ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SimplfiedMiningMart_Attribute DataRepresentation_Parameter]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_Value
			:type String
			:location "157:3-157:26"
		) ( struct-map
			KM3_Reference
			:name "domainDataType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_Value
			:type DataRepresentation_DomainDataType
			:location "158:3-158:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "belongsToUserInput"
			:upper -1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_Value
			:type DataRepresentation_UserInput
			:location "159:3-159:59"
			:isContainer true
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
			:location "165:3-165:41"
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
			:location "197:3-197:27"
		) ( struct-map
			KM3_Attribute
			:name "min"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_RoleRestriction
			:type Integer
			:location "201:3-201:27"
		) ( struct-map
			KM3_Attribute
			:name "max"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_RoleRestriction
			:type Integer
			:location "202:3-202:27"
		) ( struct-map
			KM3_Reference
			:name "restrictionForRelationShip"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_RoleRestriction
			:type DataRepresentation_RelationShip
			:location "198:3-198:55"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "restrictionForConcept"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_RoleRestriction
			:type DataRepresentation_Concept
			:location "199:3-199:45"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "restrictionToConcept"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_RoleRestriction
			:type DataRepresentation_Concept
			:location "200:3-200:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "belongsToConcept"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DataRepresentation_RoleRestriction
			:type DataRepresentation_Concept
			:location "203:3-203:40"
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
			:location "208:3-208:70"
			:isContainer false
			:opposite domainDataType
		)]
	) ) ( def DataRepresentation_Nominal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DataRepresentation_DomainDataType]
		:structuralFeatures[]
	) ) ( def DataRepresentation_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "218:2-218:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "219:2-219:19"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "220:2-220:19"
	) )]
) )
