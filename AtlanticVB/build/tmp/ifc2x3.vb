Namespace IFC2X3

	#Region " Interface IfcActorSelect "
		Interface IfcActorSelect
			
		End Interface
	#End Region

	#Region " Interface IfcAxis2Placement "
		Interface IfcAxis2Placement
			
		End Interface
	#End Region

	#Region " Interface IfcBooleanOperand "
		Interface IfcBooleanOperand
			
		End Interface
	#End Region

	#Region " Interface IfcCharacterStyleSelect "
		Interface IfcCharacterStyleSelect
			
		End Interface
	#End Region

	#Region " Interface IfcClassificationNotationSelect "
		Interface IfcClassificationNotationSelect
			
		End Interface
	#End Region

	#Region " Interface IfcColour "
		Interface IfcColour : Inherits IfcSymbolStyleSelect, IfcFillStyleSelect
			
		End Interface
	#End Region

	#Region " Interface IfcCsgSelect "
		Interface IfcCsgSelect
			
		End Interface
	#End Region

	#Region " Interface IfcCurveFontOrScaledCurveFontSelect "
		Interface IfcCurveFontOrScaledCurveFontSelect
			
		End Interface
	#End Region

	#Region " Interface IfcCurveOrEdgeCurve "
		Interface IfcCurveOrEdgeCurve
			
		End Interface
	#End Region

	#Region " Interface IfcCurveStyleFontSelect "
		Interface IfcCurveStyleFontSelect : Inherits IfcCurveFontOrScaledCurveFontSelect
			
		End Interface
	#End Region

	#Region " Interface IfcDateTimeSelect "
		Interface IfcDateTimeSelect
			
		End Interface
	#End Region

	#Region " Interface IfcDefinedSymbolSelect "
		Interface IfcDefinedSymbolSelect
			
		End Interface
	#End Region

	#Region " Interface IfcDocumentSelect "
		Interface IfcDocumentSelect
			
		End Interface
	#End Region

	#Region " Interface IfcDraughtingCalloutElement "
		Interface IfcDraughtingCalloutElement
			
		End Interface
	#End Region

	#Region " Interface IfcFillAreaStyleTileShapeSelect "
		Interface IfcFillAreaStyleTileShapeSelect
			
		End Interface
	#End Region

	#Region " Interface IfcFillStyleSelect "
		Interface IfcFillStyleSelect
			
		End Interface
	#End Region

	#Region " Interface IfcGeometricSetSelect "
		Interface IfcGeometricSetSelect
			
		End Interface
	#End Region

	#Region " Interface IfcLayeredItem "
		Interface IfcLayeredItem
			''' <summary>
			''' LayerAssignments oppositeOf AssignedItems
			''' </summary>
			Property LayerAssignments As [[IfcPresentationLayerAssignment]]
		End Interface
	#End Region

	#Region " Interface IfcLibrarySelect "
		Interface IfcLibrarySelect
			
		End Interface
	#End Region

	#Region " Interface IfcLightDistributionDataSourceSelect "
		Interface IfcLightDistributionDataSourceSelect
			
		End Interface
	#End Region

	#Region " Interface IfcMaterialSelect "
		Interface IfcMaterialSelect
			
		End Interface
	#End Region

	#Region " Interface IfcObjectReferenceSelect "
		Interface IfcObjectReferenceSelect
			
		End Interface
	#End Region

	#Region " Interface IfcPointOrVertexPoint "
		Interface IfcPointOrVertexPoint
			
		End Interface
	#End Region

	#Region " Interface IfcShell "
		Interface IfcShell
			
		End Interface
	#End Region

	#Region " Interface IfcStructuralActivityAssignmentSelect "
		Interface IfcStructuralActivityAssignmentSelect
			''' <summary>
			''' AssignedStructuralActivity oppositeOf RelatingElement
			''' </summary>
			Property AssignedStructuralActivity As [[IfcRelConnectsStructuralActivity]]
		End Interface
	#End Region

	#Region " Interface IfcSurfaceOrFaceSurface "
		Interface IfcSurfaceOrFaceSurface
			
		End Interface
	#End Region

	#Region " Interface IfcSurfaceStyleElementSelect "
		Interface IfcSurfaceStyleElementSelect
			
		End Interface
	#End Region

	#Region " Interface IfcSymbolStyleSelect "
		Interface IfcSymbolStyleSelect
			
		End Interface
	#End Region

	#Region " Interface IfcTextFontSelect "
		Interface IfcTextFontSelect
			
		End Interface
	#End Region

	#Region " Interface IfcTextStyleSelect "
		Interface IfcTextStyleSelect
			
		End Interface
	#End Region

	#Region " Interface IfcUnit "
		Interface IfcUnit
			
		End Interface
	#End Region

	#Region " Interface IfcVectorOrDirection "
		Interface IfcVectorOrDirection
			
		End Interface
	#End Region

	#Region " Interface IfcValue "
		Interface IfcValue
			Property IfcAbsorbedDoseMeasurevalue As REAL

			Property IfcAccelerationMeasurevalue As REAL

			Property IfcAmountOfSubstanceMeasurevalue As REAL

			Property IfcAngularVelocityMeasurevalue As REAL

			Property IfcAreaMeasurevalue As REAL

			Property IfcBooleanvalue As [BOOLEAN]

			Property IfcContextDependentMeasurevalue As REAL

			Property IfcCountMeasurevalue As NUMBER

			Property IfcCurvatureMeasurevalue As REAL

			Property IfcDescriptiveMeasurevalue As [STRING]

			Property IfcDoseEquivalentMeasurevalue As REAL

			Property IfcDynamicViscosityMeasurevalue As REAL

			Property IfcElectricCapacitanceMeasurevalue As REAL

			Property IfcElectricChargeMeasurevalue As REAL

			Property IfcElectricConductanceMeasurevalue As REAL

			Property IfcElectricCurrentMeasurevalue As REAL

			Property IfcElectricResistanceMeasurevalue As REAL

			Property IfcElectricVoltageMeasurevalue As REAL

			Property IfcEnergyMeasurevalue As REAL

			Property IfcForceMeasurevalue As REAL

			Property IfcFrequencyMeasurevalue As REAL

			Property IfcHeatFluxDensityMeasurevalue As REAL

			Property IfcHeatingValueMeasurevalue As REAL

			Property IfcIdentifiervalue As [STRING]

			Property IfcIlluminanceMeasurevalue As REAL

			Property IfcInductanceMeasurevalue As REAL

			Property IfcIntegervalue As [INTEGER]

			Property IfcIntegerCountRateMeasurevalue As [INTEGER]

			Property IfcIonConcentrationMeasurevalue As REAL

			Property IfcIsothermalMoistureCapacityMeasurevalue As REAL

			Property IfcKinematicViscosityMeasurevalue As REAL

			Property IfcLabelvalue As [STRING]

			Property IfcPositiveLengthMeasurevalue As REAL

			Property IfcLengthMeasurevalue As REAL

			Property IfcLinearForceMeasurevalue As REAL

			Property IfcLinearMomentMeasurevalue As REAL

			Property IfcLinearStiffnessMeasurevalue As REAL

			Property IfcLinearVelocityMeasurevalue As REAL

			Property IfcLogicalvalue As LOGICAL

			Property IfcLuminousFluxMeasurevalue As REAL

			Property IfcLuminousIntensityDistributionMeasurevalue As REAL

			Property IfcLuminousIntensityMeasurevalue As REAL

			Property IfcMagneticFluxDensityMeasurevalue As REAL

			Property IfcMagneticFluxMeasurevalue As REAL

			Property IfcMassDensityMeasurevalue As REAL

			Property IfcMassFlowRateMeasurevalue As REAL

			Property IfcMassMeasurevalue As REAL

			Property IfcMassPerLengthMeasurevalue As REAL

			Property IfcModulusOfElasticityMeasurevalue As REAL

			Property IfcModulusOfLinearSubgradeReactionMeasurevalue As REAL

			Property IfcModulusOfRotationalSubgradeReactionMeasurevalue As REAL

			Property IfcModulusOfSubgradeReactionMeasurevalue As REAL

			Property IfcMoistureDiffusivityMeasurevalue As REAL

			Property IfcMolecularWeightMeasurevalue As REAL

			Property IfcMomentOfInertiaMeasurevalue As REAL

			Property IfcMonetaryMeasurevalue As REAL

			Property IfcNormalisedRatioMeasurevalue As REAL

			Property IfcNumericMeasurevalue As NUMBER

			Property IfcPHMeasurevalue As REAL

			Property IfcParameterValuevalue As REAL

			Property IfcPlanarForceMeasurevalue As REAL

			Property IfcPositivePlaneAngleMeasurevalue As REAL

			Property IfcPlaneAngleMeasurevalue As REAL

			Property IfcPositiveRatioMeasurevalue As REAL

			Property IfcPowerMeasurevalue As REAL

			Property IfcPressureMeasurevalue As REAL

			Property IfcRadioActivityMeasurevalue As REAL

			Property IfcRatioMeasurevalue As REAL

			Property IfcRealvalue As REAL

			Property IfcRotationalFrequencyMeasurevalue As REAL

			Property IfcRotationalMassMeasurevalue As REAL

			Property IfcRotationalStiffnessMeasurevalue As REAL

			Property IfcSectionModulusMeasurevalue As REAL

			Property IfcSectionalAreaIntegralMeasurevalue As REAL

			Property IfcShearModulusMeasurevalue As REAL

			Property IfcSolidAngleMeasurevalue As REAL

			Property IfcSoundPowerMeasurevalue As REAL

			Property IfcSoundPressureMeasurevalue As REAL

			Property IfcSpecificHeatCapacityMeasurevalue As REAL

			Property IfcTemperatureGradientMeasurevalue As REAL

			Property IfcTextvalue As [STRING]

			Property IfcThermalAdmittanceMeasurevalue As REAL

			Property IfcThermalConductivityMeasurevalue As REAL

			Property IfcThermalExpansionCoefficientMeasurevalue As REAL

			Property IfcThermalResistanceMeasurevalue As REAL

			Property IfcThermalTransmittanceMeasurevalue As REAL

			Property IfcThermodynamicTemperatureMeasurevalue As REAL

			Property IfcTimeMeasurevalue As REAL

			Property IfcTimeStampvalue As [INTEGER]

			Property IfcTorqueMeasurevalue As REAL

			Property IfcVaporPermeabilityMeasurevalue As REAL

			Property IfcVolumeMeasurevalue As REAL

			Property IfcVolumetricFlowRateMeasurevalue As REAL

			Property IfcWarpingConstantMeasurevalue As REAL

			Property IfcWarpingMomentMeasurevalue As REAL
		End Interface
	#End Region

	#Region " Interface IfcTrimmingSelect "
		Interface IfcTrimmingSelect
			Property IfcParameterValuevalue As REAL

			''' <summary>
			''' Container
			''' </summary>
			Property IfcCartesianPointvalue As [[IfcCartesianPoint]]
		End Interface
	#End Region

	#Region " Interface IfcSpecularHighlightSelect "
		Interface IfcSpecularHighlightSelect
			Property IfcSpecularRoughnessvalue As REAL

			Property IfcSpecularExponentvalue As REAL
		End Interface
	#End Region

	#Region " Interface IfcSizeSelect "
		Interface IfcSizeSelect
			Property IfcPositiveRatioMeasurevalue As REAL

			Property IfcNormalisedRatioMeasurevalue As REAL

			Property IfcPositiveLengthMeasurevalue As REAL

			Property IfcDescriptiveMeasurevalue As [STRING]

			Property IfcLengthMeasurevalue As REAL

			Property IfcRatioMeasurevalue As REAL
		End Interface
	#End Region

	#Region " Interface IfcSimpleValue "
		Interface IfcSimpleValue
			Property IfcLogicalvalue As LOGICAL

			Property IfcLabelvalue As [STRING]

			Property IfcTextvalue As [STRING]

			Property IfcIdentifiervalue As [STRING]

			Property IfcBooleanvalue As [BOOLEAN]

			Property IfcRealvalue As REAL

			Property IfcIntegervalue As [INTEGER]
		End Interface
	#End Region

	#Region " Interface IfcPresentationStyleSelect "
		Interface IfcPresentationStyleSelect
			Property IfcNullStylevalue As [[IfcNullStyle]]

			''' <summary>
			''' Container
			''' </summary>
			Property IfcSurfaceStylevalue As [[IfcSurfaceStyle]]

			''' <summary>
			''' Container
			''' </summary>
			Property IfcTextStylevalue As [[IfcTextStyle]]

			''' <summary>
			''' Container
			''' </summary>
			Property IfcFillAreaStylevalue As [[IfcFillAreaStyle]]

			''' <summary>
			''' Container
			''' </summary>
			Property IfcSymbolStylevalue As [[IfcSymbolStyle]]

			''' <summary>
			''' Container
			''' </summary>
			Property IfcCurveStylevalue As [[IfcCurveStyle]]
		End Interface
	#End Region

	#Region " Interface IfcOrientationSelect "
		Interface IfcOrientationSelect
			Property IfcPlaneAngleMeasurevalue As REAL

			''' <summary>
			''' Container
			''' </summary>
			Property IfcDirectionvalue As [[IfcDirection]]
		End Interface
	#End Region

	#Region " Interface IfcMetricValueSelect "
		Interface IfcMetricValueSelect
			''' <summary>
			''' Container
			''' </summary>
			Property IfcDateTimeSelectvalue As [[IfcDateTimeSelect]]

			Property IfcTextvalue As [STRING]

			''' <summary>
			''' Container
			''' </summary>
			Property IfcCostValuevalue As [[IfcCostValue]]

			''' <summary>
			''' Container
			''' </summary>
			Property IfcTimeSeriesvalue As [[IfcTimeSeries]]

			''' <summary>
			''' Container
			''' </summary>
			Property IfcTablevalue As [[IfcTable]]

			''' <summary>
			''' Container
			''' </summary>
			Property IfcMeasureWithUnitvalue As [[IfcMeasureWithUnit]]
		End Interface
	#End Region

	#Region " Interface IfcMeasureValue "
		Interface IfcMeasureValue
			Property IfcNormalisedRatioMeasurevalue As REAL

			Property IfcLuminousIntensityMeasurevalue As REAL

			Property IfcAmountOfSubstanceMeasurevalue As REAL

			Property IfcAreaMeasurevalue As REAL

			Property IfcContextDependentMeasurevalue As REAL

			Property IfcCountMeasurevalue As NUMBER

			Property IfcDescriptiveMeasurevalue As [STRING]

			Property IfcElectricCurrentMeasurevalue As REAL

			Property IfcLengthMeasurevalue As REAL

			Property IfcPositiveLengthMeasurevalue As REAL

			Property IfcMassMeasurevalue As REAL

			Property IfcNumericMeasurevalue As NUMBER

			Property IfcParameterValuevalue As REAL

			Property IfcPlaneAngleMeasurevalue As REAL

			Property IfcPositivePlaneAngleMeasurevalue As REAL

			Property IfcRatioMeasurevalue As REAL

			Property IfcPositiveRatioMeasurevalue As REAL

			Property IfcSolidAngleMeasurevalue As REAL

			Property IfcThermodynamicTemperatureMeasurevalue As REAL

			Property IfcTimeMeasurevalue As REAL

			Property IfcVolumeMeasurevalue As REAL
		End Interface
	#End Region

	#Region " Interface IfcHatchLineDistanceSelect "
		Interface IfcHatchLineDistanceSelect
			Property IfcPositiveLengthMeasurevalue As REAL

			''' <summary>
			''' Container
			''' </summary>
			Property IfcOneDirectionRepeatFactorvalue As [[IfcOneDirectionRepeatFactor]]
		End Interface
	#End Region

	#Region " Interface IfcDerivedMeasureValue "
		Interface IfcDerivedMeasureValue
			Property IfcIonConcentrationMeasurevalue As REAL

			Property IfcPHMeasurevalue As REAL

			Property IfcHeatingValueMeasurevalue As REAL

			Property IfcSoundPressureMeasurevalue As REAL

			Property IfcSoundPowerMeasurevalue As REAL

			Property IfcWarpingMomentMeasurevalue As REAL

			Property IfcWarpingConstantMeasurevalue As REAL

			Property IfcThermalExpansionCoefficientMeasurevalue As REAL

			Property IfcTemperatureGradientMeasurevalue As REAL

			Property IfcSectionModulusMeasurevalue As REAL

			Property IfcSectionalAreaIntegralMeasurevalue As REAL

			Property IfcRotationalMassMeasurevalue As REAL

			Property IfcModulusOfRotationalSubgradeReactionMeasurevalue As REAL

			Property IfcModulusOfLinearSubgradeReactionMeasurevalue As REAL

			Property IfcMassPerLengthMeasurevalue As REAL

			Property IfcCurvatureMeasurevalue As REAL

			Property IfcLuminousIntensityDistributionMeasurevalue As REAL

			Property IfcLinearMomentMeasurevalue As REAL

			Property IfcShearModulusMeasurevalue As REAL

			Property IfcRotationalStiffnessMeasurevalue As REAL

			Property IfcPlanarForceMeasurevalue As REAL

			Property IfcMomentOfInertiaMeasurevalue As REAL

			Property IfcModulusOfElasticityMeasurevalue As REAL

			Property IfcModulusOfSubgradeReactionMeasurevalue As REAL

			Property IfcLinearStiffnessMeasurevalue As REAL

			Property IfcLinearForceMeasurevalue As REAL

			Property IfcAccelerationMeasurevalue As REAL

			Property IfcTorqueMeasurevalue As REAL

			Property IfcRotationalFrequencyMeasurevalue As REAL

			Property IfcRadioActivityMeasurevalue As REAL

			Property IfcAbsorbedDoseMeasurevalue As REAL

			Property IfcElectricCapacitanceMeasurevalue As REAL

			Property IfcDoseEquivalentMeasurevalue As REAL

			Property IfcElectricChargeMeasurevalue As REAL

			Property IfcElectricConductanceMeasurevalue As REAL

			Property IfcElectricResistanceMeasurevalue As REAL

			Property IfcIlluminanceMeasurevalue As REAL

			Property IfcInductanceMeasurevalue As REAL

			Property IfcForceMeasurevalue As REAL

			Property IfcLuminousFluxMeasurevalue As REAL

			Property IfcMagneticFluxMeasurevalue As REAL

			Property IfcMagneticFluxDensityMeasurevalue As REAL

			Property IfcMonetaryMeasurevalue As REAL

			Property IfcSpecificHeatCapacityMeasurevalue As REAL

			Property IfcIsothermalMoistureCapacityMeasurevalue As REAL

			Property IfcMoistureDiffusivityMeasurevalue As REAL

			Property IfcVaporPermeabilityMeasurevalue As REAL

			Property IfcMolecularWeightMeasurevalue As REAL

			Property IfcThermalConductivityMeasurevalue As REAL

			Property IfcAngularVelocityMeasurevalue As REAL

			Property IfcDynamicViscosityMeasurevalue As REAL

			Property IfcElectricVoltageMeasurevalue As REAL

			Property IfcEnergyMeasurevalue As REAL

			Property IfcFrequencyMeasurevalue As REAL

			Property IfcHeatFluxDensityMeasurevalue As REAL

			Property IfcIntegerCountRateMeasurevalue As [INTEGER]

			Property IfcKinematicViscosityMeasurevalue As REAL

			Property IfcLinearVelocityMeasurevalue As REAL

			Property IfcMassDensityMeasurevalue As REAL

			Property IfcMassFlowRateMeasurevalue As REAL

			Property IfcPowerMeasurevalue As REAL

			Property IfcPressureMeasurevalue As REAL

			Property IfcThermalAdmittanceMeasurevalue As REAL

			Property IfcThermalResistanceMeasurevalue As REAL

			Property IfcThermalTransmittanceMeasurevalue As REAL

			Property IfcTimeStampvalue As [INTEGER]

			Property IfcVolumetricFlowRateMeasurevalue As REAL
		End Interface
	#End Region

	#Region " Interface IfcConditionCriterionSelect "
		Interface IfcConditionCriterionSelect
			Property IfcLabelvalue As [STRING]

			''' <summary>
			''' Container
			''' </summary>
			Property IfcMeasureWithUnitvalue As [[IfcMeasureWithUnit]]
		End Interface
	#End Region

	#Region " Interface IfcColourOrFactor "
		Interface IfcColourOrFactor
			Property IfcNormalisedRatioMeasurevalue As REAL

			''' <summary>
			''' Container
			''' </summary>
			Property IfcColourRgbvalue As [[IfcColourRgb]]
		End Interface
	#End Region

	#Region " Interface IfcAppliedValueSelect "
		Interface IfcAppliedValueSelect
			Property IfcMonetaryMeasurevalue As REAL

			Property IfcRatioMeasurevalue As REAL

			''' <summary>
			''' Container
			''' </summary>
			Property IfcMeasureWithUnitvalue As [[IfcMeasureWithUnit]]
		End Interface
	#End Region

	#Region " Interface Ifc2DCompositeCurve "
		Interface Ifc2DCompositeCurve : Inherits IfcCompositeCurve
			
		End Interface
	#End Region

	#Region " Interface IfcActionRequest "
		Interface IfcActionRequest : Inherits IfcControl
			Property RequestID As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcActor "
		Interface IfcActor : Inherits IfcObject
			''' <summary>
			''' IsActingUpon oppositeOf RelatingActor
			''' </summary>
			Property IsActingUpon As [[IfcRelAssignsToActor]]

			Property TheActor As [[IfcActorSelect]]
		End Interface
	#End Region

	#Region " Interface IfcActorRole "
		Interface IfcActorRole
			Property Role As [[IfcRoleEnum]]

			Property UserDefinedRole As [STRING]

			Property Description As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcActuatorType "
		Interface IfcActuatorType : Inherits IfcDistributionControlElementType
			Property PredefinedType As [[IfcActuatorTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcAddress "
		Interface IfcAddress : Inherits IfcObjectReferenceSelect
			Property Purpose As [[IfcAddressTypeEnum]]

			Property Description As [STRING]

			Property UserDefinedPurpose As [STRING]

			''' <summary>
			''' OfPerson oppositeOf Addresses
			''' </summary>
			Property OfPerson As [[IfcPerson]]

			''' <summary>
			''' OfOrganization oppositeOf Addresses
			''' </summary>
			Property OfOrganization As [[IfcOrganization]]
		End Interface
	#End Region

	#Region " Interface IfcAirTerminalBoxType "
		Interface IfcAirTerminalBoxType : Inherits IfcFlowControllerType
			Property PredefinedType As [[IfcAirTerminalBoxTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcAirTerminalType "
		Interface IfcAirTerminalType : Inherits IfcFlowTerminalType
			Property PredefinedType As [[IfcAirTerminalTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcAirToAirHeatRecoveryType "
		Interface IfcAirToAirHeatRecoveryType : Inherits IfcEnergyConversionDeviceType
			Property PredefinedType As [[IfcAirToAirHeatRecoveryTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcAlarmType "
		Interface IfcAlarmType : Inherits IfcDistributionControlElementType
			Property PredefinedType As [[IfcAlarmTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcAngularDimension "
		Interface IfcAngularDimension : Inherits IfcDimensionCurveDirectedCallout
			
		End Interface
	#End Region

	#Region " Interface IfcAnnotation "
		Interface IfcAnnotation : Inherits IfcProduct
			
		End Interface
	#End Region

	#Region " Interface IfcAnnotationCurveOccurrence "
		Interface IfcAnnotationCurveOccurrence : Inherits IfcDraughtingCalloutElement, IfcAnnotationOccurrence
			''' <summary>
			''' AnnotatedBySymbols oppositeOf AnnotatedCurve
			''' </summary>
			Property AnnotatedBySymbols As [[IfcTerminatorSymbol]]
		End Interface
	#End Region

	#Region " Interface IfcAnnotationFillArea "
		Interface IfcAnnotationFillArea : Inherits IfcGeometricRepresentationItem
			Property OuterBoundary As [[IfcCurve]]

			Property InnerBoundaries As List(Of [[IfcCurve]]
		End Interface
	#End Region

	#Region " Interface IfcAnnotationFillAreaOccurrence "
		Interface IfcAnnotationFillAreaOccurrence : Inherits IfcAnnotationOccurrence
			Property FillStyleTarget As [[IfcPoint]]

			Property GlobalOrLocal As [[IfcGlobalOrLocalEnum]]
		End Interface
	#End Region

	#Region " Interface IfcAnnotationOccurrence "
		Interface IfcAnnotationOccurrence : Inherits IfcStyledItem
			
		End Interface
	#End Region

	#Region " Interface IfcAnnotationSurface "
		Interface IfcAnnotationSurface : Inherits IfcGeometricRepresentationItem
			Property Item As [[IfcGeometricRepresentationItem]]

			''' <summary>
			''' TextureCoordinates oppositeOf AnnotatedSurface
			''' </summary>
			Property TextureCoordinates As [[IfcTextureCoordinate]]
		End Interface
	#End Region

	#Region " Interface IfcAnnotationSurfaceOccurrence "
		Interface IfcAnnotationSurfaceOccurrence : Inherits IfcAnnotationOccurrence
			
		End Interface
	#End Region

	#Region " Interface IfcAnnotationSymbolOccurrence "
		Interface IfcAnnotationSymbolOccurrence : Inherits IfcDraughtingCalloutElement, IfcAnnotationOccurrence
			
		End Interface
	#End Region

	#Region " Interface IfcAnnotationTextOccurrence "
		Interface IfcAnnotationTextOccurrence : Inherits IfcDraughtingCalloutElement, IfcAnnotationOccurrence
			
		End Interface
	#End Region

	#Region " Interface IfcApplication "
		Interface IfcApplication
			Property Version As [STRING]

			Property ApplicationFullName As [STRING]

			Property ApplicationIdentifier As [STRING]

			Property ApplicationDeveloper As [[IfcOrganization]]
		End Interface
	#End Region

	#Region " Interface IfcAppliedValue "
		Interface IfcAppliedValue : Inherits IfcObjectReferenceSelect
			Property Name As [STRING]

			Property Description As [STRING]

			Property AppliedValue As [[IfcAppliedValueSelect]]

			''' <summary>
			''' ValuesReferenced oppositeOf ReferencingValues
			''' </summary>
			Property ValuesReferenced As [[IfcReferencesValueDocument]]

			''' <summary>
			''' ValueOfComponents oppositeOf ComponentOfTotal
			''' </summary>
			Property ValueOfComponents As [[IfcAppliedValueRelationship]]

			''' <summary>
			''' IsComponentIn oppositeOf Components
			''' </summary>
			Property IsComponentIn As [[IfcAppliedValueRelationship]]

			Property UnitBasis As [[IfcMeasureWithUnit]]

			Property ApplicableDate As [[IfcDateTimeSelect]]

			Property FixedUntilDate As [[IfcDateTimeSelect]]
		End Interface
	#End Region

	#Region " Interface IfcAppliedValueRelationship "
		Interface IfcAppliedValueRelationship
			Property ArithmeticOperator As [[IfcArithmeticOperatorEnum]]

			Property Name As [STRING]

			Property Description As [STRING]

			''' <summary>
			''' ComponentOfTotal oppositeOf ValueOfComponents
			''' </summary>
			Property ComponentOfTotal As [[IfcAppliedValue]]

			''' <summary>
			''' Components oppositeOf IsComponentIn
			''' </summary>
			Property Components As List(Of [[IfcAppliedValue]]
		End Interface
	#End Region

	#Region " Interface IfcApproval "
		Interface IfcApproval
			Property Description As [STRING]

			Property ApprovalStatus As [STRING]

			Property ApprovalLevel As [STRING]

			Property ApprovalQualifier As [STRING]

			Property Name As [STRING]

			Property Identifier As [STRING]

			''' <summary>
			''' Actors oppositeOf Approval
			''' </summary>
			Property Actors As [[IfcApprovalActorRelationship]]

			''' <summary>
			''' IsRelatedWith oppositeOf RelatedApproval
			''' </summary>
			Property IsRelatedWith As [[IfcApprovalRelationship]]

			''' <summary>
			''' Relates oppositeOf RelatingApproval
			''' </summary>
			Property Relates As [[IfcApprovalRelationship]]

			Property ApprovalDateTime As [[IfcDateTimeSelect]]
		End Interface
	#End Region

	#Region " Interface IfcApprovalActorRelationship "
		Interface IfcApprovalActorRelationship
			Property Actor As [[IfcActorSelect]]

			''' <summary>
			''' Approval oppositeOf Actors
			''' </summary>
			Property Approval As [[IfcApproval]]

			Property Role As [[IfcActorRole]]
		End Interface
	#End Region

	#Region " Interface IfcApprovalPropertyRelationship "
		Interface IfcApprovalPropertyRelationship
			Property ApprovedProperties As List(Of [[IfcProperty]]

			Property Approval As [[IfcApproval]]
		End Interface
	#End Region

	#Region " Interface IfcApprovalRelationship "
		Interface IfcApprovalRelationship
			Property Description As [STRING]

			Property Name As [STRING]

			''' <summary>
			''' RelatedApproval oppositeOf IsRelatedWith
			''' </summary>
			Property RelatedApproval As [[IfcApproval]]

			''' <summary>
			''' RelatingApproval oppositeOf Relates
			''' </summary>
			Property RelatingApproval As [[IfcApproval]]
		End Interface
	#End Region

	#Region " Interface IfcArbitraryClosedProfileDef "
		Interface IfcArbitraryClosedProfileDef : Inherits IfcProfileDef
			Property OuterCurve As [[IfcCurve]]
		End Interface
	#End Region

	#Region " Interface IfcArbitraryOpenProfileDef "
		Interface IfcArbitraryOpenProfileDef : Inherits IfcProfileDef
			Property Curve As [[IfcBoundedCurve]]
		End Interface
	#End Region

	#Region " Interface IfcArbitraryProfileDefWithVoids "
		Interface IfcArbitraryProfileDefWithVoids : Inherits IfcArbitraryClosedProfileDef
			Property InnerCurves As List(Of [[IfcCurve]]
		End Interface
	#End Region

	#Region " Interface IfcAsset "
		Interface IfcAsset : Inherits IfcGroup
			Property OriginalValue As [[IfcCostValue]]

			Property CurrentValue As [[IfcCostValue]]

			Property TotalReplacementCost As [[IfcCostValue]]

			Property Owner As [[IfcActorSelect]]

			Property User As [[IfcActorSelect]]

			Property ResponsiblePerson As [[IfcPerson]]

			Property IncorporationDate As [[IfcCalendarDate]]

			Property DepreciatedValue As [[IfcCostValue]]

			Property AssetID As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcAsymmetricIShapeProfileDef "
		Interface IfcAsymmetricIShapeProfileDef : Inherits IfcIShapeProfileDef
			Property TopFlangeWidth As REAL

			Property TopFlangeThickness As REAL

			Property TopFlangeFilletRadius As REAL

			Property CentreOfGravityInY As REAL
		End Interface
	#End Region

	#Region " Interface IfcAxis1Placement "
		Interface IfcAxis1Placement : Inherits IfcPlacement
			Property Axis As [[IfcDirection]]
		End Interface
	#End Region

	#Region " Interface IfcAxis2Placement2D "
		Interface IfcAxis2Placement2D : Inherits IfcAxis2Placement, IfcPlacement
			Property RefDirection As [[IfcDirection]]
		End Interface
	#End Region

	#Region " Interface IfcAxis2Placement3D "
		Interface IfcAxis2Placement3D : Inherits IfcAxis2Placement, IfcPlacement
			Property Axis As [[IfcDirection]]

			Property RefDirection As [[IfcDirection]]
		End Interface
	#End Region

	#Region " Interface IfcBSplineCurve "
		Interface IfcBSplineCurve : Inherits IfcBoundedCurve
			Property Degree As [INTEGER]

			Property CurveForm As [[IfcBSplineCurveForm]]

			Property ClosedCurve As LOGICAL

			Property SelfIntersect As LOGICAL

			Property ControlPointsList As List(Of [[IfcCartesianPoint]]
		End Interface
	#End Region

	#Region " Interface IfcBeam "
		Interface IfcBeam : Inherits IfcBuildingElement
			
		End Interface
	#End Region

	#Region " Interface IfcBeamType "
		Interface IfcBeamType : Inherits IfcBuildingElementType
			Property PredefinedType As [[IfcBeamTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcBezierCurve "
		Interface IfcBezierCurve : Inherits IfcBSplineCurve
			
		End Interface
	#End Region

	#Region " Interface IfcBlobTexture "
		Interface IfcBlobTexture : Inherits IfcSurfaceTexture
			Property RasterFormat As [STRING]

			Property RasterCode As [BOOLEAN]
		End Interface
	#End Region

	#Region " Interface IfcBlock "
		Interface IfcBlock : Inherits IfcCsgPrimitive3D
			Property XLength As REAL

			Property YLength As REAL

			Property ZLength As REAL
		End Interface
	#End Region

	#Region " Interface IfcBoilerType "
		Interface IfcBoilerType : Inherits IfcEnergyConversionDeviceType
			Property PredefinedType As [[IfcBoilerTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcBooleanClippingResult "
		Interface IfcBooleanClippingResult : Inherits IfcBooleanResult
			
		End Interface
	#End Region

	#Region " Interface IfcBooleanResult "
		Interface IfcBooleanResult : Inherits IfcBooleanOperand, IfcCsgSelect, IfcGeometricRepresentationItem
			Property FirstOperand As [[IfcBooleanOperand]]

			Property SecondOperand As [[IfcBooleanOperand]]

			Property Operator As [[IfcBooleanOperator]]
		End Interface
	#End Region

	#Region " Interface IfcBoundaryCondition "
		Interface IfcBoundaryCondition
			Property Name As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcBoundaryEdgeCondition "
		Interface IfcBoundaryEdgeCondition : Inherits IfcBoundaryCondition
			Property LinearStiffnessByLengthX As REAL

			Property LinearStiffnessByLengthY As REAL

			Property LinearStiffnessByLengthZ As REAL

			Property RotationalStiffnessByLengthX As REAL

			Property RotationalStiffnessByLengthY As REAL

			Property RotationalStiffnessByLengthZ As REAL
		End Interface
	#End Region

	#Region " Interface IfcBoundaryFaceCondition "
		Interface IfcBoundaryFaceCondition : Inherits IfcBoundaryCondition
			Property LinearStiffnessByAreaX As REAL

			Property LinearStiffnessByAreaY As REAL

			Property LinearStiffnessByAreaZ As REAL
		End Interface
	#End Region

	#Region " Interface IfcBoundaryNodeCondition "
		Interface IfcBoundaryNodeCondition : Inherits IfcBoundaryCondition
			Property LinearStiffnessX As REAL

			Property LinearStiffnessY As REAL

			Property LinearStiffnessZ As REAL

			Property RotationalStiffnessX As REAL

			Property RotationalStiffnessY As REAL

			Property RotationalStiffnessZ As REAL
		End Interface
	#End Region

	#Region " Interface IfcBoundaryNodeConditionWarping "
		Interface IfcBoundaryNodeConditionWarping : Inherits IfcBoundaryNodeCondition
			Property WarpingStiffness As REAL
		End Interface
	#End Region

	#Region " Interface IfcBoundedCurve "
		Interface IfcBoundedCurve : Inherits IfcCurveOrEdgeCurve, IfcCurve
			
		End Interface
	#End Region

	#Region " Interface IfcBoundedSurface "
		Interface IfcBoundedSurface : Inherits IfcSurface
			
		End Interface
	#End Region

	#Region " Interface IfcBoundingBox "
		Interface IfcBoundingBox : Inherits IfcGeometricRepresentationItem
			Property XDim As REAL

			Property YDim As REAL

			Property ZDim As REAL

			Property Corner As [[IfcCartesianPoint]]
		End Interface
	#End Region

	#Region " Interface IfcBoxedHalfSpace "
		Interface IfcBoxedHalfSpace : Inherits IfcHalfSpaceSolid
			Property Enclosure As [[IfcBoundingBox]]
		End Interface
	#End Region

	#Region " Interface IfcBuilding "
		Interface IfcBuilding : Inherits IfcSpatialStructureElement
			Property ElevationOfRefHeight As REAL

			Property ElevationOfTerrain As REAL

			Property BuildingAddress As [[IfcPostalAddress]]
		End Interface
	#End Region

	#Region " Interface IfcBuildingElement "
		Interface IfcBuildingElement : Inherits IfcElement
			
		End Interface
	#End Region

	#Region " Interface IfcBuildingElementComponent "
		Interface IfcBuildingElementComponent : Inherits IfcBuildingElement
			
		End Interface
	#End Region

	#Region " Interface IfcBuildingElementPart "
		Interface IfcBuildingElementPart : Inherits IfcBuildingElementComponent
			
		End Interface
	#End Region

	#Region " Interface IfcBuildingElementProxy "
		Interface IfcBuildingElementProxy : Inherits IfcBuildingElement
			Property CompositionType As [[IfcElementCompositionEnum]]
		End Interface
	#End Region

	#Region " Interface IfcBuildingElementProxyType "
		Interface IfcBuildingElementProxyType : Inherits IfcBuildingElementType
			Property PredefinedType As [[IfcBuildingElementProxyTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcBuildingElementType "
		Interface IfcBuildingElementType : Inherits IfcElementType
			
		End Interface
	#End Region

	#Region " Interface IfcBuildingStorey "
		Interface IfcBuildingStorey : Inherits IfcSpatialStructureElement
			Property Elevation As REAL
		End Interface
	#End Region

	#Region " Interface IfcCShapeProfileDef "
		Interface IfcCShapeProfileDef : Inherits IfcParameterizedProfileDef
			Property Depth As REAL

			Property Width As REAL

			Property WallThickness As REAL

			Property Girth As REAL

			Property InternalFilletRadius As REAL

			Property CentreOfGravityInX As REAL
		End Interface
	#End Region

	#Region " Interface IfcCableCarrierFittingType "
		Interface IfcCableCarrierFittingType : Inherits IfcFlowFittingType
			Property PredefinedType As [[IfcCableCarrierFittingTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcCableCarrierSegmentType "
		Interface IfcCableCarrierSegmentType : Inherits IfcFlowSegmentType
			Property PredefinedType As [[IfcCableCarrierSegmentTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcCableSegmentType "
		Interface IfcCableSegmentType : Inherits IfcFlowSegmentType
			Property PredefinedType As [[IfcCableSegmentTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcCalendarDate "
		Interface IfcCalendarDate : Inherits IfcDateTimeSelect, IfcObjectReferenceSelect
			Property DayComponent As [INTEGER]

			Property MonthComponent As [INTEGER]

			Property YearComponent As [INTEGER]
		End Interface
	#End Region

	#Region " Interface IfcCartesianPoint "
		Interface IfcCartesianPoint : Inherits IfcPoint
			Property Coordinates As REAL
		End Interface
	#End Region

	#Region " Interface IfcCartesianTransformationOperator "
		Interface IfcCartesianTransformationOperator : Inherits IfcGeometricRepresentationItem
			Property Axis1 As [[IfcDirection]]

			Property Axis2 As [[IfcDirection]]

			Property LocalOrigin As [[IfcCartesianPoint]]

			Property Scale As REAL
		End Interface
	#End Region

	#Region " Interface IfcCartesianTransformationOperator2D "
		Interface IfcCartesianTransformationOperator2D : Inherits IfcCartesianTransformationOperator
			
		End Interface
	#End Region

	#Region " Interface IfcCartesianTransformationOperator2DnonUniform "
		Interface IfcCartesianTransformationOperator2DnonUniform : Inherits IfcCartesianTransformationOperator2D
			Property Scale2 As REAL
		End Interface
	#End Region

	#Region " Interface IfcCartesianTransformationOperator3D "
		Interface IfcCartesianTransformationOperator3D : Inherits IfcCartesianTransformationOperator
			Property Axis3 As [[IfcDirection]]
		End Interface
	#End Region

	#Region " Interface IfcCartesianTransformationOperator3DnonUniform "
		Interface IfcCartesianTransformationOperator3DnonUniform : Inherits IfcCartesianTransformationOperator3D
			Property Scale2 As REAL

			Property Scale3 As REAL
		End Interface
	#End Region

	#Region " Interface IfcCenterLineProfileDef "
		Interface IfcCenterLineProfileDef : Inherits IfcArbitraryOpenProfileDef
			Property Thickness As REAL
		End Interface
	#End Region

	#Region " Interface IfcChamferEdgeFeature "
		Interface IfcChamferEdgeFeature : Inherits IfcEdgeFeature
			Property Width As REAL

			Property Height As REAL
		End Interface
	#End Region

	#Region " Interface IfcChillerType "
		Interface IfcChillerType : Inherits IfcEnergyConversionDeviceType
			Property PredefinedType As [[IfcChillerTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcCircle "
		Interface IfcCircle : Inherits IfcConic
			Property Radius As REAL
		End Interface
	#End Region

	#Region " Interface IfcCircleHollowProfileDef "
		Interface IfcCircleHollowProfileDef : Inherits IfcCircleProfileDef
			Property WallThickness As REAL
		End Interface
	#End Region

	#Region " Interface IfcCircleProfileDef "
		Interface IfcCircleProfileDef : Inherits IfcParameterizedProfileDef
			Property Radius As REAL
		End Interface
	#End Region

	#Region " Interface IfcClassification "
		Interface IfcClassification
			Property Source As [STRING]

			Property Edition As [STRING]

			Property Name As [STRING]

			''' <summary>
			''' Contains oppositeOf ItemOf
			''' </summary>
			Property Contains As [[IfcClassificationItem]]

			Property EditionDate As [[IfcCalendarDate]]
		End Interface
	#End Region

	#Region " Interface IfcClassificationItem "
		Interface IfcClassificationItem
			''' <summary>
			''' IsClassifiedItemIn oppositeOf RelatedItems
			''' </summary>
			Property IsClassifiedItemIn As [[IfcClassificationItemRelationship]]

			''' <summary>
			''' IsClassifyingItemIn oppositeOf RelatingItem
			''' </summary>
			Property IsClassifyingItemIn As [[IfcClassificationItemRelationship]]

			Property Notation As [[IfcClassificationNotationFacet]]

			''' <summary>
			''' ItemOf oppositeOf Contains
			''' </summary>
			Property ItemOf As [[IfcClassification]]

			Property Title As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcClassificationItemRelationship "
		Interface IfcClassificationItemRelationship
			''' <summary>
			''' RelatingItem oppositeOf IsClassifyingItemIn
			''' </summary>
			Property RelatingItem As [[IfcClassificationItem]]

			''' <summary>
			''' RelatedItems oppositeOf IsClassifiedItemIn
			''' </summary>
			Property RelatedItems As List(Of [[IfcClassificationItem]]
		End Interface
	#End Region

	#Region " Interface IfcClassificationNotation "
		Interface IfcClassificationNotation : Inherits IfcClassificationNotationSelect
			Property NotationFacets As List(Of [[IfcClassificationNotationFacet]]
		End Interface
	#End Region

	#Region " Interface IfcClassificationNotationFacet "
		Interface IfcClassificationNotationFacet
			Property NotationValue As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcClassificationReference "
		Interface IfcClassificationReference : Inherits IfcClassificationNotationSelect, IfcExternalReference
			Property ReferencedSource As [[IfcClassification]]
		End Interface
	#End Region

	#Region " Interface IfcClosedShell "
		Interface IfcClosedShell : Inherits IfcShell, IfcConnectedFaceSet
			
		End Interface
	#End Region

	#Region " Interface IfcCoilType "
		Interface IfcCoilType : Inherits IfcEnergyConversionDeviceType
			Property PredefinedType As [[IfcCoilTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcColourRgb "
		Interface IfcColourRgb : Inherits IfcColourSpecification
			Property Red As REAL

			Property Green As REAL

			Property Blue As REAL
		End Interface
	#End Region

	#Region " Interface IfcColourSpecification "
		Interface IfcColourSpecification : Inherits IfcColour
			Property Name As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcColumn "
		Interface IfcColumn : Inherits IfcBuildingElement
			
		End Interface
	#End Region

	#Region " Interface IfcColumnType "
		Interface IfcColumnType : Inherits IfcBuildingElementType
			Property PredefinedType As [[IfcColumnTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcComplexProperty "
		Interface IfcComplexProperty : Inherits IfcProperty
			''' <summary>
			''' HasProperties oppositeOf PartOfComplex
			''' </summary>
			Property HasProperties As List(Of [[IfcProperty]]

			Property UsageName As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcCompositeCurve "
		Interface IfcCompositeCurve : Inherits IfcBoundedCurve
			''' <summary>
			''' Segments oppositeOf UsingCurves
			''' </summary>
			Property Segments As List(Of [[IfcCompositeCurveSegment]]

			Property SelfIntersect As LOGICAL
		End Interface
	#End Region

	#Region " Interface IfcCompositeCurveSegment "
		Interface IfcCompositeCurveSegment : Inherits IfcGeometricRepresentationItem
			Property Transition As [[IfcTransitionCode]]

			Property SameSense As [BOOLEAN]

			''' <summary>
			''' UsingCurves oppositeOf Segments
			''' </summary>
			Property UsingCurves As [[IfcCompositeCurve]]

			Property ParentCurve As [[IfcCurve]]
		End Interface
	#End Region

	#Region " Interface IfcCompositeProfileDef "
		Interface IfcCompositeProfileDef : Inherits IfcProfileDef
			Property Profiles As List(Of [[IfcProfileDef]]

			Property Label As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcCompressorType "
		Interface IfcCompressorType : Inherits IfcFlowMovingDeviceType
			Property PredefinedType As [[IfcCompressorTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcCondenserType "
		Interface IfcCondenserType : Inherits IfcEnergyConversionDeviceType
			Property PredefinedType As [[IfcCondenserTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcCondition "
		Interface IfcCondition : Inherits IfcGroup
			
		End Interface
	#End Region

	#Region " Interface IfcConditionCriterion "
		Interface IfcConditionCriterion : Inherits IfcControl
			Property Criterion As [[IfcConditionCriterionSelect]]

			Property CriterionDateTime As [[IfcDateTimeSelect]]
		End Interface
	#End Region

	#Region " Interface IfcConic "
		Interface IfcConic : Inherits IfcCurve
			Property Position As [[IfcAxis2Placement]]
		End Interface
	#End Region

	#Region " Interface IfcConnectedFaceSet "
		Interface IfcConnectedFaceSet : Inherits IfcTopologicalRepresentationItem
			Property CfsFaces As List(Of [[IfcFace]]
		End Interface
	#End Region

	#Region " Interface IfcConnectionCurveGeometry "
		Interface IfcConnectionCurveGeometry : Inherits IfcConnectionGeometry
			Property CurveOnRelatingElement As [[IfcCurveOrEdgeCurve]]

			Property CurveOnRelatedElement As [[IfcCurveOrEdgeCurve]]
		End Interface
	#End Region

	#Region " Interface IfcConnectionGeometry "
		Interface IfcConnectionGeometry
			
		End Interface
	#End Region

	#Region " Interface IfcConnectionPointEccentricity "
		Interface IfcConnectionPointEccentricity : Inherits IfcConnectionPointGeometry
			Property EccentricityInX As REAL

			Property EccentricityInY As REAL

			Property EccentricityInZ As REAL
		End Interface
	#End Region

	#Region " Interface IfcConnectionPointGeometry "
		Interface IfcConnectionPointGeometry : Inherits IfcConnectionGeometry
			Property PointOnRelatingElement As [[IfcPointOrVertexPoint]]

			Property PointOnRelatedElement As [[IfcPointOrVertexPoint]]
		End Interface
	#End Region

	#Region " Interface IfcConnectionPortGeometry "
		Interface IfcConnectionPortGeometry : Inherits IfcConnectionGeometry
			Property LocationAtRelatingElement As [[IfcAxis2Placement]]

			Property LocationAtRelatedElement As [[IfcAxis2Placement]]

			Property ProfileOfPort As [[IfcProfileDef]]
		End Interface
	#End Region

	#Region " Interface IfcConnectionSurfaceGeometry "
		Interface IfcConnectionSurfaceGeometry : Inherits IfcConnectionGeometry
			Property SurfaceOnRelatingElement As [[IfcSurfaceOrFaceSurface]]

			Property SurfaceOnRelatedElement As [[IfcSurfaceOrFaceSurface]]
		End Interface
	#End Region

	#Region " Interface IfcConstraint "
		Interface IfcConstraint
			Property Name As [STRING]

			Property Description As [STRING]

			Property ConstraintGrade As [[IfcConstraintEnum]]

			Property ConstraintSource As [STRING]

			Property UserDefinedGrade As [STRING]

			''' <summary>
			''' ClassifiedAs oppositeOf ClassifiedConstraint
			''' </summary>
			Property ClassifiedAs As [[IfcConstraintClassificationRelationship]]

			''' <summary>
			''' RelatesConstraints oppositeOf RelatingConstraint
			''' </summary>
			Property RelatesConstraints As [[IfcConstraintRelationship]]

			''' <summary>
			''' IsRelatedWith oppositeOf RelatedConstraints
			''' </summary>
			Property IsRelatedWith As [[IfcConstraintRelationship]]

			''' <summary>
			''' PropertiesForConstraint oppositeOf RelatingConstraint
			''' </summary>
			Property PropertiesForConstraint As [[IfcPropertyConstraintRelationship]]

			''' <summary>
			''' Aggregates oppositeOf RelatingConstraint
			''' </summary>
			Property Aggregates As [[IfcConstraintAggregationRelationship]]

			''' <summary>
			''' IsAggregatedIn oppositeOf RelatedConstraints
			''' </summary>
			Property IsAggregatedIn As [[IfcConstraintAggregationRelationship]]

			Property CreatingActor As [[IfcActorSelect]]

			Property CreationTime As [[IfcDateTimeSelect]]
		End Interface
	#End Region

	#Region " Interface IfcConstraintAggregationRelationship "
		Interface IfcConstraintAggregationRelationship
			Property Name As [STRING]

			Property Description As [STRING]

			Property LogicalAggregator As [[IfcLogicalOperatorEnum]]

			''' <summary>
			''' RelatingConstraint oppositeOf Aggregates
			''' </summary>
			Property RelatingConstraint As [[IfcConstraint]]

			''' <summary>
			''' RelatedConstraints oppositeOf IsAggregatedIn
			''' </summary>
			Property RelatedConstraints As List(Of [[IfcConstraint]]
		End Interface
	#End Region

	#Region " Interface IfcConstraintClassificationRelationship "
		Interface IfcConstraintClassificationRelationship
			''' <summary>
			''' ClassifiedConstraint oppositeOf ClassifiedAs
			''' </summary>
			Property ClassifiedConstraint As [[IfcConstraint]]

			Property RelatedClassifications As List(Of [[IfcClassificationNotationSelect]]
		End Interface
	#End Region

	#Region " Interface IfcConstraintRelationship "
		Interface IfcConstraintRelationship
			Property Name As [STRING]

			Property Description As [STRING]

			''' <summary>
			''' RelatingConstraint oppositeOf RelatesConstraints
			''' </summary>
			Property RelatingConstraint As [[IfcConstraint]]

			''' <summary>
			''' RelatedConstraints oppositeOf IsRelatedWith
			''' </summary>
			Property RelatedConstraints As List(Of [[IfcConstraint]]
		End Interface
	#End Region

	#Region " Interface IfcConstructionEquipmentResource "
		Interface IfcConstructionEquipmentResource : Inherits IfcConstructionResource
			
		End Interface
	#End Region

	#Region " Interface IfcConstructionMaterialResource "
		Interface IfcConstructionMaterialResource : Inherits IfcConstructionResource
			Property Suppliers As List(Of [[IfcActorSelect]]

			Property UsageRatio As REAL
		End Interface
	#End Region

	#Region " Interface IfcConstructionProductResource "
		Interface IfcConstructionProductResource : Inherits IfcConstructionResource
			
		End Interface
	#End Region

	#Region " Interface IfcConstructionResource "
		Interface IfcConstructionResource : Inherits IfcResource
			Property ResourceIdentifier As [STRING]

			Property ResourceGroup As [STRING]

			Property ResourceConsumption As [[IfcResourceConsumptionEnum]]

			Property BaseQuantity As [[IfcMeasureWithUnit]]
		End Interface
	#End Region

	#Region " Interface IfcContextDependentUnit "
		Interface IfcContextDependentUnit : Inherits IfcNamedUnit
			Property Name As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcControl "
		Interface IfcControl : Inherits IfcObject
			''' <summary>
			''' Controls oppositeOf RelatingControl
			''' </summary>
			Property Controls As [[IfcRelAssignsToControl]]
		End Interface
	#End Region

	#Region " Interface IfcControllerType "
		Interface IfcControllerType : Inherits IfcDistributionControlElementType
			Property PredefinedType As [[IfcControllerTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcConversionBasedUnit "
		Interface IfcConversionBasedUnit : Inherits IfcNamedUnit
			Property ConversionFactor As [[IfcMeasureWithUnit]]

			Property Name As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcCooledBeamType "
		Interface IfcCooledBeamType : Inherits IfcEnergyConversionDeviceType
			Property PredefinedType As [[IfcCooledBeamTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcCoolingTowerType "
		Interface IfcCoolingTowerType : Inherits IfcEnergyConversionDeviceType
			Property PredefinedType As [[IfcCoolingTowerTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcCoordinatedUniversalTimeOffset "
		Interface IfcCoordinatedUniversalTimeOffset
			Property HourOffset As [INTEGER]

			Property MinuteOffset As [INTEGER]

			Property Sense As [[IfcAheadOrBehind]]
		End Interface
	#End Region

	#Region " Interface IfcCostItem "
		Interface IfcCostItem : Inherits IfcControl
			
		End Interface
	#End Region

	#Region " Interface IfcCostSchedule "
		Interface IfcCostSchedule : Inherits IfcControl
			Property Status As [STRING]

			Property ID As [STRING]

			Property PredefinedType As [[IfcCostScheduleTypeEnum]]

			Property SubmittedBy As [[IfcActorSelect]]

			Property PreparedBy As [[IfcActorSelect]]

			Property SubmittedOn As [[IfcDateTimeSelect]]

			Property TargetUsers As List(Of [[IfcActorSelect]]

			Property UpdateDate As [[IfcDateTimeSelect]]
		End Interface
	#End Region

	#Region " Interface IfcCostValue "
		Interface IfcCostValue : Inherits IfcAppliedValue
			Property CostType As [STRING]

			Property Condition As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcCovering "
		Interface IfcCovering : Inherits IfcBuildingElement
			''' <summary>
			''' CoversSpaces oppositeOf RelatedCoverings
			''' </summary>
			Property CoversSpaces As [[IfcRelCoversSpaces]]

			''' <summary>
			''' Covers oppositeOf RelatedCoverings
			''' </summary>
			Property Covers As [[IfcRelCoversBldgElements]]

			Property PredefinedType As [[IfcCoveringTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcCoveringType "
		Interface IfcCoveringType : Inherits IfcBuildingElementType
			Property PredefinedType As [[IfcCoveringTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcCraneRailAShapeProfileDef "
		Interface IfcCraneRailAShapeProfileDef : Inherits IfcParameterizedProfileDef
			Property OverallHeight As REAL

			Property BaseWidth2 As REAL

			Property Radius As REAL

			Property HeadWidth As REAL

			Property HeadDepth2 As REAL

			Property HeadDepth3 As REAL

			Property WebThickness As REAL

			Property BaseWidth4 As REAL

			Property BaseDepth1 As REAL

			Property BaseDepth2 As REAL

			Property BaseDepth3 As REAL

			Property CentreOfGravityInY As REAL
		End Interface
	#End Region

	#Region " Interface IfcCraneRailFShapeProfileDef "
		Interface IfcCraneRailFShapeProfileDef : Inherits IfcParameterizedProfileDef
			Property OverallHeight As REAL

			Property HeadWidth As REAL

			Property Radius As REAL

			Property HeadDepth2 As REAL

			Property HeadDepth3 As REAL

			Property WebThickness As REAL

			Property BaseDepth1 As REAL

			Property BaseDepth2 As REAL

			Property CentreOfGravityInY As REAL
		End Interface
	#End Region

	#Region " Interface IfcCrewResource "
		Interface IfcCrewResource : Inherits IfcConstructionResource
			
		End Interface
	#End Region

	#Region " Interface IfcCsgPrimitive3D "
		Interface IfcCsgPrimitive3D : Inherits IfcBooleanOperand, IfcCsgSelect, IfcGeometricRepresentationItem
			Property Position As [[IfcAxis2Placement3D]]
		End Interface
	#End Region

	#Region " Interface IfcCsgSolid "
		Interface IfcCsgSolid : Inherits IfcSolidModel
			Property TreeRootExpression As [[IfcCsgSelect]]
		End Interface
	#End Region

	#Region " Interface IfcCurrencyRelationship "
		Interface IfcCurrencyRelationship
			Property RelatingMonetaryUnit As [[IfcMonetaryUnit]]

			Property RelatedMonetaryUnit As [[IfcMonetaryUnit]]

			Property RateDateTime As [[IfcDateAndTime]]

			Property RateSource As [[IfcLibraryInformation]]

			Property ExchangeRate As REAL
		End Interface
	#End Region

	#Region " Interface IfcCurtainWall "
		Interface IfcCurtainWall : Inherits IfcBuildingElement
			
		End Interface
	#End Region

	#Region " Interface IfcCurtainWallType "
		Interface IfcCurtainWallType : Inherits IfcBuildingElementType
			Property PredefinedType As [[IfcCurtainWallTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcCurve "
		Interface IfcCurve : Inherits IfcGeometricSetSelect, IfcGeometricRepresentationItem
			
		End Interface
	#End Region

	#Region " Interface IfcCurveBoundedPlane "
		Interface IfcCurveBoundedPlane : Inherits IfcBoundedSurface
			Property BasisSurface As [[IfcPlane]]

			Property OuterBoundary As [[IfcCurve]]

			Property InnerBoundaries As List(Of [[IfcCurve]]
		End Interface
	#End Region

	#Region " Interface IfcCurveStyle "
		Interface IfcCurveStyle : Inherits IfcPresentationStyle
			Property CurveFont As [[IfcCurveFontOrScaledCurveFontSelect]]

			Property CurveWidth As [[IfcSizeSelect]]

			Property CurveColour As [[IfcColour]]
		End Interface
	#End Region

	#Region " Interface IfcCurveStyleFont "
		Interface IfcCurveStyleFont : Inherits IfcCurveStyleFontSelect
			Property PatternList As List(Of [[IfcCurveStyleFontPattern]]

			Property Name As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcCurveStyleFontAndScaling "
		Interface IfcCurveStyleFontAndScaling : Inherits IfcCurveFontOrScaledCurveFontSelect
			Property Name As [STRING]

			Property CurveFontScaling As REAL

			Property CurveFont As [[IfcCurveStyleFontSelect]]
		End Interface
	#End Region

	#Region " Interface IfcCurveStyleFontPattern "
		Interface IfcCurveStyleFontPattern
			Property VisibleSegmentLength As REAL

			Property InvisibleSegmentLength As REAL
		End Interface
	#End Region

	#Region " Interface IfcDamperType "
		Interface IfcDamperType : Inherits IfcFlowControllerType
			Property PredefinedType As [[IfcDamperTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcDateAndTime "
		Interface IfcDateAndTime : Inherits IfcDateTimeSelect, IfcObjectReferenceSelect
			Property DateComponent As [[IfcCalendarDate]]

			Property TimeComponent As [[IfcLocalTime]]
		End Interface
	#End Region

	#Region " Interface IfcDefinedSymbol "
		Interface IfcDefinedSymbol : Inherits IfcGeometricRepresentationItem
			Property Definition As [[IfcDefinedSymbolSelect]]

			Property Target As [[IfcCartesianTransformationOperator2D]]
		End Interface
	#End Region

	#Region " Interface IfcDerivedProfileDef "
		Interface IfcDerivedProfileDef : Inherits IfcProfileDef
			Property ParentProfile As [[IfcProfileDef]]

			Property Operator As [[IfcCartesianTransformationOperator2D]]

			Property Label As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcDerivedUnit "
		Interface IfcDerivedUnit : Inherits IfcUnit
			Property UnitType As [[IfcDerivedUnitEnum]]

			Property UserDefinedType As [STRING]

			Property Elements As List(Of [[IfcDerivedUnitElement]]
		End Interface
	#End Region

	#Region " Interface IfcDerivedUnitElement "
		Interface IfcDerivedUnitElement
			Property Unit As [[IfcNamedUnit]]

			Property Exponent As [INTEGER]
		End Interface
	#End Region

	#Region " Interface IfcDiameterDimension "
		Interface IfcDiameterDimension : Inherits IfcDimensionCurveDirectedCallout
			
		End Interface
	#End Region

	#Region " Interface IfcDimensionCalloutRelationship "
		Interface IfcDimensionCalloutRelationship : Inherits IfcDraughtingCalloutRelationship
			
		End Interface
	#End Region

	#Region " Interface IfcDimensionCurve "
		Interface IfcDimensionCurve : Inherits IfcAnnotationCurveOccurrence
			
		End Interface
	#End Region

	#Region " Interface IfcDimensionCurveDirectedCallout "
		Interface IfcDimensionCurveDirectedCallout : Inherits IfcDraughtingCallout
			
		End Interface
	#End Region

	#Region " Interface IfcDimensionCurveTerminator "
		Interface IfcDimensionCurveTerminator : Inherits IfcTerminatorSymbol
			Property Role As [[IfcDimensionExtentUsage]]
		End Interface
	#End Region

	#Region " Interface IfcDimensionPair "
		Interface IfcDimensionPair : Inherits IfcDraughtingCalloutRelationship
			
		End Interface
	#End Region

	#Region " Interface IfcDimensionalExponents "
		Interface IfcDimensionalExponents
			Property LengthExponent As [INTEGER]

			Property MassExponent As [INTEGER]

			Property TimeExponent As [INTEGER]

			Property ElectricCurrentExponent As [INTEGER]

			Property ThermodynamicTemperatureExponent As [INTEGER]

			Property AmountOfSubstanceExponent As [INTEGER]

			Property LuminousIntensityExponent As [INTEGER]
		End Interface
	#End Region

	#Region " Interface IfcDirection "
		Interface IfcDirection : Inherits IfcVectorOrDirection, IfcGeometricRepresentationItem
			Property DirectionRatios As REAL
		End Interface
	#End Region

	#Region " Interface IfcDiscreteAccessory "
		Interface IfcDiscreteAccessory : Inherits IfcElementComponent
			
		End Interface
	#End Region

	#Region " Interface IfcDiscreteAccessoryType "
		Interface IfcDiscreteAccessoryType : Inherits IfcElementComponentType
			
		End Interface
	#End Region

	#Region " Interface IfcDistributionChamberElement "
		Interface IfcDistributionChamberElement : Inherits IfcDistributionFlowElement
			
		End Interface
	#End Region

	#Region " Interface IfcDistributionChamberElementType "
		Interface IfcDistributionChamberElementType : Inherits IfcDistributionFlowElementType
			Property PredefinedType As [[IfcDistributionChamberElementTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcDistributionControlElement "
		Interface IfcDistributionControlElement : Inherits IfcDistributionElement
			''' <summary>
			''' AssignedToFlowElement oppositeOf RelatedControlElements
			''' </summary>
			Property AssignedToFlowElement As [[IfcRelFlowControlElements]]

			Property ControlElementId As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcDistributionControlElementType "
		Interface IfcDistributionControlElementType : Inherits IfcDistributionElementType
			
		End Interface
	#End Region

	#Region " Interface IfcDistributionElement "
		Interface IfcDistributionElement : Inherits IfcElement
			
		End Interface
	#End Region

	#Region " Interface IfcDistributionElementType "
		Interface IfcDistributionElementType : Inherits IfcElementType
			
		End Interface
	#End Region

	#Region " Interface IfcDistributionFlowElement "
		Interface IfcDistributionFlowElement : Inherits IfcDistributionElement
			''' <summary>
			''' HasControlElements oppositeOf RelatingFlowElement
			''' </summary>
			Property HasControlElements As [[IfcRelFlowControlElements]]
		End Interface
	#End Region

	#Region " Interface IfcDistributionFlowElementType "
		Interface IfcDistributionFlowElementType : Inherits IfcDistributionElementType
			
		End Interface
	#End Region

	#Region " Interface IfcDistributionPort "
		Interface IfcDistributionPort : Inherits IfcPort
			Property FlowDirection As [[IfcFlowDirectionEnum]]
		End Interface
	#End Region

	#Region " Interface IfcDocumentElectronicFormat "
		Interface IfcDocumentElectronicFormat
			Property FileExtension As [STRING]

			Property MimeContentType As [STRING]

			Property MimeSubtype As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcDocumentInformation "
		Interface IfcDocumentInformation : Inherits IfcDocumentSelect
			Property DocumentId As [STRING]

			Property Name As [STRING]

			Property Description As [STRING]

			Property Purpose As [STRING]

			Property IntendedUse As [STRING]

			Property Scope As [STRING]

			Property Revision As [STRING]

			Property Confidentiality As [[IfcDocumentConfidentialityEnum]]

			Property Status As [[IfcDocumentStatusEnum]]

			''' <summary>
			''' IsPointedTo oppositeOf RelatedDocuments
			''' </summary>
			Property IsPointedTo As [[IfcDocumentInformationRelationship]]

			''' <summary>
			''' IsPointer oppositeOf RelatingDocument
			''' </summary>
			Property IsPointer As [[IfcDocumentInformationRelationship]]

			''' <summary>
			''' DocumentReferences oppositeOf ReferenceToDocument
			''' </summary>
			Property DocumentReferences As List(Of [[IfcDocumentReference]]

			Property DocumentOwner As [[IfcActorSelect]]

			Property Editors As List(Of [[IfcActorSelect]]

			Property CreationTime As [[IfcDateAndTime]]

			Property LastRevisionTime As [[IfcDateAndTime]]

			Property ElectronicFormat As [[IfcDocumentElectronicFormat]]

			Property ValidFrom As [[IfcCalendarDate]]

			Property ValidUntil As [[IfcCalendarDate]]
		End Interface
	#End Region

	#Region " Interface IfcDocumentInformationRelationship "
		Interface IfcDocumentInformationRelationship
			''' <summary>
			''' RelatingDocument oppositeOf IsPointer
			''' </summary>
			Property RelatingDocument As [[IfcDocumentInformation]]

			''' <summary>
			''' RelatedDocuments oppositeOf IsPointedTo
			''' </summary>
			Property RelatedDocuments As List(Of [[IfcDocumentInformation]]

			Property RelationshipType As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcDocumentReference "
		Interface IfcDocumentReference : Inherits IfcDocumentSelect, IfcExternalReference
			''' <summary>
			''' ReferenceToDocument oppositeOf DocumentReferences
			''' </summary>
			Property ReferenceToDocument As [[IfcDocumentInformation]]
		End Interface
	#End Region

	#Region " Interface IfcDoor "
		Interface IfcDoor : Inherits IfcBuildingElement
			Property OverallHeight As REAL

			Property OverallWidth As REAL
		End Interface
	#End Region

	#Region " Interface IfcDoorLiningProperties "
		Interface IfcDoorLiningProperties : Inherits IfcPropertySetDefinition
			Property LiningDepth As REAL

			Property LiningThickness As REAL

			Property ThresholdDepth As REAL

			Property ThresholdThickness As REAL

			Property TransomThickness As REAL

			Property TransomOffset As REAL

			Property LiningOffset As REAL

			Property ThresholdOffset As REAL

			Property CasingThickness As REAL

			Property CasingDepth As REAL

			Property ShapeAspectStyle As [[IfcShapeAspect]]
		End Interface
	#End Region

	#Region " Interface IfcDoorPanelProperties "
		Interface IfcDoorPanelProperties : Inherits IfcPropertySetDefinition
			Property PanelDepth As REAL

			Property PanelOperation As [[IfcDoorPanelOperationEnum]]

			Property PanelWidth As REAL

			Property PanelPosition As [[IfcDoorPanelPositionEnum]]

			Property ShapeAspectStyle As [[IfcShapeAspect]]
		End Interface
	#End Region

	#Region " Interface IfcDoorStyle "
		Interface IfcDoorStyle : Inherits IfcTypeProduct
			Property OperationType As [[IfcDoorStyleOperationEnum]]

			Property ConstructionType As [[IfcDoorStyleConstructionEnum]]

			Property ParameterTakesPrecedence As [BOOLEAN]

			Property Sizeable As [BOOLEAN]
		End Interface
	#End Region

	#Region " Interface IfcDraughtingCallout "
		Interface IfcDraughtingCallout : Inherits IfcGeometricRepresentationItem
			''' <summary>
			''' IsRelatedFromCallout oppositeOf RelatedDraughtingCallout
			''' </summary>
			Property IsRelatedFromCallout As [[IfcDraughtingCalloutRelationship]]

			''' <summary>
			''' IsRelatedToCallout oppositeOf RelatingDraughtingCallout
			''' </summary>
			Property IsRelatedToCallout As [[IfcDraughtingCalloutRelationship]]

			Property Contents As List(Of [[IfcDraughtingCalloutElement]]
		End Interface
	#End Region

	#Region " Interface IfcDraughtingCalloutRelationship "
		Interface IfcDraughtingCalloutRelationship
			Property Name As [STRING]

			Property Description As [STRING]

			''' <summary>
			''' RelatingDraughtingCallout oppositeOf IsRelatedToCallout
			''' </summary>
			Property RelatingDraughtingCallout As [[IfcDraughtingCallout]]

			''' <summary>
			''' RelatedDraughtingCallout oppositeOf IsRelatedFromCallout
			''' </summary>
			Property RelatedDraughtingCallout As [[IfcDraughtingCallout]]
		End Interface
	#End Region

	#Region " Interface IfcDraughtingPreDefinedColour "
		Interface IfcDraughtingPreDefinedColour : Inherits IfcPreDefinedColour
			
		End Interface
	#End Region

	#Region " Interface IfcDraughtingPreDefinedCurveFont "
		Interface IfcDraughtingPreDefinedCurveFont : Inherits IfcPreDefinedCurveFont
			
		End Interface
	#End Region

	#Region " Interface IfcDraughtingPreDefinedTextFont "
		Interface IfcDraughtingPreDefinedTextFont : Inherits IfcPreDefinedTextFont
			
		End Interface
	#End Region

	#Region " Interface IfcDuctFittingType "
		Interface IfcDuctFittingType : Inherits IfcFlowFittingType
			Property PredefinedType As [[IfcDuctFittingTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcDuctSegmentType "
		Interface IfcDuctSegmentType : Inherits IfcFlowSegmentType
			Property PredefinedType As [[IfcDuctSegmentTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcDuctSilencerType "
		Interface IfcDuctSilencerType : Inherits IfcFlowTreatmentDeviceType
			Property PredefinedType As [[IfcDuctSilencerTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcEdge "
		Interface IfcEdge : Inherits IfcTopologicalRepresentationItem
			Property EdgeStart As [[IfcVertex]]

			Property EdgeEnd As [[IfcVertex]]
		End Interface
	#End Region

	#Region " Interface IfcEdgeCurve "
		Interface IfcEdgeCurve : Inherits IfcCurveOrEdgeCurve, IfcEdge
			Property EdgeGeometry As [[IfcCurve]]

			Property SameSense As [BOOLEAN]
		End Interface
	#End Region

	#Region " Interface IfcEdgeFeature "
		Interface IfcEdgeFeature : Inherits IfcFeatureElementSubtraction
			Property FeatureLength As REAL
		End Interface
	#End Region

	#Region " Interface IfcEdgeLoop "
		Interface IfcEdgeLoop : Inherits IfcLoop
			Property EdgeList As List(Of [[IfcOrientedEdge]]
		End Interface
	#End Region

	#Region " Interface IfcElectricApplianceType "
		Interface IfcElectricApplianceType : Inherits IfcFlowTerminalType
			Property PredefinedType As [[IfcElectricApplianceTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcElectricDistributionPoint "
		Interface IfcElectricDistributionPoint : Inherits IfcFlowController
			Property DistributionPointFunction As [[IfcElectricDistributionPointFunctionEnum]]

			Property UserDefinedFunction As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcElectricFlowStorageDeviceType "
		Interface IfcElectricFlowStorageDeviceType : Inherits IfcFlowStorageDeviceType
			Property PredefinedType As [[IfcElectricFlowStorageDeviceTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcElectricGeneratorType "
		Interface IfcElectricGeneratorType : Inherits IfcEnergyConversionDeviceType
			Property PredefinedType As [[IfcElectricGeneratorTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcElectricHeaterType "
		Interface IfcElectricHeaterType : Inherits IfcFlowTerminalType
			Property PredefinedType As [[IfcElectricHeaterTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcElectricMotorType "
		Interface IfcElectricMotorType : Inherits IfcEnergyConversionDeviceType
			Property PredefinedType As [[IfcElectricMotorTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcElectricTimeControlType "
		Interface IfcElectricTimeControlType : Inherits IfcFlowControllerType
			Property PredefinedType As [[IfcElectricTimeControlTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcElectricalBaseProperties "
		Interface IfcElectricalBaseProperties : Inherits IfcEnergyProperties
			Property ElectricCurrentType As [[IfcElectricCurrentEnum]]

			Property InputVoltage As REAL

			Property InputFrequency As REAL

			Property FullLoadCurrent As REAL

			Property MinimumCircuitCurrent As REAL

			Property MaximumPowerInput As REAL

			Property RatedPowerInput As REAL

			Property InputPhase As [INTEGER]
		End Interface
	#End Region

	#Region " Interface IfcElectricalCircuit "
		Interface IfcElectricalCircuit : Inherits IfcSystem
			
		End Interface
	#End Region

	#Region " Interface IfcElectricalElement "
		Interface IfcElectricalElement : Inherits IfcElement
			
		End Interface
	#End Region

	#Region " Interface IfcElement "
		Interface IfcElement : Inherits IfcStructuralActivityAssignmentSelect, IfcProduct
			''' <summary>
			''' FillsVoids oppositeOf RelatedBuildingElement
			''' </summary>
			Property FillsVoids As [[IfcRelFillsElement]]

			''' <summary>
			''' ConnectedTo oppositeOf RelatingElement
			''' </summary>
			Property ConnectedTo As [[IfcRelConnectsElements]]

			''' <summary>
			''' HasCoverings oppositeOf RelatingBuildingElement
			''' </summary>
			Property HasCoverings As [[IfcRelCoversBldgElements]]

			''' <summary>
			''' HasProjections oppositeOf RelatingElement
			''' </summary>
			Property HasProjections As [[IfcRelProjectsElement]]

			''' <summary>
			''' HasStructuralMember oppositeOf RelatingElement
			''' </summary>
			Property HasStructuralMember As [[IfcRelConnectsStructuralElement]]

			''' <summary>
			''' HasPorts oppositeOf RelatedElement
			''' </summary>
			Property HasPorts As [[IfcRelConnectsPortToElement]]

			''' <summary>
			''' HasOpenings oppositeOf RelatingBuildingElement
			''' </summary>
			Property HasOpenings As [[IfcRelVoidsElement]]

			''' <summary>
			''' IsConnectionRealization oppositeOf RealizingElements
			''' </summary>
			Property IsConnectionRealization As [[IfcRelConnectsWithRealizingElements]]

			''' <summary>
			''' ProvidesBoundaries oppositeOf RelatedBuildingElement
			''' </summary>
			Property ProvidesBoundaries As [[IfcRelSpaceBoundary]]

			''' <summary>
			''' ConnectedFrom oppositeOf RelatedElement
			''' </summary>
			Property ConnectedFrom As [[IfcRelConnectsElements]]

			Property Tag As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcElementAssembly "
		Interface IfcElementAssembly : Inherits IfcElement
			Property AssemblyPlace As [[IfcAssemblyPlaceEnum]]

			Property PredefinedType As [[IfcElementAssemblyTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcElementComponent "
		Interface IfcElementComponent : Inherits IfcElement
			
		End Interface
	#End Region

	#Region " Interface IfcElementComponentType "
		Interface IfcElementComponentType : Inherits IfcElementType
			
		End Interface
	#End Region

	#Region " Interface IfcElementQuantity "
		Interface IfcElementQuantity : Inherits IfcPropertySetDefinition
			Property Quantities As List(Of [[IfcPhysicalQuantity]]

			Property MethodOfMeasurement As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcElementType "
		Interface IfcElementType : Inherits IfcTypeProduct
			Property ElementType As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcElementarySurface "
		Interface IfcElementarySurface : Inherits IfcSurface
			Property Position As [[IfcAxis2Placement3D]]
		End Interface
	#End Region

	#Region " Interface IfcEllipse "
		Interface IfcEllipse : Inherits IfcConic
			Property SemiAxis1 As REAL

			Property SemiAxis2 As REAL
		End Interface
	#End Region

	#Region " Interface IfcEllipseProfileDef "
		Interface IfcEllipseProfileDef : Inherits IfcParameterizedProfileDef
			Property SemiAxis1 As REAL

			Property SemiAxis2 As REAL
		End Interface
	#End Region

	#Region " Interface IfcEnergyConversionDevice "
		Interface IfcEnergyConversionDevice : Inherits IfcDistributionFlowElement
			
		End Interface
	#End Region

	#Region " Interface IfcEnergyConversionDeviceType "
		Interface IfcEnergyConversionDeviceType : Inherits IfcDistributionFlowElementType
			
		End Interface
	#End Region

	#Region " Interface IfcEnergyProperties "
		Interface IfcEnergyProperties : Inherits IfcPropertySetDefinition
			Property EnergySequence As [[IfcEnergySequenceEnum]]

			Property UserDefinedEnergySequence As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcEnvironmentalImpactValue "
		Interface IfcEnvironmentalImpactValue : Inherits IfcAppliedValue
			Property ImpactType As [STRING]

			Property Category As [[IfcEnvironmentalImpactCategoryEnum]]

			Property UserDefinedCategory As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcEquipmentElement "
		Interface IfcEquipmentElement : Inherits IfcElement
			
		End Interface
	#End Region

	#Region " Interface IfcEquipmentStandard "
		Interface IfcEquipmentStandard : Inherits IfcControl
			
		End Interface
	#End Region

	#Region " Interface IfcEvaporativeCoolerType "
		Interface IfcEvaporativeCoolerType : Inherits IfcEnergyConversionDeviceType
			Property PredefinedType As [[IfcEvaporativeCoolerTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcEvaporatorType "
		Interface IfcEvaporatorType : Inherits IfcEnergyConversionDeviceType
			Property PredefinedType As [[IfcEvaporatorTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcExtendedMaterialProperties "
		Interface IfcExtendedMaterialProperties : Inherits IfcMaterialProperties
			Property Description As [STRING]

			Property Name As [STRING]

			Property ExtendedProperties As List(Of [[IfcProperty]]
		End Interface
	#End Region

	#Region " Interface IfcExternalReference "
		Interface IfcExternalReference : Inherits IfcLightDistributionDataSourceSelect, IfcObjectReferenceSelect
			Property Location As [STRING]

			Property ItemReference As [STRING]

			Property Name As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcExternallyDefinedHatchStyle "
		Interface IfcExternallyDefinedHatchStyle : Inherits IfcFillStyleSelect, IfcExternalReference
			
		End Interface
	#End Region

	#Region " Interface IfcExternallyDefinedSurfaceStyle "
		Interface IfcExternallyDefinedSurfaceStyle : Inherits IfcSurfaceStyleElementSelect, IfcExternalReference
			
		End Interface
	#End Region

	#Region " Interface IfcExternallyDefinedSymbol "
		Interface IfcExternallyDefinedSymbol : Inherits IfcDefinedSymbolSelect, IfcExternalReference
			
		End Interface
	#End Region

	#Region " Interface IfcExternallyDefinedTextFont "
		Interface IfcExternallyDefinedTextFont : Inherits IfcTextFontSelect, IfcExternalReference
			
		End Interface
	#End Region

	#Region " Interface IfcExtrudedAreaSolid "
		Interface IfcExtrudedAreaSolid : Inherits IfcSweptAreaSolid
			Property ExtrudedDirection As [[IfcDirection]]

			Property Depth As REAL
		End Interface
	#End Region

	#Region " Interface IfcFace "
		Interface IfcFace : Inherits IfcTopologicalRepresentationItem
			Property Bounds As List(Of [[IfcFaceBound]]
		End Interface
	#End Region

	#Region " Interface IfcFaceBasedSurfaceModel "
		Interface IfcFaceBasedSurfaceModel : Inherits IfcSurfaceOrFaceSurface, IfcGeometricRepresentationItem
			Property FbsmFaces As List(Of [[IfcConnectedFaceSet]]
		End Interface
	#End Region

	#Region " Interface IfcFaceBound "
		Interface IfcFaceBound : Inherits IfcTopologicalRepresentationItem
			Property Bound As [[IfcLoop]]

			Property Orientation As [BOOLEAN]
		End Interface
	#End Region

	#Region " Interface IfcFaceOuterBound "
		Interface IfcFaceOuterBound : Inherits IfcFaceBound
			
		End Interface
	#End Region

	#Region " Interface IfcFaceSurface "
		Interface IfcFaceSurface : Inherits IfcSurfaceOrFaceSurface, IfcFace
			Property FaceSurface As [[IfcSurface]]

			Property SameSense As [BOOLEAN]
		End Interface
	#End Region

	#Region " Interface IfcFacetedBrep "
		Interface IfcFacetedBrep : Inherits IfcManifoldSolidBrep
			
		End Interface
	#End Region

	#Region " Interface IfcFacetedBrepWithVoids "
		Interface IfcFacetedBrepWithVoids : Inherits IfcManifoldSolidBrep
			Property Voids As List(Of [[IfcClosedShell]]
		End Interface
	#End Region

	#Region " Interface IfcFailureConnectionCondition "
		Interface IfcFailureConnectionCondition : Inherits IfcStructuralConnectionCondition
			Property TensionFailureX As REAL

			Property TensionFailureY As REAL

			Property TensionFailureZ As REAL

			Property CompressionFailureX As REAL

			Property CompressionFailureY As REAL

			Property CompressionFailureZ As REAL
		End Interface
	#End Region

	#Region " Interface IfcFanType "
		Interface IfcFanType : Inherits IfcFlowMovingDeviceType
			Property PredefinedType As [[IfcFanTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcFastener "
		Interface IfcFastener : Inherits IfcElementComponent
			
		End Interface
	#End Region

	#Region " Interface IfcFastenerType "
		Interface IfcFastenerType : Inherits IfcElementComponentType
			
		End Interface
	#End Region

	#Region " Interface IfcFeatureElement "
		Interface IfcFeatureElement : Inherits IfcElement
			
		End Interface
	#End Region

	#Region " Interface IfcFeatureElementAddition "
		Interface IfcFeatureElementAddition : Inherits IfcFeatureElement
			''' <summary>
			''' ProjectsElements oppositeOf RelatedFeatureElement
			''' </summary>
			Property ProjectsElements As [[IfcRelProjectsElement]]
		End Interface
	#End Region

	#Region " Interface IfcFeatureElementSubtraction "
		Interface IfcFeatureElementSubtraction : Inherits IfcFeatureElement
			''' <summary>
			''' VoidsElements oppositeOf RelatedOpeningElement
			''' </summary>
			Property VoidsElements As [[IfcRelVoidsElement]]
		End Interface
	#End Region

	#Region " Interface IfcFillAreaStyle "
		Interface IfcFillAreaStyle : Inherits IfcPresentationStyle
			Property FillStyles As List(Of [[IfcFillStyleSelect]]
		End Interface
	#End Region

	#Region " Interface IfcFillAreaStyleHatching "
		Interface IfcFillAreaStyleHatching : Inherits IfcFillStyleSelect, IfcGeometricRepresentationItem
			Property StartOfNextHatchLine As [[IfcHatchLineDistanceSelect]]

			Property HatchLineAppearance As [[IfcCurveStyle]]

			Property PointOfReferenceHatchLine As [[IfcCartesianPoint]]

			Property PatternStart As [[IfcCartesianPoint]]

			Property HatchLineAngle As REAL
		End Interface
	#End Region

	#Region " Interface IfcFillAreaStyleTileSymbolWithStyle "
		Interface IfcFillAreaStyleTileSymbolWithStyle : Inherits IfcFillAreaStyleTileShapeSelect, IfcGeometricRepresentationItem
			Property Symbol As [[IfcAnnotationSymbolOccurrence]]
		End Interface
	#End Region

	#Region " Interface IfcFillAreaStyleTiles "
		Interface IfcFillAreaStyleTiles : Inherits IfcFillStyleSelect, IfcGeometricRepresentationItem
			Property TilingPattern As [[IfcOneDirectionRepeatFactor]]

			Property Tiles As List(Of [[IfcFillAreaStyleTileShapeSelect]]

			Property TilingScale As REAL
		End Interface
	#End Region

	#Region " Interface IfcFilterType "
		Interface IfcFilterType : Inherits IfcFlowTreatmentDeviceType
			Property PredefinedType As [[IfcFilterTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcFireSuppressionTerminalType "
		Interface IfcFireSuppressionTerminalType : Inherits IfcFlowTerminalType
			Property PredefinedType As [[IfcFireSuppressionTerminalTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcFlowController "
		Interface IfcFlowController : Inherits IfcDistributionFlowElement
			
		End Interface
	#End Region

	#Region " Interface IfcFlowControllerType "
		Interface IfcFlowControllerType : Inherits IfcDistributionFlowElementType
			
		End Interface
	#End Region

	#Region " Interface IfcFlowFitting "
		Interface IfcFlowFitting : Inherits IfcDistributionFlowElement
			
		End Interface
	#End Region

	#Region " Interface IfcFlowFittingType "
		Interface IfcFlowFittingType : Inherits IfcDistributionFlowElementType
			
		End Interface
	#End Region

	#Region " Interface IfcFlowInstrumentType "
		Interface IfcFlowInstrumentType : Inherits IfcDistributionControlElementType
			Property PredefinedType As [[IfcFlowInstrumentTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcFlowMeterType "
		Interface IfcFlowMeterType : Inherits IfcFlowControllerType
			Property PredefinedType As [[IfcFlowMeterTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcFlowMovingDevice "
		Interface IfcFlowMovingDevice : Inherits IfcDistributionFlowElement
			
		End Interface
	#End Region

	#Region " Interface IfcFlowMovingDeviceType "
		Interface IfcFlowMovingDeviceType : Inherits IfcDistributionFlowElementType
			
		End Interface
	#End Region

	#Region " Interface IfcFlowSegment "
		Interface IfcFlowSegment : Inherits IfcDistributionFlowElement
			
		End Interface
	#End Region

	#Region " Interface IfcFlowSegmentType "
		Interface IfcFlowSegmentType : Inherits IfcDistributionFlowElementType
			
		End Interface
	#End Region

	#Region " Interface IfcFlowStorageDevice "
		Interface IfcFlowStorageDevice : Inherits IfcDistributionFlowElement
			
		End Interface
	#End Region

	#Region " Interface IfcFlowStorageDeviceType "
		Interface IfcFlowStorageDeviceType : Inherits IfcDistributionFlowElementType
			
		End Interface
	#End Region

	#Region " Interface IfcFlowTerminal "
		Interface IfcFlowTerminal : Inherits IfcDistributionFlowElement
			
		End Interface
	#End Region

	#Region " Interface IfcFlowTerminalType "
		Interface IfcFlowTerminalType : Inherits IfcDistributionFlowElementType
			
		End Interface
	#End Region

	#Region " Interface IfcFlowTreatmentDevice "
		Interface IfcFlowTreatmentDevice : Inherits IfcDistributionFlowElement
			
		End Interface
	#End Region

	#Region " Interface IfcFlowTreatmentDeviceType "
		Interface IfcFlowTreatmentDeviceType : Inherits IfcDistributionFlowElementType
			
		End Interface
	#End Region

	#Region " Interface IfcFluidFlowProperties "
		Interface IfcFluidFlowProperties : Inherits IfcPropertySetDefinition
			Property PropertySource As [[IfcPropertySourceEnum]]

			Property UserDefinedPropertySource As [STRING]

			Property TemperatureSingleValue As REAL

			Property WetBulbTemperatureSingleValue As REAL

			Property FlowConditionSingleValue As REAL

			Property VelocitySingleValue As REAL

			Property PressureSingleValue As REAL

			Property FlowrateSingleValue As [[IfcDerivedMeasureValue]]

			Property FlowConditionTimeSeries As [[IfcTimeSeries]]

			Property VelocityTimeSeries As [[IfcTimeSeries]]

			Property FlowrateTimeSeries As [[IfcTimeSeries]]

			Property Fluid As [[IfcMaterial]]

			Property PressureTimeSeries As [[IfcTimeSeries]]

			Property WetBulbTemperatureTimeSeries As [[IfcTimeSeries]]

			Property TemperatureTimeSeries As [[IfcTimeSeries]]
		End Interface
	#End Region

	#Region " Interface IfcFooting "
		Interface IfcFooting : Inherits IfcBuildingElement
			Property PredefinedType As [[IfcFootingTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcFuelProperties "
		Interface IfcFuelProperties : Inherits IfcMaterialProperties
			Property CombustionTemperature As REAL

			Property CarbonContent As REAL

			Property LowerHeatingValue As REAL

			Property HigherHeatingValue As REAL
		End Interface
	#End Region

	#Region " Interface IfcFurnishingElement "
		Interface IfcFurnishingElement : Inherits IfcElement
			
		End Interface
	#End Region

	#Region " Interface IfcFurnishingElementType "
		Interface IfcFurnishingElementType : Inherits IfcElementType
			
		End Interface
	#End Region

	#Region " Interface IfcFurnitureStandard "
		Interface IfcFurnitureStandard : Inherits IfcControl
			
		End Interface
	#End Region

	#Region " Interface IfcFurnitureType "
		Interface IfcFurnitureType : Inherits IfcFurnishingElementType
			Property AssemblyPlace As [[IfcAssemblyPlaceEnum]]
		End Interface
	#End Region

	#Region " Interface IfcGasTerminalType "
		Interface IfcGasTerminalType : Inherits IfcFlowTerminalType
			Property PredefinedType As [[IfcGasTerminalTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcGeneralMaterialProperties "
		Interface IfcGeneralMaterialProperties : Inherits IfcMaterialProperties
			Property MolecularWeight As REAL

			Property Porosity As REAL

			Property MassDensity As REAL
		End Interface
	#End Region

	#Region " Interface IfcGeneralProfileProperties "
		Interface IfcGeneralProfileProperties : Inherits IfcProfileProperties
			Property PhysicalWeight As REAL

			Property Perimeter As REAL

			Property MinimumPlateThickness As REAL

			Property MaximumPlateThickness As REAL

			Property CrossSectionArea As REAL
		End Interface
	#End Region

	#Region " Interface IfcGeometricCurveSet "
		Interface IfcGeometricCurveSet : Inherits IfcGeometricSet
			
		End Interface
	#End Region

	#Region " Interface IfcGeometricRepresentationContext "
		Interface IfcGeometricRepresentationContext : Inherits IfcRepresentationContext
			Property CoordinateSpaceDimension As [INTEGER]

			Property Precision As REAL

			''' <summary>
			''' HasSubContexts oppositeOf ParentContext
			''' </summary>
			Property HasSubContexts As [[IfcGeometricRepresentationSubContext]]

			Property WorldCoordinateSystem As [[IfcAxis2Placement]]

			Property TrueNorth As [[IfcDirection]]
		End Interface
	#End Region

	#Region " Interface IfcGeometricRepresentationItem "
		Interface IfcGeometricRepresentationItem : Inherits IfcRepresentationItem
			
		End Interface
	#End Region

	#Region " Interface IfcGeometricRepresentationSubContext "
		Interface IfcGeometricRepresentationSubContext : Inherits IfcGeometricRepresentationContext
			Property TargetScale As REAL

			Property TargetView As [[IfcGeometricProjectionEnum]]

			Property UserDefinedTargetView As [STRING]

			''' <summary>
			''' ParentContext oppositeOf HasSubContexts
			''' </summary>
			Property ParentContext As [[IfcGeometricRepresentationContext]]
		End Interface
	#End Region

	#Region " Interface IfcGeometricSet "
		Interface IfcGeometricSet : Inherits IfcGeometricRepresentationItem
			Property Elements As List(Of [[IfcGeometricSetSelect]]
		End Interface
	#End Region

	#Region " Interface IfcGrid "
		Interface IfcGrid : Inherits IfcProduct
			''' <summary>
			''' UAxes oppositeOf PartOfU
			''' </summary>
			Property UAxes As List(Of [[IfcGridAxis]]

			''' <summary>
			''' VAxes oppositeOf PartOfV
			''' </summary>
			Property VAxes As List(Of [[IfcGridAxis]]

			''' <summary>
			''' WAxes oppositeOf PartOfW
			''' </summary>
			Property WAxes As List(Of [[IfcGridAxis]]
		End Interface
	#End Region

	#Region " Interface IfcGridAxis "
		Interface IfcGridAxis
			Property AxisTag As [STRING]

			Property SameSense As [BOOLEAN]

			''' <summary>
			''' PartOfW oppositeOf WAxes
			''' </summary>
			Property PartOfW As [[IfcGrid]]

			''' <summary>
			''' PartOfV oppositeOf VAxes
			''' </summary>
			Property PartOfV As [[IfcGrid]]

			''' <summary>
			''' PartOfU oppositeOf UAxes
			''' </summary>
			Property PartOfU As [[IfcGrid]]

			''' <summary>
			''' HasIntersections oppositeOf IntersectingAxes
			''' </summary>
			Property HasIntersections As [[IfcVirtualGridIntersection]]

			Property AxisCurve As [[IfcCurve]]
		End Interface
	#End Region

	#Region " Interface IfcGridPlacement "
		Interface IfcGridPlacement : Inherits IfcObjectPlacement
			Property PlacementLocation As [[IfcVirtualGridIntersection]]

			Property PlacementRefDirection As [[IfcVirtualGridIntersection]]
		End Interface
	#End Region

	#Region " Interface IfcGroup "
		Interface IfcGroup : Inherits IfcObject
			''' <summary>
			''' IsGroupedBy oppositeOf RelatingGroup
			''' </summary>
			Property IsGroupedBy As [[IfcRelAssignsToGroup]]
		End Interface
	#End Region

	#Region " Interface IfcHalfSpaceSolid "
		Interface IfcHalfSpaceSolid : Inherits IfcBooleanOperand, IfcGeometricRepresentationItem
			Property BaseSurface As [[IfcSurface]]

			Property AgreementFlag As [BOOLEAN]
		End Interface
	#End Region

	#Region " Interface IfcHeatExchangerType "
		Interface IfcHeatExchangerType : Inherits IfcEnergyConversionDeviceType
			Property PredefinedType As [[IfcHeatExchangerTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcHumidifierType "
		Interface IfcHumidifierType : Inherits IfcEnergyConversionDeviceType
			Property PredefinedType As [[IfcHumidifierTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcHygroscopicMaterialProperties "
		Interface IfcHygroscopicMaterialProperties : Inherits IfcMaterialProperties
			Property UpperVaporResistanceFactor As REAL

			Property LowerVaporResistanceFactor As REAL

			Property IsothermalMoistureCapacity As REAL

			Property VaporPermeability As REAL

			Property MoistureDiffusivity As REAL
		End Interface
	#End Region

	#Region " Interface IfcIShapeProfileDef "
		Interface IfcIShapeProfileDef : Inherits IfcParameterizedProfileDef
			Property OverallWidth As REAL

			Property OverallDepth As REAL

			Property WebThickness As REAL

			Property FlangeThickness As REAL

			Property FilletRadius As REAL
		End Interface
	#End Region

	#Region " Interface IfcImageTexture "
		Interface IfcImageTexture : Inherits IfcSurfaceTexture
			Property UrlReference As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcInventory "
		Interface IfcInventory : Inherits IfcGroup
			Property Jurisdiction As [[IfcActorSelect]]

			Property ResponsiblePersons As List(Of [[IfcPerson]]

			Property LastUpdateDate As [[IfcCalendarDate]]

			Property CurrentValue As [[IfcCostValue]]

			Property OriginalValue As [[IfcCostValue]]

			Property InventoryType As [[IfcInventoryTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcIrregularTimeSeries "
		Interface IfcIrregularTimeSeries : Inherits IfcTimeSeries
			Property Values As List(Of [[IfcIrregularTimeSeriesValue]]
		End Interface
	#End Region

	#Region " Interface IfcIrregularTimeSeriesValue "
		Interface IfcIrregularTimeSeriesValue
			Property ListValues As List(Of [[IfcValue]]

			Property TimeStamp As [[IfcDateTimeSelect]]
		End Interface
	#End Region

	#Region " Interface IfcJunctionBoxType "
		Interface IfcJunctionBoxType : Inherits IfcFlowFittingType
			Property PredefinedType As [[IfcJunctionBoxTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcLShapeProfileDef "
		Interface IfcLShapeProfileDef : Inherits IfcParameterizedProfileDef
			Property Depth As REAL

			Property Width As REAL

			Property Thickness As REAL

			Property FilletRadius As REAL

			Property EdgeRadius As REAL

			Property LegSlope As REAL

			Property CentreOfGravityInX As REAL

			Property CentreOfGravityInY As REAL
		End Interface
	#End Region

	#Region " Interface IfcLaborResource "
		Interface IfcLaborResource : Inherits IfcConstructionResource
			Property SkillSet As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcLampType "
		Interface IfcLampType : Inherits IfcFlowTerminalType
			Property PredefinedType As [[IfcLampTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcLibraryInformation "
		Interface IfcLibraryInformation : Inherits IfcLibrarySelect
			Property Name As [STRING]

			Property Version As [STRING]

			Property Publisher As [[IfcOrganization]]

			Property VersionDate As [[IfcCalendarDate]]

			''' <summary>
			''' LibraryReference oppositeOf ReferenceIntoLibrary
			''' </summary>
			Property LibraryReference As List(Of [[IfcLibraryReference]]
		End Interface
	#End Region

	#Region " Interface IfcLibraryReference "
		Interface IfcLibraryReference : Inherits IfcLibrarySelect, IfcExternalReference
			''' <summary>
			''' ReferenceIntoLibrary oppositeOf LibraryReference
			''' </summary>
			Property ReferenceIntoLibrary As [[IfcLibraryInformation]]
		End Interface
	#End Region

	#Region " Interface IfcLightDistributionData "
		Interface IfcLightDistributionData
			Property MainPlaneAngle As REAL

			Property SecondaryPlaneAngle As REAL

			Property LuminousIntensity As REAL
		End Interface
	#End Region

	#Region " Interface IfcLightFixtureType "
		Interface IfcLightFixtureType : Inherits IfcFlowTerminalType
			Property PredefinedType As [[IfcLightFixtureTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcLightIntensityDistribution "
		Interface IfcLightIntensityDistribution : Inherits IfcLightDistributionDataSourceSelect
			Property DistributionData As List(Of [[IfcLightDistributionData]]

			Property LightDistributionCurve As [[IfcLightDistributionCurveEnum]]
		End Interface
	#End Region

	#Region " Interface IfcLightSource "
		Interface IfcLightSource : Inherits IfcGeometricRepresentationItem
			Property Name As [STRING]

			Property AmbientIntensity As REAL

			Property Intensity As REAL

			Property LightColour As [[IfcColourRgb]]
		End Interface
	#End Region

	#Region " Interface IfcLightSourceAmbient "
		Interface IfcLightSourceAmbient : Inherits IfcLightSource
			
		End Interface
	#End Region

	#Region " Interface IfcLightSourceDirectional "
		Interface IfcLightSourceDirectional : Inherits IfcLightSource
			Property Orientation As [[IfcDirection]]
		End Interface
	#End Region

	#Region " Interface IfcLightSourceGoniometric "
		Interface IfcLightSourceGoniometric : Inherits IfcLightSource
			Property ColourTemperature As REAL

			Property LuminousFlux As REAL

			Property LightEmissionSource As [[IfcLightEmissionSourceEnum]]

			Property Position As [[IfcAxis2Placement3D]]

			Property ColourAppearance As [[IfcColourRgb]]

			Property LightDistributionDataSource As [[IfcLightDistributionDataSourceSelect]]
		End Interface
	#End Region

	#Region " Interface IfcLightSourcePositional "
		Interface IfcLightSourcePositional : Inherits IfcLightSource
			Property Radius As REAL

			Property ConstantAttenuation As REAL

			Property DistanceAttenuation As REAL

			Property QuadricAttenuation As REAL

			Property Position As [[IfcCartesianPoint]]
		End Interface
	#End Region

	#Region " Interface IfcLightSourceSpot "
		Interface IfcLightSourceSpot : Inherits IfcLightSourcePositional
			Property ConcentrationExponent As REAL

			Property SpreadAngle As REAL

			Property BeamWidthAngle As REAL

			Property Orientation As [[IfcDirection]]
		End Interface
	#End Region

	#Region " Interface IfcLine "
		Interface IfcLine : Inherits IfcCurve
			Property Pnt As [[IfcCartesianPoint]]

			Property Dir As [[IfcVector]]
		End Interface
	#End Region

	#Region " Interface IfcLinearDimension "
		Interface IfcLinearDimension : Inherits IfcDimensionCurveDirectedCallout
			
		End Interface
	#End Region

	#Region " Interface IfcLocalPlacement "
		Interface IfcLocalPlacement : Inherits IfcObjectPlacement
			''' <summary>
			''' PlacementRelTo oppositeOf ReferencedByPlacements
			''' </summary>
			Property PlacementRelTo As [[IfcObjectPlacement]]

			Property RelativePlacement As [[IfcAxis2Placement]]
		End Interface
	#End Region

	#Region " Interface IfcLocalTime "
		Interface IfcLocalTime : Inherits IfcDateTimeSelect, IfcObjectReferenceSelect
			Property HourComponent As [INTEGER]

			Property MinuteComponent As [INTEGER]

			Property SecondComponent As REAL

			Property DaylightSavingOffset As [INTEGER]

			Property Zone As [[IfcCoordinatedUniversalTimeOffset]]
		End Interface
	#End Region

	#Region " Interface IfcLoop "
		Interface IfcLoop : Inherits IfcTopologicalRepresentationItem
			
		End Interface
	#End Region

	#Region " Interface IfcManifoldSolidBrep "
		Interface IfcManifoldSolidBrep : Inherits IfcSolidModel
			Property Outer As [[IfcClosedShell]]
		End Interface
	#End Region

	#Region " Interface IfcMappedItem "
		Interface IfcMappedItem : Inherits IfcRepresentationItem
			''' <summary>
			''' MappingSource oppositeOf MapUsage
			''' </summary>
			Property MappingSource As [[IfcRepresentationMap]]

			Property MappingTarget As [[IfcCartesianTransformationOperator]]
		End Interface
	#End Region

	#Region " Interface IfcMaterial "
		Interface IfcMaterial : Inherits IfcMaterialSelect, IfcObjectReferenceSelect
			''' <summary>
			''' HasRepresentation oppositeOf RepresentedMaterial
			''' </summary>
			Property HasRepresentation As [[IfcMaterialDefinitionRepresentation]]

			''' <summary>
			''' ClassifiedAs oppositeOf ClassifiedMaterial
			''' </summary>
			Property ClassifiedAs As [[IfcMaterialClassificationRelationship]]

			Property Name As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcMaterialClassificationRelationship "
		Interface IfcMaterialClassificationRelationship
			Property MaterialClassifications As List(Of [[IfcClassificationNotationSelect]]

			''' <summary>
			''' ClassifiedMaterial oppositeOf ClassifiedAs
			''' </summary>
			Property ClassifiedMaterial As [[IfcMaterial]]
		End Interface
	#End Region

	#Region " Interface IfcMaterialDefinitionRepresentation "
		Interface IfcMaterialDefinitionRepresentation : Inherits IfcProductRepresentation
			''' <summary>
			''' RepresentedMaterial oppositeOf HasRepresentation
			''' </summary>
			Property RepresentedMaterial As [[IfcMaterial]]
		End Interface
	#End Region

	#Region " Interface IfcMaterialLayer "
		Interface IfcMaterialLayer : Inherits IfcMaterialSelect, IfcObjectReferenceSelect
			Property LayerThickness As REAL

			Property IsVentilated As LOGICAL

			''' <summary>
			''' ToMaterialLayerSet oppositeOf MaterialLayers
			''' </summary>
			Property ToMaterialLayerSet As [[IfcMaterialLayerSet]]

			Property Material As [[IfcMaterial]]
		End Interface
	#End Region

	#Region " Interface IfcMaterialLayerSet "
		Interface IfcMaterialLayerSet : Inherits IfcMaterialSelect
			''' <summary>
			''' MaterialLayers oppositeOf ToMaterialLayerSet
			''' </summary>
			Property MaterialLayers As List(Of [[IfcMaterialLayer]]

			Property LayerSetName As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcMaterialLayerSetUsage "
		Interface IfcMaterialLayerSetUsage : Inherits IfcMaterialSelect
			Property LayerSetDirection As [[IfcLayerSetDirectionEnum]]

			Property DirectionSense As [[IfcDirectionSenseEnum]]

			Property OffsetFromReferenceLine As REAL

			Property ForLayerSet As [[IfcMaterialLayerSet]]
		End Interface
	#End Region

	#Region " Interface IfcMaterialList "
		Interface IfcMaterialList : Inherits IfcMaterialSelect, IfcObjectReferenceSelect
			Property Materials As List(Of [[IfcMaterial]]
		End Interface
	#End Region

	#Region " Interface IfcMaterialProperties "
		Interface IfcMaterialProperties
			Property Material As [[IfcMaterial]]
		End Interface
	#End Region

	#Region " Interface IfcMeasureWithUnit "
		Interface IfcMeasureWithUnit
			Property ValueComponent As [[IfcValue]]

			Property UnitComponent As [[IfcUnit]]
		End Interface
	#End Region

	#Region " Interface IfcMechanicalConcreteMaterialProperties "
		Interface IfcMechanicalConcreteMaterialProperties : Inherits IfcMechanicalMaterialProperties
			Property CompressiveStrength As REAL

			Property MaxAggregateSize As REAL

			Property AdmixturesDescription As [STRING]

			Property Workability As [STRING]

			Property ProtectivePoreRatio As REAL

			Property WaterImpermeability As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcMechanicalFastener "
		Interface IfcMechanicalFastener : Inherits IfcFastener
			Property NominalDiameter As REAL

			Property NominalLength As REAL
		End Interface
	#End Region

	#Region " Interface IfcMechanicalFastenerType "
		Interface IfcMechanicalFastenerType : Inherits IfcFastenerType
			
		End Interface
	#End Region

	#Region " Interface IfcMechanicalMaterialProperties "
		Interface IfcMechanicalMaterialProperties : Inherits IfcMaterialProperties
			Property DynamicViscosity As REAL

			Property YoungModulus As REAL

			Property ShearModulus As REAL

			Property PoissonRatio As REAL

			Property ThermalExpansionCoefficient As REAL
		End Interface
	#End Region

	#Region " Interface IfcMechanicalSteelMaterialProperties "
		Interface IfcMechanicalSteelMaterialProperties : Inherits IfcMechanicalMaterialProperties
			Property YieldStress As REAL

			Property UltimateStress As REAL

			Property UltimateStrain As REAL

			Property HardeningModule As REAL

			Property ProportionalStress As REAL

			Property PlasticStrain As REAL

			Property Relaxations As List(Of [[IfcRelaxation]]
		End Interface
	#End Region

	#Region " Interface IfcMember "
		Interface IfcMember : Inherits IfcBuildingElement
			
		End Interface
	#End Region

	#Region " Interface IfcMemberType "
		Interface IfcMemberType : Inherits IfcBuildingElementType
			Property PredefinedType As [[IfcMemberTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcMetric "
		Interface IfcMetric : Inherits IfcConstraint
			Property Benchmark As [[IfcBenchmarkEnum]]

			Property ValueSource As [STRING]

			Property DataValue As [[IfcMetricValueSelect]]
		End Interface
	#End Region

	#Region " Interface IfcMonetaryUnit "
		Interface IfcMonetaryUnit : Inherits IfcUnit
			Property Currency As [[IfcCurrencyEnum]]
		End Interface
	#End Region

	#Region " Interface IfcMotorConnectionType "
		Interface IfcMotorConnectionType : Inherits IfcEnergyConversionDeviceType
			Property PredefinedType As [[IfcMotorConnectionTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcMove "
		Interface IfcMove : Inherits IfcTask
			Property MoveFrom As [[IfcSpatialStructureElement]]

			Property MoveTo As [[IfcSpatialStructureElement]]

			Property PunchList As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcNamedUnit "
		Interface IfcNamedUnit : Inherits IfcUnit
			Property Dimensions As [[IfcDimensionalExponents]]

			Property UnitType As [[IfcUnitEnum]]
		End Interface
	#End Region

	#Region " Interface IfcObject "
		Interface IfcObject : Inherits IfcObjectDefinition
			''' <summary>
			''' IsDefinedBy oppositeOf RelatedObjects
			''' </summary>
			Property IsDefinedBy As [[IfcRelDefines]]

			Property ObjectType As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcObjectDefinition "
		Interface IfcObjectDefinition : Inherits IfcRoot
			''' <summary>
			''' HasAssignments oppositeOf RelatedObjects
			''' </summary>
			Property HasAssignments As [[IfcRelAssigns]]

			''' <summary>
			''' IsDecomposedBy oppositeOf RelatingObject
			''' </summary>
			Property IsDecomposedBy As [[IfcRelDecomposes]]

			''' <summary>
			''' Decomposes oppositeOf RelatedObjects
			''' </summary>
			Property Decomposes As [[IfcRelDecomposes]]
		End Interface
	#End Region

	#Region " Interface IfcObjectPlacement "
		Interface IfcObjectPlacement
			''' <summary>
			''' PlacesObject oppositeOf ObjectPlacement
			''' </summary>
			Property PlacesObject As [[IfcProduct]]

			''' <summary>
			''' ReferencedByPlacements oppositeOf PlacementRelTo
			''' </summary>
			Property ReferencedByPlacements As [[IfcLocalPlacement]]
		End Interface
	#End Region

	#Region " Interface IfcObjective "
		Interface IfcObjective : Inherits IfcConstraint
			Property ObjectiveQualifier As [[IfcObjectiveEnum]]

			Property UserDefinedQualifier As [STRING]

			Property BenchmarkValues As [[IfcMetric]]

			Property ResultValues As [[IfcMetric]]
		End Interface
	#End Region

	#Region " Interface IfcOccupant "
		Interface IfcOccupant : Inherits IfcActor
			Property PredefinedType As [[IfcOccupantTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcOffsetCurve2D "
		Interface IfcOffsetCurve2D : Inherits IfcCurve
			Property Distance As REAL

			Property SelfIntersect As LOGICAL

			Property BasisCurve As [[IfcCurve]]
		End Interface
	#End Region

	#Region " Interface IfcOffsetCurve3D "
		Interface IfcOffsetCurve3D : Inherits IfcCurve
			Property Distance As REAL

			Property SelfIntersect As LOGICAL

			Property BasisCurve As [[IfcCurve]]

			Property RefDirection As [[IfcDirection]]
		End Interface
	#End Region

	#Region " Interface IfcOneDirectionRepeatFactor "
		Interface IfcOneDirectionRepeatFactor : Inherits IfcGeometricRepresentationItem
			Property RepeatFactor As [[IfcVector]]
		End Interface
	#End Region

	#Region " Interface IfcOpenShell "
		Interface IfcOpenShell : Inherits IfcShell, IfcConnectedFaceSet
			
		End Interface
	#End Region

	#Region " Interface IfcOpeningElement "
		Interface IfcOpeningElement : Inherits IfcFeatureElementSubtraction
			''' <summary>
			''' HasFillings oppositeOf RelatingOpeningElement
			''' </summary>
			Property HasFillings As [[IfcRelFillsElement]]
		End Interface
	#End Region

	#Region " Interface IfcOpticalMaterialProperties "
		Interface IfcOpticalMaterialProperties : Inherits IfcMaterialProperties
			Property VisibleTransmittance As REAL

			Property SolarTransmittance As REAL

			Property ThermalIrTransmittance As REAL

			Property ThermalIrEmissivityBack As REAL

			Property ThermalIrEmissivityFront As REAL

			Property VisibleReflectanceBack As REAL

			Property VisibleReflectanceFront As REAL

			Property SolarReflectanceFront As REAL

			Property SolarReflectanceBack As REAL
		End Interface
	#End Region

	#Region " Interface IfcOrderAction "
		Interface IfcOrderAction : Inherits IfcTask
			Property ActionID As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcOrganization "
		Interface IfcOrganization : Inherits IfcActorSelect, IfcObjectReferenceSelect
			Property Id As [STRING]

			Property Name As [STRING]

			Property Description As [STRING]

			''' <summary>
			''' IsRelatedBy oppositeOf RelatedOrganizations
			''' </summary>
			Property IsRelatedBy As [[IfcOrganizationRelationship]]

			''' <summary>
			''' Relates oppositeOf RelatingOrganization
			''' </summary>
			Property Relates As [[IfcOrganizationRelationship]]

			''' <summary>
			''' Engages oppositeOf TheOrganization
			''' </summary>
			Property Engages As [[IfcPersonAndOrganization]]

			Property Roles As List(Of [[IfcActorRole]]

			''' <summary>
			''' Addresses oppositeOf OfOrganization
			''' </summary>
			Property Addresses As List(Of [[IfcAddress]]
		End Interface
	#End Region

	#Region " Interface IfcOrganizationRelationship "
		Interface IfcOrganizationRelationship
			Property Name As [STRING]

			Property Description As [STRING]

			''' <summary>
			''' RelatingOrganization oppositeOf Relates
			''' </summary>
			Property RelatingOrganization As [[IfcOrganization]]

			''' <summary>
			''' RelatedOrganizations oppositeOf IsRelatedBy
			''' </summary>
			Property RelatedOrganizations As List(Of [[IfcOrganization]]
		End Interface
	#End Region

	#Region " Interface IfcOrientedEdge "
		Interface IfcOrientedEdge : Inherits IfcEdge
			Property EdgeElement As [[IfcEdge]]

			Property Orientation As [BOOLEAN]
		End Interface
	#End Region

	#Region " Interface IfcOutletType "
		Interface IfcOutletType : Inherits IfcFlowTerminalType
			Property PredefinedType As [[IfcOutletTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcOwnerHistory "
		Interface IfcOwnerHistory
			Property State As [[IfcStateEnum]]

			Property ChangeAction As [[IfcChangeActionEnum]]

			Property LastModifiedDate As [INTEGER]

			Property CreationDate As [INTEGER]

			Property OwningUser As [[IfcPersonAndOrganization]]

			Property OwningApplication As [[IfcApplication]]

			Property LastModifyingUser As [[IfcPersonAndOrganization]]

			Property LastModifyingApplication As [[IfcApplication]]
		End Interface
	#End Region

	#Region " Interface IfcParameterizedProfileDef "
		Interface IfcParameterizedProfileDef : Inherits IfcProfileDef
			Property Position As [[IfcAxis2Placement2D]]
		End Interface
	#End Region

	#Region " Interface IfcPath "
		Interface IfcPath : Inherits IfcTopologicalRepresentationItem
			Property EdgeList As List(Of [[IfcOrientedEdge]]
		End Interface
	#End Region

	#Region " Interface IfcPerformanceHistory "
		Interface IfcPerformanceHistory : Inherits IfcControl
			Property LifeCyclePhase As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcPermeableCoveringProperties "
		Interface IfcPermeableCoveringProperties : Inherits IfcPropertySetDefinition
			Property OperationType As [[IfcPermeableCoveringOperationEnum]]

			Property PanelPosition As [[IfcWindowPanelPositionEnum]]

			Property FrameDepth As REAL

			Property FrameThickness As REAL

			Property ShapeAspectStyle As [[IfcShapeAspect]]
		End Interface
	#End Region

	#Region " Interface IfcPermit "
		Interface IfcPermit : Inherits IfcControl
			Property PermitID As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcPerson "
		Interface IfcPerson : Inherits IfcActorSelect, IfcObjectReferenceSelect
			Property Id As [STRING]

			Property FamilyName As [STRING]

			Property GivenName As [STRING]

			Property MiddleNames As [STRING]

			Property PrefixTitles As [STRING]

			Property SuffixTitles As [STRING]

			''' <summary>
			''' EngagedIn oppositeOf ThePerson
			''' </summary>
			Property EngagedIn As [[IfcPersonAndOrganization]]

			Property Roles As List(Of [[IfcActorRole]]

			''' <summary>
			''' Addresses oppositeOf OfPerson
			''' </summary>
			Property Addresses As List(Of [[IfcAddress]]
		End Interface
	#End Region

	#Region " Interface IfcPersonAndOrganization "
		Interface IfcPersonAndOrganization : Inherits IfcActorSelect, IfcObjectReferenceSelect
			''' <summary>
			''' ThePerson oppositeOf EngagedIn
			''' </summary>
			Property ThePerson As [[IfcPerson]]

			''' <summary>
			''' TheOrganization oppositeOf Engages
			''' </summary>
			Property TheOrganization As [[IfcOrganization]]

			Property Roles As List(Of [[IfcActorRole]]
		End Interface
	#End Region

	#Region " Interface IfcPhysicalComplexQuantity "
		Interface IfcPhysicalComplexQuantity : Inherits IfcPhysicalQuantity
			Property Discrimination As [STRING]

			Property Quality As [STRING]

			Property Usage As [STRING]

			''' <summary>
			''' HasQuantities oppositeOf PartOfComplex
			''' </summary>
			Property HasQuantities As List(Of [[IfcPhysicalQuantity]]
		End Interface
	#End Region

	#Region " Interface IfcPhysicalQuantity "
		Interface IfcPhysicalQuantity
			Property Name As [STRING]

			Property Description As [STRING]

			''' <summary>
			''' PartOfComplex oppositeOf HasQuantities
			''' </summary>
			Property PartOfComplex As [[IfcPhysicalComplexQuantity]]
		End Interface
	#End Region

	#Region " Interface IfcPhysicalSimpleQuantity "
		Interface IfcPhysicalSimpleQuantity : Inherits IfcPhysicalQuantity
			Property Unit As [[IfcNamedUnit]]
		End Interface
	#End Region

	#Region " Interface IfcPile "
		Interface IfcPile : Inherits IfcBuildingElement
			Property PredefinedType As [[IfcPileTypeEnum]]

			Property ConstructionType As [[IfcPileConstructionEnum]]
		End Interface
	#End Region

	#Region " Interface IfcPipeFittingType "
		Interface IfcPipeFittingType : Inherits IfcFlowFittingType
			Property PredefinedType As [[IfcPipeFittingTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcPipeSegmentType "
		Interface IfcPipeSegmentType : Inherits IfcFlowSegmentType
			Property PredefinedType As [[IfcPipeSegmentTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcPixelTexture "
		Interface IfcPixelTexture : Inherits IfcSurfaceTexture
			Property Width As [INTEGER]

			Property Height As [INTEGER]

			Property ColourComponents As [INTEGER]

			Property Pixel As BINARY
		End Interface
	#End Region

	#Region " Interface IfcPlacement "
		Interface IfcPlacement : Inherits IfcGeometricRepresentationItem
			Property Location As [[IfcCartesianPoint]]
		End Interface
	#End Region

	#Region " Interface IfcPlanarBox "
		Interface IfcPlanarBox : Inherits IfcPlanarExtent
			Property Placement As [[IfcAxis2Placement]]
		End Interface
	#End Region

	#Region " Interface IfcPlanarExtent "
		Interface IfcPlanarExtent : Inherits IfcGeometricRepresentationItem
			Property SizeInX As REAL

			Property SizeInY As REAL
		End Interface
	#End Region

	#Region " Interface IfcPlane "
		Interface IfcPlane : Inherits IfcElementarySurface
			
		End Interface
	#End Region

	#Region " Interface IfcPlate "
		Interface IfcPlate : Inherits IfcBuildingElement
			
		End Interface
	#End Region

	#Region " Interface IfcPlateType "
		Interface IfcPlateType : Inherits IfcBuildingElementType
			Property PredefinedType As [[IfcPlateTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcPoint "
		Interface IfcPoint : Inherits IfcGeometricSetSelect, IfcPointOrVertexPoint, IfcGeometricRepresentationItem
			
		End Interface
	#End Region

	#Region " Interface IfcPointOnCurve "
		Interface IfcPointOnCurve : Inherits IfcPoint
			Property BasisCurve As [[IfcCurve]]

			Property PointParameter As REAL
		End Interface
	#End Region

	#Region " Interface IfcPointOnSurface "
		Interface IfcPointOnSurface : Inherits IfcPoint
			Property PointParameterU As REAL

			Property PointParameterV As REAL

			Property BasisSurface As [[IfcSurface]]
		End Interface
	#End Region

	#Region " Interface IfcPolyLoop "
		Interface IfcPolyLoop : Inherits IfcLoop
			Property Polygon As List(Of [[IfcCartesianPoint]]
		End Interface
	#End Region

	#Region " Interface IfcPolygonalBoundedHalfSpace "
		Interface IfcPolygonalBoundedHalfSpace : Inherits IfcHalfSpaceSolid
			Property Position As [[IfcAxis2Placement3D]]

			Property PolygonalBoundary As [[IfcBoundedCurve]]
		End Interface
	#End Region

	#Region " Interface IfcPolyline "
		Interface IfcPolyline : Inherits IfcBoundedCurve
			Property Points As List(Of [[IfcCartesianPoint]]
		End Interface
	#End Region

	#Region " Interface IfcPort "
		Interface IfcPort : Inherits IfcProduct
			''' <summary>
			''' ContainedIn oppositeOf RelatingPort
			''' </summary>
			Property ContainedIn As [[IfcRelConnectsPortToElement]]

			''' <summary>
			''' ConnectedFrom oppositeOf RelatedPort
			''' </summary>
			Property ConnectedFrom As [[IfcRelConnectsPorts]]

			''' <summary>
			''' ConnectedTo oppositeOf RelatingPort
			''' </summary>
			Property ConnectedTo As [[IfcRelConnectsPorts]]
		End Interface
	#End Region

	#Region " Interface IfcPostalAddress "
		Interface IfcPostalAddress : Inherits IfcAddress
			Property InternalLocation As [STRING]

			Property AddressLines As [STRING]

			Property PostalBox As [STRING]

			Property Town As [STRING]

			Property [Region] As [STRING]

			Property PostalCode As [STRING]

			Property Country As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcPreDefinedColour "
		Interface IfcPreDefinedColour : Inherits IfcColour, IfcPreDefinedItem
			
		End Interface
	#End Region

	#Region " Interface IfcPreDefinedCurveFont "
		Interface IfcPreDefinedCurveFont : Inherits IfcCurveStyleFontSelect, IfcPreDefinedItem
			
		End Interface
	#End Region

	#Region " Interface IfcPreDefinedDimensionSymbol "
		Interface IfcPreDefinedDimensionSymbol : Inherits IfcPreDefinedSymbol
			
		End Interface
	#End Region

	#Region " Interface IfcPreDefinedItem "
		Interface IfcPreDefinedItem
			Property Name As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcPreDefinedPointMarkerSymbol "
		Interface IfcPreDefinedPointMarkerSymbol : Inherits IfcPreDefinedSymbol
			
		End Interface
	#End Region

	#Region " Interface IfcPreDefinedSymbol "
		Interface IfcPreDefinedSymbol : Inherits IfcDefinedSymbolSelect, IfcPreDefinedItem
			
		End Interface
	#End Region

	#Region " Interface IfcPreDefinedTerminatorSymbol "
		Interface IfcPreDefinedTerminatorSymbol : Inherits IfcPreDefinedSymbol
			
		End Interface
	#End Region

	#Region " Interface IfcPreDefinedTextFont "
		Interface IfcPreDefinedTextFont : Inherits IfcTextFontSelect, IfcPreDefinedItem
			
		End Interface
	#End Region

	#Region " Interface IfcPresentationLayerAssignment "
		Interface IfcPresentationLayerAssignment
			Property Name As [STRING]

			Property Description As [STRING]

			Property Identifier As [STRING]

			''' <summary>
			''' AssignedItems oppositeOf LayerAssignments
			''' </summary>
			Property AssignedItems As List(Of [[IfcLayeredItem]]
		End Interface
	#End Region

	#Region " Interface IfcPresentationLayerWithStyle "
		Interface IfcPresentationLayerWithStyle : Inherits IfcPresentationLayerAssignment
			Property LayerOn As LOGICAL

			Property LayerFrozen As LOGICAL

			Property LayerBlocked As LOGICAL

			Property LayerStyles As List(Of [[IfcPresentationStyleSelect]]
		End Interface
	#End Region

	#Region " Interface IfcPresentationStyle "
		Interface IfcPresentationStyle
			Property Name As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcPresentationStyleAssignment "
		Interface IfcPresentationStyleAssignment
			Property Styles As List(Of [[IfcPresentationStyleSelect]]
		End Interface
	#End Region

	#Region " Interface IfcProcedure "
		Interface IfcProcedure : Inherits IfcProcess
			Property ProcedureID As [STRING]

			Property ProcedureType As [[IfcProcedureTypeEnum]]

			Property UserDefinedProcedureType As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcProcess "
		Interface IfcProcess : Inherits IfcObject
			''' <summary>
			''' OperatesOn oppositeOf RelatingProcess
			''' </summary>
			Property OperatesOn As [[IfcRelAssignsToProcess]]

			''' <summary>
			''' IsSuccessorFrom oppositeOf RelatedProcess
			''' </summary>
			Property IsSuccessorFrom As [[IfcRelSequence]]

			''' <summary>
			''' IsPredecessorTo oppositeOf RelatingProcess
			''' </summary>
			Property IsPredecessorTo As [[IfcRelSequence]]
		End Interface
	#End Region

	#Region " Interface IfcProduct "
		Interface IfcProduct : Inherits IfcObject
			''' <summary>
			''' ReferencedBy oppositeOf RelatingProduct
			''' </summary>
			Property ReferencedBy As [[IfcRelAssignsToProduct]]

			''' <summary>
			''' ObjectPlacement oppositeOf PlacesObject
			''' </summary>
			Property ObjectPlacement As [[IfcObjectPlacement]]

			''' <summary>
			''' Representation oppositeOf ShapeOfProduct
			''' </summary>
			Property Representation As [[IfcProductRepresentation]]

			''' <summary>
			''' ReferencedInStructures oppositeOf RelatedElements
			''' </summary>
			Property ReferencedInStructures As [[IfcRelReferencedInSpatialStructure]]

			''' <summary>
			''' ContainedInStructure oppositeOf RelatedElements
			''' </summary>
			Property ContainedInStructure As [[IfcRelContainedInSpatialStructure]]
		End Interface
	#End Region

	#Region " Interface IfcProductDefinitionShape "
		Interface IfcProductDefinitionShape : Inherits IfcProductRepresentation
			''' <summary>
			''' HasShapeAspects oppositeOf PartOfProductDefinitionShape
			''' </summary>
			Property HasShapeAspects As [[IfcShapeAspect]]
		End Interface
	#End Region

	#Region " Interface IfcProductRepresentation "
		Interface IfcProductRepresentation
			Property Name As [STRING]

			Property Description As [STRING]

			''' <summary>
			''' ShapeOfProduct oppositeOf Representation
			''' </summary>
			Property ShapeOfProduct As [[IfcProduct]]

			''' <summary>
			''' Representations oppositeOf OfProductRepresentation
			''' </summary>
			Property Representations As List(Of [[IfcRepresentation]]
		End Interface
	#End Region

	#Region " Interface IfcProductsOfCombustionProperties "
		Interface IfcProductsOfCombustionProperties : Inherits IfcMaterialProperties
			Property SpecificHeatCapacity As REAL

			Property N20Content As REAL

			Property COContent As REAL

			Property CO2Content As REAL
		End Interface
	#End Region

	#Region " Interface IfcProfileDef "
		Interface IfcProfileDef
			Property ProfileType As [[IfcProfileTypeEnum]]

			Property ProfileName As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcProfileProperties "
		Interface IfcProfileProperties
			Property ProfileDefinition As [[IfcProfileDef]]

			Property ProfileName As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcProject "
		Interface IfcProject : Inherits IfcObject
			Property LongName As [STRING]

			Property Phase As [STRING]

			Property RepresentationContexts As List(Of [[IfcRepresentationContext]]

			Property UnitsInContext As [[IfcUnitAssignment]]
		End Interface
	#End Region

	#Region " Interface IfcProjectOrder "
		Interface IfcProjectOrder : Inherits IfcControl
			Property ID As [STRING]

			Property PredefinedType As [[IfcProjectOrderTypeEnum]]

			Property Status As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcProjectOrderRecord "
		Interface IfcProjectOrderRecord : Inherits IfcControl
			Property Records As List(Of [[IfcRelAssignsToProjectOrder]]

			Property PredefinedType As [[IfcProjectOrderRecordTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcProjectionCurve "
		Interface IfcProjectionCurve : Inherits IfcAnnotationCurveOccurrence
			
		End Interface
	#End Region

	#Region " Interface IfcProjectionElement "
		Interface IfcProjectionElement : Inherits IfcFeatureElementAddition
			
		End Interface
	#End Region

	#Region " Interface IfcProperty "
		Interface IfcProperty
			Property Name As [STRING]

			Property Description As [STRING]

			''' <summary>
			''' PropertyForDependance oppositeOf DependingProperty
			''' </summary>
			Property PropertyForDependance As [[IfcPropertyDependencyRelationship]]

			''' <summary>
			''' PropertyDependsOn oppositeOf DependantProperty
			''' </summary>
			Property PropertyDependsOn As [[IfcPropertyDependencyRelationship]]

			''' <summary>
			''' PartOfComplex oppositeOf HasProperties
			''' </summary>
			Property PartOfComplex As [[IfcComplexProperty]]
		End Interface
	#End Region

	#Region " Interface IfcPropertyBoundedValue "
		Interface IfcPropertyBoundedValue : Inherits IfcSimpleProperty
			Property UpperBoundValue As [[IfcValue]]

			Property LowerBoundValue As [[IfcValue]]

			Property Unit As [[IfcUnit]]
		End Interface
	#End Region

	#Region " Interface IfcPropertyConstraintRelationship "
		Interface IfcPropertyConstraintRelationship
			Property Name As [STRING]

			Property Description As [STRING]

			''' <summary>
			''' RelatingConstraint oppositeOf PropertiesForConstraint
			''' </summary>
			Property RelatingConstraint As [[IfcConstraint]]

			Property RelatedProperties As List(Of [[IfcProperty]]
		End Interface
	#End Region

	#Region " Interface IfcPropertyDefinition "
		Interface IfcPropertyDefinition : Inherits IfcRoot
			
		End Interface
	#End Region

	#Region " Interface IfcPropertyDependencyRelationship "
		Interface IfcPropertyDependencyRelationship
			Property Name As [STRING]

			Property Description As [STRING]

			Property Expression As [STRING]

			''' <summary>
			''' DependingProperty oppositeOf PropertyForDependance
			''' </summary>
			Property DependingProperty As [[IfcProperty]]

			''' <summary>
			''' DependantProperty oppositeOf PropertyDependsOn
			''' </summary>
			Property DependantProperty As [[IfcProperty]]
		End Interface
	#End Region

	#Region " Interface IfcPropertyEnumeratedValue "
		Interface IfcPropertyEnumeratedValue : Inherits IfcSimpleProperty
			Property EnumerationValues As List(Of [[IfcValue]]

			Property EnumerationReference As [[IfcPropertyEnumeration]]
		End Interface
	#End Region

	#Region " Interface IfcPropertyEnumeration "
		Interface IfcPropertyEnumeration
			Property EnumerationValues As List(Of [[IfcValue]]

			Property Unit As [[IfcUnit]]

			Property Name As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcPropertyListValue "
		Interface IfcPropertyListValue : Inherits IfcSimpleProperty
			Property ListValues As List(Of [[IfcValue]]

			Property Unit As [[IfcUnit]]
		End Interface
	#End Region

	#Region " Interface IfcPropertyReferenceValue "
		Interface IfcPropertyReferenceValue : Inherits IfcSimpleProperty
			Property PropertyReference As [[IfcObjectReferenceSelect]]

			Property UsageName As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcPropertySet "
		Interface IfcPropertySet : Inherits IfcPropertySetDefinition
			Property HasProperties As List(Of [[IfcProperty]]
		End Interface
	#End Region

	#Region " Interface IfcPropertySetDefinition "
		Interface IfcPropertySetDefinition : Inherits IfcPropertyDefinition
			''' <summary>
			''' PropertyDefinitionOf oppositeOf RelatingPropertyDefinition
			''' </summary>
			Property PropertyDefinitionOf As [[IfcRelDefinesByProperties]]

			''' <summary>
			''' DefinesType oppositeOf HasPropertySets
			''' </summary>
			Property DefinesType As [[IfcTypeObject]]
		End Interface
	#End Region

	#Region " Interface IfcPropertySingleValue "
		Interface IfcPropertySingleValue : Inherits IfcSimpleProperty
			Property NominalValue As [[IfcValue]]

			Property Unit As [[IfcUnit]]
		End Interface
	#End Region

	#Region " Interface IfcPropertyTableValue "
		Interface IfcPropertyTableValue : Inherits IfcSimpleProperty
			Property DefiningValues As List(Of [[IfcValue]]

			Property DefinedValues As List(Of [[IfcValue]]

			Property DefiningUnit As [[IfcUnit]]

			Property DefinedUnit As [[IfcUnit]]

			Property Expression As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcProtectiveDeviceType "
		Interface IfcProtectiveDeviceType : Inherits IfcFlowControllerType
			Property PredefinedType As [[IfcProtectiveDeviceTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcProxy "
		Interface IfcProxy : Inherits IfcProduct
			Property ProxyType As [[IfcObjectTypeEnum]]

			Property Tag As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcPumpType "
		Interface IfcPumpType : Inherits IfcFlowMovingDeviceType
			Property PredefinedType As [[IfcPumpTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcQuantityArea "
		Interface IfcQuantityArea : Inherits IfcPhysicalSimpleQuantity
			Property AreaValue As REAL
		End Interface
	#End Region

	#Region " Interface IfcQuantityCount "
		Interface IfcQuantityCount : Inherits IfcPhysicalSimpleQuantity
			Property CountValue As NUMBER
		End Interface
	#End Region

	#Region " Interface IfcQuantityLength "
		Interface IfcQuantityLength : Inherits IfcPhysicalSimpleQuantity
			Property LengthValue As REAL
		End Interface
	#End Region

	#Region " Interface IfcQuantityTime "
		Interface IfcQuantityTime : Inherits IfcPhysicalSimpleQuantity
			Property TimeValue As REAL
		End Interface
	#End Region

	#Region " Interface IfcQuantityVolume "
		Interface IfcQuantityVolume : Inherits IfcPhysicalSimpleQuantity
			Property VolumeValue As REAL
		End Interface
	#End Region

	#Region " Interface IfcQuantityWeight "
		Interface IfcQuantityWeight : Inherits IfcPhysicalSimpleQuantity
			Property WeightValue As REAL
		End Interface
	#End Region

	#Region " Interface IfcRadiusDimension "
		Interface IfcRadiusDimension : Inherits IfcDimensionCurveDirectedCallout
			
		End Interface
	#End Region

	#Region " Interface IfcRailing "
		Interface IfcRailing : Inherits IfcBuildingElement
			Property PredefinedType As [[IfcRailingTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcRailingType "
		Interface IfcRailingType : Inherits IfcBuildingElementType
			Property PredefinedType As [[IfcRailingTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcRamp "
		Interface IfcRamp : Inherits IfcBuildingElement
			Property ShapeType As [[IfcRampTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcRampFlight "
		Interface IfcRampFlight : Inherits IfcBuildingElement
			
		End Interface
	#End Region

	#Region " Interface IfcRampFlightType "
		Interface IfcRampFlightType : Inherits IfcBuildingElementType
			Property PredefinedType As [[IfcRampFlightTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcRationalBezierCurve "
		Interface IfcRationalBezierCurve : Inherits IfcBezierCurve
			Property WeightsData As REAL
		End Interface
	#End Region

	#Region " Interface IfcRectangleHollowProfileDef "
		Interface IfcRectangleHollowProfileDef : Inherits IfcRectangleProfileDef
			Property WallThickness As REAL

			Property InnerFilletRadius As REAL

			Property OuterFilletRadius As REAL
		End Interface
	#End Region

	#Region " Interface IfcRectangleProfileDef "
		Interface IfcRectangleProfileDef : Inherits IfcParameterizedProfileDef
			Property XDim As REAL

			Property YDim As REAL
		End Interface
	#End Region

	#Region " Interface IfcRectangularPyramid "
		Interface IfcRectangularPyramid : Inherits IfcCsgPrimitive3D
			Property XLength As REAL

			Property YLength As REAL

			Property Height As REAL
		End Interface
	#End Region

	#Region " Interface IfcRectangularTrimmedSurface "
		Interface IfcRectangularTrimmedSurface : Inherits IfcBoundedSurface
			Property U1 As REAL

			Property V1 As REAL

			Property U2 As REAL

			Property V2 As REAL

			Property Usense As [BOOLEAN]

			Property Vsense As [BOOLEAN]

			Property BasisSurface As [[IfcSurface]]
		End Interface
	#End Region

	#Region " Interface IfcReferencesValueDocument "
		Interface IfcReferencesValueDocument
			Property Name As [STRING]

			Property Description As [STRING]

			Property ReferencedDocument As [[IfcDocumentSelect]]

			''' <summary>
			''' ReferencingValues oppositeOf ValuesReferenced
			''' </summary>
			Property ReferencingValues As List(Of [[IfcAppliedValue]]
		End Interface
	#End Region

	#Region " Interface IfcRegularTimeSeries "
		Interface IfcRegularTimeSeries : Inherits IfcTimeSeries
			Property Values As List(Of [[IfcTimeSeriesValue]]

			Property TimeStep As REAL
		End Interface
	#End Region

	#Region " Interface IfcReinforcementBarProperties "
		Interface IfcReinforcementBarProperties
			Property TotalCrossSectionArea As REAL

			Property SteelGrade As [STRING]

			Property BarSurface As [[IfcReinforcingBarSurfaceEnum]]

			Property EffectiveDepth As REAL

			Property NominalBarDiameter As REAL

			Property BarCount As NUMBER
		End Interface
	#End Region

	#Region " Interface IfcReinforcementDefinitionProperties "
		Interface IfcReinforcementDefinitionProperties : Inherits IfcPropertySetDefinition
			Property ReinforcementSectionDefinitions As List(Of [[IfcSectionReinforcementProperties]]

			Property DefinitionType As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcReinforcingBar "
		Interface IfcReinforcingBar : Inherits IfcReinforcingElement
			Property NominalDiameter As REAL

			Property CrossSectionArea As REAL

			Property BarLength As REAL

			Property BarRole As [[IfcReinforcingBarRoleEnum]]

			Property BarSurface As [[IfcReinforcingBarSurfaceEnum]]
		End Interface
	#End Region

	#Region " Interface IfcReinforcingElement "
		Interface IfcReinforcingElement : Inherits IfcBuildingElementComponent
			Property SteelGrade As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcReinforcingMesh "
		Interface IfcReinforcingMesh : Inherits IfcReinforcingElement
			Property MeshLength As REAL

			Property MeshWidth As REAL

			Property LongitudinalBarNominalDiameter As REAL

			Property TransverseBarNominalDiameter As REAL

			Property LongitudinalBarCrossSectionArea As REAL

			Property TransverseBarCrossSectionArea As REAL

			Property LongitudinalBarSpacing As REAL

			Property TransverseBarSpacing As REAL
		End Interface
	#End Region

	#Region " Interface IfcRelAggregates "
		Interface IfcRelAggregates : Inherits IfcRelDecomposes
			
		End Interface
	#End Region

	#Region " Interface IfcRelAssigns "
		Interface IfcRelAssigns : Inherits IfcRelationship
			''' <summary>
			''' RelatedObjects oppositeOf HasAssignments
			''' </summary>
			Property RelatedObjects As List(Of [[IfcObjectDefinition]]

			Property RelatedObjectsType As [[IfcObjectTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcRelAssignsTasks "
		Interface IfcRelAssignsTasks : Inherits IfcRelAssignsToControl
			''' <summary>
			''' TimeForTask oppositeOf ScheduleTimeControlAssigned
			''' </summary>
			Property TimeForTask As [[IfcScheduleTimeControl]]
		End Interface
	#End Region

	#Region " Interface IfcRelAssignsToActor "
		Interface IfcRelAssignsToActor : Inherits IfcRelAssigns
			''' <summary>
			''' RelatingActor oppositeOf IsActingUpon
			''' </summary>
			Property RelatingActor As [[IfcActor]]

			Property ActingRole As [[IfcActorRole]]
		End Interface
	#End Region

	#Region " Interface IfcRelAssignsToControl "
		Interface IfcRelAssignsToControl : Inherits IfcRelAssigns
			''' <summary>
			''' RelatingControl oppositeOf Controls
			''' </summary>
			Property RelatingControl As [[IfcControl]]
		End Interface
	#End Region

	#Region " Interface IfcRelAssignsToGroup "
		Interface IfcRelAssignsToGroup : Inherits IfcRelAssigns
			''' <summary>
			''' RelatingGroup oppositeOf IsGroupedBy
			''' </summary>
			Property RelatingGroup As [[IfcGroup]]
		End Interface
	#End Region

	#Region " Interface IfcRelAssignsToProcess "
		Interface IfcRelAssignsToProcess : Inherits IfcRelAssigns
			''' <summary>
			''' RelatingProcess oppositeOf OperatesOn
			''' </summary>
			Property RelatingProcess As [[IfcProcess]]

			Property QuantityInProcess As [[IfcMeasureWithUnit]]
		End Interface
	#End Region

	#Region " Interface IfcRelAssignsToProduct "
		Interface IfcRelAssignsToProduct : Inherits IfcRelAssigns
			''' <summary>
			''' RelatingProduct oppositeOf ReferencedBy
			''' </summary>
			Property RelatingProduct As [[IfcProduct]]
		End Interface
	#End Region

	#Region " Interface IfcRelAssignsToProjectOrder "
		Interface IfcRelAssignsToProjectOrder : Inherits IfcRelAssignsToControl
			
		End Interface
	#End Region

	#Region " Interface IfcRelAssignsToResource "
		Interface IfcRelAssignsToResource : Inherits IfcRelAssigns
			''' <summary>
			''' RelatingResource oppositeOf ResourceOf
			''' </summary>
			Property RelatingResource As [[IfcResource]]
		End Interface
	#End Region

	#Region " Interface IfcRelAssociates "
		Interface IfcRelAssociates : Inherits IfcRelationship
			''' <summary>
			''' RelatedObjects oppositeOf HasAssociations
			''' </summary>
			Property RelatedObjects As List(Of [[IfcRoot]]
		End Interface
	#End Region

	#Region " Interface IfcRelAssociatesAppliedValue "
		Interface IfcRelAssociatesAppliedValue : Inherits IfcRelAssociates
			Property RelatingAppliedValue As [[IfcAppliedValue]]
		End Interface
	#End Region

	#Region " Interface IfcRelAssociatesApproval "
		Interface IfcRelAssociatesApproval : Inherits IfcRelAssociates
			Property RelatingApproval As [[IfcApproval]]
		End Interface
	#End Region

	#Region " Interface IfcRelAssociatesClassification "
		Interface IfcRelAssociatesClassification : Inherits IfcRelAssociates
			Property RelatingClassification As [[IfcClassificationNotationSelect]]
		End Interface
	#End Region

	#Region " Interface IfcRelAssociatesConstraint "
		Interface IfcRelAssociatesConstraint : Inherits IfcRelAssociates
			Property RelatingConstraint As [[IfcConstraint]]

			Property Intent As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcRelAssociatesDocument "
		Interface IfcRelAssociatesDocument : Inherits IfcRelAssociates
			Property RelatingDocument As [[IfcDocumentSelect]]
		End Interface
	#End Region

	#Region " Interface IfcRelAssociatesLibrary "
		Interface IfcRelAssociatesLibrary : Inherits IfcRelAssociates
			Property RelatingLibrary As [[IfcLibrarySelect]]
		End Interface
	#End Region

	#Region " Interface IfcRelAssociatesMaterial "
		Interface IfcRelAssociatesMaterial : Inherits IfcRelAssociates
			Property RelatingMaterial As [[IfcMaterialSelect]]
		End Interface
	#End Region

	#Region " Interface IfcRelAssociatesProfileProperties "
		Interface IfcRelAssociatesProfileProperties : Inherits IfcRelAssociates
			Property ProfileOrientation As [[IfcOrientationSelect]]

			Property RelatingProfileProperties As [[IfcProfileProperties]]

			Property ProfileSectionLocation As [[IfcShapeAspect]]
		End Interface
	#End Region

	#Region " Interface IfcRelConnects "
		Interface IfcRelConnects : Inherits IfcRelationship
			
		End Interface
	#End Region

	#Region " Interface IfcRelConnectsElements "
		Interface IfcRelConnectsElements : Inherits IfcRelConnects
			Property ConnectionGeometry As [[IfcConnectionGeometry]]

			''' <summary>
			''' RelatingElement oppositeOf ConnectedTo
			''' </summary>
			Property RelatingElement As [[IfcElement]]

			''' <summary>
			''' RelatedElement oppositeOf ConnectedFrom
			''' </summary>
			Property RelatedElement As [[IfcElement]]
		End Interface
	#End Region

	#Region " Interface IfcRelConnectsPathElements "
		Interface IfcRelConnectsPathElements : Inherits IfcRelConnectsElements
			Property RelatingPriorities As [INTEGER]

			Property RelatedPriorities As [INTEGER]

			Property RelatedConnectionType As [[IfcConnectionTypeEnum]]

			Property RelatingConnectionType As [[IfcConnectionTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcRelConnectsPortToElement "
		Interface IfcRelConnectsPortToElement : Inherits IfcRelConnects
			''' <summary>
			''' RelatingPort oppositeOf ContainedIn
			''' </summary>
			Property RelatingPort As [[IfcPort]]

			''' <summary>
			''' RelatedElement oppositeOf HasPorts
			''' </summary>
			Property RelatedElement As [[IfcElement]]
		End Interface
	#End Region

	#Region " Interface IfcRelConnectsPorts "
		Interface IfcRelConnectsPorts : Inherits IfcRelConnects
			''' <summary>
			''' RelatingPort oppositeOf ConnectedTo
			''' </summary>
			Property RelatingPort As [[IfcPort]]

			''' <summary>
			''' RelatedPort oppositeOf ConnectedFrom
			''' </summary>
			Property RelatedPort As [[IfcPort]]

			Property RealizingElement As [[IfcElement]]
		End Interface
	#End Region

	#Region " Interface IfcRelConnectsStructuralActivity "
		Interface IfcRelConnectsStructuralActivity : Inherits IfcRelConnects
			''' <summary>
			''' RelatingElement oppositeOf AssignedStructuralActivity
			''' </summary>
			Property RelatingElement As [[IfcStructuralActivityAssignmentSelect]]

			''' <summary>
			''' RelatedStructuralActivity oppositeOf AssignedToStructuralItem
			''' </summary>
			Property RelatedStructuralActivity As [[IfcStructuralActivity]]
		End Interface
	#End Region

	#Region " Interface IfcRelConnectsStructuralElement "
		Interface IfcRelConnectsStructuralElement : Inherits IfcRelConnects
			''' <summary>
			''' RelatingElement oppositeOf HasStructuralMember
			''' </summary>
			Property RelatingElement As [[IfcElement]]

			''' <summary>
			''' RelatedStructuralMember oppositeOf ReferencesElement
			''' </summary>
			Property RelatedStructuralMember As [[IfcStructuralMember]]
		End Interface
	#End Region

	#Region " Interface IfcRelConnectsStructuralMember "
		Interface IfcRelConnectsStructuralMember : Inherits IfcRelConnects
			''' <summary>
			''' RelatingStructuralMember oppositeOf ConnectedBy
			''' </summary>
			Property RelatingStructuralMember As [[IfcStructuralMember]]

			''' <summary>
			''' RelatedStructuralConnection oppositeOf ConnectsStructuralMembers
			''' </summary>
			Property RelatedStructuralConnection As [[IfcStructuralConnection]]

			Property AppliedCondition As [[IfcBoundaryCondition]]

			Property AdditionalConditions As [[IfcStructuralConnectionCondition]]

			Property ConditionCoordinateSystem As [[IfcAxis2Placement3D]]

			Property SupportedLength As REAL
		End Interface
	#End Region

	#Region " Interface IfcRelConnectsWithEccentricity "
		Interface IfcRelConnectsWithEccentricity : Inherits IfcRelConnectsStructuralMember
			Property ConnectionConstraint As [[IfcConnectionGeometry]]
		End Interface
	#End Region

	#Region " Interface IfcRelConnectsWithRealizingElements "
		Interface IfcRelConnectsWithRealizingElements : Inherits IfcRelConnectsElements
			''' <summary>
			''' RealizingElements oppositeOf IsConnectionRealization
			''' </summary>
			Property RealizingElements As List(Of [[IfcElement]]

			Property ConnectionType As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcRelContainedInSpatialStructure "
		Interface IfcRelContainedInSpatialStructure : Inherits IfcRelConnects
			''' <summary>
			''' RelatedElements oppositeOf ContainedInStructure
			''' </summary>
			Property RelatedElements As List(Of [[IfcProduct]]

			''' <summary>
			''' RelatingStructure oppositeOf ContainsElements
			''' </summary>
			Property RelatingStructure As [[IfcSpatialStructureElement]]
		End Interface
	#End Region

	#Region " Interface IfcRelCoversBldgElements "
		Interface IfcRelCoversBldgElements : Inherits IfcRelConnects
			''' <summary>
			''' RelatingBuildingElement oppositeOf HasCoverings
			''' </summary>
			Property RelatingBuildingElement As [[IfcElement]]

			''' <summary>
			''' RelatedCoverings oppositeOf Covers
			''' </summary>
			Property RelatedCoverings As List(Of [[IfcCovering]]
		End Interface
	#End Region

	#Region " Interface IfcRelCoversSpaces "
		Interface IfcRelCoversSpaces : Inherits IfcRelConnects
			''' <summary>
			''' RelatedSpace oppositeOf HasCoverings
			''' </summary>
			Property RelatedSpace As [[IfcSpace]]

			''' <summary>
			''' RelatedCoverings oppositeOf CoversSpaces
			''' </summary>
			Property RelatedCoverings As List(Of [[IfcCovering]]
		End Interface
	#End Region

	#Region " Interface IfcRelDecomposes "
		Interface IfcRelDecomposes : Inherits IfcRelationship
			''' <summary>
			''' RelatingObject oppositeOf IsDecomposedBy
			''' </summary>
			Property RelatingObject As [[IfcObjectDefinition]]

			''' <summary>
			''' RelatedObjects oppositeOf Decomposes
			''' </summary>
			Property RelatedObjects As List(Of [[IfcObjectDefinition]]
		End Interface
	#End Region

	#Region " Interface IfcRelDefines "
		Interface IfcRelDefines : Inherits IfcRelationship
			''' <summary>
			''' RelatedObjects oppositeOf IsDefinedBy
			''' </summary>
			Property RelatedObjects As List(Of [[IfcObject]]
		End Interface
	#End Region

	#Region " Interface IfcRelDefinesByProperties "
		Interface IfcRelDefinesByProperties : Inherits IfcRelDefines
			''' <summary>
			''' RelatingPropertyDefinition oppositeOf PropertyDefinitionOf
			''' </summary>
			Property RelatingPropertyDefinition As [[IfcPropertySetDefinition]]
		End Interface
	#End Region

	#Region " Interface IfcRelDefinesByType "
		Interface IfcRelDefinesByType : Inherits IfcRelDefines
			''' <summary>
			''' RelatingType oppositeOf ObjectTypeOf
			''' </summary>
			Property RelatingType As [[IfcTypeObject]]
		End Interface
	#End Region

	#Region " Interface IfcRelFillsElement "
		Interface IfcRelFillsElement : Inherits IfcRelConnects
			''' <summary>
			''' RelatingOpeningElement oppositeOf HasFillings
			''' </summary>
			Property RelatingOpeningElement As [[IfcOpeningElement]]

			''' <summary>
			''' RelatedBuildingElement oppositeOf FillsVoids
			''' </summary>
			Property RelatedBuildingElement As [[IfcElement]]
		End Interface
	#End Region

	#Region " Interface IfcRelFlowControlElements "
		Interface IfcRelFlowControlElements : Inherits IfcRelConnects
			''' <summary>
			''' RelatedControlElements oppositeOf AssignedToFlowElement
			''' </summary>
			Property RelatedControlElements As List(Of [[IfcDistributionControlElement]]

			''' <summary>
			''' RelatingFlowElement oppositeOf HasControlElements
			''' </summary>
			Property RelatingFlowElement As [[IfcDistributionFlowElement]]
		End Interface
	#End Region

	#Region " Interface IfcRelInteractionRequirements "
		Interface IfcRelInteractionRequirements : Inherits IfcRelConnects
			Property DailyInteraction As NUMBER

			Property ImportanceRating As REAL

			Property LocationOfInteraction As [[IfcSpatialStructureElement]]

			''' <summary>
			''' RelatedSpaceProgram oppositeOf HasInteractionReqsFrom
			''' </summary>
			Property RelatedSpaceProgram As [[IfcSpaceProgram]]

			''' <summary>
			''' RelatingSpaceProgram oppositeOf HasInteractionReqsTo
			''' </summary>
			Property RelatingSpaceProgram As [[IfcSpaceProgram]]
		End Interface
	#End Region

	#Region " Interface IfcRelNests "
		Interface IfcRelNests : Inherits IfcRelDecomposes
			
		End Interface
	#End Region

	#Region " Interface IfcRelOccupiesSpaces "
		Interface IfcRelOccupiesSpaces : Inherits IfcRelAssignsToActor
			
		End Interface
	#End Region

	#Region " Interface IfcRelOverridesProperties "
		Interface IfcRelOverridesProperties : Inherits IfcRelDefinesByProperties
			Property OverridingProperties As List(Of [[IfcProperty]]
		End Interface
	#End Region

	#Region " Interface IfcRelProjectsElement "
		Interface IfcRelProjectsElement : Inherits IfcRelConnects
			''' <summary>
			''' RelatingElement oppositeOf HasProjections
			''' </summary>
			Property RelatingElement As [[IfcElement]]

			''' <summary>
			''' RelatedFeatureElement oppositeOf ProjectsElements
			''' </summary>
			Property RelatedFeatureElement As [[IfcFeatureElementAddition]]
		End Interface
	#End Region

	#Region " Interface IfcRelReferencedInSpatialStructure "
		Interface IfcRelReferencedInSpatialStructure : Inherits IfcRelConnects
			''' <summary>
			''' RelatedElements oppositeOf ReferencedInStructures
			''' </summary>
			Property RelatedElements As List(Of [[IfcProduct]]

			''' <summary>
			''' RelatingStructure oppositeOf ReferencesElements
			''' </summary>
			Property RelatingStructure As [[IfcSpatialStructureElement]]
		End Interface
	#End Region

	#Region " Interface IfcRelSchedulesCostItems "
		Interface IfcRelSchedulesCostItems : Inherits IfcRelAssignsToControl
			
		End Interface
	#End Region

	#Region " Interface IfcRelSequence "
		Interface IfcRelSequence : Inherits IfcRelConnects
			Property TimeLag As REAL

			Property SequenceType As [[IfcSequenceEnum]]

			''' <summary>
			''' RelatingProcess oppositeOf IsPredecessorTo
			''' </summary>
			Property RelatingProcess As [[IfcProcess]]

			''' <summary>
			''' RelatedProcess oppositeOf IsSuccessorFrom
			''' </summary>
			Property RelatedProcess As [[IfcProcess]]
		End Interface
	#End Region

	#Region " Interface IfcRelServicesBuildings "
		Interface IfcRelServicesBuildings : Inherits IfcRelConnects
			''' <summary>
			''' RelatingSystem oppositeOf ServicesBuildings
			''' </summary>
			Property RelatingSystem As [[IfcSystem]]

			''' <summary>
			''' RelatedBuildings oppositeOf ServicedBySystems
			''' </summary>
			Property RelatedBuildings As List(Of [[IfcSpatialStructureElement]]
		End Interface
	#End Region

	#Region " Interface IfcRelSpaceBoundary "
		Interface IfcRelSpaceBoundary : Inherits IfcRelConnects
			Property PhysicalOrVirtualBoundary As [[IfcPhysicalOrVirtualEnum]]

			Property InternalOrExternalBoundary As [[IfcInternalOrExternalEnum]]

			''' <summary>
			''' RelatingSpace oppositeOf BoundedBy
			''' </summary>
			Property RelatingSpace As [[IfcSpace]]

			''' <summary>
			''' RelatedBuildingElement oppositeOf ProvidesBoundaries
			''' </summary>
			Property RelatedBuildingElement As [[IfcElement]]

			Property ConnectionGeometry As [[IfcConnectionGeometry]]
		End Interface
	#End Region

	#Region " Interface IfcRelVoidsElement "
		Interface IfcRelVoidsElement : Inherits IfcRelConnects
			''' <summary>
			''' RelatingBuildingElement oppositeOf HasOpenings
			''' </summary>
			Property RelatingBuildingElement As [[IfcElement]]

			''' <summary>
			''' RelatedOpeningElement oppositeOf VoidsElements
			''' </summary>
			Property RelatedOpeningElement As [[IfcFeatureElementSubtraction]]
		End Interface
	#End Region

	#Region " Interface IfcRelationship "
		Interface IfcRelationship : Inherits IfcRoot
			
		End Interface
	#End Region

	#Region " Interface IfcRelaxation "
		Interface IfcRelaxation
			Property RelaxationValue As REAL

			Property InitialStress As REAL
		End Interface
	#End Region

	#Region " Interface IfcRepresentation "
		Interface IfcRepresentation : Inherits IfcLayeredItem
			Property RepresentationIdentifier As [STRING]

			Property RepresentationType As [STRING]

			''' <summary>
			''' RepresentationMap oppositeOf MappedRepresentation
			''' </summary>
			Property RepresentationMap As [[IfcRepresentationMap]]

			''' <summary>
			''' OfProductRepresentation oppositeOf Representations
			''' </summary>
			Property OfProductRepresentation As [[IfcProductRepresentation]]

			''' <summary>
			''' ContextOfItems oppositeOf RepresentationsInContext
			''' </summary>
			Property ContextOfItems As [[IfcRepresentationContext]]

			Property Items As List(Of [[IfcRepresentationItem]]
		End Interface
	#End Region

	#Region " Interface IfcRepresentationContext "
		Interface IfcRepresentationContext
			Property ContextIdentifier As [STRING]

			Property ContextType As [STRING]

			''' <summary>
			''' RepresentationsInContext oppositeOf ContextOfItems
			''' </summary>
			Property RepresentationsInContext As [[IfcRepresentation]]
		End Interface
	#End Region

	#Region " Interface IfcRepresentationItem "
		Interface IfcRepresentationItem : Inherits IfcLayeredItem
			''' <summary>
			''' StyledByItem oppositeOf Item
			''' </summary>
			Property StyledByItem As [[IfcStyledItem]]
		End Interface
	#End Region

	#Region " Interface IfcRepresentationMap "
		Interface IfcRepresentationMap
			''' <summary>
			''' MapUsage oppositeOf MappingSource
			''' </summary>
			Property MapUsage As [[IfcMappedItem]]

			Property MappingOrigin As [[IfcAxis2Placement]]

			''' <summary>
			''' MappedRepresentation oppositeOf RepresentationMap
			''' </summary>
			Property MappedRepresentation As [[IfcRepresentation]]
		End Interface
	#End Region

	#Region " Interface IfcResource "
		Interface IfcResource : Inherits IfcObject
			''' <summary>
			''' ResourceOf oppositeOf RelatingResource
			''' </summary>
			Property ResourceOf As [[IfcRelAssignsToResource]]
		End Interface
	#End Region

	#Region " Interface IfcRevolvedAreaSolid "
		Interface IfcRevolvedAreaSolid : Inherits IfcSweptAreaSolid
			Property Axis As [[IfcAxis1Placement]]

			Property Angle As REAL
		End Interface
	#End Region

	#Region " Interface IfcRibPlateProfileProperties "
		Interface IfcRibPlateProfileProperties : Inherits IfcProfileProperties
			Property Thickness As REAL

			Property RibHeight As REAL

			Property RibWidth As REAL

			Property RibSpacing As REAL

			Property Direction As [[IfcRibPlateDirectionEnum]]
		End Interface
	#End Region

	#Region " Interface IfcRightCircularCone "
		Interface IfcRightCircularCone : Inherits IfcCsgPrimitive3D
			Property Height As REAL

			Property BottomRadius As REAL
		End Interface
	#End Region

	#Region " Interface IfcRightCircularCylinder "
		Interface IfcRightCircularCylinder : Inherits IfcCsgPrimitive3D
			Property Height As REAL

			Property Radius As REAL
		End Interface
	#End Region

	#Region " Interface IfcRoof "
		Interface IfcRoof : Inherits IfcBuildingElement
			Property ShapeType As [[IfcRoofTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcRoot "
		Interface IfcRoot
			Property GlobalId As [STRING]

			Property Name As [STRING]

			Property Description As [STRING]

			Property OwnerHistory As [[IfcOwnerHistory]]

			''' <summary>
			''' HasAssociations oppositeOf RelatedObjects
			''' </summary>
			Property HasAssociations As [[IfcRelAssociates]]
		End Interface
	#End Region

	#Region " Interface IfcRoundedEdgeFeature "
		Interface IfcRoundedEdgeFeature : Inherits IfcEdgeFeature
			Property Radius As REAL
		End Interface
	#End Region

	#Region " Interface IfcRoundedRectangleProfileDef "
		Interface IfcRoundedRectangleProfileDef : Inherits IfcRectangleProfileDef
			Property RoundingRadius As REAL
		End Interface
	#End Region

	#Region " Interface IfcSIUnit "
		Interface IfcSIUnit : Inherits IfcNamedUnit
			Property Prefix As [[IfcSIPrefix]]

			Property Name As [[IfcSIUnitName]]
		End Interface
	#End Region

	#Region " Interface IfcSanitaryTerminalType "
		Interface IfcSanitaryTerminalType : Inherits IfcFlowTerminalType
			Property PredefinedType As [[IfcSanitaryTerminalTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcScheduleTimeControl "
		Interface IfcScheduleTimeControl : Inherits IfcControl
			Property ScheduleDuration As REAL

			Property ActualDuration As REAL

			Property RemainingTime As REAL

			Property FreeFloat As REAL

			Property TotalFloat As REAL

			Property IsCritical As [BOOLEAN]

			Property StartFloat As REAL

			Property FinishFloat As REAL

			Property Completion As REAL

			''' <summary>
			''' ScheduleTimeControlAssigned oppositeOf TimeForTask
			''' </summary>
			Property ScheduleTimeControlAssigned As [[IfcRelAssignsTasks]]

			Property ActualStart As [[IfcDateTimeSelect]]

			Property EarlyStart As [[IfcDateTimeSelect]]

			Property LateStart As [[IfcDateTimeSelect]]

			Property ScheduleStart As [[IfcDateTimeSelect]]

			Property ActualFinish As [[IfcDateTimeSelect]]

			Property EarlyFinish As [[IfcDateTimeSelect]]

			Property LateFinish As [[IfcDateTimeSelect]]

			Property ScheduleFinish As [[IfcDateTimeSelect]]

			Property StatusTime As [[IfcDateTimeSelect]]
		End Interface
	#End Region

	#Region " Interface IfcSectionProperties "
		Interface IfcSectionProperties
			Property StartProfile As [[IfcProfileDef]]

			Property EndProfile As [[IfcProfileDef]]

			Property SectionType As [[IfcSectionTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcSectionReinforcementProperties "
		Interface IfcSectionReinforcementProperties
			Property LongitudinalStartPosition As REAL

			Property LongitudinalEndPosition As REAL

			Property TransversePosition As REAL

			Property ReinforcementRole As [[IfcReinforcingBarRoleEnum]]

			Property SectionDefinition As [[IfcSectionProperties]]

			Property CrossSectionReinforcementDefinitions As List(Of [[IfcReinforcementBarProperties]]
		End Interface
	#End Region

	#Region " Interface IfcSectionedSpine "
		Interface IfcSectionedSpine : Inherits IfcGeometricRepresentationItem
			Property SpineCurve As [[IfcCompositeCurve]]

			Property CrossSections As List(Of [[IfcProfileDef]]

			Property CrossSectionPositions As List(Of [[IfcAxis2Placement3D]]
		End Interface
	#End Region

	#Region " Interface IfcSensorType "
		Interface IfcSensorType : Inherits IfcDistributionControlElementType
			Property PredefinedType As [[IfcSensorTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcServiceLife "
		Interface IfcServiceLife : Inherits IfcControl
			Property ServiceLifeType As [[IfcServiceLifeTypeEnum]]

			Property ServiceLifeDuration As REAL
		End Interface
	#End Region

	#Region " Interface IfcServiceLifeFactor "
		Interface IfcServiceLifeFactor : Inherits IfcPropertySetDefinition
			Property UpperValue As [[IfcMeasureValue]]

			Property MostUsedValue As [[IfcMeasureValue]]

			Property LowerValue As [[IfcMeasureValue]]

			Property PredefinedType As [[IfcServiceLifeFactorTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcShapeAspect "
		Interface IfcShapeAspect
			Property Name As [STRING]

			Property Description As [STRING]

			Property ProductDefinitional As LOGICAL

			''' <summary>
			''' ShapeRepresentations oppositeOf OfShapeAspect
			''' </summary>
			Property ShapeRepresentations As List(Of [[IfcShapeModel]]

			''' <summary>
			''' PartOfProductDefinitionShape oppositeOf HasShapeAspects
			''' </summary>
			Property PartOfProductDefinitionShape As [[IfcProductDefinitionShape]]
		End Interface
	#End Region

	#Region " Interface IfcShapeModel "
		Interface IfcShapeModel : Inherits IfcRepresentation
			''' <summary>
			''' OfShapeAspect oppositeOf ShapeRepresentations
			''' </summary>
			Property OfShapeAspect As [[IfcShapeAspect]]
		End Interface
	#End Region

	#Region " Interface IfcShapeRepresentation "
		Interface IfcShapeRepresentation : Inherits IfcShapeModel
			
		End Interface
	#End Region

	#Region " Interface IfcShellBasedSurfaceModel "
		Interface IfcShellBasedSurfaceModel : Inherits IfcGeometricRepresentationItem
			Property SbsmBoundary As List(Of [[IfcShell]]
		End Interface
	#End Region

	#Region " Interface IfcSimpleProperty "
		Interface IfcSimpleProperty : Inherits IfcProperty
			
		End Interface
	#End Region

	#Region " Interface IfcSite "
		Interface IfcSite : Inherits IfcSpatialStructureElement
			Property RefLatitude As [INTEGER]

			Property RefLongitude As [INTEGER]

			Property RefElevation As REAL

			Property LandTitleNumber As [STRING]

			Property SiteAddress As [[IfcPostalAddress]]
		End Interface
	#End Region

	#Region " Interface IfcSlab "
		Interface IfcSlab : Inherits IfcBuildingElement
			Property PredefinedType As [[IfcSlabTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcSlabType "
		Interface IfcSlabType : Inherits IfcBuildingElementType
			Property PredefinedType As [[IfcSlabTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcSlippageConnectionCondition "
		Interface IfcSlippageConnectionCondition : Inherits IfcStructuralConnectionCondition
			Property SlippageX As REAL

			Property SlippageY As REAL

			Property SlippageZ As REAL
		End Interface
	#End Region

	#Region " Interface IfcSolidModel "
		Interface IfcSolidModel : Inherits IfcBooleanOperand, IfcGeometricRepresentationItem
			
		End Interface
	#End Region

	#Region " Interface IfcSoundProperties "
		Interface IfcSoundProperties : Inherits IfcPropertySetDefinition
			Property IsAttenuating As [BOOLEAN]

			Property SoundScale As [[IfcSoundScaleEnum]]

			Property SoundValues As List(Of [[IfcSoundValue]]
		End Interface
	#End Region

	#Region " Interface IfcSoundValue "
		Interface IfcSoundValue : Inherits IfcPropertySetDefinition
			Property SoundLevelSingleValue As [[IfcDerivedMeasureValue]]

			Property SoundLevelTimeSeries As [[IfcTimeSeries]]

			Property Frequency As REAL
		End Interface
	#End Region

	#Region " Interface IfcSpace "
		Interface IfcSpace : Inherits IfcSpatialStructureElement
			Property InteriorOrExteriorSpace As [[IfcInternalOrExternalEnum]]

			Property ElevationWithFlooring As REAL

			''' <summary>
			''' HasCoverings oppositeOf RelatedSpace
			''' </summary>
			Property HasCoverings As [[IfcRelCoversSpaces]]

			''' <summary>
			''' BoundedBy oppositeOf RelatingSpace
			''' </summary>
			Property BoundedBy As [[IfcRelSpaceBoundary]]
		End Interface
	#End Region

	#Region " Interface IfcSpaceHeaterType "
		Interface IfcSpaceHeaterType : Inherits IfcEnergyConversionDeviceType
			Property PredefinedType As [[IfcSpaceHeaterTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcSpaceProgram "
		Interface IfcSpaceProgram : Inherits IfcControl
			Property SpaceProgramIdentifier As [STRING]

			Property MaxRequiredArea As REAL

			Property MinRequiredArea As REAL

			Property StandardRequiredArea As REAL

			''' <summary>
			''' HasInteractionReqsFrom oppositeOf RelatedSpaceProgram
			''' </summary>
			Property HasInteractionReqsFrom As [[IfcRelInteractionRequirements]]

			''' <summary>
			''' HasInteractionReqsTo oppositeOf RelatingSpaceProgram
			''' </summary>
			Property HasInteractionReqsTo As [[IfcRelInteractionRequirements]]

			Property RequestedLocation As [[IfcSpatialStructureElement]]
		End Interface
	#End Region

	#Region " Interface IfcSpaceThermalLoadProperties "
		Interface IfcSpaceThermalLoadProperties : Inherits IfcPropertySetDefinition
			Property ApplicableValueRatio As REAL

			Property ThermalLoadSource As [[IfcThermalLoadSourceEnum]]

			Property PropertySource As [[IfcPropertySourceEnum]]

			Property SourceDescription As [STRING]

			Property MaximumValue As REAL

			Property MinimumValue As REAL

			Property UserDefinedThermalLoadSource As [STRING]

			Property UserDefinedPropertySource As [STRING]

			Property ThermalLoadType As [[IfcThermalLoadTypeEnum]]

			Property ThermalLoadTimeSeriesValues As [[IfcTimeSeries]]
		End Interface
	#End Region

	#Region " Interface IfcSpaceType "
		Interface IfcSpaceType : Inherits IfcSpatialStructureElementType
			Property PredefinedType As [[IfcSpaceTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcSpatialStructureElement "
		Interface IfcSpatialStructureElement : Inherits IfcProduct
			Property LongName As [STRING]

			Property CompositionType As [[IfcElementCompositionEnum]]

			''' <summary>
			''' ReferencesElements oppositeOf RelatingStructure
			''' </summary>
			Property ReferencesElements As [[IfcRelReferencedInSpatialStructure]]

			''' <summary>
			''' ServicedBySystems oppositeOf RelatedBuildings
			''' </summary>
			Property ServicedBySystems As [[IfcRelServicesBuildings]]

			''' <summary>
			''' ContainsElements oppositeOf RelatingStructure
			''' </summary>
			Property ContainsElements As [[IfcRelContainedInSpatialStructure]]
		End Interface
	#End Region

	#Region " Interface IfcSpatialStructureElementType "
		Interface IfcSpatialStructureElementType : Inherits IfcElementType
			
		End Interface
	#End Region

	#Region " Interface IfcSphere "
		Interface IfcSphere : Inherits IfcCsgPrimitive3D
			Property Radius As REAL
		End Interface
	#End Region

	#Region " Interface IfcStackTerminalType "
		Interface IfcStackTerminalType : Inherits IfcFlowTerminalType
			Property PredefinedType As [[IfcStackTerminalTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcStair "
		Interface IfcStair : Inherits IfcBuildingElement
			Property ShapeType As [[IfcStairTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcStairFlight "
		Interface IfcStairFlight : Inherits IfcBuildingElement
			Property NumberOfRiser As [INTEGER]

			Property NumberOfTreads As [INTEGER]

			Property RiserHeight As REAL

			Property TreadLength As REAL
		End Interface
	#End Region

	#Region " Interface IfcStairFlightType "
		Interface IfcStairFlightType : Inherits IfcBuildingElementType
			Property PredefinedType As [[IfcStairFlightTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcStructuralAction "
		Interface IfcStructuralAction : Inherits IfcStructuralActivity
			''' <summary>
			''' CausedBy oppositeOf Causes
			''' </summary>
			Property CausedBy As [[IfcStructuralReaction]]

			Property DestabilizingLoad As [BOOLEAN]
		End Interface
	#End Region

	#Region " Interface IfcStructuralActivity "
		Interface IfcStructuralActivity : Inherits IfcProduct
			''' <summary>
			''' AssignedToStructuralItem oppositeOf RelatedStructuralActivity
			''' </summary>
			Property AssignedToStructuralItem As [[IfcRelConnectsStructuralActivity]]

			Property AppliedLoad As [[IfcStructuralLoad]]

			Property GlobalOrLocal As [[IfcGlobalOrLocalEnum]]
		End Interface
	#End Region

	#Region " Interface IfcStructuralAnalysisModel "
		Interface IfcStructuralAnalysisModel : Inherits IfcSystem
			Property OrientationOf2DPlane As [[IfcAxis2Placement3D]]

			''' <summary>
			''' LoadedBy oppositeOf LoadGroupFor
			''' </summary>
			Property LoadedBy As List(Of [[IfcStructuralLoadGroup]]

			''' <summary>
			''' HasResults oppositeOf ResultGroupFor
			''' </summary>
			Property HasResults As List(Of [[IfcStructuralResultGroup]]

			Property PredefinedType As [[IfcAnalysisModelTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcStructuralConnection "
		Interface IfcStructuralConnection : Inherits IfcStructuralItem
			''' <summary>
			''' ConnectsStructuralMembers oppositeOf RelatedStructuralConnection
			''' </summary>
			Property ConnectsStructuralMembers As [[IfcRelConnectsStructuralMember]]

			Property AppliedCondition As [[IfcBoundaryCondition]]
		End Interface
	#End Region

	#Region " Interface IfcStructuralConnectionCondition "
		Interface IfcStructuralConnectionCondition
			Property Name As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcStructuralCurveConnection "
		Interface IfcStructuralCurveConnection : Inherits IfcStructuralConnection
			
		End Interface
	#End Region

	#Region " Interface IfcStructuralCurveMember "
		Interface IfcStructuralCurveMember : Inherits IfcStructuralMember
			Property PredefinedType As [[IfcStructuralCurveTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcStructuralCurveMemberVarying "
		Interface IfcStructuralCurveMemberVarying : Inherits IfcStructuralCurveMember
			
		End Interface
	#End Region

	#Region " Interface IfcStructuralItem "
		Interface IfcStructuralItem : Inherits IfcStructuralActivityAssignmentSelect, IfcProduct
			
		End Interface
	#End Region

	#Region " Interface IfcStructuralLinearAction "
		Interface IfcStructuralLinearAction : Inherits IfcStructuralAction
			Property ProjectedOrTrue As [[IfcProjectedOrTrueLengthEnum]]
		End Interface
	#End Region

	#Region " Interface IfcStructuralLinearActionVarying "
		Interface IfcStructuralLinearActionVarying : Inherits IfcStructuralLinearAction
			Property VaryingAppliedLoadLocation As [[IfcShapeAspect]]

			Property SubsequentAppliedLoads As List(Of [[IfcStructuralLoad]]
		End Interface
	#End Region

	#Region " Interface IfcStructuralLoad "
		Interface IfcStructuralLoad
			Property Name As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcStructuralLoadGroup "
		Interface IfcStructuralLoadGroup : Inherits IfcGroup
			Property PredefinedType As [[IfcLoadGroupTypeEnum]]

			Property ActionType As [[IfcActionTypeEnum]]

			Property ActionSource As [[IfcActionSourceTypeEnum]]

			Property Coefficient As REAL

			Property Purpose As [STRING]

			''' <summary>
			''' SourceOfResultGroup oppositeOf ResultForLoadGroup
			''' </summary>
			Property SourceOfResultGroup As [[IfcStructuralResultGroup]]

			''' <summary>
			''' LoadGroupFor oppositeOf LoadedBy
			''' </summary>
			Property LoadGroupFor As [[IfcStructuralAnalysisModel]]
		End Interface
	#End Region

	#Region " Interface IfcStructuralLoadLinearForce "
		Interface IfcStructuralLoadLinearForce : Inherits IfcStructuralLoadStatic
			Property LinearForceX As REAL

			Property LinearForceY As REAL

			Property LinearForceZ As REAL

			Property LinearMomentX As REAL

			Property LinearMomentY As REAL

			Property LinearMomentZ As REAL
		End Interface
	#End Region

	#Region " Interface IfcStructuralLoadPlanarForce "
		Interface IfcStructuralLoadPlanarForce : Inherits IfcStructuralLoadStatic
			Property PlanarForceX As REAL

			Property PlanarForceY As REAL

			Property PlanarForceZ As REAL
		End Interface
	#End Region

	#Region " Interface IfcStructuralLoadSingleDisplacement "
		Interface IfcStructuralLoadSingleDisplacement : Inherits IfcStructuralLoadStatic
			Property DisplacementX As REAL

			Property DisplacementY As REAL

			Property DisplacementZ As REAL

			Property RotationalDisplacementRX As REAL

			Property RotationalDisplacementRY As REAL

			Property RotationalDisplacementRZ As REAL
		End Interface
	#End Region

	#Region " Interface IfcStructuralLoadSingleDisplacementDistortion "
		Interface IfcStructuralLoadSingleDisplacementDistortion : Inherits IfcStructuralLoadSingleDisplacement
			Property Distortion As REAL
		End Interface
	#End Region

	#Region " Interface IfcStructuralLoadSingleForce "
		Interface IfcStructuralLoadSingleForce : Inherits IfcStructuralLoadStatic
			Property ForceX As REAL

			Property ForceY As REAL

			Property ForceZ As REAL

			Property MomentX As REAL

			Property MomentY As REAL

			Property MomentZ As REAL
		End Interface
	#End Region

	#Region " Interface IfcStructuralLoadSingleForceWarping "
		Interface IfcStructuralLoadSingleForceWarping : Inherits IfcStructuralLoadSingleForce
			Property WarpingMoment As REAL
		End Interface
	#End Region

	#Region " Interface IfcStructuralLoadStatic "
		Interface IfcStructuralLoadStatic : Inherits IfcStructuralLoad
			
		End Interface
	#End Region

	#Region " Interface IfcStructuralLoadTemperature "
		Interface IfcStructuralLoadTemperature : Inherits IfcStructuralLoadStatic
			Property DeltaT_Constant As REAL

			Property DeltaT_Y As REAL

			Property DeltaT_Z As REAL
		End Interface
	#End Region

	#Region " Interface IfcStructuralMember "
		Interface IfcStructuralMember : Inherits IfcStructuralItem
			''' <summary>
			''' ReferencesElement oppositeOf RelatedStructuralMember
			''' </summary>
			Property ReferencesElement As [[IfcRelConnectsStructuralElement]]

			''' <summary>
			''' ConnectedBy oppositeOf RelatingStructuralMember
			''' </summary>
			Property ConnectedBy As [[IfcRelConnectsStructuralMember]]
		End Interface
	#End Region

	#Region " Interface IfcStructuralPlanarAction "
		Interface IfcStructuralPlanarAction : Inherits IfcStructuralAction
			Property ProjectedOrTrue As [[IfcProjectedOrTrueLengthEnum]]
		End Interface
	#End Region

	#Region " Interface IfcStructuralPlanarActionVarying "
		Interface IfcStructuralPlanarActionVarying : Inherits IfcStructuralPlanarAction
			Property VaryingAppliedLoadLocation As [[IfcShapeAspect]]

			Property SubsequentAppliedLoads As List(Of [[IfcStructuralLoad]]
		End Interface
	#End Region

	#Region " Interface IfcStructuralPointAction "
		Interface IfcStructuralPointAction : Inherits IfcStructuralAction
			
		End Interface
	#End Region

	#Region " Interface IfcStructuralPointConnection "
		Interface IfcStructuralPointConnection : Inherits IfcStructuralConnection
			
		End Interface
	#End Region

	#Region " Interface IfcStructuralPointReaction "
		Interface IfcStructuralPointReaction : Inherits IfcStructuralReaction
			
		End Interface
	#End Region

	#Region " Interface IfcStructuralProfileProperties "
		Interface IfcStructuralProfileProperties : Inherits IfcGeneralProfileProperties
			Property TorsionalConstantX As REAL

			Property MomentOfInertiaYZ As REAL

			Property MomentOfInertiaY As REAL

			Property MomentOfInertiaZ As REAL

			Property WarpingConstant As REAL

			Property ShearCentreZ As REAL

			Property ShearCentreY As REAL

			Property ShearDeformationAreaZ As REAL

			Property ShearDeformationAreaY As REAL

			Property MaximumSectionModulusY As REAL

			Property MinimumSectionModulusY As REAL

			Property MaximumSectionModulusZ As REAL

			Property MinimumSectionModulusZ As REAL

			Property TorsionalSectionModulus As REAL

			Property CentreOfGravityInX As REAL

			Property CentreOfGravityInY As REAL
		End Interface
	#End Region

	#Region " Interface IfcStructuralReaction "
		Interface IfcStructuralReaction : Inherits IfcStructuralActivity
			''' <summary>
			''' Causes oppositeOf CausedBy
			''' </summary>
			Property Causes As [[IfcStructuralAction]]
		End Interface
	#End Region

	#Region " Interface IfcStructuralResultGroup "
		Interface IfcStructuralResultGroup : Inherits IfcGroup
			Property TheoryType As [[IfcAnalysisTheoryTypeEnum]]

			Property IsLinear As [BOOLEAN]

			''' <summary>
			''' ResultGroupFor oppositeOf HasResults
			''' </summary>
			Property ResultGroupFor As [[IfcStructuralAnalysisModel]]

			''' <summary>
			''' ResultForLoadGroup oppositeOf SourceOfResultGroup
			''' </summary>
			Property ResultForLoadGroup As [[IfcStructuralLoadGroup]]
		End Interface
	#End Region

	#Region " Interface IfcStructuralSteelProfileProperties "
		Interface IfcStructuralSteelProfileProperties : Inherits IfcStructuralProfileProperties
			Property ShearAreaZ As REAL

			Property ShearAreaY As REAL

			Property PlasticShapeFactorY As REAL

			Property PlasticShapeFactorZ As REAL
		End Interface
	#End Region

	#Region " Interface IfcStructuralSurfaceConnection "
		Interface IfcStructuralSurfaceConnection : Inherits IfcStructuralConnection
			
		End Interface
	#End Region

	#Region " Interface IfcStructuralSurfaceMember "
		Interface IfcStructuralSurfaceMember : Inherits IfcStructuralMember
			Property PredefinedType As [[IfcStructuralSurfaceTypeEnum]]

			Property Thickness As REAL
		End Interface
	#End Region

	#Region " Interface IfcStructuralSurfaceMemberVarying "
		Interface IfcStructuralSurfaceMemberVarying : Inherits IfcStructuralSurfaceMember
			Property VaryingThicknessLocation As [[IfcShapeAspect]]

			Property SubsequentThickness As REAL
		End Interface
	#End Region

	#Region " Interface IfcStructuredDimensionCallout "
		Interface IfcStructuredDimensionCallout : Inherits IfcDraughtingCallout
			
		End Interface
	#End Region

	#Region " Interface IfcStyleModel "
		Interface IfcStyleModel : Inherits IfcRepresentation
			
		End Interface
	#End Region

	#Region " Interface IfcStyledItem "
		Interface IfcStyledItem : Inherits IfcRepresentationItem
			''' <summary>
			''' Item oppositeOf StyledByItem
			''' </summary>
			Property Item As [[IfcRepresentationItem]]

			Property Styles As List(Of [[IfcPresentationStyleAssignment]]

			Property Name As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcStyledRepresentation "
		Interface IfcStyledRepresentation : Inherits IfcStyleModel
			
		End Interface
	#End Region

	#Region " Interface IfcSubContractResource "
		Interface IfcSubContractResource : Inherits IfcConstructionResource
			Property SubContractor As [[IfcActorSelect]]

			Property JobDescription As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcSubedge "
		Interface IfcSubedge : Inherits IfcEdge
			Property ParentEdge As [[IfcEdge]]
		End Interface
	#End Region

	#Region " Interface IfcSurface "
		Interface IfcSurface : Inherits IfcGeometricSetSelect, IfcSurfaceOrFaceSurface, IfcGeometricRepresentationItem
			
		End Interface
	#End Region

	#Region " Interface IfcSurfaceCurveSweptAreaSolid "
		Interface IfcSurfaceCurveSweptAreaSolid : Inherits IfcSweptAreaSolid
			Property StartParam As REAL

			Property EndParam As REAL

			Property Directrix As [[IfcCurve]]

			Property ReferenceSurface As [[IfcSurface]]
		End Interface
	#End Region

	#Region " Interface IfcSurfaceOfLinearExtrusion "
		Interface IfcSurfaceOfLinearExtrusion : Inherits IfcSweptSurface
			Property ExtrudedDirection As [[IfcDirection]]

			Property Depth As REAL
		End Interface
	#End Region

	#Region " Interface IfcSurfaceOfRevolution "
		Interface IfcSurfaceOfRevolution : Inherits IfcSweptSurface
			Property AxisPosition As [[IfcAxis1Placement]]
		End Interface
	#End Region

	#Region " Interface IfcSurfaceStyle "
		Interface IfcSurfaceStyle : Inherits IfcPresentationStyle
			Property Styles As List(Of [[IfcSurfaceStyleElementSelect]]

			Property Side As [[IfcSurfaceSide]]
		End Interface
	#End Region

	#Region " Interface IfcSurfaceStyleLighting "
		Interface IfcSurfaceStyleLighting : Inherits IfcSurfaceStyleElementSelect
			Property DiffuseTransmissionColour As [[IfcColourRgb]]

			Property DiffuseReflectionColour As [[IfcColourRgb]]

			Property TransmissionColour As [[IfcColourRgb]]

			Property ReflectanceColour As [[IfcColourRgb]]
		End Interface
	#End Region

	#Region " Interface IfcSurfaceStyleRefraction "
		Interface IfcSurfaceStyleRefraction : Inherits IfcSurfaceStyleElementSelect
			Property RefractionIndex As REAL

			Property DispersionFactor As REAL
		End Interface
	#End Region

	#Region " Interface IfcSurfaceStyleRendering "
		Interface IfcSurfaceStyleRendering : Inherits IfcSurfaceStyleShading
			Property Transparency As REAL

			Property ReflectanceMethod As [[IfcReflectanceMethodEnum]]

			Property DiffuseColour As [[IfcColourOrFactor]]

			Property TransmissionColour As [[IfcColourOrFactor]]

			Property DiffuseTransmissionColour As [[IfcColourOrFactor]]

			Property ReflectionColour As [[IfcColourOrFactor]]

			Property SpecularColour As [[IfcColourOrFactor]]

			Property SpecularHighlight As [[IfcSpecularHighlightSelect]]
		End Interface
	#End Region

	#Region " Interface IfcSurfaceStyleShading "
		Interface IfcSurfaceStyleShading : Inherits IfcSurfaceStyleElementSelect
			Property SurfaceColour As [[IfcColourRgb]]
		End Interface
	#End Region

	#Region " Interface IfcSurfaceStyleWithTextures "
		Interface IfcSurfaceStyleWithTextures : Inherits IfcSurfaceStyleElementSelect
			Property Textures As List(Of [[IfcSurfaceTexture]]
		End Interface
	#End Region

	#Region " Interface IfcSurfaceTexture "
		Interface IfcSurfaceTexture
			Property RepeatS As [BOOLEAN]

			Property RepeatT As [BOOLEAN]

			Property TextureType As [[IfcSurfaceTextureEnum]]

			Property TextureTransform As [[IfcCartesianTransformationOperator2D]]
		End Interface
	#End Region

	#Region " Interface IfcSweptAreaSolid "
		Interface IfcSweptAreaSolid : Inherits IfcSolidModel
			Property SweptArea As [[IfcProfileDef]]

			Property Position As [[IfcAxis2Placement3D]]
		End Interface
	#End Region

	#Region " Interface IfcSweptDiskSolid "
		Interface IfcSweptDiskSolid : Inherits IfcSolidModel
			Property Radius As REAL

			Property InnerRadius As REAL

			Property StartParam As REAL

			Property EndParam As REAL

			Property Directrix As [[IfcCurve]]
		End Interface
	#End Region

	#Region " Interface IfcSweptSurface "
		Interface IfcSweptSurface : Inherits IfcSurface
			Property SweptCurve As [[IfcProfileDef]]

			Property Position As [[IfcAxis2Placement3D]]
		End Interface
	#End Region

	#Region " Interface IfcSwitchingDeviceType "
		Interface IfcSwitchingDeviceType : Inherits IfcFlowControllerType
			Property PredefinedType As [[IfcSwitchingDeviceTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcSymbolStyle "
		Interface IfcSymbolStyle : Inherits IfcPresentationStyle
			Property StyleOfSymbol As [[IfcSymbolStyleSelect]]
		End Interface
	#End Region

	#Region " Interface IfcSystem "
		Interface IfcSystem : Inherits IfcGroup
			''' <summary>
			''' ServicesBuildings oppositeOf RelatingSystem
			''' </summary>
			Property ServicesBuildings As [[IfcRelServicesBuildings]]
		End Interface
	#End Region

	#Region " Interface IfcSystemFurnitureElementType "
		Interface IfcSystemFurnitureElementType : Inherits IfcFurnishingElementType
			
		End Interface
	#End Region

	#Region " Interface IfcTShapeProfileDef "
		Interface IfcTShapeProfileDef : Inherits IfcParameterizedProfileDef
			Property Depth As REAL

			Property FlangeWidth As REAL

			Property WebThickness As REAL

			Property FlangeThickness As REAL

			Property FilletRadius As REAL

			Property FlangeEdgeRadius As REAL

			Property WebEdgeRadius As REAL

			Property WebSlope As REAL

			Property FlangeSlope As REAL

			Property CentreOfGravityInY As REAL
		End Interface
	#End Region

	#Region " Interface IfcTable "
		Interface IfcTable
			''' <summary>
			''' Rows oppositeOf OfTable
			''' </summary>
			Property Rows As List(Of [[IfcTableRow]]

			Property Name As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcTableRow "
		Interface IfcTableRow
			Property RowCells As List(Of [[IfcValue]]

			''' <summary>
			''' OfTable oppositeOf Rows
			''' </summary>
			Property OfTable As [[IfcTable]]

			Property IsHeading As [BOOLEAN]
		End Interface
	#End Region

	#Region " Interface IfcTankType "
		Interface IfcTankType : Inherits IfcFlowStorageDeviceType
			Property PredefinedType As [[IfcTankTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcTask "
		Interface IfcTask : Inherits IfcProcess
			Property TaskId As [STRING]

			Property Status As [STRING]

			Property WorkMethod As [STRING]

			Property IsMilestone As [BOOLEAN]

			Property Priority As [INTEGER]
		End Interface
	#End Region

	#Region " Interface IfcTelecomAddress "
		Interface IfcTelecomAddress : Inherits IfcAddress
			Property TelephoneNumbers As [STRING]

			Property FacsimileNumbers As [STRING]

			Property PagerNumber As [STRING]

			Property ElectronicMailAddresses As [STRING]

			Property WWWHomePageURL As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcTendon "
		Interface IfcTendon : Inherits IfcReinforcingElement
			Property PredefinedType As [[IfcTendonTypeEnum]]

			Property NominalDiameter As REAL

			Property CrossSectionArea As REAL

			Property TensionForce As REAL

			Property PreStress As REAL

			Property FrictionCoefficient As REAL

			Property AnchorageSlip As REAL

			Property MinCurvatureRadius As REAL
		End Interface
	#End Region

	#Region " Interface IfcTendonAnchor "
		Interface IfcTendonAnchor : Inherits IfcReinforcingElement
			
		End Interface
	#End Region

	#Region " Interface IfcTerminatorSymbol "
		Interface IfcTerminatorSymbol : Inherits IfcAnnotationSymbolOccurrence
			''' <summary>
			''' AnnotatedCurve oppositeOf AnnotatedBySymbols
			''' </summary>
			Property AnnotatedCurve As [[IfcAnnotationCurveOccurrence]]
		End Interface
	#End Region

	#Region " Interface IfcTextLiteral "
		Interface IfcTextLiteral : Inherits IfcGeometricRepresentationItem
			Property Literal As [STRING]

			Property Path As [[IfcTextPath]]

			Property Placement As [[IfcAxis2Placement]]
		End Interface
	#End Region

	#Region " Interface IfcTextLiteralWithExtent "
		Interface IfcTextLiteralWithExtent : Inherits IfcTextLiteral
			Property Extent As [[IfcPlanarExtent]]

			Property BoxAlignment As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcTextStyle "
		Interface IfcTextStyle : Inherits IfcPresentationStyle
			Property TextCharacterAppearance As [[IfcCharacterStyleSelect]]

			Property TextStyle As [[IfcTextStyleSelect]]

			Property TextFontStyle As [[IfcTextFontSelect]]
		End Interface
	#End Region

	#Region " Interface IfcTextStyleFontModel "
		Interface IfcTextStyleFontModel : Inherits IfcPreDefinedTextFont
			Property FontFamily As [STRING]

			Property FontStyle As [STRING]

			Property FontVariant As [STRING]

			Property FontWeight As [STRING]

			Property FontSize As [[IfcSizeSelect]]
		End Interface
	#End Region

	#Region " Interface IfcTextStyleForDefinedFont "
		Interface IfcTextStyleForDefinedFont : Inherits IfcCharacterStyleSelect
			Property Colour As [[IfcColour]]

			Property BackgroundColour As [[IfcColour]]
		End Interface
	#End Region

	#Region " Interface IfcTextStyleTextModel "
		Interface IfcTextStyleTextModel : Inherits IfcTextStyleSelect
			Property TextAlign As [STRING]

			Property TextDecoration As [STRING]

			Property TextTransform As [STRING]

			Property TextIndent As [[IfcSizeSelect]]

			Property LetterSpacing As [[IfcSizeSelect]]

			Property WordSpacing As [[IfcSizeSelect]]

			Property LineHeight As [[IfcSizeSelect]]
		End Interface
	#End Region

	#Region " Interface IfcTextStyleWithBoxCharacteristics "
		Interface IfcTextStyleWithBoxCharacteristics : Inherits IfcTextStyleSelect
			Property BoxHeight As REAL

			Property BoxWidth As REAL

			Property BoxSlantAngle As REAL

			Property BoxRotateAngle As REAL

			Property CharacterSpacing As [[IfcSizeSelect]]
		End Interface
	#End Region

	#Region " Interface IfcTextureCoordinate "
		Interface IfcTextureCoordinate
			''' <summary>
			''' AnnotatedSurface oppositeOf TextureCoordinates
			''' </summary>
			Property AnnotatedSurface As [[IfcAnnotationSurface]]
		End Interface
	#End Region

	#Region " Interface IfcTextureCoordinateGenerator "
		Interface IfcTextureCoordinateGenerator : Inherits IfcTextureCoordinate
			Property Parameter As List(Of [[IfcSimpleValue]]

			Property Mode As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcTextureMap "
		Interface IfcTextureMap : Inherits IfcTextureCoordinate
			Property TextureMaps As List(Of [[IfcVertexBasedTextureMap]]
		End Interface
	#End Region

	#Region " Interface IfcTextureVertex "
		Interface IfcTextureVertex
			Property Coordinates As REAL
		End Interface
	#End Region

	#Region " Interface IfcThermalMaterialProperties "
		Interface IfcThermalMaterialProperties : Inherits IfcMaterialProperties
			Property SpecificHeatCapacity As REAL

			Property BoilingPoint As REAL

			Property FreezingPoint As REAL

			Property ThermalConductivity As REAL
		End Interface
	#End Region

	#Region " Interface IfcTimeSeries "
		Interface IfcTimeSeries : Inherits IfcObjectReferenceSelect
			Property Name As [STRING]

			Property Description As [STRING]

			Property TimeSeriesDataType As [[IfcTimeSeriesDataTypeEnum]]

			Property DataOrigin As [[IfcDataOriginEnum]]

			Property UserDefinedDataOrigin As [STRING]

			''' <summary>
			''' DocumentedBy oppositeOf ReferencedTimeSeries
			''' </summary>
			Property DocumentedBy As [[IfcTimeSeriesReferenceRelationship]]

			Property StartTime As [[IfcDateTimeSelect]]

			Property EndTime As [[IfcDateTimeSelect]]

			Property Unit As [[IfcUnit]]
		End Interface
	#End Region

	#Region " Interface IfcTimeSeriesReferenceRelationship "
		Interface IfcTimeSeriesReferenceRelationship
			''' <summary>
			''' ReferencedTimeSeries oppositeOf DocumentedBy
			''' </summary>
			Property ReferencedTimeSeries As [[IfcTimeSeries]]

			Property TimeSeriesReferences As List(Of [[IfcDocumentSelect]]
		End Interface
	#End Region

	#Region " Interface IfcTimeSeriesSchedule "
		Interface IfcTimeSeriesSchedule : Inherits IfcControl
			Property ApplicableDates As List(Of [[IfcDateTimeSelect]]

			Property TimeSeries As [[IfcTimeSeries]]

			Property TimeSeriesScheduleType As [[IfcTimeSeriesScheduleTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcTimeSeriesValue "
		Interface IfcTimeSeriesValue
			Property ListValues As List(Of [[IfcValue]]
		End Interface
	#End Region

	#Region " Interface IfcTopologicalRepresentationItem "
		Interface IfcTopologicalRepresentationItem : Inherits IfcRepresentationItem
			
		End Interface
	#End Region

	#Region " Interface IfcTopologyRepresentation "
		Interface IfcTopologyRepresentation : Inherits IfcShapeModel
			
		End Interface
	#End Region

	#Region " Interface IfcTransformerType "
		Interface IfcTransformerType : Inherits IfcEnergyConversionDeviceType
			Property PredefinedType As [[IfcTransformerTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcTransportElement "
		Interface IfcTransportElement : Inherits IfcElement
			Property OperationType As [[IfcTransportElementTypeEnum]]

			Property CapacityByWeight As REAL

			Property CapacityByNumber As NUMBER
		End Interface
	#End Region

	#Region " Interface IfcTransportElementType "
		Interface IfcTransportElementType : Inherits IfcElementType
			Property PredefinedType As [[IfcTransportElementTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcTrapeziumProfileDef "
		Interface IfcTrapeziumProfileDef : Inherits IfcParameterizedProfileDef
			Property BottomXDim As REAL

			Property TopXDim As REAL

			Property YDim As REAL

			Property TopXOffset As REAL
		End Interface
	#End Region

	#Region " Interface IfcTrimmedCurve "
		Interface IfcTrimmedCurve : Inherits IfcBoundedCurve
			Property SenseAgreement As [BOOLEAN]

			Property MasterRepresentation As [[IfcTrimmingPreference]]

			Property Trim1 As List(Of [[IfcTrimmingSelect]]

			Property Trim2 As List(Of [[IfcTrimmingSelect]]

			Property BasisCurve As [[IfcCurve]]
		End Interface
	#End Region

	#Region " Interface IfcTubeBundleType "
		Interface IfcTubeBundleType : Inherits IfcEnergyConversionDeviceType
			Property PredefinedType As [[IfcTubeBundleTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcTwoDirectionRepeatFactor "
		Interface IfcTwoDirectionRepeatFactor : Inherits IfcOneDirectionRepeatFactor
			Property SecondRepeatFactor As [[IfcVector]]
		End Interface
	#End Region

	#Region " Interface IfcTypeObject "
		Interface IfcTypeObject : Inherits IfcObjectDefinition
			''' <summary>
			''' ObjectTypeOf oppositeOf RelatingType
			''' </summary>
			Property ObjectTypeOf As [[IfcRelDefinesByType]]

			''' <summary>
			''' HasPropertySets oppositeOf DefinesType
			''' </summary>
			Property HasPropertySets As List(Of [[IfcPropertySetDefinition]]

			Property ApplicableOccurrence As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcTypeProduct "
		Interface IfcTypeProduct : Inherits IfcTypeObject
			Property RepresentationMaps As List(Of [[IfcRepresentationMap]]

			Property Tag As [STRING]
		End Interface
	#End Region

	#Region " Interface IfcUShapeProfileDef "
		Interface IfcUShapeProfileDef : Inherits IfcParameterizedProfileDef
			Property Depth As REAL

			Property FlangeWidth As REAL

			Property WebThickness As REAL

			Property FlangeThickness As REAL

			Property FilletRadius As REAL

			Property EdgeRadius As REAL

			Property FlangeSlope As REAL

			Property CentreOfGravityInX As REAL
		End Interface
	#End Region

	#Region " Interface IfcUnitAssignment "
		Interface IfcUnitAssignment
			Property Units As List(Of [[IfcUnit]]
		End Interface
	#End Region

	#Region " Interface IfcUnitaryEquipmentType "
		Interface IfcUnitaryEquipmentType : Inherits IfcEnergyConversionDeviceType
			Property PredefinedType As [[IfcUnitaryEquipmentTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcValveType "
		Interface IfcValveType : Inherits IfcFlowControllerType
			Property PredefinedType As [[IfcValveTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcVector "
		Interface IfcVector : Inherits IfcVectorOrDirection, IfcGeometricRepresentationItem
			Property Orientation As [[IfcDirection]]

			Property Magnitude As REAL
		End Interface
	#End Region

	#Region " Interface IfcVertex "
		Interface IfcVertex : Inherits IfcTopologicalRepresentationItem
			
		End Interface
	#End Region

	#Region " Interface IfcVertexBasedTextureMap "
		Interface IfcVertexBasedTextureMap
			Property TextureVertices As List(Of [[IfcTextureVertex]]

			Property TexturePoints As List(Of [[IfcCartesianPoint]]
		End Interface
	#End Region

	#Region " Interface IfcVertexLoop "
		Interface IfcVertexLoop : Inherits IfcLoop
			Property LoopVertex As [[IfcVertex]]
		End Interface
	#End Region

	#Region " Interface IfcVertexPoint "
		Interface IfcVertexPoint : Inherits IfcPointOrVertexPoint, IfcVertex
			Property VertexGeometry As [[IfcPoint]]
		End Interface
	#End Region

	#Region " Interface IfcVibrationIsolatorType "
		Interface IfcVibrationIsolatorType : Inherits IfcDiscreteAccessoryType
			Property PredefinedType As [[IfcVibrationIsolatorTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcVirtualElement "
		Interface IfcVirtualElement : Inherits IfcElement
			
		End Interface
	#End Region

	#Region " Interface IfcVirtualGridIntersection "
		Interface IfcVirtualGridIntersection
			''' <summary>
			''' IntersectingAxes oppositeOf HasIntersections
			''' </summary>
			Property IntersectingAxes As List(Of [[IfcGridAxis]]

			Property OffsetDistances As REAL
		End Interface
	#End Region

	#Region " Interface IfcWall "
		Interface IfcWall : Inherits IfcBuildingElement
			
		End Interface
	#End Region

	#Region " Interface IfcWallStandardCase "
		Interface IfcWallStandardCase : Inherits IfcWall
			
		End Interface
	#End Region

	#Region " Interface IfcWallType "
		Interface IfcWallType : Inherits IfcBuildingElementType
			Property PredefinedType As [[IfcWallTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcWasteTerminalType "
		Interface IfcWasteTerminalType : Inherits IfcFlowTerminalType
			Property PredefinedType As [[IfcWasteTerminalTypeEnum]]
		End Interface
	#End Region

	#Region " Interface IfcWaterProperties "
		Interface IfcWaterProperties : Inherits IfcMaterialProperties
			Property IsPotable As [BOOLEAN]

			Property Hardness As REAL

			Property AlkalinityConcentration As REAL

			Property AcidityConcentration As REAL

			Property ImpuritiesContent As REAL

			Property PHLevel As REAL

			Property DissolvedSolidsContent As REAL
		End Interface
	#End Region

	#Region " Interface IfcWindow "
		Interface IfcWindow : Inherits IfcBuildingElement
			Property OverallHeight As REAL

			Property OverallWidth As REAL
		End Interface
	#End Region

	#Region " Interface IfcWindowLiningProperties "
		Interface IfcWindowLiningProperties : Inherits IfcPropertySetDefinition
			Property LiningDepth As REAL

			Property LiningThickness As REAL

			Property TransomThickness As REAL

			Property MullionThickness As REAL

			Property FirstTransomOffset As REAL

			Property SecondTransomOffset As REAL

			Property FirstMullionOffset As REAL

			Property SecondMullionOffset As REAL

			Property ShapeAspectStyle As [[IfcShapeAspect]]
		End Interface
	#End Region

	#Region " Interface IfcWindowPanelProperties "
		Interface IfcWindowPanelProperties : Inherits IfcPropertySetDefinition
			Property OperationType As [[IfcWindowPanelOperationEnum]]

			Property PanelPosition As [[IfcWindowPanelPositionEnum]]

			Property FrameDepth As REAL

			Property FrameThickness As REAL

			Property ShapeAspectStyle As [[IfcShapeAspect]]
		End Interface
	#End Region

	#Region " Interface IfcWindowStyle "
		Interface IfcWindowStyle : Inherits IfcTypeProduct
			Property ConstructionType As [[IfcWindowStyleConstructionEnum]]

			Property OperationType As [[IfcWindowStyleOperationEnum]]

			Property ParameterTakesPrecedence As [BOOLEAN]

			Property Sizeable As [BOOLEAN]
		End Interface
	#End Region

	#Region " Interface IfcWorkControl "
		Interface IfcWorkControl : Inherits IfcControl
			Property Identifier As [STRING]

			Property Purpose As [STRING]

			Property Duration As REAL

			Property TotalFloat As REAL

			Property WorkControlType As [[IfcWorkControlTypeEnum]]

			Property UserDefinedControlType As [STRING]

			Property CreationDate As [[IfcDateTimeSelect]]

			Property Creators As List(Of [[IfcPerson]]

			Property StartTime As [[IfcDateTimeSelect]]

			Property FinishTime As [[IfcDateTimeSelect]]
		End Interface
	#End Region

	#Region " Interface IfcWorkPlan "
		Interface IfcWorkPlan : Inherits IfcWorkControl
			
		End Interface
	#End Region

	#Region " Interface IfcWorkSchedule "
		Interface IfcWorkSchedule : Inherits IfcWorkControl
			
		End Interface
	#End Region

	#Region " Interface IfcZShapeProfileDef "
		Interface IfcZShapeProfileDef : Inherits IfcParameterizedProfileDef
			Property Depth As REAL

			Property FlangeWidth As REAL

			Property WebThickness As REAL

			Property FlangeThickness As REAL

			Property FilletRadius As REAL

			Property EdgeRadius As REAL
		End Interface
	#End Region

	#Region " Interface IfcZone "
		Interface IfcZone : Inherits IfcGroup
			
		End Interface
	#End Region

	#Region " Enum IfcActionSourceTypeEnum "
		Enum IfcActionSourceTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[BRAKES]
				[RAIN]
				[WAVE]
				[CURRENT]
				[ICE]
				[BUOYANCY]
				[LACK_OF_FIT]
				[CREEP]
				[SHRINKAGE]
				[SYSTEM_IMPERFECTION]
				[PROPPING]
				[ERECTION]
				[TRANSPORT]
				[IMPACT]
				[IMPULSE]
				[FIRE]
				[EARTHQUAKE_E]
				[TEMPERATURE_T]
				[SETTLEMENT_U]
				[PRESTRESSING_P]
				[WIND_W]
				[SNOW_S]
				[LIVE_LOAD_Q]
				[COMPLETION_G1]
				[DEAD_LOAD_G]
			End Enum
	#End Region

	#Region " Enum IfcActionTypeEnum "
		Enum IfcActionTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[EXTRAORDINARY_A]
				[VARIABLE_Q]
				[PERMANENT_G]
			End Enum
	#End Region

	#Region " Enum IfcActuatorTypeEnum "
		Enum IfcActuatorTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[THERMOSTATICACTUATOR]
				[PNEUMATICACTUATOR]
				[HYDRAULICACTUATOR]
				[HANDOPERATEDACTUATOR]
				[ELECTRICACTUATOR]
			End Enum
	#End Region

	#Region " Enum IfcAddressTypeEnum "
		Enum IfcAddressTypeEnum
				[USERDEFINED]
				[DISTRIBUTIONPOINT]
				[HOME]
				[SITE]
				[OFFICE]
			End Enum
	#End Region

	#Region " Enum IfcAheadOrBehind "
		Enum IfcAheadOrBehind
				[BEHIND]
				[AHEAD]
			End Enum
	#End Region

	#Region " Enum IfcAirTerminalBoxTypeEnum "
		Enum IfcAirTerminalBoxTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[VARIABLEFLOWPRESSUREINDEPENDANT]
				[VARIABLEFLOWPRESSUREDEPENDANT]
				[CONSTANTFLOW]
			End Enum
	#End Region

	#Region " Enum IfcAirTerminalTypeEnum "
		Enum IfcAirTerminalTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[LINEARDIFFUSER]
				[LINEARGRILLE]
				[IRIS]
				[EYEBALL]
				[DIFFUSER]
				[REGISTER]
				[GRILLE]
			End Enum
	#End Region

	#Region " Enum IfcAirToAirHeatRecoveryTypeEnum "
		Enum IfcAirToAirHeatRecoveryTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[THERMOSIPHONCOILTYPEHEATEXCHANGERS]
				[THERMOSIPHONSEALEDTUBEHEATEXCHANGERS]
				[TWINTOWERENTHALPYRECOVERYLOOPS]
				[HEATPIPE]
				[RUNAROUNDCOILLOOP]
				[ROTARYWHEEL]
				[FIXEDPLATEPARALLELFLOWEXCHANGER]
				[FIXEDPLATECROSSFLOWEXCHANGER]
				[FIXEDPLATECOUNTERFLOWEXCHANGER]
			End Enum
	#End Region

	#Region " Enum IfcAlarmTypeEnum "
		Enum IfcAlarmTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[WHISTLE]
				[SIREN]
				[MANUALPULLBOX]
				[LIGHT]
				[BREAKGLASSBUTTON]
				[BELL]
			End Enum
	#End Region

	#Region " Enum IfcAnalysisModelTypeEnum "
		Enum IfcAnalysisModelTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[LOADING_3D]
				[OUT_PLANE_LOADING_2D]
				[IN_PLANE_LOADING_2D]
			End Enum
	#End Region

	#Region " Enum IfcAnalysisTheoryTypeEnum "
		Enum IfcAnalysisTheoryTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[FULL_NONLINEAR_THEORY]
				[THIRD_ORDER_THEORY]
				[SECOND_ORDER_THEORY]
				[FIRST_ORDER_THEORY]
			End Enum
	#End Region

	#Region " Enum IfcArithmeticOperatorEnum "
		Enum IfcArithmeticOperatorEnum
				[SUBTRACT]
				[MULTIPLY]
				[DIVIDE]
				[ADD]
			End Enum
	#End Region

	#Region " Enum IfcAssemblyPlaceEnum "
		Enum IfcAssemblyPlaceEnum
				[NOTDEFINED]
				[FACTORY]
				[SITE]
			End Enum
	#End Region

	#Region " Enum IfcBSplineCurveForm "
		Enum IfcBSplineCurveForm
				[UNSPECIFIED]
				[HYPERBOLIC_ARC]
				[PARABOLIC_ARC]
				[ELLIPTIC_ARC]
				[CIRCULAR_ARC]
				[POLYLINE_FORM]
			End Enum
	#End Region

	#Region " Enum IfcBeamTypeEnum "
		Enum IfcBeamTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[T_BEAM]
				[LINTEL]
				[JOIST]
				[BEAM]
			End Enum
	#End Region

	#Region " Enum IfcBenchmarkEnum "
		Enum IfcBenchmarkEnum
				[NOTEQUALTO]
				[EQUALTO]
				[LESSTHANOREQUALTO]
				[LESSTHAN]
				[GREATERTHANOREQUALTO]
				[GREATERTHAN]
			End Enum
	#End Region

	#Region " Enum IfcBoilerTypeEnum "
		Enum IfcBoilerTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[STEAM]
				[WATER]
			End Enum
	#End Region

	#Region " Enum IfcBooleanOperator "
		Enum IfcBooleanOperator
				[DIFFERENCE]
				[INTERSECTION]
				[UNION]
			End Enum
	#End Region

	#Region " Enum IfcBuildingElementProxyTypeEnum "
		Enum IfcBuildingElementProxyTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
			End Enum
	#End Region

	#Region " Enum IfcCableCarrierFittingTypeEnum "
		Enum IfcCableCarrierFittingTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[TEE]
				[REDUCER]
				[CROSS]
				[BEND]
			End Enum
	#End Region

	#Region " Enum IfcCableCarrierSegmentTypeEnum "
		Enum IfcCableCarrierSegmentTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[CONDUITSEGMENT]
				[CABLETRUNKINGSEGMENT]
				[CABLETRAYSEGMENT]
				[CABLELADDERSEGMENT]
			End Enum
	#End Region

	#Region " Enum IfcCableSegmentTypeEnum "
		Enum IfcCableSegmentTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[CONDUCTORSEGMENT]
				[CABLESEGMENT]
			End Enum
	#End Region

	#Region " Enum IfcChangeActionEnum "
		Enum IfcChangeActionEnum
				[MODIFIEDDELETED]
				[MODIFIEDADDED]
				[DELETED]
				[ADDED]
				[MODIFIED]
				[NOCHANGE]
			End Enum
	#End Region

	#Region " Enum IfcChillerTypeEnum "
		Enum IfcChillerTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[HEATRECOVERY]
				[WATERCOOLED]
				[AIRCOOLED]
			End Enum
	#End Region

	#Region " Enum IfcCoilTypeEnum "
		Enum IfcCoilTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[GASHEATINGCOIL]
				[ELECTRICHEATINGCOIL]
				[WATERHEATINGCOIL]
				[STEAMHEATINGCOIL]
				[WATERCOOLINGCOIL]
				[DXCOOLINGCOIL]
			End Enum
	#End Region

	#Region " Enum IfcColumnTypeEnum "
		Enum IfcColumnTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[COLUMN]
			End Enum
	#End Region

	#Region " Enum IfcCompressorTypeEnum "
		Enum IfcCompressorTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[TWINSCREW]
				[SINGLESCREW]
				[ROTARYVANE]
				[ROLLINGPISTON]
				[WELDEDSHELLHERMETIC]
				[SEMIHERMETIC]
				[HERMETIC]
				[OPENTYPE]
				[BOOSTER]
				[SINGLESTAGE]
				[TROCHOIDAL]
				[SCROLL]
				[ROTARY]
				[RECIPROCATING]
				[DYNAMIC]
			End Enum
	#End Region

	#Region " Enum IfcCondenserTypeEnum "
		Enum IfcCondenserTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[EVAPORATIVECOOLED]
				[AIRCOOLED]
				[WATERCOOLEDBRAZEDPLATE]
				[WATERCOOLEDTUBEINTUBE]
				[WATERCOOLEDSHELLCOIL]
				[WATERCOOLEDSHELLTUBE]
			End Enum
	#End Region

	#Region " Enum IfcConnectionTypeEnum "
		Enum IfcConnectionTypeEnum
				[NOTDEFINED]
				[ATEND]
				[ATSTART]
				[ATPATH]
			End Enum
	#End Region

	#Region " Enum IfcConstraintEnum "
		Enum IfcConstraintEnum
				[NOTDEFINED]
				[USERDEFINED]
				[ADVISORY]
				[SOFT]
				[HARD]
			End Enum
	#End Region

	#Region " Enum IfcControllerTypeEnum "
		Enum IfcControllerTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[TWOPOSITION]
				[TIMEDTWOPOSITION]
				[PROPORTIONALINTEGRALDERIVATIVE]
				[PROPORTIONALINTEGRAL]
				[PROPORTIONAL]
				[FLOATING]
			End Enum
	#End Region

	#Region " Enum IfcCooledBeamTypeEnum "
		Enum IfcCooledBeamTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[PASSIVE]
				[ACTIVE]
			End Enum
	#End Region

	#Region " Enum IfcCoolingTowerTypeEnum "
		Enum IfcCoolingTowerTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[MECHANICALFORCEDDRAFT]
				[MECHANICALINDUCEDDRAFT]
				[NATURALDRAFT]
			End Enum
	#End Region

	#Region " Enum IfcCostScheduleTypeEnum "
		Enum IfcCostScheduleTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[SCHEDULEOFRATES]
				[UNPRICEDBILLOFQUANTITIES]
				[PRICEDBILLOFQUANTITIES]
				[TENDER]
				[ESTIMATE]
				[COSTPLAN]
				[BUDGET]
			End Enum
	#End Region

	#Region " Enum IfcCoveringTypeEnum "
		Enum IfcCoveringTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[WRAPPING]
				[SLEEVING]
				[MEMBRANE]
				[INSULATION]
				[ROOFING]
				[CLADDING]
				[FLOORING]
				[CEILING]
			End Enum
	#End Region

	#Region " Enum IfcCurrencyEnum "
		Enum IfcCurrencyEnum
				[NOK]
				[ZWD]
				[ZAR]
				[XEU]
				[VND]
				[VEB]
				[USD]
				[TWD]
				[TTD]
				[TRL]
				[THB]
				[SKP]
				[SGD]
				[SEK]
				[SCR]
				[SAR]
				[RUR]
				[QAR]
				[PTN]
				[PLN]
				[PKR]
				[PHP]
				[PGK]
				[OMR]
				[NZD]
				[NLG]
				[MYR]
				[MXN]
				[MUR]
				[MTL]
				[LUF]
				[LKR]
				[KYD]
				[KWD]
				[KRW]
				[KES]
				[JPY]
				[JOD]
				[JMD]
				[ITL]
				[IRP]
				[INR]
				[ILS]
				[IDR]
				[ICK]
				[HUF]
				[HKD]
				[GRX]
				[GMD]
				[GIP]
				[GBP]
				[FRF]
				[FKP]
				[FJD]
				[FIM]
				[FAK]
				[EUR]
				[EST]
				[EGL]
				[DKK]
				[DEM]
				[DDP]
				[CZK]
				[CYS]
				[CNY]
				[CLP]
				[CHF]
				[CBD]
				[CAD]
				[BZD]
				[BWP]
				[BSD]
				[BRL]
				[BND]
				[BMD]
				[BHD]
				[BGL]
				[BEG]
				[BBD]
				[AUD]
				[ATS]
				[AES]
				[AED]
			End Enum
	#End Region

	#Region " Enum IfcCurtainWallTypeEnum "
		Enum IfcCurtainWallTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
			End Enum
	#End Region

	#Region " Enum IfcDamperTypeEnum "
		Enum IfcDamperTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[FUMEHOODEXHAUST]
				[BALANCINGDAMPER]
				[GRAVITYRELIEFDAMPER]
				[GRAVITYDAMPER]
				[BLASTDAMPER]
				[RELIEFDAMPER]
				[BACKDRAFTDAMPER]
				[FIRESMOKEDAMPER]
				[SMOKEDAMPER]
				[FIREDAMPER]
				[CONTROLDAMPER]
			End Enum
	#End Region

	#Region " Enum IfcDataOriginEnum "
		Enum IfcDataOriginEnum
				[NOTDEFINED]
				[USERDEFINED]
				[SIMULATED]
				[PREDICTED]
				[MEASURED]
			End Enum
	#End Region

	#Region " Enum IfcDerivedUnitEnum "
		Enum IfcDerivedUnitEnum
				[USERDEFINED]
				[WARPINGMOMENTUNIT]
				[WARPINGCONSTANTUNIT]
				[THERMALEXPANSIONCOEFFICIENTUNIT]
				[TEMPERATUREGRADIENTUNIT]
				[SOUNDPRESSUREUNIT]
				[SOUNDPOWERUNIT]
				[SECTIONMODULUSUNIT]
				[SECTIONAREAINTEGRALUNIT]
				[ROTATIONALMASSUNIT]
				[PHUNIT]
				[MODULUSOFROTATIONALSUBGRADEREACTIONUNIT]
				[MODULUSOFLINEARSUBGRADEREACTIONUNIT]
				[MASSPERLENGTHUNIT]
				[LUMINOUSINTENSITYDISTRIBUTIONUNIT]
				[IONCONCENTRATIONUNIT]
				[HEATINGVALUEUNIT]
				[CURVATUREUNIT]
				[ACCELERATIONUNIT]
				[MODULUSOFSUBGRADEREACTIONUNIT]
				[ROTATIONALSTIFFNESSUNIT]
				[LINEARSTIFFNESSUNIT]
				[SHEARMODULUSUNIT]
				[MODULUSOFELASTICITYUNIT]
				[PLANARFORCEUNIT]
				[LINEARFORCEUNIT]
				[LINEARMOMENTUNIT]
				[MOMENTOFINERTIAUNIT]
				[TORQUEUNIT]
				[ROTATIONALFREQUENCYUNIT]
				[VOLUMETRICFLOWRATEUNIT]
				[VAPORPERMEABILITYUNIT]
				[THERMALTRANSMITTANCEUNIT]
				[THERMALRESISTANCEUNIT]
				[THERMALCONDUCTANCEUNIT]
				[THERMALADMITTANCEUNIT]
				[SPECIFICHEATCAPACITYUNIT]
				[MOLECULARWEIGHTUNIT]
				[MOISTUREDIFFUSIVITYUNIT]
				[MASSFLOWRATEUNIT]
				[MASSDENSITYUNIT]
				[LINEARVELOCITYUNIT]
				[KINEMATICVISCOSITYUNIT]
				[ISOTHERMALMOISTURECAPACITYUNIT]
				[INTEGERCOUNTRATEUNIT]
				[HEATFLUXDENSITYUNIT]
				[DYNAMICVISCOSITYUNIT]
				[COMPOUNDPLANEANGLEUNIT]
				[ANGULARVELOCITYUNIT]
			End Enum
	#End Region

	#Region " Enum IfcDimensionExtentUsage "
		Enum IfcDimensionExtentUsage
				[TARGET]
				[ORIGIN]
			End Enum
	#End Region

	#Region " Enum IfcDirectionSenseEnum "
		Enum IfcDirectionSenseEnum
				[NEGATIVE]
				[POSITIVE]
			End Enum
	#End Region

	#Region " Enum IfcDistributionChamberElementTypeEnum "
		Enum IfcDistributionChamberElementTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[VALVECHAMBER]
				[TRENCH]
				[SUMP]
				[METERCHAMBER]
				[MANHOLE]
				[INSPECTIONPIT]
				[INSPECTIONCHAMBER]
				[FORMEDDUCT]
			End Enum
	#End Region

	#Region " Enum IfcDocumentConfidentialityEnum "
		Enum IfcDocumentConfidentialityEnum
				[NOTDEFINED]
				[USERDEFINED]
				[PERSONAL]
				[CONFIDENTIAL]
				[RESTRICTED]
				[[PUBLIC]]
			End Enum
	#End Region

	#Region " Enum IfcDocumentStatusEnum "
		Enum IfcDocumentStatusEnum
				[NOTDEFINED]
				[REVISION]
				[FINAL]
				[FINALDRAFT]
				[DRAFT]
			End Enum
	#End Region

	#Region " Enum IfcDoorPanelOperationEnum "
		Enum IfcDoorPanelOperationEnum
				[NOTDEFINED]
				[USERDEFINED]
				[ROLLINGUP]
				[REVOLVING]
				[FOLDING]
				[SLIDING]
				[DOUBLE_ACTING]
				[SWINGING]
			End Enum
	#End Region

	#Region " Enum IfcDoorPanelPositionEnum "
		Enum IfcDoorPanelPositionEnum
				[NOTDEFINED]
				[RIGHT]
				[MIDDLE]
				[LEFT]
			End Enum
	#End Region

	#Region " Enum IfcDoorStyleConstructionEnum "
		Enum IfcDoorStyleConstructionEnum
				[NOTDEFINED]
				[USERDEFINED]
				[PLASTIC]
				[ALUMINIUM_PLASTIC]
				[ALUMINIUM_WOOD]
				[WOOD]
				[STEEL]
				[HIGH_GRADE_STEEL]
				[ALUMINIUM]
			End Enum
	#End Region

	#Region " Enum IfcDoorStyleOperationEnum "
		Enum IfcDoorStyleOperationEnum
				[NOTDEFINED]
				[USERDEFINED]
				[ROLLINGUP]
				[REVOLVING]
				[DOUBLE_DOOR_FOLDING]
				[FOLDING_TO_RIGHT]
				[FOLDING_TO_LEFT]
				[DOUBLE_DOOR_SLIDING]
				[SLIDING_TO_RIGHT]
				[SLIDING_TO_LEFT]
				[DOUBLE_DOOR_DOUBLE_SWING]
				[DOUBLE_SWING_RIGHT]
				[DOUBLE_SWING_LEFT]
				[DOUBLE_DOOR_SINGLE_SWING_OPPOSITE_RIGHT]
				[DOUBLE_DOOR_SINGLE_SWING_OPPOSITE_LEFT]
				[DOUBLE_DOOR_SINGLE_SWING]
				[SINGLE_SWING_RIGHT]
				[SINGLE_SWING_LEFT]
			End Enum
	#End Region

	#Region " Enum IfcDuctFittingTypeEnum "
		Enum IfcDuctFittingTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[TRANSITION]
				[OBSTRUCTION]
				[JUNCTION]
				[[EXIT]]
				[ENTRY]
				[CONNECTOR]
				[BEND]
			End Enum
	#End Region

	#Region " Enum IfcDuctSegmentTypeEnum "
		Enum IfcDuctSegmentTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[FLEXIBLESEGMENT]
				[RIGIDSEGMENT]
			End Enum
	#End Region

	#Region " Enum IfcDuctSilencerTypeEnum "
		Enum IfcDuctSilencerTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[ROUND]
				[RECTANGULAR]
				[FLATOVAL]
			End Enum
	#End Region

	#Region " Enum IfcElectricApplianceTypeEnum "
		Enum IfcElectricApplianceTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[WATERCOOLER]
				[WATERHEATER]
				[WASHINGMACHINE]
				[VENDINGMACHINE]
				[TV]
				[TUMBLEDRYER]
				[TELEPHONE]
				[SCANNER]
				[RADIANTHEATER]
				[REFRIGERATOR]
				[PRINTER]
				[PHOTOCOPIER]
				[MICROWAVE]
				[INDIRECTWATERHEATER]
				[HANDDRYER]
				[FRIDGE_FREEZER]
				[FREEZER]
				[FREESTANDINGFAN]
				[FACSIMILE]
				[ELECTRICHEATER]
				[ELECTRICCOOKER]
				[DISHWASHER]
				[DIRECTWATERHEATER]
				[COMPUTER]
			End Enum
	#End Region

	#Region " Enum IfcElectricCurrentEnum "
		Enum IfcElectricCurrentEnum
				[NOTDEFINED]
				[DIRECT]
				[ALTERNATING]
			End Enum
	#End Region

	#Region " Enum IfcElectricDistributionPointFunctionEnum "
		Enum IfcElectricDistributionPointFunctionEnum
				[NOTDEFINED]
				[USERDEFINED]
				[SWITCHBOARD]
				[MOTORCONTROLCENTRE]
				[MIMICPANEL]
				[INDICATORPANEL]
				[GASDETECTORPANEL]
				[DISTRIBUTIONBOARD]
				[CONTROLPANEL]
				[CONSUMERUNIT]
				[ALARMPANEL]
			End Enum
	#End Region

	#Region " Enum IfcElectricFlowStorageDeviceTypeEnum "
		Enum IfcElectricFlowStorageDeviceTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[UPS]
				[INDUCTORBANK]
				[HARMONICFILTER]
				[CAPACITORBANK]
				[BATTERY]
			End Enum
	#End Region

	#Region " Enum IfcElectricGeneratorTypeEnum "
		Enum IfcElectricGeneratorTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
			End Enum
	#End Region

	#Region " Enum IfcElectricHeaterTypeEnum "
		Enum IfcElectricHeaterTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[ELECTRICMATHEATER]
				[ELECTRICCABLEHEATER]
				[ELECTRICPOINTHEATER]
			End Enum
	#End Region

	#Region " Enum IfcElectricMotorTypeEnum "
		Enum IfcElectricMotorTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[SYNCHRONOUS]
				[RELUCTANCESYNCHRONOUS]
				[POLYPHASE]
				[INDUCTION]
				[DC]
			End Enum
	#End Region

	#Region " Enum IfcElectricTimeControlTypeEnum "
		Enum IfcElectricTimeControlTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[RELAY]
				[TIMEDELAY]
				[TIMECLOCK]
			End Enum
	#End Region

	#Region " Enum IfcElementAssemblyTypeEnum "
		Enum IfcElementAssemblyTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[TRUSS]
				[SLAB_FIELD]
				[RIGID_FRAME]
				[REINFORCEMENT_UNIT]
				[GIRDER]
				[BRACED_FRAME]
				[BEAM_GRID]
				[ARCH]
				[ACCESSORY_ASSEMBLY]
			End Enum
	#End Region

	#Region " Enum IfcElementCompositionEnum "
		Enum IfcElementCompositionEnum
				[PARTIAL]
				[ELEMENT]
				[COMPLEX]
			End Enum
	#End Region

	#Region " Enum IfcEnergySequenceEnum "
		Enum IfcEnergySequenceEnum
				[NOTDEFINED]
				[USERDEFINED]
				[AUXILIARY]
				[TERTIARY]
				[SECONDARY]
				[PRIMARY]
			End Enum
	#End Region

	#Region " Enum IfcEnvironmentalImpactCategoryEnum "
		Enum IfcEnvironmentalImpactCategoryEnum
				[NOTDEFINED]
				[USERDEFINED]
				[TRANSPORTATION]
				[MANUFACTURE]
				[INSTALLATION]
				[EXTRACTION]
				[DISPOSAL]
				[COMBINEDVALUE]
			End Enum
	#End Region

	#Region " Enum IfcEvaporativeCoolerTypeEnum "
		Enum IfcEvaporativeCoolerTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[INDIRECTDIRECTCOMBINATION]
				[INDIRECTEVAPORATIVECOOLINGTOWERORCOILCOOLER]
				[INDIRECTEVAPORATIVEWETCOIL]
				[INDIRECTEVAPORATIVEPACKAGEAIRCOOLER]
				[DIRECTEVAPORATIVEAIRWASHER]
				[DIRECTEVAPORATIVEPACKAGEDROTARYAIRCOOLER]
				[DIRECTEVAPORATIVESLINGERSPACKAGEDAIRCOOLER]
				[DIRECTEVAPORATIVERIGIDMEDIAAIRCOOLER]
				[DIRECTEVAPORATIVERANDOMMEDIAAIRCOOLER]
			End Enum
	#End Region

	#Region " Enum IfcEvaporatorTypeEnum "
		Enum IfcEvaporatorTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[SHELLANDCOIL]
				[FLOODEDSHELLANDTUBE]
				[DIRECTEXPANSIONBRAZEDPLATE]
				[DIRECTEXPANSIONTUBEINTUBE]
				[DIRECTEXPANSIONSHELLANDTUBE]
			End Enum
	#End Region

	#Region " Enum IfcFanTypeEnum "
		Enum IfcFanTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[PROPELLORAXIAL]
				[VANEAXIAL]
				[TUBEAXIAL]
				[CENTRIFUGALAIRFOIL]
				[CENTRIFUGALBACKWARDINCLINEDCURVED]
				[CENTRIFUGALRADIAL]
				[CENTRIFUGALFORWARDCURVED]
			End Enum
	#End Region

	#Region " Enum IfcFilterTypeEnum "
		Enum IfcFilterTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[WATERFILTER]
				[STRAINER]
				[OILFILTER]
				[ODORFILTER]
				[AIRPARTICLEFILTER]
			End Enum
	#End Region

	#Region " Enum IfcFireSuppressionTerminalTypeEnum "
		Enum IfcFireSuppressionTerminalTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[SPRINKLERDEFLECTOR]
				[SPRINKLER]
				[HOSEREEL]
				[FIREHYDRANT]
				[BREECHINGINLET]
			End Enum
	#End Region

	#Region " Enum IfcFlowDirectionEnum "
		Enum IfcFlowDirectionEnum
				[NOTDEFINED]
				[SOURCEANDSINK]
				[SINK]
				[SOURCE]
			End Enum
	#End Region

	#Region " Enum IfcFlowInstrumentTypeEnum "
		Enum IfcFlowInstrumentTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[VOLTMETER_RMS]
				[VOLTMETER_PEAK]
				[PHASEANGLEMETER]
				[POWERFACTORMETER]
				[FREQUENCYMETER]
				[AMMETER]
				[THERMOMETER]
				[PRESSUREGAUGE]
			End Enum
	#End Region

	#Region " Enum IfcFlowMeterTypeEnum "
		Enum IfcFlowMeterTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[WATERMETER]
				[OILMETER]
				[GASMETER]
				[FLOWMETER]
				[ENERGYMETER]
				[ELECTRICMETER]
			End Enum
	#End Region

	#Region " Enum IfcFootingTypeEnum "
		Enum IfcFootingTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[STRIP_FOOTING]
				[PILE_CAP]
				[PAD_FOOTING]
				[FOOTING_BEAM]
			End Enum
	#End Region

	#Region " Enum IfcGasTerminalTypeEnum "
		Enum IfcGasTerminalTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[GASBURNER]
				[GASBOOSTER]
				[GASAPPLIANCE]
			End Enum
	#End Region

	#Region " Enum IfcGeometricProjectionEnum "
		Enum IfcGeometricProjectionEnum
				[NOTDEFINED]
				[USERDEFINED]
				[ELEVATION_VIEW]
				[SECTION_VIEW]
				[REFLECTED_PLAN_VIEW]
				[PLAN_VIEW]
				[MODEL_VIEW]
				[SKETCH_VIEW]
				[GRAPH_VIEW]
			End Enum
	#End Region

	#Region " Enum IfcGlobalOrLocalEnum "
		Enum IfcGlobalOrLocalEnum
				[LOCAL_COORDS]
				[GLOBAL_COORDS]
			End Enum
	#End Region

	#Region " Enum IfcHeatExchangerTypeEnum "
		Enum IfcHeatExchangerTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[SHELLANDTUBE]
				[PLATE]
			End Enum
	#End Region

	#Region " Enum IfcHumidifierTypeEnum "
		Enum IfcHumidifierTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[ASSISTEDSTEAM]
				[ASSISTEDBUTANE]
				[ASSISTEDPROPANE]
				[ASSISTEDNATURALGAS]
				[ASSISTEDELECTRIC]
				[ADIABATICCOMPRESSEDAIRNOZZLE]
				[ADIABATICRIGIDMEDIA]
				[ADIABATICULTRASONIC]
				[ADIABATICATOMIZING]
				[ADIABATICWETTEDELEMENT]
				[ADIABATICPAN]
				[ADIABATICAIRWASHER]
				[STEAMINJECTION]
			End Enum
	#End Region

	#Region " Enum IfcInternalOrExternalEnum "
		Enum IfcInternalOrExternalEnum
				[NOTDEFINED]
				[EXTERNAL]
				[INTERNAL]
			End Enum
	#End Region

	#Region " Enum IfcInventoryTypeEnum "
		Enum IfcInventoryTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[FURNITUREINVENTORY]
				[SPACEINVENTORY]
				[ASSETINVENTORY]
			End Enum
	#End Region

	#Region " Enum IfcJunctionBoxTypeEnum "
		Enum IfcJunctionBoxTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
			End Enum
	#End Region

	#Region " Enum IfcLampTypeEnum "
		Enum IfcLampTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[TUNGSTENFILAMENT]
				[METALHALIDE]
				[HIGHPRESSURESODIUM]
				[HIGHPRESSUREMERCURY]
				[FLUORESCENT]
				[COMPACTFLUORESCENT]
			End Enum
	#End Region

	#Region " Enum IfcLayerSetDirectionEnum "
		Enum IfcLayerSetDirectionEnum
				[AXIS3]
				[AXIS2]
				[AXIS1]
			End Enum
	#End Region

	#Region " Enum IfcLightDistributionCurveEnum "
		Enum IfcLightDistributionCurveEnum
				[NOTDEFINED]
				[TYPE_C]
				[TYPE_B]
				[TYPE_A]
			End Enum
	#End Region

	#Region " Enum IfcLightEmissionSourceEnum "
		Enum IfcLightEmissionSourceEnum
				[NOTDEFINED]
				[TUNGSTENFILAMENT]
				[METALHALIDE]
				[MAINVOLTAGEHALOGEN]
				[LOWVOLTAGEHALOGEN]
				[LOWPRESSURESODIUM]
				[LIGHTEMITTINGDIODE]
				[HIGHPRESSURESODIUM]
				[HIGHPRESSUREMERCURY]
				[FLUORESCENT]
				[COMPACTFLUORESCENT]
			End Enum
	#End Region

	#Region " Enum IfcLightFixtureTypeEnum "
		Enum IfcLightFixtureTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[DIRECTIONSOURCE]
				[POINTSOURCE]
			End Enum
	#End Region

	#Region " Enum IfcLoadGroupTypeEnum "
		Enum IfcLoadGroupTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[LOAD_COMBINATION]
				[LOAD_COMBINATION_GROUP]
				[LOAD_CASE]
				[LOAD_GROUP]
			End Enum
	#End Region

	#Region " Enum IfcLogicalOperatorEnum "
		Enum IfcLogicalOperatorEnum
				[LOGICALOR]
				[LOGICALAND]
			End Enum
	#End Region

	#Region " Enum IfcMemberTypeEnum "
		Enum IfcMemberTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[STUD]
				[STRUT]
				[STRINGER]
				[RAFTER]
				[PURLIN]
				[POST]
				[PLATE]
				[MULLION]
				[MEMBER]
				[COLLAR]
				[CHORD]
				[BRACE]
			End Enum
	#End Region

	#Region " Enum IfcMotorConnectionTypeEnum "
		Enum IfcMotorConnectionTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[DIRECTDRIVE]
				[COUPLING]
				[BELTDRIVE]
			End Enum
	#End Region

	#Region " Enum IfcNullStyle "
		Enum IfcNullStyle
				[NULL]
			End Enum
	#End Region

	#Region " Enum IfcObjectTypeEnum "
		Enum IfcObjectTypeEnum
				[NOTDEFINED]
				[PROJECT]
				[GROUP]
				[ACTOR]
				[RESOURCE]
				[CONTROL]
				[PROCESS]
				[PRODUCT]
			End Enum
	#End Region

	#Region " Enum IfcObjectiveEnum "
		Enum IfcObjectiveEnum
				[NOTDEFINED]
				[USERDEFINED]
				[TRIGGERCONDITION]
				[SPECIFICATION]
				[REQUIREMENT]
				[HEALTHANDSAFETY]
				[DESIGNINTENT]
				[CODECOMPLIANCE]
			End Enum
	#End Region

	#Region " Enum IfcOccupantTypeEnum "
		Enum IfcOccupantTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[TENANT]
				[OWNER]
				[LETTINGAGENT]
				[LESSOR]
				[LESSEE]
				[ASSIGNOR]
				[ASSIGNEE]
			End Enum
	#End Region

	#Region " Enum IfcOutletTypeEnum "
		Enum IfcOutletTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[POWEROUTLET]
				[COMMUNICATIONSOUTLET]
				[AUDIOVISUALOUTLET]
			End Enum
	#End Region

	#Region " Enum IfcPermeableCoveringOperationEnum "
		Enum IfcPermeableCoveringOperationEnum
				[NOTDEFINED]
				[USERDEFINED]
				[SCREEN]
				[LOUVER]
				[GRILL]
			End Enum
	#End Region

	#Region " Enum IfcPhysicalOrVirtualEnum "
		Enum IfcPhysicalOrVirtualEnum
				[NOTDEFINED]
				[VIRTUAL]
				[PHYSICAL]
			End Enum
	#End Region

	#Region " Enum IfcPileConstructionEnum "
		Enum IfcPileConstructionEnum
				[NOTDEFINED]
				[USERDEFINED]
				[PREFAB_STEEL]
				[PRECAST_CONCRETE]
				[COMPOSITE]
				[CAST_IN_PLACE]
			End Enum
	#End Region

	#Region " Enum IfcPileTypeEnum "
		Enum IfcPileTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[SUPPORT]
				[FRICTION]
				[COHESION]
			End Enum
	#End Region

	#Region " Enum IfcPipeFittingTypeEnum "
		Enum IfcPipeFittingTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[TRANSITION]
				[OBSTRUCTION]
				[JUNCTION]
				[[EXIT]]
				[ENTRY]
				[CONNECTOR]
				[BEND]
			End Enum
	#End Region

	#Region " Enum IfcPipeSegmentTypeEnum "
		Enum IfcPipeSegmentTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[SPOOL]
				[GUTTER]
				[RIGIDSEGMENT]
				[FLEXIBLESEGMENT]
			End Enum
	#End Region

	#Region " Enum IfcPlateTypeEnum "
		Enum IfcPlateTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[SHEET]
				[CURTAIN_PANEL]
			End Enum
	#End Region

	#Region " Enum IfcProcedureTypeEnum "
		Enum IfcProcedureTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[STARTUP]
				[SHUTDOWN]
				[DIAGNOSTIC]
				[CALIBRATION]
				[ADVICE_WARNING]
				[ADVICE_NOTE]
				[ADVICE_CAUTION]
			End Enum
	#End Region

	#Region " Enum IfcProfileTypeEnum "
		Enum IfcProfileTypeEnum
				[AREA]
				[CURVE]
			End Enum
	#End Region

	#Region " Enum IfcProjectOrderRecordTypeEnum "
		Enum IfcProjectOrderRecordTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[WORK]
				[PURCHASE]
				[MOVE]
				[MAINTENANCE]
				[CHANGE]
			End Enum
	#End Region

	#Region " Enum IfcProjectOrderTypeEnum "
		Enum IfcProjectOrderTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[WORKORDER]
				[PURCHASEORDER]
				[MOVEORDER]
				[MAINTENANCEWORKORDER]
				[CHANGEORDER]
			End Enum
	#End Region

	#Region " Enum IfcProjectedOrTrueLengthEnum "
		Enum IfcProjectedOrTrueLengthEnum
				[TRUE_LENGTH]
				[PROJECTED_LENGTH]
			End Enum
	#End Region

	#Region " Enum IfcPropertySourceEnum "
		Enum IfcPropertySourceEnum
				[NOTKNOWN]
				[USERDEFINED]
				[MEASURED]
				[COMMISSIONING]
				[ASBUILT]
				[SIMULATED]
				[DESIGNMINIMUM]
				[DESIGNMAXIMUM]
				[DESIGN]
			End Enum
	#End Region

	#Region " Enum IfcProtectiveDeviceTypeEnum "
		Enum IfcProtectiveDeviceTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[VARISTOR]
				[RESIDUALCURRENTSWITCH]
				[RESIDUALCURRENTCIRCUITBREAKER]
				[EARTHFAILUREDEVICE]
				[CIRCUITBREAKER]
				[FUSEDISCONNECTOR]
			End Enum
	#End Region

	#Region " Enum IfcPumpTypeEnum "
		Enum IfcPumpTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[VERTICALTURBINE]
				[VERTICALINLINE]
				[SPLITCASE]
				[ENDSUCTION]
				[CIRCULATOR]
			End Enum
	#End Region

	#Region " Enum IfcRailingTypeEnum "
		Enum IfcRailingTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[BALUSTRADE]
				[GUARDRAIL]
				[HANDRAIL]
			End Enum
	#End Region

	#Region " Enum IfcRampFlightTypeEnum "
		Enum IfcRampFlightTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[SPIRAL]
				[STRAIGHT]
			End Enum
	#End Region

	#Region " Enum IfcRampTypeEnum "
		Enum IfcRampTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[SPIRAL_RAMP]
				[HALF_TURN_RAMP]
				[TWO_QUARTER_TURN_RAMP]
				[QUARTER_TURN_RAMP]
				[TWO_STRAIGHT_RUN_RAMP]
				[STRAIGHT_RUN_RAMP]
			End Enum
	#End Region

	#Region " Enum IfcReflectanceMethodEnum "
		Enum IfcReflectanceMethodEnum
				[NOTDEFINED]
				[STRAUSS]
				[PLASTIC]
				[PHONG]
				[MIRROR]
				[METAL]
				[MATT]
				[GLASS]
				[FLAT]
				[BLINN]
			End Enum
	#End Region

	#Region " Enum IfcReinforcingBarRoleEnum "
		Enum IfcReinforcingBarRoleEnum
				[NOTDEFINED]
				[USERDEFINED]
				[RING]
				[EDGE]
				[PUNCHING]
				[STUD]
				[LIGATURE]
				[SHEAR]
				[MAIN]
			End Enum
	#End Region

	#Region " Enum IfcReinforcingBarSurfaceEnum "
		Enum IfcReinforcingBarSurfaceEnum
				[TEXTURED]
				[PLAIN]
			End Enum
	#End Region

	#Region " Enum IfcResourceConsumptionEnum "
		Enum IfcResourceConsumptionEnum
				[NOTDEFINED]
				[USERDEFINED]
				[NOTOCCUPIED]
				[PARTIALLYOCCUPIED]
				[OCCUPIED]
				[NOTCONSUMED]
				[PARTIALLYCONSUMED]
				[CONSUMED]
			End Enum
	#End Region

	#Region " Enum IfcRibPlateDirectionEnum "
		Enum IfcRibPlateDirectionEnum
				[DIRECTION_Y]
				[DIRECTION_X]
			End Enum
	#End Region

	#Region " Enum IfcRoleEnum "
		Enum IfcRoleEnum
				[USERDEFINED]
				[RESELLER]
				[FIELDCONSTRUCTIONMANAGER]
				[CONSTRUCTIONMANAGER]
				[CONSULTANT]
				[OWNER]
				[ENGINEER]
				[COMISSIONINGENGINEER]
				[CIVILENGINEER]
				[FACILITIESMANAGER]
				[PROJECTMANAGER]
				[ELECTRICALENGINEER]
				[MECHANICALENGINEER]
				[BUILDINGOPERATOR]
				[BUILDINGOWNER]
				[CLIENT]
				[COSTENGINEER]
				[STRUCTURALENGINEER]
				[ARCHITECT]
				[SUBCONTRACTOR]
				[CONTRACTOR]
				[MANUFACTURER]
				[SUPPLIER]
			End Enum
	#End Region

	#Region " Enum IfcRoofTypeEnum "
		Enum IfcRoofTypeEnum
				[NOTDEFINED]
				[FREEFORM]
				[DOME_ROOF]
				[PAVILION_ROOF]
				[BUTTERFLY_ROOF]
				[RAINBOW_ROOF]
				[BARREL_ROOF]
				[MANSARD_ROOF]
				[GAMBREL_ROOF]
				[HIPPED_GABLE_ROOF]
				[HIP_ROOF]
				[GABLE_ROOF]
				[SHED_ROOF]
				[FLAT_ROOF]
			End Enum
	#End Region

	#Region " Enum IfcSIPrefix "
		Enum IfcSIPrefix
				[ATTO]
				[FEMTO]
				[PICO]
				[NANO]
				[MICRO]
				[MILLI]
				[CENTI]
				[DECI]
				[DECA]
				[HECTO]
				[KILO]
				[MEGA]
				[GIGA]
				[TERA]
				[PETA]
				[EXA]
			End Enum
	#End Region

	#Region " Enum IfcSIUnitName "
		Enum IfcSIUnitName
				[WEBER]
				[WATT]
				[VOLT]
				[TESLA]
				[STERADIAN]
				[SQUARE_METRE]
				[SIEVERT]
				[SIEMENS]
				[SECOND]
				[RADIAN]
				[PASCAL]
				[OHM]
				[NEWTON]
				[MOLE]
				[METRE]
				[LUX]
				[LUMEN]
				[KELVIN]
				[JOULE]
				[HERTZ]
				[HENRY]
				[GRAY]
				[GRAM]
				[FARAD]
				[DEGREE_CELSIUS]
				[CUBIC_METRE]
				[COULOMB]
				[CANDELA]
				[BECQUEREL]
				[AMPERE]
			End Enum
	#End Region

	#Region " Enum IfcSanitaryTerminalTypeEnum "
		Enum IfcSanitaryTerminalTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[WCSEAT]
				[WASHHANDBASIN]
				[URINAL]
				[TOILETPAN]
				[SANITARYFOUNTAIN]
				[SINK]
				[SHOWER]
				[CISTERN]
				[BIDET]
				[BATH]
			End Enum
	#End Region

	#Region " Enum IfcSectionTypeEnum "
		Enum IfcSectionTypeEnum
				[TAPERED]
				[UNIFORM]
			End Enum
	#End Region

	#Region " Enum IfcSensorTypeEnum "
		Enum IfcSensorTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[TEMPERATURESENSOR]
				[SOUNDSENSOR]
				[SMOKESENSOR]
				[PRESSURESENSOR]
				[MOVEMENTSENSOR]
				[MOISTURESENSOR]
				[LIGHTSENSOR]
				[HUMIDITYSENSOR]
				[HEATSENSOR]
				[GASSENSOR]
				[FLOWSENSOR]
				[FIRESENSOR]
				[CO2SENSOR]
			End Enum
	#End Region

	#Region " Enum IfcSequenceEnum "
		Enum IfcSequenceEnum
				[NOTDEFINED]
				[FINISH_FINISH]
				[FINISH_START]
				[START_FINISH]
				[START_START]
			End Enum
	#End Region

	#Region " Enum IfcServiceLifeFactorTypeEnum "
		Enum IfcServiceLifeFactorTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[G_MAINTENANCELEVEL]
				[F_INUSECONDITIONS]
				[E_OUTDOORENVIRONMENT]
				[D_INDOORENVIRONMENT]
				[C_WORKEXECUTIONLEVEL]
				[B_DESIGNLEVEL]
				[A_QUALITYOFCOMPONENTS]
			End Enum
	#End Region

	#Region " Enum IfcServiceLifeTypeEnum "
		Enum IfcServiceLifeTypeEnum
				[REFERENCESERVICELIFE]
				[PESSIMISTICREFERENCESERVICELIFE]
				[OPTIMISTICREFERENCESERVICELIFE]
				[EXPECTEDSERVICELIFE]
				[ACTUALSERVICELIFE]
			End Enum
	#End Region

	#Region " Enum IfcSlabTypeEnum "
		Enum IfcSlabTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[BASESLAB]
				[LANDING]
				[ROOF]
				[FLOOR]
			End Enum
	#End Region

	#Region " Enum IfcSoundScaleEnum "
		Enum IfcSoundScaleEnum
				[NOTDEFINED]
				[USERDEFINED]
				[NR]
				[NC]
				[DBC]
				[DBB]
				[DBA]
			End Enum
	#End Region

	#Region " Enum IfcSpaceHeaterTypeEnum "
		Enum IfcSpaceHeaterTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[UNITHEATER]
				[FINNEDTUBEUNIT]
				[BASEBOARDHEATER]
				[CONVECTOR]
				[TUBULARRADIATOR]
				[PANELRADIATOR]
				[SECTIONALRADIATOR]
			End Enum
	#End Region

	#Region " Enum IfcSpaceTypeEnum "
		Enum IfcSpaceTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
			End Enum
	#End Region

	#Region " Enum IfcStackTerminalTypeEnum "
		Enum IfcStackTerminalTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[RAINWATERHOPPER]
				[COWL]
				[BIRDCAGE]
			End Enum
	#End Region

	#Region " Enum IfcStairFlightTypeEnum "
		Enum IfcStairFlightTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[FREEFORM]
				[CURVED]
				[SPIRAL]
				[WINDER]
				[STRAIGHT]
			End Enum
	#End Region

	#Region " Enum IfcStairTypeEnum "
		Enum IfcStairTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[TWO_CURVED_RUN_STAIR]
				[CURVED_RUN_STAIR]
				[DOUBLE_RETURN_STAIR]
				[SPIRAL_STAIR]
				[THREE_QUARTER_TURN_STAIR]
				[THREE_QUARTER_WINDING_STAIR]
				[TWO_QUARTER_TURN_STAIR]
				[TWO_QUARTER_WINDING_STAIR]
				[HALF_TURN_STAIR]
				[HALF_WINDING_STAIR]
				[QUARTER_TURN_STAIR]
				[QUARTER_WINDING_STAIR]
				[TWO_STRAIGHT_RUN_STAIR]
				[STRAIGHT_RUN_STAIR]
			End Enum
	#End Region

	#Region " Enum IfcStateEnum "
		Enum IfcStateEnum
				[READONLYLOCKED]
				[READWRITELOCKED]
				[LOCKED]
				[READONLY]
				[READWRITE]
			End Enum
	#End Region

	#Region " Enum IfcStructuralCurveTypeEnum "
		Enum IfcStructuralCurveTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[COMPRESSION_MEMBER]
				[TENSION_MEMBER]
				[CABLE]
				[PIN_JOINED_MEMBER]
				[RIGID_JOINED_MEMBER]
			End Enum
	#End Region

	#Region " Enum IfcStructuralSurfaceTypeEnum "
		Enum IfcStructuralSurfaceTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[SHELL]
				[MEMBRANE_ELEMENT]
				[BENDING_ELEMENT]
			End Enum
	#End Region

	#Region " Enum IfcSurfaceSide "
		Enum IfcSurfaceSide
				[BOTH]
				[NEGATIVE]
				[POSITIVE]
			End Enum
	#End Region

	#Region " Enum IfcSurfaceTextureEnum "
		Enum IfcSurfaceTextureEnum
				[NOTDEFINED]
				[TRANSPARENCYMAP]
				[TEXTURE]
				[SPECULAR]
				[SHININESS]
				[SELFILLUMINATION]
				[REFLECTION]
				[OPACITY]
				[BUMP]
			End Enum
	#End Region

	#Region " Enum IfcSwitchingDeviceTypeEnum "
		Enum IfcSwitchingDeviceTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[TOGGLESWITCH]
				[SWITCHDISCONNECTOR]
				[STARTER]
				[EMERGENCYSTOP]
				[CONTACTOR]
			End Enum
	#End Region

	#Region " Enum IfcTankTypeEnum "
		Enum IfcTankTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[PRESSUREVESSEL]
				[EXPANSION]
				[SECTIONAL]
				[PREFORMED]
			End Enum
	#End Region

	#Region " Enum IfcTendonTypeEnum "
		Enum IfcTendonTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[COATED]
				[BAR]
				[WIRE]
				[STRAND]
			End Enum
	#End Region

	#Region " Enum IfcTextPath "
		Enum IfcTextPath
				[DOWN]
				[UP]
				[RIGHT]
				[LEFT]
			End Enum
	#End Region

	#Region " Enum IfcThermalLoadSourceEnum "
		Enum IfcThermalLoadSourceEnum
				[NOTDEFINED]
				[USERDEFINED]
				[INFILTRATION]
				[RELATIVEHUMIDITY]
				[DRYBULBTEMPERATURE]
				[AIREXCHANGERATE]
				[EXHAUSTAIR]
				[RECIRCULATEDAIR]
				[VENTILATIONOUTSIDEAIR]
				[VENTILATIONINDOORAIR]
				[EQUIPMENT]
				[LIGHTING]
				[PEOPLE]
			End Enum
	#End Region

	#Region " Enum IfcThermalLoadTypeEnum "
		Enum IfcThermalLoadTypeEnum
				[NOTDEFINED]
				[RADIANT]
				[LATENT]
				[SENSIBLE]
			End Enum
	#End Region

	#Region " Enum IfcTimeSeriesDataTypeEnum "
		Enum IfcTimeSeriesDataTypeEnum
				[NOTDEFINED]
				[PIECEWISECONTINUOUS]
				[PIECEWISECONSTANT]
				[PIECEWISEBINARY]
				[DISCRETEBINARY]
				[DISCRETE]
				[CONTINUOUS]
			End Enum
	#End Region

	#Region " Enum IfcTimeSeriesScheduleTypeEnum "
		Enum IfcTimeSeriesScheduleTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[DAILY]
				[WEEKLY]
				[MONTHLY]
				[ANNUAL]
			End Enum
	#End Region

	#Region " Enum IfcTransformerTypeEnum "
		Enum IfcTransformerTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[VOLTAGE]
				[FREQUENCY]
				[CURRENT]
			End Enum
	#End Region

	#Region " Enum IfcTransitionCode "
		Enum IfcTransitionCode
				[CONTSAMEGRADIENTSAMECURVATURE]
				[CONTSAMEGRADIENT]
				[CONTINUOUS]
				[DISCONTINUOUS]
			End Enum
	#End Region

	#Region " Enum IfcTransportElementTypeEnum "
		Enum IfcTransportElementTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[MOVINGWALKWAY]
				[ESCALATOR]
				[ELEVATOR]
			End Enum
	#End Region

	#Region " Enum IfcTrimmingPreference "
		Enum IfcTrimmingPreference
				[UNSPECIFIED]
				[PARAMETER]
				[CARTESIAN]
			End Enum
	#End Region

	#Region " Enum IfcTubeBundleTypeEnum "
		Enum IfcTubeBundleTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[FINNED]
			End Enum
	#End Region

	#Region " Enum IfcUnitEnum "
		Enum IfcUnitEnum
				[USERDEFINED]
				[VOLUMEUNIT]
				[TIMEUNIT]
				[THERMODYNAMICTEMPERATUREUNIT]
				[SOLIDANGLEUNIT]
				[RADIOACTIVITYUNIT]
				[PRESSUREUNIT]
				[POWERUNIT]
				[PLANEANGLEUNIT]
				[MASSUNIT]
				[MAGNETICFLUXUNIT]
				[MAGNETICFLUXDENSITYUNIT]
				[LUMINOUSINTENSITYUNIT]
				[LUMINOUSFLUXUNIT]
				[LENGTHUNIT]
				[INDUCTANCEUNIT]
				[ILLUMINANCEUNIT]
				[FREQUENCYUNIT]
				[FORCEUNIT]
				[ENERGYUNIT]
				[ELECTRICVOLTAGEUNIT]
				[ELECTRICRESISTANCEUNIT]
				[ELECTRICCURRENTUNIT]
				[ELECTRICCONDUCTANCEUNIT]
				[ELECTRICCHARGEUNIT]
				[ELECTRICCAPACITANCEUNIT]
				[DOSEEQUIVALENTUNIT]
				[AREAUNIT]
				[AMOUNTOFSUBSTANCEUNIT]
				[ABSORBEDDOSEUNIT]
			End Enum
	#End Region

	#Region " Enum IfcUnitaryEquipmentTypeEnum "
		Enum IfcUnitaryEquipmentTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[ROOFTOPUNIT]
				[SPLITSYSTEM]
				[AIRCONDITIONINGUNIT]
				[AIRHANDLER]
			End Enum
	#End Region

	#Region " Enum IfcValveTypeEnum "
		Enum IfcValveTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[STOPCOCK]
				[STEAMTRAP]
				[SAFETYCUTOFF]
				[REGULATING]
				[PRESSURERELIEF]
				[PRESSUREREDUCING]
				[MIXING]
				[ISOLATING]
				[GASTAP]
				[GASCOCK]
				[FLUSHING]
				[FAUCET]
				[DOUBLEREGULATING]
				[DOUBLECHECK]
				[DRAWOFFCOCK]
				[DIVERTING]
				[COMMISSIONING]
				[CHECK]
				[CHANGEOVER]
				[ANTIVACUUM]
				[AIRRELEASE]
			End Enum
	#End Region

	#Region " Enum IfcVibrationIsolatorTypeEnum "
		Enum IfcVibrationIsolatorTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[SPRING]
				[COMPRESSION]
			End Enum
	#End Region

	#Region " Enum IfcWallTypeEnum "
		Enum IfcWallTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[PLUMBINGWALL]
				[ELEMENTEDWALL]
				[SHEAR]
				[POLYGONAL]
				[STANDARD]
			End Enum
	#End Region

	#Region " Enum IfcWasteTerminalTypeEnum "
		Enum IfcWasteTerminalTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[WASTETRAP]
				[WASTEDISPOSALUNIT]
				[ROOFDRAIN]
				[PETROLINTERCEPTOR]
				[OILINTERCEPTOR]
				[GREASEINTERCEPTOR]
				[GULLYTRAP]
				[GULLYSUMP]
				[FLOORWASTE]
				[FLOORTRAP]
			End Enum
	#End Region

	#Region " Enum IfcWindowPanelOperationEnum "
		Enum IfcWindowPanelOperationEnum
				[NOTDEFINED]
				[OTHEROPERATION]
				[FIXEDCASEMENT]
				[REMOVABLECASEMENT]
				[SLIDINGVERTICAL]
				[SLIDINGHORIZONTAL]
				[PIVOTVERTICAL]
				[PIVOTHORIZONTAL]
				[BOTTOMHUNG]
				[TOPHUNG]
				[TILTANDTURNLEFTHAND]
				[TILTANDTURNRIGHTHAND]
				[SIDEHUNGLEFTHAND]
				[SIDEHUNGRIGHTHAND]
			End Enum
	#End Region

	#Region " Enum IfcWindowPanelPositionEnum "
		Enum IfcWindowPanelPositionEnum
				[NOTDEFINED]
				[TOP]
				[BOTTOM]
				[RIGHT]
				[MIDDLE]
				[LEFT]
			End Enum
	#End Region

	#Region " Enum IfcWindowStyleConstructionEnum "
		Enum IfcWindowStyleConstructionEnum
				[NOTDEFINED]
				[OTHER_CONSTRUCTION]
				[PLASTIC]
				[ALUMINIUM_WOOD]
				[WOOD]
				[STEEL]
				[HIGH_GRADE_STEEL]
				[ALUMINIUM]
			End Enum
	#End Region

	#Region " Enum IfcWindowStyleOperationEnum "
		Enum IfcWindowStyleOperationEnum
				[NOTDEFINED]
				[USERDEFINED]
				[TRIPLE_PANEL_HORIZONTAL]
				[TRIPLE_PANEL_RIGHT]
				[TRIPLE_PANEL_LEFT]
				[TRIPLE_PANEL_TOP]
				[TRIPLE_PANEL_BOTTOM]
				[TRIPLE_PANEL_VERTICAL]
				[DOUBLE_PANEL_HORIZONTAL]
				[DOUBLE_PANEL_VERTICAL]
				[SINGLE_PANEL]
			End Enum
	#End Region

	#Region " Enum IfcWorkControlTypeEnum "
		Enum IfcWorkControlTypeEnum
				[NOTDEFINED]
				[USERDEFINED]
				[PLANNED]
				[BASELINE]
				[ACTUAL]
			End Enum
	#End Region
End Namespace
