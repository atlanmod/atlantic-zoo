( declare ChocoModel_LocatedElement )
( declare ChocoModel_OpConstraint )
( declare ChocoModel_Package )
( declare ChocoModel_Import )
( declare ChocoModel_ChocoProblem )
( declare ChocoModel_Element )
( declare ChocoModel_Expression )
( declare ChocoModel_ConstraintDef )
( declare ChocoModel_IntVar )
( declare ChocoModel_Domain )
( declare ChocoModel_IntConstant )
( declare ChocoModel_SymbolicTerm )
( declare ChocoModel_IntValue )
( declare ChocoModel_IntExp )
( declare ChocoModel_Constraint )
( declare ChocoModel_PostConstraint )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def ChocoModel ( struct-map
	KM3_Package
	:contents[( def OpConstraint ( :literals[( struct-map
		KM3_EnumLiteral
		:name "eq"
		:location "35:3-35:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "and2"
		:location "36:3-36:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "or2"
		:location "37:3-37:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "gt"
		:location "38:3-38:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "ge"
		:location "39:3-39:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "lt"
		:location "40:3-40:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "le"
		:location "41:3-41:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "plus"
		:location "42:3-42:16"
	)] ) ) ( def ChocoModel_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ChocoModel_LocatedElement
			:type String
			:location "24:3-24:36"
		) ( struct-map
			KM3_Attribute
			:name "commentsBefore"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ChocoModel_LocatedElement
			:type String
			:location "25:3-25:48"
		) ( struct-map
			KM3_Attribute
			:name "commentsAfter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ChocoModel_LocatedElement
			:type String
			:location "26:3-26:47"
		)]
	) ) ( def ChocoModel_Package ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ChocoModel_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_Package
			:type String
			:location "46:3-46:27"
		) ( struct-map
			KM3_Reference
			:name "import"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ChocoModel_Package
			:type ChocoModel_Import
			:location "48:3-48:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "problem"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_Package
			:type ChocoModel_ChocoProblem
			:location "49:3-49:46"
			:isContainer true
		)]
	) ) ( def ChocoModel_Import ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ChocoModel_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "fqn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_Import
			:type String
			:location "53:3-53:26"
		)]
	) ) ( def ChocoModel_ChocoProblem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ChocoModel_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_ChocoProblem
			:type String
			:location "57:3-57:27"
		) ( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ChocoModel_ChocoProblem
			:type ChocoModel_Element
			:location "59:3-59:45"
			:isContainer true
		)]
	) ) ( def ChocoModel_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ChocoModel_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "label"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_Element
			:type String
			:location "63:3-63:28"
		)]
	) ) ( def ChocoModel_Expression ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ChocoModel_Element]
		:structuralFeatures[]
	) ) ( def ChocoModel_ConstraintDef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ChocoModel_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "op"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_ConstraintDef
			:type OpConstraint
			:location "71:3-71:31"
		) ( struct-map
			KM3_Reference
			:name "left"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_ConstraintDef
			:type ChocoModel_Expression
			:location "73:3-73:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "right"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_ConstraintDef
			:type ChocoModel_Expression
			:location "74:3-74:42"
			:isContainer true
		)]
	) ) ( def ChocoModel_IntVar ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ChocoModel_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "domain"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_IntVar
			:type ChocoModel_Domain
			:location "78:3-78:39"
			:isContainer true
		)]
	) ) ( def ChocoModel_Domain ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ChocoModel_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "lower"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_Domain
			:type Integer
			:location "82:3-82:29"
		) ( struct-map
			KM3_Attribute
			:name "upper"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_Domain
			:type Integer
			:location "83:3-83:29"
		)]
	) ) ( def ChocoModel_IntConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ChocoModel_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_IntConstant
			:type Integer
			:location "87:3-87:27"
		)]
	) ) ( def ChocoModel_SymbolicTerm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ChocoModel_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "term"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_SymbolicTerm
			:type ChocoModel_Expression
			:location "91:3-91:31"
			:isContainer false
		)]
	) ) ( def ChocoModel_IntValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ChocoModel_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_IntValue
			:type Integer
			:location "95:3-95:27"
		)]
	) ) ( def ChocoModel_IntExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ChocoModel_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "op"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_IntExp
			:type OpConstraint
			:location "99:3-99:31"
		) ( struct-map
			KM3_Reference
			:name "left"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_IntExp
			:type ChocoModel_Expression
			:location "101:3-101:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "right"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_IntExp
			:type ChocoModel_Expression
			:location "102:3-102:42"
			:isContainer true
		)]
	) ) ( def ChocoModel_Constraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ChocoModel_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "op"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_Constraint
			:type OpConstraint
			:location "106:3-106:31"
		) ( struct-map
			KM3_Reference
			:name "left"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_Constraint
			:type ChocoModel_Expression
			:location "108:3-108:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "right"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_Constraint
			:type ChocoModel_Expression
			:location "109:3-109:42"
			:isContainer true
		)]
	) ) ( def ChocoModel_PostConstraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ChocoModel_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "op"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_PostConstraint
			:type OpConstraint
			:location "113:3-113:31"
		) ( struct-map
			KM3_Reference
			:name "constraint"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ChocoModel_PostConstraint
			:type ChocoModel_ConstraintDef
			:location "115:3-115:40"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "122:2-122:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "123:2-123:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "124:2-124:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "125:2-125:18"
	) )]
) )
