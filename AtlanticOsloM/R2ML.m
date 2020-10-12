module R2ML {

	type CollectionTypes {"individual", "set", "orderedSet", "bag", "sequence"};

	type PredicateCategory {"closed", "open", "partial"};

	type ExternalVocabularyLanguage {"RDFS", "UML", "OWL"};

	type PredicateType {"ObjectClassificationPredicate", "AttributionPredicate", "AssociationPredicate", "ReferencePropertyPredicate", "EqualityPredicate", "InequalityPredicate", "DatatypePredicate", "DataClassificationPredicate"};

	type ReactionRuleSet : RuleSet {
		Rules_ContRef : @[Rules.ReactionRule]*;
	};

	type ProductionRuleSet : RuleSet {
		Rules_ContRef : @[Rules.ProductionRule]*;
	};

	type EventType {
		EventTypeID_Att : Text;
	};

	type RuleSet {
		Variables_Ref : @[Terms.TerBasic.Variables.Variable]*;
		ExternalVocabulary_Ref : @[Vocabulary.VocBuiltin.ExternalVocabulary]?;
		Vocabularies_ContRef : @[Vocabulary.VocBasic.Vocabulary]?;
		RuleSetID_Att : Text;
	};

	type RuleBase {
		Vocabularies_ContRef : @[Vocabulary.VocBasic.Vocabulary]?;
		ExternalVocabulaires_Ref : @[Vocabulary.VocBuiltin.ExternalVocabulary]*;
		Rules_ContRef : RuleSet*;
		RuleBaseID_Att : Text;
	};

	type IntegrityRuleSet : RuleSet {
		Rules_ContRef : @[Rules.IntegrityRule]*;
	};

	type DerivationRuleSet : RuleSet {
		Rules_ContRef : @[Rules.DerivationRule]*;
	};

	type @[Abstract.AbstractTransformationRule] : @[Abstract.Rule];

	type @[Abstract.AbstractProductionRule] : @[Abstract.Rule];

	type @[Abstract.AbstractReactionRule] : @[Abstract.Rule];

	type @[Abstract.AbstractDerivationRule] : @[Abstract.Rule];

	type @[Abstract.AbstractIntegrityRule] : @[Abstract.Rule];

	type @[Abstract.Rule] {
		RuleID_Att : Text;
	};

	type @[Rules.DerivationRule] : @[Abstract.AbstractDerivationRule] {
		Conditions_ContRef : @[Formulas.Qf.AndOrNafNegFormula]+;
		Conclusions_ContRef : @[Formulas.Qf.LiteralConjunction]+;
	};

	type @[Rules.ReactionRule] : @[Abstract.AbstractReactionRule] {
		Conditions_ContRef : @[Formulas.Qf.AndOrNafNegFormula]*;
		ProducedAction_ContRef : @[Actions.ActionExpression];
		Postconditon_ContRef : @[Formulas.Qf.AndOrNafNegFormula]?;
		TriggeringEvent_ContRef : @[Events.EventExpression];
	};

	type @[Rules.ProductionRule] : @[Abstract.AbstractProductionRule] {
		Conditions_Ref : @[Formulas.Qf.AndOrNafNegFormula]+;
		Postcondition_Ref : @[Formulas.Qf.AndOrNafNegFormula]?;
		ProducedAction_Ref : @[Actions.ActionExpression];
	};

	type @[Rules.DeonticIntegrityRule] : @[Rules.IntegrityRule];

	type @[Rules.AlethicIntegrityRule] : @[Rules.IntegrityRule];

	type @[Rules.IntegrityRule] : @[Abstract.AbstractIntegrityRule] {
		Constraint_Ref : @[Formulas.QuantifiedFormula];
	};

	type @[Atoms.DataAtom] : @[Atoms.Atom];

	type @[Atoms.ObjectAtom] : @[Atoms.Atom];

	type @[Atoms.Atom] : @[Formulas.LogicalFormula], @[Formulas.Qf.AndOrNafNegFormula] {
		IsNegated_Att : Logical;
	};

	type @[Atoms.AtBasic.DataClassificationAtom] : @[Atoms.DataAtom] {
		Type_Ref : @[Vocabulary.VocBasic.Datatype];
		Term_Ref : @[Terms.DataTerm];
	};

	type @[Atoms.AtBasic.DatatypePredicateAtom] : @[Atoms.DataAtom] {
		Predicate_Ref : @[Vocabulary.VocBasic.DatatypePredicate];
		DataArguments_Ref : @[Terms.DataTerm]#2 ..;
	};

	type @[Atoms.AtBasic.InequalityAtom] : @[Atoms.ObjectAtom] {
		Terms_Ref : @[Terms.ObjectTerm]#2 ..;
	};

	type @[Atoms.AtBasic.EqualityAtom] : @[Atoms.ObjectAtom] {
		Terms_Ref : @[Terms.ObjectTerm]#2 ..;
	};

	type @[Atoms.AtBasic.ObjectClassificationAtom] : @[Atoms.ObjectAtom] {
		Term_Ref : @[Terms.ObjectTerm];
		Type_Ref : @[Vocabulary.VocBasic.Class];
	};

	type @[Atoms.AtBasic.GenericAtom] : @[Atoms.Atom] {
		Predicate_Ref : @[Vocabulary.VocRelational.GenericPredicate];
		Arguments_Ref : @[Terms.Term]*;
	};

	type @[Atoms.AtRelational.Slot];

	type @[Atoms.AtRelational.PropertyAtom] : @[Atoms.ObjectAtom] {
		Property_Ref : @[Vocabulary.VocBasic.Property];
		Value_Ref : @[Terms.Term];
		Subject_Ref : @[Terms.ObjectTerm];
	};

	type @[Atoms.AtRelational.DataSlot] : @[Atoms.AtRelational.Slot] {
		Value_Ref : @[Terms.DataTerm];
		Attribute_Ref : @[Vocabulary.VocBasic.Attribute];
	};

	type @[Atoms.AtRelational.ObjectSlot] : @[Atoms.AtRelational.Slot] {
		Object_Ref : @[Terms.ObjectTerm];
		ReferenceProperty_Ref : @[Vocabulary.VocBasic.ReferenceProperty];
	};

	type @[Atoms.AtRelational.ReferencePropertyAtom] : @[Atoms.ObjectAtom] {
		Object_Ref : @[Terms.ObjectTerm];
		ReferenceProperty_Ref : @[Vocabulary.VocBasic.ReferenceProperty];
		Subject_Ref : @[Terms.ObjectTerm];
	};

	type @[Atoms.AtRelational.AttributionAtom] : @[Atoms.ObjectAtom] {
		Attribute_Ref : @[Vocabulary.VocBasic.Attribute];
		Subject_Ref : @[Terms.ObjectTerm];
		DataValue_Ref : @[Terms.DataTerm];
	};

	type @[Atoms.AtRelational.ObjectDescriptionAtom] : @[Atoms.ObjectAtom] {
		Type_Ref : @[Vocabulary.VocBasic.Class]*;
		Objects_ContRef : @[Atoms.AtRelational.ObjectSlot]*;
		Subject_Ref : @[Terms.ObjectTerm];
		Slots_ContRef : @[Atoms.AtRelational.Slot]*;
		BaseType_Ref : @[Vocabulary.VocBasic.Class];
	};

	type @[Atoms.AtRelational.AssociationAtom] : @[Atoms.ObjectAtom] {
		AssociationPredicate_Ref : @[Vocabulary.VocRelational.AssociationPredicate];
		DataArguments_Ref : @[Terms.DataTerm]*;
		ObjectArguments_Ref : @[Terms.ObjectTerm]#2 ..;
	};

	type @[Vocabulary.VocFunctional.DatatypeFunction] : @[Vocabulary.VocFunctional.Function] {
		Ap_Att : Text;
	};

	type @[Vocabulary.VocFunctional.GenericFunction] : @[Vocabulary.VocFunctional.Function];

	type @[Vocabulary.VocFunctional.Function] : @[Vocabulary.VocBasic.VocabularyEntry] {
		Arity_Att : Integer32;
	};

	type @[Vocabulary.VocFunctional.DataOperation] : @[Vocabulary.VocFunctional.Operation] {
		ReturnType_Ref : @[Vocabulary.VocBasic.Datatype]?;
	};

	type @[Vocabulary.VocFunctional.ObjectOperation] : @[Vocabulary.VocFunctional.Operation] {
		ReturnType_Ref : @[Vocabulary.VocBasic.Class]?;
	};

	type @[Vocabulary.VocFunctional.Operation] : @[Vocabulary.VocFunctional.Function] {
		ContextType_Ref : @[Vocabulary.VocBasic.Class]?;
		Arguments_Ref : @[Vocabulary.VocBasic.Type]*;
	};

	type @[Vocabulary.VocFunctional.EnumerationDatatype] : @[Vocabulary.VocBasic.Datatype] {
		Literals_ContRef : @[Vocabulary.VocBasic.DataLiteral]*;
	};

	type @[Vocabulary.VocBuiltin.ExternalVocabulary] {
		ExternalVocabularyID_Att : Text;
		ExternalVocabularyLanguage_Att : ExternalVocabularyLanguage;
	};

	type @[Vocabulary.VocBasic.GenericEntityName] : @[Terms.GenericTerm] {
		ClassRef_Ref : @[Vocabulary.VocBasic.Class]?;
	};

	type @[Vocabulary.VocBasic.VocabularyEntry] {
		Name_Att : Text;
	};

	type @[Vocabulary.VocBasic.Vocabulary] {
		Entries_ContRef : @[Vocabulary.VocBasic.VocabularyEntry]+;
	};

	type @[Vocabulary.VocBasic.Property] : @[Vocabulary.VocBasic.Predicate] {
		Range_Ref : @[Vocabulary.VocBasic.Type]?;
		Domain_Ref : @[Vocabulary.VocBasic.Class]?;
	};

	type @[Vocabulary.VocBasic.DatatypePredicate] : @[Vocabulary.VocBasic.Predicate] {
		Vp_Att : Text;
		Arity_Att : Integer32;
	};

	type @[Vocabulary.VocBasic.Predicate] : @[Vocabulary.VocBasic.VocabularyEntry] {
		PredicateCategory_Att : PredicateCategory?;
	};

	type @[Vocabulary.VocBasic.Attribute] : @[Vocabulary.VocBasic.Property] {
		Type_Ref : @[Vocabulary.VocBasic.Class]?;
		Np_Att : Text;
	};

	type @[Vocabulary.VocBasic.TypedLiteral] : @[Vocabulary.VocBasic.DataLiteral] {
		Type_Ref : @[Vocabulary.VocBasic.Datatype];
	};

	type @[Vocabulary.VocBasic.PlainLiteral] : @[Vocabulary.VocBasic.DataLiteral] {
		LanguageTag_Att : Text;
	};

	type @[Vocabulary.VocBasic.DataLiteral] : @[Terms.DataTerm] {
		LexicalValue_Att : Text;
	};

	type @[Vocabulary.VocBasic.ReferenceProperty] : @[Vocabulary.VocBasic.Property] {
		Vp_Att : Text;
		Domrm_Att : Text;
		Rgrn_Att : Text;
	};

	type @[Vocabulary.VocBasic.ObjectName] : @[Vocabulary.VocBasic.VocabularyEntry], @[Terms.ObjectTerm] {
		ClassRef_Ref : @[Vocabulary.VocBasic.Class]?;
	};

	type @[Vocabulary.VocBasic.Datatype] : @[Vocabulary.VocBasic.Type];

	type @[Vocabulary.VocBasic.Class] : @[Vocabulary.VocBasic.Type] {
		Np_Att : Text;
	};

	type @[Vocabulary.VocBasic.Type] : @[Vocabulary.VocBasic.Predicate];

	type @[Vocabulary.VocRelational.AssociationPredicate] : @[Vocabulary.VocBasic.Predicate] {
		Arguments_Ref : @[Vocabulary.VocBasic.Type]*;
		Vp_Att : Text;
	};

	type @[Vocabulary.VocRelational.GenericPredicate] : @[Vocabulary.VocBasic.Predicate] {
		Vp_Att : Text;
	};

	type @[Events.SOAPMessageBody] {
		Children_ContRef : @[Events.SOAPMessageBodyChild]*;
	};

	type @[Events.SOAPConversationalMsgEvtExpression] : @[Events.SOAPMessageEventExpression];

	type @[Events.SOAPRPCResponseMsgEvtExpression] : @[Events.SOAPMessageEventExpression];

	type @[Events.SOAPRPCRequestMsgEvtExpression] : @[Events.SOAPMessageEventExpression];

	type @[Events.SOAPMessageHeaderBlock] {
		NameSpaceName_Att : Text;
		LocalName_Att : Text;
		EncodingStyle_Att : Text;
		MustUnderstand_Att : Logical;
		Role_Att : Text;
		Relay_Att : Logical;
	};

	type @[Events.SOAPMessageHeader] {
		HeaderBlocks_ContRef : @[Events.SOAPMessageHeaderBlock]*;
	};

	type @[Events.SOAPMessageBodyChild] {
		LocalName_Att : Text;
		NameSpaceName_Att : Text;
		EncodingStyle_Att : Text;
	};

	type @[Events.EveryYearTimeEventExpression] : @[Events.PeriodicTimeEventExpression] {
		DayOfYear_Att : Integer32;
		Time_Att : Text;
	};

	type @[Events.EveryMonthTimeEventExpression] : @[Events.PeriodicTimeEventExpression] {
		DayOfMonth_Att : Integer32;
		Time_Att : Text;
	};

	type @[Events.EveryWeekTimeEventExpression] : @[Events.PeriodicTimeEventExpression] {
		DayOfWeek_Att : Integer32;
		Time_Att : Text;
	};

	type @[Events.EveryDayTimeEventExpression] : @[Events.PeriodicTimeEventExpression] {
		Time_Att : Text;
	};

	type @[Events.EveryHourTimeEventExpression] : @[Events.PeriodicTimeEventExpression] {
		Minute_Att : Integer32;
		Second_Att : Integer32;
	};

	type @[Events.EveryMinuteTimeEventExpression] : @[Events.PeriodicTimeEventExpression] {
		Second_Att : Integer32;
	};

	type @[Events.MessageEventExpression] : @[Events.ActionEventExpression] {
		Sender_Att : Text;
		Receiver_Att : Text;
	};

	type @[Events.SOAPMessageEventExpression] : @[Events.MessageEventExpression] {
		Body_ContRef : @[Events.SOAPMessageBody];
		Header_ContRef : @[Events.SOAPMessageHeader]?;
	};

	type @[Events.PeriodicTimeEventExpression] : @[Events.TimeEventExpression];

	type @[Events.SingularTimeEventExpression] : @[Events.TimeEventExpression] {
		DateTime_Att : Integer32;
	};

	type @[Events.ActionEventExpression] : @[Events.AtomicEventExpression] {
		Actor_Att : Text;
	};

	type @[Events.TimeEventExpression] : @[Events.AtomicEventExpression];

	type @[Events.ParallelEventExpression] : @[Events.EventExpression] {
		Expressions_ContRef : @[Events.EventExpression]*;
		TimeWindow_Att : Text;
	};

	type @[Events.SequenceEventExpression] : @[Events.EventExpression] {
		Expressions_ContRef : @[Events.EventExpression]*;
		TimeWindow_Att : Integer32;
	};

	type @[Events.ChoiceEventExpression] : @[Events.EventExpression] {
		Expressions_ContRef : @[Events.EventExpression]+;
		MinOccurs_Att : Integer32;
		MaxOccurs_Att : Integer32;
		TimeWindow_Att : Text;
	};

	type @[Events.AtomicEventExpression] : @[Events.EventExpression] {
		Arguments_ContRef : @[Terms.Term]*;
		Type_Ref : EventType;
	};

	type @[Events.AndNotEventExpression] : @[Events.EventExpression] {
		Expressions_ContRef : @[Events.EventExpression]*;
		TimeWndow_Att : Text;
	};

	type @[Events.EventExpression] {
		StartDateTime_Att : Text;
		Duration_Att : Text;
		OccurDateTime_Att : Text;
	};

	type @[Actions.InvokeActionExpression] : @[Actions.ActionExpression] {
		Operation_Ref : @[Vocabulary.VocFunctional.Operation];
		Arguments_Ref : @[Terms.Term]*;
		ContextArgument_Ref : @[Terms.ObjectTerm]?;
	};

	type @[Actions.SOAPRPCAction] : @[Actions.SOAPAction] {
		Arguments_Ref : @[Terms.Term]*;
	};

	type @[Actions.SOAPAction] : @[Actions.MessageAction] {
		Operation_Ref : @[Vocabulary.VocFunctional.Operation];
	};

	type @[Actions.DeleteActionExpression] : @[Actions.ActionExpression] {
		ContextArgument_Ref : @[Terms.ObjectTerm];
		Context_Ref : @[Vocabulary.VocBasic.Class];
	};

	type @[Actions.CreateActionExpression] : @[Actions.ActionExpression] {
		Slots_Ref : @[Atoms.AtRelational.Slot]*;
		Context_Ref : @[Vocabulary.VocBasic.Class];
	};

	type @[Actions.AssignActionExpression] : @[Actions.ActionExpression] {
		ContextArgument_Ref : @[Terms.ObjectTerm];
		Property_Ref : @[Vocabulary.VocBasic.Property];
	};

	type @[Actions.MessageAction] : @[Actions.ActionExpression];

	type @[Actions.ActionExpression];

	type @[Formulas.AtLeastAndAtMostQuantifiedFormula] : @[Formulas.QuantifiedFormula] {
		MaxCardinality_Att : Integer32;
		MinCardinality_Att : Integer32;
	};

	type @[Formulas.AtMostQuantifiedFormula] : @[Formulas.QuantifiedFormula] {
		MaxCardinality_Att : Integer32;
	};

	type @[Formulas.AtLeastQuantifiedFormula] : @[Formulas.QuantifiedFormula] {
		MinCardinality_Att : Integer32;
	};

	type @[Formulas.Conjuction] : @[Formulas.LogicalFormula] {
		Formulas_ContRef : @[Formulas.LogicalFormula]#2 ..;
	};

	type @[Formulas.UniversallyQuantifiedFormula] : @[Formulas.QuantifiedFormula];

	type @[Formulas.StrongNegation] : @[Formulas.Negation], @[Formulas.LogicalFormula] {
		Formula_ContRef : @[Formulas.LogicalFormula];
	};

	type @[Formulas.QuantifiedFormula] : @[Formulas.LogicalFormula] {
		Formula_ContRef : @[Formulas.LogicalFormula];
		Variables_Ref : @[Terms.TerBasic.Variables.Variable]+;
	};

	type @[Formulas.NegationAsFailure] : @[Formulas.Negation], @[Formulas.LogicalFormula] {
		Formula_ContRef : @[Formulas.LogicalFormula];
	};

	type @[Formulas.Negation];

	type @[Formulas.LogicalFormula];

	type @[Formulas.Implication] : @[Formulas.LogicalFormula] {
		Consequent_ContRef : @[Formulas.LogicalFormula];
		Antecedent_ContRef : @[Formulas.LogicalFormula];
	};

	type @[Formulas.ExistentiallyQuantifiedFormula] : @[Formulas.QuantifiedFormula];

	type @[Formulas.Disjunction] : @[Formulas.LogicalFormula] {
		Formulas_ContRef : @[Formulas.LogicalFormula]#2 ..;
	};

	type @[Formulas.Qf.QFStrongNegation] : @[Formulas.Qf.QFNegation];

	type @[Formulas.Qf.QFNegationAsFailure] : @[Formulas.Qf.QFNegation];

	type @[Formulas.Qf.QFNegation] : @[Formulas.Qf.AndOrNafNegFormula] {
		Formula_ContRef : @[Formulas.Qf.AndOrNafNegFormula];
	};

	type @[Formulas.Qf.LiteralConjunction] {
		Atoms_ContRef : @[Atoms.Atom]+;
	};

	type @[Formulas.Qf.QFDisjunction] : @[Formulas.Qf.AndOrNafNegFormula] {
		Formulas_ContRef : @[Formulas.Qf.AndOrNafNegFormula]#2 ..;
	};

	type @[Formulas.Qf.QFConjunction] : @[Formulas.Qf.AndOrNafNegFormula] {
		Formulas_ContRef : @[Formulas.Qf.AndOrNafNegFormula]#2 ..;
	};

	type @[Formulas.Qf.AndOrNafNegFormula];

	type @[Terms.GenericTerm] : @[Terms.Term];

	type @[Terms.Term] {
		TypeCategory_Att : CollectionTypes?;
	};

	type @[Terms.ObjectTerm] : @[Terms.Term];

	type @[Terms.DataTerm] : @[Terms.Term];

	type @[Terms.TerBasic.Variables.Variable] {
		Name_Att : Text;
	};

	type @[Terms.TerBasic.Variables.ObjectVariable] : @[Terms.TerBasic.Variables.Variable], @[Terms.ObjectTerm] {
		ClassRef_Ref : @[Vocabulary.VocBasic.Class]?;
	};

	type @[Terms.TerBasic.Variables.DataVariable] : @[Terms.TerBasic.Variables.Variable], @[Terms.DataTerm] {
		DatatypeRef_Ref : @[Vocabulary.VocBasic.Datatype]?;
	};

	type @[Terms.TerBasic.Variables.GenericVariable] : @[Terms.GenericTerm], @[Terms.TerBasic.Variables.Variable] {
		TypeRef_Ref : @[Vocabulary.VocBasic.Type]?;
	};

	type @[Terms.TerFunctional.DatatypeFunctionTerm] : @[Terms.TerFunctional.DataFunctionTerm] {
		Function_Ref : @[Vocabulary.VocFunctional.DatatypeFunction];
		DataArguments_Ref : @[Terms.DataTerm]+;
	};

	type @[Terms.TerFunctional.DataFunctionTerm] : @[Terms.DataTerm];

	type @[Terms.TerFunctional.AttributeFunctionTerm] : @[Terms.TerFunctional.DataFunctionTerm] {
		ContextArgument_Ref : @[Terms.ObjectTerm];
		Attribute_Ref : @[Vocabulary.VocBasic.Attribute];
	};

	type @[Terms.TerFunctional.DataOperationTerm] : @[Terms.TerFunctional.DataFunctionTerm] {
		DataOperationRef_Ref : @[Vocabulary.VocFunctional.DataOperation];
		ContextArgument_Ref : @[Terms.ObjectTerm]?;
		Arguments_Ref : @[Terms.Term]*;
	};

	type @[Terms.TerFunctional.ReferencePropertyFunctionTerm] : @[Terms.ObjectTerm] {
		ContextArgument_Ref : @[Terms.ObjectTerm];
		ReferencePropertyRef_Ref : @[Vocabulary.VocBasic.ReferenceProperty];
	};

	type @[Terms.TerFunctional.ObjectOperationTerm] : @[Terms.ObjectTerm] {
		Operation_Ref : @[Vocabulary.VocFunctional.ObjectOperation];
		Arguments_Ref : @[Terms.Term]*;
		ContextArgument_Ref : @[Terms.ObjectTerm]?;
	};

	type @[Terms.TerFunctional.GenericFunctionTerm] : @[Terms.GenericTerm] {
		Arguments_Ref : @[Terms.GenericTerm]*;
		Functor_Ref : @[Vocabulary.VocFunctional.GenericFunction];
	};
}