( declare R2ML_CollectionTypes )
( declare R2ML_PredicateCategory )
( declare R2ML_ExternalVocabularyLanguage )
( declare R2ML_PredicateType )
( declare Abstract_AbstractTransformationRule )
( declare Abstract_AbstractProductionRule )
( declare Abstract_AbstractReactionRule )
( declare Abstract_AbstractDerivationRule )
( declare Abstract_AbstractIntegrityRule )
( declare Abstract_Rule )
( declare Rules_DerivationRule )
( declare Rules_ReactionRule )
( declare Rules_ProductionRule )
( declare Rules_DeonticIntegrityRule )
( declare Rules_AlethicIntegrityRule )
( declare Rules_IntegrityRule )
( declare AtBasic_DataClassificationAtom )
( declare AtBasic_DatatypePredicateAtom )
( declare AtBasic_InequalityAtom )
( declare AtBasic_EqualityAtom )
( declare AtBasic_ObjectClassificationAtom )
( declare AtBasic_GenericAtom )
( declare Atoms_DataAtom )
( declare Atoms_ObjectAtom )
( declare AtRelational_Slot )
( declare AtRelational_PropertyAtom )
( declare AtRelational_DataSlot )
( declare AtRelational_ObjectSlot )
( declare AtRelational_ReferencePropertyAtom )
( declare AtRelational_AttributionAtom )
( declare AtRelational_ObjectDescriptionAtom )
( declare AtRelational_AssociationAtom )
( declare Atoms_Atom )
( declare VocFunctional_DatatypeFunction )
( declare VocFunctional_GenericFunction )
( declare VocFunctional_Function )
( declare VocFunctional_DataOperation )
( declare VocFunctional_ObjectOperation )
( declare VocFunctional_Operation )
( declare VocFunctional_EnumerationDatatype )
( declare VocBuiltin_ExternalVocabulary )
( declare VocBasic_GenericEntityName )
( declare VocBasic_VocabularyEntry )
( declare VocBasic_Vocabulary )
( declare VocBasic_Property )
( declare VocBasic_DatatypePredicate )
( declare VocBasic_Predicate )
( declare VocBasic_Attribute )
( declare VocBasic_TypedLiteral )
( declare VocBasic_PlainLiteral )
( declare VocBasic_DataLiteral )
( declare VocBasic_ReferenceProperty )
( declare VocBasic_ObjectName )
( declare VocBasic_Datatype )
( declare VocBasic_Class )
( declare VocBasic_Type )
( declare VocRelational_AssociationPredicate )
( declare VocRelational_GenericPredicate )
( declare R2ML_ReactionRuleSet )
( declare R2ML_ProductionRuleSet )
( declare R2ML_EventType )
( declare Events_SOAPMessageBody )
( declare Events_SOAPConversationalMsgEvtExpression )
( declare Events_SOAPRPCResponseMsgEvtExpression )
( declare Events_SOAPRPCRequestMsgEvtExpression )
( declare Events_SOAPMessageHeaderBlock )
( declare Events_SOAPMessageHeader )
( declare Events_SOAPMessageBodyChild )
( declare Events_EveryYearTimeEventExpression )
( declare Events_EveryMonthTimeEventExpression )
( declare Events_EveryWeekTimeEventExpression )
( declare Events_EveryDayTimeEventExpression )
( declare Events_EveryHourTimeEventExpression )
( declare Events_EveryMinuteTimeEventExpression )
( declare Events_MessageEventExpression )
( declare Events_SOAPMessageEventExpression )
( declare Events_PeriodicTimeEventExpression )
( declare Events_SingularTimeEventExpression )
( declare Events_ActionEventExpression )
( declare Events_TimeEventExpression )
( declare Events_ParallelEventExpression )
( declare Events_SequenceEventExpression )
( declare Events_ChoiceEventExpression )
( declare Events_AtomicEventExpression )
( declare Events_AndNotEventExpression )
( declare Events_EventExpression )
( declare Actions_InvokeActionExpression )
( declare Actions_SOAPRPCAction )
( declare Actions_SOAPAction )
( declare Actions_DeleteActionExpression )
( declare Actions_CreateActionExpression )
( declare Actions_AssignActionExpression )
( declare Actions_MessageAction )
( declare Actions_ActionExpression )
( declare Formulas_AtLeastAndAtMostQuantifiedFormula )
( declare Formulas_AtMostQuantifiedFormula )
( declare Formulas_AtLeastQuantifiedFormula )
( declare qf_QFStrongNegation )
( declare qf_QFNegationAsFailure )
( declare qf_QFNegation )
( declare qf_LiteralConjunction )
( declare qf_QFDisjunction )
( declare qf_QFConjunction )
( declare qf_AndOrNafNegFormula )
( declare Formulas_Conjuction )
( declare Formulas_UniversallyQuantifiedFormula )
( declare Formulas_StrongNegation )
( declare Formulas_QuantifiedFormula )
( declare Formulas_NegationAsFailure )
( declare Formulas_Negation )
( declare Formulas_LogicalFormula )
( declare Formulas_Implication )
( declare Formulas_ExistentiallyQuantifiedFormula )
( declare Formulas_Disjunction )
( declare Variables_Variable )
( declare Variables_ObjectVariable )
( declare Variables_DataVariable )
( declare Variables_GenericVariable )
( declare TerFunctional_DatatypeFunctionTerm )
( declare TerFunctional_DataFunctionTerm )
( declare TerFunctional_AttributeFunctionTerm )
( declare TerFunctional_DataOperationTerm )
( declare TerFunctional_ReferencePropertyFunctionTerm )
( declare TerFunctional_ObjectOperationTerm )
( declare TerFunctional_GenericFunctionTerm )
( declare Terms_GenericTerm )
( declare Terms_Term )
( declare Terms_ObjectTerm )
( declare Terms_DataTerm )
( declare R2ML_RuleSet )
( declare R2ML_RuleBase )
( declare R2ML_IntegrityRuleSet )
( declare R2ML_DerivationRuleSet )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Long )
( declare PrimitiveTypes_Float )
( declare PrimitiveTypes_Double )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_String )
( def R2ML ( struct-map
	KM3_Package
	:contents[( def CollectionTypes ( :literals[( struct-map
		KM3_EnumLiteral
		:name "individual"
		:location "12:3-12:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "set"
		:location "13:3-13:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "orderedSet"
		:location "14:3-14:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "bag"
		:location "15:3-15:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "sequence"
		:location "16:3-16:20"
	)] ) ) ( def PredicateCategory ( :literals[( struct-map
		KM3_EnumLiteral
		:name "closed"
		:location "20:3-20:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "open"
		:location "21:3-21:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "partial"
		:location "22:3-22:19"
	)] ) ) ( def ExternalVocabularyLanguage ( :literals[( struct-map
		KM3_EnumLiteral
		:name "RDFS"
		:location "26:3-26:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "UML"
		:location "27:3-27:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "OWL"
		:location "28:3-28:15"
	)] ) ) ( def PredicateType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ObjectClassificationPredicate"
		:location "32:3-32:41"
	) ( struct-map
		KM3_EnumLiteral
		:name "AttributionPredicate"
		:location "33:3-33:32"
	) ( struct-map
		KM3_EnumLiteral
		:name "AssociationPredicate"
		:location "34:3-34:32"
	) ( struct-map
		KM3_EnumLiteral
		:name "ReferencePropertyPredicate"
		:location "35:3-35:38"
	) ( struct-map
		KM3_EnumLiteral
		:name "EqualityPredicate"
		:location "36:3-36:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "InequalityPredicate"
		:location "37:3-37:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "DatatypePredicate"
		:location "38:3-38:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "DataClassificationPredicate"
		:location "39:3-39:39"
	)] ) ) ( def Abstract ( struct-map
		KM3_Package
		:contents[( def Abstract_AbstractTransformationRule ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[Abstract_Rule]
			:structuralFeatures[]
		) ) ( def Abstract_AbstractProductionRule ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Abstract_Rule]
			:structuralFeatures[]
		) ) ( def Abstract_AbstractReactionRule ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Abstract_Rule]
			:structuralFeatures[]
		) ) ( def Abstract_AbstractDerivationRule ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Abstract_Rule]
			:structuralFeatures[]
		) ) ( def Abstract_AbstractIntegrityRule ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[Abstract_Rule]
			:structuralFeatures[]
		) ) ( def Abstract_Rule ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "ruleID"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Abstract_Rule
				:type String
				:location "65:4-65:30"
			)]
		) )]
	) ) ( def Rules ( struct-map
		KM3_Package
		:contents[( def Rules_DerivationRule ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Abstract_AbstractDerivationRule]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "conditions"
				:upper -1
				:lower 1
				:isOrdered false
				:owner Rules_DerivationRule
				:type qf_AndOrNafNegFormula
				:location "72:4-72:61"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "conclusions"
				:upper -1
				:lower 1
				:isOrdered false
				:owner Rules_DerivationRule
				:type qf_LiteralConjunction
				:location "73:4-73:62"
				:isContainer true
			)]
		) ) ( def Rules_ReactionRule ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Abstract_AbstractReactionRule]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "conditions"
				:upper -1
				:lower 0
				:isOrdered false
				:owner Rules_ReactionRule
				:type qf_AndOrNafNegFormula
				:location "77:4-77:59"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "producedAction"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Rules_ReactionRule
				:type Actions_ActionExpression
				:location "78:4-78:58"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "postconditon"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Rules_ReactionRule
				:type qf_AndOrNafNegFormula
				:location "79:4-79:63"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "triggeringEvent"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Rules_ReactionRule
				:type Events_EventExpression
				:location "80:4-80:58"
				:isContainer true
			)]
		) ) ( def Rules_ProductionRule ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Abstract_AbstractProductionRule]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "conditions"
				:upper -1
				:lower 1
				:isOrdered false
				:owner Rules_ProductionRule
				:type qf_AndOrNafNegFormula
				:location "84:4-84:51"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "postcondition"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Rules_ProductionRule
				:type qf_AndOrNafNegFormula
				:location "85:4-85:54"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "producedAction"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Rules_ProductionRule
				:type Actions_ActionExpression
				:location "86:4-86:48"
				:isContainer false
			)]
		) ) ( def Rules_DeonticIntegrityRule ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Rules_IntegrityRule]
			:structuralFeatures[]
		) ) ( def Rules_AlethicIntegrityRule ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Rules_IntegrityRule]
			:structuralFeatures[]
		) ) ( def Rules_IntegrityRule ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[Abstract_AbstractIntegrityRule]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "constraint"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Rules_IntegrityRule
				:type Formulas_QuantifiedFormula
				:location "98:4-98:45"
				:isContainer false
			)]
		) )]
	) ) ( def Atoms ( struct-map
		KM3_Package
		:contents[( def AtBasic ( struct-map
			KM3_Package
			:contents[( def AtBasic_DataClassificationAtom ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[Atoms_DataAtom]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "type"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtBasic_DataClassificationAtom
					:type VocBasic_Datatype
					:location "107:5-107:31"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "term"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtBasic_DataClassificationAtom
					:type Terms_DataTerm
					:location "108:5-108:31"
					:isContainer false
				)]
			) ) ( def AtBasic_DatatypePredicateAtom ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[Atoms_DataAtom]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "predicate"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtBasic_DatatypePredicateAtom
					:type VocBasic_DatatypePredicate
					:location "112:5-112:45"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "dataArguments"
					:upper -1
					:lower 2
					:isOrdered true
					:owner AtBasic_DatatypePredicateAtom
					:type Terms_DataTerm
					:location "113:5-113:53"
					:isContainer false
				)]
			) ) ( def AtBasic_InequalityAtom ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[Atoms_ObjectAtom]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "terms"
					:upper -1
					:lower 2
					:isOrdered false
					:owner AtBasic_InequalityAtom
					:type Terms_ObjectTerm
					:location "117:5-117:39"
					:isContainer false
				)]
			) ) ( def AtBasic_EqualityAtom ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[Atoms_ObjectAtom]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "terms"
					:upper -1
					:lower 2
					:isOrdered false
					:owner AtBasic_EqualityAtom
					:type Terms_ObjectTerm
					:location "121:5-121:39"
					:isContainer false
				)]
			) ) ( def AtBasic_ObjectClassificationAtom ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[Atoms_ObjectAtom]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "term"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtBasic_ObjectClassificationAtom
					:type Terms_ObjectTerm
					:location "125:5-125:33"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "type"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtBasic_ObjectClassificationAtom
					:type VocBasic_Class
					:location "126:5-126:28"
					:isContainer false
				)]
			) ) ( def AtBasic_GenericAtom ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[Atoms_Atom]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "predicate"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtBasic_GenericAtom
					:type VocRelational_GenericPredicate
					:location "130:5-130:44"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "arguments"
					:upper -1
					:lower 0
					:isOrdered true
					:owner AtBasic_GenericAtom
					:type Terms_Term
					:location "131:5-131:43"
					:isContainer false
				)]
			) )]
		) ) ( def Atoms_DataAtom ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[Atoms_Atom]
			:structuralFeatures[]
		) ) ( def Atoms_ObjectAtom ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[Atoms_Atom]
			:structuralFeatures[]
		) ) ( def AtRelational ( struct-map
			KM3_Package
			:contents[( def AtRelational_Slot ( struct-map
				KM3_Class
				:isAbstract true
				:supertypes[]
				:structuralFeatures[]
			) ) ( def AtRelational_PropertyAtom ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[Atoms_ObjectAtom]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "property"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtRelational_PropertyAtom
					:type VocBasic_Property
					:location "150:5-150:35"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "value"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtRelational_PropertyAtom
					:type Terms_Term
					:location "151:5-151:28"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "subject"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtRelational_PropertyAtom
					:type Terms_ObjectTerm
					:location "152:5-152:36"
					:isContainer false
				)]
			) ) ( def AtRelational_DataSlot ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[AtRelational_Slot]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "value"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtRelational_DataSlot
					:type Terms_DataTerm
					:location "156:5-156:32"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "attribute"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtRelational_DataSlot
					:type VocBasic_Attribute
					:location "157:5-157:39"
					:isContainer false
				)]
			) ) ( def AtRelational_ObjectSlot ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[AtRelational_Slot]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "object"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtRelational_ObjectSlot
					:type Terms_ObjectTerm
					:location "161:5-161:35"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "referenceProperty"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtRelational_ObjectSlot
					:type VocBasic_ReferenceProperty
					:location "162:5-162:53"
					:isContainer false
				)]
			) ) ( def AtRelational_ReferencePropertyAtom ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[Atoms_ObjectAtom]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "object"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtRelational_ReferencePropertyAtom
					:type Terms_ObjectTerm
					:location "166:5-166:35"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "referenceProperty"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtRelational_ReferencePropertyAtom
					:type VocBasic_ReferenceProperty
					:location "167:5-167:53"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "subject"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtRelational_ReferencePropertyAtom
					:type Terms_ObjectTerm
					:location "168:5-168:36"
					:isContainer false
				)]
			) ) ( def AtRelational_AttributionAtom ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[Atoms_ObjectAtom]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "attribute"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtRelational_AttributionAtom
					:type VocBasic_Attribute
					:location "172:5-172:39"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "subject"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtRelational_AttributionAtom
					:type Terms_ObjectTerm
					:location "173:5-173:36"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "dataValue"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtRelational_AttributionAtom
					:type Terms_DataTerm
					:location "174:5-174:36"
					:isContainer false
				)]
			) ) ( def AtRelational_ObjectDescriptionAtom ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[Atoms_ObjectAtom]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "type"
					:upper -1
					:lower 0
					:isOrdered false
					:owner AtRelational_ObjectDescriptionAtom
					:type VocBasic_Class
					:location "178:5-178:31"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "objects"
					:upper -1
					:lower 0
					:isOrdered false
					:owner AtRelational_ObjectDescriptionAtom
					:type AtRelational_ObjectSlot
					:location "179:5-179:49"
					:isContainer true
				) ( struct-map
					KM3_Reference
					:name "subject"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtRelational_ObjectDescriptionAtom
					:type Terms_ObjectTerm
					:location "180:5-180:36"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "slots"
					:upper -1
					:lower 0
					:isOrdered false
					:owner AtRelational_ObjectDescriptionAtom
					:type AtRelational_Slot
					:location "181:5-181:41"
					:isContainer true
				) ( struct-map
					KM3_Reference
					:name "baseType"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtRelational_ObjectDescriptionAtom
					:type VocBasic_Class
					:location "182:5-182:32"
					:isContainer false
				)]
			) ) ( def AtRelational_AssociationAtom ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[Atoms_ObjectAtom]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "associationPredicate"
					:upper 1
					:lower 1
					:isOrdered false
					:owner AtRelational_AssociationAtom
					:type VocRelational_AssociationPredicate
					:location "186:5-186:59"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "dataArguments"
					:upper -1
					:lower 0
					:isOrdered true
					:owner AtRelational_AssociationAtom
					:type Terms_DataTerm
					:location "187:5-187:51"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "objectArguments"
					:upper -1
					:lower 2
					:isOrdered true
					:owner AtRelational_AssociationAtom
					:type Terms_ObjectTerm
					:location "188:5-188:57"
					:isContainer false
				)]
			) )]
		) ) ( def Atoms_Atom ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[Formulas_LogicalFormula qf_AndOrNafNegFormula]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "isNegated"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Atoms_Atom
				:type Boolean
				:location "193:4-193:34"
			)]
		) )]
	) ) ( def Vocabulary ( struct-map
		KM3_Package
		:contents[( def VocExternal ( struct-map
			KM3_Package
			:contents[]
		) ) ( def VocFunctional ( struct-map
			KM3_Package
			:contents[( def VocFunctional_DatatypeFunction ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[VocFunctional_Function]
				:structuralFeatures[( struct-map
					KM3_Attribute
					:name "ap"
					:upper 1
					:lower 0
					:isOrdered false
					:owner VocFunctional_DatatypeFunction
					:type String
					:location "207:5-207:32"
				)]
			) ) ( def VocFunctional_GenericFunction ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[VocFunctional_Function]
				:structuralFeatures[]
			) ) ( def VocFunctional_Function ( struct-map
				KM3_Class
				:isAbstract true
				:supertypes[VocBasic_VocabularyEntry]
				:structuralFeatures[( struct-map
					KM3_Attribute
					:name "arity"
					:upper 1
					:lower 1
					:isOrdered false
					:owner VocFunctional_Function
					:type Integer
					:location "215:5-215:31"
				)]
			) ) ( def VocFunctional_DataOperation ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[VocFunctional_Operation]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "returnType"
					:upper 1
					:lower 0
					:isOrdered false
					:owner VocFunctional_DataOperation
					:type VocBasic_Datatype
					:location "219:5-219:42"
					:isContainer false
				)]
			) ) ( def VocFunctional_ObjectOperation ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[VocFunctional_Operation]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "returnType"
					:upper 1
					:lower 0
					:isOrdered false
					:owner VocFunctional_ObjectOperation
					:type VocBasic_Class
					:location "223:5-223:39"
					:isContainer false
				)]
			) ) ( def VocFunctional_Operation ( struct-map
				KM3_Class
				:isAbstract true
				:supertypes[VocFunctional_Function]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "contextType"
					:upper 1
					:lower 0
					:isOrdered false
					:owner VocFunctional_Operation
					:type VocBasic_Class
					:location "227:5-227:40"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "arguments"
					:upper -1
					:lower 0
					:isOrdered true
					:owner VocFunctional_Operation
					:type VocBasic_Type
					:location "228:5-228:43"
					:isContainer false
				)]
			) ) ( def VocFunctional_EnumerationDatatype ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[VocBasic_Datatype]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "literals"
					:upper -1
					:lower 0
					:isOrdered false
					:owner VocFunctional_EnumerationDatatype
					:type VocBasic_DataLiteral
					:location "232:5-232:51"
					:isContainer true
				)]
			) )]
		) ) ( def VocBuiltin ( struct-map
			KM3_Package
			:contents[( def VocBuiltin_ExternalVocabulary ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[]
				:structuralFeatures[( struct-map
					KM3_Attribute
					:name "externalVocabularyID"
					:upper 1
					:lower 1
					:isOrdered false
					:owner VocBuiltin_ExternalVocabulary
					:type String
					:location "239:5-239:45"
				) ( struct-map
					KM3_Attribute
					:name "externalVocabularyLanguage"
					:upper 1
					:lower 1
					:isOrdered false
					:owner VocBuiltin_ExternalVocabulary
					:type ExternalVocabularyLanguage
					:location "240:5-240:71"
				)]
			) )]
		) ) ( def VocBasic ( struct-map
			KM3_Package
			:contents[( def VocBasic_GenericEntityName ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[Terms_GenericTerm]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "classRef"
					:upper 1
					:lower 0
					:isOrdered false
					:owner VocBasic_GenericEntityName
					:type VocBasic_Class
					:location "247:5-247:37"
					:isContainer false
				)]
			) ) ( def VocBasic_VocabularyEntry ( struct-map
				KM3_Class
				:isAbstract true
				:supertypes[]
				:structuralFeatures[( struct-map
					KM3_Attribute
					:name "name"
					:upper 1
					:lower 1
					:isOrdered false
					:owner VocBasic_VocabularyEntry
					:type String
					:location "251:5-251:29"
				)]
			) ) ( def VocBasic_Vocabulary ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "entries"
					:upper -1
					:lower 1
					:isOrdered false
					:owner VocBasic_Vocabulary
					:type VocBasic_VocabularyEntry
					:location "255:5-255:56"
					:isContainer true
				)]
			) ) ( def VocBasic_Property ( struct-map
				KM3_Class
				:isAbstract true
				:supertypes[VocBasic_Predicate]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "range"
					:upper 1
					:lower 0
					:isOrdered false
					:owner VocBasic_Property
					:type VocBasic_Type
					:location "259:5-259:33"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "domain"
					:upper 1
					:lower 0
					:isOrdered false
					:owner VocBasic_Property
					:type VocBasic_Class
					:location "260:5-260:35"
					:isContainer false
				)]
			) ) ( def VocBasic_DatatypePredicate ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[VocBasic_Predicate]
				:structuralFeatures[( struct-map
					KM3_Attribute
					:name "vp"
					:upper 1
					:lower 0
					:isOrdered false
					:owner VocBasic_DatatypePredicate
					:type String
					:location "264:5-264:32"
				) ( struct-map
					KM3_Attribute
					:name "arity"
					:upper 1
					:lower 1
					:isOrdered false
					:owner VocBasic_DatatypePredicate
					:type Integer
					:location "265:5-265:31"
				)]
			) ) ( def VocBasic_Predicate ( struct-map
				KM3_Class
				:isAbstract true
				:supertypes[VocBasic_VocabularyEntry]
				:structuralFeatures[( struct-map
					KM3_Attribute
					:name "predicateCategory"
					:upper 1
					:lower 0
					:isOrdered false
					:owner VocBasic_Predicate
					:type PredicateCategory
					:location "269:5-269:58"
				)]
			) ) ( def VocBasic_Attribute ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[VocBasic_Property]
				:structuralFeatures[( struct-map
					KM3_Attribute
					:name "np"
					:upper 1
					:lower 0
					:isOrdered false
					:owner VocBasic_Attribute
					:type String
					:location "274:5-274:32"
				) ( struct-map
					KM3_Reference
					:name "type"
					:upper 1
					:lower 0
					:isOrdered false
					:owner VocBasic_Attribute
					:type VocBasic_Class
					:location "273:5-273:33"
					:isContainer false
				)]
			) ) ( def VocBasic_TypedLiteral ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[VocBasic_DataLiteral]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "type"
					:upper 1
					:lower 1
					:isOrdered false
					:owner VocBasic_TypedLiteral
					:type VocBasic_Datatype
					:location "278:5-278:31"
					:isContainer false
				)]
			) ) ( def VocBasic_PlainLiteral ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[VocBasic_DataLiteral]
				:structuralFeatures[( struct-map
					KM3_Attribute
					:name "languageTag"
					:upper 1
					:lower 0
					:isOrdered false
					:owner VocBasic_PlainLiteral
					:type String
					:location "282:5-282:41"
				)]
			) ) ( def VocBasic_DataLiteral ( struct-map
				KM3_Class
				:isAbstract true
				:supertypes[Terms_DataTerm]
				:structuralFeatures[( struct-map
					KM3_Attribute
					:name "lexicalValue"
					:upper 1
					:lower 1
					:isOrdered false
					:owner VocBasic_DataLiteral
					:type String
					:location "286:5-286:37"
				)]
			) ) ( def VocBasic_ReferenceProperty ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[VocBasic_Property]
				:structuralFeatures[( struct-map
					KM3_Attribute
					:name "vp"
					:upper 1
					:lower 0
					:isOrdered false
					:owner VocBasic_ReferenceProperty
					:type String
					:location "290:5-290:32"
				) ( struct-map
					KM3_Attribute
					:name "domrm"
					:upper 1
					:lower 0
					:isOrdered false
					:owner VocBasic_ReferenceProperty
					:type String
					:location "291:5-291:35"
				) ( struct-map
					KM3_Attribute
					:name "rgrn"
					:upper 1
					:lower 0
					:isOrdered false
					:owner VocBasic_ReferenceProperty
					:type String
					:location "292:5-292:34"
				)]
			) ) ( def VocBasic_ObjectName ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[VocBasic_VocabularyEntry Terms_ObjectTerm]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "classRef"
					:upper 1
					:lower 0
					:isOrdered false
					:owner VocBasic_ObjectName
					:type VocBasic_Class
					:location "296:5-296:37"
					:isContainer false
				)]
			) ) ( def VocBasic_Datatype ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[VocBasic_Type]
				:structuralFeatures[]
			) ) ( def VocBasic_Class ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[VocBasic_Type]
				:structuralFeatures[( struct-map
					KM3_Attribute
					:name "np"
					:upper 1
					:lower 0
					:isOrdered false
					:owner VocBasic_Class
					:type String
					:location "304:5-304:32"
				)]
			) ) ( def VocBasic_Type ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[VocBasic_Predicate]
				:structuralFeatures[]
			) )]
		) ) ( def VocRelational ( struct-map
			KM3_Package
			:contents[( def VocRelational_AssociationPredicate ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[VocBasic_Predicate]
				:structuralFeatures[( struct-map
					KM3_Attribute
					:name "vp"
					:upper 1
					:lower 0
					:isOrdered false
					:owner VocRelational_AssociationPredicate
					:type String
					:location "316:5-316:32"
				) ( struct-map
					KM3_Reference
					:name "arguments"
					:upper -1
					:lower 0
					:isOrdered true
					:owner VocRelational_AssociationPredicate
					:type VocBasic_Type
					:location "315:5-315:43"
					:isContainer false
				)]
			) ) ( def VocRelational_GenericPredicate ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[VocBasic_Predicate]
				:structuralFeatures[( struct-map
					KM3_Attribute
					:name "vp"
					:upper 1
					:lower 0
					:isOrdered false
					:owner VocRelational_GenericPredicate
					:type String
					:location "320:5-320:32"
				)]
			) )]
		) )]
	) ) ( def R2ML_ReactionRuleSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[R2ML_RuleSet]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rules"
			:upper -1
			:lower 0
			:isOrdered false
			:owner R2ML_ReactionRuleSet
			:type Rules_ReactionRule
			:location "326:3-326:47"
			:isContainer true
		)]
	) ) ( def R2ML_ProductionRuleSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[R2ML_RuleSet]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rules"
			:upper -1
			:lower 0
			:isOrdered false
			:owner R2ML_ProductionRuleSet
			:type Rules_ProductionRule
			:location "330:3-330:49"
			:isContainer true
		)]
	) ) ( def R2ML_EventType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "eventTypeID"
			:upper 1
			:lower 1
			:isOrdered false
			:owner R2ML_EventType
			:type String
			:location "334:3-334:34"
		)]
	) ) ( def Events ( struct-map
		KM3_Package
		:contents[( def Events_SOAPMessageBody ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "children"
				:upper -1
				:lower 0
				:isOrdered false
				:owner Events_SOAPMessageBody
				:type Events_SOAPMessageBodyChild
				:location "340:4-340:59"
				:isContainer true
			)]
		) ) ( def Events_SOAPConversationalMsgEvtExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Events_SOAPMessageEventExpression]
			:structuralFeatures[]
		) ) ( def Events_SOAPRPCResponseMsgEvtExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Events_SOAPMessageEventExpression]
			:structuralFeatures[]
		) ) ( def Events_SOAPRPCRequestMsgEvtExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Events_SOAPMessageEventExpression]
			:structuralFeatures[]
		) ) ( def Events_SOAPMessageHeaderBlock ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "nameSpaceName"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_SOAPMessageHeaderBlock
				:type String
				:location "356:4-356:37"
			) ( struct-map
				KM3_Attribute
				:name "localName"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_SOAPMessageHeaderBlock
				:type String
				:location "357:4-357:33"
			) ( struct-map
				KM3_Attribute
				:name "encodingStyle"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Events_SOAPMessageHeaderBlock
				:type String
				:location "358:4-358:42"
			) ( struct-map
				KM3_Attribute
				:name "mustUnderstand"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Events_SOAPMessageHeaderBlock
				:type Boolean
				:location "359:4-359:44"
			) ( struct-map
				KM3_Attribute
				:name "role"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Events_SOAPMessageHeaderBlock
				:type String
				:location "360:4-360:33"
			) ( struct-map
				KM3_Attribute
				:name "relay"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Events_SOAPMessageHeaderBlock
				:type Boolean
				:location "361:4-361:35"
			)]
		) ) ( def Events_SOAPMessageHeader ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "headerBlocks"
				:upper -1
				:lower 0
				:isOrdered false
				:owner Events_SOAPMessageHeader
				:type Events_SOAPMessageHeaderBlock
				:location "365:4-365:65"
				:isContainer true
			)]
		) ) ( def Events_SOAPMessageBodyChild ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "localName"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_SOAPMessageBodyChild
				:type String
				:location "369:4-369:33"
			) ( struct-map
				KM3_Attribute
				:name "nameSpaceName"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Events_SOAPMessageBodyChild
				:type String
				:location "370:4-370:42"
			) ( struct-map
				KM3_Attribute
				:name "encodingStyle"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Events_SOAPMessageBodyChild
				:type String
				:location "371:4-371:42"
			)]
		) ) ( def Events_EveryYearTimeEventExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Events_PeriodicTimeEventExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "dayOfYear"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_EveryYearTimeEventExpression
				:type Integer
				:location "375:4-375:34"
			) ( struct-map
				KM3_Attribute
				:name "time"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Events_EveryYearTimeEventExpression
				:type String
				:location "376:4-376:33"
			)]
		) ) ( def Events_EveryMonthTimeEventExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Events_PeriodicTimeEventExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "dayOfMonth"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_EveryMonthTimeEventExpression
				:type Integer
				:location "380:4-380:35"
			) ( struct-map
				KM3_Attribute
				:name "time"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Events_EveryMonthTimeEventExpression
				:type String
				:location "381:4-381:33"
			)]
		) ) ( def Events_EveryWeekTimeEventExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Events_PeriodicTimeEventExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "dayOfWeek"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_EveryWeekTimeEventExpression
				:type Integer
				:location "385:4-385:34"
			) ( struct-map
				KM3_Attribute
				:name "time"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_EveryWeekTimeEventExpression
				:type String
				:location "386:4-386:28"
			)]
		) ) ( def Events_EveryDayTimeEventExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Events_PeriodicTimeEventExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "time"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_EveryDayTimeEventExpression
				:type String
				:location "390:4-390:28"
			)]
		) ) ( def Events_EveryHourTimeEventExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Events_PeriodicTimeEventExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "minute"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_EveryHourTimeEventExpression
				:type Integer
				:location "394:4-394:31"
			) ( struct-map
				KM3_Attribute
				:name "second"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Events_EveryHourTimeEventExpression
				:type Integer
				:location "395:4-395:36"
			)]
		) ) ( def Events_EveryMinuteTimeEventExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Events_PeriodicTimeEventExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "second"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_EveryMinuteTimeEventExpression
				:type Integer
				:location "399:4-399:31"
			)]
		) ) ( def Events_MessageEventExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Events_ActionEventExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "sender"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_MessageEventExpression
				:type String
				:location "403:4-403:30"
			) ( struct-map
				KM3_Attribute
				:name "receiver"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_MessageEventExpression
				:type String
				:location "404:4-404:32"
			)]
		) ) ( def Events_SOAPMessageEventExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Events_MessageEventExpression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "body"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_SOAPMessageEventExpression
				:type Events_SOAPMessageBody
				:location "408:4-408:47"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "header"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Events_SOAPMessageEventExpression
				:type Events_SOAPMessageHeader
				:location "409:4-409:56"
				:isContainer true
			)]
		) ) ( def Events_PeriodicTimeEventExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Events_TimeEventExpression]
			:structuralFeatures[]
		) ) ( def Events_SingularTimeEventExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Events_TimeEventExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "dateTime"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_SingularTimeEventExpression
				:type Integer
				:location "417:4-417:33"
			)]
		) ) ( def Events_ActionEventExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Events_AtomicEventExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "actor"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_ActionEventExpression
				:type String
				:location "421:4-421:29"
			)]
		) ) ( def Events_TimeEventExpression ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[Events_AtomicEventExpression]
			:structuralFeatures[]
		) ) ( def Events_ParallelEventExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Events_EventExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "timeWindow"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_ParallelEventExpression
				:type String
				:location "430:4-430:34"
			) ( struct-map
				KM3_Reference
				:name "expressions"
				:upper -1
				:lower 0
				:isOrdered false
				:owner Events_ParallelEventExpression
				:type Events_EventExpression
				:location "429:4-429:57"
				:isContainer true
			)]
		) ) ( def Events_SequenceEventExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Events_EventExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "timeWindow"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_SequenceEventExpression
				:type Integer
				:location "435:4-435:35"
			) ( struct-map
				KM3_Reference
				:name "expressions"
				:upper -1
				:lower 0
				:isOrdered true
				:owner Events_SequenceEventExpression
				:type Events_EventExpression
				:location "434:4-434:65"
				:isContainer true
			)]
		) ) ( def Events_ChoiceEventExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Events_EventExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "minOccurs"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_ChoiceEventExpression
				:type Integer
				:location "440:4-440:34"
			) ( struct-map
				KM3_Attribute
				:name "maxOccurs"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_ChoiceEventExpression
				:type Integer
				:location "441:4-441:34"
			) ( struct-map
				KM3_Attribute
				:name "timeWindow"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_ChoiceEventExpression
				:type String
				:location "442:4-442:34"
			) ( struct-map
				KM3_Reference
				:name "expressions"
				:upper -1
				:lower 1
				:isOrdered false
				:owner Events_ChoiceEventExpression
				:type Events_EventExpression
				:location "439:4-439:59"
				:isContainer true
			)]
		) ) ( def Events_AtomicEventExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Events_EventExpression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "arguments"
				:upper -1
				:lower 0
				:isOrdered false
				:owner Events_AtomicEventExpression
				:type Terms_Term
				:location "446:4-446:44"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "type"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_AtomicEventExpression
				:type R2ML_EventType
				:location "447:4-447:31"
				:isContainer false
			)]
		) ) ( def Events_AndNotEventExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Events_EventExpression]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "timeWndow"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_AndNotEventExpression
				:type String
				:location "452:4-452:33"
			) ( struct-map
				KM3_Reference
				:name "expressions"
				:upper -1
				:lower 0
				:isOrdered true
				:owner Events_AndNotEventExpression
				:type Events_EventExpression
				:location "451:4-451:65"
				:isContainer true
			)]
		) ) ( def Events_EventExpression ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "startDateTime"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_EventExpression
				:type String
				:location "456:4-456:37"
			) ( struct-map
				KM3_Attribute
				:name "duration"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_EventExpression
				:type String
				:location "457:4-457:32"
			) ( struct-map
				KM3_Attribute
				:name "occurDateTime"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Events_EventExpression
				:type String
				:location "458:4-458:37"
			)]
		) )]
	) ) ( def Actions ( struct-map
		KM3_Package
		:contents[( def Actions_InvokeActionExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Actions_ActionExpression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "operation"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Actions_InvokeActionExpression
				:type VocFunctional_Operation
				:location "465:4-465:38"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "arguments"
				:upper -1
				:lower 0
				:isOrdered true
				:owner Actions_InvokeActionExpression
				:type Terms_Term
				:location "466:4-466:42"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "contextArgument"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Actions_InvokeActionExpression
				:type Terms_ObjectTerm
				:location "467:4-467:48"
				:isContainer false
			)]
		) ) ( def Actions_SOAPRPCAction ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Actions_SOAPAction]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "arguments"
				:upper -1
				:lower 0
				:isOrdered true
				:owner Actions_SOAPRPCAction
				:type Terms_Term
				:location "471:4-471:42"
				:isContainer false
			)]
		) ) ( def Actions_SOAPAction ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Actions_MessageAction]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "operation"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Actions_SOAPAction
				:type VocFunctional_Operation
				:location "475:4-475:38"
				:isContainer false
			)]
		) ) ( def Actions_DeleteActionExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Actions_ActionExpression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "contextArgument"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Actions_DeleteActionExpression
				:type Terms_ObjectTerm
				:location "479:4-479:43"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "context"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Actions_DeleteActionExpression
				:type VocBasic_Class
				:location "480:4-480:30"
				:isContainer false
			)]
		) ) ( def Actions_CreateActionExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Actions_ActionExpression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "slots"
				:upper -1
				:lower 0
				:isOrdered false
				:owner Actions_CreateActionExpression
				:type AtRelational_Slot
				:location "484:4-484:30"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "context"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Actions_CreateActionExpression
				:type VocBasic_Class
				:location "485:4-485:30"
				:isContainer false
			)]
		) ) ( def Actions_AssignActionExpression ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Actions_ActionExpression]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "contextArgument"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Actions_AssignActionExpression
				:type Terms_ObjectTerm
				:location "489:4-489:43"
				:isContainer false
			) ( struct-map
				KM3_Reference
				:name "property"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Actions_AssignActionExpression
				:type VocBasic_Property
				:location "490:4-490:34"
				:isContainer false
			)]
		) ) ( def Actions_MessageAction ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Actions_ActionExpression]
			:structuralFeatures[]
		) ) ( def Actions_ActionExpression ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[]
		) )]
	) ) ( def Formulas ( struct-map
		KM3_Package
		:contents[( def Formulas_AtLeastAndAtMostQuantifiedFormula ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Formulas_QuantifiedFormula]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "maxCardinality"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Formulas_AtLeastAndAtMostQuantifiedFormula
				:type Integer
				:location "505:4-505:39"
			) ( struct-map
				KM3_Attribute
				:name "minCardinality"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Formulas_AtLeastAndAtMostQuantifiedFormula
				:type Integer
				:location "506:4-506:39"
			)]
		) ) ( def Formulas_AtMostQuantifiedFormula ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Formulas_QuantifiedFormula]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "maxCardinality"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Formulas_AtMostQuantifiedFormula
				:type Integer
				:location "510:4-510:39"
			)]
		) ) ( def Formulas_AtLeastQuantifiedFormula ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Formulas_QuantifiedFormula]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "minCardinality"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Formulas_AtLeastQuantifiedFormula
				:type Integer
				:location "514:4-514:39"
			)]
		) ) ( def qf ( struct-map
			KM3_Package
			:contents[( def qf_QFStrongNegation ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[qf_QFNegation]
				:structuralFeatures[]
			) ) ( def qf_QFNegationAsFailure ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[qf_QFNegation]
				:structuralFeatures[]
			) ) ( def qf_QFNegation ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[qf_AndOrNafNegFormula]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "formula"
					:upper 1
					:lower 1
					:isOrdered false
					:owner qf_QFNegation
					:type qf_AndOrNafNegFormula
					:location "528:5-528:54"
					:isContainer true
				)]
			) ) ( def qf_LiteralConjunction ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "atoms"
					:upper -1
					:lower 1
					:isOrdered false
					:owner qf_LiteralConjunction
					:type Atoms_Atom
					:location "532:5-532:43"
					:isContainer true
				)]
			) ) ( def qf_QFDisjunction ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[qf_AndOrNafNegFormula]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "formulas"
					:upper -1
					:lower 2
					:isOrdered false
					:owner qf_QFDisjunction
					:type qf_AndOrNafNegFormula
					:location "536:5-536:60"
					:isContainer true
				)]
			) ) ( def qf_QFConjunction ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[qf_AndOrNafNegFormula]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "formulas"
					:upper -1
					:lower 2
					:isOrdered false
					:owner qf_QFConjunction
					:type qf_AndOrNafNegFormula
					:location "540:5-540:60"
					:isContainer true
				)]
			) ) ( def qf_AndOrNafNegFormula ( struct-map
				KM3_Class
				:isAbstract true
				:supertypes[]
				:structuralFeatures[]
			) )]
		) ) ( def Formulas_Conjuction ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Formulas_LogicalFormula]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "formulas"
				:upper -1
				:lower 2
				:isOrdered false
				:owner Formulas_Conjuction
				:type Formulas_LogicalFormula
				:location "549:4-549:55"
				:isContainer true
			)]
		) ) ( def Formulas_UniversallyQuantifiedFormula ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Formulas_QuantifiedFormula]
			:structuralFeatures[]
		) ) ( def Formulas_StrongNegation ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Formulas_Negation Formulas_LogicalFormula]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "formula"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Formulas_StrongNegation
				:type Formulas_LogicalFormula
				:location "557:4-557:49"
				:isContainer true
			)]
		) ) ( def Formulas_QuantifiedFormula ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[Formulas_LogicalFormula]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "formula"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Formulas_QuantifiedFormula
				:type Formulas_LogicalFormula
				:location "561:4-561:49"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "variables"
				:upper -1
				:lower 1
				:isOrdered false
				:owner Formulas_QuantifiedFormula
				:type Variables_Variable
				:location "562:4-562:40"
				:isContainer false
			)]
		) ) ( def Formulas_NegationAsFailure ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Formulas_Negation Formulas_LogicalFormula]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "formula"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Formulas_NegationAsFailure
				:type Formulas_LogicalFormula
				:location "566:4-566:49"
				:isContainer true
			)]
		) ) ( def Formulas_Negation ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[]
			:structuralFeatures[]
		) ) ( def Formulas_LogicalFormula ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[]
		) ) ( def Formulas_Implication ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Formulas_LogicalFormula]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "consequent"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Formulas_Implication
				:type Formulas_LogicalFormula
				:location "578:4-578:52"
				:isContainer true
			) ( struct-map
				KM3_Reference
				:name "antecedent"
				:upper 1
				:lower 1
				:isOrdered false
				:owner Formulas_Implication
				:type Formulas_LogicalFormula
				:location "579:4-579:52"
				:isContainer true
			)]
		) ) ( def Formulas_ExistentiallyQuantifiedFormula ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Formulas_QuantifiedFormula]
			:structuralFeatures[]
		) ) ( def Formulas_Disjunction ( struct-map
			KM3_Class
			:isAbstract false
			:supertypes[Formulas_LogicalFormula]
			:structuralFeatures[( struct-map
				KM3_Reference
				:name "formulas"
				:upper -1
				:lower 2
				:isOrdered false
				:owner Formulas_Disjunction
				:type Formulas_LogicalFormula
				:location "587:4-587:55"
				:isContainer true
			)]
		) )]
	) ) ( def Terms ( struct-map
		KM3_Package
		:contents[( def TerBasic ( struct-map
			KM3_Package
			:contents[( def Variables ( struct-map
				KM3_Package
				:contents[( def Variables_Variable ( struct-map
					KM3_Class
					:isAbstract true
					:supertypes[]
					:structuralFeatures[( struct-map
						KM3_Attribute
						:name "name"
						:upper 1
						:lower 1
						:isOrdered false
						:owner Variables_Variable
						:type String
						:location "598:6-598:30"
					)]
				) ) ( def Variables_ObjectVariable ( struct-map
					KM3_Class
					:isAbstract false
					:supertypes[Variables_Variable Terms_ObjectTerm]
					:structuralFeatures[( struct-map
						KM3_Reference
						:name "classRef"
						:upper 1
						:lower 0
						:isOrdered false
						:owner Variables_ObjectVariable
						:type VocBasic_Class
						:location "602:6-602:38"
						:isContainer false
					)]
				) ) ( def Variables_DataVariable ( struct-map
					KM3_Class
					:isAbstract false
					:supertypes[Variables_Variable Terms_DataTerm]
					:structuralFeatures[( struct-map
						KM3_Reference
						:name "datatypeRef"
						:upper 1
						:lower 0
						:isOrdered false
						:owner Variables_DataVariable
						:type VocBasic_Datatype
						:location "606:6-606:44"
						:isContainer false
					)]
				) ) ( def Variables_GenericVariable ( struct-map
					KM3_Class
					:isAbstract false
					:supertypes[Terms_GenericTerm Variables_Variable]
					:structuralFeatures[( struct-map
						KM3_Reference
						:name "typeRef"
						:upper 1
						:lower 0
						:isOrdered false
						:owner Variables_GenericVariable
						:type VocBasic_Type
						:location "610:6-610:36"
						:isContainer false
					)]
				) )]
			) )]
		) ) ( def TerFunctional ( struct-map
			KM3_Package
			:contents[( def TerFunctional_DatatypeFunctionTerm ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[TerFunctional_DataFunctionTerm]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "function"
					:upper 1
					:lower 1
					:isOrdered false
					:owner TerFunctional_DatatypeFunctionTerm
					:type VocFunctional_DatatypeFunction
					:location "618:5-618:43"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "dataArguments"
					:upper -1
					:lower 1
					:isOrdered true
					:owner TerFunctional_DatatypeFunctionTerm
					:type Terms_DataTerm
					:location "619:5-619:53"
					:isContainer false
				)]
			) ) ( def TerFunctional_DataFunctionTerm ( struct-map
				KM3_Class
				:isAbstract true
				:supertypes[Terms_DataTerm]
				:structuralFeatures[]
			) ) ( def TerFunctional_AttributeFunctionTerm ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[TerFunctional_DataFunctionTerm]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "contextArgument"
					:upper 1
					:lower 1
					:isOrdered false
					:owner TerFunctional_AttributeFunctionTerm
					:type Terms_ObjectTerm
					:location "627:5-627:44"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "attribute"
					:upper 1
					:lower 1
					:isOrdered false
					:owner TerFunctional_AttributeFunctionTerm
					:type VocBasic_Attribute
					:location "628:5-628:39"
					:isContainer false
				)]
			) ) ( def TerFunctional_DataOperationTerm ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[TerFunctional_DataFunctionTerm]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "dataOperationRef"
					:upper 1
					:lower 1
					:isOrdered false
					:owner TerFunctional_DataOperationTerm
					:type VocFunctional_DataOperation
					:location "632:5-632:48"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "contextArgument"
					:upper 1
					:lower 0
					:isOrdered false
					:owner TerFunctional_DataOperationTerm
					:type Terms_ObjectTerm
					:location "633:5-633:49"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "arguments"
					:upper -1
					:lower 0
					:isOrdered true
					:owner TerFunctional_DataOperationTerm
					:type Terms_Term
					:location "634:5-634:43"
					:isContainer false
				)]
			) ) ( def TerFunctional_ReferencePropertyFunctionTerm ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[Terms_ObjectTerm]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "contextArgument"
					:upper 1
					:lower 1
					:isOrdered false
					:owner TerFunctional_ReferencePropertyFunctionTerm
					:type Terms_ObjectTerm
					:location "638:5-638:44"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "referencePropertyRef"
					:upper 1
					:lower 1
					:isOrdered false
					:owner TerFunctional_ReferencePropertyFunctionTerm
					:type VocBasic_ReferenceProperty
					:location "639:5-639:56"
					:isContainer false
				)]
			) ) ( def TerFunctional_ObjectOperationTerm ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[Terms_ObjectTerm]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "operation"
					:upper 1
					:lower 1
					:isOrdered false
					:owner TerFunctional_ObjectOperationTerm
					:type VocFunctional_ObjectOperation
					:location "643:5-643:45"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "arguments"
					:upper -1
					:lower 0
					:isOrdered false
					:owner TerFunctional_ObjectOperationTerm
					:type Terms_Term
					:location "644:5-644:35"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "contextArgument"
					:upper 1
					:lower 0
					:isOrdered false
					:owner TerFunctional_ObjectOperationTerm
					:type Terms_ObjectTerm
					:location "645:5-645:49"
					:isContainer false
				)]
			) ) ( def TerFunctional_GenericFunctionTerm ( struct-map
				KM3_Class
				:isAbstract false
				:supertypes[Terms_GenericTerm]
				:structuralFeatures[( struct-map
					KM3_Reference
					:name "arguments"
					:upper -1
					:lower 0
					:isOrdered true
					:owner TerFunctional_GenericFunctionTerm
					:type Terms_GenericTerm
					:location "649:5-649:50"
					:isContainer false
				) ( struct-map
					KM3_Reference
					:name "functor"
					:upper 1
					:lower 1
					:isOrdered false
					:owner TerFunctional_GenericFunctionTerm
					:type VocFunctional_GenericFunction
					:location "650:5-650:41"
					:isContainer false
				)]
			) )]
		) ) ( def Terms_GenericTerm ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[Terms_Term]
			:structuralFeatures[]
		) ) ( def Terms_Term ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[]
			:structuralFeatures[( struct-map
				KM3_Attribute
				:name "typeCategory"
				:upper 1
				:lower 0
				:isOrdered false
				:owner Terms_Term
				:type CollectionTypes
				:location "659:4-659:50"
			)]
		) ) ( def Terms_ObjectTerm ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[Terms_Term]
			:structuralFeatures[]
		) ) ( def Terms_DataTerm ( struct-map
			KM3_Class
			:isAbstract true
			:supertypes[Terms_Term]
			:structuralFeatures[]
		) )]
	) ) ( def R2ML_RuleSet ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "ruleSetID"
			:upper 1
			:lower 0
			:isOrdered false
			:owner R2ML_RuleSet
			:type String
			:location "675:3-675:37"
		) ( struct-map
			KM3_Reference
			:name "variables"
			:upper -1
			:lower 0
			:isOrdered false
			:owner R2ML_RuleSet
			:type Variables_Variable
			:location "672:3-672:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "externalVocabulary"
			:upper 1
			:lower 0
			:isOrdered false
			:owner R2ML_RuleSet
			:type VocBuiltin_ExternalVocabulary
			:location "673:3-673:58"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "vocabularies"
			:upper 1
			:lower 0
			:isOrdered false
			:owner R2ML_RuleSet
			:type VocBasic_Vocabulary
			:location "674:3-674:54"
			:isContainer true
		)]
	) ) ( def R2ML_RuleBase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "ruleBaseID"
			:upper 1
			:lower 1
			:isOrdered false
			:owner R2ML_RuleBase
			:type String
			:location "682:3-682:33"
		) ( struct-map
			KM3_Reference
			:name "vocabularies"
			:upper 1
			:lower 0
			:isOrdered false
			:owner R2ML_RuleBase
			:type VocBasic_Vocabulary
			:location "679:3-679:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "externalVocabulaires"
			:upper -1
			:lower 0
			:isOrdered false
			:owner R2ML_RuleBase
			:type VocBuiltin_ExternalVocabulary
			:location "680:3-680:58"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "rules"
			:upper -1
			:lower 0
			:isOrdered false
			:owner R2ML_RuleBase
			:type R2ML_RuleSet
			:location "681:3-681:42"
			:isContainer true
		)]
	) ) ( def R2ML_IntegrityRuleSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[R2ML_RuleSet]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rules"
			:upper -1
			:lower 0
			:isOrdered false
			:owner R2ML_IntegrityRuleSet
			:type Rules_IntegrityRule
			:location "686:3-686:48"
			:isContainer true
		)]
	) ) ( def R2ML_DerivationRuleSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[R2ML_RuleSet]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rules"
			:upper -1
			:lower 0
			:isOrdered false
			:owner R2ML_DerivationRuleSet
			:type Rules_DerivationRule
			:location "690:3-690:49"
			:isContainer true
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "696:2-696:19"
	) ) ( def ptyp_Long ( struct-map
		KM3_DataType
		:name "Long"
		:location "698:2-698:16"
	) ) ( def ptyp_Float ( struct-map
		KM3_DataType
		:name "Float"
		:location "700:2-700:17"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "702:2-702:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "704:2-704:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "706:2-706:18"
	) )]
) )
