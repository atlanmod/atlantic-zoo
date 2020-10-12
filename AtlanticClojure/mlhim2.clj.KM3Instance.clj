( declare mlhim2_Action )
( declare mlhim2_Activity )
( declare mlhim2_AdminEntry )
( declare mlhim2_ASKR )
( declare mlhim2_ASKU )
( declare mlhim2_Attestation )
( declare mlhim2_CareEntry )
( declare mlhim2_CCD )
( declare mlhim2_Cluster )
( declare mlhim2_Composition )
( declare mlhim2_ContentItem )
( declare mlhim2_DataStructure )
( declare mlhim2_DER )
( declare mlhim2_Device )
( declare mlhim2_DvAny )
( declare mlhim2_DvBoolean )
( declare mlhim2_DvByte )
( declare mlhim2_DvChar )
( declare mlhim2_DvCodedString )
( declare mlhim2_DvCount )
( declare mlhim2_DvDate )
( declare mlhim2_Date )
( declare mlhim2_DvDateTime )
( declare mlhim2_DvDecimal )
( declare mlhim2_DvDuration )
( declare mlhim2_DvEncapsulated )
( declare mlhim2_DvIdentifier )
( declare mlhim2_DvInt )
( declare mlhim2_Int )
( declare mlhim2_DvInteger )
( declare mlhim2_DvInterval )
( declare mlhim2_DvLanguage )
( declare mlhim2_Long )
( declare mlhim2_DvLong )
( declare mlhim2_DvMedia )
( declare mlhim2_AnyURI )
( declare mlhim2_Object )
( declare mlhim2_Base64Binary )
( declare mlhim2_DvMediaApp )
( declare mlhim2_DvMediaAudio )
( declare mlhim2_DvMediaImage )
( declare mlhim2_DvMediaModel )
( declare mlhim2_DvMediaMsg )
( declare mlhim2_DvMediaMultipart )
( declare mlhim2_String )
( declare mlhim2_DvMediaText )
( declare mlhim2_DvMediaVideo )
( declare mlhim2_NegativeInteger )
( declare mlhim2_NonNegativeInteger )
( declare mlhim2_NonPositiveInteger )
( declare mlhim2_DvNegativeInteger )
( declare mlhim2_DvNonNegativeInteger )
( declare mlhim2_DvNonPositiveInteger )
( declare mlhim2_Token )
( declare mlhim2_DvNormalizedString )
( declare mlhim2_DvNumeric )
( declare mlhim2_DvOrdered )
( declare mlhim2_DvOrdinal )
( declare mlhim2_DvParagraph )
( declare mlhim2_DvParsable )
( declare mlhim2_PositiveInteger )
( declare mlhim2_DvPositiveInteger )
( declare mlhim2_DvProportion )
( declare mlhim2_DvQuantified )
( declare mlhim2_DvQuantity )
( declare mlhim2_DvRate )
( declare mlhim2_DvRatio )
( declare mlhim2_Short )
( declare mlhim2_DvShort )
( declare mlhim2_DvString )
( declare mlhim2_DvTemporal )
( declare mlhim2_Time )
( declare mlhim2_DvTime )
( declare mlhim2_DvToken )
( declare mlhim2_UnsignedByte )
( declare mlhim2_UnsignedInt )
( declare mlhim2_UnsignedLong )
( declare mlhim2_UnsignedShort )
( declare mlhim2_DvUnsignedByte )
( declare mlhim2_DvUnsignedInt )
( declare mlhim2_DvUnsignedLong )
( declare mlhim2_DvUnsignedShort )
( declare mlhim2_DvURI )
( declare mlhim2_Element )
( declare mlhim2_EntityRef )
( declare mlhim2_Entry )
( declare mlhim2_Evaluation )
( declare mlhim2_Event )
( declare mlhim2_EventContext )
( declare mlhim2_ExceptionalValue )
( declare mlhim2_FeederAudit )
( declare mlhim2_FeederAuditDetails )
( declare mlhim2_Folder )
( declare mlhim2_Group )
( declare mlhim2_History )
( declare mlhim2_Instruction )
( declare mlhim2_IntervalEvent )
( declare mlhim2_INV )
( declare mlhim2_Item )
( declare mlhim2_ItemList )
( declare mlhim2_ItemSingle )
( declare mlhim2_ItemStructure )
( declare mlhim2_ItemTable )
( declare mlhim2_ItemTree )
( declare mlhim2_Link )
( declare mlhim2_Locatable )
( declare mlhim2_Location )
( declare mlhim2_MetaDataEntry )
( declare mlhim2_MetaDataSet )
( declare mlhim2_MSK )
( declare mlhim2_NA )
( declare mlhim2_NASK )
( declare mlhim2_NAV )
( declare mlhim2_NI )
( declare mlhim2_NINF )
( declare mlhim2_NonHuman )
( declare mlhim2_ObjectRef )
( declare mlhim2_Observation )
( declare mlhim2_Ontology )
( declare mlhim2_OntologyEntry )
( declare mlhim2_Organization )
( declare mlhim2_OTH )
( declare mlhim2_Participation )
( declare mlhim2_Party )
( declare mlhim2_PartyIdentified )
( declare mlhim2_PartyProxy )
( declare mlhim2_PartyRelated )
( declare mlhim2_PartySelf )
( declare mlhim2_Person )
( declare mlhim2_PINF )
( declare mlhim2_PointEvent )
( declare mlhim2_QS )
( declare mlhim2_ReferenceRange )
( declare mlhim2_Relationship )
( declare mlhim2_Role )
( declare mlhim2_Section )
( declare mlhim2_Slot )
( declare mlhim2_TRC )
( declare mlhim2_UNC )
( declare mlhim2_UNK )
( declare mlhim2_DateTime )
( declare mlhim2_Boolean )
( declare mlhim2_NormalizedString )
( declare mlhim2_Byte )
( declare mlhim2_Integer )
( declare mlhim2_Decimal )
( declare mlhim2_Duration )
( declare mlhim2_Language )
( def mlhim2 ( struct-map
	KM3_Package
	:contents[( def mlhim2_Action ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_CareEntry]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "time"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Action
			:type mlhim2_DvTemporal
			:location "4:3-4:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Action
			:type mlhim2_ItemStructure
			:location "5:3-5:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ismTransition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Action
			:type mlhim2_DvCodedString
			:location "6:3-6:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "instructionDetails"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Action
			:type mlhim2_DvCodedString
			:location "7:3-7:63"
			:isContainer true
		)]
	) ) ( def mlhim2_Activity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_Locatable]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Activity
			:type mlhim2_ItemStructure
			:location "11:3-11:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "timing"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Activity
			:type mlhim2_DvParsable
			:location "12:3-12:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "actions"
			:upper -1
			:lower 1
			:isOrdered true
			:owner mlhim2_Activity
			:type mlhim2_DvToken
			:location "13:3-13:54"
			:isContainer true
		)]
	) ) ( def mlhim2_AdminEntry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_Entry]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_AdminEntry
			:type mlhim2_ItemStructure
			:location "17:3-17:44"
			:isContainer true
		)]
	) ) ( def mlhim2_ASKR ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_UNK]
		:structuralFeatures[]
	) ) ( def mlhim2_ASKU ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_UNK]
		:structuralFeatures[]
	) ) ( def mlhim2_Attestation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_Locatable]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "attestedView"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Attestation
			:type mlhim2_DvMedia
			:location "29:3-29:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "proof"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Attestation
			:type mlhim2_DvParsable
			:location "30:3-30:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "reason"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Attestation
			:type mlhim2_DvCodedString
			:location "31:3-31:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "commiter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Attestation
			:type mlhim2_PartyProxy
			:location "32:3-32:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "timeCommited"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Attestation
			:type mlhim2_DvTemporal
			:location "33:3-33:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isPending"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Attestation
			:type mlhim2_DvBoolean
			:location "34:3-34:45"
			:isContainer true
		)]
	) ) ( def mlhim2_CareEntry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[mlhim2_Entry]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "protocol"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_CareEntry
			:type mlhim2_ItemStructure
			:location "38:3-38:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "guidelineId"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_CareEntry
			:type mlhim2_ObjectRef
			:location "39:3-39:52"
			:isContainer true
		)]
	) ) ( def mlhim2_CCD ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "definition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_CCD
			:type mlhim2_Locatable
			:location "43:3-43:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "metaData"
			:upper -1
			:lower 1
			:isOrdered true
			:owner mlhim2_CCD
			:type mlhim2_MetaDataSet
			:location "44:3-44:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ontology"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_CCD
			:type mlhim2_Ontology
			:location "45:3-45:43"
			:isContainer true
		)]
	) ) ( def mlhim2_Cluster ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_Item]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "items"
			:upper -1
			:lower 1
			:isOrdered true
			:owner mlhim2_Cluster
			:type mlhim2_Item
			:location "49:3-49:49"
			:isContainer true
		)]
	) ) ( def mlhim2_Composition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_Locatable]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "attestation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Composition
			:type mlhim2_Attestation
			:location "53:3-53:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "links"
			:upper -1
			:lower 0
			:isOrdered true
			:owner mlhim2_Composition
			:type mlhim2_Link
			:location "54:3-54:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "original"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Composition
			:type mlhim2_DvToken
			:location "55:3-55:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "predecessor"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Composition
			:type mlhim2_DvToken
			:location "56:3-56:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "created"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Composition
			:type mlhim2_DvTemporal
			:location "57:3-57:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "composer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Composition
			:type mlhim2_PartyProxy
			:location "58:3-58:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "territory"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Composition
			:type mlhim2_Location
			:location "59:3-59:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "category"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Composition
			:type mlhim2_DvCodedString
			:location "60:3-60:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "language"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Composition
			:type mlhim2_DvLanguage
			:location "61:3-61:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "context"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Composition
			:type mlhim2_EventContext
			:location "62:3-62:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "content"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Composition
			:type mlhim2_Locatable
			:location "63:3-63:43"
			:isContainer true
		)]
	) ) ( def mlhim2_ContentItem ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[mlhim2_Locatable]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "links"
			:upper -1
			:lower 0
			:isOrdered true
			:owner mlhim2_ContentItem
			:type mlhim2_Link
			:location "67:3-67:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "attestation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_ContentItem
			:type mlhim2_Attestation
			:location "68:3-68:54"
			:isContainer true
		)]
	) ) ( def mlhim2_DataStructure ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[mlhim2_Locatable]
		:structuralFeatures[]
	) ) ( def mlhim2_DER ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_INV]
		:structuralFeatures[]
	) ) ( def mlhim2_Device ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_Party]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "details"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Device
			:type mlhim2_ItemStructure
			:location "80:3-80:47"
			:isContainer true
		)]
	) ) ( def mlhim2_DvAny ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "validTimeBegin"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvAny
			:type DateTime
			:location "84:3-84:44"
		) ( struct-map
			KM3_Attribute
			:name "validTimeEnd"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvAny
			:type DateTime
			:location "85:3-85:42"
		) ( struct-map
			KM3_Reference
			:name "ev"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvAny
			:type mlhim2_ExceptionalValue
			:location "86:3-86:50"
			:isContainer true
		)]
	) ) ( def mlhim2_DvBoolean ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvAny]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvBoolean
			:type Boolean
			:location "90:3-90:31"
		)]
	) ) ( def mlhim2_DvByte ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvNumeric]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvByte
			:type Byte
			:location "94:3-94:28"
		)]
	) ) ( def mlhim2_DvChar ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[mlhim2_DvAny]
		:structuralFeatures[]
	) ) ( def mlhim2_DvCodedString ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvString]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "codeString"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvCodedString
			:type NormalizedString
			:location "102:3-102:48"
		) ( struct-map
			KM3_Attribute
			:name "terminologyName"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvCodedString
			:type NormalizedString
			:location "103:3-103:53"
		) ( struct-map
			KM3_Attribute
			:name "terminologyAbbrev"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvCodedString
			:type NormalizedString
			:location "104:3-104:55"
		)]
	) ) ( def mlhim2_DvCount ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvQuantified]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "count"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_DvCount
			:type Integer
			:location "108:3-108:29"
		)]
	) ) ( def mlhim2_DvDate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvTemporal]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvDate
			:type Date
			:location "112:3-112:28"
		)]
	) ) ( def ptyp_Date ( struct-map
		KM3_DataType
		:name "Date"
		:location "115:2-115:16"
	) ) ( def mlhim2_DvDateTime ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvTemporal]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvDateTime
			:type DateTime
			:location "119:3-119:32"
		)]
	) ) ( def mlhim2_DvDecimal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvNumeric]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvDecimal
			:type Decimal
			:location "123:3-123:31"
		)]
	) ) ( def mlhim2_DvDuration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvTemporal]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvDuration
			:type Duration
			:location "127:3-127:32"
		)]
	) ) ( def mlhim2_DvEncapsulated ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[mlhim2_DvAny]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "size"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_DvEncapsulated
			:type Decimal
			:location "131:3-131:28"
		) ( struct-map
			KM3_Attribute
			:name "charset"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvEncapsulated
			:type NormalizedString
			:location "132:3-132:45"
		) ( struct-map
			KM3_Attribute
			:name "language"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvEncapsulated
			:type Language
			:location "133:3-133:38"
		)]
	) ) ( def mlhim2_DvIdentifier ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvString]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "issuer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvIdentifier
			:type NormalizedString
			:location "137:3-137:44"
		) ( struct-map
			KM3_Attribute
			:name "assigner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvIdentifier
			:type NormalizedString
			:location "138:3-138:46"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvIdentifier
			:type NormalizedString
			:location "139:3-139:42"
		)]
	) ) ( def mlhim2_DvInt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvNumeric]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvInt
			:type Int
			:location "143:3-143:27"
		)]
	) ) ( def ptyp_Int ( struct-map
		KM3_DataType
		:name "Int"
		:location "146:2-146:15"
	) ) ( def mlhim2_DvInteger ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvNumeric]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvInteger
			:type Integer
			:location "149:3-149:31"
		)]
	) ) ( def mlhim2_DvInterval ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvAny]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "lowerIncluded"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_DvInterval
			:type Boolean
			:location "155:3-155:37"
		) ( struct-map
			KM3_Attribute
			:name "upperIncluded"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_DvInterval
			:type Boolean
			:location "156:3-156:37"
		) ( struct-map
			KM3_Attribute
			:name "lowerUnbounded"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_DvInterval
			:type Boolean
			:location "157:3-157:38"
		) ( struct-map
			KM3_Attribute
			:name "upperUnbounded"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_DvInterval
			:type Boolean
			:location "158:3-158:38"
		) ( struct-map
			KM3_Reference
			:name "lower"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvInterval
			:type mlhim2_DvOrdered
			:location "153:3-153:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "upper"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvInterval
			:type mlhim2_DvOrdered
			:location "154:3-154:46"
			:isContainer true
		)]
	) ) ( def mlhim2_DvLanguage ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvChar]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvLanguage
			:type Language
			:location "162:3-162:32"
		)]
	) ) ( def ptyp_Long ( struct-map
		KM3_DataType
		:name "Long"
		:location "165:2-165:16"
	) ) ( def mlhim2_DvLong ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvNumeric]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvLong
			:type Long
			:location "168:3-168:28"
		)]
	) ) ( def mlhim2_DvMedia ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[mlhim2_DvEncapsulated]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "mimeType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_DvMedia
			:type NormalizedString
			:location "172:3-172:41"
		) ( struct-map
			KM3_Attribute
			:name "compressionType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvMedia
			:type NormalizedString
			:location "173:3-173:53"
		) ( struct-map
			KM3_Attribute
			:name "hashResult"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvMedia
			:type NormalizedString
			:location "174:3-174:48"
		) ( struct-map
			KM3_Attribute
			:name "hashFunction"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvMedia
			:type NormalizedString
			:location "175:3-175:50"
		) ( struct-map
			KM3_Attribute
			:name "uri"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvMedia
			:type AnyURI
			:location "176:3-176:31"
		) ( struct-map
			KM3_Attribute
			:name "altText"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvMedia
			:type NormalizedString
			:location "177:3-177:45"
		)]
	) ) ( def ptyp_AnyURI ( struct-map
		KM3_DataType
		:name "AnyURI"
		:location "180:2-180:18"
	) ) ( def ptyp_Object ( struct-map
		KM3_DataType
		:name "Object"
		:location "182:2-182:18"
	) ) ( def ptyp_Base64Binary ( struct-map
		KM3_DataType
		:name "Base64Binary"
		:location "184:2-184:24"
	) ) ( def mlhim2_DvMediaApp ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvMedia]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvMediaApp
			:type mlhim2_Object
			:location "187:3-187:40"
			:isContainer true
		)]
	) ) ( def mlhim2_DvMediaAudio ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvMedia]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvMediaAudio
			:type Base64Binary
			:location "191:3-191:36"
		)]
	) ) ( def mlhim2_DvMediaImage ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvMedia]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvMediaImage
			:type Base64Binary
			:location "195:3-195:36"
		)]
	) ) ( def mlhim2_DvMediaModel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvMedia]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvMediaModel
			:type Base64Binary
			:location "199:3-199:36"
		)]
	) ) ( def mlhim2_DvMediaMsg ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvMedia]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvMediaMsg
			:type Base64Binary
			:location "203:3-203:36"
		)]
	) ) ( def mlhim2_DvMediaMultipart ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvMedia]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvMediaMultipart
			:type mlhim2_Object
			:location "207:3-207:40"
			:isContainer true
		)]
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "210:2-210:18"
	) ) ( def mlhim2_DvMediaText ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvMedia]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvMediaText
			:type String
			:location "213:3-213:30"
		)]
	) ) ( def mlhim2_DvMediaVideo ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvMedia]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvMediaVideo
			:type Base64Binary
			:location "217:3-217:36"
		)]
	) ) ( def ptyp_NegativeInteger ( struct-map
		KM3_DataType
		:name "NegativeInteger"
		:location "220:2-220:27"
	) ) ( def ptyp_NonNegativeInteger ( struct-map
		KM3_DataType
		:name "NonNegativeInteger"
		:location "222:2-222:30"
	) ) ( def ptyp_NonPositiveInteger ( struct-map
		KM3_DataType
		:name "NonPositiveInteger"
		:location "224:2-224:30"
	) ) ( def mlhim2_DvNegativeInteger ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvNumeric]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvNegativeInteger
			:type NegativeInteger
			:location "227:3-227:39"
		)]
	) ) ( def mlhim2_DvNonNegativeInteger ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvNumeric]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvNonNegativeInteger
			:type NonNegativeInteger
			:location "231:3-231:42"
		)]
	) ) ( def mlhim2_DvNonPositiveInteger ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvNumeric]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvNonPositiveInteger
			:type NonPositiveInteger
			:location "235:3-235:42"
		)]
	) ) ( def ptyp_Token ( struct-map
		KM3_DataType
		:name "Token"
		:location "238:2-238:17"
	) ) ( def mlhim2_DvNormalizedString ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvChar]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "uuid"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_DvNormalizedString
			:type Token
			:location "241:3-241:26"
		) ( struct-map
			KM3_Attribute
			:name "language"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvNormalizedString
			:type Language
			:location "242:3-242:38"
		) ( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvNormalizedString
			:type NormalizedString
			:location "243:3-243:40"
		)]
	) ) ( def mlhim2_DvNumeric ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[mlhim2_DvAny]
		:structuralFeatures[]
	) ) ( def mlhim2_DvOrdered ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[mlhim2_DvAny]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "normalStatus"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvOrdered
			:type String
			:location "253:3-253:40"
		) ( struct-map
			KM3_Reference
			:name "normalRange"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvOrdered
			:type mlhim2_DvInterval
			:location "251:3-251:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "otherReferenceRanges"
			:upper -1
			:lower 0
			:isOrdered true
			:owner mlhim2_DvOrdered
			:type mlhim2_ReferenceRange
			:location "252:3-252:72"
			:isContainer true
		)]
	) ) ( def mlhim2_DvOrdinal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvOrdered]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvOrdinal
			:type Integer
			:location "257:3-257:31"
		) ( struct-map
			KM3_Attribute
			:name "symbol"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvOrdinal
			:type String
			:location "258:3-258:34"
		)]
	) ) ( def mlhim2_DvParagraph ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvAny]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "items"
			:upper -1
			:lower 0
			:isOrdered true
			:owner mlhim2_DvParagraph
			:type mlhim2_DvString
			:location "262:3-262:51"
			:isContainer true
		)]
	) ) ( def mlhim2_DvParsable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvEncapsulated]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvParsable
			:type NormalizedString
			:location "266:3-266:40"
		) ( struct-map
			KM3_Attribute
			:name "formalism"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvParsable
			:type NormalizedString
			:location "267:3-267:47"
		)]
	) ) ( def ptyp_PositiveInteger ( struct-map
		KM3_DataType
		:name "PositiveInteger"
		:location "270:2-270:27"
	) ) ( def mlhim2_DvPositiveInteger ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvNumeric]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvPositiveInteger
			:type PositiveInteger
			:location "273:3-273:39"
		)]
	) ) ( def mlhim2_DvProportion ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvRatio]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "proportionType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvProportion
			:type NormalizedString
			:location "277:3-277:52"
		)]
	) ) ( def mlhim2_DvQuantified ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[mlhim2_DvOrdered]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "magnitude"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvQuantified
			:type Decimal
			:location "281:3-281:38"
		) ( struct-map
			KM3_Attribute
			:name "magnitudeStatus"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvQuantified
			:type String
			:location "282:3-282:43"
		) ( struct-map
			KM3_Attribute
			:name "error"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_DvQuantified
			:type Int
			:location "283:3-283:25"
		) ( struct-map
			KM3_Attribute
			:name "accuracy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_DvQuantified
			:type Decimal
			:location "284:3-284:32"
		)]
	) ) ( def mlhim2_DvQuantity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvQuantified]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "units"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_DvQuantity
			:type NormalizedString
			:location "288:3-288:38"
		)]
	) ) ( def mlhim2_DvRate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvRatio]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "rateType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvRate
			:type NormalizedString
			:location "292:3-292:46"
		)]
	) ) ( def mlhim2_DvRatio ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[mlhim2_DvQuantified]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "numerator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_DvRatio
			:type Decimal
			:location "296:3-296:33"
		) ( struct-map
			KM3_Attribute
			:name "denominator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_DvRatio
			:type Decimal
			:location "297:3-297:35"
		)]
	) ) ( def ptyp_Short ( struct-map
		KM3_DataType
		:name "Short"
		:location "300:2-300:17"
	) ) ( def mlhim2_DvShort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvNumeric]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvShort
			:type Short
			:location "303:3-303:29"
		)]
	) ) ( def mlhim2_DvString ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvChar]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "uuid"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_DvString
			:type Token
			:location "307:3-307:26"
		) ( struct-map
			KM3_Attribute
			:name "language"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvString
			:type Language
			:location "308:3-308:38"
		) ( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvString
			:type String
			:location "309:3-309:30"
		)]
	) ) ( def mlhim2_DvTemporal ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def ptyp_Time ( struct-map
		KM3_DataType
		:name "Time"
		:location "316:2-316:16"
	) ) ( def mlhim2_DvTime ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvTemporal]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvTime
			:type Time
			:location "319:3-319:28"
		)]
	) ) ( def mlhim2_DvToken ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvChar]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvToken
			:type Token
			:location "323:3-323:29"
		)]
	) ) ( def ptyp_UnsignedByte ( struct-map
		KM3_DataType
		:name "UnsignedByte"
		:location "326:2-326:24"
	) ) ( def ptyp_UnsignedInt ( struct-map
		KM3_DataType
		:name "UnsignedInt"
		:location "327:2-327:23"
	) ) ( def ptyp_UnsignedLong ( struct-map
		KM3_DataType
		:name "UnsignedLong"
		:location "328:2-328:24"
	) ) ( def ptyp_UnsignedShort ( struct-map
		KM3_DataType
		:name "UnsignedShort"
		:location "329:2-329:25"
	) ) ( def mlhim2_DvUnsignedByte ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvNumeric]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvUnsignedByte
			:type UnsignedByte
			:location "332:3-332:36"
		)]
	) ) ( def mlhim2_DvUnsignedInt ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvNumeric]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvUnsignedInt
			:type UnsignedInt
			:location "336:3-336:35"
		)]
	) ) ( def mlhim2_DvUnsignedLong ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvNumeric]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvUnsignedLong
			:type UnsignedLong
			:location "340:3-340:36"
		)]
	) ) ( def mlhim2_DvUnsignedShort ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvNumeric]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvUnsignedShort
			:type UnsignedShort
			:location "344:3-344:37"
		)]
	) ) ( def mlhim2_DvURI ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvAny]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dv"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_DvURI
			:type AnyURI
			:location "348:3-348:30"
		)]
	) ) ( def mlhim2_Element ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_Item]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dv"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Element
			:type mlhim2_DvAny
			:location "352:3-352:34"
			:isContainer true
		)]
	) ) ( def mlhim2_EntityRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_ObjectRef]
		:structuralFeatures[]
	) ) ( def mlhim2_Entry ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[mlhim2_ContentItem]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "language"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Entry
			:type mlhim2_DvLanguage
			:location "360:3-360:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "encoding"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Entry
			:type mlhim2_DvCodedString
			:location "361:3-361:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "subject"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Entry
			:type mlhim2_PartyProxy
			:location "362:3-362:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "provider"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Entry
			:type mlhim2_PartyProxy
			:location "363:3-363:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "otherParticipations"
			:upper -1
			:lower 0
			:isOrdered true
			:owner mlhim2_Entry
			:type mlhim2_Participation
			:location "364:3-364:70"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "workflowId"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Entry
			:type mlhim2_ObjectRef
			:location "365:3-365:51"
			:isContainer true
		)]
	) ) ( def mlhim2_Evaluation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_CareEntry]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Evaluation
			:type mlhim2_ItemStructure
			:location "369:3-369:44"
			:isContainer true
		)]
	) ) ( def mlhim2_Event ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[mlhim2_Locatable]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "time"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Event
			:type mlhim2_DvTemporal
			:location "373:3-373:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Event
			:type mlhim2_DvAny
			:location "374:3-374:36"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "state"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Event
			:type mlhim2_ItemStructure
			:location "375:3-375:50"
			:isContainer true
		)]
	) ) ( def mlhim2_EventContext ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_Locatable]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "healthcareFacility"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_EventContext
			:type mlhim2_Organization
			:location "379:3-379:62"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "startTime"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_EventContext
			:type mlhim2_DvTemporal
			:location "380:3-380:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "endTime"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_EventContext
			:type mlhim2_DvTemporal
			:location "381:3-381:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "participation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_EventContext
			:type mlhim2_Participation
			:location "382:3-382:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "location"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_EventContext
			:type mlhim2_Location
			:location "383:3-383:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "setting"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_EventContext
			:type mlhim2_DvCodedString
			:location "384:3-384:52"
			:isContainer true
		)]
	) ) ( def mlhim2_ExceptionalValue ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "evName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_ExceptionalValue
			:type String
			:location "388:3-388:29"
		) ( struct-map
			KM3_Attribute
			:name "evMeaning"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_ExceptionalValue
			:type String
			:location "389:3-389:32"
		)]
	) ) ( def mlhim2_FeederAudit ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "originatingSystemAudit"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_FeederAudit
			:type mlhim2_FeederAuditDetails
			:location "393:3-393:67"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "originatingSystemItemIds"
			:upper -1
			:lower 1
			:isOrdered true
			:owner mlhim2_FeederAudit
			:type mlhim2_DvIdentifier
			:location "394:3-394:76"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "feederSystemAudit"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_FeederAudit
			:type mlhim2_FeederAuditDetails
			:location "395:3-395:62"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "feederSystemIds"
			:upper -1
			:lower 1
			:isOrdered true
			:owner mlhim2_FeederAudit
			:type mlhim2_DvIdentifier
			:location "396:3-396:67"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "originalContent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_FeederAudit
			:type mlhim2_DvEncapsulated
			:location "397:3-397:56"
			:isContainer true
		)]
	) ) ( def mlhim2_FeederAuditDetails ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "systemId"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_FeederAuditDetails
			:type mlhim2_DvIdentifier
			:location "401:3-401:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "versionId"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_FeederAuditDetails
			:type mlhim2_DvNormalizedString
			:location "402:3-402:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "provider"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_FeederAuditDetails
			:type mlhim2_PartyIdentified
			:location "403:3-403:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "location"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_FeederAuditDetails
			:type mlhim2_Location
			:location "404:3-404:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "time"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_FeederAuditDetails
			:type mlhim2_DvTemporal
			:location "405:3-405:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "subject"
			:upper -1
			:lower 0
			:isOrdered true
			:owner mlhim2_FeederAuditDetails
			:type mlhim2_PartyProxy
			:location "406:3-406:55"
			:isContainer true
		)]
	) ) ( def mlhim2_Folder ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_Locatable]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "items"
			:upper -1
			:lower 0
			:isOrdered true
			:owner mlhim2_Folder
			:type mlhim2_Composition
			:location "410:3-410:54"
			:isContainer true
		)]
	) ) ( def mlhim2_Group ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_Party]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "members"
			:upper -1
			:lower 0
			:isOrdered true
			:owner mlhim2_Group
			:type mlhim2_Party
			:location "414:3-414:50"
			:isContainer true
		)]
	) ) ( def mlhim2_History ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DataStructure]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "origin"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_History
			:type mlhim2_DvTemporal
			:location "418:3-418:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "events"
			:upper -1
			:lower 1
			:isOrdered true
			:owner mlhim2_History
			:type mlhim2_Event
			:location "419:3-419:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "period"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_History
			:type mlhim2_DvDuration
			:location "420:3-420:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "duration"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_History
			:type mlhim2_DvDuration
			:location "421:3-421:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "summary"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_History
			:type mlhim2_ItemStructure
			:location "422:3-422:52"
			:isContainer true
		)]
	) ) ( def mlhim2_Instruction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_CareEntry]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expiryTime"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Instruction
			:type mlhim2_DvTemporal
			:location "426:3-426:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "narrative"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Instruction
			:type mlhim2_DvString
			:location "427:3-427:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "wfDefinition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Instruction
			:type mlhim2_DvParsable
			:location "428:3-428:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "activities"
			:upper -1
			:lower 1
			:isOrdered true
			:owner mlhim2_Instruction
			:type mlhim2_Activity
			:location "429:3-429:58"
			:isContainer true
		)]
	) ) ( def mlhim2_IntervalEvent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_Event]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "width"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_IntervalEvent
			:type mlhim2_DvDuration
			:location "433:3-433:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "mathFunction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_IntervalEvent
			:type mlhim2_DvCodedString
			:location "434:3-434:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "sampleCount"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_IntervalEvent
			:type mlhim2_DvCount
			:location "435:3-435:50"
			:isContainer true
		)]
	) ) ( def mlhim2_INV ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_NI]
		:structuralFeatures[]
	) ) ( def mlhim2_Item ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[mlhim2_Locatable]
		:structuralFeatures[]
	) ) ( def mlhim2_ItemList ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_ItemStructure]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "items"
			:upper -1
			:lower 0
			:isOrdered true
			:owner mlhim2_ItemList
			:type mlhim2_Item
			:location "447:3-447:47"
			:isContainer true
		)]
	) ) ( def mlhim2_ItemSingle ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_ItemStructure]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "item"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_ItemSingle
			:type mlhim2_Item
			:location "451:3-451:35"
			:isContainer true
		)]
	) ) ( def mlhim2_ItemStructure ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[mlhim2_DataStructure]
		:structuralFeatures[]
	) ) ( def mlhim2_ItemTable ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_ItemStructure]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rows"
			:upper -1
			:lower 1
			:isOrdered true
			:owner mlhim2_ItemTable
			:type mlhim2_Cluster
			:location "459:3-459:51"
			:isContainer true
		)]
	) ) ( def mlhim2_ItemTree ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_ItemStructure]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "items"
			:upper -1
			:lower 1
			:isOrdered true
			:owner mlhim2_ItemTree
			:type mlhim2_Item
			:location "463:3-463:49"
			:isContainer true
		)]
	) ) ( def mlhim2_Link ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "relation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Link
			:type mlhim2_Relationship
			:location "467:3-467:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Link
			:type mlhim2_DvToken
			:location "468:3-468:40"
			:isContainer true
		)]
	) ) ( def mlhim2_Locatable ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "feederAudit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Locatable
			:type mlhim2_FeederAudit
			:location "472:3-472:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Locatable
			:type mlhim2_DvNormalizedString
			:location "473:3-473:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "uuid"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Locatable
			:type mlhim2_DvToken
			:location "474:3-474:38"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "parent"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Locatable
			:type mlhim2_DvToken
			:location "475:3-475:45"
			:isContainer true
		)]
	) ) ( def mlhim2_Location ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_Locatable]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "details"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Location
			:type mlhim2_ItemStructure
			:location "479:3-479:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Location
			:type mlhim2_DvString
			:location "480:3-480:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isPrimary"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Location
			:type mlhim2_DvBoolean
			:location "481:3-481:45"
			:isContainer true
		)]
	) ) ( def mlhim2_MetaDataEntry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "title"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_MetaDataEntry
			:type String
			:location "485:3-485:28"
		) ( struct-map
			KM3_Attribute
			:name "contents"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_MetaDataEntry
			:type String
			:location "486:3-486:31"
		)]
	) ) ( def mlhim2_MetaDataSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_MetaDataSet
			:type String
			:location "490:3-490:27"
		) ( struct-map
			KM3_Reference
			:name "entries"
			:upper -1
			:lower 1
			:isOrdered true
			:owner mlhim2_MetaDataSet
			:type mlhim2_MetaDataEntry
			:location "491:3-491:60"
			:isContainer true
		)]
	) ) ( def mlhim2_MSK ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_NI]
		:structuralFeatures[]
	) ) ( def mlhim2_NA ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_NI]
		:structuralFeatures[]
	) ) ( def mlhim2_NASK ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_UNK]
		:structuralFeatures[]
	) ) ( def mlhim2_NAV ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_ASKU]
		:structuralFeatures[]
	) ) ( def mlhim2_NI ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_ExceptionalValue]
		:structuralFeatures[]
	) ) ( def mlhim2_NINF ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_OTH]
		:structuralFeatures[]
	) ) ( def mlhim2_NonHuman ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_Party]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "details"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_NonHuman
			:type mlhim2_ItemStructure
			:location "519:3-519:47"
			:isContainer true
		)]
	) ) ( def mlhim2_ObjectRef ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "uuid"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_ObjectRef
			:type Token
			:location "523:3-523:26"
		) ( struct-map
			KM3_Attribute
			:name "namespace"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_ObjectRef
			:type NormalizedString
			:location "524:3-524:42"
		) ( struct-map
			KM3_Attribute
			:name "objType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_ObjectRef
			:type NormalizedString
			:location "525:3-525:40"
		)]
	) ) ( def mlhim2_Observation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_CareEntry]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "data"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Observation
			:type mlhim2_History
			:location "529:3-529:38"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "state"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Observation
			:type mlhim2_History
			:location "530:3-530:44"
			:isContainer true
		)]
	) ) ( def mlhim2_Ontology ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "names"
			:upper -1
			:lower 0
			:isOrdered true
			:owner mlhim2_Ontology
			:type String
			:location "534:3-534:39"
		) ( struct-map
			KM3_Attribute
			:name "internalVocabularies"
			:upper -1
			:lower 0
			:isOrdered true
			:owner mlhim2_Ontology
			:type String
			:location "535:3-535:54"
		) ( struct-map
			KM3_Attribute
			:name "lookupTables"
			:upper -1
			:lower 0
			:isOrdered true
			:owner mlhim2_Ontology
			:type String
			:location "536:3-536:46"
		) ( struct-map
			KM3_Attribute
			:name "terminologies"
			:upper -1
			:lower 0
			:isOrdered true
			:owner mlhim2_Ontology
			:type String
			:location "537:3-537:47"
		) ( struct-map
			KM3_Reference
			:name "generalEntries"
			:upper -1
			:lower 0
			:isOrdered true
			:owner mlhim2_Ontology
			:type mlhim2_OntologyEntry
			:location "538:3-538:65"
			:isContainer true
		)]
	) ) ( def mlhim2_OntologyEntry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "contents"
			:upper -1
			:lower 1
			:isOrdered true
			:owner mlhim2_OntologyEntry
			:type String
			:location "542:3-542:44"
		)]
	) ) ( def mlhim2_Organization ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_Party]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "details"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Organization
			:type mlhim2_ItemStructure
			:location "546:3-546:47"
			:isContainer true
		)]
	) ) ( def mlhim2_OTH ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_INV]
		:structuralFeatures[]
	) ) ( def mlhim2_Participation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "performer"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Participation
			:type mlhim2_PartyProxy
			:location "554:3-554:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "function"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Participation
			:type mlhim2_DvCodedString
			:location "555:3-555:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "mode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Participation
			:type mlhim2_DvCodedString
			:location "556:3-556:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "time"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Participation
			:type mlhim2_DvTemporal
			:location "557:3-557:41"
			:isContainer true
		)]
	) ) ( def mlhim2_Party ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[mlhim2_Locatable]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "validTimeBegin"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Party
			:type mlhim2_DvDateTime
			:location "561:3-561:56"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "validTimeEnd"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Party
			:type mlhim2_DvDateTime
			:location "562:3-562:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ev"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_Party
			:type mlhim2_ExceptionalValue
			:location "563:3-563:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "identifiers"
			:upper -1
			:lower 0
			:isOrdered true
			:owner mlhim2_Party
			:type mlhim2_DvIdentifier
			:location "564:3-564:61"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "roles"
			:upper -1
			:lower 0
			:isOrdered true
			:owner mlhim2_Party
			:type mlhim2_Role
			:location "565:3-565:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "relationships"
			:upper -1
			:lower 0
			:isOrdered true
			:owner mlhim2_Party
			:type mlhim2_Relationship
			:location "566:3-566:63"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "locations"
			:upper -1
			:lower 0
			:isOrdered true
			:owner mlhim2_Party
			:type mlhim2_Location
			:location "567:3-567:55"
			:isContainer true
		)]
	) ) ( def mlhim2_PartyIdentified ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_PartyProxy]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_PartyIdentified
			:type mlhim2_DvString
			:location "571:3-571:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "identifiers"
			:upper -1
			:lower 1
			:isOrdered true
			:owner mlhim2_PartyIdentified
			:type mlhim2_DvIdentifier
			:location "572:3-572:63"
			:isContainer true
		)]
	) ) ( def mlhim2_PartyProxy ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[mlhim2_DvAny]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "externalRef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner mlhim2_PartyProxy
			:type mlhim2_EntityRef
			:location "576:3-576:52"
			:isContainer true
		)]
	) ) ( def mlhim2_PartyRelated ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_PartyIdentified]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "relationship"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_PartyRelated
			:type mlhim2_Relationship
			:location "580:3-580:51"
			:isContainer true
		)]
	) ) ( def mlhim2_PartySelf ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_PartyProxy]
		:structuralFeatures[]
	) ) ( def mlhim2_Person ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_Party]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "details"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Person
			:type mlhim2_ItemStructure
			:location "588:3-588:47"
			:isContainer true
		)]
	) ) ( def mlhim2_PINF ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_OTH]
		:structuralFeatures[]
	) ) ( def mlhim2_PointEvent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_Event]
		:structuralFeatures[]
	) ) ( def mlhim2_QS ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_UNK]
		:structuralFeatures[]
	) ) ( def mlhim2_ReferenceRange ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_DvAny]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "definition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_ReferenceRange
			:type mlhim2_DvString
			:location "604:3-604:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "dataRange"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_ReferenceRange
			:type mlhim2_DvInterval
			:location "605:3-605:46"
			:isContainer true
		)]
	) ) ( def mlhim2_Relationship ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_Locatable]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "targets"
			:upper -1
			:lower 1
			:isOrdered true
			:owner mlhim2_Relationship
			:type mlhim2_DvToken
			:location "609:3-609:54"
			:isContainer true
		)]
	) ) ( def mlhim2_Role ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_Locatable]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "details"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Role
			:type mlhim2_ItemStructure
			:location "613:3-613:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Role
			:type mlhim2_DvString
			:location "614:3-614:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isPrimary"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Role
			:type mlhim2_DvBoolean
			:location "615:3-615:45"
			:isContainer true
		)]
	) ) ( def mlhim2_Section ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_ContentItem]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "items"
			:upper -1
			:lower 0
			:isOrdered true
			:owner mlhim2_Section
			:type mlhim2_ContentItem
			:location "619:3-619:54"
			:isContainer true
		)]
	) ) ( def mlhim2_Slot ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_Item]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ccd"
			:upper 1
			:lower 1
			:isOrdered false
			:owner mlhim2_Slot
			:type mlhim2_DvToken
			:location "623:3-623:37"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "allowedCcds"
			:upper -1
			:lower 1
			:isOrdered true
			:owner mlhim2_Slot
			:type mlhim2_DvToken
			:location "624:3-624:58"
			:isContainer true
		)]
	) ) ( def mlhim2_TRC ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_UNK]
		:structuralFeatures[]
	) ) ( def mlhim2_UNC ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_INV]
		:structuralFeatures[]
	) ) ( def mlhim2_UNK ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[mlhim2_NI]
		:structuralFeatures[]
	) ) ( def ptyp_DateTime ( struct-map
		KM3_DataType
		:name "DateTime"
		:location "639:2-639:20"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "640:2-640:19"
	) ) ( def ptyp_NormalizedString ( struct-map
		KM3_DataType
		:name "NormalizedString"
		:location "641:2-641:28"
	) ) ( def ptyp_Byte ( struct-map
		KM3_DataType
		:name "Byte"
		:location "642:2-642:16"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "643:2-643:19"
	) ) ( def ptyp_Decimal ( struct-map
		KM3_DataType
		:name "Decimal"
		:location "644:2-644:19"
	) ) ( def ptyp_Duration ( struct-map
		KM3_DataType
		:name "Duration"
		:location "645:2-645:20"
	) ) ( def ptyp_Language ( struct-map
		KM3_DataType
		:name "Language"
		:location "646:2-646:20"
	) )]
) )
