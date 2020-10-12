( declare SQLDML_LocatedElement )
( declare SQLDML_SQLRoot )
( declare SQLDML_Statement )
( declare SQLDML_ViewStatement )
( declare SQLDML_InsertStmt )
( declare SQLDML_QueryStmt )
( declare SQLDML_QueryStmtCol )
( declare SQLDML_QueryStmtAllCol )
( declare SQLDML_NamedElement )
( declare SQLDML_Table )
( declare SQLDML_WhereClause )
( declare SQLDML_Expression )
( declare SQLDML_BinaryExp )
( declare SQLDML_OrExp )
( declare SQLDML_AndExp )
( declare SQLDML_NotExp )
( declare SQLDML_LikeExp )
( declare SQLDML_InExp )
( declare SQLDML_OperationExp )
( declare SQLDML_Predicate )
( declare SQLDML_QueryPredicate )
( declare SQLDML_ColumnExp )
( declare SQLDML_ValueExp )
( declare SQLDML_StringValueExp )
( declare SQLDML_IntegerValueExp )
( declare SQLDML_ListExp )
( declare SQLDML_FunctionExp )
( declare SQLDML_DataType )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def SQLDML ( struct-map
	KM3_Package
	:contents[( def SQLDML_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_LocatedElement
			:type String
			:location "11:3-11:31"
		) ( struct-map
			KM3_Attribute
			:name "commentsBefore"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SQLDML_LocatedElement
			:type String
			:location "12:3-12:40"
		) ( struct-map
			KM3_Attribute
			:name "commentsAfter"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SQLDML_LocatedElement
			:type String
			:location "13:3-13:39"
		)]
	) ) ( def SQLDML_SQLRoot ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDML_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "statements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SQLDML_SQLRoot
			:type SQLDML_Statement
			:location "18:3-18:50"
			:isContainer true
		)]
	) ) ( def SQLDML_Statement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SQLDML_LocatedElement]
		:structuralFeatures[]
	) ) ( def SQLDML_ViewStatement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDML_Statement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_ViewStatement
			:type String
			:location "24:3-24:27"
		) ( struct-map
			KM3_Reference
			:name "columns"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SQLDML_ViewStatement
			:type SQLDML_ColumnExp
			:location "25:3-25:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "query"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_ViewStatement
			:type SQLDML_QueryStmt
			:location "26:3-26:41"
			:isContainer true
		)]
	) ) ( def SQLDML_InsertStmt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDML_Statement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "tableName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_InsertStmt
			:type String
			:location "30:3-30:32"
		) ( struct-map
			KM3_Reference
			:name "values"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SQLDML_InsertStmt
			:type SQLDML_Expression
			:location "31:3-31:46"
			:isContainer true
		)]
	) ) ( def SQLDML_QueryStmt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SQLDML_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tables"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SQLDML_QueryStmt
			:type SQLDML_Table
			:location "36:3-36:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SQLDML_QueryStmt
			:type SQLDML_WhereClause
			:location "37:3-37:53"
			:isContainer true
		)]
	) ) ( def SQLDML_QueryStmtCol ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDML_QueryStmt]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "columns"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SQLDML_QueryStmtCol
			:type SQLDML_Expression
			:location "40:3-40:50"
			:isContainer true
		)]
	) ) ( def SQLDML_QueryStmtAllCol ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDML_QueryStmt]
		:structuralFeatures[]
	) ) ( def SQLDML_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SQLDML_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_NamedElement
			:type String
			:location "47:3-47:27"
		)]
	) ) ( def SQLDML_Table ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDML_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "alias"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_Table
			:type String
			:location "51:3-51:28"
		)]
	) ) ( def SQLDML_WhereClause ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDML_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_WhereClause
			:type SQLDML_Expression
			:location "55:3-55:47"
			:isContainer true
		)]
	) ) ( def SQLDML_Expression ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SQLDML_LocatedElement]
		:structuralFeatures[]
	) ) ( def SQLDML_BinaryExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SQLDML_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "opName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_BinaryExp
			:type String
			:location "62:3-62:29"
		) ( struct-map
			KM3_Reference
			:name "leftExp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_BinaryExp
			:type SQLDML_Expression
			:location "63:3-63:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rightExp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_BinaryExp
			:type SQLDML_Expression
			:location "64:3-64:45"
			:isContainer true
		)]
	) ) ( def SQLDML_OrExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDML_BinaryExp]
		:structuralFeatures[]
	) ) ( def SQLDML_AndExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDML_BinaryExp]
		:structuralFeatures[]
	) ) ( def SQLDML_NotExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDML_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "opName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_NotExp
			:type String
			:location "74:3-74:29"
		) ( struct-map
			KM3_Reference
			:name "valueExp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_NotExp
			:type SQLDML_Expression
			:location "75:3-75:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "unused"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SQLDML_NotExp
			:type SQLDML_Expression
			:location "76:3-76:48"
			:isContainer true
		)]
	) ) ( def SQLDML_LikeExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDML_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "columnName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_LikeExp
			:type String
			:location "80:3-80:33"
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_LikeExp
			:type SQLDML_StringValueExp
			:location "81:3-81:51"
			:isContainer true
		)]
	) ) ( def SQLDML_InExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDML_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "columnName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_InExp
			:type String
			:location "86:3-86:33"
		) ( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SQLDML_InExp
			:type SQLDML_Predicate
			:location "87:3-87:50"
			:isContainer true
		)]
	) ) ( def SQLDML_OperationExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDML_BinaryExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "optName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_OperationExp
			:type String
			:location "90:3-90:30"
		)]
	) ) ( def SQLDML_Predicate ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SQLDML_Expression]
		:structuralFeatures[]
	) ) ( def SQLDML_QueryPredicate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDML_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "query"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_QueryPredicate
			:type SQLDML_QueryStmt
			:location "97:3-97:41"
			:isContainer true
		)]
	) ) ( def SQLDML_ColumnExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDML_Predicate SQLDML_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "alias"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_ColumnExp
			:type String
			:location "101:3-101:28"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_ColumnExp
			:type SQLDML_DataType
			:location "102:3-102:39"
			:isContainer true
		)]
	) ) ( def SQLDML_ValueExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SQLDML_Predicate]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SQLDML_ValueExp
			:type SQLDML_DataType
			:location "106:3-106:45"
			:isContainer true
		)]
	) ) ( def SQLDML_StringValueExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDML_ValueExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "aValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_StringValueExp
			:type String
			:location "110:3-110:29"
		)]
	) ) ( def SQLDML_IntegerValueExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDML_ValueExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "aValue"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_IntegerValueExp
			:type Integer
			:location "114:3-114:30"
		)]
	) ) ( def SQLDML_ListExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDML_Predicate]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SQLDML_ListExp
			:type SQLDML_Expression
			:location "118:3-118:49"
			:isContainer true
		)]
	) ) ( def SQLDML_FunctionExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDML_Predicate]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SQLDML_FunctionExp
			:type String
			:location "122:3-122:27"
		) ( struct-map
			KM3_Reference
			:name "arguments"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SQLDML_FunctionExp
			:type SQLDML_Expression
			:location "121:3-121:52"
			:isContainer true
		)]
	) ) ( def SQLDML_DataType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SQLDML_NamedElement]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "130:2-130:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "131:2-131:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "132:2-132:18"
	) )]
) )
