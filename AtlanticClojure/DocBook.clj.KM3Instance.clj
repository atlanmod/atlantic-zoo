( declare DocBook_DocBook )
( declare DocBook_Book )
( declare DocBook_TitledElement )
( declare DocBook_Article )
( declare DocBook_Sect1 )
( declare DocBook_Para )
( declare PrimitiveTypes_String )
( def DocBook ( struct-map
	KM3_Package
	:contents[( def DocBook_DocBook ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "books"
			:upper -1
			:lower 1
			:isOrdered true
			:owner DocBook_DocBook
			:type DocBook_Book
			:location "11:3-11:49"
			:isContainer true
		)]
	) ) ( def DocBook_Book ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "articles"
			:upper -1
			:lower 1
			:isOrdered true
			:owner DocBook_Book
			:type DocBook_Article
			:location "15:3-15:55"
			:isContainer true
		)]
	) ) ( def DocBook_TitledElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DocBook_TitledElement
			:type String
			:location "19:3-19:28"
		)]
	) ) ( def DocBook_Article ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DocBook_TitledElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sections_1"
			:upper -1
			:lower 1
			:isOrdered true
			:owner DocBook_Article
			:type DocBook_Sect1
			:location "23:3-23:56"
			:isContainer true
		)]
	) ) ( def DocBook_Sect1 ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DocBook_TitledElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "paras"
			:upper -1
			:lower 1
			:isOrdered true
			:owner DocBook_Sect1
			:type DocBook_Para
			:location "27:3-27:49"
			:isContainer true
		)]
	) ) ( def DocBook_Para ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "content"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DocBook_Para
			:type String
			:location "31:3-31:30"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "36:2-36:18"
	) )]
) )
