CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE Root (
	__IDRoot__ Integer NOT NULL,
	PRIMARY KEY Root (__IDRoot__)
) ;

CREATE TABLE VocabularyEntry (
	__IDVocabularyEntry__ Integer NOT NULL,
	FOREIGN KEY primaryRep (__FKprimaryRep__) REFERENCES PrimaryRepresentation (__IDPrimaryRepresentation__),
	PRIMARY KEY VocabularyEntry (__IDVocabularyEntry__),
	__FKprimaryRep__ Integer
) ;

CREATE TABLE Caption (
	__IDCaption__ Integer NOT NULL,
	PRIMARY KEY Caption (__IDCaption__)
) ;

CREATE TABLE DefCaption (
	__IDDefCaption__ Integer NOT NULL,
	FOREIGN KEY definition (__FKdefinition__) REFERENCES ConceptDefinition (__IDConceptDefinition__),
	PRIMARY KEY DefCaption (__IDDefCaption__),
	__FKdefinition__ Integer
) ;

CREATE TABLE DescCaption (
	__IDDescCaption__ Integer NOT NULL,
	FOREIGN KEY description (__FKdescription__) REFERENCES Note (__IDNote__),
	PRIMARY KEY DescCaption (__IDDescCaption__),
	__FKdescription__ Integer
) ;

CREATE TABLE SrcCaption (
	__IDSrcCaption__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES ConceptSource (__IDConceptSource__),
	PRIMARY KEY SrcCaption (__IDSrcCaption__),
	__FKsource__ Integer
) ;

CREATE TABLE DBCaption (
	__IDDBCaption__ Integer NOT NULL,
	FOREIGN KEY dictionaryBasis (__FKdictionaryBasis__) REFERENCES ConceptSource (__IDConceptSource__),
	PRIMARY KEY DBCaption (__IDDBCaption__),
	__FKdictionaryBasis__ Integer
) ;

CREATE TABLE GenCCaption (
	__IDGenCCaption__ Integer NOT NULL,
	FOREIGN KEY generalConcept (__FKgeneralConcept__) REFERENCES PrimaryRepresentation (__IDPrimaryRepresentation__),
	PRIMARY KEY GenCCaption (__IDGenCCaption__),
	__FKgeneralConcept__ Integer
) ;

CREATE TABLE CTypCaption (
	__IDCTypCaption__ Integer NOT NULL,
	PRIMARY KEY CTypCaption (__IDCTypCaption__)
) ;

CREATE TABLE Necessity (
	__IDNecessity__ Integer NOT NULL,
	FOREIGN KEY exp (__FKexp__) REFERENCES SBVRExpression (__IDSBVRExpression__),
	PRIMARY KEY Necessity (__IDNecessity__),
	__FKexp__ Integer
) ;

CREATE TABLE Possibility (
	__IDPossibility__ Integer NOT NULL,
	FOREIGN KEY exp (__FKexp__) REFERENCES SBVRExpression (__IDSBVRExpression__),
	PRIMARY KEY Possibility (__IDPossibility__),
	__FKexp__ Integer
) ;

CREATE TABLE RefSCaption (
	__IDRefSCaption__ Integer NOT NULL,
	FOREIGN KEY referenceScheme (__FKreferenceScheme__) REFERENCES PrimaryRepresentation (__IDPrimaryRepresentation__),
	PRIMARY KEY RefSCaption (__IDRefSCaption__),
	__FKreferenceScheme__ Integer
) ;

CREATE TABLE NoteCaption (
	__IDNoteCaption__ Integer NOT NULL,
	FOREIGN KEY note (__FKnote__) REFERENCES Note (__IDNote__),
	PRIMARY KEY NoteCaption (__IDNoteCaption__),
	__FKnote__ Integer
) ;

CREATE TABLE ExCaption (
	__IDExCaption__ Integer NOT NULL,
	PRIMARY KEY ExCaption (__IDExCaption__)
) ;

CREATE TABLE SynCaption (
	__IDSynCaption__ Integer NOT NULL,
	PRIMARY KEY SynCaption (__IDSynCaption__)
) ;

CREATE TABLE SynFCaption (
	__IDSynFCaption__ Integer NOT NULL,
	PRIMARY KEY SynFCaption (__IDSynFCaption__)
) ;

CREATE TABLE SeeCaption (
	__IDSeeCaption__ Integer NOT NULL,
	FOREIGN KEY see (__FKsee__) REFERENCES PrimaryRepresentation (__IDPrimaryRepresentation__),
	PRIMARY KEY SeeCaption (__IDSeeCaption__),
	__FKsee__ Integer
) ;

