( declare SBVRvoc_LocatedElement )
( declare SBVRvoc_Root )
( declare SBVRvoc_VocabularyEntry )
( declare SBVRvoc_Caption )
( declare SBVRvoc_DefCaption )
( declare SBVRvoc_DescCaption )
( declare SBVRvoc_SrcCaption )
( declare SBVRvoc_DBCaption )
( declare SBVRvoc_GenCCaption )
( declare SBVRvoc_CTypCaption )
( declare SBVRvoc_Necessity )
( declare SBVRvoc_Possibility )
( declare SBVRvoc_RefSCaption )
( declare SBVRvoc_NoteCaption )
( declare SBVRvoc_ExCaption )
( declare SBVRvoc_SynCaption )
( declare SBVRvoc_SynFCaption )
( declare SBVRvoc_SeeCaption )
( declare SBVRvoc_SFCaption )
( declare SBVRvoc_NSURICaption )
( declare SBVRvoc_PrimaryRepresentation )
( declare SBVRvoc_NotFactTypeRepresentation )
( declare SBVRvoc_TermRepresentation )
( declare SBVRvoc_NameRepresentation )
( declare SBVRvoc_FactTypeFormRepresentation )
( declare SBVRvoc_ConceptDefinition )
( declare SBVRvoc_ConceptSource )
( declare SBVRvoc_Note )
( declare SBVRvoc_Sentence )
( declare SBVRvoc_NameSpaceURI )
( declare SBVRvoc_Word )
( declare SBVRvoc_StringWord )
( declare SBVRvoc_QuotedStringWord )
( declare SBVRvoc_NameWord )
( declare SBVRvoc_Verb )
( declare SBVRvoc_ConjonctionnalKeyWord )
( declare SBVRvoc_ModalVerb )
( declare SBVRvoc_Join )
( declare SBVRvoc_Link )
( declare SBVRvoc_Qualif )
( declare SBVRvoc_EndOperator )
( declare SBVRvoc_SBVRExpression )
( declare SBVRvoc_SBVRPropWithKW )
( declare SBVRvoc_ModalForm )
( declare SBVRvoc_SimpleSBVRProp )
( declare SBVRvoc_SubSBVRProp )
( declare SBVRvoc_LinkSBVRConcept )
( declare SBVRvoc_ConjConcept )
( declare SBVRvoc_Concept )
( declare SBVRvoc_NameConcept )
( declare SBVRvoc_ObjectConcept )
( declare SBVRvoc_StringConcept )
( declare SBVRvoc_NounConcept )
( declare SBVRvoc_Qualification )
( declare SBVRvoc_GeneralConcept )
( declare SBVRvoc_NameGConcept )
( declare SBVRvoc_NounGConcept )
( declare SBVRvoc_Qualifier )
( declare SBVRvoc_ModalBegin )
( declare SBVRvoc_ModalBeginC )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def SBVRvoc ( struct-map
	KM3_Package
	:contents[( def Verb ( :literals[( struct-map
		KM3_EnumLiteral
		:name "is"
		:location "165:3-165:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "relevant"
		:location "166:3-166:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "comprises"
		:location "167:3-167:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "to"
		:location "168:3-168:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "work"
		:location "169:3-169:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "in"
		:location "170:3-170:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "trades"
		:location "171:3-171:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "as"
		:location "172:3-172:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "are"
		:location "173:3-173:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "accepted"
		:location "174:3-174:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "generally"
		:location "175:3-175:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "important"
		:location "176:3-176:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "across"
		:location "177:3-177:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "share"
		:location "178:3-178:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "sets"
		:location "179:3-179:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "assigned"
		:location "180:3-180:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "by"
		:location "181:3-181:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "contains"
		:location "182:3-182:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "for"
		:location "183:3-183:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "has"
		:location "184:3-184:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "specifies"
		:location "185:3-185:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "specified"
		:location "186:3-186:21"
	)] ) ) ( def ConjonctionnalKeyWord ( :literals[( struct-map
		KM3_EnumLiteral
		:name "and"
		:location "190:3-190:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "or"
		:location "191:3-191:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "if"
		:location "192:3-192:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "whether"
		:location "193:3-193:19"
	)] ) ) ( def ModalVerb ( :literals[( struct-map
		KM3_EnumLiteral
		:name "must"
		:location "197:3-197:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "may"
		:location "198:3-198:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "never"
		:location "199:3-199:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "always"
		:location "200:3-200:18"
	)] ) ) ( def Join ( :literals[( struct-map
		KM3_EnumLiteral
		:name "that"
		:location "204:3-204:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "who"
		:location "205:3-205:15"
	)] ) ) ( def Link ( :literals[( struct-map
		KM3_EnumLiteral
		:name "of"
		:location "209:3-209:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "quoteS"
		:location "210:3-210:18"
	)] ) ) ( def Qualif ( :literals[( struct-map
		KM3_EnumLiteral
		:name "the"
		:location "214:3-214:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "The"
		:location "215:3-215:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "a"
		:location "216:3-216:13"
	) ( struct-map
		KM3_EnumLiteral
		:name "A"
		:location "217:3-217:13"
	) ( struct-map
		KM3_EnumLiteral
		:name "an"
		:location "218:3-218:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "An"
		:location "219:3-219:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "Each"
		:location "220:3-220:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "each"
		:location "221:3-221:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "Some"
		:location "222:3-222:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "some"
		:location "223:3-223:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "At"
		:location "224:3-224:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "at"
		:location "225:3-225:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "Exactly"
		:location "226:3-226:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "exactly"
		:location "227:3-227:19"
	)] ) ) ( def EndOperator ( :literals[( struct-map
		KM3_EnumLiteral
		:name "given"
		:location "231:3-231:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "thanone"
		:location "232:3-232:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "one"
		:location "233:3-233:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "isobligatorythat"
		:location "234:3-234:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "ispermittedthat"
		:location "235:3-235:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "isprohibitedthat"
		:location "236:3-236:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "isnecessarythat"
		:location "237:3-237:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "ispossiblethat"
		:location "238:3-238:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "isimpossiblethat"
		:location "239:3-239:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "isnotthecasethat"
		:location "240:3-240:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "least"
		:location "241:3-241:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "leastone"
		:location "242:3-242:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "most"
		:location "243:3-243:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "mostone"
		:location "244:3-244:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "leastnandatmostm"
		:location "245:3-245:28"
	) ( struct-map
		KM3_EnumLiteral
		:name "andonlyif"
		:location "246:3-246:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "ornot"
		:location "247:3-247:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "not"
		:location "248:3-248:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "of"
		:location "249:3-249:14"
	)] ) ) ( def SBVRvoc_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SBVRvoc_LocatedElement
			:type String
			:location "11:3-11:36"
		) ( struct-map
			KM3_Attribute
			:name "commentsBefore"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SBVRvoc_LocatedElement
			:type String
			:location "12:3-12:48"
		) ( struct-map
			KM3_Attribute
			:name "commentsAfter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SBVRvoc_LocatedElement
			:type String
			:location "13:3-13:47"
		)]
	) ) ( def SBVRvoc_Root ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "entries"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SBVRvoc_Root
			:type SBVRvoc_VocabularyEntry
			:location "18:3-18:59"
			:isContainer true
		)]
	) ) ( def SBVRvoc_VocabularyEntry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "primaryRep"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_VocabularyEntry
			:type SBVRvoc_PrimaryRepresentation
			:location "23:3-23:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "caption"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SBVRvoc_VocabularyEntry
			:type SBVRvoc_Caption
			:location "24:3-24:43"
			:isContainer true
		)]
	) ) ( def SBVRvoc_Caption ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[]
	) ) ( def SBVRvoc_DefCaption ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Caption]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "definition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_DefCaption
			:type SBVRvoc_ConceptDefinition
			:location "32:3-32:54"
			:isContainer true
		)]
	) ) ( def SBVRvoc_DescCaption ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Caption]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_DescCaption
			:type SBVRvoc_Note
			:location "36:3-36:42"
			:isContainer true
		)]
	) ) ( def SBVRvoc_SrcCaption ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Caption]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_SrcCaption
			:type SBVRvoc_ConceptSource
			:location "40:3-40:46"
			:isContainer true
		)]
	) ) ( def SBVRvoc_DBCaption ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Caption]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dictionaryBasis"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_DBCaption
			:type SBVRvoc_ConceptSource
			:location "44:3-44:54"
			:isContainer true
		)]
	) ) ( def SBVRvoc_GenCCaption ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Caption]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "generalConcept"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_GenCCaption
			:type SBVRvoc_PrimaryRepresentation
			:location "48:3-48:61"
			:isContainer true
		)]
	) ) ( def SBVRvoc_CTypCaption ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Caption]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "conceptType"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SBVRvoc_CTypCaption
			:type SBVRvoc_PrimaryRepresentation
			:location "52:3-52:61"
			:isContainer true
		)]
	) ) ( def SBVRvoc_Necessity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Caption]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "exp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_Necessity
			:type SBVRvoc_SBVRExpression
			:location "56:3-56:43"
			:isContainer true
		)]
	) ) ( def SBVRvoc_Possibility ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Caption]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "exp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_Possibility
			:type SBVRvoc_SBVRExpression
			:location "60:3-60:43"
			:isContainer true
		)]
	) ) ( def SBVRvoc_RefSCaption ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Caption]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "referenceScheme"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_RefSCaption
			:type SBVRvoc_PrimaryRepresentation
			:location "64:3-64:62"
			:isContainer true
		)]
	) ) ( def SBVRvoc_NoteCaption ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Caption]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "note"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_NoteCaption
			:type SBVRvoc_Note
			:location "68:3-68:34"
			:isContainer true
		)]
	) ) ( def SBVRvoc_ExCaption ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Caption]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "example"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SBVRvoc_ExCaption
			:type SBVRvoc_SBVRExpression
			:location "72:3-72:58"
			:isContainer true
		)]
	) ) ( def SBVRvoc_SynCaption ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Caption]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "synonym"
			:upper -1
			:lower 0
			:isOrdered true
			:owner SBVRvoc_SynCaption
			:type SBVRvoc_PrimaryRepresentation
			:location "76:3-76:65"
			:isContainer true
		)]
	) ) ( def SBVRvoc_SynFCaption ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Caption]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "synonymousForm"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SBVRvoc_SynFCaption
			:type SBVRvoc_SBVRExpression
			:location "80:3-80:58"
			:isContainer true
		)]
	) ) ( def SBVRvoc_SeeCaption ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Caption]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "see"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SBVRvoc_SeeCaption
			:type SBVRvoc_PrimaryRepresentation
			:location "84:3-84:55"
			:isContainer true
		)]
	) ) ( def SBVRvoc_SFCaption ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Caption]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "subjectField"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SBVRvoc_SFCaption
			:type SBVRvoc_PrimaryRepresentation
			:location "88:3-88:64"
			:isContainer true
		)]
	) ) ( def SBVRvoc_NSURICaption ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Caption]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "namespaceURI"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SBVRvoc_NSURICaption
			:type SBVRvoc_NameSpaceURI
			:location "92:3-92:55"
			:isContainer true
		)]
	) ) ( def SBVRvoc_PrimaryRepresentation ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[]
	) ) ( def SBVRvoc_NotFactTypeRepresentation ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SBVRvoc_PrimaryRepresentation]
		:structuralFeatures[]
	) ) ( def SBVRvoc_TermRepresentation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_NotFactTypeRepresentation]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "term"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SBVRvoc_TermRepresentation
			:type SBVRvoc_StringWord
			:location "106:3-106:55"
			:isContainer true
		)]
	) ) ( def SBVRvoc_NameRepresentation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_NotFactTypeRepresentation]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "hasThe"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_NameRepresentation
			:type Boolean
			:location "110:3-110:30"
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SBVRvoc_NameRepresentation
			:type SBVRvoc_NameWord
			:location "111:3-111:53"
			:isContainer true
		)]
	) ) ( def SBVRvoc_FactTypeFormRepresentation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_PrimaryRepresentation]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "verbExp"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SBVRvoc_FactTypeFormRepresentation
			:type Verb
			:location "116:3-116:41"
		) ( struct-map
			KM3_Reference
			:name "primaryRep1"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_FactTypeFormRepresentation
			:type SBVRvoc_NotFactTypeRepresentation
			:location "115:3-115:63"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "primaryRep2"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_FactTypeFormRepresentation
			:type SBVRvoc_NotFactTypeRepresentation
			:location "117:3-117:63"
			:isContainer true
		)]
	) ) ( def SBVRvoc_ConceptDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "exp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_ConceptDefinition
			:type SBVRvoc_Concept
			:location "122:3-122:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "conjexp"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SBVRvoc_ConceptDefinition
			:type SBVRvoc_ConjConcept
			:location "123:3-123:48"
			:isContainer true
		)]
	) ) ( def SBVRvoc_ConceptSource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "source"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SBVRvoc_ConceptSource
			:type SBVRvoc_Word
			:location "127:3-127:49"
			:isContainer true
		)]
	) ) ( def SBVRvoc_Note ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sentences"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SBVRvoc_Note
			:type SBVRvoc_Sentence
			:location "132:3-132:56"
			:isContainer true
		)]
	) ) ( def SBVRvoc_Sentence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "words"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SBVRvoc_Sentence
			:type SBVRvoc_Word
			:location "136:3-136:48"
			:isContainer true
		)]
	) ) ( def SBVRvoc_NameSpaceURI ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "URI"
			:upper -1
			:lower 1
			:isOrdered true
			:owner SBVRvoc_NameSpaceURI
			:type SBVRvoc_Word
			:location "140:3-140:47"
			:isContainer true
		)]
	) ) ( def SBVRvoc_Word ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "val"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_Word
			:type String
			:location "148:3-148:26"
		)]
	) ) ( def SBVRvoc_StringWord ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Word]
		:structuralFeatures[]
	) ) ( def SBVRvoc_QuotedStringWord ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Word]
		:structuralFeatures[]
	) ) ( def SBVRvoc_NameWord ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Word]
		:structuralFeatures[]
	) ) ( def SBVRvoc_SBVRExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "hasPoint"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_SBVRExpression
			:type Boolean
			:location "257:3-257:32"
		) ( struct-map
			KM3_Reference
			:name "firstProposition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_SBVRExpression
			:type SBVRvoc_SimpleSBVRProp
			:location "258:3-258:56"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "nextProposition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SBVRvoc_SBVRExpression
			:type SBVRvoc_SBVRPropWithKW
			:location "259:3-259:58"
			:isContainer true
		)]
	) ) ( def SBVRvoc_SBVRPropWithKW ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "conjonction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_SBVRPropWithKW
			:type ConjonctionnalKeyWord
			:location "263:3-263:49"
		) ( struct-map
			KM3_Attribute
			:name "endConj"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_SBVRPropWithKW
			:type EndOperator
			:location "264:3-264:35"
		) ( struct-map
			KM3_Reference
			:name "proposition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_SBVRPropWithKW
			:type SBVRvoc_SimpleSBVRProp
			:location "265:3-265:51"
			:isContainer true
		)]
	) ) ( def SBVRvoc_ModalForm ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "modal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_ModalForm
			:type ModalVerb
			:location "272:3-272:31"
		) ( struct-map
			KM3_Attribute
			:name "isNeg"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_ModalForm
			:type Boolean
			:location "273:3-273:29"
		)]
	) ) ( def SBVRvoc_SimpleSBVRProp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "verbs"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_SimpleSBVRProp
			:type Verb
			:location "280:3-280:32"
		) ( struct-map
			KM3_Reference
			:name "modal"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SBVRvoc_SimpleSBVRProp
			:type SBVRvoc_ModalBegin
			:location "277:3-277:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "concept1"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_SimpleSBVRProp
			:type SBVRvoc_Concept
			:location "278:3-278:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "modalVerb"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SBVRvoc_SimpleSBVRProp
			:type SBVRvoc_ModalForm
			:location "279:3-279:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "concept2"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_SimpleSBVRProp
			:type SBVRvoc_Concept
			:location "281:3-281:41"
			:isContainer true
		)]
	) ) ( def SBVRvoc_SubSBVRProp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "join"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_SubSBVRProp
			:type Join
			:location "285:3-285:25"
		) ( struct-map
			KM3_Attribute
			:name "modalVerb"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SBVRvoc_SubSBVRProp
			:type ModalVerb
			:location "286:3-286:41"
		) ( struct-map
			KM3_Attribute
			:name "verbs"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_SubSBVRProp
			:type Verb
			:location "287:3-287:32"
		) ( struct-map
			KM3_Reference
			:name "concept2"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_SubSBVRProp
			:type SBVRvoc_Concept
			:location "288:3-288:41"
			:isContainer true
		)]
	) ) ( def SBVRvoc_LinkSBVRConcept ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "link"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_LinkSBVRConcept
			:type Link
			:location "292:3-292:25"
		) ( struct-map
			KM3_Reference
			:name "concept"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_LinkSBVRConcept
			:type SBVRvoc_Concept
			:location "293:3-293:40"
			:isContainer true
		)]
	) ) ( def SBVRvoc_ConjConcept ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "conjonction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_ConjConcept
			:type ConjonctionnalKeyWord
			:location "297:3-297:49"
		) ( struct-map
			KM3_Reference
			:name "concept"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_ConjConcept
			:type SBVRvoc_Concept
			:location "298:3-298:41"
			:isContainer true
		)]
	) ) ( def SBVRvoc_Concept ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "subProp"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SBVRvoc_Concept
			:type SBVRvoc_SubSBVRProp
			:location "302:3-302:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "linkedConcept"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SBVRvoc_Concept
			:type SBVRvoc_LinkSBVRConcept
			:location "303:3-303:60"
			:isContainer true
		)]
	) ) ( def SBVRvoc_NameConcept ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Concept]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "the"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SBVRvoc_NameConcept
			:type Qualif
			:location "307:3-307:32"
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_NameConcept
			:type SBVRvoc_NameWord
			:location "308:3-308:44"
			:isContainer true
		)]
	) ) ( def SBVRvoc_ObjectConcept ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Concept]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "operatoredConcept"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_ObjectConcept
			:type SBVRvoc_NounConcept
			:location "312:3-312:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "qualify"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SBVRvoc_ObjectConcept
			:type SBVRvoc_Qualification
			:location "313:3-313:52"
			:isContainer true
		)]
	) ) ( def SBVRvoc_StringConcept ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_Concept]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "stringWord"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_StringConcept
			:type SBVRvoc_QuotedStringWord
			:location "317:3-317:58"
			:isContainer true
		)]
	) ) ( def SBVRvoc_NounConcept ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "qualif"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SBVRvoc_NounConcept
			:type SBVRvoc_Qualifier
			:location "324:3-324:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "noun"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_NounConcept
			:type SBVRvoc_StringWord
			:location "325:3-325:47"
			:isContainer true
		)]
	) ) ( def SBVRvoc_Qualification ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "generalConcept"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_Qualification
			:type SBVRvoc_GeneralConcept
			:location "329:3-329:60"
			:isContainer true
		)]
	) ) ( def SBVRvoc_GeneralConcept ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[]
	) ) ( def SBVRvoc_NameGConcept ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_GeneralConcept]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_NameGConcept
			:type SBVRvoc_NameConcept
			:location "336:3-336:41"
			:isContainer true
		)]
	) ) ( def SBVRvoc_NounGConcept ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_GeneralConcept]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "noun"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_NounGConcept
			:type SBVRvoc_StringWord
			:location "340:3-340:46"
			:isContainer true
		)]
	) ) ( def SBVRvoc_Qualifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "op"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_Qualifier
			:type Qualif
			:location "352:3-352:25"
		) ( struct-map
			KM3_Attribute
			:name "endOperator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_Qualifier
			:type EndOperator
			:location "353:3-353:39"
		) ( struct-map
			KM3_Reference
			:name "min"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SBVRvoc_Qualifier
			:type SBVRvoc_StringWord
			:location "355:3-355:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "max"
			:upper 1
			:lower 0
			:isOrdered false
			:owner SBVRvoc_Qualifier
			:type SBVRvoc_StringWord
			:location "356:3-356:45"
			:isContainer true
		)]
	) ) ( def SBVRvoc_ModalBegin ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "endOperator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SBVRvoc_ModalBegin
			:type EndOperator
			:location "360:3-360:39"
		)]
	) ) ( def SBVRvoc_ModalBeginC ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SBVRvoc_ModalBegin]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "389:2-389:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "390:2-390:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "391:2-391:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "392:2-392:18"
	) )]
) )
