( declare LQN_LQN )
( declare LQN_Task )
( declare LQN_Processor )
( declare LQN_Entry )
( declare LQN_Phase )
( declare LQN_Activity )
( declare LQN_Link )
( declare LQN_CallPhase )
( declare LQN_Call )
( declare LQN_EntryCall )
( declare LQN_ActivityCall )
( declare LQN_Date )
( declare LQN_SchedulingType )
( declare LQN_PhaseType )
( declare LQN_CallType )
( declare LQN_LinkType )
( declare LQN_TaskType )
( declare PrimitiveTypes_String )
( declare PrimitiveTypes_Boolean )
( declare PrimitiveTypes_Integer )
( def LQN ( struct-map
	KM3_Package
	:contents[( def SchedulingType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "FCFS"
		:location "142:3-142:16"
	) ( struct-map
		KM3_EnumLiteral
		:name "preemptive_Priority"
		:location "143:3-143:31"
	) ( struct-map
		KM3_EnumLiteral
		:name "head_of_line"
		:location "144:3-144:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "random"
		:location "145:3-145:18"
	)] ) ) ( def PhaseType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "stochastic"
		:location "150:3-150:22"
	) ( struct-map
		KM3_EnumLiteral
		:name "deterministic"
		:location "151:3-151:25"
	)] ) ) ( def CallType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "synchronous"
		:location "156:3-156:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "asynchronous"
		:location "157:3-157:24"
	) ( struct-map
		KM3_EnumLiteral
		:name "forwording"
		:location "158:3-158:22"
	)] ) ) ( def LinkType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "and_Fork"
		:location "163:3-163:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "and_join"
		:location "164:3-164:20"
	) ( struct-map
		KM3_EnumLiteral
		:name "basic"
		:location "165:3-165:17"
	) ( struct-map
		KM3_EnumLiteral
		:name "or_Fork"
		:location "166:3-166:19"
	) ( struct-map
		KM3_EnumLiteral
		:name "or_join"
		:location "167:3-167:19"
	)] ) ) ( def TaskType ( :literals[( struct-map
		KM3_EnumLiteral
		:name "a_reference"
		:location "172:3-172:23"
	) ( struct-map
		KM3_EnumLiteral
		:name "non_reference"
		:location "173:3-173:25"
	)] ) ) ( def LQN_LQN ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_LQN
			:type String
			:location "12:3-12:27"
		) ( struct-map
			KM3_Attribute
			:name "comment"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_LQN
			:type String
			:location "13:3-13:30"
		) ( struct-map
			KM3_Attribute
			:name "author"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_LQN
			:type String
			:location "14:3-14:29"
		) ( struct-map
			KM3_Attribute
			:name "created_On"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_LQN
			:type Date
			:location "15:3-15:31"
		) ( struct-map
			KM3_Attribute
			:name "modified_On"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_LQN
			:type Date
			:location "16:3-16:32"
		) ( struct-map
			KM3_Reference
			:name "task"
			:upper -1
			:lower 1
			:isOrdered false
			:owner LQN_LQN
			:type LQN_Task
			:location "18:3-18:56"
			:isContainer true
			:opposite lqn
		) ( struct-map
			KM3_Reference
			:name "processor"
			:upper -1
			:lower 1
			:isOrdered false
			:owner LQN_LQN
			:type LQN_Processor
			:location "19:3-19:66"
			:isContainer true
			:opposite lqn
		)]
	) ) ( def LQN_Task ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Task
			:type String
			:location "25:3-25:27"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Task
			:type TaskType
			:location "26:3-26:29"
		) ( struct-map
			KM3_Attribute
			:name "priority"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Task
			:type Integer
			:location "27:3-27:32"
		) ( struct-map
			KM3_Attribute
			:name "mutliplicity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Task
			:type Integer
			:location "28:3-28:36"
		) ( struct-map
			KM3_Attribute
			:name "replicas"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Task
			:type Integer
			:location "29:3-29:32"
		) ( struct-map
			KM3_Reference
			:name "entry"
			:upper -1
			:lower 1
			:isOrdered false
			:owner LQN_Task
			:type LQN_Entry
			:location "31:3-31:59"
			:isContainer true
			:opposite task
		) ( struct-map
			KM3_Reference
			:name "processor"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Task
			:type LQN_Processor
			:location "32:3-32:51"
			:isContainer false
			:opposite task
		) ( struct-map
			KM3_Reference
			:name "lqn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Task
			:type LQN_LQN
			:location "33:3-33:39"
			:isContainer false
			:opposite task
		) ( struct-map
			KM3_Reference
			:name "activity"
			:upper -1
			:lower 1
			:isOrdered false
			:owner LQN_Task
			:type LQN_Activity
			:location "34:3-34:55"
			:isContainer false
			:opposite task
		)]
	) ) ( def LQN_Processor ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Processor
			:type String
			:location "39:3-39:27"
		) ( struct-map
			KM3_Attribute
			:name "scheduling"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Processor
			:type SchedulingType
			:location "40:3-40:41"
		) ( struct-map
			KM3_Attribute
			:name "mutliplicity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Processor
			:type Integer
			:location "41:3-41:36"
		) ( struct-map
			KM3_Attribute
			:name "replicas"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Processor
			:type Integer
			:location "42:3-42:32"
		) ( struct-map
			KM3_Attribute
			:name "spped"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Processor
			:type Integer
			:location "43:3-43:29"
		) ( struct-map
			KM3_Reference
			:name "task"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Processor
			:type LQN_Task
			:location "45:3-45:46"
			:isContainer false
			:opposite processor
		) ( struct-map
			KM3_Reference
			:name "lqn"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Processor
			:type LQN_LQN
			:location "46:3-46:44"
			:isContainer false
			:opposite processor
		)]
	) ) ( def LQN_Entry ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Entry
			:type String
			:location "51:3-51:27"
		) ( struct-map
			KM3_Attribute
			:name "num_Phase"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Entry
			:type Integer
			:location "52:3-52:33"
		) ( struct-map
			KM3_Attribute
			:name "arrival_Rate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Entry
			:type Integer
			:location "53:3-53:36"
		) ( struct-map
			KM3_Attribute
			:name "contained_In"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Entry
			:type Task
			:location "54:3-54:33"
		) ( struct-map
			KM3_Attribute
			:name "replay_To"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Entry
			:type Entry
			:location "55:3-55:31"
		) ( struct-map
			KM3_Reference
			:name "callreceives"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Entry
			:type LQN_Call
			:location "57:3-57:58"
			:isContainer false
			:opposite entryreceives
		) ( struct-map
			KM3_Reference
			:name "callsends"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Entry
			:type LQN_Call
			:location "58:3-58:52"
			:isContainer false
			:opposite entrysends
		) ( struct-map
			KM3_Reference
			:name "phase"
			:upper -1
			:lower 1
			:isOrdered false
			:owner LQN_Entry
			:type LQN_Phase
			:location "59:3-59:49"
			:isContainer false
			:opposite entry
		) ( struct-map
			KM3_Reference
			:name "activity"
			:upper 1
			:lower 0
			:isOrdered false
			:owner LQN_Entry
			:type LQN_Activity
			:location "60:3-60:65"
			:isContainer true
			:opposite entry
		) ( struct-map
			KM3_Reference
			:name "task"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Entry
			:type LQN_Task
			:location "61:3-61:42"
			:isContainer false
			:opposite entry
		)]
	) ) ( def LQN_Phase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "number"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Phase
			:type Integer
			:location "66:3-66:30"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Phase
			:type PhaseType
			:location "67:3-67:30"
		) ( struct-map
			KM3_Attribute
			:name "think_Time"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Phase
			:type Integer
			:location "68:3-68:34"
		) ( struct-map
			KM3_Attribute
			:name "execution_Demand"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Phase
			:type Integer
			:location "69:3-69:40"
		) ( struct-map
			KM3_Attribute
			:name "COV"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Phase
			:type Integer
			:location "70:3-70:27"
		) ( struct-map
			KM3_Reference
			:name "entry"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Phase
			:type LQN_Entry
			:location "72:3-72:44"
			:isContainer false
			:opposite phase
		) ( struct-map
			KM3_Reference
			:name "activity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Phase
			:type LQN_Activity
			:location "73:3-73:50"
			:isContainer false
			:opposite phase
		)]
	) ) ( def LQN_Activity ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "name"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Activity
			:type String
			:location "78:3-78:27"
		) ( struct-map
			KM3_Attribute
			:name "arrival_Rate"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Activity
			:type Integer
			:location "79:3-79:36"
		) ( struct-map
			KM3_Attribute
			:name "contained_In"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Activity
			:type Task
			:location "80:3-80:33"
		) ( struct-map
			KM3_Attribute
			:name "replay_To"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Activity
			:type Entry
			:location "81:3-81:31"
		) ( struct-map
			KM3_Reference
			:name "linkPrecedes"
			:upper -1
			:lower 1
			:isOrdered false
			:owner LQN_Activity
			:type LQN_Link
			:location "83:3-83:66"
			:isContainer false
			:opposite activityPrecedes
		) ( struct-map
			KM3_Reference
			:name "linkfollows"
			:upper -1
			:lower 1
			:isOrdered false
			:owner LQN_Activity
			:type LQN_Link
			:location "84:3-84:64"
			:isContainer false
			:opposite activityfollows
		) ( struct-map
			KM3_Reference
			:name "call"
			:upper -1
			:lower 0
			:isOrdered false
			:owner LQN_Activity
			:type LQN_Call
			:location "85:3-85:48"
			:isContainer false
			:opposite activity
		) ( struct-map
			KM3_Reference
			:name "phase"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Activity
			:type LQN_Phase
			:location "86:3-86:47"
			:isContainer false
			:opposite activity
		) ( struct-map
			KM3_Reference
			:name "entry"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Activity
			:type LQN_Entry
			:location "87:3-87:47"
			:isContainer false
			:opposite activity
		) ( struct-map
			KM3_Reference
			:name "task"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Activity
			:type LQN_Task
			:location "88:3-88:45"
			:isContainer false
			:opposite activity
		)]
	) ) ( def LQN_Link ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Link
			:type LinkType
			:location "93:3-93:29"
		) ( struct-map
			KM3_Attribute
			:name "mean_Links"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Link
			:type Integer
			:location "94:3-94:34"
		) ( struct-map
			KM3_Attribute
			:name "fromActivity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Link
			:type Activity
			:location "95:3-95:37"
		) ( struct-map
			KM3_Attribute
			:name "toActivity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Link
			:type Activity
			:location "96:3-96:35"
		) ( struct-map
			KM3_Reference
			:name "activityPrecedes"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Link
			:type LQN_Activity
			:location "98:3-98:65"
			:isContainer false
			:opposite linkPrecedes
		) ( struct-map
			KM3_Reference
			:name "activityfollows"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Link
			:type LQN_Activity
			:location "99:3-99:63"
			:isContainer false
			:opposite linkfollows
		)]
	) ) ( def LQN_CallPhase ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "mean_Calls"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_CallPhase
			:type Integer
			:location "104:3-104:34"
		) ( struct-map
			KM3_Attribute
			:name "refers_To"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_CallPhase
			:type Phase
			:location "105:3-105:31"
		) ( struct-map
			KM3_Reference
			:name "call"
			:upper -1
			:lower 1
			:isOrdered false
			:owner LQN_CallPhase
			:type LQN_Call
			:location "107:3-107:51"
			:isContainer false
			:opposite callPhase
		)]
	) ) ( def LQN_Call ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "toEntry"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Call
			:type Entry
			:location "112:3-112:29"
		) ( struct-map
			KM3_Attribute
			:name "num_Phases"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Call
			:type Integer
			:location "113:3-113:34"
		) ( struct-map
			KM3_Attribute
			:name "type"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Call
			:type CallType
			:location "114:3-114:29"
		) ( struct-map
			KM3_Reference
			:name "callPhase"
			:upper -1
			:lower 1
			:isOrdered false
			:owner LQN_Call
			:type LQN_CallPhase
			:location "116:3-116:56"
			:isContainer false
			:opposite call
		) ( struct-map
			KM3_Reference
			:name "activity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Call
			:type LQN_Activity
			:location "117:3-117:49"
			:isContainer false
			:opposite call
		) ( struct-map
			KM3_Reference
			:name "entryreceives"
			:upper 1
			:lower 0
			:isOrdered false
			:owner LQN_Call
			:type LQN_Entry
			:location "118:3-118:64"
			:isContainer false
			:opposite callreceives
		) ( struct-map
			KM3_Reference
			:name "entrysends"
			:upper 1
			:lower 0
			:isOrdered false
			:owner LQN_Call
			:type LQN_Entry
			:location "119:3-119:58"
			:isContainer false
			:opposite callsends
		)]
	) ) ( def LQN_EntryCall ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LQN_Call]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "from_Entry"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_EntryCall
			:type Entry
			:location "125:3-125:32"
		)]
	) ) ( def LQN_ActivityCall ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[LQN_Call]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "fromActivity"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_ActivityCall
			:type Activity
			:location "130:3-130:37"
		)]
	) ) ( def LQN_Date ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Attribute
			:name "day"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Date
			:type String
			:location "135:4-135:27"
		) ( struct-map
			KM3_Attribute
			:name "month"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Date
			:type String
			:location "136:4-136:29"
		) ( struct-map
			KM3_Attribute
			:name "year"
			:upper 1
			:lower 1
			:isOrdered false
			:owner LQN_Date
			:type String
			:location "137:4-137:27"
		)]
	) )]
) )
( def PrimitiveTypes ( struct-map
	KM3_Package
	:contents[( def ptyp_String ( struct-map
		KM3_DataType
		:name "String"
		:location "177:2-177:18"
	) ) ( def ptyp_Boolean ( struct-map
		KM3_DataType
		:name "Boolean"
		:location "178:2-178:19"
	) ) ( def ptyp_Integer ( struct-map
		KM3_DataType
		:name "Integer"
		:location "179:2-179:19"
	) )]
) )
