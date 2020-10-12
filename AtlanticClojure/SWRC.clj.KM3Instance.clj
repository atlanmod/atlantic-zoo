( declare SWRC_Bibliography )
( declare SWRC_Publication )
( declare SWRC_Article )
( declare SWRC_Book )
( declare SWRC_InBook )
( declare SWRC_Booklet )
( declare SWRC_InCollection )
( declare SWRC_InProceedings )
( declare SWRC_Proceedings )
( declare SWRC_Manual )
( declare SWRC_Misc )
( declare SWRC_Unpublished )
( declare SWRC_Thesis )
( declare SWRC_MasterThesis )
( declare SWRC_PhDThesis )
( declare SWRC_Report )
( declare SWRC_ProjectReport )
( declare SWRC_TechnicalReport )
( declare SWRC_Event )
( declare SWRC_Conference )
( declare SWRC_Workshop )
( declare SWRC_Exhibition )
( declare SWRC_Lecture )
( declare SWRC_Meeting )
( declare SWRC_ProjectMeeting )
( declare SWRC_Person )
( declare SWRC_Employee )
( declare SWRC_Manager )
( declare SWRC_AdministrativeStaff )
( declare SWRC_TechnicalStaff )
( declare SWRC_AcademicStaff )
( declare SWRC_Lecturer )
( declare SWRC_FacultyMember )
( declare SWRC_FullProfessor )
( declare SWRC_AssistantProfessor )
( declare SWRC_AssociateProfessor )
( declare SWRC_Student )
( declare SWRC_Undergraduate )
( declare SWRC_Graduate )
( declare SWRC_PhDStudent )
( declare SWRC_Organization )
( declare SWRC_ResearchGroup )
( declare SWRC_Association )
( declare SWRC_Department )
( declare SWRC_Institute )
( declare SWRC_Enterprise )
( declare SWRC_University )
( declare SWRC_Project )
( declare SWRC_ResearchProject )
( declare SWRC_DevelopmentProject )
( declare SWRC_SoftwareProject )
( declare SWRC_Product )
( declare SWRC_SoftwareComponent )
( declare SWRC_Topic )
( declare SWRC_ResearchTopic )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def SWRC ( struct-map
	KM3_Package
	:contents[( def SWRC_Bibliography ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "publications"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SWRC_Bibliography
			:type SWRC_Publication
			:location "12:3-12:53"
			:isContainer true
		)]
	) ) ( def SWRC_Publication ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Publication
			:type String
			:location "16:3-16:28"
		) ( struct-map
			KM3_Attribute
			:name "abstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Publication
			:type String
			:location "17:3-17:33"
		) ( struct-map
			KM3_Attribute
			:name "keywords"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Publication
			:type String
			:location "18:3-18:31"
		) ( struct-map
			KM3_Attribute
			:name "note"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Publication
			:type String
			:location "19:3-19:27"
		) ( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Publication
			:type Integer
			:location "20:3-20:28"
		)]
	) ) ( def SWRC_Article ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Publication]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "journal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Article
			:type String
			:location "24:3-24:30"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Article
			:type String
			:location "25:3-25:28"
		) ( struct-map
			KM3_Attribute
			:name "number"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Article
			:type Integer
			:location "26:3-26:30"
		) ( struct-map
			KM3_Attribute
			:name "pages"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Article
			:type String
			:location "27:3-27:28"
		) ( struct-map
			KM3_Attribute
			:name "volume"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Article
			:type Integer
			:location "28:3-28:30"
		) ( struct-map
			KM3_Reference
			:name "author"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SWRC_Article
			:type SWRC_Person
			:location "23:3-23:34"
			:isContainer false
		)]
	) ) ( def SWRC_Book ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Publication]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Book
			:type String
			:location "31:3-31:28"
		) ( struct-map
			KM3_Attribute
			:name "number"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Book
			:type Integer
			:location "32:3-32:30"
		) ( struct-map
			KM3_Attribute
			:name "volume"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Book
			:type Integer
			:location "33:3-33:30"
		) ( struct-map
			KM3_Attribute
			:name "series"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Book
			:type String
			:location "34:3-34:29"
		) ( struct-map
			KM3_Attribute
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Book
			:type String
			:location "35:3-35:29"
		) ( struct-map
			KM3_Attribute
			:name "address"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Book
			:type String
			:location "36:3-36:30"
		) ( struct-map
			KM3_Attribute
			:name "edition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Book
			:type String
			:location "37:3-37:30"
		) ( struct-map
			KM3_Attribute
			:name "isbn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Book
			:type String
			:location "38:3-38:27"
		) ( struct-map
			KM3_Attribute
			:name "price"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Book
			:type String
			:location "39:3-39:28"
		) ( struct-map
			KM3_Reference
			:name "editor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Book
			:type SWRC_Person
			:location "40:3-40:29"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "publisher"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Book
			:type SWRC_Organization
			:location "41:3-41:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "author"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SWRC_Book
			:type SWRC_Person
			:location "42:3-42:34"
			:isContainer false
		)]
	) ) ( def SWRC_InBook ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Publication]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InBook
			:type String
			:location "49:3-49:28"
		) ( struct-map
			KM3_Attribute
			:name "number"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InBook
			:type Integer
			:location "50:3-50:30"
		) ( struct-map
			KM3_Attribute
			:name "pages"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InBook
			:type String
			:location "51:3-51:28"
		) ( struct-map
			KM3_Attribute
			:name "volume"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InBook
			:type Integer
			:location "52:3-52:30"
		) ( struct-map
			KM3_Attribute
			:name "series"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InBook
			:type String
			:location "53:3-53:29"
		) ( struct-map
			KM3_Attribute
			:name "chapter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InBook
			:type String
			:location "54:3-54:30"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InBook
			:type String
			:location "55:3-55:27"
		) ( struct-map
			KM3_Attribute
			:name "address"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InBook
			:type String
			:location "56:3-56:30"
		) ( struct-map
			KM3_Reference
			:name "author"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SWRC_InBook
			:type SWRC_Person
			:location "46:3-46:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "publisher"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InBook
			:type SWRC_Organization
			:location "47:3-47:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "editor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InBook
			:type SWRC_Person
			:location "48:3-48:29"
			:isContainer false
		)]
	) ) ( def SWRC_Booklet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Publication]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Booklet
			:type String
			:location "60:3-60:28"
		) ( struct-map
			KM3_Attribute
			:name "address"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Booklet
			:type String
			:location "61:3-61:30"
		) ( struct-map
			KM3_Attribute
			:name "edition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Booklet
			:type String
			:location "62:3-62:30"
		) ( struct-map
			KM3_Attribute
			:name "howpublished"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Booklet
			:type String
			:location "63:3-63:35"
		) ( struct-map
			KM3_Reference
			:name "author"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SWRC_Booklet
			:type SWRC_Person
			:location "59:3-59:34"
			:isContainer false
		)]
	) ) ( def SWRC_InCollection ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Publication]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InCollection
			:type String
			:location "69:3-69:28"
		) ( struct-map
			KM3_Attribute
			:name "number"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InCollection
			:type Integer
			:location "70:3-70:30"
		) ( struct-map
			KM3_Attribute
			:name "pages"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InCollection
			:type String
			:location "71:3-71:28"
		) ( struct-map
			KM3_Attribute
			:name "address"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InCollection
			:type String
			:location "72:3-72:30"
		) ( struct-map
			KM3_Attribute
			:name "edition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InCollection
			:type String
			:location "73:3-73:30"
		) ( struct-map
			KM3_Attribute
			:name "volume"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InCollection
			:type Integer
			:location "74:3-74:30"
		) ( struct-map
			KM3_Attribute
			:name "series"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InCollection
			:type String
			:location "75:3-75:29"
		) ( struct-map
			KM3_Attribute
			:name "chapter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InCollection
			:type String
			:location "76:3-76:30"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InCollection
			:type String
			:location "77:3-77:27"
		) ( struct-map
			KM3_Attribute
			:name "booktitle"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InCollection
			:type String
			:location "78:3-78:32"
		) ( struct-map
			KM3_Reference
			:name "editor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InCollection
			:type SWRC_Person
			:location "66:3-66:29"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "author"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SWRC_InCollection
			:type SWRC_Person
			:location "67:3-67:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "publisher"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InCollection
			:type SWRC_Organization
			:location "68:3-68:38"
			:isContainer false
		)]
	) ) ( def SWRC_InProceedings ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Publication]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InProceedings
			:type String
			:location "83:3-83:28"
		) ( struct-map
			KM3_Attribute
			:name "number"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InProceedings
			:type Integer
			:location "84:3-84:30"
		) ( struct-map
			KM3_Attribute
			:name "pages"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InProceedings
			:type String
			:location "85:3-85:28"
		) ( struct-map
			KM3_Attribute
			:name "address"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InProceedings
			:type String
			:location "86:3-86:30"
		) ( struct-map
			KM3_Attribute
			:name "volume"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InProceedings
			:type Integer
			:location "87:3-87:30"
		) ( struct-map
			KM3_Attribute
			:name "series"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InProceedings
			:type String
			:location "88:3-88:29"
		) ( struct-map
			KM3_Attribute
			:name "booktitle"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InProceedings
			:type String
			:location "89:3-89:32"
		) ( struct-map
			KM3_Reference
			:name "editor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InProceedings
			:type SWRC_Person
			:location "81:3-81:29"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "author"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SWRC_InProceedings
			:type SWRC_Person
			:location "82:3-82:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "organization"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InProceedings
			:type SWRC_Organization
			:location "90:3-90:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "publisher"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_InProceedings
			:type SWRC_Organization
			:location "91:3-91:38"
			:isContainer false
		)]
	) ) ( def SWRC_Proceedings ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Publication]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Proceedings
			:type String
			:location "97:3-97:28"
		) ( struct-map
			KM3_Attribute
			:name "number"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Proceedings
			:type String
			:location "98:3-98:29"
		) ( struct-map
			KM3_Attribute
			:name "volume"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Proceedings
			:type String
			:location "99:3-99:29"
		) ( struct-map
			KM3_Attribute
			:name "address"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Proceedings
			:type String
			:location "100:3-100:30"
		) ( struct-map
			KM3_Attribute
			:name "series"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Proceedings
			:type String
			:location "101:3-101:29"
		) ( struct-map
			KM3_Reference
			:name "editor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Proceedings
			:type SWRC_Person
			:location "94:3-94:29"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "publisher"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Proceedings
			:type SWRC_Organization
			:location "95:3-95:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "organization"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Proceedings
			:type SWRC_Organization
			:location "96:3-96:41"
			:isContainer false
		)]
	) ) ( def SWRC_Manual ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Publication]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Manual
			:type String
			:location "106:3-106:28"
		) ( struct-map
			KM3_Attribute
			:name "address"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Manual
			:type String
			:location "107:3-107:30"
		) ( struct-map
			KM3_Attribute
			:name "edition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Manual
			:type String
			:location "108:3-108:30"
		) ( struct-map
			KM3_Reference
			:name "author"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SWRC_Manual
			:type SWRC_Person
			:location "104:3-104:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "organization"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Manual
			:type SWRC_Organization
			:location "105:3-105:41"
			:isContainer false
		)]
	) ) ( def SWRC_Misc ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Publication]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Misc
			:type String
			:location "111:3-111:28"
		) ( struct-map
			KM3_Attribute
			:name "howpublished"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Misc
			:type String
			:location "112:3-112:35"
		)]
	) ) ( def SWRC_Unpublished ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Publication]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Unpublished
			:type String
			:location "116:3-116:28"
		) ( struct-map
			KM3_Reference
			:name "author"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SWRC_Unpublished
			:type SWRC_Person
			:location "115:3-115:34"
			:isContainer false
		)]
	) ) ( def SWRC_Thesis ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SWRC_Publication]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Thesis
			:type String
			:location "121:3-121:28"
		) ( struct-map
			KM3_Attribute
			:name "address"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Thesis
			:type String
			:location "122:3-122:30"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Thesis
			:type String
			:location "123:3-123:27"
		) ( struct-map
			KM3_Reference
			:name "author"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SWRC_Thesis
			:type SWRC_Person
			:location "119:3-119:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "school"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Thesis
			:type SWRC_University
			:location "120:3-120:33"
			:isContainer false
		)]
	) ) ( def SWRC_MasterThesis ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Thesis]
		:structuralFeatures[]
	) ) ( def SWRC_PhDThesis ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Thesis]
		:structuralFeatures[]
	) ) ( def SWRC_Report ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[SWRC_Publication]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "author"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SWRC_Report
			:type SWRC_Person
			:location "128:3-128:32"
			:isContainer false
		)]
	) ) ( def SWRC_ProjectReport ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Report]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "describesProject"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_ProjectReport
			:type SWRC_Project
			:location "131:3-131:63"
			:isContainer false
			:opposite projectInfo
		)]
	) ) ( def SWRC_TechnicalReport ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Report]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "series"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_TechnicalReport
			:type String
			:location "134:3-134:29"
		) ( struct-map
			KM3_Reference
			:name "organization"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_TechnicalReport
			:type SWRC_Organization
			:location "135:3-135:41"
			:isContainer false
		)]
	) ) ( def SWRC_Event ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Event
			:type String
			:location "141:3-141:27"
		) ( struct-map
			KM3_Attribute
			:name "date"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Event
			:type String
			:location "142:3-142:27"
		) ( struct-map
			KM3_Attribute
			:name "eventTitle"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Event
			:type String
			:location "143:3-143:33"
		) ( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Event
			:type String
			:location "144:3-144:31"
		) ( struct-map
			KM3_Reference
			:name "atEvent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Event
			:type SWRC_Event
			:location "145:3-145:53"
			:isContainer false
			:opposite hasPartEvent
		) ( struct-map
			KM3_Reference
			:name "hasPartEvent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Event
			:type SWRC_Event
			:location "146:3-146:53"
			:isContainer false
			:opposite atEvent
		)]
	) ) ( def SWRC_Conference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Event]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "series"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Conference
			:type String
			:location "149:3-149:29"
		)]
	) ) ( def SWRC_Workshop ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Event]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "series"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Workshop
			:type String
			:location "152:3-152:29"
		)]
	) ) ( def SWRC_Exhibition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Event]
		:structuralFeatures[]
	) ) ( def SWRC_Lecture ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Event]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "givenBy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Lecture
			:type SWRC_Person
			:location "156:3-156:30"
			:isContainer false
		)]
	) ) ( def SWRC_Meeting ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Event]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Meeting
			:type String
			:location "159:3-159:28"
		) ( struct-map
			KM3_Reference
			:name "participant"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SWRC_Meeting
			:type SWRC_Person
			:location "160:3-160:37"
			:isContainer false
		)]
	) ) ( def SWRC_ProjectMeeting ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Meeting]
		:structuralFeatures[]
	) ) ( def SWRC_Person ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "address"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Person
			:type String
			:location "167:3-167:30"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Person
			:type String
			:location "168:3-168:27"
		) ( struct-map
			KM3_Attribute
			:name "email"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Person
			:type String
			:location "169:3-169:28"
		) ( struct-map
			KM3_Attribute
			:name "fax"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Person
			:type String
			:location "170:3-170:26"
		) ( struct-map
			KM3_Attribute
			:name "homepage"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Person
			:type String
			:location "171:3-171:31"
		) ( struct-map
			KM3_Attribute
			:name "phone"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Person
			:type String
			:location "172:3-172:28"
		) ( struct-map
			KM3_Attribute
			:name "photo"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Person
			:type String
			:location "173:3-173:28"
		)]
	) ) ( def SWRC_Employee ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Person]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "affiliation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Employee
			:type SWRC_Organization
			:location "178:3-178:59"
			:isContainer false
			:opposite employs
		)]
	) ) ( def SWRC_Manager ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Employee]
		:structuralFeatures[]
	) ) ( def SWRC_AdministrativeStaff ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Employee]
		:structuralFeatures[]
	) ) ( def SWRC_TechnicalStaff ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Employee]
		:structuralFeatures[]
	) ) ( def SWRC_AcademicStaff ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Person]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cooperateWith"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SWRC_AcademicStaff
			:type SWRC_AcademicStaff
			:location "187:3-187:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "editor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_AcademicStaff
			:type SWRC_Publication
			:location "188:3-188:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "headOf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_AcademicStaff
			:type SWRC_Project
			:location "189:3-189:46"
			:isContainer false
			:opposite head
		) ( struct-map
			KM3_Reference
			:name "headOfGroup"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_AcademicStaff
			:type SWRC_ResearchGroup
			:location "190:3-190:57"
			:isContainer false
			:opposite head
		) ( struct-map
			KM3_Reference
			:name "memberOfPC"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_AcademicStaff
			:type SWRC_Event
			:location "191:3-191:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "organizerOrChairOf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_AcademicStaff
			:type SWRC_Event
			:location "192:3-192:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "publication"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SWRC_AcademicStaff
			:type SWRC_Publication
			:location "193:3-193:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "supervises"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SWRC_AcademicStaff
			:type SWRC_PhDStudent
			:location "194:3-194:62"
			:isContainer false
			:opposite supervisor
		) ( struct-map
			KM3_Reference
			:name "worksAtProject"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_AcademicStaff
			:type SWRC_ResearchTopic
			:location "195:3-195:68"
			:isContainer false
			:opposite isWorkedOnBy
		)]
	) ) ( def SWRC_Lecturer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_AcademicStaff]
		:structuralFeatures[]
	) ) ( def SWRC_FacultyMember ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_AcademicStaff]
		:structuralFeatures[]
	) ) ( def SWRC_FullProfessor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_FacultyMember]
		:structuralFeatures[]
	) ) ( def SWRC_AssistantProfessor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_FacultyMember]
		:structuralFeatures[]
	) ) ( def SWRC_AssociateProfessor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_FacultyMember]
		:structuralFeatures[]
	) ) ( def SWRC_Student ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Person]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "studiesAt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Student
			:type SWRC_University
			:location "208:3-208:36"
			:isContainer false
		)]
	) ) ( def SWRC_Undergraduate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Student]
		:structuralFeatures[]
	) ) ( def SWRC_Graduate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Student]
		:structuralFeatures[]
	) ) ( def SWRC_PhDStudent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Graduate]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "publication"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SWRC_PhDStudent
			:type SWRC_Publication
			:location "213:3-213:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "worksAtProject"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_PhDStudent
			:type SWRC_Project
			:location "214:3-214:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "supervisor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_PhDStudent
			:type SWRC_AcademicStaff
			:location "215:3-215:62"
			:isContainer false
			:opposite supervises
		)]
	) ) ( def SWRC_Organization ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Organization
			:type String
			:location "222:3-222:31"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Organization
			:type String
			:location "223:3-223:27"
		) ( struct-map
			KM3_Reference
			:name "carriesOut"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SWRC_Organization
			:type SWRC_Project
			:location "224:3-224:61"
			:isContainer false
			:opposite carriedOutBy
		) ( struct-map
			KM3_Reference
			:name "develops"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SWRC_Organization
			:type SWRC_Product
			:location "225:3-225:58"
			:isContainer false
			:opposite developedBy
		) ( struct-map
			KM3_Reference
			:name "employs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SWRC_Organization
			:type SWRC_Employee
			:location "226:3-226:58"
			:isContainer false
			:opposite affiliation
		) ( struct-map
			KM3_Reference
			:name "finances"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SWRC_Organization
			:type SWRC_Project
			:location "227:3-227:57"
			:isContainer false
			:opposite financedBy
		) ( struct-map
			KM3_Reference
			:name "publishes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SWRC_Organization
			:type SWRC_Publication
			:location "228:3-228:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "technicalReport"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SWRC_Organization
			:type SWRC_TechnicalReport
			:location "229:3-229:50"
			:isContainer false
		)]
	) ) ( def SWRC_ResearchGroup ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Organization]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "head"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_ResearchGroup
			:type SWRC_AcademicStaff
			:location "232:3-232:57"
			:isContainer false
			:opposite headOfGroup
		) ( struct-map
			KM3_Reference
			:name "member"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SWRC_ResearchGroup
			:type SWRC_Employee
			:location "233:3-233:34"
			:isContainer false
		)]
	) ) ( def SWRC_Association ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Organization]
		:structuralFeatures[]
	) ) ( def SWRC_Department ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Organization]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "hasParts"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Department
			:type SWRC_Institute
			:location "237:3-237:34"
			:isContainer false
		)]
	) ) ( def SWRC_Institute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Organization]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cooperateWith"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Institute
			:type SWRC_Institute
			:location "240:3-240:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "hasParts"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SWRC_Institute
			:type SWRC_ResearchGroup
			:location "241:3-241:41"
			:isContainer false
		)]
	) ) ( def SWRC_Enterprise ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Organization]
		:structuralFeatures[]
	) ) ( def SWRC_University ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Organization]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "hasParts"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SWRC_University
			:type SWRC_Department
			:location "245:3-245:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "student"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SWRC_University
			:type SWRC_Student
			:location "246:3-246:44"
			:isContainer true
		)]
	) ) ( def SWRC_Project ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Project
			:type String
			:location "252:3-252:27"
		) ( struct-map
			KM3_Reference
			:name "carriedOutBy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Project
			:type SWRC_Organization
			:location "253:3-253:63"
			:isContainer false
			:opposite carriesOut
		) ( struct-map
			KM3_Reference
			:name "financedBy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Project
			:type SWRC_Organization
			:location "254:3-254:59"
			:isContainer false
			:opposite finances
		) ( struct-map
			KM3_Reference
			:name "head"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Project
			:type SWRC_AcademicStaff
			:location "255:3-255:52"
			:isContainer false
			:opposite headOf
		) ( struct-map
			KM3_Reference
			:name "isAbout"
			:upper -1
			:lower 1
			:isOrdered false
			:owner SWRC_Project
			:type SWRC_ResearchTopic
			:location "256:3-256:64"
			:isContainer false
			:opposite dealWithIn
		) ( struct-map
			KM3_Reference
			:name "member"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SWRC_Project
			:type SWRC_Person
			:location "257:3-257:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "projectInfo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SWRC_Project
			:type SWRC_ProjectReport
			:location "258:3-258:72"
			:isContainer false
			:opposite describesProject
		)]
	) ) ( def SWRC_ResearchProject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Project]
		:structuralFeatures[]
	) ) ( def SWRC_DevelopmentProject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Project]
		:structuralFeatures[]
	) ) ( def SWRC_SoftwareProject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Project]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "product"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_SoftwareProject
			:type SWRC_Product
			:location "263:3-263:31"
			:isContainer false
		)]
	) ) ( def SWRC_Product ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Product
			:type String
			:location "269:3-269:27"
		) ( struct-map
			KM3_Reference
			:name "developedBy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Product
			:type SWRC_Organization
			:location "270:3-270:60"
			:isContainer false
			:opposite develops
		)]
	) ) ( def SWRC_SoftwareComponent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Product]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "hasPrice"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_SoftwareComponent
			:type Integer
			:location "273:3-273:32"
		)]
	) ) ( def SWRC_Topic ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_Topic
			:type String
			:location "279:3-279:27"
		)]
	) ) ( def SWRC_ResearchTopic ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[SWRC_Topic]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dealWithIn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner SWRC_ResearchTopic
			:type SWRC_Project
			:location "282:3-282:53"
			:isContainer false
			:opposite isAbout
		) ( struct-map
			KM3_Reference
			:name "isWorkedOnBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner SWRC_ResearchTopic
			:type SWRC_AcademicStaff
			:location "283:3-283:71"
			:isContainer false
			:opposite worksAtProject
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "289:2-289:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "290:2-290:19"
	) )]
) )
