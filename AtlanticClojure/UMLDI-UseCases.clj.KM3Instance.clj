( declare Core_Element )
( declare Core_ModelElement )
( declare Core_GeneralizableElement )
( declare Core_Namespace )
( declare Core_Classifier )
( declare Core_Feature )
( declare Core_StructuralFeature )
( declare Core_AssociationEnd )
( declare Core_Relationship )
( declare Core_Association )
( declare Core_Attribute )
( declare Core_Generalization )
( declare Common_Behavior_Instance )
( declare Common_Behavior_AttributeLink )
( declare Common_Behavior_Link )
( declare Common_Behavior_LinkEnd )
( declare Common_Behavior_ComponentInstance )
( declare Common_Behavior_NodeInstance )
( declare Use_Cases_UseCase )
( declare Use_Cases_Actor )
( declare Use_Cases_UseCaseInstance )
( declare Use_Cases_Extend )
( declare Use_Cases_Include )
( declare Use_Cases_ExtensionPoint )
( declare Data_Types_AggregationKind )
( declare Data_Types_ChangeableKind )
( declare Data_Types_OrderingKind )
( declare Data_Types_ScopeKind )
( declare Data_Types_VisibilityKind )
( declare Data_Types_Multiplicity )
( declare Data_Types_MultiplicityRange )
( declare Data_Types_Expression )
( declare Data_Types_BooleanExpression )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Float )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Long )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Double )
( def Core ( struct-map
	KM3_Package
	:contents[( def Core_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Core_ModelElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Core_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_ModelElement
			:type String
			:location "15:3-15:32"
		) ( struct-map
			KM3_Attribute
			:name "visibility"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_ModelElement
			:type VisibilityKind
			:location "16:3-16:46"
		) ( struct-map
			KM3_Attribute
			:name "isSpecification"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_ModelElement
			:type Boolean
			:location "17:3-17:39"
		) ( struct-map
			KM3_Reference
			:name "namespace"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_ModelElement
			:type Core_Namespace
			:location "14:3-14:64"
			:isContainer false
			:opposite ownedElement
		)]
	) ) ( def Core_GeneralizableElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isRoot"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_GeneralizableElement
			:type Boolean
			:location "22:3-22:30"
		) ( struct-map
			KM3_Attribute
			:name "isLeaf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_GeneralizableElement
			:type Boolean
			:location "23:3-23:30"
		) ( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_GeneralizableElement
			:type Boolean
			:location "24:3-24:34"
		) ( struct-map
			KM3_Reference
			:name "generalization"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_GeneralizableElement
			:type Core_Generalization
			:location "21:3-21:65"
			:isContainer false
			:opposite child
		)]
	) ) ( def Core_Namespace ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedElement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_Namespace
			:type Core_ModelElement
			:location "28:3-28:75"
			:isContainer true
			:opposite namespace
		)]
	) ) ( def Core_Classifier ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Core_GeneralizableElement Core_Namespace]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "powertypeRange"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_Classifier
			:type Core_Generalization
			:location "32:3-32:69"
			:isContainer false
			:opposite powertype
		) ( struct-map
			KM3_Reference
			:name "feature"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Core_Classifier
			:type Core_Feature
			:location "33:3-33:69"
			:isContainer true
			:opposite owner
		)]
	) ) ( def Core_Feature ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "ownerScope"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Feature
			:type ScopeKind
			:location "38:3-38:36"
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Feature
			:type Core_Classifier
			:location "37:3-37:56"
			:isContainer false
			:opposite feature
		)]
	) ) ( def Core_StructuralFeature ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Core_Feature]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "multiplicity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_StructuralFeature
			:type Multiplicity
			:location "43:3-43:46"
		) ( struct-map
			KM3_Attribute
			:name "changeability"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_StructuralFeature
			:type ChangeableKind
			:location "44:3-44:49"
		) ( struct-map
			KM3_Attribute
			:name "targetScope"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_StructuralFeature
			:type ScopeKind
			:location "45:3-45:42"
		) ( struct-map
			KM3_Attribute
			:name "ordering"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_StructuralFeature
			:type OrderingKind
			:location "46:3-46:42"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_StructuralFeature
			:type Core_Classifier
			:location "42:3-42:31"
			:isContainer false
		)]
	) ) ( def Core_AssociationEnd ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isNavigable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_AssociationEnd
			:type Boolean
			:location "54:3-54:35"
		) ( struct-map
			KM3_Attribute
			:name "ordering"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_AssociationEnd
			:type OrderingKind
			:location "55:3-55:42"
		) ( struct-map
			KM3_Attribute
			:name "aggregation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_AssociationEnd
			:type AggregationKind
			:location "56:3-56:48"
		) ( struct-map
			KM3_Attribute
			:name "targetScope"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_AssociationEnd
			:type ScopeKind
			:location "57:3-57:42"
		) ( struct-map
			KM3_Attribute
			:name "multiplicity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_AssociationEnd
			:type Multiplicity
			:location "58:3-58:46"
		) ( struct-map
			KM3_Attribute
			:name "changeability"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_AssociationEnd
			:type ChangeableKind
			:location "59:3-59:49"
		) ( struct-map
			KM3_Reference
			:name "association"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_AssociationEnd
			:type Core_Association
			:location "50:3-50:61"
			:isContainer false
			:opposite connection
		) ( struct-map
			KM3_Reference
			:name "specification"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_AssociationEnd
			:type Core_Classifier
			:location "51:3-51:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "participant"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_AssociationEnd
			:type Core_Classifier
			:location "52:3-52:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "qualifier"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Core_AssociationEnd
			:type Core_Attribute
			:location "53:3-53:82"
			:isContainer true
			:opposite associationEnd
		)]
	) ) ( def Core_Relationship ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Core_ModelElement]
		:structuralFeatures[]
	) ) ( def Core_Association ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_GeneralizableElement Core_Relationship]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "connection"
			:upper -1
			:lower 2
			:isOrdered true
			:owner Core_Association
			:type Core_AssociationEnd
			:location "65:3-65:87"
			:isContainer true
			:opposite association
		)]
	) ) ( def Core_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_StructuralFeature]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "initialValue"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Attribute
			:type Expression
			:location "70:3-70:44"
		) ( struct-map
			KM3_Reference
			:name "associationEnd"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Attribute
			:type Core_AssociationEnd
			:location "69:3-69:71"
			:isContainer false
			:opposite qualifier
		)]
	) ) ( def Core_Generalization ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Relationship]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "discriminator"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Generalization
			:type String
			:location "77:3-77:41"
		) ( struct-map
			KM3_Reference
			:name "parent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Generalization
			:type Core_GeneralizableElement
			:location "74:3-74:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "powertype"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Generalization
			:type Core_Classifier
			:location "75:3-75:67"
			:isContainer false
			:opposite powertypeRange
		) ( struct-map
			KM3_Reference
			:name "child"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Generalization
			:type Core_GeneralizableElement
			:location "76:3-76:68"
			:isContainer false
			:opposite generalization
		)]
	) )]
) )
( def Common_Behavior ( struct-map
	KM3_Package
	:contents[( def Common_Behavior_Instance ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ownedInstance"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Instance
			:type Common_Behavior_Instance
			:location "84:3-84:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "linkEnd"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Instance
			:type Common_Behavior_LinkEnd
			:location "85:3-85:54"
			:isContainer false
			:opposite instance
		) ( struct-map
			KM3_Reference
			:name "classifier"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Instance
			:type Core_Classifier
			:location "86:3-86:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "componentInstance"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Instance
			:type Common_Behavior_ComponentInstance
			:location "87:3-87:76"
			:isContainer false
			:opposite resident
		) ( struct-map
			KM3_Reference
			:name "slot"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Instance
			:type Common_Behavior_AttributeLink
			:location "88:3-88:67"
			:isContainer true
			:opposite instance
		) ( struct-map
			KM3_Reference
			:name "ownedLink"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Instance
			:type Common_Behavior_Link
			:location "89:3-89:43"
			:isContainer true
		)]
	) ) ( def Common_Behavior_AttributeLink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "instance"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_AttributeLink
			:type Common_Behavior_Instance
			:location "93:3-93:54"
			:isContainer false
			:opposite slot
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_AttributeLink
			:type Common_Behavior_Instance
			:location "94:3-94:30"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "linkEnd"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_AttributeLink
			:type Common_Behavior_LinkEnd
			:location "95:3-95:62"
			:isContainer false
			:opposite qualifiedValue
		) ( struct-map
			KM3_Reference
			:name "attribute"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_AttributeLink
			:type Core_Attribute
			:location "96:3-96:37"
			:isContainer false
		)]
	) ) ( def Common_Behavior_Link ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "association"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Link
			:type Core_Association
			:location "100:3-100:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "connection"
			:upper -1
			:lower 2
			:isOrdered false
			:owner Common_Behavior_Link
			:type Common_Behavior_LinkEnd
			:location "101:3-101:65"
			:isContainer true
			:opposite link
		)]
	) ) ( def Common_Behavior_LinkEnd ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "link"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_LinkEnd
			:type Common_Behavior_Link
			:location "105:3-105:47"
			:isContainer false
			:opposite connection
		) ( struct-map
			KM3_Reference
			:name "qualifiedValue"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Common_Behavior_LinkEnd
			:type Common_Behavior_AttributeLink
			:location "106:3-106:84"
			:isContainer true
			:opposite linkEnd
		) ( struct-map
			KM3_Reference
			:name "instance"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_LinkEnd
			:type Common_Behavior_Instance
			:location "107:3-107:52"
			:isContainer false
			:opposite linkEnd
		) ( struct-map
			KM3_Reference
			:name "associationEnd"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_LinkEnd
			:type Core_AssociationEnd
			:location "108:3-108:45"
			:isContainer false
		)]
	) ) ( def Common_Behavior_ComponentInstance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Common_Behavior_Instance]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "resident"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_ComponentInstance
			:type Common_Behavior_Instance
			:location "112:3-112:65"
			:isContainer false
			:opposite componentInstance
		) ( struct-map
			KM3_Reference
			:name "nodeInstance"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_ComponentInstance
			:type Common_Behavior_NodeInstance
			:location "113:3-113:66"
			:isContainer false
			:opposite resident
		)]
	) ) ( def Common_Behavior_NodeInstance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Common_Behavior_Instance]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "resident"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_NodeInstance
			:type Common_Behavior_ComponentInstance
			:location "117:3-117:69"
			:isContainer false
			:opposite nodeInstance
		)]
	) )]
) )
( def Use_Cases ( struct-map
	KM3_Package
	:contents[( def Use_Cases_UseCase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Classifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "include"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Use_Cases_UseCase
			:type Use_Cases_Include
			:location "124:3-124:50"
			:isContainer false
			:opposite base
		) ( struct-map
			KM3_Reference
			:name "extend"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Use_Cases_UseCase
			:type Use_Cases_Extend
			:location "125:3-125:53"
			:isContainer false
			:opposite extension
		) ( struct-map
			KM3_Reference
			:name "extensionPoint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Use_Cases_UseCase
			:type Use_Cases_ExtensionPoint
			:location "126:3-126:77"
			:isContainer true
			:opposite useCase
		)]
	) ) ( def Use_Cases_Actor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Classifier]
		:structuralFeatures[]
	) ) ( def Use_Cases_UseCaseInstance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Common_Behavior_Instance]
		:structuralFeatures[]
	) ) ( def Use_Cases_Extend ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Relationship]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Use_Cases_Extend
			:type BooleanExpression
			:location "139:3-139:43"
		) ( struct-map
			KM3_Reference
			:name "extensionPoint"
			:upper -1
			:lower 1
			:isOrdered true
			:owner Use_Cases_Extend
			:type Use_Cases_ExtensionPoint
			:location "136:3-136:58"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "extension"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Use_Cases_Extend
			:type Use_Cases_UseCase
			:location "137:3-137:51"
			:isContainer false
			:opposite extend
		) ( struct-map
			KM3_Reference
			:name "base"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Use_Cases_Extend
			:type Use_Cases_UseCase
			:location "138:3-138:28"
			:isContainer false
		)]
	) ) ( def Use_Cases_Include ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Relationship]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "addition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Use_Cases_Include
			:type Use_Cases_UseCase
			:location "143:3-143:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "base"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Use_Cases_Include
			:type Use_Cases_UseCase
			:location "144:3-144:47"
			:isContainer false
			:opposite include
		)]
	) ) ( def Use_Cases_ExtensionPoint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Use_Cases_ExtensionPoint
			:type String
			:location "149:3-149:31"
		) ( struct-map
			KM3_Reference
			:name "useCase"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Use_Cases_ExtensionPoint
			:type Use_Cases_UseCase
			:location "148:3-148:57"
			:isContainer false
			:opposite extensionPoint
		)]
	) )]
) )
( def Data_Types ( struct-map
	KM3_Package
	:contents[( def AggregationKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ak_none"
		:location "155:3-155:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "ak_aggregate"
		:location "156:3-156:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "ak_composite"
		:location "157:3-157:24"
	)] ) ) ( def ChangeableKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ck_changeable"
		:location "161:3-161:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "ck_frozen"
		:location "162:3-162:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "ck_addOnly"
		:location "163:3-163:22"
	)] ) ) ( def OrderingKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ok_unordered"
		:location "167:3-167:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "ok_ordered"
		:location "168:3-168:22"
	)] ) ) ( def ScopeKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "sk_instance"
		:location "172:3-172:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "sk_classifier"
		:location "173:3-173:25"
	)] ) ) ( def VisibilityKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "vk_public"
		:location "177:3-177:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_protected"
		:location "178:3-178:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_private"
		:location "179:3-179:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_package"
		:location "180:3-180:22"
	)] ) ) ( def Data_Types_Multiplicity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "range"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Data_Types_Multiplicity
			:type Data_Types_MultiplicityRange
			:location "184:3-184:78"
			:isContainer true
			:opposite multiplicity
		)]
	) ) ( def Data_Types_MultiplicityRange ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "lower"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Data_Types_MultiplicityRange
			:type Integer
			:location "189:3-189:29"
		) ( struct-map
			KM3_Attribute
			:name "upper"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Data_Types_MultiplicityRange
			:type Integer
			:location "190:3-190:29"
		) ( struct-map
			KM3_Reference
			:name "multiplicity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Data_Types_MultiplicityRange
			:type Data_Types_Multiplicity
			:location "188:3-188:58"
			:isContainer false
			:opposite range
		)]
	) ) ( def Data_Types_Expression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "language"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Data_Types_Expression
			:type String
			:location "194:3-194:36"
		) ( struct-map
			KM3_Attribute
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Data_Types_Expression
			:type String
			:location "195:3-195:27"
		)]
	) ) ( def Data_Types_BooleanExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Data_Types_Expression]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "204:2-204:19"
	) ) ( def ptyp_Float ( struct-map
		KM3_DataType
		:name "Float"
		:location "205:2-205:17"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "206:2-206:19"
	) ) ( def ptyp_Long ( struct-map
		KM3_DataType
		:name "Long"
		:location "207:2-207:16"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "208:2-208:18"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "209:2-209:18"
	) )]
) )
