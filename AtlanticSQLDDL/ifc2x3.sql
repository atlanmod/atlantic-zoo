CREATE TABLE IfcActorSelect (
	__IDIfcActorSelect__ Integer NOT NULL,
	PRIMARY KEY IfcActorSelect (__IDIfcActorSelect__)
) ;

CREATE TABLE IfcAxis2Placement (
	__IDIfcAxis2Placement__ Integer NOT NULL,
	PRIMARY KEY IfcAxis2Placement (__IDIfcAxis2Placement__)
) ;

CREATE TABLE IfcBooleanOperand (
	__IDIfcBooleanOperand__ Integer NOT NULL,
	PRIMARY KEY IfcBooleanOperand (__IDIfcBooleanOperand__)
) ;

CREATE TABLE IfcCharacterStyleSelect (
	__IDIfcCharacterStyleSelect__ Integer NOT NULL,
	PRIMARY KEY IfcCharacterStyleSelect (__IDIfcCharacterStyleSelect__)
) ;

CREATE TABLE IfcClassificationNotationSelect (
	__IDIfcClassificationNotationSelect__ Integer NOT NULL,
	PRIMARY KEY IfcClassificationNotationSelect (__IDIfcClassificationNotationSelect__)
) ;

CREATE TABLE IfcColour (
	__IDIfcColour__ Integer NOT NULL,
	PRIMARY KEY IfcColour (__IDIfcColour__)
) ;

CREATE TABLE IfcCsgSelect (
	__IDIfcCsgSelect__ Integer NOT NULL,
	PRIMARY KEY IfcCsgSelect (__IDIfcCsgSelect__)
) ;

CREATE TABLE IfcCurveFontOrScaledCurveFontSelect (
	__IDIfcCurveFontOrScaledCurveFontSelect__ Integer NOT NULL,
	PRIMARY KEY IfcCurveFontOrScaledCurveFontSelect (__IDIfcCurveFontOrScaledCurveFontSelect__)
) ;

CREATE TABLE IfcCurveOrEdgeCurve (
	__IDIfcCurveOrEdgeCurve__ Integer NOT NULL,
	PRIMARY KEY IfcCurveOrEdgeCurve (__IDIfcCurveOrEdgeCurve__)
) ;

CREATE TABLE IfcCurveStyleFontSelect (
	__IDIfcCurveStyleFontSelect__ Integer NOT NULL,
	PRIMARY KEY IfcCurveStyleFontSelect (__IDIfcCurveStyleFontSelect__)
) ;

CREATE TABLE IfcDateTimeSelect (
	__IDIfcDateTimeSelect__ Integer NOT NULL,
	PRIMARY KEY IfcDateTimeSelect (__IDIfcDateTimeSelect__)
) ;

CREATE TABLE IfcDefinedSymbolSelect (
	__IDIfcDefinedSymbolSelect__ Integer NOT NULL,
	PRIMARY KEY IfcDefinedSymbolSelect (__IDIfcDefinedSymbolSelect__)
) ;

CREATE TABLE IfcDocumentSelect (
	__IDIfcDocumentSelect__ Integer NOT NULL,
	PRIMARY KEY IfcDocumentSelect (__IDIfcDocumentSelect__)
) ;

CREATE TABLE IfcDraughtingCalloutElement (
	__IDIfcDraughtingCalloutElement__ Integer NOT NULL,
	PRIMARY KEY IfcDraughtingCalloutElement (__IDIfcDraughtingCalloutElement__)
) ;

CREATE TABLE IfcFillAreaStyleTileShapeSelect (
	__IDIfcFillAreaStyleTileShapeSelect__ Integer NOT NULL,
	PRIMARY KEY IfcFillAreaStyleTileShapeSelect (__IDIfcFillAreaStyleTileShapeSelect__)
) ;

CREATE TABLE IfcFillStyleSelect (
	__IDIfcFillStyleSelect__ Integer NOT NULL,
	PRIMARY KEY IfcFillStyleSelect (__IDIfcFillStyleSelect__)
) ;

CREATE TABLE IfcGeometricSetSelect (
	__IDIfcGeometricSetSelect__ Integer NOT NULL,
	PRIMARY KEY IfcGeometricSetSelect (__IDIfcGeometricSetSelect__)
) ;

CREATE TABLE IfcLayeredItem (
	__IDIfcLayeredItem__ Integer NOT NULL,
	FOREIGN KEY LayerAssignments (__FKLayerAssignments__) REFERENCES IfcPresentationLayerAssignment (__IDIfcPresentationLayerAssignment__),
	PRIMARY KEY IfcLayeredItem (__IDIfcLayeredItem__),
	__FKLayerAssignments__ Integer
) ;

CREATE TABLE IfcLibrarySelect (
	__IDIfcLibrarySelect__ Integer NOT NULL,
	PRIMARY KEY IfcLibrarySelect (__IDIfcLibrarySelect__)
) ;

CREATE TABLE IfcLightDistributionDataSourceSelect (
	__IDIfcLightDistributionDataSourceSelect__ Integer NOT NULL,
	PRIMARY KEY IfcLightDistributionDataSourceSelect (__IDIfcLightDistributionDataSourceSelect__)
) ;

CREATE TABLE IfcMaterialSelect (
	__IDIfcMaterialSelect__ Integer NOT NULL,
	PRIMARY KEY IfcMaterialSelect (__IDIfcMaterialSelect__)
) ;

CREATE TABLE IfcObjectReferenceSelect (
	__IDIfcObjectReferenceSelect__ Integer NOT NULL,
	PRIMARY KEY IfcObjectReferenceSelect (__IDIfcObjectReferenceSelect__)
) ;

CREATE TABLE IfcPointOrVertexPoint (
	__IDIfcPointOrVertexPoint__ Integer NOT NULL,
	PRIMARY KEY IfcPointOrVertexPoint (__IDIfcPointOrVertexPoint__)
) ;

CREATE TABLE IfcShell (
	__IDIfcShell__ Integer NOT NULL,
	PRIMARY KEY IfcShell (__IDIfcShell__)
) ;

CREATE TABLE IfcStructuralActivityAssignmentSelect (
	__IDIfcStructuralActivityAssignmentSelect__ Integer NOT NULL,
	FOREIGN KEY AssignedStructuralActivity (__FKAssignedStructuralActivity__) REFERENCES IfcRelConnectsStructuralActivity (__IDIfcRelConnectsStructuralActivity__),
	PRIMARY KEY IfcStructuralActivityAssignmentSelect (__IDIfcStructuralActivityAssignmentSelect__),
	__FKAssignedStructuralActivity__ Integer
) ;

CREATE TABLE IfcSurfaceOrFaceSurface (
	__IDIfcSurfaceOrFaceSurface__ Integer NOT NULL,
	PRIMARY KEY IfcSurfaceOrFaceSurface (__IDIfcSurfaceOrFaceSurface__)
) ;

CREATE TABLE IfcSurfaceStyleElementSelect (
	__IDIfcSurfaceStyleElementSelect__ Integer NOT NULL,
	PRIMARY KEY IfcSurfaceStyleElementSelect (__IDIfcSurfaceStyleElementSelect__)
) ;

CREATE TABLE IfcSymbolStyleSelect (
	__IDIfcSymbolStyleSelect__ Integer NOT NULL,
	PRIMARY KEY IfcSymbolStyleSelect (__IDIfcSymbolStyleSelect__)
) ;

CREATE TABLE IfcTextFontSelect (
	__IDIfcTextFontSelect__ Integer NOT NULL,
	PRIMARY KEY IfcTextFontSelect (__IDIfcTextFontSelect__)
) ;

CREATE TABLE IfcTextStyleSelect (
	__IDIfcTextStyleSelect__ Integer NOT NULL,
	PRIMARY KEY IfcTextStyleSelect (__IDIfcTextStyleSelect__)
) ;

CREATE TABLE IfcUnit (
	__IDIfcUnit__ Integer NOT NULL,
	PRIMARY KEY IfcUnit (__IDIfcUnit__)
) ;

CREATE TABLE IfcVectorOrDirection (
	__IDIfcVectorOrDirection__ Integer NOT NULL,
	PRIMARY KEY IfcVectorOrDirection (__IDIfcVectorOrDirection__)
) ;

CREATE TABLE IfcValue (
	__IDIfcValue__ Integer NOT NULL,
	IfcAbsorbedDoseMeasurevalue text,
	IfcAccelerationMeasurevalue text,
	IfcAmountOfSubstanceMeasurevalue text,
	IfcAngularVelocityMeasurevalue text,
	IfcAreaMeasurevalue text,
	IfcBooleanvalue text,
	IfcContextDependentMeasurevalue text,
	IfcCountMeasurevalue text,
	IfcCurvatureMeasurevalue text,
	IfcDescriptiveMeasurevalue text,
	IfcDoseEquivalentMeasurevalue text,
	IfcDynamicViscosityMeasurevalue text,
	IfcElectricCapacitanceMeasurevalue text,
	IfcElectricChargeMeasurevalue text,
	IfcElectricConductanceMeasurevalue text,
	IfcElectricCurrentMeasurevalue text,
	IfcElectricResistanceMeasurevalue text,
	IfcElectricVoltageMeasurevalue text,
	IfcEnergyMeasurevalue text,
	IfcForceMeasurevalue text,
	IfcFrequencyMeasurevalue text,
	IfcHeatFluxDensityMeasurevalue text,
	IfcHeatingValueMeasurevalue text,
	IfcIdentifiervalue text,
	IfcIlluminanceMeasurevalue text,
	IfcInductanceMeasurevalue text,
	IfcIntegervalue text,
	IfcIntegerCountRateMeasurevalue text,
	IfcIonConcentrationMeasurevalue text,
	IfcIsothermalMoistureCapacityMeasurevalue text,
	IfcKinematicViscosityMeasurevalue text,
	IfcLabelvalue text,
	IfcPositiveLengthMeasurevalue text,
	IfcLengthMeasurevalue text,
	IfcLinearForceMeasurevalue text,
	IfcLinearMomentMeasurevalue text,
	IfcLinearStiffnessMeasurevalue text,
	IfcLinearVelocityMeasurevalue text,
	IfcLogicalvalue text,
	IfcLuminousFluxMeasurevalue text,
	IfcLuminousIntensityDistributionMeasurevalue text,
	IfcLuminousIntensityMeasurevalue text,
	IfcMagneticFluxDensityMeasurevalue text,
	IfcMagneticFluxMeasurevalue text,
	IfcMassDensityMeasurevalue text,
	IfcMassFlowRateMeasurevalue text,
	IfcMassMeasurevalue text,
	IfcMassPerLengthMeasurevalue text,
	IfcModulusOfElasticityMeasurevalue text,
	IfcModulusOfLinearSubgradeReactionMeasurevalue text,
	IfcModulusOfRotationalSubgradeReactionMeasurevalue text,
	IfcModulusOfSubgradeReactionMeasurevalue text,
	IfcMoistureDiffusivityMeasurevalue text,
	IfcMolecularWeightMeasurevalue text,
	IfcMomentOfInertiaMeasurevalue text,
	IfcMonetaryMeasurevalue text,
	IfcNormalisedRatioMeasurevalue text,
	IfcNumericMeasurevalue text,
	IfcPHMeasurevalue text,
	IfcParameterValuevalue text,
	IfcPlanarForceMeasurevalue text,
	IfcPositivePlaneAngleMeasurevalue text,
	IfcPlaneAngleMeasurevalue text,
	IfcPositiveRatioMeasurevalue text,
	IfcPowerMeasurevalue text,
	IfcPressureMeasurevalue text,
	IfcRadioActivityMeasurevalue text,
	IfcRatioMeasurevalue text,
	IfcRealvalue text,
	IfcRotationalFrequencyMeasurevalue text,
	IfcRotationalMassMeasurevalue text,
	IfcRotationalStiffnessMeasurevalue text,
	IfcSectionModulusMeasurevalue text,
	IfcSectionalAreaIntegralMeasurevalue text,
	IfcShearModulusMeasurevalue text,
	IfcSolidAngleMeasurevalue text,
	IfcSoundPowerMeasurevalue text,
	IfcSoundPressureMeasurevalue text,
	IfcSpecificHeatCapacityMeasurevalue text,
	IfcTemperatureGradientMeasurevalue text,
	IfcTextvalue text,
	IfcThermalAdmittanceMeasurevalue text,
	IfcThermalConductivityMeasurevalue text,
	IfcThermalExpansionCoefficientMeasurevalue text,
	IfcThermalResistanceMeasurevalue text,
	IfcThermalTransmittanceMeasurevalue text,
	IfcThermodynamicTemperatureMeasurevalue text,
	IfcTimeMeasurevalue text,
	IfcTimeStampvalue text,
	IfcTorqueMeasurevalue text,
	IfcVaporPermeabilityMeasurevalue text,
	IfcVolumeMeasurevalue text,
	IfcVolumetricFlowRateMeasurevalue text,
	IfcWarpingConstantMeasurevalue text,
	IfcWarpingMomentMeasurevalue text,
	PRIMARY KEY IfcValue (__IDIfcValue__)
) ;

CREATE TABLE IfcTrimmingSelect (
	__IDIfcTrimmingSelect__ Integer NOT NULL,
	IfcParameterValuevalue text,
	FOREIGN KEY IfcCartesianPointvalue (__FKIfcCartesianPointvalue__) REFERENCES IfcCartesianPoint (__IDIfcCartesianPoint__),
	PRIMARY KEY IfcTrimmingSelect (__IDIfcTrimmingSelect__),
	__FKIfcCartesianPointvalue__ Integer
) ;

CREATE TABLE IfcSpecularHighlightSelect (
	__IDIfcSpecularHighlightSelect__ Integer NOT NULL,
	IfcSpecularRoughnessvalue text,
	IfcSpecularExponentvalue text,
	PRIMARY KEY IfcSpecularHighlightSelect (__IDIfcSpecularHighlightSelect__)
) ;

CREATE TABLE IfcSizeSelect (
	__IDIfcSizeSelect__ Integer NOT NULL,
	IfcPositiveRatioMeasurevalue text,
	IfcNormalisedRatioMeasurevalue text,
	IfcPositiveLengthMeasurevalue text,
	IfcDescriptiveMeasurevalue text,
	IfcLengthMeasurevalue text,
	IfcRatioMeasurevalue text,
	PRIMARY KEY IfcSizeSelect (__IDIfcSizeSelect__)
) ;

CREATE TABLE IfcSimpleValue (
	__IDIfcSimpleValue__ Integer NOT NULL,
	IfcLogicalvalue text,
	IfcLabelvalue text,
	IfcTextvalue text,
	IfcIdentifiervalue text,
	IfcBooleanvalue text,
	IfcRealvalue text,
	IfcIntegervalue text,
	PRIMARY KEY IfcSimpleValue (__IDIfcSimpleValue__)
) ;

CREATE TABLE IfcPresentationStyleSelect (
	__IDIfcPresentationStyleSelect__ Integer NOT NULL,
	IfcNullStylevalue text,
	FOREIGN KEY IfcSurfaceStylevalue (__FKIfcSurfaceStylevalue__) REFERENCES IfcSurfaceStyle (__IDIfcSurfaceStyle__),
	FOREIGN KEY IfcTextStylevalue (__FKIfcTextStylevalue__) REFERENCES IfcTextStyle (__IDIfcTextStyle__),
	FOREIGN KEY IfcFillAreaStylevalue (__FKIfcFillAreaStylevalue__) REFERENCES IfcFillAreaStyle (__IDIfcFillAreaStyle__),
	FOREIGN KEY IfcSymbolStylevalue (__FKIfcSymbolStylevalue__) REFERENCES IfcSymbolStyle (__IDIfcSymbolStyle__),
	FOREIGN KEY IfcCurveStylevalue (__FKIfcCurveStylevalue__) REFERENCES IfcCurveStyle (__IDIfcCurveStyle__),
	PRIMARY KEY IfcPresentationStyleSelect (__IDIfcPresentationStyleSelect__),
	__FKIfcSurfaceStylevalue__ Integer,
	__FKIfcTextStylevalue__ Integer,
	__FKIfcFillAreaStylevalue__ Integer,
	__FKIfcSymbolStylevalue__ Integer,
	__FKIfcCurveStylevalue__ Integer
) ;

CREATE TABLE IfcOrientationSelect (
	__IDIfcOrientationSelect__ Integer NOT NULL,
	IfcPlaneAngleMeasurevalue text,
	FOREIGN KEY IfcDirectionvalue (__FKIfcDirectionvalue__) REFERENCES IfcDirection (__IDIfcDirection__),
	PRIMARY KEY IfcOrientationSelect (__IDIfcOrientationSelect__),
	__FKIfcDirectionvalue__ Integer
) ;

