( declare ViewAbstractSyntaxOfXMorphLanguage_VarScope )
( declare ViewAbstractSyntaxOfXMorphLanguage_AbstractVar )
( declare ViewAbstractSyntaxOfXMorphLanguage_VarUse )
( declare ViewAbstractSyntaxOfXMorphLanguage_MOF::Property )
( declare ViewAbstractSyntaxOfXMorphLanguage_Key )
( declare ViewAbstractSyntaxOfXMorphLanguage_PatternScope )
( declare ViewAbstractSyntaxOfXMorphLanguage_PatternDefn )
( declare ViewAbstractSyntaxOfXMorphLanguage_TRule )
( declare ViewAbstractSyntaxOfXMorphLanguage_Transformation )
( declare ViewAbstractSyntaxOfXMorphLanguage_Query )
( declare ViewAbstractSyntaxOfXMorphLanguage_Term )
( declare ViewAbstractSyntaxOfXMorphLanguage_TRuleVar )
( declare ViewAbstractSyntaxOfXMorphLanguage_PatternVar )
( declare ViewAbstractSyntaxOfXMorphLanguage_ExtentVar )
( declare ViewAbstractSyntaxOfXMorphLanguage_CompoundTerm )
( declare ViewAbstractSyntaxOfXMorphLanguage_AndTerm )
( declare ViewAbstractSyntaxOfXMorphLanguage_OrTerm )
( declare ViewAbstractSyntaxOfXMorphLanguage_NotTerm )
( declare ViewAbstractSyntaxOfXMorphLanguage_IfTerm )
( declare ViewAbstractSyntaxOfXMorphLanguage_SimpleTerm )
( declare ViewAbstractSyntaxOfXMorphLanguage_TrackingUse )
( declare ViewAbstractSyntaxOfXMorphLanguage_MOF::Class )
( declare ViewAbstractSyntaxOfXMorphLanguage_PatternUse )
( declare ViewAbstractSyntaxOfXMorphLanguage_MofTerm )
( declare ViewAbstractSyntaxOfXMorphLanguage_Condition )
( declare ViewAbstractSyntaxOfXMorphLanguage_MofInstance )
( declare ViewAbstractSyntaxOfXMorphLanguage_MofOrder )
( declare ViewAbstractSyntaxOfXMorphLanguage_Expression )
( declare ViewAbstractSyntaxOfXMorphLanguage_CoumpoundExpr )
( declare ViewAbstractSyntaxOfXMorphLanguage_CollectionExpr )
( declare ViewAbstractSyntaxOfXMorphLanguage_FunctionExpr )
( declare ViewAbstractSyntaxOfXMorphLanguage_FeatureExpr )
( declare ViewAbstractSyntaxOfXMorphLanguage_InstanceRef )
( declare ViewAbstractSyntaxOfXMorphLanguage_MOF::Object )
( declare ViewAbstractSyntaxOfXMorphLanguage_SimpleExpr )
( declare ViewAbstractSyntaxOfXMorphLanguage_StringConstant )
( declare ViewAbstractSyntaxOfXMorphLanguage_IntConstant )
( declare ViewAbstractSyntaxOfXMorphLanguage_BooleanConstant )
( declare ViewAbstractSyntaxOfXMorphLanguage_EnumConstant )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( def ViewAbstractSyntaxOfXMorphLanguage ( struct-map
	KM3_Package
	:contents[( def ViewAbstractSyntaxOfXMorphLanguage_VarScope ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "var"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_VarScope
			:type ViewAbstractSyntaxOfXMorphLanguage_AbstractVar
			:location "14:3-14:61"
			:isContainer true
			:opposite scope
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_AbstractVar ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "scope"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_AbstractVar
			:type ViewAbstractSyntaxOfXMorphLanguage_VarScope
			:location "18:3-18:45"
			:isContainer false
			:opposite var
		) ( struct-map
			KM3_Reference
			:name "varUse"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_AbstractVar
			:type ViewAbstractSyntaxOfXMorphLanguage_VarUse
			:location "19:3-19:44"
			:isContainer false
			:opposite var
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_VarUse ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "var"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_VarUse
			:type ViewAbstractSyntaxOfXMorphLanguage_AbstractVar
			:location "23:3-23:49"
			:isContainer false
			:opposite varUse
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_MOF::Property ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "part"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_MOF::Property
			:type ViewAbstractSyntaxOfXMorphLanguage_Key
			:location "27:2-27:43"
			:isContainer false
			:opposite property
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_Key ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "property"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_Key
			:type ViewAbstractSyntaxOfXMorphLanguage_MOF::Property
			:location "31:3-31:59"
			:isContainer false
			:opposite part
		) ( struct-map
			KM3_Reference
			:name "transformation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_Key
			:type ViewAbstractSyntaxOfXMorphLanguage_Transformation
			:location "32:3-32:61"
			:isContainer false
			:opposite keys
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_PatternScope ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_VarScope]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "patternDefn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_PatternScope
			:type ViewAbstractSyntaxOfXMorphLanguage_PatternDefn
			:location "36:3-36:69"
			:isContainer true
			:opposite scope
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_PatternDefn ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_VarScope]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "scope"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_PatternDefn
			:type ViewAbstractSyntaxOfXMorphLanguage_PatternScope
			:location "40:3-40:57"
			:isContainer false
			:opposite patternDefn
		) ( struct-map
			KM3_Reference
			:name "parameter"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_PatternDefn
			:type ViewAbstractSyntaxOfXMorphLanguage_PatternVar
			:location "41:3-41:62"
			:isContainer false
			:opposite patternDefn
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_PatternDefn
			:type ViewAbstractSyntaxOfXMorphLanguage_Term
			:location "42:3-42:58"
			:isContainer true
			:opposite patternDefn
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_TRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_VarScope]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "superseded"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_TRule
			:type ViewAbstractSyntaxOfXMorphLanguage_TRule
			:location "46:3-46:57"
			:isContainer false
			:opposite superseder
		) ( struct-map
			KM3_Reference
			:name "superseder"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_TRule
			:type ViewAbstractSyntaxOfXMorphLanguage_TRule
			:location "47:3-47:57"
			:isContainer false
			:opposite superseded
		) ( struct-map
			KM3_Reference
			:name "transformation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_TRule
			:type ViewAbstractSyntaxOfXMorphLanguage_Transformation
			:location "48:3-48:62"
			:isContainer false
			:opposite tRule
		) ( struct-map
			KM3_Reference
			:name "extended"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_TRule
			:type ViewAbstractSyntaxOfXMorphLanguage_TRule
			:location "49:3-49:53"
			:isContainer false
			:opposite extender
		) ( struct-map
			KM3_Reference
			:name "extender"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_TRule
			:type ViewAbstractSyntaxOfXMorphLanguage_TRule
			:location "50:3-50:53"
			:isContainer false
			:opposite extended
		) ( struct-map
			KM3_Reference
			:name "term"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_TRule
			:type ViewAbstractSyntaxOfXMorphLanguage_Term
			:location "51:3-51:57"
			:isContainer true
			:opposite tRule
		) ( struct-map
			KM3_Reference
			:name "tgt"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_TRule
			:type ViewAbstractSyntaxOfXMorphLanguage_SimpleTerm
			:location "52:3-52:62"
			:isContainer true
			:opposite tRuleST
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_Transformation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_PatternScope]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "keys"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_Transformation
			:type ViewAbstractSyntaxOfXMorphLanguage_Key
			:location "56:3-56:63"
			:isContainer true
			:opposite transformation
		) ( struct-map
			KM3_Reference
			:name "tRule"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_Transformation
			:type ViewAbstractSyntaxOfXMorphLanguage_TRule
			:location "57:3-57:66"
			:isContainer true
			:opposite transformation
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_Query ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_PatternScope]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "term"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_Query
			:type ViewAbstractSyntaxOfXMorphLanguage_Term
			:location "61:3-61:52"
			:isContainer true
			:opposite query
		) ( struct-map
			KM3_Reference
			:name "parameter"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_Query
			:type ViewAbstractSyntaxOfXMorphLanguage_PatternVar
			:location "62:3-62:56"
			:isContainer false
			:opposite query
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_Term ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "patternDefn"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_Term
			:type ViewAbstractSyntaxOfXMorphLanguage_PatternDefn
			:location "66:3-66:60"
			:isContainer false
			:opposite body
		) ( struct-map
			KM3_Reference
			:name "query"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_Term
			:type ViewAbstractSyntaxOfXMorphLanguage_Query
			:location "67:3-67:48"
			:isContainer false
			:opposite term
		) ( struct-map
			KM3_Reference
			:name "tRule"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_Term
			:type ViewAbstractSyntaxOfXMorphLanguage_TRule
			:location "68:3-68:48"
			:isContainer false
			:opposite term
		) ( struct-map
			KM3_Reference
			:name "context"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_Term
			:type ViewAbstractSyntaxOfXMorphLanguage_ExtentVar
			:location "69:3-69:53"
			:isContainer false
			:opposite src
		) ( struct-map
			KM3_Reference
			:name "compoundTerm"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_Term
			:type ViewAbstractSyntaxOfXMorphLanguage_CompoundTerm
			:location "70:3-70:62"
			:isContainer false
			:opposite term
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_TRuleVar ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_AbstractVar]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "superseder"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_TRuleVar
			:type ViewAbstractSyntaxOfXMorphLanguage_TRuleVar
			:location "74:3-74:60"
			:isContainer false
			:opposite superseded
		) ( struct-map
			KM3_Reference
			:name "superseded"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_TRuleVar
			:type ViewAbstractSyntaxOfXMorphLanguage_TRuleVar
			:location "75:3-75:60"
			:isContainer false
			:opposite superseder
		) ( struct-map
			KM3_Reference
			:name "extended"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_TRuleVar
			:type ViewAbstractSyntaxOfXMorphLanguage_TRuleVar
			:location "76:3-76:56"
			:isContainer false
			:opposite extender
		) ( struct-map
			KM3_Reference
			:name "extender"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_TRuleVar
			:type ViewAbstractSyntaxOfXMorphLanguage_TRuleVar
			:location "77:3-77:56"
			:isContainer false
			:opposite extended
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_PatternVar ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_AbstractVar]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "query"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_PatternVar
			:type ViewAbstractSyntaxOfXMorphLanguage_Query
			:location "81:3-81:48"
			:isContainer false
			:opposite parameter
		) ( struct-map
			KM3_Reference
			:name "patternDefn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_PatternVar
			:type ViewAbstractSyntaxOfXMorphLanguage_PatternDefn
			:location "82:3-82:60"
			:isContainer false
			:opposite parameter
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_ExtentVar ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_AbstractVar]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "src"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_ExtentVar
			:type ViewAbstractSyntaxOfXMorphLanguage_Term
			:location "86:3-86:43"
			:isContainer false
			:opposite context
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_CompoundTerm ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_Term]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "term"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_CompoundTerm
			:type ViewAbstractSyntaxOfXMorphLanguage_Term
			:location "90:3-90:64"
			:isContainer true
			:opposite compoundTerm
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_AndTerm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_CompoundTerm]
		:structuralFeatures[]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_OrTerm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_CompoundTerm]
		:structuralFeatures[]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_NotTerm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_CompoundTerm]
		:structuralFeatures[]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_IfTerm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_CompoundTerm]
		:structuralFeatures[]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_SimpleTerm ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_Term]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tRuleST"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_SimpleTerm
			:type ViewAbstractSyntaxOfXMorphLanguage_TRule
			:location "102:3-102:49"
			:isContainer false
			:opposite tgt
		) ( struct-map
			KM3_Reference
			:name "arg"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_SimpleTerm
			:type ViewAbstractSyntaxOfXMorphLanguage_Expression
			:location "103:3-103:59"
			:isContainer true
			:opposite term
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_TrackingUse ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_SimpleTerm]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "featureNames"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_TrackingUse
			:type String
			:location "107:3-107:35"
		) ( struct-map
			KM3_Reference
			:name "tracking"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_TrackingUse
			:type ViewAbstractSyntaxOfXMorphLanguage_MOF::Class
			:location "108:3-108:57"
			:isContainer false
			:opposite tracking
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_MOF::Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tracking"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_MOF::Class
			:type ViewAbstractSyntaxOfXMorphLanguage_TrackingUse
			:location "112:3-112:59"
			:isContainer false
			:opposite tracking
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_PatternUse ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_SimpleTerm]
		:structuralFeatures[]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_MofTerm ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_SimpleTerm]
		:structuralFeatures[]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_Condition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_SimpleTerm]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "reason"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_Condition
			:type String
			:location "120:3-120:29"
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_MofInstance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_MofTerm]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isExactly"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_MofInstance
			:type Boolean
			:location "124:3-124:33"
		) ( struct-map
			KM3_Reference
			:name "typeName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_MofInstance
			:type ViewAbstractSyntaxOfXMorphLanguage_Expression
			:location "125:3-125:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "instance"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_MofInstance
			:type ViewAbstractSyntaxOfXMorphLanguage_Expression
			:location "126:3-126:35"
			:isContainer false
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_MofOrder ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_MofTerm]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "lesser"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_MofOrder
			:type ViewAbstractSyntaxOfXMorphLanguage_Expression
			:location "130:3-130:51"
			:isContainer false
			:opposite lesser
		) ( struct-map
			KM3_Reference
			:name "instance"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_MofOrder
			:type ViewAbstractSyntaxOfXMorphLanguage_Expression
			:location "131:3-131:55"
			:isContainer false
			:opposite instance
		) ( struct-map
			KM3_Reference
			:name "greater"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_MofOrder
			:type ViewAbstractSyntaxOfXMorphLanguage_Expression
			:location "132:3-132:53"
			:isContainer false
			:opposite greater
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_Expression ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "lesser"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_Expression
			:type ViewAbstractSyntaxOfXMorphLanguage_MofOrder
			:location "136:3-136:49"
			:isContainer false
			:opposite lesser
		) ( struct-map
			KM3_Reference
			:name "instance"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_Expression
			:type ViewAbstractSyntaxOfXMorphLanguage_MofOrder
			:location "137:3-137:53"
			:isContainer false
			:opposite instance
		) ( struct-map
			KM3_Reference
			:name "greater"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_Expression
			:type ViewAbstractSyntaxOfXMorphLanguage_MofOrder
			:location "138:3-138:51"
			:isContainer false
			:opposite greater
		) ( struct-map
			KM3_Reference
			:name "term"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_Expression
			:type ViewAbstractSyntaxOfXMorphLanguage_SimpleTerm
			:location "139:3-139:46"
			:isContainer false
			:opposite arg
		) ( struct-map
			KM3_Reference
			:name "expr"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_Expression
			:type ViewAbstractSyntaxOfXMorphLanguage_CoumpoundExpr
			:location "140:3-140:54"
			:isContainer false
			:opposite arg
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_CoumpoundExpr ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "arg"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_CoumpoundExpr
			:type ViewAbstractSyntaxOfXMorphLanguage_Expression
			:location "144:3-144:59"
			:isContainer true
			:opposite expr
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_CollectionExpr ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_CoumpoundExpr]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "unique"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_CollectionExpr
			:type Boolean
			:location "148:3-148:32"
		) ( struct-map
			KM3_Attribute
			:name "ordered"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_CollectionExpr
			:type Boolean
			:location "149:3-149:33"
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_FunctionExpr ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_CoumpoundExpr]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "function"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_FunctionExpr
			:type String
			:location "153:3-153:31"
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_FeatureExpr ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_CoumpoundExpr]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "collect"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_FeatureExpr
			:type String
			:location "157:3-157:30"
		) ( struct-map
			KM3_Attribute
			:name "featureName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_FeatureExpr
			:type String
			:location "158:3-158:34"
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_InstanceRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "obj"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_InstanceRef
			:type ViewAbstractSyntaxOfXMorphLanguage_MOF::Object
			:location "162:3-162:48"
			:isContainer false
			:opposite obj
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_MOF::Object ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_Expression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "obj"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_MOF::Object
			:type ViewAbstractSyntaxOfXMorphLanguage_InstanceRef
			:location "166:2-166:45"
			:isContainer false
			:opposite obj
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_SimpleExpr ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_Expression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "representation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ViewAbstractSyntaxOfXMorphLanguage_SimpleExpr
			:type String
			:location "170:3-170:37"
		)]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_StringConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_SimpleExpr]
		:structuralFeatures[]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_IntConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_SimpleExpr]
		:structuralFeatures[]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_BooleanConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_SimpleExpr]
		:structuralFeatures[]
	) ) ( def ViewAbstractSyntaxOfXMorphLanguage_EnumConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ViewAbstractSyntaxOfXMorphLanguage_SimpleExpr]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "183:2-183:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "184:2-184:19"
	) )]
) )