CREATE TABLE SFCaption (
	__IDSFCaption__ Integer NOT NULL,
	FOREIGN KEY subjectField (__FKsubjectField__) REFERENCES PrimaryRepresentation (__IDPrimaryRepresentation__),
	PRIMARY KEY SFCaption (__IDSFCaption__),
	__FKsubjectField__ Integer
) ;

CREATE TABLE NSURICaption (
	__IDNSURICaption__ Integer NOT NULL,
	FOREIGN KEY namespaceURI (__FKnamespaceURI__) REFERENCES NameSpaceURI (__IDNameSpaceURI__),
	PRIMARY KEY NSURICaption (__IDNSURICaption__),
	__FKnamespaceURI__ Integer
) ;

CREATE TABLE PrimaryRepresentation (
	__IDPrimaryRepresentation__ Integer NOT NULL,
	PRIMARY KEY PrimaryRepresentation (__IDPrimaryRepresentation__)
) ;

CREATE TABLE NotFactTypeRepresentation (
	__IDNotFactTypeRepresentation__ Integer NOT NULL,
	PRIMARY KEY NotFactTypeRepresentation (__IDNotFactTypeRepresentation__)
) ;

CREATE TABLE TermRepresentation (
	__IDTermRepresentation__ Integer NOT NULL,
	PRIMARY KEY TermRepresentation (__IDTermRepresentation__)
) ;

CREATE TABLE NameRepresentation (
	__IDNameRepresentation__ Integer NOT NULL,
	hasThe Boolean,
	PRIMARY KEY NameRepresentation (__IDNameRepresentation__)
) ;

CREATE TABLE FactTypeFormRepresentation (
	__IDFactTypeFormRepresentation__ Integer NOT NULL,
	FOREIGN KEY primaryRep1 (__FKprimaryRep1__) REFERENCES NotFactTypeRepresentation (__IDNotFactTypeRepresentation__),
	FOREIGN KEY primaryRep2 (__FKprimaryRep2__) REFERENCES NotFactTypeRepresentation (__IDNotFactTypeRepresentation__),
	PRIMARY KEY FactTypeFormRepresentation (__IDFactTypeFormRepresentation__),
	__FKprimaryRep1__ Integer,
	__FKprimaryRep2__ Integer
) ;

CREATE TABLE ConceptDefinition (
	__IDConceptDefinition__ Integer NOT NULL,
	FOREIGN KEY exp (__FKexp__) REFERENCES Concept (__IDConcept__),
	PRIMARY KEY ConceptDefinition (__IDConceptDefinition__),
	__FKexp__ Integer
) ;

CREATE TABLE ConceptSource (
	__IDConceptSource__ Integer NOT NULL,
	PRIMARY KEY ConceptSource (__IDConceptSource__)
) ;

CREATE TABLE Note (
	__IDNote__ Integer NOT NULL,
	PRIMARY KEY Note (__IDNote__)
) ;

CREATE TABLE Sentence (
	__IDSentence__ Integer NOT NULL,
	PRIMARY KEY Sentence (__IDSentence__)
) ;

CREATE TABLE NameSpaceURI (
	__IDNameSpaceURI__ Integer NOT NULL,
	PRIMARY KEY NameSpaceURI (__IDNameSpaceURI__)
) ;

CREATE TABLE Word (
	__IDWord__ Integer NOT NULL,
	val text,
	PRIMARY KEY Word (__IDWord__)
) ;

CREATE TABLE StringWord (
	__IDStringWord__ Integer NOT NULL,
	PRIMARY KEY StringWord (__IDStringWord__)
) ;

CREATE TABLE QuotedStringWord (
	__IDQuotedStringWord__ Integer NOT NULL,
	PRIMARY KEY QuotedStringWord (__IDQuotedStringWord__)
) ;

CREATE TABLE NameWord (
	__IDNameWord__ Integer NOT NULL,
	PRIMARY KEY NameWord (__IDNameWord__)
) ;

CREATE TABLE SBVRExpression (
	__IDSBVRExpression__ Integer NOT NULL,
	hasPoint Boolean,
	FOREIGN KEY firstProposition (__FKfirstProposition__) REFERENCES SimpleSBVRProp (__IDSimpleSBVRProp__),
	PRIMARY KEY SBVRExpression (__IDSBVRExpression__),
	__FKfirstProposition__ Integer
) ;

