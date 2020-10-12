( declare BIBTEXML_BibtexFile )
( declare BIBTEXML_Author )
( declare BIBTEXML_Entry )
( declare BIBTEXML_AuthoredEntry )
( declare BIBTEXML_BookTitledEntry )
( declare BIBTEXML_InstitutionEntry )
( declare BIBTEXML_EditoredEntry )
( declare BIBTEXML_DatedEntry )
( declare BIBTEXML_JournalEntry )
( declare BIBTEXML_TitledEntry )
( declare BIBTEXML_NotedEntry )
( declare BIBTEXML_PublisheredEntry )
( declare BIBTEXML_SchoolEntry )
( declare BIBTEXML_Article )
( declare BIBTEXML_Book )
( declare BIBTEXML_Booklet )
( declare BIBTEXML_InBook )
( declare BIBTEXML_InCollection )
( declare BIBTEXML_Manual )
( declare BIBTEXML_TechReport )
( declare BIBTEXML_ThesisEntry )
( declare BIBTEXML_PhdThesis )
( declare BIBTEXML_MastersThesis )
( declare BIBTEXML_Proceedings )
( declare BIBTEXML_InProceedings )
( declare BIBTEXML_Conference )
( declare BIBTEXML_Unpublished )
( declare BIBTEXML_Misc )
( declare PrimitiveTypes_String )
( def BIBTEXML ( struct-map
	KM3_Package
	:contents[( def BIBTEXML_BibtexFile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "entries"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_BibtexFile
			:type BIBTEXML_Entry
			:location "12:6-12:45"
			:isContainer true
		)]
	) ) ( def BIBTEXML_Author ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BIBTEXML_Author
			:type String
			:location "16:3-16:27"
		)]
	) ) ( def BIBTEXML_Entry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BIBTEXML_Entry
			:type String
			:location "20:6-20:28"
		) ( struct-map
			KM3_Attribute
			:name "abstract"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Entry
			:type String
			:location "21:6-21:41"
		)]
	) ) ( def BIBTEXML_AuthoredEntry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BIBTEXML_Entry]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "authors"
			:upper -1
			:lower 1
			:isOrdered false
			:owner BIBTEXML_AuthoredEntry
			:type BIBTEXML_Author
			:location "29:6-29:48"
			:isContainer true
		)]
	) ) ( def BIBTEXML_BookTitledEntry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BIBTEXML_Entry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "booktitle"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BIBTEXML_BookTitledEntry
			:type String
			:location "33:3-33:32"
		)]
	) ) ( def BIBTEXML_InstitutionEntry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BIBTEXML_Entry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "institution"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BIBTEXML_InstitutionEntry
			:type String
			:location "41:3-41:34"
		)]
	) ) ( def BIBTEXML_EditoredEntry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BIBTEXML_Entry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "editor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BIBTEXML_EditoredEntry
			:type String
			:location "49:3-49:29"
		)]
	) ) ( def BIBTEXML_DatedEntry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BIBTEXML_Entry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BIBTEXML_DatedEntry
			:type String
			:location "53:3-53:27"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_DatedEntry
			:type String
			:location "54:3-54:33"
		)]
	) ) ( def BIBTEXML_JournalEntry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BIBTEXML_Entry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "journal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BIBTEXML_JournalEntry
			:type String
			:location "62:3-62:30"
		)]
	) ) ( def BIBTEXML_TitledEntry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BIBTEXML_Entry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BIBTEXML_TitledEntry
			:type String
			:location "66:3-66:28"
		)]
	) ) ( def BIBTEXML_NotedEntry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BIBTEXML_Entry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "note"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BIBTEXML_NotedEntry
			:type String
			:location "70:3-70:27"
		)]
	) ) ( def BIBTEXML_PublisheredEntry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BIBTEXML_Entry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "publisher"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BIBTEXML_PublisheredEntry
			:type String
			:location "90:3-90:32"
		)]
	) ) ( def BIBTEXML_SchoolEntry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BIBTEXML_Entry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "school"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BIBTEXML_SchoolEntry
			:type String
			:location "94:3-94:29"
		)]
	) ) ( def BIBTEXML_Article ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEXML_AuthoredEntry BIBTEXML_DatedEntry BIBTEXML_TitledEntry BIBTEXML_JournalEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "volume"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Article
			:type String
			:location "107:3-107:34"
		) ( struct-map
			KM3_Attribute
			:name "number"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Article
			:type String
			:location "108:3-108:34"
		) ( struct-map
			KM3_Attribute
			:name "pages"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Article
			:type String
			:location "109:3-109:33"
		) ( struct-map
			KM3_Attribute
			:name "note"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Article
			:type String
			:location "110:3-110:32"
		)]
	) ) ( def BIBTEXML_Book ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEXML_AuthoredEntry BIBTEXML_EditoredEntry BIBTEXML_PublisheredEntry BIBTEXML_DatedEntry BIBTEXML_TitledEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "volume"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Book
			:type String
			:location "114:3-114:34"
		) ( struct-map
			KM3_Attribute
			:name "number"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Book
			:type String
			:location "115:3-115:34"
		) ( struct-map
			KM3_Attribute
			:name "series"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Book
			:type String
			:location "116:3-116:34"
		) ( struct-map
			KM3_Attribute
			:name "address"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Book
			:type String
			:location "117:3-117:35"
		) ( struct-map
			KM3_Attribute
			:name "edition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Book
			:type String
			:location "118:3-118:35"
		) ( struct-map
			KM3_Attribute
			:name "note"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Book
			:type String
			:location "119:3-119:32"
		)]
	) ) ( def BIBTEXML_Booklet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEXML_DatedEntry BIBTEXML_TitledEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "howpublished"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BIBTEXML_Booklet
			:type String
			:location "124:3-124:35"
		) ( struct-map
			KM3_Attribute
			:name "address"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Booklet
			:type String
			:location "125:3-125:35"
		) ( struct-map
			KM3_Attribute
			:name "note"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Booklet
			:type String
			:location "126:3-126:32"
		) ( struct-map
			KM3_Reference
			:name "authors"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Booklet
			:type BIBTEXML_Author
			:location "123:3-123:33"
			:isContainer false
		)]
	) ) ( def BIBTEXML_InBook ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEXML_Book]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "chapter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BIBTEXML_InBook
			:type String
			:location "130:3-130:30"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BIBTEXML_InBook
			:type String
			:location "131:3-131:27"
		)]
	) ) ( def BIBTEXML_InCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEXML_Book BIBTEXML_BookTitledEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "chapter"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_InCollection
			:type String
			:location "135:3-135:35"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_InCollection
			:type String
			:location "136:3-136:32"
		)]
	) ) ( def BIBTEXML_Manual ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEXML_TitledEntry BIBTEXML_AuthoredEntry BIBTEXML_DatedEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "organization"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Manual
			:type String
			:location "140:3-140:40"
		) ( struct-map
			KM3_Attribute
			:name "address"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Manual
			:type String
			:location "141:3-141:35"
		) ( struct-map
			KM3_Attribute
			:name "edition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Manual
			:type String
			:location "142:3-142:35"
		) ( struct-map
			KM3_Attribute
			:name "note"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Manual
			:type String
			:location "143:3-143:32"
		)]
	) ) ( def BIBTEXML_TechReport ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEXML_AuthoredEntry BIBTEXML_InstitutionEntry BIBTEXML_DatedEntry BIBTEXML_TitledEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_TechReport
			:type String
			:location "147:3-147:32"
		) ( struct-map
			KM3_Attribute
			:name "number"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_TechReport
			:type String
			:location "148:3-148:34"
		) ( struct-map
			KM3_Attribute
			:name "address"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_TechReport
			:type String
			:location "149:3-149:35"
		) ( struct-map
			KM3_Attribute
			:name "note"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_TechReport
			:type String
			:location "150:3-150:32"
		)]
	) ) ( def BIBTEXML_ThesisEntry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BIBTEXML_AuthoredEntry BIBTEXML_DatedEntry BIBTEXML_TitledEntry BIBTEXML_SchoolEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_ThesisEntry
			:type String
			:location "154:3-154:32"
		) ( struct-map
			KM3_Attribute
			:name "address"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_ThesisEntry
			:type String
			:location "155:3-155:35"
		) ( struct-map
			KM3_Attribute
			:name "note"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_ThesisEntry
			:type String
			:location "156:3-156:32"
		)]
	) ) ( def BIBTEXML_PhdThesis ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEXML_ThesisEntry]
		:structuralFeatures[]
	) ) ( def BIBTEXML_MastersThesis ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEXML_ThesisEntry]
		:structuralFeatures[]
	) ) ( def BIBTEXML_Proceedings ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEXML_DatedEntry BIBTEXML_TitledEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "editor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Proceedings
			:type String
			:location "164:3-164:34"
		) ( struct-map
			KM3_Attribute
			:name "volume"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Proceedings
			:type String
			:location "165:3-165:34"
		) ( struct-map
			KM3_Attribute
			:name "number"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Proceedings
			:type String
			:location "166:3-166:34"
		) ( struct-map
			KM3_Attribute
			:name "series"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Proceedings
			:type String
			:location "167:3-167:34"
		) ( struct-map
			KM3_Attribute
			:name "address"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Proceedings
			:type String
			:location "168:3-168:35"
		) ( struct-map
			KM3_Attribute
			:name "organization"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Proceedings
			:type String
			:location "169:3-169:40"
		) ( struct-map
			KM3_Attribute
			:name "publisher"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Proceedings
			:type String
			:location "170:3-170:37"
		) ( struct-map
			KM3_Attribute
			:name "note"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Proceedings
			:type String
			:location "171:3-171:32"
		)]
	) ) ( def BIBTEXML_InProceedings ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEXML_AuthoredEntry BIBTEXML_BookTitledEntry BIBTEXML_Proceedings]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "pages"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_InProceedings
			:type String
			:location "175:3-175:33"
		)]
	) ) ( def BIBTEXML_Conference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEXML_InProceedings]
		:structuralFeatures[]
	) ) ( def BIBTEXML_Unpublished ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEXML_AuthoredEntry BIBTEXML_TitledEntry BIBTEXML_NotedEntry BIBTEXML_DatedEntry]
		:structuralFeatures[]
	) ) ( def BIBTEXML_Misc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEXML_Entry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Misc
			:type String
			:location "184:3-184:33"
		) ( struct-map
			KM3_Attribute
			:name "howpublished"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Misc
			:type String
			:location "185:3-185:40"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Misc
			:type String
			:location "186:3-186:33"
		) ( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Misc
			:type String
			:location "187:3-187:32"
		) ( struct-map
			KM3_Attribute
			:name "note"
			:upper 1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Misc
			:type String
			:location "188:3-188:32"
		) ( struct-map
			KM3_Reference
			:name "authors"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BIBTEXML_Misc
			:type BIBTEXML_Author
			:location "183:3-183:33"
			:isContainer false
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "194:3-194:19"
	) )]
) )
