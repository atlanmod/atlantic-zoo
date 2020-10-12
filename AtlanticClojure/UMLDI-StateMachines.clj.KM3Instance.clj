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
( declare Common_Behavior_Reception )
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
( declare Data_Types_CallConcurrencyKind )
( declare Data_Types_ParameterDirectionKind )
( declare Data_Types_ScopeKind )
( declare Data_Types_VisibilityKind )
( declare Data_Types_Expression )
( declare Data_Types_BooleanExpression )
( declare Data_Types_ObjectSetExpression )
( declare Data_Types_ActionExpression )
( declare Data_Types_IterationExpression )
( declare Data_Types_TimeExpression )
( declare Data_Types_PseudostateKind )
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
			:location "45:3-45:31"
		) ( struct-map
			KM3_Reference
			:name "parameter"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Core_BehavioralFeature
			:type Core_Parameter
			:location "44:3-44:85"
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
			:location "49:3-49:52"
		) ( struct-map
			KM3_Attribute
			:name "isRoot"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Operation
			:type Boolean
			:location "50:3-50:30"
		) ( struct-map
			KM3_Attribute
			:name "isLeaf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Operation
			:type Boolean
			:location "51:3-51:30"
		) ( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Operation
			:type Boolean
			:location "52:3-52:34"
		) ( struct-map
			KM3_Attribute
			:name "specification"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Operation
			:type String
			:location "53:3-53:41"
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
			:location "59:3-59:44"
		) ( struct-map
			KM3_Attribute
			:name "kind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Parameter
			:type ParameterDirectionKind
			:location "60:3-60:43"
		) ( struct-map
			KM3_Reference
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Parameter
			:type Core_Classifier
			:location "57:3-57:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "behavioralFeature"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Parameter
			:type Core_BehavioralFeature
			:location "58:3-58:77"
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
			:location "67:3-67:41"
		) ( struct-map
			KM3_Reference
			:name "parent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Core_Generalization
			:type Core_GeneralizableElement
			:location "64:3-64:43"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "powertype"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Core_Generalization
			:type Core_Classifier
			:location "65:3-65:67"
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
			:location "66:3-66:68"
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
			:location "79:3-79:51"
		) ( struct-map
			KM3_Attribute
			:name "target"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Action
			:type ObjectSetExpression
			:location "80:3-80:47"
		) ( struct-map
			KM3_Attribute
			:name "isAsynchronous"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Action
			:type Boolean
			:location "81:3-81:38"
		) ( struct-map
			KM3_Attribute
			:name "script"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Action
			:type ActionExpression
			:location "82:3-82:44"
		) ( struct-map
			KM3_Reference
			:name "actualArgument"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Common_Behavior_Action
			:type Common_Behavior_Argument
			:location "77:3-77:78"
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
			:location "78:3-78:68"
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
			:location "86:3-86:40"
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
			:location "94:3-94:37"
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
			:location "98:3-98:29"
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
			:location "102:3-102:76"
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
			:location "107:3-107:32"
		) ( struct-map
			KM3_Reference
			:name "action"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Common_Behavior_Argument
			:type Common_Behavior_Action
			:location "106:3-106:60"
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
			:location "112:3-112:41"
		) ( struct-map
			KM3_Attribute
			:name "isRoot"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Reception
			:type Boolean
			:location "113:3-113:30"
		) ( struct-map
			KM3_Attribute
			:name "isLeaf"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Reception
			:type Boolean
			:location "114:3-114:30"
		) ( struct-map
			KM3_Attribute
			:name "isAbstract"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Reception
			:type Boolean
			:location "115:3-115:34"
		) ( struct-map
			KM3_Reference
			:name "signal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Common_Behavior_Reception
			:type Common_Behavior_Signal
			:location "111:3-111:29"
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
			:location "129:3-129:41"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "submachineState"
			:upper -1
			:lower 0
			:isOrdered false
			:owner State_Machines_StateMachine
			:type State_Machines_SubmachineState
			:location "130:3-130:72"
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
			:location "131:3-131:59"
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
			:location "132:3-132:75"
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
			:location "136:3-136:56"
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
			:location "140:3-140:68"
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
			:location "141:3-141:56"
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
			:location "142:3-142:56"
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
			:location "146:3-146:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "internalTransition"
			:upper -1
			:lower 0
			:isOrdered false
			:owner State_Machines_State
			:type State_Machines_Transition
			:location "147:3-147:58"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "exit"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_State
			:type Common_Behavior_Action
			:location "148:3-148:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "doActivity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_State
			:type Common_Behavior_Action
			:location "149:3-149:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "entry"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_State
			:type Common_Behavior_Action
			:location "150:3-150:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "stateMachine"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_State
			:type State_Machines_StateMachine
			:location "151:3-151:61"
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
			:location "155:3-155:35"
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
			:location "159:3-159:37"
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
			:location "163:3-163:29"
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
			:location "167:3-167:54"
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
			:location "168:3-168:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "stateMachine"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_Transition
			:type State_Machines_StateMachine
			:location "169:3-169:69"
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
			:location "170:3-170:54"
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
			:location "171:3-171:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "guard"
			:upper 1
			:lower 0
			:isOrdered false
			:owner State_Machines_Transition
			:type State_Machines_Guard
			:location "172:3-172:64"
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
			:location "177:3-177:36"
		) ( struct-map
			KM3_Reference
			:name "subvertex"
			:upper -1
			:lower 0
			:isOrdered false
			:owner State_Machines_CompositeState
			:type State_Machines_StateVertex
			:location "176:3-176:73"
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
			:location "181:3-181:50"
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
			:location "186:3-186:44"
		) ( struct-map
			KM3_Reference
			:name "transition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner State_Machines_Guard
			:type State_Machines_Transition
			:location "185:3-185:54"
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
			:location "190:3-190:36"
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
( def Data_Types ( struct-map
	KM3_Package
	:contents[( def CallConcurrencyKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "cck_sequential"
		:location "213:3-213:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "cck_guarded"
		:location "214:3-214:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "cck_concurrent"
		:location "215:3-215:26"
	)] ) ) ( def ParameterDirectionKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "pdk_in"
		:location "219:3-219:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "pdk_inout"
		:location "220:3-220:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "pdk_out"
		:location "221:3-221:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "pdk_return"
		:location "222:3-222:22"
	)] ) ) ( def ScopeKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "sk_instance"
		:location "226:3-226:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "sk_classifier"
		:location "227:3-227:25"
	)] ) ) ( def VisibilityKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "vk_public"
		:location "231:3-231:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_protected"
		:location "232:3-232:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_private"
		:location "233:3-233:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "vk_package"
		:location "234:3-234:22"
	)] ) ) ( def PseudostateKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "pk_choice"
		:location "253:3-253:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "pk_deepHistory"
		:location "254:3-254:26"
	) ( struct-map
		KM3_EnumLiteral
		:name "pk_fork"
		:location "255:3-255:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "pk_initial"
		:location "256:3-256:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "pk_join"
		:location "257:3-257:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "pk_junction"
		:location "258:3-258:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "pk_shallowHistory"
		:location "259:3-259:29"
	)] ) ) ( def Data_Types_Expression ( struct-map
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
			:location "238:3-238:36"
		) ( struct-map
			KM3_Attribute
			:name "body"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Data_Types_Expression
			:type String
			:location "239:3-239:27"
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
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "264:2-264:19"
	) ) ( def ptyp_Float ( struct-map
		KM3_DataType
		:name "Float"
		:location "265:2-265:17"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "266:2-266:19"
	) ) ( def ptyp_Long ( struct-map
		KM3_DataType
		:name "Long"
		:location "267:2-267:16"
	) ) ( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "268:2-268:18"
	) ) ( def ptyp_Double ( struct-map
		KM3_DataType
		:name "Double"
		:location "269:2-269:18"
	) )]
) )
