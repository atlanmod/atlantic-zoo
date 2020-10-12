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
( declare Data_Types_AggregationKind )
( declare Data_Types_CallConcurrencyKind )
( declare Data_Types_ChangeableKind )
( declare Data_Types_OrderingKind )
( declare Data_Types_ParameterDirectionKind )
( declare Data_Types_ScopeKind )
( declare Data_Types_VisibilityKind )
( declare Data_Types_Multiplicity )
( declare Data_Types_MultiplicityRange )
( declare Data_Types_Expression )
( declare Data_Types_BooleanExpression )
( declare Data_Types_TypeExpression )
( declare Data_Types_MappingExpression )
( declare Data_Types_ProcedureExpression )
( declare Data_Types_ObjectSetExpression )
( declare Data_Types_ActionExpression )
( declare Data_Types_IterationExpression )
( declare Data_Types_TimeExpression )
( declare Data_Types_ArgListsExpression )
( declare Data_Types_PseudostateKind )
( declare Model_Management_Package )
( declare Model_Management_Model )
( declare Model_Management_Subsystem )
( declare Model_Management_ElementImport )
( declare Core_Element )
( declare Core_ModelElement )
( declare Core_GeneralizableElement )
( declare Core_Namespace )
( declare Core_Classifier )
( declare Core_Class )
( declare Core_DataType )
( declare Core_Feature )
( declare Core_StructuralFeature )
( declare Core_AssociationEnd )
( declare Core_Interface )
( declare Core_Constraint )
( declare Core_Relationship )
( declare Core_Association )
( declare Core_Attribute )
( declare Core_BehavioralFeature )
( declare Core_Operation )
( declare Core_Parameter )
( declare Core_Method )
( declare Core_Generalization )
( declare Core_AssociationClass )
( declare Core_Dependency )
( declare Core_Abstraction )
( declare Core_PresentationElement )
( declare Core_Usage )
( declare Core_Binding )
( declare Core_Component )
( declare Core_Node )
( declare Core_Permission )
( declare Core_Comment )
( declare Core_Flow )
( declare Core_ElementResidence )
( declare Core_TemplateParameter )
( declare Core_Primitive )
( declare Core_Enumeration )
( declare Core_EnumerationLiteral )
( declare Core_Stereotype )
( declare Core_TagDefinition )
( declare Core_TaggedValue )
( declare Core_ProgrammingLanguageDataType )
( declare Core_Artifact )
( declare Core_TemplateArgument )
( declare Collaborations_Collaboration )
( declare Collaborations_ClassifierRole )
( declare Collaborations_AssociationRole )
( declare Collaborations_AssociationEndRole )
( declare Collaborations_Message )
( declare Collaborations_Interaction )
( declare Collaborations_InteractionInstanceSet )
( declare Collaborations_CollaborationInstanceSet )
( declare State_Machines_StateMachine )
( declare State_Machines_Event )
( declare State_Machines_StateVertex )
( declare State_Machines_State )
( declare State_Machines_TimeEvent )
( declare State_Machines_CallEvent )
( declare State_Machines_SignalEvent )
( declare State_Machines_Transition )
( declare State_Machines_CompositeState )
( declare State_Machines_ChangeEvent )
( declare State_Machines_Guard )
( declare State_Machines_Pseudostate )
( declare State_Machines_SimpleState )
( declare State_Machines_SubmachineState )
( declare State_Machines_SynchState )
( declare State_Machines_StubState )
( declare State_Machines_FinalState )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Float )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Long )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Double )
( declare Diagram_Interchange_Point )
( declare Diagram_Interchange_Dimension )
( declare Diagram_Interchange_BezierPoint )
( declare Diagram_Interchange_DiagramElement )
( declare Diagram_Interchange_GraphElement )
( declare Diagram_Interchange_SemanticModelBridge )
( declare Diagram_Interchange_GraphEdge )
( declare Diagram_Interchange_GraphNode )
( declare Diagram_Interchange_GraphConnector )
( declare Diagram_Interchange_LeafElement )
( declare Diagram_Interchange_Reference )
( declare Diagram_Interchange_TextElement )
( declare Diagram_Interchange_GraphicPrimitive )
( declare Diagram_Interchange_Polyline )
( declare Diagram_Interchange_Ellipse )
( declare Diagram_Interchange_Image )
( declare Diagram_Interchange_Property )
( declare Diagram_Interchange_SimpleSemanticModelElement )
( declare Diagram_Interchange_Uml1SemanticModelBridge )
( declare Diagram_Interchange_CoreSemanticModelBridge )
( declare Diagram_Interchange_DiagramLink )
( declare Diagram_Interchange_Diagram )
( declare Activity_Graphs_ActivityGraph )
( declare Activity_Graphs_Partition )
( declare Activity_Graphs_SubactivityState )
( declare Activity_Graphs_ActionState )
( declare Activity_Graphs_CallState )
( declare Activity_Graphs_ObjectFlowState )
( declare Activity_Graphs_ClassifierInState )
( declare Use_Cases_UseCase )
( declare Use_Cases_Actor )
( declare Use_Cases_UseCaseInstance )
( declare Use_Cases_Extend )
( declare Use_Cases_Include )
( declare Use_Cases_ExtensionPoint )
( def UML ( struct-map
	KM3_Package
	:contents[]
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
			:location "16:3-16:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "linkEnd"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Instance
			:type Common_Behavior_LinkEnd
			:location "17:3-17:54"
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
			:location "18:3-18:42"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "componentInstance"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Instance
			:type Common_Behavior_ComponentInstance
			:location "19:3-19:76"
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
			:location "20:3-20:67"
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
			:location "21:3-21:43"
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
			:name "isAsynchronous"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Action
			:type Boolean
			:location "33:3-33:38"
		) ( struct-map
			KM3_Reference
			:name "actualArgument"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Common_Behavior_Action
			:type Common_Behavior_Argument
			:location "29:3-29:78"
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
			:location "30:3-30:68"
			:isContainer false
			:opposite action
		) ( struct-map
			KM3_Reference
			:name "recurrence"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Action
			:type Data_Types_IterationExpression
			:location "31:3-31:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Action
			:type Data_Types_ObjectSetExpression
			:location "32:3-32:47"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "script"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Action
			:type Data_Types_ActionExpression
			:location "34:3-34:44"
			:isContainer false
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
			:location "38:3-38:40"
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
			:location "46:3-46:54"
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
			:location "47:3-47:30"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "linkEnd"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_AttributeLink
			:type Common_Behavior_LinkEnd
			:location "48:3-48:62"
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
			:location "49:3-49:37"
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
			:location "55:3-55:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "connection"
			:upper -1
			:lower 2
			:isOrdered false
			:owner Common_Behavior_Link
			:type Common_Behavior_LinkEnd
			:location "56:3-56:65"
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
			:location "64:3-64:37"
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
			:location "68:3-68:29"
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
			:location "72:3-72:76"
			:isContainer true
			:opposite actionSequence
		)]
	) ) ( def Common_Behavior_Argument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "action"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Argument
			:type Common_Behavior_Action
			:location "76:3-76:60"
			:isContainer false
			:opposite actualArgument
		) ( struct-map
			KM3_Reference
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Argument
			:type Data_Types_Expression
			:location "77:3-77:32"
			:isContainer false
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
			:location "82:3-82:41"
		) ( struct-map
			KM3_Attribute
			:name "isRoot"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Reception
			:type Boolean
			:location "83:3-83:30"
		) ( struct-map
			KM3_Attribute
			:name "isLeaf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Reception
			:type Boolean
			:location "84:3-84:30"
		) ( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Reception
			:type Boolean
			:location "85:3-85:34"
		) ( struct-map
			KM3_Reference
			:name "signal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Reception
			:type Common_Behavior_Signal
			:location "81:3-81:29"
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
			:location "89:3-89:47"
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
			:location "90:3-90:84"
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
			:location "91:3-91:52"
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
			:location "92:3-92:45"
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
			:location "102:3-102:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "communicationLink"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Stimulus
			:type Common_Behavior_Link
			:location "103:3-103:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "receiver"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Stimulus
			:type Common_Behavior_Instance
			:location "104:3-104:33"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dispatchAction"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Stimulus
			:type Common_Behavior_Action
			:location "105:3-105:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "sender"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Stimulus
			:type Common_Behavior_Instance
			:location "106:3-106:31"
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
	) ) ( def Common_Behavior_SubsystemInstance ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Common_Behavior_Instance]
		:structuralFeatures[]
	) )]
) )
( def Data_Types ( struct-map
	KM3_Package
	:contents[( def AggregationKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ak_none"
		:location "126:3-126:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "ak_aggregate"
		:location "127:3-127:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "ak_composite"
		:location "128:3-128:24"
	)] ) ) ( def CallConcurrencyKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "cck_sequential"
		:location "132:3-132:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "cck_guarded"
		:location "133:3-133:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "cck_concurrent"
		:location "134:3-134:26"
	)] ) ) ( def ChangeableKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ck_changeable"
		:location "138:3-138:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "ck_frozen"
		:location "139:3-139:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "ck_addOnly"
		:location "140:3-140:22"
	)] ) ) ( def OrderingKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ok_unordered"
		:location "144:3-144:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "ok_ordered"
		:location "145:3-145:22"
	)] ) ) ( def ParameterDirectionKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "pdk_in"
		:location "149:3-149:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "pdk_inout"
		:location "150:3-150:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "pdk_out"
		:location "151:3-151:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "pdk_return"
		:location "152:3-152:22"
	)] ) ) ( def ScopeKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "sk_instance"
		:location "156:3-156:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "sk_classifier"
		:location "157:3-157:25"
	)] ) ) ( def VisibilityKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "vk_public"
		:location "161:3-161:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_protected"
		:location "162:3-162:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_private"
		:location "163:3-163:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_package"
		:location "164:3-164:22"
	)] ) ) ( def PseudostateKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "pk_choice"
		:location "201:3-201:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "pk_deepHistory"
		:location "202:3-202:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "pk_fork"
		:location "203:3-203:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "pk_initial"
		:location "204:3-204:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "pk_join"
		:location "205:3-205:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "pk_junction"
		:location "206:3-206:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "pk_shallowHistory"
		:location "207:3-207:29"
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
			:location "168:3-168:78"
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
			:location "173:3-173:29"
		) ( struct-map
			KM3_Attribute
			:name "upper"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Data_Types_MultiplicityRange
			:type Integer
			:location "174:3-174:29"
		) ( struct-map
			KM3_Reference
			:name "multiplicity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Data_Types_MultiplicityRange
			:type Data_Types_Multiplicity
			:location "172:3-172:58"
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
			:location "178:3-178:36"
		) ( struct-map
			KM3_Attribute
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Data_Types_Expression
			:type String
			:location "179:3-179:27"
		)]
	) ) ( def Data_Types_BooleanExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Data_Types_Expression]
		:structuralFeatures[]
	) ) ( def Data_Types_TypeExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Data_Types_Expression]
		:structuralFeatures[]
	) ) ( def Data_Types_MappingExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Data_Types_Expression]
		:structuralFeatures[]
	) ) ( def Data_Types_ProcedureExpression ( struct-map
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
	) ) ( def Data_Types_TimeExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Data_Types_Expression]
		:structuralFeatures[]
	) ) ( def Data_Types_ArgListsExpression ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Data_Types_Expression]
		:structuralFeatures[]
	) )]
) )
( def Model_Management ( struct-map
	KM3_Package
	:contents[( def Model_Management_Package ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_GeneralizableElement Core_Namespace]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "elementImport"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Model_Management_Package
			:type Model_Management_ElementImport
			:location "214:3-214:77"
			:isContainer true
			:opposite package
		)]
	) ) ( def Model_Management_Model ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Model_Management_Package]
		:structuralFeatures[]
	) ) ( def Model_Management_Subsystem ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Model_Management_Package Core_Classifier]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isInstantiable"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Model_Management_Subsystem
			:type Boolean
			:location "220:3-220:38"
		)]
	) ) ( def Model_Management_ElementImport ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "visibility"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Model_Management_ElementImport
			:type VisibilityKind
			:location "226:3-226:46"
		) ( struct-map
			KM3_Attribute
			:name "alias"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Model_Management_ElementImport
			:type String
			:location "227:3-227:33"
		) ( struct-map
			KM3_Attribute
			:name "isSpecification"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Model_Management_ElementImport
			:type Boolean
			:location "228:3-228:39"
		) ( struct-map
			KM3_Reference
			:name "package"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Model_Management_ElementImport
			:type Model_Management_Package
			:location "224:3-224:58"
			:isContainer false
			:opposite elementImport
		) ( struct-map
			KM3_Reference
			:name "importedElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Model_Management_ElementImport
			:type Core_ModelElement
			:location "225:3-225:44"
			:isContainer false
		)]
	) )]
) )
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
			:location "247:3-247:32"
		) ( struct-map
			KM3_Attribute
			:name "visibility"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_ModelElement
			:type VisibilityKind
			:location "248:3-248:46"
		) ( struct-map
			KM3_Attribute
			:name "isSpecification"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_ModelElement
			:type Boolean
			:location "249:3-249:39"
		) ( struct-map
			KM3_Reference
			:name "taggedValue"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_ModelElement
			:type Core_TaggedValue
			:location "238:3-238:76"
			:isContainer true
			:opposite modelElement
		) ( struct-map
			KM3_Reference
			:name "clientDependency"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_ModelElement
			:type Core_Dependency
			:location "239:3-239:64"
			:isContainer false
			:opposite client
		) ( struct-map
			KM3_Reference
			:name "constraint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_ModelElement
			:type Core_Constraint
			:location "240:3-240:70"
			:isContainer false
			:opposite constrainedElement
		) ( struct-map
			KM3_Reference
			:name "stereotype"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_ModelElement
			:type Core_Stereotype
			:location "241:3-241:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "comment"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_ModelElement
			:type Core_Comment
			:location "242:3-242:62"
			:isContainer false
			:opposite annotatedElement
		) ( struct-map
			KM3_Reference
			:name "sourceFlow"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_ModelElement
			:type Core_Flow
			:location "243:3-243:52"
			:isContainer false
			:opposite source
		) ( struct-map
			KM3_Reference
			:name "targetFlow"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_ModelElement
			:type Core_Flow
			:location "244:3-244:52"
			:isContainer false
			:opposite target
		) ( struct-map
			KM3_Reference
			:name "templateParameter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Core_ModelElement
			:type Core_TemplateParameter
			:location "245:3-245:92"
			:isContainer true
			:opposite template
		) ( struct-map
			KM3_Reference
			:name "namespace"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_ModelElement
			:type Core_Namespace
			:location "246:3-246:64"
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
			:location "254:3-254:30"
		) ( struct-map
			KM3_Attribute
			:name "isLeaf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_GeneralizableElement
			:type Boolean
			:location "255:3-255:30"
		) ( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_GeneralizableElement
			:type Boolean
			:location "256:3-256:34"
		) ( struct-map
			KM3_Reference
			:name "generalization"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_GeneralizableElement
			:type Core_Generalization
			:location "253:3-253:65"
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
			:location "260:3-260:75"
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
			:location "264:3-264:69"
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
			:location "265:3-265:69"
			:isContainer true
			:opposite owner
		)]
	) ) ( def Core_Class ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Classifier]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isActive"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Class
			:type Boolean
			:location "269:3-269:32"
		)]
	) ) ( def Core_DataType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Classifier]
		:structuralFeatures[]
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
			:location "276:3-276:36"
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Feature
			:type Core_Classifier
			:location "275:3-275:56"
			:isContainer false
			:opposite feature
		)]
	) ) ( def Core_StructuralFeature ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Core_Feature]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "changeability"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_StructuralFeature
			:type ChangeableKind
			:location "282:3-282:49"
		) ( struct-map
			KM3_Attribute
			:name "targetScope"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_StructuralFeature
			:type ScopeKind
			:location "283:3-283:42"
		) ( struct-map
			KM3_Attribute
			:name "ordering"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_StructuralFeature
			:type OrderingKind
			:location "284:3-284:42"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_StructuralFeature
			:type Core_Classifier
			:location "280:3-280:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "multiplicity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_StructuralFeature
			:type Data_Types_Multiplicity
			:location "281:3-281:46"
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
			:location "292:3-292:35"
		) ( struct-map
			KM3_Attribute
			:name "ordering"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_AssociationEnd
			:type OrderingKind
			:location "293:3-293:42"
		) ( struct-map
			KM3_Attribute
			:name "aggregation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_AssociationEnd
			:type AggregationKind
			:location "294:3-294:48"
		) ( struct-map
			KM3_Attribute
			:name "targetScope"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_AssociationEnd
			:type ScopeKind
			:location "295:3-295:42"
		) ( struct-map
			KM3_Attribute
			:name "changeability"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_AssociationEnd
			:type ChangeableKind
			:location "297:3-297:49"
		) ( struct-map
			KM3_Reference
			:name "association"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_AssociationEnd
			:type Core_Association
			:location "288:3-288:61"
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
			:location "289:3-289:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "participant"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_AssociationEnd
			:type Core_Classifier
			:location "290:3-290:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "qualifier"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Core_AssociationEnd
			:type Core_Attribute
			:location "291:3-291:82"
			:isContainer true
			:opposite associationEnd
		) ( struct-map
			KM3_Reference
			:name "multiplicity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_AssociationEnd
			:type Data_Types_Multiplicity
			:location "296:3-296:46"
			:isContainer false
		)]
	) ) ( def Core_Interface ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Classifier]
		:structuralFeatures[]
	) ) ( def Core_Constraint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constrainedElement"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Core_Constraint
			:type Core_ModelElement
			:location "303:3-303:80"
			:isContainer false
			:opposite constraint
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Constraint
			:type Data_Types_BooleanExpression
			:location "304:3-304:43"
			:isContainer false
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
			:location "310:3-310:87"
			:isContainer true
			:opposite association
		)]
	) ) ( def Core_Attribute ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_StructuralFeature]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "associationEnd"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Attribute
			:type Core_AssociationEnd
			:location "314:3-314:71"
			:isContainer false
			:opposite qualifier
		) ( struct-map
			KM3_Reference
			:name "initialValue"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Attribute
			:type Data_Types_Expression
			:location "315:3-315:44"
			:isContainer false
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
			:location "320:3-320:31"
		) ( struct-map
			KM3_Reference
			:name "parameter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Core_BehavioralFeature
			:type Core_Parameter
			:location "319:3-319:85"
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
			:location "324:3-324:52"
		) ( struct-map
			KM3_Attribute
			:name "isRoot"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Operation
			:type Boolean
			:location "325:3-325:30"
		) ( struct-map
			KM3_Attribute
			:name "isLeaf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Operation
			:type Boolean
			:location "326:3-326:30"
		) ( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Operation
			:type Boolean
			:location "327:3-327:34"
		) ( struct-map
			KM3_Attribute
			:name "specification"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Operation
			:type String
			:location "328:3-328:41"
		)]
	) ) ( def Core_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "kind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Parameter
			:type ParameterDirectionKind
			:location "335:3-335:43"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Parameter
			:type Core_Classifier
			:location "332:3-332:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "behavioralFeature"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Parameter
			:type Core_BehavioralFeature
			:location "333:3-333:77"
			:isContainer false
			:opposite parameter
		) ( struct-map
			KM3_Reference
			:name "defaultValue"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Parameter
			:type Data_Types_Expression
			:location "334:3-334:44"
			:isContainer false
		)]
	) ) ( def Core_Method ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_BehavioralFeature]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "specification"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Method
			:type Core_Operation
			:location "339:3-339:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Method
			:type Data_Types_ProcedureExpression
			:location "340:3-340:40"
			:isContainer false
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
			:location "347:3-347:41"
		) ( struct-map
			KM3_Reference
			:name "parent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Generalization
			:type Core_GeneralizableElement
			:location "344:3-344:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "powertype"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Generalization
			:type Core_Classifier
			:location "345:3-345:67"
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
			:location "346:3-346:68"
			:isContainer false
			:opposite generalization
		)]
	) ) ( def Core_AssociationClass ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Association Core_Class]
		:structuralFeatures[]
	) ) ( def Core_Dependency ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Relationship]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "client"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Core_Dependency
			:type Core_ModelElement
			:location "353:3-353:68"
			:isContainer false
			:opposite clientDependency
		) ( struct-map
			KM3_Reference
			:name "supplier"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Core_Dependency
			:type Core_ModelElement
			:location "354:3-354:42"
			:isContainer false
		)]
	) ) ( def Core_Abstraction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Dependency]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "mapping"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Abstraction
			:type Data_Types_MappingExpression
			:location "358:3-358:46"
			:isContainer false
		)]
	) ) ( def Core_PresentationElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Core_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "subject"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_PresentationElement
			:type Core_ModelElement
			:location "362:3-362:39"
			:isContainer false
		)]
	) ) ( def Core_Usage ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Dependency]
		:structuralFeatures[]
	) ) ( def Core_Binding ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Dependency]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "argument"
			:upper -1
			:lower 1
			:isOrdered true
			:owner Core_Binding
			:type Core_TemplateArgument
			:location "368:3-368:83"
			:isContainer true
			:opposite binding
		)]
	) ) ( def Core_Component ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Classifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "deploymentLocation"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_Component
			:type Core_Node
			:location "372:3-372:71"
			:isContainer false
			:opposite deployedComponent
		) ( struct-map
			KM3_Reference
			:name "residentElement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_Component
			:type Core_ElementResidence
			:location "373:3-373:84"
			:isContainer true
			:opposite container
		) ( struct-map
			KM3_Reference
			:name "implementation"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_Component
			:type Core_Artifact
			:location "374:3-374:42"
			:isContainer false
		)]
	) ) ( def Core_Node ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Classifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "deployedComponent"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_Node
			:type Core_Component
			:location "378:3-378:76"
			:isContainer false
			:opposite deploymentLocation
		)]
	) ) ( def Core_Permission ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Dependency]
		:structuralFeatures[]
	) ) ( def Core_Comment ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Comment
			:type String
			:location "385:3-385:27"
		) ( struct-map
			KM3_Reference
			:name "annotatedElement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_Comment
			:type Core_ModelElement
			:location "384:3-384:67"
			:isContainer false
			:opposite comment
		)]
	) ) ( def Core_Flow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Relationship]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "source"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_Flow
			:type Core_ModelElement
			:location "389:3-389:60"
			:isContainer false
			:opposite sourceFlow
		) ( struct-map
			KM3_Reference
			:name "target"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_Flow
			:type Core_ModelElement
			:location "390:3-390:60"
			:isContainer false
			:opposite targetFlow
		)]
	) ) ( def Core_ElementResidence ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "visibility"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_ElementResidence
			:type VisibilityKind
			:location "396:3-396:46"
		) ( struct-map
			KM3_Reference
			:name "container"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_ElementResidence
			:type Core_Component
			:location "394:3-394:64"
			:isContainer false
			:opposite residentElement
		) ( struct-map
			KM3_Reference
			:name "resident"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_ElementResidence
			:type Core_ModelElement
			:location "395:3-395:37"
			:isContainer false
		)]
	) ) ( def Core_TemplateParameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "template"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_TemplateParameter
			:type Core_ModelElement
			:location "400:3-400:66"
			:isContainer false
			:opposite templateParameter
		) ( struct-map
			KM3_Reference
			:name "parameter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_TemplateParameter
			:type Core_ModelElement
			:location "401:3-401:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "defaultElement"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_TemplateParameter
			:type Core_ModelElement
			:location "402:3-402:48"
			:isContainer false
		)]
	) ) ( def Core_Primitive ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_DataType]
		:structuralFeatures[]
	) ) ( def Core_Enumeration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_DataType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "literal"
			:upper -1
			:lower 1
			:isOrdered true
			:owner Core_Enumeration
			:type Core_EnumerationLiteral
			:location "408:3-408:92"
			:isContainer true
			:opposite enumeration
		)]
	) ) ( def Core_EnumerationLiteral ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "enumeration"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_EnumerationLiteral
			:type Core_Enumeration
			:location "412:3-412:62"
			:isContainer false
			:opposite literal
		)]
	) ) ( def Core_Stereotype ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_GeneralizableElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "icon"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Stereotype
			:type String
			:location "418:3-418:32"
		) ( struct-map
			KM3_Attribute
			:name "baseClass"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Core_Stereotype
			:type String
			:location "419:3-419:37"
		) ( struct-map
			KM3_Reference
			:name "stereotypeConstraint"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_Stereotype
			:type Core_Constraint
			:location "416:3-416:60"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "definedTag"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_Stereotype
			:type Core_TagDefinition
			:location "417:3-417:70"
			:isContainer true
			:opposite owner
		)]
	) ) ( def Core_TagDefinition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "tagType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_TagDefinition
			:type String
			:location "424:3-424:35"
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_TagDefinition
			:type Core_Stereotype
			:location "423:3-423:59"
			:isContainer false
			:opposite definedTag
		) ( struct-map
			KM3_Reference
			:name "multiplicity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_TagDefinition
			:type Data_Types_Multiplicity
			:location "425:3-425:46"
			:isContainer false
		)]
	) ) ( def Core_TaggedValue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "dataValue"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_TaggedValue
			:type String
			:location "432:3-432:35"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_TaggedValue
			:type Core_TagDefinition
			:location "429:3-429:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "referenceValue"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Core_TaggedValue
			:type Core_ModelElement
			:location "430:3-430:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "modelElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_TaggedValue
			:type Core_ModelElement
			:location "431:3-431:64"
			:isContainer false
			:opposite taggedValue
		)]
	) ) ( def Core_ProgrammingLanguageDataType ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_DataType]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_ProgrammingLanguageDataType
			:type Data_Types_TypeExpression
			:location "436:3-436:41"
			:isContainer false
		)]
	) ) ( def Core_Artifact ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Classifier]
		:structuralFeatures[]
	) ) ( def Core_TemplateArgument ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "binding"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_TemplateArgument
			:type Core_Binding
			:location "442:3-442:51"
			:isContainer false
			:opposite argument
		) ( struct-map
			KM3_Reference
			:name "modelElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_TemplateArgument
			:type Core_ModelElement
			:location "443:3-443:41"
			:isContainer false
		)]
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
			:location "450:3-450:50"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "representedOperation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Collaborations_Collaboration
			:type Core_Operation
			:location "451:3-451:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "representedClassifier"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Collaborations_Collaboration
			:type Core_Classifier
			:location "452:3-452:53"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "interaction"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_Collaboration
			:type Collaborations_Interaction
			:location "453:3-453:71"
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
			:location "454:3-454:51"
			:isContainer false
		)]
	) ) ( def Collaborations_ClassifierRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Classifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "availableContents"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_ClassifierRole
			:type Core_ModelElement
			:location "458:3-458:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "base"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Collaborations_ClassifierRole
			:type Core_Classifier
			:location "459:3-459:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "conformingInstance"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_ClassifierRole
			:type Common_Behavior_Instance
			:location "460:3-460:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "availableFeature"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_ClassifierRole
			:type Core_Feature
			:location "461:3-461:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "multiplicity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Collaborations_ClassifierRole
			:type Data_Types_Multiplicity
			:location "462:3-462:46"
			:isContainer false
		)]
	) ) ( def Collaborations_AssociationRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Association]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "base"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Collaborations_AssociationRole
			:type Core_Association
			:location "466:3-466:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "conformingLink"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_AssociationRole
			:type Common_Behavior_Link
			:location "467:3-467:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "message"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_AssociationRole
			:type Collaborations_Message
			:location "468:3-468:69"
			:isContainer false
			:opposite communicationConnection
		) ( struct-map
			KM3_Reference
			:name "multiplicity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Collaborations_AssociationRole
			:type Data_Types_Multiplicity
			:location "469:3-469:46"
			:isContainer false
		)]
	) ) ( def Collaborations_AssociationEndRole ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_AssociationEnd]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "base"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Collaborations_AssociationEndRole
			:type Core_AssociationEnd
			:location "473:3-473:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "availableQualifier"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_AssociationEndRole
			:type Core_Attribute
			:location "474:3-474:47"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "collaborationMultiplicity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Collaborations_AssociationEndRole
			:type Data_Types_Multiplicity
			:location "475:3-475:59"
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
			:location "479:3-479:58"
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
			:location "480:3-480:46"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "action"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Collaborations_Message
			:type Common_Behavior_Action
			:location "481:3-481:29"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "communicationConnection"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Collaborations_Message
			:type Collaborations_AssociationRole
			:location "482:3-482:79"
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
			:location "483:3-483:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "receiver"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Collaborations_Message
			:type Collaborations_ClassifierRole
			:location "484:3-484:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "sender"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Collaborations_Message
			:type Collaborations_ClassifierRole
			:location "485:3-485:37"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "predecessor"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_Message
			:type Collaborations_Message
			:location "486:3-486:38"
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
			:location "490:3-490:69"
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
			:location "491:3-491:60"
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
			:location "495:3-495:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "context"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Collaborations_InteractionInstanceSet
			:type Collaborations_CollaborationInstanceSet
			:location "496:3-496:82"
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
			:location "497:3-497:51"
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
			:location "501:3-501:48"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "constrainingElement"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_CollaborationInstanceSet
			:type Core_ModelElement
			:location "502:3-502:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "participatingInstance"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Collaborations_CollaborationInstanceSet
			:type Common_Behavior_Instance
			:location "503:3-503:51"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "interactionInstanceSet"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Collaborations_CollaborationInstanceSet
			:type Collaborations_InteractionInstanceSet
			:location "504:3-504:93"
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
			:location "505:3-505:41"
			:isContainer false
		)]
	) )]
) )
( def State_Machines ( struct-map
	KM3_Package
	:contents[( def State_Machines_StateMachine ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "context"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_StateMachine
			:type Core_ModelElement
			:location "513:3-513:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "submachineState"
			:upper -1
			:lower 0
			:isOrdered false
			:owner State_Machines_StateMachine
			:type State_Machines_SubmachineState
			:location "514:3-514:72"
			:isContainer false
			:opposite submachine
		) ( struct-map
			KM3_Reference
			:name "top"
			:upper 1
			:lower 1
			:isOrdered false
			:owner State_Machines_StateMachine
			:type State_Machines_State
			:location "515:3-515:59"
			:isContainer true
			:opposite stateMachine
		) ( struct-map
			KM3_Reference
			:name "transitions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner State_Machines_StateMachine
			:type State_Machines_Transition
			:location "516:3-516:75"
			:isContainer true
			:opposite stateMachine
		)]
	) ) ( def State_Machines_Event ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "parameter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner State_Machines_Event
			:type Core_Parameter
			:location "520:3-520:56"
			:isContainer true
		)]
	) ) ( def State_Machines_StateVertex ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "container"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_StateVertex
			:type State_Machines_CompositeState
			:location "524:3-524:68"
			:isContainer false
			:opposite subvertex
		) ( struct-map
			KM3_Reference
			:name "incoming"
			:upper -1
			:lower 0
			:isOrdered false
			:owner State_Machines_StateVertex
			:type State_Machines_Transition
			:location "525:3-525:56"
			:isContainer false
			:opposite target
		) ( struct-map
			KM3_Reference
			:name "outgoing"
			:upper -1
			:lower 0
			:isOrdered false
			:owner State_Machines_StateVertex
			:type State_Machines_Transition
			:location "526:3-526:56"
			:isContainer false
			:opposite source
		)]
	) ) ( def State_Machines_State ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[State_Machines_StateVertex]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "deferrableEvent"
			:upper -1
			:lower 0
			:isOrdered false
			:owner State_Machines_State
			:type State_Machines_Event
			:location "530:3-530:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "internalTransition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner State_Machines_State
			:type State_Machines_Transition
			:location "531:3-531:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "exit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_State
			:type Common_Behavior_Action
			:location "532:3-532:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "doActivity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_State
			:type Common_Behavior_Action
			:location "533:3-533:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "entry"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_State
			:type Common_Behavior_Action
			:location "534:3-534:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "stateMachine"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_State
			:type State_Machines_StateMachine
			:location "535:3-535:61"
			:isContainer false
			:opposite top
		)]
	) ) ( def State_Machines_TimeEvent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[State_Machines_Event]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "when"
			:upper 1
			:lower 1
			:isOrdered false
			:owner State_Machines_TimeEvent
			:type Data_Types_TimeExpression
			:location "539:3-539:35"
			:isContainer false
		)]
	) ) ( def State_Machines_CallEvent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[State_Machines_Event]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "operation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner State_Machines_CallEvent
			:type Core_Operation
			:location "543:3-543:37"
			:isContainer false
		)]
	) ) ( def State_Machines_SignalEvent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[State_Machines_Event]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "signal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner State_Machines_SignalEvent
			:type Common_Behavior_Signal
			:location "547:3-547:29"
			:isContainer false
		)]
	) ) ( def State_Machines_Transition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 1
			:isOrdered false
			:owner State_Machines_Transition
			:type State_Machines_StateVertex
			:location "551:3-551:54"
			:isContainer false
			:opposite incoming
		) ( struct-map
			KM3_Reference
			:name "trigger"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_Transition
			:type State_Machines_Event
			:location "552:3-552:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "stateMachine"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_Transition
			:type State_Machines_StateMachine
			:location "553:3-553:69"
			:isContainer false
			:opposite transitions
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner State_Machines_Transition
			:type State_Machines_StateVertex
			:location "554:3-554:54"
			:isContainer false
			:opposite outgoing
		) ( struct-map
			KM3_Reference
			:name "effect"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_Transition
			:type Common_Behavior_Action
			:location "555:3-555:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "guard"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_Transition
			:type State_Machines_Guard
			:location "556:3-556:64"
			:isContainer true
			:opposite transition
		)]
	) ) ( def State_Machines_CompositeState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[State_Machines_State]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isConcurrent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner State_Machines_CompositeState
			:type Boolean
			:location "561:3-561:36"
		) ( struct-map
			KM3_Reference
			:name "subvertex"
			:upper -1
			:lower 0
			:isOrdered false
			:owner State_Machines_CompositeState
			:type State_Machines_StateVertex
			:location "560:3-560:73"
			:isContainer true
			:opposite container
		)]
	) ) ( def State_Machines_ChangeEvent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[State_Machines_Event]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "changeExpression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner State_Machines_ChangeEvent
			:type Data_Types_BooleanExpression
			:location "565:3-565:50"
			:isContainer false
		)]
	) ) ( def State_Machines_Guard ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "transition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner State_Machines_Guard
			:type State_Machines_Transition
			:location "569:3-569:54"
			:isContainer false
			:opposite guard
		) ( struct-map
			KM3_Reference
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner State_Machines_Guard
			:type Data_Types_BooleanExpression
			:location "570:3-570:44"
			:isContainer false
		)]
	) ) ( def State_Machines_Pseudostate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[State_Machines_StateVertex]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "kind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner State_Machines_Pseudostate
			:type PseudostateKind
			:location "574:3-574:36"
		)]
	) ) ( def State_Machines_SimpleState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[State_Machines_State]
		:structuralFeatures[]
	) ) ( def State_Machines_SubmachineState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[State_Machines_CompositeState]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "submachine"
			:upper 1
			:lower 1
			:isOrdered false
			:owner State_Machines_SubmachineState
			:type State_Machines_StateMachine
			:location "580:3-580:66"
			:isContainer false
			:opposite submachineState
		)]
	) ) ( def State_Machines_SynchState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[State_Machines_StateVertex]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "bound"
			:upper 1
			:lower 1
			:isOrdered false
			:owner State_Machines_SynchState
			:type Integer
			:location "584:3-584:29"
		)]
	) ) ( def State_Machines_StubState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[State_Machines_StateVertex]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "referenceState"
			:upper 1
			:lower 1
			:isOrdered false
			:owner State_Machines_StubState
			:type String
			:location "588:3-588:37"
		)]
	) ) ( def State_Machines_FinalState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[State_Machines_State]
		:structuralFeatures[]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "596:2-596:19"
	) ) ( def ptyp_Float ( struct-map
		KM3_DataType
		:name "Float"
		:location "597:2-597:17"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "598:2-598:19"
	) ) ( def ptyp_Long ( struct-map
		KM3_DataType
		:name "Long"
		:location "599:2-599:16"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "600:2-600:18"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "601:2-601:18"
	) )]
) )
( def Diagram_Interchange ( struct-map
	KM3_Package
	:contents[( def Diagram_Interchange_Point ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "x"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_Point
			:type Double
			:location "607:3-607:24"
		) ( struct-map
			KM3_Attribute
			:name "y"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_Point
			:type Double
			:location "608:3-608:24"
		)]
	) ) ( def Diagram_Interchange_Dimension ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "width"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_Dimension
			:type Double
			:location "612:3-612:28"
		) ( struct-map
			KM3_Attribute
			:name "height"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_Dimension
			:type Double
			:location "613:3-613:29"
		)]
	) ) ( def Diagram_Interchange_BezierPoint ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "base"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_BezierPoint
			:type Diagram_Interchange_Point
			:location "617:3-617:26"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "control1"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_BezierPoint
			:type Diagram_Interchange_Point
			:location "618:3-618:30"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "control2"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_BezierPoint
			:type Diagram_Interchange_Point
			:location "619:3-619:30"
			:isContainer false
		)]
	) ) ( def Diagram_Interchange_DiagramElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isVisible"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_DiagramElement
			:type Boolean
			:location "626:3-626:33"
		) ( struct-map
			KM3_Reference
			:name "container"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Diagram_Interchange_DiagramElement
			:type Diagram_Interchange_GraphElement
			:location "623:3-623:66"
			:isContainer false
			:opposite contained
		) ( struct-map
			KM3_Reference
			:name "property"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Diagram_Interchange_DiagramElement
			:type Diagram_Interchange_Property
			:location "624:3-624:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "reference"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Diagram_Interchange_DiagramElement
			:type Diagram_Interchange_Reference
			:location "625:3-625:62"
			:isContainer false
			:opposite referenced
		)]
	) ) ( def Diagram_Interchange_GraphElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Diagram_Interchange_DiagramElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "semanticModel"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_GraphElement
			:type Diagram_Interchange_SemanticModelBridge
			:location "630:3-630:83"
			:isContainer true
			:opposite graphElement
		) ( struct-map
			KM3_Reference
			:name "contained"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Diagram_Interchange_GraphElement
			:type Diagram_Interchange_DiagramElement
			:location "631:3-631:84"
			:isContainer true
			:opposite container
		) ( struct-map
			KM3_Reference
			:name "anchorage"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Diagram_Interchange_GraphElement
			:type Diagram_Interchange_GraphConnector
			:location "632:3-632:77"
			:isContainer true
			:opposite graphElement
		) ( struct-map
			KM3_Reference
			:name "link"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Diagram_Interchange_GraphElement
			:type Diagram_Interchange_DiagramLink
			:location "633:3-633:69"
			:isContainer true
			:opposite graphElement
		) ( struct-map
			KM3_Reference
			:name "position"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_GraphElement
			:type Diagram_Interchange_Point
			:location "634:3-634:30"
			:isContainer false
		)]
	) ) ( def Diagram_Interchange_SemanticModelBridge ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "presentation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_SemanticModelBridge
			:type String
			:location "640:3-640:35"
		) ( struct-map
			KM3_Reference
			:name "diagram"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Diagram_Interchange_SemanticModelBridge
			:type Diagram_Interchange_Diagram
			:location "638:3-638:53"
			:isContainer false
			:opposite owner
		) ( struct-map
			KM3_Reference
			:name "graphElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_SemanticModelBridge
			:type Diagram_Interchange_GraphElement
			:location "639:3-639:66"
			:isContainer false
			:opposite semanticModel
		)]
	) ) ( def Diagram_Interchange_GraphEdge ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Diagram_Interchange_GraphElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "anchor"
			:upper 2
			:lower 2
			:isOrdered true
			:owner Diagram_Interchange_GraphEdge
			:type Diagram_Interchange_GraphConnector
			:location "644:3-644:71"
			:isContainer false
			:opposite graphEdge
		) ( struct-map
			KM3_Reference
			:name "waypoints"
			:upper -1
			:lower 2
			:isOrdered true
			:owner Diagram_Interchange_GraphEdge
			:type Diagram_Interchange_BezierPoint
			:location "645:3-645:50"
			:isContainer false
		)]
	) ) ( def Diagram_Interchange_GraphNode ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Diagram_Interchange_GraphElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "size"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Diagram_Interchange_GraphNode
			:type Diagram_Interchange_Dimension
			:location "649:3-649:35"
			:isContainer false
		)]
	) ) ( def Diagram_Interchange_GraphConnector ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "graphElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_GraphConnector
			:type Diagram_Interchange_GraphElement
			:location "653:3-653:62"
			:isContainer false
			:opposite anchorage
		) ( struct-map
			KM3_Reference
			:name "graphEdge"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Diagram_Interchange_GraphConnector
			:type Diagram_Interchange_GraphEdge
			:location "654:3-654:56"
			:isContainer false
			:opposite anchor
		) ( struct-map
			KM3_Reference
			:name "position"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_GraphConnector
			:type Diagram_Interchange_Point
			:location "655:3-655:30"
			:isContainer false
		)]
	) ) ( def Diagram_Interchange_LeafElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Diagram_Interchange_DiagramElement]
		:structuralFeatures[]
	) ) ( def Diagram_Interchange_Reference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Diagram_Interchange_DiagramElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "referenced"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_Reference
			:type Diagram_Interchange_DiagramElement
			:location "661:3-661:64"
			:isContainer false
			:opposite reference
		)]
	) ) ( def Diagram_Interchange_TextElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Diagram_Interchange_LeafElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "text"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_TextElement
			:type String
			:location "666:3-666:27"
		)]
	) ) ( def Diagram_Interchange_GraphicPrimitive ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Diagram_Interchange_LeafElement]
		:structuralFeatures[]
	) ) ( def Diagram_Interchange_Polyline ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Diagram_Interchange_GraphicPrimitive]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "closed"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_Polyline
			:type Boolean
			:location "673:3-673:30"
		) ( struct-map
			KM3_Reference
			:name "waypoints"
			:upper -1
			:lower 2
			:isOrdered true
			:owner Diagram_Interchange_Polyline
			:type Diagram_Interchange_BezierPoint
			:location "672:3-672:50"
			:isContainer false
		)]
	) ) ( def Diagram_Interchange_Ellipse ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Diagram_Interchange_GraphicPrimitive]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "radiusX"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_Ellipse
			:type Double
			:location "678:3-678:30"
		) ( struct-map
			KM3_Attribute
			:name "radiusY"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_Ellipse
			:type Double
			:location "679:3-679:30"
		) ( struct-map
			KM3_Attribute
			:name "rotation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_Ellipse
			:type Double
			:location "680:3-680:31"
		) ( struct-map
			KM3_Attribute
			:name "startAngle"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_Ellipse
			:type Double
			:location "681:3-681:33"
		) ( struct-map
			KM3_Attribute
			:name "endAngle"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_Ellipse
			:type Double
			:location "682:3-682:31"
		) ( struct-map
			KM3_Reference
			:name "center"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_Ellipse
			:type Diagram_Interchange_Point
			:location "677:3-677:28"
			:isContainer false
		)]
	) ) ( def Diagram_Interchange_Image ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Diagram_Interchange_LeafElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "uri"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_Image
			:type String
			:location "686:3-686:26"
		) ( struct-map
			KM3_Attribute
			:name "mimeType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_Image
			:type String
			:location "687:3-687:31"
		)]
	) ) ( def Diagram_Interchange_Property ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "key"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_Property
			:type String
			:location "691:3-691:26"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_Property
			:type String
			:location "692:3-692:28"
		)]
	) ) ( def Diagram_Interchange_SimpleSemanticModelElement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Diagram_Interchange_SemanticModelBridge]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "typeInfo"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_SimpleSemanticModelElement
			:type String
			:location "696:3-696:31"
		)]
	) ) ( def Diagram_Interchange_Uml1SemanticModelBridge ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Diagram_Interchange_SemanticModelBridge]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "element"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_Uml1SemanticModelBridge
			:type Core_Element
			:location "700:3-700:31"
			:isContainer false
		)]
	) ) ( def Diagram_Interchange_CoreSemanticModelBridge ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Diagram_Interchange_SemanticModelBridge]
		:structuralFeatures[]
	) ) ( def Diagram_Interchange_DiagramLink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "zoom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_DiagramLink
			:type Double
			:location "710:3-710:27"
		) ( struct-map
			KM3_Reference
			:name "graphElement"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_DiagramLink
			:type Diagram_Interchange_GraphElement
			:location "708:3-708:57"
			:isContainer false
			:opposite link
		) ( struct-map
			KM3_Reference
			:name "diagram"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_DiagramLink
			:type Diagram_Interchange_Diagram
			:location "709:3-709:54"
			:isContainer false
			:opposite diagramLink
		) ( struct-map
			KM3_Reference
			:name "viewport"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_DiagramLink
			:type Diagram_Interchange_Point
			:location "711:3-711:30"
			:isContainer false
		)]
	) ) ( def Diagram_Interchange_Diagram ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Diagram_Interchange_GraphNode]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_Diagram
			:type String
			:location "717:3-717:27"
		) ( struct-map
			KM3_Attribute
			:name "zoom"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_Diagram
			:type Double
			:location "718:3-718:27"
		) ( struct-map
			KM3_Reference
			:name "owner"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_Diagram
			:type Diagram_Interchange_SemanticModelBridge
			:location "715:3-715:70"
			:isContainer true
			:opposite diagram
		) ( struct-map
			KM3_Reference
			:name "diagramLink"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Diagram_Interchange_Diagram
			:type Diagram_Interchange_DiagramLink
			:location "716:3-716:61"
			:isContainer false
			:opposite diagram
		) ( struct-map
			KM3_Reference
			:name "viewport"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Diagram_Interchange_Diagram
			:type Diagram_Interchange_Point
			:location "719:3-719:30"
			:isContainer false
		)]
	) )]
) )
( def Activity_Graphs ( struct-map
	KM3_Package
	:contents[( def Activity_Graphs_ActivityGraph ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[State_Machines_StateMachine]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "partition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Activity_Graphs_ActivityGraph
			:type Activity_Graphs_Partition
			:location "727:3-727:73"
			:isContainer true
			:opposite activityGraph
		)]
	) ) ( def Activity_Graphs_Partition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "contents"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Activity_Graphs_Partition
			:type Core_ModelElement
			:location "731:3-731:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "activityGraph"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Activity_Graphs_Partition
			:type Activity_Graphs_ActivityGraph
			:location "732:3-732:64"
			:isContainer false
			:opposite partition
		)]
	) ) ( def Activity_Graphs_SubactivityState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[State_Machines_SubmachineState]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isDynamic"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Activity_Graphs_SubactivityState
			:type Boolean
			:location "737:3-737:33"
		) ( struct-map
			KM3_Reference
			:name "dynamicArguments"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Activity_Graphs_SubactivityState
			:type Data_Types_ArgListsExpression
			:location "738:3-738:56"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dynamicMultiplicity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Activity_Graphs_SubactivityState
			:type Data_Types_Multiplicity
			:location "739:3-739:53"
			:isContainer false
		)]
	) ) ( def Activity_Graphs_ActionState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[State_Machines_SimpleState]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isDynamic"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Activity_Graphs_ActionState
			:type Boolean
			:location "743:3-743:33"
		) ( struct-map
			KM3_Reference
			:name "dynamicArguments"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Activity_Graphs_ActionState
			:type Data_Types_ArgListsExpression
			:location "744:3-744:56"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dynamicMultiplicity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Activity_Graphs_ActionState
			:type Data_Types_Multiplicity
			:location "745:3-745:53"
			:isContainer false
		)]
	) ) ( def Activity_Graphs_CallState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Activity_Graphs_ActionState]
		:structuralFeatures[]
	) ) ( def Activity_Graphs_ObjectFlowState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[State_Machines_SimpleState]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isSynch"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Activity_Graphs_ObjectFlowState
			:type Boolean
			:location "753:3-753:31"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Activity_Graphs_ObjectFlowState
			:type Core_Classifier
			:location "751:3-751:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "parameter"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Activity_Graphs_ObjectFlowState
			:type Core_Parameter
			:location "752:3-752:38"
			:isContainer false
		)]
	) ) ( def Activity_Graphs_ClassifierInState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_Classifier]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "inState"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Activity_Graphs_ClassifierInState
			:type State_Machines_State
			:location "757:3-757:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Activity_Graphs_ClassifierInState
			:type Core_Classifier
			:location "758:3-758:31"
			:isContainer false
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
			:location "766:3-766:50"
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
			:location "767:3-767:53"
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
			:location "768:3-768:77"
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
			KM3_Reference
			:name "extensionPoint"
			:upper -1
			:lower 1
			:isOrdered true
			:owner Use_Cases_Extend
			:type Use_Cases_ExtensionPoint
			:location "776:3-776:58"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "extension"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Use_Cases_Extend
			:type Use_Cases_UseCase
			:location "777:3-777:51"
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
			:location "778:3-778:28"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Use_Cases_Extend
			:type Data_Types_BooleanExpression
			:location "779:3-779:43"
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
			:location "783:3-783:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "base"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Use_Cases_Include
			:type Use_Cases_UseCase
			:location "784:3-784:47"
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
			:location "789:3-789:31"
		) ( struct-map
			KM3_Reference
			:name "useCase"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Use_Cases_ExtensionPoint
			:type Use_Cases_UseCase
			:location "788:3-788:57"
			:isContainer false
			:opposite extensionPoint
		)]
	) )]
) )
