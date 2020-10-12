( declare Core_Element )
( declare Core_ModelElement )
( declare Core_GeneralizableElement )
( declare Core_Namespace )
( declare Core_Classifier )
( declare Core_Feature )
( declare Core_Relationship )
( declare Core_BehavioralFeature )
( declare Core_Operation )
( declare Core_Parameter )
( declare Core_Generalization )
( declare Common_Behavior_Signal )
( declare Common_Behavior_Action )
( declare Common_Behavior_CreateAction )
( declare Common_Behavior_DestroyAction )
( declare Common_Behavior_UninterpretedAction )
( declare Common_Behavior_CallAction )
( declare Common_Behavior_SendAction )
( declare Common_Behavior_ActionSequence )
( declare Common_Behavior_Argument )
( declare Common_Behavior_ReturnAction )
( declare Common_Behavior_TerminateAction )
( declare Common_Behavior_Exception )
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
( declare Activity_Graphs_ActivityGraph )
( declare Activity_Graphs_Partition )
( declare Activity_Graphs_SubactivityState )
( declare Activity_Graphs_ActionState )
( declare Activity_Graphs_CallState )
( declare Activity_Graphs_ObjectFlowState )
( declare Activity_Graphs_ClassifierInState )
( declare Data_Types_AggregationKind )
( declare Data_Types_ChangeableKind )
( declare Data_Types_OrderingKind )
( declare Data_Types_CallConcurrencyKind )
( declare Data_Types_ParameterDirectionKind )
( declare Data_Types_PseudostateKind )
( declare Data_Types_ScopeKind )
( declare Data_Types_VisibilityKind )
( declare Data_Types_Multiplicity )
( declare Data_Types_MultiplicityRange )
( declare Data_Types_Expression )
( declare Data_Types_BooleanExpression )
( declare Data_Types_ObjectSetExpression )
( declare Data_Types_ActionExpression )
( declare Data_Types_IterationExpression )
( declare Data_Types_TimeExpression )
( declare Data_Types_ArgListsExpression )
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
	) ) ( def Core_Relationship ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[Core_ModelElement]
		:structuralFeatures[]
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
			:location "46:3-46:31"
		) ( struct-map
			KM3_Reference
			:name "parameter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Core_BehavioralFeature
			:type Core_Parameter
			:location "45:3-45:85"
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
			:location "50:3-50:52"
		) ( struct-map
			KM3_Attribute
			:name "isRoot"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Operation
			:type Boolean
			:location "51:3-51:30"
		) ( struct-map
			KM3_Attribute
			:name "isLeaf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Operation
			:type Boolean
			:location "52:3-52:30"
		) ( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Operation
			:type Boolean
			:location "53:3-53:34"
		) ( struct-map
			KM3_Attribute
			:name "specification"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Operation
			:type String
			:location "54:3-54:41"
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
			:location "60:3-60:44"
		) ( struct-map
			KM3_Attribute
			:name "kind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Parameter
			:type ParameterDirectionKind
			:location "61:3-61:43"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Parameter
			:type Core_Classifier
			:location "58:3-58:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "behavioralFeature"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Parameter
			:type Core_BehavioralFeature
			:location "59:3-59:77"
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
			:location "68:3-68:41"
		) ( struct-map
			KM3_Reference
			:name "parent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Generalization
			:type Core_GeneralizableElement
			:location "65:3-65:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "powertype"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Generalization
			:type Core_Classifier
			:location "66:3-66:67"
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
			:location "67:3-67:68"
			:isContainer false
			:opposite generalization
		)]
	) )]
) )
( def Common_Behavior ( struct-map
	KM3_Package
	:contents[( def Common_Behavior_Signal ( struct-map
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
			:location "81:3-81:51"
		) ( struct-map
			KM3_Attribute
			:name "target"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Action
			:type ObjectSetExpression
			:location "82:3-82:47"
		) ( struct-map
			KM3_Attribute
			:name "isAsynchronous"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Action
			:type Boolean
			:location "83:3-83:38"
		) ( struct-map
			KM3_Attribute
			:name "script"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Action
			:type ActionExpression
			:location "84:3-84:44"
		) ( struct-map
			KM3_Reference
			:name "actualArgument"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Common_Behavior_Action
			:type Common_Behavior_Argument
			:location "79:3-79:78"
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
			:location "80:3-80:68"
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
			:location "88:3-88:40"
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
			:location "98:3-98:37"
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
			:location "102:3-102:29"
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
			:location "106:3-106:76"
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
			:location "111:3-111:32"
		) ( struct-map
			KM3_Reference
			:name "action"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Argument
			:type Common_Behavior_Action
			:location "110:3-110:60"
			:isContainer false
			:opposite actualArgument
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
	) ) ( def Common_Behavior_Exception ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Common_Behavior_Signal]
		:structuralFeatures[]
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
			:location "128:3-128:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "submachineState"
			:upper -1
			:lower 0
			:isOrdered false
			:owner State_Machines_StateMachine
			:type State_Machines_SubmachineState
			:location "129:3-129:72"
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
			:location "130:3-130:59"
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
			:location "131:3-131:75"
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
			:location "135:3-135:56"
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
			:location "139:3-139:68"
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
			:location "140:3-140:56"
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
			:location "141:3-141:56"
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
			:location "145:3-145:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "internalTransition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner State_Machines_State
			:type State_Machines_Transition
			:location "146:3-146:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "exit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_State
			:type Common_Behavior_Action
			:location "147:3-147:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "doActivity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_State
			:type Common_Behavior_Action
			:location "148:3-148:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "entry"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_State
			:type Common_Behavior_Action
			:location "149:3-149:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "stateMachine"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_State
			:type State_Machines_StateMachine
			:location "150:3-150:61"
			:isContainer false
			:opposite top
		)]
	) ) ( def State_Machines_TimeEvent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[State_Machines_Event]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "when"
			:upper 1
			:lower 1
			:isOrdered false
			:owner State_Machines_TimeEvent
			:type TimeExpression
			:location "154:3-154:35"
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
			:location "158:3-158:37"
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
			:location "162:3-162:29"
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
			:location "166:3-166:54"
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
			:location "167:3-167:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "stateMachine"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_Transition
			:type State_Machines_StateMachine
			:location "168:3-168:69"
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
			:location "169:3-169:54"
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
			:location "170:3-170:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "guard"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_Transition
			:type State_Machines_Guard
			:location "171:3-171:64"
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
			:location "176:3-176:36"
		) ( struct-map
			KM3_Reference
			:name "subvertex"
			:upper -1
			:lower 0
			:isOrdered false
			:owner State_Machines_CompositeState
			:type State_Machines_StateVertex
			:location "175:3-175:73"
			:isContainer true
			:opposite container
		)]
	) ) ( def State_Machines_ChangeEvent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[State_Machines_Event]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "changeExpression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner State_Machines_ChangeEvent
			:type BooleanExpression
			:location "180:3-180:50"
		)]
	) ) ( def State_Machines_Guard ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Core_ModelElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "expression"
			:upper 1
			:lower 1
			:isOrdered false
			:owner State_Machines_Guard
			:type BooleanExpression
			:location "185:3-185:44"
		) ( struct-map
			KM3_Reference
			:name "transition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner State_Machines_Guard
			:type State_Machines_Transition
			:location "184:3-184:54"
			:isContainer false
			:opposite guard
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
			:location "189:3-189:36"
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
			:location "196:3-196:66"
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
			:location "200:3-200:29"
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
			:location "204:3-204:37"
		)]
	) ) ( def State_Machines_FinalState ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[State_Machines_State]
		:structuralFeatures[]
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
			:location "213:3-213:73"
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
			:location "217:3-217:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "activityGraph"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Activity_Graphs_Partition
			:type Activity_Graphs_ActivityGraph
			:location "218:3-218:64"
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
			:location "222:3-222:33"
		) ( struct-map
			KM3_Attribute
			:name "dynamicArguments"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Activity_Graphs_SubactivityState
			:type ArgListsExpression
			:location "223:3-223:56"
		) ( struct-map
			KM3_Attribute
			:name "dynamicMultiplicity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Activity_Graphs_SubactivityState
			:type Multiplicity
			:location "224:3-224:53"
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
			:location "228:3-228:33"
		) ( struct-map
			KM3_Attribute
			:name "dynamicArguments"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Activity_Graphs_ActionState
			:type ArgListsExpression
			:location "229:3-229:56"
		) ( struct-map
			KM3_Attribute
			:name "dynamicMultiplicity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Activity_Graphs_ActionState
			:type Multiplicity
			:location "230:3-230:53"
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
			:location "239:3-239:31"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Activity_Graphs_ObjectFlowState
			:type Core_Classifier
			:location "237:3-237:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "parameter"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Activity_Graphs_ObjectFlowState
			:type Core_Parameter
			:location "238:3-238:38"
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
			:location "243:3-243:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Activity_Graphs_ClassifierInState
			:type Core_Classifier
			:location "244:3-244:31"
			:isContainer false
		)]
	) )]
) )
( def Data_Types ( struct-map
	KM3_Package
	:contents[( def AggregationKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ak_none"
		:location "250:3-250:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "ak_aggregate"
		:location "251:3-251:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "ak_composite"
		:location "252:3-252:24"
	)] ) ) ( def ChangeableKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ck_changeable"
		:location "256:3-256:25"
	) ( struct-map
		KM3_EnumLiteral
		:name "ck_frozen"
		:location "257:3-257:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "ck_addOnly"
		:location "258:3-258:22"
	)] ) ) ( def OrderingKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "ok_unordered"
		:location "262:3-262:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "ok_ordered"
		:location "263:3-263:22"
	)] ) ) ( def CallConcurrencyKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "cck_sequential"
		:location "267:3-267:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "cck_guarded"
		:location "268:3-268:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "cck_concurrent"
		:location "269:3-269:26"
	)] ) ) ( def ParameterDirectionKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "pdk_in"
		:location "273:3-273:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "pdk_inout"
		:location "274:3-274:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "pdk_out"
		:location "275:3-275:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "pdk_return"
		:location "276:3-276:22"
	)] ) ) ( def PseudostateKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "pk_choice"
		:location "280:3-280:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "pk_deepHistory"
		:location "281:3-281:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "pk_fork"
		:location "282:3-282:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "pk_initial"
		:location "283:3-283:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "pk_join"
		:location "284:3-284:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "pk_junction"
		:location "285:3-285:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "pk_shallowHistory"
		:location "286:3-286:29"
	)] ) ) ( def ScopeKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "sk_instance"
		:location "290:3-290:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "sk_classifier"
		:location "291:3-291:25"
	)] ) ) ( def VisibilityKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "vk_public"
		:location "295:3-295:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_protected"
		:location "296:3-296:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_private"
		:location "297:3-297:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_package"
		:location "298:3-298:22"
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
			:location "302:3-302:78"
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
			:location "307:3-307:29"
		) ( struct-map
			KM3_Attribute
			:name "upper"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Data_Types_MultiplicityRange
			:type Integer
			:location "308:3-308:29"
		) ( struct-map
			KM3_Reference
			:name "multiplicity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Data_Types_MultiplicityRange
			:type Data_Types_Multiplicity
			:location "306:3-306:58"
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
			:location "312:3-312:36"
		) ( struct-map
			KM3_Attribute
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Data_Types_Expression
			:type String
			:location "313:3-313:27"
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
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "336:2-336:19"
	) ) ( def ptyp_Float ( struct-map
		KM3_DataType
		:name "Float"
		:location "337:2-337:17"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "338:2-338:19"
	) ) ( def ptyp_Long ( struct-map
		KM3_DataType
		:name "Long"
		:location "339:2-339:16"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "340:2-340:18"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "341:2-341:18"
	) )]
) )
