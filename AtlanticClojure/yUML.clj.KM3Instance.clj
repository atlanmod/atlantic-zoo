( declare yUML_LocatedElement )
( declare yUML_Model )
( declare yUML_Class )
( declare yUML_ModelElement )
( declare yUML_ColorableElement )
( declare yUML_ClassReference )
( declare yUML_AssociationType )
( declare yUML_Relationship )
( declare yUML_ClassDefinition )
( declare yUML_Association )
( declare yUML_Inheritance )
( declare yUML_Cardinality )
( declare yUML_Visibility )
( declare yUML_ClassMember )
( declare yUML_Attribute )
( declare yUML_Method )
( declare yUML_Note )
( declare yUML_NoteAssociation )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def yUML ( struct-map
	KM3_Package
	:contents[( def AssociationType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "simpleAssociation"
		:location "42:3-42:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "aggregation"
		:location "43:3-43:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "composition"
		:location "44:3-44:23"
	)] ) ) ( def Visibility ( :literals[( struct-map
		KM3_EnumLiteral
		:name "unspecified"
		:location "78:3-78:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "public"
		:location "79:3-79:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "private"
		:location "80:3-80:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "protected"
		:location "81:3-81:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "package"
		:location "82:3-82:21"
	)] ) ) ( def yUML_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 0
			:isOrdered false
			:owner yUML_LocatedElement
			:type String
			:location "11:3-11:36"
		) ( struct-map
			KM3_Attribute
			:name "commentsBefore"
			:upper -1
			:lower 0
			:isOrdered true
			:owner yUML_LocatedElement
			:type String
			:location "12:3-12:48"
		) ( struct-map
			KM3_Attribute
			:name "commentsAfter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner yUML_LocatedElement
			:type String
			:location "13:3-13:47"
		)]
	) ) ( def yUML_Model ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[yUML_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "classes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner yUML_Model
			:type yUML_Class
			:location "17:3-17:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered true
			:owner yUML_Model
			:type yUML_ModelElement
			:location "18:3-19:21"
			:isContainer true
			:opposite model
		)]
	) ) ( def yUML_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[yUML_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner yUML_Class
			:type String
			:location "23:3-23:27"
		)]
	) ) ( def yUML_ModelElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[yUML_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "model"
			:upper 1
			:lower 1
			:isOrdered false
			:owner yUML_ModelElement
			:type yUML_Model
			:location "27:3-27:47"
			:isContainer false
			:opposite elements
		)]
	) ) ( def yUML_ColorableElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[yUML_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "color"
			:upper 1
			:lower 0
			:isOrdered false
			:owner yUML_ColorableElement
			:type String
			:location "32:3-32:33"
		)]
	) ) ( def yUML_ClassReference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[yUML_ColorableElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "stereotype"
			:upper 1
			:lower 0
			:isOrdered false
			:owner yUML_ClassReference
			:type String
			:location "37:3-37:38"
		) ( struct-map
			KM3_Reference
			:name "class"
			:upper 1
			:lower 1
			:isOrdered false
			:owner yUML_ClassReference
			:type yUML_Class
			:location "36:3-36:29"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "definition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner yUML_ClassReference
			:type yUML_ClassDefinition
			:location "38:3-38:57"
			:isContainer true
		)]
	) ) ( def yUML_Relationship ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[yUML_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner yUML_Relationship
			:type yUML_ClassReference
			:location "48:3-48:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner yUML_Relationship
			:type yUML_ClassReference
			:location "49:3-49:47"
			:isContainer true
		)]
	) ) ( def yUML_ClassDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[yUML_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "attributes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner yUML_ClassDefinition
			:type yUML_Attribute
			:location "53:3-53:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "methods"
			:upper -1
			:lower 0
			:isOrdered true
			:owner yUML_ClassDefinition
			:type yUML_Method
			:location "54:3-54:51"
			:isContainer true
		)]
	) ) ( def yUML_Association ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[yUML_Relationship]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner yUML_Association
			:type AssociationType
			:location "58:3-58:36"
		) ( struct-map
			KM3_Attribute
			:name "sourceLabel"
			:upper 1
			:lower 0
			:isOrdered false
			:owner yUML_Association
			:type String
			:location "60:3-60:39"
		) ( struct-map
			KM3_Attribute
			:name "navigableSource"
			:upper 1
			:lower 1
			:isOrdered false
			:owner yUML_Association
			:type Boolean
			:location "61:3-61:39"
		) ( struct-map
			KM3_Attribute
			:name "sourceVisibility"
			:upper 1
			:lower 1
			:isOrdered false
			:owner yUML_Association
			:type Visibility
			:location "62:3-62:43"
		) ( struct-map
			KM3_Attribute
			:name "targetLabel"
			:upper 1
			:lower 0
			:isOrdered false
			:owner yUML_Association
			:type String
			:location "64:3-64:39"
		) ( struct-map
			KM3_Attribute
			:name "navigableTarget"
			:upper 1
			:lower 1
			:isOrdered false
			:owner yUML_Association
			:type Boolean
			:location "65:3-65:39"
		) ( struct-map
			KM3_Attribute
			:name "targetVisibility"
			:upper 1
			:lower 1
			:isOrdered false
			:owner yUML_Association
			:type Visibility
			:location "66:3-66:43"
		) ( struct-map
			KM3_Reference
			:name "sourceCardinality"
			:upper 1
			:lower 0
			:isOrdered false
			:owner yUML_Association
			:type yUML_Cardinality
			:location "59:3-59:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "targetCardinality"
			:upper 1
			:lower 0
			:isOrdered false
			:owner yUML_Association
			:type yUML_Cardinality
			:location "63:3-63:60"
			:isContainer true
		)]
	) ) ( def yUML_Inheritance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[yUML_Relationship]
		:structuralFeatures[]
	) ) ( def yUML_Cardinality ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[yUML_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "lowerBound"
			:upper 1
			:lower 0
			:isOrdered false
			:owner yUML_Cardinality
			:type Integer
			:location "73:3-73:39"
		) ( struct-map
			KM3_Attribute
			:name "upperBound"
			:upper 1
			:lower 1
			:isOrdered false
			:owner yUML_Cardinality
			:type Integer
			:location "74:3-74:34"
		)]
	) ) ( def yUML_ClassMember ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[yUML_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "visibility"
			:upper 1
			:lower 1
			:isOrdered false
			:owner yUML_ClassMember
			:type Visibility
			:location "86:3-86:37"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner yUML_ClassMember
			:type String
			:location "87:3-87:27"
		)]
	) ) ( def yUML_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[yUML_ClassMember]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner yUML_Attribute
			:type String
			:location "91:3-91:32"
		)]
	) ) ( def yUML_Method ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[yUML_ClassMember]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered false
			:owner yUML_Method
			:type String
			:location "95:3-95:35"
		)]
	) ) ( def yUML_Note ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[yUML_ColorableElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "text"
			:upper -1
			:lower 0
			:isOrdered false
			:owner yUML_Note
			:type String
			:location "99:3-99:30"
		)]
	) ) ( def yUML_NoteAssociation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[yUML_Relationship]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "note"
			:upper 1
			:lower 1
			:isOrdered false
			:owner yUML_NoteAssociation
			:type yUML_Note
			:location "103:3-103:35"
			:isContainer true
		)]
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
