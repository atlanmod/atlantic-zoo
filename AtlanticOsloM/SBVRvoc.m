module SBVRvoc {

	type LocatedElement {
		Location_Att : Text;
		CommentsBefore_Att : Text;
		CommentsAfter_Att : Text;
	};

	type Root : LocatedElement {
		Entries_ContRef : VocabularyEntry*;
	};

	type VocabularyEntry : LocatedElement {
		PrimaryRep_ContRef : PrimaryRepresentation;
		Caption_ContRef : Caption*;
	};

	type Caption : LocatedElement;

	type DefCaption : Caption {
		Definition_ContRef : ConceptDefinition;
	};

	type DescCaption : Caption {
		Description_ContRef : Note;
	};

	type SrcCaption : Caption {
		Source_ContRef : ConceptSource;
	};

	type DBCaption : Caption {
		DictionaryBasis_ContRef : ConceptSource;
	};

	type GenCCaption : Caption {
		GeneralConcept_ContRef : PrimaryRepresentation;
	};

	type CTypCaption : Caption {
		ConceptType_ContRef : PrimaryRepresentation*;
	};

	type Necessity : Caption {
		Exp_ContRef : SBVRExpression;
	};

	type Possibility : Caption {
		Exp_ContRef : SBVRExpression;
	};

	type RefSCaption : Caption {
		ReferenceScheme_ContRef : PrimaryRepresentation;
	};

	type NoteCaption : Caption {
		Note_ContRef : Note;
	};

	type ExCaption : Caption {
		Example_ContRef : SBVRExpression*;
	};

	type SynCaption : Caption {
		Synonym_ContRef : PrimaryRepresentation*;
	};

	type SynFCaption : Caption {
		SynonymousForm_ContRef : SBVRExpression*;
	};

	type SeeCaption : Caption {
		See_ContRef : PrimaryRepresentation?;
	};

	type SFCaption : Caption {
		SubjectField_ContRef : PrimaryRepresentation?;
	};

	type NSURICaption : Caption {
		NamespaceURI_ContRef : NameSpaceURI?;
	};

	type PrimaryRepresentation : LocatedElement;

	type NotFactTypeRepresentation : PrimaryRepresentation;

	type TermRepresentation : NotFactTypeRepresentation {
		Term_ContRef : StringWord+;
	};

	type NameRepresentation : NotFactTypeRepresentation {
		HasThe_Att : Logical;
		Name_ContRef : NameWord+;
	};

	type FactTypeFormRepresentation : PrimaryRepresentation {
		PrimaryRep1_ContRef : NotFactTypeRepresentation;
		VerbExp_Att : Verb+;
		PrimaryRep2_ContRef : NotFactTypeRepresentation;
	};

	type ConceptDefinition : LocatedElement {
		Exp_ContRef : Concept;
		Conjexp_ContRef : ConjConcept*;
	};

	type ConceptSource : LocatedElement {
		Source_ContRef : Word+;
	};

	type Note : LocatedElement {
		Sentences_ContRef : Sentence+;
	};

	type Sentence : LocatedElement {
		Words_ContRef : Word+;
	};

	type NameSpaceURI : LocatedElement {
		URI_ContRef : Word+;
	};

	type Word : LocatedElement {
		Val_Att : Text;
	};

	type StringWord : Word;

	type QuotedStringWord : Word;

	type NameWord : Word;

	type Verb {"is", "relevant", "comprises", "to", "work", "in", "trades", "as", "are", "accepted", "generally", "important", "across", "share", "sets", "assigned", "by", "contains", "for", "has", "specifies", "specified"};

	type ConjonctionnalKeyWord {"and", "or", "if", "whether"};

	type ModalVerb {"must", "may", "never", "always"};

	type Join {"that", "who"};

	type Link {"of", "quoteS"};

	type Qualif {"the", "The", "a", "A", "an", "An", "Each", "each", "Some", "some", "At", "at", "Exactly", "exactly"};

	type EndOperator {"given", "thanone", "one", "isobligatorythat", "ispermittedthat", "isprohibitedthat", "isnecessarythat", "ispossiblethat", "isimpossiblethat", "isnotthecasethat", "least", "leastone", "most", "mostone", "leastnandatmostm", "andonlyif", "ornot", "not", "of"};

	type SBVRExpression : LocatedElement {
		HasPoint_Att : Logical;
		FirstProposition_ContRef : SimpleSBVRProp;
		NextProposition_ContRef : SBVRPropWithKW*;
	};

	type SBVRPropWithKW : LocatedElement {
		Conjonction_Att : ConjonctionnalKeyWord;
		EndConj_Att : EndOperator;
		Proposition_ContRef : SimpleSBVRProp;
	};

	type ModalForm : LocatedElement {
		Modal_Att : ModalVerb;
		IsNeg_Att : Logical;
	};

	type SimpleSBVRProp : LocatedElement {
		Modal_ContRef : ModalBegin?;
		Concept1_ContRef : Concept;
		ModalVerb_ContRef : ModalForm?;
		Verbs_Att : Verb+;
		Concept2_ContRef : Concept;
	};

	type SubSBVRProp : LocatedElement {
		Join_Att : Join;
		ModalVerb_Att : ModalVerb?;
		Verbs_Att : Verb+;
		Concept2_ContRef : Concept;
	};

	type LinkSBVRConcept : LocatedElement {
		Link_Att : Link;
		Concept_ContRef : Concept;
	};

	type ConjConcept : LocatedElement {
		Conjonction_Att : ConjonctionnalKeyWord;
		Concept_ContRef : Concept;
	};

	type Concept : LocatedElement {
		SubProp_ContRef : SubSBVRProp?;
		LinkedConcept_ContRef : LinkSBVRConcept?;
	};

	type NameConcept : Concept {
		The_Att : Qualif?;
		Name_ContRef : NameWord+;
	};

	type ObjectConcept : Concept {
		OperatoredConcept_ContRef : NounConcept;
		Qualify_ContRef : Qualification?;
	};

	type StringConcept : Concept {
		StringWord_ContRef : QuotedStringWord+;
	};

	type NounConcept : LocatedElement {
		Qualif_ContRef : Qualifier?;
		Noun_ContRef : StringWord+;
	};

	type Qualification : LocatedElement {
		GeneralConcept_ContRef : GeneralConcept+;
	};

	type GeneralConcept : LocatedElement;

	type NameGConcept : GeneralConcept {
		Name_ContRef : NameConcept;
	};

	type NounGConcept : GeneralConcept {
		Noun_ContRef : StringWord+;
	};

	type Qualifier : LocatedElement {
		Op_Att : Qualif;
		EndOperator_Att : EndOperator;
		Min_ContRef : StringWord?;
		Max_ContRef : StringWord?;
	};

	type ModalBegin : LocatedElement {
		EndOperator_Att : EndOperator;
	};

	type ModalBeginC : ModalBegin;
}