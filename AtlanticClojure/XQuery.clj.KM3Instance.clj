( declare XQuery_XQueryProgram )
( declare XQuery_Expression )
( declare XQuery_ExecutableExpression )
( declare XQuery_Node )
( declare XQuery_FLWOR )
( declare XQuery_FunctionCall )
( declare XQuery_FunctionDeclaration )
( declare XQuery_ElementNode )
( declare XQuery_AttributeNode )
( declare XQuery_TextNode )
( declare XQuery_ReturnXPath )
( declare XQuery_XPath )
( declare XQuery_BooleanExp )
( declare XQuery_For )
( declare XQuery_Let )
( declare XQuery_Where )
( declare XQuery_OrderBy )
( declare XQuery_Return )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def XQuery ( struct-map
	KM3_Package
	:contents[( def XQuery_XQueryProgram ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expressions"
			:upper -1
			:lower 0
			:isOrdered true
			:owner XQuery_XQueryProgram
			:type XQuery_ExecutableExpression
			:location "12:3-12:94"
			:isContainer true
			:opposite xQueryProgram
		)]
	) ) ( def XQuery_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "parentNode"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XQuery_Expression
			:type XQuery_ElementNode
			:location "16:3-16:60"
			:isContainer false
			:opposite nodes
		) ( struct-map
			KM3_Reference
			:name "returnEx"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_Expression
			:type XQuery_Return
			:location "17:3-17:54"
			:isContainer false
			:opposite expressions
		)]
	) ) ( def XQuery_ExecutableExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XQuery_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "xQueryProgram"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_ExecutableExpression
			:type XQuery_XQueryProgram
			:location "22:3-22:66"
			:isContainer false
			:opposite expressions
		) ( struct-map
			KM3_Reference
			:name "functionDeclaration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_ExecutableExpression
			:type XQuery_FunctionDeclaration
			:location "23:3-23:77"
			:isContainer false
			:opposite expression
		)]
	) ) ( def XQuery_Node ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XQuery_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_Node
			:type String
			:location "28:3-28:27"
		)]
	) ) ( def XQuery_FLWOR ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XQuery_ExecutableExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "for"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_FLWOR
			:type XQuery_For
			:location "32:3-32:50"
			:isContainer true
			:opposite flwor
		) ( struct-map
			KM3_Reference
			:name "let"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_FLWOR
			:type XQuery_Let
			:location "33:3-33:50"
			:isContainer true
			:opposite flwor
		) ( struct-map
			KM3_Reference
			:name "where"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_FLWOR
			:type XQuery_Where
			:location "34:3-34:54"
			:isContainer true
			:opposite flwor
		) ( struct-map
			KM3_Reference
			:name "orderBy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_FLWOR
			:type XQuery_OrderBy
			:location "35:3-35:58"
			:isContainer true
			:opposite flwor
		) ( struct-map
			KM3_Reference
			:name "return"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_FLWOR
			:type XQuery_Return
			:location "36:3-36:56"
			:isContainer true
			:opposite flwor
		)]
	) ) ( def XQuery_FunctionCall ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XQuery_ExecutableExpression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_FunctionCall
			:type String
			:location "40:3-40:27"
		) ( struct-map
			KM3_Reference
			:name "parameters"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XQuery_FunctionCall
			:type XQuery_XPath
			:location "41:3-41:69"
			:isContainer true
			:opposite functionCall
		)]
	) ) ( def XQuery_FunctionDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XQuery_ExecutableExpression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_FunctionDeclaration
			:type String
			:location "45:3-45:27"
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper -1
			:lower 1
			:isOrdered false
			:owner XQuery_FunctionDeclaration
			:type XQuery_ExecutableExpression
			:location "46:3-46:93"
			:isContainer true
			:opposite functionDeclaration
		)]
	) ) ( def XQuery_ElementNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XQuery_Node]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "nodes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XQuery_ElementNode
			:type XQuery_Expression
			:location "50:3-50:67"
			:isContainer true
			:opposite parentNode
		)]
	) ) ( def XQuery_AttributeNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XQuery_Node]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_AttributeNode
			:type String
			:location "54:3-54:28"
		)]
	) ) ( def XQuery_TextNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XQuery_ElementNode]
		:structuralFeatures[]
	) ) ( def XQuery_ReturnXPath ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XQuery_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_ReturnXPath
			:type String
			:location "61:3-61:28"
		)]
	) ) ( def XQuery_XPath ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XQuery_ReturnXPath]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "functionCall"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_XPath
			:type XQuery_FunctionCall
			:location "65:4-65:64"
			:isContainer false
			:opposite parameters
		) ( struct-map
			KM3_Reference
			:name "for"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_XPath
			:type XQuery_For
			:location "66:4-66:46"
			:isContainer false
			:opposite expression
		) ( struct-map
			KM3_Reference
			:name "let"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_XPath
			:type XQuery_Let
			:location "67:4-67:46"
			:isContainer false
			:opposite expression
		)]
	) ) ( def XQuery_BooleanExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XQuery_XPath]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "where"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_BooleanExp
			:type XQuery_Where
			:location "71:4-71:50"
			:isContainer false
			:opposite expression
		)]
	) ) ( def XQuery_For ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "var"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_For
			:type String
			:location "75:3-75:26"
		) ( struct-map
			KM3_Reference
			:name "flwor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_For
			:type XQuery_FLWOR
			:location "76:3-76:42"
			:isContainer false
			:opposite for
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_For
			:type XQuery_XPath
			:location "77:3-77:57"
			:isContainer true
			:opposite for
		)]
	) ) ( def XQuery_Let ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "var"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_Let
			:type String
			:location "81:3-81:26"
		) ( struct-map
			KM3_Reference
			:name "flwor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_Let
			:type XQuery_FLWOR
			:location "82:3-82:42"
			:isContainer false
			:opposite let
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_Let
			:type XQuery_XPath
			:location "83:3-83:57"
			:isContainer true
			:opposite let
		)]
	) ) ( def XQuery_Where ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "flwor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_Where
			:type XQuery_FLWOR
			:location "87:3-87:44"
			:isContainer false
			:opposite where
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_Where
			:type XQuery_BooleanExp
			:location "88:3-88:64"
			:isContainer true
			:opposite where
		)]
	) ) ( def XQuery_OrderBy ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "flwor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_OrderBy
			:type XQuery_FLWOR
			:location "92:3-92:56"
			:isContainer true
			:opposite orderBy
		)]
	) ) ( def XQuery_Return ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "flwor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XQuery_Return
			:type XQuery_FLWOR
			:location "96:3-96:45"
			:isContainer false
			:opposite return
		) ( struct-map
			KM3_Reference
			:name "expressions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XQuery_Return
			:type XQuery_Expression
			:location "97:3-97:71"
			:isContainer true
			:opposite returnEx
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "102:2-102:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "103:2-103:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "104:2-104:18"
	) )]
) )