CREATE TABLE SBVRPropWithKW (
	__IDSBVRPropWithKW__ Integer NOT NULL,
	conjonction text,
	endConj text,
	FOREIGN KEY proposition (__FKproposition__) REFERENCES SimpleSBVRProp (__IDSimpleSBVRProp__),
	PRIMARY KEY SBVRPropWithKW (__IDSBVRPropWithKW__),
	__FKproposition__ Integer
) ;

CREATE TABLE ModalForm (
	__IDModalForm__ Integer NOT NULL,
	modal text,
	isNeg Boolean,
	PRIMARY KEY ModalForm (__IDModalForm__)
) ;

CREATE TABLE SimpleSBVRProp (
	__IDSimpleSBVRProp__ Integer NOT NULL,
	FOREIGN KEY modal (__FKmodal__) REFERENCES ModalBegin (__IDModalBegin__),
	FOREIGN KEY concept1 (__FKconcept1__) REFERENCES Concept (__IDConcept__),
	FOREIGN KEY modalVerb (__FKmodalVerb__) REFERENCES ModalForm (__IDModalForm__),
	FOREIGN KEY concept2 (__FKconcept2__) REFERENCES Concept (__IDConcept__),
	PRIMARY KEY SimpleSBVRProp (__IDSimpleSBVRProp__),
	__FKmodal__ Integer,
	__FKconcept1__ Integer,
	__FKmodalVerb__ Integer,
	__FKconcept2__ Integer
) ;

CREATE TABLE SubSBVRProp (
	__IDSubSBVRProp__ Integer NOT NULL,
	"join" text,
	modalVerb text,
	FOREIGN KEY concept2 (__FKconcept2__) REFERENCES Concept (__IDConcept__),
	PRIMARY KEY SubSBVRProp (__IDSubSBVRProp__),
	__FKconcept2__ Integer
) ;

CREATE TABLE LinkSBVRConcept (
	__IDLinkSBVRConcept__ Integer NOT NULL,
	link text,
	FOREIGN KEY concept (__FKconcept__) REFERENCES Concept (__IDConcept__),
	PRIMARY KEY LinkSBVRConcept (__IDLinkSBVRConcept__),
	__FKconcept__ Integer
) ;

CREATE TABLE ConjConcept (
	__IDConjConcept__ Integer NOT NULL,
	conjonction text,
	FOREIGN KEY concept (__FKconcept__) REFERENCES Concept (__IDConcept__),
	PRIMARY KEY ConjConcept (__IDConjConcept__),
	__FKconcept__ Integer
) ;

CREATE TABLE Concept (
	__IDConcept__ Integer NOT NULL,
	FOREIGN KEY subProp (__FKsubProp__) REFERENCES SubSBVRProp (__IDSubSBVRProp__),
	FOREIGN KEY linkedConcept (__FKlinkedConcept__) REFERENCES LinkSBVRConcept (__IDLinkSBVRConcept__),
	PRIMARY KEY Concept (__IDConcept__),
	__FKsubProp__ Integer,
	__FKlinkedConcept__ Integer
) ;

CREATE TABLE NameConcept (
	__IDNameConcept__ Integer NOT NULL,
	the text,
	PRIMARY KEY NameConcept (__IDNameConcept__)
) ;

CREATE TABLE ObjectConcept (
	__IDObjectConcept__ Integer NOT NULL,
	FOREIGN KEY operatoredConcept (__FKoperatoredConcept__) REFERENCES NounConcept (__IDNounConcept__),
	FOREIGN KEY qualify (__FKqualify__) REFERENCES Qualification (__IDQualification__),
	PRIMARY KEY ObjectConcept (__IDObjectConcept__),
	__FKoperatoredConcept__ Integer,
	__FKqualify__ Integer
) ;

CREATE TABLE StringConcept (
	__IDStringConcept__ Integer NOT NULL,
	PRIMARY KEY StringConcept (__IDStringConcept__)
) ;

CREATE TABLE NounConcept (
	__IDNounConcept__ Integer NOT NULL,
	FOREIGN KEY qualif (__FKqualif__) REFERENCES Qualifier (__IDQualifier__),
	PRIMARY KEY NounConcept (__IDNounConcept__),
	__FKqualif__ Integer
) ;

CREATE TABLE Qualification (
	__IDQualification__ Integer NOT NULL,
	PRIMARY KEY Qualification (__IDQualification__)
) ;

CREATE TABLE GeneralConcept (
	__IDGeneralConcept__ Integer NOT NULL,
	PRIMARY KEY GeneralConcept (__IDGeneralConcept__)
) ;

CREATE TABLE NameGConcept (
	__IDNameGConcept__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES NameConcept (__IDNameConcept__),
	PRIMARY KEY NameGConcept (__IDNameGConcept__),
	__FKname__ Integer
) ;

