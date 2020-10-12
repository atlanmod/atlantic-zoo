( declare qvttemplate_TemplateExp )
( declare qvttemplate_ObjectTemplateExp )
( declare qvttemplate_CollectionTemplateExp )
( declare qvttemplate_PropertyTemplateItem )
( declare imperativeocl_ImperativeIterateExp )
( declare imperativeocl_AssignExp )
( declare imperativeocl_BlockExp )
( declare imperativeocl_SwitchExp )
( declare imperativeocl_VariableInitExp )
( declare imperativeocl_WhileExp )
( declare imperativeocl_ComputeExp )
( declare imperativeocl_AltExp )
( declare imperativeocl_UnlinkExp )
( declare imperativeocl_ReturnExp )
( declare imperativeocl_BreakExp )
( declare imperativeocl_TryExp )
( declare imperativeocl_RaiseExp )
( declare imperativeocl_ContinueExp )
( declare imperativeocl_ForExp )
( declare imperativeocl_TupleExp )
( declare imperativeocl_Typedef )
( declare imperativeocl_InstantiationExp )
( declare imperativeocl_DictionaryType )
( declare imperativeocl_DictLiteralExp )
( declare imperativeocl_DictLiteralPart )
( declare imperativeocl_TemplateParameterType )
( declare imperativeocl_LogExp )
( declare imperativeocl_AssertExp )
( declare imperativeocl_SeverityKind )
( declare imperativeocl_ImperativeLoopExp )
( declare imperativeocl_CollectorExp )
( declare imperativeocl_ImperativeExpression )
( declare imperativeocl_UnpackExp )
( declare imperativeocl_AnonymousTupleType )
( declare imperativeocl_AnonymousTupleLiteralExp )
( declare imperativeocl_AnonymousTupleLiteralPart )
( declare imperativeocl_ListType )
( declare emof_Class )
( declare emof_DataType )
( declare emof_Element )
( declare emof_Tag )
( declare emof_Enumeration )
( declare emof_NamedElement )
( declare emof_Extent )
( declare emof_Object )
( declare emof_Operation )
( declare emof_MultiplicityElement )
( declare emof_Package )
( declare emof_Type )
( declare emof_Parameter )
( declare emof_EnumerationLiteral )
( declare emof_Property )
( declare emof_TypedElement )
( declare emof_PrimitiveType )
( declare emof_URIExtent )
( declare emof_Boolean )
( declare emof_String )
( declare emof_UnlimitedNatural )
( declare emof_Integer )
( declare emof_Real )
( declare emof_Comment )
( declare qvtoperational_MappingBody )
( declare qvtoperational_Helper )
( declare qvtoperational_ResolveExp )
( declare qvtoperational_ResolveInExp )
( declare qvtoperational_OperationalTransformation )
( declare qvtoperational_MappingParameter )
( declare qvtoperational_MappingOperation )
( declare qvtoperational_MappingCallExp )
( declare qvtoperational_Constructor )
( declare qvtoperational_ContextualProperty )
( declare qvtoperational_EntryOperation )
( declare qvtoperational_ImperativeCallExp )
( declare qvtoperational_ImperativeOperation )
( declare qvtoperational_DirectionKind )
( declare qvtoperational_Library )
( declare qvtoperational_ModelParameter )
( declare qvtoperational_ModelType )
( declare qvtoperational_Module )
( declare qvtoperational_ModuleImport )
( declare qvtoperational_ImportKind )
( declare qvtoperational_VarParameter )
( declare qvtoperational_OperationBody )
( declare qvtoperational_ConstructorBody )
( declare qvtoperational_ObjectExp )
( declare qvtcore_Area )
( declare qvtcore_Assignment )
( declare qvtcore_BottomPattern )
( declare qvtcore_GuardPattern )
( declare qvtcore_Mapping )
( declare qvtcore_RealizedVariable )
( declare qvtcore_CoreDomain )
( declare qvtcore_CorePattern )
( declare qvtcore_EnforcementOperation )
( declare qvtcore_EnforcementMode )
( declare qvtbase_Domain )
( declare qvtbase_Transformation )
( declare qvtbase_TypedModel )
( declare qvtbase_Rule )
( declare qvtbase_Pattern )
( declare qvtbase_Predicate )
( declare qvtbase_Function )
( declare qvtbase_FunctionParameter )
( declare qvtrelation_RelationalTransformation )
( declare qvtrelation_Relation )
( declare qvtrelation_RelationDomain )
( declare qvtrelation_DomainPattern )
( declare qvtrelation_RelationImplementation )
( declare qvtrelation_Key )
( declare essentialocl_BooleanLiteralExp )
( declare essentialocl_CallExp )
( declare essentialocl_CollectionKind )
( declare essentialocl_OclExpression )
( declare essentialocl_UnlimitedNaturalExp )
( declare essentialocl_IfExp )
( declare essentialocl_LetExp )
( declare essentialocl_Variable )
( declare essentialocl_PropertyCallExp )
( declare essentialocl_VariableExp )
( declare essentialocl_TypeExp )
( declare essentialocl_LoopExp )
( declare essentialocl_IteratorExp )
( declare essentialocl_StringLiteralExp )
( declare essentialocl_IntegerLiteralExp )
( declare essentialocl_OperationCallExp )
( declare essentialocl_RealLiteralExp )
( declare essentialocl_LiteralExp )
( declare essentialocl_IterateExp )
( declare essentialocl_PrimitiveLiteralExp )
( declare essentialocl_NumericLiteralExp )
( declare essentialocl_CollectionLiteralExp )
( declare essentialocl_CollectionLiteralPart )
( declare essentialocl_CollectionItem )
( declare essentialocl_CollectionRange )
( declare essentialocl_TupleLiteralExp )
( declare essentialocl_NullLiteralExp )
( declare essentialocl_ExpressionInOcl )
( declare essentialocl_OpaqueExpression )
( declare essentialocl_InvalidLiteralExp )
( declare essentialocl_FeaturePropertyCall )
( declare essentialocl_TupleLiteralPart )
( declare essentialocl_BagType )
( declare essentialocl_CollectionType )
( declare essentialocl_EnumLiteralExp )
( declare essentialocl_InvalidType )
( declare essentialocl_OrderedSetType )
( declare essentialocl_SequenceType )
( declare essentialocl_SetType )
( declare essentialocl_TupleType )
( declare essentialocl_VoidType )
( declare essentialocl_AnyType )
( def qvttemplate ( struct-map
	KM3_Package
	:contents[( def qvttemplate_TemplateExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[essentialocl_LiteralExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "bindsTo"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvttemplate_TemplateExp
			:type essentialocl_Variable
			:location "13:3-13:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "where"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvttemplate_TemplateExp
			:type essentialocl_OclExpression
			:location "14:3-14:50"
			:isContainer true
		)]
	) ) ( def qvttemplate_ObjectTemplateExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvttemplate_TemplateExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "part"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvttemplate_ObjectTemplateExp
			:type qvttemplate_PropertyTemplateItem
			:location "18:3-18:86"
			:isContainer true
			:opposite objContainer
		) ( struct-map
			KM3_Reference
			:name "referredClass"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvttemplate_ObjectTemplateExp
			:type emof_Class
			:location "19:3-19:35"
			:isContainer false
		)]
	) ) ( def qvttemplate_CollectionTemplateExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvttemplate_TemplateExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "kind"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvttemplate_CollectionTemplateExp
			:type CollectionKind
			:location "24:3-24:40"
		) ( struct-map
			KM3_Reference
			:name "part"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvttemplate_CollectionTemplateExp
			:type essentialocl_OclExpression
			:location "23:3-23:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "referredCollectionType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvttemplate_CollectionTemplateExp
			:type essentialocl_CollectionType
			:location "25:3-25:58"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "match"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvttemplate_CollectionTemplateExp
			:type essentialocl_OclExpression
			:location "26:3-26:40"
			:isContainer false
		)]
	) ) ( def qvttemplate_PropertyTemplateItem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "objContainer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvttemplate_PropertyTemplateItem
			:type qvttemplate_ObjectTemplateExp
			:location "30:3-30:62"
			:isContainer false
			:opposite part
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvttemplate_PropertyTemplateItem
			:type essentialocl_OclExpression
			:location "31:3-31:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "referredProperty"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvttemplate_PropertyTemplateItem
			:type emof_Property
			:location "32:3-32:41"
			:isContainer false
		)]
	) )]
) )
( def imperativeocl ( struct-map
	KM3_Package
	:contents[( def SeverityKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "error"
		:location "157:3-157:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "fatal"
		:location "158:3-158:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "warning"
		:location "159:3-159:19"
	)] ) ) ( def imperativeocl_ImperativeIterateExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[imperativeocl_ImperativeLoopExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner imperativeocl_ImperativeIterateExp
			:type essentialocl_Variable
			:location "41:6-41:44"
			:isContainer true
		)]
	) ) ( def imperativeocl_AssignExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[imperativeocl_ImperativeExpression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isReset"
			:upper 1
			:lower 0
			:isOrdered false
			:owner imperativeocl_AssignExp
			:type Boolean
			:location "48:3-48:36"
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper -1
			:lower 0
			:isOrdered true
			:owner imperativeocl_AssignExp
			:type essentialocl_OclExpression
			:location "45:3-45:56"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "left"
			:upper 1
			:lower 1
			:isOrdered false
			:owner imperativeocl_AssignExp
			:type essentialocl_OclExpression
			:location "46:3-46:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "defaultValue"
			:upper 1
			:lower 0
			:isOrdered false
			:owner imperativeocl_AssignExp
			:type essentialocl_OclExpression
			:location "47:3-47:57"
			:isContainer true
		)]
	) ) ( def imperativeocl_BlockExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[imperativeocl_ImperativeExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "body"
			:upper -1
			:lower 0
			:isOrdered true
			:owner imperativeocl_BlockExp
			:type essentialocl_OclExpression
			:location "52:3-52:55"
			:isContainer true
		)]
	) ) ( def imperativeocl_SwitchExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_CallExp imperativeocl_ImperativeExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "alternativePart"
			:upper -1
			:lower 0
			:isOrdered true
			:owner imperativeocl_SwitchExp
			:type imperativeocl_AltExp
			:location "56:3-56:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elsePart"
			:upper 1
			:lower 0
			:isOrdered false
			:owner imperativeocl_SwitchExp
			:type essentialocl_OclExpression
			:location "57:3-57:53"
			:isContainer true
		)]
	) ) ( def imperativeocl_VariableInitExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[imperativeocl_ImperativeExpression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "withResult"
			:upper 1
			:lower 0
			:isOrdered false
			:owner imperativeocl_VariableInitExp
			:type Boolean
			:location "62:3-62:39"
		) ( struct-map
			KM3_Reference
			:name "referredVariable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner imperativeocl_VariableInitExp
			:type essentialocl_Variable
			:location "61:3-61:51"
			:isContainer true
		)]
	) ) ( def imperativeocl_WhileExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[imperativeocl_ImperativeExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner imperativeocl_WhileExp
			:type essentialocl_OclExpression
			:location "66:3-66:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner imperativeocl_WhileExp
			:type essentialocl_OclExpression
			:location "67:3-67:44"
			:isContainer true
		)]
	) ) ( def imperativeocl_ComputeExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[imperativeocl_ImperativeExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "returnedElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner imperativeocl_ComputeExp
			:type essentialocl_Variable
			:location "71:3-71:74"
			:isContainer true
			:opposite computeOwner
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner imperativeocl_ComputeExp
			:type essentialocl_OclExpression
			:location "72:3-72:44"
			:isContainer true
		)]
	) ) ( def imperativeocl_AltExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[imperativeocl_ImperativeExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner imperativeocl_AltExp
			:type essentialocl_OclExpression
			:location "76:3-76:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner imperativeocl_AltExp
			:type essentialocl_OclExpression
			:location "77:3-77:44"
			:isContainer true
		)]
	) ) ( def imperativeocl_UnlinkExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[imperativeocl_ImperativeExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner imperativeocl_UnlinkExp
			:type essentialocl_OclExpression
			:location "81:3-81:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "item"
			:upper 1
			:lower 1
			:isOrdered false
			:owner imperativeocl_UnlinkExp
			:type essentialocl_OclExpression
			:location "82:3-82:44"
			:isContainer true
		)]
	) ) ( def imperativeocl_ReturnExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[imperativeocl_ImperativeExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner imperativeocl_ReturnExp
			:type essentialocl_OclExpression
			:location "86:3-86:45"
			:isContainer true
		)]
	) ) ( def imperativeocl_BreakExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[imperativeocl_ImperativeExpression]
		:structuralFeatures[]
	) ) ( def imperativeocl_TryExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[imperativeocl_ImperativeExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tryBody"
			:upper 1
			:lower 1
			:isOrdered false
			:owner imperativeocl_TryExp
			:type essentialocl_OclExpression
			:location "94:3-94:71"
			:isContainer true
			:opposite tryBodyOwner
		) ( struct-map
			KM3_Reference
			:name "exception"
			:upper -1
			:lower 0
			:isOrdered true
			:owner imperativeocl_TryExp
			:type emof_Type
			:location "95:3-95:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "exceptBody"
			:upper 1
			:lower 0
			:isOrdered false
			:owner imperativeocl_TryExp
			:type essentialocl_OclExpression
			:location "96:3-96:55"
			:isContainer true
		)]
	) ) ( def imperativeocl_RaiseExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[imperativeocl_ImperativeExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "exception"
			:upper 1
			:lower 1
			:isOrdered false
			:owner imperativeocl_RaiseExp
			:type emof_Type
			:location "100:3-100:30"
			:isContainer false
		)]
	) ) ( def imperativeocl_ContinueExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[imperativeocl_ImperativeExpression]
		:structuralFeatures[]
	) ) ( def imperativeocl_ForExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[imperativeocl_ImperativeLoopExp]
		:structuralFeatures[]
	) ) ( def imperativeocl_TupleExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[imperativeocl_ImperativeExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "element"
			:upper -1
			:lower 1
			:isOrdered true
			:owner imperativeocl_TupleExp
			:type essentialocl_OclExpression
			:location "112:3-112:60"
			:isContainer true
		)]
	) ) ( def imperativeocl_Typedef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Class]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "base"
			:upper 1
			:lower 1
			:isOrdered false
			:owner imperativeocl_Typedef
			:type emof_Type
			:location "116:3-116:25"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner imperativeocl_Typedef
			:type essentialocl_OclExpression
			:location "117:3-117:54"
			:isContainer true
		)]
	) ) ( def imperativeocl_InstantiationExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[imperativeocl_ImperativeExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "instantiatedClass"
			:upper 1
			:lower 1
			:isOrdered false
			:owner imperativeocl_InstantiationExp
			:type emof_Class
			:location "121:3-121:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "extent"
			:upper 1
			:lower 0
			:isOrdered false
			:owner imperativeocl_InstantiationExp
			:type essentialocl_Variable
			:location "122:3-122:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "argument"
			:upper -1
			:lower 0
			:isOrdered true
			:owner imperativeocl_InstantiationExp
			:type essentialocl_OclExpression
			:location "123:3-123:59"
			:isContainer true
		)]
	) ) ( def imperativeocl_DictionaryType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_CollectionType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "keyType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner imperativeocl_DictionaryType
			:type emof_Type
			:location "127:3-127:33"
			:isContainer false
		)]
	) ) ( def imperativeocl_DictLiteralExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_LiteralExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "part"
			:upper -1
			:lower 0
			:isOrdered true
			:owner imperativeocl_DictLiteralExp
			:type imperativeocl_DictLiteralPart
			:location "131:3-131:57"
			:isContainer true
		)]
	) ) ( def imperativeocl_DictLiteralPart ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner imperativeocl_DictLiteralPart
			:type essentialocl_OclExpression
			:location "135:3-135:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner imperativeocl_DictLiteralPart
			:type essentialocl_OclExpression
			:location "136:3-136:45"
			:isContainer true
		)]
	) ) ( def imperativeocl_TemplateParameterType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Type]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "specification"
			:upper 1
			:lower 0
			:isOrdered false
			:owner imperativeocl_TemplateParameterType
			:type String
			:location "140:3-140:41"
		)]
	) ) ( def imperativeocl_LogExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[imperativeocl_ImperativeExpression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 0
			:isOrdered false
			:owner imperativeocl_LogExp
			:type String
			:location "144:3-144:32"
		) ( struct-map
			KM3_Attribute
			:name "level"
			:upper 1
			:lower 0
			:isOrdered false
			:owner imperativeocl_LogExp
			:type Integer
			:location "145:3-145:34"
		) ( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner imperativeocl_LogExp
			:type essentialocl_OclExpression
			:location "146:3-146:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "element"
			:upper 1
			:lower 0
			:isOrdered false
			:owner imperativeocl_LogExp
			:type emof_Element
			:location "147:3-147:36"
			:isContainer false
		)]
	) ) ( def imperativeocl_AssertExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[imperativeocl_ImperativeExpression]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "severity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner imperativeocl_AssertExp
			:type SeverityKind
			:location "151:3-151:42"
		) ( struct-map
			KM3_Reference
			:name "log"
			:upper 1
			:lower 0
			:isOrdered false
			:owner imperativeocl_AssertExp
			:type imperativeocl_LogExp
			:location "152:3-152:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "assertion"
			:upper 1
			:lower 1
			:isOrdered false
			:owner imperativeocl_AssertExp
			:type essentialocl_OclExpression
			:location "153:3-153:49"
			:isContainer true
		)]
	) ) ( def imperativeocl_ImperativeLoopExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[essentialocl_LoopExp imperativeocl_ImperativeExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner imperativeocl_ImperativeLoopExp
			:type essentialocl_OclExpression
			:location "163:3-163:54"
			:isContainer true
		)]
	) ) ( def imperativeocl_CollectorExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[imperativeocl_ImperativeLoopExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner imperativeocl_CollectorExp
			:type essentialocl_Variable
			:location "167:3-167:41"
			:isContainer true
		)]
	) ) ( def imperativeocl_ImperativeExpression ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[essentialocl_OclExpression]
		:structuralFeatures[]
	) ) ( def imperativeocl_UnpackExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[imperativeocl_ImperativeExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "variable"
			:upper -1
			:lower 1
			:isOrdered true
			:owner imperativeocl_UnpackExp
			:type essentialocl_Variable
			:location "175:3-175:56"
			:isContainer true
		)]
	) ) ( def imperativeocl_AnonymousTupleType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Class]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elementType"
			:upper -1
			:lower 0
			:isOrdered true
			:owner imperativeocl_AnonymousTupleType
			:type emof_Type
			:location "179:3-179:43"
			:isContainer false
		)]
	) ) ( def imperativeocl_AnonymousTupleLiteralExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_LiteralExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "part"
			:upper -1
			:lower 0
			:isOrdered true
			:owner imperativeocl_AnonymousTupleLiteralExp
			:type imperativeocl_AnonymousTupleLiteralPart
			:location "183:3-183:67"
			:isContainer true
		)]
	) ) ( def imperativeocl_AnonymousTupleLiteralPart ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "value"
			:upper -1
			:lower 0
			:isOrdered true
			:owner imperativeocl_AnonymousTupleLiteralPart
			:type essentialocl_OclExpression
			:location "187:3-187:56"
			:isContainer true
		)]
	) ) ( def imperativeocl_ListType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_CollectionType]
		:structuralFeatures[]
	) )]
) )
( def emof ( struct-map
	KM3_Package
	:contents[( def emof_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Type]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 0
			:isOrdered false
			:owner emof_Class
			:type Boolean
			:location "202:3-202:39"
		) ( struct-map
			KM3_Reference
			:name "ownedAttribute"
			:upper -1
			:lower 0
			:isOrdered true
			:owner emof_Class
			:type emof_Property
			:location "199:3-199:77"
			:isContainer true
			:opposite Class
		) ( struct-map
			KM3_Reference
			:name "ownedOperation"
			:upper -1
			:lower 0
			:isOrdered true
			:owner emof_Class
			:type emof_Operation
			:location "200:3-200:80"
			:isContainer true
			:opposite class
		) ( struct-map
			KM3_Reference
			:name "superClass"
			:upper -1
			:lower 0
			:isOrdered true
			:owner emof_Class
			:type emof_Class
			:location "201:3-201:43"
			:isContainer false
		)]
	) ) ( def emof_DataType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[emof_Type]
		:structuralFeatures[]
	) ) ( def emof_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[emof_Object]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tag"
			:upper -1
			:lower 0
			:isOrdered true
			:owner emof_Element
			:type emof_Tag
			:location "210:3-210:53"
			:isContainer false
			:opposite element
		) ( struct-map
			KM3_Reference
			:name "ownedComment"
			:upper -1
			:lower 0
			:isOrdered true
			:owner emof_Element
			:type emof_Comment
			:location "211:3-211:57"
			:isContainer true
		)]
	) ) ( def emof_Tag ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner emof_Tag
			:type String
			:location "218:3-218:33"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner emof_Tag
			:type String
			:location "219:3-219:32"
		) ( struct-map
			KM3_Reference
			:name "element"
			:upper -1
			:lower 0
			:isOrdered true
			:owner emof_Tag
			:type emof_Element
			:location "215:3-215:57"
			:isContainer false
			:opposite tag
		) ( struct-map
			KM3_Reference
			:name "transformation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner emof_Tag
			:type qvtbase_Transformation
			:location "216:3-216:70"
			:isContainer false
			:opposite ownedTag
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner emof_Tag
			:type qvtoperational_Module
			:location "217:3-217:53"
			:isContainer false
			:opposite ownedTag
		)]
	) ) ( def emof_Enumeration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_DataType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedLiteral"
			:upper -1
			:lower 0
			:isOrdered true
			:owner emof_Enumeration
			:type emof_EnumerationLiteral
			:location "223:3-223:93"
			:isContainer true
			:opposite enumeration
		)]
	) ) ( def emof_NamedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[emof_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner emof_NamedElement
			:type String
			:location "227:3-227:32"
		)]
	) ) ( def emof_Extent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Object]
		:structuralFeatures[]
	) ) ( def emof_Object ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def emof_Operation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_MultiplicityElement emof_TypedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "class"
			:upper 1
			:lower 1
			:isOrdered false
			:owner emof_Operation
			:type emof_Class
			:location "239:3-239:55"
			:isContainer false
			:opposite ownedOperation
		) ( struct-map
			KM3_Reference
			:name "ownedParameter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner emof_Operation
			:type emof_Parameter
			:location "240:3-240:84"
			:isContainer true
			:opposite operation
		) ( struct-map
			KM3_Reference
			:name "raisedException"
			:upper -1
			:lower 0
			:isOrdered true
			:owner emof_Operation
			:type emof_Type
			:location "241:3-241:47"
			:isContainer false
		)]
	) ) ( def emof_MultiplicityElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isOrdered"
			:upper 1
			:lower 0
			:isOrdered false
			:owner emof_MultiplicityElement
			:type Boolean
			:location "245:3-245:38"
		) ( struct-map
			KM3_Attribute
			:name "isUnique"
			:upper 1
			:lower 0
			:isOrdered false
			:owner emof_MultiplicityElement
			:type Boolean
			:location "246:3-246:37"
		) ( struct-map
			KM3_Attribute
			:name "lower"
			:upper 1
			:lower 0
			:isOrdered false
			:owner emof_MultiplicityElement
			:type Integer
			:location "247:3-247:34"
		) ( struct-map
			KM3_Attribute
			:name "upper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner emof_MultiplicityElement
			:type UnlimitedNatural
			:location "248:3-248:43"
		)]
	) ) ( def emof_Package ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "uri"
			:upper 1
			:lower 0
			:isOrdered false
			:owner emof_Package
			:type String
			:location "254:3-254:31"
		) ( struct-map
			KM3_Reference
			:name "ownedType"
			:upper -1
			:lower 0
			:isOrdered true
			:owner emof_Package
			:type emof_Type
			:location "252:3-252:72"
			:isContainer true
			:opposite package
		) ( struct-map
			KM3_Reference
			:name "nestedPackage"
			:upper -1
			:lower 0
			:isOrdered true
			:owner emof_Package
			:type emof_Package
			:location "253:3-253:48"
			:isContainer false
		)]
	) ) ( def emof_Type ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[emof_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "package"
			:upper 1
			:lower 1
			:isOrdered false
			:owner emof_Type
			:type emof_Package
			:location "258:3-258:54"
			:isContainer false
			:opposite ownedType
		)]
	) ) ( def emof_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_MultiplicityElement emof_TypedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "operation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner emof_Parameter
			:type emof_Operation
			:location "262:3-262:68"
			:isContainer false
			:opposite ownedParameter
		)]
	) ) ( def emof_EnumerationLiteral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "enumeration"
			:upper 1
			:lower 0
			:isOrdered false
			:owner emof_EnumerationLiteral
			:type emof_Enumeration
			:location "266:3-266:70"
			:isContainer false
			:opposite ownedLiteral
		)]
	) ) ( def emof_Property ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_MultiplicityElement emof_TypedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isReadOnly"
			:upper 1
			:lower 0
			:isOrdered false
			:owner emof_Property
			:type Boolean
			:location "273:3-273:39"
		) ( struct-map
			KM3_Attribute
			:name "isDerived"
			:upper 1
			:lower 0
			:isOrdered false
			:owner emof_Property
			:type Boolean
			:location "274:3-274:38"
		) ( struct-map
			KM3_Attribute
			:name "isComposite"
			:upper 1
			:lower 0
			:isOrdered false
			:owner emof_Property
			:type Boolean
			:location "275:3-275:40"
		) ( struct-map
			KM3_Attribute
			:name "isId"
			:upper 1
			:lower 0
			:isOrdered false
			:owner emof_Property
			:type Boolean
			:location "276:3-276:33"
		) ( struct-map
			KM3_Attribute
			:name "default"
			:upper 1
			:lower 0
			:isOrdered false
			:owner emof_Property
			:type String
			:location "277:3-277:35"
		) ( struct-map
			KM3_Reference
			:name "Class"
			:upper 1
			:lower 1
			:isOrdered false
			:owner emof_Property
			:type emof_Class
			:location "270:3-270:53"
			:isContainer false
			:opposite ownedAttribute
		) ( struct-map
			KM3_Reference
			:name "opposite"
			:upper 1
			:lower 0
			:isOrdered false
			:owner emof_Property
			:type emof_Property
			:location "271:3-271:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "module"
			:upper 1
			:lower 0
			:isOrdered false
			:owner emof_Property
			:type qvtoperational_Module
			:location "272:3-272:60"
			:isContainer false
			:opposite configProperty
		)]
	) ) ( def emof_TypedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[emof_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner emof_TypedElement
			:type emof_Type
			:location "281:3-281:30"
			:isContainer false
		)]
	) ) ( def emof_PrimitiveType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_DataType]
		:structuralFeatures[]
	) ) ( def emof_URIExtent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Extent]
		:structuralFeatures[]
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "292:2-292:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "294:2-294:18"
	) ) ( def ptyp_UnlimitedNatural ( struct-map
		KM3_DataType
		:name "UnlimitedNatural"
		:location "296:2-296:28"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "298:2-298:19"
	) ) ( def ptyp_Real ( struct-map
		KM3_DataType
		:name "Real"
		:location "300:2-300:16"
	) ) ( def emof_Comment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "annotatedElement"
			:upper -1
			:lower 0
			:isOrdered true
			:owner emof_Comment
			:type emof_NamedElement
			:location "303:3-303:56"
			:isContainer false
		)]
	) )]
) )
( def qvtoperational ( struct-map
	KM3_Package
	:contents[( def DirectionKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "in"
		:location "384:3-384:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "inout"
		:location "385:3-385:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "out"
		:location "386:3-386:15"
	)] ) ) ( def ImportKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "extension"
		:location "419:3-419:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "access"
		:location "420:3-420:18"
	)] ) ) ( def qvtoperational_MappingBody ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvtoperational_OperationBody]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "initSection"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtoperational_MappingBody
			:type essentialocl_OclExpression
			:location "311:3-311:62"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "endSection"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtoperational_MappingBody
			:type essentialocl_OclExpression
			:location "312:3-312:61"
			:isContainer true
		)]
	) ) ( def qvtoperational_Helper ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvtoperational_ImperativeOperation]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isQuery"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_Helper
			:type Boolean
			:location "316:3-316:36"
		)]
	) ) ( def qvtoperational_ResolveExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_CallExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "one"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_ResolveExp
			:type Boolean
			:location "321:3-321:32"
		) ( struct-map
			KM3_Attribute
			:name "isInverse"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_ResolveExp
			:type Boolean
			:location "322:3-322:38"
		) ( struct-map
			KM3_Attribute
			:name "isDeferred"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_ResolveExp
			:type Boolean
			:location "323:3-323:39"
		) ( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_ResolveExp
			:type essentialocl_OclExpression
			:location "320:3-320:54"
			:isContainer true
		)]
	) ) ( def qvtoperational_ResolveInExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvtoperational_ResolveExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "inMapping"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_ResolveInExp
			:type qvtoperational_MappingOperation
			:location "327:3-327:47"
			:isContainer false
		)]
	) ) ( def qvtoperational_OperationalTransformation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvtoperational_Module]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "intermediateClass"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtoperational_OperationalTransformation
			:type emof_Class
			:location "331:3-331:50"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "refined"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_OperationalTransformation
			:type qvtbase_Transformation
			:location "332:3-332:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "intermediateProperty"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtoperational_OperationalTransformation
			:type emof_Property
			:location "333:3-333:56"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "modelParameter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtoperational_OperationalTransformation
			:type qvtoperational_ModelParameter
			:location "334:3-334:66"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "entry"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_OperationalTransformation
			:type qvtoperational_EntryOperation
			:location "335:3-335:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "relation"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtoperational_OperationalTransformation
			:type qvtrelation_Relation
			:location "336:3-336:54"
			:isContainer true
		)]
	) ) ( def qvtoperational_MappingParameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvtoperational_VarParameter]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "refinedDomain"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_MappingParameter
			:type qvtrelation_RelationDomain
			:location "340:3-340:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "extent"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_MappingParameter
			:type qvtoperational_ModelParameter
			:location "342:3-342:42"
			:isContainer false
		)]
	) ) ( def qvtoperational_MappingOperation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvtoperational_ImperativeOperation emof_Operation emof_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "disjunct"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtoperational_MappingOperation
			:type qvtoperational_MappingOperation
			:location "346:3-346:52"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "refinedRelation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtoperational_MappingOperation
			:type qvtrelation_Relation
			:location "347:3-347:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "merged"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtoperational_MappingOperation
			:type qvtoperational_MappingOperation
			:location "348:3-348:50"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "inherited"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtoperational_MappingOperation
			:type qvtoperational_MappingOperation
			:location "349:3-349:53"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "when"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtoperational_MappingOperation
			:type essentialocl_OclExpression
			:location "351:3-351:57"
			:isContainer true
		)]
	) ) ( def qvtoperational_MappingCallExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvtoperational_ImperativeCallExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isStrict"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_MappingCallExp
			:type Boolean
			:location "355:3-355:37"
		)]
	) ) ( def qvtoperational_Constructor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvtoperational_ImperativeOperation]
		:structuralFeatures[]
	) ) ( def qvtoperational_ContextualProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Property]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "context"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtoperational_ContextualProperty
			:type emof_Class
			:location "363:3-363:29"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "overridden"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_ContextualProperty
			:type emof_Property
			:location "364:3-364:40"
			:isContainer false
		)]
	) ) ( def qvtoperational_EntryOperation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvtoperational_ImperativeOperation]
		:structuralFeatures[]
	) ) ( def qvtoperational_ImperativeCallExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_OperationCallExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isVirtual"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_ImperativeCallExp
			:type Boolean
			:location "372:3-372:38"
		)]
	) ) ( def qvtoperational_ImperativeOperation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Operation]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isBlackbox"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_ImperativeOperation
			:type Boolean
			:location "380:3-380:39"
		) ( struct-map
			KM3_Reference
			:name "context"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_ImperativeOperation
			:type qvtoperational_VarParameter
			:location "376:3-376:71"
			:isContainer true
			:opposite ctxOwner
		) ( struct-map
			KM3_Reference
			:name "result"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtoperational_ImperativeOperation
			:type qvtoperational_VarParameter
			:location "377:3-377:76"
			:isContainer true
			:opposite resOwner
		) ( struct-map
			KM3_Reference
			:name "overridden"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_ImperativeOperation
			:type qvtoperational_ImperativeOperation
			:location "378:3-378:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_ImperativeOperation
			:type qvtoperational_OperationBody
			:location "379:3-379:72"
			:isContainer true
			:opposite operation
		)]
	) ) ( def qvtoperational_Library ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvtoperational_Module]
		:structuralFeatures[]
	) ) ( def qvtoperational_ModelParameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvtoperational_VarParameter]
		:structuralFeatures[]
	) ) ( def qvtoperational_ModelType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Class emof_URIExtent]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "conformanceKind"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_ModelType
			:type String
			:location "400:3-400:43"
		) ( struct-map
			KM3_Reference
			:name "metamodel"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtoperational_ModelType
			:type emof_Package
			:location "398:3-398:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "additionalCondition"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtoperational_ModelType
			:type essentialocl_OclExpression
			:location "399:3-399:70"
			:isContainer true
		)]
	) ) ( def qvtoperational_Module ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Class emof_Package]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isBlackbox"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_Module
			:type Boolean
			:location "408:3-408:39"
		) ( struct-map
			KM3_Reference
			:name "ownedTag"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtoperational_Module
			:type emof_Tag
			:location "404:3-404:66"
			:isContainer true
			:opposite owner
		) ( struct-map
			KM3_Reference
			:name "configProperty"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtoperational_Module
			:type emof_Property
			:location "405:3-405:68"
			:isContainer false
			:opposite module
		) ( struct-map
			KM3_Reference
			:name "moduleImport"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtoperational_Module
			:type qvtoperational_ModuleImport
			:location "406:3-406:80"
			:isContainer true
			:opposite module
		) ( struct-map
			KM3_Reference
			:name "usedModelType"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtoperational_Module
			:type qvtoperational_ModelType
			:location "407:3-407:50"
			:isContainer false
		)]
	) ) ( def qvtoperational_ModuleImport ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "kind"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_ModuleImport
			:type ImportKind
			:location "415:3-415:36"
		) ( struct-map
			KM3_Reference
			:name "binding"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtoperational_ModuleImport
			:type qvtoperational_ModelType
			:location "412:3-412:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "module"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_ModuleImport
			:type qvtoperational_Module
			:location "413:3-413:58"
			:isContainer false
			:opposite moduleImport
		) ( struct-map
			KM3_Reference
			:name "importedModule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtoperational_ModuleImport
			:type qvtoperational_Module
			:location "414:3-414:37"
			:isContainer false
		)]
	) ) ( def qvtoperational_VarParameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Parameter essentialocl_Variable]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "kind"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_VarParameter
			:type DirectionKind
			:location "426:3-426:39"
		) ( struct-map
			KM3_Reference
			:name "ctxOwner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_VarParameter
			:type qvtoperational_ImperativeOperation
			:location "424:3-424:68"
			:isContainer false
			:opposite context
		) ( struct-map
			KM3_Reference
			:name "resOwner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_VarParameter
			:type qvtoperational_ImperativeOperation
			:location "425:3-425:67"
			:isContainer false
			:opposite result
		)]
	) ) ( def qvtoperational_OperationBody ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "operation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_OperationBody
			:type qvtoperational_ImperativeOperation
			:location "430:3-430:68"
			:isContainer false
			:opposite body
		) ( struct-map
			KM3_Reference
			:name "content"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtoperational_OperationBody
			:type essentialocl_OclExpression
			:location "431:3-431:58"
			:isContainer true
		)]
	) ) ( def qvtoperational_ConstructorBody ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvtoperational_OperationBody]
		:structuralFeatures[]
	) ) ( def qvtoperational_ObjectExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[imperativeocl_InstantiationExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "referredObject"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtoperational_ObjectExp
			:type essentialocl_Variable
			:location "439:3-439:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtoperational_ObjectExp
			:type qvtoperational_ConstructorBody
			:location "440:3-440:46"
			:isContainer true
		)]
	) )]
) )
( def qvtcore ( struct-map
	KM3_Package
	:contents[( def EnforcementMode ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Deletion"
		:location "496:3-496:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "Creation"
		:location "497:3-497:20"
	)] ) ) ( def qvtcore_Area ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "guardPattern"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtcore_Area
			:type qvtcore_GuardPattern
			:location "448:3-448:67"
			:isContainer true
			:opposite area
		) ( struct-map
			KM3_Reference
			:name "bottomPattern"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtcore_Area
			:type qvtcore_BottomPattern
			:location "449:3-449:69"
			:isContainer true
			:opposite area
		)]
	) ) ( def qvtcore_Assignment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isDefault"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtcore_Assignment
			:type Boolean
			:location "457:3-457:38"
		) ( struct-map
			KM3_Reference
			:name "bottomPattern"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtcore_Assignment
			:type qvtcore_BottomPattern
			:location "453:3-453:65"
			:isContainer false
			:opposite assignment
		) ( struct-map
			KM3_Reference
			:name "slotExpression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtcore_Assignment
			:type essentialocl_OclExpression
			:location "454:3-454:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtcore_Assignment
			:type essentialocl_OclExpression
			:location "455:3-455:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "targetProperty"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtcore_Assignment
			:type emof_Property
			:location "456:3-456:39"
			:isContainer false
		)]
	) ) ( def qvtcore_BottomPattern ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvtcore_CorePattern]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "area"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtcore_BottomPattern
			:type qvtcore_Area
			:location "461:3-461:50"
			:isContainer false
			:opposite bottomPattern
		) ( struct-map
			KM3_Reference
			:name "assignment"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtcore_BottomPattern
			:type qvtcore_Assignment
			:location "462:3-462:83"
			:isContainer true
			:opposite bottomPattern
		) ( struct-map
			KM3_Reference
			:name "realizedVariable"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtcore_BottomPattern
			:type qvtcore_RealizedVariable
			:location "463:3-463:70"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "enforcementOperation"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtcore_BottomPattern
			:type qvtcore_EnforcementOperation
			:location "464:3-464:103"
			:isContainer true
			:opposite bottomPattern
		)]
	) ) ( def qvtcore_GuardPattern ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvtcore_CorePattern]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "area"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtcore_GuardPattern
			:type qvtcore_Area
			:location "468:3-468:49"
			:isContainer false
			:opposite guardPattern
		)]
	) ) ( def qvtcore_Mapping ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvtbase_Rule qvtcore_Area]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "specification"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtcore_Mapping
			:type qvtcore_Mapping
			:location "472:3-472:48"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "local"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtcore_Mapping
			:type qvtcore_Mapping
			:location "473:3-473:59"
			:isContainer false
			:opposite context
		) ( struct-map
			KM3_Reference
			:name "context"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtcore_Mapping
			:type qvtcore_Mapping
			:location "474:3-474:53"
			:isContainer false
			:opposite local
		)]
	) ) ( def qvtcore_RealizedVariable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_Variable]
		:structuralFeatures[]
	) ) ( def qvtcore_CoreDomain ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvtbase_Domain qvtcore_Area]
		:structuralFeatures[]
	) ) ( def qvtcore_CorePattern ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvtbase_Pattern]
		:structuralFeatures[]
	) ) ( def qvtcore_EnforcementOperation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "enforcementMode"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtcore_EnforcementOperation
			:type EnforcementMode
			:location "490:3-490:52"
		) ( struct-map
			KM3_Reference
			:name "bottomPattern"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtcore_EnforcementOperation
			:type qvtcore_BottomPattern
			:location "491:3-491:80"
			:isContainer false
			:opposite enforcementOperation
		) ( struct-map
			KM3_Reference
			:name "operationCallExp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtcore_EnforcementOperation
			:type essentialocl_OperationCallExp
			:location "492:3-492:49"
			:isContainer false
		)]
	) )]
) )
( def qvtbase ( struct-map
	KM3_Package
	:contents[( def qvtbase_Domain ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isCheckable"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtbase_Domain
			:type Boolean
			:location "505:3-505:40"
		) ( struct-map
			KM3_Attribute
			:name "isEnforceable"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtbase_Domain
			:type Boolean
			:location "506:3-506:42"
		) ( struct-map
			KM3_Reference
			:name "rule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtbase_Domain
			:type qvtbase_Rule
			:location "507:3-507:43"
			:isContainer false
			:opposite domain
		) ( struct-map
			KM3_Reference
			:name "typedModel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtbase_Domain
			:type qvtbase_TypedModel
			:location "508:3-508:37"
			:isContainer false
		)]
	) ) ( def qvtbase_Transformation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Class emof_Package]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedTag"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtbase_Transformation
			:type emof_Tag
			:location "512:3-512:75"
			:isContainer true
			:opposite transformation
		) ( struct-map
			KM3_Reference
			:name "modelParameter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtbase_Transformation
			:type qvtbase_TypedModel
			:location "513:3-513:88"
			:isContainer true
			:opposite transformation
		) ( struct-map
			KM3_Reference
			:name "rule"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtbase_Transformation
			:type qvtbase_Rule
			:location "514:3-514:72"
			:isContainer true
			:opposite transformation
		) ( struct-map
			KM3_Reference
			:name "extends"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtbase_Transformation
			:type qvtbase_Transformation
			:location "515:3-515:45"
			:isContainer false
		)]
	) ) ( def qvtbase_TypedModel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "transformation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtbase_TypedModel
			:type qvtbase_Transformation
			:location "519:3-519:71"
			:isContainer false
			:opposite modelParameter
		) ( struct-map
			KM3_Reference
			:name "usedPackage"
			:upper -1
			:lower 1
			:isOrdered true
			:owner qvtbase_TypedModel
			:type emof_Package
			:location "520:3-520:48"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dependsOn"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtbase_TypedModel
			:type qvtbase_TypedModel
			:location "521:3-521:47"
			:isContainer false
		)]
	) ) ( def qvtbase_Rule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_NamedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "domain"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtbase_Rule
			:type qvtbase_Domain
			:location "525:3-525:66"
			:isContainer true
			:opposite rule
		) ( struct-map
			KM3_Reference
			:name "transformation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtbase_Rule
			:type qvtbase_Transformation
			:location "526:3-526:61"
			:isContainer false
			:opposite rule
		) ( struct-map
			KM3_Reference
			:name "overrides"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtbase_Rule
			:type qvtbase_Rule
			:location "527:3-527:35"
			:isContainer false
		)]
	) ) ( def qvtbase_Pattern ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "predicate"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtbase_Pattern
			:type qvtbase_Predicate
			:location "531:3-531:75"
			:isContainer true
			:opposite pattern
		) ( struct-map
			KM3_Reference
			:name "bindsTo"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtbase_Pattern
			:type essentialocl_Variable
			:location "532:3-532:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "whenOwner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtbase_Pattern
			:type qvtrelation_Relation
			:location "533:3-533:56"
			:isContainer false
			:opposite where
		) ( struct-map
			KM3_Reference
			:name "whereOwner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtbase_Pattern
			:type qvtrelation_Relation
			:location "534:3-534:56"
			:isContainer false
			:opposite when
		)]
	) ) ( def qvtbase_Predicate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "conditionExpression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtbase_Predicate
			:type essentialocl_OclExpression
			:location "538:3-538:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "pattern"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtbase_Predicate
			:type qvtbase_Pattern
			:location "539:3-539:52"
			:isContainer false
			:opposite predicate
		)]
	) ) ( def qvtbase_Function ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Operation]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "queryExpression"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtbase_Function
			:type essentialocl_OclExpression
			:location "543:3-543:60"
			:isContainer true
		)]
	) ) ( def qvtbase_FunctionParameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Parameter essentialocl_Variable]
		:structuralFeatures[]
	) )]
) )
( def qvtrelation ( struct-map
	KM3_Package
	:contents[( def qvtrelation_RelationalTransformation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvtbase_Transformation]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedKey"
			:upper -1
			:lower 0
			:isOrdered false
			:owner qvtrelation_RelationalTransformation
			:type qvtrelation_Key
			:location "556:3-556:69"
			:isContainer true
			:opposite transformation
		)]
	) ) ( def qvtrelation_Relation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvtbase_Rule]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isTopLevel"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtrelation_Relation
			:type Boolean
			:location "560:3-560:39"
		) ( struct-map
			KM3_Reference
			:name "variable"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtrelation_Relation
			:type essentialocl_Variable
			:location "561:3-561:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "operationalImpl"
			:upper -1
			:lower 0
			:isOrdered true
			:owner qvtrelation_Relation
			:type qvtrelation_RelationImplementation
			:location "562:3-562:85"
			:isContainer false
			:opposite relation
		) ( struct-map
			KM3_Reference
			:name "where"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtrelation_Relation
			:type qvtbase_Pattern
			:location "563:3-563:65"
			:isContainer true
			:opposite whenOwner
		) ( struct-map
			KM3_Reference
			:name "when"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtrelation_Relation
			:type qvtbase_Pattern
			:location "564:3-564:65"
			:isContainer true
			:opposite whereOwner
		)]
	) ) ( def qvtrelation_RelationDomain ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvtbase_Domain]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "pattern"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtrelation_RelationDomain
			:type qvtrelation_DomainPattern
			:location "568:3-568:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "rootVariable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtrelation_RelationDomain
			:type essentialocl_Variable
			:location "569:3-569:37"
			:isContainer false
		)]
	) ) ( def qvtrelation_DomainPattern ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[qvtbase_Pattern]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "templateExpression"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtrelation_DomainPattern
			:type qvttemplate_TemplateExp
			:location "573:3-573:61"
			:isContainer true
		)]
	) ) ( def qvtrelation_RelationImplementation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "relation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtrelation_RelationImplementation
			:type qvtrelation_Relation
			:location "577:3-577:65"
			:isContainer false
			:opposite operationalImpl
		) ( struct-map
			KM3_Reference
			:name "impl"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtrelation_RelationImplementation
			:type emof_Operation
			:location "578:3-578:30"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "inDirectionOf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtrelation_RelationImplementation
			:type qvtbase_TypedModel
			:location "579:3-579:40"
			:isContainer false
		)]
	) ) ( def qvtrelation_Key ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "identifies"
			:upper 1
			:lower 1
			:isOrdered false
			:owner qvtrelation_Key
			:type emof_Class
			:location "583:3-583:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "part"
			:upper -1
			:lower 1
			:isOrdered true
			:owner qvtrelation_Key
			:type emof_Property
			:location "584:3-584:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "transformation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner qvtrelation_Key
			:type qvtrelation_RelationalTransformation
			:location "586:3-586:80"
			:isContainer false
			:opposite ownedKey
		)]
	) )]
) )
( def essentialocl ( struct-map
	KM3_Package
	:contents[( def CollectionKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "OrderedSet"
		:location "602:3-602:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "Set"
		:location "603:3-603:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "Bag"
		:location "604:3-604:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "Sequence"
		:location "605:3-605:20"
	)] ) ) ( def essentialocl_BooleanLiteralExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_PrimitiveLiteralExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "booleanSymbol"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_BooleanLiteralExp
			:type Boolean
			:location "594:3-594:42"
		)]
	) ) ( def essentialocl_CallExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[essentialocl_OclExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_CallExp
			:type essentialocl_OclExpression
			:location "598:3-598:51"
			:isContainer true
		)]
	) ) ( def essentialocl_OclExpression ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[emof_TypedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tryBodyOwner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_OclExpression
			:type imperativeocl_TryExp
			:location "609:3-609:59"
			:isContainer false
			:opposite tryBody
		)]
	) ) ( def essentialocl_UnlimitedNaturalExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_NumericLiteralExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "symbol"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_UnlimitedNaturalExp
			:type UnlimitedNatural
			:location "613:3-613:44"
		)]
	) ) ( def essentialocl_IfExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_OclExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner essentialocl_IfExp
			:type essentialocl_OclExpression
			:location "617:3-617:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "thenExpression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner essentialocl_IfExp
			:type essentialocl_OclExpression
			:location "618:3-618:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "elseExpression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner essentialocl_IfExp
			:type essentialocl_OclExpression
			:location "619:3-619:54"
			:isContainer true
		)]
	) ) ( def essentialocl_LetExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_OclExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "in"
			:upper -1
			:lower 0
			:isOrdered true
			:owner essentialocl_LetExp
			:type essentialocl_OclExpression
			:location "623:3-623:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "variable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner essentialocl_LetExp
			:type essentialocl_Variable
			:location "624:3-624:61"
			:isContainer true
			:opposite LetExp
		)]
	) ) ( def essentialocl_Variable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_TypedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "initExpression"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_Variable
			:type essentialocl_OclExpression
			:location "628:3-628:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "LetExp"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_Variable
			:type essentialocl_LetExp
			:location "629:3-629:54"
			:isContainer false
			:opposite variable
		) ( struct-map
			KM3_Reference
			:name "computeOwner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_Variable
			:type imperativeocl_ComputeExp
			:location "630:3-630:71"
			:isContainer false
			:opposite returnedElement
		) ( struct-map
			KM3_Reference
			:name "bindParameter"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_Variable
			:type emof_Parameter
			:location "631:3-631:44"
			:isContainer false
		)]
	) ) ( def essentialocl_PropertyCallExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_FeaturePropertyCall]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "referredProperty"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_PropertyCallExp
			:type emof_Property
			:location "635:3-635:46"
			:isContainer false
		)]
	) ) ( def essentialocl_VariableExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_OclExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "referredVariable"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_VariableExp
			:type essentialocl_Variable
			:location "639:3-639:46"
			:isContainer false
		)]
	) ) ( def essentialocl_TypeExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_OclExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "referredType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_TypeExp
			:type emof_Type
			:location "643:3-643:38"
			:isContainer false
		)]
	) ) ( def essentialocl_LoopExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[essentialocl_CallExp essentialocl_OclExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner essentialocl_LoopExp
			:type essentialocl_OclExpression
			:location "647:3-647:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "iterator"
			:upper -1
			:lower 0
			:isOrdered true
			:owner essentialocl_LoopExp
			:type essentialocl_Variable
			:location "648:3-648:54"
			:isContainer true
		)]
	) ) ( def essentialocl_IteratorExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_LoopExp]
		:structuralFeatures[]
	) ) ( def essentialocl_StringLiteralExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_PrimitiveLiteralExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "stringSymbol"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_StringLiteralExp
			:type String
			:location "656:3-656:40"
		)]
	) ) ( def essentialocl_IntegerLiteralExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_NumericLiteralExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "integerSymbol"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_IntegerLiteralExp
			:type Integer
			:location "660:3-660:42"
		)]
	) ) ( def essentialocl_OperationCallExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_FeaturePropertyCall]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "argument"
			:upper -1
			:lower 0
			:isOrdered true
			:owner essentialocl_OperationCallExp
			:type essentialocl_OclExpression
			:location "664:3-664:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "referredOperation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_OperationCallExp
			:type emof_Operation
			:location "665:3-665:48"
			:isContainer false
		)]
	) ) ( def essentialocl_RealLiteralExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_NumericLiteralExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "realSymbol"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_RealLiteralExp
			:type Real
			:location "669:3-669:36"
		)]
	) ) ( def essentialocl_LiteralExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[essentialocl_OclExpression]
		:structuralFeatures[]
	) ) ( def essentialocl_IterateExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_LoopExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "result"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_IterateExp
			:type essentialocl_Variable
			:location "677:3-677:46"
			:isContainer true
		)]
	) ) ( def essentialocl_PrimitiveLiteralExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[essentialocl_LiteralExp]
		:structuralFeatures[]
	) ) ( def essentialocl_NumericLiteralExp ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[essentialocl_PrimitiveLiteralExp]
		:structuralFeatures[]
	) ) ( def essentialocl_CollectionLiteralExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_LiteralExp]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "kind"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_CollectionLiteralExp
			:type CollectionKind
			:location "689:3-689:40"
		) ( struct-map
			KM3_Reference
			:name "part"
			:upper -1
			:lower 0
			:isOrdered true
			:owner essentialocl_CollectionLiteralExp
			:type essentialocl_CollectionLiteralPart
			:location "690:3-690:95"
			:isContainer true
			:opposite CollectionLiteralExp
		)]
	) ) ( def essentialocl_CollectionLiteralPart ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[emof_TypedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "CollectionLiteralExp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner essentialocl_CollectionLiteralPart
			:type essentialocl_CollectionLiteralExp
			:location "694:3-694:73"
			:isContainer false
			:opposite part
		)]
	) ) ( def essentialocl_CollectionItem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_CollectionLiteralPart]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "item"
			:upper 1
			:lower 1
			:isOrdered false
			:owner essentialocl_CollectionItem
			:type essentialocl_OclExpression
			:location "698:3-698:44"
			:isContainer true
		)]
	) ) ( def essentialocl_CollectionRange ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_CollectionLiteralPart]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "first"
			:upper 1
			:lower 1
			:isOrdered false
			:owner essentialocl_CollectionRange
			:type essentialocl_OclExpression
			:location "702:3-702:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "last"
			:upper 1
			:lower 1
			:isOrdered false
			:owner essentialocl_CollectionRange
			:type essentialocl_OclExpression
			:location "703:3-703:44"
			:isContainer true
		)]
	) ) ( def essentialocl_TupleLiteralExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_LiteralExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "part"
			:upper -1
			:lower 0
			:isOrdered true
			:owner essentialocl_TupleLiteralExp
			:type essentialocl_TupleLiteralPart
			:location "707:3-707:85"
			:isContainer true
			:opposite TupleLiteralExp
		)]
	) ) ( def essentialocl_NullLiteralExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_LiteralExp]
		:structuralFeatures[]
	) ) ( def essentialocl_ExpressionInOcl ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_OpaqueExpression]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "bodyExpression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner essentialocl_ExpressionInOcl
			:type essentialocl_OclExpression
			:location "715:3-715:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "context"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_ExpressionInOcl
			:type essentialocl_Variable
			:location "716:3-716:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "resultVariable"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_ExpressionInOcl
			:type essentialocl_Variable
			:location "717:3-717:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "parameterVariable"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_ExpressionInOcl
			:type essentialocl_Variable
			:location "718:3-718:57"
			:isContainer true
		)]
	) ) ( def essentialocl_OpaqueExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def essentialocl_InvalidLiteralExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_LiteralExp]
		:structuralFeatures[]
	) ) ( def essentialocl_FeaturePropertyCall ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[essentialocl_CallExp]
		:structuralFeatures[]
	) ) ( def essentialocl_TupleLiteralPart ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_TypedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "TupleLiteralExp"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_TupleLiteralPart
			:type essentialocl_TupleLiteralExp
			:location "734:3-734:68"
			:isContainer false
			:opposite part
		) ( struct-map
			KM3_Reference
			:name "attribute"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_TupleLiteralPart
			:type emof_Property
			:location "735:3-735:51"
			:isContainer true
		)]
	) ) ( def essentialocl_BagType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_CollectionType]
		:structuralFeatures[]
	) ) ( def essentialocl_CollectionType ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[emof_DataType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elementType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_CollectionType
			:type emof_Type
			:location "743:3-743:37"
			:isContainer false
		)]
	) ) ( def essentialocl_EnumLiteralExp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_LiteralExp]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "referredEnumLiteral"
			:upper 1
			:lower 0
			:isOrdered false
			:owner essentialocl_EnumLiteralExp
			:type emof_EnumerationLiteral
			:location "747:3-747:59"
			:isContainer false
		)]
	) ) ( def essentialocl_InvalidType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Type]
		:structuralFeatures[]
	) ) ( def essentialocl_OrderedSetType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_CollectionType]
		:structuralFeatures[]
	) ) ( def essentialocl_SequenceType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_CollectionType]
		:structuralFeatures[]
	) ) ( def essentialocl_SetType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[essentialocl_CollectionType]
		:structuralFeatures[]
	) ) ( def essentialocl_TupleType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Class emof_DataType]
		:structuralFeatures[]
	) ) ( def essentialocl_VoidType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Type]
		:structuralFeatures[]
	) ) ( def essentialocl_AnyType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[emof_Class emof_Type]
		:structuralFeatures[]
	) )]
) )
