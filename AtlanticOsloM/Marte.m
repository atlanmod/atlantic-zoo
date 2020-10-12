module MetamodelRoot {

	type @[MARTE.MARTE_Foundations.NFPs.ConstraintKind] {"required", "offered", "constraint"};

	type @[MARTE.MARTE_Foundations.NFPs.NFP] {
		Base_Property_Ref : @[Uml.Property];
	};

	type @[MARTE.MARTE_Foundations.NFPs.Unit] {
		ConvFactor_Att : Logical;
		ConvOffset_Att : Logical;
		BaseUnit_Ref : @[MARTE.MARTE_Foundations.NFPs.Unit]?;
		Base_EnumerationLiteral_Ref : @[Uml.EnumerationLiteral];
	};

	type @[MARTE.MARTE_Foundations.NFPs.NfpConstraint] {
		Kind_Att : @[MARTE.MARTE_Foundations.NFPs.ConstraintKind]?;
		Base_Constraint_Ref : @[Uml.Constraint];
	};

	type @[MARTE.MARTE_Foundations.NFPs.NfpType] : @[MARTE.MARTE_Annexes.VSL.DataTypes.TupleType] {
		ValueAttrib_Ref : @[Uml.Property]?;
		UnitAttrib_Ref : @[Uml.Property]?;
		ExprAttrib_Ref : @[Uml.Property]?;
	};

	type @[MARTE.MARTE_Foundations.Alloc.Allocated] {
		Base_NamedElement_Ref : @[Uml.NamedElement];
	};

	type @[MARTE.MARTE_Foundations.Alloc.ApplicationAllocationEnd] : @[MARTE.MARTE_Foundations.Alloc.Allocated] {
		AllocatedTo_Ref : @[MARTE.MARTE_Foundations.Alloc.ExecutionPlatformAllocationEnd]*;
	};

	type @[MARTE.MARTE_Foundations.Alloc.ExecutionPlatformAllocationEnd] : @[MARTE.MARTE_Foundations.Alloc.Allocated] {
		AllocatedFrom_Ref : @[MARTE.MARTE_Foundations.Alloc.ApplicationAllocationEnd]*;
	};

	type @[MARTE.MARTE_Foundations.Alloc.AllocationNature] {"spatialDistribution", "timeScheduling"};

	type @[MARTE.MARTE_Foundations.Alloc.AllocationKind] {"structural", "behavioral", "hybrid"};

	type @[MARTE.MARTE_Foundations.Alloc.AllocateActivityGroup] {
		IsUnique_Att : Logical;
		Base_ActivityPartition_Ref : @[Uml.ActivityPartition];
	};

	type @[MARTE.MARTE_Foundations.Alloc.ClockRefine] {
		Base_Dependency_Ref : @[Uml.Dependency];
		Constraint_ContRef : @[MARTE.MARTE_Foundations.Time.ClockConstraint]*;
	};

	type @[MARTE.MARTE_Foundations.Alloc.Allocate] {
		Kind_Att : @[MARTE.MARTE_Foundations.Alloc.AllocationKind]?;
		Nature_Att : @[MARTE.MARTE_Foundations.Alloc.AllocationNature]?;
		Base_Abstraction_Ref : @[Uml.Abstraction];
		ImpliedConstraint_ContRef : @[MARTE.MARTE_Foundations.NFPs.NfpConstraint]*;
	};

	type @[MARTE.MARTE_Foundations.Time.TimedDomain] {
		Base_Package_Ref : @[Uml.Package];
	};

	type @[MARTE.MARTE_Foundations.Time.Clock] {
		Standard_Att : @[MARTE_Library.TimeLibrary.TimeStandardKind]?;
		Base_InstanceSpecification_Ref : @[Uml.InstanceSpecification];
		Type_Ref : @[MARTE.MARTE_Foundations.Time.ClockType]?;
		Unit_ContRef : @[MARTE.MARTE_Foundations.NFPs.Unit]?;
	};

	type @[MARTE.MARTE_Foundations.Time.ClockType] {
		Nature_Att : @[MARTE_Library.TimeTypesLibrary.TimeNatureKind];
		UnitType_Ref : @[Uml.Enumeration]?;
		IsLogical_Att : Logical;
		ResolAttrib_Ref : @[Uml.Property]?;
		MaxValAttrib_Ref : @[Uml.Property]?;
		OffsetAttrib_Ref : @[Uml.Property]?;
		GetTime_Ref : @[Uml.Operation]?;
		SetTime_Ref : @[Uml.Operation]?;
		IndexToValue_Ref : @[Uml.Operation]?;
		Base_Class_Ref : @[Uml.Class];
	};

	type @[MARTE.MARTE_Foundations.Time.TimedElement] {
		On_ContRef : @[MARTE.MARTE_Foundations.Time.Clock]+;
	};

	type @[MARTE.MARTE_Foundations.Time.TimedValueSpecification] : @[MARTE.MARTE_Foundations.Time.TimedElement] {
		Interpretation_Att : @[MARTE_Library.TimeTypesLibrary.TimeInterpretationKind]?;
		Base_ValueSpecification_Ref : @[Uml.ValueSpecification];
	};

	type @[MARTE.MARTE_Foundations.Time.TimedConstraint] : @[MARTE.MARTE_Foundations.NFPs.NfpConstraint], @[MARTE.MARTE_Foundations.Time.TimedElement] {
		Interpretation_Att : @[MARTE_Library.TimeTypesLibrary.TimeInterpretationKind]?;
	};

	type @[MARTE.MARTE_Foundations.Time.TimedObservation] : @[MARTE.MARTE_Foundations.Time.TimedElement];

	type @[MARTE.MARTE_Foundations.Time.TimedInstantObservation] : @[MARTE.MARTE_Foundations.Time.TimedObservation] {
		ObsKind_Att : @[MARTE_Library.TimeLibrary.EventKind]?;
		Base_TimeObservation_Ref : @[Uml.TimeObservation];
	};

	type @[MARTE.MARTE_Foundations.Time.TimedDurationObservation] : @[MARTE.MARTE_Foundations.Time.TimedObservation] {
		ObsKind_Att : @[MARTE_Library.TimeLibrary.EventKind]#0 .. 2;
		Base_DurationObservation_Ref : @[Uml.DurationObservation];
	};

	type @[MARTE.MARTE_Foundations.Time.TimedEvent] : @[MARTE.MARTE_Foundations.Time.TimedElement] {
		Repetition_Att : Integer32;
		Base_TimeEvent_Ref : @[Uml.TimeEvent];
		Every_Ref : @[Uml.ValueSpecification]?;
	};

	type @[MARTE.MARTE_Foundations.Time.TimedProcessing] : @[MARTE.MARTE_Foundations.Time.TimedElement] {
		Base_Action_Ref : @[Uml.Action];
		Base_Behavior_Ref : @[Uml.Behavior];
		Base_Message_Ref : @[Uml.Message];
		Duration_ContRef : @[Uml.ValueSpecification]?;
		Start_Ref : @[Uml.Event]?;
		Stop_Ref : @[Uml.Event]?;
	};

	type @[MARTE.MARTE_Foundations.Time.ClockConstraint] : @[MARTE.MARTE_Foundations.NFPs.NfpConstraint], @[MARTE.MARTE_Foundations.Time.TimedElement];

	type @[MARTE.MARTE_Foundations.GRM.Resource] {
		ResMult_Att : Integer32;
		IsProtected_Att : Logical;
		IsActive_Att : Logical;
		Base_Property_Ref : @[Uml.Property];
		Base_InstanceSpecification_Ref : @[Uml.InstanceSpecification];
		Base_Classifier_Ref : @[Uml.Classifier];
		Base_Lifeline_Ref : @[Uml.Lifeline];
		Base_ConnectableElement_Ref : @[Uml.ConnectableElement];
	};

	type @[MARTE.MARTE_Foundations.GRM.StorageResource] : @[MARTE.MARTE_Foundations.GRM.Resource] {
		ElementSize_Att : Integer32;
	};

	type @[MARTE.MARTE_Foundations.GRM.CommunicationEndPoint] : @[MARTE.MARTE_Foundations.GRM.Resource] {
		PacketSize_Att : Integer32;
	};

	type @[MARTE.MARTE_Foundations.GRM.SynchronizationResource] : @[MARTE.MARTE_Foundations.GRM.Resource];

	type @[MARTE.MARTE_Foundations.GRM.ConcurrencyResource] : @[MARTE.MARTE_Foundations.GRM.Resource];

	type @[MARTE.MARTE_Foundations.GRM.Scheduler] : @[MARTE.MARTE_Foundations.GRM.Resource] {
		IsPreemptible_Att : Logical;
		SchedPolicy_Att : @[MARTE_Library.GRM_BasicTypes.SchedPolicyKind]?;
		OtherSchedPolicy_Att : Text;
		Schedule_Ref : @[Uml.OpaqueExpression]?;
		ProcessingUnit_Ref : @[MARTE.MARTE_Foundations.GRM.ProcessingResource]*;
		Host_Ref : @[MARTE.MARTE_Foundations.GRM.ComputingResource]?;
	};

	type @[MARTE.MARTE_Foundations.GRM.ProcessingResource] : @[MARTE.MARTE_Foundations.GRM.Resource] {
		SpeedFactor_Att : Logical;
		Scheduler_Ref : @[MARTE.MARTE_Foundations.GRM.Scheduler]?;
	};

	type @[MARTE.MARTE_Foundations.GRM.ComputingResource] : @[MARTE.MARTE_Foundations.GRM.ProcessingResource];

	type @[MARTE.MARTE_Foundations.GRM.MutualExclusionResource] : @[MARTE.MARTE_Foundations.GRM.Resource] {
		ProtectKind_Att : @[MARTE_Library.GRM_BasicTypes.ProtectProtocolKind]?;
		Ceiling_Att : Integer32;
		OtherProtectProtocol_Att : Text;
	};

	type @[MARTE.MARTE_Foundations.GRM.SecondaryScheduler] : @[MARTE.MARTE_Foundations.GRM.Scheduler];

	type @[MARTE.MARTE_Foundations.GRM.SchedulableResource] : @[MARTE.MARTE_Foundations.GRM.Resource] {
		SchedParams_Ref : @[MARTE_Library.GRM_BasicTypes.SchedParameters]*;
	};

	type @[MARTE.MARTE_Foundations.GRM.CommunicationMedia] : @[MARTE.MARTE_Foundations.GRM.ProcessingResource] {
		ElementSize_Att : Integer32;
		Base_Connector_Ref : @[Uml.Connector];
	};

	type @[MARTE.MARTE_Foundations.GRM.DeviceResource] : @[MARTE.MARTE_Foundations.GRM.ProcessingResource];

	type @[MARTE.MARTE_Foundations.GRM.TimingResource] : @[MARTE.MARTE_Foundations.Time.ClockType], @[MARTE.MARTE_Foundations.GRM.Resource];

	type @[MARTE.MARTE_Foundations.GRM.ClockResource] : @[MARTE.MARTE_Foundations.GRM.TimingResource];

	type @[MARTE.MARTE_Foundations.GRM.TimerResource] : @[MARTE.MARTE_Foundations.GRM.TimingResource] {
		Duration_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		IsPeriodic_Att : Logical;
	};

	type @[MARTE.MARTE_Foundations.GRM.GRService] {
		Owner_Ref : @[MARTE.MARTE_Foundations.GRM.Resource]?;
		Base_ExecutionSpecification_Ref : @[Uml.ExecutionSpecification];
		Base_BehavioralFeature_Ref : @[Uml.BehavioralFeature];
		Base_Behavior_Ref : @[Uml.Behavior];
		Base_Collaboration_Ref : @[Uml.Collaboration];
		Base_CollaborationUse_Ref : @[Uml.CollaborationUse];
	};

	type @[MARTE.MARTE_Foundations.GRM.Release] : @[MARTE.MARTE_Foundations.GRM.GRService];

	type @[MARTE.MARTE_Foundations.GRM.Acquire] : @[MARTE.MARTE_Foundations.GRM.GRService] {
		IsBlocking_Att : Logical;
	};

	type @[MARTE.MARTE_Foundations.GRM.ResourceUsage] {
		ExecTime_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]*;
		MsgSize_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataSize]*;
		AllocatedMemory_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataSize]*;
		UsedMemory_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataSize]*;
		PowerPeak_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Power]*;
		Energy_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Energy]*;
		Base_NamedElement_Ref : @[Uml.NamedElement];
		UsedResources_ContRef : @[MARTE.MARTE_Foundations.GRM.Resource]*;
		SubUsage_ContRef : @[MARTE.MARTE_Foundations.GRM.ResourceUsage]*;
	};

	type @[MARTE.MARTE_Foundations.GCM.FlowProperty] {
		Direction_Att : @[MARTE.MARTE_Foundations.GCM.DirectionKind];
		Base_Property_Ref : @[Uml.Property];
	};

	type @[MARTE.MARTE_Foundations.GCM.DirectionKind] {"in", "out", "inout"};

	type @[MARTE.MARTE_Foundations.GCM.FlowPort] {
		IsAtomic_Att : Logical;
		IsConjugated_Att : Logical;
		Direction_Att : @[MARTE.MARTE_Foundations.GCM.DirectionKind]?;
		Base_Port_Ref : @[Uml.Port];
	};

	type @[MARTE.MARTE_Foundations.GCM.MessagePort] {
		Base_Port_Ref : @[Uml.Port];
		IsAtomic_Att : Logical;
		IsConjugated_Att : Logical;
		Direction_Att : @[MARTE.MARTE_Foundations.GCM.DirectionKind]?;
	};

	type @[MARTE.MARTE_Foundations.GCM.SendFlowAction] {
		Base_InvocationAction_Ref : @[Uml.InvocationAction];
	};

	type @[MARTE.MARTE_Foundations.GCM.FlowSpecification] {
		Direction_Att : @[MARTE.MARTE_Foundations.GCM.DirectionKind]?;
		Base_Interface_Ref : @[Uml.Interface];
	};

	type @[MARTE.MARTE_Foundations.GCM.SignalSpecification] {
		Kind_Att : @[MARTE.MARTE_Foundations.GCM.BFeatureKind]?;
		Base_Interface_Ref : @[Uml.Interface];
	};

	type @[MARTE.MARTE_Foundations.GCM.BFeatureKind] {"in", "out", "inout", "required", "provided", "reqpro"};

	type @[MARTE.MARTE_Foundations.GCM.FlowBFeature] {
		Kind_Att : @[MARTE.MARTE_Foundations.GCM.BFeatureKind];
		Base_BehavioralFeature_Ref : @[Uml.BehavioralFeature];
	};

	type @[MARTE.MARTE_Annexes.RSM.LinkTopology] {
		Base_Connector_Ref : @[Uml.Connector];
	};

	type @[MARTE.MARTE_Annexes.RSM.DefaultLink] : @[MARTE.MARTE_Annexes.RSM.LinkTopology];

	type @[MARTE.MARTE_Annexes.RSM.InterRepetition] : @[MARTE.MARTE_Annexes.RSM.LinkTopology] {
		RepetitionShapeDependence_Ref : @[MARTE_Library.MARTE_DataTypes.IntegerVector];
		IsModulo_Att : Logical;
	};

	type @[MARTE.MARTE_Annexes.RSM.Distribute] : @[MARTE.MARTE_Foundations.Alloc.Allocate] {
		PatternShape_Ref : @[MARTE_Library.RS_Library.ShapeSpecification];
		RepetitionSpace_Ref : @[MARTE_Library.RS_Library.ShapeSpecification];
		FromTiler_Ref : @[MARTE_Library.RS_Library.TilerSpecification];
		ToTiler_Ref : @[MARTE_Library.RS_Library.TilerSpecification];
	};

	type @[MARTE.MARTE_Annexes.RSM.Reshape] : @[MARTE.MARTE_Annexes.RSM.LinkTopology] {
		PatternShape_Ref : @[MARTE_Library.RS_Library.ShapeSpecification];
		RepetitonShape_Ref : @[MARTE_Library.RS_Library.ShapeSpecification];
		SrcTiler_ContRef : @[MARTE.MARTE_Annexes.RSM.Tiler];
		TargetTiler_ContRef : @[MARTE.MARTE_Annexes.RSM.Tiler];
	};

	type @[MARTE.MARTE_Annexes.RSM.Tiler] : @[MARTE.MARTE_Annexes.RSM.LinkTopology] {
		Origin_Ref : @[MARTE_Library.MARTE_DataTypes.IntegerVector]?;
		Paving_Ref : @[MARTE_Library.MARTE_DataTypes.IntegerMatrix]?;
		Fitting_Ref : @[MARTE_Library.MARTE_DataTypes.IntegerMatrix]?;
		Tiler_Ref : @[MARTE_Library.RS_Library.TilerSpecification]?;
	};

	type @[MARTE.MARTE_Annexes.VSL.Variables.VariableDirectionKind] {"in", "out", "inout"};

	type @[MARTE.MARTE_Annexes.VSL.Variables.Var] {
		Dir_Att : @[MARTE.MARTE_Annexes.VSL.Variables.VariableDirectionKind]?;
		Base_Property_Ref : @[Uml.Property];
	};

	type @[MARTE.MARTE_Annexes.VSL.Variables.ExpressionContext] {
		Base_NamedElement_Ref : @[Uml.NamedElement];
	};

	type @[MARTE.MARTE_Annexes.VSL.DataTypes.BoundedSubtype] {
		BaseType_Ref : @[Uml.DataType];
		MinValue_Att : Text;
		MaxValue_Att : Text;
		IsMinOpen_Att : Logical;
		IsMaxOpen_Att : Logical;
		Base_DataType_Ref : @[Uml.DataType];
	};

	type @[MARTE.MARTE_Annexes.VSL.DataTypes.IntervalType] {
		IntervalAttrib_Ref : @[Uml.Property];
		Base_DataType_Ref : @[Uml.DataType];
	};

	type @[MARTE.MARTE_Annexes.VSL.DataTypes.CollectionType] {
		CollectionAttrib_Ref : @[Uml.Property];
		Base_DataType_Ref : @[Uml.DataType];
	};

	type @[MARTE.MARTE_Annexes.VSL.DataTypes.ChoiceType] {
		ChoiceAttrib_Ref : @[Uml.Property]*;
		DefaultAttrib_Ref : @[Uml.Property]?;
		Base_DataType_Ref : @[Uml.DataType];
	};

	type @[MARTE.MARTE_Annexes.VSL.DataTypes.TupleType] {
		TupleAttrib_Ref : @[Uml.Property]*;
		Base_DataType_Ref : @[Uml.DataType];
	};

	type @[MARTE.MARTE_DesignModel.RTEMoCC.RtUnit] {
		IsDynamic_Att : Logical;
		IsMain_Att : Logical;
		PoolSize_Att : Integer32;
		PoolPolicy_Att : @[MARTE.MARTE_DesignModel.RTEMoCC.PoolMgtPolicyKind]?;
		PoolWaitingTime_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		OperationalMode_Ref : @[Uml.Behavior]?;
		Main_Ref : @[Uml.Operation]?;
		MemorySize_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataSize]?;
		Base_BehavioredClassifier_Ref : @[Uml.BehavioredClassifier];
	};

	type @[MARTE.MARTE_DesignModel.RTEMoCC.PoolMgtPolicyKind] {"infiniteWait", "timedWait", "dynamic", "exception", "other"};

	type @[MARTE.MARTE_DesignModel.RTEMoCC.PpUnit] {
		ConcPolicy_Att : @[MARTE.MARTE_DesignModel.RTEMoCC.CallConcurrencyKind]?;
		MemorySize_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataSize]?;
		Base_BehavioredClassifier_Ref : @[Uml.BehavioredClassifier];
	};

	type @[MARTE.MARTE_DesignModel.RTEMoCC.CallConcurrencyKind] {"sequential", "guarded", "concurrent"};

	type @[MARTE.MARTE_DesignModel.RTEMoCC.RtBehavior] {
		QueueSchedPolicy_Att : @[MARTE_Library.GRM_BasicTypes.SchedPolicyKind]?;
		QueueSize_Att : Integer32;
		MsgMaxSize_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataSize]?;
		Base_Behavior_Ref : @[Uml.Behavior];
	};

	type @[MARTE.MARTE_DesignModel.RTEMoCC.Rtf] {
		Base_BehavioralFeature_Ref : @[Uml.BehavioralFeature];
		Base_Action_Ref : @[Uml.Action];
		Base_Message_Ref : @[Uml.Message];
		Base_Signal_Ref : @[Uml.Signal];
		Utility_Ref : @[MARTE_Library.MARTE_DataTypes.UtilityType]?;
		OccKind_Ref : @[MARTE_Library.BasicNFP_Types.ArrivalPattern]?;
		TRef_Ref : @[MARTE.MARTE_Foundations.Time.TimedInstantObservation]?;
		RelDl_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		AbsDl_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DateTime]?;
		BoundDl_Ref : @[MARTE_Library.BasicNFP_Types.NFP_BoundedDuration]?;
		RdTime_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		Miss_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Percentage]?;
		Priority_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Integer]?;
	};

	type @[MARTE.MARTE_DesignModel.RTEMoCC.SynchronizationKind] {"synchronous", "asynchronous", "delayedSynchronous", "rendezVous", "other"};

	type @[MARTE.MARTE_DesignModel.RTEMoCC.RtAction] {
		IsAtomic_Att : Logical;
		SynchKind_Att : @[MARTE.MARTE_DesignModel.RTEMoCC.SynchronizationKind]?;
		MsgSize_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataSize]?;
		Base_BehavioralFeature_Ref : @[Uml.BehavioralFeature];
		Base_InvocationAction_Ref : @[Uml.InvocationAction];
	};

	type @[MARTE.MARTE_DesignModel.RTEMoCC.ExecutionKind] {"deferred", "remoteImmediate", "localImmediate"};

	type @[MARTE.MARTE_DesignModel.RTEMoCC.ConcurrencyKind] {"reader", "writer", "parallel"};

	type @[MARTE.MARTE_DesignModel.RTEMoCC.RtService] {
		ConcPolicy_Att : @[MARTE.MARTE_DesignModel.RTEMoCC.ConcurrencyKind]?;
		ExeKind_Att : @[MARTE.MARTE_DesignModel.RTEMoCC.ExecutionKind]?;
		IsAtomic_Att : Logical;
		SynchKind_Att : @[MARTE.MARTE_DesignModel.RTEMoCC.SynchronizationKind]?;
		Base_BehavioralFeature_Ref : @[Uml.BehavioralFeature];
	};

	type @[MARTE.MARTE_DesignModel.RTEMoCC.RteConnector] {
		Bandwidth_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataTxRate]?;
		PacketT_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		BlockT_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		TransmMode_Att : @[MARTE_Library.MARTE_DataTypes.TransmModeKind]?;
		Base_Connector_Ref : @[Uml.Connector];
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwGeneral.HwResource] : @[MARTE.MARTE_Foundations.GRM.Resource] {
		Description_Ref : @[MARTE_Library.BasicNFP_Types.NFP_String]?;
		P_HW_Services_ContRef : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwGeneral.HwResourceService]*;
		R_HW_Services_ContRef : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwGeneral.HwResourceService]*;
		OwnedHW_Ref : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwGeneral.HwResource]*;
		EndPoints_Ref : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwEndPoint]*;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwGeneral.HwResourceService] : @[MARTE.MARTE_Foundations.GRM.GRService];

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationResource] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwGeneral.HwResource];

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwArbiter] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationResource] {
		ControlledMedias_Ref : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia]*;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationResource], @[MARTE.MARTE_Foundations.GRM.CommunicationMedia] {
		BandWidth_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataTxRate]?;
		Base_Association_Ref : @[Uml.Association];
		Arbiters_Ref : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwArbiter]*;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBus] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia] {
		AdressWidth_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataSize]?;
		WordWidth_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataSize]?;
		IsSynchronous_Att : Logical;
		IsSerial_Att : Logical;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwBridge] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia] {
		Sides_Ref : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia]*;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwEndPoint] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationResource], @[MARTE.MARTE_Foundations.GRM.CommunicationEndPoint] {
		Base_Port_Ref : @[Uml.Port];
		ConnectedTo_Ref : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwMedia]*;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.ISA_Type] {"RISC", "CISC", "VLIW", "SIMD", "Other", "Undef"};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Technology] {"SRAM", "Antifuse", "Flash", "Other", "Undef"};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Class] {"SymetricalArray", "RowBased", "SeaOfGates", "HierarchicalPLD", "Other", "Undef"};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Organization] {
		NbRows_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Integer]?;
		NbColumns_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]?;
		Class_Att : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Class]?;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingResource] {
		Architecture_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataSize]?;
		Mips_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]?;
		Ipc_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real]?;
		NbCores_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]?;
		NbPipelines_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]?;
		NbStages_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]?;
		NbALUs_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]?;
		NbFBUs_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]?;
		OwnedISAs_ContRef : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA]*;
		Predictors_ContRef : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwBranchPredictor]*;
		Caches_ContRef : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.HWCache]*;
		OwnedMMUs_ContRef : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorageManager.HwMMU]*;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingResource] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwGeneral.HwResource], @[MARTE.MARTE_Foundations.GRM.ComputingResource] {
		Op_Frequencies_Ref : @[MARTE_Library.MARTE_DataTypes.NFP_FrequencyInterval]?;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwGeneral.HwResource] {
		Family_Ref : @[MARTE_Library.BasicNFP_Types.NFP_String]?;
		Inst_Width_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataSize]?;
		Type_Att : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.ISA_Type]?;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwBranchPredictor] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwGeneral.HwResource];

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwASIC] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingResource];

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwPLD] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingResource] {
		Technology_Att : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Technology]?;
		Organization_Ref : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Organization]?;
		NbLUTs_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]?;
		NdLUT_Inputs_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]?;
		NbFlipFlops_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]?;
		BlocksRAM_ContRef : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.HwRAM]*;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.HwMemory] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor], @[MARTE.MARTE_Foundations.GRM.StorageResource] {
		MemorySize_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataSize]?;
		AdressSize_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataSize]?;
		Timings_Ref : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.Timing]*;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.Timing] {
		Notation_Ref : @[MARTE_Library.BasicNFP_Types.NFP_String]?;
		Description_Ref : @[MARTE_Library.BasicNFP_Types.NFP_String]?;
		Value_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.Repl_Policy] {"LRU", "NFU", "FIFO", "Random", "Other", "Undef"};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.WritePolicy] {"WriteBack", "WriteThrough", "Other", "Undef"};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.CacheType] {"Data", "Instruction", "Unified", "Other", "Undef"};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.ROM_Type] {"MaskedROM", "EPROM", "OTP_EPROM", "EEPROM", "Flash", "Other", "Undef"};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.CacheStructure] {
		NsSets_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]?;
		BlockSize_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]?;
		Associativity_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]?;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.MemoryOrganization] {
		NbRows_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]?;
		NbColumns_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]?;
		NbBanks_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]?;
		WordSize_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataSize]?;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.HwRAM] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.HwMemory] {
		Organization_Ref : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.MemoryOrganization]?;
		IsSynchronous_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Boolean]?;
		IsStatic_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Boolean]?;
		IsNonVolatile_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Boolean]?;
		Repl_Policy_Att : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.Repl_Policy]?;
		WritePolicy_Att : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.WritePolicy]?;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.HwROM] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.HwMemory] {
		Type_Att : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.ROM_Type]?;
		Organization_Ref : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.MemoryOrganization]?;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.HwDrive] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.HwMemory] {
		SectorSize_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataSize]?;
		Buffer_ContRef : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.HwRAM]?;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.HWCache] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.HwMemory] {
		Level_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]?;
		Type_Att : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.CacheType]?;
		Structure_Ref : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.CacheStructure]?;
		Repl_Policy_Att : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.Repl_Policy]?;
		WritePolicy_Att : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.WritePolicy]?;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorageManager.HwStorageManager] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwGeneral.HwResource], @[MARTE.MARTE_Foundations.GRM.StorageResource] {
		ManagedMemories_ContRef : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.HwMemory]*;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorageManager.HwDMA] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorageManager.HwStorageManager], @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwArbiter] {
		NbChannels_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]?;
		TransferWidth_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataSize]?;
		DrivenBy_ContRef : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwProcessor]*;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorageManager.HwMMU] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorageManager.HwStorageManager] {
		VirtualAddrSpace_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataSize]?;
		PhysicalAddrSpace_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataSize]?;
		MemoryProtection_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]?;
		NbEntries_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Boolean]?;
		OwnedTLBs_ContRef : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwMemory.HWCache]*;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimingResource] : @[MARTE.MARTE_Foundations.GRM.TimingResource], @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwGeneral.HwResource];

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwClock] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimingResource] {
		Frequency_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Frequency]?;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimer] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwTimingResource] {
		NbCounter_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]?;
		CounterWidth_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataSize]?;
		InputClock_Ref : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwTiming.HwClock]?;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwGeneral.HwResource], @[MARTE.MARTE_Foundations.GRM.DeviceResource];

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwI_O] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice];

	type @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwSupport] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevice];

	type @[MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent] : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwGeneral.HwResource] {
		Kind_Att : @[MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentKind]?;
		Dimenssions_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Length]#0 .. 3;
		Area_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Area]?;
		Position_Ref : @[MARTE_Library.MARTE_DataTypes.NFP_NaturalInterval]#0 .. 2;
		Grid_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]#0 .. 2;
		NbPins_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]?;
		Weight_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real]?;
		Price_Ref : @[MARTE_Library.BasicNFP_Types.NFP_String]?;
		R_Conditions_Ref : @[MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition]*;
		PoweredServices_ContRef : @[MARTE.MARTE_DesignModel.HRM.HwLogical.HwGeneral.HwResourceService]*;
		StaticConsumption_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Power]?;
		StaticDissipation_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Power]?;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ComponentKind] {"Card", "Channel", "Chip", "Port", "Unit", "Other", "Undef"};

	type @[MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.Env_Condition] {
		Type_Att : @[MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ConditionType]?;
		Status_Att : @[MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.CompnentState]?;
		Description_Ref : @[MARTE_Library.BasicNFP_Types.NFP_String]?;
		Range_Ref : @[MARTE_Library.MARTE_DataTypes.Realnterval]?;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.ConditionType] {"Temperature", "Humidity", "Altitude", "Vibration", "Shock", "Other", "Undef"};

	type @[MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.CompnentState] {"Operating", "Storage", "Other", "Undef"};

	type @[MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwPowerSupply] : @[MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent] {
		SuppliedPower_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Power]?;
		Capacity_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Energy]?;
	};

	type @[MARTE.MARTE_DesignModel.HRM.HwPhysical.HwPower.HwCoolingSupply] : @[MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwComponent] {
		CoolingPower_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Power]?;
	};

	type @[MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwResource] : @[MARTE.MARTE_Foundations.GRM.Resource] {
		IdentifierElements_Ref : @[Uml.TypedElement]*;
		StateElements_Ref : @[Uml.TypedElement]*;
		MemorySizeFootprint_Ref : @[Uml.TypedElement]?;
		CreateServices_Ref : @[Uml.BehavioralFeature]*;
		DeleteServices_Ref : @[Uml.BehavioralFeature]*;
		InitializeServices_Ref : @[Uml.BehavioralFeature]*;
	};

	type @[MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwAccessService] : @[MARTE.MARTE_Foundations.GRM.GRService] {
		IsModifier_Att : Logical;
		AccessedElement_Ref : @[Uml.Property];
	};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Concurrency.InterruptKind] {"HardwareInterruption", "ProcessorDetectedException", "ProgrammedException", "Undef", "Other"};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Concurrency.EntryPoint] {
		IsReentrant_Att : Logical;
		Routine_Ref : @[Uml.BehavioralFeature];
		Base_BehavioralFeature_Ref : @[Uml.BehavioralFeature];
		Base_Dependency_Ref : @[Uml.Dependency];
	};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource] : @[MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwResource] {
		Type_Ref : @[MARTE_Library.BasicNFP_Types.ArrivalPattern]?;
		ActivationCapacity_Att : Integer32;
		EntryPoints_Ref : @[Uml.Element]*;
		AdressSpace_Ref : @[Uml.TypedElement]*;
		PeriodElements_Ref : @[Uml.TypedElement]*;
		PriorityElements_Ref : @[Uml.TypedElement]*;
		StackSizeElements_Ref : @[Uml.TypedElement]*;
		ActivateServices_Ref : @[Uml.BehavioralFeature]*;
		EnableConcurrencyServices_Ref : @[Uml.BehavioralFeature]*;
		ResumeServices_Ref : @[Uml.BehavioralFeature]*;
		SuspendServices_Ref : @[Uml.BehavioralFeature]*;
		TerminateServices_Ref : @[Uml.BehavioralFeature]*;
		DisableConcurrencyServices_Ref : @[Uml.BehavioralFeature]*;
		ShareDataResources_Ref : @[Uml.TypedElement]*;
		MessageResources_Ref : @[Uml.TypedElement]*;
		MutualExclusionResources_Ref : @[Uml.TypedElement]*;
		NotificationResources_Ref : @[Uml.TypedElement]*;
	};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Concurrency.InterruptResource] : @[MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource] {
		Kind_Att : @[MARTE.MARTE_DesignModel.SRM.SW_Concurrency.InterruptKind]?;
		IsMaskable_Att : Logical;
		VectorElements_Ref : @[Uml.TypedElement]*;
		MaskElements_Ref : @[Uml.TypedElement]*;
		RoutineConnectServices_Ref : @[Uml.BehavioralFeature]*;
		RoutineDisconnectServices_Ref : @[Uml.BehavioralFeature]*;
	};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwSchedulableResource] : @[MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwConcurrentResource] {
		IsStaticSchedulingFeature_Att : Logical;
		IsPreemptable_Att : Logical;
		Schedulers_Ref : @[Uml.NamedElement];
		DeadlineElements_Ref : @[Uml.TypedElement]*;
		DeadlineTypeElements_Ref : @[Uml.TypedElement]*;
		TimeScliceElements_Ref : @[Uml.TypedElement]*;
		DelayServices_Ref : @[Uml.BehavioralFeature]*;
		JoinServices_Ref : @[Uml.BehavioralFeature]*;
		YieldServices_Ref : @[Uml.BehavioralFeature]*;
	};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SwTimerResource] : @[MARTE.MARTE_Foundations.GRM.TimerResource] {
		DurationElements_Ref : @[Uml.TypedElement]?;
	};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Concurrency.MemoryPartition] : @[MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwResource] {
		ConcurrentResources_Ref : @[Uml.TypedElement]*;
		MemorySpaces_Ref : @[Uml.TypedElement]*;
		Fork_Ref : @[Uml.BehavioralFeature]*;
		Exit_Ref : @[Uml.BehavioralFeature]*;
		Base_Namespace_Ref : @[Uml.Namespace];
	};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Concurrency.Alarm] : @[MARTE.MARTE_DesignModel.SRM.SW_Concurrency.InterruptResource] {
		IsWatchdog_Att : Logical;
		Timers_Ref : @[Uml.TypedElement]*;
	};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Brokering.AccessPolicyKind] {"Read", "Write", "ReadWrite", "Undef", "Other"};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Brokering.DeviceBroker] : @[MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwResource] {
		AccessPolicy_Att : @[MARTE.MARTE_DesignModel.SRM.SW_Brokering.AccessPolicyKind]?;
		IsBuffered_Att : Logical;
		Devices_Ref : @[Uml.TypedElement]*;
		CloseServices_Ref : @[Uml.BehavioralFeature]*;
		ControlServices_Ref : @[Uml.BehavioralFeature]*;
		OpenServices_Ref : @[Uml.BehavioralFeature]*;
		ReadServices_Ref : @[Uml.BehavioralFeature]*;
		WriteServices_Ref : @[Uml.BehavioralFeature]*;
	};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Brokering.MemoryBroker] : @[MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwResource] {
		AccessPolicy_Att : @[MARTE.MARTE_DesignModel.SRM.SW_Brokering.AccessPolicyKind]?;
		Memories_Ref : @[Uml.TypedElement]*;
		MemoryBlockAdressSelements_Ref : @[Uml.TypedElement]*;
		MemoryBlockSizeElements_Ref : @[Uml.TypedElement]*;
		LockServices_Ref : @[Uml.BehavioralFeature]*;
		UnlockServices_Ref : @[Uml.BehavioralFeature]*;
		MapServices_Ref : @[Uml.BehavioralFeature]*;
		UnMapServices_Ref : @[Uml.BehavioralFeature]*;
	};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.QueuePolicyKind] {"FIFO", "LIFO", "Priority", "Undef", "Other"};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.MessageResourceKind] {"MessageQueue", "Pipe", "Blackboard", "Undef", "Other"};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.NotificationKind] {"Memorized", "Bounded", "Memoryless", "Undef", "Other"};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.NotificationResourceKind] {"Event", "Barrier", "Undef", "Other"};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.MutualExclusionResourceKind] {"BooleanSemaphore", "CountSemaphore", "Mutex", "Undef", "Other"};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.ConcurrentAccessProtocolKind] {"PIP", "PCP", "NoPreemption", "Undef", "Other"};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwInteractionResource] : @[MARTE.MARTE_DesignModel.SRM.SW_ResourceCore.SwResource] {
		IsIntraPartitionInteraction_Att : Logical;
		WaitingQueuePolicy_Att : @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.QueuePolicyKind]?;
		WaitingQueueCapacity_Att : Integer32;
		WaitingPolicyElements_Ref : @[Uml.TypedElement]*;
	};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwCommunicationResource] : @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwInteractionResource], @[MARTE.MARTE_Foundations.GRM.CommunicationMedia];

	type @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwSynchronizationResource] : @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwInteractionResource], @[MARTE.MARTE_Foundations.GRM.SynchronizationResource];

	type @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.SharedDataComResource] : @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwCommunicationResource] {
		ReadServices_Ref : @[Uml.BehavioralFeature]*;
		WriteServices_Ref : @[Uml.BehavioralFeature]*;
	};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.MessageComResource] : @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwCommunicationResource] {
		IsFixedMessageSize_Att : Logical;
		Meachnism_Att : @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.MessageResourceKind]?;
		MessageSizeElements_Ref : @[Uml.TypedElement]*;
		MessageQueueCapacityElements_Ref : @[Uml.TypedElement]*;
		MessageQueuePolicy_Att : @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.QueuePolicyKind]?;
		SendServices_Ref : @[Uml.BehavioralFeature]*;
		ReceiveServices_Ref : @[Uml.BehavioralFeature]*;
	};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.NotificationResource] : @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwSynchronizationResource] {
		Occurence_Att : @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.NotificationKind]?;
		Mechanism_Att : @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.NotificationResourceKind]?;
		OccurenceCountElements_Ref : @[Uml.TypedElement]*;
		MaskElements_Ref : @[Uml.TypedElement]*;
		FlushServices_Ref : @[Uml.BehavioralFeature]*;
		SignalServices_Ref : @[Uml.BehavioralFeature]*;
		WaitServices_Ref : @[Uml.BehavioralFeature]*;
		ClearServices_Ref : @[Uml.BehavioralFeature]*;
	};

	type @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwMutualExclusionResource] : @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.SwSynchronizationResource] {
		Mechanism_Att : @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.MutualExclusionResourceKind]?;
		ConcurrentAccessProtocol_Att : @[MARTE.MARTE_DesignModel.SRM.SW_Interaction.ConcurrentAccessProtocolKind]?;
		AccessTokenElements_Ref : @[Uml.TypedElement]*;
		ReleaseServices_Ref : @[Uml.BehavioralFeature]*;
		AcquireServices_Ref : @[Uml.BehavioralFeature]*;
	};

	type @[MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadGenerator] {
		Pop_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Integer]?;
		Base_Behavior_Ref : @[Uml.Behavior];
	};

	type @[MARTE.MARTE_AnalysisModel.GQAM.GaEventTrace] {
		Content_Att : Text;
		Format_Att : Text;
		Location_Att : Text;
		Base_NamedElement_Ref : @[Uml.NamedElement];
	};

	type @[MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent] {
		Pattern_Ref : @[MARTE_Library.BasicNFP_Types.ArrivalPattern]?;
		Generator_Ref : @[MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadGenerator]?;
		Trace_Ref : @[MARTE.MARTE_AnalysisModel.GQAM.GaEventTrace]?;
		Effect_Ref : @[MARTE.MARTE_AnalysisModel.GQAM.GaScenario]?;
		TimedEvent_Ref : @[Uml.TimeEvent]?;
		Base_NamedElement_Ref : @[Uml.NamedElement];
	};

	type @[MARTE.MARTE_AnalysisModel.GQAM.GaScenario] : @[MARTE.MARTE_Foundations.GRM.ResourceUsage], @[MARTE.MARTE_Foundations.Time.TimedProcessing] {
		Cause_Ref : @[MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent]?;
		HostDemand_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]*;
		HostDemandOps_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real]*;
		InterOccT_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]*;
		Throughput_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Frequency]*;
		RespT_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		Utilization_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real]*;
		UtilizationHost_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real]*;
		Root_Ref : @[MARTE.MARTE_AnalysisModel.GQAM.GaStep]?;
		Timing_Ref : @[MARTE.MARTE_AnalysisModel.GQAM.GaTimingObs]*;
		Behavior_Ref : @[MARTE.MARTE_AnalysisModel.GQAM.GaScenario]?;
	};

	type @[MARTE.MARTE_AnalysisModel.GQAM.GaStep] : @[MARTE.MARTE_AnalysisModel.GQAM.GaScenario] {
		IsAtomic_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Boolean]?;
		BlockT_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		Rep_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real];
		Prob_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real]?;
		Priority_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Integer]?;
		ConcurRes_Ref : @[MARTE.MARTE_Foundations.GRM.SchedulableResource]?;
		Host_Ref : @[MARTE.MARTE_AnalysisModel.GQAM.GaExecHost]?;
		SerDemand_Ref : @[MARTE.MARTE_AnalysisModel.GQAM.GaRequestedService]*;
		ServCount_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real]*;
	};

	type @[MARTE.MARTE_AnalysisModel.GQAM.GaExecHost] : @[MARTE.MARTE_Foundations.GRM.ProcessingResource] {
		CommTxOch_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		CommRcvOvh_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		CntxtSwt_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		ClockOvh_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		SchedPriRange_Ref : @[MARTE_Library.MARTE_DataTypes.IntegerInterval]?;
		MemSize_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataSize]?;
		Utilization_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real]*;
		Throughput_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Frequency]*;
	};

	type @[MARTE.MARTE_AnalysisModel.GQAM.GaRequestedService] : @[MARTE.MARTE_AnalysisModel.GQAM.GaStep] {
		Base_Operation_Ref : @[Uml.Operation];
	};

	type @[MARTE.MARTE_AnalysisModel.GQAM.GaTimingObs] : @[MARTE.MARTE_Foundations.NFPs.NfpConstraint] {
		Laxity_Att : @[MARTE.MARTE_AnalysisModel.GQAM.LaxityKind]?;
		StartObs_Ref : @[Uml.TimeObservation]?;
		StopObs_Ref : @[Uml.TimeObservation]?;
	};

	type @[MARTE.MARTE_AnalysisModel.GQAM.LaxityKind] {"hard", "soft", "other"};

	type @[MARTE.MARTE_AnalysisModel.GQAM.GaCommStep] : @[MARTE.MARTE_AnalysisModel.GQAM.GaStep];

	type @[MARTE.MARTE_AnalysisModel.GQAM.GaAcqStep] : @[MARTE.MARTE_AnalysisModel.GQAM.GaStep] {
		AcqRes_Ref : @[MARTE.MARTE_Foundations.GRM.Resource]?;
		ResUnits_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Integer]?;
	};

	type @[MARTE.MARTE_AnalysisModel.GQAM.GaRelStep] : @[MARTE.MARTE_AnalysisModel.GQAM.GaStep] {
		RelRes_Ref : @[MARTE.MARTE_Foundations.GRM.Resource]?;
		ResUnits_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Integer]?;
	};

	type @[MARTE.MARTE_AnalysisModel.GQAM.GaLatencyObs] : @[MARTE.MARTE_AnalysisModel.GQAM.GaTimingObs] {
		Latency_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]*;
		Miss_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real]*;
		Utility_Ref : @[MARTE_Library.MARTE_DataTypes.UtilityType]*;
		MaxJitter_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]*;
	};

	type @[MARTE.MARTE_AnalysisModel.GQAM.GaCommHost] : @[MARTE.MARTE_Foundations.GRM.ProcessingResource] {
		Capacity_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataTxRate]*;
		PacketT_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]*;
		BlockT_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]*;
		TransmMode_Att : @[MARTE_Library.MARTE_DataTypes.TransmModeKind]?;
		Utilization_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real]*;
		Throughput_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Frequency]*;
	};

	type @[MARTE.MARTE_AnalysisModel.GQAM.GaCommChannel] : @[MARTE.MARTE_Foundations.GRM.SchedulableResource] {
		PacketSize_Ref : @[MARTE_Library.BasicNFP_Types.NFP_DataSize]?;
		Utlization_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real]*;
	};

	type @[MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadBehavior] {
		Behavior_Ref : @[MARTE.MARTE_AnalysisModel.GQAM.GaScenario]*;
		Demand_Ref : @[MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent]*;
		Base_NamedElement_Ref : @[Uml.NamedElement];
	};

	type @[MARTE.MARTE_AnalysisModel.GQAM.GaAnalysisContext] : @[MARTE.MARTE_Annexes.VSL.Variables.ExpressionContext] {
		Context_Ref : @[MARTE_Library.BasicNFP_Types.NFP_String]*;
		Workload_Ref : @[MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadBehavior]+;
		Platform_Ref : @[MARTE.MARTE_AnalysisModel.GQAM.GaResourcesPlatform]+;
	};

	type @[MARTE.MARTE_AnalysisModel.GQAM.GaResourcesPlatform] {
		Resources_Ref : @[MARTE.MARTE_Foundations.GRM.Resource]*;
		Base_Classifier_Ref : @[Uml.Classifier];
	};

	type @[MARTE.MARTE_AnalysisModel.SAM.OptimallityCriterionKind] {"meetHardDeadlines", "minimizeMissedDeadlines", "minimizedMeanTardiness", "undef", "other"};

	type @[MARTE.MARTE_AnalysisModel.SAM.SaAnalysisContext] : @[MARTE.MARTE_AnalysisModel.GQAM.GaAnalysisContext] {
		IsSched_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Boolean]?;
		OptCriterion_Att : @[MARTE.MARTE_AnalysisModel.SAM.OptimallityCriterionKind]?;
	};

	type @[MARTE.MARTE_AnalysisModel.SAM.SaEnd2EndFlow] {
		IsSched_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Boolean]?;
		SchSlack_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real]?;
		End2EndT_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]*;
		End2EndD_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]*;
		Timing_Ref : @[MARTE.MARTE_AnalysisModel.GQAM.GaTimingObs]*;
		Base_NamedElement_Ref : @[Uml.NamedElement];
	};

	type @[MARTE.MARTE_AnalysisModel.SAM.SaCommStep] : @[MARTE.MARTE_AnalysisModel.GQAM.GaCommStep] {
		Deadline_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		SpareCap_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		SchSlack_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real]?;
		Base_BehavioralFeature_Ref : @[Uml.BehavioralFeature];
	};

	type @[MARTE.MARTE_AnalysisModel.SAM.SaExecStep] : @[MARTE.MARTE_AnalysisModel.GQAM.GaStep] {
		Base_BehavioralFeature_Ref : @[Uml.BehavioralFeature];
		Deadline_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		SpareCap_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		SchSlack_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real]?;
		PreemptT_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		ReadyT_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		DelayT_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
	};

	type @[MARTE.MARTE_AnalysisModel.SAM.SaSchedObs] : @[MARTE.MARTE_AnalysisModel.GQAM.GaTimingObs] {
		Suspentions_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Integer]*;
		BlockT_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]*;
		Overlaps_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Integer]*;
	};

	type @[MARTE.MARTE_AnalysisModel.SAM.SaSharedResource] : @[MARTE.MARTE_Foundations.GRM.MutualExclusionResource] {
		Capacity_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Integer]?;
		IsPreemp_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Boolean]?;
		IsConsum_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Boolean]?;
		AcquisT_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]*;
		ReleaseT_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]*;
	};

	type @[MARTE.MARTE_AnalysisModel.SAM.SaCommHost] : @[MARTE.MARTE_AnalysisModel.GQAM.GaCommHost] {
		IsSched_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Boolean]?;
		SchSlack_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real]?;
	};

	type @[MARTE.MARTE_AnalysisModel.SAM.SaExecHost] : @[MARTE.MARTE_AnalysisModel.GQAM.GaExecHost] {
		IsSched_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Boolean]?;
		SchSlack_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real]?;
		SchedUtiliz_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real]?;
		ISRswitchT_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		ISRprioRange_Ref : @[MARTE_Library.MARTE_DataTypes.IntegerInterval]?;
		SchedPolicy_Att : @[MARTE_Library.GRM_BasicTypes.SchedPolicyKind]?;
		IsPreempible_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Boolean]?;
	};

	type @[MARTE.MARTE_AnalysisModel.PAM.PaStep] : @[MARTE.MARTE_AnalysisModel.GQAM.GaStep] {
		NoSynch_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Boolean]?;
		ExtOpDemand_Att : Text;
		ExtOpCount_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real]*;
		BehavDemand_Ref : @[MARTE.MARTE_AnalysisModel.GQAM.GaScenario]*;
		BehavCount_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real]*;
	};

	type @[MARTE.MARTE_AnalysisModel.PAM.PaRequestedStep] : @[MARTE.MARTE_AnalysisModel.PAM.PaStep], @[MARTE.MARTE_AnalysisModel.GQAM.GaRequestedService];

	type @[MARTE.MARTE_AnalysisModel.PAM.PaCommStep] : @[MARTE.MARTE_AnalysisModel.PAM.PaStep], @[MARTE.MARTE_AnalysisModel.GQAM.GaCommStep];

	type @[MARTE.MARTE_AnalysisModel.PAM.PaResPassStep] : @[MARTE.MARTE_AnalysisModel.GQAM.GaStep] {
		Resource_Ref : @[MARTE.MARTE_Foundations.GRM.Resource]?;
		ResUnits_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Integer]?;
	};

	type @[MARTE.MARTE_AnalysisModel.PAM.PaLogicalResource] : @[MARTE.MARTE_Foundations.GRM.Resource] {
		Utilization_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real]?;
		Throughput_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Frequency]?;
		PoolSize_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Integer];
	};

	type @[MARTE.MARTE_AnalysisModel.PAM.PaRunTInstance] {
		PoolSize_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Integer]?;
		UnbddPool_Att : Logical;
		Instance_Ref : @[MARTE.MARTE_Foundations.GRM.Resource]?;
		Host_Ref : @[MARTE.MARTE_Foundations.GRM.SchedulableResource]?;
		Utilization_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Real]?;
		Throughput_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Frequency]?;
		Base_NamedElement_Ref : @[Uml.NamedElement];
	};

	type @[MARTE_Library.MeasurementUnits.TimeUnitKind] {"s", "tick", "ms", "us", "min", "hrs", "dys"};

	type @[MARTE_Library.MeasurementUnits.PowerUnitKind] {"W", "mW", "KW"};

	type @[MARTE_Library.MeasurementUnits.FrequencyUnitKind] {"Hz", "KHz", "MHz", "GHz", "rpm"};

	type @[MARTE_Library.MeasurementUnits.DataSizeUnitKind] {"bits", "Bytes", "KB", "MB", "GB"};

	type @[MARTE_Library.MeasurementUnits.DataTxRateUnitKind] {"b_per_s", "Kb_per_s", "Mb_per_s"};

	type @[MARTE_Library.MeasurementUnits.EnergyUnitKind] {"J", "KJ", "Wh", "KWh", "mWh"};

	type @[MARTE_Library.MeasurementUnits.LengthUnitKind] {"m", "cm", "mm"};

	type @[MARTE_Library.MeasurementUnits.AreaUnitKind] {"mm2", "um2"};

	type @[MARTE_Library.GRM_BasicTypes.EDFParameters] {
		Deadline_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
	};

	type @[MARTE_Library.GRM_BasicTypes.SchedPolicyKind] {"EarliestDeadlineFirst", "FIFO", "FixedPriority", "LeastLaxityFirst", "RoundRobin", "TimeTableDriven", "Undef", "Other"};

	type @[MARTE_Library.GRM_BasicTypes.ProtectProtocolKind] {"FIFO", "NoPreemption", "PriorityCeiling", "PriorityInheritance", "StackBased", "Undef", "Other"};

	type @[MARTE_Library.GRM_BasicTypes.PeriodicServerKind] {"Sporadic", "Deferrable", "Undef", "Other"};

	type @[MARTE_Library.GRM_BasicTypes.SchedParameters] {
		Edf_Ref : @[MARTE_Library.GRM_BasicTypes.EDFParameters]?;
		Fp_Ref : @[MARTE_Library.GRM_BasicTypes.FixedPriorityParameters]?;
		Pooling_Ref : @[MARTE_Library.GRM_BasicTypes.PoolingParameters]?;
		Server_Ref : @[MARTE_Library.GRM_BasicTypes.PeriodicServerParameters]?;
	};

	type @[MARTE_Library.GRM_BasicTypes.FixedPriorityParameters] {
		Priority_Att : Integer32;
	};

	type @[MARTE_Library.GRM_BasicTypes.PoolingParameters] : @[MARTE_Library.GRM_BasicTypes.FixedPriorityParameters] {
		Period_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		Overhead_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]*;
	};

	type @[MARTE_Library.GRM_BasicTypes.PeriodicServerParameters] : @[MARTE_Library.GRM_BasicTypes.FixedPriorityParameters] {
		Kind_Att : @[MARTE_Library.GRM_BasicTypes.PeriodicServerKind]?;
		BackgroundPriority_Att : Integer32;
		InitialBudget_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		ReplenishPeriod_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		MaxPendingReplenish_Att : Integer32;
	};

	type @[MARTE_Library.BasicNFP_Types.SourceKind] {"est", "meas", "calc", "req"};

	type @[MARTE_Library.BasicNFP_Types.BasicNFP_Types_DirectionKind] {"incr", "decr"};

	type @[MARTE_Library.BasicNFP_Types.StatisticalQualifierKind] {"max", "min", "mean", "range", "percent", "distrib", "determ", "other"};

	type @[MARTE_Library.BasicNFP_Types.NFP_CommonType] {
		Expr_Att : Logical;
		Source_Att : @[MARTE_Library.BasicNFP_Types.SourceKind]?;
		StatQ_Att : @[MARTE_Library.BasicNFP_Types.StatisticalQualifierKind]?;
		Dir_Att : @[MARTE_Library.BasicNFP_Types.BasicNFP_Types_DirectionKind]?;
	};

	type @[MARTE_Library.BasicNFP_Types.NFP_Frequency] : @[MARTE_Library.BasicNFP_Types.NFP_Real] {
		Unit_Att : @[MARTE_Library.MeasurementUnits.FrequencyUnitKind]?;
		Precision_Att : Logical;
	};

	type @[MARTE_Library.BasicNFP_Types.NFP_Real] : @[MARTE_Library.BasicNFP_Types.NFP_CommonType] {
		Value_Att : Logical;
	};

	type @[MARTE_Library.BasicNFP_Types.NFP_Natural] : @[MARTE_Library.BasicNFP_Types.NFP_CommonType] {
		Value_Att : Logical;
	};

	type @[MARTE_Library.BasicNFP_Types.NFP_Boolean] : @[MARTE_Library.BasicNFP_Types.NFP_CommonType] {
		Value_Att : Logical;
	};

	type @[MARTE_Library.BasicNFP_Types.NFP_String] : @[MARTE_Library.BasicNFP_Types.NFP_CommonType] {
		Value_Att : Text;
	};

	type @[MARTE_Library.BasicNFP_Types.NFP_Integer] : @[MARTE_Library.BasicNFP_Types.NFP_CommonType] {
		Value_Att : Integer32;
	};

	type @[MARTE_Library.BasicNFP_Types.NFP_DateTime] : @[MARTE_Library.BasicNFP_Types.NFP_CommonType] {
		Value_Att : Logical;
	};

	type @[MARTE_Library.BasicNFP_Types.NFP_DataTxRate] : @[MARTE_Library.BasicNFP_Types.NFP_Real] {
		Unit_Att : @[MARTE_Library.MeasurementUnits.DataTxRateUnitKind]?;
		Precision_Att : Logical;
	};

	type @[MARTE_Library.BasicNFP_Types.NFP_Power] : @[MARTE_Library.BasicNFP_Types.NFP_Real] {
		Unit_Att : @[MARTE_Library.MeasurementUnits.PowerUnitKind]?;
		Precision_Att : Logical;
	};

	type @[MARTE_Library.BasicNFP_Types.NFP_DataSize] : @[MARTE_Library.BasicNFP_Types.NFP_Real] {
		Unit_Att : @[MARTE_Library.MeasurementUnits.DataSizeUnitKind]?;
		Precision_Att : Logical;
	};

	type @[MARTE_Library.BasicNFP_Types.NFP_Energy] : @[MARTE_Library.BasicNFP_Types.NFP_Real] {
		Unit_Att : @[MARTE_Library.MeasurementUnits.EnergyUnitKind]?;
		Precision_Att : Logical;
	};

	type @[MARTE_Library.BasicNFP_Types.NFP_Length] : @[MARTE_Library.BasicNFP_Types.NFP_Real] {
		Unit_Att : @[MARTE_Library.MeasurementUnits.LengthUnitKind]?;
		Precision_Att : Logical;
	};

	type @[MARTE_Library.BasicNFP_Types.NFP_Area] : @[MARTE_Library.BasicNFP_Types.NFP_Real] {
		Unit_Att : @[MARTE_Library.MeasurementUnits.AreaUnitKind]?;
		Precision_Att : Logical;
	};

	type @[MARTE_Library.BasicNFP_Types.ArrivalPattern] {
		Periodic_Ref : @[MARTE_Library.BasicNFP_Types.PeriodicPattern]?;
		Aperiodic_Ref : @[MARTE_Library.BasicNFP_Types.AperiodicPattern]?;
		Burst_Ref : @[MARTE_Library.BasicNFP_Types.BurstPattern]?;
		Irregular_Ref : @[MARTE_Library.BasicNFP_Types.IrregularPattern]?;
		Closed_Ref : @[MARTE_Library.BasicNFP_Types.ClosedPattern]?;
		Sporadic_Ref : @[MARTE_Library.BasicNFP_Types.SporadicPattern]?;
	};

	type @[MARTE_Library.BasicNFP_Types.PeriodicPattern] {
		Period_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		Jitter_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		Phase_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
	};

	type @[MARTE_Library.BasicNFP_Types.AperiodicPattern] {
		Distribution_Ref : @[MARTE_Library.BasicNFP_Types.NFP_CommonType]?;
	};

	type @[MARTE_Library.BasicNFP_Types.BurstPattern] : @[MARTE_Library.BasicNFP_Types.AperiodicPattern] {
		MinInterarrival_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		MaxInterarrival_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		MinEventInterval_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		MaxEventInterval_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		BurstSize_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Integer]?;
	};

	type @[MARTE_Library.BasicNFP_Types.IrregularPattern] : @[MARTE_Library.BasicNFP_Types.AperiodicPattern] {
		Phase_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		Interarrivals_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]*;
	};

	type @[MARTE_Library.BasicNFP_Types.ClosedPattern] {
		Population_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Integer]?;
		ExtDelay_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
	};

	type @[MARTE_Library.BasicNFP_Types.SporadicPattern] : @[MARTE_Library.BasicNFP_Types.AperiodicPattern] {
		MinInterarrival_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		MaxInterarrival_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
		Jitter_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Duration]?;
	};

	type @[MARTE_Library.BasicNFP_Types.NFP_BoundedDuration] : @[MARTE_Library.BasicNFP_Types.NFP_CommonType] {
		Values_Att : Logical;
		Unit_Att : @[MARTE_Library.MeasurementUnits.TimeUnitKind]?;
		Clock_Att : Text;
		Precision_Att : Logical;
	};

	type @[MARTE_Library.BasicNFP_Types.NFP_Percentage] : @[MARTE_Library.BasicNFP_Types.NFP_Real] {
		Unit_Att : Text;
	};

	type @[MARTE_Library.BasicNFP_Types.NFP_Duration] : @[MARTE_Library.BasicNFP_Types.NFP_Real] {
		Unit_Att : @[MARTE_Library.MeasurementUnits.TimeUnitKind]?;
		Clock_Att : Text;
		Precision_Att : Logical;
	};

	type @[MARTE_Library.MARTE_DataTypes.IntegerVector] {
		VectorElem_Att : Integer32;
	};

	type @[MARTE_Library.MARTE_DataTypes.IntegerMatrix] {
		MatrixElem_Ref : @[MARTE_Library.MARTE_DataTypes.IntegerVector]*;
	};

	type @[MARTE_Library.MARTE_DataTypes.IntegerInterval] {
		Bound_Att : Integer32;
	};

	type @[MARTE_Library.MARTE_DataTypes.TransmModeKind] {"simplex", "halfDuplex", "fullDuplex"};

	type @[MARTE_Library.MARTE_DataTypes.UtilityType];

	type @[MARTE_Library.MARTE_DataTypes.Array];

	type @[MARTE_Library.MARTE_DataTypes.Realnterval] {
		Bound_Att : Logical;
	};

	type @[MARTE_Library.MARTE_DataTypes.NFP_FrequencyInterval] {
		Bound_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Frequency]#2 .. 2;
	};

	type @[MARTE_Library.MARTE_DataTypes.MARTE_DataTypes_Interval];

	type @[MARTE_Library.MARTE_DataTypes.NFP_NaturalInterval] {
		Bound_Ref : @[MARTE_Library.BasicNFP_Types.NFP_Natural]#2 .. 2;
	};

	type @[MARTE_Library.TimeTypesLibrary.TimeNatureKind] {"discrete", "dense"};

	type @[MARTE_Library.TimeTypesLibrary.TimeInterpretationKind] {"duration", "instant"};

	type @[MARTE_Library.TimeLibrary.TimedValueType] {
		Unit_Att : @[MARTE_Library.TimeLibrary.TUK]?;
		Value_Att : Logical;
		Expr_Att : Logical;
		OnClock_Att : Text;
	};

	type @[MARTE_Library.TimeLibrary.TUK] {};

	type @[MARTE_Library.TimeLibrary.TimeLibrary_TimeUnitKind] {"s", "ms", "us", "ns", "min", "hrs", "dys"};

	type @[MARTE_Library.TimeLibrary.TimeStandardKind] {"TAI", "UT0", "UT1", "UTC", "Local", "TT", "TBD", "TCG", "TCB", "Sidereal", "GPS"};

	type @[MARTE_Library.TimeLibrary.LogicalTimeUnit] {"tick"};

	type @[MARTE_Library.TimeLibrary.EventKind] {"start", "finish", "send", "receive", "consume"};

	type @[MARTE_Library.TimeLibrary.IdealClock];

	type @[MARTE_Library.RS_Library.TilerSpecification] {
		Origin_Ref : @[MARTE_Library.MARTE_DataTypes.IntegerVector]?;
		Paving_Ref : @[MARTE_Library.MARTE_DataTypes.IntegerMatrix];
		Fitting_Ref : @[MARTE_Library.MARTE_DataTypes.IntegerVector]?;
	};

	type @[MARTE_Library.RS_Library.ShapeSpecification] {
		Size_Att : Logical;
	};

	type @[Uml.Element] {
		OwnedElement_Ref : @[Uml.Element]*;
		Owner_Ref : @[Uml.Element]?;
		OwnedComment_ContRef : @[Uml.Comment]*;
	};

	type @[Uml.Comment] : @[Uml.Element] {
		Body_Att : Text;
		AnnotatedElement_Ref : @[Uml.Element]*;
	};

	type @[Uml.Package] : @[Uml.Namespace], @[Uml.PackageableElement], @[Uml.TemplateableElement] {
		OwnedType_Ref : @[Uml.Type]*;
		PackageMerge_ContRef : @[Uml.PackageMerge]*;
		PackagedElement_ContRef : @[Uml.PackageableElement]*;
		NestedPackage_Ref : @[Uml.Package]*;
		NestingPackage_Ref : @[Uml.Package]?;
		ProfileApplication_ContRef : @[Uml.ProfileApplication]*;
	};

	type @[Uml.NamedElement] : @[Uml.Element] {
		Name_Att : Text;
		Visibility_Att : @[Uml.VisibilityKind]?;
		QualifiedName_Att : Text;
		ClientDependency_Ref : @[Uml.Dependency]*;
		Namespace_Ref : @[Uml.Namespace]?;
		NameExpression_ContRef : @[Uml.StringExpression]?;
	};

	type @[Uml.StructuralFeature] : @[Uml.Feature], @[Uml.TypedElement], @[Uml.MultiplicityElement] {
		IsReadOnly_Att : Logical;
	};

	type @[Uml.ConnectableElement] : @[Uml.TypedElement], @[Uml.ParameterableElement] {
		End_Ref : @[Uml.ConnectorEnd]*;
	};

	type @[Uml.TemplateableElement] : @[Uml.Element] {
		TemplateBinding_ContRef : @[Uml.TemplateBinding]*;
		OwnedTemplateSignature_ContRef : @[Uml.TemplateSignature]?;
	};

	type @[Uml.Property] : @[Uml.StructuralFeature], @[Uml.ConnectableElement], @[Uml.DeploymentTarget], @[Uml.TemplateableElement] {
		Class_Ref : @[Uml.Class]?;
		Datatype_Ref : @[Uml.DataType]?;
		OwningAssociation_Ref : @[Uml.Association]?;
		Association_Ref : @[Uml.Association]?;
		IsDerived_Att : Logical;
		IsDerivedUnion_Att : Logical;
		Default_Att : Text;
		Aggregation_Att : @[Uml.AggregationKind];
		IsComposite_Att : Logical;
		RedefinedProperty_Ref : @[Uml.Property]*;
		DefaultValue_ContRef : @[Uml.ValueSpecification]?;
		Opposite_Ref : @[Uml.Property]?;
		SubsettedProperty_Ref : @[Uml.Property]*;
		Qualifier_ContRef : @[Uml.Property]*;
		AssociationEnd_Ref : @[Uml.Property]?;
	};

	type @[Uml.VisibilityKind] {"public", "private", "protected", "package"};

	type @[Uml.Dependency] : @[Uml.PackageableElement], @[Uml.DirectedRelationship] {
		Supplier_Ref : @[Uml.NamedElement]+;
		Client_Ref : @[Uml.NamedElement]+;
	};

	type @[Uml.DirectedRelationship] : @[Uml.Relationship] {
		Source_Ref : @[Uml.Element]+;
		Target_Ref : @[Uml.Element]+;
	};

	type @[Uml.Relationship] : @[Uml.Element] {
		RelatedElement_Ref : @[Uml.Element]+;
	};

	type @[Uml.Namespace] : @[Uml.NamedElement] {
		ElementImport_ContRef : @[Uml.ElementImport]*;
		PackageImport_ContRef : @[Uml.PackageImport]*;
		OwnedRule_ContRef : @[Uml.Constraint]*;
		Member_Ref : @[Uml.NamedElement]*;
		ImportedMember_Ref : @[Uml.PackageableElement]*;
		OwnedMember_Ref : @[Uml.NamedElement]*;
	};

	type @[Uml.ElementImport] : @[Uml.DirectedRelationship] {
		Visibility_Att : @[Uml.VisibilityKind];
		Alias_Att : Text;
		ImportedElement_Ref : @[Uml.PackageableElement];
		ImportingNamespace_Ref : @[Uml.Namespace];
	};

	type @[Uml.PackageImport] : @[Uml.DirectedRelationship] {
		Visibility_Att : @[Uml.VisibilityKind];
		ImportedPackage_Ref : @[Uml.Package];
		ImportingNamespace_Ref : @[Uml.Namespace];
	};

	type @[Uml.Constraint] : @[Uml.PackageableElement] {
		ConstrainedElement_Ref : @[Uml.Element]*;
		Specification_ContRef : @[Uml.ValueSpecification];
		Context_Ref : @[Uml.Namespace]?;
	};

	type @[Uml.TypedElement] : @[Uml.NamedElement] {
		Type_Ref : @[Uml.Type]?;
	};

	type @[Uml.Type] : @[Uml.PackageableElement] {
		Package_Ref : @[Uml.Package]?;
	};

	type @[Uml.Association] : @[Uml.Classifier], @[Uml.Relationship] {
		IsDerived_Att : Logical;
		OwnedEnd_ContRef : @[Uml.Property]*;
		EndType_Ref : @[Uml.Type]+;
		MemberEnd_Ref : @[Uml.Property]#2 ..;
		NavigableOwnedEnd_Ref : @[Uml.Property]*;
	};

	type @[Uml.Classifier] : @[Uml.Namespace], @[Uml.RedefinableElement], @[Uml.Type], @[Uml.TemplateableElement] {
		IsAbstract_Att : Logical;
		Generalization_ContRef : @[Uml.Generalization]*;
		PowertypeExtent_Ref : @[Uml.GeneralizationSet]*;
		Feature_Ref : @[Uml.Feature]*;
		InheritedMember_Ref : @[Uml.NamedElement]*;
		RedefinedClassifier_Ref : @[Uml.Classifier]*;
		General_Ref : @[Uml.Classifier]*;
		Substitution_ContRef : @[Uml.Substitution]*;
		Attribute_Ref : @[Uml.Property]*;
		Representation_Ref : @[Uml.CollaborationUse]?;
		CollaborationUse_ContRef : @[Uml.CollaborationUse]*;
		OwnedUseCase_ContRef : @[Uml.UseCase]*;
		UseCase_Ref : @[Uml.UseCase]*;
	};

	type @[Uml.RedefinableElement] : @[Uml.NamedElement] {
		IsLeaf_Att : Logical;
		RedefinedElement_Ref : @[Uml.RedefinableElement]*;
		RedefinitionContext_Ref : @[Uml.Classifier]*;
	};

	type @[Uml.TemplateBinding] : @[Uml.DirectedRelationship] {
		Signature_Ref : @[Uml.TemplateSignature];
		ParameterSubstitution_ContRef : @[Uml.TemplateParameterSubstitution]*;
		BoundElement_Ref : @[Uml.TemplateableElement];
	};

	type @[Uml.TemplateSignature] : @[Uml.Element] {
		Parameter_Ref : @[Uml.TemplateParameter]+;
		OwnedParameter_ContRef : @[Uml.TemplateParameter]*;
		Template_Ref : @[Uml.TemplateableElement];
	};

	type @[Uml.TemplateParameter] : @[Uml.Element] {
		Signature_Ref : @[Uml.TemplateSignature];
		ParameteredElement_Ref : @[Uml.ParameterableElement];
		OwnedParameteredElement_ContRef : @[Uml.ParameterableElement]?;
		Default_Ref : @[Uml.ParameterableElement]?;
		OwnedDefault_ContRef : @[Uml.ParameterableElement]?;
	};

	type @[Uml.ParameterableElement] : @[Uml.Element] {
		OwningTemplateParameter_Ref : @[Uml.TemplateParameter]?;
		TemplateParameter_Ref : @[Uml.TemplateParameter]?;
	};

	type @[Uml.TemplateParameterSubstitution] : @[Uml.Element] {
		Formal_Ref : @[Uml.TemplateParameter];
		Actual_Ref : @[Uml.ParameterableElement]+;
		OwnedActual_ContRef : @[Uml.ParameterableElement]*;
		TemplateBinding_Ref : @[Uml.TemplateBinding];
	};

	type @[Uml.Generalization] : @[Uml.DirectedRelationship] {
		IsSubstitutable_Att : Logical;
		General_Ref : @[Uml.Classifier];
		GeneralizationSet_Ref : @[Uml.GeneralizationSet]*;
		Specific_Ref : @[Uml.Classifier];
	};

	type @[Uml.GeneralizationSet] : @[Uml.PackageableElement] {
		IsCovering_Att : Logical;
		IsDisjoint_Att : Logical;
		Powertype_Ref : @[Uml.Classifier]?;
		Generalization_Ref : @[Uml.Generalization]*;
	};

	type @[Uml.Feature] : @[Uml.RedefinableElement] {
		IsStatic_Att : Logical;
		FeaturingClassifier_Ref : @[Uml.Classifier]*;
	};

	type @[Uml.Substitution] : @[Uml.Realization] {
		Contract_Ref : @[Uml.Classifier];
		SubstitutingClassifier_Ref : @[Uml.Classifier];
	};

	type @[Uml.PackageableElement] : @[Uml.NamedElement], @[Uml.ParameterableElement];

	type @[Uml.PackageMerge] : @[Uml.DirectedRelationship] {
		MergedPackage_Ref : @[Uml.Package];
		ReceivingPackage_Ref : @[Uml.Package];
	};

	type @[Uml.ProfileApplication] : @[Uml.DirectedRelationship] {
		AppliedProfile_Ref : @[Uml.Profile];
		IsStrict_Att : Logical;
		ApplyingPackage_Ref : @[Uml.Package];
	};

	type @[Uml.Profile] : @[Uml.Package] {
		OwnedStereotype_Ref : @[Uml.Stereotype]*;
		MetaclassReference_Ref : @[Uml.ElementImport]*;
		MetamodelReference_Ref : @[Uml.PackageImport]*;
	};

	type @[Uml.Stereotype] : @[Uml.Class] {
		Icon_ContRef : @[Uml.Image]*;
	};

	type @[Uml.Class] : @[Uml.EncapsulatedClassifier], @[Uml.BehavioredClassifier] {
		NestedClassifier_ContRef : @[Uml.Classifier]*;
		OwnedOperation_ContRef : @[Uml.Operation]*;
		SuperClass_Ref : @[Uml.Class]*;
		IsActive_Att : Logical;
		OwnedReception_ContRef : @[Uml.Reception]*;
		Extension_Ref : @[Uml.Extension]*;
	};

	type @[Uml.StringExpression] : @[Uml.Expression], @[Uml.TemplateableElement] {
		SubExpression_ContRef : @[Uml.StringExpression]*;
		OwningExpression_Ref : @[Uml.StringExpression]?;
	};

	type @[Uml.Expression] : @[Uml.ValueSpecification] {
		Symbol_Att : Text;
		Operand_ContRef : @[Uml.ValueSpecification]*;
	};

	type @[Uml.ValueSpecification] : @[Uml.PackageableElement], @[Uml.TypedElement];

	type @[Uml.BehavioredClassifier] : @[Uml.Classifier] {
		OwnedBehavior_ContRef : @[Uml.Behavior]*;
		ClassifierBehavior_Ref : @[Uml.Behavior]?;
		InterfaceRealization_ContRef : @[Uml.InterfaceRealization]*;
		OwnedTrigger_ContRef : @[Uml.Trigger]*;
	};

	type @[Uml.Behavior] : @[Uml.Class] {
		IsReentrant_Att : Logical;
		RedefinedBehavior_Ref : @[Uml.Behavior]*;
		OwnedParameter_ContRef : @[Uml.Parameter]*;
		Context_Ref : @[Uml.BehavioredClassifier]?;
		Precondition_Ref : @[Uml.Constraint]*;
		Postcondition_Ref : @[Uml.Constraint]*;
		OwnedParameterSet_ContRef : @[Uml.ParameterSet]*;
		Specification_Ref : @[Uml.BehavioralFeature]?;
	};

	type @[Uml.MultiplicityElement] : @[Uml.Element] {
		IsOrdered_Att : Logical;
		IsUnique_Att : Logical;
		Upper_Att : Logical;
		Lower_Att : Integer32;
		UpperValue_ContRef : @[Uml.ValueSpecification]?;
		LowerValue_ContRef : @[Uml.ValueSpecification]?;
	};

	type @[Uml.DeploymentTarget] : @[Uml.NamedElement] {
		Deployment_ContRef : @[Uml.Deployment]*;
		DeployedElement_Ref : @[Uml.PackageableElement]*;
	};

	type @[Uml.DataType] : @[Uml.Classifier] {
		OwnedAttribute_ContRef : @[Uml.Property]*;
		OwnedOperation_ContRef : @[Uml.Operation]*;
	};

	type @[Uml.AggregationKind] {"none", "shared", "composite"};

	type @[Uml.CollaborationUse] : @[Uml.NamedElement] {
		Type_Ref : @[Uml.Collaboration];
		RoleBinding_ContRef : @[Uml.Dependency]*;
	};

	type @[Uml.UseCase] : @[Uml.BehavioredClassifier] {
		Include_ContRef : @[Uml.Include]*;
		Extend_ContRef : @[Uml.Extend]*;
		ExtensionPoint_ContRef : @[Uml.ExtensionPoint]*;
		Subject_Ref : @[Uml.Classifier]*;
	};

	type @[Uml.Realization] : @[Uml.Abstraction];

	type @[Uml.Abstraction] : @[Uml.Dependency] {
		Mapping_ContRef : @[Uml.OpaqueExpression]?;
	};

	type @[Uml.Image] : @[Uml.Element] {
		Content_Att : Text;
		Location_Att : Text;
		Format_Att : Text;
	};

	type @[Uml.OpaqueExpression] : @[Uml.ValueSpecification] {
		Body_Att : Text;
		Language_Att : Text;
		Result_Ref : @[Uml.Parameter]?;
		Behavior_Ref : @[Uml.Behavior]?;
	};

	type @[Uml.Parameter] : @[Uml.ConnectableElement], @[Uml.MultiplicityElement] {
		Direction_Att : @[Uml.ParameterDirectionKind];
		Default_Att : Text;
		DefaultValue_ContRef : @[Uml.ValueSpecification]?;
		Operation_Ref : @[Uml.Operation]?;
		ParameterSet_Ref : @[Uml.ParameterSet]*;
		IsException_Att : Logical;
		IsStream_Att : Logical;
		Effect_Att : @[Uml.ParameterEffectKind]?;
	};

	type @[Uml.EncapsulatedClassifier] : @[Uml.StructuredClassifier] {
		OwnedPort_Ref : @[Uml.Port]*;
	};

	type @[Uml.Operation] : @[Uml.BehavioralFeature], @[Uml.ParameterableElement], @[Uml.TemplateableElement] {
		Interface_Ref : @[Uml.Interface]?;
		Class_Ref : @[Uml.Class]?;
		IsQuery_Att : Logical;
		IsOrdered_Att : Logical;
		IsUnique_Att : Logical;
		Lower_Att : Integer32;
		Upper_Att : Logical;
		Precondition_Ref : @[Uml.Constraint]*;
		Postcondition_Ref : @[Uml.Constraint]*;
		RedefinedOperation_Ref : @[Uml.Operation]*;
		Datatype_Ref : @[Uml.DataType]?;
		BodyCondition_Ref : @[Uml.Constraint]?;
		Type_Ref : @[Uml.Type]?;
	};

	type @[Uml.Reception] : @[Uml.BehavioralFeature] {
		Signal_Ref : @[Uml.Signal]?;
	};

	type @[Uml.Extension] : @[Uml.Association] {
		IsRequired_Att : Logical;
		Metaclass_Ref : @[Uml.Class];
	};

	type @[Uml.EnumerationLiteral] : @[Uml.InstanceSpecification] {
		Enumeration_Ref : @[Uml.Enumeration]?;
	};

	type @[Uml.ActivityPartition] : @[Uml.NamedElement], @[Uml.ActivityGroup] {
		IsDimension_Att : Logical;
		IsExternal_Att : Logical;
		Node_Ref : @[Uml.ActivityNode]*;
		Subpartition_ContRef : @[Uml.ActivityPartition]*;
		SuperPartition_Ref : @[Uml.ActivityPartition]?;
		Represents_Ref : @[Uml.Element]?;
		Edge_Ref : @[Uml.ActivityEdge]*;
	};

	type @[Uml.Enumeration] : @[Uml.DataType] {
		OwnedLiteral_ContRef : @[Uml.EnumerationLiteral]*;
	};

	type @[Uml.InstanceSpecification] : @[Uml.DeploymentTarget], @[Uml.PackageableElement], @[Uml.DeployedArtifact] {
		Classifier_Ref : @[Uml.Classifier]*;
		Slot_ContRef : @[Uml.Slot]*;
		Specification_ContRef : @[Uml.ValueSpecification]?;
	};

	type @[Uml.BehavioralFeature] : @[Uml.Namespace], @[Uml.Feature] {
		OwnedParameter_ContRef : @[Uml.Parameter]*;
		IsAbstract_Att : Logical;
		Method_Ref : @[Uml.Behavior]*;
		Concurrency_Att : @[MARTE.MARTE_DesignModel.RTEMoCC.CallConcurrencyKind];
		RaisedException_Ref : @[Uml.Type]*;
		OwnedParameterSet_ContRef : @[Uml.ParameterSet]*;
	};

	type @[Uml.Signal] : @[Uml.Classifier] {
		OwnedAttribute_ContRef : @[Uml.Property]*;
	};

	type @[Uml.TimeExpression] : @[Uml.ValueSpecification] {
		Expr_Ref : @[Uml.ValueSpecification]?;
		Observation_Ref : @[Uml.Observation]*;
	};

	type @[Uml.Observation] : @[Uml.PackageableElement];

	type @[Uml.Duration] : @[Uml.ValueSpecification] {
		Expr_Ref : @[Uml.ValueSpecification]?;
		Observation_Ref : @[Uml.Observation]*;
	};

	type @[Uml.DurationInterval] : @[Uml.Interval];

	type @[Uml.Interval] : @[Uml.ValueSpecification] {
		Min_Ref : @[Uml.ValueSpecification];
		Max_Ref : @[Uml.ValueSpecification];
	};

	type @[Uml.TimeConstraint] : @[Uml.IntervalConstraint] {
		FirstEvent_Att : Logical;
	};

	type @[Uml.IntervalConstraint] : @[Uml.Constraint];

	type @[Uml.TimeInterval] : @[Uml.Interval];

	type @[Uml.DurationConstraint] : @[Uml.IntervalConstraint] {
		FirstEvent_Att : Logical;
	};

	type @[Uml.TimeObservation] : @[Uml.Observation] {
		Event_Ref : @[Uml.NamedElement];
		FirstEvent_Att : Logical;
	};

	type @[Uml.DurationObservation] : @[Uml.Observation] {
		Event_Ref : @[Uml.NamedElement]#1 .. 2;
		FirstEvent_Att : Logical;
	};

	type @[Uml.ConnectorEnd] : @[Uml.MultiplicityElement] {
		DefiningEnd_Ref : @[Uml.Property]?;
		PartWithPort_Ref : @[Uml.Property]?;
		Role_Ref : @[Uml.ConnectableElement];
	};

	type @[Uml.TimeEvent] : @[Uml.Event] {
		IsRelative_Att : Logical;
		When_ContRef : @[Uml.ValueSpecification];
	};

	type @[Uml.Event] : @[Uml.PackageableElement];

	type @[Uml.Port] : @[Uml.Property] {
		IsBehavior_Att : Logical;
		IsService_Att : Logical;
		Required_Ref : @[Uml.Interface]*;
		RedefinedPort_Ref : @[Uml.Port]*;
		Provided_Ref : @[Uml.Interface]*;
		Protocol_Ref : @[Uml.ProtocolStateMachine]?;
	};

	type @[Uml.Action] : @[Uml.ExecutableNode] {
		Output_Ref : @[Uml.OutputPin]*;
		Input_Ref : @[Uml.InputPin]*;
		Context_Ref : @[Uml.Classifier]?;
		LocalPrecondition_ContRef : @[Uml.Constraint]*;
		LocalPostcondition_ContRef : @[Uml.Constraint]*;
	};

	type @[Uml.Message] : @[Uml.NamedElement] {
		MessageKind_Att : @[Uml.MessageKind];
		MessageSort_Att : @[Uml.MessageSort];
		ReceiveEvent_Ref : @[Uml.MessageEnd]?;
		SendEvent_Ref : @[Uml.MessageEnd]?;
		Connector_Ref : @[Uml.Connector]?;
		Interaction_Ref : @[Uml.Interaction];
		Argument_ContRef : @[Uml.ValueSpecification]*;
		Signature_Ref : @[Uml.NamedElement]?;
	};

	type @[Uml.Lifeline] : @[Uml.NamedElement] {
		Represents_Ref : @[Uml.ConnectableElement]?;
		Interaction_Ref : @[Uml.Interaction];
		Selector_ContRef : @[Uml.ValueSpecification]?;
		DecomposedAs_Ref : @[Uml.PartDecomposition]?;
		CoveredBy_Ref : @[Uml.InteractionFragment]*;
	};

	type @[Uml.ExecutionSpecification] : @[Uml.InteractionFragment] {
		Start_Ref : @[Uml.OccurrenceSpecification];
		Finish_Ref : @[Uml.OccurrenceSpecification];
	};

	type @[Uml.InvocationAction] : @[Uml.Action] {
		Argument_ContRef : @[Uml.InputPin]*;
		OnPort_Ref : @[Uml.Port]?;
	};

	type @[Uml.Connector] : @[Uml.Feature] {
		Type_Ref : @[Uml.Association]?;
		RedefinedConnector_Ref : @[Uml.Connector]*;
		End_ContRef : @[Uml.ConnectorEnd]#2 ..;
		Kind_Att : @[Uml.ConnectorKind]?;
		Contract_Ref : @[Uml.Behavior]*;
	};

	type @[Uml.Collaboration] : @[Uml.BehavioredClassifier], @[Uml.StructuredClassifier] {
		CollaborationRole_Ref : @[Uml.ConnectableElement]*;
	};

	type @[Uml.Interface] : @[Uml.Classifier] {
		OwnedAttribute_ContRef : @[Uml.Property]*;
		OwnedOperation_ContRef : @[Uml.Operation]*;
		NestedClassifier_ContRef : @[Uml.Classifier]*;
		RedefinedInterface_Ref : @[Uml.Interface]*;
		OwnedReception_ContRef : @[Uml.Reception]*;
		Protocol_ContRef : @[Uml.ProtocolStateMachine]?;
	};

	type @[Uml.InterfaceRealization] : @[Uml.Realization] {
		Contract_Ref : @[Uml.Interface];
		ImplementingClassifier_Ref : @[Uml.BehavioredClassifier];
	};

	type @[Uml.Trigger] : @[Uml.NamedElement] {
		Event_Ref : @[Uml.Event];
		Port_Ref : @[Uml.Port]*;
	};

	type @[Uml.ProtocolStateMachine] : @[Uml.StateMachine] {
		Conformance_ContRef : @[Uml.ProtocolConformance]*;
	};

	type @[Uml.StateMachine] : @[Uml.Behavior] {
		Region_ContRef : @[Uml.Region]+;
		SubmachineState_Ref : @[Uml.State]*;
		ConnectionPoint_ContRef : @[Uml.Pseudostate]*;
		ExtendedStateMachine_Ref : @[Uml.StateMachine]*;
	};

	type @[Uml.ProtocolConformance] : @[Uml.DirectedRelationship] {
		GeneralMachine_Ref : @[Uml.ProtocolStateMachine];
		SpecificMachine_Ref : @[Uml.ProtocolStateMachine];
	};

	type @[Uml.Deployment] : @[Uml.Dependency] {
		DeployedArtifact_Ref : @[Uml.DeployedArtifact]*;
		Configuration_ContRef : @[Uml.DeploymentSpecification]*;
		Location_Ref : @[Uml.DeploymentTarget];
	};

	type @[Uml.Include] : @[Uml.NamedElement], @[Uml.DirectedRelationship] {
		Addition_Ref : @[Uml.UseCase];
		IncludingCase_Ref : @[Uml.UseCase];
	};

	type @[Uml.Extend] : @[Uml.NamedElement], @[Uml.DirectedRelationship] {
		ExtendedCase_Ref : @[Uml.UseCase];
		Condition_ContRef : @[Uml.Constraint]?;
		ExtensionLocation_Ref : @[Uml.ExtensionPoint]+;
		Extension_Ref : @[Uml.UseCase];
	};

	type @[Uml.ExtensionPoint] : @[Uml.RedefinableElement] {
		UseCase_Ref : @[Uml.UseCase];
	};

	type @[Uml.Region] : @[Uml.Namespace], @[Uml.RedefinableElement] {
		Subvertex_ContRef : @[Uml.Vertex]*;
		Transition_ContRef : @[Uml.Transition]*;
		State_Ref : @[Uml.State]?;
		ExtendedRegion_Ref : @[Uml.Region]?;
		StateMachine_Ref : @[Uml.StateMachine]?;
	};

	type @[Uml.StructuredClassifier] : @[Uml.Classifier] {
		OwnedAttribute_ContRef : @[Uml.Property]*;
		Part_Ref : @[Uml.Property]*;
		Role_Ref : @[Uml.ConnectableElement]*;
		OwnedConnector_ContRef : @[Uml.Connector]*;
	};

	type @[Uml.Vertex] : @[Uml.NamedElement] {
		Incoming_Ref : @[Uml.Transition]*;
		Outgoing_Ref : @[Uml.Transition]*;
		Container_Ref : @[Uml.Region]?;
	};

	type @[Uml.Transition] : @[Uml.Namespace], @[Uml.RedefinableElement] {
		Kind_Att : @[Uml.TransitionKind];
		Container_Ref : @[Uml.Region];
		RedefinedTransition_Ref : @[Uml.Transition]?;
		Guard_Ref : @[Uml.Constraint]?;
		Effect_ContRef : @[Uml.Behavior]?;
		Trigger_ContRef : @[Uml.Trigger]*;
		Target_Ref : @[Uml.Vertex];
		Source_Ref : @[Uml.Vertex];
	};

	type @[Uml.TransitionKind] {"internal", "local", "external"};

	type @[Uml.State] : @[Uml.Namespace], @[Uml.RedefinableElement], @[Uml.Vertex] {
		IsComposite_Att : Logical;
		IsOrthogonal_Att : Logical;
		IsSimple_Att : Logical;
		IsSubmachineState_Att : Logical;
		Submachine_Ref : @[Uml.StateMachine]?;
		Connection_ContRef : @[Uml.ConnectionPointReference]*;
		ConnectionPoint_ContRef : @[Uml.Pseudostate]*;
		RedefinedState_Ref : @[Uml.State]?;
		StateInvariant_ContRef : @[Uml.Constraint]?;
		Entry_ContRef : @[Uml.Behavior]?;
		Exit_ContRef : @[Uml.Behavior]?;
		DoActivity_ContRef : @[Uml.Behavior]?;
		DeferrableTrigger_ContRef : @[Uml.Trigger]*;
		Region_ContRef : @[Uml.Region]*;
	};

	type @[Uml.ParameterSet] : @[Uml.NamedElement] {
		Parameter_Ref : @[Uml.Parameter]+;
		Condition_ContRef : @[Uml.Constraint]*;
	};

	type @[Uml.ActivityNode] : @[Uml.RedefinableElement] {
		InStructuredNode_Ref : @[Uml.StructuredActivityNode]?;
		Activity_Ref : @[Uml.Activity]?;
		Outgoing_Ref : @[Uml.ActivityEdge]*;
		Incoming_Ref : @[Uml.ActivityEdge]*;
		InPartition_Ref : @[Uml.ActivityPartition]*;
		InInterruptibleRegion_Ref : @[Uml.InterruptibleActivityRegion]*;
		InGroup_Ref : @[Uml.ActivityGroup]*;
		RedefinedNode_Ref : @[Uml.ActivityNode]*;
	};

	type @[Uml.ActivityGroup] : @[Uml.Element] {
		Subgroup_Ref : @[Uml.ActivityGroup]*;
		SuperGroup_Ref : @[Uml.ActivityGroup]?;
		InActivity_Ref : @[Uml.Activity]?;
		ContainedEdge_Ref : @[Uml.ActivityEdge]*;
		ContainedNode_Ref : @[Uml.ActivityNode]*;
	};

	type @[Uml.ParameterDirectionKind] {"in", "inout", "out", "return"};

	type @[Uml.ParameterEffectKind] {"create", "read", "update", "delete"};

	type @[Uml.ActivityEdge] : @[Uml.RedefinableElement] {
		Source_Ref : @[Uml.ActivityNode];
		Target_Ref : @[Uml.ActivityNode];
		RedefinedEdge_Ref : @[Uml.ActivityEdge]*;
		InPartition_Ref : @[Uml.ActivityPartition]*;
		Guard_ContRef : @[Uml.ValueSpecification];
		Weight_ContRef : @[Uml.ValueSpecification];
		Interrupts_Ref : @[Uml.InterruptibleActivityRegion]?;
		InStructuredNode_Ref : @[Uml.StructuredActivityNode]?;
		InGroup_Ref : @[Uml.ActivityGroup]*;
		Activity_Ref : @[Uml.Activity]?;
	};

	type @[Uml.InterruptibleActivityRegion] : @[Uml.ActivityGroup] {
		Node_Ref : @[Uml.ActivityNode]*;
		InterruptingEdge_Ref : @[Uml.ActivityEdge]*;
	};

	type @[Uml.DeployedArtifact] : @[Uml.NamedElement];

	type @[Uml.Slot] : @[Uml.Element] {
		DefiningFeature_Ref : @[Uml.StructuralFeature];
		Value_ContRef : @[Uml.ValueSpecification]*;
		OwningInstance_Ref : @[Uml.InstanceSpecification];
	};

	type @[Uml.ExecutableNode] : @[Uml.ActivityNode] {
		Handler_ContRef : @[Uml.ExceptionHandler]*;
	};

	type @[Uml.OutputPin] : @[Uml.Pin];

	type @[Uml.Pin] : @[Uml.ObjectNode], @[Uml.MultiplicityElement] {
		IsControl_Att : Logical;
	};

	type @[Uml.InputPin] : @[Uml.Pin];

	type @[Uml.MessageKind] {"complete", "lost", "found", "unknown"};

	type @[Uml.ExceptionHandler] : @[Uml.Element] {
		HandlerBody_Ref : @[Uml.ExecutableNode];
		ExceptionInput_Ref : @[Uml.ObjectNode];
		ExceptionType_Ref : @[Uml.Classifier]+;
		ProtectedNode_Ref : @[Uml.ExecutableNode];
	};

	type @[Uml.ObjectNode] : @[Uml.ActivityNode], @[Uml.TypedElement] {
		Ordering_Att : @[Uml.ObjectNodeOrderingKind];
		IsControlType_Att : Logical;
		UpperBound_ContRef : @[Uml.ValueSpecification];
		InState_Ref : @[Uml.State]*;
		Selection_Ref : @[Uml.Behavior]?;
	};

	type @[Uml.ObjectNodeOrderingKind] {"unordered", "ordered", "LIFO", "FIFO"};

	type @[Uml.MessageEnd] : @[Uml.NamedElement] {
		Message_Ref : @[Uml.Message]?;
	};

	type @[Uml.MessageSort] {"synchCall", "asynchCall", "asynchSignal", "createMessage", "deleteMessage", "reply"};

	type @[Uml.Interaction] : @[Uml.Behavior], @[Uml.InteractionFragment] {
		Lifeline_ContRef : @[Uml.Lifeline]*;
		Fragment_ContRef : @[Uml.InteractionFragment]*;
		Action_ContRef : @[Uml.Action]*;
		FormalGate_ContRef : @[Uml.Gate]*;
		Message_ContRef : @[Uml.Message]*;
	};

	type @[Uml.PartDecomposition] : @[Uml.InteractionUse];

	type @[Uml.InteractionUse] : @[Uml.InteractionFragment] {
		RefersTo_Ref : @[Uml.Interaction];
		ActualGate_ContRef : @[Uml.Gate]*;
		Argument_ContRef : @[Uml.Action]*;
	};

	type @[Uml.InteractionFragment] : @[Uml.NamedElement] {
		Covered_Ref : @[Uml.Lifeline]*;
		GeneralOrdering_ContRef : @[Uml.GeneralOrdering]*;
		EnclosingInteraction_Ref : @[Uml.Interaction]?;
		EnclosingOperand_Ref : @[Uml.InteractionOperand]?;
	};

	type @[Uml.ConnectorKind] {"assembly", "delegation"};

	type @[Uml.Pseudostate] : @[Uml.Vertex] {
		Kind_Att : @[Uml.PseudostateKind];
		StateMachine_Ref : @[Uml.StateMachine]?;
		State_Ref : @[Uml.State]?;
	};

	type @[Uml.PseudostateKind] {"initial", "deepHistory", "shallowHistory", "join", "fork", "junction", "choice", "entryPoint", "exitPoint", "terminate"};

	type @[Uml.ConnectionPointReference] : @[Uml.Vertex] {
		Entry_Ref : @[Uml.Pseudostate]*;
		Exit_Ref : @[Uml.Pseudostate]*;
		State_Ref : @[Uml.State]?;
	};

	type @[Uml.StructuredActivityNode] : @[Uml.Action], @[Uml.Namespace], @[Uml.ActivityGroup] {
		Variable_ContRef : @[Uml.Variable]*;
		Edge_ContRef : @[Uml.ActivityEdge]*;
		MustIsolate_Att : Logical;
		Node_ContRef : @[Uml.ActivityNode]*;
	};

	type @[Uml.Variable] : @[Uml.ConnectableElement], @[Uml.MultiplicityElement] {
		Scope_Ref : @[Uml.StructuredActivityNode]?;
		ActivityScope_Ref : @[Uml.Activity]?;
	};

	type @[Uml.Activity] : @[Uml.Behavior] {
		StructuredNode_Ref : @[Uml.StructuredActivityNode]*;
		Variable_ContRef : @[Uml.Variable]*;
		Node_ContRef : @[Uml.ActivityNode]*;
		IsReadOnly_Att : Logical;
		Edge_ContRef : @[Uml.ActivityEdge]*;
		Partition_Ref : @[Uml.ActivityPartition]*;
		IsSingleExecution_Att : Logical;
		Group_ContRef : @[Uml.ActivityGroup]*;
	};

	type @[Uml.OccurrenceSpecification] : @[Uml.InteractionFragment] {
		ToBefore_Ref : @[Uml.GeneralOrdering]*;
		Event_Ref : @[Uml.Event];
		ToAfter_Ref : @[Uml.GeneralOrdering]*;
	};

	type @[Uml.DeploymentSpecification] : @[Uml.Artifact] {
		DeploymentLocation_Att : Text;
		ExecutionLocation_Att : Text;
		Deployment_Ref : @[Uml.Deployment]?;
	};

	type @[Uml.Gate] : @[Uml.MessageEnd];

	type @[Uml.Artifact] : @[Uml.Classifier], @[Uml.DeployedArtifact] {
		FileName_Att : Text;
		NestedArtifact_ContRef : @[Uml.Artifact]*;
		Manifestation_ContRef : @[Uml.Manifestation]*;
		OwnedOperation_ContRef : @[Uml.Operation]*;
		OwnedAttribute_ContRef : @[Uml.Property]*;
	};

	type @[Uml.GeneralOrdering] : @[Uml.NamedElement] {
		Before_Ref : @[Uml.OccurrenceSpecification];
		After_Ref : @[Uml.OccurrenceSpecification];
	};

	type @[Uml.Manifestation] : @[Uml.Abstraction] {
		UtilizedElement_Ref : @[Uml.PackageableElement];
	};

	type @[Uml.InteractionOperand] : @[Uml.Namespace], @[Uml.InteractionFragment] {
		Guard_ContRef : @[Uml.InteractionConstraint]?;
		Fragment_ContRef : @[Uml.InteractionFragment]*;
	};

	type @[Uml.InteractionConstraint] : @[Uml.Constraint] {
		Minint_ContRef : @[Uml.ValueSpecification]?;
		Maxint_ContRef : @[Uml.ValueSpecification]?;
	};
}