CREATE TABLE NounGConcept (
	__IDNounGConcept__ Integer NOT NULL,
	PRIMARY KEY NounGConcept (__IDNounGConcept__)
) ;

CREATE TABLE Qualifier (
	__IDQualifier__ Integer NOT NULL,
	op text,
	endOperator text,
	FOREIGN KEY min (__FKmin__) REFERENCES StringWord (__IDStringWord__),
	FOREIGN KEY max (__FKmax__) REFERENCES StringWord (__IDStringWord__),
	PRIMARY KEY Qualifier (__IDQualifier__),
	__FKmin__ Integer,
	__FKmax__ Integer
) ;

CREATE TABLE ModalBegin (
	__IDModalBegin__ Integer NOT NULL,
	endOperator text,
	PRIMARY KEY ModalBegin (__IDModalBegin__)
) ;

CREATE TABLE ModalBeginC (
	__IDModalBeginC__ Integer NOT NULL,
	PRIMARY KEY ModalBeginC (__IDModalBeginC__)
) ;

CREATE TABLE Root_entries_VocabularyEntry (
	__IDRoot__ Integer NOT NULL,
	__IDVocabularyEntry__ Integer NOT NULL
) ;

CREATE TABLE VocabularyEntry_caption_Caption (
	__IDVocabularyEntry__ Integer NOT NULL,
	__IDCaption__ Integer NOT NULL
) ;

CREATE TABLE CTypCaption_conceptType_PrimaryRepresentation (
	__IDCTypCaption__ Integer NOT NULL,
	__IDPrimaryRepresentation__ Integer NOT NULL
) ;

CREATE TABLE ExCaption_example_SBVRExpression (
	__IDExCaption__ Integer NOT NULL,
	__IDSBVRExpression__ Integer NOT NULL
) ;

CREATE TABLE SynCaption_synonym_PrimaryRepresentation (
	__IDSynCaption__ Integer NOT NULL,
	__IDPrimaryRepresentation__ Integer NOT NULL
) ;

CREATE TABLE SynFCaption_synonymousForm_SBVRExpression (
	__IDSynFCaption__ Integer NOT NULL,
	__IDSBVRExpression__ Integer NOT NULL
) ;

CREATE TABLE TermRepresentation_term_StringWord (
	__IDTermRepresentation__ Integer NOT NULL,
	__IDStringWord__ Integer NOT NULL
) ;

CREATE TABLE NameRepresentation_name_NameWord (
	__IDNameRepresentation__ Integer NOT NULL,
	__IDNameWord__ Integer NOT NULL
) ;

CREATE TABLE ConceptDefinition_conjexp_ConjConcept (
	__IDConceptDefinition__ Integer NOT NULL,
	__IDConjConcept__ Integer NOT NULL
) ;

CREATE TABLE ConceptSource_source_Word (
	__IDConceptSource__ Integer NOT NULL,
	__IDWord__ Integer NOT NULL
) ;

CREATE TABLE Note_sentences_Sentence (
	__IDNote__ Integer NOT NULL,
	__IDSentence__ Integer NOT NULL
) ;

CREATE TABLE Sentence_words_Word (
	__IDSentence__ Integer NOT NULL,
	__IDWord__ Integer NOT NULL
) ;

CREATE TABLE NameSpaceURI_URI_Word (
	__IDNameSpaceURI__ Integer NOT NULL,
	__IDWord__ Integer NOT NULL
) ;

CREATE TABLE SBVRExpression_nextProposition_SBVRPropWithKW (
	__IDSBVRExpression__ Integer NOT NULL,
	__IDSBVRPropWithKW__ Integer NOT NULL
) ;

CREATE TABLE NameConcept_name_NameWord (
	__IDNameConcept__ Integer NOT NULL,
	__IDNameWord__ Integer NOT NULL
) ;

CREATE TABLE StringConcept_stringWord_QuotedStringWord (
	__IDStringConcept__ Integer NOT NULL,
	__IDQuotedStringWord__ Integer NOT NULL
) ;

CREATE TABLE NounConcept_noun_StringWord (
	__IDNounConcept__ Integer NOT NULL,
	__IDStringWord__ Integer NOT NULL
) ;

CREATE TABLE Qualification_generalConcept_GeneralConcept (
	__IDQualification__ Integer NOT NULL,
	__IDGeneralConcept__ Integer NOT NULL
) ;

CREATE TABLE NounGConcept_noun_StringWord (
	__IDNounGConcept__ Integer NOT NULL,
	__IDStringWord__ Integer NOT NULL
) ;
