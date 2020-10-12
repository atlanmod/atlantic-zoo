( declare Maude_MaudeSpec )
( declare Maude_MaudeTopEl )
( declare Maude_ModExpression )
( declare Maude_InstModExp )
( declare Maude_RenModExp )
( declare Maude_CompModExp )
( declare Maude_ModuleIdModExp )
( declare Maude_TheoryIdModExp )
( declare Maude_Parameter )
( declare Maude_Theory )
( declare Maude_FTheory )
( declare Maude_STheory )
( declare Maude_Module )
( declare Maude_FModule )
( declare Maude_SModule )
( declare Maude_ModElement )
( declare Maude_ModImportation )
( declare Maude_ImportationMode )
( declare Maude_Type )
( declare Maude_Sort )
( declare Maude_Kind )
( declare Maude_SubsortRel )
( declare Maude_Operation )
( declare Maude_Statement )
( declare Maude_Membership )
( declare Maude_Equation )
( declare Maude_Rule )
( declare Maude_Condition )
( declare Maude_EquationalCond )
( declare Maude_RewriteCond )
( declare Maude_MembershipCond )
( declare Maude_BooleanCond )
( declare Maude_MatchingCond )
( declare Maude_EqualCond )
( declare Maude_Term )
( declare Maude_Constant )
( declare Maude_RecTerm )
( declare Maude_Variable )
( declare Maude_View )
( declare Maude_ViewMapping )
( declare Maude_RenMapping )
( declare Maude_TermMapping )
( declare Maude_SortMapping )
( declare Maude_OpTypedMapping )
( declare Maude_OpMapping )
( declare Maude_LabelMapping )
( declare PrimitiveTypes_String )
( def Maude ( struct-map
	KM3_Package
	:contents[( def ImportationMode ( :literals[( struct-map
		KM3_EnumLiteral
		:name "protecting"
		:location "75:3-75:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "including"
		:location "76:3-76:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "extending"
		:location "77:3-77:21"
	)] ) ) ( def Maude_MaudeSpec ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "els"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Maude_MaudeSpec
			:type Maude_MaudeTopEl
			:location "4:3-4:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "printableEls"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Maude_MaudeSpec
			:type Maude_MaudeTopEl
			:location "6:3-6:52"
			:isContainer false
		)]
	) ) ( def Maude_MaudeTopEl ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_MaudeTopEl
			:type String
			:location "10:3-10:27"
		)]
	) ) ( def Maude_ModExpression ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Maude_InstModExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_ModExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "modExp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_InstModExp
			:type Maude_ModExpression
			:location "17:3-17:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "views"
			:upper -1
			:lower 1
			:isOrdered true
			:owner Maude_InstModExp
			:type Maude_View
			:location "18:3-18:40"
			:isContainer false
		)]
	) ) ( def Maude_RenModExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_ModExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "modExp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_RenModExp
			:type Maude_ModExpression
			:location "22:3-22:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "renamings"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Maude_RenModExp
			:type Maude_RenMapping
			:location "23:3-23:52"
			:isContainer true
		)]
	) ) ( def Maude_CompModExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_ModExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "modExps"
			:upper -1
			:lower 2
			:isOrdered false
			:owner Maude_CompModExp
			:type Maude_ModExpression
			:location "27:3-27:53"
			:isContainer true
		)]
	) ) ( def Maude_ModuleIdModExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_ModExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "module"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_ModuleIdModExp
			:type Maude_Module
			:location "31:3-31:29"
			:isContainer false
		)]
	) ) ( def Maude_TheoryIdModExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_ModExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "theory"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_TheoryIdModExp
			:type Maude_Theory
			:location "35:3-35:29"
			:isContainer false
		)]
	) ) ( def Maude_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_ModExpression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "label"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_Parameter
			:type String
			:location "39:3-39:28"
		) ( struct-map
			KM3_Reference
			:name "modExp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_Parameter
			:type Maude_ModExpression
			:location "40:3-40:46"
			:isContainer true
		)]
	) ) ( def Maude_Theory ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Maude_MaudeTopEl]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "els"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Maude_Theory
			:type Maude_ModElement
			:location "44:3-44:64"
			:isContainer true
			:opposite theory
		)]
	) ) ( def Maude_FTheory ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_Theory]
		:structuralFeatures[]
	) ) ( def Maude_STheory ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_Theory]
		:structuralFeatures[]
	) ) ( def Maude_Module ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Maude_MaudeTopEl]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "els"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Maude_Module
			:type Maude_ModElement
			:location "54:3-54:64"
			:isContainer true
			:opposite module
		) ( struct-map
			KM3_Reference
			:name "params"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Maude_Module
			:type Maude_Parameter
			:location "55:3-55:56"
			:isContainer true
		)]
	) ) ( def Maude_FModule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_Module]
		:structuralFeatures[]
	) ) ( def Maude_SModule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_Module]
		:structuralFeatures[]
	) ) ( def Maude_ModElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "module"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Maude_ModElement
			:type Maude_Module
			:location "65:3-65:50"
			:isContainer false
			:opposite els
		) ( struct-map
			KM3_Reference
			:name "theory"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Maude_ModElement
			:type Maude_Theory
			:location "66:3-66:50"
			:isContainer false
			:opposite els
		)]
	) ) ( def Maude_ModImportation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_ModElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "mode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_ModImportation
			:type ImportationMode
			:location "71:3-71:37"
		) ( struct-map
			KM3_Reference
			:name "imports"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_ModImportation
			:type Maude_ModExpression
			:location "70:3-70:47"
			:isContainer true
		)]
	) ) ( def Maude_Type ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_Type
			:type String
			:location "81:3-81:27"
		)]
	) ) ( def Maude_Sort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_Type Maude_ModElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "subsortRels"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Maude_Sort
			:type Maude_SubsortRel
			:location "85:3-85:67"
			:isContainer false
			:opposite supersorts
		) ( struct-map
			KM3_Reference
			:name "supersortRels"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Maude_Sort
			:type Maude_SubsortRel
			:location "86:3-86:67"
			:isContainer false
			:opposite subsorts
		) ( struct-map
			KM3_Reference
			:name "kind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_Sort
			:type Maude_Kind
			:location "87:3-87:43"
			:isContainer false
			:opposite sorts
		)]
	) ) ( def Maude_Kind ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_Type]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sorts"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Maude_Kind
			:type Maude_Sort
			:location "91:3-91:49"
			:isContainer false
			:opposite kind
		)]
	) ) ( def Maude_SubsortRel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_ModElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "subsorts"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Maude_SubsortRel
			:type Maude_Sort
			:location "95:3-95:60"
			:isContainer false
			:opposite supersortRels
		) ( struct-map
			KM3_Reference
			:name "supersorts"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Maude_SubsortRel
			:type Maude_Sort
			:location "96:3-96:60"
			:isContainer false
			:opposite subsortRels
		)]
	) ) ( def Maude_Operation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_ModElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_Operation
			:type String
			:location "100:3-100:27"
		) ( struct-map
			KM3_Attribute
			:name "atts"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Maude_Operation
			:type String
			:location "103:3-103:33"
		) ( struct-map
			KM3_Reference
			:name "coarity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_Operation
			:type Maude_Type
			:location "101:3-101:28"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "arity"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Maude_Operation
			:type Maude_Type
			:location "102:3-102:40"
			:isContainer false
		)]
	) ) ( def Maude_Statement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Maude_ModElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "label"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Maude_Statement
			:type String
			:location "107:3-107:34"
		) ( struct-map
			KM3_Attribute
			:name "atts"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Maude_Statement
			:type String
			:location "108:3-108:33"
		) ( struct-map
			KM3_Reference
			:name "conds"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Maude_Statement
			:type Maude_Condition
			:location "109:3-109:55"
			:isContainer true
		)]
	) ) ( def Maude_Membership ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "term"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_Membership
			:type Maude_Term
			:location "113:3-113:36"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "sort"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_Membership
			:type Maude_Sort
			:location "114:3-114:26"
			:isContainer false
		)]
	) ) ( def Maude_Equation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "lhs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_Equation
			:type Maude_Term
			:location "118:3-118:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rhs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_Equation
			:type Maude_Term
			:location "119:3-119:35"
			:isContainer true
		)]
	) ) ( def Maude_Rule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_Statement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "lhs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Maude_Rule
			:type Maude_Term
			:location "123:3-123:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rhs"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Maude_Rule
			:type Maude_Term
			:location "124:3-124:40"
			:isContainer true
		)]
	) ) ( def Maude_Condition ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "lhs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_Condition
			:type Maude_Term
			:location "128:3-128:35"
			:isContainer true
		)]
	) ) ( def Maude_EquationalCond ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Maude_Condition]
		:structuralFeatures[]
	) ) ( def Maude_RewriteCond ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_Condition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rhs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_RewriteCond
			:type Maude_Term
			:location "135:3-135:35"
			:isContainer true
		)]
	) ) ( def Maude_MembershipCond ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_EquationalCond]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rhs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_MembershipCond
			:type Maude_Sort
			:location "139:3-139:25"
			:isContainer false
		)]
	) ) ( def Maude_BooleanCond ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_EquationalCond]
		:structuralFeatures[]
	) ) ( def Maude_MatchingCond ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_EquationalCond]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rhs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_MatchingCond
			:type Maude_Term
			:location "146:3-146:35"
			:isContainer true
		)]
	) ) ( def Maude_EqualCond ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_EquationalCond]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rhs"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_EqualCond
			:type Maude_Term
			:location "150:3-150:35"
			:isContainer true
		)]
	) ) ( def Maude_Term ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_Term
			:type Maude_Type
			:location "154:3-154:26"
			:isContainer false
		)]
	) ) ( def Maude_Constant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_Term]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "op"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_Constant
			:type String
			:location "159:3-159:25"
		)]
	) ) ( def Maude_RecTerm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_Term]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "op"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_RecTerm
			:type String
			:location "163:3-163:25"
		) ( struct-map
			KM3_Reference
			:name "args"
			:upper -1
			:lower 1
			:isOrdered true
			:owner Maude_RecTerm
			:type Maude_Term
			:location "164:3-164:49"
			:isContainer true
		)]
	) ) ( def Maude_Variable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_Term]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_Variable
			:type String
			:location "172:3-172:27"
		)]
	) ) ( def Maude_View ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_MaudeTopEl]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "from"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_View
			:type Maude_ModExpression
			:location "176:3-176:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "to"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_View
			:type Maude_ModExpression
			:location "177:3-177:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "els"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Maude_View
			:type Maude_ViewMapping
			:location "178:3-178:47"
			:isContainer true
		)]
	) ) ( def Maude_ViewMapping ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Maude_RenMapping ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Maude_ViewMapping]
		:structuralFeatures[]
	) ) ( def Maude_TermMapping ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_ViewMapping]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "from"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_TermMapping
			:type Maude_Term
			:location "188:3-188:35"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "to"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_TermMapping
			:type Maude_Term
			:location "189:3-189:33"
			:isContainer true
		)]
	) ) ( def Maude_SortMapping ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_RenMapping]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "to"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_SortMapping
			:type String
			:location "194:3-194:25"
		) ( struct-map
			KM3_Reference
			:name "from"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_SortMapping
			:type Maude_Sort
			:location "193:3-193:25"
			:isContainer false
		)]
	) ) ( def Maude_OpTypedMapping ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_RenMapping]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "to"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_OpTypedMapping
			:type String
			:location "198:3-198:25"
		) ( struct-map
			KM3_Attribute
			:name "atts"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Maude_OpTypedMapping
			:type String
			:location "199:3-199:31"
		) ( struct-map
			KM3_Reference
			:name "from"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_OpTypedMapping
			:type Maude_Operation
			:location "197:3-197:30"
			:isContainer false
		)]
	) ) ( def Maude_OpMapping ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_RenMapping]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "to"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_OpMapping
			:type String
			:location "203:3-203:25"
		) ( struct-map
			KM3_Reference
			:name "from"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_OpMapping
			:type Maude_Operation
			:location "202:3-202:30"
			:isContainer false
		)]
	) ) ( def Maude_LabelMapping ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Maude_RenMapping]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "from"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_LabelMapping
			:type String
			:location "206:3-206:27"
		) ( struct-map
			KM3_Attribute
			:name "to"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Maude_LabelMapping
			:type String
			:location "207:3-207:25"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "213:2-213:18"
	) )]
) )
