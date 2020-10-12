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
( declare Core_BehavioralFeature )
( declare Core_Operation )
( declare Core_Parameter )
( declare Core_Generalization )
( declare Common_Behavior_Instance )
( declare Common_Behavior_Signal )
( declare Common_Behavior_Action )
( declare Common_Behavior_CreateAction )
( declare Common_Behavior_DestroyAction )
( declare Common_Behavior_UninterpretedAction )
( declare Common_Behavior_AttributeLink )
( declare Common_Behavior_Object )
( declare Common_Behavior_Link )
( declare Common_Behavior_LinkObject )
( declare Common_Behavior_DataValue )
( declare Common_Behavior_CallAction )
( declare Common_Behavior_SendAction )
( declare Common_Behavior_ActionSequence )
( declare Common_Behavior_Argument )
( declare Common_Behavior_Reception )
( declare Common_Behavior_LinkEnd )
( declare Common_Behavior_ReturnAction )
( declare Common_Behavior_TerminateAction )
( declare Common_Behavior_Stimulus )
( declare Common_Behavior_Exception )
( declare Common_Behavior_ComponentInstance )
( declare Common_Behavior_NodeInstance )
( declare Common_Behavior_SubsystemInstance )
( declare Collaborations_Collaboration )
( declare Collaborations_ClassifierRole )
( declare Collaborations_AssociationRole )
( declare Collaborations_AssociationEndRole )
( declare Collaborations_Message )
( declare Collaborations_Interaction )
( declare Collaborations_InteractionInstanceSet )
( declare Collaborations_CollaborationInstanceSet )
( declare Data_Types_AggregationKind )
( declare Data_Types_ChangeableKind )
( declare Data_Types_OrderingKind )
( declare Data_Types_CallConcurrencyKind )
( declare Data_Types_ParameterDirectionKind )
( declare Data_Types_ScopeKind )
( declare Data_Types_VisibilityKind )
( declare Data_Types_Multiplicity )
( declare Data_Types_MultiplicityRange )
( declare Data_Types_Expression )
( declare Data_Types_BooleanExpression )
( declare Data_Types_ObjectSetExpression )
( declare Data_Types_ActionExpression )
( declare Data_Types_IterationExpression )
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
	) ) ( def Core_BehavioralFeature ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Core_Feature]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isQuery"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_BehavioralFeature
			:type Boolean
			:location "75:3-75:31"
		) ( struct-map
			KM3_Reference
			:name "parameter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Core_BehavioralFeature
			:type Core_Parameter
			:location "74:3-74:85"
			:isContainer true
			:opposite behavioralFeature
		)]
	) ) ( def Core_Operation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_BehavioralFeature]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "concurrency"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Operation
			:type CallConcurrencyKind
			:location "79:3-79:52"
		) ( struct-map
			KM3_Attribute
			:name "isRoot"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Operation
			:type Boolean
			:location "80:3-80:30"
		) ( struct-map
			KM3_Attribute
			:name "isLeaf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Operation
			:type Boolean
			:location "81:3-81:30"
		) ( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Operation
			:type Boolean
			:location "82:3-82:34"
		) ( struct-map
			KM3_Attribute
			:name "specification"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Operation
			:type String
			:location "83:3-83:41"
		)]
	) ) ( def Core_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "defaultValue"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Parameter
			:type Expression
			:location "89:3-89:44"
		) ( struct-map
			KM3_Attribute
			:name "kind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Parameter
			:type ParameterDirectionKind
			:location "90:3-90:43"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Parameter
			:type Core_Classifier
			:location "87:3-87:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "behavioralFeature"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Parameter
			:type Core_BehavioralFeature
			:location "88:3-88:77"
			:isContainer false
			:opposite parameter
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
			:location "97:3-97:41"
		) ( struct-map
			KM3_Reference
			:name "parent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Generalization
			:type Core_GeneralizableElement
			:location "94:3-94:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "powertype"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Generalization
			:type Core_Classifier
			:location "95:3-95:67"
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
			:location "96:3-96:68"
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
			:location "104:3-104:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "linkEnd"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Instance
			:type Common_Behavior_LinkEnd
			:location "105:3-105:54"
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
			:location "106:3-106:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "componentInstance"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Instance
			:type Common_Behavior_ComponentInstance
			:location "107:3-107:76"
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
			:location "108:3-108:67"
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
			:location "109:3-109:43"
			:isContainer true
		)]
	) ) ( def Common_Behavior_Signal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Classifier]
		:structuralFeatures[]
	) ) ( def Common_Behavior_Action ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "recurrence"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Action
			:type IterationExpression
			:location "118:3-118:51"
		) ( struct-map
			KM3_Attribute
			:name "target"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Action
			:type ObjectSetExpression
			:location "119:3-119:47"
		) ( struct-map
			KM3_Attribute
			:name "isAsynchronous"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Action
			:type Boolean
			:location "120:3-120:38"
		) ( struct-map
			KM3_Attribute
			:name "script"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Action
			:type ActionExpression
			:location "121:3-121:44"
		) ( struct-map
			KM3_Reference
			:name "actualArgument"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Common_Behavior_Action
			:type Common_Behavior_Argument
			:location "116:3-116:78"
			:isContainer true
			:opposite action
		) ( struct-map
			KM3_Reference
			:name "actionSequence"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Action
			:type Common_Behavior_ActionSequence
			:location "117:3-117:68"
			:isContainer false
			:opposite action
		)]
	) ) ( def Common_Behavior_CreateAction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Common_Behavior_Action]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "instantiation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_CreateAction
			:type Core_Classifier
			:location "125:3-125:40"
			:isContainer false
		)]
	) ) ( def Common_Behavior_DestroyAction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Common_Behavior_Action]
		:structuralFeatures[]
	) ) ( def Common_Behavior_UninterpretedAction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Common_Behavior_Action]
		:structuralFeatures[]
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
			:location "133:3-133:54"
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
			:location "134:3-134:30"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "linkEnd"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_AttributeLink
			:type Common_Behavior_LinkEnd
			:location "135:3-135:62"
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
			:location "136:3-136:37"
			:isContainer false
		)]
	) ) ( def Common_Behavior_Object ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Common_Behavior_Instance]
		:structuralFeatures[]
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
			:location "142:3-142:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "connection"
			:upper -1
			:lower 2
			:isOrdered false
			:owner Common_Behavior_Link
			:type Common_Behavior_LinkEnd
			:location "143:3-143:65"
			:isContainer true
			:opposite link
		)]
	) ) ( def Common_Behavior_LinkObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Common_Behavior_Object Common_Behavior_Link]
		:structuralFeatures[]
	) ) ( def Common_Behavior_DataValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Common_Behavior_Instance]
		:structuralFeatures[]
	) ) ( def Common_Behavior_CallAction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Common_Behavior_Action]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "operation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_CallAction
			:type Core_Operation
			:location "151:3-151:37"
			:isContainer false
		)]
	) ) ( def Common_Behavior_SendAction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Common_Behavior_Action]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "signal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_SendAction
			:type Common_Behavior_Signal
			:location "155:3-155:29"
			:isContainer false
		)]
	) ) ( def Common_Behavior_ActionSequence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Common_Behavior_Action]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "action"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Common_Behavior_ActionSequence
			:type Common_Behavior_Action
			:location "159:3-159:76"
			:isContainer true
			:opposite actionSequence
		)]
	) ) ( def Common_Behavior_Argument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Argument
			:type Expression
			:location "164:3-164:32"
		) ( struct-map
			KM3_Reference
			:name "action"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Argument
			:type Common_Behavior_Action
			:location "163:3-163:60"
			:isContainer false
			:opposite actualArgument
		)]
	) ) ( def Common_Behavior_Reception ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_BehavioralFeature]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "specification"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Reception
			:type String
			:location "169:3-169:41"
		) ( struct-map
			KM3_Attribute
			:name "isRoot"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Reception
			:type Boolean
			:location "170:3-170:30"
		) ( struct-map
			KM3_Attribute
			:name "isLeaf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Reception
			:type Boolean
			:location "171:3-171:30"
		) ( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Reception
			:type Boolean
			:location "172:3-172:34"
		) ( struct-map
			KM3_Reference
			:name "signal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Reception
			:type Common_Behavior_Signal
			:location "168:3-168:29"
			:isContainer false
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
			:location "176:3-176:47"
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
			:location "177:3-177:84"
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
			:location "178:3-178:52"
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
			:location "179:3-179:45"
			:isContainer false
		)]
	) ) ( def Common_Behavior_ReturnAction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Common_Behavior_Action]
		:structuralFeatures[]
	) ) ( def Common_Behavior_TerminateAction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Common_Behavior_Action]
		:structuralFeatures[]
	) ) ( def Common_Behavior_Stimulus ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "argument"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Common_Behavior_Stimulus
			:type Common_Behavior_Instance
			:location "188:3-188:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "communicationLink"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Stimulus
			:type Common_Behavior_Link
			:location "189:3-189:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "receiver"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Stimulus
			:type Common_Behavior_Instance
			:location "190:3-190:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dispatchAction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Stimulus
			:type Common_Behavior_Action
			:location "191:3-191:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "sender"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Stimulus
			:type Common_Behavior_Instance
			:location "192:3-192:31"
			:isContainer false
		)]
	) ) ( def Common_Behavior_Exception ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Common_Behavior_Signal]
		:structuralFeatures[]
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
			:location "198:3-198:65"
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
			:location "199:3-199:66"
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
			:location "203:3-203:69"
			:isContainer false
			:opposite nodeInstance
		)]
	) ) ( def Common_Behavior_SubsystemInstance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Common_Behavior_Instance]
		:structuralFeatures[]
	) )]
) )
( def Collaborations ( struct-map
	KM3_Package
	:contents[( def Collaborations_Collaboration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_GeneralizableElement Core_Namespace]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "usedCollaboration"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_Collaboration
			:type Collaborations_Collaboration
			:location "211:3-211:50"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "representedOperation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Collaborations_Collaboration
			:type Core_Operation
			:location "212:3-212:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "representedClassifier"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Collaborations_Collaboration
			:type Core_Classifier
			:location "213:3-213:53"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "interaction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_Collaboration
			:type Collaborations_Interaction
			:location "214:3-214:71"
			:isContainer true
			:opposite context
		) ( struct-map
			KM3_Reference
			:name "constrainingElement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_Collaboration
			:type Core_ModelElement
			:location "215:3-215:51"
			:isContainer false
		)]
	) ) ( def Collaborations_ClassifierRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Classifier]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "multiplicity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Collaborations_ClassifierRole
			:type Multiplicity
			:location "223:3-223:46"
		) ( struct-map
			KM3_Reference
			:name "availableContents"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_ClassifierRole
			:type Core_ModelElement
			:location "219:3-219:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "base"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Collaborations_ClassifierRole
			:type Core_Classifier
			:location "220:3-220:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "conformingInstance"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_ClassifierRole
			:type Common_Behavior_Instance
			:location "221:3-221:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "availableFeature"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_ClassifierRole
			:type Core_Feature
			:location "222:3-222:43"
			:isContainer false
		)]
	) ) ( def Collaborations_AssociationRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Association]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "multiplicity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Collaborations_AssociationRole
			:type Multiplicity
			:location "230:3-230:46"
		) ( struct-map
			KM3_Reference
			:name "base"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Collaborations_AssociationRole
			:type Core_Association
			:location "227:3-227:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "conformingLink"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_AssociationRole
			:type Common_Behavior_Link
			:location "228:3-228:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "message"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_AssociationRole
			:type Collaborations_Message
			:location "229:3-229:69"
			:isContainer false
			:opposite communicationConnection
		)]
	) ) ( def Collaborations_AssociationEndRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_AssociationEnd]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "collaborationMultiplicity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Collaborations_AssociationEndRole
			:type Multiplicity
			:location "236:3-236:59"
		) ( struct-map
			KM3_Reference
			:name "base"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Collaborations_AssociationEndRole
			:type Core_AssociationEnd
			:location "234:3-234:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "availableQualifier"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_AssociationEndRole
			:type Core_Attribute
			:location "235:3-235:47"
			:isContainer false
		)]
	) ) ( def Collaborations_Message ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "interaction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Collaborations_Message
			:type Collaborations_Interaction
			:location "240:3-240:58"
			:isContainer false
			:opposite message
		) ( struct-map
			KM3_Reference
			:name "conformingStimulus"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_Message
			:type Common_Behavior_Stimulus
			:location "241:3-241:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "action"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Collaborations_Message
			:type Common_Behavior_Action
			:location "242:3-242:29"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "communicationConnection"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Collaborations_Message
			:type Collaborations_AssociationRole
			:location "243:3-243:79"
			:isContainer false
			:opposite message
		) ( struct-map
			KM3_Reference
			:name "activator"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Collaborations_Message
			:type Collaborations_Message
			:location "244:3-244:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "receiver"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Collaborations_Message
			:type Collaborations_ClassifierRole
			:location "245:3-245:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "sender"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Collaborations_Message
			:type Collaborations_ClassifierRole
			:location "246:3-246:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "predecessor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_Message
			:type Collaborations_Message
			:location "247:3-247:38"
			:isContainer false
		)]
	) ) ( def Collaborations_Interaction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "message"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Collaborations_Interaction
			:type Collaborations_Message
			:location "251:3-251:69"
			:isContainer true
			:opposite interaction
		) ( struct-map
			KM3_Reference
			:name "context"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Collaborations_Interaction
			:type Collaborations_Collaboration
			:location "252:3-252:60"
			:isContainer false
			:opposite interaction
		)]
	) ) ( def Collaborations_InteractionInstanceSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "interaction"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Collaborations_InteractionInstanceSet
			:type Collaborations_Interaction
			:location "256:3-256:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "context"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Collaborations_InteractionInstanceSet
			:type Collaborations_CollaborationInstanceSet
			:location "257:3-257:82"
			:isContainer false
			:opposite interactionInstanceSet
		) ( struct-map
			KM3_Reference
			:name "participatingStimulus"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Collaborations_InteractionInstanceSet
			:type Common_Behavior_Stimulus
			:location "258:3-258:51"
			:isContainer false
		)]
	) ) ( def Collaborations_CollaborationInstanceSet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "collaboration"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Collaborations_CollaborationInstanceSet
			:type Collaborations_Collaboration
			:location "262:3-262:48"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "constrainingElement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_CollaborationInstanceSet
			:type Core_ModelElement
			:location "263:3-263:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "participatingInstance"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Collaborations_CollaborationInstanceSet
			:type Common_Behavior_Instance
			:location "264:3-264:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "interactionInstanceSet"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_CollaborationInstanceSet
			:type Collaborations_InteractionInstanceSet
			:location "265:3-265:93"
			:isContainer true
			:opposite context
		) ( struct-map
			KM3_Reference
			:name "participatingLink"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_CollaborationInstanceSet
			:type Common_Behavior_Link
			:location "266:3-266:41"
			:isContainer false
		)]
	) )]
) )
( def Data_Types ( struct-map
	KM3_Package
	:contents[( def AggregationKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ak_none"
		:location "272:3-272:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "ak_aggregate"
		:location "273:3-273:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "ak_composite"
		:location "274:3-274:24"
	)] ) ) ( def ChangeableKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ck_changeable"
		:location "278:3-278:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "ck_frozen"
		:location "279:3-279:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "ck_addOnly"
		:location "280:3-280:22"
	)] ) ) ( def OrderingKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ok_unordered"
		:location "284:3-284:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "ok_ordered"
		:location "285:3-285:22"
	)] ) ) ( def CallConcurrencyKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "cck_sequential"
		:location "289:3-289:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "cck_guarded"
		:location "290:3-290:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "cck_concurrent"
		:location "291:3-291:26"
	)] ) ) ( def ParameterDirectionKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "pdk_in"
		:location "295:3-295:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "pdk_inout"
		:location "296:3-296:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "pdk_out"
		:location "297:3-297:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "pdk_return"
		:location "298:3-298:22"
	)] ) ) ( def ScopeKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "sk_instance"
		:location "302:3-302:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "sk_classifier"
		:location "303:3-303:25"
	)] ) ) ( def VisibilityKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "vk_public"
		:location "307:3-307:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_protected"
		:location "308:3-308:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_private"
		:location "309:3-309:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_package"
		:location "310:3-310:22"
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
			:location "314:3-314:78"
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
			:location "319:3-319:29"
		) ( struct-map
			KM3_Attribute
			:name "upper"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Data_Types_MultiplicityRange
			:type Integer
			:location "320:3-320:29"
		) ( struct-map
			KM3_Reference
			:name "multiplicity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Data_Types_MultiplicityRange
			:type Data_Types_Multiplicity
			:location "318:3-318:58"
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
			:location "324:3-324:36"
		) ( struct-map
			KM3_Attribute
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Data_Types_Expression
			:type String
			:location "325:3-325:27"
		)]
	) ) ( def Data_Types_BooleanExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Data_Types_Expression]
		:structuralFeatures[]
	) ) ( def Data_Types_ObjectSetExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Data_Types_Expression]
		:structuralFeatures[]
	) ) ( def Data_Types_ActionExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Data_Types_Expression]
		:structuralFeatures[]
	) ) ( def Data_Types_IterationExpression ( struct-map
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
		:location "342:2-342:19"
	) ) ( def ptyp_Float ( struct-map
		KM3_DataType
		:name "Float"
		:location "343:2-343:17"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "344:2-344:19"
	) ) ( def ptyp_Long ( struct-map
		KM3_DataType
		:name "Long"
		:location "345:2-345:16"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "346:2-346:18"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "347:2-347:18"
	) )]
) )
