( declare ebXML_MultyPartyCollaboration )
( declare ebXML_BusinessPartnerRole )
( declare ebXML_Performs )
( declare ebXML_AuthorizedRole )
( declare ebXML_Transaction )
( declare ebXML_BinaryCollaboration )
( declare ebXML_BusinessState )
( declare ebXML_Start )
( declare ebXML_Fork )
( declare ebXML_Join )
( declare ebXML_CompletionState )
( declare ebXML_Failure )
( declare ebXML_Success )
( declare ebXML_BusinessActivity )
( declare ebXML_BusinessTransactionActivity )
( declare ebXML_CollaborationActivity )
( declare ebXML_BusinessTransaction )
( declare ebXML_BusinessAction )
( declare ebXML_RequestingBusinessActivity )
( declare ebXML_RespondingBusinessActivity )
( declare ebXML_DocumentSecurity )
( declare ebXML_DocumentEnvelope )
( declare ebXML_Attachment )
( declare ebXML_BusinessDocument )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_String )
( def ebXML ( struct-map
	KM3_Package
	:contents[( def ebXML_MultyPartyCollaboration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "partners"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ebXML_MultyPartyCollaboration
			:type ebXML_BusinessPartnerRole
			:location "12:3-12:82"
			:isContainer true
			:opposite collaboration
		)]
	) ) ( def ebXML_BusinessPartnerRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "collaboration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessPartnerRole
			:type ebXML_MultyPartyCollaboration
			:location "16:3-16:73"
			:isContainer false
			:opposite partners
		) ( struct-map
			KM3_Reference
			:name "transition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ebXML_BusinessPartnerRole
			:type ebXML_Transaction
			:location "17:3-17:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "performers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ebXML_BusinessPartnerRole
			:type ebXML_Performs
			:location "18:3-18:71"
			:isContainer true
			:opposite performedBy
		)]
	) ) ( def ebXML_Performs ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "performedBy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_Performs
			:type ebXML_BusinessPartnerRole
			:location "23:3-23:69"
			:isContainer false
			:opposite performers
		) ( struct-map
			KM3_Reference
			:name "collaboration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_Performs
			:type ebXML_BinaryCollaboration
			:location "24:3-24:66"
			:isContainer false
			:opposite roles
		) ( struct-map
			KM3_Reference
			:name "role"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_Performs
			:type ebXML_AuthorizedRole
			:location "25:3-25:57"
			:isContainer false
			:opposite performers
		)]
	) ) ( def ebXML_AuthorizedRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isInitiator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_AuthorizedRole
			:type Boolean
			:location "29:3-29:35"
		) ( struct-map
			KM3_Reference
			:name "performers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ebXML_AuthorizedRole
			:type ebXML_Performs
			:location "30:3-30:54"
			:isContainer false
			:opposite role
		)]
	) ) ( def ebXML_Transaction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "onInitiation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_Transaction
			:type String
			:location "34:3-34:35"
		) ( struct-map
			KM3_Attribute
			:name "conditionGuard"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_Transaction
			:type String
			:location "35:3-35:37"
		) ( struct-map
			KM3_Attribute
			:name "conditionExpression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_Transaction
			:type String
			:location "36:3-36:42"
		) ( struct-map
			KM3_Reference
			:name "from"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_Transaction
			:type ebXML_BusinessState
			:location "37:3-37:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "to"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_Transaction
			:type ebXML_BusinessState
			:location "38:3-38:32"
			:isContainer false
		)]
	) ) ( def ebXML_BinaryCollaboration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "pattern"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BinaryCollaboration
			:type String
			:location "42:3-42:30"
		) ( struct-map
			KM3_Attribute
			:name "timeToPerform"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BinaryCollaboration
			:type String
			:location "43:3-43:36"
		) ( struct-map
			KM3_Attribute
			:name "preCondition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BinaryCollaboration
			:type String
			:location "44:3-44:35"
		) ( struct-map
			KM3_Attribute
			:name "postCondition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BinaryCollaboration
			:type String
			:location "45:3-45:36"
		) ( struct-map
			KM3_Attribute
			:name "beginsWhen"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BinaryCollaboration
			:type String
			:location "46:3-46:33"
		) ( struct-map
			KM3_Attribute
			:name "endsWhen"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BinaryCollaboration
			:type String
			:location "47:3-47:31"
		) ( struct-map
			KM3_Reference
			:name "roles"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ebXML_BinaryCollaboration
			:type ebXML_Performs
			:location "48:3-48:68"
			:isContainer true
			:opposite collaboration
		) ( struct-map
			KM3_Reference
			:name "transitions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ebXML_BinaryCollaboration
			:type ebXML_Transaction
			:location "49:3-49:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "states"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ebXML_BinaryCollaboration
			:type ebXML_BusinessState
			:location "50:3-50:74"
			:isContainer true
			:opposite collaboration
		)]
	) ) ( def ebXML_BusinessState ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "collaboration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessState
			:type ebXML_BinaryCollaboration
			:location "54:3-54:67"
			:isContainer false
			:opposite states
		) ( struct-map
			KM3_Reference
			:name "from"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessState
			:type ebXML_AuthorizedRole
			:location "55:3-55:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "to"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessState
			:type ebXML_AuthorizedRole
			:location "56:3-56:33"
			:isContainer false
		)]
	) ) ( def ebXML_Start ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ebXML_BusinessState]
		:structuralFeatures[]
	) ) ( def ebXML_Fork ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ebXML_BusinessState]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "waitForAll"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_Fork
			:type String
			:location "63:3-63:33"
		)]
	) ) ( def ebXML_Join ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ebXML_BusinessState]
		:structuralFeatures[]
	) ) ( def ebXML_CompletionState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ebXML_BusinessState]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "guardCondition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_CompletionState
			:type String
			:location "69:3-69:37"
		)]
	) ) ( def ebXML_Failure ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ebXML_CompletionState]
		:structuralFeatures[]
	) ) ( def ebXML_Success ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ebXML_CompletionState]
		:structuralFeatures[]
	) ) ( def ebXML_BusinessActivity ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ebXML_BusinessState]
		:structuralFeatures[]
	) ) ( def ebXML_BusinessTransactionActivity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ebXML_BusinessActivity]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "timeToPerform"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessTransactionActivity
			:type String
			:location "80:3-80:36"
		) ( struct-map
			KM3_Attribute
			:name "isConcurrent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessTransactionActivity
			:type Boolean
			:location "81:3-81:36"
		) ( struct-map
			KM3_Attribute
			:name "isLegallyBinding"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessTransactionActivity
			:type Boolean
			:location "82:3-82:40"
		) ( struct-map
			KM3_Reference
			:name "use"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessTransactionActivity
			:type ebXML_BusinessTransaction
			:location "83:3-83:39"
			:isContainer false
		)]
	) ) ( def ebXML_CollaborationActivity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ebXML_BusinessActivity]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "use"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_CollaborationActivity
			:type ebXML_BinaryCollaboration
			:location "87:3-87:39"
			:isContainer false
		)]
	) ) ( def ebXML_BusinessTransaction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "pattern"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessTransaction
			:type String
			:location "91:3-91:30"
		) ( struct-map
			KM3_Attribute
			:name "isGuaranteedDeliveryRequired"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessTransaction
			:type Boolean
			:location "92:3-92:52"
		) ( struct-map
			KM3_Attribute
			:name "preCondition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessTransaction
			:type String
			:location "93:3-93:35"
		) ( struct-map
			KM3_Attribute
			:name "postCondition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessTransaction
			:type String
			:location "94:3-94:36"
		) ( struct-map
			KM3_Attribute
			:name "beginsWhen"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessTransaction
			:type String
			:location "95:3-95:33"
		) ( struct-map
			KM3_Attribute
			:name "endsWhen"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessTransaction
			:type String
			:location "96:3-96:31"
		) ( struct-map
			KM3_Reference
			:name "requester"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessTransaction
			:type ebXML_RequestingBusinessActivity
			:location "97:3-97:85"
			:isContainer true
			:opposite transaction
		) ( struct-map
			KM3_Reference
			:name "responder"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessTransaction
			:type ebXML_RespondingBusinessActivity
			:location "98:3-98:85"
			:isContainer true
			:opposite transaction
		)]
	) ) ( def ebXML_BusinessAction ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isIntelligiblecheckRequired"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessAction
			:type Boolean
			:location "103:3-103:51"
		) ( struct-map
			KM3_Attribute
			:name "isAuthorizationRequired"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessAction
			:type Boolean
			:location "104:3-104:47"
		) ( struct-map
			KM3_Attribute
			:name "timeToAcknowledgeReceipt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessAction
			:type String
			:location "105:3-105:47"
		) ( struct-map
			KM3_Attribute
			:name "isNonRepudiationRequired"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessAction
			:type Boolean
			:location "106:3-106:48"
		) ( struct-map
			KM3_Attribute
			:name "isNonRepudiationOfRecipientRequired"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessAction
			:type Boolean
			:location "107:3-107:59"
		)]
	) ) ( def ebXML_RequestingBusinessActivity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ebXML_BusinessAction]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "timeToAcknowledgeAcceptance"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_RequestingBusinessActivity
			:type String
			:location "111:3-111:50"
		) ( struct-map
			KM3_Reference
			:name "transaction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_RequestingBusinessActivity
			:type ebXML_BusinessTransaction
			:location "112:3-112:78"
			:isContainer true
			:opposite requester
		) ( struct-map
			KM3_Reference
			:name "documentEnvelope"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_RequestingBusinessActivity
			:type ebXML_DocumentEnvelope
			:location "113:3-113:71"
			:isContainer false
			:opposite requesting
		)]
	) ) ( def ebXML_RespondingBusinessActivity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ebXML_BusinessAction]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "transaction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_RespondingBusinessActivity
			:type ebXML_BusinessTransaction
			:location "117:3-117:78"
			:isContainer true
			:opposite responder
		) ( struct-map
			KM3_Reference
			:name "documentEnvelope"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_RespondingBusinessActivity
			:type ebXML_DocumentEnvelope
			:location "118:3-118:71"
			:isContainer false
			:opposite responding
		)]
	) ) ( def ebXML_DocumentSecurity ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isConfidential"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_DocumentSecurity
			:type Boolean
			:location "122:3-122:38"
		) ( struct-map
			KM3_Attribute
			:name "isTamperProof"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_DocumentSecurity
			:type Boolean
			:location "123:3-123:37"
		) ( struct-map
			KM3_Attribute
			:name "isAuthenticated"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_DocumentSecurity
			:type Boolean
			:location "124:3-124:39"
		)]
	) ) ( def ebXML_DocumentEnvelope ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ebXML_DocumentSecurity]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isPositiveResponse"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_DocumentEnvelope
			:type Boolean
			:location "128:3-128:42"
		) ( struct-map
			KM3_Reference
			:name "requesting"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ebXML_DocumentEnvelope
			:type ebXML_RequestingBusinessActivity
			:location "129:3-129:86"
			:isContainer false
			:opposite documentEnvelope
		) ( struct-map
			KM3_Reference
			:name "responding"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ebXML_DocumentEnvelope
			:type ebXML_RespondingBusinessActivity
			:location "130:3-130:86"
			:isContainer false
			:opposite documentEnvelope
		) ( struct-map
			KM3_Reference
			:name "attachements"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ebXML_DocumentEnvelope
			:type ebXML_Attachment
			:location "131:3-131:72"
			:isContainer true
			:opposite envelope
		) ( struct-map
			KM3_Reference
			:name "document"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_DocumentEnvelope
			:type ebXML_BusinessDocument
			:location "132:3-132:62"
			:isContainer false
			:opposite envelopes
		)]
	) ) ( def ebXML_Attachment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ebXML_DocumentSecurity]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "mimeType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_Attachment
			:type String
			:location "136:3-136:31"
		) ( struct-map
			KM3_Attribute
			:name "specification"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_Attachment
			:type String
			:location "137:3-137:36"
		) ( struct-map
			KM3_Attribute
			:name "version"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_Attachment
			:type String
			:location "138:3-138:30"
		) ( struct-map
			KM3_Reference
			:name "envelope"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_Attachment
			:type ebXML_DocumentEnvelope
			:location "139:3-139:65"
			:isContainer false
			:opposite attachements
		) ( struct-map
			KM3_Reference
			:name "document"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_Attachment
			:type ebXML_BusinessDocument
			:location "140:3-140:64"
			:isContainer false
			:opposite attachments
		)]
	) ) ( def ebXML_BusinessDocument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "specificationLocation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessDocument
			:type String
			:location "144:3-144:44"
		) ( struct-map
			KM3_Attribute
			:name "specificationElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessDocument
			:type String
			:location "145:3-145:43"
		) ( struct-map
			KM3_Attribute
			:name "conditionExpression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ebXML_BusinessDocument
			:type String
			:location "146:3-146:42"
		) ( struct-map
			KM3_Reference
			:name "envelopes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ebXML_BusinessDocument
			:type ebXML_DocumentEnvelope
			:location "147:3-147:65"
			:isContainer false
			:opposite document
		) ( struct-map
			KM3_Reference
			:name "attachments"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ebXML_BusinessDocument
			:type ebXML_Attachment
			:location "148:3-148:61"
			:isContainer false
			:opposite document
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "154:5-154:22"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "155:5-155:21"
	) )]
) )
