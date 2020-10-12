( declare BIBTEX_LocatedElement )
( declare BIBTEX_Bibtex )
( declare BIBTEX_Entry )
( declare BIBTEX_Article )
( declare BIBTEX_Book )
( declare BIBTEX_Inbook )
( declare BIBTEX_Booklet )
( declare BIBTEX_Inproceedings )
( declare BIBTEX_Proceedings )
( declare BIBTEX_Incollection )
( declare BIBTEX_Techreport )
( declare BIBTEX_PhdThesis )
( declare BIBTEX_MastersThesis )
( declare BIBTEX_Manual )
( declare BIBTEX_Misc )
( declare BIBTEX_Field )
( declare BIBTEX_Authors )
( declare BIBTEX_AuthorUrls )
( declare BIBTEX_Title )
( declare BIBTEX_Journal )
( declare BIBTEX_BookTitle )
( declare BIBTEX_Institution )
( declare BIBTEX_Organization )
( declare BIBTEX_Type )
( declare BIBTEX_Day )
( declare BIBTEX_Number )
( declare BIBTEX_Chapter )
( declare BIBTEX_Volume )
( declare BIBTEX_Series )
( declare BIBTEX_Pages )
( declare BIBTEX_Publisher )
( declare BIBTEX_Howpublished )
( declare BIBTEX_School )
( declare BIBTEX_Editor )
( declare BIBTEX_Edition )
( declare BIBTEX_Address )
( declare BIBTEX_Year )
( declare BIBTEX_Month )
( declare BIBTEX_Note )
( declare BIBTEX_Text )
( declare BIBTEX_AbstractField )
( declare BIBTEX_Isbn )
( declare BIBTEX_Issn )
( declare BIBTEX_Url )
( declare BIBTEX_Doi )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def BIBTEX ( struct-map
	KM3_Package
	:contents[( def BIBTEX_LocatedElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BIBTEX_LocatedElement
			:type String
			:location "12:3-12:31"
		) ( struct-map
			KM3_Attribute
			:name "commentsBefore"
			:upper -1
			:lower 0
			:isOrdered true
			:owner BIBTEX_LocatedElement
			:type String
			:location "13:3-13:48"
		) ( struct-map
			KM3_Attribute
			:name "commentsAfter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner BIBTEX_LocatedElement
			:type String
			:location "14:3-14:47"
		)]
	) ) ( def BIBTEX_Bibtex ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "entries"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BIBTEX_Bibtex
			:type BIBTEX_Entry
			:location "18:3-18:42"
			:isContainer true
		)]
	) ) ( def BIBTEX_Entry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[BIBTEX_LocatedElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BIBTEX_Entry
			:type String
			:location "23:3-23:26"
		) ( struct-map
			KM3_Reference
			:name "fields"
			:upper -1
			:lower 0
			:isOrdered false
			:owner BIBTEX_Entry
			:type BIBTEX_Field
			:location "24:3-24:41"
			:isContainer true
		)]
	) ) ( def BIBTEX_Article ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Entry]
		:structuralFeatures[]
	) ) ( def BIBTEX_Book ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Entry]
		:structuralFeatures[]
	) ) ( def BIBTEX_Inbook ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Entry]
		:structuralFeatures[]
	) ) ( def BIBTEX_Booklet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Entry]
		:structuralFeatures[]
	) ) ( def BIBTEX_Inproceedings ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Entry]
		:structuralFeatures[]
	) ) ( def BIBTEX_Proceedings ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Entry]
		:structuralFeatures[]
	) ) ( def BIBTEX_Incollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Entry]
		:structuralFeatures[]
	) ) ( def BIBTEX_Techreport ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Entry]
		:structuralFeatures[]
	) ) ( def BIBTEX_PhdThesis ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Entry]
		:structuralFeatures[]
	) ) ( def BIBTEX_MastersThesis ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Entry]
		:structuralFeatures[]
	) ) ( def BIBTEX_Manual ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Entry]
		:structuralFeatures[]
	) ) ( def BIBTEX_Misc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Entry]
		:structuralFeatures[]
	) ) ( def BIBTEX_Field ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner BIBTEX_Field
			:type String
			:location "54:4-54:29"
		)]
	) ) ( def BIBTEX_Authors ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_AuthorUrls ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Title ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Journal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_BookTitle ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Institution ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Organization ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Type ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Day ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Number ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Chapter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Volume ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Series ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Pages ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Publisher ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Howpublished ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_School ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Editor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Edition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Address ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Year ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Month ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Note ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Text ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_AbstractField ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Isbn ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Issn ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Url ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) ) ( def BIBTEX_Doi ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[BIBTEX_Field]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "118:2-118:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "119:2-119:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "120:2-120:18"
	) )]
) )
