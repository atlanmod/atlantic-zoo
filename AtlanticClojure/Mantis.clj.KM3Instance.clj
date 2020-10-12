( declare Mantis_RelationshipType )
( declare Mantis_MantisRoot )
( declare Mantis_IdentifiedElt )
( declare Mantis_PrivateElt )
( declare Mantis_Issue )
( declare Mantis_ValueWithId )
( declare Mantis_Person )
( declare Mantis_Relationship )
( declare Mantis_TimeStampedElt )
( declare Mantis_Note )
( declare Mantis_Attachment )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Double )
( def Mantis ( struct-map
	KM3_Package
	:contents[( def RelationshipType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "rt_related to"
		:location "15:3-15:27"
	) ( struct-map
		KM3_EnumLiteral
		:name "rt_parent of"
		:location "16:3-16:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "rt_child of"
		:location "17:3-17:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "rt_duplicate of"
		:location "18:3-18:29"
	) ( struct-map
		KM3_EnumLiteral
		:name "rt_has duplicate"
		:location "19:3-19:30"
	)] ) ) ( def Mantis_MantisRoot ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "issues"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Mantis_MantisRoot
			:type Mantis_Issue
			:location "29:3-29:73"
			:isContainer true
			:opposite i_mantisRoot
		)]
	) ) ( def Mantis_IdentifiedElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_IdentifiedElt
			:type Integer
			:location "34:3-34:26"
		)]
	) ) ( def Mantis_PrivateElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "private"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Mantis_PrivateElt
			:type Boolean
			:location "39:3-39:36"
		)]
	) ) ( def Mantis_Issue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Mantis_IdentifiedElt Mantis_PrivateElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "category"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_Issue
			:type String
			:location "48:3-48:31"
		) ( struct-map
			KM3_Attribute
			:name "summary"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_Issue
			:type String
			:location "53:3-53:30"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_Issue
			:type String
			:location "54:3-54:34"
		) ( struct-map
			KM3_Attribute
			:name "version"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Mantis_Issue
			:type String
			:location "55:3-55:35"
		) ( struct-map
			KM3_Attribute
			:name "build"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Mantis_Issue
			:type String
			:location "56:3-56:33"
		) ( struct-map
			KM3_Attribute
			:name "platform"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Mantis_Issue
			:type String
			:location "57:3-57:36"
		) ( struct-map
			KM3_Attribute
			:name "os"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Mantis_Issue
			:type String
			:location "58:3-58:30"
		) ( struct-map
			KM3_Attribute
			:name "osVersion"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Mantis_Issue
			:type String
			:location "59:3-59:37"
		) ( struct-map
			KM3_Attribute
			:name "stepsToReproduce"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Mantis_Issue
			:type String
			:location "61:3-61:44"
		) ( struct-map
			KM3_Attribute
			:name "additionalInfo"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Mantis_Issue
			:type String
			:location "62:3-62:42"
		) ( struct-map
			KM3_Attribute
			:name "dateSubmitted"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_Issue
			:type Integer
			:location "63:3-63:37"
		) ( struct-map
			KM3_Attribute
			:name "fixedInVersion"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Mantis_Issue
			:type String
			:location "68:3-68:42"
		) ( struct-map
			KM3_Attribute
			:name "lastUpdate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_Issue
			:type Integer
			:location "72:3-72:34"
		) ( struct-map
			KM3_Reference
			:name "i_mantisRoot"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_Issue
			:type Mantis_MantisRoot
			:location "44:3-44:57"
			:isContainer false
			:opposite issues
		) ( struct-map
			KM3_Reference
			:name "project"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_Issue
			:type Mantis_ValueWithId
			:location "47:3-47:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "priority"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_Issue
			:type Mantis_ValueWithId
			:location "49:3-49:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "severity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_Issue
			:type Mantis_ValueWithId
			:location "50:3-50:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "status"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_Issue
			:type Mantis_ValueWithId
			:location "51:3-51:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "reporter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_Issue
			:type Mantis_Person
			:location "52:3-52:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "reproducibility"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_Issue
			:type Mantis_ValueWithId
			:location "60:3-60:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "assignedTo"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Mantis_Issue
			:type Mantis_Person
			:location "64:3-64:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "projection"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Mantis_Issue
			:type Mantis_ValueWithId
			:location "65:3-65:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "eta"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Mantis_Issue
			:type Mantis_ValueWithId
			:location "66:3-66:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "resolution"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Mantis_Issue
			:type Mantis_ValueWithId
			:location "67:3-67:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "attachments"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Mantis_Issue
			:type Mantis_Attachment
			:location "69:3-69:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "relationships"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Mantis_Issue
			:type Mantis_Relationship
			:location "70:3-70:63"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "notes"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Mantis_Issue
			:type Mantis_Note
			:location "71:3-71:47"
			:isContainer true
		)]
	) ) ( def Mantis_ValueWithId ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Mantis_IdentifiedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_ValueWithId
			:type String
			:location "77:3-77:28"
		)]
	) ) ( def Mantis_Person ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Mantis_ValueWithId]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "login"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_Person
			:type String
			:location "82:3-82:28"
		)]
	) ) ( def Mantis_Relationship ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Mantis_IdentifiedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_Relationship
			:type RelationshipType
			:location "87:3-87:38"
		)]
	) ) ( def Mantis_TimeStampedElt ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "timestamp"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_TimeStampedElt
			:type Integer
			:location "92:3-92:33"
		)]
	) ) ( def Mantis_Note ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Mantis_TimeStampedElt Mantis_PrivateElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_Note
			:type String
			:location "98:3-98:27"
		) ( struct-map
			KM3_Reference
			:name "author"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_Note
			:type Mantis_Person
			:location "97:3-97:39"
			:isContainer true
		)]
	) ) ( def Mantis_Attachment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Mantis_TimeStampedElt]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "filename"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_Attachment
			:type String
			:location "103:3-103:31"
		) ( struct-map
			KM3_Attribute
			:name "size"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_Attachment
			:type Integer
			:location "104:3-104:28"
		) ( struct-map
			KM3_Attribute
			:name "contentType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_Attachment
			:type String
			:location "105:3-105:34"
		) ( struct-map
			KM3_Attribute
			:name "downloadUrl"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Mantis_Attachment
			:type String
			:location "106:3-106:34"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "116:2-116:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "117:2-117:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "118:2-118:19"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "119:2-119:18"
	) )]
) )
