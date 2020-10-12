( declare ExtendedUMLCorePackage_Package )
( declare ExtendedUMLCorePackage_ProviderClause )
( declare ExtendedUMLCorePackage_CollaborationPackage )
( declare ExtendedUMLCorePackage_Collaboration )
( declare ExtendedUMLCorePackage_InteractionPackage )
( declare ExtendedUMLCorePackage_Interaction )
( declare ExtendedUMLCorePackage_AssociationRole )
( declare ExtendedUMLCorePackage_ClassifierRole )
( declare ExtendedUMLCorePackage_AssociationEndRole )
( declare ExtendedUMLCorePackage_Message )
( declare ExtendedUMLCorePackage_Request )
( declare ExtendedUMLCorePackage_Operation )
( declare ExtendedUMLCorePackage_Interface )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_String )
( def ExtendedUMLCorePackage ( struct-map
	KM3_Package
	:contents[( def ExtendedUMLCorePackage_Package ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ExtendedUMLCorePackage_ProviderClause]
		:structuralFeatures[]
	) ) ( def ExtendedUMLCorePackage_ProviderClause ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedEltColl"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_ProviderClause
			:type ExtendedUMLCorePackage_CollaborationPackage
			:location "20:3-20:59"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ownedEltInt"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ExtendedUMLCorePackage_ProviderClause
			:type ExtendedUMLCorePackage_InteractionPackage
			:location "21:3-21:76"
			:isContainer false
			:opposite providerClause
		)]
	) ) ( def ExtendedUMLCorePackage_CollaborationPackage ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_CollaborationPackage
			:type ExtendedUMLCorePackage_Collaboration
			:location "25:3-25:38"
			:isContainer false
		)]
	) ) ( def ExtendedUMLCorePackage_Collaboration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "interaction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ExtendedUMLCorePackage_Collaboration
			:type ExtendedUMLCorePackage_Interaction
			:location "29:3-29:72"
			:isContainer true
			:opposite context
		) ( struct-map
			KM3_Reference
			:name "ownedEltAss"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_Collaboration
			:type ExtendedUMLCorePackage_AssociationRole
			:location "30:3-30:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ownedEltClass"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_Collaboration
			:type ExtendedUMLCorePackage_ClassifierRole
			:location "31:3-31:54"
			:isContainer true
		)]
	) ) ( def ExtendedUMLCorePackage_InteractionPackage ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "providerClause"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_InteractionPackage
			:type ExtendedUMLCorePackage_ProviderClause
			:location "35:3-35:68"
			:isContainer false
			:opposite ownedEltInt
		) ( struct-map
			KM3_Reference
			:name "ownedElt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_InteractionPackage
			:type ExtendedUMLCorePackage_Interaction
			:location "36:3-36:36"
			:isContainer false
		)]
	) ) ( def ExtendedUMLCorePackage_Interaction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "context"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_Interaction
			:type ExtendedUMLCorePackage_Collaboration
			:location "40:3-40:60"
			:isContainer false
			:opposite interaction
		) ( struct-map
			KM3_Reference
			:name "message"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_Interaction
			:type ExtendedUMLCorePackage_Message
			:location "41:3-41:70"
			:isContainer true
			:opposite interaction
		)]
	) ) ( def ExtendedUMLCorePackage_AssociationRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "connection"
			:upper 2
			:lower 2
			:isOrdered false
			:owner ExtendedUMLCorePackage_AssociationRole
			:type ExtendedUMLCorePackage_AssociationEndRole
			:location "45:3-45:88"
			:isContainer true
			:opposite associationRole
		)]
	) ) ( def ExtendedUMLCorePackage_ClassifierRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "associationEndRole"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ExtendedUMLCorePackage_ClassifierRole
			:type ExtendedUMLCorePackage_AssociationEndRole
			:location "49:3-49:83"
			:isContainer true
			:opposite type
		) ( struct-map
			KM3_Reference
			:name "receiverMess"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_ClassifierRole
			:type ExtendedUMLCorePackage_Message
			:location "50:3-50:56"
			:isContainer false
			:opposite receiver
		) ( struct-map
			KM3_Reference
			:name "senderMess"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_ClassifierRole
			:type ExtendedUMLCorePackage_Message
			:location "51:3-51:52"
			:isContainer false
			:opposite sender
		) ( struct-map
			KM3_Reference
			:name "availableFeature"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ExtendedUMLCorePackage_ClassifierRole
			:type ExtendedUMLCorePackage_Operation
			:location "52:3-52:82"
			:isContainer true
			:opposite classifierRole
		) ( struct-map
			KM3_Reference
			:name "base"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_ClassifierRole
			:type ExtendedUMLCorePackage_Interface
			:location "53:3-53:62"
			:isContainer false
			:opposite classifierRole
		)]
	) ) ( def ExtendedUMLCorePackage_AssociationEndRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "associationRole"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_AssociationEndRole
			:type ExtendedUMLCorePackage_AssociationRole
			:location "57:3-57:69"
			:isContainer false
			:opposite connection
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_AssociationEndRole
			:type ExtendedUMLCorePackage_ClassifierRole
			:location "58:3-58:65"
			:isContainer false
			:opposite associationEndRole
		)]
	) ) ( def ExtendedUMLCorePackage_Message ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "message"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ExtendedUMLCorePackage_Message
			:type ExtendedUMLCorePackage_Message
			:location "62:3-62:56"
			:isContainer false
			:opposite activator
		) ( struct-map
			KM3_Reference
			:name "activator"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ExtendedUMLCorePackage_Message
			:type ExtendedUMLCorePackage_Message
			:location "63:3-63:58"
			:isContainer false
			:opposite message
		) ( struct-map
			KM3_Reference
			:name "interaction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ExtendedUMLCorePackage_Message
			:type ExtendedUMLCorePackage_Interaction
			:location "64:3-64:62"
			:isContainer false
			:opposite message
		) ( struct-map
			KM3_Reference
			:name "receiver"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_Message
			:type ExtendedUMLCorePackage_ClassifierRole
			:location "65:3-65:63"
			:isContainer false
			:opposite receiverMess
		) ( struct-map
			KM3_Reference
			:name "sender"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_Message
			:type ExtendedUMLCorePackage_ClassifierRole
			:location "66:3-66:59"
			:isContainer false
			:opposite senderMess
		) ( struct-map
			KM3_Reference
			:name "specification"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_Message
			:type ExtendedUMLCorePackage_Request
			:location "67:3-67:56"
			:isContainer false
			:opposite message
		)]
	) ) ( def ExtendedUMLCorePackage_Request ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "message"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ExtendedUMLCorePackage_Request
			:type ExtendedUMLCorePackage_Message
			:location "71:3-71:60"
			:isContainer false
			:opposite specification
		)]
	) ) ( def ExtendedUMLCorePackage_Operation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ExtendedUMLCorePackage_Request]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "classifierRole"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ExtendedUMLCorePackage_Operation
			:type ExtendedUMLCorePackage_ClassifierRole
			:location "75:3-75:77"
			:isContainer false
			:opposite availableFeature
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ExtendedUMLCorePackage_Operation
			:type ExtendedUMLCorePackage_Interface
			:location "76:3-76:56"
			:isContainer false
			:opposite feature
		)]
	) ) ( def ExtendedUMLCorePackage_Interface ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "classifierRole"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ExtendedUMLCorePackage_Interface
			:type ExtendedUMLCorePackage_ClassifierRole
			:location "80:3-80:65"
			:isContainer false
			:opposite base
		) ( struct-map
			KM3_Reference
			:name "feature"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ExtendedUMLCorePackage_Interface
			:type ExtendedUMLCorePackage_Operation
			:location "81:3-81:64"
			:isContainer true
			:opposite owner
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "86:2-86:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "87:2-87:19"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "88:2-88:18"
	) )]
) )
