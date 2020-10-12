( declare ODPCV_EnvironmentContract )
( declare ODPCV_ComputationalTemplate )
( declare ODPCV_ComputationalObject )
( declare ODPCV_BindingObject )
( declare ODPCV_ComputationalObjectTemplate )
( declare ODPCV_ComputationalInterfaceTemplate )
( declare ODPCV_Interface )
( declare ODPCV_Binding )
( declare ODPCV_SignalInterface )
( declare ODPCV_OperationInterface )
( declare ODPCV_StreamInterface )
( declare ODPCV_InterfaceSignature )
( declare ODPCV_SignalInterfaceSignature )
( declare ODPCV_OperationInterfaceSignature )
( declare ODPCV_StreamInterfaceSignature )
( declare ODPCV_InteractionSignature )
( declare ODPCV_Parameter )
( declare ODPCV_AnnouncementSignature )
( declare ODPCV_InterrogationSignature )
( declare ODPCV_TerminationSignature )
( declare ODPCV_SignalSignature )
( declare ODPCV_FlowSignature )
( declare ODPCV_ActionTemplate )
( declare ODPCV_Behaviour )
( declare ODPCV_Action )
( declare ODPCV_State )
( declare ODPCV_InternalAction )
( declare ODPCV_Interaction )
( declare ODPCV_Flow )
( declare ODPCV_Signal )
( declare ODPCV_Operation )
( declare ODPCV_Announcement )
( declare ODPCV_Interrogation )
( declare ODPCV_Invocation )
( declare ODPCV_Termination )
( def ODPCV ( struct-map
	KM3_Package
	:contents[( def ODPCV_EnvironmentContract ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ec_to_a"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPCV_EnvironmentContract
			:type ODPCV_Action
			:location "12:3-12:62"
			:isContainer false
			:opposite constrainer_ec
		) ( struct-map
			KM3_Reference
			:name "specifier_ec"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_EnvironmentContract
			:type ODPCV_ComputationalTemplate
			:location "14:3-14:70"
			:isContainer false
			:opposite ct_to_ec
		)]
	) ) ( def ODPCV_ComputationalTemplate ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ct_to_ec"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_ComputationalTemplate
			:type ODPCV_EnvironmentContract
			:location "19:3-19:68"
			:isContainer false
			:opposite specifier_ec
		) ( struct-map
			KM3_Reference
			:name "ct_to_bh"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPCV_ComputationalTemplate
			:type ODPCV_Behaviour
			:location "21:3-21:64"
			:isContainer false
			:opposite specifier_bh
		)]
	) ) ( def ODPCV_ComputationalObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "co_to_i"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPCV_ComputationalObject
			:type ODPCV_Interface
			:location "26:3-26:58"
			:isContainer false
			:opposite owner_i
		) ( struct-map
			KM3_Reference
			:name "co_to_bh"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_ComputationalObject
			:type ODPCV_Behaviour
			:location "28:3-28:54"
			:isContainer false
			:opposite owner_bh
		) ( struct-map
			KM3_Reference
			:name "specifier_co"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_ComputationalObject
			:type ODPCV_ComputationalObjectTemplate
			:location "30:3-30:77"
			:isContainer false
			:opposite cot_to_co
		) ( struct-map
			KM3_Reference
			:name "co_to_st"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_ComputationalObject
			:type ODPCV_State
			:location "32:3-32:60"
			:isContainer true
			:opposite st_to_co
		)]
	) ) ( def ODPCV_BindingObject ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPCV_ComputationalObject]
		:structuralFeatures[]
	) ) ( def ODPCV_ComputationalObjectTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPCV_ComputationalTemplate]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cot_to_co"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPCV_ComputationalObjectTemplate
			:type ODPCV_ComputationalObject
			:location "40:3-40:74"
			:isContainer false
			:opposite specifier_co
		) ( struct-map
			KM3_Reference
			:name "part_provide"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPCV_ComputationalObjectTemplate
			:type ODPCV_ComputationalInterfaceTemplate
			:location "45:3-45:93"
			:isContainer false
			:opposite aggregate_provide
		) ( struct-map
			KM3_Reference
			:name "part_request"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPCV_ComputationalObjectTemplate
			:type ODPCV_ComputationalInterfaceTemplate
			:location "46:3-46:93"
			:isContainer false
			:opposite aggregate_request
		)]
	) ) ( def ODPCV_ComputationalInterfaceTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPCV_ComputationalTemplate]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "cit_to_i"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPCV_ComputationalInterfaceTemplate
			:type ODPCV_Interface
			:location "51:3-51:62"
			:isContainer false
			:opposite specifier_i
		) ( struct-map
			KM3_Reference
			:name "aggregate_provide"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPCV_ComputationalInterfaceTemplate
			:type ODPCV_ComputationalObjectTemplate
			:location "56:3-56:90"
			:isContainer false
			:opposite part_provide
		) ( struct-map
			KM3_Reference
			:name "aggregate_request"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPCV_ComputationalInterfaceTemplate
			:type ODPCV_ComputationalObjectTemplate
			:location "57:3-57:90"
			:isContainer false
			:opposite part_request
		) ( struct-map
			KM3_Reference
			:name "cit_to_intsig"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_ComputationalInterfaceTemplate
			:type ODPCV_InterfaceSignature
			:location "59:3-59:83"
			:isContainer true
			:opposite intsig_to_cit
		)]
	) ) ( def ODPCV_Interface ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owner_i"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_Interface
			:type ODPCV_ComputationalObject
			:location "64:3-64:62"
			:isContainer false
			:opposite co_to_i
		) ( struct-map
			KM3_Reference
			:name "i_to_bd"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ODPCV_Interface
			:type ODPCV_Binding
			:location "66:3-66:55"
			:isContainer false
			:opposite bd_to_i
		) ( struct-map
			KM3_Reference
			:name "specifier_i"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_Interface
			:type ODPCV_ComputationalInterfaceTemplate
			:location "68:3-68:78"
			:isContainer false
			:opposite cit_to_i
		) ( struct-map
			KM3_Reference
			:name "i_to_ina"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPCV_Interface
			:type ODPCV_Interaction
			:location "70:3-70:72"
			:isContainer true
			:opposite ina_to_i
		)]
	) ) ( def ODPCV_Binding ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "bd_to_i"
			:upper -1
			:lower 2
			:isOrdered false
			:owner ODPCV_Binding
			:type ODPCV_Interface
			:location "75:3-75:57"
			:isContainer false
			:opposite i_to_bd
		)]
	) ) ( def ODPCV_SignalInterface ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPCV_Interface]
		:structuralFeatures[]
	) ) ( def ODPCV_OperationInterface ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPCV_Interface]
		:structuralFeatures[]
	) ) ( def ODPCV_StreamInterface ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPCV_Interface]
		:structuralFeatures[]
	) ) ( def ODPCV_InterfaceSignature ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "intsig_to_cit"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_InterfaceSignature
			:type ODPCV_ComputationalInterfaceTemplate
			:location "89:3-89:85"
			:isContainer false
			:opposite cit_to_intsig
		)]
	) ) ( def ODPCV_SignalInterfaceSignature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPCV_InterfaceSignature]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "sgisig_to_ssig"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ODPCV_SignalInterfaceSignature
			:type ODPCV_SignalSignature
			:location "94:3-94:96"
			:isContainer true
			:opposite ssig_to_sgisig
		)]
	) ) ( def ODPCV_OperationInterfaceSignature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPCV_InterfaceSignature]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "optisig_to_ansig"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ODPCV_OperationInterfaceSignature
			:type ODPCV_AnnouncementSignature
			:location "99:3-99:106"
			:isContainer true
			:opposite ansig_to_optisig
		) ( struct-map
			KM3_Reference
			:name "optisig_to_intsig"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ODPCV_OperationInterfaceSignature
			:type ODPCV_InterrogationSignature
			:location "101:3-101:109"
			:isContainer true
			:opposite intsig_to_optisig
		)]
	) ) ( def ODPCV_StreamInterfaceSignature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPCV_InterfaceSignature]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "strisig_to_fsig"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ODPCV_StreamInterfaceSignature
			:type ODPCV_FlowSignature
			:location "106:3-106:96"
			:isContainer true
			:opposite fsig_to_strisig
		)]
	) ) ( def ODPCV_InteractionSignature ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "isig_to_at"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_InteractionSignature
			:type ODPCV_ActionTemplate
			:location "111:3-111:63"
			:isContainer false
			:opposite at_to_isig
		) ( struct-map
			KM3_Reference
			:name "isig_to_param"
			:upper -1
			:lower 0
			:isOrdered true
			:owner ODPCV_InteractionSignature
			:type ODPCV_Parameter
			:location "113:3-113:88"
			:isContainer true
			:opposite param_to_isig
		)]
	) ) ( def ODPCV_Parameter ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "param_to_isig"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_Parameter
			:type ODPCV_InteractionSignature
			:location "118:3-118:75"
			:isContainer false
			:opposite isig_to_param
		)]
	) ) ( def ODPCV_AnnouncementSignature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPCV_InteractionSignature]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ansig_to_optisig"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_AnnouncementSignature
			:type ODPCV_OperationInterfaceSignature
			:location "123:3-123:88"
			:isContainer false
			:opposite optisig_to_ansig
		)]
	) ) ( def ODPCV_InterrogationSignature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPCV_InteractionSignature]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "intsig_to_optisig"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_InterrogationSignature
			:type ODPCV_OperationInterfaceSignature
			:location "128:3-128:90"
			:isContainer false
			:opposite optisig_to_intsig
		) ( struct-map
			KM3_Reference
			:name "intsig_to_tersig"
			:upper -1
			:lower 1
			:isOrdered true
			:owner ODPCV_InterrogationSignature
			:type ODPCV_TerminationSignature
			:location "130:3-130:105"
			:isContainer true
			:opposite tersig_to_intsig
		)]
	) ) ( def ODPCV_TerminationSignature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPCV_InteractionSignature]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "tersig_to_intsig"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_TerminationSignature
			:type ODPCV_InterrogationSignature
			:location "135:3-135:83"
			:isContainer false
			:opposite intsig_to_tersig
		)]
	) ) ( def ODPCV_SignalSignature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPCV_InteractionSignature]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ssig_to_sgisig"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_SignalSignature
			:type ODPCV_SignalInterfaceSignature
			:location "140:3-140:81"
			:isContainer false
			:opposite sgisig_to_ssig
		)]
	) ) ( def ODPCV_FlowSignature ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPCV_InteractionSignature]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "fsig_to_strisig"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_FlowSignature
			:type ODPCV_StreamInterfaceSignature
			:location "145:3-145:83"
			:isContainer false
			:opposite strisig_to_fsig
		)]
	) ) ( def ODPCV_ActionTemplate ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "at_to_a"
			:upper -1
			:lower 1
			:isOrdered false
			:owner ODPCV_ActionTemplate
			:type ODPCV_Action
			:location "150:3-150:58"
			:isContainer false
			:opposite specifier_a
		) ( struct-map
			KM3_Reference
			:name "at_to_isig"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_ActionTemplate
			:type ODPCV_InteractionSignature
			:location "152:3-152:79"
			:isContainer true
			:opposite isig_to_at
		)]
	) ) ( def ODPCV_Behaviour ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "specifier_bh"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_Behaviour
			:type ODPCV_ComputationalTemplate
			:location "157:3-157:70"
			:isContainer false
			:opposite ct_to_bh
		) ( struct-map
			KM3_Reference
			:name "owner_bh"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_Behaviour
			:type ODPCV_ComputationalObject
			:location "159:3-159:64"
			:isContainer false
			:opposite co_to_bh
		) ( struct-map
			KM3_Reference
			:name "bh_to_a"
			:upper -1
			:lower 1
			:isOrdered true
			:owner ODPCV_Behaviour
			:type ODPCV_Action
			:location "161:3-161:72"
			:isContainer true
			:opposite a_to_bh
		)]
	) ) ( def ODPCV_Action ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "constrainer_ec"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPCV_Action
			:type ODPCV_EnvironmentContract
			:location "166:3-166:75"
			:isContainer false
			:opposite ec_to_a
		) ( struct-map
			KM3_Reference
			:name "changedState"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPCV_Action
			:type ODPCV_State
			:location "168:3-168:58"
			:isContainer false
			:opposite changer
		) ( struct-map
			KM3_Reference
			:name "specifier_a"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_Action
			:type ODPCV_ActionTemplate
			:location "170:3-170:61"
			:isContainer false
			:opposite at_to_a
		) ( struct-map
			KM3_Reference
			:name "a_to_bh"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_Action
			:type ODPCV_Behaviour
			:location "172:3-172:52"
			:isContainer false
			:opposite bh_to_a
		)]
	) ) ( def ODPCV_State ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "startState"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_State
			:type ODPCV_State
			:location "177:3-177:52"
			:isContainer false
			:opposite endState
		) ( struct-map
			KM3_Reference
			:name "endState"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_State
			:type ODPCV_State
			:location "179:3-179:52"
			:isContainer false
			:opposite startState
		) ( struct-map
			KM3_Reference
			:name "changer"
			:upper -1
			:lower 0
			:isOrdered false
			:owner ODPCV_State
			:type ODPCV_Action
			:location "181:3-181:59"
			:isContainer false
			:opposite changedState
		) ( struct-map
			KM3_Reference
			:name "st_to_co"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_State
			:type ODPCV_ComputationalObject
			:location "183:3-183:64"
			:isContainer false
			:opposite co_to_st
		)]
	) ) ( def ODPCV_InternalAction ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPCV_Action]
		:structuralFeatures[]
	) ) ( def ODPCV_Interaction ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ODPCV_Action]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "ina_to_i"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_Interaction
			:type ODPCV_Interface
			:location "191:3-191:54"
			:isContainer false
			:opposite i_to_ina
		)]
	) ) ( def ODPCV_Flow ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPCV_Interaction]
		:structuralFeatures[]
	) ) ( def ODPCV_Signal ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPCV_Interaction]
		:structuralFeatures[]
	) ) ( def ODPCV_Operation ( struct-map
		KM3_Class
		:isAbstract true
		:supertypes[ODPCV_Interaction]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "opt_to_inv"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_Operation
			:type ODPCV_Invocation
			:location "205:3-205:69"
			:isContainer true
			:opposite inv_to_opt
		)]
	) ) ( def ODPCV_Announcement ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPCV_Operation]
		:structuralFeatures[]
	) ) ( def ODPCV_Interrogation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPCV_Operation]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "int_to_ter"
			:upper 1
			:lower 0
			:isOrdered false
			:owner ODPCV_Interrogation
			:type ODPCV_Termination
			:location "213:3-213:64"
			:isContainer false
			:opposite owner_ter
		)]
	) ) ( def ODPCV_Invocation ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPCV_Interaction]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "inv_to_ter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_Invocation
			:type ODPCV_Termination
			:location "218:3-218:60"
			:isContainer false
			:opposite ter_to_inv
		) ( struct-map
			KM3_Reference
			:name "inv_to_opt"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_Invocation
			:type ODPCV_Operation
			:location "220:3-220:58"
			:isContainer false
			:opposite opt_to_inv
		)]
	) ) ( def ODPCV_Termination ( struct-map
		KM3_Class
		:isAbstract false
		:supertypes[ODPCV_Interaction]
		:structuralFeatures[( struct-map
			KM3_Reference
			:name "owner_ter"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_Termination
			:type ODPCV_Interrogation
			:location "225:3-225:61"
			:isContainer false
			:opposite int_to_ter
		) ( struct-map
			KM3_Reference
			:name "ter_to_inv"
			:upper 1
			:lower 1
			:isOrdered false
			:owner ODPCV_Termination
			:type ODPCV_Invocation
			:location "227:3-227:59"
			:isContainer false
			:opposite inv_to_ter
		)]
	) )]
) )
