( declare UIML_UIML )
( declare UIML_Header )
( declare UIML_MetaData )
( declare Interface_ExtensibleElement )
( declare Interface_Source )
( declare Interface_LocalSource )
( declare Interface_RemoteSource )
( declare Interface_Interface )
( declare Interface_Structure )
( declare Interface_Part )
( declare Interface_Style )
( declare Interface_Property )
( declare Interface_Content )
( declare Interface_Behavior )
( declare Interface_Repeat )
( declare Interface_Constant )
( declare Interface_Reference )
( declare Interface_Rule )
( declare Interface_Condition )
( declare Interface_EventCondition )
( declare Interface_EqualCondition )
( declare Interface_OpCondition )
( declare Interface_Action )
( declare Interface_Action_1 )
( declare Interface_Action_2 )
( declare Interface_Call )
( declare Interface_Parameter )
( declare Interface_PropertyParameter )
( declare Interface_ReferenceParameter )
( declare Interface_CallParameter )
( declare Interface_OperationParameter )
( declare Interface_EventParameter )
( declare Interface_ConstantParameter )
( declare Interface_IteratorParameter )
( declare Interface_Iterator )
( declare Interface_ConstantIterator )
( declare Interface_PropertyIterator )
( declare Interface_CallIterator )
( declare Interface_TextIterator )
( declare Interface_Event )
( declare Interface_Equal )
( declare Interface_EqualToConstant )
( declare Interface_EqualToProperty )
( declare Interface_EqualToReference )
( declare Interface_EqualToOperation )
( declare Interface_Operation )
( declare Interface_Restructure )
( declare Interface_Branch )
( declare Interface_WhenTrue )
( declare Interface_WhenFalse )
( declare Interface_ByDefault )
( declare Interface_HowKind )
( declare Interface_ExportKind )
( declare Interface_WhereKind )
( declare Peer_Peer )
( declare Peer_Presentation )
( declare Peer_Logic )
( declare Peer_DComponent )
( declare Peer_DClass )
( declare Peer_DProperty )
( declare Peer_DMethod )
( declare Peer_DParam )
( declare Peer_Script )
( declare Peer_Listener )
( declare Peer_UsedInTagKind )
( declare Peer_MapsTypeKind )
( declare Template_Template )
( declare Template_BehaviorTemplate )
( declare Template_DClassTemplate )
( declare Template_DComponentTemplate )
( declare Template_ConstantTemplate )
( declare Template_ContentTemplate )
( declare Template_InterfaceTemplate )
( declare Template_LogicTemplate )
( declare Template_PartTemplate )
( declare Template_PeerTemplate )
( declare Template_PresentationTemplate )
( declare Template_PropertyTemplate )
( declare Template_RestructureTemplate )
( declare Template_RuleTemplate )
( declare Template_ScriptTemplate )
( declare Template_StructureTemplate )
( declare Template_StyleTemplate )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( def UIML ( struct-map
	KM3_Package
	:contents[( def UIML_UIML ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "head"
			:upper 1
			:lower 0
			:isOrdered false
			:owner UIML_UIML
			:type UIML_Header
			:location "11:3-11:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "templates"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UIML_UIML
			:type Template_Template
			:location "12:3-12:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "interfaces"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UIML_UIML
			:type Interface_Interface
			:location "13:3-13:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "peers"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UIML_UIML
			:type Peer_Peer
			:location "14:3-14:39"
			:isContainer true
		)]
	) ) ( def UIML_Header ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "metas"
			:upper -1
			:lower 0
			:isOrdered false
			:owner UIML_Header
			:type UIML_MetaData
			:location "18:3-18:43"
			:isContainer true
		)]
	) ) ( def UIML_MetaData ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UIML_MetaData
			:type String
			:location "22:3-22:27"
		) ( struct-map
			KM3_Attribute
			:name "content"
			:upper 1
			:lower 1
			:isOrdered false
			:owner UIML_MetaData
			:type String
			:location "23:3-23:30"
		)]
	) )]
) )
( def Interface ( struct-map
	KM3_Package
	:contents[( def HowKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "append"
		:location "324:3-324:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "cascade"
		:location "325:3-325:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "replace"
		:location "326:3-326:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "union"
		:location "327:3-327:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "delete"
		:location "328:3-328:18"
	)] ) ) ( def ExportKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "hidden"
		:location "332:3-332:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "optional"
		:location "333:3-333:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "required"
		:location "334:3-334:20"
	)] ) ) ( def WhereKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "first"
		:location "338:3-338:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "last"
		:location "339:3-339:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "before"
		:location "340:3-340:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "after"
		:location "341:3-341:17"
	)] ) ) ( def Interface_ExtensibleElement ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Interface_Source ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Interface_LocalSource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Source]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_LocalSource
			:type Interface_ExtensibleElement
			:location "35:3-35:40"
			:isContainer false
		)]
	) ) ( def Interface_RemoteSource ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Source]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_RemoteSource
			:type String
			:location "39:3-39:31"
		)]
	) ) ( def Interface_Interface ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_ExtensibleElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Interface
			:type String
			:location "43:3-43:30"
		) ( struct-map
			KM3_Attribute
			:name "how"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Interface
			:type HowKind
			:location "44:3-44:32"
		) ( struct-map
			KM3_Attribute
			:name "export"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Interface
			:type ExportKind
			:location "45:3-45:38"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Interface
			:type Interface_Source
			:location "47:3-47:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "structure"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Interface
			:type Interface_Structure
			:location "48:3-48:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "style"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Interface
			:type Interface_Style
			:location "49:3-49:40"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "content"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Interface
			:type Interface_Content
			:location "50:3-50:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "behavior"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Interface
			:type Interface_Behavior
			:location "51:3-51:46"
			:isContainer true
		)]
	) ) ( def Interface_Structure ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_ExtensibleElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Structure
			:type String
			:location "55:3-55:30"
		) ( struct-map
			KM3_Attribute
			:name "how"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Structure
			:type HowKind
			:location "56:3-56:32"
		) ( struct-map
			KM3_Attribute
			:name "export"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Structure
			:type ExportKind
			:location "57:3-57:38"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Structure
			:type Interface_Source
			:location "59:3-59:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "parts"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Interface_Structure
			:type Interface_Part
			:location "60:3-60:47"
			:isContainer true
		)]
	) ) ( def Interface_Part ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_ExtensibleElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Part
			:type String
			:location "64:3-64:30"
		) ( struct-map
			KM3_Attribute
			:name "how"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Part
			:type HowKind
			:location "65:3-65:32"
		) ( struct-map
			KM3_Attribute
			:name "export"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Part
			:type ExportKind
			:location "66:3-66:38"
		) ( struct-map
			KM3_Attribute
			:name "class"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Part
			:type String
			:location "67:3-67:35"
		) ( struct-map
			KM3_Attribute
			:name "wherePart"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Part
			:type String
			:location "69:3-69:37"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Part
			:type Interface_Source
			:location "71:3-71:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "style"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Part
			:type Interface_Style
			:location "72:3-72:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "content"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Part
			:type Interface_Content
			:location "73:3-73:46"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "behavior"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Part
			:type Interface_Behavior
			:location "74:3-74:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "parts"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Part
			:type Interface_Part
			:location "77:3-77:39"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "repeats"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Part
			:type Interface_Repeat
			:location "78:3-78:43"
			:isContainer true
		)]
	) ) ( def Interface_Style ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_ExtensibleElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Style
			:type String
			:location "82:3-82:30"
		) ( struct-map
			KM3_Attribute
			:name "how"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Style
			:type HowKind
			:location "83:3-83:32"
		) ( struct-map
			KM3_Attribute
			:name "export"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Style
			:type ExportKind
			:location "84:3-84:38"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Style
			:type Interface_Source
			:location "86:3-86:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "properties"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Style
			:type Interface_Property
			:location "87:3-87:48"
			:isContainer true
		)]
	) ) ( def Interface_Property ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_ExtensibleElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Property
			:type String
			:location "91:3-91:32"
		) ( struct-map
			KM3_Attribute
			:name "how"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Property
			:type HowKind
			:location "92:3-92:32"
		) ( struct-map
			KM3_Attribute
			:name "export"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Property
			:type ExportKind
			:location "93:3-93:38"
		) ( struct-map
			KM3_Attribute
			:name "values"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Property
			:type String
			:location "94:3-94:32"
		) ( struct-map
			KM3_Reference
			:name "parts"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Property
			:type Interface_Part
			:location "98:3-98:29"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "events"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Property
			:type Interface_Event
			:location "101:3-101:31"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Property
			:type Interface_Source
			:location "103:3-103:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "constants"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Property
			:type Interface_Constant
			:location "104:3-104:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "properties"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Property
			:type Interface_Property
			:location "105:3-105:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "references"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Property
			:type Interface_Reference
			:location "106:3-106:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "calls"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Property
			:type Interface_Call
			:location "107:3-107:39"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "iterators"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Property
			:type Interface_Iterator
			:location "108:3-108:47"
			:isContainer true
		)]
	) ) ( def Interface_Content ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_ExtensibleElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Content
			:type String
			:location "112:3-112:30"
		) ( struct-map
			KM3_Attribute
			:name "how"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Content
			:type HowKind
			:location "113:3-113:32"
		) ( struct-map
			KM3_Attribute
			:name "export"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Content
			:type ExportKind
			:location "114:3-114:38"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Content
			:type Interface_Source
			:location "116:3-116:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "constants"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Interface_Content
			:type Interface_Constant
			:location "117:3-117:55"
			:isContainer true
		)]
	) ) ( def Interface_Behavior ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_ExtensibleElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Behavior
			:type String
			:location "121:3-121:30"
		) ( struct-map
			KM3_Attribute
			:name "how"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Behavior
			:type HowKind
			:location "122:3-122:32"
		) ( struct-map
			KM3_Attribute
			:name "export"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Behavior
			:type ExportKind
			:location "123:3-123:38"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Behavior
			:type Interface_Source
			:location "125:3-125:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "rules"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Interface_Behavior
			:type Interface_Rule
			:location "126:3-126:47"
			:isContainer true
		)]
	) ) ( def Interface_Repeat ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "iterator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_Repeat
			:type Interface_Iterator
			:location "130:3-130:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "parts"
			:upper -1
			:lower 1
			:isOrdered false
			:owner Interface_Repeat
			:type Interface_Part
			:location "131:3-131:41"
			:isContainer true
		)]
	) ) ( def Interface_Constant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_ExtensibleElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Constant
			:type String
			:location "135:3-135:30"
		) ( struct-map
			KM3_Attribute
			:name "how"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Constant
			:type HowKind
			:location "136:3-136:32"
		) ( struct-map
			KM3_Attribute
			:name "export"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Constant
			:type ExportKind
			:location "137:3-137:38"
		) ( struct-map
			KM3_Attribute
			:name "model"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Constant
			:type String
			:location "138:3-138:33"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Constant
			:type String
			:location "139:3-139:33"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Constant
			:type Interface_Source
			:location "141:3-141:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "constants"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Interface_Constant
			:type Interface_Constant
			:location "142:3-142:55"
			:isContainer true
		)]
	) ) ( def Interface_Reference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constant"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Reference
			:type Interface_Constant
			:location "148:3-148:38"
			:isContainer false
		)]
	) ) ( def Interface_Rule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_ExtensibleElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Rule
			:type String
			:location "152:3-152:30"
		) ( struct-map
			KM3_Attribute
			:name "how"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Rule
			:type HowKind
			:location "153:3-153:32"
		) ( struct-map
			KM3_Attribute
			:name "export"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Rule
			:type ExportKind
			:location "154:3-154:38"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Rule
			:type Interface_Source
			:location "156:3-156:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "condition"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_Rule
			:type Interface_Condition
			:location "157:3-157:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "action"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_Rule
			:type Interface_Action
			:location "158:3-158:39"
			:isContainer true
		)]
	) ) ( def Interface_Condition ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Interface_EventCondition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Condition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "event"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_EventCondition
			:type Interface_Event
			:location "165:3-165:37"
			:isContainer true
		)]
	) ) ( def Interface_EqualCondition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Condition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "equal"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_EqualCondition
			:type Interface_Equal
			:location "169:3-169:37"
			:isContainer true
		)]
	) ) ( def Interface_OpCondition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Condition]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "op"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_OpCondition
			:type Interface_Operation
			:location "173:3-173:38"
			:isContainer true
		)]
	) ) ( def Interface_Action ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[]
	) ) ( def Interface_Action_1 ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Action]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "event"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Action_1
			:type Interface_Event
			:location "180:3-180:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "properties"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Action_1
			:type Interface_Property
			:location "183:3-183:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "calls"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Action_1
			:type Interface_Call
			:location "184:3-184:39"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "restructures"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Action_1
			:type Interface_Restructure
			:location "185:3-185:53"
			:isContainer true
		)]
	) ) ( def Interface_Action_2 ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Action]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "whenTrue"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Action_2
			:type Interface_WhenTrue
			:location "189:3-189:38"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "whenFalse"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Action_2
			:type Interface_WhenFalse
			:location "190:3-190:40"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "byDefault"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Action_2
			:type Interface_ByDefault
			:location "191:3-191:40"
			:isContainer false
		)]
	) ) ( def Interface_Call ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Call
			:type String
			:location "195:3-195:32"
		) ( struct-map
			KM3_Reference
			:name "params"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Interface_Call
			:type Interface_Parameter
			:location "196:3-196:53"
			:isContainer true
		)]
	) ) ( def Interface_Parameter ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Parameter
			:type String
			:location "200:3-200:32"
		)]
	) ) ( def Interface_PropertyParameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Parameter]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "property"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_PropertyParameter
			:type Interface_Property
			:location "204:3-204:33"
			:isContainer false
		)]
	) ) ( def Interface_ReferenceParameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Parameter]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "reference"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_ReferenceParameter
			:type Interface_Reference
			:location "208:3-208:37"
			:isContainer false
		)]
	) ) ( def Interface_CallParameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Parameter]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "call"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_CallParameter
			:type Interface_Call
			:location "212:3-212:25"
			:isContainer false
		)]
	) ) ( def Interface_OperationParameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Parameter]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "op"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_OperationParameter
			:type Interface_Operation
			:location "216:3-216:28"
			:isContainer false
		)]
	) ) ( def Interface_EventParameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Parameter]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "event"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_EventParameter
			:type Interface_Event
			:location "220:3-220:27"
			:isContainer false
		)]
	) ) ( def Interface_ConstantParameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Parameter]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constant"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_ConstantParameter
			:type Interface_Constant
			:location "224:3-224:33"
			:isContainer false
		)]
	) ) ( def Interface_IteratorParameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Parameter]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "iterator"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_IteratorParameter
			:type Interface_Iterator
			:location "228:3-228:33"
			:isContainer false
		)]
	) ) ( def Interface_Iterator ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_Iterator
			:type String
			:location "232:3-232:25"
		)]
	) ) ( def Interface_ConstantIterator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Iterator]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constant"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_ConstantIterator
			:type Interface_Constant
			:location "236:3-236:43"
			:isContainer true
		)]
	) ) ( def Interface_PropertyIterator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Iterator]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "property"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_PropertyIterator
			:type Interface_Property
			:location "240:3-240:43"
			:isContainer true
		)]
	) ) ( def Interface_CallIterator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Iterator]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "call"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_CallIterator
			:type Interface_Call
			:location "244:3-244:35"
			:isContainer true
		)]
	) ) ( def Interface_TextIterator ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Iterator]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_TextIterator
			:type Integer
			:location "248:3-248:29"
		)]
	) ) ( def Interface_Event ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "class"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Event
			:type String
			:location "252:3-252:35"
		) ( struct-map
			KM3_Reference
			:name "parts"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Event
			:type Interface_Part
			:location "256:3-256:29"
			:isContainer false
		)]
	) ) ( def Interface_Equal ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "event"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_Equal
			:type Interface_Event
			:location "260:3-260:27"
			:isContainer false
		)]
	) ) ( def Interface_EqualToConstant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Equal]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constant"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_EqualToConstant
			:type Interface_Constant
			:location "264:3-264:33"
			:isContainer false
		)]
	) ) ( def Interface_EqualToProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Equal]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "property"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_EqualToProperty
			:type Interface_Property
			:location "268:3-268:33"
			:isContainer false
		)]
	) ) ( def Interface_EqualToReference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Equal]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "reference"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_EqualToReference
			:type Interface_Reference
			:location "272:3-272:37"
			:isContainer false
		)]
	) ) ( def Interface_EqualToOperation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Equal]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "op"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_EqualToOperation
			:type Interface_Operation
			:location "276:3-276:28"
			:isContainer false
		)]
	) ) ( def Interface_Operation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Interface_Operation
			:type String
			:location "280:3-280:27"
		) ( struct-map
			KM3_Reference
			:name "constants"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Operation
			:type Interface_Constant
			:location "283:3-283:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "properties"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Operation
			:type Interface_Property
			:location "284:3-284:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "references"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Operation
			:type Interface_Reference
			:location "285:3-285:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "calls"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Operation
			:type Interface_Call
			:location "286:3-286:39"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "ops"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Operation
			:type Interface_Operation
			:location "287:3-287:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "events"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Operation
			:type Interface_Event
			:location "288:3-288:41"
			:isContainer true
		)]
	) ) ( def Interface_Restructure ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_ExtensibleElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "how"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Restructure
			:type HowKind
			:location "292:3-292:32"
		) ( struct-map
			KM3_Reference
			:name "atPart"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Restructure
			:type Interface_Part
			:location "296:3-296:32"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "wherePart"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Restructure
			:type Interface_Part
			:location "298:3-298:35"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Restructure
			:type Interface_Source
			:location "300:3-300:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "template"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Restructure
			:type Template_Template
			:location "301:3-301:48"
			:isContainer true
		)]
	) ) ( def Interface_Branch ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "properties"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Branch
			:type Interface_Property
			:location "306:3-306:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "calls"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Interface_Branch
			:type Interface_Call
			:location "307:3-307:39"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "restructure"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Branch
			:type Interface_Restructure
			:location "308:3-308:54"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "op"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Branch
			:type Interface_Operation
			:location "309:3-309:43"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "equal"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Branch
			:type Interface_Equal
			:location "310:3-310:42"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "event"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Interface_Branch
			:type Interface_Event
			:location "311:3-311:42"
			:isContainer true
		)]
	) ) ( def Interface_WhenTrue ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Branch]
		:structuralFeatures[]
	) ) ( def Interface_WhenFalse ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Branch]
		:structuralFeatures[]
	) ) ( def Interface_ByDefault ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_Branch]
		:structuralFeatures[]
	) )]
) )
( def Peer ( struct-map
	KM3_Package
	:contents[( def UsedInTagKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "event"
		:location "445:3-445:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "listener"
		:location "446:3-446:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "part"
		:location "447:3-447:16"
	)] ) ) ( def MapsTypeKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "attribute"
		:location "451:3-451:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "getMethod"
		:location "452:3-452:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "setMethod"
		:location "453:3-453:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "method"
		:location "454:3-454:18"
	)] ) ) ( def Peer_Peer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_ExtensibleElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_Peer
			:type String
			:location "347:3-347:30"
		) ( struct-map
			KM3_Attribute
			:name "how"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_Peer
			:type HowKind
			:location "348:3-348:32"
		) ( struct-map
			KM3_Attribute
			:name "export"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_Peer
			:type ExportKind
			:location "349:3-349:38"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_Peer
			:type Interface_Source
			:location "351:3-351:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "presentations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Peer_Peer
			:type Peer_Presentation
			:location "352:3-352:55"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "logics"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Peer_Peer
			:type Peer_Logic
			:location "353:3-353:41"
			:isContainer true
		)]
	) ) ( def Peer_Presentation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_ExtensibleElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_Presentation
			:type String
			:location "357:3-357:30"
		) ( struct-map
			KM3_Attribute
			:name "how"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_Presentation
			:type HowKind
			:location "358:3-358:32"
		) ( struct-map
			KM3_Attribute
			:name "export"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_Presentation
			:type ExportKind
			:location "359:3-359:38"
		) ( struct-map
			KM3_Attribute
			:name "base"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Peer_Presentation
			:type String
			:location "360:3-360:27"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_Presentation
			:type Interface_Source
			:location "362:3-362:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dClasses"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Peer_Presentation
			:type Peer_DClass
			:location "363:3-363:44"
			:isContainer true
		)]
	) ) ( def Peer_Logic ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_ExtensibleElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_Logic
			:type String
			:location "367:3-367:30"
		) ( struct-map
			KM3_Attribute
			:name "how"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_Logic
			:type HowKind
			:location "368:3-368:32"
		) ( struct-map
			KM3_Attribute
			:name "export"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_Logic
			:type ExportKind
			:location "369:3-369:38"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_Logic
			:type Interface_Source
			:location "371:3-371:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dComponents"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Peer_Logic
			:type Peer_DComponent
			:location "372:3-372:51"
			:isContainer true
		)]
	) ) ( def Peer_DComponent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_ExtensibleElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Peer_DComponent
			:type String
			:location "376:3-376:25"
		) ( struct-map
			KM3_Attribute
			:name "how"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_DComponent
			:type HowKind
			:location "377:3-377:32"
		) ( struct-map
			KM3_Attribute
			:name "export"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_DComponent
			:type ExportKind
			:location "378:3-378:38"
		) ( struct-map
			KM3_Attribute
			:name "mapsTo"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_DComponent
			:type String
			:location "379:3-379:34"
		) ( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_DComponent
			:type String
			:location "380:3-380:36"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_DComponent
			:type Interface_Source
			:location "382:3-382:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dMethods"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Peer_DComponent
			:type Peer_DMethod
			:location "383:3-383:45"
			:isContainer true
		)]
	) ) ( def Peer_DClass ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_ExtensibleElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Peer_DClass
			:type String
			:location "387:3-387:25"
		) ( struct-map
			KM3_Attribute
			:name "how"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_DClass
			:type HowKind
			:location "388:3-388:32"
		) ( struct-map
			KM3_Attribute
			:name "export"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_DClass
			:type ExportKind
			:location "389:3-389:38"
		) ( struct-map
			KM3_Attribute
			:name "mapsTo"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Peer_DClass
			:type String
			:location "390:3-390:29"
		) ( struct-map
			KM3_Attribute
			:name "mapsType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Peer_DClass
			:type String
			:location "391:3-391:31"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_DClass
			:type Interface_Source
			:location "394:3-394:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dMethods"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Peer_DClass
			:type Peer_DMethod
			:location "395:3-395:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "dProperties"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Peer_DClass
			:type Peer_DProperty
			:location "396:3-396:50"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "events"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Peer_DClass
			:type Interface_Event
			:location "397:3-397:41"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "listeners"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Peer_DClass
			:type Peer_Listener
			:location "398:3-398:47"
			:isContainer true
		)]
	) ) ( def Peer_DProperty ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Peer_DProperty
			:type String
			:location "402:3-402:25"
		) ( struct-map
			KM3_Attribute
			:name "mapsType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Peer_DProperty
			:type MapsTypeKind
			:location "403:3-403:37"
		) ( struct-map
			KM3_Attribute
			:name "mapsTo"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Peer_DProperty
			:type String
			:location "404:3-404:29"
		) ( struct-map
			KM3_Attribute
			:name "returnType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_DProperty
			:type String
			:location "405:3-405:38"
		) ( struct-map
			KM3_Reference
			:name "dMethods"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Peer_DProperty
			:type Peer_DMethod
			:location "407:3-407:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "dParams"
			:upper -1
			:lower 0
			:isOrdered false
			:owner Peer_DProperty
			:type Peer_DParam
			:location "408:3-408:43"
			:isContainer true
		)]
	) ) ( def Peer_DMethod ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_ExtensibleElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Peer_DMethod
			:type String
			:location "412:3-412:25"
		) ( struct-map
			KM3_Attribute
			:name "how"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_DMethod
			:type HowKind
			:location "413:3-413:32"
		) ( struct-map
			KM3_Attribute
			:name "export"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_DMethod
			:type ExportKind
			:location "414:3-414:38"
		) ( struct-map
			KM3_Attribute
			:name "mapsTo"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Peer_DMethod
			:type String
			:location "415:3-415:29"
		) ( struct-map
			KM3_Attribute
			:name "returnType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_DMethod
			:type String
			:location "416:3-416:38"
		) ( struct-map
			KM3_Reference
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_DMethod
			:type Interface_Source
			:location "418:3-418:34"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "dParams"
			:upper -1
			:lower 0
			:isOrdered true
			:owner Peer_DMethod
			:type Peer_DParam
			:location "419:3-419:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "script"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_DMethod
			:type Peer_Script
			:location "420:3-420:44"
			:isContainer true
		)]
	) ) ( def Peer_DParam ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_DParam
			:type String
			:location "424:3-424:30"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_DParam
			:type String
			:location "425:3-425:32"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Peer_DParam
			:type String
			:location "426:3-426:28"
		)]
	) ) ( def Peer_Script ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Interface_ExtensibleElement]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_Script
			:type String
			:location "430:3-430:30"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_Script
			:type String
			:location "431:3-431:32"
		) ( struct-map
			KM3_Attribute
			:name "how"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_Script
			:type HowKind
			:location "432:3-432:32"
		) ( struct-map
			KM3_Attribute
			:name "export"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_Script
			:type ExportKind
			:location "433:3-433:38"
		) ( struct-map
			KM3_Attribute
			:name "value"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Peer_Script
			:type String
			:location "434:3-434:28"
		) ( struct-map
			KM3_Attribute
			:name "source"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_Script
			:type String
			:location "436:3-436:34"
		)]
	) ) ( def Peer_Listener ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "class"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_Listener
			:type String
			:location "440:3-440:35"
		) ( struct-map
			KM3_Attribute
			:name "attacher"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Peer_Listener
			:type String
			:location "441:3-441:36"
		)]
	) )]
) )
( def Template ( struct-map
	KM3_Package
	:contents[( def Template_Template ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 0
			:isOrdered false
			:owner Template_Template
			:type String
			:location "460:3-460:30"
		)]
	) ) ( def Template_BehaviorTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Template_Template]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "behavior"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Template_BehaviorTemplate
			:type Interface_Behavior
			:location "464:3-464:43"
			:isContainer true
		)]
	) ) ( def Template_DClassTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Template_Template]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dClass"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Template_DClassTemplate
			:type Peer_DClass
			:location "468:3-468:39"
			:isContainer true
		)]
	) ) ( def Template_DComponentTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Template_Template]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "dComponent"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Template_DComponentTemplate
			:type Peer_DComponent
			:location "472:3-472:47"
			:isContainer true
		)]
	) ) ( def Template_ConstantTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Template_Template]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constant"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Template_ConstantTemplate
			:type Interface_Constant
			:location "476:3-476:43"
			:isContainer true
		)]
	) ) ( def Template_ContentTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Template_Template]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "content"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Template_ContentTemplate
			:type Interface_Content
			:location "480:3-480:41"
			:isContainer true
		)]
	) ) ( def Template_InterfaceTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Template_Template]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "interface"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Template_InterfaceTemplate
			:type Interface_Interface
			:location "484:3-484:45"
			:isContainer true
		)]
	) ) ( def Template_LogicTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Template_Template]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "logic"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Template_LogicTemplate
			:type Peer_Logic
			:location "488:3-488:37"
			:isContainer true
		)]
	) ) ( def Template_PartTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Template_Template]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "part"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Template_PartTemplate
			:type Interface_Part
			:location "492:3-492:35"
			:isContainer true
		)]
	) ) ( def Template_PeerTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Template_Template]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "peer"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Template_PeerTemplate
			:type Peer_Peer
			:location "496:3-496:35"
			:isContainer true
		)]
	) ) ( def Template_PresentationTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Template_Template]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "presentation"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Template_PresentationTemplate
			:type Peer_Presentation
			:location "500:3-500:51"
			:isContainer true
		)]
	) ) ( def Template_PropertyTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Template_Template]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "property"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Template_PropertyTemplate
			:type Interface_Property
			:location "504:3-504:43"
			:isContainer true
		)]
	) ) ( def Template_RestructureTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Template_Template]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "restructure"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Template_RestructureTemplate
			:type Interface_Restructure
			:location "508:3-508:49"
			:isContainer true
		)]
	) ) ( def Template_RuleTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Template_Template]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "rule"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Template_RuleTemplate
			:type Interface_Rule
			:location "512:3-512:35"
			:isContainer true
		)]
	) ) ( def Template_ScriptTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Template_Template]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "script"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Template_ScriptTemplate
			:type Peer_Script
			:location "516:3-516:39"
			:isContainer true
		)]
	) ) ( def Template_StructureTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Template_Template]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "structure"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Template_StructureTemplate
			:type Interface_Structure
			:location "520:3-520:45"
			:isContainer true
		)]
	) ) ( def Template_StyleTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[Template_Template]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "style"
			:upper 1
			:lower 1
			:isOrdered false
			:owner Template_StyleTemplate
			:type Interface_Style
			:location "524:3-524:37"
			:isContainer true
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "529:2-529:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "530:2-530:19"
	) )]
) )