CREATE TABLE IfcMetricValueSelect (
	__IDIfcMetricValueSelect__ Integer NOT NULL,
	FOREIGN KEY IfcDateTimeSelectvalue (__FKIfcDateTimeSelectvalue__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	IfcTextvalue text,
	FOREIGN KEY IfcCostValuevalue (__FKIfcCostValuevalue__) REFERENCES IfcCostValue (__IDIfcCostValue__),
	FOREIGN KEY IfcTimeSeriesvalue (__FKIfcTimeSeriesvalue__) REFERENCES IfcTimeSeries (__IDIfcTimeSeries__),
	FOREIGN KEY IfcTablevalue (__FKIfcTablevalue__) REFERENCES IfcTable (__IDIfcTable__),
	FOREIGN KEY IfcMeasureWithUnitvalue (__FKIfcMeasureWithUnitvalue__) REFERENCES IfcMeasureWithUnit (__IDIfcMeasureWithUnit__),
	PRIMARY KEY IfcMetricValueSelect (__IDIfcMetricValueSelect__),
	__FKIfcDateTimeSelectvalue__ Integer,
	__FKIfcCostValuevalue__ Integer,
	__FKIfcTimeSeriesvalue__ Integer,
	__FKIfcTablevalue__ Integer,
	__FKIfcMeasureWithUnitvalue__ Integer
) ;

CREATE TABLE IfcMeasureValue (
	__IDIfcMeasureValue__ Integer NOT NULL,
	IfcNormalisedRatioMeasurevalue text,
	IfcLuminousIntensityMeasurevalue text,
	IfcAmountOfSubstanceMeasurevalue text,
	IfcAreaMeasurevalue text,
	IfcContextDependentMeasurevalue text,
	IfcCountMeasurevalue text,
	IfcDescriptiveMeasurevalue text,
	IfcElectricCurrentMeasurevalue text,
	IfcLengthMeasurevalue text,
	IfcPositiveLengthMeasurevalue text,
	IfcMassMeasurevalue text,
	IfcNumericMeasurevalue text,
	IfcParameterValuevalue text,
	IfcPlaneAngleMeasurevalue text,
	IfcPositivePlaneAngleMeasurevalue text,
	IfcRatioMeasurevalue text,
	IfcPositiveRatioMeasurevalue text,
	IfcSolidAngleMeasurevalue text,
	IfcThermodynamicTemperatureMeasurevalue text,
	IfcTimeMeasurevalue text,
	IfcVolumeMeasurevalue text,
	PRIMARY KEY IfcMeasureValue (__IDIfcMeasureValue__)
) ;

CREATE TABLE IfcHatchLineDistanceSelect (
	__IDIfcHatchLineDistanceSelect__ Integer NOT NULL,
	IfcPositiveLengthMeasurevalue text,
	FOREIGN KEY IfcOneDirectionRepeatFactorvalue (__FKIfcOneDirectionRepeatFactorvalue__) REFERENCES IfcOneDirectionRepeatFactor (__IDIfcOneDirectionRepeatFactor__),
	PRIMARY KEY IfcHatchLineDistanceSelect (__IDIfcHatchLineDistanceSelect__),
	__FKIfcOneDirectionRepeatFactorvalue__ Integer
) ;

CREATE TABLE IfcDerivedMeasureValue (
	__IDIfcDerivedMeasureValue__ Integer NOT NULL,
	IfcIonConcentrationMeasurevalue text,
	IfcPHMeasurevalue text,
	IfcHeatingValueMeasurevalue text,
	IfcSoundPressureMeasurevalue text,
	IfcSoundPowerMeasurevalue text,
	IfcWarpingMomentMeasurevalue text,
	IfcWarpingConstantMeasurevalue text,
	IfcThermalExpansionCoefficientMeasurevalue text,
	IfcTemperatureGradientMeasurevalue text,
	IfcSectionModulusMeasurevalue text,
	IfcSectionalAreaIntegralMeasurevalue text,
	IfcRotationalMassMeasurevalue text,
	IfcModulusOfRotationalSubgradeReactionMeasurevalue text,
	IfcModulusOfLinearSubgradeReactionMeasurevalue text,
	IfcMassPerLengthMeasurevalue text,
	IfcCurvatureMeasurevalue text,
	IfcLuminousIntensityDistributionMeasurevalue text,
	IfcLinearMomentMeasurevalue text,
	IfcShearModulusMeasurevalue text,
	IfcRotationalStiffnessMeasurevalue text,
	IfcPlanarForceMeasurevalue text,
	IfcMomentOfInertiaMeasurevalue text,
	IfcModulusOfElasticityMeasurevalue text,
	IfcModulusOfSubgradeReactionMeasurevalue text,
	IfcLinearStiffnessMeasurevalue text,
	IfcLinearForceMeasurevalue text,
	IfcAccelerationMeasurevalue text,
	IfcTorqueMeasurevalue text,
	IfcRotationalFrequencyMeasurevalue text,
	IfcRadioActivityMeasurevalue text,
	IfcAbsorbedDoseMeasurevalue text,
	IfcElectricCapacitanceMeasurevalue text,
	IfcDoseEquivalentMeasurevalue text,
	IfcElectricChargeMeasurevalue text,
	IfcElectricConductanceMeasurevalue text,
	IfcElectricResistanceMeasurevalue text,
	IfcIlluminanceMeasurevalue text,
	IfcInductanceMeasurevalue text,
	IfcForceMeasurevalue text,
	IfcLuminousFluxMeasurevalue text,
	IfcMagneticFluxMeasurevalue text,
	IfcMagneticFluxDensityMeasurevalue text,
	IfcMonetaryMeasurevalue text,
	IfcSpecificHeatCapacityMeasurevalue text,
	IfcIsothermalMoistureCapacityMeasurevalue text,
	IfcMoistureDiffusivityMeasurevalue text,
	IfcVaporPermeabilityMeasurevalue text,
	IfcMolecularWeightMeasurevalue text,
	IfcThermalConductivityMeasurevalue text,
	IfcAngularVelocityMeasurevalue text,
	IfcDynamicViscosityMeasurevalue text,
	IfcElectricVoltageMeasurevalue text,
	IfcEnergyMeasurevalue text,
	IfcFrequencyMeasurevalue text,
	IfcHeatFluxDensityMeasurevalue text,
	IfcIntegerCountRateMeasurevalue text,
	IfcKinematicViscosityMeasurevalue text,
	IfcLinearVelocityMeasurevalue text,
	IfcMassDensityMeasurevalue text,
	IfcMassFlowRateMeasurevalue text,
	IfcPowerMeasurevalue text,
	IfcPressureMeasurevalue text,
	IfcThermalAdmittanceMeasurevalue text,
	IfcThermalResistanceMeasurevalue text,
	IfcThermalTransmittanceMeasurevalue text,
	IfcTimeStampvalue text,
	IfcVolumetricFlowRateMeasurevalue text,
	PRIMARY KEY IfcDerivedMeasureValue (__IDIfcDerivedMeasureValue__)
) ;

CREATE TABLE IfcConditionCriterionSelect (
	__IDIfcConditionCriterionSelect__ Integer NOT NULL,
	IfcLabelvalue text,
	FOREIGN KEY IfcMeasureWithUnitvalue (__FKIfcMeasureWithUnitvalue__) REFERENCES IfcMeasureWithUnit (__IDIfcMeasureWithUnit__),
	PRIMARY KEY IfcConditionCriterionSelect (__IDIfcConditionCriterionSelect__),
	__FKIfcMeasureWithUnitvalue__ Integer
) ;

CREATE TABLE IfcColourOrFactor (
	__IDIfcColourOrFactor__ Integer NOT NULL,
	IfcNormalisedRatioMeasurevalue text,
	FOREIGN KEY IfcColourRgbvalue (__FKIfcColourRgbvalue__) REFERENCES IfcColourRgb (__IDIfcColourRgb__),
	PRIMARY KEY IfcColourOrFactor (__IDIfcColourOrFactor__),
	__FKIfcColourRgbvalue__ Integer
) ;

CREATE TABLE IfcAppliedValueSelect (
	__IDIfcAppliedValueSelect__ Integer NOT NULL,
	IfcMonetaryMeasurevalue text,
	IfcRatioMeasurevalue text,
	FOREIGN KEY IfcMeasureWithUnitvalue (__FKIfcMeasureWithUnitvalue__) REFERENCES IfcMeasureWithUnit (__IDIfcMeasureWithUnit__),
	PRIMARY KEY IfcAppliedValueSelect (__IDIfcAppliedValueSelect__),
	__FKIfcMeasureWithUnitvalue__ Integer
) ;

CREATE TABLE Ifc2DCompositeCurve (
	__IDIfc2DCompositeCurve__ Integer NOT NULL,
	PRIMARY KEY Ifc2DCompositeCurve (__IDIfc2DCompositeCurve__)
) ;

CREATE TABLE IfcActionRequest (
	__IDIfcActionRequest__ Integer NOT NULL,
	RequestID text,
	PRIMARY KEY IfcActionRequest (__IDIfcActionRequest__)
) ;

CREATE TABLE IfcActor (
	__IDIfcActor__ Integer NOT NULL,
	FOREIGN KEY IsActingUpon (__FKIsActingUpon__) REFERENCES IfcRelAssignsToActor (__IDIfcRelAssignsToActor__),
	FOREIGN KEY TheActor (__FKTheActor__) REFERENCES IfcActorSelect (__IDIfcActorSelect__),
	PRIMARY KEY IfcActor (__IDIfcActor__),
	__FKIsActingUpon__ Integer,
	__FKTheActor__ Integer
) ;

CREATE TABLE IfcActorRole (
	__IDIfcActorRole__ Integer NOT NULL,
	Role text,
	UserDefinedRole text,
	Description text,
	PRIMARY KEY IfcActorRole (__IDIfcActorRole__)
) ;

CREATE TABLE IfcActuatorType (
	__IDIfcActuatorType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcActuatorType (__IDIfcActuatorType__)
) ;

CREATE TABLE IfcAddress (
	__IDIfcAddress__ Integer NOT NULL,
	Purpose text,
	Description text,
	UserDefinedPurpose text,
	FOREIGN KEY OfPerson (__FKOfPerson__) REFERENCES IfcPerson (__IDIfcPerson__),
	FOREIGN KEY OfOrganization (__FKOfOrganization__) REFERENCES IfcOrganization (__IDIfcOrganization__),
	PRIMARY KEY IfcAddress (__IDIfcAddress__),
	__FKOfPerson__ Integer,
	__FKOfOrganization__ Integer
) ;

CREATE TABLE IfcAirTerminalBoxType (
	__IDIfcAirTerminalBoxType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcAirTerminalBoxType (__IDIfcAirTerminalBoxType__)
) ;

CREATE TABLE IfcAirTerminalType (
	__IDIfcAirTerminalType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcAirTerminalType (__IDIfcAirTerminalType__)
) ;

CREATE TABLE IfcAirToAirHeatRecoveryType (
	__IDIfcAirToAirHeatRecoveryType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcAirToAirHeatRecoveryType (__IDIfcAirToAirHeatRecoveryType__)
) ;

CREATE TABLE IfcAlarmType (
	__IDIfcAlarmType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcAlarmType (__IDIfcAlarmType__)
) ;

CREATE TABLE IfcAngularDimension (
	__IDIfcAngularDimension__ Integer NOT NULL,
	PRIMARY KEY IfcAngularDimension (__IDIfcAngularDimension__)
) ;

CREATE TABLE IfcAnnotation (
	__IDIfcAnnotation__ Integer NOT NULL,
	PRIMARY KEY IfcAnnotation (__IDIfcAnnotation__)
) ;

CREATE TABLE IfcAnnotationCurveOccurrence (
	__IDIfcAnnotationCurveOccurrence__ Integer NOT NULL,
	FOREIGN KEY AnnotatedBySymbols (__FKAnnotatedBySymbols__) REFERENCES IfcTerminatorSymbol (__IDIfcTerminatorSymbol__),
	PRIMARY KEY IfcAnnotationCurveOccurrence (__IDIfcAnnotationCurveOccurrence__),
	__FKAnnotatedBySymbols__ Integer
) ;

CREATE TABLE IfcAnnotationFillArea (
	__IDIfcAnnotationFillArea__ Integer NOT NULL,
	FOREIGN KEY OuterBoundary (__FKOuterBoundary__) REFERENCES IfcCurve (__IDIfcCurve__),
	PRIMARY KEY IfcAnnotationFillArea (__IDIfcAnnotationFillArea__),
	__FKOuterBoundary__ Integer
) ;

CREATE TABLE IfcAnnotationFillAreaOccurrence (
	__IDIfcAnnotationFillAreaOccurrence__ Integer NOT NULL,
	FOREIGN KEY FillStyleTarget (__FKFillStyleTarget__) REFERENCES IfcPoint (__IDIfcPoint__),
	GlobalOrLocal text,
	PRIMARY KEY IfcAnnotationFillAreaOccurrence (__IDIfcAnnotationFillAreaOccurrence__),
	__FKFillStyleTarget__ Integer
) ;

CREATE TABLE IfcAnnotationOccurrence (
	__IDIfcAnnotationOccurrence__ Integer NOT NULL,
	PRIMARY KEY IfcAnnotationOccurrence (__IDIfcAnnotationOccurrence__)
) ;

CREATE TABLE IfcAnnotationSurface (
	__IDIfcAnnotationSurface__ Integer NOT NULL,
	FOREIGN KEY Item (__FKItem__) REFERENCES IfcGeometricRepresentationItem (__IDIfcGeometricRepresentationItem__),
	FOREIGN KEY TextureCoordinates (__FKTextureCoordinates__) REFERENCES IfcTextureCoordinate (__IDIfcTextureCoordinate__),
	PRIMARY KEY IfcAnnotationSurface (__IDIfcAnnotationSurface__),
	__FKItem__ Integer,
	__FKTextureCoordinates__ Integer
) ;

CREATE TABLE IfcAnnotationSurfaceOccurrence (
	__IDIfcAnnotationSurfaceOccurrence__ Integer NOT NULL,
	PRIMARY KEY IfcAnnotationSurfaceOccurrence (__IDIfcAnnotationSurfaceOccurrence__)
) ;

CREATE TABLE IfcAnnotationSymbolOccurrence (
	__IDIfcAnnotationSymbolOccurrence__ Integer NOT NULL,
	PRIMARY KEY IfcAnnotationSymbolOccurrence (__IDIfcAnnotationSymbolOccurrence__)
) ;

CREATE TABLE IfcAnnotationTextOccurrence (
	__IDIfcAnnotationTextOccurrence__ Integer NOT NULL,
	PRIMARY KEY IfcAnnotationTextOccurrence (__IDIfcAnnotationTextOccurrence__)
) ;

CREATE TABLE IfcApplication (
	__IDIfcApplication__ Integer NOT NULL,
	Version text,
	ApplicationFullName text,
	ApplicationIdentifier text,
	FOREIGN KEY ApplicationDeveloper (__FKApplicationDeveloper__) REFERENCES IfcOrganization (__IDIfcOrganization__),
	PRIMARY KEY IfcApplication (__IDIfcApplication__),
	__FKApplicationDeveloper__ Integer
) ;

CREATE TABLE IfcAppliedValue (
	__IDIfcAppliedValue__ Integer NOT NULL,
	Name text,
	Description text,
	FOREIGN KEY AppliedValue (__FKAppliedValue__) REFERENCES IfcAppliedValueSelect (__IDIfcAppliedValueSelect__),
	FOREIGN KEY ValuesReferenced (__FKValuesReferenced__) REFERENCES IfcReferencesValueDocument (__IDIfcReferencesValueDocument__),
	FOREIGN KEY ValueOfComponents (__FKValueOfComponents__) REFERENCES IfcAppliedValueRelationship (__IDIfcAppliedValueRelationship__),
	FOREIGN KEY IsComponentIn (__FKIsComponentIn__) REFERENCES IfcAppliedValueRelationship (__IDIfcAppliedValueRelationship__),
	FOREIGN KEY UnitBasis (__FKUnitBasis__) REFERENCES IfcMeasureWithUnit (__IDIfcMeasureWithUnit__),
	FOREIGN KEY ApplicableDate (__FKApplicableDate__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	FOREIGN KEY FixedUntilDate (__FKFixedUntilDate__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	PRIMARY KEY IfcAppliedValue (__IDIfcAppliedValue__),
	__FKAppliedValue__ Integer,
	__FKValuesReferenced__ Integer,
	__FKValueOfComponents__ Integer,
	__FKIsComponentIn__ Integer,
	__FKUnitBasis__ Integer,
	__FKApplicableDate__ Integer,
	__FKFixedUntilDate__ Integer
) ;

CREATE TABLE IfcAppliedValueRelationship (
	__IDIfcAppliedValueRelationship__ Integer NOT NULL,
	ArithmeticOperator text,
	Name text,
	Description text,
	FOREIGN KEY ComponentOfTotal (__FKComponentOfTotal__) REFERENCES IfcAppliedValue (__IDIfcAppliedValue__),
	PRIMARY KEY IfcAppliedValueRelationship (__IDIfcAppliedValueRelationship__),
	__FKComponentOfTotal__ Integer
) ;

CREATE TABLE IfcApproval (
	__IDIfcApproval__ Integer NOT NULL,
	Description text,
	ApprovalStatus text,
	ApprovalLevel text,
	ApprovalQualifier text,
	Name text,
	Identifier text,
	FOREIGN KEY Actors (__FKActors__) REFERENCES IfcApprovalActorRelationship (__IDIfcApprovalActorRelationship__),
	FOREIGN KEY IsRelatedWith (__FKIsRelatedWith__) REFERENCES IfcApprovalRelationship (__IDIfcApprovalRelationship__),
	FOREIGN KEY Relates (__FKRelates__) REFERENCES IfcApprovalRelationship (__IDIfcApprovalRelationship__),
	FOREIGN KEY ApprovalDateTime (__FKApprovalDateTime__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	PRIMARY KEY IfcApproval (__IDIfcApproval__),
	__FKActors__ Integer,
	__FKIsRelatedWith__ Integer,
	__FKRelates__ Integer,
	__FKApprovalDateTime__ Integer
) ;

CREATE TABLE IfcApprovalActorRelationship (
	__IDIfcApprovalActorRelationship__ Integer NOT NULL,
	FOREIGN KEY Actor (__FKActor__) REFERENCES IfcActorSelect (__IDIfcActorSelect__),
	FOREIGN KEY Approval (__FKApproval__) REFERENCES IfcApproval (__IDIfcApproval__),
	FOREIGN KEY Role (__FKRole__) REFERENCES IfcActorRole (__IDIfcActorRole__),
	PRIMARY KEY IfcApprovalActorRelationship (__IDIfcApprovalActorRelationship__),
	__FKActor__ Integer,
	__FKApproval__ Integer,
	__FKRole__ Integer
) ;

CREATE TABLE IfcApprovalPropertyRelationship (
	__IDIfcApprovalPropertyRelationship__ Integer NOT NULL,
	FOREIGN KEY Approval (__FKApproval__) REFERENCES IfcApproval (__IDIfcApproval__),
	PRIMARY KEY IfcApprovalPropertyRelationship (__IDIfcApprovalPropertyRelationship__),
	__FKApproval__ Integer
) ;

CREATE TABLE IfcApprovalRelationship (
	__IDIfcApprovalRelationship__ Integer NOT NULL,
	Description text,
	Name text,
	FOREIGN KEY RelatedApproval (__FKRelatedApproval__) REFERENCES IfcApproval (__IDIfcApproval__),
	FOREIGN KEY RelatingApproval (__FKRelatingApproval__) REFERENCES IfcApproval (__IDIfcApproval__),
	PRIMARY KEY IfcApprovalRelationship (__IDIfcApprovalRelationship__),
	__FKRelatedApproval__ Integer,
	__FKRelatingApproval__ Integer
) ;

CREATE TABLE IfcArbitraryClosedProfileDef (
	__IDIfcArbitraryClosedProfileDef__ Integer NOT NULL,
	FOREIGN KEY OuterCurve (__FKOuterCurve__) REFERENCES IfcCurve (__IDIfcCurve__),
	PRIMARY KEY IfcArbitraryClosedProfileDef (__IDIfcArbitraryClosedProfileDef__),
	__FKOuterCurve__ Integer
) ;

CREATE TABLE IfcArbitraryOpenProfileDef (
	__IDIfcArbitraryOpenProfileDef__ Integer NOT NULL,
	FOREIGN KEY Curve (__FKCurve__) REFERENCES IfcBoundedCurve (__IDIfcBoundedCurve__),
	PRIMARY KEY IfcArbitraryOpenProfileDef (__IDIfcArbitraryOpenProfileDef__),
	__FKCurve__ Integer
) ;

CREATE TABLE IfcArbitraryProfileDefWithVoids (
	__IDIfcArbitraryProfileDefWithVoids__ Integer NOT NULL,
	PRIMARY KEY IfcArbitraryProfileDefWithVoids (__IDIfcArbitraryProfileDefWithVoids__)
) ;

CREATE TABLE IfcAsset (
	__IDIfcAsset__ Integer NOT NULL,
	FOREIGN KEY OriginalValue (__FKOriginalValue__) REFERENCES IfcCostValue (__IDIfcCostValue__),
	FOREIGN KEY CurrentValue (__FKCurrentValue__) REFERENCES IfcCostValue (__IDIfcCostValue__),
	FOREIGN KEY TotalReplacementCost (__FKTotalReplacementCost__) REFERENCES IfcCostValue (__IDIfcCostValue__),
	FOREIGN KEY Owner (__FKOwner__) REFERENCES IfcActorSelect (__IDIfcActorSelect__),
	FOREIGN KEY User (__FKUser__) REFERENCES IfcActorSelect (__IDIfcActorSelect__),
	FOREIGN KEY ResponsiblePerson (__FKResponsiblePerson__) REFERENCES IfcPerson (__IDIfcPerson__),
	FOREIGN KEY IncorporationDate (__FKIncorporationDate__) REFERENCES IfcCalendarDate (__IDIfcCalendarDate__),
	FOREIGN KEY DepreciatedValue (__FKDepreciatedValue__) REFERENCES IfcCostValue (__IDIfcCostValue__),
	AssetID text,
	PRIMARY KEY IfcAsset (__IDIfcAsset__),
	__FKOriginalValue__ Integer,
	__FKCurrentValue__ Integer,
	__FKTotalReplacementCost__ Integer,
	__FKOwner__ Integer,
	__FKUser__ Integer,
	__FKResponsiblePerson__ Integer,
	__FKIncorporationDate__ Integer,
	__FKDepreciatedValue__ Integer
) ;

CREATE TABLE IfcAsymmetricIShapeProfileDef (
	__IDIfcAsymmetricIShapeProfileDef__ Integer NOT NULL,
	TopFlangeWidth text,
	TopFlangeThickness text,
	TopFlangeFilletRadius text,
	CentreOfGravityInY text,
	PRIMARY KEY IfcAsymmetricIShapeProfileDef (__IDIfcAsymmetricIShapeProfileDef__)
) ;

CREATE TABLE IfcAxis1Placement (
	__IDIfcAxis1Placement__ Integer NOT NULL,
	FOREIGN KEY Axis (__FKAxis__) REFERENCES IfcDirection (__IDIfcDirection__),
	PRIMARY KEY IfcAxis1Placement (__IDIfcAxis1Placement__),
	__FKAxis__ Integer
) ;

CREATE TABLE IfcAxis2Placement2D (
	__IDIfcAxis2Placement2D__ Integer NOT NULL,
	FOREIGN KEY RefDirection (__FKRefDirection__) REFERENCES IfcDirection (__IDIfcDirection__),
	PRIMARY KEY IfcAxis2Placement2D (__IDIfcAxis2Placement2D__),
	__FKRefDirection__ Integer
) ;

CREATE TABLE IfcAxis2Placement3D (
	__IDIfcAxis2Placement3D__ Integer NOT NULL,
	FOREIGN KEY Axis (__FKAxis__) REFERENCES IfcDirection (__IDIfcDirection__),
	FOREIGN KEY RefDirection (__FKRefDirection__) REFERENCES IfcDirection (__IDIfcDirection__),
	PRIMARY KEY IfcAxis2Placement3D (__IDIfcAxis2Placement3D__),
	__FKAxis__ Integer,
	__FKRefDirection__ Integer
) ;

CREATE TABLE IfcBSplineCurve (
	__IDIfcBSplineCurve__ Integer NOT NULL,
	Degree text,
	CurveForm text,
	ClosedCurve text,
	SelfIntersect text,
	PRIMARY KEY IfcBSplineCurve (__IDIfcBSplineCurve__)
) ;

CREATE TABLE IfcBeam (
	__IDIfcBeam__ Integer NOT NULL,
	PRIMARY KEY IfcBeam (__IDIfcBeam__)
) ;

CREATE TABLE IfcBeamType (
	__IDIfcBeamType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcBeamType (__IDIfcBeamType__)
) ;

CREATE TABLE IfcBezierCurve (
	__IDIfcBezierCurve__ Integer NOT NULL,
	PRIMARY KEY IfcBezierCurve (__IDIfcBezierCurve__)
) ;

CREATE TABLE IfcBlobTexture (
	__IDIfcBlobTexture__ Integer NOT NULL,
	RasterFormat text,
	RasterCode text,
	PRIMARY KEY IfcBlobTexture (__IDIfcBlobTexture__)
) ;

CREATE TABLE IfcBlock (
	__IDIfcBlock__ Integer NOT NULL,
	XLength text,
	YLength text,
	ZLength text,
	PRIMARY KEY IfcBlock (__IDIfcBlock__)
) ;

CREATE TABLE IfcBoilerType (
	__IDIfcBoilerType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcBoilerType (__IDIfcBoilerType__)
) ;

CREATE TABLE IfcBooleanClippingResult (
	__IDIfcBooleanClippingResult__ Integer NOT NULL,
	PRIMARY KEY IfcBooleanClippingResult (__IDIfcBooleanClippingResult__)
) ;

CREATE TABLE IfcBooleanResult (
	__IDIfcBooleanResult__ Integer NOT NULL,
	FOREIGN KEY FirstOperand (__FKFirstOperand__) REFERENCES IfcBooleanOperand (__IDIfcBooleanOperand__),
	FOREIGN KEY SecondOperand (__FKSecondOperand__) REFERENCES IfcBooleanOperand (__IDIfcBooleanOperand__),
	Operator text,
	PRIMARY KEY IfcBooleanResult (__IDIfcBooleanResult__),
	__FKFirstOperand__ Integer,
	__FKSecondOperand__ Integer
) ;

CREATE TABLE IfcBoundaryCondition (
	__IDIfcBoundaryCondition__ Integer NOT NULL,
	Name text,
	PRIMARY KEY IfcBoundaryCondition (__IDIfcBoundaryCondition__)
) ;

CREATE TABLE IfcBoundaryEdgeCondition (
	__IDIfcBoundaryEdgeCondition__ Integer NOT NULL,
	LinearStiffnessByLengthX text,
	LinearStiffnessByLengthY text,
	LinearStiffnessByLengthZ text,
	RotationalStiffnessByLengthX text,
	RotationalStiffnessByLengthY text,
	RotationalStiffnessByLengthZ text,
	PRIMARY KEY IfcBoundaryEdgeCondition (__IDIfcBoundaryEdgeCondition__)
) ;

CREATE TABLE IfcBoundaryFaceCondition (
	__IDIfcBoundaryFaceCondition__ Integer NOT NULL,
	LinearStiffnessByAreaX text,
	LinearStiffnessByAreaY text,
	LinearStiffnessByAreaZ text,
	PRIMARY KEY IfcBoundaryFaceCondition (__IDIfcBoundaryFaceCondition__)
) ;

CREATE TABLE IfcBoundaryNodeCondition (
	__IDIfcBoundaryNodeCondition__ Integer NOT NULL,
	LinearStiffnessX text,
	LinearStiffnessY text,
	LinearStiffnessZ text,
	RotationalStiffnessX text,
	RotationalStiffnessY text,
	RotationalStiffnessZ text,
	PRIMARY KEY IfcBoundaryNodeCondition (__IDIfcBoundaryNodeCondition__)
) ;

CREATE TABLE IfcBoundaryNodeConditionWarping (
	__IDIfcBoundaryNodeConditionWarping__ Integer NOT NULL,
	WarpingStiffness text,
	PRIMARY KEY IfcBoundaryNodeConditionWarping (__IDIfcBoundaryNodeConditionWarping__)
) ;

CREATE TABLE IfcBoundedCurve (
	__IDIfcBoundedCurve__ Integer NOT NULL,
	PRIMARY KEY IfcBoundedCurve (__IDIfcBoundedCurve__)
) ;

CREATE TABLE IfcBoundedSurface (
	__IDIfcBoundedSurface__ Integer NOT NULL,
	PRIMARY KEY IfcBoundedSurface (__IDIfcBoundedSurface__)
) ;

CREATE TABLE IfcBoundingBox (
	__IDIfcBoundingBox__ Integer NOT NULL,
	XDim text,
	YDim text,
	ZDim text,
	FOREIGN KEY Corner (__FKCorner__) REFERENCES IfcCartesianPoint (__IDIfcCartesianPoint__),
	PRIMARY KEY IfcBoundingBox (__IDIfcBoundingBox__),
	__FKCorner__ Integer
) ;

CREATE TABLE IfcBoxedHalfSpace (
	__IDIfcBoxedHalfSpace__ Integer NOT NULL,
	FOREIGN KEY Enclosure (__FKEnclosure__) REFERENCES IfcBoundingBox (__IDIfcBoundingBox__),
	PRIMARY KEY IfcBoxedHalfSpace (__IDIfcBoxedHalfSpace__),
	__FKEnclosure__ Integer
) ;

CREATE TABLE IfcBuilding (
	__IDIfcBuilding__ Integer NOT NULL,
	ElevationOfRefHeight text,
	ElevationOfTerrain text,
	FOREIGN KEY BuildingAddress (__FKBuildingAddress__) REFERENCES IfcPostalAddress (__IDIfcPostalAddress__),
	PRIMARY KEY IfcBuilding (__IDIfcBuilding__),
	__FKBuildingAddress__ Integer
) ;

CREATE TABLE IfcBuildingElement (
	__IDIfcBuildingElement__ Integer NOT NULL,
	PRIMARY KEY IfcBuildingElement (__IDIfcBuildingElement__)
) ;

CREATE TABLE IfcBuildingElementComponent (
	__IDIfcBuildingElementComponent__ Integer NOT NULL,
	PRIMARY KEY IfcBuildingElementComponent (__IDIfcBuildingElementComponent__)
) ;

CREATE TABLE IfcBuildingElementPart (
	__IDIfcBuildingElementPart__ Integer NOT NULL,
	PRIMARY KEY IfcBuildingElementPart (__IDIfcBuildingElementPart__)
) ;

CREATE TABLE IfcBuildingElementProxy (
	__IDIfcBuildingElementProxy__ Integer NOT NULL,
	CompositionType text,
	PRIMARY KEY IfcBuildingElementProxy (__IDIfcBuildingElementProxy__)
) ;

CREATE TABLE IfcBuildingElementProxyType (
	__IDIfcBuildingElementProxyType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcBuildingElementProxyType (__IDIfcBuildingElementProxyType__)
) ;

CREATE TABLE IfcBuildingElementType (
	__IDIfcBuildingElementType__ Integer NOT NULL,
	PRIMARY KEY IfcBuildingElementType (__IDIfcBuildingElementType__)
) ;

CREATE TABLE IfcBuildingStorey (
	__IDIfcBuildingStorey__ Integer NOT NULL,
	Elevation text,
	PRIMARY KEY IfcBuildingStorey (__IDIfcBuildingStorey__)
) ;

CREATE TABLE IfcCShapeProfileDef (
	__IDIfcCShapeProfileDef__ Integer NOT NULL,
	Depth text,
	Width text,
	WallThickness text,
	Girth text,
	InternalFilletRadius text,
	CentreOfGravityInX text,
	PRIMARY KEY IfcCShapeProfileDef (__IDIfcCShapeProfileDef__)
) ;

CREATE TABLE IfcCableCarrierFittingType (
	__IDIfcCableCarrierFittingType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcCableCarrierFittingType (__IDIfcCableCarrierFittingType__)
) ;

CREATE TABLE IfcCableCarrierSegmentType (
	__IDIfcCableCarrierSegmentType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcCableCarrierSegmentType (__IDIfcCableCarrierSegmentType__)
) ;

CREATE TABLE IfcCableSegmentType (
	__IDIfcCableSegmentType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcCableSegmentType (__IDIfcCableSegmentType__)
) ;

CREATE TABLE IfcCalendarDate (
	__IDIfcCalendarDate__ Integer NOT NULL,
	DayComponent text,
	MonthComponent text,
	YearComponent text,
	PRIMARY KEY IfcCalendarDate (__IDIfcCalendarDate__)
) ;

CREATE TABLE IfcCartesianPoint (
	__IDIfcCartesianPoint__ Integer NOT NULL,
	PRIMARY KEY IfcCartesianPoint (__IDIfcCartesianPoint__)
) ;

CREATE TABLE IfcCartesianTransformationOperator (
	__IDIfcCartesianTransformationOperator__ Integer NOT NULL,
	FOREIGN KEY Axis1 (__FKAxis1__) REFERENCES IfcDirection (__IDIfcDirection__),
	FOREIGN KEY Axis2 (__FKAxis2__) REFERENCES IfcDirection (__IDIfcDirection__),
	FOREIGN KEY LocalOrigin (__FKLocalOrigin__) REFERENCES IfcCartesianPoint (__IDIfcCartesianPoint__),
	Scale text,
	PRIMARY KEY IfcCartesianTransformationOperator (__IDIfcCartesianTransformationOperator__),
	__FKAxis1__ Integer,
	__FKAxis2__ Integer,
	__FKLocalOrigin__ Integer
) ;

CREATE TABLE IfcCartesianTransformationOperator2D (
	__IDIfcCartesianTransformationOperator2D__ Integer NOT NULL,
	PRIMARY KEY IfcCartesianTransformationOperator2D (__IDIfcCartesianTransformationOperator2D__)
) ;

CREATE TABLE IfcCartesianTransformationOperator2DnonUniform (
	__IDIfcCartesianTransformationOperator2DnonUniform__ Integer NOT NULL,
	Scale2 text,
	PRIMARY KEY IfcCartesianTransformationOperator2DnonUniform (__IDIfcCartesianTransformationOperator2DnonUniform__)
) ;

CREATE TABLE IfcCartesianTransformationOperator3D (
	__IDIfcCartesianTransformationOperator3D__ Integer NOT NULL,
	FOREIGN KEY Axis3 (__FKAxis3__) REFERENCES IfcDirection (__IDIfcDirection__),
	PRIMARY KEY IfcCartesianTransformationOperator3D (__IDIfcCartesianTransformationOperator3D__),
	__FKAxis3__ Integer
) ;

CREATE TABLE IfcCartesianTransformationOperator3DnonUniform (
	__IDIfcCartesianTransformationOperator3DnonUniform__ Integer NOT NULL,
	Scale2 text,
	Scale3 text,
	PRIMARY KEY IfcCartesianTransformationOperator3DnonUniform (__IDIfcCartesianTransformationOperator3DnonUniform__)
) ;

CREATE TABLE IfcCenterLineProfileDef (
	__IDIfcCenterLineProfileDef__ Integer NOT NULL,
	Thickness text,
	PRIMARY KEY IfcCenterLineProfileDef (__IDIfcCenterLineProfileDef__)
) ;

CREATE TABLE IfcChamferEdgeFeature (
	__IDIfcChamferEdgeFeature__ Integer NOT NULL,
	Width text,
	Height text,
	PRIMARY KEY IfcChamferEdgeFeature (__IDIfcChamferEdgeFeature__)
) ;

CREATE TABLE IfcChillerType (
	__IDIfcChillerType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcChillerType (__IDIfcChillerType__)
) ;

CREATE TABLE IfcCircle (
	__IDIfcCircle__ Integer NOT NULL,
	Radius text,
	PRIMARY KEY IfcCircle (__IDIfcCircle__)
) ;

CREATE TABLE IfcCircleHollowProfileDef (
	__IDIfcCircleHollowProfileDef__ Integer NOT NULL,
	WallThickness text,
	PRIMARY KEY IfcCircleHollowProfileDef (__IDIfcCircleHollowProfileDef__)
) ;

CREATE TABLE IfcCircleProfileDef (
	__IDIfcCircleProfileDef__ Integer NOT NULL,
	Radius text,
	PRIMARY KEY IfcCircleProfileDef (__IDIfcCircleProfileDef__)
) ;

CREATE TABLE IfcClassification (
	__IDIfcClassification__ Integer NOT NULL,
	Source text,
	Edition text,
	Name text,
	FOREIGN KEY Contains (__FKContains__) REFERENCES IfcClassificationItem (__IDIfcClassificationItem__),
	FOREIGN KEY EditionDate (__FKEditionDate__) REFERENCES IfcCalendarDate (__IDIfcCalendarDate__),
	PRIMARY KEY IfcClassification (__IDIfcClassification__),
	__FKContains__ Integer,
	__FKEditionDate__ Integer
) ;

CREATE TABLE IfcClassificationItem (
	__IDIfcClassificationItem__ Integer NOT NULL,
	FOREIGN KEY IsClassifiedItemIn (__FKIsClassifiedItemIn__) REFERENCES IfcClassificationItemRelationship (__IDIfcClassificationItemRelationship__),
	FOREIGN KEY IsClassifyingItemIn (__FKIsClassifyingItemIn__) REFERENCES IfcClassificationItemRelationship (__IDIfcClassificationItemRelationship__),
	FOREIGN KEY Notation (__FKNotation__) REFERENCES IfcClassificationNotationFacet (__IDIfcClassificationNotationFacet__),
	FOREIGN KEY ItemOf (__FKItemOf__) REFERENCES IfcClassification (__IDIfcClassification__),
	Title text,
	PRIMARY KEY IfcClassificationItem (__IDIfcClassificationItem__),
	__FKIsClassifiedItemIn__ Integer,
	__FKIsClassifyingItemIn__ Integer,
	__FKNotation__ Integer,
	__FKItemOf__ Integer
) ;

CREATE TABLE IfcClassificationItemRelationship (
	__IDIfcClassificationItemRelationship__ Integer NOT NULL,
	FOREIGN KEY RelatingItem (__FKRelatingItem__) REFERENCES IfcClassificationItem (__IDIfcClassificationItem__),
	PRIMARY KEY IfcClassificationItemRelationship (__IDIfcClassificationItemRelationship__),
	__FKRelatingItem__ Integer
) ;

CREATE TABLE IfcClassificationNotation (
	__IDIfcClassificationNotation__ Integer NOT NULL,
	PRIMARY KEY IfcClassificationNotation (__IDIfcClassificationNotation__)
) ;

CREATE TABLE IfcClassificationNotationFacet (
	__IDIfcClassificationNotationFacet__ Integer NOT NULL,
	NotationValue text,
	PRIMARY KEY IfcClassificationNotationFacet (__IDIfcClassificationNotationFacet__)
) ;

CREATE TABLE IfcClassificationReference (
	__IDIfcClassificationReference__ Integer NOT NULL,
	FOREIGN KEY ReferencedSource (__FKReferencedSource__) REFERENCES IfcClassification (__IDIfcClassification__),
	PRIMARY KEY IfcClassificationReference (__IDIfcClassificationReference__),
	__FKReferencedSource__ Integer
) ;

CREATE TABLE IfcClosedShell (
	__IDIfcClosedShell__ Integer NOT NULL,
	PRIMARY KEY IfcClosedShell (__IDIfcClosedShell__)
) ;

CREATE TABLE IfcCoilType (
	__IDIfcCoilType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcCoilType (__IDIfcCoilType__)
) ;

CREATE TABLE IfcColourRgb (
	__IDIfcColourRgb__ Integer NOT NULL,
	Red text,
	Green text,
	Blue text,
	PRIMARY KEY IfcColourRgb (__IDIfcColourRgb__)
) ;

CREATE TABLE IfcColourSpecification (
	__IDIfcColourSpecification__ Integer NOT NULL,
	Name text,
	PRIMARY KEY IfcColourSpecification (__IDIfcColourSpecification__)
) ;

CREATE TABLE IfcColumn (
	__IDIfcColumn__ Integer NOT NULL,
	PRIMARY KEY IfcColumn (__IDIfcColumn__)
) ;

CREATE TABLE IfcColumnType (
	__IDIfcColumnType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcColumnType (__IDIfcColumnType__)
) ;

CREATE TABLE IfcComplexProperty (
	__IDIfcComplexProperty__ Integer NOT NULL,
	UsageName text,
	PRIMARY KEY IfcComplexProperty (__IDIfcComplexProperty__)
) ;

CREATE TABLE IfcCompositeCurve (
	__IDIfcCompositeCurve__ Integer NOT NULL,
	SelfIntersect text,
	PRIMARY KEY IfcCompositeCurve (__IDIfcCompositeCurve__)
) ;

CREATE TABLE IfcCompositeCurveSegment (
	__IDIfcCompositeCurveSegment__ Integer NOT NULL,
	Transition text,
	SameSense text,
	FOREIGN KEY UsingCurves (__FKUsingCurves__) REFERENCES IfcCompositeCurve (__IDIfcCompositeCurve__),
	FOREIGN KEY ParentCurve (__FKParentCurve__) REFERENCES IfcCurve (__IDIfcCurve__),
	PRIMARY KEY IfcCompositeCurveSegment (__IDIfcCompositeCurveSegment__),
	__FKUsingCurves__ Integer,
	__FKParentCurve__ Integer
) ;

CREATE TABLE IfcCompositeProfileDef (
	__IDIfcCompositeProfileDef__ Integer NOT NULL,
	"Label" text,
	PRIMARY KEY IfcCompositeProfileDef (__IDIfcCompositeProfileDef__)
) ;

CREATE TABLE IfcCompressorType (
	__IDIfcCompressorType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcCompressorType (__IDIfcCompressorType__)
) ;

CREATE TABLE IfcCondenserType (
	__IDIfcCondenserType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcCondenserType (__IDIfcCondenserType__)
) ;

CREATE TABLE IfcCondition (
	__IDIfcCondition__ Integer NOT NULL,
	PRIMARY KEY IfcCondition (__IDIfcCondition__)
) ;

CREATE TABLE IfcConditionCriterion (
	__IDIfcConditionCriterion__ Integer NOT NULL,
	FOREIGN KEY Criterion (__FKCriterion__) REFERENCES IfcConditionCriterionSelect (__IDIfcConditionCriterionSelect__),
	FOREIGN KEY CriterionDateTime (__FKCriterionDateTime__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	PRIMARY KEY IfcConditionCriterion (__IDIfcConditionCriterion__),
	__FKCriterion__ Integer,
	__FKCriterionDateTime__ Integer
) ;

CREATE TABLE IfcConic (
	__IDIfcConic__ Integer NOT NULL,
	FOREIGN KEY Position (__FKPosition__) REFERENCES IfcAxis2Placement (__IDIfcAxis2Placement__),
	PRIMARY KEY IfcConic (__IDIfcConic__),
	__FKPosition__ Integer
) ;

CREATE TABLE IfcConnectedFaceSet (
	__IDIfcConnectedFaceSet__ Integer NOT NULL,
	PRIMARY KEY IfcConnectedFaceSet (__IDIfcConnectedFaceSet__)
) ;

CREATE TABLE IfcConnectionCurveGeometry (
	__IDIfcConnectionCurveGeometry__ Integer NOT NULL,
	FOREIGN KEY CurveOnRelatingElement (__FKCurveOnRelatingElement__) REFERENCES IfcCurveOrEdgeCurve (__IDIfcCurveOrEdgeCurve__),
	FOREIGN KEY CurveOnRelatedElement (__FKCurveOnRelatedElement__) REFERENCES IfcCurveOrEdgeCurve (__IDIfcCurveOrEdgeCurve__),
	PRIMARY KEY IfcConnectionCurveGeometry (__IDIfcConnectionCurveGeometry__),
	__FKCurveOnRelatingElement__ Integer,
	__FKCurveOnRelatedElement__ Integer
) ;

CREATE TABLE IfcConnectionGeometry (
	__IDIfcConnectionGeometry__ Integer NOT NULL,
	PRIMARY KEY IfcConnectionGeometry (__IDIfcConnectionGeometry__)
) ;

CREATE TABLE IfcConnectionPointEccentricity (
	__IDIfcConnectionPointEccentricity__ Integer NOT NULL,
	EccentricityInX text,
	EccentricityInY text,
	EccentricityInZ text,
	PRIMARY KEY IfcConnectionPointEccentricity (__IDIfcConnectionPointEccentricity__)
) ;

CREATE TABLE IfcConnectionPointGeometry (
	__IDIfcConnectionPointGeometry__ Integer NOT NULL,
	FOREIGN KEY PointOnRelatingElement (__FKPointOnRelatingElement__) REFERENCES IfcPointOrVertexPoint (__IDIfcPointOrVertexPoint__),
	FOREIGN KEY PointOnRelatedElement (__FKPointOnRelatedElement__) REFERENCES IfcPointOrVertexPoint (__IDIfcPointOrVertexPoint__),
	PRIMARY KEY IfcConnectionPointGeometry (__IDIfcConnectionPointGeometry__),
	__FKPointOnRelatingElement__ Integer,
	__FKPointOnRelatedElement__ Integer
) ;

CREATE TABLE IfcConnectionPortGeometry (
	__IDIfcConnectionPortGeometry__ Integer NOT NULL,
	FOREIGN KEY LocationAtRelatingElement (__FKLocationAtRelatingElement__) REFERENCES IfcAxis2Placement (__IDIfcAxis2Placement__),
	FOREIGN KEY LocationAtRelatedElement (__FKLocationAtRelatedElement__) REFERENCES IfcAxis2Placement (__IDIfcAxis2Placement__),
	FOREIGN KEY ProfileOfPort (__FKProfileOfPort__) REFERENCES IfcProfileDef (__IDIfcProfileDef__),
	PRIMARY KEY IfcConnectionPortGeometry (__IDIfcConnectionPortGeometry__),
	__FKLocationAtRelatingElement__ Integer,
	__FKLocationAtRelatedElement__ Integer,
	__FKProfileOfPort__ Integer
) ;

CREATE TABLE IfcConnectionSurfaceGeometry (
	__IDIfcConnectionSurfaceGeometry__ Integer NOT NULL,
	FOREIGN KEY SurfaceOnRelatingElement (__FKSurfaceOnRelatingElement__) REFERENCES IfcSurfaceOrFaceSurface (__IDIfcSurfaceOrFaceSurface__),
	FOREIGN KEY SurfaceOnRelatedElement (__FKSurfaceOnRelatedElement__) REFERENCES IfcSurfaceOrFaceSurface (__IDIfcSurfaceOrFaceSurface__),
	PRIMARY KEY IfcConnectionSurfaceGeometry (__IDIfcConnectionSurfaceGeometry__),
	__FKSurfaceOnRelatingElement__ Integer,
	__FKSurfaceOnRelatedElement__ Integer
) ;

CREATE TABLE IfcConstraint (
	__IDIfcConstraint__ Integer NOT NULL,
	Name text,
	Description text,
	ConstraintGrade text,
	ConstraintSource text,
	UserDefinedGrade text,
	FOREIGN KEY ClassifiedAs (__FKClassifiedAs__) REFERENCES IfcConstraintClassificationRelationship (__IDIfcConstraintClassificationRelationship__),
	FOREIGN KEY RelatesConstraints (__FKRelatesConstraints__) REFERENCES IfcConstraintRelationship (__IDIfcConstraintRelationship__),
	FOREIGN KEY IsRelatedWith (__FKIsRelatedWith__) REFERENCES IfcConstraintRelationship (__IDIfcConstraintRelationship__),
	FOREIGN KEY PropertiesForConstraint (__FKPropertiesForConstraint__) REFERENCES IfcPropertyConstraintRelationship (__IDIfcPropertyConstraintRelationship__),
	FOREIGN KEY Aggregates (__FKAggregates__) REFERENCES IfcConstraintAggregationRelationship (__IDIfcConstraintAggregationRelationship__),
	FOREIGN KEY IsAggregatedIn (__FKIsAggregatedIn__) REFERENCES IfcConstraintAggregationRelationship (__IDIfcConstraintAggregationRelationship__),
	FOREIGN KEY CreatingActor (__FKCreatingActor__) REFERENCES IfcActorSelect (__IDIfcActorSelect__),
	FOREIGN KEY CreationTime (__FKCreationTime__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	PRIMARY KEY IfcConstraint (__IDIfcConstraint__),
	__FKClassifiedAs__ Integer,
	__FKRelatesConstraints__ Integer,
	__FKIsRelatedWith__ Integer,
	__FKPropertiesForConstraint__ Integer,
	__FKAggregates__ Integer,
	__FKIsAggregatedIn__ Integer,
	__FKCreatingActor__ Integer,
	__FKCreationTime__ Integer
) ;

CREATE TABLE IfcConstraintAggregationRelationship (
	__IDIfcConstraintAggregationRelationship__ Integer NOT NULL,
	Name text,
	Description text,
	LogicalAggregator text,
	FOREIGN KEY RelatingConstraint (__FKRelatingConstraint__) REFERENCES IfcConstraint (__IDIfcConstraint__),
	PRIMARY KEY IfcConstraintAggregationRelationship (__IDIfcConstraintAggregationRelationship__),
	__FKRelatingConstraint__ Integer
) ;

CREATE TABLE IfcConstraintClassificationRelationship (
	__IDIfcConstraintClassificationRelationship__ Integer NOT NULL,
	FOREIGN KEY ClassifiedConstraint (__FKClassifiedConstraint__) REFERENCES IfcConstraint (__IDIfcConstraint__),
	PRIMARY KEY IfcConstraintClassificationRelationship (__IDIfcConstraintClassificationRelationship__),
	__FKClassifiedConstraint__ Integer
) ;

CREATE TABLE IfcConstraintRelationship (
	__IDIfcConstraintRelationship__ Integer NOT NULL,
	Name text,
	Description text,
	FOREIGN KEY RelatingConstraint (__FKRelatingConstraint__) REFERENCES IfcConstraint (__IDIfcConstraint__),
	PRIMARY KEY IfcConstraintRelationship (__IDIfcConstraintRelationship__),
	__FKRelatingConstraint__ Integer
) ;

CREATE TABLE IfcConstructionEquipmentResource (
	__IDIfcConstructionEquipmentResource__ Integer NOT NULL,
	PRIMARY KEY IfcConstructionEquipmentResource (__IDIfcConstructionEquipmentResource__)
) ;

CREATE TABLE IfcConstructionMaterialResource (
	__IDIfcConstructionMaterialResource__ Integer NOT NULL,
	UsageRatio text,
	PRIMARY KEY IfcConstructionMaterialResource (__IDIfcConstructionMaterialResource__)
) ;

CREATE TABLE IfcConstructionProductResource (
	__IDIfcConstructionProductResource__ Integer NOT NULL,
	PRIMARY KEY IfcConstructionProductResource (__IDIfcConstructionProductResource__)
) ;

CREATE TABLE IfcConstructionResource (
	__IDIfcConstructionResource__ Integer NOT NULL,
	ResourceIdentifier text,
	ResourceGroup text,
	ResourceConsumption text,
	FOREIGN KEY BaseQuantity (__FKBaseQuantity__) REFERENCES IfcMeasureWithUnit (__IDIfcMeasureWithUnit__),
	PRIMARY KEY IfcConstructionResource (__IDIfcConstructionResource__),
	__FKBaseQuantity__ Integer
) ;

CREATE TABLE IfcContextDependentUnit (
	__IDIfcContextDependentUnit__ Integer NOT NULL,
	Name text,
	PRIMARY KEY IfcContextDependentUnit (__IDIfcContextDependentUnit__)
) ;

CREATE TABLE IfcControl (
	__IDIfcControl__ Integer NOT NULL,
	FOREIGN KEY Controls (__FKControls__) REFERENCES IfcRelAssignsToControl (__IDIfcRelAssignsToControl__),
	PRIMARY KEY IfcControl (__IDIfcControl__),
	__FKControls__ Integer
) ;

CREATE TABLE IfcControllerType (
	__IDIfcControllerType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcControllerType (__IDIfcControllerType__)
) ;

CREATE TABLE IfcConversionBasedUnit (
	__IDIfcConversionBasedUnit__ Integer NOT NULL,
	FOREIGN KEY ConversionFactor (__FKConversionFactor__) REFERENCES IfcMeasureWithUnit (__IDIfcMeasureWithUnit__),
	Name text,
	PRIMARY KEY IfcConversionBasedUnit (__IDIfcConversionBasedUnit__),
	__FKConversionFactor__ Integer
) ;

CREATE TABLE IfcCooledBeamType (
	__IDIfcCooledBeamType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcCooledBeamType (__IDIfcCooledBeamType__)
) ;

CREATE TABLE IfcCoolingTowerType (
	__IDIfcCoolingTowerType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcCoolingTowerType (__IDIfcCoolingTowerType__)
) ;

CREATE TABLE IfcCoordinatedUniversalTimeOffset (
	__IDIfcCoordinatedUniversalTimeOffset__ Integer NOT NULL,
	HourOffset text,
	MinuteOffset text,
	Sense text,
	PRIMARY KEY IfcCoordinatedUniversalTimeOffset (__IDIfcCoordinatedUniversalTimeOffset__)
) ;

CREATE TABLE IfcCostItem (
	__IDIfcCostItem__ Integer NOT NULL,
	PRIMARY KEY IfcCostItem (__IDIfcCostItem__)
) ;

CREATE TABLE IfcCostSchedule (
	__IDIfcCostSchedule__ Integer NOT NULL,
	Status text,
	ID text,
	PredefinedType text,
	FOREIGN KEY SubmittedBy (__FKSubmittedBy__) REFERENCES IfcActorSelect (__IDIfcActorSelect__),
	FOREIGN KEY PreparedBy (__FKPreparedBy__) REFERENCES IfcActorSelect (__IDIfcActorSelect__),
	FOREIGN KEY SubmittedOn (__FKSubmittedOn__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	FOREIGN KEY UpdateDate (__FKUpdateDate__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	PRIMARY KEY IfcCostSchedule (__IDIfcCostSchedule__),
	__FKSubmittedBy__ Integer,
	__FKPreparedBy__ Integer,
	__FKSubmittedOn__ Integer,
	__FKUpdateDate__ Integer
) ;

CREATE TABLE IfcCostValue (
	__IDIfcCostValue__ Integer NOT NULL,
	CostType text,
	"Condition" text,
	PRIMARY KEY IfcCostValue (__IDIfcCostValue__)
) ;

CREATE TABLE IfcCovering (
	__IDIfcCovering__ Integer NOT NULL,
	FOREIGN KEY CoversSpaces (__FKCoversSpaces__) REFERENCES IfcRelCoversSpaces (__IDIfcRelCoversSpaces__),
	FOREIGN KEY Covers (__FKCovers__) REFERENCES IfcRelCoversBldgElements (__IDIfcRelCoversBldgElements__),
	PredefinedType text,
	PRIMARY KEY IfcCovering (__IDIfcCovering__),
	__FKCoversSpaces__ Integer,
	__FKCovers__ Integer
) ;

CREATE TABLE IfcCoveringType (
	__IDIfcCoveringType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcCoveringType (__IDIfcCoveringType__)
) ;

CREATE TABLE IfcCraneRailAShapeProfileDef (
	__IDIfcCraneRailAShapeProfileDef__ Integer NOT NULL,
	OverallHeight text,
	BaseWidth2 text,
	Radius text,
	HeadWidth text,
	HeadDepth2 text,
	HeadDepth3 text,
	WebThickness text,
	BaseWidth4 text,
	BaseDepth1 text,
	BaseDepth2 text,
	BaseDepth3 text,
	CentreOfGravityInY text,
	PRIMARY KEY IfcCraneRailAShapeProfileDef (__IDIfcCraneRailAShapeProfileDef__)
) ;

CREATE TABLE IfcCraneRailFShapeProfileDef (
	__IDIfcCraneRailFShapeProfileDef__ Integer NOT NULL,
	OverallHeight text,
	HeadWidth text,
	Radius text,
	HeadDepth2 text,
	HeadDepth3 text,
	WebThickness text,
	BaseDepth1 text,
	BaseDepth2 text,
	CentreOfGravityInY text,
	PRIMARY KEY IfcCraneRailFShapeProfileDef (__IDIfcCraneRailFShapeProfileDef__)
) ;

CREATE TABLE IfcCrewResource (
	__IDIfcCrewResource__ Integer NOT NULL,
	PRIMARY KEY IfcCrewResource (__IDIfcCrewResource__)
) ;

CREATE TABLE IfcCsgPrimitive3D (
	__IDIfcCsgPrimitive3D__ Integer NOT NULL,
	FOREIGN KEY Position (__FKPosition__) REFERENCES IfcAxis2Placement3D (__IDIfcAxis2Placement3D__),
	PRIMARY KEY IfcCsgPrimitive3D (__IDIfcCsgPrimitive3D__),
	__FKPosition__ Integer
) ;

CREATE TABLE IfcCsgSolid (
	__IDIfcCsgSolid__ Integer NOT NULL,
	FOREIGN KEY TreeRootExpression (__FKTreeRootExpression__) REFERENCES IfcCsgSelect (__IDIfcCsgSelect__),
	PRIMARY KEY IfcCsgSolid (__IDIfcCsgSolid__),
	__FKTreeRootExpression__ Integer
) ;

CREATE TABLE IfcCurrencyRelationship (
	__IDIfcCurrencyRelationship__ Integer NOT NULL,
	FOREIGN KEY RelatingMonetaryUnit (__FKRelatingMonetaryUnit__) REFERENCES IfcMonetaryUnit (__IDIfcMonetaryUnit__),
	FOREIGN KEY RelatedMonetaryUnit (__FKRelatedMonetaryUnit__) REFERENCES IfcMonetaryUnit (__IDIfcMonetaryUnit__),
	FOREIGN KEY RateDateTime (__FKRateDateTime__) REFERENCES IfcDateAndTime (__IDIfcDateAndTime__),
	FOREIGN KEY RateSource (__FKRateSource__) REFERENCES IfcLibraryInformation (__IDIfcLibraryInformation__),
	ExchangeRate text,
	PRIMARY KEY IfcCurrencyRelationship (__IDIfcCurrencyRelationship__),
	__FKRelatingMonetaryUnit__ Integer,
	__FKRelatedMonetaryUnit__ Integer,
	__FKRateDateTime__ Integer,
	__FKRateSource__ Integer
) ;

CREATE TABLE IfcCurtainWall (
	__IDIfcCurtainWall__ Integer NOT NULL,
	PRIMARY KEY IfcCurtainWall (__IDIfcCurtainWall__)
) ;

CREATE TABLE IfcCurtainWallType (
	__IDIfcCurtainWallType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcCurtainWallType (__IDIfcCurtainWallType__)
) ;

CREATE TABLE IfcCurve (
	__IDIfcCurve__ Integer NOT NULL,
	PRIMARY KEY IfcCurve (__IDIfcCurve__)
) ;

CREATE TABLE IfcCurveBoundedPlane (
	__IDIfcCurveBoundedPlane__ Integer NOT NULL,
	FOREIGN KEY BasisSurface (__FKBasisSurface__) REFERENCES IfcPlane (__IDIfcPlane__),
	FOREIGN KEY OuterBoundary (__FKOuterBoundary__) REFERENCES IfcCurve (__IDIfcCurve__),
	PRIMARY KEY IfcCurveBoundedPlane (__IDIfcCurveBoundedPlane__),
	__FKBasisSurface__ Integer,
	__FKOuterBoundary__ Integer
) ;

CREATE TABLE IfcCurveStyle (
	__IDIfcCurveStyle__ Integer NOT NULL,
	FOREIGN KEY CurveFont (__FKCurveFont__) REFERENCES IfcCurveFontOrScaledCurveFontSelect (__IDIfcCurveFontOrScaledCurveFontSelect__),
	FOREIGN KEY CurveWidth (__FKCurveWidth__) REFERENCES IfcSizeSelect (__IDIfcSizeSelect__),
	FOREIGN KEY CurveColour (__FKCurveColour__) REFERENCES IfcColour (__IDIfcColour__),
	PRIMARY KEY IfcCurveStyle (__IDIfcCurveStyle__),
	__FKCurveFont__ Integer,
	__FKCurveWidth__ Integer,
	__FKCurveColour__ Integer
) ;

CREATE TABLE IfcCurveStyleFont (
	__IDIfcCurveStyleFont__ Integer NOT NULL,
	Name text,
	PRIMARY KEY IfcCurveStyleFont (__IDIfcCurveStyleFont__)
) ;

CREATE TABLE IfcCurveStyleFontAndScaling (
	__IDIfcCurveStyleFontAndScaling__ Integer NOT NULL,
	Name text,
	CurveFontScaling text,
	FOREIGN KEY CurveFont (__FKCurveFont__) REFERENCES IfcCurveStyleFontSelect (__IDIfcCurveStyleFontSelect__),
	PRIMARY KEY IfcCurveStyleFontAndScaling (__IDIfcCurveStyleFontAndScaling__),
	__FKCurveFont__ Integer
) ;

CREATE TABLE IfcCurveStyleFontPattern (
	__IDIfcCurveStyleFontPattern__ Integer NOT NULL,
	VisibleSegmentLength text,
	InvisibleSegmentLength text,
	PRIMARY KEY IfcCurveStyleFontPattern (__IDIfcCurveStyleFontPattern__)
) ;

CREATE TABLE IfcDamperType (
	__IDIfcDamperType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcDamperType (__IDIfcDamperType__)
) ;

CREATE TABLE IfcDateAndTime (
	__IDIfcDateAndTime__ Integer NOT NULL,
	FOREIGN KEY DateComponent (__FKDateComponent__) REFERENCES IfcCalendarDate (__IDIfcCalendarDate__),
	FOREIGN KEY TimeComponent (__FKTimeComponent__) REFERENCES IfcLocalTime (__IDIfcLocalTime__),
	PRIMARY KEY IfcDateAndTime (__IDIfcDateAndTime__),
	__FKDateComponent__ Integer,
	__FKTimeComponent__ Integer
) ;

CREATE TABLE IfcDefinedSymbol (
	__IDIfcDefinedSymbol__ Integer NOT NULL,
	FOREIGN KEY Definition (__FKDefinition__) REFERENCES IfcDefinedSymbolSelect (__IDIfcDefinedSymbolSelect__),
	FOREIGN KEY Target (__FKTarget__) REFERENCES IfcCartesianTransformationOperator2D (__IDIfcCartesianTransformationOperator2D__),
	PRIMARY KEY IfcDefinedSymbol (__IDIfcDefinedSymbol__),
	__FKDefinition__ Integer,
	__FKTarget__ Integer
) ;

CREATE TABLE IfcDerivedProfileDef (
	__IDIfcDerivedProfileDef__ Integer NOT NULL,
	FOREIGN KEY ParentProfile (__FKParentProfile__) REFERENCES IfcProfileDef (__IDIfcProfileDef__),
	FOREIGN KEY Operator (__FKOperator__) REFERENCES IfcCartesianTransformationOperator2D (__IDIfcCartesianTransformationOperator2D__),
	"Label" text,
	PRIMARY KEY IfcDerivedProfileDef (__IDIfcDerivedProfileDef__),
	__FKParentProfile__ Integer,
	__FKOperator__ Integer
) ;

CREATE TABLE IfcDerivedUnit (
	__IDIfcDerivedUnit__ Integer NOT NULL,
	UnitType text,
	UserDefinedType text,
	PRIMARY KEY IfcDerivedUnit (__IDIfcDerivedUnit__)
) ;

CREATE TABLE IfcDerivedUnitElement (
	__IDIfcDerivedUnitElement__ Integer NOT NULL,
	FOREIGN KEY Unit (__FKUnit__) REFERENCES IfcNamedUnit (__IDIfcNamedUnit__),
	Exponent text,
	PRIMARY KEY IfcDerivedUnitElement (__IDIfcDerivedUnitElement__),
	__FKUnit__ Integer
) ;

CREATE TABLE IfcDiameterDimension (
	__IDIfcDiameterDimension__ Integer NOT NULL,
	PRIMARY KEY IfcDiameterDimension (__IDIfcDiameterDimension__)
) ;

CREATE TABLE IfcDimensionCalloutRelationship (
	__IDIfcDimensionCalloutRelationship__ Integer NOT NULL,
	PRIMARY KEY IfcDimensionCalloutRelationship (__IDIfcDimensionCalloutRelationship__)
) ;

CREATE TABLE IfcDimensionCurve (
	__IDIfcDimensionCurve__ Integer NOT NULL,
	PRIMARY KEY IfcDimensionCurve (__IDIfcDimensionCurve__)
) ;

CREATE TABLE IfcDimensionCurveDirectedCallout (
	__IDIfcDimensionCurveDirectedCallout__ Integer NOT NULL,
	PRIMARY KEY IfcDimensionCurveDirectedCallout (__IDIfcDimensionCurveDirectedCallout__)
) ;

CREATE TABLE IfcDimensionCurveTerminator (
	__IDIfcDimensionCurveTerminator__ Integer NOT NULL,
	Role text,
	PRIMARY KEY IfcDimensionCurveTerminator (__IDIfcDimensionCurveTerminator__)
) ;

CREATE TABLE IfcDimensionPair (
	__IDIfcDimensionPair__ Integer NOT NULL,
	PRIMARY KEY IfcDimensionPair (__IDIfcDimensionPair__)
) ;

CREATE TABLE IfcDimensionalExponents (
	__IDIfcDimensionalExponents__ Integer NOT NULL,
	LengthExponent text,
	MassExponent text,
	TimeExponent text,
	ElectricCurrentExponent text,
	ThermodynamicTemperatureExponent text,
	AmountOfSubstanceExponent text,
	LuminousIntensityExponent text,
	PRIMARY KEY IfcDimensionalExponents (__IDIfcDimensionalExponents__)
) ;

CREATE TABLE IfcDirection (
	__IDIfcDirection__ Integer NOT NULL,
	PRIMARY KEY IfcDirection (__IDIfcDirection__)
) ;

CREATE TABLE IfcDiscreteAccessory (
	__IDIfcDiscreteAccessory__ Integer NOT NULL,
	PRIMARY KEY IfcDiscreteAccessory (__IDIfcDiscreteAccessory__)
) ;

CREATE TABLE IfcDiscreteAccessoryType (
	__IDIfcDiscreteAccessoryType__ Integer NOT NULL,
	PRIMARY KEY IfcDiscreteAccessoryType (__IDIfcDiscreteAccessoryType__)
) ;

CREATE TABLE IfcDistributionChamberElement (
	__IDIfcDistributionChamberElement__ Integer NOT NULL,
	PRIMARY KEY IfcDistributionChamberElement (__IDIfcDistributionChamberElement__)
) ;

CREATE TABLE IfcDistributionChamberElementType (
	__IDIfcDistributionChamberElementType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcDistributionChamberElementType (__IDIfcDistributionChamberElementType__)
) ;

CREATE TABLE IfcDistributionControlElement (
	__IDIfcDistributionControlElement__ Integer NOT NULL,
	FOREIGN KEY AssignedToFlowElement (__FKAssignedToFlowElement__) REFERENCES IfcRelFlowControlElements (__IDIfcRelFlowControlElements__),
	ControlElementId text,
	PRIMARY KEY IfcDistributionControlElement (__IDIfcDistributionControlElement__),
	__FKAssignedToFlowElement__ Integer
) ;

CREATE TABLE IfcDistributionControlElementType (
	__IDIfcDistributionControlElementType__ Integer NOT NULL,
	PRIMARY KEY IfcDistributionControlElementType (__IDIfcDistributionControlElementType__)
) ;

CREATE TABLE IfcDistributionElement (
	__IDIfcDistributionElement__ Integer NOT NULL,
	PRIMARY KEY IfcDistributionElement (__IDIfcDistributionElement__)
) ;

CREATE TABLE IfcDistributionElementType (
	__IDIfcDistributionElementType__ Integer NOT NULL,
	PRIMARY KEY IfcDistributionElementType (__IDIfcDistributionElementType__)
) ;

CREATE TABLE IfcDistributionFlowElement (
	__IDIfcDistributionFlowElement__ Integer NOT NULL,
	FOREIGN KEY HasControlElements (__FKHasControlElements__) REFERENCES IfcRelFlowControlElements (__IDIfcRelFlowControlElements__),
	PRIMARY KEY IfcDistributionFlowElement (__IDIfcDistributionFlowElement__),
	__FKHasControlElements__ Integer
) ;

CREATE TABLE IfcDistributionFlowElementType (
	__IDIfcDistributionFlowElementType__ Integer NOT NULL,
	PRIMARY KEY IfcDistributionFlowElementType (__IDIfcDistributionFlowElementType__)
) ;

CREATE TABLE IfcDistributionPort (
	__IDIfcDistributionPort__ Integer NOT NULL,
	FlowDirection text,
	PRIMARY KEY IfcDistributionPort (__IDIfcDistributionPort__)
) ;

CREATE TABLE IfcDocumentElectronicFormat (
	__IDIfcDocumentElectronicFormat__ Integer NOT NULL,
	FileExtension text,
	MimeContentType text,
	MimeSubtype text,
	PRIMARY KEY IfcDocumentElectronicFormat (__IDIfcDocumentElectronicFormat__)
) ;

CREATE TABLE IfcDocumentInformation (
	__IDIfcDocumentInformation__ Integer NOT NULL,
	DocumentId text,
	Name text,
	Description text,
	Purpose text,
	IntendedUse text,
	Scope text,
	Revision text,
	Confidentiality text,
	Status text,
	FOREIGN KEY IsPointedTo (__FKIsPointedTo__) REFERENCES IfcDocumentInformationRelationship (__IDIfcDocumentInformationRelationship__),
	FOREIGN KEY IsPointer (__FKIsPointer__) REFERENCES IfcDocumentInformationRelationship (__IDIfcDocumentInformationRelationship__),
	FOREIGN KEY DocumentOwner (__FKDocumentOwner__) REFERENCES IfcActorSelect (__IDIfcActorSelect__),
	FOREIGN KEY CreationTime (__FKCreationTime__) REFERENCES IfcDateAndTime (__IDIfcDateAndTime__),
	FOREIGN KEY LastRevisionTime (__FKLastRevisionTime__) REFERENCES IfcDateAndTime (__IDIfcDateAndTime__),
	FOREIGN KEY ElectronicFormat (__FKElectronicFormat__) REFERENCES IfcDocumentElectronicFormat (__IDIfcDocumentElectronicFormat__),
	FOREIGN KEY ValidFrom (__FKValidFrom__) REFERENCES IfcCalendarDate (__IDIfcCalendarDate__),
	FOREIGN KEY ValidUntil (__FKValidUntil__) REFERENCES IfcCalendarDate (__IDIfcCalendarDate__),
	PRIMARY KEY IfcDocumentInformation (__IDIfcDocumentInformation__),
	__FKIsPointedTo__ Integer,
	__FKIsPointer__ Integer,
	__FKDocumentOwner__ Integer,
	__FKCreationTime__ Integer,
	__FKLastRevisionTime__ Integer,
	__FKElectronicFormat__ Integer,
	__FKValidFrom__ Integer,
	__FKValidUntil__ Integer
) ;

CREATE TABLE IfcDocumentInformationRelationship (
	__IDIfcDocumentInformationRelationship__ Integer NOT NULL,
	FOREIGN KEY RelatingDocument (__FKRelatingDocument__) REFERENCES IfcDocumentInformation (__IDIfcDocumentInformation__),
	RelationshipType text,
	PRIMARY KEY IfcDocumentInformationRelationship (__IDIfcDocumentInformationRelationship__),
	__FKRelatingDocument__ Integer
) ;

CREATE TABLE IfcDocumentReference (
	__IDIfcDocumentReference__ Integer NOT NULL,
	FOREIGN KEY ReferenceToDocument (__FKReferenceToDocument__) REFERENCES IfcDocumentInformation (__IDIfcDocumentInformation__),
	PRIMARY KEY IfcDocumentReference (__IDIfcDocumentReference__),
	__FKReferenceToDocument__ Integer
) ;

CREATE TABLE IfcDoor (
	__IDIfcDoor__ Integer NOT NULL,
	OverallHeight text,
	OverallWidth text,
	PRIMARY KEY IfcDoor (__IDIfcDoor__)
) ;

CREATE TABLE IfcDoorLiningProperties (
	__IDIfcDoorLiningProperties__ Integer NOT NULL,
	LiningDepth text,
	LiningThickness text,
	ThresholdDepth text,
	ThresholdThickness text,
	TransomThickness text,
	TransomOffset text,
	LiningOffset text,
	ThresholdOffset text,
	CasingThickness text,
	CasingDepth text,
	FOREIGN KEY ShapeAspectStyle (__FKShapeAspectStyle__) REFERENCES IfcShapeAspect (__IDIfcShapeAspect__),
	PRIMARY KEY IfcDoorLiningProperties (__IDIfcDoorLiningProperties__),
	__FKShapeAspectStyle__ Integer
) ;

CREATE TABLE IfcDoorPanelProperties (
	__IDIfcDoorPanelProperties__ Integer NOT NULL,
	PanelDepth text,
	PanelOperation text,
	PanelWidth text,
	PanelPosition text,
	FOREIGN KEY ShapeAspectStyle (__FKShapeAspectStyle__) REFERENCES IfcShapeAspect (__IDIfcShapeAspect__),
	PRIMARY KEY IfcDoorPanelProperties (__IDIfcDoorPanelProperties__),
	__FKShapeAspectStyle__ Integer
) ;

CREATE TABLE IfcDoorStyle (
	__IDIfcDoorStyle__ Integer NOT NULL,
	OperationType text,
	ConstructionType text,
	ParameterTakesPrecedence text,
	Sizeable text,
	PRIMARY KEY IfcDoorStyle (__IDIfcDoorStyle__)
) ;

CREATE TABLE IfcDraughtingCallout (
	__IDIfcDraughtingCallout__ Integer NOT NULL,
	FOREIGN KEY IsRelatedFromCallout (__FKIsRelatedFromCallout__) REFERENCES IfcDraughtingCalloutRelationship (__IDIfcDraughtingCalloutRelationship__),
	FOREIGN KEY IsRelatedToCallout (__FKIsRelatedToCallout__) REFERENCES IfcDraughtingCalloutRelationship (__IDIfcDraughtingCalloutRelationship__),
	PRIMARY KEY IfcDraughtingCallout (__IDIfcDraughtingCallout__),
	__FKIsRelatedFromCallout__ Integer,
	__FKIsRelatedToCallout__ Integer
) ;

CREATE TABLE IfcDraughtingCalloutRelationship (
	__IDIfcDraughtingCalloutRelationship__ Integer NOT NULL,
	Name text,
	Description text,
	FOREIGN KEY RelatingDraughtingCallout (__FKRelatingDraughtingCallout__) REFERENCES IfcDraughtingCallout (__IDIfcDraughtingCallout__),
	FOREIGN KEY RelatedDraughtingCallout (__FKRelatedDraughtingCallout__) REFERENCES IfcDraughtingCallout (__IDIfcDraughtingCallout__),
	PRIMARY KEY IfcDraughtingCalloutRelationship (__IDIfcDraughtingCalloutRelationship__),
	__FKRelatingDraughtingCallout__ Integer,
	__FKRelatedDraughtingCallout__ Integer
) ;

CREATE TABLE IfcDraughtingPreDefinedColour (
	__IDIfcDraughtingPreDefinedColour__ Integer NOT NULL,
	PRIMARY KEY IfcDraughtingPreDefinedColour (__IDIfcDraughtingPreDefinedColour__)
) ;

CREATE TABLE IfcDraughtingPreDefinedCurveFont (
	__IDIfcDraughtingPreDefinedCurveFont__ Integer NOT NULL,
	PRIMARY KEY IfcDraughtingPreDefinedCurveFont (__IDIfcDraughtingPreDefinedCurveFont__)
) ;

CREATE TABLE IfcDraughtingPreDefinedTextFont (
	__IDIfcDraughtingPreDefinedTextFont__ Integer NOT NULL,
	PRIMARY KEY IfcDraughtingPreDefinedTextFont (__IDIfcDraughtingPreDefinedTextFont__)
) ;

CREATE TABLE IfcDuctFittingType (
	__IDIfcDuctFittingType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcDuctFittingType (__IDIfcDuctFittingType__)
) ;

CREATE TABLE IfcDuctSegmentType (
	__IDIfcDuctSegmentType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcDuctSegmentType (__IDIfcDuctSegmentType__)
) ;

CREATE TABLE IfcDuctSilencerType (
	__IDIfcDuctSilencerType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcDuctSilencerType (__IDIfcDuctSilencerType__)
) ;

CREATE TABLE IfcEdge (
	__IDIfcEdge__ Integer NOT NULL,
	FOREIGN KEY EdgeStart (__FKEdgeStart__) REFERENCES IfcVertex (__IDIfcVertex__),
	FOREIGN KEY EdgeEnd (__FKEdgeEnd__) REFERENCES IfcVertex (__IDIfcVertex__),
	PRIMARY KEY IfcEdge (__IDIfcEdge__),
	__FKEdgeStart__ Integer,
	__FKEdgeEnd__ Integer
) ;

CREATE TABLE IfcEdgeCurve (
	__IDIfcEdgeCurve__ Integer NOT NULL,
	FOREIGN KEY EdgeGeometry (__FKEdgeGeometry__) REFERENCES IfcCurve (__IDIfcCurve__),
	SameSense text,
	PRIMARY KEY IfcEdgeCurve (__IDIfcEdgeCurve__),
	__FKEdgeGeometry__ Integer
) ;

CREATE TABLE IfcEdgeFeature (
	__IDIfcEdgeFeature__ Integer NOT NULL,
	FeatureLength text,
	PRIMARY KEY IfcEdgeFeature (__IDIfcEdgeFeature__)
) ;

CREATE TABLE IfcEdgeLoop (
	__IDIfcEdgeLoop__ Integer NOT NULL,
	PRIMARY KEY IfcEdgeLoop (__IDIfcEdgeLoop__)
) ;

CREATE TABLE IfcElectricApplianceType (
	__IDIfcElectricApplianceType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcElectricApplianceType (__IDIfcElectricApplianceType__)
) ;

CREATE TABLE IfcElectricDistributionPoint (
	__IDIfcElectricDistributionPoint__ Integer NOT NULL,
	DistributionPointFunction text,
	UserDefinedFunction text,
	PRIMARY KEY IfcElectricDistributionPoint (__IDIfcElectricDistributionPoint__)
) ;

CREATE TABLE IfcElectricFlowStorageDeviceType (
	__IDIfcElectricFlowStorageDeviceType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcElectricFlowStorageDeviceType (__IDIfcElectricFlowStorageDeviceType__)
) ;

CREATE TABLE IfcElectricGeneratorType (
	__IDIfcElectricGeneratorType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcElectricGeneratorType (__IDIfcElectricGeneratorType__)
) ;

CREATE TABLE IfcElectricHeaterType (
	__IDIfcElectricHeaterType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcElectricHeaterType (__IDIfcElectricHeaterType__)
) ;

CREATE TABLE IfcElectricMotorType (
	__IDIfcElectricMotorType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcElectricMotorType (__IDIfcElectricMotorType__)
) ;

CREATE TABLE IfcElectricTimeControlType (
	__IDIfcElectricTimeControlType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcElectricTimeControlType (__IDIfcElectricTimeControlType__)
) ;

CREATE TABLE IfcElectricalBaseProperties (
	__IDIfcElectricalBaseProperties__ Integer NOT NULL,
	ElectricCurrentType text,
	InputVoltage text,
	InputFrequency text,
	FullLoadCurrent text,
	MinimumCircuitCurrent text,
	MaximumPowerInput text,
	RatedPowerInput text,
	InputPhase text,
	PRIMARY KEY IfcElectricalBaseProperties (__IDIfcElectricalBaseProperties__)
) ;

CREATE TABLE IfcElectricalCircuit (
	__IDIfcElectricalCircuit__ Integer NOT NULL,
	PRIMARY KEY IfcElectricalCircuit (__IDIfcElectricalCircuit__)
) ;

CREATE TABLE IfcElectricalElement (
	__IDIfcElectricalElement__ Integer NOT NULL,
	PRIMARY KEY IfcElectricalElement (__IDIfcElectricalElement__)
) ;

CREATE TABLE IfcElement (
	__IDIfcElement__ Integer NOT NULL,
	FOREIGN KEY FillsVoids (__FKFillsVoids__) REFERENCES IfcRelFillsElement (__IDIfcRelFillsElement__),
	FOREIGN KEY ConnectedTo (__FKConnectedTo__) REFERENCES IfcRelConnectsElements (__IDIfcRelConnectsElements__),
	FOREIGN KEY HasCoverings (__FKHasCoverings__) REFERENCES IfcRelCoversBldgElements (__IDIfcRelCoversBldgElements__),
	FOREIGN KEY HasProjections (__FKHasProjections__) REFERENCES IfcRelProjectsElement (__IDIfcRelProjectsElement__),
	FOREIGN KEY HasStructuralMember (__FKHasStructuralMember__) REFERENCES IfcRelConnectsStructuralElement (__IDIfcRelConnectsStructuralElement__),
	FOREIGN KEY HasPorts (__FKHasPorts__) REFERENCES IfcRelConnectsPortToElement (__IDIfcRelConnectsPortToElement__),
	FOREIGN KEY HasOpenings (__FKHasOpenings__) REFERENCES IfcRelVoidsElement (__IDIfcRelVoidsElement__),
	FOREIGN KEY IsConnectionRealization (__FKIsConnectionRealization__) REFERENCES IfcRelConnectsWithRealizingElements (__IDIfcRelConnectsWithRealizingElements__),
	FOREIGN KEY ProvidesBoundaries (__FKProvidesBoundaries__) REFERENCES IfcRelSpaceBoundary (__IDIfcRelSpaceBoundary__),
	FOREIGN KEY ConnectedFrom (__FKConnectedFrom__) REFERENCES IfcRelConnectsElements (__IDIfcRelConnectsElements__),
	Tag text,
	PRIMARY KEY IfcElement (__IDIfcElement__),
	__FKFillsVoids__ Integer,
	__FKConnectedTo__ Integer,
	__FKHasCoverings__ Integer,
	__FKHasProjections__ Integer,
	__FKHasStructuralMember__ Integer,
	__FKHasPorts__ Integer,
	__FKHasOpenings__ Integer,
	__FKIsConnectionRealization__ Integer,
	__FKProvidesBoundaries__ Integer,
	__FKConnectedFrom__ Integer
) ;

CREATE TABLE IfcElementAssembly (
	__IDIfcElementAssembly__ Integer NOT NULL,
	AssemblyPlace text,
	PredefinedType text,
	PRIMARY KEY IfcElementAssembly (__IDIfcElementAssembly__)
) ;

CREATE TABLE IfcElementComponent (
	__IDIfcElementComponent__ Integer NOT NULL,
	PRIMARY KEY IfcElementComponent (__IDIfcElementComponent__)
) ;

CREATE TABLE IfcElementComponentType (
	__IDIfcElementComponentType__ Integer NOT NULL,
	PRIMARY KEY IfcElementComponentType (__IDIfcElementComponentType__)
) ;

CREATE TABLE IfcElementQuantity (
	__IDIfcElementQuantity__ Integer NOT NULL,
	MethodOfMeasurement text,
	PRIMARY KEY IfcElementQuantity (__IDIfcElementQuantity__)
) ;

CREATE TABLE IfcElementType (
	__IDIfcElementType__ Integer NOT NULL,
	ElementType text,
	PRIMARY KEY IfcElementType (__IDIfcElementType__)
) ;

CREATE TABLE IfcElementarySurface (
	__IDIfcElementarySurface__ Integer NOT NULL,
	FOREIGN KEY Position (__FKPosition__) REFERENCES IfcAxis2Placement3D (__IDIfcAxis2Placement3D__),
	PRIMARY KEY IfcElementarySurface (__IDIfcElementarySurface__),
	__FKPosition__ Integer
) ;

CREATE TABLE IfcEllipse (
	__IDIfcEllipse__ Integer NOT NULL,
	SemiAxis1 text,
	SemiAxis2 text,
	PRIMARY KEY IfcEllipse (__IDIfcEllipse__)
) ;

CREATE TABLE IfcEllipseProfileDef (
	__IDIfcEllipseProfileDef__ Integer NOT NULL,
	SemiAxis1 text,
	SemiAxis2 text,
	PRIMARY KEY IfcEllipseProfileDef (__IDIfcEllipseProfileDef__)
) ;

CREATE TABLE IfcEnergyConversionDevice (
	__IDIfcEnergyConversionDevice__ Integer NOT NULL,
	PRIMARY KEY IfcEnergyConversionDevice (__IDIfcEnergyConversionDevice__)
) ;

CREATE TABLE IfcEnergyConversionDeviceType (
	__IDIfcEnergyConversionDeviceType__ Integer NOT NULL,
	PRIMARY KEY IfcEnergyConversionDeviceType (__IDIfcEnergyConversionDeviceType__)
) ;

CREATE TABLE IfcEnergyProperties (
	__IDIfcEnergyProperties__ Integer NOT NULL,
	EnergySequence text,
	UserDefinedEnergySequence text,
	PRIMARY KEY IfcEnergyProperties (__IDIfcEnergyProperties__)
) ;

CREATE TABLE IfcEnvironmentalImpactValue (
	__IDIfcEnvironmentalImpactValue__ Integer NOT NULL,
	ImpactType text,
	Category text,
	UserDefinedCategory text,
	PRIMARY KEY IfcEnvironmentalImpactValue (__IDIfcEnvironmentalImpactValue__)
) ;

CREATE TABLE IfcEquipmentElement (
	__IDIfcEquipmentElement__ Integer NOT NULL,
	PRIMARY KEY IfcEquipmentElement (__IDIfcEquipmentElement__)
) ;

CREATE TABLE IfcEquipmentStandard (
	__IDIfcEquipmentStandard__ Integer NOT NULL,
	PRIMARY KEY IfcEquipmentStandard (__IDIfcEquipmentStandard__)
) ;

CREATE TABLE IfcEvaporativeCoolerType (
	__IDIfcEvaporativeCoolerType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcEvaporativeCoolerType (__IDIfcEvaporativeCoolerType__)
) ;

CREATE TABLE IfcEvaporatorType (
	__IDIfcEvaporatorType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcEvaporatorType (__IDIfcEvaporatorType__)
) ;

CREATE TABLE IfcExtendedMaterialProperties (
	__IDIfcExtendedMaterialProperties__ Integer NOT NULL,
	Description text,
	Name text,
	PRIMARY KEY IfcExtendedMaterialProperties (__IDIfcExtendedMaterialProperties__)
) ;

CREATE TABLE IfcExternalReference (
	__IDIfcExternalReference__ Integer NOT NULL,
	Location text,
	ItemReference text,
	Name text,
	PRIMARY KEY IfcExternalReference (__IDIfcExternalReference__)
) ;

CREATE TABLE IfcExternallyDefinedHatchStyle (
	__IDIfcExternallyDefinedHatchStyle__ Integer NOT NULL,
	PRIMARY KEY IfcExternallyDefinedHatchStyle (__IDIfcExternallyDefinedHatchStyle__)
) ;

CREATE TABLE IfcExternallyDefinedSurfaceStyle (
	__IDIfcExternallyDefinedSurfaceStyle__ Integer NOT NULL,
	PRIMARY KEY IfcExternallyDefinedSurfaceStyle (__IDIfcExternallyDefinedSurfaceStyle__)
) ;

CREATE TABLE IfcExternallyDefinedSymbol (
	__IDIfcExternallyDefinedSymbol__ Integer NOT NULL,
	PRIMARY KEY IfcExternallyDefinedSymbol (__IDIfcExternallyDefinedSymbol__)
) ;

CREATE TABLE IfcExternallyDefinedTextFont (
	__IDIfcExternallyDefinedTextFont__ Integer NOT NULL,
	PRIMARY KEY IfcExternallyDefinedTextFont (__IDIfcExternallyDefinedTextFont__)
) ;

CREATE TABLE IfcExtrudedAreaSolid (
	__IDIfcExtrudedAreaSolid__ Integer NOT NULL,
	FOREIGN KEY ExtrudedDirection (__FKExtrudedDirection__) REFERENCES IfcDirection (__IDIfcDirection__),
	Depth text,
	PRIMARY KEY IfcExtrudedAreaSolid (__IDIfcExtrudedAreaSolid__),
	__FKExtrudedDirection__ Integer
) ;

CREATE TABLE IfcFace (
	__IDIfcFace__ Integer NOT NULL,
	PRIMARY KEY IfcFace (__IDIfcFace__)
) ;

CREATE TABLE IfcFaceBasedSurfaceModel (
	__IDIfcFaceBasedSurfaceModel__ Integer NOT NULL,
	PRIMARY KEY IfcFaceBasedSurfaceModel (__IDIfcFaceBasedSurfaceModel__)
) ;

CREATE TABLE IfcFaceBound (
	__IDIfcFaceBound__ Integer NOT NULL,
	FOREIGN KEY Bound (__FKBound__) REFERENCES IfcLoop (__IDIfcLoop__),
	Orientation text,
	PRIMARY KEY IfcFaceBound (__IDIfcFaceBound__),
	__FKBound__ Integer
) ;

CREATE TABLE IfcFaceOuterBound (
	__IDIfcFaceOuterBound__ Integer NOT NULL,
	PRIMARY KEY IfcFaceOuterBound (__IDIfcFaceOuterBound__)
) ;

CREATE TABLE IfcFaceSurface (
	__IDIfcFaceSurface__ Integer NOT NULL,
	FOREIGN KEY FaceSurface (__FKFaceSurface__) REFERENCES IfcSurface (__IDIfcSurface__),
	SameSense text,
	PRIMARY KEY IfcFaceSurface (__IDIfcFaceSurface__),
	__FKFaceSurface__ Integer
) ;

CREATE TABLE IfcFacetedBrep (
	__IDIfcFacetedBrep__ Integer NOT NULL,
	PRIMARY KEY IfcFacetedBrep (__IDIfcFacetedBrep__)
) ;

CREATE TABLE IfcFacetedBrepWithVoids (
	__IDIfcFacetedBrepWithVoids__ Integer NOT NULL,
	PRIMARY KEY IfcFacetedBrepWithVoids (__IDIfcFacetedBrepWithVoids__)
) ;

CREATE TABLE IfcFailureConnectionCondition (
	__IDIfcFailureConnectionCondition__ Integer NOT NULL,
	TensionFailureX text,
	TensionFailureY text,
	TensionFailureZ text,
	CompressionFailureX text,
	CompressionFailureY text,
	CompressionFailureZ text,
	PRIMARY KEY IfcFailureConnectionCondition (__IDIfcFailureConnectionCondition__)
) ;

CREATE TABLE IfcFanType (
	__IDIfcFanType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcFanType (__IDIfcFanType__)
) ;

CREATE TABLE IfcFastener (
	__IDIfcFastener__ Integer NOT NULL,
	PRIMARY KEY IfcFastener (__IDIfcFastener__)
) ;

CREATE TABLE IfcFastenerType (
	__IDIfcFastenerType__ Integer NOT NULL,
	PRIMARY KEY IfcFastenerType (__IDIfcFastenerType__)
) ;

CREATE TABLE IfcFeatureElement (
	__IDIfcFeatureElement__ Integer NOT NULL,
	PRIMARY KEY IfcFeatureElement (__IDIfcFeatureElement__)
) ;

CREATE TABLE IfcFeatureElementAddition (
	__IDIfcFeatureElementAddition__ Integer NOT NULL,
	FOREIGN KEY ProjectsElements (__FKProjectsElements__) REFERENCES IfcRelProjectsElement (__IDIfcRelProjectsElement__),
	PRIMARY KEY IfcFeatureElementAddition (__IDIfcFeatureElementAddition__),
	__FKProjectsElements__ Integer
) ;

CREATE TABLE IfcFeatureElementSubtraction (
	__IDIfcFeatureElementSubtraction__ Integer NOT NULL,
	FOREIGN KEY VoidsElements (__FKVoidsElements__) REFERENCES IfcRelVoidsElement (__IDIfcRelVoidsElement__),
	PRIMARY KEY IfcFeatureElementSubtraction (__IDIfcFeatureElementSubtraction__),
	__FKVoidsElements__ Integer
) ;

CREATE TABLE IfcFillAreaStyle (
	__IDIfcFillAreaStyle__ Integer NOT NULL,
	PRIMARY KEY IfcFillAreaStyle (__IDIfcFillAreaStyle__)
) ;

CREATE TABLE IfcFillAreaStyleHatching (
	__IDIfcFillAreaStyleHatching__ Integer NOT NULL,
	FOREIGN KEY StartOfNextHatchLine (__FKStartOfNextHatchLine__) REFERENCES IfcHatchLineDistanceSelect (__IDIfcHatchLineDistanceSelect__),
	FOREIGN KEY HatchLineAppearance (__FKHatchLineAppearance__) REFERENCES IfcCurveStyle (__IDIfcCurveStyle__),
	FOREIGN KEY PointOfReferenceHatchLine (__FKPointOfReferenceHatchLine__) REFERENCES IfcCartesianPoint (__IDIfcCartesianPoint__),
	FOREIGN KEY PatternStart (__FKPatternStart__) REFERENCES IfcCartesianPoint (__IDIfcCartesianPoint__),
	HatchLineAngle text,
	PRIMARY KEY IfcFillAreaStyleHatching (__IDIfcFillAreaStyleHatching__),
	__FKStartOfNextHatchLine__ Integer,
	__FKHatchLineAppearance__ Integer,
	__FKPointOfReferenceHatchLine__ Integer,
	__FKPatternStart__ Integer
) ;

CREATE TABLE IfcFillAreaStyleTileSymbolWithStyle (
	__IDIfcFillAreaStyleTileSymbolWithStyle__ Integer NOT NULL,
	FOREIGN KEY Symbol (__FKSymbol__) REFERENCES IfcAnnotationSymbolOccurrence (__IDIfcAnnotationSymbolOccurrence__),
	PRIMARY KEY IfcFillAreaStyleTileSymbolWithStyle (__IDIfcFillAreaStyleTileSymbolWithStyle__),
	__FKSymbol__ Integer
) ;

CREATE TABLE IfcFillAreaStyleTiles (
	__IDIfcFillAreaStyleTiles__ Integer NOT NULL,
	FOREIGN KEY TilingPattern (__FKTilingPattern__) REFERENCES IfcOneDirectionRepeatFactor (__IDIfcOneDirectionRepeatFactor__),
	TilingScale text,
	PRIMARY KEY IfcFillAreaStyleTiles (__IDIfcFillAreaStyleTiles__),
	__FKTilingPattern__ Integer
) ;

CREATE TABLE IfcFilterType (
	__IDIfcFilterType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcFilterType (__IDIfcFilterType__)
) ;

CREATE TABLE IfcFireSuppressionTerminalType (
	__IDIfcFireSuppressionTerminalType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcFireSuppressionTerminalType (__IDIfcFireSuppressionTerminalType__)
) ;

CREATE TABLE IfcFlowController (
	__IDIfcFlowController__ Integer NOT NULL,
	PRIMARY KEY IfcFlowController (__IDIfcFlowController__)
) ;

CREATE TABLE IfcFlowControllerType (
	__IDIfcFlowControllerType__ Integer NOT NULL,
	PRIMARY KEY IfcFlowControllerType (__IDIfcFlowControllerType__)
) ;

CREATE TABLE IfcFlowFitting (
	__IDIfcFlowFitting__ Integer NOT NULL,
	PRIMARY KEY IfcFlowFitting (__IDIfcFlowFitting__)
) ;

CREATE TABLE IfcFlowFittingType (
	__IDIfcFlowFittingType__ Integer NOT NULL,
	PRIMARY KEY IfcFlowFittingType (__IDIfcFlowFittingType__)
) ;

CREATE TABLE IfcFlowInstrumentType (
	__IDIfcFlowInstrumentType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcFlowInstrumentType (__IDIfcFlowInstrumentType__)
) ;

CREATE TABLE IfcFlowMeterType (
	__IDIfcFlowMeterType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcFlowMeterType (__IDIfcFlowMeterType__)
) ;

CREATE TABLE IfcFlowMovingDevice (
	__IDIfcFlowMovingDevice__ Integer NOT NULL,
	PRIMARY KEY IfcFlowMovingDevice (__IDIfcFlowMovingDevice__)
) ;

CREATE TABLE IfcFlowMovingDeviceType (
	__IDIfcFlowMovingDeviceType__ Integer NOT NULL,
	PRIMARY KEY IfcFlowMovingDeviceType (__IDIfcFlowMovingDeviceType__)
) ;

CREATE TABLE IfcFlowSegment (
	__IDIfcFlowSegment__ Integer NOT NULL,
	PRIMARY KEY IfcFlowSegment (__IDIfcFlowSegment__)
) ;

CREATE TABLE IfcFlowSegmentType (
	__IDIfcFlowSegmentType__ Integer NOT NULL,
	PRIMARY KEY IfcFlowSegmentType (__IDIfcFlowSegmentType__)
) ;

CREATE TABLE IfcFlowStorageDevice (
	__IDIfcFlowStorageDevice__ Integer NOT NULL,
	PRIMARY KEY IfcFlowStorageDevice (__IDIfcFlowStorageDevice__)
) ;

CREATE TABLE IfcFlowStorageDeviceType (
	__IDIfcFlowStorageDeviceType__ Integer NOT NULL,
	PRIMARY KEY IfcFlowStorageDeviceType (__IDIfcFlowStorageDeviceType__)
) ;

CREATE TABLE IfcFlowTerminal (
	__IDIfcFlowTerminal__ Integer NOT NULL,
	PRIMARY KEY IfcFlowTerminal (__IDIfcFlowTerminal__)
) ;

CREATE TABLE IfcFlowTerminalType (
	__IDIfcFlowTerminalType__ Integer NOT NULL,
	PRIMARY KEY IfcFlowTerminalType (__IDIfcFlowTerminalType__)
) ;

CREATE TABLE IfcFlowTreatmentDevice (
	__IDIfcFlowTreatmentDevice__ Integer NOT NULL,
	PRIMARY KEY IfcFlowTreatmentDevice (__IDIfcFlowTreatmentDevice__)
) ;

CREATE TABLE IfcFlowTreatmentDeviceType (
	__IDIfcFlowTreatmentDeviceType__ Integer NOT NULL,
	PRIMARY KEY IfcFlowTreatmentDeviceType (__IDIfcFlowTreatmentDeviceType__)
) ;

CREATE TABLE IfcFluidFlowProperties (
	__IDIfcFluidFlowProperties__ Integer NOT NULL,
	PropertySource text,
	UserDefinedPropertySource text,
	TemperatureSingleValue text,
	WetBulbTemperatureSingleValue text,
	FlowConditionSingleValue text,
	VelocitySingleValue text,
	PressureSingleValue text,
	FOREIGN KEY FlowrateSingleValue (__FKFlowrateSingleValue__) REFERENCES IfcDerivedMeasureValue (__IDIfcDerivedMeasureValue__),
	FOREIGN KEY FlowConditionTimeSeries (__FKFlowConditionTimeSeries__) REFERENCES IfcTimeSeries (__IDIfcTimeSeries__),
	FOREIGN KEY VelocityTimeSeries (__FKVelocityTimeSeries__) REFERENCES IfcTimeSeries (__IDIfcTimeSeries__),
	FOREIGN KEY FlowrateTimeSeries (__FKFlowrateTimeSeries__) REFERENCES IfcTimeSeries (__IDIfcTimeSeries__),
	FOREIGN KEY Fluid (__FKFluid__) REFERENCES IfcMaterial (__IDIfcMaterial__),
	FOREIGN KEY PressureTimeSeries (__FKPressureTimeSeries__) REFERENCES IfcTimeSeries (__IDIfcTimeSeries__),
	FOREIGN KEY WetBulbTemperatureTimeSeries (__FKWetBulbTemperatureTimeSeries__) REFERENCES IfcTimeSeries (__IDIfcTimeSeries__),
	FOREIGN KEY TemperatureTimeSeries (__FKTemperatureTimeSeries__) REFERENCES IfcTimeSeries (__IDIfcTimeSeries__),
	PRIMARY KEY IfcFluidFlowProperties (__IDIfcFluidFlowProperties__),
	__FKFlowrateSingleValue__ Integer,
	__FKFlowConditionTimeSeries__ Integer,
	__FKVelocityTimeSeries__ Integer,
	__FKFlowrateTimeSeries__ Integer,
	__FKFluid__ Integer,
	__FKPressureTimeSeries__ Integer,
	__FKWetBulbTemperatureTimeSeries__ Integer,
	__FKTemperatureTimeSeries__ Integer
) ;

CREATE TABLE IfcFooting (
	__IDIfcFooting__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcFooting (__IDIfcFooting__)
) ;

CREATE TABLE IfcFuelProperties (
	__IDIfcFuelProperties__ Integer NOT NULL,
	CombustionTemperature text,
	CarbonContent text,
	LowerHeatingValue text,
	HigherHeatingValue text,
	PRIMARY KEY IfcFuelProperties (__IDIfcFuelProperties__)
) ;

CREATE TABLE IfcFurnishingElement (
	__IDIfcFurnishingElement__ Integer NOT NULL,
	PRIMARY KEY IfcFurnishingElement (__IDIfcFurnishingElement__)
) ;

CREATE TABLE IfcFurnishingElementType (
	__IDIfcFurnishingElementType__ Integer NOT NULL,
	PRIMARY KEY IfcFurnishingElementType (__IDIfcFurnishingElementType__)
) ;

CREATE TABLE IfcFurnitureStandard (
	__IDIfcFurnitureStandard__ Integer NOT NULL,
	PRIMARY KEY IfcFurnitureStandard (__IDIfcFurnitureStandard__)
) ;

CREATE TABLE IfcFurnitureType (
	__IDIfcFurnitureType__ Integer NOT NULL,
	AssemblyPlace text,
	PRIMARY KEY IfcFurnitureType (__IDIfcFurnitureType__)
) ;

CREATE TABLE IfcGasTerminalType (
	__IDIfcGasTerminalType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcGasTerminalType (__IDIfcGasTerminalType__)
) ;

CREATE TABLE IfcGeneralMaterialProperties (
	__IDIfcGeneralMaterialProperties__ Integer NOT NULL,
	MolecularWeight text,
	Porosity text,
	MassDensity text,
	PRIMARY KEY IfcGeneralMaterialProperties (__IDIfcGeneralMaterialProperties__)
) ;

CREATE TABLE IfcGeneralProfileProperties (
	__IDIfcGeneralProfileProperties__ Integer NOT NULL,
	PhysicalWeight text,
	Perimeter text,
	MinimumPlateThickness text,
	MaximumPlateThickness text,
	CrossSectionArea text,
	PRIMARY KEY IfcGeneralProfileProperties (__IDIfcGeneralProfileProperties__)
) ;

CREATE TABLE IfcGeometricCurveSet (
	__IDIfcGeometricCurveSet__ Integer NOT NULL,
	PRIMARY KEY IfcGeometricCurveSet (__IDIfcGeometricCurveSet__)
) ;

CREATE TABLE IfcGeometricRepresentationContext (
	__IDIfcGeometricRepresentationContext__ Integer NOT NULL,
	CoordinateSpaceDimension text,
	"Precision" text,
	FOREIGN KEY HasSubContexts (__FKHasSubContexts__) REFERENCES IfcGeometricRepresentationSubContext (__IDIfcGeometricRepresentationSubContext__),
	FOREIGN KEY WorldCoordinateSystem (__FKWorldCoordinateSystem__) REFERENCES IfcAxis2Placement (__IDIfcAxis2Placement__),
	FOREIGN KEY TrueNorth (__FKTrueNorth__) REFERENCES IfcDirection (__IDIfcDirection__),
	PRIMARY KEY IfcGeometricRepresentationContext (__IDIfcGeometricRepresentationContext__),
	__FKHasSubContexts__ Integer,
	__FKWorldCoordinateSystem__ Integer,
	__FKTrueNorth__ Integer
) ;

CREATE TABLE IfcGeometricRepresentationItem (
	__IDIfcGeometricRepresentationItem__ Integer NOT NULL,
	PRIMARY KEY IfcGeometricRepresentationItem (__IDIfcGeometricRepresentationItem__)
) ;

CREATE TABLE IfcGeometricRepresentationSubContext (
	__IDIfcGeometricRepresentationSubContext__ Integer NOT NULL,
	TargetScale text,
	TargetView text,
	UserDefinedTargetView text,
	FOREIGN KEY ParentContext (__FKParentContext__) REFERENCES IfcGeometricRepresentationContext (__IDIfcGeometricRepresentationContext__),
	PRIMARY KEY IfcGeometricRepresentationSubContext (__IDIfcGeometricRepresentationSubContext__),
	__FKParentContext__ Integer
) ;

CREATE TABLE IfcGeometricSet (
	__IDIfcGeometricSet__ Integer NOT NULL,
	PRIMARY KEY IfcGeometricSet (__IDIfcGeometricSet__)
) ;

CREATE TABLE IfcGrid (
	__IDIfcGrid__ Integer NOT NULL,
	PRIMARY KEY IfcGrid (__IDIfcGrid__)
) ;

CREATE TABLE IfcGridAxis (
	__IDIfcGridAxis__ Integer NOT NULL,
	AxisTag text,
	SameSense text,
	FOREIGN KEY PartOfW (__FKPartOfW__) REFERENCES IfcGrid (__IDIfcGrid__),
	FOREIGN KEY PartOfV (__FKPartOfV__) REFERENCES IfcGrid (__IDIfcGrid__),
	FOREIGN KEY PartOfU (__FKPartOfU__) REFERENCES IfcGrid (__IDIfcGrid__),
	FOREIGN KEY HasIntersections (__FKHasIntersections__) REFERENCES IfcVirtualGridIntersection (__IDIfcVirtualGridIntersection__),
	FOREIGN KEY AxisCurve (__FKAxisCurve__) REFERENCES IfcCurve (__IDIfcCurve__),
	PRIMARY KEY IfcGridAxis (__IDIfcGridAxis__),
	__FKPartOfW__ Integer,
	__FKPartOfV__ Integer,
	__FKPartOfU__ Integer,
	__FKHasIntersections__ Integer,
	__FKAxisCurve__ Integer
) ;

CREATE TABLE IfcGridPlacement (
	__IDIfcGridPlacement__ Integer NOT NULL,
	FOREIGN KEY PlacementLocation (__FKPlacementLocation__) REFERENCES IfcVirtualGridIntersection (__IDIfcVirtualGridIntersection__),
	FOREIGN KEY PlacementRefDirection (__FKPlacementRefDirection__) REFERENCES IfcVirtualGridIntersection (__IDIfcVirtualGridIntersection__),
	PRIMARY KEY IfcGridPlacement (__IDIfcGridPlacement__),
	__FKPlacementLocation__ Integer,
	__FKPlacementRefDirection__ Integer
) ;

CREATE TABLE IfcGroup (
	__IDIfcGroup__ Integer NOT NULL,
	FOREIGN KEY IsGroupedBy (__FKIsGroupedBy__) REFERENCES IfcRelAssignsToGroup (__IDIfcRelAssignsToGroup__),
	PRIMARY KEY IfcGroup (__IDIfcGroup__),
	__FKIsGroupedBy__ Integer
) ;

CREATE TABLE IfcHalfSpaceSolid (
	__IDIfcHalfSpaceSolid__ Integer NOT NULL,
	FOREIGN KEY BaseSurface (__FKBaseSurface__) REFERENCES IfcSurface (__IDIfcSurface__),
	AgreementFlag text,
	PRIMARY KEY IfcHalfSpaceSolid (__IDIfcHalfSpaceSolid__),
	__FKBaseSurface__ Integer
) ;

CREATE TABLE IfcHeatExchangerType (
	__IDIfcHeatExchangerType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcHeatExchangerType (__IDIfcHeatExchangerType__)
) ;

CREATE TABLE IfcHumidifierType (
	__IDIfcHumidifierType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcHumidifierType (__IDIfcHumidifierType__)
) ;

CREATE TABLE IfcHygroscopicMaterialProperties (
	__IDIfcHygroscopicMaterialProperties__ Integer NOT NULL,
	UpperVaporResistanceFactor text,
	LowerVaporResistanceFactor text,
	IsothermalMoistureCapacity text,
	VaporPermeability text,
	MoistureDiffusivity text,
	PRIMARY KEY IfcHygroscopicMaterialProperties (__IDIfcHygroscopicMaterialProperties__)
) ;

CREATE TABLE IfcIShapeProfileDef (
	__IDIfcIShapeProfileDef__ Integer NOT NULL,
	OverallWidth text,
	OverallDepth text,
	WebThickness text,
	FlangeThickness text,
	FilletRadius text,
	PRIMARY KEY IfcIShapeProfileDef (__IDIfcIShapeProfileDef__)
) ;

CREATE TABLE IfcImageTexture (
	__IDIfcImageTexture__ Integer NOT NULL,
	UrlReference text,
	PRIMARY KEY IfcImageTexture (__IDIfcImageTexture__)
) ;

CREATE TABLE IfcInventory (
	__IDIfcInventory__ Integer NOT NULL,
	FOREIGN KEY Jurisdiction (__FKJurisdiction__) REFERENCES IfcActorSelect (__IDIfcActorSelect__),
	FOREIGN KEY LastUpdateDate (__FKLastUpdateDate__) REFERENCES IfcCalendarDate (__IDIfcCalendarDate__),
	FOREIGN KEY CurrentValue (__FKCurrentValue__) REFERENCES IfcCostValue (__IDIfcCostValue__),
	FOREIGN KEY OriginalValue (__FKOriginalValue__) REFERENCES IfcCostValue (__IDIfcCostValue__),
	InventoryType text,
	PRIMARY KEY IfcInventory (__IDIfcInventory__),
	__FKJurisdiction__ Integer,
	__FKLastUpdateDate__ Integer,
	__FKCurrentValue__ Integer,
	__FKOriginalValue__ Integer
) ;

CREATE TABLE IfcIrregularTimeSeries (
	__IDIfcIrregularTimeSeries__ Integer NOT NULL,
	PRIMARY KEY IfcIrregularTimeSeries (__IDIfcIrregularTimeSeries__)
) ;

CREATE TABLE IfcIrregularTimeSeriesValue (
	__IDIfcIrregularTimeSeriesValue__ Integer NOT NULL,
	FOREIGN KEY TimeStamp (__FKTimeStamp__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	PRIMARY KEY IfcIrregularTimeSeriesValue (__IDIfcIrregularTimeSeriesValue__),
	__FKTimeStamp__ Integer
) ;

CREATE TABLE IfcJunctionBoxType (
	__IDIfcJunctionBoxType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcJunctionBoxType (__IDIfcJunctionBoxType__)
) ;

CREATE TABLE IfcLShapeProfileDef (
	__IDIfcLShapeProfileDef__ Integer NOT NULL,
	Depth text,
	Width text,
	Thickness text,
	FilletRadius text,
	EdgeRadius text,
	LegSlope text,
	CentreOfGravityInX text,
	CentreOfGravityInY text,
	PRIMARY KEY IfcLShapeProfileDef (__IDIfcLShapeProfileDef__)
) ;

CREATE TABLE IfcLaborResource (
	__IDIfcLaborResource__ Integer NOT NULL,
	SkillSet text,
	PRIMARY KEY IfcLaborResource (__IDIfcLaborResource__)
) ;

CREATE TABLE IfcLampType (
	__IDIfcLampType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcLampType (__IDIfcLampType__)
) ;

CREATE TABLE IfcLibraryInformation (
	__IDIfcLibraryInformation__ Integer NOT NULL,
	Name text,
	Version text,
	FOREIGN KEY Publisher (__FKPublisher__) REFERENCES IfcOrganization (__IDIfcOrganization__),
	FOREIGN KEY VersionDate (__FKVersionDate__) REFERENCES IfcCalendarDate (__IDIfcCalendarDate__),
	PRIMARY KEY IfcLibraryInformation (__IDIfcLibraryInformation__),
	__FKPublisher__ Integer,
	__FKVersionDate__ Integer
) ;

CREATE TABLE IfcLibraryReference (
	__IDIfcLibraryReference__ Integer NOT NULL,
	FOREIGN KEY ReferenceIntoLibrary (__FKReferenceIntoLibrary__) REFERENCES IfcLibraryInformation (__IDIfcLibraryInformation__),
	PRIMARY KEY IfcLibraryReference (__IDIfcLibraryReference__),
	__FKReferenceIntoLibrary__ Integer
) ;

CREATE TABLE IfcLightDistributionData (
	__IDIfcLightDistributionData__ Integer NOT NULL,
	MainPlaneAngle text,
	PRIMARY KEY IfcLightDistributionData (__IDIfcLightDistributionData__)
) ;

CREATE TABLE IfcLightFixtureType (
	__IDIfcLightFixtureType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcLightFixtureType (__IDIfcLightFixtureType__)
) ;

CREATE TABLE IfcLightIntensityDistribution (
	__IDIfcLightIntensityDistribution__ Integer NOT NULL,
	LightDistributionCurve text,
	PRIMARY KEY IfcLightIntensityDistribution (__IDIfcLightIntensityDistribution__)
) ;

CREATE TABLE IfcLightSource (
	__IDIfcLightSource__ Integer NOT NULL,
	Name text,
	AmbientIntensity text,
	Intensity text,
	FOREIGN KEY LightColour (__FKLightColour__) REFERENCES IfcColourRgb (__IDIfcColourRgb__),
	PRIMARY KEY IfcLightSource (__IDIfcLightSource__),
	__FKLightColour__ Integer
) ;

CREATE TABLE IfcLightSourceAmbient (
	__IDIfcLightSourceAmbient__ Integer NOT NULL,
	PRIMARY KEY IfcLightSourceAmbient (__IDIfcLightSourceAmbient__)
) ;

CREATE TABLE IfcLightSourceDirectional (
	__IDIfcLightSourceDirectional__ Integer NOT NULL,
	FOREIGN KEY Orientation (__FKOrientation__) REFERENCES IfcDirection (__IDIfcDirection__),
	PRIMARY KEY IfcLightSourceDirectional (__IDIfcLightSourceDirectional__),
	__FKOrientation__ Integer
) ;

CREATE TABLE IfcLightSourceGoniometric (
	__IDIfcLightSourceGoniometric__ Integer NOT NULL,
	ColourTemperature text,
	LuminousFlux text,
	LightEmissionSource text,
	FOREIGN KEY Position (__FKPosition__) REFERENCES IfcAxis2Placement3D (__IDIfcAxis2Placement3D__),
	FOREIGN KEY ColourAppearance (__FKColourAppearance__) REFERENCES IfcColourRgb (__IDIfcColourRgb__),
	FOREIGN KEY LightDistributionDataSource (__FKLightDistributionDataSource__) REFERENCES IfcLightDistributionDataSourceSelect (__IDIfcLightDistributionDataSourceSelect__),
	PRIMARY KEY IfcLightSourceGoniometric (__IDIfcLightSourceGoniometric__),
	__FKPosition__ Integer,
	__FKColourAppearance__ Integer,
	__FKLightDistributionDataSource__ Integer
) ;

CREATE TABLE IfcLightSourcePositional (
	__IDIfcLightSourcePositional__ Integer NOT NULL,
	Radius text,
	ConstantAttenuation text,
	DistanceAttenuation text,
	QuadricAttenuation text,
	FOREIGN KEY Position (__FKPosition__) REFERENCES IfcCartesianPoint (__IDIfcCartesianPoint__),
	PRIMARY KEY IfcLightSourcePositional (__IDIfcLightSourcePositional__),
	__FKPosition__ Integer
) ;

CREATE TABLE IfcLightSourceSpot (
	__IDIfcLightSourceSpot__ Integer NOT NULL,
	ConcentrationExponent text,
	SpreadAngle text,
	BeamWidthAngle text,
	FOREIGN KEY Orientation (__FKOrientation__) REFERENCES IfcDirection (__IDIfcDirection__),
	PRIMARY KEY IfcLightSourceSpot (__IDIfcLightSourceSpot__),
	__FKOrientation__ Integer
) ;

CREATE TABLE IfcLine (
	__IDIfcLine__ Integer NOT NULL,
	FOREIGN KEY Pnt (__FKPnt__) REFERENCES IfcCartesianPoint (__IDIfcCartesianPoint__),
	FOREIGN KEY Dir (__FKDir__) REFERENCES IfcVector (__IDIfcVector__),
	PRIMARY KEY IfcLine (__IDIfcLine__),
	__FKPnt__ Integer,
	__FKDir__ Integer
) ;

CREATE TABLE IfcLinearDimension (
	__IDIfcLinearDimension__ Integer NOT NULL,
	PRIMARY KEY IfcLinearDimension (__IDIfcLinearDimension__)
) ;

CREATE TABLE IfcLocalPlacement (
	__IDIfcLocalPlacement__ Integer NOT NULL,
	FOREIGN KEY PlacementRelTo (__FKPlacementRelTo__) REFERENCES IfcObjectPlacement (__IDIfcObjectPlacement__),
	FOREIGN KEY RelativePlacement (__FKRelativePlacement__) REFERENCES IfcAxis2Placement (__IDIfcAxis2Placement__),
	PRIMARY KEY IfcLocalPlacement (__IDIfcLocalPlacement__),
	__FKPlacementRelTo__ Integer,
	__FKRelativePlacement__ Integer
) ;

CREATE TABLE IfcLocalTime (
	__IDIfcLocalTime__ Integer NOT NULL,
	HourComponent text,
	MinuteComponent text,
	SecondComponent text,
	DaylightSavingOffset text,
	FOREIGN KEY Zone (__FKZone__) REFERENCES IfcCoordinatedUniversalTimeOffset (__IDIfcCoordinatedUniversalTimeOffset__),
	PRIMARY KEY IfcLocalTime (__IDIfcLocalTime__),
	__FKZone__ Integer
) ;

CREATE TABLE IfcLoop (
	__IDIfcLoop__ Integer NOT NULL,
	PRIMARY KEY IfcLoop (__IDIfcLoop__)
) ;

CREATE TABLE IfcManifoldSolidBrep (
	__IDIfcManifoldSolidBrep__ Integer NOT NULL,
	FOREIGN KEY "Outer" (__FKOuter__) REFERENCES IfcClosedShell (__IDIfcClosedShell__),
	PRIMARY KEY IfcManifoldSolidBrep (__IDIfcManifoldSolidBrep__),
	__FKOuter__ Integer
) ;

CREATE TABLE IfcMappedItem (
	__IDIfcMappedItem__ Integer NOT NULL,
	FOREIGN KEY MappingSource (__FKMappingSource__) REFERENCES IfcRepresentationMap (__IDIfcRepresentationMap__),
	FOREIGN KEY MappingTarget (__FKMappingTarget__) REFERENCES IfcCartesianTransformationOperator (__IDIfcCartesianTransformationOperator__),
	PRIMARY KEY IfcMappedItem (__IDIfcMappedItem__),
	__FKMappingSource__ Integer,
	__FKMappingTarget__ Integer
) ;

CREATE TABLE IfcMaterial (
	__IDIfcMaterial__ Integer NOT NULL,
	FOREIGN KEY HasRepresentation (__FKHasRepresentation__) REFERENCES IfcMaterialDefinitionRepresentation (__IDIfcMaterialDefinitionRepresentation__),
	FOREIGN KEY ClassifiedAs (__FKClassifiedAs__) REFERENCES IfcMaterialClassificationRelationship (__IDIfcMaterialClassificationRelationship__),
	Name text,
	PRIMARY KEY IfcMaterial (__IDIfcMaterial__),
	__FKHasRepresentation__ Integer,
	__FKClassifiedAs__ Integer
) ;

CREATE TABLE IfcMaterialClassificationRelationship (
	__IDIfcMaterialClassificationRelationship__ Integer NOT NULL,
	FOREIGN KEY ClassifiedMaterial (__FKClassifiedMaterial__) REFERENCES IfcMaterial (__IDIfcMaterial__),
	PRIMARY KEY IfcMaterialClassificationRelationship (__IDIfcMaterialClassificationRelationship__),
	__FKClassifiedMaterial__ Integer
) ;

CREATE TABLE IfcMaterialDefinitionRepresentation (
	__IDIfcMaterialDefinitionRepresentation__ Integer NOT NULL,
	FOREIGN KEY RepresentedMaterial (__FKRepresentedMaterial__) REFERENCES IfcMaterial (__IDIfcMaterial__),
	PRIMARY KEY IfcMaterialDefinitionRepresentation (__IDIfcMaterialDefinitionRepresentation__),
	__FKRepresentedMaterial__ Integer
) ;

CREATE TABLE IfcMaterialLayer (
	__IDIfcMaterialLayer__ Integer NOT NULL,
	LayerThickness text,
	IsVentilated text,
	FOREIGN KEY ToMaterialLayerSet (__FKToMaterialLayerSet__) REFERENCES IfcMaterialLayerSet (__IDIfcMaterialLayerSet__),
	FOREIGN KEY Material (__FKMaterial__) REFERENCES IfcMaterial (__IDIfcMaterial__),
	PRIMARY KEY IfcMaterialLayer (__IDIfcMaterialLayer__),
	__FKToMaterialLayerSet__ Integer,
	__FKMaterial__ Integer
) ;

CREATE TABLE IfcMaterialLayerSet (
	__IDIfcMaterialLayerSet__ Integer NOT NULL,
	LayerSetName text,
	PRIMARY KEY IfcMaterialLayerSet (__IDIfcMaterialLayerSet__)
) ;

CREATE TABLE IfcMaterialLayerSetUsage (
	__IDIfcMaterialLayerSetUsage__ Integer NOT NULL,
	LayerSetDirection text,
	DirectionSense text,
	OffsetFromReferenceLine text,
	FOREIGN KEY ForLayerSet (__FKForLayerSet__) REFERENCES IfcMaterialLayerSet (__IDIfcMaterialLayerSet__),
	PRIMARY KEY IfcMaterialLayerSetUsage (__IDIfcMaterialLayerSetUsage__),
	__FKForLayerSet__ Integer
) ;

CREATE TABLE IfcMaterialList (
	__IDIfcMaterialList__ Integer NOT NULL,
	PRIMARY KEY IfcMaterialList (__IDIfcMaterialList__)
) ;

CREATE TABLE IfcMaterialProperties (
	__IDIfcMaterialProperties__ Integer NOT NULL,
	FOREIGN KEY Material (__FKMaterial__) REFERENCES IfcMaterial (__IDIfcMaterial__),
	PRIMARY KEY IfcMaterialProperties (__IDIfcMaterialProperties__),
	__FKMaterial__ Integer
) ;

CREATE TABLE IfcMeasureWithUnit (
	__IDIfcMeasureWithUnit__ Integer NOT NULL,
	FOREIGN KEY ValueComponent (__FKValueComponent__) REFERENCES IfcValue (__IDIfcValue__),
	FOREIGN KEY UnitComponent (__FKUnitComponent__) REFERENCES IfcUnit (__IDIfcUnit__),
	PRIMARY KEY IfcMeasureWithUnit (__IDIfcMeasureWithUnit__),
	__FKValueComponent__ Integer,
	__FKUnitComponent__ Integer
) ;

CREATE TABLE IfcMechanicalConcreteMaterialProperties (
	__IDIfcMechanicalConcreteMaterialProperties__ Integer NOT NULL,
	CompressiveStrength text,
	MaxAggregateSize text,
	AdmixturesDescription text,
	Workability text,
	ProtectivePoreRatio text,
	WaterImpermeability text,
	PRIMARY KEY IfcMechanicalConcreteMaterialProperties (__IDIfcMechanicalConcreteMaterialProperties__)
) ;

CREATE TABLE IfcMechanicalFastener (
	__IDIfcMechanicalFastener__ Integer NOT NULL,
	NominalDiameter text,
	NominalLength text,
	PRIMARY KEY IfcMechanicalFastener (__IDIfcMechanicalFastener__)
) ;

CREATE TABLE IfcMechanicalFastenerType (
	__IDIfcMechanicalFastenerType__ Integer NOT NULL,
	PRIMARY KEY IfcMechanicalFastenerType (__IDIfcMechanicalFastenerType__)
) ;

CREATE TABLE IfcMechanicalMaterialProperties (
	__IDIfcMechanicalMaterialProperties__ Integer NOT NULL,
	DynamicViscosity text,
	YoungModulus text,
	ShearModulus text,
	PoissonRatio text,
	ThermalExpansionCoefficient text,
	PRIMARY KEY IfcMechanicalMaterialProperties (__IDIfcMechanicalMaterialProperties__)
) ;

CREATE TABLE IfcMechanicalSteelMaterialProperties (
	__IDIfcMechanicalSteelMaterialProperties__ Integer NOT NULL,
	YieldStress text,
	UltimateStress text,
	UltimateStrain text,
	HardeningModule text,
	ProportionalStress text,
	PlasticStrain text,
	PRIMARY KEY IfcMechanicalSteelMaterialProperties (__IDIfcMechanicalSteelMaterialProperties__)
) ;

CREATE TABLE IfcMember (
	__IDIfcMember__ Integer NOT NULL,
	PRIMARY KEY IfcMember (__IDIfcMember__)
) ;

CREATE TABLE IfcMemberType (
	__IDIfcMemberType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcMemberType (__IDIfcMemberType__)
) ;

CREATE TABLE IfcMetric (
	__IDIfcMetric__ Integer NOT NULL,
	Benchmark text,
	ValueSource text,
	FOREIGN KEY DataValue (__FKDataValue__) REFERENCES IfcMetricValueSelect (__IDIfcMetricValueSelect__),
	PRIMARY KEY IfcMetric (__IDIfcMetric__),
	__FKDataValue__ Integer
) ;

CREATE TABLE IfcMonetaryUnit (
	__IDIfcMonetaryUnit__ Integer NOT NULL,
	Currency text,
	PRIMARY KEY IfcMonetaryUnit (__IDIfcMonetaryUnit__)
) ;

CREATE TABLE IfcMotorConnectionType (
	__IDIfcMotorConnectionType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcMotorConnectionType (__IDIfcMotorConnectionType__)
) ;

CREATE TABLE IfcMove (
	__IDIfcMove__ Integer NOT NULL,
	FOREIGN KEY MoveFrom (__FKMoveFrom__) REFERENCES IfcSpatialStructureElement (__IDIfcSpatialStructureElement__),
	FOREIGN KEY MoveTo (__FKMoveTo__) REFERENCES IfcSpatialStructureElement (__IDIfcSpatialStructureElement__),
	PRIMARY KEY IfcMove (__IDIfcMove__),
	__FKMoveFrom__ Integer,
	__FKMoveTo__ Integer
) ;

CREATE TABLE IfcNamedUnit (
	__IDIfcNamedUnit__ Integer NOT NULL,
	FOREIGN KEY Dimensions (__FKDimensions__) REFERENCES IfcDimensionalExponents (__IDIfcDimensionalExponents__),
	UnitType text,
	PRIMARY KEY IfcNamedUnit (__IDIfcNamedUnit__),
	__FKDimensions__ Integer
) ;

CREATE TABLE IfcObject (
	__IDIfcObject__ Integer NOT NULL,
	FOREIGN KEY IsDefinedBy (__FKIsDefinedBy__) REFERENCES IfcRelDefines (__IDIfcRelDefines__),
	ObjectType text,
	PRIMARY KEY IfcObject (__IDIfcObject__),
	__FKIsDefinedBy__ Integer
) ;

CREATE TABLE IfcObjectDefinition (
	__IDIfcObjectDefinition__ Integer NOT NULL,
	FOREIGN KEY HasAssignments (__FKHasAssignments__) REFERENCES IfcRelAssigns (__IDIfcRelAssigns__),
	FOREIGN KEY IsDecomposedBy (__FKIsDecomposedBy__) REFERENCES IfcRelDecomposes (__IDIfcRelDecomposes__),
	FOREIGN KEY Decomposes (__FKDecomposes__) REFERENCES IfcRelDecomposes (__IDIfcRelDecomposes__),
	PRIMARY KEY IfcObjectDefinition (__IDIfcObjectDefinition__),
	__FKHasAssignments__ Integer,
	__FKIsDecomposedBy__ Integer,
	__FKDecomposes__ Integer
) ;

CREATE TABLE IfcObjectPlacement (
	__IDIfcObjectPlacement__ Integer NOT NULL,
	FOREIGN KEY PlacesObject (__FKPlacesObject__) REFERENCES IfcProduct (__IDIfcProduct__),
	FOREIGN KEY ReferencedByPlacements (__FKReferencedByPlacements__) REFERENCES IfcLocalPlacement (__IDIfcLocalPlacement__),
	PRIMARY KEY IfcObjectPlacement (__IDIfcObjectPlacement__),
	__FKPlacesObject__ Integer,
	__FKReferencedByPlacements__ Integer
) ;

CREATE TABLE IfcObjective (
	__IDIfcObjective__ Integer NOT NULL,
	ObjectiveQualifier text,
	UserDefinedQualifier text,
	FOREIGN KEY BenchmarkValues (__FKBenchmarkValues__) REFERENCES IfcMetric (__IDIfcMetric__),
	FOREIGN KEY ResultValues (__FKResultValues__) REFERENCES IfcMetric (__IDIfcMetric__),
	PRIMARY KEY IfcObjective (__IDIfcObjective__),
	__FKBenchmarkValues__ Integer,
	__FKResultValues__ Integer
) ;

CREATE TABLE IfcOccupant (
	__IDIfcOccupant__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcOccupant (__IDIfcOccupant__)
) ;

CREATE TABLE IfcOffsetCurve2D (
	__IDIfcOffsetCurve2D__ Integer NOT NULL,
	Distance text,
	SelfIntersect text,
	FOREIGN KEY BasisCurve (__FKBasisCurve__) REFERENCES IfcCurve (__IDIfcCurve__),
	PRIMARY KEY IfcOffsetCurve2D (__IDIfcOffsetCurve2D__),
	__FKBasisCurve__ Integer
) ;

CREATE TABLE IfcOffsetCurve3D (
	__IDIfcOffsetCurve3D__ Integer NOT NULL,
	Distance text,
	SelfIntersect text,
	FOREIGN KEY BasisCurve (__FKBasisCurve__) REFERENCES IfcCurve (__IDIfcCurve__),
	FOREIGN KEY RefDirection (__FKRefDirection__) REFERENCES IfcDirection (__IDIfcDirection__),
	PRIMARY KEY IfcOffsetCurve3D (__IDIfcOffsetCurve3D__),
	__FKBasisCurve__ Integer,
	__FKRefDirection__ Integer
) ;

CREATE TABLE IfcOneDirectionRepeatFactor (
	__IDIfcOneDirectionRepeatFactor__ Integer NOT NULL,
	FOREIGN KEY RepeatFactor (__FKRepeatFactor__) REFERENCES IfcVector (__IDIfcVector__),
	PRIMARY KEY IfcOneDirectionRepeatFactor (__IDIfcOneDirectionRepeatFactor__),
	__FKRepeatFactor__ Integer
) ;

CREATE TABLE IfcOpenShell (
	__IDIfcOpenShell__ Integer NOT NULL,
	PRIMARY KEY IfcOpenShell (__IDIfcOpenShell__)
) ;

CREATE TABLE IfcOpeningElement (
	__IDIfcOpeningElement__ Integer NOT NULL,
	FOREIGN KEY HasFillings (__FKHasFillings__) REFERENCES IfcRelFillsElement (__IDIfcRelFillsElement__),
	PRIMARY KEY IfcOpeningElement (__IDIfcOpeningElement__),
	__FKHasFillings__ Integer
) ;

CREATE TABLE IfcOpticalMaterialProperties (
	__IDIfcOpticalMaterialProperties__ Integer NOT NULL,
	VisibleTransmittance text,
	SolarTransmittance text,
	ThermalIrTransmittance text,
	ThermalIrEmissivityBack text,
	ThermalIrEmissivityFront text,
	VisibleReflectanceBack text,
	VisibleReflectanceFront text,
	SolarReflectanceFront text,
	SolarReflectanceBack text,
	PRIMARY KEY IfcOpticalMaterialProperties (__IDIfcOpticalMaterialProperties__)
) ;

CREATE TABLE IfcOrderAction (
	__IDIfcOrderAction__ Integer NOT NULL,
	ActionID text,
	PRIMARY KEY IfcOrderAction (__IDIfcOrderAction__)
) ;

CREATE TABLE IfcOrganization (
	__IDIfcOrganization__ Integer NOT NULL,
	Id text,
	Name text,
	Description text,
	FOREIGN KEY IsRelatedBy (__FKIsRelatedBy__) REFERENCES IfcOrganizationRelationship (__IDIfcOrganizationRelationship__),
	FOREIGN KEY Relates (__FKRelates__) REFERENCES IfcOrganizationRelationship (__IDIfcOrganizationRelationship__),
	FOREIGN KEY Engages (__FKEngages__) REFERENCES IfcPersonAndOrganization (__IDIfcPersonAndOrganization__),
	PRIMARY KEY IfcOrganization (__IDIfcOrganization__),
	__FKIsRelatedBy__ Integer,
	__FKRelates__ Integer,
	__FKEngages__ Integer
) ;

CREATE TABLE IfcOrganizationRelationship (
	__IDIfcOrganizationRelationship__ Integer NOT NULL,
	Name text,
	Description text,
	FOREIGN KEY RelatingOrganization (__FKRelatingOrganization__) REFERENCES IfcOrganization (__IDIfcOrganization__),
	PRIMARY KEY IfcOrganizationRelationship (__IDIfcOrganizationRelationship__),
	__FKRelatingOrganization__ Integer
) ;

CREATE TABLE IfcOrientedEdge (
	__IDIfcOrientedEdge__ Integer NOT NULL,
	FOREIGN KEY EdgeElement (__FKEdgeElement__) REFERENCES IfcEdge (__IDIfcEdge__),
	Orientation text,
	PRIMARY KEY IfcOrientedEdge (__IDIfcOrientedEdge__),
	__FKEdgeElement__ Integer
) ;

CREATE TABLE IfcOutletType (
	__IDIfcOutletType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcOutletType (__IDIfcOutletType__)
) ;

CREATE TABLE IfcOwnerHistory (
	__IDIfcOwnerHistory__ Integer NOT NULL,
	State text,
	ChangeAction text,
	LastModifiedDate text,
	CreationDate text,
	FOREIGN KEY OwningUser (__FKOwningUser__) REFERENCES IfcPersonAndOrganization (__IDIfcPersonAndOrganization__),
	FOREIGN KEY OwningApplication (__FKOwningApplication__) REFERENCES IfcApplication (__IDIfcApplication__),
	FOREIGN KEY LastModifyingUser (__FKLastModifyingUser__) REFERENCES IfcPersonAndOrganization (__IDIfcPersonAndOrganization__),
	FOREIGN KEY LastModifyingApplication (__FKLastModifyingApplication__) REFERENCES IfcApplication (__IDIfcApplication__),
	PRIMARY KEY IfcOwnerHistory (__IDIfcOwnerHistory__),
	__FKOwningUser__ Integer,
	__FKOwningApplication__ Integer,
	__FKLastModifyingUser__ Integer,
	__FKLastModifyingApplication__ Integer
) ;

CREATE TABLE IfcParameterizedProfileDef (
	__IDIfcParameterizedProfileDef__ Integer NOT NULL,
	FOREIGN KEY Position (__FKPosition__) REFERENCES IfcAxis2Placement2D (__IDIfcAxis2Placement2D__),
	PRIMARY KEY IfcParameterizedProfileDef (__IDIfcParameterizedProfileDef__),
	__FKPosition__ Integer
) ;

CREATE TABLE IfcPath (
	__IDIfcPath__ Integer NOT NULL,
	PRIMARY KEY IfcPath (__IDIfcPath__)
) ;

CREATE TABLE IfcPerformanceHistory (
	__IDIfcPerformanceHistory__ Integer NOT NULL,
	LifeCyclePhase text,
	PRIMARY KEY IfcPerformanceHistory (__IDIfcPerformanceHistory__)
) ;

CREATE TABLE IfcPermeableCoveringProperties (
	__IDIfcPermeableCoveringProperties__ Integer NOT NULL,
	OperationType text,
	PanelPosition text,
	FrameDepth text,
	FrameThickness text,
	FOREIGN KEY ShapeAspectStyle (__FKShapeAspectStyle__) REFERENCES IfcShapeAspect (__IDIfcShapeAspect__),
	PRIMARY KEY IfcPermeableCoveringProperties (__IDIfcPermeableCoveringProperties__),
	__FKShapeAspectStyle__ Integer
) ;

CREATE TABLE IfcPermit (
	__IDIfcPermit__ Integer NOT NULL,
	PermitID text,
	PRIMARY KEY IfcPermit (__IDIfcPermit__)
) ;

CREATE TABLE IfcPerson (
	__IDIfcPerson__ Integer NOT NULL,
	Id text,
	FamilyName text,
	GivenName text,
	FOREIGN KEY EngagedIn (__FKEngagedIn__) REFERENCES IfcPersonAndOrganization (__IDIfcPersonAndOrganization__),
	PRIMARY KEY IfcPerson (__IDIfcPerson__),
	__FKEngagedIn__ Integer
) ;

CREATE TABLE IfcPersonAndOrganization (
	__IDIfcPersonAndOrganization__ Integer NOT NULL,
	FOREIGN KEY ThePerson (__FKThePerson__) REFERENCES IfcPerson (__IDIfcPerson__),
	FOREIGN KEY TheOrganization (__FKTheOrganization__) REFERENCES IfcOrganization (__IDIfcOrganization__),
	PRIMARY KEY IfcPersonAndOrganization (__IDIfcPersonAndOrganization__),
	__FKThePerson__ Integer,
	__FKTheOrganization__ Integer
) ;

CREATE TABLE IfcPhysicalComplexQuantity (
	__IDIfcPhysicalComplexQuantity__ Integer NOT NULL,
	Discrimination text,
	Quality text,
	"Usage" text,
	PRIMARY KEY IfcPhysicalComplexQuantity (__IDIfcPhysicalComplexQuantity__)
) ;

CREATE TABLE IfcPhysicalQuantity (
	__IDIfcPhysicalQuantity__ Integer NOT NULL,
	Name text,
	Description text,
	FOREIGN KEY PartOfComplex (__FKPartOfComplex__) REFERENCES IfcPhysicalComplexQuantity (__IDIfcPhysicalComplexQuantity__),
	PRIMARY KEY IfcPhysicalQuantity (__IDIfcPhysicalQuantity__),
	__FKPartOfComplex__ Integer
) ;

CREATE TABLE IfcPhysicalSimpleQuantity (
	__IDIfcPhysicalSimpleQuantity__ Integer NOT NULL,
	FOREIGN KEY Unit (__FKUnit__) REFERENCES IfcNamedUnit (__IDIfcNamedUnit__),
	PRIMARY KEY IfcPhysicalSimpleQuantity (__IDIfcPhysicalSimpleQuantity__),
	__FKUnit__ Integer
) ;

CREATE TABLE IfcPile (
	__IDIfcPile__ Integer NOT NULL,
	PredefinedType text,
	ConstructionType text,
	PRIMARY KEY IfcPile (__IDIfcPile__)
) ;

CREATE TABLE IfcPipeFittingType (
	__IDIfcPipeFittingType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcPipeFittingType (__IDIfcPipeFittingType__)
) ;

CREATE TABLE IfcPipeSegmentType (
	__IDIfcPipeSegmentType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcPipeSegmentType (__IDIfcPipeSegmentType__)
) ;

CREATE TABLE IfcPixelTexture (
	__IDIfcPixelTexture__ Integer NOT NULL,
	Width text,
	Height text,
	ColourComponents text,
	PRIMARY KEY IfcPixelTexture (__IDIfcPixelTexture__)
) ;

CREATE TABLE IfcPlacement (
	__IDIfcPlacement__ Integer NOT NULL,
	FOREIGN KEY Location (__FKLocation__) REFERENCES IfcCartesianPoint (__IDIfcCartesianPoint__),
	PRIMARY KEY IfcPlacement (__IDIfcPlacement__),
	__FKLocation__ Integer
) ;

CREATE TABLE IfcPlanarBox (
	__IDIfcPlanarBox__ Integer NOT NULL,
	FOREIGN KEY Placement (__FKPlacement__) REFERENCES IfcAxis2Placement (__IDIfcAxis2Placement__),
	PRIMARY KEY IfcPlanarBox (__IDIfcPlanarBox__),
	__FKPlacement__ Integer
) ;

CREATE TABLE IfcPlanarExtent (
	__IDIfcPlanarExtent__ Integer NOT NULL,
	SizeInX text,
	SizeInY text,
	PRIMARY KEY IfcPlanarExtent (__IDIfcPlanarExtent__)
) ;

CREATE TABLE IfcPlane (
	__IDIfcPlane__ Integer NOT NULL,
	PRIMARY KEY IfcPlane (__IDIfcPlane__)
) ;

CREATE TABLE IfcPlate (
	__IDIfcPlate__ Integer NOT NULL,
	PRIMARY KEY IfcPlate (__IDIfcPlate__)
) ;

CREATE TABLE IfcPlateType (
	__IDIfcPlateType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcPlateType (__IDIfcPlateType__)
) ;

CREATE TABLE IfcPoint (
	__IDIfcPoint__ Integer NOT NULL,
	PRIMARY KEY IfcPoint (__IDIfcPoint__)
) ;

CREATE TABLE IfcPointOnCurve (
	__IDIfcPointOnCurve__ Integer NOT NULL,
	FOREIGN KEY BasisCurve (__FKBasisCurve__) REFERENCES IfcCurve (__IDIfcCurve__),
	PointParameter text,
	PRIMARY KEY IfcPointOnCurve (__IDIfcPointOnCurve__),
	__FKBasisCurve__ Integer
) ;

CREATE TABLE IfcPointOnSurface (
	__IDIfcPointOnSurface__ Integer NOT NULL,
	PointParameterU text,
	PointParameterV text,
	FOREIGN KEY BasisSurface (__FKBasisSurface__) REFERENCES IfcSurface (__IDIfcSurface__),
	PRIMARY KEY IfcPointOnSurface (__IDIfcPointOnSurface__),
	__FKBasisSurface__ Integer
) ;

CREATE TABLE IfcPolyLoop (
	__IDIfcPolyLoop__ Integer NOT NULL,
	PRIMARY KEY IfcPolyLoop (__IDIfcPolyLoop__)
) ;

CREATE TABLE IfcPolygonalBoundedHalfSpace (
	__IDIfcPolygonalBoundedHalfSpace__ Integer NOT NULL,
	FOREIGN KEY Position (__FKPosition__) REFERENCES IfcAxis2Placement3D (__IDIfcAxis2Placement3D__),
	FOREIGN KEY PolygonalBoundary (__FKPolygonalBoundary__) REFERENCES IfcBoundedCurve (__IDIfcBoundedCurve__),
	PRIMARY KEY IfcPolygonalBoundedHalfSpace (__IDIfcPolygonalBoundedHalfSpace__),
	__FKPosition__ Integer,
	__FKPolygonalBoundary__ Integer
) ;

CREATE TABLE IfcPolyline (
	__IDIfcPolyline__ Integer NOT NULL,
	PRIMARY KEY IfcPolyline (__IDIfcPolyline__)
) ;

CREATE TABLE IfcPort (
	__IDIfcPort__ Integer NOT NULL,
	FOREIGN KEY ContainedIn (__FKContainedIn__) REFERENCES IfcRelConnectsPortToElement (__IDIfcRelConnectsPortToElement__),
	FOREIGN KEY ConnectedFrom (__FKConnectedFrom__) REFERENCES IfcRelConnectsPorts (__IDIfcRelConnectsPorts__),
	FOREIGN KEY ConnectedTo (__FKConnectedTo__) REFERENCES IfcRelConnectsPorts (__IDIfcRelConnectsPorts__),
	PRIMARY KEY IfcPort (__IDIfcPort__),
	__FKContainedIn__ Integer,
	__FKConnectedFrom__ Integer,
	__FKConnectedTo__ Integer
) ;

CREATE TABLE IfcPostalAddress (
	__IDIfcPostalAddress__ Integer NOT NULL,
	InternalLocation text,
	PostalBox text,
	Town text,
	Region text,
	PostalCode text,
	Country text,
	PRIMARY KEY IfcPostalAddress (__IDIfcPostalAddress__)
) ;

CREATE TABLE IfcPreDefinedColour (
	__IDIfcPreDefinedColour__ Integer NOT NULL,
	PRIMARY KEY IfcPreDefinedColour (__IDIfcPreDefinedColour__)
) ;

CREATE TABLE IfcPreDefinedCurveFont (
	__IDIfcPreDefinedCurveFont__ Integer NOT NULL,
	PRIMARY KEY IfcPreDefinedCurveFont (__IDIfcPreDefinedCurveFont__)
) ;

CREATE TABLE IfcPreDefinedDimensionSymbol (
	__IDIfcPreDefinedDimensionSymbol__ Integer NOT NULL,
	PRIMARY KEY IfcPreDefinedDimensionSymbol (__IDIfcPreDefinedDimensionSymbol__)
) ;

CREATE TABLE IfcPreDefinedItem (
	__IDIfcPreDefinedItem__ Integer NOT NULL,
	Name text,
	PRIMARY KEY IfcPreDefinedItem (__IDIfcPreDefinedItem__)
) ;

CREATE TABLE IfcPreDefinedPointMarkerSymbol (
	__IDIfcPreDefinedPointMarkerSymbol__ Integer NOT NULL,
	PRIMARY KEY IfcPreDefinedPointMarkerSymbol (__IDIfcPreDefinedPointMarkerSymbol__)
) ;

CREATE TABLE IfcPreDefinedSymbol (
	__IDIfcPreDefinedSymbol__ Integer NOT NULL,
	PRIMARY KEY IfcPreDefinedSymbol (__IDIfcPreDefinedSymbol__)
) ;

CREATE TABLE IfcPreDefinedTerminatorSymbol (
	__IDIfcPreDefinedTerminatorSymbol__ Integer NOT NULL,
	PRIMARY KEY IfcPreDefinedTerminatorSymbol (__IDIfcPreDefinedTerminatorSymbol__)
) ;

CREATE TABLE IfcPreDefinedTextFont (
	__IDIfcPreDefinedTextFont__ Integer NOT NULL,
	PRIMARY KEY IfcPreDefinedTextFont (__IDIfcPreDefinedTextFont__)
) ;

CREATE TABLE IfcPresentationLayerAssignment (
	__IDIfcPresentationLayerAssignment__ Integer NOT NULL,
	Name text,
	Description text,
	Identifier text,
	PRIMARY KEY IfcPresentationLayerAssignment (__IDIfcPresentationLayerAssignment__)
) ;

CREATE TABLE IfcPresentationLayerWithStyle (
	__IDIfcPresentationLayerWithStyle__ Integer NOT NULL,
	LayerOn text,
	LayerFrozen text,
	LayerBlocked text,
	PRIMARY KEY IfcPresentationLayerWithStyle (__IDIfcPresentationLayerWithStyle__)
) ;

CREATE TABLE IfcPresentationStyle (
	__IDIfcPresentationStyle__ Integer NOT NULL,
	Name text,
	PRIMARY KEY IfcPresentationStyle (__IDIfcPresentationStyle__)
) ;

CREATE TABLE IfcPresentationStyleAssignment (
	__IDIfcPresentationStyleAssignment__ Integer NOT NULL,
	PRIMARY KEY IfcPresentationStyleAssignment (__IDIfcPresentationStyleAssignment__)
) ;

CREATE TABLE IfcProcedure (
	__IDIfcProcedure__ Integer NOT NULL,
	ProcedureID text,
	ProcedureType text,
	UserDefinedProcedureType text,
	PRIMARY KEY IfcProcedure (__IDIfcProcedure__)
) ;

CREATE TABLE IfcProcess (
	__IDIfcProcess__ Integer NOT NULL,
	FOREIGN KEY OperatesOn (__FKOperatesOn__) REFERENCES IfcRelAssignsToProcess (__IDIfcRelAssignsToProcess__),
	FOREIGN KEY IsSuccessorFrom (__FKIsSuccessorFrom__) REFERENCES IfcRelSequence (__IDIfcRelSequence__),
	FOREIGN KEY IsPredecessorTo (__FKIsPredecessorTo__) REFERENCES IfcRelSequence (__IDIfcRelSequence__),
	PRIMARY KEY IfcProcess (__IDIfcProcess__),
	__FKOperatesOn__ Integer,
	__FKIsSuccessorFrom__ Integer,
	__FKIsPredecessorTo__ Integer
) ;

CREATE TABLE IfcProduct (
	__IDIfcProduct__ Integer NOT NULL,
	FOREIGN KEY ReferencedBy (__FKReferencedBy__) REFERENCES IfcRelAssignsToProduct (__IDIfcRelAssignsToProduct__),
	FOREIGN KEY ObjectPlacement (__FKObjectPlacement__) REFERENCES IfcObjectPlacement (__IDIfcObjectPlacement__),
	FOREIGN KEY Representation (__FKRepresentation__) REFERENCES IfcProductRepresentation (__IDIfcProductRepresentation__),
	FOREIGN KEY ReferencedInStructures (__FKReferencedInStructures__) REFERENCES IfcRelReferencedInSpatialStructure (__IDIfcRelReferencedInSpatialStructure__),
	FOREIGN KEY ContainedInStructure (__FKContainedInStructure__) REFERENCES IfcRelContainedInSpatialStructure (__IDIfcRelContainedInSpatialStructure__),
	PRIMARY KEY IfcProduct (__IDIfcProduct__),
	__FKReferencedBy__ Integer,
	__FKObjectPlacement__ Integer,
	__FKRepresentation__ Integer,
	__FKReferencedInStructures__ Integer,
	__FKContainedInStructure__ Integer
) ;

CREATE TABLE IfcProductDefinitionShape (
	__IDIfcProductDefinitionShape__ Integer NOT NULL,
	FOREIGN KEY HasShapeAspects (__FKHasShapeAspects__) REFERENCES IfcShapeAspect (__IDIfcShapeAspect__),
	PRIMARY KEY IfcProductDefinitionShape (__IDIfcProductDefinitionShape__),
	__FKHasShapeAspects__ Integer
) ;

CREATE TABLE IfcProductRepresentation (
	__IDIfcProductRepresentation__ Integer NOT NULL,
	Name text,
	Description text,
	FOREIGN KEY ShapeOfProduct (__FKShapeOfProduct__) REFERENCES IfcProduct (__IDIfcProduct__),
	PRIMARY KEY IfcProductRepresentation (__IDIfcProductRepresentation__),
	__FKShapeOfProduct__ Integer
) ;

CREATE TABLE IfcProductsOfCombustionProperties (
	__IDIfcProductsOfCombustionProperties__ Integer NOT NULL,
	SpecificHeatCapacity text,
	N20Content text,
	COContent text,
	CO2Content text,
	PRIMARY KEY IfcProductsOfCombustionProperties (__IDIfcProductsOfCombustionProperties__)
) ;

CREATE TABLE IfcProfileDef (
	__IDIfcProfileDef__ Integer NOT NULL,
	ProfileType text,
	ProfileName text,
	PRIMARY KEY IfcProfileDef (__IDIfcProfileDef__)
) ;

CREATE TABLE IfcProfileProperties (
	__IDIfcProfileProperties__ Integer NOT NULL,
	FOREIGN KEY ProfileDefinition (__FKProfileDefinition__) REFERENCES IfcProfileDef (__IDIfcProfileDef__),
	ProfileName text,
	PRIMARY KEY IfcProfileProperties (__IDIfcProfileProperties__),
	__FKProfileDefinition__ Integer
) ;

CREATE TABLE IfcProject (
	__IDIfcProject__ Integer NOT NULL,
	LongName text,
	Phase text,
	FOREIGN KEY UnitsInContext (__FKUnitsInContext__) REFERENCES IfcUnitAssignment (__IDIfcUnitAssignment__),
	PRIMARY KEY IfcProject (__IDIfcProject__),
	__FKUnitsInContext__ Integer
) ;

CREATE TABLE IfcProjectOrder (
	__IDIfcProjectOrder__ Integer NOT NULL,
	ID text,
	PredefinedType text,
	Status text,
	PRIMARY KEY IfcProjectOrder (__IDIfcProjectOrder__)
) ;

CREATE TABLE IfcProjectOrderRecord (
	__IDIfcProjectOrderRecord__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcProjectOrderRecord (__IDIfcProjectOrderRecord__)
) ;

CREATE TABLE IfcProjectionCurve (
	__IDIfcProjectionCurve__ Integer NOT NULL,
	PRIMARY KEY IfcProjectionCurve (__IDIfcProjectionCurve__)
) ;

CREATE TABLE IfcProjectionElement (
	__IDIfcProjectionElement__ Integer NOT NULL,
	PRIMARY KEY IfcProjectionElement (__IDIfcProjectionElement__)
) ;

CREATE TABLE IfcProperty (
	__IDIfcProperty__ Integer NOT NULL,
	Name text,
	Description text,
	FOREIGN KEY PropertyForDependance (__FKPropertyForDependance__) REFERENCES IfcPropertyDependencyRelationship (__IDIfcPropertyDependencyRelationship__),
	FOREIGN KEY PropertyDependsOn (__FKPropertyDependsOn__) REFERENCES IfcPropertyDependencyRelationship (__IDIfcPropertyDependencyRelationship__),
	FOREIGN KEY PartOfComplex (__FKPartOfComplex__) REFERENCES IfcComplexProperty (__IDIfcComplexProperty__),
	PRIMARY KEY IfcProperty (__IDIfcProperty__),
	__FKPropertyForDependance__ Integer,
	__FKPropertyDependsOn__ Integer,
	__FKPartOfComplex__ Integer
) ;

CREATE TABLE IfcPropertyBoundedValue (
	__IDIfcPropertyBoundedValue__ Integer NOT NULL,
	FOREIGN KEY UpperBoundValue (__FKUpperBoundValue__) REFERENCES IfcValue (__IDIfcValue__),
	FOREIGN KEY LowerBoundValue (__FKLowerBoundValue__) REFERENCES IfcValue (__IDIfcValue__),
	FOREIGN KEY Unit (__FKUnit__) REFERENCES IfcUnit (__IDIfcUnit__),
	PRIMARY KEY IfcPropertyBoundedValue (__IDIfcPropertyBoundedValue__),
	__FKUpperBoundValue__ Integer,
	__FKLowerBoundValue__ Integer,
	__FKUnit__ Integer
) ;

CREATE TABLE IfcPropertyConstraintRelationship (
	__IDIfcPropertyConstraintRelationship__ Integer NOT NULL,
	Name text,
	Description text,
	FOREIGN KEY RelatingConstraint (__FKRelatingConstraint__) REFERENCES IfcConstraint (__IDIfcConstraint__),
	PRIMARY KEY IfcPropertyConstraintRelationship (__IDIfcPropertyConstraintRelationship__),
	__FKRelatingConstraint__ Integer
) ;

CREATE TABLE IfcPropertyDefinition (
	__IDIfcPropertyDefinition__ Integer NOT NULL,
	PRIMARY KEY IfcPropertyDefinition (__IDIfcPropertyDefinition__)
) ;

CREATE TABLE IfcPropertyDependencyRelationship (
	__IDIfcPropertyDependencyRelationship__ Integer NOT NULL,
	Name text,
	Description text,
	Expression text,
	FOREIGN KEY DependingProperty (__FKDependingProperty__) REFERENCES IfcProperty (__IDIfcProperty__),
	FOREIGN KEY DependantProperty (__FKDependantProperty__) REFERENCES IfcProperty (__IDIfcProperty__),
	PRIMARY KEY IfcPropertyDependencyRelationship (__IDIfcPropertyDependencyRelationship__),
	__FKDependingProperty__ Integer,
	__FKDependantProperty__ Integer
) ;

CREATE TABLE IfcPropertyEnumeratedValue (
	__IDIfcPropertyEnumeratedValue__ Integer NOT NULL,
	FOREIGN KEY EnumerationReference (__FKEnumerationReference__) REFERENCES IfcPropertyEnumeration (__IDIfcPropertyEnumeration__),
	PRIMARY KEY IfcPropertyEnumeratedValue (__IDIfcPropertyEnumeratedValue__),
	__FKEnumerationReference__ Integer
) ;

CREATE TABLE IfcPropertyEnumeration (
	__IDIfcPropertyEnumeration__ Integer NOT NULL,
	FOREIGN KEY Unit (__FKUnit__) REFERENCES IfcUnit (__IDIfcUnit__),
	Name text,
	PRIMARY KEY IfcPropertyEnumeration (__IDIfcPropertyEnumeration__),
	__FKUnit__ Integer
) ;

CREATE TABLE IfcPropertyListValue (
	__IDIfcPropertyListValue__ Integer NOT NULL,
	FOREIGN KEY Unit (__FKUnit__) REFERENCES IfcUnit (__IDIfcUnit__),
	PRIMARY KEY IfcPropertyListValue (__IDIfcPropertyListValue__),
	__FKUnit__ Integer
) ;

CREATE TABLE IfcPropertyReferenceValue (
	__IDIfcPropertyReferenceValue__ Integer NOT NULL,
	FOREIGN KEY PropertyReference (__FKPropertyReference__) REFERENCES IfcObjectReferenceSelect (__IDIfcObjectReferenceSelect__),
	UsageName text,
	PRIMARY KEY IfcPropertyReferenceValue (__IDIfcPropertyReferenceValue__),
	__FKPropertyReference__ Integer
) ;

CREATE TABLE IfcPropertySet (
	__IDIfcPropertySet__ Integer NOT NULL,
	PRIMARY KEY IfcPropertySet (__IDIfcPropertySet__)
) ;

CREATE TABLE IfcPropertySetDefinition (
	__IDIfcPropertySetDefinition__ Integer NOT NULL,
	FOREIGN KEY PropertyDefinitionOf (__FKPropertyDefinitionOf__) REFERENCES IfcRelDefinesByProperties (__IDIfcRelDefinesByProperties__),
	FOREIGN KEY DefinesType (__FKDefinesType__) REFERENCES IfcTypeObject (__IDIfcTypeObject__),
	PRIMARY KEY IfcPropertySetDefinition (__IDIfcPropertySetDefinition__),
	__FKPropertyDefinitionOf__ Integer,
	__FKDefinesType__ Integer
) ;

CREATE TABLE IfcPropertySingleValue (
	__IDIfcPropertySingleValue__ Integer NOT NULL,
	FOREIGN KEY NominalValue (__FKNominalValue__) REFERENCES IfcValue (__IDIfcValue__),
	FOREIGN KEY Unit (__FKUnit__) REFERENCES IfcUnit (__IDIfcUnit__),
	PRIMARY KEY IfcPropertySingleValue (__IDIfcPropertySingleValue__),
	__FKNominalValue__ Integer,
	__FKUnit__ Integer
) ;

CREATE TABLE IfcPropertyTableValue (
	__IDIfcPropertyTableValue__ Integer NOT NULL,
	FOREIGN KEY DefiningUnit (__FKDefiningUnit__) REFERENCES IfcUnit (__IDIfcUnit__),
	FOREIGN KEY DefinedUnit (__FKDefinedUnit__) REFERENCES IfcUnit (__IDIfcUnit__),
	Expression text,
	PRIMARY KEY IfcPropertyTableValue (__IDIfcPropertyTableValue__),
	__FKDefiningUnit__ Integer,
	__FKDefinedUnit__ Integer
) ;

CREATE TABLE IfcProtectiveDeviceType (
	__IDIfcProtectiveDeviceType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcProtectiveDeviceType (__IDIfcProtectiveDeviceType__)
) ;

CREATE TABLE IfcProxy (
	__IDIfcProxy__ Integer NOT NULL,
	ProxyType text,
	Tag text,
	PRIMARY KEY IfcProxy (__IDIfcProxy__)
) ;

CREATE TABLE IfcPumpType (
	__IDIfcPumpType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcPumpType (__IDIfcPumpType__)
) ;

CREATE TABLE IfcQuantityArea (
	__IDIfcQuantityArea__ Integer NOT NULL,
	AreaValue text,
	PRIMARY KEY IfcQuantityArea (__IDIfcQuantityArea__)
) ;

CREATE TABLE IfcQuantityCount (
	__IDIfcQuantityCount__ Integer NOT NULL,
	CountValue text,
	PRIMARY KEY IfcQuantityCount (__IDIfcQuantityCount__)
) ;

CREATE TABLE IfcQuantityLength (
	__IDIfcQuantityLength__ Integer NOT NULL,
	LengthValue text,
	PRIMARY KEY IfcQuantityLength (__IDIfcQuantityLength__)
) ;

CREATE TABLE IfcQuantityTime (
	__IDIfcQuantityTime__ Integer NOT NULL,
	TimeValue text,
	PRIMARY KEY IfcQuantityTime (__IDIfcQuantityTime__)
) ;

CREATE TABLE IfcQuantityVolume (
	__IDIfcQuantityVolume__ Integer NOT NULL,
	VolumeValue text,
	PRIMARY KEY IfcQuantityVolume (__IDIfcQuantityVolume__)
) ;

CREATE TABLE IfcQuantityWeight (
	__IDIfcQuantityWeight__ Integer NOT NULL,
	WeightValue text,
	PRIMARY KEY IfcQuantityWeight (__IDIfcQuantityWeight__)
) ;

CREATE TABLE IfcRadiusDimension (
	__IDIfcRadiusDimension__ Integer NOT NULL,
	PRIMARY KEY IfcRadiusDimension (__IDIfcRadiusDimension__)
) ;

CREATE TABLE IfcRailing (
	__IDIfcRailing__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcRailing (__IDIfcRailing__)
) ;

CREATE TABLE IfcRailingType (
	__IDIfcRailingType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcRailingType (__IDIfcRailingType__)
) ;

CREATE TABLE IfcRamp (
	__IDIfcRamp__ Integer NOT NULL,
	ShapeType text,
	PRIMARY KEY IfcRamp (__IDIfcRamp__)
) ;

CREATE TABLE IfcRampFlight (
	__IDIfcRampFlight__ Integer NOT NULL,
	PRIMARY KEY IfcRampFlight (__IDIfcRampFlight__)
) ;

CREATE TABLE IfcRampFlightType (
	__IDIfcRampFlightType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcRampFlightType (__IDIfcRampFlightType__)
) ;

CREATE TABLE IfcRationalBezierCurve (
	__IDIfcRationalBezierCurve__ Integer NOT NULL,
	PRIMARY KEY IfcRationalBezierCurve (__IDIfcRationalBezierCurve__)
) ;

CREATE TABLE IfcRectangleHollowProfileDef (
	__IDIfcRectangleHollowProfileDef__ Integer NOT NULL,
	WallThickness text,
	InnerFilletRadius text,
	OuterFilletRadius text,
	PRIMARY KEY IfcRectangleHollowProfileDef (__IDIfcRectangleHollowProfileDef__)
) ;

CREATE TABLE IfcRectangleProfileDef (
	__IDIfcRectangleProfileDef__ Integer NOT NULL,
	XDim text,
	YDim text,
	PRIMARY KEY IfcRectangleProfileDef (__IDIfcRectangleProfileDef__)
) ;

CREATE TABLE IfcRectangularPyramid (
	__IDIfcRectangularPyramid__ Integer NOT NULL,
	XLength text,
	YLength text,
	Height text,
	PRIMARY KEY IfcRectangularPyramid (__IDIfcRectangularPyramid__)
) ;

CREATE TABLE IfcRectangularTrimmedSurface (
	__IDIfcRectangularTrimmedSurface__ Integer NOT NULL,
	U1 text,
	V1 text,
	U2 text,
	V2 text,
	Usense text,
	Vsense text,
	FOREIGN KEY BasisSurface (__FKBasisSurface__) REFERENCES IfcSurface (__IDIfcSurface__),
	PRIMARY KEY IfcRectangularTrimmedSurface (__IDIfcRectangularTrimmedSurface__),
	__FKBasisSurface__ Integer
) ;

CREATE TABLE IfcReferencesValueDocument (
	__IDIfcReferencesValueDocument__ Integer NOT NULL,
	Name text,
	Description text,
	FOREIGN KEY ReferencedDocument (__FKReferencedDocument__) REFERENCES IfcDocumentSelect (__IDIfcDocumentSelect__),
	PRIMARY KEY IfcReferencesValueDocument (__IDIfcReferencesValueDocument__),
	__FKReferencedDocument__ Integer
) ;

CREATE TABLE IfcRegularTimeSeries (
	__IDIfcRegularTimeSeries__ Integer NOT NULL,
	TimeStep text,
	PRIMARY KEY IfcRegularTimeSeries (__IDIfcRegularTimeSeries__)
) ;

CREATE TABLE IfcReinforcementBarProperties (
	__IDIfcReinforcementBarProperties__ Integer NOT NULL,
	TotalCrossSectionArea text,
	SteelGrade text,
	BarSurface text,
	EffectiveDepth text,
	NominalBarDiameter text,
	BarCount text,
	PRIMARY KEY IfcReinforcementBarProperties (__IDIfcReinforcementBarProperties__)
) ;

CREATE TABLE IfcReinforcementDefinitionProperties (
	__IDIfcReinforcementDefinitionProperties__ Integer NOT NULL,
	DefinitionType text,
	PRIMARY KEY IfcReinforcementDefinitionProperties (__IDIfcReinforcementDefinitionProperties__)
) ;

CREATE TABLE IfcReinforcingBar (
	__IDIfcReinforcingBar__ Integer NOT NULL,
	NominalDiameter text,
	CrossSectionArea text,
	BarLength text,
	BarRole text,
	BarSurface text,
	PRIMARY KEY IfcReinforcingBar (__IDIfcReinforcingBar__)
) ;

CREATE TABLE IfcReinforcingElement (
	__IDIfcReinforcingElement__ Integer NOT NULL,
	SteelGrade text,
	PRIMARY KEY IfcReinforcingElement (__IDIfcReinforcingElement__)
) ;

CREATE TABLE IfcReinforcingMesh (
	__IDIfcReinforcingMesh__ Integer NOT NULL,
	MeshLength text,
	MeshWidth text,
	LongitudinalBarNominalDiameter text,
	TransverseBarNominalDiameter text,
	LongitudinalBarCrossSectionArea text,
	TransverseBarCrossSectionArea text,
	LongitudinalBarSpacing text,
	TransverseBarSpacing text,
	PRIMARY KEY IfcReinforcingMesh (__IDIfcReinforcingMesh__)
) ;

CREATE TABLE IfcRelAggregates (
	__IDIfcRelAggregates__ Integer NOT NULL,
	PRIMARY KEY IfcRelAggregates (__IDIfcRelAggregates__)
) ;

CREATE TABLE IfcRelAssigns (
	__IDIfcRelAssigns__ Integer NOT NULL,
	RelatedObjectsType text,
	PRIMARY KEY IfcRelAssigns (__IDIfcRelAssigns__)
) ;

CREATE TABLE IfcRelAssignsTasks (
	__IDIfcRelAssignsTasks__ Integer NOT NULL,
	FOREIGN KEY TimeForTask (__FKTimeForTask__) REFERENCES IfcScheduleTimeControl (__IDIfcScheduleTimeControl__),
	PRIMARY KEY IfcRelAssignsTasks (__IDIfcRelAssignsTasks__),
	__FKTimeForTask__ Integer
) ;

CREATE TABLE IfcRelAssignsToActor (
	__IDIfcRelAssignsToActor__ Integer NOT NULL,
	FOREIGN KEY RelatingActor (__FKRelatingActor__) REFERENCES IfcActor (__IDIfcActor__),
	FOREIGN KEY ActingRole (__FKActingRole__) REFERENCES IfcActorRole (__IDIfcActorRole__),
	PRIMARY KEY IfcRelAssignsToActor (__IDIfcRelAssignsToActor__),
	__FKRelatingActor__ Integer,
	__FKActingRole__ Integer
) ;

CREATE TABLE IfcRelAssignsToControl (
	__IDIfcRelAssignsToControl__ Integer NOT NULL,
	FOREIGN KEY RelatingControl (__FKRelatingControl__) REFERENCES IfcControl (__IDIfcControl__),
	PRIMARY KEY IfcRelAssignsToControl (__IDIfcRelAssignsToControl__),
	__FKRelatingControl__ Integer
) ;

CREATE TABLE IfcRelAssignsToGroup (
	__IDIfcRelAssignsToGroup__ Integer NOT NULL,
	FOREIGN KEY RelatingGroup (__FKRelatingGroup__) REFERENCES IfcGroup (__IDIfcGroup__),
	PRIMARY KEY IfcRelAssignsToGroup (__IDIfcRelAssignsToGroup__),
	__FKRelatingGroup__ Integer
) ;

CREATE TABLE IfcRelAssignsToProcess (
	__IDIfcRelAssignsToProcess__ Integer NOT NULL,
	FOREIGN KEY RelatingProcess (__FKRelatingProcess__) REFERENCES IfcProcess (__IDIfcProcess__),
	FOREIGN KEY QuantityInProcess (__FKQuantityInProcess__) REFERENCES IfcMeasureWithUnit (__IDIfcMeasureWithUnit__),
	PRIMARY KEY IfcRelAssignsToProcess (__IDIfcRelAssignsToProcess__),
	__FKRelatingProcess__ Integer,
	__FKQuantityInProcess__ Integer
) ;

CREATE TABLE IfcRelAssignsToProduct (
	__IDIfcRelAssignsToProduct__ Integer NOT NULL,
	FOREIGN KEY RelatingProduct (__FKRelatingProduct__) REFERENCES IfcProduct (__IDIfcProduct__),
	PRIMARY KEY IfcRelAssignsToProduct (__IDIfcRelAssignsToProduct__),
	__FKRelatingProduct__ Integer
) ;

CREATE TABLE IfcRelAssignsToProjectOrder (
	__IDIfcRelAssignsToProjectOrder__ Integer NOT NULL,
	PRIMARY KEY IfcRelAssignsToProjectOrder (__IDIfcRelAssignsToProjectOrder__)
) ;

CREATE TABLE IfcRelAssignsToResource (
	__IDIfcRelAssignsToResource__ Integer NOT NULL,
	FOREIGN KEY RelatingResource (__FKRelatingResource__) REFERENCES IfcResource (__IDIfcResource__),
	PRIMARY KEY IfcRelAssignsToResource (__IDIfcRelAssignsToResource__),
	__FKRelatingResource__ Integer
) ;

CREATE TABLE IfcRelAssociates (
	__IDIfcRelAssociates__ Integer NOT NULL,
	PRIMARY KEY IfcRelAssociates (__IDIfcRelAssociates__)
) ;

CREATE TABLE IfcRelAssociatesAppliedValue (
	__IDIfcRelAssociatesAppliedValue__ Integer NOT NULL,
	FOREIGN KEY RelatingAppliedValue (__FKRelatingAppliedValue__) REFERENCES IfcAppliedValue (__IDIfcAppliedValue__),
	PRIMARY KEY IfcRelAssociatesAppliedValue (__IDIfcRelAssociatesAppliedValue__),
	__FKRelatingAppliedValue__ Integer
) ;

CREATE TABLE IfcRelAssociatesApproval (
	__IDIfcRelAssociatesApproval__ Integer NOT NULL,
	FOREIGN KEY RelatingApproval (__FKRelatingApproval__) REFERENCES IfcApproval (__IDIfcApproval__),
	PRIMARY KEY IfcRelAssociatesApproval (__IDIfcRelAssociatesApproval__),
	__FKRelatingApproval__ Integer
) ;

CREATE TABLE IfcRelAssociatesClassification (
	__IDIfcRelAssociatesClassification__ Integer NOT NULL,
	FOREIGN KEY RelatingClassification (__FKRelatingClassification__) REFERENCES IfcClassificationNotationSelect (__IDIfcClassificationNotationSelect__),
	PRIMARY KEY IfcRelAssociatesClassification (__IDIfcRelAssociatesClassification__),
	__FKRelatingClassification__ Integer
) ;

CREATE TABLE IfcRelAssociatesConstraint (
	__IDIfcRelAssociatesConstraint__ Integer NOT NULL,
	FOREIGN KEY RelatingConstraint (__FKRelatingConstraint__) REFERENCES IfcConstraint (__IDIfcConstraint__),
	Intent text,
	PRIMARY KEY IfcRelAssociatesConstraint (__IDIfcRelAssociatesConstraint__),
	__FKRelatingConstraint__ Integer
) ;

CREATE TABLE IfcRelAssociatesDocument (
	__IDIfcRelAssociatesDocument__ Integer NOT NULL,
	FOREIGN KEY RelatingDocument (__FKRelatingDocument__) REFERENCES IfcDocumentSelect (__IDIfcDocumentSelect__),
	PRIMARY KEY IfcRelAssociatesDocument (__IDIfcRelAssociatesDocument__),
	__FKRelatingDocument__ Integer
) ;

CREATE TABLE IfcRelAssociatesLibrary (
	__IDIfcRelAssociatesLibrary__ Integer NOT NULL,
	FOREIGN KEY RelatingLibrary (__FKRelatingLibrary__) REFERENCES IfcLibrarySelect (__IDIfcLibrarySelect__),
	PRIMARY KEY IfcRelAssociatesLibrary (__IDIfcRelAssociatesLibrary__),
	__FKRelatingLibrary__ Integer
) ;

CREATE TABLE IfcRelAssociatesMaterial (
	__IDIfcRelAssociatesMaterial__ Integer NOT NULL,
	FOREIGN KEY RelatingMaterial (__FKRelatingMaterial__) REFERENCES IfcMaterialSelect (__IDIfcMaterialSelect__),
	PRIMARY KEY IfcRelAssociatesMaterial (__IDIfcRelAssociatesMaterial__),
	__FKRelatingMaterial__ Integer
) ;

CREATE TABLE IfcRelAssociatesProfileProperties (
	__IDIfcRelAssociatesProfileProperties__ Integer NOT NULL,
	FOREIGN KEY ProfileOrientation (__FKProfileOrientation__) REFERENCES IfcOrientationSelect (__IDIfcOrientationSelect__),
	FOREIGN KEY RelatingProfileProperties (__FKRelatingProfileProperties__) REFERENCES IfcProfileProperties (__IDIfcProfileProperties__),
	FOREIGN KEY ProfileSectionLocation (__FKProfileSectionLocation__) REFERENCES IfcShapeAspect (__IDIfcShapeAspect__),
	PRIMARY KEY IfcRelAssociatesProfileProperties (__IDIfcRelAssociatesProfileProperties__),
	__FKProfileOrientation__ Integer,
	__FKRelatingProfileProperties__ Integer,
	__FKProfileSectionLocation__ Integer
) ;

CREATE TABLE IfcRelConnects (
	__IDIfcRelConnects__ Integer NOT NULL,
	PRIMARY KEY IfcRelConnects (__IDIfcRelConnects__)
) ;

CREATE TABLE IfcRelConnectsElements (
	__IDIfcRelConnectsElements__ Integer NOT NULL,
	FOREIGN KEY ConnectionGeometry (__FKConnectionGeometry__) REFERENCES IfcConnectionGeometry (__IDIfcConnectionGeometry__),
	FOREIGN KEY RelatingElement (__FKRelatingElement__) REFERENCES IfcElement (__IDIfcElement__),
	FOREIGN KEY RelatedElement (__FKRelatedElement__) REFERENCES IfcElement (__IDIfcElement__),
	PRIMARY KEY IfcRelConnectsElements (__IDIfcRelConnectsElements__),
	__FKConnectionGeometry__ Integer,
	__FKRelatingElement__ Integer,
	__FKRelatedElement__ Integer
) ;

CREATE TABLE IfcRelConnectsPathElements (
	__IDIfcRelConnectsPathElements__ Integer NOT NULL,
	RelatedConnectionType text,
	RelatingConnectionType text,
	PRIMARY KEY IfcRelConnectsPathElements (__IDIfcRelConnectsPathElements__)
) ;

CREATE TABLE IfcRelConnectsPortToElement (
	__IDIfcRelConnectsPortToElement__ Integer NOT NULL,
	FOREIGN KEY RelatingPort (__FKRelatingPort__) REFERENCES IfcPort (__IDIfcPort__),
	FOREIGN KEY RelatedElement (__FKRelatedElement__) REFERENCES IfcElement (__IDIfcElement__),
	PRIMARY KEY IfcRelConnectsPortToElement (__IDIfcRelConnectsPortToElement__),
	__FKRelatingPort__ Integer,
	__FKRelatedElement__ Integer
) ;

CREATE TABLE IfcRelConnectsPorts (
	__IDIfcRelConnectsPorts__ Integer NOT NULL,
	FOREIGN KEY RelatingPort (__FKRelatingPort__) REFERENCES IfcPort (__IDIfcPort__),
	FOREIGN KEY RelatedPort (__FKRelatedPort__) REFERENCES IfcPort (__IDIfcPort__),
	FOREIGN KEY RealizingElement (__FKRealizingElement__) REFERENCES IfcElement (__IDIfcElement__),
	PRIMARY KEY IfcRelConnectsPorts (__IDIfcRelConnectsPorts__),
	__FKRelatingPort__ Integer,
	__FKRelatedPort__ Integer,
	__FKRealizingElement__ Integer
) ;

CREATE TABLE IfcRelConnectsStructuralActivity (
	__IDIfcRelConnectsStructuralActivity__ Integer NOT NULL,
	FOREIGN KEY RelatingElement (__FKRelatingElement__) REFERENCES IfcStructuralActivityAssignmentSelect (__IDIfcStructuralActivityAssignmentSelect__),
	FOREIGN KEY RelatedStructuralActivity (__FKRelatedStructuralActivity__) REFERENCES IfcStructuralActivity (__IDIfcStructuralActivity__),
	PRIMARY KEY IfcRelConnectsStructuralActivity (__IDIfcRelConnectsStructuralActivity__),
	__FKRelatingElement__ Integer,
	__FKRelatedStructuralActivity__ Integer
) ;

CREATE TABLE IfcRelConnectsStructuralElement (
	__IDIfcRelConnectsStructuralElement__ Integer NOT NULL,
	FOREIGN KEY RelatingElement (__FKRelatingElement__) REFERENCES IfcElement (__IDIfcElement__),
	FOREIGN KEY RelatedStructuralMember (__FKRelatedStructuralMember__) REFERENCES IfcStructuralMember (__IDIfcStructuralMember__),
	PRIMARY KEY IfcRelConnectsStructuralElement (__IDIfcRelConnectsStructuralElement__),
	__FKRelatingElement__ Integer,
	__FKRelatedStructuralMember__ Integer
) ;

CREATE TABLE IfcRelConnectsStructuralMember (
	__IDIfcRelConnectsStructuralMember__ Integer NOT NULL,
	FOREIGN KEY RelatingStructuralMember (__FKRelatingStructuralMember__) REFERENCES IfcStructuralMember (__IDIfcStructuralMember__),
	FOREIGN KEY RelatedStructuralConnection (__FKRelatedStructuralConnection__) REFERENCES IfcStructuralConnection (__IDIfcStructuralConnection__),
	FOREIGN KEY AppliedCondition (__FKAppliedCondition__) REFERENCES IfcBoundaryCondition (__IDIfcBoundaryCondition__),
	FOREIGN KEY AdditionalConditions (__FKAdditionalConditions__) REFERENCES IfcStructuralConnectionCondition (__IDIfcStructuralConnectionCondition__),
	FOREIGN KEY ConditionCoordinateSystem (__FKConditionCoordinateSystem__) REFERENCES IfcAxis2Placement3D (__IDIfcAxis2Placement3D__),
	SupportedLength text,
	PRIMARY KEY IfcRelConnectsStructuralMember (__IDIfcRelConnectsStructuralMember__),
	__FKRelatingStructuralMember__ Integer,
	__FKRelatedStructuralConnection__ Integer,
	__FKAppliedCondition__ Integer,
	__FKAdditionalConditions__ Integer,
	__FKConditionCoordinateSystem__ Integer
) ;

CREATE TABLE IfcRelConnectsWithEccentricity (
	__IDIfcRelConnectsWithEccentricity__ Integer NOT NULL,
	FOREIGN KEY ConnectionConstraint (__FKConnectionConstraint__) REFERENCES IfcConnectionGeometry (__IDIfcConnectionGeometry__),
	PRIMARY KEY IfcRelConnectsWithEccentricity (__IDIfcRelConnectsWithEccentricity__),
	__FKConnectionConstraint__ Integer
) ;

CREATE TABLE IfcRelConnectsWithRealizingElements (
	__IDIfcRelConnectsWithRealizingElements__ Integer NOT NULL,
	ConnectionType text,
	PRIMARY KEY IfcRelConnectsWithRealizingElements (__IDIfcRelConnectsWithRealizingElements__)
) ;

CREATE TABLE IfcRelContainedInSpatialStructure (
	__IDIfcRelContainedInSpatialStructure__ Integer NOT NULL,
	FOREIGN KEY RelatingStructure (__FKRelatingStructure__) REFERENCES IfcSpatialStructureElement (__IDIfcSpatialStructureElement__),
	PRIMARY KEY IfcRelContainedInSpatialStructure (__IDIfcRelContainedInSpatialStructure__),
	__FKRelatingStructure__ Integer
) ;

CREATE TABLE IfcRelCoversBldgElements (
	__IDIfcRelCoversBldgElements__ Integer NOT NULL,
	FOREIGN KEY RelatingBuildingElement (__FKRelatingBuildingElement__) REFERENCES IfcElement (__IDIfcElement__),
	PRIMARY KEY IfcRelCoversBldgElements (__IDIfcRelCoversBldgElements__),
	__FKRelatingBuildingElement__ Integer
) ;

CREATE TABLE IfcRelCoversSpaces (
	__IDIfcRelCoversSpaces__ Integer NOT NULL,
	FOREIGN KEY RelatedSpace (__FKRelatedSpace__) REFERENCES IfcSpace (__IDIfcSpace__),
	PRIMARY KEY IfcRelCoversSpaces (__IDIfcRelCoversSpaces__),
	__FKRelatedSpace__ Integer
) ;

CREATE TABLE IfcRelDecomposes (
	__IDIfcRelDecomposes__ Integer NOT NULL,
	FOREIGN KEY RelatingObject (__FKRelatingObject__) REFERENCES IfcObjectDefinition (__IDIfcObjectDefinition__),
	PRIMARY KEY IfcRelDecomposes (__IDIfcRelDecomposes__),
	__FKRelatingObject__ Integer
) ;

CREATE TABLE IfcRelDefines (
	__IDIfcRelDefines__ Integer NOT NULL,
	PRIMARY KEY IfcRelDefines (__IDIfcRelDefines__)
) ;

CREATE TABLE IfcRelDefinesByProperties (
	__IDIfcRelDefinesByProperties__ Integer NOT NULL,
	FOREIGN KEY RelatingPropertyDefinition (__FKRelatingPropertyDefinition__) REFERENCES IfcPropertySetDefinition (__IDIfcPropertySetDefinition__),
	PRIMARY KEY IfcRelDefinesByProperties (__IDIfcRelDefinesByProperties__),
	__FKRelatingPropertyDefinition__ Integer
) ;

CREATE TABLE IfcRelDefinesByType (
	__IDIfcRelDefinesByType__ Integer NOT NULL,
	FOREIGN KEY RelatingType (__FKRelatingType__) REFERENCES IfcTypeObject (__IDIfcTypeObject__),
	PRIMARY KEY IfcRelDefinesByType (__IDIfcRelDefinesByType__),
	__FKRelatingType__ Integer
) ;

CREATE TABLE IfcRelFillsElement (
	__IDIfcRelFillsElement__ Integer NOT NULL,
	FOREIGN KEY RelatingOpeningElement (__FKRelatingOpeningElement__) REFERENCES IfcOpeningElement (__IDIfcOpeningElement__),
	FOREIGN KEY RelatedBuildingElement (__FKRelatedBuildingElement__) REFERENCES IfcElement (__IDIfcElement__),
	PRIMARY KEY IfcRelFillsElement (__IDIfcRelFillsElement__),
	__FKRelatingOpeningElement__ Integer,
	__FKRelatedBuildingElement__ Integer
) ;

CREATE TABLE IfcRelFlowControlElements (
	__IDIfcRelFlowControlElements__ Integer NOT NULL,
	FOREIGN KEY RelatingFlowElement (__FKRelatingFlowElement__) REFERENCES IfcDistributionFlowElement (__IDIfcDistributionFlowElement__),
	PRIMARY KEY IfcRelFlowControlElements (__IDIfcRelFlowControlElements__),
	__FKRelatingFlowElement__ Integer
) ;

CREATE TABLE IfcRelInteractionRequirements (
	__IDIfcRelInteractionRequirements__ Integer NOT NULL,
	DailyInteraction text,
	ImportanceRating text,
	FOREIGN KEY LocationOfInteraction (__FKLocationOfInteraction__) REFERENCES IfcSpatialStructureElement (__IDIfcSpatialStructureElement__),
	FOREIGN KEY RelatedSpaceProgram (__FKRelatedSpaceProgram__) REFERENCES IfcSpaceProgram (__IDIfcSpaceProgram__),
	FOREIGN KEY RelatingSpaceProgram (__FKRelatingSpaceProgram__) REFERENCES IfcSpaceProgram (__IDIfcSpaceProgram__),
	PRIMARY KEY IfcRelInteractionRequirements (__IDIfcRelInteractionRequirements__),
	__FKLocationOfInteraction__ Integer,
	__FKRelatedSpaceProgram__ Integer,
	__FKRelatingSpaceProgram__ Integer
) ;

CREATE TABLE IfcRelNests (
	__IDIfcRelNests__ Integer NOT NULL,
	PRIMARY KEY IfcRelNests (__IDIfcRelNests__)
) ;

CREATE TABLE IfcRelOccupiesSpaces (
	__IDIfcRelOccupiesSpaces__ Integer NOT NULL,
	PRIMARY KEY IfcRelOccupiesSpaces (__IDIfcRelOccupiesSpaces__)
) ;

CREATE TABLE IfcRelOverridesProperties (
	__IDIfcRelOverridesProperties__ Integer NOT NULL,
	PRIMARY KEY IfcRelOverridesProperties (__IDIfcRelOverridesProperties__)
) ;

CREATE TABLE IfcRelProjectsElement (
	__IDIfcRelProjectsElement__ Integer NOT NULL,
	FOREIGN KEY RelatingElement (__FKRelatingElement__) REFERENCES IfcElement (__IDIfcElement__),
	FOREIGN KEY RelatedFeatureElement (__FKRelatedFeatureElement__) REFERENCES IfcFeatureElementAddition (__IDIfcFeatureElementAddition__),
	PRIMARY KEY IfcRelProjectsElement (__IDIfcRelProjectsElement__),
	__FKRelatingElement__ Integer,
	__FKRelatedFeatureElement__ Integer
) ;

CREATE TABLE IfcRelReferencedInSpatialStructure (
	__IDIfcRelReferencedInSpatialStructure__ Integer NOT NULL,
	FOREIGN KEY RelatingStructure (__FKRelatingStructure__) REFERENCES IfcSpatialStructureElement (__IDIfcSpatialStructureElement__),
	PRIMARY KEY IfcRelReferencedInSpatialStructure (__IDIfcRelReferencedInSpatialStructure__),
	__FKRelatingStructure__ Integer
) ;

CREATE TABLE IfcRelSchedulesCostItems (
	__IDIfcRelSchedulesCostItems__ Integer NOT NULL,
	PRIMARY KEY IfcRelSchedulesCostItems (__IDIfcRelSchedulesCostItems__)
) ;

CREATE TABLE IfcRelSequence (
	__IDIfcRelSequence__ Integer NOT NULL,
	TimeLag text,
	SequenceType text,
	FOREIGN KEY RelatingProcess (__FKRelatingProcess__) REFERENCES IfcProcess (__IDIfcProcess__),
	FOREIGN KEY RelatedProcess (__FKRelatedProcess__) REFERENCES IfcProcess (__IDIfcProcess__),
	PRIMARY KEY IfcRelSequence (__IDIfcRelSequence__),
	__FKRelatingProcess__ Integer,
	__FKRelatedProcess__ Integer
) ;

CREATE TABLE IfcRelServicesBuildings (
	__IDIfcRelServicesBuildings__ Integer NOT NULL,
	FOREIGN KEY RelatingSystem (__FKRelatingSystem__) REFERENCES IfcSystem (__IDIfcSystem__),
	PRIMARY KEY IfcRelServicesBuildings (__IDIfcRelServicesBuildings__),
	__FKRelatingSystem__ Integer
) ;

CREATE TABLE IfcRelSpaceBoundary (
	__IDIfcRelSpaceBoundary__ Integer NOT NULL,
	PhysicalOrVirtualBoundary text,
	InternalOrExternalBoundary text,
	FOREIGN KEY RelatingSpace (__FKRelatingSpace__) REFERENCES IfcSpace (__IDIfcSpace__),
	FOREIGN KEY RelatedBuildingElement (__FKRelatedBuildingElement__) REFERENCES IfcElement (__IDIfcElement__),
	FOREIGN KEY ConnectionGeometry (__FKConnectionGeometry__) REFERENCES IfcConnectionGeometry (__IDIfcConnectionGeometry__),
	PRIMARY KEY IfcRelSpaceBoundary (__IDIfcRelSpaceBoundary__),
	__FKRelatingSpace__ Integer,
	__FKRelatedBuildingElement__ Integer,
	__FKConnectionGeometry__ Integer
) ;

CREATE TABLE IfcRelVoidsElement (
	__IDIfcRelVoidsElement__ Integer NOT NULL,
	FOREIGN KEY RelatingBuildingElement (__FKRelatingBuildingElement__) REFERENCES IfcElement (__IDIfcElement__),
	FOREIGN KEY RelatedOpeningElement (__FKRelatedOpeningElement__) REFERENCES IfcFeatureElementSubtraction (__IDIfcFeatureElementSubtraction__),
	PRIMARY KEY IfcRelVoidsElement (__IDIfcRelVoidsElement__),
	__FKRelatingBuildingElement__ Integer,
	__FKRelatedOpeningElement__ Integer
) ;

CREATE TABLE IfcRelationship (
	__IDIfcRelationship__ Integer NOT NULL,
	PRIMARY KEY IfcRelationship (__IDIfcRelationship__)
) ;

CREATE TABLE IfcRelaxation (
	__IDIfcRelaxation__ Integer NOT NULL,
	RelaxationValue text,
	InitialStress text,
	PRIMARY KEY IfcRelaxation (__IDIfcRelaxation__)
) ;

CREATE TABLE IfcRepresentation (
	__IDIfcRepresentation__ Integer NOT NULL,
	RepresentationIdentifier text,
	RepresentationType text,
	FOREIGN KEY RepresentationMap (__FKRepresentationMap__) REFERENCES IfcRepresentationMap (__IDIfcRepresentationMap__),
	FOREIGN KEY OfProductRepresentation (__FKOfProductRepresentation__) REFERENCES IfcProductRepresentation (__IDIfcProductRepresentation__),
	FOREIGN KEY ContextOfItems (__FKContextOfItems__) REFERENCES IfcRepresentationContext (__IDIfcRepresentationContext__),
	PRIMARY KEY IfcRepresentation (__IDIfcRepresentation__),
	__FKRepresentationMap__ Integer,
	__FKOfProductRepresentation__ Integer,
	__FKContextOfItems__ Integer
) ;

CREATE TABLE IfcRepresentationContext (
	__IDIfcRepresentationContext__ Integer NOT NULL,
	ContextIdentifier text,
	ContextType text,
	FOREIGN KEY RepresentationsInContext (__FKRepresentationsInContext__) REFERENCES IfcRepresentation (__IDIfcRepresentation__),
	PRIMARY KEY IfcRepresentationContext (__IDIfcRepresentationContext__),
	__FKRepresentationsInContext__ Integer
) ;

CREATE TABLE IfcRepresentationItem (
	__IDIfcRepresentationItem__ Integer NOT NULL,
	FOREIGN KEY StyledByItem (__FKStyledByItem__) REFERENCES IfcStyledItem (__IDIfcStyledItem__),
	PRIMARY KEY IfcRepresentationItem (__IDIfcRepresentationItem__),
	__FKStyledByItem__ Integer
) ;

CREATE TABLE IfcRepresentationMap (
	__IDIfcRepresentationMap__ Integer NOT NULL,
	FOREIGN KEY MapUsage (__FKMapUsage__) REFERENCES IfcMappedItem (__IDIfcMappedItem__),
	FOREIGN KEY MappingOrigin (__FKMappingOrigin__) REFERENCES IfcAxis2Placement (__IDIfcAxis2Placement__),
	FOREIGN KEY MappedRepresentation (__FKMappedRepresentation__) REFERENCES IfcRepresentation (__IDIfcRepresentation__),
	PRIMARY KEY IfcRepresentationMap (__IDIfcRepresentationMap__),
	__FKMapUsage__ Integer,
	__FKMappingOrigin__ Integer,
	__FKMappedRepresentation__ Integer
) ;

CREATE TABLE IfcResource (
	__IDIfcResource__ Integer NOT NULL,
	FOREIGN KEY ResourceOf (__FKResourceOf__) REFERENCES IfcRelAssignsToResource (__IDIfcRelAssignsToResource__),
	PRIMARY KEY IfcResource (__IDIfcResource__),
	__FKResourceOf__ Integer
) ;

CREATE TABLE IfcRevolvedAreaSolid (
	__IDIfcRevolvedAreaSolid__ Integer NOT NULL,
	FOREIGN KEY Axis (__FKAxis__) REFERENCES IfcAxis1Placement (__IDIfcAxis1Placement__),
	Angle text,
	PRIMARY KEY IfcRevolvedAreaSolid (__IDIfcRevolvedAreaSolid__),
	__FKAxis__ Integer
) ;

CREATE TABLE IfcRibPlateProfileProperties (
	__IDIfcRibPlateProfileProperties__ Integer NOT NULL,
	Thickness text,
	RibHeight text,
	RibWidth text,
	RibSpacing text,
	Direction text,
	PRIMARY KEY IfcRibPlateProfileProperties (__IDIfcRibPlateProfileProperties__)
) ;

CREATE TABLE IfcRightCircularCone (
	__IDIfcRightCircularCone__ Integer NOT NULL,
	Height text,
	BottomRadius text,
	PRIMARY KEY IfcRightCircularCone (__IDIfcRightCircularCone__)
) ;

CREATE TABLE IfcRightCircularCylinder (
	__IDIfcRightCircularCylinder__ Integer NOT NULL,
	Height text,
	Radius text,
	PRIMARY KEY IfcRightCircularCylinder (__IDIfcRightCircularCylinder__)
) ;

CREATE TABLE IfcRoof (
	__IDIfcRoof__ Integer NOT NULL,
	ShapeType text,
	PRIMARY KEY IfcRoof (__IDIfcRoof__)
) ;

CREATE TABLE IfcRoot (
	__IDIfcRoot__ Integer NOT NULL,
	GlobalId text,
	Name text,
	Description text,
	FOREIGN KEY OwnerHistory (__FKOwnerHistory__) REFERENCES IfcOwnerHistory (__IDIfcOwnerHistory__),
	FOREIGN KEY HasAssociations (__FKHasAssociations__) REFERENCES IfcRelAssociates (__IDIfcRelAssociates__),
	PRIMARY KEY IfcRoot (__IDIfcRoot__),
	__FKOwnerHistory__ Integer,
	__FKHasAssociations__ Integer
) ;

CREATE TABLE IfcRoundedEdgeFeature (
	__IDIfcRoundedEdgeFeature__ Integer NOT NULL,
	Radius text,
	PRIMARY KEY IfcRoundedEdgeFeature (__IDIfcRoundedEdgeFeature__)
) ;

CREATE TABLE IfcRoundedRectangleProfileDef (
	__IDIfcRoundedRectangleProfileDef__ Integer NOT NULL,
	RoundingRadius text,
	PRIMARY KEY IfcRoundedRectangleProfileDef (__IDIfcRoundedRectangleProfileDef__)
) ;

CREATE TABLE IfcSIUnit (
	__IDIfcSIUnit__ Integer NOT NULL,
	Prefix text,
	Name text,
	PRIMARY KEY IfcSIUnit (__IDIfcSIUnit__)
) ;

CREATE TABLE IfcSanitaryTerminalType (
	__IDIfcSanitaryTerminalType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcSanitaryTerminalType (__IDIfcSanitaryTerminalType__)
) ;

CREATE TABLE IfcScheduleTimeControl (
	__IDIfcScheduleTimeControl__ Integer NOT NULL,
	ScheduleDuration text,
	ActualDuration text,
	RemainingTime text,
	FreeFloat text,
	TotalFloat text,
	IsCritical text,
	StartFloat text,
	FinishFloat text,
	Completion text,
	FOREIGN KEY ScheduleTimeControlAssigned (__FKScheduleTimeControlAssigned__) REFERENCES IfcRelAssignsTasks (__IDIfcRelAssignsTasks__),
	FOREIGN KEY ActualStart (__FKActualStart__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	FOREIGN KEY EarlyStart (__FKEarlyStart__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	FOREIGN KEY LateStart (__FKLateStart__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	FOREIGN KEY ScheduleStart (__FKScheduleStart__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	FOREIGN KEY ActualFinish (__FKActualFinish__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	FOREIGN KEY EarlyFinish (__FKEarlyFinish__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	FOREIGN KEY LateFinish (__FKLateFinish__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	FOREIGN KEY ScheduleFinish (__FKScheduleFinish__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	FOREIGN KEY StatusTime (__FKStatusTime__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	PRIMARY KEY IfcScheduleTimeControl (__IDIfcScheduleTimeControl__),
	__FKScheduleTimeControlAssigned__ Integer,
	__FKActualStart__ Integer,
	__FKEarlyStart__ Integer,
	__FKLateStart__ Integer,
	__FKScheduleStart__ Integer,
	__FKActualFinish__ Integer,
	__FKEarlyFinish__ Integer,
	__FKLateFinish__ Integer,
	__FKScheduleFinish__ Integer,
	__FKStatusTime__ Integer
) ;

CREATE TABLE IfcSectionProperties (
	__IDIfcSectionProperties__ Integer NOT NULL,
	FOREIGN KEY StartProfile (__FKStartProfile__) REFERENCES IfcProfileDef (__IDIfcProfileDef__),
	FOREIGN KEY EndProfile (__FKEndProfile__) REFERENCES IfcProfileDef (__IDIfcProfileDef__),
	SectionType text,
	PRIMARY KEY IfcSectionProperties (__IDIfcSectionProperties__),
	__FKStartProfile__ Integer,
	__FKEndProfile__ Integer
) ;

CREATE TABLE IfcSectionReinforcementProperties (
	__IDIfcSectionReinforcementProperties__ Integer NOT NULL,
	LongitudinalStartPosition text,
	LongitudinalEndPosition text,
	TransversePosition text,
	ReinforcementRole text,
	FOREIGN KEY SectionDefinition (__FKSectionDefinition__) REFERENCES IfcSectionProperties (__IDIfcSectionProperties__),
	PRIMARY KEY IfcSectionReinforcementProperties (__IDIfcSectionReinforcementProperties__),
	__FKSectionDefinition__ Integer
) ;

CREATE TABLE IfcSectionedSpine (
	__IDIfcSectionedSpine__ Integer NOT NULL,
	FOREIGN KEY SpineCurve (__FKSpineCurve__) REFERENCES IfcCompositeCurve (__IDIfcCompositeCurve__),
	PRIMARY KEY IfcSectionedSpine (__IDIfcSectionedSpine__),
	__FKSpineCurve__ Integer
) ;

CREATE TABLE IfcSensorType (
	__IDIfcSensorType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcSensorType (__IDIfcSensorType__)
) ;

CREATE TABLE IfcServiceLife (
	__IDIfcServiceLife__ Integer NOT NULL,
	ServiceLifeType text,
	ServiceLifeDuration text,
	PRIMARY KEY IfcServiceLife (__IDIfcServiceLife__)
) ;

CREATE TABLE IfcServiceLifeFactor (
	__IDIfcServiceLifeFactor__ Integer NOT NULL,
	FOREIGN KEY UpperValue (__FKUpperValue__) REFERENCES IfcMeasureValue (__IDIfcMeasureValue__),
	FOREIGN KEY MostUsedValue (__FKMostUsedValue__) REFERENCES IfcMeasureValue (__IDIfcMeasureValue__),
	FOREIGN KEY LowerValue (__FKLowerValue__) REFERENCES IfcMeasureValue (__IDIfcMeasureValue__),
	PredefinedType text,
	PRIMARY KEY IfcServiceLifeFactor (__IDIfcServiceLifeFactor__),
	__FKUpperValue__ Integer,
	__FKMostUsedValue__ Integer,
	__FKLowerValue__ Integer
) ;

CREATE TABLE IfcShapeAspect (
	__IDIfcShapeAspect__ Integer NOT NULL,
	Name text,
	Description text,
	ProductDefinitional text,
	FOREIGN KEY PartOfProductDefinitionShape (__FKPartOfProductDefinitionShape__) REFERENCES IfcProductDefinitionShape (__IDIfcProductDefinitionShape__),
	PRIMARY KEY IfcShapeAspect (__IDIfcShapeAspect__),
	__FKPartOfProductDefinitionShape__ Integer
) ;

CREATE TABLE IfcShapeModel (
	__IDIfcShapeModel__ Integer NOT NULL,
	FOREIGN KEY OfShapeAspect (__FKOfShapeAspect__) REFERENCES IfcShapeAspect (__IDIfcShapeAspect__),
	PRIMARY KEY IfcShapeModel (__IDIfcShapeModel__),
	__FKOfShapeAspect__ Integer
) ;

CREATE TABLE IfcShapeRepresentation (
	__IDIfcShapeRepresentation__ Integer NOT NULL,
	PRIMARY KEY IfcShapeRepresentation (__IDIfcShapeRepresentation__)
) ;

CREATE TABLE IfcShellBasedSurfaceModel (
	__IDIfcShellBasedSurfaceModel__ Integer NOT NULL,
	PRIMARY KEY IfcShellBasedSurfaceModel (__IDIfcShellBasedSurfaceModel__)
) ;

CREATE TABLE IfcSimpleProperty (
	__IDIfcSimpleProperty__ Integer NOT NULL,
	PRIMARY KEY IfcSimpleProperty (__IDIfcSimpleProperty__)
) ;

CREATE TABLE IfcSite (
	__IDIfcSite__ Integer NOT NULL,
	RefElevation text,
	LandTitleNumber text,
	FOREIGN KEY SiteAddress (__FKSiteAddress__) REFERENCES IfcPostalAddress (__IDIfcPostalAddress__),
	PRIMARY KEY IfcSite (__IDIfcSite__),
	__FKSiteAddress__ Integer
) ;

CREATE TABLE IfcSlab (
	__IDIfcSlab__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcSlab (__IDIfcSlab__)
) ;

CREATE TABLE IfcSlabType (
	__IDIfcSlabType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcSlabType (__IDIfcSlabType__)
) ;

CREATE TABLE IfcSlippageConnectionCondition (
	__IDIfcSlippageConnectionCondition__ Integer NOT NULL,
	SlippageX text,
	SlippageY text,
	SlippageZ text,
	PRIMARY KEY IfcSlippageConnectionCondition (__IDIfcSlippageConnectionCondition__)
) ;

CREATE TABLE IfcSolidModel (
	__IDIfcSolidModel__ Integer NOT NULL,
	PRIMARY KEY IfcSolidModel (__IDIfcSolidModel__)
) ;

CREATE TABLE IfcSoundProperties (
	__IDIfcSoundProperties__ Integer NOT NULL,
	IsAttenuating text,
	SoundScale text,
	PRIMARY KEY IfcSoundProperties (__IDIfcSoundProperties__)
) ;

CREATE TABLE IfcSoundValue (
	__IDIfcSoundValue__ Integer NOT NULL,
	FOREIGN KEY SoundLevelSingleValue (__FKSoundLevelSingleValue__) REFERENCES IfcDerivedMeasureValue (__IDIfcDerivedMeasureValue__),
	FOREIGN KEY SoundLevelTimeSeries (__FKSoundLevelTimeSeries__) REFERENCES IfcTimeSeries (__IDIfcTimeSeries__),
	Frequency text,
	PRIMARY KEY IfcSoundValue (__IDIfcSoundValue__),
	__FKSoundLevelSingleValue__ Integer,
	__FKSoundLevelTimeSeries__ Integer
) ;

CREATE TABLE IfcSpace (
	__IDIfcSpace__ Integer NOT NULL,
	InteriorOrExteriorSpace text,
	ElevationWithFlooring text,
	FOREIGN KEY HasCoverings (__FKHasCoverings__) REFERENCES IfcRelCoversSpaces (__IDIfcRelCoversSpaces__),
	FOREIGN KEY BoundedBy (__FKBoundedBy__) REFERENCES IfcRelSpaceBoundary (__IDIfcRelSpaceBoundary__),
	PRIMARY KEY IfcSpace (__IDIfcSpace__),
	__FKHasCoverings__ Integer,
	__FKBoundedBy__ Integer
) ;

CREATE TABLE IfcSpaceHeaterType (
	__IDIfcSpaceHeaterType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcSpaceHeaterType (__IDIfcSpaceHeaterType__)
) ;

CREATE TABLE IfcSpaceProgram (
	__IDIfcSpaceProgram__ Integer NOT NULL,
	SpaceProgramIdentifier text,
	MaxRequiredArea text,
	MinRequiredArea text,
	StandardRequiredArea text,
	FOREIGN KEY HasInteractionReqsFrom (__FKHasInteractionReqsFrom__) REFERENCES IfcRelInteractionRequirements (__IDIfcRelInteractionRequirements__),
	FOREIGN KEY HasInteractionReqsTo (__FKHasInteractionReqsTo__) REFERENCES IfcRelInteractionRequirements (__IDIfcRelInteractionRequirements__),
	FOREIGN KEY RequestedLocation (__FKRequestedLocation__) REFERENCES IfcSpatialStructureElement (__IDIfcSpatialStructureElement__),
	PRIMARY KEY IfcSpaceProgram (__IDIfcSpaceProgram__),
	__FKHasInteractionReqsFrom__ Integer,
	__FKHasInteractionReqsTo__ Integer,
	__FKRequestedLocation__ Integer
) ;

CREATE TABLE IfcSpaceThermalLoadProperties (
	__IDIfcSpaceThermalLoadProperties__ Integer NOT NULL,
	ApplicableValueRatio text,
	ThermalLoadSource text,
	PropertySource text,
	SourceDescription text,
	MaximumValue text,
	MinimumValue text,
	UserDefinedThermalLoadSource text,
	UserDefinedPropertySource text,
	ThermalLoadType text,
	FOREIGN KEY ThermalLoadTimeSeriesValues (__FKThermalLoadTimeSeriesValues__) REFERENCES IfcTimeSeries (__IDIfcTimeSeries__),
	PRIMARY KEY IfcSpaceThermalLoadProperties (__IDIfcSpaceThermalLoadProperties__),
	__FKThermalLoadTimeSeriesValues__ Integer
) ;

CREATE TABLE IfcSpaceType (
	__IDIfcSpaceType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcSpaceType (__IDIfcSpaceType__)
) ;

CREATE TABLE IfcSpatialStructureElement (
	__IDIfcSpatialStructureElement__ Integer NOT NULL,
	LongName text,
	CompositionType text,
	FOREIGN KEY ReferencesElements (__FKReferencesElements__) REFERENCES IfcRelReferencedInSpatialStructure (__IDIfcRelReferencedInSpatialStructure__),
	FOREIGN KEY ServicedBySystems (__FKServicedBySystems__) REFERENCES IfcRelServicesBuildings (__IDIfcRelServicesBuildings__),
	FOREIGN KEY ContainsElements (__FKContainsElements__) REFERENCES IfcRelContainedInSpatialStructure (__IDIfcRelContainedInSpatialStructure__),
	PRIMARY KEY IfcSpatialStructureElement (__IDIfcSpatialStructureElement__),
	__FKReferencesElements__ Integer,
	__FKServicedBySystems__ Integer,
	__FKContainsElements__ Integer
) ;

CREATE TABLE IfcSpatialStructureElementType (
	__IDIfcSpatialStructureElementType__ Integer NOT NULL,
	PRIMARY KEY IfcSpatialStructureElementType (__IDIfcSpatialStructureElementType__)
) ;

CREATE TABLE IfcSphere (
	__IDIfcSphere__ Integer NOT NULL,
	Radius text,
	PRIMARY KEY IfcSphere (__IDIfcSphere__)
) ;

CREATE TABLE IfcStackTerminalType (
	__IDIfcStackTerminalType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcStackTerminalType (__IDIfcStackTerminalType__)
) ;

CREATE TABLE IfcStair (
	__IDIfcStair__ Integer NOT NULL,
	ShapeType text,
	PRIMARY KEY IfcStair (__IDIfcStair__)
) ;

CREATE TABLE IfcStairFlight (
	__IDIfcStairFlight__ Integer NOT NULL,
	NumberOfRiser text,
	NumberOfTreads text,
	RiserHeight text,
	TreadLength text,
	PRIMARY KEY IfcStairFlight (__IDIfcStairFlight__)
) ;

CREATE TABLE IfcStairFlightType (
	__IDIfcStairFlightType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcStairFlightType (__IDIfcStairFlightType__)
) ;

CREATE TABLE IfcStructuralAction (
	__IDIfcStructuralAction__ Integer NOT NULL,
	FOREIGN KEY CausedBy (__FKCausedBy__) REFERENCES IfcStructuralReaction (__IDIfcStructuralReaction__),
	DestabilizingLoad text,
	PRIMARY KEY IfcStructuralAction (__IDIfcStructuralAction__),
	__FKCausedBy__ Integer
) ;

CREATE TABLE IfcStructuralActivity (
	__IDIfcStructuralActivity__ Integer NOT NULL,
	FOREIGN KEY AssignedToStructuralItem (__FKAssignedToStructuralItem__) REFERENCES IfcRelConnectsStructuralActivity (__IDIfcRelConnectsStructuralActivity__),
	FOREIGN KEY AppliedLoad (__FKAppliedLoad__) REFERENCES IfcStructuralLoad (__IDIfcStructuralLoad__),
	GlobalOrLocal text,
	PRIMARY KEY IfcStructuralActivity (__IDIfcStructuralActivity__),
	__FKAssignedToStructuralItem__ Integer,
	__FKAppliedLoad__ Integer
) ;

CREATE TABLE IfcStructuralAnalysisModel (
	__IDIfcStructuralAnalysisModel__ Integer NOT NULL,
	FOREIGN KEY OrientationOf2DPlane (__FKOrientationOf2DPlane__) REFERENCES IfcAxis2Placement3D (__IDIfcAxis2Placement3D__),
	PredefinedType text,
	PRIMARY KEY IfcStructuralAnalysisModel (__IDIfcStructuralAnalysisModel__),
	__FKOrientationOf2DPlane__ Integer
) ;

CREATE TABLE IfcStructuralConnection (
	__IDIfcStructuralConnection__ Integer NOT NULL,
	FOREIGN KEY ConnectsStructuralMembers (__FKConnectsStructuralMembers__) REFERENCES IfcRelConnectsStructuralMember (__IDIfcRelConnectsStructuralMember__),
	FOREIGN KEY AppliedCondition (__FKAppliedCondition__) REFERENCES IfcBoundaryCondition (__IDIfcBoundaryCondition__),
	PRIMARY KEY IfcStructuralConnection (__IDIfcStructuralConnection__),
	__FKConnectsStructuralMembers__ Integer,
	__FKAppliedCondition__ Integer
) ;

CREATE TABLE IfcStructuralConnectionCondition (
	__IDIfcStructuralConnectionCondition__ Integer NOT NULL,
	Name text,
	PRIMARY KEY IfcStructuralConnectionCondition (__IDIfcStructuralConnectionCondition__)
) ;

CREATE TABLE IfcStructuralCurveConnection (
	__IDIfcStructuralCurveConnection__ Integer NOT NULL,
	PRIMARY KEY IfcStructuralCurveConnection (__IDIfcStructuralCurveConnection__)
) ;

CREATE TABLE IfcStructuralCurveMember (
	__IDIfcStructuralCurveMember__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcStructuralCurveMember (__IDIfcStructuralCurveMember__)
) ;

CREATE TABLE IfcStructuralCurveMemberVarying (
	__IDIfcStructuralCurveMemberVarying__ Integer NOT NULL,
	PRIMARY KEY IfcStructuralCurveMemberVarying (__IDIfcStructuralCurveMemberVarying__)
) ;

CREATE TABLE IfcStructuralItem (
	__IDIfcStructuralItem__ Integer NOT NULL,
	PRIMARY KEY IfcStructuralItem (__IDIfcStructuralItem__)
) ;

CREATE TABLE IfcStructuralLinearAction (
	__IDIfcStructuralLinearAction__ Integer NOT NULL,
	ProjectedOrTrue text,
	PRIMARY KEY IfcStructuralLinearAction (__IDIfcStructuralLinearAction__)
) ;

CREATE TABLE IfcStructuralLinearActionVarying (
	__IDIfcStructuralLinearActionVarying__ Integer NOT NULL,
	FOREIGN KEY VaryingAppliedLoadLocation (__FKVaryingAppliedLoadLocation__) REFERENCES IfcShapeAspect (__IDIfcShapeAspect__),
	PRIMARY KEY IfcStructuralLinearActionVarying (__IDIfcStructuralLinearActionVarying__),
	__FKVaryingAppliedLoadLocation__ Integer
) ;

CREATE TABLE IfcStructuralLoad (
	__IDIfcStructuralLoad__ Integer NOT NULL,
	Name text,
	PRIMARY KEY IfcStructuralLoad (__IDIfcStructuralLoad__)
) ;

CREATE TABLE IfcStructuralLoadGroup (
	__IDIfcStructuralLoadGroup__ Integer NOT NULL,
	PredefinedType text,
	ActionType text,
	ActionSource text,
	Coefficient text,
	Purpose text,
	FOREIGN KEY SourceOfResultGroup (__FKSourceOfResultGroup__) REFERENCES IfcStructuralResultGroup (__IDIfcStructuralResultGroup__),
	FOREIGN KEY LoadGroupFor (__FKLoadGroupFor__) REFERENCES IfcStructuralAnalysisModel (__IDIfcStructuralAnalysisModel__),
	PRIMARY KEY IfcStructuralLoadGroup (__IDIfcStructuralLoadGroup__),
	__FKSourceOfResultGroup__ Integer,
	__FKLoadGroupFor__ Integer
) ;

CREATE TABLE IfcStructuralLoadLinearForce (
	__IDIfcStructuralLoadLinearForce__ Integer NOT NULL,
	LinearForceX text,
	LinearForceY text,
	LinearForceZ text,
	LinearMomentX text,
	LinearMomentY text,
	LinearMomentZ text,
	PRIMARY KEY IfcStructuralLoadLinearForce (__IDIfcStructuralLoadLinearForce__)
) ;

CREATE TABLE IfcStructuralLoadPlanarForce (
	__IDIfcStructuralLoadPlanarForce__ Integer NOT NULL,
	PlanarForceX text,
	PlanarForceY text,
	PlanarForceZ text,
	PRIMARY KEY IfcStructuralLoadPlanarForce (__IDIfcStructuralLoadPlanarForce__)
) ;

CREATE TABLE IfcStructuralLoadSingleDisplacement (
	__IDIfcStructuralLoadSingleDisplacement__ Integer NOT NULL,
	DisplacementX text,
	DisplacementY text,
	DisplacementZ text,
	RotationalDisplacementRX text,
	RotationalDisplacementRY text,
	RotationalDisplacementRZ text,
	PRIMARY KEY IfcStructuralLoadSingleDisplacement (__IDIfcStructuralLoadSingleDisplacement__)
) ;

CREATE TABLE IfcStructuralLoadSingleDisplacementDistortion (
	__IDIfcStructuralLoadSingleDisplacementDistortion__ Integer NOT NULL,
	Distortion text,
	PRIMARY KEY IfcStructuralLoadSingleDisplacementDistortion (__IDIfcStructuralLoadSingleDisplacementDistortion__)
) ;

CREATE TABLE IfcStructuralLoadSingleForce (
	__IDIfcStructuralLoadSingleForce__ Integer NOT NULL,
	ForceX text,
	ForceY text,
	ForceZ text,
	MomentX text,
	MomentY text,
	MomentZ text,
	PRIMARY KEY IfcStructuralLoadSingleForce (__IDIfcStructuralLoadSingleForce__)
) ;

CREATE TABLE IfcStructuralLoadSingleForceWarping (
	__IDIfcStructuralLoadSingleForceWarping__ Integer NOT NULL,
	WarpingMoment text,
	PRIMARY KEY IfcStructuralLoadSingleForceWarping (__IDIfcStructuralLoadSingleForceWarping__)
) ;

CREATE TABLE IfcStructuralLoadStatic (
	__IDIfcStructuralLoadStatic__ Integer NOT NULL,
	PRIMARY KEY IfcStructuralLoadStatic (__IDIfcStructuralLoadStatic__)
) ;

CREATE TABLE IfcStructuralLoadTemperature (
	__IDIfcStructuralLoadTemperature__ Integer NOT NULL,
	DeltaT_Constant text,
	DeltaT_Y text,
	DeltaT_Z text,
	PRIMARY KEY IfcStructuralLoadTemperature (__IDIfcStructuralLoadTemperature__)
) ;

CREATE TABLE IfcStructuralMember (
	__IDIfcStructuralMember__ Integer NOT NULL,
	FOREIGN KEY ReferencesElement (__FKReferencesElement__) REFERENCES IfcRelConnectsStructuralElement (__IDIfcRelConnectsStructuralElement__),
	FOREIGN KEY ConnectedBy (__FKConnectedBy__) REFERENCES IfcRelConnectsStructuralMember (__IDIfcRelConnectsStructuralMember__),
	PRIMARY KEY IfcStructuralMember (__IDIfcStructuralMember__),
	__FKReferencesElement__ Integer,
	__FKConnectedBy__ Integer
) ;

CREATE TABLE IfcStructuralPlanarAction (
	__IDIfcStructuralPlanarAction__ Integer NOT NULL,
	ProjectedOrTrue text,
	PRIMARY KEY IfcStructuralPlanarAction (__IDIfcStructuralPlanarAction__)
) ;

CREATE TABLE IfcStructuralPlanarActionVarying (
	__IDIfcStructuralPlanarActionVarying__ Integer NOT NULL,
	FOREIGN KEY VaryingAppliedLoadLocation (__FKVaryingAppliedLoadLocation__) REFERENCES IfcShapeAspect (__IDIfcShapeAspect__),
	PRIMARY KEY IfcStructuralPlanarActionVarying (__IDIfcStructuralPlanarActionVarying__),
	__FKVaryingAppliedLoadLocation__ Integer
) ;

CREATE TABLE IfcStructuralPointAction (
	__IDIfcStructuralPointAction__ Integer NOT NULL,
	PRIMARY KEY IfcStructuralPointAction (__IDIfcStructuralPointAction__)
) ;

CREATE TABLE IfcStructuralPointConnection (
	__IDIfcStructuralPointConnection__ Integer NOT NULL,
	PRIMARY KEY IfcStructuralPointConnection (__IDIfcStructuralPointConnection__)
) ;

CREATE TABLE IfcStructuralPointReaction (
	__IDIfcStructuralPointReaction__ Integer NOT NULL,
	PRIMARY KEY IfcStructuralPointReaction (__IDIfcStructuralPointReaction__)
) ;

CREATE TABLE IfcStructuralProfileProperties (
	__IDIfcStructuralProfileProperties__ Integer NOT NULL,
	TorsionalConstantX text,
	MomentOfInertiaYZ text,
	MomentOfInertiaY text,
	MomentOfInertiaZ text,
	WarpingConstant text,
	ShearCentreZ text,
	ShearCentreY text,
	ShearDeformationAreaZ text,
	ShearDeformationAreaY text,
	MaximumSectionModulusY text,
	MinimumSectionModulusY text,
	MaximumSectionModulusZ text,
	MinimumSectionModulusZ text,
	TorsionalSectionModulus text,
	CentreOfGravityInX text,
	CentreOfGravityInY text,
	PRIMARY KEY IfcStructuralProfileProperties (__IDIfcStructuralProfileProperties__)
) ;

CREATE TABLE IfcStructuralReaction (
	__IDIfcStructuralReaction__ Integer NOT NULL,
	FOREIGN KEY Causes (__FKCauses__) REFERENCES IfcStructuralAction (__IDIfcStructuralAction__),
	PRIMARY KEY IfcStructuralReaction (__IDIfcStructuralReaction__),
	__FKCauses__ Integer
) ;

CREATE TABLE IfcStructuralResultGroup (
	__IDIfcStructuralResultGroup__ Integer NOT NULL,
	TheoryType text,
	IsLinear text,
	FOREIGN KEY ResultGroupFor (__FKResultGroupFor__) REFERENCES IfcStructuralAnalysisModel (__IDIfcStructuralAnalysisModel__),
	FOREIGN KEY ResultForLoadGroup (__FKResultForLoadGroup__) REFERENCES IfcStructuralLoadGroup (__IDIfcStructuralLoadGroup__),
	PRIMARY KEY IfcStructuralResultGroup (__IDIfcStructuralResultGroup__),
	__FKResultGroupFor__ Integer,
	__FKResultForLoadGroup__ Integer
) ;

CREATE TABLE IfcStructuralSteelProfileProperties (
	__IDIfcStructuralSteelProfileProperties__ Integer NOT NULL,
	ShearAreaZ text,
	ShearAreaY text,
	PlasticShapeFactorY text,
	PlasticShapeFactorZ text,
	PRIMARY KEY IfcStructuralSteelProfileProperties (__IDIfcStructuralSteelProfileProperties__)
) ;

CREATE TABLE IfcStructuralSurfaceConnection (
	__IDIfcStructuralSurfaceConnection__ Integer NOT NULL,
	PRIMARY KEY IfcStructuralSurfaceConnection (__IDIfcStructuralSurfaceConnection__)
) ;

CREATE TABLE IfcStructuralSurfaceMember (
	__IDIfcStructuralSurfaceMember__ Integer NOT NULL,
	PredefinedType text,
	Thickness text,
	PRIMARY KEY IfcStructuralSurfaceMember (__IDIfcStructuralSurfaceMember__)
) ;

CREATE TABLE IfcStructuralSurfaceMemberVarying (
	__IDIfcStructuralSurfaceMemberVarying__ Integer NOT NULL,
	FOREIGN KEY VaryingThicknessLocation (__FKVaryingThicknessLocation__) REFERENCES IfcShapeAspect (__IDIfcShapeAspect__),
	PRIMARY KEY IfcStructuralSurfaceMemberVarying (__IDIfcStructuralSurfaceMemberVarying__),
	__FKVaryingThicknessLocation__ Integer
) ;

CREATE TABLE IfcStructuredDimensionCallout (
	__IDIfcStructuredDimensionCallout__ Integer NOT NULL,
	PRIMARY KEY IfcStructuredDimensionCallout (__IDIfcStructuredDimensionCallout__)
) ;

CREATE TABLE IfcStyleModel (
	__IDIfcStyleModel__ Integer NOT NULL,
	PRIMARY KEY IfcStyleModel (__IDIfcStyleModel__)
) ;

CREATE TABLE IfcStyledItem (
	__IDIfcStyledItem__ Integer NOT NULL,
	FOREIGN KEY Item (__FKItem__) REFERENCES IfcRepresentationItem (__IDIfcRepresentationItem__),
	Name text,
	PRIMARY KEY IfcStyledItem (__IDIfcStyledItem__),
	__FKItem__ Integer
) ;

CREATE TABLE IfcStyledRepresentation (
	__IDIfcStyledRepresentation__ Integer NOT NULL,
	PRIMARY KEY IfcStyledRepresentation (__IDIfcStyledRepresentation__)
) ;

CREATE TABLE IfcSubContractResource (
	__IDIfcSubContractResource__ Integer NOT NULL,
	FOREIGN KEY SubContractor (__FKSubContractor__) REFERENCES IfcActorSelect (__IDIfcActorSelect__),
	JobDescription text,
	PRIMARY KEY IfcSubContractResource (__IDIfcSubContractResource__),
	__FKSubContractor__ Integer
) ;

CREATE TABLE IfcSubedge (
	__IDIfcSubedge__ Integer NOT NULL,
	FOREIGN KEY ParentEdge (__FKParentEdge__) REFERENCES IfcEdge (__IDIfcEdge__),
	PRIMARY KEY IfcSubedge (__IDIfcSubedge__),
	__FKParentEdge__ Integer
) ;

CREATE TABLE IfcSurface (
	__IDIfcSurface__ Integer NOT NULL,
	PRIMARY KEY IfcSurface (__IDIfcSurface__)
) ;

CREATE TABLE IfcSurfaceCurveSweptAreaSolid (
	__IDIfcSurfaceCurveSweptAreaSolid__ Integer NOT NULL,
	StartParam text,
	EndParam text,
	FOREIGN KEY Directrix (__FKDirectrix__) REFERENCES IfcCurve (__IDIfcCurve__),
	FOREIGN KEY ReferenceSurface (__FKReferenceSurface__) REFERENCES IfcSurface (__IDIfcSurface__),
	PRIMARY KEY IfcSurfaceCurveSweptAreaSolid (__IDIfcSurfaceCurveSweptAreaSolid__),
	__FKDirectrix__ Integer,
	__FKReferenceSurface__ Integer
) ;

CREATE TABLE IfcSurfaceOfLinearExtrusion (
	__IDIfcSurfaceOfLinearExtrusion__ Integer NOT NULL,
	FOREIGN KEY ExtrudedDirection (__FKExtrudedDirection__) REFERENCES IfcDirection (__IDIfcDirection__),
	Depth text,
	PRIMARY KEY IfcSurfaceOfLinearExtrusion (__IDIfcSurfaceOfLinearExtrusion__),
	__FKExtrudedDirection__ Integer
) ;

CREATE TABLE IfcSurfaceOfRevolution (
	__IDIfcSurfaceOfRevolution__ Integer NOT NULL,
	FOREIGN KEY AxisPosition (__FKAxisPosition__) REFERENCES IfcAxis1Placement (__IDIfcAxis1Placement__),
	PRIMARY KEY IfcSurfaceOfRevolution (__IDIfcSurfaceOfRevolution__),
	__FKAxisPosition__ Integer
) ;

CREATE TABLE IfcSurfaceStyle (
	__IDIfcSurfaceStyle__ Integer NOT NULL,
	Side text,
	PRIMARY KEY IfcSurfaceStyle (__IDIfcSurfaceStyle__)
) ;

CREATE TABLE IfcSurfaceStyleLighting (
	__IDIfcSurfaceStyleLighting__ Integer NOT NULL,
	FOREIGN KEY DiffuseTransmissionColour (__FKDiffuseTransmissionColour__) REFERENCES IfcColourRgb (__IDIfcColourRgb__),
	FOREIGN KEY DiffuseReflectionColour (__FKDiffuseReflectionColour__) REFERENCES IfcColourRgb (__IDIfcColourRgb__),
	FOREIGN KEY TransmissionColour (__FKTransmissionColour__) REFERENCES IfcColourRgb (__IDIfcColourRgb__),
	FOREIGN KEY ReflectanceColour (__FKReflectanceColour__) REFERENCES IfcColourRgb (__IDIfcColourRgb__),
	PRIMARY KEY IfcSurfaceStyleLighting (__IDIfcSurfaceStyleLighting__),
	__FKDiffuseTransmissionColour__ Integer,
	__FKDiffuseReflectionColour__ Integer,
	__FKTransmissionColour__ Integer,
	__FKReflectanceColour__ Integer
) ;

CREATE TABLE IfcSurfaceStyleRefraction (
	__IDIfcSurfaceStyleRefraction__ Integer NOT NULL,
	RefractionIndex text,
	DispersionFactor text,
	PRIMARY KEY IfcSurfaceStyleRefraction (__IDIfcSurfaceStyleRefraction__)
) ;

CREATE TABLE IfcSurfaceStyleRendering (
	__IDIfcSurfaceStyleRendering__ Integer NOT NULL,
	Transparency text,
	ReflectanceMethod text,
	FOREIGN KEY DiffuseColour (__FKDiffuseColour__) REFERENCES IfcColourOrFactor (__IDIfcColourOrFactor__),
	FOREIGN KEY TransmissionColour (__FKTransmissionColour__) REFERENCES IfcColourOrFactor (__IDIfcColourOrFactor__),
	FOREIGN KEY DiffuseTransmissionColour (__FKDiffuseTransmissionColour__) REFERENCES IfcColourOrFactor (__IDIfcColourOrFactor__),
	FOREIGN KEY ReflectionColour (__FKReflectionColour__) REFERENCES IfcColourOrFactor (__IDIfcColourOrFactor__),
	FOREIGN KEY SpecularColour (__FKSpecularColour__) REFERENCES IfcColourOrFactor (__IDIfcColourOrFactor__),
	FOREIGN KEY SpecularHighlight (__FKSpecularHighlight__) REFERENCES IfcSpecularHighlightSelect (__IDIfcSpecularHighlightSelect__),
	PRIMARY KEY IfcSurfaceStyleRendering (__IDIfcSurfaceStyleRendering__),
	__FKDiffuseColour__ Integer,
	__FKTransmissionColour__ Integer,
	__FKDiffuseTransmissionColour__ Integer,
	__FKReflectionColour__ Integer,
	__FKSpecularColour__ Integer,
	__FKSpecularHighlight__ Integer
) ;

CREATE TABLE IfcSurfaceStyleShading (
	__IDIfcSurfaceStyleShading__ Integer NOT NULL,
	FOREIGN KEY SurfaceColour (__FKSurfaceColour__) REFERENCES IfcColourRgb (__IDIfcColourRgb__),
	PRIMARY KEY IfcSurfaceStyleShading (__IDIfcSurfaceStyleShading__),
	__FKSurfaceColour__ Integer
) ;

CREATE TABLE IfcSurfaceStyleWithTextures (
	__IDIfcSurfaceStyleWithTextures__ Integer NOT NULL,
	PRIMARY KEY IfcSurfaceStyleWithTextures (__IDIfcSurfaceStyleWithTextures__)
) ;

CREATE TABLE IfcSurfaceTexture (
	__IDIfcSurfaceTexture__ Integer NOT NULL,
	RepeatS text,
	RepeatT text,
	TextureType text,
	FOREIGN KEY TextureTransform (__FKTextureTransform__) REFERENCES IfcCartesianTransformationOperator2D (__IDIfcCartesianTransformationOperator2D__),
	PRIMARY KEY IfcSurfaceTexture (__IDIfcSurfaceTexture__),
	__FKTextureTransform__ Integer
) ;

CREATE TABLE IfcSweptAreaSolid (
	__IDIfcSweptAreaSolid__ Integer NOT NULL,
	FOREIGN KEY SweptArea (__FKSweptArea__) REFERENCES IfcProfileDef (__IDIfcProfileDef__),
	FOREIGN KEY Position (__FKPosition__) REFERENCES IfcAxis2Placement3D (__IDIfcAxis2Placement3D__),
	PRIMARY KEY IfcSweptAreaSolid (__IDIfcSweptAreaSolid__),
	__FKSweptArea__ Integer,
	__FKPosition__ Integer
) ;

CREATE TABLE IfcSweptDiskSolid (
	__IDIfcSweptDiskSolid__ Integer NOT NULL,
	Radius text,
	InnerRadius text,
	StartParam text,
	EndParam text,
	FOREIGN KEY Directrix (__FKDirectrix__) REFERENCES IfcCurve (__IDIfcCurve__),
	PRIMARY KEY IfcSweptDiskSolid (__IDIfcSweptDiskSolid__),
	__FKDirectrix__ Integer
) ;

CREATE TABLE IfcSweptSurface (
	__IDIfcSweptSurface__ Integer NOT NULL,
	FOREIGN KEY SweptCurve (__FKSweptCurve__) REFERENCES IfcProfileDef (__IDIfcProfileDef__),
	FOREIGN KEY Position (__FKPosition__) REFERENCES IfcAxis2Placement3D (__IDIfcAxis2Placement3D__),
	PRIMARY KEY IfcSweptSurface (__IDIfcSweptSurface__),
	__FKSweptCurve__ Integer,
	__FKPosition__ Integer
) ;

CREATE TABLE IfcSwitchingDeviceType (
	__IDIfcSwitchingDeviceType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcSwitchingDeviceType (__IDIfcSwitchingDeviceType__)
) ;

CREATE TABLE IfcSymbolStyle (
	__IDIfcSymbolStyle__ Integer NOT NULL,
	FOREIGN KEY StyleOfSymbol (__FKStyleOfSymbol__) REFERENCES IfcSymbolStyleSelect (__IDIfcSymbolStyleSelect__),
	PRIMARY KEY IfcSymbolStyle (__IDIfcSymbolStyle__),
	__FKStyleOfSymbol__ Integer
) ;

CREATE TABLE IfcSystem (
	__IDIfcSystem__ Integer NOT NULL,
	FOREIGN KEY ServicesBuildings (__FKServicesBuildings__) REFERENCES IfcRelServicesBuildings (__IDIfcRelServicesBuildings__),
	PRIMARY KEY IfcSystem (__IDIfcSystem__),
	__FKServicesBuildings__ Integer
) ;

CREATE TABLE IfcSystemFurnitureElementType (
	__IDIfcSystemFurnitureElementType__ Integer NOT NULL,
	PRIMARY KEY IfcSystemFurnitureElementType (__IDIfcSystemFurnitureElementType__)
) ;

CREATE TABLE IfcTShapeProfileDef (
	__IDIfcTShapeProfileDef__ Integer NOT NULL,
	Depth text,
	FlangeWidth text,
	WebThickness text,
	FlangeThickness text,
	FilletRadius text,
	FlangeEdgeRadius text,
	WebEdgeRadius text,
	WebSlope text,
	FlangeSlope text,
	CentreOfGravityInY text,
	PRIMARY KEY IfcTShapeProfileDef (__IDIfcTShapeProfileDef__)
) ;

CREATE TABLE IfcTable (
	__IDIfcTable__ Integer NOT NULL,
	Name text,
	PRIMARY KEY IfcTable (__IDIfcTable__)
) ;

CREATE TABLE IfcTableRow (
	__IDIfcTableRow__ Integer NOT NULL,
	FOREIGN KEY OfTable (__FKOfTable__) REFERENCES IfcTable (__IDIfcTable__),
	IsHeading text,
	PRIMARY KEY IfcTableRow (__IDIfcTableRow__),
	__FKOfTable__ Integer
) ;

CREATE TABLE IfcTankType (
	__IDIfcTankType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcTankType (__IDIfcTankType__)
) ;

CREATE TABLE IfcTask (
	__IDIfcTask__ Integer NOT NULL,
	TaskId text,
	Status text,
	WorkMethod text,
	IsMilestone text,
	Priority text,
	PRIMARY KEY IfcTask (__IDIfcTask__)
) ;

CREATE TABLE IfcTelecomAddress (
	__IDIfcTelecomAddress__ Integer NOT NULL,
	PagerNumber text,
	WWWHomePageURL text,
	PRIMARY KEY IfcTelecomAddress (__IDIfcTelecomAddress__)
) ;

CREATE TABLE IfcTendon (
	__IDIfcTendon__ Integer NOT NULL,
	PredefinedType text,
	NominalDiameter text,
	CrossSectionArea text,
	TensionForce text,
	PreStress text,
	FrictionCoefficient text,
	AnchorageSlip text,
	MinCurvatureRadius text,
	PRIMARY KEY IfcTendon (__IDIfcTendon__)
) ;

CREATE TABLE IfcTendonAnchor (
	__IDIfcTendonAnchor__ Integer NOT NULL,
	PRIMARY KEY IfcTendonAnchor (__IDIfcTendonAnchor__)
) ;

CREATE TABLE IfcTerminatorSymbol (
	__IDIfcTerminatorSymbol__ Integer NOT NULL,
	FOREIGN KEY AnnotatedCurve (__FKAnnotatedCurve__) REFERENCES IfcAnnotationCurveOccurrence (__IDIfcAnnotationCurveOccurrence__),
	PRIMARY KEY IfcTerminatorSymbol (__IDIfcTerminatorSymbol__),
	__FKAnnotatedCurve__ Integer
) ;

CREATE TABLE IfcTextLiteral (
	__IDIfcTextLiteral__ Integer NOT NULL,
	Literal text,
	Path text,
	FOREIGN KEY Placement (__FKPlacement__) REFERENCES IfcAxis2Placement (__IDIfcAxis2Placement__),
	PRIMARY KEY IfcTextLiteral (__IDIfcTextLiteral__),
	__FKPlacement__ Integer
) ;

CREATE TABLE IfcTextLiteralWithExtent (
	__IDIfcTextLiteralWithExtent__ Integer NOT NULL,
	FOREIGN KEY Extent (__FKExtent__) REFERENCES IfcPlanarExtent (__IDIfcPlanarExtent__),
	BoxAlignment text,
	PRIMARY KEY IfcTextLiteralWithExtent (__IDIfcTextLiteralWithExtent__),
	__FKExtent__ Integer
) ;

CREATE TABLE IfcTextStyle (
	__IDIfcTextStyle__ Integer NOT NULL,
	FOREIGN KEY TextCharacterAppearance (__FKTextCharacterAppearance__) REFERENCES IfcCharacterStyleSelect (__IDIfcCharacterStyleSelect__),
	FOREIGN KEY TextStyle (__FKTextStyle__) REFERENCES IfcTextStyleSelect (__IDIfcTextStyleSelect__),
	FOREIGN KEY TextFontStyle (__FKTextFontStyle__) REFERENCES IfcTextFontSelect (__IDIfcTextFontSelect__),
	PRIMARY KEY IfcTextStyle (__IDIfcTextStyle__),
	__FKTextCharacterAppearance__ Integer,
	__FKTextStyle__ Integer,
	__FKTextFontStyle__ Integer
) ;

CREATE TABLE IfcTextStyleFontModel (
	__IDIfcTextStyleFontModel__ Integer NOT NULL,
	FontStyle text,
	FontVariant text,
	FontWeight text,
	FOREIGN KEY FontSize (__FKFontSize__) REFERENCES IfcSizeSelect (__IDIfcSizeSelect__),
	PRIMARY KEY IfcTextStyleFontModel (__IDIfcTextStyleFontModel__),
	__FKFontSize__ Integer
) ;

CREATE TABLE IfcTextStyleForDefinedFont (
	__IDIfcTextStyleForDefinedFont__ Integer NOT NULL,
	FOREIGN KEY Colour (__FKColour__) REFERENCES IfcColour (__IDIfcColour__),
	FOREIGN KEY BackgroundColour (__FKBackgroundColour__) REFERENCES IfcColour (__IDIfcColour__),
	PRIMARY KEY IfcTextStyleForDefinedFont (__IDIfcTextStyleForDefinedFont__),
	__FKColour__ Integer,
	__FKBackgroundColour__ Integer
) ;

CREATE TABLE IfcTextStyleTextModel (
	__IDIfcTextStyleTextModel__ Integer NOT NULL,
	TextAlign text,
	TextDecoration text,
	TextTransform text,
	FOREIGN KEY TextIndent (__FKTextIndent__) REFERENCES IfcSizeSelect (__IDIfcSizeSelect__),
	FOREIGN KEY LetterSpacing (__FKLetterSpacing__) REFERENCES IfcSizeSelect (__IDIfcSizeSelect__),
	FOREIGN KEY WordSpacing (__FKWordSpacing__) REFERENCES IfcSizeSelect (__IDIfcSizeSelect__),
	FOREIGN KEY LineHeight (__FKLineHeight__) REFERENCES IfcSizeSelect (__IDIfcSizeSelect__),
	PRIMARY KEY IfcTextStyleTextModel (__IDIfcTextStyleTextModel__),
	__FKTextIndent__ Integer,
	__FKLetterSpacing__ Integer,
	__FKWordSpacing__ Integer,
	__FKLineHeight__ Integer
) ;

CREATE TABLE IfcTextStyleWithBoxCharacteristics (
	__IDIfcTextStyleWithBoxCharacteristics__ Integer NOT NULL,
	BoxHeight text,
	BoxWidth text,
	BoxSlantAngle text,
	BoxRotateAngle text,
	FOREIGN KEY CharacterSpacing (__FKCharacterSpacing__) REFERENCES IfcSizeSelect (__IDIfcSizeSelect__),
	PRIMARY KEY IfcTextStyleWithBoxCharacteristics (__IDIfcTextStyleWithBoxCharacteristics__),
	__FKCharacterSpacing__ Integer
) ;

CREATE TABLE IfcTextureCoordinate (
	__IDIfcTextureCoordinate__ Integer NOT NULL,
	FOREIGN KEY AnnotatedSurface (__FKAnnotatedSurface__) REFERENCES IfcAnnotationSurface (__IDIfcAnnotationSurface__),
	PRIMARY KEY IfcTextureCoordinate (__IDIfcTextureCoordinate__),
	__FKAnnotatedSurface__ Integer
) ;

CREATE TABLE IfcTextureCoordinateGenerator (
	__IDIfcTextureCoordinateGenerator__ Integer NOT NULL,
	Mode text,
	PRIMARY KEY IfcTextureCoordinateGenerator (__IDIfcTextureCoordinateGenerator__)
) ;

CREATE TABLE IfcTextureMap (
	__IDIfcTextureMap__ Integer NOT NULL,
	PRIMARY KEY IfcTextureMap (__IDIfcTextureMap__)
) ;

CREATE TABLE IfcTextureVertex (
	__IDIfcTextureVertex__ Integer NOT NULL,
	PRIMARY KEY IfcTextureVertex (__IDIfcTextureVertex__)
) ;

CREATE TABLE IfcThermalMaterialProperties (
	__IDIfcThermalMaterialProperties__ Integer NOT NULL,
	SpecificHeatCapacity text,
	BoilingPoint text,
	FreezingPoint text,
	ThermalConductivity text,
	PRIMARY KEY IfcThermalMaterialProperties (__IDIfcThermalMaterialProperties__)
) ;

CREATE TABLE IfcTimeSeries (
	__IDIfcTimeSeries__ Integer NOT NULL,
	Name text,
	Description text,
	TimeSeriesDataType text,
	DataOrigin text,
	UserDefinedDataOrigin text,
	FOREIGN KEY DocumentedBy (__FKDocumentedBy__) REFERENCES IfcTimeSeriesReferenceRelationship (__IDIfcTimeSeriesReferenceRelationship__),
	FOREIGN KEY StartTime (__FKStartTime__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	FOREIGN KEY EndTime (__FKEndTime__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	FOREIGN KEY Unit (__FKUnit__) REFERENCES IfcUnit (__IDIfcUnit__),
	PRIMARY KEY IfcTimeSeries (__IDIfcTimeSeries__),
	__FKDocumentedBy__ Integer,
	__FKStartTime__ Integer,
	__FKEndTime__ Integer,
	__FKUnit__ Integer
) ;

CREATE TABLE IfcTimeSeriesReferenceRelationship (
	__IDIfcTimeSeriesReferenceRelationship__ Integer NOT NULL,
	FOREIGN KEY ReferencedTimeSeries (__FKReferencedTimeSeries__) REFERENCES IfcTimeSeries (__IDIfcTimeSeries__),
	PRIMARY KEY IfcTimeSeriesReferenceRelationship (__IDIfcTimeSeriesReferenceRelationship__),
	__FKReferencedTimeSeries__ Integer
) ;

CREATE TABLE IfcTimeSeriesSchedule (
	__IDIfcTimeSeriesSchedule__ Integer NOT NULL,
	FOREIGN KEY TimeSeries (__FKTimeSeries__) REFERENCES IfcTimeSeries (__IDIfcTimeSeries__),
	TimeSeriesScheduleType text,
	PRIMARY KEY IfcTimeSeriesSchedule (__IDIfcTimeSeriesSchedule__),
	__FKTimeSeries__ Integer
) ;

CREATE TABLE IfcTimeSeriesValue (
	__IDIfcTimeSeriesValue__ Integer NOT NULL,
	PRIMARY KEY IfcTimeSeriesValue (__IDIfcTimeSeriesValue__)
) ;

CREATE TABLE IfcTopologicalRepresentationItem (
	__IDIfcTopologicalRepresentationItem__ Integer NOT NULL,
	PRIMARY KEY IfcTopologicalRepresentationItem (__IDIfcTopologicalRepresentationItem__)
) ;

CREATE TABLE IfcTopologyRepresentation (
	__IDIfcTopologyRepresentation__ Integer NOT NULL,
	PRIMARY KEY IfcTopologyRepresentation (__IDIfcTopologyRepresentation__)
) ;

CREATE TABLE IfcTransformerType (
	__IDIfcTransformerType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcTransformerType (__IDIfcTransformerType__)
) ;

CREATE TABLE IfcTransportElement (
	__IDIfcTransportElement__ Integer NOT NULL,
	OperationType text,
	CapacityByWeight text,
	CapacityByNumber text,
	PRIMARY KEY IfcTransportElement (__IDIfcTransportElement__)
) ;

CREATE TABLE IfcTransportElementType (
	__IDIfcTransportElementType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcTransportElementType (__IDIfcTransportElementType__)
) ;

CREATE TABLE IfcTrapeziumProfileDef (
	__IDIfcTrapeziumProfileDef__ Integer NOT NULL,
	BottomXDim text,
	TopXDim text,
	YDim text,
	TopXOffset text,
	PRIMARY KEY IfcTrapeziumProfileDef (__IDIfcTrapeziumProfileDef__)
) ;

CREATE TABLE IfcTrimmedCurve (
	__IDIfcTrimmedCurve__ Integer NOT NULL,
	SenseAgreement text,
	MasterRepresentation text,
	FOREIGN KEY BasisCurve (__FKBasisCurve__) REFERENCES IfcCurve (__IDIfcCurve__),
	PRIMARY KEY IfcTrimmedCurve (__IDIfcTrimmedCurve__),
	__FKBasisCurve__ Integer
) ;

CREATE TABLE IfcTubeBundleType (
	__IDIfcTubeBundleType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcTubeBundleType (__IDIfcTubeBundleType__)
) ;

CREATE TABLE IfcTwoDirectionRepeatFactor (
	__IDIfcTwoDirectionRepeatFactor__ Integer NOT NULL,
	FOREIGN KEY SecondRepeatFactor (__FKSecondRepeatFactor__) REFERENCES IfcVector (__IDIfcVector__),
	PRIMARY KEY IfcTwoDirectionRepeatFactor (__IDIfcTwoDirectionRepeatFactor__),
	__FKSecondRepeatFactor__ Integer
) ;

CREATE TABLE IfcTypeObject (
	__IDIfcTypeObject__ Integer NOT NULL,
	FOREIGN KEY ObjectTypeOf (__FKObjectTypeOf__) REFERENCES IfcRelDefinesByType (__IDIfcRelDefinesByType__),
	ApplicableOccurrence text,
	PRIMARY KEY IfcTypeObject (__IDIfcTypeObject__),
	__FKObjectTypeOf__ Integer
) ;

CREATE TABLE IfcTypeProduct (
	__IDIfcTypeProduct__ Integer NOT NULL,
	Tag text,
	PRIMARY KEY IfcTypeProduct (__IDIfcTypeProduct__)
) ;

CREATE TABLE IfcUShapeProfileDef (
	__IDIfcUShapeProfileDef__ Integer NOT NULL,
	Depth text,
	FlangeWidth text,
	WebThickness text,
	FlangeThickness text,
	FilletRadius text,
	EdgeRadius text,
	FlangeSlope text,
	CentreOfGravityInX text,
	PRIMARY KEY IfcUShapeProfileDef (__IDIfcUShapeProfileDef__)
) ;

CREATE TABLE IfcUnitAssignment (
	__IDIfcUnitAssignment__ Integer NOT NULL,
	PRIMARY KEY IfcUnitAssignment (__IDIfcUnitAssignment__)
) ;

CREATE TABLE IfcUnitaryEquipmentType (
	__IDIfcUnitaryEquipmentType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcUnitaryEquipmentType (__IDIfcUnitaryEquipmentType__)
) ;

CREATE TABLE IfcValveType (
	__IDIfcValveType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcValveType (__IDIfcValveType__)
) ;

CREATE TABLE IfcVector (
	__IDIfcVector__ Integer NOT NULL,
	FOREIGN KEY Orientation (__FKOrientation__) REFERENCES IfcDirection (__IDIfcDirection__),
	Magnitude text,
	PRIMARY KEY IfcVector (__IDIfcVector__),
	__FKOrientation__ Integer
) ;

CREATE TABLE IfcVertex (
	__IDIfcVertex__ Integer NOT NULL,
	PRIMARY KEY IfcVertex (__IDIfcVertex__)
) ;

CREATE TABLE IfcVertexBasedTextureMap (
	__IDIfcVertexBasedTextureMap__ Integer NOT NULL,
	PRIMARY KEY IfcVertexBasedTextureMap (__IDIfcVertexBasedTextureMap__)
) ;

CREATE TABLE IfcVertexLoop (
	__IDIfcVertexLoop__ Integer NOT NULL,
	FOREIGN KEY LoopVertex (__FKLoopVertex__) REFERENCES IfcVertex (__IDIfcVertex__),
	PRIMARY KEY IfcVertexLoop (__IDIfcVertexLoop__),
	__FKLoopVertex__ Integer
) ;

CREATE TABLE IfcVertexPoint (
	__IDIfcVertexPoint__ Integer NOT NULL,
	FOREIGN KEY VertexGeometry (__FKVertexGeometry__) REFERENCES IfcPoint (__IDIfcPoint__),
	PRIMARY KEY IfcVertexPoint (__IDIfcVertexPoint__),
	__FKVertexGeometry__ Integer
) ;

CREATE TABLE IfcVibrationIsolatorType (
	__IDIfcVibrationIsolatorType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcVibrationIsolatorType (__IDIfcVibrationIsolatorType__)
) ;

CREATE TABLE IfcVirtualElement (
	__IDIfcVirtualElement__ Integer NOT NULL,
	PRIMARY KEY IfcVirtualElement (__IDIfcVirtualElement__)
) ;

CREATE TABLE IfcVirtualGridIntersection (
	__IDIfcVirtualGridIntersection__ Integer NOT NULL,
	PRIMARY KEY IfcVirtualGridIntersection (__IDIfcVirtualGridIntersection__)
) ;

CREATE TABLE IfcWall (
	__IDIfcWall__ Integer NOT NULL,
	PRIMARY KEY IfcWall (__IDIfcWall__)
) ;

CREATE TABLE IfcWallStandardCase (
	__IDIfcWallStandardCase__ Integer NOT NULL,
	PRIMARY KEY IfcWallStandardCase (__IDIfcWallStandardCase__)
) ;

CREATE TABLE IfcWallType (
	__IDIfcWallType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcWallType (__IDIfcWallType__)
) ;

CREATE TABLE IfcWasteTerminalType (
	__IDIfcWasteTerminalType__ Integer NOT NULL,
	PredefinedType text,
	PRIMARY KEY IfcWasteTerminalType (__IDIfcWasteTerminalType__)
) ;

CREATE TABLE IfcWaterProperties (
	__IDIfcWaterProperties__ Integer NOT NULL,
	IsPotable text,
	Hardness text,
	AlkalinityConcentration text,
	AcidityConcentration text,
	ImpuritiesContent text,
	PHLevel text,
	DissolvedSolidsContent text,
	PRIMARY KEY IfcWaterProperties (__IDIfcWaterProperties__)
) ;

CREATE TABLE IfcWindow (
	__IDIfcWindow__ Integer NOT NULL,
	OverallHeight text,
	OverallWidth text,
	PRIMARY KEY IfcWindow (__IDIfcWindow__)
) ;

CREATE TABLE IfcWindowLiningProperties (
	__IDIfcWindowLiningProperties__ Integer NOT NULL,
	LiningDepth text,
	LiningThickness text,
	TransomThickness text,
	MullionThickness text,
	FirstTransomOffset text,
	SecondTransomOffset text,
	FirstMullionOffset text,
	SecondMullionOffset text,
	FOREIGN KEY ShapeAspectStyle (__FKShapeAspectStyle__) REFERENCES IfcShapeAspect (__IDIfcShapeAspect__),
	PRIMARY KEY IfcWindowLiningProperties (__IDIfcWindowLiningProperties__),
	__FKShapeAspectStyle__ Integer
) ;

CREATE TABLE IfcWindowPanelProperties (
	__IDIfcWindowPanelProperties__ Integer NOT NULL,
	OperationType text,
	PanelPosition text,
	FrameDepth text,
	FrameThickness text,
	FOREIGN KEY ShapeAspectStyle (__FKShapeAspectStyle__) REFERENCES IfcShapeAspect (__IDIfcShapeAspect__),
	PRIMARY KEY IfcWindowPanelProperties (__IDIfcWindowPanelProperties__),
	__FKShapeAspectStyle__ Integer
) ;

CREATE TABLE IfcWindowStyle (
	__IDIfcWindowStyle__ Integer NOT NULL,
	ConstructionType text,
	OperationType text,
	ParameterTakesPrecedence text,
	Sizeable text,
	PRIMARY KEY IfcWindowStyle (__IDIfcWindowStyle__)
) ;

CREATE TABLE IfcWorkControl (
	__IDIfcWorkControl__ Integer NOT NULL,
	Identifier text,
	Purpose text,
	Duration text,
	TotalFloat text,
	WorkControlType text,
	UserDefinedControlType text,
	FOREIGN KEY CreationDate (__FKCreationDate__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	FOREIGN KEY StartTime (__FKStartTime__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	FOREIGN KEY FinishTime (__FKFinishTime__) REFERENCES IfcDateTimeSelect (__IDIfcDateTimeSelect__),
	PRIMARY KEY IfcWorkControl (__IDIfcWorkControl__),
	__FKCreationDate__ Integer,
	__FKStartTime__ Integer,
	__FKFinishTime__ Integer
) ;

CREATE TABLE IfcWorkPlan (
	__IDIfcWorkPlan__ Integer NOT NULL,
	PRIMARY KEY IfcWorkPlan (__IDIfcWorkPlan__)
) ;

CREATE TABLE IfcWorkSchedule (
	__IDIfcWorkSchedule__ Integer NOT NULL,
	PRIMARY KEY IfcWorkSchedule (__IDIfcWorkSchedule__)
) ;

CREATE TABLE IfcZShapeProfileDef (
	__IDIfcZShapeProfileDef__ Integer NOT NULL,
	Depth text,
	FlangeWidth text,
	WebThickness text,
	FlangeThickness text,
	FilletRadius text,
	EdgeRadius text,
	PRIMARY KEY IfcZShapeProfileDef (__IDIfcZShapeProfileDef__)
) ;

CREATE TABLE IfcZone (
	__IDIfcZone__ Integer NOT NULL,
	PRIMARY KEY IfcZone (__IDIfcZone__)
) ;

CREATE TABLE IfcAnnotationFillArea_InnerBoundaries_IfcCurve (
	__IDIfcAnnotationFillArea__ Integer NOT NULL,
	__IDIfcCurve__ Integer NOT NULL
) ;

CREATE TABLE IfcAppliedValueRelationship_Components_IfcAppliedValue (
	__IDIfcAppliedValueRelationship__ Integer NOT NULL,
	__IDIfcAppliedValue__ Integer NOT NULL
) ;

CREATE TABLE IfcApprovalPropertyRelationship_ApprovedProperties_IfcProperty (
	__IDIfcApprovalPropertyRelationship__ Integer NOT NULL,
	__IDIfcProperty__ Integer NOT NULL
) ;

CREATE TABLE IfcArbitraryProfileDefWithVoids_InnerCurves_IfcCurve (
	__IDIfcArbitraryProfileDefWithVoids__ Integer NOT NULL,
	__IDIfcCurve__ Integer NOT NULL
) ;

CREATE TABLE IfcBSplineCurve_ControlPointsList_IfcCartesianPoint (
	__IDIfcBSplineCurve__ Integer NOT NULL,
	__IDIfcCartesianPoint__ Integer NOT NULL
) ;

CREATE TABLE IfcClassificationItemRelationship_RelatedItems_IfcClassificationItem (
	__IDIfcClassificationItemRelationship__ Integer NOT NULL,
	__IDIfcClassificationItem__ Integer NOT NULL
) ;

CREATE TABLE IfcClassificationNotation_NotationFacets_IfcClassificationNotationFacet (
	__IDIfcClassificationNotation__ Integer NOT NULL,
	__IDIfcClassificationNotationFacet__ Integer NOT NULL
) ;

CREATE TABLE IfcComplexProperty_HasProperties_IfcProperty (
	__IDIfcComplexProperty__ Integer NOT NULL,
	__IDIfcProperty__ Integer NOT NULL
) ;

CREATE TABLE IfcCompositeCurve_Segments_IfcCompositeCurveSegment (
	__IDIfcCompositeCurve__ Integer NOT NULL,
	__IDIfcCompositeCurveSegment__ Integer NOT NULL
) ;

CREATE TABLE IfcCompositeProfileDef_Profiles_IfcProfileDef (
	__IDIfcCompositeProfileDef__ Integer NOT NULL,
	__IDIfcProfileDef__ Integer NOT NULL
) ;

CREATE TABLE IfcConnectedFaceSet_CfsFaces_IfcFace (
	__IDIfcConnectedFaceSet__ Integer NOT NULL,
	__IDIfcFace__ Integer NOT NULL
) ;

CREATE TABLE IfcConstraintAggregationRelationship_RelatedConstraints_IfcConstraint (
	__IDIfcConstraintAggregationRelationship__ Integer NOT NULL,
	__IDIfcConstraint__ Integer NOT NULL
) ;

CREATE TABLE IfcConstraintClassificationRelationship_RelatedClassifications_IfcClassificationNotationSelect (
	__IDIfcConstraintClassificationRelationship__ Integer NOT NULL,
	__IDIfcClassificationNotationSelect__ Integer NOT NULL
) ;

CREATE TABLE IfcConstraintRelationship_RelatedConstraints_IfcConstraint (
	__IDIfcConstraintRelationship__ Integer NOT NULL,
	__IDIfcConstraint__ Integer NOT NULL
) ;

CREATE TABLE IfcConstructionMaterialResource_Suppliers_IfcActorSelect (
	__IDIfcConstructionMaterialResource__ Integer NOT NULL,
	__IDIfcActorSelect__ Integer NOT NULL
) ;

CREATE TABLE IfcCostSchedule_TargetUsers_IfcActorSelect (
	__IDIfcCostSchedule__ Integer NOT NULL,
	__IDIfcActorSelect__ Integer NOT NULL
) ;

CREATE TABLE IfcCurveBoundedPlane_InnerBoundaries_IfcCurve (
	__IDIfcCurveBoundedPlane__ Integer NOT NULL,
	__IDIfcCurve__ Integer NOT NULL
) ;

CREATE TABLE IfcCurveStyleFont_PatternList_IfcCurveStyleFontPattern (
	__IDIfcCurveStyleFont__ Integer NOT NULL,
	__IDIfcCurveStyleFontPattern__ Integer NOT NULL
) ;

CREATE TABLE IfcDerivedUnit_Elements_IfcDerivedUnitElement (
	__IDIfcDerivedUnit__ Integer NOT NULL,
	__IDIfcDerivedUnitElement__ Integer NOT NULL
) ;

CREATE TABLE IfcDocumentInformation_DocumentReferences_IfcDocumentReference (
	__IDIfcDocumentInformation__ Integer NOT NULL,
	__IDIfcDocumentReference__ Integer NOT NULL
) ;

CREATE TABLE IfcDocumentInformation_Editors_IfcActorSelect (
	__IDIfcDocumentInformation__ Integer NOT NULL,
	__IDIfcActorSelect__ Integer NOT NULL
) ;

CREATE TABLE IfcDocumentInformationRelationship_RelatedDocuments_IfcDocumentInformation (
	__IDIfcDocumentInformationRelationship__ Integer NOT NULL,
	__IDIfcDocumentInformation__ Integer NOT NULL
) ;

CREATE TABLE IfcDraughtingCallout_Contents_IfcDraughtingCalloutElement (
	__IDIfcDraughtingCallout__ Integer NOT NULL,
	__IDIfcDraughtingCalloutElement__ Integer NOT NULL
) ;

CREATE TABLE IfcEdgeLoop_EdgeList_IfcOrientedEdge (
	__IDIfcEdgeLoop__ Integer NOT NULL,
	__IDIfcOrientedEdge__ Integer NOT NULL
) ;

CREATE TABLE IfcElementQuantity_Quantities_IfcPhysicalQuantity (
	__IDIfcElementQuantity__ Integer NOT NULL,
	__IDIfcPhysicalQuantity__ Integer NOT NULL
) ;

CREATE TABLE IfcExtendedMaterialProperties_ExtendedProperties_IfcProperty (
	__IDIfcExtendedMaterialProperties__ Integer NOT NULL,
	__IDIfcProperty__ Integer NOT NULL
) ;

CREATE TABLE IfcFace_Bounds_IfcFaceBound (
	__IDIfcFace__ Integer NOT NULL,
	__IDIfcFaceBound__ Integer NOT NULL
) ;

CREATE TABLE IfcFaceBasedSurfaceModel_FbsmFaces_IfcConnectedFaceSet (
	__IDIfcFaceBasedSurfaceModel__ Integer NOT NULL,
	__IDIfcConnectedFaceSet__ Integer NOT NULL
) ;

CREATE TABLE IfcFacetedBrepWithVoids_Voids_IfcClosedShell (
	__IDIfcFacetedBrepWithVoids__ Integer NOT NULL,
	__IDIfcClosedShell__ Integer NOT NULL
) ;

CREATE TABLE IfcFillAreaStyle_FillStyles_IfcFillStyleSelect (
	__IDIfcFillAreaStyle__ Integer NOT NULL,
	__IDIfcFillStyleSelect__ Integer NOT NULL
) ;

CREATE TABLE IfcFillAreaStyleTiles_Tiles_IfcFillAreaStyleTileShapeSelect (
	__IDIfcFillAreaStyleTiles__ Integer NOT NULL,
	__IDIfcFillAreaStyleTileShapeSelect__ Integer NOT NULL
) ;

CREATE TABLE IfcGeometricSet_Elements_IfcGeometricSetSelect (
	__IDIfcGeometricSet__ Integer NOT NULL,
	__IDIfcGeometricSetSelect__ Integer NOT NULL
) ;

CREATE TABLE IfcGrid_UAxes_IfcGridAxis (
	__IDIfcGrid__ Integer NOT NULL,
	__IDIfcGridAxis__ Integer NOT NULL
) ;

CREATE TABLE IfcGrid_VAxes_IfcGridAxis (
	__IDIfcGrid__ Integer NOT NULL,
	__IDIfcGridAxis__ Integer NOT NULL
) ;

CREATE TABLE IfcGrid_WAxes_IfcGridAxis (
	__IDIfcGrid__ Integer NOT NULL,
	__IDIfcGridAxis__ Integer NOT NULL
) ;

CREATE TABLE IfcInventory_ResponsiblePersons_IfcPerson (
	__IDIfcInventory__ Integer NOT NULL,
	__IDIfcPerson__ Integer NOT NULL
) ;

CREATE TABLE IfcIrregularTimeSeries_Values_IfcIrregularTimeSeriesValue (
	__IDIfcIrregularTimeSeries__ Integer NOT NULL,
	__IDIfcIrregularTimeSeriesValue__ Integer NOT NULL
) ;

CREATE TABLE IfcIrregularTimeSeriesValue_ListValues_IfcValue (
	__IDIfcIrregularTimeSeriesValue__ Integer NOT NULL,
	__IDIfcValue__ Integer NOT NULL
) ;

CREATE TABLE IfcLibraryInformation_LibraryReference_IfcLibraryReference (
	__IDIfcLibraryInformation__ Integer NOT NULL,
	__IDIfcLibraryReference__ Integer NOT NULL
) ;

CREATE TABLE IfcLightIntensityDistribution_DistributionData_IfcLightDistributionData (
	__IDIfcLightIntensityDistribution__ Integer NOT NULL,
	__IDIfcLightDistributionData__ Integer NOT NULL
) ;

CREATE TABLE IfcMaterialClassificationRelationship_MaterialClassifications_IfcClassificationNotationSelect (
	__IDIfcMaterialClassificationRelationship__ Integer NOT NULL,
	__IDIfcClassificationNotationSelect__ Integer NOT NULL
) ;

CREATE TABLE IfcMaterialLayerSet_MaterialLayers_IfcMaterialLayer (
	__IDIfcMaterialLayerSet__ Integer NOT NULL,
	__IDIfcMaterialLayer__ Integer NOT NULL
) ;

CREATE TABLE IfcMaterialList_Materials_IfcMaterial (
	__IDIfcMaterialList__ Integer NOT NULL,
	__IDIfcMaterial__ Integer NOT NULL
) ;

CREATE TABLE IfcMechanicalSteelMaterialProperties_Relaxations_IfcRelaxation (
	__IDIfcMechanicalSteelMaterialProperties__ Integer NOT NULL,
	__IDIfcRelaxation__ Integer NOT NULL
) ;

CREATE TABLE IfcOrganization_Roles_IfcActorRole (
	__IDIfcOrganization__ Integer NOT NULL,
	__IDIfcActorRole__ Integer NOT NULL
) ;

CREATE TABLE IfcOrganization_Addresses_IfcAddress (
	__IDIfcOrganization__ Integer NOT NULL,
	__IDIfcAddress__ Integer NOT NULL
) ;

CREATE TABLE IfcOrganizationRelationship_RelatedOrganizations_IfcOrganization (
	__IDIfcOrganizationRelationship__ Integer NOT NULL,
	__IDIfcOrganization__ Integer NOT NULL
) ;

CREATE TABLE IfcPath_EdgeList_IfcOrientedEdge (
	__IDIfcPath__ Integer NOT NULL,
	__IDIfcOrientedEdge__ Integer NOT NULL
) ;

CREATE TABLE IfcPerson_Roles_IfcActorRole (
	__IDIfcPerson__ Integer NOT NULL,
	__IDIfcActorRole__ Integer NOT NULL
) ;

CREATE TABLE IfcPerson_Addresses_IfcAddress (
	__IDIfcPerson__ Integer NOT NULL,
	__IDIfcAddress__ Integer NOT NULL
) ;

CREATE TABLE IfcPersonAndOrganization_Roles_IfcActorRole (
	__IDIfcPersonAndOrganization__ Integer NOT NULL,
	__IDIfcActorRole__ Integer NOT NULL
) ;

CREATE TABLE IfcPhysicalComplexQuantity_HasQuantities_IfcPhysicalQuantity (
	__IDIfcPhysicalComplexQuantity__ Integer NOT NULL,
	__IDIfcPhysicalQuantity__ Integer NOT NULL
) ;

CREATE TABLE IfcPolyLoop_Polygon_IfcCartesianPoint (
	__IDIfcPolyLoop__ Integer NOT NULL,
	__IDIfcCartesianPoint__ Integer NOT NULL
) ;

CREATE TABLE IfcPolyline_Points_IfcCartesianPoint (
	__IDIfcPolyline__ Integer NOT NULL,
	__IDIfcCartesianPoint__ Integer NOT NULL
) ;

CREATE TABLE IfcPresentationLayerAssignment_AssignedItems_IfcLayeredItem (
	__IDIfcPresentationLayerAssignment__ Integer NOT NULL,
	__IDIfcLayeredItem__ Integer NOT NULL
) ;

CREATE TABLE IfcPresentationLayerWithStyle_LayerStyles_IfcPresentationStyleSelect (
	__IDIfcPresentationLayerWithStyle__ Integer NOT NULL,
	__IDIfcPresentationStyleSelect__ Integer NOT NULL
) ;

CREATE TABLE IfcPresentationStyleAssignment_Styles_IfcPresentationStyleSelect (
	__IDIfcPresentationStyleAssignment__ Integer NOT NULL,
	__IDIfcPresentationStyleSelect__ Integer NOT NULL
) ;

CREATE TABLE IfcProductRepresentation_Representations_IfcRepresentation (
	__IDIfcProductRepresentation__ Integer NOT NULL,
	__IDIfcRepresentation__ Integer NOT NULL
) ;

CREATE TABLE IfcProject_RepresentationContexts_IfcRepresentationContext (
	__IDIfcProject__ Integer NOT NULL,
	__IDIfcRepresentationContext__ Integer NOT NULL
) ;

CREATE TABLE IfcProjectOrderRecord_Records_IfcRelAssignsToProjectOrder (
	__IDIfcProjectOrderRecord__ Integer NOT NULL,
	__IDIfcRelAssignsToProjectOrder__ Integer NOT NULL
) ;

CREATE TABLE IfcPropertyConstraintRelationship_RelatedProperties_IfcProperty (
	__IDIfcPropertyConstraintRelationship__ Integer NOT NULL,
	__IDIfcProperty__ Integer NOT NULL
) ;

CREATE TABLE IfcPropertyEnumeratedValue_EnumerationValues_IfcValue (
	__IDIfcPropertyEnumeratedValue__ Integer NOT NULL,
	__IDIfcValue__ Integer NOT NULL
) ;

CREATE TABLE IfcPropertyEnumeration_EnumerationValues_IfcValue (
	__IDIfcPropertyEnumeration__ Integer NOT NULL,
	__IDIfcValue__ Integer NOT NULL
) ;

CREATE TABLE IfcPropertyListValue_ListValues_IfcValue (
	__IDIfcPropertyListValue__ Integer NOT NULL,
	__IDIfcValue__ Integer NOT NULL
) ;

CREATE TABLE IfcPropertySet_HasProperties_IfcProperty (
	__IDIfcPropertySet__ Integer NOT NULL,
	__IDIfcProperty__ Integer NOT NULL
) ;

CREATE TABLE IfcPropertyTableValue_DefiningValues_IfcValue (
	__IDIfcPropertyTableValue__ Integer NOT NULL,
	__IDIfcValue__ Integer NOT NULL
) ;

CREATE TABLE IfcPropertyTableValue_DefinedValues_IfcValue (
	__IDIfcPropertyTableValue__ Integer NOT NULL,
	__IDIfcValue__ Integer NOT NULL
) ;

CREATE TABLE IfcReferencesValueDocument_ReferencingValues_IfcAppliedValue (
	__IDIfcReferencesValueDocument__ Integer NOT NULL,
	__IDIfcAppliedValue__ Integer NOT NULL
) ;

CREATE TABLE IfcRegularTimeSeries_Values_IfcTimeSeriesValue (
	__IDIfcRegularTimeSeries__ Integer NOT NULL,
	__IDIfcTimeSeriesValue__ Integer NOT NULL
) ;

CREATE TABLE IfcReinforcementDefinitionProperties_ReinforcementSectionDefinitions_IfcSectionReinforcementProperties (
	__IDIfcReinforcementDefinitionProperties__ Integer NOT NULL,
	__IDIfcSectionReinforcementProperties__ Integer NOT NULL
) ;

CREATE TABLE IfcRelAssigns_RelatedObjects_IfcObjectDefinition (
	__IDIfcRelAssigns__ Integer NOT NULL,
	__IDIfcObjectDefinition__ Integer NOT NULL
) ;

CREATE TABLE IfcRelAssociates_RelatedObjects_IfcRoot (
	__IDIfcRelAssociates__ Integer NOT NULL,
	__IDIfcRoot__ Integer NOT NULL
) ;

CREATE TABLE IfcRelConnectsWithRealizingElements_RealizingElements_IfcElement (
	__IDIfcRelConnectsWithRealizingElements__ Integer NOT NULL,
	__IDIfcElement__ Integer NOT NULL
) ;

CREATE TABLE IfcRelContainedInSpatialStructure_RelatedElements_IfcProduct (
	__IDIfcRelContainedInSpatialStructure__ Integer NOT NULL,
	__IDIfcProduct__ Integer NOT NULL
) ;

CREATE TABLE IfcRelCoversBldgElements_RelatedCoverings_IfcCovering (
	__IDIfcRelCoversBldgElements__ Integer NOT NULL,
	__IDIfcCovering__ Integer NOT NULL
) ;

CREATE TABLE IfcRelCoversSpaces_RelatedCoverings_IfcCovering (
	__IDIfcRelCoversSpaces__ Integer NOT NULL,
	__IDIfcCovering__ Integer NOT NULL
) ;

CREATE TABLE IfcRelDecomposes_RelatedObjects_IfcObjectDefinition (
	__IDIfcRelDecomposes__ Integer NOT NULL,
	__IDIfcObjectDefinition__ Integer NOT NULL
) ;

CREATE TABLE IfcRelDefines_RelatedObjects_IfcObject (
	__IDIfcRelDefines__ Integer NOT NULL,
	__IDIfcObject__ Integer NOT NULL
) ;

CREATE TABLE IfcRelFlowControlElements_RelatedControlElements_IfcDistributionControlElement (
	__IDIfcRelFlowControlElements__ Integer NOT NULL,
	__IDIfcDistributionControlElement__ Integer NOT NULL
) ;

CREATE TABLE IfcRelOverridesProperties_OverridingProperties_IfcProperty (
	__IDIfcRelOverridesProperties__ Integer NOT NULL,
	__IDIfcProperty__ Integer NOT NULL
) ;

CREATE TABLE IfcRelReferencedInSpatialStructure_RelatedElements_IfcProduct (
	__IDIfcRelReferencedInSpatialStructure__ Integer NOT NULL,
	__IDIfcProduct__ Integer NOT NULL
) ;

CREATE TABLE IfcRelServicesBuildings_RelatedBuildings_IfcSpatialStructureElement (
	__IDIfcRelServicesBuildings__ Integer NOT NULL,
	__IDIfcSpatialStructureElement__ Integer NOT NULL
) ;

CREATE TABLE IfcRepresentation_Items_IfcRepresentationItem (
	__IDIfcRepresentation__ Integer NOT NULL,
	__IDIfcRepresentationItem__ Integer NOT NULL
) ;

CREATE TABLE IfcSectionReinforcementProperties_CrossSectionReinforcementDefinitions_IfcReinforcementBarProperties (
	__IDIfcSectionReinforcementProperties__ Integer NOT NULL,
	__IDIfcReinforcementBarProperties__ Integer NOT NULL
) ;

CREATE TABLE IfcSectionedSpine_CrossSections_IfcProfileDef (
	__IDIfcSectionedSpine__ Integer NOT NULL,
	__IDIfcProfileDef__ Integer NOT NULL
) ;

CREATE TABLE IfcSectionedSpine_CrossSectionPositions_IfcAxis2Placement3D (
	__IDIfcSectionedSpine__ Integer NOT NULL,
	__IDIfcAxis2Placement3D__ Integer NOT NULL
) ;

CREATE TABLE IfcShapeAspect_ShapeRepresentations_IfcShapeModel (
	__IDIfcShapeAspect__ Integer NOT NULL,
	__IDIfcShapeModel__ Integer NOT NULL
) ;

CREATE TABLE IfcShellBasedSurfaceModel_SbsmBoundary_IfcShell (
	__IDIfcShellBasedSurfaceModel__ Integer NOT NULL,
	__IDIfcShell__ Integer NOT NULL
) ;

CREATE TABLE IfcSoundProperties_SoundValues_IfcSoundValue (
	__IDIfcSoundProperties__ Integer NOT NULL,
	__IDIfcSoundValue__ Integer NOT NULL
) ;

CREATE TABLE IfcStructuralAnalysisModel_LoadedBy_IfcStructuralLoadGroup (
	__IDIfcStructuralAnalysisModel__ Integer NOT NULL,
	__IDIfcStructuralLoadGroup__ Integer NOT NULL
) ;

CREATE TABLE IfcStructuralAnalysisModel_HasResults_IfcStructuralResultGroup (
	__IDIfcStructuralAnalysisModel__ Integer NOT NULL,
	__IDIfcStructuralResultGroup__ Integer NOT NULL
) ;

CREATE TABLE IfcStructuralLinearActionVarying_SubsequentAppliedLoads_IfcStructuralLoad (
	__IDIfcStructuralLinearActionVarying__ Integer NOT NULL,
	__IDIfcStructuralLoad__ Integer NOT NULL
) ;

CREATE TABLE IfcStructuralPlanarActionVarying_SubsequentAppliedLoads_IfcStructuralLoad (
	__IDIfcStructuralPlanarActionVarying__ Integer NOT NULL,
	__IDIfcStructuralLoad__ Integer NOT NULL
) ;

CREATE TABLE IfcStyledItem_Styles_IfcPresentationStyleAssignment (
	__IDIfcStyledItem__ Integer NOT NULL,
	__IDIfcPresentationStyleAssignment__ Integer NOT NULL
) ;

CREATE TABLE IfcSurfaceStyle_Styles_IfcSurfaceStyleElementSelect (
	__IDIfcSurfaceStyle__ Integer NOT NULL,
	__IDIfcSurfaceStyleElementSelect__ Integer NOT NULL
) ;

CREATE TABLE IfcSurfaceStyleWithTextures_Textures_IfcSurfaceTexture (
	__IDIfcSurfaceStyleWithTextures__ Integer NOT NULL,
	__IDIfcSurfaceTexture__ Integer NOT NULL
) ;

CREATE TABLE IfcTable_Rows_IfcTableRow (
	__IDIfcTable__ Integer NOT NULL,
	__IDIfcTableRow__ Integer NOT NULL
) ;

CREATE TABLE IfcTableRow_RowCells_IfcValue (
	__IDIfcTableRow__ Integer NOT NULL,
	__IDIfcValue__ Integer NOT NULL
) ;

CREATE TABLE IfcTextureCoordinateGenerator_Parameter_IfcSimpleValue (
	__IDIfcTextureCoordinateGenerator__ Integer NOT NULL,
	__IDIfcSimpleValue__ Integer NOT NULL
) ;

CREATE TABLE IfcTextureMap_TextureMaps_IfcVertexBasedTextureMap (
	__IDIfcTextureMap__ Integer NOT NULL,
	__IDIfcVertexBasedTextureMap__ Integer NOT NULL
) ;

CREATE TABLE IfcTimeSeriesReferenceRelationship_TimeSeriesReferences_IfcDocumentSelect (
	__IDIfcTimeSeriesReferenceRelationship__ Integer NOT NULL,
	__IDIfcDocumentSelect__ Integer NOT NULL
) ;

CREATE TABLE IfcTimeSeriesSchedule_ApplicableDates_IfcDateTimeSelect (
	__IDIfcTimeSeriesSchedule__ Integer NOT NULL,
	__IDIfcDateTimeSelect__ Integer NOT NULL
) ;

CREATE TABLE IfcTimeSeriesValue_ListValues_IfcValue (
	__IDIfcTimeSeriesValue__ Integer NOT NULL,
	__IDIfcValue__ Integer NOT NULL
) ;

CREATE TABLE IfcTrimmedCurve_Trim1_IfcTrimmingSelect (
	__IDIfcTrimmedCurve__ Integer NOT NULL,
	__IDIfcTrimmingSelect__ Integer NOT NULL
) ;

CREATE TABLE IfcTrimmedCurve_Trim2_IfcTrimmingSelect (
	__IDIfcTrimmedCurve__ Integer NOT NULL,
	__IDIfcTrimmingSelect__ Integer NOT NULL
) ;

CREATE TABLE IfcTypeObject_HasPropertySets_IfcPropertySetDefinition (
	__IDIfcTypeObject__ Integer NOT NULL,
	__IDIfcPropertySetDefinition__ Integer NOT NULL
) ;

CREATE TABLE IfcTypeProduct_RepresentationMaps_IfcRepresentationMap (
	__IDIfcTypeProduct__ Integer NOT NULL,
	__IDIfcRepresentationMap__ Integer NOT NULL
) ;

CREATE TABLE IfcUnitAssignment_Units_IfcUnit (
	__IDIfcUnitAssignment__ Integer NOT NULL,
	__IDIfcUnit__ Integer NOT NULL
) ;

CREATE TABLE IfcVertexBasedTextureMap_TextureVertices_IfcTextureVertex (
	__IDIfcVertexBasedTextureMap__ Integer NOT NULL,
	__IDIfcTextureVertex__ Integer NOT NULL
) ;

CREATE TABLE IfcVertexBasedTextureMap_TexturePoints_IfcCartesianPoint (
	__IDIfcVertexBasedTextureMap__ Integer NOT NULL,
	__IDIfcCartesianPoint__ Integer NOT NULL
) ;

CREATE TABLE IfcVirtualGridIntersection_IntersectingAxes_IfcGridAxis (
	__IDIfcVirtualGridIntersection__ Integer NOT NULL,
	__IDIfcGridAxis__ Integer NOT NULL
) ;

CREATE TABLE IfcWorkControl_Creators_IfcPerson (
	__IDIfcWorkControl__ Integer NOT NULL,
	__IDIfcPerson__ Integer NOT NULL
) ;
