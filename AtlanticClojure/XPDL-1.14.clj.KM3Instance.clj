( declare XPDL_Element )
( declare XPDL_Package )
( declare XPDL_MessageFlow )
( declare XPDL_Association )
( declare XPDL_Pool )
( declare XPDL_Lane )
( declare XPDL_Participant )
( declare XPDL_Artifact )
( declare XPDL_DataObject )
( declare XPDL_Group )
( declare XPDL_Annotation )
( declare XPDL_TypeDeclaration )
( declare XPDL_Application )
( declare XPDL_ParametrizedApplication )
( declare XPDL_ReferencedApplication )
( declare XPDL_Activity )
( declare XPDL_Task )
( declare XPDL_TaskService )
( declare XPDL_TaskReceive )
( declare XPDL_TaskManual )
( declare XPDL_TaskReference )
( declare XPDL_TaskScript )
( declare XPDL_TaskSend )
( declare XPDL_TaskUser )
( declare XPDL_TaskApplication )
( declare XPDL_Route )
( declare XPDL_SubFlow )
( declare XPDL_BlockActivity )
( declare XPDL_Event )
( declare XPDL_Trigger )
( declare XPDL_ResultCompensation )
( declare XPDL_ResultError )
( declare XPDL_ResultMultiple )
( declare XPDL_TriggerResultLink )
( declare XPDL_TriggerResultMessage )
( declare XPDL_TriggerIntermediateMultiple )
( declare XPDL_TriggerMultiple )
( declare XPDL_TriggerRule )
( declare XPDL_TriggerTimer )
( declare XPDL_StartEvent )
( declare XPDL_IntermediateEvent )
( declare XPDL_EndEvent )
( declare XPDL_Gateway )
( declare XPDL_Process )
( declare XPDL_Transition )
( declare XPDL_ActivitySet )
( declare XPDL_ExternalReference )
( declare XPDL_Object )
( declare XPDL_ExternalPackage )
( declare XPDL_Category )
( declare XPDL_DataField )
( declare XPDL_Script )
( declare DataTypes_AssociationDirectionKind )
( declare DataTypes_OrientationKind )
( declare DataTypes_AccessLevelKind )
( declare DataTypes_ProcessTypeKind )
( declare DataTypes_StatusKind )
( declare DataTypes_AdHocOrderingKind )
( declare DataTypes_ModeKind )
( declare DataTypes_GatewayTypeKind )
( declare DataTypes_ExecutionKind )
( declare DataTypes_TriggerKind )
( declare DataTypes_ImplementationKind )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Integer )
( declare PrimitiveTypes_Boolean )
( def XPDL ( struct-map
	KM3_Package
	:contents[( def XPDL_Element ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "id"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XPDL_Element
			:type String
			:location "12:3-12:25"
		) ( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Element
			:type String
			:location "13:3-13:32"
		)]
	) ) ( def XPDL_Package ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "script"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Package
			:type XPDL_Script
			:location "20:3-20:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "externalPackages"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XPDL_Package
			:type XPDL_ExternalPackage
			:location "21:3-21:61"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "typeDeclarations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XPDL_Package
			:type XPDL_TypeDeclaration
			:location "22:3-22:61"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "participants"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XPDL_Package
			:type XPDL_Participant
			:location "23:3-23:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "applications"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XPDL_Package
			:type XPDL_Application
			:location "24:3-24:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "dataFields"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XPDL_Package
			:type XPDL_DataField
			:location "25:3-25:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "pools"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XPDL_Package
			:type XPDL_Pool
			:location "27:3-27:39"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "messageFlows"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XPDL_Package
			:type XPDL_MessageFlow
			:location "28:3-28:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "associations"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XPDL_Package
			:type XPDL_Association
			:location "29:3-29:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "artifacts"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XPDL_Package
			:type XPDL_Artifact
			:location "30:3-30:47"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "workflowProcesses"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XPDL_Package
			:type XPDL_Process
			:location "31:3-31:54"
			:isContainer true
		)]
	) ) ( def XPDL_MessageFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "targetActivity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_MessageFlow
			:type XPDL_Activity
			:location "36:3-36:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "sourceActivity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_MessageFlow
			:type XPDL_Activity
			:location "37:3-37:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "targetPool"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_MessageFlow
			:type XPDL_Pool
			:location "38:3-38:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "sourcePool"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_MessageFlow
			:type XPDL_Pool
			:location "39:3-39:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "object"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_MessageFlow
			:type XPDL_Object
			:location "40:3-40:44"
			:isContainer true
		)]
	) ) ( def XPDL_Association ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "associationDirection"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Association
			:type AssociationDirectionKind
			:location "45:3-45:66"
		) ( struct-map
			KM3_Reference
			:name "targetArtifact"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Association
			:type XPDL_Artifact
			:location "48:3-48:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "sourceArtifact"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Association
			:type XPDL_Artifact
			:location "49:3-49:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "targetPool"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Association
			:type XPDL_Pool
			:location "50:3-50:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "sourcePool"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Association
			:type XPDL_Pool
			:location "51:3-51:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "targetActivity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Association
			:type XPDL_Activity
			:location "52:3-52:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "sourceActivity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Association
			:type XPDL_Activity
			:location "53:3-53:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "object"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Association
			:type XPDL_Object
			:location "54:3-54:44"
			:isContainer true
		)]
	) ) ( def XPDL_Pool ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "orientation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Pool
			:type OrientationKind
			:location "59:3-59:48"
		) ( struct-map
			KM3_Attribute
			:name "boundaryVisible"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XPDL_Pool
			:type Boolean
			:location "60:3-60:39"
		) ( struct-map
			KM3_Reference
			:name "lanes"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XPDL_Pool
			:type XPDL_Lane
			:location "62:3-62:39"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "object"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Pool
			:type XPDL_Object
			:location "63:3-63:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "participant"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Pool
			:type XPDL_Participant
			:location "65:3-65:44"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "process"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Pool
			:type XPDL_Process
			:location "66:3-66:36"
			:isContainer false
		)]
	) ) ( def XPDL_Lane ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "object"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Lane
			:type XPDL_Object
			:location "70:3-70:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "parentLane"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Lane
			:type XPDL_Lane
			:location "72:3-72:36"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "parentPool"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Lane
			:type XPDL_Pool
			:location "73:3-73:36"
			:isContainer false
		)]
	) ) ( def XPDL_Participant ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Element]
		:structuralFeatures[]
	) ) ( def XPDL_Artifact ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "textAnnotation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Artifact
			:type String
			:location "84:3-84:42"
		) ( struct-map
			KM3_Attribute
			:name "group"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Artifact
			:type String
			:location "85:3-85:33"
		) ( struct-map
			KM3_Reference
			:name "object"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Artifact
			:type XPDL_Object
			:location "87:3-87:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "dataObject"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Artifact
			:type XPDL_DataObject
			:location "88:3-88:52"
			:isContainer true
		)]
	) ) ( def XPDL_DataObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Artifact]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "state"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_DataObject
			:type String
			:location "93:3-93:33"
		) ( struct-map
			KM3_Attribute
			:name "requiredForStart"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XPDL_DataObject
			:type Boolean
			:location "94:3-94:40"
		) ( struct-map
			KM3_Attribute
			:name "producedAtCompletion"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XPDL_DataObject
			:type Boolean
			:location "95:3-95:44"
		) ( struct-map
			KM3_Reference
			:name "dataFields"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XPDL_DataObject
			:type XPDL_DataField
			:location "97:3-97:49"
			:isContainer true
		)]
	) ) ( def XPDL_Group ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Artifact]
		:structuralFeatures[]
	) ) ( def XPDL_Annotation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Artifact]
		:structuralFeatures[]
	) ) ( def XPDL_TypeDeclaration ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Element]
		:structuralFeatures[]
	) ) ( def XPDL_Application ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Element]
		:structuralFeatures[]
	) ) ( def XPDL_ParametrizedApplication ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Application]
		:structuralFeatures[]
	) ) ( def XPDL_ReferencedApplication ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Application]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "externalReference"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_ReferencedApplication
			:type XPDL_ExternalReference
			:location "123:3-123:66"
			:isContainer true
		)]
	) ) ( def XPDL_Activity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isStartActivity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Activity
			:type Boolean
			:location "127:3-127:44"
		) ( struct-map
			KM3_Attribute
			:name "status"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Activity
			:type StatusKind
			:location "128:3-128:38"
		) ( struct-map
			KM3_Attribute
			:name "startMode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XPDL_Activity
			:type ModeKind
			:location "129:3-129:34"
		) ( struct-map
			KM3_Attribute
			:name "finishMode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XPDL_Activity
			:type ModeKind
			:location "130:3-130:35"
		) ( struct-map
			KM3_Attribute
			:name "startQuantity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Activity
			:type Integer
			:location "131:3-131:42"
		) ( struct-map
			KM3_Attribute
			:name "isATransaction"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Activity
			:type Boolean
			:location "132:3-132:43"
		) ( struct-map
			KM3_Reference
			:name "dataFields"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XPDL_Activity
			:type XPDL_DataField
			:location "146:3-146:49"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "object"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Activity
			:type XPDL_Object
			:location "152:3-152:44"
			:isContainer true
		)]
	) ) ( def XPDL_Task ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XPDL_Activity]
		:structuralFeatures[]
	) ) ( def XPDL_TaskService ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Task]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "implementation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_TaskService
			:type ImplementationKind
			:location "160:3-160:54"
		)]
	) ) ( def XPDL_TaskReceive ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Task]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "instantiate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XPDL_TaskReceive
			:type Boolean
			:location "169:3-169:35"
		) ( struct-map
			KM3_Attribute
			:name "implementation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_TaskReceive
			:type ImplementationKind
			:location "170:3-170:54"
		)]
	) ) ( def XPDL_TaskManual ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Task]
		:structuralFeatures[]
	) ) ( def XPDL_TaskReference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Task]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "taskRef"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XPDL_TaskReference
			:type XPDL_Task
			:location "181:3-181:28"
			:isContainer false
		)]
	) ) ( def XPDL_TaskScript ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Task]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "script"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XPDL_TaskScript
			:type XPDL_Script
			:location "185:3-185:39"
			:isContainer true
		)]
	) ) ( def XPDL_TaskSend ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Task]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "implementation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_TaskSend
			:type ImplementationKind
			:location "189:3-189:54"
		)]
	) ) ( def XPDL_TaskUser ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Task]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "implementation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_TaskUser
			:type ImplementationKind
			:location "197:3-197:54"
		)]
	) ) ( def XPDL_TaskApplication ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Task]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "packageRef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_TaskApplication
			:type XPDL_Package
			:location "209:3-209:39"
			:isContainer false
		)]
	) ) ( def XPDL_Route ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Activity]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "gatewayType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Route
			:type GatewayTypeKind
			:location "213:3-213:48"
		) ( struct-map
			KM3_Attribute
			:name "instantiate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Route
			:type Boolean
			:location "214:3-214:40"
		) ( struct-map
			KM3_Attribute
			:name "markerVisiable"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Route
			:type Boolean
			:location "215:3-215:43"
		)]
	) ) ( def XPDL_SubFlow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Activity]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "execution"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_SubFlow
			:type ExecutionKind
			:location "219:3-219:44"
		) ( struct-map
			KM3_Attribute
			:name "instanceDataField"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_SubFlow
			:type String
			:location "220:3-220:45"
		) ( struct-map
			KM3_Reference
			:name "packageRef"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_SubFlow
			:type XPDL_Package
			:location "224:3-224:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "startActivitySet"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_SubFlow
			:type XPDL_ActivitySet
			:location "225:3-225:49"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "startActivity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_SubFlow
			:type XPDL_Activity
			:location "226:3-226:43"
			:isContainer false
		)]
	) ) ( def XPDL_BlockActivity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Activity]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "activitySet"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XPDL_BlockActivity
			:type XPDL_ActivitySet
			:location "230:3-230:39"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "startActivity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_BlockActivity
			:type XPDL_Activity
			:location "231:3-231:43"
			:isContainer false
		)]
	) ) ( def XPDL_Event ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[XPDL_Activity]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "triggerKind"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XPDL_Event
			:type TriggerKind
			:location "235:3-235:39"
		) ( struct-map
			KM3_Attribute
			:name "implementation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Event
			:type ImplementationKind
			:location "236:3-236:54"
		) ( struct-map
			KM3_Reference
			:name "trigger"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Event
			:type XPDL_Trigger
			:location "238:3-238:46"
			:isContainer true
		)]
	) ) ( def XPDL_Trigger ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[]
	) ) ( def XPDL_ResultCompensation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Trigger]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "activity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_ResultCompensation
			:type XPDL_Activity
			:location "245:3-245:38"
			:isContainer false
		)]
	) ) ( def XPDL_ResultError ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Trigger]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "errorCode"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XPDL_ResultError
			:type String
			:location "249:3-249:32"
		)]
	) ) ( def XPDL_ResultMultiple ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Trigger]
		:structuralFeatures[]
	) ) ( def XPDL_TriggerResultLink ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Trigger]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "processRef"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XPDL_TriggerResultLink
			:type XPDL_Process
			:location "261:3-261:34"
			:isContainer false
		)]
	) ) ( def XPDL_TriggerResultMessage ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Trigger]
		:structuralFeatures[]
	) ) ( def XPDL_TriggerIntermediateMultiple ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Trigger]
		:structuralFeatures[]
	) ) ( def XPDL_TriggerMultiple ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Trigger]
		:structuralFeatures[]
	) ) ( def XPDL_TriggerRule ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Trigger]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "ruleName"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XPDL_TriggerRule
			:type String
			:location "286:3-286:31"
		)]
	) ) ( def XPDL_TriggerTimer ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Trigger]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "timeDate"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_TriggerTimer
			:type String
			:location "290:3-290:36"
		) ( struct-map
			KM3_Attribute
			:name "timeCycle"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_TriggerTimer
			:type String
			:location "291:3-291:37"
		)]
	) ) ( def XPDL_StartEvent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Event]
		:structuralFeatures[]
	) ) ( def XPDL_IntermediateEvent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Event]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "target"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_IntermediateEvent
			:type XPDL_Activity
			:location "298:3-298:36"
			:isContainer false
		)]
	) ) ( def XPDL_EndEvent ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Event]
		:structuralFeatures[]
	) ) ( def XPDL_Gateway ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Route]
		:structuralFeatures[]
	) ) ( def XPDL_Process ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "accessLevel"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Process
			:type AccessLevelKind
			:location "308:3-308:48"
		) ( struct-map
			KM3_Attribute
			:name "processType"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Process
			:type ProcessTypeKind
			:location "309:3-309:48"
		) ( struct-map
			KM3_Attribute
			:name "status"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Process
			:type StatusKind
			:location "310:3-310:38"
		) ( struct-map
			KM3_Attribute
			:name "suppressJoinFailure"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Process
			:type Boolean
			:location "311:3-311:48"
		) ( struct-map
			KM3_Attribute
			:name "enableInstanceCompensation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Process
			:type Boolean
			:location "312:3-312:55"
		) ( struct-map
			KM3_Attribute
			:name "adHoc"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Process
			:type Boolean
			:location "313:3-313:34"
		) ( struct-map
			KM3_Attribute
			:name "adHocOrdering"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Process
			:type AdHocOrderingKind
			:location "314:3-314:52"
		) ( struct-map
			KM3_Attribute
			:name "adHocCompletionCondition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Process
			:type String
			:location "315:3-315:52"
		) ( struct-map
			KM3_Reference
			:name "participant"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XPDL_Process
			:type XPDL_Participant
			:location "320:3-320:52"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "applications"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XPDL_Process
			:type XPDL_Application
			:location "321:3-321:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "dataField"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XPDL_Process
			:type XPDL_DataField
			:location "322:3-322:45"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "activitySets"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XPDL_Process
			:type XPDL_ActivitySet
			:location "323:3-323:53"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "activities"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XPDL_Process
			:type XPDL_Activity
			:location "324:3-324:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "transitions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XPDL_Process
			:type XPDL_Transition
			:location "325:3-325:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "object"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Process
			:type XPDL_Object
			:location "329:3-329:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "defaultStartActivitySet"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Process
			:type XPDL_ActivitySet
			:location "330:3-330:56"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "defaultStartActivity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Process
			:type XPDL_Activity
			:location "331:3-331:50"
			:isContainer false
		)]
	) ) ( def XPDL_Transition ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "quantity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Transition
			:type Integer
			:location "335:3-335:37"
		) ( struct-map
			KM3_Reference
			:name "object"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Transition
			:type XPDL_Object
			:location "341:3-341:44"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "to"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XPDL_Transition
			:type XPDL_Activity
			:location "343:3-343:27"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "from"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XPDL_Transition
			:type XPDL_Activity
			:location "344:3-344:29"
			:isContainer false
		)]
	) ) ( def XPDL_ActivitySet ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "adHoc"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_ActivitySet
			:type Boolean
			:location "348:3-348:34"
		) ( struct-map
			KM3_Attribute
			:name "adHocOrdering"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_ActivitySet
			:type AdHocOrderingKind
			:location "349:3-349:52"
		) ( struct-map
			KM3_Attribute
			:name "adHocCompletionCondition"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_ActivitySet
			:type String
			:location "350:3-350:52"
		) ( struct-map
			KM3_Reference
			:name "defaultStartActivity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_ActivitySet
			:type XPDL_Activity
			:location "352:3-352:50"
			:isContainer false
		) ( struct-map
			KM3_Reference
			:name "activities"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XPDL_ActivitySet
			:type XPDL_Activity
			:location "353:3-353:48"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "transitions"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XPDL_ActivitySet
			:type XPDL_Transition
			:location "354:3-354:51"
			:isContainer true
		) ( struct-map
			KM3_Reference
			:name "object"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_ActivitySet
			:type XPDL_Object
			:location "355:3-355:44"
			:isContainer true
		)]
	) ) ( def XPDL_ExternalReference ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "xref"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_ExternalReference
			:type String
			:location "359:3-359:32"
		) ( struct-map
			KM3_Attribute
			:name "location"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XPDL_ExternalReference
			:type String
			:location "360:3-360:31"
		) ( struct-map
			KM3_Attribute
			:name "namespace"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_ExternalReference
			:type String
			:location "361:3-361:37"
		)]
	) ) ( def XPDL_Object ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Element]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "categories"
			:upper -1
			:lower 0
			:isOrdered false
			:owner XPDL_Object
			:type XPDL_Category
			:location "365:3-365:48"
			:isContainer true
		)]
	) ) ( def XPDL_ExternalPackage ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "href"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XPDL_ExternalPackage
			:type String
			:location "370:3-370:27"
		)]
	) ) ( def XPDL_Category ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Element]
		:structuralFeatures[]
	) ) ( def XPDL_DataField ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[XPDL_Element]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "isArray"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_DataField
			:type Boolean
			:location "377:3-377:36"
		) ( struct-map
			KM3_Attribute
			:name "correlation"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_DataField
			:type Boolean
			:location "378:3-378:40"
		) ( struct-map
			KM3_Reference
			:name "dataType"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XPDL_DataField
			:type XPDL_TypeDeclaration
			:location "380:3-380:50"
			:isContainer true
		)]
	) ) ( def XPDL_Script ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner XPDL_Script
			:type String
			:location "388:3-388:27"
		) ( struct-map
			KM3_Attribute
			:name "version"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Script
			:type String
			:location "389:3-389:35"
		) ( struct-map
			KM3_Attribute
			:name "grammar"
			:upper 1
			:lower 0
			:isOrdered false
			:owner XPDL_Script
			:type String
			:location "390:3-390:35"
		)]
	) )]
) )
( def DataTypes ( struct-map
	KM3_Package
	:contents[( def AssociationDirectionKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "None"
		:location "396:3-396:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "To"
		:location "397:3-397:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "From"
		:location "398:3-398:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "Both"
		:location "399:3-399:16"
	)] ) ) ( def OrientationKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Horizontal"
		:location "403:3-403:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "Vertical"
		:location "404:3-404:20"
	)] ) ) ( def AccessLevelKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Public"
		:location "408:3-408:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "Private"
		:location "409:3-409:19"
	)] ) ) ( def ProcessTypeKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "None"
		:location "413:3-413:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "Private"
		:location "414:3-414:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "Abstract"
		:location "415:3-415:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "Collaboration"
		:location "416:3-416:25"
	)] ) ) ( def StatusKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "None"
		:location "420:3-420:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "Ready"
		:location "421:3-421:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "Active"
		:location "422:3-422:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "Cancelled"
		:location "423:3-423:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "Aborting"
		:location "424:3-424:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "Aborted"
		:location "425:3-425:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "Completing"
		:location "426:3-426:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "Completed"
		:location "427:3-427:21"
	)] ) ) ( def AdHocOrderingKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Sequential"
		:location "431:3-431:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "Parallel"
		:location "432:3-432:20"
	)] ) ) ( def ModeKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Automatic"
		:location "436:3-436:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "Manual"
		:location "437:3-437:18"
	)] ) ) ( def GatewayTypeKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Xor"
		:location "441:3-441:15"
	) ( struct-map
		KM3_EnumLiteral
		:name "Or"
		:location "442:3-442:14"
	) ( struct-map
		KM3_EnumLiteral
		:name "Complex"
		:location "443:3-443:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "And"
		:location "444:3-444:15"
	)] ) ) ( def ExecutionKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "Asynchr"
		:location "448:3-448:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "Synchr"
		:location "449:3-449:18"
	)] ) ) ( def TriggerKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "None"
		:location "453:3-453:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "Message"
		:location "454:3-454:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "Timer"
		:location "455:3-455:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "Rule"
		:location "456:3-456:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "Link"
		:location "457:3-457:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "Error"
		:location "458:3-458:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "Cancel"
		:location "459:3-459:18"
	) ( struct-map
		KM3_EnumLiteral
		:name "Compensation"
		:location "460:3-460:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "Terminate"
		:location "461:3-461:21"
	) ( struct-map
		KM3_EnumLiteral
		:name "Multiple"
		:location "462:3-462:20"
	)] ) ) ( def ImplementationKind ( :literals[( struct-map
		KM3_EnumLiteral
		:name "WebService"
		:location "466:3-466:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "Other"
		:location "467:3-467:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "Unspecified"
		:location "468:3-468:23"
	)] ) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "473:2-473:18"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "474:2-474:19"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "475:2-475:19"
	) )]
) )
