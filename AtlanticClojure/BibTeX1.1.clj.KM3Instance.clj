( declare BibTeX_BibTeXFile )
( declare BibTeX_Author )
( declare BibTeX_BibTeXEntry )
( declare BibTeX_AuthoredEntry )
( declare BibTeX_DatedEntry )
( declare BibTeX_TitledEntry )
( declare BibTeX_BookTitledEntry )
( declare BibTeX_Article )
( declare BibTeX_TechReport )
( declare BibTeX_Unpublished )
( declare BibTeX_Manual )
( declare BibTeX_Proceedings )
( declare BibTeX_InProceedings )
( declare BibTeX_Booklet )
( declare BibTeX_Book )
( declare BibTeX_InCollection )
( declare BibTeX_InBook )
( declare BibTeX_Misc )
( declare BibTeX_ThesisEntry )
( declare BibTeX_PhDThesis )
( declare BibTeX_MasterThesis )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def BibTeX ( struct-map
	KM3_Package
	:contents[( def BibTeX_BibTeXFile ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "entries"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BibTeX_BibTeXFile
			:type BibTeX_BibTeXEntry
			:location "12:5-12:50"
			:isContainer true
		)]
	) ) ( def BibTeX_Author ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BibTeX_Author
			:type String
			:location "16:5-16:31"
		)]
	) ) ( def BibTeX_BibTeXEntry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BibTeX_BibTeXEntry
			:type String
			:location "20:5-20:27"
		)]
	) ) ( def BibTeX_AuthoredEntry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BibTeX_BibTeXEntry]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "authors"
			:upper -1
			:lower 1
			:isOrdered false
			:owner BibTeX_AuthoredEntry
			:type BibTeX_Author
			:location "24:5-24:47"
			:isContainer true
		)]
	) ) ( def BibTeX_DatedEntry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BibTeX_BibTeXEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BibTeX_DatedEntry
			:type String
			:location "28:5-28:29"
		)]
	) ) ( def BibTeX_TitledEntry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BibTeX_BibTeXEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BibTeX_TitledEntry
			:type String
			:location "32:5-32:30"
		)]
	) ) ( def BibTeX_BookTitledEntry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BibTeX_BibTeXEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "booktitle"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BibTeX_BookTitledEntry
			:type String
			:location "36:5-36:34"
		)]
	) ) ( def BibTeX_Article ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BibTeX_AuthoredEntry BibTeX_DatedEntry BibTeX_TitledEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "journal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BibTeX_Article
			:type String
			:location "40:5-40:32"
		)]
	) ) ( def BibTeX_TechReport ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BibTeX_AuthoredEntry BibTeX_DatedEntry BibTeX_TitledEntry]
		:structuralFeatures[]
	) ) ( def BibTeX_Unpublished ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BibTeX_AuthoredEntry BibTeX_TitledEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "note"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BibTeX_Unpublished
			:type String
			:location "47:5-47:29"
		)]
	) ) ( def BibTeX_Manual ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BibTeX_TitledEntry]
		:structuralFeatures[]
	) ) ( def BibTeX_Proceedings ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BibTeX_DatedEntry BibTeX_TitledEntry]
		:structuralFeatures[]
	) ) ( def BibTeX_InProceedings ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BibTeX_Proceedings BibTeX_AuthoredEntry BibTeX_BookTitledEntry]
		:structuralFeatures[]
	) ) ( def BibTeX_Booklet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BibTeX_DatedEntry]
		:structuralFeatures[]
	) ) ( def BibTeX_Book ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BibTeX_AuthoredEntry BibTeX_DatedEntry BibTeX_TitledEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "publisher"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BibTeX_Book
			:type String
			:location "63:5-63:34"
		)]
	) ) ( def BibTeX_InCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BibTeX_Book BibTeX_BookTitledEntry]
		:structuralFeatures[]
	) ) ( def BibTeX_InBook ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BibTeX_Book]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "chapter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BibTeX_InBook
			:type Integer
			:location "70:5-70:33"
		)]
	) ) ( def BibTeX_Misc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BibTeX_BibTeXEntry]
		:structuralFeatures[]
	) ) ( def BibTeX_ThesisEntry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BibTeX_AuthoredEntry BibTeX_DatedEntry BibTeX_TitledEntry]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "school"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BibTeX_ThesisEntry
			:type String
			:location "77:5-77:31"
		)]
	) ) ( def BibTeX_PhDThesis ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BibTeX_ThesisEntry]
		:structuralFeatures[]
	) ) ( def BibTeX_MasterThesis ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BibTeX_ThesisEntry]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "88:3-88:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "89:3-89:20"
	) )]
) )
