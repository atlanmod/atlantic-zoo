module IFC2X3 {

	type IfcActorSelect;

	type IfcAxis2Placement;

	type IfcBooleanOperand;

	type IfcCharacterStyleSelect;

	type IfcClassificationNotationSelect;

	type IfcColour : IfcSymbolStyleSelect, IfcFillStyleSelect;

	type IfcCsgSelect;

	type IfcCurveFontOrScaledCurveFontSelect;

	type IfcCurveOrEdgeCurve;

	type IfcCurveStyleFontSelect : IfcCurveFontOrScaledCurveFontSelect;

	type IfcDateTimeSelect;

	type IfcDefinedSymbolSelect;

	type IfcDocumentSelect;

	type IfcDraughtingCalloutElement;

	type IfcFillAreaStyleTileShapeSelect;

	type IfcFillStyleSelect;

	type IfcGeometricSetSelect;

	type IfcLayeredItem {
		LayerAssignments_Ref : IfcPresentationLayerAssignment;
	};

	type IfcLibrarySelect;

	type IfcLightDistributionDataSourceSelect;

	type IfcMaterialSelect;

	type IfcObjectReferenceSelect;

	type IfcPointOrVertexPoint;

	type IfcShell;

	type IfcStructuralActivityAssignmentSelect {
		AssignedStructuralActivity_Ref : IfcRelConnectsStructuralActivity;
	};

	type IfcSurfaceOrFaceSurface;

	type IfcSurfaceStyleElementSelect;

	type IfcSymbolStyleSelect;

	type IfcTextFontSelect;

	type IfcTextStyleSelect;

	type IfcUnit;

	type IfcVectorOrDirection;

	type IfcValue {
		IfcAbsorbedDoseMeasurevalue_Att : Logical;
		IfcAccelerationMeasurevalue_Att : Logical;
		IfcAmountOfSubstanceMeasurevalue_Att : Logical;
		IfcAngularVelocityMeasurevalue_Att : Logical;
		IfcAreaMeasurevalue_Att : Logical;
		IfcBooleanvalue_Att : Logical;
		IfcContextDependentMeasurevalue_Att : Logical;
		IfcCountMeasurevalue_Att : Logical;
		IfcCurvatureMeasurevalue_Att : Logical;
		IfcDescriptiveMeasurevalue_Att : Logical;
		IfcDoseEquivalentMeasurevalue_Att : Logical;
		IfcDynamicViscosityMeasurevalue_Att : Logical;
		IfcElectricCapacitanceMeasurevalue_Att : Logical;
		IfcElectricChargeMeasurevalue_Att : Logical;
		IfcElectricConductanceMeasurevalue_Att : Logical;
		IfcElectricCurrentMeasurevalue_Att : Logical;
		IfcElectricResistanceMeasurevalue_Att : Logical;
		IfcElectricVoltageMeasurevalue_Att : Logical;
		IfcEnergyMeasurevalue_Att : Logical;
		IfcForceMeasurevalue_Att : Logical;
		IfcFrequencyMeasurevalue_Att : Logical;
		IfcHeatFluxDensityMeasurevalue_Att : Logical;
		IfcHeatingValueMeasurevalue_Att : Logical;
		IfcIdentifiervalue_Att : Logical;
		IfcIlluminanceMeasurevalue_Att : Logical;
		IfcInductanceMeasurevalue_Att : Logical;
		IfcIntegervalue_Att : Logical;
		IfcIntegerCountRateMeasurevalue_Att : Logical;
		IfcIonConcentrationMeasurevalue_Att : Logical;
		IfcIsothermalMoistureCapacityMeasurevalue_Att : Logical;
		IfcKinematicViscosityMeasurevalue_Att : Logical;
		IfcLabelvalue_Att : Logical;
		IfcPositiveLengthMeasurevalue_Att : Logical;
		IfcLengthMeasurevalue_Att : Logical;
		IfcLinearForceMeasurevalue_Att : Logical;
		IfcLinearMomentMeasurevalue_Att : Logical;
		IfcLinearStiffnessMeasurevalue_Att : Logical;
		IfcLinearVelocityMeasurevalue_Att : Logical;
		IfcLogicalvalue_Att : Logical;
		IfcLuminousFluxMeasurevalue_Att : Logical;
		IfcLuminousIntensityDistributionMeasurevalue_Att : Logical;
		IfcLuminousIntensityMeasurevalue_Att : Logical;
		IfcMagneticFluxDensityMeasurevalue_Att : Logical;
		IfcMagneticFluxMeasurevalue_Att : Logical;
		IfcMassDensityMeasurevalue_Att : Logical;
		IfcMassFlowRateMeasurevalue_Att : Logical;
		IfcMassMeasurevalue_Att : Logical;
		IfcMassPerLengthMeasurevalue_Att : Logical;
		IfcModulusOfElasticityMeasurevalue_Att : Logical;
		IfcModulusOfLinearSubgradeReactionMeasurevalue_Att : Logical;
		IfcModulusOfRotationalSubgradeReactionMeasurevalue_Att : Logical;
		IfcModulusOfSubgradeReactionMeasurevalue_Att : Logical;
		IfcMoistureDiffusivityMeasurevalue_Att : Logical;
		IfcMolecularWeightMeasurevalue_Att : Logical;
		IfcMomentOfInertiaMeasurevalue_Att : Logical;
		IfcMonetaryMeasurevalue_Att : Logical;
		IfcNormalisedRatioMeasurevalue_Att : Logical;
		IfcNumericMeasurevalue_Att : Logical;
		IfcPHMeasurevalue_Att : Logical;
		IfcParameterValuevalue_Att : Logical;
		IfcPlanarForceMeasurevalue_Att : Logical;
		IfcPositivePlaneAngleMeasurevalue_Att : Logical;
		IfcPlaneAngleMeasurevalue_Att : Logical;
		IfcPositiveRatioMeasurevalue_Att : Logical;
		IfcPowerMeasurevalue_Att : Logical;
		IfcPressureMeasurevalue_Att : Logical;
		IfcRadioActivityMeasurevalue_Att : Logical;
		IfcRatioMeasurevalue_Att : Logical;
		IfcRealvalue_Att : Logical;
		IfcRotationalFrequencyMeasurevalue_Att : Logical;
		IfcRotationalMassMeasurevalue_Att : Logical;
		IfcRotationalStiffnessMeasurevalue_Att : Logical;
		IfcSectionModulusMeasurevalue_Att : Logical;
		IfcSectionalAreaIntegralMeasurevalue_Att : Logical;
		IfcShearModulusMeasurevalue_Att : Logical;
		IfcSolidAngleMeasurevalue_Att : Logical;
		IfcSoundPowerMeasurevalue_Att : Logical;
		IfcSoundPressureMeasurevalue_Att : Logical;
		IfcSpecificHeatCapacityMeasurevalue_Att : Logical;
		IfcTemperatureGradientMeasurevalue_Att : Logical;
		IfcTextvalue_Att : Logical;
		IfcThermalAdmittanceMeasurevalue_Att : Logical;
		IfcThermalConductivityMeasurevalue_Att : Logical;
		IfcThermalExpansionCoefficientMeasurevalue_Att : Logical;
		IfcThermalResistanceMeasurevalue_Att : Logical;
		IfcThermalTransmittanceMeasurevalue_Att : Logical;
		IfcThermodynamicTemperatureMeasurevalue_Att : Logical;
		IfcTimeMeasurevalue_Att : Logical;
		IfcTimeStampvalue_Att : Logical;
		IfcTorqueMeasurevalue_Att : Logical;
		IfcVaporPermeabilityMeasurevalue_Att : Logical;
		IfcVolumeMeasurevalue_Att : Logical;
		IfcVolumetricFlowRateMeasurevalue_Att : Logical;
		IfcWarpingConstantMeasurevalue_Att : Logical;
		IfcWarpingMomentMeasurevalue_Att : Logical;
	};

	type IfcTrimmingSelect {
		IfcParameterValuevalue_Att : Logical;
		IfcCartesianPointvalue_ContRef : IfcCartesianPoint?;
	};

	type IfcSpecularHighlightSelect {
		IfcSpecularRoughnessvalue_Att : Logical;
		IfcSpecularExponentvalue_Att : Logical;
	};

	type IfcSizeSelect {
		IfcPositiveRatioMeasurevalue_Att : Logical;
		IfcNormalisedRatioMeasurevalue_Att : Logical;
		IfcPositiveLengthMeasurevalue_Att : Logical;
		IfcDescriptiveMeasurevalue_Att : Logical;
		IfcLengthMeasurevalue_Att : Logical;
		IfcRatioMeasurevalue_Att : Logical;
	};

	type IfcSimpleValue {
		IfcLogicalvalue_Att : Logical;
		IfcLabelvalue_Att : Logical;
		IfcTextvalue_Att : Logical;
		IfcIdentifiervalue_Att : Logical;
		IfcBooleanvalue_Att : Logical;
		IfcRealvalue_Att : Logical;
		IfcIntegervalue_Att : Logical;
	};

	type IfcPresentationStyleSelect {
		IfcNullStylevalue_Att : IfcNullStyle?;
		IfcSurfaceStylevalue_ContRef : IfcSurfaceStyle?;
		IfcTextStylevalue_ContRef : IfcTextStyle?;
		IfcFillAreaStylevalue_ContRef : IfcFillAreaStyle?;
		IfcSymbolStylevalue_ContRef : IfcSymbolStyle?;
		IfcCurveStylevalue_ContRef : IfcCurveStyle?;
	};

	type IfcOrientationSelect {
		IfcPlaneAngleMeasurevalue_Att : Logical;
		IfcDirectionvalue_ContRef : IfcDirection?;
	};

	type IfcMetricValueSelect {
		IfcDateTimeSelectvalue_ContRef : IfcDateTimeSelect?;
		IfcTextvalue_Att : Logical;
		IfcCostValuevalue_ContRef : IfcCostValue?;
		IfcTimeSeriesvalue_ContRef : IfcTimeSeries?;
		IfcTablevalue_ContRef : IfcTable?;
		IfcMeasureWithUnitvalue_ContRef : IfcMeasureWithUnit?;
	};

	type IfcMeasureValue {
		IfcNormalisedRatioMeasurevalue_Att : Logical;
		IfcLuminousIntensityMeasurevalue_Att : Logical;
		IfcAmountOfSubstanceMeasurevalue_Att : Logical;
		IfcAreaMeasurevalue_Att : Logical;
		IfcContextDependentMeasurevalue_Att : Logical;
		IfcCountMeasurevalue_Att : Logical;
		IfcDescriptiveMeasurevalue_Att : Logical;
		IfcElectricCurrentMeasurevalue_Att : Logical;
		IfcLengthMeasurevalue_Att : Logical;
		IfcPositiveLengthMeasurevalue_Att : Logical;
		IfcMassMeasurevalue_Att : Logical;
		IfcNumericMeasurevalue_Att : Logical;
		IfcParameterValuevalue_Att : Logical;
		IfcPlaneAngleMeasurevalue_Att : Logical;
		IfcPositivePlaneAngleMeasurevalue_Att : Logical;
		IfcRatioMeasurevalue_Att : Logical;
		IfcPositiveRatioMeasurevalue_Att : Logical;
		IfcSolidAngleMeasurevalue_Att : Logical;
		IfcThermodynamicTemperatureMeasurevalue_Att : Logical;
		IfcTimeMeasurevalue_Att : Logical;
		IfcVolumeMeasurevalue_Att : Logical;
	};

	type IfcHatchLineDistanceSelect {
		IfcPositiveLengthMeasurevalue_Att : Logical;
		IfcOneDirectionRepeatFactorvalue_ContRef : IfcOneDirectionRepeatFactor?;
	};

	type IfcDerivedMeasureValue {
		IfcIonConcentrationMeasurevalue_Att : Logical;
		IfcPHMeasurevalue_Att : Logical;
		IfcHeatingValueMeasurevalue_Att : Logical;
		IfcSoundPressureMeasurevalue_Att : Logical;
		IfcSoundPowerMeasurevalue_Att : Logical;
		IfcWarpingMomentMeasurevalue_Att : Logical;
		IfcWarpingConstantMeasurevalue_Att : Logical;
		IfcThermalExpansionCoefficientMeasurevalue_Att : Logical;
		IfcTemperatureGradientMeasurevalue_Att : Logical;
		IfcSectionModulusMeasurevalue_Att : Logical;
		IfcSectionalAreaIntegralMeasurevalue_Att : Logical;
		IfcRotationalMassMeasurevalue_Att : Logical;
		IfcModulusOfRotationalSubgradeReactionMeasurevalue_Att : Logical;
		IfcModulusOfLinearSubgradeReactionMeasurevalue_Att : Logical;
		IfcMassPerLengthMeasurevalue_Att : Logical;
		IfcCurvatureMeasurevalue_Att : Logical;
		IfcLuminousIntensityDistributionMeasurevalue_Att : Logical;
		IfcLinearMomentMeasurevalue_Att : Logical;
		IfcShearModulusMeasurevalue_Att : Logical;
		IfcRotationalStiffnessMeasurevalue_Att : Logical;
		IfcPlanarForceMeasurevalue_Att : Logical;
		IfcMomentOfInertiaMeasurevalue_Att : Logical;
		IfcModulusOfElasticityMeasurevalue_Att : Logical;
		IfcModulusOfSubgradeReactionMeasurevalue_Att : Logical;
		IfcLinearStiffnessMeasurevalue_Att : Logical;
		IfcLinearForceMeasurevalue_Att : Logical;
		IfcAccelerationMeasurevalue_Att : Logical;
		IfcTorqueMeasurevalue_Att : Logical;
		IfcRotationalFrequencyMeasurevalue_Att : Logical;
		IfcRadioActivityMeasurevalue_Att : Logical;
		IfcAbsorbedDoseMeasurevalue_Att : Logical;
		IfcElectricCapacitanceMeasurevalue_Att : Logical;
		IfcDoseEquivalentMeasurevalue_Att : Logical;
		IfcElectricChargeMeasurevalue_Att : Logical;
		IfcElectricConductanceMeasurevalue_Att : Logical;
		IfcElectricResistanceMeasurevalue_Att : Logical;
		IfcIlluminanceMeasurevalue_Att : Logical;
		IfcInductanceMeasurevalue_Att : Logical;
		IfcForceMeasurevalue_Att : Logical;
		IfcLuminousFluxMeasurevalue_Att : Logical;
		IfcMagneticFluxMeasurevalue_Att : Logical;
		IfcMagneticFluxDensityMeasurevalue_Att : Logical;
		IfcMonetaryMeasurevalue_Att : Logical;
		IfcSpecificHeatCapacityMeasurevalue_Att : Logical;
		IfcIsothermalMoistureCapacityMeasurevalue_Att : Logical;
		IfcMoistureDiffusivityMeasurevalue_Att : Logical;
		IfcVaporPermeabilityMeasurevalue_Att : Logical;
		IfcMolecularWeightMeasurevalue_Att : Logical;
		IfcThermalConductivityMeasurevalue_Att : Logical;
		IfcAngularVelocityMeasurevalue_Att : Logical;
		IfcDynamicViscosityMeasurevalue_Att : Logical;
		IfcElectricVoltageMeasurevalue_Att : Logical;
		IfcEnergyMeasurevalue_Att : Logical;
		IfcFrequencyMeasurevalue_Att : Logical;
		IfcHeatFluxDensityMeasurevalue_Att : Logical;
		IfcIntegerCountRateMeasurevalue_Att : Logical;
		IfcKinematicViscosityMeasurevalue_Att : Logical;
		IfcLinearVelocityMeasurevalue_Att : Logical;
		IfcMassDensityMeasurevalue_Att : Logical;
		IfcMassFlowRateMeasurevalue_Att : Logical;
		IfcPowerMeasurevalue_Att : Logical;
		IfcPressureMeasurevalue_Att : Logical;
		IfcThermalAdmittanceMeasurevalue_Att : Logical;
		IfcThermalResistanceMeasurevalue_Att : Logical;
		IfcThermalTransmittanceMeasurevalue_Att : Logical;
		IfcTimeStampvalue_Att : Logical;
		IfcVolumetricFlowRateMeasurevalue_Att : Logical;
	};

	type IfcConditionCriterionSelect {
		IfcLabelvalue_Att : Logical;
		IfcMeasureWithUnitvalue_ContRef : IfcMeasureWithUnit?;
	};

	type IfcColourOrFactor {
		IfcNormalisedRatioMeasurevalue_Att : Logical;
		IfcColourRgbvalue_ContRef : IfcColourRgb?;
	};

	type IfcAppliedValueSelect {
		IfcMonetaryMeasurevalue_Att : Logical;
		IfcRatioMeasurevalue_Att : Logical;
		IfcMeasureWithUnitvalue_ContRef : IfcMeasureWithUnit?;
	};

	type Ifc2DCompositeCurve : IfcCompositeCurve;

	type IfcActionRequest : IfcControl {
		RequestID_Att : Logical;
	};

	type IfcActor : IfcObject {
		IsActingUpon_Ref : IfcRelAssignsToActor;
		TheActor_Ref : IfcActorSelect;
	};

	type IfcActorRole {
		Role_Att : IfcRoleEnum;
		UserDefinedRole_Att : Logical;
		Description_Att : Logical;
	};

	type IfcActuatorType : IfcDistributionControlElementType {
		PredefinedType_Att : IfcActuatorTypeEnum;
	};

	type IfcAddress : IfcObjectReferenceSelect {
		Purpose_Att : IfcAddressTypeEnum?;
		Description_Att : Logical;
		UserDefinedPurpose_Att : Logical;
		OfPerson_Ref : IfcPerson;
		OfOrganization_Ref : IfcOrganization;
	};

	type IfcAirTerminalBoxType : IfcFlowControllerType {
		PredefinedType_Att : IfcAirTerminalBoxTypeEnum;
	};

	type IfcAirTerminalType : IfcFlowTerminalType {
		PredefinedType_Att : IfcAirTerminalTypeEnum;
	};

	type IfcAirToAirHeatRecoveryType : IfcEnergyConversionDeviceType {
		PredefinedType_Att : IfcAirToAirHeatRecoveryTypeEnum;
	};

	type IfcAlarmType : IfcDistributionControlElementType {
		PredefinedType_Att : IfcAlarmTypeEnum;
	};

	type IfcAngularDimension : IfcDimensionCurveDirectedCallout;

	type IfcAnnotation : IfcProduct;

	type IfcAnnotationCurveOccurrence : IfcDraughtingCalloutElement, IfcAnnotationOccurrence {
		AnnotatedBySymbols_Ref : IfcTerminatorSymbol;
	};

	type IfcAnnotationFillArea : IfcGeometricRepresentationItem {
		OuterBoundary_Ref : IfcCurve;
		InnerBoundaries_Ref : IfcCurve*;
	};

	type IfcAnnotationFillAreaOccurrence : IfcAnnotationOccurrence {
		FillStyleTarget_Ref : IfcPoint?;
		GlobalOrLocal_Att : IfcGlobalOrLocalEnum?;
	};

	type IfcAnnotationOccurrence : IfcStyledItem;

	type IfcAnnotationSurface : IfcGeometricRepresentationItem {
		Item_Ref : IfcGeometricRepresentationItem;
		TextureCoordinates_Ref : IfcTextureCoordinate?;
	};

	type IfcAnnotationSurfaceOccurrence : IfcAnnotationOccurrence;

	type IfcAnnotationSymbolOccurrence : IfcDraughtingCalloutElement, IfcAnnotationOccurrence;

	type IfcAnnotationTextOccurrence : IfcDraughtingCalloutElement, IfcAnnotationOccurrence;

	type IfcApplication {
		Version_Att : Logical;
		ApplicationFullName_Att : Logical;
		ApplicationIdentifier_Att : Logical;
		ApplicationDeveloper_Ref : IfcOrganization;
	};

	type IfcAppliedValue : IfcObjectReferenceSelect {
		Name_Att : Logical;
		Description_Att : Logical;
		AppliedValue_Ref : IfcAppliedValueSelect?;
		ValuesReferenced_Ref : IfcReferencesValueDocument;
		ValueOfComponents_Ref : IfcAppliedValueRelationship;
		IsComponentIn_Ref : IfcAppliedValueRelationship;
		UnitBasis_Ref : IfcMeasureWithUnit?;
		ApplicableDate_Ref : IfcDateTimeSelect?;
		FixedUntilDate_Ref : IfcDateTimeSelect?;
	};

	type IfcAppliedValueRelationship {
		ArithmeticOperator_Att : IfcArithmeticOperatorEnum;
		Name_Att : Logical;
		Description_Att : Logical;
		ComponentOfTotal_Ref : IfcAppliedValue;
		Components_Ref : IfcAppliedValue+;
	};

	type IfcApproval {
		Description_Att : Logical;
		ApprovalStatus_Att : Logical;
		ApprovalLevel_Att : Logical;
		ApprovalQualifier_Att : Logical;
		Name_Att : Logical;
		Identifier_Att : Logical;
		Actors_Ref : IfcApprovalActorRelationship;
		IsRelatedWith_Ref : IfcApprovalRelationship;
		Relates_Ref : IfcApprovalRelationship;
		ApprovalDateTime_Ref : IfcDateTimeSelect;
	};

	type IfcApprovalActorRelationship {
		Actor_Ref : IfcActorSelect;
		Approval_Ref : IfcApproval;
		Role_Ref : IfcActorRole;
	};

	type IfcApprovalPropertyRelationship {
		ApprovedProperties_Ref : IfcProperty+;
		Approval_Ref : IfcApproval;
	};

	type IfcApprovalRelationship {
		Description_Att : Logical;
		Name_Att : Logical;
		RelatedApproval_Ref : IfcApproval;
		RelatingApproval_Ref : IfcApproval;
	};

	type IfcArbitraryClosedProfileDef : IfcProfileDef {
		OuterCurve_Ref : IfcCurve;
	};

	type IfcArbitraryOpenProfileDef : IfcProfileDef {
		Curve_Ref : IfcBoundedCurve;
	};

	type IfcArbitraryProfileDefWithVoids : IfcArbitraryClosedProfileDef {
		InnerCurves_Ref : IfcCurve+;
	};

	type IfcAsset : IfcGroup {
		OriginalValue_Ref : IfcCostValue;
		CurrentValue_Ref : IfcCostValue;
		TotalReplacementCost_Ref : IfcCostValue;
		Owner_Ref : IfcActorSelect;
		User_Ref : IfcActorSelect;
		ResponsiblePerson_Ref : IfcPerson;
		IncorporationDate_Ref : IfcCalendarDate;
		DepreciatedValue_Ref : IfcCostValue;
		AssetID_Att : Logical;
	};

	type IfcAsymmetricIShapeProfileDef : IfcIShapeProfileDef {
		TopFlangeWidth_Att : Logical;
		TopFlangeThickness_Att : Logical;
		TopFlangeFilletRadius_Att : Logical;
		CentreOfGravityInY_Att : Logical;
	};

	type IfcAxis1Placement : IfcPlacement {
		Axis_Ref : IfcDirection?;
	};

	type IfcAxis2Placement2D : IfcAxis2Placement, IfcPlacement {
		RefDirection_Ref : IfcDirection?;
	};

	type IfcAxis2Placement3D : IfcAxis2Placement, IfcPlacement {
		Axis_Ref : IfcDirection?;
		RefDirection_Ref : IfcDirection?;
	};

	type IfcBSplineCurve : IfcBoundedCurve {
		Degree_Att : Logical;
		CurveForm_Att : IfcBSplineCurveForm;
		ClosedCurve_Att : Logical;
		SelfIntersect_Att : Logical;
		ControlPointsList_Ref : IfcCartesianPoint#2 ..;
	};

	type IfcBeam : IfcBuildingElement;

	type IfcBeamType : IfcBuildingElementType {
		PredefinedType_Att : IfcBeamTypeEnum;
	};

	type IfcBezierCurve : IfcBSplineCurve;

	type IfcBlobTexture : IfcSurfaceTexture {
		RasterFormat_Att : Logical;
		RasterCode_Att : Logical;
	};

	type IfcBlock : IfcCsgPrimitive3D {
		XLength_Att : Logical;
		YLength_Att : Logical;
		ZLength_Att : Logical;
	};

	type IfcBoilerType : IfcEnergyConversionDeviceType {
		PredefinedType_Att : IfcBoilerTypeEnum;
	};

	type IfcBooleanClippingResult : IfcBooleanResult;

	type IfcBooleanResult : IfcBooleanOperand, IfcCsgSelect, IfcGeometricRepresentationItem {
		FirstOperand_Ref : IfcBooleanOperand;
		SecondOperand_Ref : IfcBooleanOperand;
		Operator_Att : IfcBooleanOperator;
	};

	type IfcBoundaryCondition {
		Name_Att : Logical;
	};

	type IfcBoundaryEdgeCondition : IfcBoundaryCondition {
		LinearStiffnessByLengthX_Att : Logical;
		LinearStiffnessByLengthY_Att : Logical;
		LinearStiffnessByLengthZ_Att : Logical;
		RotationalStiffnessByLengthX_Att : Logical;
		RotationalStiffnessByLengthY_Att : Logical;
		RotationalStiffnessByLengthZ_Att : Logical;
	};

	type IfcBoundaryFaceCondition : IfcBoundaryCondition {
		LinearStiffnessByAreaX_Att : Logical;
		LinearStiffnessByAreaY_Att : Logical;
		LinearStiffnessByAreaZ_Att : Logical;
	};

	type IfcBoundaryNodeCondition : IfcBoundaryCondition {
		LinearStiffnessX_Att : Logical;
		LinearStiffnessY_Att : Logical;
		LinearStiffnessZ_Att : Logical;
		RotationalStiffnessX_Att : Logical;
		RotationalStiffnessY_Att : Logical;
		RotationalStiffnessZ_Att : Logical;
	};

	type IfcBoundaryNodeConditionWarping : IfcBoundaryNodeCondition {
		WarpingStiffness_Att : Logical;
	};

	type IfcBoundedCurve : IfcCurveOrEdgeCurve, IfcCurve;

	type IfcBoundedSurface : IfcSurface;

	type IfcBoundingBox : IfcGeometricRepresentationItem {
		XDim_Att : Logical;
		YDim_Att : Logical;
		ZDim_Att : Logical;
		Corner_Ref : IfcCartesianPoint;
	};

	type IfcBoxedHalfSpace : IfcHalfSpaceSolid {
		Enclosure_Ref : IfcBoundingBox;
	};

	type IfcBuilding : IfcSpatialStructureElement {
		ElevationOfRefHeight_Att : Logical;
		ElevationOfTerrain_Att : Logical;
		BuildingAddress_Ref : IfcPostalAddress?;
	};

	type IfcBuildingElement : IfcElement;

	type IfcBuildingElementComponent : IfcBuildingElement;

	type IfcBuildingElementPart : IfcBuildingElementComponent;

	type IfcBuildingElementProxy : IfcBuildingElement {
		CompositionType_Att : IfcElementCompositionEnum?;
	};

	type IfcBuildingElementProxyType : IfcBuildingElementType {
		PredefinedType_Att : IfcBuildingElementProxyTypeEnum;
	};

	type IfcBuildingElementType : IfcElementType;

	type IfcBuildingStorey : IfcSpatialStructureElement {
		Elevation_Att : Logical;
	};

	type IfcCShapeProfileDef : IfcParameterizedProfileDef {
		Depth_Att : Logical;
		Width_Att : Logical;
		WallThickness_Att : Logical;
		Girth_Att : Logical;
		InternalFilletRadius_Att : Logical;
		CentreOfGravityInX_Att : Logical;
	};

	type IfcCableCarrierFittingType : IfcFlowFittingType {
		PredefinedType_Att : IfcCableCarrierFittingTypeEnum;
	};

	type IfcCableCarrierSegmentType : IfcFlowSegmentType {
		PredefinedType_Att : IfcCableCarrierSegmentTypeEnum;
	};

	type IfcCableSegmentType : IfcFlowSegmentType {
		PredefinedType_Att : IfcCableSegmentTypeEnum;
	};

	type IfcCalendarDate : IfcDateTimeSelect, IfcObjectReferenceSelect {
		DayComponent_Att : Logical;
		MonthComponent_Att : Logical;
		YearComponent_Att : Logical;
	};

	type IfcCartesianPoint : IfcPoint {
		Coordinates_Att : Logical;
	};

	type IfcCartesianTransformationOperator : IfcGeometricRepresentationItem {
		Axis1_Ref : IfcDirection?;
		Axis2_Ref : IfcDirection?;
		LocalOrigin_Ref : IfcCartesianPoint;
		Scale_Att : Logical;
	};

	type IfcCartesianTransformationOperator2D : IfcCartesianTransformationOperator;

	type IfcCartesianTransformationOperator2DnonUniform : IfcCartesianTransformationOperator2D {
		Scale2_Att : Logical;
	};

	type IfcCartesianTransformationOperator3D : IfcCartesianTransformationOperator {
		Axis3_Ref : IfcDirection?;
	};

	type IfcCartesianTransformationOperator3DnonUniform : IfcCartesianTransformationOperator3D {
		Scale2_Att : Logical;
		Scale3_Att : Logical;
	};

	type IfcCenterLineProfileDef : IfcArbitraryOpenProfileDef {
		Thickness_Att : Logical;
	};

	type IfcChamferEdgeFeature : IfcEdgeFeature {
		Width_Att : Logical;
		Height_Att : Logical;
	};

	type IfcChillerType : IfcEnergyConversionDeviceType {
		PredefinedType_Att : IfcChillerTypeEnum;
	};

	type IfcCircle : IfcConic {
		Radius_Att : Logical;
	};

	type IfcCircleHollowProfileDef : IfcCircleProfileDef {
		WallThickness_Att : Logical;
	};

	type IfcCircleProfileDef : IfcParameterizedProfileDef {
		Radius_Att : Logical;
	};

	type IfcClassification {
		Source_Att : Logical;
		Edition_Att : Logical;
		Name_Att : Logical;
		Contains_Ref : IfcClassificationItem;
		EditionDate_Ref : IfcCalendarDate?;
	};

	type IfcClassificationItem {
		IsClassifiedItemIn_Ref : IfcClassificationItemRelationship;
		IsClassifyingItemIn_Ref : IfcClassificationItemRelationship;
		Notation_Ref : IfcClassificationNotationFacet;
		ItemOf_Ref : IfcClassification?;
		Title_Att : Logical;
	};

	type IfcClassificationItemRelationship {
		RelatingItem_Ref : IfcClassificationItem;
		RelatedItems_Ref : IfcClassificationItem+;
	};

	type IfcClassificationNotation : IfcClassificationNotationSelect {
		NotationFacets_Ref : IfcClassificationNotationFacet+;
	};

	type IfcClassificationNotationFacet {
		NotationValue_Att : Logical;
	};

	type IfcClassificationReference : IfcClassificationNotationSelect, IfcExternalReference {
		ReferencedSource_Ref : IfcClassification?;
	};

	type IfcClosedShell : IfcShell, IfcConnectedFaceSet;

	type IfcCoilType : IfcEnergyConversionDeviceType {
		PredefinedType_Att : IfcCoilTypeEnum;
	};

	type IfcColourRgb : IfcColourSpecification {
		Red_Att : Logical;
		Green_Att : Logical;
		Blue_Att : Logical;
	};

	type IfcColourSpecification : IfcColour {
		Name_Att : Logical;
	};

	type IfcColumn : IfcBuildingElement;

	type IfcColumnType : IfcBuildingElementType {
		PredefinedType_Att : IfcColumnTypeEnum;
	};

	type IfcComplexProperty : IfcProperty {
		HasProperties_Ref : IfcProperty+;
		UsageName_Att : Logical;
	};

	type IfcCompositeCurve : IfcBoundedCurve {
		Segments_Ref : IfcCompositeCurveSegment+;
		SelfIntersect_Att : Logical;
	};

	type IfcCompositeCurveSegment : IfcGeometricRepresentationItem {
		Transition_Att : IfcTransitionCode;
		SameSense_Att : Logical;
		UsingCurves_Ref : IfcCompositeCurve;
		ParentCurve_Ref : IfcCurve;
	};

	type IfcCompositeProfileDef : IfcProfileDef {
		Profiles_Ref : IfcProfileDef#2 ..;
		Label_Att : Logical;
	};

	type IfcCompressorType : IfcFlowMovingDeviceType {
		PredefinedType_Att : IfcCompressorTypeEnum;
	};

	type IfcCondenserType : IfcEnergyConversionDeviceType {
		PredefinedType_Att : IfcCondenserTypeEnum;
	};

	type IfcCondition : IfcGroup;

	type IfcConditionCriterion : IfcControl {
		Criterion_Ref : IfcConditionCriterionSelect;
		CriterionDateTime_Ref : IfcDateTimeSelect;
	};

	type IfcConic : IfcCurve {
		Position_Ref : IfcAxis2Placement;
	};

	type IfcConnectedFaceSet : IfcTopologicalRepresentationItem {
		CfsFaces_Ref : IfcFace+;
	};

	type IfcConnectionCurveGeometry : IfcConnectionGeometry {
		CurveOnRelatingElement_Ref : IfcCurveOrEdgeCurve;
		CurveOnRelatedElement_Ref : IfcCurveOrEdgeCurve?;
	};

	type IfcConnectionGeometry;

	type IfcConnectionPointEccentricity : IfcConnectionPointGeometry {
		EccentricityInX_Att : Logical;
		EccentricityInY_Att : Logical;
		EccentricityInZ_Att : Logical;
	};

	type IfcConnectionPointGeometry : IfcConnectionGeometry {
		PointOnRelatingElement_Ref : IfcPointOrVertexPoint;
		PointOnRelatedElement_Ref : IfcPointOrVertexPoint?;
	};

	type IfcConnectionPortGeometry : IfcConnectionGeometry {
		LocationAtRelatingElement_Ref : IfcAxis2Placement;
		LocationAtRelatedElement_Ref : IfcAxis2Placement?;
		ProfileOfPort_Ref : IfcProfileDef;
	};

	type IfcConnectionSurfaceGeometry : IfcConnectionGeometry {
		SurfaceOnRelatingElement_Ref : IfcSurfaceOrFaceSurface;
		SurfaceOnRelatedElement_Ref : IfcSurfaceOrFaceSurface?;
	};

	type IfcConstraint {
		Name_Att : Logical;
		Description_Att : Logical;
		ConstraintGrade_Att : IfcConstraintEnum;
		ConstraintSource_Att : Logical;
		UserDefinedGrade_Att : Logical;
		ClassifiedAs_Ref : IfcConstraintClassificationRelationship;
		RelatesConstraints_Ref : IfcConstraintRelationship;
		IsRelatedWith_Ref : IfcConstraintRelationship;
		PropertiesForConstraint_Ref : IfcPropertyConstraintRelationship;
		Aggregates_Ref : IfcConstraintAggregationRelationship;
		IsAggregatedIn_Ref : IfcConstraintAggregationRelationship;
		CreatingActor_Ref : IfcActorSelect?;
		CreationTime_Ref : IfcDateTimeSelect?;
	};

	type IfcConstraintAggregationRelationship {
		Name_Att : Logical;
		Description_Att : Logical;
		LogicalAggregator_Att : IfcLogicalOperatorEnum;
		RelatingConstraint_Ref : IfcConstraint;
		RelatedConstraints_Ref : IfcConstraint+;
	};

	type IfcConstraintClassificationRelationship {
		ClassifiedConstraint_Ref : IfcConstraint;
		RelatedClassifications_Ref : IfcClassificationNotationSelect+;
	};

	type IfcConstraintRelationship {
		Name_Att : Logical;
		Description_Att : Logical;
		RelatingConstraint_Ref : IfcConstraint;
		RelatedConstraints_Ref : IfcConstraint+;
	};

	type IfcConstructionEquipmentResource : IfcConstructionResource;

	type IfcConstructionMaterialResource : IfcConstructionResource {
		Suppliers_Ref : IfcActorSelect*;
		UsageRatio_Att : Logical;
	};

	type IfcConstructionProductResource : IfcConstructionResource;

	type IfcConstructionResource : IfcResource {
		ResourceIdentifier_Att : Logical;
		ResourceGroup_Att : Logical;
		ResourceConsumption_Att : IfcResourceConsumptionEnum?;
		BaseQuantity_Ref : IfcMeasureWithUnit?;
	};

	type IfcContextDependentUnit : IfcNamedUnit {
		Name_Att : Logical;
	};

	type IfcControl : IfcObject {
		Controls_Ref : IfcRelAssignsToControl;
	};

	type IfcControllerType : IfcDistributionControlElementType {
		PredefinedType_Att : IfcControllerTypeEnum;
	};

	type IfcConversionBasedUnit : IfcNamedUnit {
		ConversionFactor_Ref : IfcMeasureWithUnit;
		Name_Att : Logical;
	};

	type IfcCooledBeamType : IfcEnergyConversionDeviceType {
		PredefinedType_Att : IfcCooledBeamTypeEnum;
	};

	type IfcCoolingTowerType : IfcEnergyConversionDeviceType {
		PredefinedType_Att : IfcCoolingTowerTypeEnum;
	};

	type IfcCoordinatedUniversalTimeOffset {
		HourOffset_Att : Logical;
		MinuteOffset_Att : Logical;
		Sense_Att : IfcAheadOrBehind;
	};

	type IfcCostItem : IfcControl;

	type IfcCostSchedule : IfcControl {
		Status_Att : Logical;
		ID_Att : Logical;
		PredefinedType_Att : IfcCostScheduleTypeEnum;
		SubmittedBy_Ref : IfcActorSelect?;
		PreparedBy_Ref : IfcActorSelect?;
		SubmittedOn_Ref : IfcDateTimeSelect?;
		TargetUsers_Ref : IfcActorSelect*;
		UpdateDate_Ref : IfcDateTimeSelect?;
	};

	type IfcCostValue : IfcAppliedValue {
		CostType_Att : Logical;
		Condition_Att : Logical;
	};

	type IfcCovering : IfcBuildingElement {
		CoversSpaces_Ref : IfcRelCoversSpaces;
		Covers_Ref : IfcRelCoversBldgElements;
		PredefinedType_Att : IfcCoveringTypeEnum?;
	};

	type IfcCoveringType : IfcBuildingElementType {
		PredefinedType_Att : IfcCoveringTypeEnum;
	};

	type IfcCraneRailAShapeProfileDef : IfcParameterizedProfileDef {
		OverallHeight_Att : Logical;
		BaseWidth2_Att : Logical;
		Radius_Att : Logical;
		HeadWidth_Att : Logical;
		HeadDepth2_Att : Logical;
		HeadDepth3_Att : Logical;
		WebThickness_Att : Logical;
		BaseWidth4_Att : Logical;
		BaseDepth1_Att : Logical;
		BaseDepth2_Att : Logical;
		BaseDepth3_Att : Logical;
		CentreOfGravityInY_Att : Logical;
	};

	type IfcCraneRailFShapeProfileDef : IfcParameterizedProfileDef {
		OverallHeight_Att : Logical;
		HeadWidth_Att : Logical;
		Radius_Att : Logical;
		HeadDepth2_Att : Logical;
		HeadDepth3_Att : Logical;
		WebThickness_Att : Logical;
		BaseDepth1_Att : Logical;
		BaseDepth2_Att : Logical;
		CentreOfGravityInY_Att : Logical;
	};

	type IfcCrewResource : IfcConstructionResource;

	type IfcCsgPrimitive3D : IfcBooleanOperand, IfcCsgSelect, IfcGeometricRepresentationItem {
		Position_Ref : IfcAxis2Placement3D;
	};

	type IfcCsgSolid : IfcSolidModel {
		TreeRootExpression_Ref : IfcCsgSelect;
	};

	type IfcCurrencyRelationship {
		RelatingMonetaryUnit_Ref : IfcMonetaryUnit;
		RelatedMonetaryUnit_Ref : IfcMonetaryUnit;
		RateDateTime_Ref : IfcDateAndTime;
		RateSource_Ref : IfcLibraryInformation?;
		ExchangeRate_Att : Logical;
	};

	type IfcCurtainWall : IfcBuildingElement;

	type IfcCurtainWallType : IfcBuildingElementType {
		PredefinedType_Att : IfcCurtainWallTypeEnum;
	};

	type IfcCurve : IfcGeometricSetSelect, IfcGeometricRepresentationItem;

	type IfcCurveBoundedPlane : IfcBoundedSurface {
		BasisSurface_Ref : IfcPlane;
		OuterBoundary_Ref : IfcCurve;
		InnerBoundaries_Ref : IfcCurve*;
	};

	type IfcCurveStyle : IfcPresentationStyle {
		CurveFont_Ref : IfcCurveFontOrScaledCurveFontSelect?;
		CurveWidth_Ref : IfcSizeSelect?;
		CurveColour_Ref : IfcColour?;
	};

	type IfcCurveStyleFont : IfcCurveStyleFontSelect {
		PatternList_Ref : IfcCurveStyleFontPattern+;
		Name_Att : Logical;
	};

	type IfcCurveStyleFontAndScaling : IfcCurveFontOrScaledCurveFontSelect {
		Name_Att : Logical;
		CurveFontScaling_Att : Logical;
		CurveFont_Ref : IfcCurveStyleFontSelect;
	};

	type IfcCurveStyleFontPattern {
		VisibleSegmentLength_Att : Logical;
		InvisibleSegmentLength_Att : Logical;
	};

	type IfcDamperType : IfcFlowControllerType {
		PredefinedType_Att : IfcDamperTypeEnum;
	};

	type IfcDateAndTime : IfcDateTimeSelect, IfcObjectReferenceSelect {
		DateComponent_Ref : IfcCalendarDate;
		TimeComponent_Ref : IfcLocalTime;
	};

	type IfcDefinedSymbol : IfcGeometricRepresentationItem {
		Definition_Ref : IfcDefinedSymbolSelect;
		Target_Ref : IfcCartesianTransformationOperator2D;
	};

	type IfcDerivedProfileDef : IfcProfileDef {
		ParentProfile_Ref : IfcProfileDef;
		Operator_Ref : IfcCartesianTransformationOperator2D;
		Label_Att : Logical;
	};

	type IfcDerivedUnit : IfcUnit {
		UnitType_Att : IfcDerivedUnitEnum;
		UserDefinedType_Att : Logical;
		Elements_Ref : IfcDerivedUnitElement+;
	};

	type IfcDerivedUnitElement {
		Unit_Ref : IfcNamedUnit;
		Exponent_Att : Logical;
	};

	type IfcDiameterDimension : IfcDimensionCurveDirectedCallout;

	type IfcDimensionCalloutRelationship : IfcDraughtingCalloutRelationship;

	type IfcDimensionCurve : IfcAnnotationCurveOccurrence;

	type IfcDimensionCurveDirectedCallout : IfcDraughtingCallout;

	type IfcDimensionCurveTerminator : IfcTerminatorSymbol {
		Role_Att : IfcDimensionExtentUsage;
	};

	type IfcDimensionPair : IfcDraughtingCalloutRelationship;

	type IfcDimensionalExponents {
		LengthExponent_Att : Logical;
		MassExponent_Att : Logical;
		TimeExponent_Att : Logical;
		ElectricCurrentExponent_Att : Logical;
		ThermodynamicTemperatureExponent_Att : Logical;
		AmountOfSubstanceExponent_Att : Logical;
		LuminousIntensityExponent_Att : Logical;
	};

	type IfcDirection : IfcVectorOrDirection, IfcGeometricRepresentationItem {
		DirectionRatios_Att : Logical;
	};

	type IfcDiscreteAccessory : IfcElementComponent;

	type IfcDiscreteAccessoryType : IfcElementComponentType;

	type IfcDistributionChamberElement : IfcDistributionFlowElement;

	type IfcDistributionChamberElementType : IfcDistributionFlowElementType {
		PredefinedType_Att : IfcDistributionChamberElementTypeEnum;
	};

	type IfcDistributionControlElement : IfcDistributionElement {
		AssignedToFlowElement_Ref : IfcRelFlowControlElements;
		ControlElementId_Att : Logical;
	};

	type IfcDistributionControlElementType : IfcDistributionElementType;

	type IfcDistributionElement : IfcElement;

	type IfcDistributionElementType : IfcElementType;

	type IfcDistributionFlowElement : IfcDistributionElement {
		HasControlElements_Ref : IfcRelFlowControlElements;
	};

	type IfcDistributionFlowElementType : IfcDistributionElementType;

	type IfcDistributionPort : IfcPort {
		FlowDirection_Att : IfcFlowDirectionEnum?;
	};

	type IfcDocumentElectronicFormat {
		FileExtension_Att : Logical;
		MimeContentType_Att : Logical;
		MimeSubtype_Att : Logical;
	};

	type IfcDocumentInformation : IfcDocumentSelect {
		DocumentId_Att : Logical;
		Name_Att : Logical;
		Description_Att : Logical;
		Purpose_Att : Logical;
		IntendedUse_Att : Logical;
		Scope_Att : Logical;
		Revision_Att : Logical;
		Confidentiality_Att : IfcDocumentConfidentialityEnum?;
		Status_Att : IfcDocumentStatusEnum?;
		IsPointedTo_Ref : IfcDocumentInformationRelationship;
		IsPointer_Ref : IfcDocumentInformationRelationship;
		DocumentReferences_Ref : IfcDocumentReference*;
		DocumentOwner_Ref : IfcActorSelect?;
		Editors_Ref : IfcActorSelect*;
		CreationTime_Ref : IfcDateAndTime?;
		LastRevisionTime_Ref : IfcDateAndTime?;
		ElectronicFormat_Ref : IfcDocumentElectronicFormat?;
		ValidFrom_Ref : IfcCalendarDate?;
		ValidUntil_Ref : IfcCalendarDate?;
	};

	type IfcDocumentInformationRelationship {
		RelatingDocument_Ref : IfcDocumentInformation;
		RelatedDocuments_Ref : IfcDocumentInformation+;
		RelationshipType_Att : Logical;
	};

	type IfcDocumentReference : IfcDocumentSelect, IfcExternalReference {
		ReferenceToDocument_Ref : IfcDocumentInformation;
	};

	type IfcDoor : IfcBuildingElement {
		OverallHeight_Att : Logical;
		OverallWidth_Att : Logical;
	};

	type IfcDoorLiningProperties : IfcPropertySetDefinition {
		LiningDepth_Att : Logical;
		LiningThickness_Att : Logical;
		ThresholdDepth_Att : Logical;
		ThresholdThickness_Att : Logical;
		TransomThickness_Att : Logical;
		TransomOffset_Att : Logical;
		LiningOffset_Att : Logical;
		ThresholdOffset_Att : Logical;
		CasingThickness_Att : Logical;
		CasingDepth_Att : Logical;
		ShapeAspectStyle_Ref : IfcShapeAspect?;
	};

	type IfcDoorPanelProperties : IfcPropertySetDefinition {
		PanelDepth_Att : Logical;
		PanelOperation_Att : IfcDoorPanelOperationEnum;
		PanelWidth_Att : Logical;
		PanelPosition_Att : IfcDoorPanelPositionEnum;
		ShapeAspectStyle_Ref : IfcShapeAspect?;
	};

	type IfcDoorStyle : IfcTypeProduct {
		OperationType_Att : IfcDoorStyleOperationEnum;
		ConstructionType_Att : IfcDoorStyleConstructionEnum;
		ParameterTakesPrecedence_Att : Logical;
		Sizeable_Att : Logical;
	};

	type IfcDraughtingCallout : IfcGeometricRepresentationItem {
		IsRelatedFromCallout_Ref : IfcDraughtingCalloutRelationship;
		IsRelatedToCallout_Ref : IfcDraughtingCalloutRelationship;
		Contents_Ref : IfcDraughtingCalloutElement+;
	};

	type IfcDraughtingCalloutRelationship {
		Name_Att : Logical;
		Description_Att : Logical;
		RelatingDraughtingCallout_Ref : IfcDraughtingCallout;
		RelatedDraughtingCallout_Ref : IfcDraughtingCallout;
	};

	type IfcDraughtingPreDefinedColour : IfcPreDefinedColour;

	type IfcDraughtingPreDefinedCurveFont : IfcPreDefinedCurveFont;

	type IfcDraughtingPreDefinedTextFont : IfcPreDefinedTextFont;

	type IfcDuctFittingType : IfcFlowFittingType {
		PredefinedType_Att : IfcDuctFittingTypeEnum;
	};

	type IfcDuctSegmentType : IfcFlowSegmentType {
		PredefinedType_Att : IfcDuctSegmentTypeEnum;
	};

	type IfcDuctSilencerType : IfcFlowTreatmentDeviceType {
		PredefinedType_Att : IfcDuctSilencerTypeEnum;
	};

	type IfcEdge : IfcTopologicalRepresentationItem {
		EdgeStart_Ref : IfcVertex;
		EdgeEnd_Ref : IfcVertex;
	};

	type IfcEdgeCurve : IfcCurveOrEdgeCurve, IfcEdge {
		EdgeGeometry_Ref : IfcCurve;
		SameSense_Att : Logical;
	};

	type IfcEdgeFeature : IfcFeatureElementSubtraction {
		FeatureLength_Att : Logical;
	};

	type IfcEdgeLoop : IfcLoop {
		EdgeList_Ref : IfcOrientedEdge+;
	};

	type IfcElectricApplianceType : IfcFlowTerminalType {
		PredefinedType_Att : IfcElectricApplianceTypeEnum;
	};

	type IfcElectricDistributionPoint : IfcFlowController {
		DistributionPointFunction_Att : IfcElectricDistributionPointFunctionEnum;
		UserDefinedFunction_Att : Logical;
	};

	type IfcElectricFlowStorageDeviceType : IfcFlowStorageDeviceType {
		PredefinedType_Att : IfcElectricFlowStorageDeviceTypeEnum;
	};

	type IfcElectricGeneratorType : IfcEnergyConversionDeviceType {
		PredefinedType_Att : IfcElectricGeneratorTypeEnum;
	};

	type IfcElectricHeaterType : IfcFlowTerminalType {
		PredefinedType_Att : IfcElectricHeaterTypeEnum;
	};

	type IfcElectricMotorType : IfcEnergyConversionDeviceType {
		PredefinedType_Att : IfcElectricMotorTypeEnum;
	};

	type IfcElectricTimeControlType : IfcFlowControllerType {
		PredefinedType_Att : IfcElectricTimeControlTypeEnum;
	};

	type IfcElectricalBaseProperties : IfcEnergyProperties {
		ElectricCurrentType_Att : IfcElectricCurrentEnum?;
		InputVoltage_Att : Logical;
		InputFrequency_Att : Logical;
		FullLoadCurrent_Att : Logical;
		MinimumCircuitCurrent_Att : Logical;
		MaximumPowerInput_Att : Logical;
		RatedPowerInput_Att : Logical;
		InputPhase_Att : Logical;
	};

	type IfcElectricalCircuit : IfcSystem;

	type IfcElectricalElement : IfcElement;

	type IfcElement : IfcStructuralActivityAssignmentSelect, IfcProduct {
		FillsVoids_Ref : IfcRelFillsElement;
		ConnectedTo_Ref : IfcRelConnectsElements;
		HasCoverings_Ref : IfcRelCoversBldgElements;
		HasProjections_Ref : IfcRelProjectsElement;
		HasStructuralMember_Ref : IfcRelConnectsStructuralElement;
		HasPorts_Ref : IfcRelConnectsPortToElement;
		HasOpenings_Ref : IfcRelVoidsElement;
		IsConnectionRealization_Ref : IfcRelConnectsWithRealizingElements;
		ProvidesBoundaries_Ref : IfcRelSpaceBoundary;
		ConnectedFrom_Ref : IfcRelConnectsElements;
		Tag_Att : Logical;
	};

	type IfcElementAssembly : IfcElement {
		AssemblyPlace_Att : IfcAssemblyPlaceEnum?;
		PredefinedType_Att : IfcElementAssemblyTypeEnum;
	};

	type IfcElementComponent : IfcElement;

	type IfcElementComponentType : IfcElementType;

	type IfcElementQuantity : IfcPropertySetDefinition {
		Quantities_Ref : IfcPhysicalQuantity+;
		MethodOfMeasurement_Att : Logical;
	};

	type IfcElementType : IfcTypeProduct {
		ElementType_Att : Logical;
	};

	type IfcElementarySurface : IfcSurface {
		Position_Ref : IfcAxis2Placement3D;
	};

	type IfcEllipse : IfcConic {
		SemiAxis1_Att : Logical;
		SemiAxis2_Att : Logical;
	};

	type IfcEllipseProfileDef : IfcParameterizedProfileDef {
		SemiAxis1_Att : Logical;
		SemiAxis2_Att : Logical;
	};

	type IfcEnergyConversionDevice : IfcDistributionFlowElement;

	type IfcEnergyConversionDeviceType : IfcDistributionFlowElementType;

	type IfcEnergyProperties : IfcPropertySetDefinition {
		EnergySequence_Att : IfcEnergySequenceEnum?;
		UserDefinedEnergySequence_Att : Logical;
	};

	type IfcEnvironmentalImpactValue : IfcAppliedValue {
		ImpactType_Att : Logical;
		Category_Att : IfcEnvironmentalImpactCategoryEnum;
		UserDefinedCategory_Att : Logical;
	};

	type IfcEquipmentElement : IfcElement;

	type IfcEquipmentStandard : IfcControl;

	type IfcEvaporativeCoolerType : IfcEnergyConversionDeviceType {
		PredefinedType_Att : IfcEvaporativeCoolerTypeEnum;
	};

	type IfcEvaporatorType : IfcEnergyConversionDeviceType {
		PredefinedType_Att : IfcEvaporatorTypeEnum;
	};

	type IfcExtendedMaterialProperties : IfcMaterialProperties {
		Description_Att : Logical;
		Name_Att : Logical;
		ExtendedProperties_Ref : IfcProperty+;
	};

	type IfcExternalReference : IfcLightDistributionDataSourceSelect, IfcObjectReferenceSelect {
		Location_Att : Logical;
		ItemReference_Att : Logical;
		Name_Att : Logical;
	};

	type IfcExternallyDefinedHatchStyle : IfcFillStyleSelect, IfcExternalReference;

	type IfcExternallyDefinedSurfaceStyle : IfcSurfaceStyleElementSelect, IfcExternalReference;

	type IfcExternallyDefinedSymbol : IfcDefinedSymbolSelect, IfcExternalReference;

	type IfcExternallyDefinedTextFont : IfcTextFontSelect, IfcExternalReference;

	type IfcExtrudedAreaSolid : IfcSweptAreaSolid {
		ExtrudedDirection_Ref : IfcDirection;
		Depth_Att : Logical;
	};

	type IfcFace : IfcTopologicalRepresentationItem {
		Bounds_Ref : IfcFaceBound+;
	};

	type IfcFaceBasedSurfaceModel : IfcSurfaceOrFaceSurface, IfcGeometricRepresentationItem {
		FbsmFaces_Ref : IfcConnectedFaceSet+;
	};

	type IfcFaceBound : IfcTopologicalRepresentationItem {
		Bound_Ref : IfcLoop;
		Orientation_Att : Logical;
	};

	type IfcFaceOuterBound : IfcFaceBound;

	type IfcFaceSurface : IfcSurfaceOrFaceSurface, IfcFace {
		FaceSurface_Ref : IfcSurface;
		SameSense_Att : Logical;
	};

	type IfcFacetedBrep : IfcManifoldSolidBrep;

	type IfcFacetedBrepWithVoids : IfcManifoldSolidBrep {
		Voids_Ref : IfcClosedShell+;
	};

	type IfcFailureConnectionCondition : IfcStructuralConnectionCondition {
		TensionFailureX_Att : Logical;
		TensionFailureY_Att : Logical;
		TensionFailureZ_Att : Logical;
		CompressionFailureX_Att : Logical;
		CompressionFailureY_Att : Logical;
		CompressionFailureZ_Att : Logical;
	};

	type IfcFanType : IfcFlowMovingDeviceType {
		PredefinedType_Att : IfcFanTypeEnum;
	};

	type IfcFastener : IfcElementComponent;

	type IfcFastenerType : IfcElementComponentType;

	type IfcFeatureElement : IfcElement;

	type IfcFeatureElementAddition : IfcFeatureElement {
		ProjectsElements_Ref : IfcRelProjectsElement;
	};

	type IfcFeatureElementSubtraction : IfcFeatureElement {
		VoidsElements_Ref : IfcRelVoidsElement;
	};

	type IfcFillAreaStyle : IfcPresentationStyle {
		FillStyles_Ref : IfcFillStyleSelect+;
	};

	type IfcFillAreaStyleHatching : IfcFillStyleSelect, IfcGeometricRepresentationItem {
		StartOfNextHatchLine_Ref : IfcHatchLineDistanceSelect;
		HatchLineAppearance_Ref : IfcCurveStyle;
		PointOfReferenceHatchLine_Ref : IfcCartesianPoint?;
		PatternStart_Ref : IfcCartesianPoint?;
		HatchLineAngle_Att : Logical;
	};

	type IfcFillAreaStyleTileSymbolWithStyle : IfcFillAreaStyleTileShapeSelect, IfcGeometricRepresentationItem {
		Symbol_Ref : IfcAnnotationSymbolOccurrence;
	};

	type IfcFillAreaStyleTiles : IfcFillStyleSelect, IfcGeometricRepresentationItem {
		TilingPattern_Ref : IfcOneDirectionRepeatFactor;
		Tiles_Ref : IfcFillAreaStyleTileShapeSelect+;
		TilingScale_Att : Logical;
	};

	type IfcFilterType : IfcFlowTreatmentDeviceType {
		PredefinedType_Att : IfcFilterTypeEnum;
	};

	type IfcFireSuppressionTerminalType : IfcFlowTerminalType {
		PredefinedType_Att : IfcFireSuppressionTerminalTypeEnum;
	};

	type IfcFlowController : IfcDistributionFlowElement;

	type IfcFlowControllerType : IfcDistributionFlowElementType;

	type IfcFlowFitting : IfcDistributionFlowElement;

	type IfcFlowFittingType : IfcDistributionFlowElementType;

	type IfcFlowInstrumentType : IfcDistributionControlElementType {
		PredefinedType_Att : IfcFlowInstrumentTypeEnum;
	};

	type IfcFlowMeterType : IfcFlowControllerType {
		PredefinedType_Att : IfcFlowMeterTypeEnum;
	};

	type IfcFlowMovingDevice : IfcDistributionFlowElement;

	type IfcFlowMovingDeviceType : IfcDistributionFlowElementType;

	type IfcFlowSegment : IfcDistributionFlowElement;

	type IfcFlowSegmentType : IfcDistributionFlowElementType;

	type IfcFlowStorageDevice : IfcDistributionFlowElement;

	type IfcFlowStorageDeviceType : IfcDistributionFlowElementType;

	type IfcFlowTerminal : IfcDistributionFlowElement;

	type IfcFlowTerminalType : IfcDistributionFlowElementType;

	type IfcFlowTreatmentDevice : IfcDistributionFlowElement;

	type IfcFlowTreatmentDeviceType : IfcDistributionFlowElementType;

	type IfcFluidFlowProperties : IfcPropertySetDefinition {
		PropertySource_Att : IfcPropertySourceEnum;
		UserDefinedPropertySource_Att : Logical;
		TemperatureSingleValue_Att : Logical;
		WetBulbTemperatureSingleValue_Att : Logical;
		FlowConditionSingleValue_Att : Logical;
		VelocitySingleValue_Att : Logical;
		PressureSingleValue_Att : Logical;
		FlowrateSingleValue_Ref : IfcDerivedMeasureValue?;
		FlowConditionTimeSeries_Ref : IfcTimeSeries?;
		VelocityTimeSeries_Ref : IfcTimeSeries?;
		FlowrateTimeSeries_Ref : IfcTimeSeries?;
		Fluid_Ref : IfcMaterial;
		PressureTimeSeries_Ref : IfcTimeSeries?;
		WetBulbTemperatureTimeSeries_Ref : IfcTimeSeries?;
		TemperatureTimeSeries_Ref : IfcTimeSeries?;
	};

	type IfcFooting : IfcBuildingElement {
		PredefinedType_Att : IfcFootingTypeEnum;
	};

	type IfcFuelProperties : IfcMaterialProperties {
		CombustionTemperature_Att : Logical;
		CarbonContent_Att : Logical;
		LowerHeatingValue_Att : Logical;
		HigherHeatingValue_Att : Logical;
	};

	type IfcFurnishingElement : IfcElement;

	type IfcFurnishingElementType : IfcElementType;

	type IfcFurnitureStandard : IfcControl;

	type IfcFurnitureType : IfcFurnishingElementType {
		AssemblyPlace_Att : IfcAssemblyPlaceEnum;
	};

	type IfcGasTerminalType : IfcFlowTerminalType {
		PredefinedType_Att : IfcGasTerminalTypeEnum;
	};

	type IfcGeneralMaterialProperties : IfcMaterialProperties {
		MolecularWeight_Att : Logical;
		Porosity_Att : Logical;
		MassDensity_Att : Logical;
	};

	type IfcGeneralProfileProperties : IfcProfileProperties {
		PhysicalWeight_Att : Logical;
		Perimeter_Att : Logical;
		MinimumPlateThickness_Att : Logical;
		MaximumPlateThickness_Att : Logical;
		CrossSectionArea_Att : Logical;
	};

	type IfcGeometricCurveSet : IfcGeometricSet;

	type IfcGeometricRepresentationContext : IfcRepresentationContext {
		CoordinateSpaceDimension_Att : Logical;
		Precision_Att : Logical;
		HasSubContexts_Ref : IfcGeometricRepresentationSubContext;
		WorldCoordinateSystem_Ref : IfcAxis2Placement;
		TrueNorth_Ref : IfcDirection?;
	};

	type IfcGeometricRepresentationItem : IfcRepresentationItem;

	type IfcGeometricRepresentationSubContext : IfcGeometricRepresentationContext {
		TargetScale_Att : Logical;
		TargetView_Att : IfcGeometricProjectionEnum;
		UserDefinedTargetView_Att : Logical;
		ParentContext_Ref : IfcGeometricRepresentationContext;
	};

	type IfcGeometricSet : IfcGeometricRepresentationItem {
		Elements_Ref : IfcGeometricSetSelect+;
	};

	type IfcGrid : IfcProduct {
		UAxes_Ref : IfcGridAxis+;
		VAxes_Ref : IfcGridAxis+;
		WAxes_Ref : IfcGridAxis*;
	};

	type IfcGridAxis {
		AxisTag_Att : Logical;
		SameSense_Att : Logical;
		PartOfW_Ref : IfcGrid;
		PartOfV_Ref : IfcGrid;
		PartOfU_Ref : IfcGrid;
		HasIntersections_Ref : IfcVirtualGridIntersection;
		AxisCurve_Ref : IfcCurve;
	};

	type IfcGridPlacement : IfcObjectPlacement {
		PlacementLocation_Ref : IfcVirtualGridIntersection;
		PlacementRefDirection_Ref : IfcVirtualGridIntersection?;
	};

	type IfcGroup : IfcObject {
		IsGroupedBy_Ref : IfcRelAssignsToGroup;
	};

	type IfcHalfSpaceSolid : IfcBooleanOperand, IfcGeometricRepresentationItem {
		BaseSurface_Ref : IfcSurface;
		AgreementFlag_Att : Logical;
	};

	type IfcHeatExchangerType : IfcEnergyConversionDeviceType {
		PredefinedType_Att : IfcHeatExchangerTypeEnum;
	};

	type IfcHumidifierType : IfcEnergyConversionDeviceType {
		PredefinedType_Att : IfcHumidifierTypeEnum;
	};

	type IfcHygroscopicMaterialProperties : IfcMaterialProperties {
		UpperVaporResistanceFactor_Att : Logical;
		LowerVaporResistanceFactor_Att : Logical;
		IsothermalMoistureCapacity_Att : Logical;
		VaporPermeability_Att : Logical;
		MoistureDiffusivity_Att : Logical;
	};

	type IfcIShapeProfileDef : IfcParameterizedProfileDef {
		OverallWidth_Att : Logical;
		OverallDepth_Att : Logical;
		WebThickness_Att : Logical;
		FlangeThickness_Att : Logical;
		FilletRadius_Att : Logical;
	};

	type IfcImageTexture : IfcSurfaceTexture {
		UrlReference_Att : Logical;
	};

	type IfcInventory : IfcGroup {
		Jurisdiction_Ref : IfcActorSelect;
		ResponsiblePersons_Ref : IfcPerson+;
		LastUpdateDate_Ref : IfcCalendarDate;
		CurrentValue_Ref : IfcCostValue?;
		OriginalValue_Ref : IfcCostValue?;
		InventoryType_Att : IfcInventoryTypeEnum;
	};

	type IfcIrregularTimeSeries : IfcTimeSeries {
		Values_Ref : IfcIrregularTimeSeriesValue+;
	};

	type IfcIrregularTimeSeriesValue {
		ListValues_Ref : IfcValue+;
		TimeStamp_Ref : IfcDateTimeSelect;
	};

	type IfcJunctionBoxType : IfcFlowFittingType {
		PredefinedType_Att : IfcJunctionBoxTypeEnum;
	};

	type IfcLShapeProfileDef : IfcParameterizedProfileDef {
		Depth_Att : Logical;
		Width_Att : Logical;
		Thickness_Att : Logical;
		FilletRadius_Att : Logical;
		EdgeRadius_Att : Logical;
		LegSlope_Att : Logical;
		CentreOfGravityInX_Att : Logical;
		CentreOfGravityInY_Att : Logical;
	};

	type IfcLaborResource : IfcConstructionResource {
		SkillSet_Att : Logical;
	};

	type IfcLampType : IfcFlowTerminalType {
		PredefinedType_Att : IfcLampTypeEnum;
	};

	type IfcLibraryInformation : IfcLibrarySelect {
		Name_Att : Logical;
		Version_Att : Logical;
		Publisher_Ref : IfcOrganization?;
		VersionDate_Ref : IfcCalendarDate?;
		LibraryReference_Ref : IfcLibraryReference*;
	};

	type IfcLibraryReference : IfcLibrarySelect, IfcExternalReference {
		ReferenceIntoLibrary_Ref : IfcLibraryInformation;
	};

	type IfcLightDistributionData {
		MainPlaneAngle_Att : Logical;
		SecondaryPlaneAngle_Att : Logical;
		LuminousIntensity_Att : Logical;
	};

	type IfcLightFixtureType : IfcFlowTerminalType {
		PredefinedType_Att : IfcLightFixtureTypeEnum;
	};

	type IfcLightIntensityDistribution : IfcLightDistributionDataSourceSelect {
		DistributionData_Ref : IfcLightDistributionData+;
		LightDistributionCurve_Att : IfcLightDistributionCurveEnum;
	};

	type IfcLightSource : IfcGeometricRepresentationItem {
		Name_Att : Logical;
		AmbientIntensity_Att : Logical;
		Intensity_Att : Logical;
		LightColour_Ref : IfcColourRgb;
	};

	type IfcLightSourceAmbient : IfcLightSource;

	type IfcLightSourceDirectional : IfcLightSource {
		Orientation_Ref : IfcDirection;
	};

	type IfcLightSourceGoniometric : IfcLightSource {
		ColourTemperature_Att : Logical;
		LuminousFlux_Att : Logical;
		LightEmissionSource_Att : IfcLightEmissionSourceEnum;
		Position_Ref : IfcAxis2Placement3D;
		ColourAppearance_Ref : IfcColourRgb?;
		LightDistributionDataSource_Ref : IfcLightDistributionDataSourceSelect;
	};

	type IfcLightSourcePositional : IfcLightSource {
		Radius_Att : Logical;
		ConstantAttenuation_Att : Logical;
		DistanceAttenuation_Att : Logical;
		QuadricAttenuation_Att : Logical;
		Position_Ref : IfcCartesianPoint;
	};

	type IfcLightSourceSpot : IfcLightSourcePositional {
		ConcentrationExponent_Att : Logical;
		SpreadAngle_Att : Logical;
		BeamWidthAngle_Att : Logical;
		Orientation_Ref : IfcDirection;
	};

	type IfcLine : IfcCurve {
		Pnt_Ref : IfcCartesianPoint;
		Dir_Ref : IfcVector;
	};

	type IfcLinearDimension : IfcDimensionCurveDirectedCallout;

	type IfcLocalPlacement : IfcObjectPlacement {
		PlacementRelTo_Ref : IfcObjectPlacement?;
		RelativePlacement_Ref : IfcAxis2Placement;
	};

	type IfcLocalTime : IfcDateTimeSelect, IfcObjectReferenceSelect {
		HourComponent_Att : Logical;
		MinuteComponent_Att : Logical;
		SecondComponent_Att : Logical;
		DaylightSavingOffset_Att : Logical;
		Zone_Ref : IfcCoordinatedUniversalTimeOffset?;
	};

	type IfcLoop : IfcTopologicalRepresentationItem;

	type IfcManifoldSolidBrep : IfcSolidModel {
		Outer_Ref : IfcClosedShell;
	};

	type IfcMappedItem : IfcRepresentationItem {
		MappingSource_Ref : IfcRepresentationMap;
		MappingTarget_Ref : IfcCartesianTransformationOperator;
	};

	type IfcMaterial : IfcMaterialSelect, IfcObjectReferenceSelect {
		HasRepresentation_Ref : IfcMaterialDefinitionRepresentation;
		ClassifiedAs_Ref : IfcMaterialClassificationRelationship;
		Name_Att : Logical;
	};

	type IfcMaterialClassificationRelationship {
		MaterialClassifications_Ref : IfcClassificationNotationSelect+;
		ClassifiedMaterial_Ref : IfcMaterial;
	};

	type IfcMaterialDefinitionRepresentation : IfcProductRepresentation {
		RepresentedMaterial_Ref : IfcMaterial;
	};

	type IfcMaterialLayer : IfcMaterialSelect, IfcObjectReferenceSelect {
		LayerThickness_Att : Logical;
		IsVentilated_Att : Logical;
		ToMaterialLayerSet_Ref : IfcMaterialLayerSet;
		Material_Ref : IfcMaterial?;
	};

	type IfcMaterialLayerSet : IfcMaterialSelect {
		MaterialLayers_Ref : IfcMaterialLayer+;
		LayerSetName_Att : Logical;
	};

	type IfcMaterialLayerSetUsage : IfcMaterialSelect {
		LayerSetDirection_Att : IfcLayerSetDirectionEnum;
		DirectionSense_Att : IfcDirectionSenseEnum;
		OffsetFromReferenceLine_Att : Logical;
		ForLayerSet_Ref : IfcMaterialLayerSet;
	};

	type IfcMaterialList : IfcMaterialSelect, IfcObjectReferenceSelect {
		Materials_Ref : IfcMaterial+;
	};

	type IfcMaterialProperties {
		Material_Ref : IfcMaterial;
	};

	type IfcMeasureWithUnit {
		ValueComponent_Ref : IfcValue;
		UnitComponent_Ref : IfcUnit;
	};

	type IfcMechanicalConcreteMaterialProperties : IfcMechanicalMaterialProperties {
		CompressiveStrength_Att : Logical;
		MaxAggregateSize_Att : Logical;
		AdmixturesDescription_Att : Logical;
		Workability_Att : Logical;
		ProtectivePoreRatio_Att : Logical;
		WaterImpermeability_Att : Logical;
	};

	type IfcMechanicalFastener : IfcFastener {
		NominalDiameter_Att : Logical;
		NominalLength_Att : Logical;
	};

	type IfcMechanicalFastenerType : IfcFastenerType;

	type IfcMechanicalMaterialProperties : IfcMaterialProperties {
		DynamicViscosity_Att : Logical;
		YoungModulus_Att : Logical;
		ShearModulus_Att : Logical;
		PoissonRatio_Att : Logical;
		ThermalExpansionCoefficient_Att : Logical;
	};

	type IfcMechanicalSteelMaterialProperties : IfcMechanicalMaterialProperties {
		YieldStress_Att : Logical;
		UltimateStress_Att : Logical;
		UltimateStrain_Att : Logical;
		HardeningModule_Att : Logical;
		ProportionalStress_Att : Logical;
		PlasticStrain_Att : Logical;
		Relaxations_Ref : IfcRelaxation*;
	};

	type IfcMember : IfcBuildingElement;

	type IfcMemberType : IfcBuildingElementType {
		PredefinedType_Att : IfcMemberTypeEnum;
	};

	type IfcMetric : IfcConstraint {
		Benchmark_Att : IfcBenchmarkEnum;
		ValueSource_Att : Logical;
		DataValue_Ref : IfcMetricValueSelect;
	};

	type IfcMonetaryUnit : IfcUnit {
		Currency_Att : IfcCurrencyEnum;
	};

	type IfcMotorConnectionType : IfcEnergyConversionDeviceType {
		PredefinedType_Att : IfcMotorConnectionTypeEnum;
	};

	type IfcMove : IfcTask {
		MoveFrom_Ref : IfcSpatialStructureElement;
		MoveTo_Ref : IfcSpatialStructureElement;
		PunchList_Att : Logical;
	};

	type IfcNamedUnit : IfcUnit {
		Dimensions_Ref : IfcDimensionalExponents;
		UnitType_Att : IfcUnitEnum;
	};

	type IfcObject : IfcObjectDefinition {
		IsDefinedBy_Ref : IfcRelDefines;
		ObjectType_Att : Logical;
	};

	type IfcObjectDefinition : IfcRoot {
		HasAssignments_Ref : IfcRelAssigns;
		IsDecomposedBy_Ref : IfcRelDecomposes;
		Decomposes_Ref : IfcRelDecomposes;
	};

	type IfcObjectPlacement {
		PlacesObject_Ref : IfcProduct;
		ReferencedByPlacements_Ref : IfcLocalPlacement;
	};

	type IfcObjective : IfcConstraint {
		ObjectiveQualifier_Att : IfcObjectiveEnum;
		UserDefinedQualifier_Att : Logical;
		BenchmarkValues_Ref : IfcMetric?;
		ResultValues_Ref : IfcMetric?;
	};

	type IfcOccupant : IfcActor {
		PredefinedType_Att : IfcOccupantTypeEnum;
	};

	type IfcOffsetCurve2D : IfcCurve {
		Distance_Att : Logical;
		SelfIntersect_Att : Logical;
		BasisCurve_Ref : IfcCurve;
	};

	type IfcOffsetCurve3D : IfcCurve {
		Distance_Att : Logical;
		SelfIntersect_Att : Logical;
		BasisCurve_Ref : IfcCurve;
		RefDirection_Ref : IfcDirection;
	};

	type IfcOneDirectionRepeatFactor : IfcGeometricRepresentationItem {
		RepeatFactor_Ref : IfcVector;
	};

	type IfcOpenShell : IfcShell, IfcConnectedFaceSet;

	type IfcOpeningElement : IfcFeatureElementSubtraction {
		HasFillings_Ref : IfcRelFillsElement;
	};

	type IfcOpticalMaterialProperties : IfcMaterialProperties {
		VisibleTransmittance_Att : Logical;
		SolarTransmittance_Att : Logical;
		ThermalIrTransmittance_Att : Logical;
		ThermalIrEmissivityBack_Att : Logical;
		ThermalIrEmissivityFront_Att : Logical;
		VisibleReflectanceBack_Att : Logical;
		VisibleReflectanceFront_Att : Logical;
		SolarReflectanceFront_Att : Logical;
		SolarReflectanceBack_Att : Logical;
	};

	type IfcOrderAction : IfcTask {
		ActionID_Att : Logical;
	};

	type IfcOrganization : IfcActorSelect, IfcObjectReferenceSelect {
		Id_Att : Logical;
		Name_Att : Logical;
		Description_Att : Logical;
		IsRelatedBy_Ref : IfcOrganizationRelationship;
		Relates_Ref : IfcOrganizationRelationship;
		Engages_Ref : IfcPersonAndOrganization;
		Roles_Ref : IfcActorRole*;
		Addresses_Ref : IfcAddress*;
	};

	type IfcOrganizationRelationship {
		Name_Att : Logical;
		Description_Att : Logical;
		RelatingOrganization_Ref : IfcOrganization;
		RelatedOrganizations_Ref : IfcOrganization+;
	};

	type IfcOrientedEdge : IfcEdge {
		EdgeElement_Ref : IfcEdge;
		Orientation_Att : Logical;
	};

	type IfcOutletType : IfcFlowTerminalType {
		PredefinedType_Att : IfcOutletTypeEnum;
	};

	type IfcOwnerHistory {
		State_Att : IfcStateEnum?;
		ChangeAction_Att : IfcChangeActionEnum;
		LastModifiedDate_Att : Logical;
		CreationDate_Att : Logical;
		OwningUser_Ref : IfcPersonAndOrganization;
		OwningApplication_Ref : IfcApplication;
		LastModifyingUser_Ref : IfcPersonAndOrganization?;
		LastModifyingApplication_Ref : IfcApplication?;
	};

	type IfcParameterizedProfileDef : IfcProfileDef {
		Position_Ref : IfcAxis2Placement2D;
	};

	type IfcPath : IfcTopologicalRepresentationItem {
		EdgeList_Ref : IfcOrientedEdge+;
	};

	type IfcPerformanceHistory : IfcControl {
		LifeCyclePhase_Att : Logical;
	};

	type IfcPermeableCoveringProperties : IfcPropertySetDefinition {
		OperationType_Att : IfcPermeableCoveringOperationEnum;
		PanelPosition_Att : IfcWindowPanelPositionEnum;
		FrameDepth_Att : Logical;
		FrameThickness_Att : Logical;
		ShapeAspectStyle_Ref : IfcShapeAspect?;
	};

	type IfcPermit : IfcControl {
		PermitID_Att : Logical;
	};

	type IfcPerson : IfcActorSelect, IfcObjectReferenceSelect {
		Id_Att : Logical;
		FamilyName_Att : Logical;
		GivenName_Att : Logical;
		MiddleNames_Att : Logical;
		PrefixTitles_Att : Logical;
		SuffixTitles_Att : Logical;
		EngagedIn_Ref : IfcPersonAndOrganization;
		Roles_Ref : IfcActorRole*;
		Addresses_Ref : IfcAddress*;
	};

	type IfcPersonAndOrganization : IfcActorSelect, IfcObjectReferenceSelect {
		ThePerson_Ref : IfcPerson;
		TheOrganization_Ref : IfcOrganization;
		Roles_Ref : IfcActorRole*;
	};

	type IfcPhysicalComplexQuantity : IfcPhysicalQuantity {
		Discrimination_Att : Logical;
		Quality_Att : Logical;
		Usage_Att : Logical;
		HasQuantities_Ref : IfcPhysicalQuantity+;
	};

	type IfcPhysicalQuantity {
		Name_Att : Logical;
		Description_Att : Logical;
		PartOfComplex_Ref : IfcPhysicalComplexQuantity;
	};

	type IfcPhysicalSimpleQuantity : IfcPhysicalQuantity {
		Unit_Ref : IfcNamedUnit?;
	};

	type IfcPile : IfcBuildingElement {
		PredefinedType_Att : IfcPileTypeEnum;
		ConstructionType_Att : IfcPileConstructionEnum?;
	};

	type IfcPipeFittingType : IfcFlowFittingType {
		PredefinedType_Att : IfcPipeFittingTypeEnum;
	};

	type IfcPipeSegmentType : IfcFlowSegmentType {
		PredefinedType_Att : IfcPipeSegmentTypeEnum;
	};

	type IfcPixelTexture : IfcSurfaceTexture {
		Width_Att : Logical;
		Height_Att : Logical;
		ColourComponents_Att : Logical;
		Pixel_Att : Logical;
	};

	type IfcPlacement : IfcGeometricRepresentationItem {
		Location_Ref : IfcCartesianPoint;
	};

	type IfcPlanarBox : IfcPlanarExtent {
		Placement_Ref : IfcAxis2Placement;
	};

	type IfcPlanarExtent : IfcGeometricRepresentationItem {
		SizeInX_Att : Logical;
		SizeInY_Att : Logical;
	};

	type IfcPlane : IfcElementarySurface;

	type IfcPlate : IfcBuildingElement;

	type IfcPlateType : IfcBuildingElementType {
		PredefinedType_Att : IfcPlateTypeEnum;
	};

	type IfcPoint : IfcGeometricSetSelect, IfcPointOrVertexPoint, IfcGeometricRepresentationItem;

	type IfcPointOnCurve : IfcPoint {
		BasisCurve_Ref : IfcCurve;
		PointParameter_Att : Logical;
	};

	type IfcPointOnSurface : IfcPoint {
		PointParameterU_Att : Logical;
		PointParameterV_Att : Logical;
		BasisSurface_Ref : IfcSurface;
	};

	type IfcPolyLoop : IfcLoop {
		Polygon_Ref : IfcCartesianPoint#3 ..;
	};

	type IfcPolygonalBoundedHalfSpace : IfcHalfSpaceSolid {
		Position_Ref : IfcAxis2Placement3D;
		PolygonalBoundary_Ref : IfcBoundedCurve;
	};

	type IfcPolyline : IfcBoundedCurve {
		Points_Ref : IfcCartesianPoint#2 ..;
	};

	type IfcPort : IfcProduct {
		ContainedIn_Ref : IfcRelConnectsPortToElement;
		ConnectedFrom_Ref : IfcRelConnectsPorts;
		ConnectedTo_Ref : IfcRelConnectsPorts;
	};

	type IfcPostalAddress : IfcAddress {
		InternalLocation_Att : Logical;
		AddressLines_Att : Logical;
		PostalBox_Att : Logical;
		Town_Att : Logical;
		Region_Att : Logical;
		PostalCode_Att : Logical;
		Country_Att : Logical;
	};

	type IfcPreDefinedColour : IfcColour, IfcPreDefinedItem;

	type IfcPreDefinedCurveFont : IfcCurveStyleFontSelect, IfcPreDefinedItem;

	type IfcPreDefinedDimensionSymbol : IfcPreDefinedSymbol;

	type IfcPreDefinedItem {
		Name_Att : Logical;
	};

	type IfcPreDefinedPointMarkerSymbol : IfcPreDefinedSymbol;

	type IfcPreDefinedSymbol : IfcDefinedSymbolSelect, IfcPreDefinedItem;

	type IfcPreDefinedTerminatorSymbol : IfcPreDefinedSymbol;

	type IfcPreDefinedTextFont : IfcTextFontSelect, IfcPreDefinedItem;

	type IfcPresentationLayerAssignment {
		Name_Att : Logical;
		Description_Att : Logical;
		Identifier_Att : Logical;
		AssignedItems_Ref : IfcLayeredItem+;
	};

	type IfcPresentationLayerWithStyle : IfcPresentationLayerAssignment {
		LayerOn_Att : Logical;
		LayerFrozen_Att : Logical;
		LayerBlocked_Att : Logical;
		LayerStyles_Ref : IfcPresentationStyleSelect*;
	};

	type IfcPresentationStyle {
		Name_Att : Logical;
	};

	type IfcPresentationStyleAssignment {
		Styles_Ref : IfcPresentationStyleSelect+;
	};

	type IfcProcedure : IfcProcess {
		ProcedureID_Att : Logical;
		ProcedureType_Att : IfcProcedureTypeEnum;
		UserDefinedProcedureType_Att : Logical;
	};

	type IfcProcess : IfcObject {
		OperatesOn_Ref : IfcRelAssignsToProcess;
		IsSuccessorFrom_Ref : IfcRelSequence;
		IsPredecessorTo_Ref : IfcRelSequence;
	};

	type IfcProduct : IfcObject {
		ReferencedBy_Ref : IfcRelAssignsToProduct;
		ObjectPlacement_Ref : IfcObjectPlacement?;
		Representation_Ref : IfcProductRepresentation?;
		ReferencedInStructures_Ref : IfcRelReferencedInSpatialStructure;
		ContainedInStructure_Ref : IfcRelContainedInSpatialStructure;
	};

	type IfcProductDefinitionShape : IfcProductRepresentation {
		HasShapeAspects_Ref : IfcShapeAspect;
	};

	type IfcProductRepresentation {
		Name_Att : Logical;
		Description_Att : Logical;
		ShapeOfProduct_Ref : IfcProduct;
		Representations_Ref : IfcRepresentation+;
	};

	type IfcProductsOfCombustionProperties : IfcMaterialProperties {
		SpecificHeatCapacity_Att : Logical;
		N20Content_Att : Logical;
		COContent_Att : Logical;
		CO2Content_Att : Logical;
	};

	type IfcProfileDef {
		ProfileType_Att : IfcProfileTypeEnum;
		ProfileName_Att : Logical;
	};

	type IfcProfileProperties {
		ProfileDefinition_Ref : IfcProfileDef?;
		ProfileName_Att : Logical;
	};

	type IfcProject : IfcObject {
		LongName_Att : Logical;
		Phase_Att : Logical;
		RepresentationContexts_Ref : IfcRepresentationContext+;
		UnitsInContext_Ref : IfcUnitAssignment;
	};

	type IfcProjectOrder : IfcControl {
		ID_Att : Logical;
		PredefinedType_Att : IfcProjectOrderTypeEnum;
		Status_Att : Logical;
	};

	type IfcProjectOrderRecord : IfcControl {
		Records_Ref : IfcRelAssignsToProjectOrder+;
		PredefinedType_Att : IfcProjectOrderRecordTypeEnum;
	};

	type IfcProjectionCurve : IfcAnnotationCurveOccurrence;

	type IfcProjectionElement : IfcFeatureElementAddition;

	type IfcProperty {
		Name_Att : Logical;
		Description_Att : Logical;
		PropertyForDependance_Ref : IfcPropertyDependencyRelationship;
		PropertyDependsOn_Ref : IfcPropertyDependencyRelationship;
		PartOfComplex_Ref : IfcComplexProperty;
	};

	type IfcPropertyBoundedValue : IfcSimpleProperty {
		UpperBoundValue_Ref : IfcValue?;
		LowerBoundValue_Ref : IfcValue?;
		Unit_Ref : IfcUnit?;
	};

	type IfcPropertyConstraintRelationship {
		Name_Att : Logical;
		Description_Att : Logical;
		RelatingConstraint_Ref : IfcConstraint;
		RelatedProperties_Ref : IfcProperty+;
	};

	type IfcPropertyDefinition : IfcRoot;

	type IfcPropertyDependencyRelationship {
		Name_Att : Logical;
		Description_Att : Logical;
		Expression_Att : Logical;
		DependingProperty_Ref : IfcProperty;
		DependantProperty_Ref : IfcProperty;
	};

	type IfcPropertyEnumeratedValue : IfcSimpleProperty {
		EnumerationValues_Ref : IfcValue+;
		EnumerationReference_Ref : IfcPropertyEnumeration?;
	};

	type IfcPropertyEnumeration {
		EnumerationValues_Ref : IfcValue+;
		Unit_Ref : IfcUnit?;
		Name_Att : Logical;
	};

	type IfcPropertyListValue : IfcSimpleProperty {
		ListValues_Ref : IfcValue+;
		Unit_Ref : IfcUnit?;
	};

	type IfcPropertyReferenceValue : IfcSimpleProperty {
		PropertyReference_Ref : IfcObjectReferenceSelect;
		UsageName_Att : Logical;
	};

	type IfcPropertySet : IfcPropertySetDefinition {
		HasProperties_Ref : IfcProperty+;
	};

	type IfcPropertySetDefinition : IfcPropertyDefinition {
		PropertyDefinitionOf_Ref : IfcRelDefinesByProperties;
		DefinesType_Ref : IfcTypeObject;
	};

	type IfcPropertySingleValue : IfcSimpleProperty {
		NominalValue_Ref : IfcValue?;
		Unit_Ref : IfcUnit?;
	};

	type IfcPropertyTableValue : IfcSimpleProperty {
		DefiningValues_Ref : IfcValue+;
		DefinedValues_Ref : IfcValue+;
		DefiningUnit_Ref : IfcUnit?;
		DefinedUnit_Ref : IfcUnit?;
		Expression_Att : Logical;
	};

	type IfcProtectiveDeviceType : IfcFlowControllerType {
		PredefinedType_Att : IfcProtectiveDeviceTypeEnum;
	};

	type IfcProxy : IfcProduct {
		ProxyType_Att : IfcObjectTypeEnum;
		Tag_Att : Logical;
	};

	type IfcPumpType : IfcFlowMovingDeviceType {
		PredefinedType_Att : IfcPumpTypeEnum;
	};

	type IfcQuantityArea : IfcPhysicalSimpleQuantity {
		AreaValue_Att : Logical;
	};

	type IfcQuantityCount : IfcPhysicalSimpleQuantity {
		CountValue_Att : Logical;
	};

	type IfcQuantityLength : IfcPhysicalSimpleQuantity {
		LengthValue_Att : Logical;
	};

	type IfcQuantityTime : IfcPhysicalSimpleQuantity {
		TimeValue_Att : Logical;
	};

	type IfcQuantityVolume : IfcPhysicalSimpleQuantity {
		VolumeValue_Att : Logical;
	};

	type IfcQuantityWeight : IfcPhysicalSimpleQuantity {
		WeightValue_Att : Logical;
	};

	type IfcRadiusDimension : IfcDimensionCurveDirectedCallout;

	type IfcRailing : IfcBuildingElement {
		PredefinedType_Att : IfcRailingTypeEnum?;
	};

	type IfcRailingType : IfcBuildingElementType {
		PredefinedType_Att : IfcRailingTypeEnum;
	};

	type IfcRamp : IfcBuildingElement {
		ShapeType_Att : IfcRampTypeEnum;
	};

	type IfcRampFlight : IfcBuildingElement;

	type IfcRampFlightType : IfcBuildingElementType {
		PredefinedType_Att : IfcRampFlightTypeEnum;
	};

	type IfcRationalBezierCurve : IfcBezierCurve {
		WeightsData_Att : Logical;
	};

	type IfcRectangleHollowProfileDef : IfcRectangleProfileDef {
		WallThickness_Att : Logical;
		InnerFilletRadius_Att : Logical;
		OuterFilletRadius_Att : Logical;
	};

	type IfcRectangleProfileDef : IfcParameterizedProfileDef {
		XDim_Att : Logical;
		YDim_Att : Logical;
	};

	type IfcRectangularPyramid : IfcCsgPrimitive3D {
		XLength_Att : Logical;
		YLength_Att : Logical;
		Height_Att : Logical;
	};

	type IfcRectangularTrimmedSurface : IfcBoundedSurface {
		U1_Att : Logical;
		V1_Att : Logical;
		U2_Att : Logical;
		V2_Att : Logical;
		Usense_Att : Logical;
		Vsense_Att : Logical;
		BasisSurface_Ref : IfcSurface;
	};

	type IfcReferencesValueDocument {
		Name_Att : Logical;
		Description_Att : Logical;
		ReferencedDocument_Ref : IfcDocumentSelect;
		ReferencingValues_Ref : IfcAppliedValue+;
	};

	type IfcRegularTimeSeries : IfcTimeSeries {
		Values_Ref : IfcTimeSeriesValue+;
		TimeStep_Att : Logical;
	};

	type IfcReinforcementBarProperties {
		TotalCrossSectionArea_Att : Logical;
		SteelGrade_Att : Logical;
		BarSurface_Att : IfcReinforcingBarSurfaceEnum?;
		EffectiveDepth_Att : Logical;
		NominalBarDiameter_Att : Logical;
		BarCount_Att : Logical;
	};

	type IfcReinforcementDefinitionProperties : IfcPropertySetDefinition {
		ReinforcementSectionDefinitions_Ref : IfcSectionReinforcementProperties+;
		DefinitionType_Att : Logical;
	};

	type IfcReinforcingBar : IfcReinforcingElement {
		NominalDiameter_Att : Logical;
		CrossSectionArea_Att : Logical;
		BarLength_Att : Logical;
		BarRole_Att : IfcReinforcingBarRoleEnum;
		BarSurface_Att : IfcReinforcingBarSurfaceEnum?;
	};

	type IfcReinforcingElement : IfcBuildingElementComponent {
		SteelGrade_Att : Logical;
	};

	type IfcReinforcingMesh : IfcReinforcingElement {
		MeshLength_Att : Logical;
		MeshWidth_Att : Logical;
		LongitudinalBarNominalDiameter_Att : Logical;
		TransverseBarNominalDiameter_Att : Logical;
		LongitudinalBarCrossSectionArea_Att : Logical;
		TransverseBarCrossSectionArea_Att : Logical;
		LongitudinalBarSpacing_Att : Logical;
		TransverseBarSpacing_Att : Logical;
	};

	type IfcRelAggregates : IfcRelDecomposes;

	type IfcRelAssigns : IfcRelationship {
		RelatedObjects_Ref : IfcObjectDefinition+;
		RelatedObjectsType_Att : IfcObjectTypeEnum?;
	};

	type IfcRelAssignsTasks : IfcRelAssignsToControl {
		TimeForTask_Ref : IfcScheduleTimeControl?;
	};

	type IfcRelAssignsToActor : IfcRelAssigns {
		RelatingActor_Ref : IfcActor;
		ActingRole_Ref : IfcActorRole?;
	};

	type IfcRelAssignsToControl : IfcRelAssigns {
		RelatingControl_Ref : IfcControl;
	};

	type IfcRelAssignsToGroup : IfcRelAssigns {
		RelatingGroup_Ref : IfcGroup;
	};

	type IfcRelAssignsToProcess : IfcRelAssigns {
		RelatingProcess_Ref : IfcProcess;
		QuantityInProcess_Ref : IfcMeasureWithUnit?;
	};

	type IfcRelAssignsToProduct : IfcRelAssigns {
		RelatingProduct_Ref : IfcProduct;
	};

	type IfcRelAssignsToProjectOrder : IfcRelAssignsToControl;

	type IfcRelAssignsToResource : IfcRelAssigns {
		RelatingResource_Ref : IfcResource;
	};

	type IfcRelAssociates : IfcRelationship {
		RelatedObjects_Ref : IfcRoot+;
	};

	type IfcRelAssociatesAppliedValue : IfcRelAssociates {
		RelatingAppliedValue_Ref : IfcAppliedValue;
	};

	type IfcRelAssociatesApproval : IfcRelAssociates {
		RelatingApproval_Ref : IfcApproval;
	};

	type IfcRelAssociatesClassification : IfcRelAssociates {
		RelatingClassification_Ref : IfcClassificationNotationSelect;
	};

	type IfcRelAssociatesConstraint : IfcRelAssociates {
		RelatingConstraint_Ref : IfcConstraint;
		Intent_Att : Logical;
	};

	type IfcRelAssociatesDocument : IfcRelAssociates {
		RelatingDocument_Ref : IfcDocumentSelect;
	};

	type IfcRelAssociatesLibrary : IfcRelAssociates {
		RelatingLibrary_Ref : IfcLibrarySelect;
	};

	type IfcRelAssociatesMaterial : IfcRelAssociates {
		RelatingMaterial_Ref : IfcMaterialSelect;
	};

	type IfcRelAssociatesProfileProperties : IfcRelAssociates {
		ProfileOrientation_Ref : IfcOrientationSelect?;
		RelatingProfileProperties_Ref : IfcProfileProperties;
		ProfileSectionLocation_Ref : IfcShapeAspect?;
	};

	type IfcRelConnects : IfcRelationship;

	type IfcRelConnectsElements : IfcRelConnects {
		ConnectionGeometry_Ref : IfcConnectionGeometry?;
		RelatingElement_Ref : IfcElement;
		RelatedElement_Ref : IfcElement;
	};

	type IfcRelConnectsPathElements : IfcRelConnectsElements {
		RelatingPriorities_Att : Logical;
		RelatedPriorities_Att : Logical;
		RelatedConnectionType_Att : IfcConnectionTypeEnum;
		RelatingConnectionType_Att : IfcConnectionTypeEnum;
	};

	type IfcRelConnectsPortToElement : IfcRelConnects {
		RelatingPort_Ref : IfcPort;
		RelatedElement_Ref : IfcElement;
	};

	type IfcRelConnectsPorts : IfcRelConnects {
		RelatingPort_Ref : IfcPort;
		RelatedPort_Ref : IfcPort;
		RealizingElement_Ref : IfcElement?;
	};

	type IfcRelConnectsStructuralActivity : IfcRelConnects {
		RelatingElement_Ref : IfcStructuralActivityAssignmentSelect;
		RelatedStructuralActivity_Ref : IfcStructuralActivity;
	};

	type IfcRelConnectsStructuralElement : IfcRelConnects {
		RelatingElement_Ref : IfcElement;
		RelatedStructuralMember_Ref : IfcStructuralMember;
	};

	type IfcRelConnectsStructuralMember : IfcRelConnects {
		RelatingStructuralMember_Ref : IfcStructuralMember;
		RelatedStructuralConnection_Ref : IfcStructuralConnection;
		AppliedCondition_Ref : IfcBoundaryCondition?;
		AdditionalConditions_Ref : IfcStructuralConnectionCondition?;
		ConditionCoordinateSystem_Ref : IfcAxis2Placement3D?;
		SupportedLength_Att : Logical;
	};

	type IfcRelConnectsWithEccentricity : IfcRelConnectsStructuralMember {
		ConnectionConstraint_Ref : IfcConnectionGeometry;
	};

	type IfcRelConnectsWithRealizingElements : IfcRelConnectsElements {
		RealizingElements_Ref : IfcElement+;
		ConnectionType_Att : Logical;
	};

	type IfcRelContainedInSpatialStructure : IfcRelConnects {
		RelatedElements_Ref : IfcProduct+;
		RelatingStructure_Ref : IfcSpatialStructureElement;
	};

	type IfcRelCoversBldgElements : IfcRelConnects {
		RelatingBuildingElement_Ref : IfcElement;
		RelatedCoverings_Ref : IfcCovering+;
	};

	type IfcRelCoversSpaces : IfcRelConnects {
		RelatedSpace_Ref : IfcSpace;
		RelatedCoverings_Ref : IfcCovering+;
	};

	type IfcRelDecomposes : IfcRelationship {
		RelatingObject_Ref : IfcObjectDefinition;
		RelatedObjects_Ref : IfcObjectDefinition+;
	};

	type IfcRelDefines : IfcRelationship {
		RelatedObjects_Ref : IfcObject+;
	};

	type IfcRelDefinesByProperties : IfcRelDefines {
		RelatingPropertyDefinition_Ref : IfcPropertySetDefinition;
	};

	type IfcRelDefinesByType : IfcRelDefines {
		RelatingType_Ref : IfcTypeObject;
	};

	type IfcRelFillsElement : IfcRelConnects {
		RelatingOpeningElement_Ref : IfcOpeningElement;
		RelatedBuildingElement_Ref : IfcElement;
	};

	type IfcRelFlowControlElements : IfcRelConnects {
		RelatedControlElements_Ref : IfcDistributionControlElement+;
		RelatingFlowElement_Ref : IfcDistributionFlowElement;
	};

	type IfcRelInteractionRequirements : IfcRelConnects {
		DailyInteraction_Att : Logical;
		ImportanceRating_Att : Logical;
		LocationOfInteraction_Ref : IfcSpatialStructureElement?;
		RelatedSpaceProgram_Ref : IfcSpaceProgram;
		RelatingSpaceProgram_Ref : IfcSpaceProgram;
	};

	type IfcRelNests : IfcRelDecomposes;

	type IfcRelOccupiesSpaces : IfcRelAssignsToActor;

	type IfcRelOverridesProperties : IfcRelDefinesByProperties {
		OverridingProperties_Ref : IfcProperty+;
	};

	type IfcRelProjectsElement : IfcRelConnects {
		RelatingElement_Ref : IfcElement;
		RelatedFeatureElement_Ref : IfcFeatureElementAddition;
	};

	type IfcRelReferencedInSpatialStructure : IfcRelConnects {
		RelatedElements_Ref : IfcProduct+;
		RelatingStructure_Ref : IfcSpatialStructureElement;
	};

	type IfcRelSchedulesCostItems : IfcRelAssignsToControl;

	type IfcRelSequence : IfcRelConnects {
		TimeLag_Att : Logical;
		SequenceType_Att : IfcSequenceEnum;
		RelatingProcess_Ref : IfcProcess;
		RelatedProcess_Ref : IfcProcess;
	};

	type IfcRelServicesBuildings : IfcRelConnects {
		RelatingSystem_Ref : IfcSystem;
		RelatedBuildings_Ref : IfcSpatialStructureElement+;
	};

	type IfcRelSpaceBoundary : IfcRelConnects {
		PhysicalOrVirtualBoundary_Att : IfcPhysicalOrVirtualEnum;
		InternalOrExternalBoundary_Att : IfcInternalOrExternalEnum;
		RelatingSpace_Ref : IfcSpace;
		RelatedBuildingElement_Ref : IfcElement?;
		ConnectionGeometry_Ref : IfcConnectionGeometry?;
	};

	type IfcRelVoidsElement : IfcRelConnects {
		RelatingBuildingElement_Ref : IfcElement;
		RelatedOpeningElement_Ref : IfcFeatureElementSubtraction;
	};

	type IfcRelationship : IfcRoot;

	type IfcRelaxation {
		RelaxationValue_Att : Logical;
		InitialStress_Att : Logical;
	};

	type IfcRepresentation : IfcLayeredItem {
		RepresentationIdentifier_Att : Logical;
		RepresentationType_Att : Logical;
		RepresentationMap_Ref : IfcRepresentationMap;
		OfProductRepresentation_Ref : IfcProductRepresentation;
		ContextOfItems_Ref : IfcRepresentationContext;
		Items_Ref : IfcRepresentationItem+;
	};

	type IfcRepresentationContext {
		ContextIdentifier_Att : Logical;
		ContextType_Att : Logical;
		RepresentationsInContext_Ref : IfcRepresentation;
	};

	type IfcRepresentationItem : IfcLayeredItem {
		StyledByItem_Ref : IfcStyledItem;
	};

	type IfcRepresentationMap {
		MapUsage_Ref : IfcMappedItem;
		MappingOrigin_Ref : IfcAxis2Placement;
		MappedRepresentation_Ref : IfcRepresentation;
	};

	type IfcResource : IfcObject {
		ResourceOf_Ref : IfcRelAssignsToResource;
	};

	type IfcRevolvedAreaSolid : IfcSweptAreaSolid {
		Axis_Ref : IfcAxis1Placement;
		Angle_Att : Logical;
	};

	type IfcRibPlateProfileProperties : IfcProfileProperties {
		Thickness_Att : Logical;
		RibHeight_Att : Logical;
		RibWidth_Att : Logical;
		RibSpacing_Att : Logical;
		Direction_Att : IfcRibPlateDirectionEnum;
	};

	type IfcRightCircularCone : IfcCsgPrimitive3D {
		Height_Att : Logical;
		BottomRadius_Att : Logical;
	};

	type IfcRightCircularCylinder : IfcCsgPrimitive3D {
		Height_Att : Logical;
		Radius_Att : Logical;
	};

	type IfcRoof : IfcBuildingElement {
		ShapeType_Att : IfcRoofTypeEnum;
	};

	type IfcRoot {
		GlobalId_Att : Logical;
		Name_Att : Logical;
		Description_Att : Logical;
		OwnerHistory_Ref : IfcOwnerHistory;
		HasAssociations_Ref : IfcRelAssociates;
	};

	type IfcRoundedEdgeFeature : IfcEdgeFeature {
		Radius_Att : Logical;
	};

	type IfcRoundedRectangleProfileDef : IfcRectangleProfileDef {
		RoundingRadius_Att : Logical;
	};

	type IfcSIUnit : IfcNamedUnit {
		Prefix_Att : IfcSIPrefix?;
		Name_Att : IfcSIUnitName;
	};

	type IfcSanitaryTerminalType : IfcFlowTerminalType {
		PredefinedType_Att : IfcSanitaryTerminalTypeEnum;
	};

	type IfcScheduleTimeControl : IfcControl {
		ScheduleDuration_Att : Logical;
		ActualDuration_Att : Logical;
		RemainingTime_Att : Logical;
		FreeFloat_Att : Logical;
		TotalFloat_Att : Logical;
		IsCritical_Att : Logical;
		StartFloat_Att : Logical;
		FinishFloat_Att : Logical;
		Completion_Att : Logical;
		ScheduleTimeControlAssigned_Ref : IfcRelAssignsTasks;
		ActualStart_Ref : IfcDateTimeSelect?;
		EarlyStart_Ref : IfcDateTimeSelect?;
		LateStart_Ref : IfcDateTimeSelect?;
		ScheduleStart_Ref : IfcDateTimeSelect?;
		ActualFinish_Ref : IfcDateTimeSelect?;
		EarlyFinish_Ref : IfcDateTimeSelect?;
		LateFinish_Ref : IfcDateTimeSelect?;
		ScheduleFinish_Ref : IfcDateTimeSelect?;
		StatusTime_Ref : IfcDateTimeSelect?;
	};

	type IfcSectionProperties {
		StartProfile_Ref : IfcProfileDef;
		EndProfile_Ref : IfcProfileDef?;
		SectionType_Att : IfcSectionTypeEnum;
	};

	type IfcSectionReinforcementProperties {
		LongitudinalStartPosition_Att : Logical;
		LongitudinalEndPosition_Att : Logical;
		TransversePosition_Att : Logical;
		ReinforcementRole_Att : IfcReinforcingBarRoleEnum;
		SectionDefinition_Ref : IfcSectionProperties;
		CrossSectionReinforcementDefinitions_Ref : IfcReinforcementBarProperties+;
	};

	type IfcSectionedSpine : IfcGeometricRepresentationItem {
		SpineCurve_Ref : IfcCompositeCurve;
		CrossSections_Ref : IfcProfileDef#2 ..;
		CrossSectionPositions_Ref : IfcAxis2Placement3D#2 ..;
	};

	type IfcSensorType : IfcDistributionControlElementType {
		PredefinedType_Att : IfcSensorTypeEnum;
	};

	type IfcServiceLife : IfcControl {
		ServiceLifeType_Att : IfcServiceLifeTypeEnum;
		ServiceLifeDuration_Att : Logical;
	};

	type IfcServiceLifeFactor : IfcPropertySetDefinition {
		UpperValue_Ref : IfcMeasureValue?;
		MostUsedValue_Ref : IfcMeasureValue;
		LowerValue_Ref : IfcMeasureValue?;
		PredefinedType_Att : IfcServiceLifeFactorTypeEnum;
	};

	type IfcShapeAspect {
		Name_Att : Logical;
		Description_Att : Logical;
		ProductDefinitional_Att : Logical;
		ShapeRepresentations_Ref : IfcShapeModel+;
		PartOfProductDefinitionShape_Ref : IfcProductDefinitionShape;
	};

	type IfcShapeModel : IfcRepresentation {
		OfShapeAspect_Ref : IfcShapeAspect;
	};

	type IfcShapeRepresentation : IfcShapeModel;

	type IfcShellBasedSurfaceModel : IfcGeometricRepresentationItem {
		SbsmBoundary_Ref : IfcShell+;
	};

	type IfcSimpleProperty : IfcProperty;

	type IfcSite : IfcSpatialStructureElement {
		RefLatitude_Att : Logical;
		RefLongitude_Att : Logical;
		RefElevation_Att : Logical;
		LandTitleNumber_Att : Logical;
		SiteAddress_Ref : IfcPostalAddress?;
	};

	type IfcSlab : IfcBuildingElement {
		PredefinedType_Att : IfcSlabTypeEnum?;
	};

	type IfcSlabType : IfcBuildingElementType {
		PredefinedType_Att : IfcSlabTypeEnum;
	};

	type IfcSlippageConnectionCondition : IfcStructuralConnectionCondition {
		SlippageX_Att : Logical;
		SlippageY_Att : Logical;
		SlippageZ_Att : Logical;
	};

	type IfcSolidModel : IfcBooleanOperand, IfcGeometricRepresentationItem;

	type IfcSoundProperties : IfcPropertySetDefinition {
		IsAttenuating_Att : Logical;
		SoundScale_Att : IfcSoundScaleEnum?;
		SoundValues_Ref : IfcSoundValue#1 .. 8;
	};

	type IfcSoundValue : IfcPropertySetDefinition {
		SoundLevelSingleValue_Ref : IfcDerivedMeasureValue?;
		SoundLevelTimeSeries_Ref : IfcTimeSeries?;
		Frequency_Att : Logical;
	};

	type IfcSpace : IfcSpatialStructureElement {
		InteriorOrExteriorSpace_Att : IfcInternalOrExternalEnum;
		ElevationWithFlooring_Att : Logical;
		HasCoverings_Ref : IfcRelCoversSpaces;
		BoundedBy_Ref : IfcRelSpaceBoundary;
	};

	type IfcSpaceHeaterType : IfcEnergyConversionDeviceType {
		PredefinedType_Att : IfcSpaceHeaterTypeEnum;
	};

	type IfcSpaceProgram : IfcControl {
		SpaceProgramIdentifier_Att : Logical;
		MaxRequiredArea_Att : Logical;
		MinRequiredArea_Att : Logical;
		StandardRequiredArea_Att : Logical;
		HasInteractionReqsFrom_Ref : IfcRelInteractionRequirements;
		HasInteractionReqsTo_Ref : IfcRelInteractionRequirements;
		RequestedLocation_Ref : IfcSpatialStructureElement?;
	};

	type IfcSpaceThermalLoadProperties : IfcPropertySetDefinition {
		ApplicableValueRatio_Att : Logical;
		ThermalLoadSource_Att : IfcThermalLoadSourceEnum;
		PropertySource_Att : IfcPropertySourceEnum;
		SourceDescription_Att : Logical;
		MaximumValue_Att : Logical;
		MinimumValue_Att : Logical;
		UserDefinedThermalLoadSource_Att : Logical;
		UserDefinedPropertySource_Att : Logical;
		ThermalLoadType_Att : IfcThermalLoadTypeEnum;
		ThermalLoadTimeSeriesValues_Ref : IfcTimeSeries?;
	};

	type IfcSpaceType : IfcSpatialStructureElementType {
		PredefinedType_Att : IfcSpaceTypeEnum;
	};

	type IfcSpatialStructureElement : IfcProduct {
		LongName_Att : Logical;
		CompositionType_Att : IfcElementCompositionEnum;
		ReferencesElements_Ref : IfcRelReferencedInSpatialStructure;
		ServicedBySystems_Ref : IfcRelServicesBuildings;
		ContainsElements_Ref : IfcRelContainedInSpatialStructure;
	};

	type IfcSpatialStructureElementType : IfcElementType;

	type IfcSphere : IfcCsgPrimitive3D {
		Radius_Att : Logical;
	};

	type IfcStackTerminalType : IfcFlowTerminalType {
		PredefinedType_Att : IfcStackTerminalTypeEnum;
	};

	type IfcStair : IfcBuildingElement {
		ShapeType_Att : IfcStairTypeEnum;
	};

	type IfcStairFlight : IfcBuildingElement {
		NumberOfRiser_Att : Logical;
		NumberOfTreads_Att : Logical;
		RiserHeight_Att : Logical;
		TreadLength_Att : Logical;
	};

	type IfcStairFlightType : IfcBuildingElementType {
		PredefinedType_Att : IfcStairFlightTypeEnum;
	};

	type IfcStructuralAction : IfcStructuralActivity {
		CausedBy_Ref : IfcStructuralReaction?;
		DestabilizingLoad_Att : Logical;
	};

	type IfcStructuralActivity : IfcProduct {
		AssignedToStructuralItem_Ref : IfcRelConnectsStructuralActivity;
		AppliedLoad_Ref : IfcStructuralLoad;
		GlobalOrLocal_Att : IfcGlobalOrLocalEnum;
	};

	type IfcStructuralAnalysisModel : IfcSystem {
		OrientationOf2DPlane_Ref : IfcAxis2Placement3D?;
		LoadedBy_Ref : IfcStructuralLoadGroup*;
		HasResults_Ref : IfcStructuralResultGroup*;
		PredefinedType_Att : IfcAnalysisModelTypeEnum;
	};

	type IfcStructuralConnection : IfcStructuralItem {
		ConnectsStructuralMembers_Ref : IfcRelConnectsStructuralMember;
		AppliedCondition_Ref : IfcBoundaryCondition?;
	};

	type IfcStructuralConnectionCondition {
		Name_Att : Logical;
	};

	type IfcStructuralCurveConnection : IfcStructuralConnection;

	type IfcStructuralCurveMember : IfcStructuralMember {
		PredefinedType_Att : IfcStructuralCurveTypeEnum;
	};

	type IfcStructuralCurveMemberVarying : IfcStructuralCurveMember;

	type IfcStructuralItem : IfcStructuralActivityAssignmentSelect, IfcProduct;

	type IfcStructuralLinearAction : IfcStructuralAction {
		ProjectedOrTrue_Att : IfcProjectedOrTrueLengthEnum;
	};

	type IfcStructuralLinearActionVarying : IfcStructuralLinearAction {
		VaryingAppliedLoadLocation_Ref : IfcShapeAspect;
		SubsequentAppliedLoads_Ref : IfcStructuralLoad+;
	};

	type IfcStructuralLoad {
		Name_Att : Logical;
	};

	type IfcStructuralLoadGroup : IfcGroup {
		PredefinedType_Att : IfcLoadGroupTypeEnum;
		ActionType_Att : IfcActionTypeEnum;
		ActionSource_Att : IfcActionSourceTypeEnum;
		Coefficient_Att : Logical;
		Purpose_Att : Logical;
		SourceOfResultGroup_Ref : IfcStructuralResultGroup;
		LoadGroupFor_Ref : IfcStructuralAnalysisModel;
	};

	type IfcStructuralLoadLinearForce : IfcStructuralLoadStatic {
		LinearForceX_Att : Logical;
		LinearForceY_Att : Logical;
		LinearForceZ_Att : Logical;
		LinearMomentX_Att : Logical;
		LinearMomentY_Att : Logical;
		LinearMomentZ_Att : Logical;
	};

	type IfcStructuralLoadPlanarForce : IfcStructuralLoadStatic {
		PlanarForceX_Att : Logical;
		PlanarForceY_Att : Logical;
		PlanarForceZ_Att : Logical;
	};

	type IfcStructuralLoadSingleDisplacement : IfcStructuralLoadStatic {
		DisplacementX_Att : Logical;
		DisplacementY_Att : Logical;
		DisplacementZ_Att : Logical;
		RotationalDisplacementRX_Att : Logical;
		RotationalDisplacementRY_Att : Logical;
		RotationalDisplacementRZ_Att : Logical;
	};

	type IfcStructuralLoadSingleDisplacementDistortion : IfcStructuralLoadSingleDisplacement {
		Distortion_Att : Logical;
	};

	type IfcStructuralLoadSingleForce : IfcStructuralLoadStatic {
		ForceX_Att : Logical;
		ForceY_Att : Logical;
		ForceZ_Att : Logical;
		MomentX_Att : Logical;
		MomentY_Att : Logical;
		MomentZ_Att : Logical;
	};

	type IfcStructuralLoadSingleForceWarping : IfcStructuralLoadSingleForce {
		WarpingMoment_Att : Logical;
	};

	type IfcStructuralLoadStatic : IfcStructuralLoad;

	type IfcStructuralLoadTemperature : IfcStructuralLoadStatic {
		DeltaT_Constant_Att : Logical;
		DeltaT_Y_Att : Logical;
		DeltaT_Z_Att : Logical;
	};

	type IfcStructuralMember : IfcStructuralItem {
		ReferencesElement_Ref : IfcRelConnectsStructuralElement;
		ConnectedBy_Ref : IfcRelConnectsStructuralMember;
	};

	type IfcStructuralPlanarAction : IfcStructuralAction {
		ProjectedOrTrue_Att : IfcProjectedOrTrueLengthEnum;
	};

	type IfcStructuralPlanarActionVarying : IfcStructuralPlanarAction {
		VaryingAppliedLoadLocation_Ref : IfcShapeAspect;
		SubsequentAppliedLoads_Ref : IfcStructuralLoad#2 ..;
	};

	type IfcStructuralPointAction : IfcStructuralAction;

	type IfcStructuralPointConnection : IfcStructuralConnection;

	type IfcStructuralPointReaction : IfcStructuralReaction;

	type IfcStructuralProfileProperties : IfcGeneralProfileProperties {
		TorsionalConstantX_Att : Logical;
		MomentOfInertiaYZ_Att : Logical;
		MomentOfInertiaY_Att : Logical;
		MomentOfInertiaZ_Att : Logical;
		WarpingConstant_Att : Logical;
		ShearCentreZ_Att : Logical;
		ShearCentreY_Att : Logical;
		ShearDeformationAreaZ_Att : Logical;
		ShearDeformationAreaY_Att : Logical;
		MaximumSectionModulusY_Att : Logical;
		MinimumSectionModulusY_Att : Logical;
		MaximumSectionModulusZ_Att : Logical;
		MinimumSectionModulusZ_Att : Logical;
		TorsionalSectionModulus_Att : Logical;
		CentreOfGravityInX_Att : Logical;
		CentreOfGravityInY_Att : Logical;
	};

	type IfcStructuralReaction : IfcStructuralActivity {
		Causes_Ref : IfcStructuralAction;
	};

	type IfcStructuralResultGroup : IfcGroup {
		TheoryType_Att : IfcAnalysisTheoryTypeEnum;
		IsLinear_Att : Logical;
		ResultGroupFor_Ref : IfcStructuralAnalysisModel;
		ResultForLoadGroup_Ref : IfcStructuralLoadGroup?;
	};

	type IfcStructuralSteelProfileProperties : IfcStructuralProfileProperties {
		ShearAreaZ_Att : Logical;
		ShearAreaY_Att : Logical;
		PlasticShapeFactorY_Att : Logical;
		PlasticShapeFactorZ_Att : Logical;
	};

	type IfcStructuralSurfaceConnection : IfcStructuralConnection;

	type IfcStructuralSurfaceMember : IfcStructuralMember {
		PredefinedType_Att : IfcStructuralSurfaceTypeEnum;
		Thickness_Att : Logical;
	};

	type IfcStructuralSurfaceMemberVarying : IfcStructuralSurfaceMember {
		VaryingThicknessLocation_Ref : IfcShapeAspect;
		SubsequentThickness_Att : Logical;
	};

	type IfcStructuredDimensionCallout : IfcDraughtingCallout;

	type IfcStyleModel : IfcRepresentation;

	type IfcStyledItem : IfcRepresentationItem {
		Item_Ref : IfcRepresentationItem?;
		Styles_Ref : IfcPresentationStyleAssignment+;
		Name_Att : Logical;
	};

	type IfcStyledRepresentation : IfcStyleModel;

	type IfcSubContractResource : IfcConstructionResource {
		SubContractor_Ref : IfcActorSelect?;
		JobDescription_Att : Logical;
	};

	type IfcSubedge : IfcEdge {
		ParentEdge_Ref : IfcEdge;
	};

	type IfcSurface : IfcGeometricSetSelect, IfcSurfaceOrFaceSurface, IfcGeometricRepresentationItem;

	type IfcSurfaceCurveSweptAreaSolid : IfcSweptAreaSolid {
		StartParam_Att : Logical;
		EndParam_Att : Logical;
		Directrix_Ref : IfcCurve;
		ReferenceSurface_Ref : IfcSurface;
	};

	type IfcSurfaceOfLinearExtrusion : IfcSweptSurface {
		ExtrudedDirection_Ref : IfcDirection;
		Depth_Att : Logical;
	};

	type IfcSurfaceOfRevolution : IfcSweptSurface {
		AxisPosition_Ref : IfcAxis1Placement;
	};

	type IfcSurfaceStyle : IfcPresentationStyle {
		Styles_Ref : IfcSurfaceStyleElementSelect#1 .. 5;
		Side_Att : IfcSurfaceSide;
	};

	type IfcSurfaceStyleLighting : IfcSurfaceStyleElementSelect {
		DiffuseTransmissionColour_Ref : IfcColourRgb;
		DiffuseReflectionColour_Ref : IfcColourRgb;
		TransmissionColour_Ref : IfcColourRgb;
		ReflectanceColour_Ref : IfcColourRgb;
	};

	type IfcSurfaceStyleRefraction : IfcSurfaceStyleElementSelect {
		RefractionIndex_Att : Logical;
		DispersionFactor_Att : Logical;
	};

	type IfcSurfaceStyleRendering : IfcSurfaceStyleShading {
		Transparency_Att : Logical;
		ReflectanceMethod_Att : IfcReflectanceMethodEnum;
		DiffuseColour_Ref : IfcColourOrFactor?;
		TransmissionColour_Ref : IfcColourOrFactor?;
		DiffuseTransmissionColour_Ref : IfcColourOrFactor?;
		ReflectionColour_Ref : IfcColourOrFactor?;
		SpecularColour_Ref : IfcColourOrFactor?;
		SpecularHighlight_Ref : IfcSpecularHighlightSelect?;
	};

	type IfcSurfaceStyleShading : IfcSurfaceStyleElementSelect {
		SurfaceColour_Ref : IfcColourRgb;
	};

	type IfcSurfaceStyleWithTextures : IfcSurfaceStyleElementSelect {
		Textures_Ref : IfcSurfaceTexture+;
	};

	type IfcSurfaceTexture {
		RepeatS_Att : Logical;
		RepeatT_Att : Logical;
		TextureType_Att : IfcSurfaceTextureEnum;
		TextureTransform_Ref : IfcCartesianTransformationOperator2D?;
	};

	type IfcSweptAreaSolid : IfcSolidModel {
		SweptArea_Ref : IfcProfileDef;
		Position_Ref : IfcAxis2Placement3D;
	};

	type IfcSweptDiskSolid : IfcSolidModel {
		Radius_Att : Logical;
		InnerRadius_Att : Logical;
		StartParam_Att : Logical;
		EndParam_Att : Logical;
		Directrix_Ref : IfcCurve;
	};

	type IfcSweptSurface : IfcSurface {
		SweptCurve_Ref : IfcProfileDef;
		Position_Ref : IfcAxis2Placement3D;
	};

	type IfcSwitchingDeviceType : IfcFlowControllerType {
		PredefinedType_Att : IfcSwitchingDeviceTypeEnum;
	};

	type IfcSymbolStyle : IfcPresentationStyle {
		StyleOfSymbol_Ref : IfcSymbolStyleSelect;
	};

	type IfcSystem : IfcGroup {
		ServicesBuildings_Ref : IfcRelServicesBuildings;
	};

	type IfcSystemFurnitureElementType : IfcFurnishingElementType;

	type IfcTShapeProfileDef : IfcParameterizedProfileDef {
		Depth_Att : Logical;
		FlangeWidth_Att : Logical;
		WebThickness_Att : Logical;
		FlangeThickness_Att : Logical;
		FilletRadius_Att : Logical;
		FlangeEdgeRadius_Att : Logical;
		WebEdgeRadius_Att : Logical;
		WebSlope_Att : Logical;
		FlangeSlope_Att : Logical;
		CentreOfGravityInY_Att : Logical;
	};

	type IfcTable {
		Rows_Ref : IfcTableRow+;
		Name_Att : Logical;
	};

	type IfcTableRow {
		RowCells_Ref : IfcValue+;
		OfTable_Ref : IfcTable;
		IsHeading_Att : Logical;
	};

	type IfcTankType : IfcFlowStorageDeviceType {
		PredefinedType_Att : IfcTankTypeEnum;
	};

	type IfcTask : IfcProcess {
		TaskId_Att : Logical;
		Status_Att : Logical;
		WorkMethod_Att : Logical;
		IsMilestone_Att : Logical;
		Priority_Att : Logical;
	};

	type IfcTelecomAddress : IfcAddress {
		TelephoneNumbers_Att : Logical;
		FacsimileNumbers_Att : Logical;
		PagerNumber_Att : Logical;
		ElectronicMailAddresses_Att : Logical;
		WWWHomePageURL_Att : Logical;
	};

	type IfcTendon : IfcReinforcingElement {
		PredefinedType_Att : IfcTendonTypeEnum;
		NominalDiameter_Att : Logical;
		CrossSectionArea_Att : Logical;
		TensionForce_Att : Logical;
		PreStress_Att : Logical;
		FrictionCoefficient_Att : Logical;
		AnchorageSlip_Att : Logical;
		MinCurvatureRadius_Att : Logical;
	};

	type IfcTendonAnchor : IfcReinforcingElement;

	type IfcTerminatorSymbol : IfcAnnotationSymbolOccurrence {
		AnnotatedCurve_Ref : IfcAnnotationCurveOccurrence;
	};

	type IfcTextLiteral : IfcGeometricRepresentationItem {
		Literal_Att : Logical;
		Path_Att : IfcTextPath;
		Placement_Ref : IfcAxis2Placement;
	};

	type IfcTextLiteralWithExtent : IfcTextLiteral {
		Extent_Ref : IfcPlanarExtent;
		BoxAlignment_Att : Logical;
	};

	type IfcTextStyle : IfcPresentationStyle {
		TextCharacterAppearance_Ref : IfcCharacterStyleSelect?;
		TextStyle_Ref : IfcTextStyleSelect?;
		TextFontStyle_Ref : IfcTextFontSelect;
	};

	type IfcTextStyleFontModel : IfcPreDefinedTextFont {
		FontFamily_Att : Logical;
		FontStyle_Att : Logical;
		FontVariant_Att : Logical;
		FontWeight_Att : Logical;
		FontSize_Ref : IfcSizeSelect;
	};

	type IfcTextStyleForDefinedFont : IfcCharacterStyleSelect {
		Colour_Ref : IfcColour;
		BackgroundColour_Ref : IfcColour?;
	};

	type IfcTextStyleTextModel : IfcTextStyleSelect {
		TextAlign_Att : Logical;
		TextDecoration_Att : Logical;
		TextTransform_Att : Logical;
		TextIndent_Ref : IfcSizeSelect?;
		LetterSpacing_Ref : IfcSizeSelect?;
		WordSpacing_Ref : IfcSizeSelect?;
		LineHeight_Ref : IfcSizeSelect?;
	};

	type IfcTextStyleWithBoxCharacteristics : IfcTextStyleSelect {
		BoxHeight_Att : Logical;
		BoxWidth_Att : Logical;
		BoxSlantAngle_Att : Logical;
		BoxRotateAngle_Att : Logical;
		CharacterSpacing_Ref : IfcSizeSelect?;
	};

	type IfcTextureCoordinate {
		AnnotatedSurface_Ref : IfcAnnotationSurface;
	};

	type IfcTextureCoordinateGenerator : IfcTextureCoordinate {
		Parameter_Ref : IfcSimpleValue+;
		Mode_Att : Logical;
	};

	type IfcTextureMap : IfcTextureCoordinate {
		TextureMaps_Ref : IfcVertexBasedTextureMap+;
	};

	type IfcTextureVertex {
		Coordinates_Att : Logical;
	};

	type IfcThermalMaterialProperties : IfcMaterialProperties {
		SpecificHeatCapacity_Att : Logical;
		BoilingPoint_Att : Logical;
		FreezingPoint_Att : Logical;
		ThermalConductivity_Att : Logical;
	};

	type IfcTimeSeries : IfcObjectReferenceSelect {
		Name_Att : Logical;
		Description_Att : Logical;
		TimeSeriesDataType_Att : IfcTimeSeriesDataTypeEnum;
		DataOrigin_Att : IfcDataOriginEnum;
		UserDefinedDataOrigin_Att : Logical;
		DocumentedBy_Ref : IfcTimeSeriesReferenceRelationship;
		StartTime_Ref : IfcDateTimeSelect;
		EndTime_Ref : IfcDateTimeSelect;
		Unit_Ref : IfcUnit?;
	};

	type IfcTimeSeriesReferenceRelationship {
		ReferencedTimeSeries_Ref : IfcTimeSeries;
		TimeSeriesReferences_Ref : IfcDocumentSelect+;
	};

	type IfcTimeSeriesSchedule : IfcControl {
		ApplicableDates_Ref : IfcDateTimeSelect*;
		TimeSeries_Ref : IfcTimeSeries;
		TimeSeriesScheduleType_Att : IfcTimeSeriesScheduleTypeEnum;
	};

	type IfcTimeSeriesValue {
		ListValues_Ref : IfcValue+;
	};

	type IfcTopologicalRepresentationItem : IfcRepresentationItem;

	type IfcTopologyRepresentation : IfcShapeModel;

	type IfcTransformerType : IfcEnergyConversionDeviceType {
		PredefinedType_Att : IfcTransformerTypeEnum;
	};

	type IfcTransportElement : IfcElement {
		OperationType_Att : IfcTransportElementTypeEnum?;
		CapacityByWeight_Att : Logical;
		CapacityByNumber_Att : Logical;
	};

	type IfcTransportElementType : IfcElementType {
		PredefinedType_Att : IfcTransportElementTypeEnum;
	};

	type IfcTrapeziumProfileDef : IfcParameterizedProfileDef {
		BottomXDim_Att : Logical;
		TopXDim_Att : Logical;
		YDim_Att : Logical;
		TopXOffset_Att : Logical;
	};

	type IfcTrimmedCurve : IfcBoundedCurve {
		SenseAgreement_Att : Logical;
		MasterRepresentation_Att : IfcTrimmingPreference;
		Trim1_Ref : IfcTrimmingSelect#1 .. 2;
		Trim2_Ref : IfcTrimmingSelect#1 .. 2;
		BasisCurve_Ref : IfcCurve;
	};

	type IfcTubeBundleType : IfcEnergyConversionDeviceType {
		PredefinedType_Att : IfcTubeBundleTypeEnum;
	};

	type IfcTwoDirectionRepeatFactor : IfcOneDirectionRepeatFactor {
		SecondRepeatFactor_Ref : IfcVector;
	};

	type IfcTypeObject : IfcObjectDefinition {
		ObjectTypeOf_Ref : IfcRelDefinesByType;
		HasPropertySets_Ref : IfcPropertySetDefinition*;
		ApplicableOccurrence_Att : Logical;
	};

	type IfcTypeProduct : IfcTypeObject {
		RepresentationMaps_Ref : IfcRepresentationMap*;
		Tag_Att : Logical;
	};

	type IfcUShapeProfileDef : IfcParameterizedProfileDef {
		Depth_Att : Logical;
		FlangeWidth_Att : Logical;
		WebThickness_Att : Logical;
		FlangeThickness_Att : Logical;
		FilletRadius_Att : Logical;
		EdgeRadius_Att : Logical;
		FlangeSlope_Att : Logical;
		CentreOfGravityInX_Att : Logical;
	};

	type IfcUnitAssignment {
		Units_Ref : IfcUnit+;
	};

	type IfcUnitaryEquipmentType : IfcEnergyConversionDeviceType {
		PredefinedType_Att : IfcUnitaryEquipmentTypeEnum;
	};

	type IfcValveType : IfcFlowControllerType {
		PredefinedType_Att : IfcValveTypeEnum;
	};

	type IfcVector : IfcVectorOrDirection, IfcGeometricRepresentationItem {
		Orientation_Ref : IfcDirection;
		Magnitude_Att : Logical;
	};

	type IfcVertex : IfcTopologicalRepresentationItem;

	type IfcVertexBasedTextureMap {
		TextureVertices_Ref : IfcTextureVertex#3 ..;
		TexturePoints_Ref : IfcCartesianPoint#3 ..;
	};

	type IfcVertexLoop : IfcLoop {
		LoopVertex_Ref : IfcVertex;
	};

	type IfcVertexPoint : IfcPointOrVertexPoint, IfcVertex {
		VertexGeometry_Ref : IfcPoint;
	};

	type IfcVibrationIsolatorType : IfcDiscreteAccessoryType {
		PredefinedType_Att : IfcVibrationIsolatorTypeEnum;
	};

	type IfcVirtualElement : IfcElement;

	type IfcVirtualGridIntersection {
		IntersectingAxes_Ref : IfcGridAxis#2 .. 2;
		OffsetDistances_Att : Logical;
	};

	type IfcWall : IfcBuildingElement;

	type IfcWallStandardCase : IfcWall;

	type IfcWallType : IfcBuildingElementType {
		PredefinedType_Att : IfcWallTypeEnum;
	};

	type IfcWasteTerminalType : IfcFlowTerminalType {
		PredefinedType_Att : IfcWasteTerminalTypeEnum;
	};

	type IfcWaterProperties : IfcMaterialProperties {
		IsPotable_Att : Logical;
		Hardness_Att : Logical;
		AlkalinityConcentration_Att : Logical;
		AcidityConcentration_Att : Logical;
		ImpuritiesContent_Att : Logical;
		PHLevel_Att : Logical;
		DissolvedSolidsContent_Att : Logical;
	};

	type IfcWindow : IfcBuildingElement {
		OverallHeight_Att : Logical;
		OverallWidth_Att : Logical;
	};

	type IfcWindowLiningProperties : IfcPropertySetDefinition {
		LiningDepth_Att : Logical;
		LiningThickness_Att : Logical;
		TransomThickness_Att : Logical;
		MullionThickness_Att : Logical;
		FirstTransomOffset_Att : Logical;
		SecondTransomOffset_Att : Logical;
		FirstMullionOffset_Att : Logical;
		SecondMullionOffset_Att : Logical;
		ShapeAspectStyle_Ref : IfcShapeAspect?;
	};

	type IfcWindowPanelProperties : IfcPropertySetDefinition {
		OperationType_Att : IfcWindowPanelOperationEnum;
		PanelPosition_Att : IfcWindowPanelPositionEnum;
		FrameDepth_Att : Logical;
		FrameThickness_Att : Logical;
		ShapeAspectStyle_Ref : IfcShapeAspect?;
	};

	type IfcWindowStyle : IfcTypeProduct {
		ConstructionType_Att : IfcWindowStyleConstructionEnum;
		OperationType_Att : IfcWindowStyleOperationEnum;
		ParameterTakesPrecedence_Att : Logical;
		Sizeable_Att : Logical;
	};

	type IfcWorkControl : IfcControl {
		Identifier_Att : Logical;
		Purpose_Att : Logical;
		Duration_Att : Logical;
		TotalFloat_Att : Logical;
		WorkControlType_Att : IfcWorkControlTypeEnum?;
		UserDefinedControlType_Att : Logical;
		CreationDate_Ref : IfcDateTimeSelect;
		Creators_Ref : IfcPerson*;
		StartTime_Ref : IfcDateTimeSelect;
		FinishTime_Ref : IfcDateTimeSelect?;
	};

	type IfcWorkPlan : IfcWorkControl;

	type IfcWorkSchedule : IfcWorkControl;

	type IfcZShapeProfileDef : IfcParameterizedProfileDef {
		Depth_Att : Logical;
		FlangeWidth_Att : Logical;
		WebThickness_Att : Logical;
		FlangeThickness_Att : Logical;
		FilletRadius_Att : Logical;
		EdgeRadius_Att : Logical;
	};

	type IfcZone : IfcGroup;

	type IfcActionSourceTypeEnum {"NOTDEFINED", "USERDEFINED", "BRAKES", "RAIN", "WAVE", "CURRENT", "ICE", "BUOYANCY", "LACK_OF_FIT", "CREEP", "SHRINKAGE", "SYSTEM_IMPERFECTION", "PROPPING", "ERECTION", "TRANSPORT", "IMPACT", "IMPULSE", "FIRE", "EARTHQUAKE_E", "TEMPERATURE_T", "SETTLEMENT_U", "PRESTRESSING_P", "WIND_W", "SNOW_S", "LIVE_LOAD_Q", "COMPLETION_G1", "DEAD_LOAD_G"};

	type IfcActionTypeEnum {"NOTDEFINED", "USERDEFINED", "EXTRAORDINARY_A", "VARIABLE_Q", "PERMANENT_G"};

	type IfcActuatorTypeEnum {"NOTDEFINED", "USERDEFINED", "THERMOSTATICACTUATOR", "PNEUMATICACTUATOR", "HYDRAULICACTUATOR", "HANDOPERATEDACTUATOR", "ELECTRICACTUATOR"};

	type IfcAddressTypeEnum {"USERDEFINED", "DISTRIBUTIONPOINT", "HOME", "SITE", "OFFICE"};

	type IfcAheadOrBehind {"BEHIND", "AHEAD"};

	type IfcAirTerminalBoxTypeEnum {"NOTDEFINED", "USERDEFINED", "VARIABLEFLOWPRESSUREINDEPENDANT", "VARIABLEFLOWPRESSUREDEPENDANT", "CONSTANTFLOW"};

	type IfcAirTerminalTypeEnum {"NOTDEFINED", "USERDEFINED", "LINEARDIFFUSER", "LINEARGRILLE", "IRIS", "EYEBALL", "DIFFUSER", "REGISTER", "GRILLE"};

	type IfcAirToAirHeatRecoveryTypeEnum {"NOTDEFINED", "USERDEFINED", "THERMOSIPHONCOILTYPEHEATEXCHANGERS", "THERMOSIPHONSEALEDTUBEHEATEXCHANGERS", "TWINTOWERENTHALPYRECOVERYLOOPS", "HEATPIPE", "RUNAROUNDCOILLOOP", "ROTARYWHEEL", "FIXEDPLATEPARALLELFLOWEXCHANGER", "FIXEDPLATECROSSFLOWEXCHANGER", "FIXEDPLATECOUNTERFLOWEXCHANGER"};

	type IfcAlarmTypeEnum {"NOTDEFINED", "USERDEFINED", "WHISTLE", "SIREN", "MANUALPULLBOX", "LIGHT", "BREAKGLASSBUTTON", "BELL"};

	type IfcAnalysisModelTypeEnum {"NOTDEFINED", "USERDEFINED", "LOADING_3D", "OUT_PLANE_LOADING_2D", "IN_PLANE_LOADING_2D"};

	type IfcAnalysisTheoryTypeEnum {"NOTDEFINED", "USERDEFINED", "FULL_NONLINEAR_THEORY", "THIRD_ORDER_THEORY", "SECOND_ORDER_THEORY", "FIRST_ORDER_THEORY"};

	type IfcArithmeticOperatorEnum {"SUBTRACT", "MULTIPLY", "DIVIDE", "ADD"};

	type IfcAssemblyPlaceEnum {"NOTDEFINED", "FACTORY", "SITE"};

	type IfcBSplineCurveForm {"UNSPECIFIED", "HYPERBOLIC_ARC", "PARABOLIC_ARC", "ELLIPTIC_ARC", "CIRCULAR_ARC", "POLYLINE_FORM"};

	type IfcBeamTypeEnum {"NOTDEFINED", "USERDEFINED", "T_BEAM", "LINTEL", "JOIST", "BEAM"};

	type IfcBenchmarkEnum {"NOTEQUALTO", "EQUALTO", "LESSTHANOREQUALTO", "LESSTHAN", "GREATERTHANOREQUALTO", "GREATERTHAN"};

	type IfcBoilerTypeEnum {"NOTDEFINED", "USERDEFINED", "STEAM", "WATER"};

	type IfcBooleanOperator {"DIFFERENCE", "INTERSECTION", "UNION"};

	type IfcBuildingElementProxyTypeEnum {"NOTDEFINED", "USERDEFINED"};

	type IfcCableCarrierFittingTypeEnum {"NOTDEFINED", "USERDEFINED", "TEE", "REDUCER", "CROSS", "BEND"};

	type IfcCableCarrierSegmentTypeEnum {"NOTDEFINED", "USERDEFINED", "CONDUITSEGMENT", "CABLETRUNKINGSEGMENT", "CABLETRAYSEGMENT", "CABLELADDERSEGMENT"};

	type IfcCableSegmentTypeEnum {"NOTDEFINED", "USERDEFINED", "CONDUCTORSEGMENT", "CABLESEGMENT"};

	type IfcChangeActionEnum {"MODIFIEDDELETED", "MODIFIEDADDED", "DELETED", "ADDED", "MODIFIED", "NOCHANGE"};

	type IfcChillerTypeEnum {"NOTDEFINED", "USERDEFINED", "HEATRECOVERY", "WATERCOOLED", "AIRCOOLED"};

	type IfcCoilTypeEnum {"NOTDEFINED", "USERDEFINED", "GASHEATINGCOIL", "ELECTRICHEATINGCOIL", "WATERHEATINGCOIL", "STEAMHEATINGCOIL", "WATERCOOLINGCOIL", "DXCOOLINGCOIL"};

	type IfcColumnTypeEnum {"NOTDEFINED", "USERDEFINED", "COLUMN"};

	type IfcCompressorTypeEnum {"NOTDEFINED", "USERDEFINED", "TWINSCREW", "SINGLESCREW", "ROTARYVANE", "ROLLINGPISTON", "WELDEDSHELLHERMETIC", "SEMIHERMETIC", "HERMETIC", "OPENTYPE", "BOOSTER", "SINGLESTAGE", "TROCHOIDAL", "SCROLL", "ROTARY", "RECIPROCATING", "DYNAMIC"};

	type IfcCondenserTypeEnum {"NOTDEFINED", "USERDEFINED", "EVAPORATIVECOOLED", "AIRCOOLED", "WATERCOOLEDBRAZEDPLATE", "WATERCOOLEDTUBEINTUBE", "WATERCOOLEDSHELLCOIL", "WATERCOOLEDSHELLTUBE"};

	type IfcConnectionTypeEnum {"NOTDEFINED", "ATEND", "ATSTART", "ATPATH"};

	type IfcConstraintEnum {"NOTDEFINED", "USERDEFINED", "ADVISORY", "SOFT", "HARD"};

	type IfcControllerTypeEnum {"NOTDEFINED", "USERDEFINED", "TWOPOSITION", "TIMEDTWOPOSITION", "PROPORTIONALINTEGRALDERIVATIVE", "PROPORTIONALINTEGRAL", "PROPORTIONAL", "FLOATING"};

	type IfcCooledBeamTypeEnum {"NOTDEFINED", "USERDEFINED", "PASSIVE", "ACTIVE"};

	type IfcCoolingTowerTypeEnum {"NOTDEFINED", "USERDEFINED", "MECHANICALFORCEDDRAFT", "MECHANICALINDUCEDDRAFT", "NATURALDRAFT"};

	type IfcCostScheduleTypeEnum {"NOTDEFINED", "USERDEFINED", "SCHEDULEOFRATES", "UNPRICEDBILLOFQUANTITIES", "PRICEDBILLOFQUANTITIES", "TENDER", "ESTIMATE", "COSTPLAN", "BUDGET"};

	type IfcCoveringTypeEnum {"NOTDEFINED", "USERDEFINED", "WRAPPING", "SLEEVING", "MEMBRANE", "INSULATION", "ROOFING", "CLADDING", "FLOORING", "CEILING"};

	type IfcCurrencyEnum {"NOK", "ZWD", "ZAR", "XEU", "VND", "VEB", "USD", "TWD", "TTD", "TRL", "THB", "SKP", "SGD", "SEK", "SCR", "SAR", "RUR", "QAR", "PTN", "PLN", "PKR", "PHP", "PGK", "OMR", "NZD", "NLG", "MYR", "MXN", "MUR", "MTL", "LUF", "LKR", "KYD", "KWD", "KRW", "KES", "JPY", "JOD", "JMD", "ITL", "IRP", "INR", "ILS", "IDR", "ICK", "HUF", "HKD", "GRX", "GMD", "GIP", "GBP", "FRF", "FKP", "FJD", "FIM", "FAK", "EUR", "EST", "EGL", "DKK", "DEM", "DDP", "CZK", "CYS", "CNY", "CLP", "CHF", "CBD", "CAD", "BZD", "BWP", "BSD", "BRL", "BND", "BMD", "BHD", "BGL", "BEG", "BBD", "AUD", "ATS", "AES", "AED"};

	type IfcCurtainWallTypeEnum {"NOTDEFINED", "USERDEFINED"};

	type IfcDamperTypeEnum {"NOTDEFINED", "USERDEFINED", "FUMEHOODEXHAUST", "BALANCINGDAMPER", "GRAVITYRELIEFDAMPER", "GRAVITYDAMPER", "BLASTDAMPER", "RELIEFDAMPER", "BACKDRAFTDAMPER", "FIRESMOKEDAMPER", "SMOKEDAMPER", "FIREDAMPER", "CONTROLDAMPER"};

	type IfcDataOriginEnum {"NOTDEFINED", "USERDEFINED", "SIMULATED", "PREDICTED", "MEASURED"};

	type IfcDerivedUnitEnum {"USERDEFINED", "WARPINGMOMENTUNIT", "WARPINGCONSTANTUNIT", "THERMALEXPANSIONCOEFFICIENTUNIT", "TEMPERATUREGRADIENTUNIT", "SOUNDPRESSUREUNIT", "SOUNDPOWERUNIT", "SECTIONMODULUSUNIT", "SECTIONAREAINTEGRALUNIT", "ROTATIONALMASSUNIT", "PHUNIT", "MODULUSOFROTATIONALSUBGRADEREACTIONUNIT", "MODULUSOFLINEARSUBGRADEREACTIONUNIT", "MASSPERLENGTHUNIT", "LUMINOUSINTENSITYDISTRIBUTIONUNIT", "IONCONCENTRATIONUNIT", "HEATINGVALUEUNIT", "CURVATUREUNIT", "ACCELERATIONUNIT", "MODULUSOFSUBGRADEREACTIONUNIT", "ROTATIONALSTIFFNESSUNIT", "LINEARSTIFFNESSUNIT", "SHEARMODULUSUNIT", "MODULUSOFELASTICITYUNIT", "PLANARFORCEUNIT", "LINEARFORCEUNIT", "LINEARMOMENTUNIT", "MOMENTOFINERTIAUNIT", "TORQUEUNIT", "ROTATIONALFREQUENCYUNIT", "VOLUMETRICFLOWRATEUNIT", "VAPORPERMEABILITYUNIT", "THERMALTRANSMITTANCEUNIT", "THERMALRESISTANCEUNIT", "THERMALCONDUCTANCEUNIT", "THERMALADMITTANCEUNIT", "SPECIFICHEATCAPACITYUNIT", "MOLECULARWEIGHTUNIT", "MOISTUREDIFFUSIVITYUNIT", "MASSFLOWRATEUNIT", "MASSDENSITYUNIT", "LINEARVELOCITYUNIT", "KINEMATICVISCOSITYUNIT", "ISOTHERMALMOISTURECAPACITYUNIT", "INTEGERCOUNTRATEUNIT", "HEATFLUXDENSITYUNIT", "DYNAMICVISCOSITYUNIT", "COMPOUNDPLANEANGLEUNIT", "ANGULARVELOCITYUNIT"};

	type IfcDimensionExtentUsage {"TARGET", "ORIGIN"};

	type IfcDirectionSenseEnum {"NEGATIVE", "POSITIVE"};

	type IfcDistributionChamberElementTypeEnum {"NOTDEFINED", "USERDEFINED", "VALVECHAMBER", "TRENCH", "SUMP", "METERCHAMBER", "MANHOLE", "INSPECTIONPIT", "INSPECTIONCHAMBER", "FORMEDDUCT"};

	type IfcDocumentConfidentialityEnum {"NOTDEFINED", "USERDEFINED", "PERSONAL", "CONFIDENTIAL", "RESTRICTED", "PUBLIC"};

	type IfcDocumentStatusEnum {"NOTDEFINED", "REVISION", "FINAL", "FINALDRAFT", "DRAFT"};

	type IfcDoorPanelOperationEnum {"NOTDEFINED", "USERDEFINED", "ROLLINGUP", "REVOLVING", "FOLDING", "SLIDING", "DOUBLE_ACTING", "SWINGING"};

	type IfcDoorPanelPositionEnum {"NOTDEFINED", "RIGHT", "MIDDLE", "LEFT"};

	type IfcDoorStyleConstructionEnum {"NOTDEFINED", "USERDEFINED", "PLASTIC", "ALUMINIUM_PLASTIC", "ALUMINIUM_WOOD", "WOOD", "STEEL", "HIGH_GRADE_STEEL", "ALUMINIUM"};

	type IfcDoorStyleOperationEnum {"NOTDEFINED", "USERDEFINED", "ROLLINGUP", "REVOLVING", "DOUBLE_DOOR_FOLDING", "FOLDING_TO_RIGHT", "FOLDING_TO_LEFT", "DOUBLE_DOOR_SLIDING", "SLIDING_TO_RIGHT", "SLIDING_TO_LEFT", "DOUBLE_DOOR_DOUBLE_SWING", "DOUBLE_SWING_RIGHT", "DOUBLE_SWING_LEFT", "DOUBLE_DOOR_SINGLE_SWING_OPPOSITE_RIGHT", "DOUBLE_DOOR_SINGLE_SWING_OPPOSITE_LEFT", "DOUBLE_DOOR_SINGLE_SWING", "SINGLE_SWING_RIGHT", "SINGLE_SWING_LEFT"};

	type IfcDuctFittingTypeEnum {"NOTDEFINED", "USERDEFINED", "TRANSITION", "OBSTRUCTION", "JUNCTION", "EXIT", "ENTRY", "CONNECTOR", "BEND"};

	type IfcDuctSegmentTypeEnum {"NOTDEFINED", "USERDEFINED", "FLEXIBLESEGMENT", "RIGIDSEGMENT"};

	type IfcDuctSilencerTypeEnum {"NOTDEFINED", "USERDEFINED", "ROUND", "RECTANGULAR", "FLATOVAL"};

	type IfcElectricApplianceTypeEnum {"NOTDEFINED", "USERDEFINED", "WATERCOOLER", "WATERHEATER", "WASHINGMACHINE", "VENDINGMACHINE", "TV", "TUMBLEDRYER", "TELEPHONE", "SCANNER", "RADIANTHEATER", "REFRIGERATOR", "PRINTER", "PHOTOCOPIER", "MICROWAVE", "INDIRECTWATERHEATER", "HANDDRYER", "FRIDGE_FREEZER", "FREEZER", "FREESTANDINGFAN", "FACSIMILE", "ELECTRICHEATER", "ELECTRICCOOKER", "DISHWASHER", "DIRECTWATERHEATER", "COMPUTER"};

	type IfcElectricCurrentEnum {"NOTDEFINED", "DIRECT", "ALTERNATING"};

	type IfcElectricDistributionPointFunctionEnum {"NOTDEFINED", "USERDEFINED", "SWITCHBOARD", "MOTORCONTROLCENTRE", "MIMICPANEL", "INDICATORPANEL", "GASDETECTORPANEL", "DISTRIBUTIONBOARD", "CONTROLPANEL", "CONSUMERUNIT", "ALARMPANEL"};

	type IfcElectricFlowStorageDeviceTypeEnum {"NOTDEFINED", "USERDEFINED", "UPS", "INDUCTORBANK", "HARMONICFILTER", "CAPACITORBANK", "BATTERY"};

	type IfcElectricGeneratorTypeEnum {"NOTDEFINED", "USERDEFINED"};

	type IfcElectricHeaterTypeEnum {"NOTDEFINED", "USERDEFINED", "ELECTRICMATHEATER", "ELECTRICCABLEHEATER", "ELECTRICPOINTHEATER"};

	type IfcElectricMotorTypeEnum {"NOTDEFINED", "USERDEFINED", "SYNCHRONOUS", "RELUCTANCESYNCHRONOUS", "POLYPHASE", "INDUCTION", "DC"};

	type IfcElectricTimeControlTypeEnum {"NOTDEFINED", "USERDEFINED", "RELAY", "TIMEDELAY", "TIMECLOCK"};

	type IfcElementAssemblyTypeEnum {"NOTDEFINED", "USERDEFINED", "TRUSS", "SLAB_FIELD", "RIGID_FRAME", "REINFORCEMENT_UNIT", "GIRDER", "BRACED_FRAME", "BEAM_GRID", "ARCH", "ACCESSORY_ASSEMBLY"};

	type IfcElementCompositionEnum {"PARTIAL", "ELEMENT", "COMPLEX"};

	type IfcEnergySequenceEnum {"NOTDEFINED", "USERDEFINED", "AUXILIARY", "TERTIARY", "SECONDARY", "PRIMARY"};

	type IfcEnvironmentalImpactCategoryEnum {"NOTDEFINED", "USERDEFINED", "TRANSPORTATION", "MANUFACTURE", "INSTALLATION", "EXTRACTION", "DISPOSAL", "COMBINEDVALUE"};

	type IfcEvaporativeCoolerTypeEnum {"NOTDEFINED", "USERDEFINED", "INDIRECTDIRECTCOMBINATION", "INDIRECTEVAPORATIVECOOLINGTOWERORCOILCOOLER", "INDIRECTEVAPORATIVEWETCOIL", "INDIRECTEVAPORATIVEPACKAGEAIRCOOLER", "DIRECTEVAPORATIVEAIRWASHER", "DIRECTEVAPORATIVEPACKAGEDROTARYAIRCOOLER", "DIRECTEVAPORATIVESLINGERSPACKAGEDAIRCOOLER", "DIRECTEVAPORATIVERIGIDMEDIAAIRCOOLER", "DIRECTEVAPORATIVERANDOMMEDIAAIRCOOLER"};

	type IfcEvaporatorTypeEnum {"NOTDEFINED", "USERDEFINED", "SHELLANDCOIL", "FLOODEDSHELLANDTUBE", "DIRECTEXPANSIONBRAZEDPLATE", "DIRECTEXPANSIONTUBEINTUBE", "DIRECTEXPANSIONSHELLANDTUBE"};

	type IfcFanTypeEnum {"NOTDEFINED", "USERDEFINED", "PROPELLORAXIAL", "VANEAXIAL", "TUBEAXIAL", "CENTRIFUGALAIRFOIL", "CENTRIFUGALBACKWARDINCLINEDCURVED", "CENTRIFUGALRADIAL", "CENTRIFUGALFORWARDCURVED"};

	type IfcFilterTypeEnum {"NOTDEFINED", "USERDEFINED", "WATERFILTER", "STRAINER", "OILFILTER", "ODORFILTER", "AIRPARTICLEFILTER"};

	type IfcFireSuppressionTerminalTypeEnum {"NOTDEFINED", "USERDEFINED", "SPRINKLERDEFLECTOR", "SPRINKLER", "HOSEREEL", "FIREHYDRANT", "BREECHINGINLET"};

	type IfcFlowDirectionEnum {"NOTDEFINED", "SOURCEANDSINK", "SINK", "SOURCE"};

	type IfcFlowInstrumentTypeEnum {"NOTDEFINED", "USERDEFINED", "VOLTMETER_RMS", "VOLTMETER_PEAK", "PHASEANGLEMETER", "POWERFACTORMETER", "FREQUENCYMETER", "AMMETER", "THERMOMETER", "PRESSUREGAUGE"};

	type IfcFlowMeterTypeEnum {"NOTDEFINED", "USERDEFINED", "WATERMETER", "OILMETER", "GASMETER", "FLOWMETER", "ENERGYMETER", "ELECTRICMETER"};

	type IfcFootingTypeEnum {"NOTDEFINED", "USERDEFINED", "STRIP_FOOTING", "PILE_CAP", "PAD_FOOTING", "FOOTING_BEAM"};

	type IfcGasTerminalTypeEnum {"NOTDEFINED", "USERDEFINED", "GASBURNER", "GASBOOSTER", "GASAPPLIANCE"};

	type IfcGeometricProjectionEnum {"NOTDEFINED", "USERDEFINED", "ELEVATION_VIEW", "SECTION_VIEW", "REFLECTED_PLAN_VIEW", "PLAN_VIEW", "MODEL_VIEW", "SKETCH_VIEW", "GRAPH_VIEW"};

	type IfcGlobalOrLocalEnum {"LOCAL_COORDS", "GLOBAL_COORDS"};

	type IfcHeatExchangerTypeEnum {"NOTDEFINED", "USERDEFINED", "SHELLANDTUBE", "PLATE"};

	type IfcHumidifierTypeEnum {"NOTDEFINED", "USERDEFINED", "ASSISTEDSTEAM", "ASSISTEDBUTANE", "ASSISTEDPROPANE", "ASSISTEDNATURALGAS", "ASSISTEDELECTRIC", "ADIABATICCOMPRESSEDAIRNOZZLE", "ADIABATICRIGIDMEDIA", "ADIABATICULTRASONIC", "ADIABATICATOMIZING", "ADIABATICWETTEDELEMENT", "ADIABATICPAN", "ADIABATICAIRWASHER", "STEAMINJECTION"};

	type IfcInternalOrExternalEnum {"NOTDEFINED", "EXTERNAL", "INTERNAL"};

	type IfcInventoryTypeEnum {"NOTDEFINED", "USERDEFINED", "FURNITUREINVENTORY", "SPACEINVENTORY", "ASSETINVENTORY"};

	type IfcJunctionBoxTypeEnum {"NOTDEFINED", "USERDEFINED"};

	type IfcLampTypeEnum {"NOTDEFINED", "USERDEFINED", "TUNGSTENFILAMENT", "METALHALIDE", "HIGHPRESSURESODIUM", "HIGHPRESSUREMERCURY", "FLUORESCENT", "COMPACTFLUORESCENT"};

	type IfcLayerSetDirectionEnum {"AXIS3", "AXIS2", "AXIS1"};

	type IfcLightDistributionCurveEnum {"NOTDEFINED", "TYPE_C", "TYPE_B", "TYPE_A"};

	type IfcLightEmissionSourceEnum {"NOTDEFINED", "TUNGSTENFILAMENT", "METALHALIDE", "MAINVOLTAGEHALOGEN", "LOWVOLTAGEHALOGEN", "LOWPRESSURESODIUM", "LIGHTEMITTINGDIODE", "HIGHPRESSURESODIUM", "HIGHPRESSUREMERCURY", "FLUORESCENT", "COMPACTFLUORESCENT"};

	type IfcLightFixtureTypeEnum {"NOTDEFINED", "USERDEFINED", "DIRECTIONSOURCE", "POINTSOURCE"};

	type IfcLoadGroupTypeEnum {"NOTDEFINED", "USERDEFINED", "LOAD_COMBINATION", "LOAD_COMBINATION_GROUP", "LOAD_CASE", "LOAD_GROUP"};

	type IfcLogicalOperatorEnum {"LOGICALOR", "LOGICALAND"};

	type IfcMemberTypeEnum {"NOTDEFINED", "USERDEFINED", "STUD", "STRUT", "STRINGER", "RAFTER", "PURLIN", "POST", "PLATE", "MULLION", "MEMBER", "COLLAR", "CHORD", "BRACE"};

	type IfcMotorConnectionTypeEnum {"NOTDEFINED", "USERDEFINED", "DIRECTDRIVE", "COUPLING", "BELTDRIVE"};

	type IfcNullStyle {"NULL"};

	type IfcObjectTypeEnum {"NOTDEFINED", "PROJECT", "GROUP", "ACTOR", "RESOURCE", "CONTROL", "PROCESS", "PRODUCT"};

	type IfcObjectiveEnum {"NOTDEFINED", "USERDEFINED", "TRIGGERCONDITION", "SPECIFICATION", "REQUIREMENT", "HEALTHANDSAFETY", "DESIGNINTENT", "CODECOMPLIANCE"};

	type IfcOccupantTypeEnum {"NOTDEFINED", "USERDEFINED", "TENANT", "OWNER", "LETTINGAGENT", "LESSOR", "LESSEE", "ASSIGNOR", "ASSIGNEE"};

	type IfcOutletTypeEnum {"NOTDEFINED", "USERDEFINED", "POWEROUTLET", "COMMUNICATIONSOUTLET", "AUDIOVISUALOUTLET"};

	type IfcPermeableCoveringOperationEnum {"NOTDEFINED", "USERDEFINED", "SCREEN", "LOUVER", "GRILL"};

	type IfcPhysicalOrVirtualEnum {"NOTDEFINED", "VIRTUAL", "PHYSICAL"};

	type IfcPileConstructionEnum {"NOTDEFINED", "USERDEFINED", "PREFAB_STEEL", "PRECAST_CONCRETE", "COMPOSITE", "CAST_IN_PLACE"};

	type IfcPileTypeEnum {"NOTDEFINED", "USERDEFINED", "SUPPORT", "FRICTION", "COHESION"};

	type IfcPipeFittingTypeEnum {"NOTDEFINED", "USERDEFINED", "TRANSITION", "OBSTRUCTION", "JUNCTION", "EXIT", "ENTRY", "CONNECTOR", "BEND"};

	type IfcPipeSegmentTypeEnum {"NOTDEFINED", "USERDEFINED", "SPOOL", "GUTTER", "RIGIDSEGMENT", "FLEXIBLESEGMENT"};

	type IfcPlateTypeEnum {"NOTDEFINED", "USERDEFINED", "SHEET", "CURTAIN_PANEL"};

	type IfcProcedureTypeEnum {"NOTDEFINED", "USERDEFINED", "STARTUP", "SHUTDOWN", "DIAGNOSTIC", "CALIBRATION", "ADVICE_WARNING", "ADVICE_NOTE", "ADVICE_CAUTION"};

	type IfcProfileTypeEnum {"AREA", "CURVE"};

	type IfcProjectOrderRecordTypeEnum {"NOTDEFINED", "USERDEFINED", "WORK", "PURCHASE", "MOVE", "MAINTENANCE", "CHANGE"};

	type IfcProjectOrderTypeEnum {"NOTDEFINED", "USERDEFINED", "WORKORDER", "PURCHASEORDER", "MOVEORDER", "MAINTENANCEWORKORDER", "CHANGEORDER"};

	type IfcProjectedOrTrueLengthEnum {"TRUE_LENGTH", "PROJECTED_LENGTH"};

	type IfcPropertySourceEnum {"NOTKNOWN", "USERDEFINED", "MEASURED", "COMMISSIONING", "ASBUILT", "SIMULATED", "DESIGNMINIMUM", "DESIGNMAXIMUM", "DESIGN"};

	type IfcProtectiveDeviceTypeEnum {"NOTDEFINED", "USERDEFINED", "VARISTOR", "RESIDUALCURRENTSWITCH", "RESIDUALCURRENTCIRCUITBREAKER", "EARTHFAILUREDEVICE", "CIRCUITBREAKER", "FUSEDISCONNECTOR"};

	type IfcPumpTypeEnum {"NOTDEFINED", "USERDEFINED", "VERTICALTURBINE", "VERTICALINLINE", "SPLITCASE", "ENDSUCTION", "CIRCULATOR"};

	type IfcRailingTypeEnum {"NOTDEFINED", "USERDEFINED", "BALUSTRADE", "GUARDRAIL", "HANDRAIL"};

	type IfcRampFlightTypeEnum {"NOTDEFINED", "USERDEFINED", "SPIRAL", "STRAIGHT"};

	type IfcRampTypeEnum {"NOTDEFINED", "USERDEFINED", "SPIRAL_RAMP", "HALF_TURN_RAMP", "TWO_QUARTER_TURN_RAMP", "QUARTER_TURN_RAMP", "TWO_STRAIGHT_RUN_RAMP", "STRAIGHT_RUN_RAMP"};

	type IfcReflectanceMethodEnum {"NOTDEFINED", "STRAUSS", "PLASTIC", "PHONG", "MIRROR", "METAL", "MATT", "GLASS", "FLAT", "BLINN"};

	type IfcReinforcingBarRoleEnum {"NOTDEFINED", "USERDEFINED", "RING", "EDGE", "PUNCHING", "STUD", "LIGATURE", "SHEAR", "MAIN"};

	type IfcReinforcingBarSurfaceEnum {"TEXTURED", "PLAIN"};

	type IfcResourceConsumptionEnum {"NOTDEFINED", "USERDEFINED", "NOTOCCUPIED", "PARTIALLYOCCUPIED", "OCCUPIED", "NOTCONSUMED", "PARTIALLYCONSUMED", "CONSUMED"};

	type IfcRibPlateDirectionEnum {"DIRECTION_Y", "DIRECTION_X"};

	type IfcRoleEnum {"USERDEFINED", "RESELLER", "FIELDCONSTRUCTIONMANAGER", "CONSTRUCTIONMANAGER", "CONSULTANT", "OWNER", "ENGINEER", "COMISSIONINGENGINEER", "CIVILENGINEER", "FACILITIESMANAGER", "PROJECTMANAGER", "ELECTRICALENGINEER", "MECHANICALENGINEER", "BUILDINGOPERATOR", "BUILDINGOWNER", "CLIENT", "COSTENGINEER", "STRUCTURALENGINEER", "ARCHITECT", "SUBCONTRACTOR", "CONTRACTOR", "MANUFACTURER", "SUPPLIER"};

	type IfcRoofTypeEnum {"NOTDEFINED", "FREEFORM", "DOME_ROOF", "PAVILION_ROOF", "BUTTERFLY_ROOF", "RAINBOW_ROOF", "BARREL_ROOF", "MANSARD_ROOF", "GAMBREL_ROOF", "HIPPED_GABLE_ROOF", "HIP_ROOF", "GABLE_ROOF", "SHED_ROOF", "FLAT_ROOF"};

	type IfcSIPrefix {"ATTO", "FEMTO", "PICO", "NANO", "MICRO", "MILLI", "CENTI", "DECI", "DECA", "HECTO", "KILO", "MEGA", "GIGA", "TERA", "PETA", "EXA"};

	type IfcSIUnitName {"WEBER", "WATT", "VOLT", "TESLA", "STERADIAN", "SQUARE_METRE", "SIEVERT", "SIEMENS", "SECOND", "RADIAN", "PASCAL", "OHM", "NEWTON", "MOLE", "METRE", "LUX", "LUMEN", "KELVIN", "JOULE", "HERTZ", "HENRY", "GRAY", "GRAM", "FARAD", "DEGREE_CELSIUS", "CUBIC_METRE", "COULOMB", "CANDELA", "BECQUEREL", "AMPERE"};

	type IfcSanitaryTerminalTypeEnum {"NOTDEFINED", "USERDEFINED", "WCSEAT", "WASHHANDBASIN", "URINAL", "TOILETPAN", "SANITARYFOUNTAIN", "SINK", "SHOWER", "CISTERN", "BIDET", "BATH"};

	type IfcSectionTypeEnum {"TAPERED", "UNIFORM"};

	type IfcSensorTypeEnum {"NOTDEFINED", "USERDEFINED", "TEMPERATURESENSOR", "SOUNDSENSOR", "SMOKESENSOR", "PRESSURESENSOR", "MOVEMENTSENSOR", "MOISTURESENSOR", "LIGHTSENSOR", "HUMIDITYSENSOR", "HEATSENSOR", "GASSENSOR", "FLOWSENSOR", "FIRESENSOR", "CO2SENSOR"};

	type IfcSequenceEnum {"NOTDEFINED", "FINISH_FINISH", "FINISH_START", "START_FINISH", "START_START"};

	type IfcServiceLifeFactorTypeEnum {"NOTDEFINED", "USERDEFINED", "G_MAINTENANCELEVEL", "F_INUSECONDITIONS", "E_OUTDOORENVIRONMENT", "D_INDOORENVIRONMENT", "C_WORKEXECUTIONLEVEL", "B_DESIGNLEVEL", "A_QUALITYOFCOMPONENTS"};

	type IfcServiceLifeTypeEnum {"REFERENCESERVICELIFE", "PESSIMISTICREFERENCESERVICELIFE", "OPTIMISTICREFERENCESERVICELIFE", "EXPECTEDSERVICELIFE", "ACTUALSERVICELIFE"};

	type IfcSlabTypeEnum {"NOTDEFINED", "USERDEFINED", "BASESLAB", "LANDING", "ROOF", "FLOOR"};

	type IfcSoundScaleEnum {"NOTDEFINED", "USERDEFINED", "NR", "NC", "DBC", "DBB", "DBA"};

	type IfcSpaceHeaterTypeEnum {"NOTDEFINED", "USERDEFINED", "UNITHEATER", "FINNEDTUBEUNIT", "BASEBOARDHEATER", "CONVECTOR", "TUBULARRADIATOR", "PANELRADIATOR", "SECTIONALRADIATOR"};

	type IfcSpaceTypeEnum {"NOTDEFINED", "USERDEFINED"};

	type IfcStackTerminalTypeEnum {"NOTDEFINED", "USERDEFINED", "RAINWATERHOPPER", "COWL", "BIRDCAGE"};

	type IfcStairFlightTypeEnum {"NOTDEFINED", "USERDEFINED", "FREEFORM", "CURVED", "SPIRAL", "WINDER", "STRAIGHT"};

	type IfcStairTypeEnum {"NOTDEFINED", "USERDEFINED", "TWO_CURVED_RUN_STAIR", "CURVED_RUN_STAIR", "DOUBLE_RETURN_STAIR", "SPIRAL_STAIR", "THREE_QUARTER_TURN_STAIR", "THREE_QUARTER_WINDING_STAIR", "TWO_QUARTER_TURN_STAIR", "TWO_QUARTER_WINDING_STAIR", "HALF_TURN_STAIR", "HALF_WINDING_STAIR", "QUARTER_TURN_STAIR", "QUARTER_WINDING_STAIR", "TWO_STRAIGHT_RUN_STAIR", "STRAIGHT_RUN_STAIR"};

	type IfcStateEnum {"READONLYLOCKED", "READWRITELOCKED", "LOCKED", "READONLY", "READWRITE"};

	type IfcStructuralCurveTypeEnum {"NOTDEFINED", "USERDEFINED", "COMPRESSION_MEMBER", "TENSION_MEMBER", "CABLE", "PIN_JOINED_MEMBER", "RIGID_JOINED_MEMBER"};

	type IfcStructuralSurfaceTypeEnum {"NOTDEFINED", "USERDEFINED", "SHELL", "MEMBRANE_ELEMENT", "BENDING_ELEMENT"};

	type IfcSurfaceSide {"BOTH", "NEGATIVE", "POSITIVE"};

	type IfcSurfaceTextureEnum {"NOTDEFINED", "TRANSPARENCYMAP", "TEXTURE", "SPECULAR", "SHININESS", "SELFILLUMINATION", "REFLECTION", "OPACITY", "BUMP"};

	type IfcSwitchingDeviceTypeEnum {"NOTDEFINED", "USERDEFINED", "TOGGLESWITCH", "SWITCHDISCONNECTOR", "STARTER", "EMERGENCYSTOP", "CONTACTOR"};

	type IfcTankTypeEnum {"NOTDEFINED", "USERDEFINED", "PRESSUREVESSEL", "EXPANSION", "SECTIONAL", "PREFORMED"};

	type IfcTendonTypeEnum {"NOTDEFINED", "USERDEFINED", "COATED", "BAR", "WIRE", "STRAND"};

	type IfcTextPath {"DOWN", "UP", "RIGHT", "LEFT"};

	type IfcThermalLoadSourceEnum {"NOTDEFINED", "USERDEFINED", "INFILTRATION", "RELATIVEHUMIDITY", "DRYBULBTEMPERATURE", "AIREXCHANGERATE", "EXHAUSTAIR", "RECIRCULATEDAIR", "VENTILATIONOUTSIDEAIR", "VENTILATIONINDOORAIR", "EQUIPMENT", "LIGHTING", "PEOPLE"};

	type IfcThermalLoadTypeEnum {"NOTDEFINED", "RADIANT", "LATENT", "SENSIBLE"};

	type IfcTimeSeriesDataTypeEnum {"NOTDEFINED", "PIECEWISECONTINUOUS", "PIECEWISECONSTANT", "PIECEWISEBINARY", "DISCRETEBINARY", "DISCRETE", "CONTINUOUS"};

	type IfcTimeSeriesScheduleTypeEnum {"NOTDEFINED", "USERDEFINED", "DAILY", "WEEKLY", "MONTHLY", "ANNUAL"};

	type IfcTransformerTypeEnum {"NOTDEFINED", "USERDEFINED", "VOLTAGE", "FREQUENCY", "CURRENT"};

	type IfcTransitionCode {"CONTSAMEGRADIENTSAMECURVATURE", "CONTSAMEGRADIENT", "CONTINUOUS", "DISCONTINUOUS"};

	type IfcTransportElementTypeEnum {"NOTDEFINED", "USERDEFINED", "MOVINGWALKWAY", "ESCALATOR", "ELEVATOR"};

	type IfcTrimmingPreference {"UNSPECIFIED", "PARAMETER", "CARTESIAN"};

	type IfcTubeBundleTypeEnum {"NOTDEFINED", "USERDEFINED", "FINNED"};

	type IfcUnitEnum {"USERDEFINED", "VOLUMEUNIT", "TIMEUNIT", "THERMODYNAMICTEMPERATUREUNIT", "SOLIDANGLEUNIT", "RADIOACTIVITYUNIT", "PRESSUREUNIT", "POWERUNIT", "PLANEANGLEUNIT", "MASSUNIT", "MAGNETICFLUXUNIT", "MAGNETICFLUXDENSITYUNIT", "LUMINOUSINTENSITYUNIT", "LUMINOUSFLUXUNIT", "LENGTHUNIT", "INDUCTANCEUNIT", "ILLUMINANCEUNIT", "FREQUENCYUNIT", "FORCEUNIT", "ENERGYUNIT", "ELECTRICVOLTAGEUNIT", "ELECTRICRESISTANCEUNIT", "ELECTRICCURRENTUNIT", "ELECTRICCONDUCTANCEUNIT", "ELECTRICCHARGEUNIT", "ELECTRICCAPACITANCEUNIT", "DOSEEQUIVALENTUNIT", "AREAUNIT", "AMOUNTOFSUBSTANCEUNIT", "ABSORBEDDOSEUNIT"};

	type IfcUnitaryEquipmentTypeEnum {"NOTDEFINED", "USERDEFINED", "ROOFTOPUNIT", "SPLITSYSTEM", "AIRCONDITIONINGUNIT", "AIRHANDLER"};

	type IfcValveTypeEnum {"NOTDEFINED", "USERDEFINED", "STOPCOCK", "STEAMTRAP", "SAFETYCUTOFF", "REGULATING", "PRESSURERELIEF", "PRESSUREREDUCING", "MIXING", "ISOLATING", "GASTAP", "GASCOCK", "FLUSHING", "FAUCET", "DOUBLEREGULATING", "DOUBLECHECK", "DRAWOFFCOCK", "DIVERTING", "COMMISSIONING", "CHECK", "CHANGEOVER", "ANTIVACUUM", "AIRRELEASE"};

	type IfcVibrationIsolatorTypeEnum {"NOTDEFINED", "USERDEFINED", "SPRING", "COMPRESSION"};

	type IfcWallTypeEnum {"NOTDEFINED", "USERDEFINED", "PLUMBINGWALL", "ELEMENTEDWALL", "SHEAR", "POLYGONAL", "STANDARD"};

	type IfcWasteTerminalTypeEnum {"NOTDEFINED", "USERDEFINED", "WASTETRAP", "WASTEDISPOSALUNIT", "ROOFDRAIN", "PETROLINTERCEPTOR", "OILINTERCEPTOR", "GREASEINTERCEPTOR", "GULLYTRAP", "GULLYSUMP", "FLOORWASTE", "FLOORTRAP"};

	type IfcWindowPanelOperationEnum {"NOTDEFINED", "OTHEROPERATION", "FIXEDCASEMENT", "REMOVABLECASEMENT", "SLIDINGVERTICAL", "SLIDINGHORIZONTAL", "PIVOTVERTICAL", "PIVOTHORIZONTAL", "BOTTOMHUNG", "TOPHUNG", "TILTANDTURNLEFTHAND", "TILTANDTURNRIGHTHAND", "SIDEHUNGLEFTHAND", "SIDEHUNGRIGHTHAND"};

	type IfcWindowPanelPositionEnum {"NOTDEFINED", "TOP", "BOTTOM", "RIGHT", "MIDDLE", "LEFT"};

	type IfcWindowStyleConstructionEnum {"NOTDEFINED", "OTHER_CONSTRUCTION", "PLASTIC", "ALUMINIUM_WOOD", "WOOD", "STEEL", "HIGH_GRADE_STEEL", "ALUMINIUM"};

	type IfcWindowStyleOperationEnum {"NOTDEFINED", "USERDEFINED", "TRIPLE_PANEL_HORIZONTAL", "TRIPLE_PANEL_RIGHT", "TRIPLE_PANEL_LEFT", "TRIPLE_PANEL_TOP", "TRIPLE_PANEL_BOTTOM", "TRIPLE_PANEL_VERTICAL", "DOUBLE_PANEL_HORIZONTAL", "DOUBLE_PANEL_VERTICAL", "SINGLE_PANEL"};

	type IfcWorkControlTypeEnum {"NOTDEFINED", "USERDEFINED", "PLANNED", "BASELINE", "ACTUAL"};
}