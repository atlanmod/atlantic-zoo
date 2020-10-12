( declare DoDAF_Element )
( declare DoDAF_DoDAFModel )
( declare DoDAF_Document )
( declare DoDAF_AMSpecification )
( declare DoDAF_AMSpecificationElement )
( declare DoDAF_PAExchangeRequirement )
( declare DoDAF_ArchitectureDocument )
( declare DoDAF_IE )
( declare DoDAF_AMIERole )
( declare DoDAF_Control )
( declare DoDAF_Input )
( declare DoDAF_Output )
( declare DoDAF_Mechanism )
( declare DoDAF_MechanismSystem )
( declare DoDAF_MechanismReference )
( declare DoDAF_MechanismFacility )
( declare DoDAF_InformationAssetDocument )
( declare DoDAF_AMPA )
( declare DoDAF_PACapability )
( declare DoDAF_PA )
( declare DoDAF_AM )
( declare DoDAF_InformationAsset )
( declare DoDAF_Task )
( declare DoDAF_PATask )
( declare DoDAF_Organization )
( declare DoDAF_OrganizationType )
( declare DoDAF_OperationalRole )
( declare DoDAF_Occupation )
( declare DoDAF_PersonType )
( declare DoDAF_Skill )
( declare DoDAF_DOSCR )
( declare PrimitiveTypes_String )
( def DoDAF ( struct-map
	KM3_Package
	:contents[( def DoDAF_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Element
			:type String
			:location "26:3-26:27"
		) ( struct-map
			KM3_Attribute
			:name "description"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Element
			:type String
			:location "27:3-27:34"
		) ( struct-map
			KM3_Attribute
			:name "view"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Element
			:type String
			:location "28:3-28:27"
		)]
	) ) ( def DoDAF_DoDAFModel ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "document"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_Document
			:location "35:3-35:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "am"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_AM
			:location "36:3-36:34"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "task"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_Task
			:location "37:3-37:38"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "iaDocument"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_InformationAssetDocument
			:location "38:3-38:64"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "amSpecification"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_AMSpecification
			:location "39:3-39:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "doscr"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_DOSCR
			:location "40:3-40:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "organizationType"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DoDAFModel
			:type DoDAF_OrganizationType
			:location "41:3-41:62"
			:isContainer true
		)]
	) ) ( def DoDAF_Document ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Document
			:type String
			:location "49:3-49:27"
		) ( struct-map
			KM3_Reference
			:name "cites"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Document
			:type DoDAF_InformationAssetDocument
			:location "50:3-50:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "records"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Document
			:type DoDAF_ArchitectureDocument
			:location "51:3-51:57"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isTheReferenceFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Document
			:type DoDAF_IE
			:location "52:3-52:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isThePrimaryReferenceFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Document
			:type DoDAF_PA
			:location "53:3-53:56"
			:isContainer true
		)]
	) ) ( def DoDAF_AMSpecification ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Document]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isSpecifiedUsing"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AMSpecification
			:type DoDAF_AMSpecificationElement
			:location "59:3-59:68"
			:isContainer true
		)]
	) ) ( def DoDAF_AMSpecificationElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "subject"
			:upper 1
			:lower 0
			:isOrdered false
			:owner DoDAF_AMSpecificationElement
			:type DoDAF_PAExchangeRequirement
			:location "65:3-65:76"
			:isContainer false
			:opposite isTheSubjectOf
		)]
	) ) ( def DoDAF_PAExchangeRequirement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isTheSubjectOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PAExchangeRequirement
			:type DoDAF_AMSpecificationElement
			:location "71:3-71:75"
			:isContainer false
			:opposite subject
		)]
	) ) ( def DoDAF_ArchitectureDocument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[]
	) ) ( def DoDAF_IE ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isAssociatedWith"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_IE
			:type DoDAF_AMIERole
			:location "81:3-81:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isOrdinateOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_IE
			:type DoDAF_IE
			:location "82:3-82:61"
			:isContainer false
			:opposite isSubordinateOf
		) ( struct-map
			KM3_Reference
			:name "isSubordinateOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_IE
			:type DoDAF_IE
			:location "83:3-83:61"
			:isContainer false
			:opposite isOrdinateOf
		)]
	) ) ( def DoDAF_AMIERole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "defines"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AMIERole
			:type DoDAF_AMPA
			:location "90:3-90:31"
			:isContainer false
		)]
	) ) ( def DoDAF_Control ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_AMIERole]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Control
			:type String
			:location "96:3-96:29"
		) ( struct-map
			KM3_Attribute
			:name "destination"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Control
			:type String
			:location "97:3-97:34"
		)]
	) ) ( def DoDAF_Input ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_AMIERole]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Input
			:type String
			:location "104:3-104:29"
		) ( struct-map
			KM3_Attribute
			:name "destination"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Input
			:type String
			:location "105:3-105:34"
		) ( struct-map
			KM3_Attribute
			:name "information"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Input
			:type String
			:location "106:3-106:34"
		) ( struct-map
			KM3_Reference
			:name "isTheInputThatIsDefinedBy"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Input
			:type DoDAF_Output
			:location "103:3-103:51"
			:isContainer false
		)]
	) ) ( def DoDAF_Output ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_AMIERole]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Output
			:type String
			:location "112:3-112:29"
		) ( struct-map
			KM3_Attribute
			:name "destination"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Output
			:type String
			:location "113:3-113:34"
		) ( struct-map
			KM3_Attribute
			:name "information"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Output
			:type String
			:location "114:3-114:34"
		)]
	) ) ( def DoDAF_Mechanism ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_AMIERole]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Mechanism
			:type String
			:location "120:3-120:29"
		) ( struct-map
			KM3_Attribute
			:name "destination"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Mechanism
			:type String
			:location "121:3-121:34"
		) ( struct-map
			KM3_Attribute
			:name "resourceType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Mechanism
			:type String
			:location "122:3-122:35"
		)]
	) ) ( def DoDAF_MechanismSystem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Mechanism]
		:structuralFeatures[]
	) ) ( def DoDAF_MechanismReference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Mechanism]
		:structuralFeatures[]
	) ) ( def DoDAF_MechanismFacility ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Mechanism]
		:structuralFeatures[]
	) ) ( def DoDAF_InformationAssetDocument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[]
	) ) ( def DoDAF_AMPA ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isOrdinateOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AMPA
			:type DoDAF_AMPA
			:location "145:3-145:63"
			:isContainer false
			:opposite isSubordinateOf
		) ( struct-map
			KM3_Reference
			:name "isSubordinateOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AMPA
			:type DoDAF_AMPA
			:location "146:3-146:63"
			:isContainer false
			:opposite isOrdinateOf
		) ( struct-map
			KM3_Reference
			:name "defines"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AMPA
			:type DoDAF_AMIERole
			:location "147:3-147:45"
			:isContainer true
		)]
	) ) ( def DoDAF_PACapability ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[]
	) ) ( def DoDAF_PA ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isTheProducerFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PA
			:type DoDAF_PAExchangeRequirement
			:location "157:3-157:67"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isTheConsumerFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PA
			:type DoDAF_PAExchangeRequirement
			:location "158:3-158:67"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isParentFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PA
			:type DoDAF_PA
			:location "159:3-159:55"
			:isContainer false
			:opposite isChildFor
		) ( struct-map
			KM3_Reference
			:name "isChildFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PA
			:type DoDAF_PA
			:location "160:3-160:55"
			:isContainer false
			:opposite isParentFor
		) ( struct-map
			KM3_Reference
			:name "has"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PA
			:type DoDAF_PACapability
			:location "161:3-161:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isIncludedIn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PA
			:type DoDAF_AMPA
			:location "162:3-162:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "correspondsTo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PA
			:type DoDAF_PATask
			:location "163:3-163:39"
			:isContainer false
		)]
	) ) ( def DoDAF_AM ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_InformationAsset]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_AM
			:type String
			:location "169:3-169:27"
		) ( struct-map
			KM3_Reference
			:name "specifies"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AM
			:type DoDAF_AMSpecification
			:location "170:3-170:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "includes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AM
			:type DoDAF_AMPA
			:location "171:3-171:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "paTask"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_AM
			:type DoDAF_PATask
			:location "172:3-172:32"
			:isContainer false
		)]
	) ) ( def DoDAF_InformationAsset ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isDescribedUsing"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_InformationAsset
			:type DoDAF_PACapability
			:location "178:3-178:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "isCitedIn"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_InformationAsset
			:type DoDAF_InformationAssetDocument
			:location "179:3-179:53"
			:isContainer false
		)]
	) ) ( def DoDAF_Task ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "levelIdentifier"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Task
			:type String
			:location "185:3-185:38"
		) ( struct-map
			KM3_Attribute
			:name "references"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Task
			:type String
			:location "186:3-186:33"
		) ( struct-map
			KM3_Attribute
			:name "cost"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Task
			:type String
			:location "187:3-187:27"
		)]
	) ) ( def DoDAF_PATask ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Task]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isCitedBy"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_PATask
			:type DoDAF_InformationAsset
			:location "193:3-193:42"
			:isContainer false
		)]
	) ) ( def DoDAF_Organization ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_Organization
			:type DoDAF_OrganizationType
			:location "199:3-199:60"
			:isContainer false
			:opposite isTheTypeOf
		) ( struct-map
			KM3_Reference
			:name "supplies"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Organization
			:type DoDAF_InformationAsset
			:location "200:3-200:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "providesStewardshipFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Organization
			:type DoDAF_InformationAsset
			:location "201:3-201:58"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "owns"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Organization
			:type DoDAF_InformationAsset
			:location "202:3-202:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "develops"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Organization
			:type DoDAF_IE
			:location "203:3-203:30"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "isCitedAs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Organization
			:type DoDAF_MechanismReference
			:location "204:3-204:47"
			:isContainer false
		)]
	) ) ( def DoDAF_OrganizationType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isTheTypeOf"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_OrganizationType
			:type DoDAF_Organization
			:location "210:3-210:69"
			:isContainer true
			:opposite type
		) ( struct-map
			KM3_Reference
			:name "isCitedAs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_OrganizationType
			:type DoDAF_MechanismReference
			:location "211:3-211:57"
			:isContainer true
		)]
	) ) ( def DoDAF_OperationalRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isCitedAs"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_OperationalRole
			:type DoDAF_MechanismReference
			:location "217:3-217:57"
			:isContainer true
		)]
	) ) ( def DoDAF_Occupation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mayBeCitedForOR"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Occupation
			:type DoDAF_OperationalRole
			:location "223:3-223:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "mayBeCitedForPT"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Occupation
			:type DoDAF_PersonType
			:location "224:3-224:55"
			:isContainer true
		)]
	) ) ( def DoDAF_PersonType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mayBeCitedFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PersonType
			:type DoDAF_OperationalRole
			:location "230:3-230:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "can"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_PersonType
			:type DoDAF_Skill
			:location "231:3-231:38"
			:isContainer true
		)]
	) ) ( def DoDAF_Skill ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mayBeCitedFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_Skill
			:type DoDAF_OperationalRole
			:location "237:3-237:58"
			:isContainer true
		)]
	) ) ( def DoDAF_DOSCR ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[DoDAF_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mayBeAn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner DoDAF_DOSCR
			:type DoDAF_Occupation
			:location "243:3-243:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "appliesTo"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DOSCR
			:type DoDAF_PersonType
			:location "244:3-244:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "mayBeCitedFor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner DoDAF_DOSCR
			:type DoDAF_OperationalRole
			:location "245:3-245:58"
			:isContainer true
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "255:2-255:18"
	) )]
) )
