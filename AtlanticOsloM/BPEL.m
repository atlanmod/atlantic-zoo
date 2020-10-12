module MetamodelRoot {

	type @[XSD.XSDAnnotation] : @[XSD.XSDComponent], @[XSD.XSDRedefineContent] {
		ApplicationInformation_Att : Logical;
		UserInformation_Att : Logical;
		Attributes_Att : Logical;
	};

	type @[XSD.XSDAttributeDeclaration] : @[XSD.XSDFeature], @[XSD.XSDSchemaContent] {
		AttributeDeclarationReference_Att : Logical;
		Annotation_ContRef : @[XSD.XSDAnnotation]?;
		AnonymousTypeDefinition_ContRef : @[XSD.XSDSimpleTypeDefinition]?;
		TypeDefinition_Ref : @[XSD.XSDSimpleTypeDefinition];
		ResolvedAttributeDeclaration_Ref : @[XSD.XSDAttributeDeclaration];
	};

	type @[XSD.XSDAttributeGroupContent] : @[XSD.XSDConcreteComponent];

	type @[XSD.XSDAttributeGroupDefinition] : @[XSD.XSDRedefinableComponent], @[XSD.XSDAttributeGroupContent], @[XSD.XSDRedefineContent] {
		AttributeGroupDefinitionReference_Att : Logical;
		Annotation_ContRef : @[XSD.XSDAnnotation]?;
		Contents_ContRef : @[XSD.XSDAttributeGroupContent]*;
		AttributeUses_Ref : @[XSD.XSDAttributeUse]*;
		AttributeWildcardContent_ContRef : @[XSD.XSDWildcard]?;
		AttributeWildcard_Ref : @[XSD.XSDWildcard]?;
		ResolvedAttributeGroupDefinition_Ref : @[XSD.XSDAttributeGroupDefinition];
		SyntheticWildcard_ContRef : @[XSD.XSDWildcard]?;
	};

	type @[XSD.XSDAttributeUse] : @[XSD.XSDComponent], @[XSD.XSDAttributeGroupContent] {
		Required_Att : Logical;
		Value_Att : Logical;
		Constraint_Att : @[XSD.XSDConstraint]?;
		Use_Att : @[XSD.XSDAttributeUseCategory]?;
		LexicalValue_Att : Logical;
		AttributeDeclaration_Ref : @[XSD.XSDAttributeDeclaration];
		Content_ContRef : @[XSD.XSDAttributeDeclaration];
	};

	type @[XSD.XSDBoundedFacet] : @[XSD.XSDFundamentalFacet] {
		Value_Att : Logical;
	};

	type @[XSD.XSDCardinalityFacet] : @[XSD.XSDFundamentalFacet] {
		Value_Att : @[XSD.XSDCardinality]?;
	};

	type @[XSD.XSDComplexTypeContent] : @[XSD.XSDComponent];

	type @[XSD.XSDComplexTypeDefinition] : @[XSD.XSDTypeDefinition], @[XSD.XSDScope] {
		DerivationMethod_Att : @[XSD.XSDDerivationMethod]?;
		Final_Att : @[XSD.XSDComplexFinal]*;
		Abstract_Att : Logical;
		ContentTypeCategory_Att : @[XSD.XSDContentTypeCategory]?;
		ProhibitedSubstitutions_Att : @[XSD.XSDProhibitedSubstitutions]*;
		LexicalFinal_Att : @[XSD.XSDComplexFinal]*;
		Block_Att : @[XSD.XSDProhibitedSubstitutions]*;
		Mixed_Att : Logical;
		ContentAnnotation_ContRef : @[XSD.XSDAnnotation]?;
		BaseTypeDefinition_Ref : @[XSD.XSDTypeDefinition];
		Content_ContRef : @[XSD.XSDComplexTypeContent]?;
		ContentType_Ref : @[XSD.XSDComplexTypeContent]?;
		AttributeUses_Ref : @[XSD.XSDAttributeUse]*;
		AttributeContents_ContRef : @[XSD.XSDAttributeGroupContent]*;
		AttributeWildcard_Ref : @[XSD.XSDWildcard]?;
		AttributeWildcardContent_ContRef : @[XSD.XSDWildcard]?;
		RootTypeDefinition_Ref : @[XSD.XSDTypeDefinition];
		SyntheticParticle_ContRef : @[XSD.XSDParticle]?;
		SyntheticWildcard_ContRef : @[XSD.XSDWildcard]?;
	};

	type @[XSD.XSDComponent] : @[XSD.XSDConcreteComponent];

	type @[XSD.XSDConcreteComponent] {
		Element_Att : Logical;
		Container_Ref : @[XSD.XSDConcreteComponent]?;
		RootContainer_Ref : @[XSD.XSDConcreteComponent];
		Schema_Ref : @[XSD.XSDSchema]?;
		Diagnostics_ContRef : @[XSD.XSDDiagnostic]*;
	};

	type @[XSD.XSDConstrainingFacet] : @[XSD.XSDFacet];

	type @[XSD.XSDDiagnostic] : @[XSD.XSDConcreteComponent] {
		Severity_Att : @[XSD.XSDDiagnosticSeverity]?;
		Message_Att : Logical;
		LocationURI_Att : Logical;
		Line_Att : Logical;
		Column_Att : Logical;
		Node_Att : Logical;
		AnnotationURI_Att : Logical;
		Key_Att : Logical;
		Substitutions_Att : Logical;
		Components_Ref : @[XSD.XSDConcreteComponent]+;
		PrimaryComponent_Ref : @[XSD.XSDConcreteComponent];
	};

	type @[XSD.XSDElementDeclaration] : @[XSD.XSDFeature], @[XSD.XSDSchemaContent], @[XSD.XSDTerm] {
		Nillable_Att : Logical;
		DisallowedSubstitutions_Att : @[XSD.XSDDisallowedSubstitutions]*;
		SubstitutionGroupExclusions_Att : @[XSD.XSDSubstitutionGroupExclusions]*;
		Abstract_Att : Logical;
		LexicalFinal_Att : @[XSD.XSDProhibitedSubstitutions]*;
		Block_Att : @[XSD.XSDDisallowedSubstitutions]*;
		ElementDeclarationReference_Att : Logical;
		Circular_Att : Logical;
		Annotation_ContRef : @[XSD.XSDAnnotation]?;
		AnonymousTypeDefinition_ContRef : @[XSD.XSDTypeDefinition]?;
		TypeDefinition_Ref : @[XSD.XSDTypeDefinition];
		IdentityConstraintDefinitions_ContRef : @[XSD.XSDIdentityConstraintDefinition]*;
		ResolvedElementDeclaration_Ref : @[XSD.XSDElementDeclaration];
		SubstitutionGroupAffiliation_Ref : @[XSD.XSDElementDeclaration]?;
		SubstitutionGroup_Ref : @[XSD.XSDElementDeclaration]*;
	};

	type @[XSD.XSDEnumerationFacet] : @[XSD.XSDRepeatableFacet] {
		Value_Att : Logical;
	};

	type @[XSD.XSDFacet] : @[XSD.XSDComponent] {
		LexicalValue_Att : Logical;
		FacetName_Att : Logical;
		EffectiveValue_Att : Logical;
		Annotation_ContRef : @[XSD.XSDAnnotation]?;
		SimpleTypeDefinition_Ref : @[XSD.XSDSimpleTypeDefinition]?;
	};

	type @[XSD.XSDFeature] : @[XSD.XSDNamedComponent] {
		Value_Att : Logical;
		Constraint_Att : @[XSD.XSDConstraint]?;
		Form_Att : @[XSD.XSDForm]?;
		LexicalValue_Att : Logical;
		Global_Att : Logical;
		FeatureReference_Att : Logical;
		Scope_Ref : @[XSD.XSDScope]?;
		ResolvedFeature_Ref : @[XSD.XSDFeature];
		Type_Ref : @[XSD.XSDTypeDefinition];
	};

	type @[XSD.XSDFixedFacet] : @[XSD.XSDConstrainingFacet] {
		Fixed_Att : Logical;
	};

	type @[XSD.XSDFractionDigitsFacet] : @[XSD.XSDFixedFacet] {
		Value_Att : Logical;
	};

	type @[XSD.XSDFundamentalFacet] : @[XSD.XSDFacet];

	type @[XSD.XSDIdentityConstraintDefinition] : @[XSD.XSDNamedComponent] {
		IdentityConstraintCategory_Att : @[XSD.XSDIdentityConstraintCategory]?;
		Annotation_ContRef : @[XSD.XSDAnnotation]?;
		ReferencedKey_Ref : @[XSD.XSDIdentityConstraintDefinition]?;
		Selector_ContRef : @[XSD.XSDXPathDefinition];
		Fields_ContRef : @[XSD.XSDXPathDefinition]+;
	};

	type @[XSD.XSDImport] : @[XSD.XSDSchemaDirective] {
		Namespace_Att : Logical;
		Annotation_ContRef : @[XSD.XSDAnnotation]?;
	};

	type @[XSD.XSDInclude] : @[XSD.XSDSchemaCompositor] {
		Annotation_ContRef : @[XSD.XSDAnnotation]?;
	};

	type @[XSD.XSDLengthFacet] : @[XSD.XSDFixedFacet] {
		Value_Att : Logical;
	};

	type @[XSD.XSDMaxExclusiveFacet] : @[XSD.XSDMaxFacet];

	type @[XSD.XSDMaxFacet] : @[XSD.XSDFixedFacet] {
		Value_Att : Logical;
		Inclusive_Att : Logical;
		Exclusive_Att : Logical;
	};

	type @[XSD.XSDMaxInclusiveFacet] : @[XSD.XSDMaxFacet];

	type @[XSD.XSDMaxLengthFacet] : @[XSD.XSDFixedFacet] {
		Value_Att : Logical;
	};

	type @[XSD.XSDMinExclusiveFacet] : @[XSD.XSDMinFacet];

	type @[XSD.XSDMinFacet] : @[XSD.XSDFixedFacet] {
		Value_Att : Logical;
		Inclusive_Att : Logical;
		Exclusive_Att : Logical;
	};

	type @[XSD.XSDMinInclusiveFacet] : @[XSD.XSDMinFacet];

	type @[XSD.XSDMinLengthFacet] : @[XSD.XSDFixedFacet] {
		Value_Att : Logical;
	};

	type @[XSD.XSDModelGroup] : @[XSD.XSDTerm] {
		Compositor_Att : @[XSD.XSDCompositor]?;
		Annotation_ContRef : @[XSD.XSDAnnotation]?;
		Contents_ContRef : @[XSD.XSDParticle]*;
		Particles_Ref : @[XSD.XSDParticle]+;
	};

	type @[XSD.XSDModelGroupDefinition] : @[XSD.XSDRedefinableComponent], @[XSD.XSDParticleContent], @[XSD.XSDRedefineContent] {
		ModelGroupDefinitionReference_Att : Logical;
		Annotation_ContRef : @[XSD.XSDAnnotation]?;
		ModelGroup_ContRef : @[XSD.XSDModelGroup];
		ResolvedModelGroupDefinition_Ref : @[XSD.XSDModelGroupDefinition];
	};

	type @[XSD.XSDNamedComponent] : @[XSD.XSDComponent] {
		Name_Att : Logical;
		TargetNamespace_Att : Logical;
		AliasName_Att : Logical;
		URI_Att : Logical;
		AliasURI_Att : Logical;
		QName_Att : Logical;
	};

	type @[XSD.XSDNotationDeclaration] : @[XSD.XSDNamedComponent], @[XSD.XSDSchemaContent] {
		SystemIdentifier_Att : Logical;
		PublicIdentifier_Att : Logical;
		Annotation_ContRef : @[XSD.XSDAnnotation]?;
	};

	type @[XSD.XSDNumericFacet] : @[XSD.XSDFundamentalFacet] {
		Value_Att : Logical;
	};

	type @[XSD.XSDOrderedFacet] : @[XSD.XSDFundamentalFacet] {
		Value_Att : @[XSD.XSDOrdered]?;
	};

	type @[XSD.XSDParticle] : @[XSD.XSDComplexTypeContent] {
		MinOccurs_Att : Logical;
		MaxOccurs_Att : Logical;
		Content_ContRef : @[XSD.XSDParticleContent];
		Term_Ref : @[XSD.XSDTerm];
	};

	type @[XSD.XSDParticleContent] : @[XSD.XSDConcreteComponent];

	type @[XSD.XSDPatternFacet] : @[XSD.XSDRepeatableFacet] {
		Value_Att : Logical;
	};

	type @[XSD.XSDRedefinableComponent] : @[XSD.XSDNamedComponent], @[XSD.XSDRedefineContent] {
		Circular_Att : Logical;
	};

	type @[XSD.XSDRedefineContent] : @[XSD.XSDSchemaContent];

	type @[XSD.XSDRedefine] : @[XSD.XSDSchemaCompositor] {
		Annotations_Ref : @[XSD.XSDAnnotation]*;
		Contents_ContRef : @[XSD.XSDRedefineContent]*;
	};

	type @[XSD.XSDRepeatableFacet] : @[XSD.XSDConstrainingFacet] {
		Annotations_Ref : @[XSD.XSDAnnotation]*;
	};

	type @[XSD.XSDSchema] : @[XSD.XSDScope] {
		Document_Att : Logical;
		SchemaLocation_Att : Logical;
		TargetNamespace_Att : Logical;
		AttributeFormDefault_Att : @[XSD.XSDForm]?;
		ElementFormDefault_Att : @[XSD.XSDForm]?;
		FinalDefault_Att : @[XSD.XSDProhibitedSubstitutions]*;
		BlockDefault_Att : @[XSD.XSDDisallowedSubstitutions]*;
		Version_Att : Logical;
		Contents_ContRef : @[XSD.XSDSchemaContent]*;
		ElementDeclarations_Ref : @[XSD.XSDElementDeclaration]*;
		AttributeDeclarations_Ref : @[XSD.XSDAttributeDeclaration]*;
		AttributeGroupDefinitions_Ref : @[XSD.XSDAttributeGroupDefinition]*;
		TypeDefinitions_Ref : @[XSD.XSDTypeDefinition]*;
		ModelGroupDefinitions_Ref : @[XSD.XSDModelGroupDefinition]*;
		IdentityConstraintDefinitions_Ref : @[XSD.XSDIdentityConstraintDefinition]*;
		NotationDeclarations_Ref : @[XSD.XSDNotationDeclaration]*;
		Annotations_Ref : @[XSD.XSDAnnotation]*;
		AllDiagnostics_Ref : @[XSD.XSDDiagnostic]*;
		ReferencingDirectives_Ref : @[XSD.XSDSchemaDirective]*;
		RootVersion_Ref : @[XSD.XSDSchema];
		OriginalVersion_Ref : @[XSD.XSDSchema]?;
		IncorporatedVersions_ContRef : @[XSD.XSDSchema]*;
		SchemaForSchema_Ref : @[XSD.XSDSchema];
	};

	type @[XSD.XSDSchemaCompositor] : @[XSD.XSDSchemaDirective] {
		IncorporatedSchema_Ref : @[XSD.XSDSchema]?;
	};

	type @[XSD.XSDSchemaContent] : @[XSD.XSDConcreteComponent];

	type @[XSD.XSDSchemaDirective] : @[XSD.XSDSchemaContent] {
		SchemaLocation_Att : Logical;
		ResolvedSchema_Ref : @[XSD.XSDSchema]?;
	};

	type @[XSD.XSDScope] : @[XSD.XSDComponent];

	type @[XSD.XSDSimpleTypeDefinition] : @[XSD.XSDTypeDefinition], @[XSD.XSDComplexTypeContent] {
		Variety_Att : @[XSD.XSDVariety]?;
		Final_Att : @[XSD.XSDSimpleFinal]*;
		LexicalFinal_Att : @[XSD.XSDSimpleFinal]*;
		ValidFacets_Att : Logical;
		Contents_ContRef : @[XSD.XSDSimpleTypeDefinition]*;
		FacetContents_ContRef : @[XSD.XSDConstrainingFacet]*;
		Facets_Ref : @[XSD.XSDConstrainingFacet]*;
		MemberTypeDefinitions_Ref : @[XSD.XSDSimpleTypeDefinition]*;
		FundamentalFacets_ContRef : @[XSD.XSDFundamentalFacet]+;
		BaseTypeDefinition_Ref : @[XSD.XSDSimpleTypeDefinition];
		PrimitiveTypeDefinition_Ref : @[XSD.XSDSimpleTypeDefinition]?;
		ItemTypeDefinition_Ref : @[XSD.XSDSimpleTypeDefinition]?;
		RootTypeDefinition_Ref : @[XSD.XSDSimpleTypeDefinition];
		MinFacet_Ref : @[XSD.XSDMinFacet]?;
		MaxFacet_Ref : @[XSD.XSDMaxFacet]?;
		MaxInclusiveFacet_Ref : @[XSD.XSDMaxInclusiveFacet]?;
		MinInclusiveFacet_Ref : @[XSD.XSDMinInclusiveFacet]?;
		MinExclusiveFacet_Ref : @[XSD.XSDMinExclusiveFacet]?;
		MaxExclusiveFacet_Ref : @[XSD.XSDMaxExclusiveFacet]?;
		LengthFacet_Ref : @[XSD.XSDLengthFacet]?;
		WhiteSpaceFacet_Ref : @[XSD.XSDWhiteSpaceFacet]?;
		EnumerationFacets_Ref : @[XSD.XSDEnumerationFacet]*;
		PatternFacets_Ref : @[XSD.XSDPatternFacet]*;
		CardinalityFacet_Ref : @[XSD.XSDCardinalityFacet];
		NumericFacet_Ref : @[XSD.XSDNumericFacet];
		MaxLengthFacet_Ref : @[XSD.XSDMaxLengthFacet]?;
		MinLengthFacet_Ref : @[XSD.XSDMinLengthFacet]?;
		TotalDigitsFacet_Ref : @[XSD.XSDTotalDigitsFacet]?;
		FractionDigitsFacet_Ref : @[XSD.XSDFractionDigitsFacet]?;
		OrderedFacet_Ref : @[XSD.XSDOrderedFacet];
		BoundedFacet_Ref : @[XSD.XSDBoundedFacet];
		EffectiveMaxFacet_Ref : @[XSD.XSDMaxFacet]?;
		EffectiveWhiteSpaceFacet_Ref : @[XSD.XSDWhiteSpaceFacet]?;
		EffectiveMaxLengthFacet_Ref : @[XSD.XSDMaxLengthFacet]?;
		EffectiveFractionDigitsFacet_Ref : @[XSD.XSDFractionDigitsFacet]?;
		EffectivePatternFacet_Ref : @[XSD.XSDPatternFacet]?;
		EffectiveEnumerationFacet_Ref : @[XSD.XSDEnumerationFacet]?;
		EffectiveTotalDigitsFacet_Ref : @[XSD.XSDTotalDigitsFacet]?;
		EffectiveMinLengthFacet_Ref : @[XSD.XSDMinLengthFacet]?;
		EffectiveLengthFacet_Ref : @[XSD.XSDLengthFacet]?;
		EffectiveMinFacet_Ref : @[XSD.XSDMinFacet]?;
		SyntheticFacets_ContRef : @[XSD.XSDFacet]*;
	};

	type @[XSD.XSDTerm] : @[XSD.XSDComponent], @[XSD.XSDParticleContent];

	type @[XSD.XSDTotalDigitsFacet] : @[XSD.XSDFixedFacet] {
		Value_Att : Logical;
	};

	type @[XSD.XSDTypeDefinition] : @[XSD.XSDRedefinableComponent], @[XSD.XSDRedefineContent] {
		Annotation_ContRef : @[XSD.XSDAnnotation]?;
		DerivationAnnotation_ContRef : @[XSD.XSDAnnotation]?;
		Annotations_Ref : @[XSD.XSDAnnotation]*;
		RootType_Ref : @[XSD.XSDTypeDefinition];
		BaseType_Ref : @[XSD.XSDTypeDefinition];
		SimpleType_Ref : @[XSD.XSDSimpleTypeDefinition]?;
		ComplexType_Ref : @[XSD.XSDParticle]?;
	};

	type @[XSD.XSDWhiteSpaceFacet] : @[XSD.XSDFixedFacet] {
		Value_Att : @[XSD.XSDWhiteSpace]?;
	};

	type @[XSD.XSDWildcard] : @[XSD.XSDTerm] {
		NamespaceConstraintCategory_Att : @[XSD.XSDNamespaceConstraintCategory]?;
		NamespaceConstraint_Att : Logical;
		ProcessContents_Att : @[XSD.XSDProcessContents]?;
		LexicalNamespaceConstraint_Att : Logical;
		Annotation_ContRef : @[XSD.XSDAnnotation]?;
		Annotations_Ref : @[XSD.XSDAnnotation]*;
	};

	type @[XSD.XSDXPathDefinition] : @[XSD.XSDComponent] {
		Variety_Att : @[XSD.XSDXPathVariety]?;
		Value_Att : Logical;
		Annotation_ContRef : @[XSD.XSDAnnotation]?;
	};

	type @[XSD.XSDAttributeUseCategory] {"prohibited", "optional", "required"};

	type @[XSD.XSDCardinality] {"countablyInfinite", "finite"};

	type @[XSD.XSDComplexFinal] {"all", "restriction", "extension"};

	type @[XSD.XSDCompositor] {"all", "choice", "sequence"};

	type @[XSD.XSDConstraint] {"fixed", "default"};

	type @[XSD.XSDContentTypeCategory] {"elementOnly", "mixed", "simple", "empty"};

	type @[XSD.XSDDerivationMethod] {"extension", "restriction"};

	type @[XSD.XSDDiagnosticSeverity] {"fatal", "warning", "error", "information"};

	type @[XSD.XSDDisallowedSubstitutions] {"extension", "substitution", "all", "restriction"};

	type @[XSD.XSDForm] {"unqualified", "qualified"};

	type @[XSD.XSDIdentityConstraintCategory] {"keyref", "unique", "key"};

	type @[XSD.XSDNamespaceConstraintCategory] {"set", "not", "any"};

	type @[XSD.XSDOrdered] {, "total", "partial"};

	type @[XSD.XSDProcessContents] {"skip", "lax", "strict"};

	type @[XSD.XSDProhibitedSubstitutions] {"extension", "restriction", "all"};

	type @[XSD.XSDSimpleFinal] {"list", "restriction", "all", "union"};

	type @[XSD.XSDSubstitutionGroupExclusions] {"restriction", "extension"};

	type @[XSD.XSDVariety] {"union", "list", "atomic"};

	type @[XSD.XSDWhiteSpace] {"replace", "collapse", "preserve"};

	type @[XSD.XSDXPathVariety] {"field", "selector"};

	type @[Messageproperties.Property] : @[WSDL.ExtensibilityElement] {
		QName_Att : Logical;
		Name_Att : Logical;
		Type_Att : Logical;
		ID_Att : Logical;
	};

	type @[Messageproperties.PropertyAlias] : @[WSDL.ExtensibilityElement] {
		MessageType_Att : Logical;
		Part_Att : Logical;
		PropertyName_Att : Logical;
		ID_Att : Logical;
		WsdlPart_Ref : @[WSDL.Part];
		Query_ContRef : @[Messageproperties.MessagepropertiesQuery]?;
		Type_Att : Logical;
		XSDElement_Att : Logical;
	};

	type @[Messageproperties.MessagepropertiesQuery] : @[WSDL.ExtensibilityElement] {
		QueryLanguage_Att : Logical;
		Value_Att : Logical;
	};

	type @[Ecore.EObject];

	type @[Partnerlinktype.PartnerLinkType] : @[WSDL.ExtensibilityElement] {
		Name_Att : Logical;
		ID_Att : Logical;
		Role_ContRef : @[Partnerlinktype.Role]*;
	};

	type @[Partnerlinktype.Role] : @[WSDL.ExtensibilityElement] {
		ID_Att : Logical;
		Name_Att : Logical;
		PortType_Att : Logical;
	};

	type @[BPEL.Process] : @[BPEL.BPELExtensibleElement] {
		Name_Att : Logical;
		TargetNamespace_Att : Logical;
		QueryLanguage_Att : Logical;
		ExpressionLanguage_Att : Logical;
		SuppressJoinFailure_Att : Logical;
		VariableAccessSerializable_Att : Logical;
		PartnerLinks_ContRef : @[BPEL.PartnerLinks]?;
		Variables_ContRef : @[BPEL.Variables]?;
		Activity_ContRef : @[BPEL.Activity];
		FaultHandlers_ContRef : @[BPEL.FaultHandler]?;
		EventHandlers_ContRef : @[BPEL.EventHandler]?;
		CorrelationSets_ContRef : @[BPEL.CorrelationSets]?;
		Imports_ContRef : @[BPEL.BPELImport]*;
		Extensions_ContRef : @[BPEL.Extensions]?;
		ExitOnStandardFault_Att : Logical;
	};

	type @[BPEL.PartnerLink] : @[BPEL.BPELExtensibleElement] {
		Name_Att : Logical;
		MyRole_Ref : @[Partnerlinktype.Role]?;
		PartnerRole_Ref : @[Partnerlinktype.Role]?;
		PartnerLinkType_Ref : @[Partnerlinktype.PartnerLinkType]?;
		InitializePartnerRole_Att : Logical;
	};

	type @[BPEL.FaultHandler] : @[BPEL.BPELExtensibleElement] {
		Catch_ContRef : @[BPEL.Catch]*;
		CatchAll_ContRef : @[BPEL.CatchAll]?;
	};

	type @[BPEL.Activity] : @[BPEL.BPELExtensibleElement] {
		Name_Att : Logical;
		SuppressJoinFailure_Att : Logical;
		Targets_ContRef : @[BPEL.Targets]?;
		Sources_ContRef : @[BPEL.Sources]?;
	};

	type @[BPEL.CorrelationSet] : @[BPEL.BPELExtensibleElement] {
		Name_Att : Logical;
		Properties_Ref : @[Messageproperties.Property]*;
	};

	type @[BPEL.Invoke] : @[BPEL.PartnerActivity] {
		OutputVariable_Ref : @[BPEL.Variable]?;
		InputVariable_Ref : @[BPEL.Variable]?;
		CompensationHandler_ContRef : @[BPEL.CompensationHandler]?;
		FaultHandler_ContRef : @[BPEL.FaultHandler]?;
		ToPart_Ref : @[BPEL.ToPart]*;
		FromPart_Ref : @[BPEL.FromPart]*;
	};

	type @[BPEL.Link] : @[BPEL.BPELExtensibleElement] {
		Name_Att : Logical;
		Sources_Ref : @[BPEL.Source]*;
		Targets_Ref : @[BPEL.Target]*;
	};

	type @[BPEL.Catch] : @[BPEL.BPELExtensibleElement] {
		FaultName_Att : Logical;
		FaultVariable_ContRef : @[BPEL.Variable]?;
		Activity_ContRef : @[BPEL.Activity];
		FaultMessageType_Ref : @[WSDL.Message]?;
		FaultElement_Ref : @[XSD.XSDElementDeclaration]?;
	};

	type @[BPEL.Reply] : @[BPEL.PartnerActivity], @[BPEL.Activity] {
		FaultName_Att : Logical;
		Variable_Ref : @[BPEL.Variable]?;
		ToPart_Ref : @[BPEL.ToPart]*;
	};

	type @[BPEL.PartnerActivity] : @[BPEL.Activity] {
		PartnerLink_Ref : @[BPEL.PartnerLink];
		Correlations_ContRef : @[BPEL.Correlations]?;
		PortType_Ref : @[WSDL.PortType];
		Operation_Ref : @[WSDL.Operation];
	};

	type @[BPEL.Receive] : @[BPEL.PartnerActivity] {
		CreateInstance_Att : Logical;
		Variable_Ref : @[BPEL.Variable];
		FromPart_Ref : @[BPEL.FromPart]*;
	};

	type @[BPEL.Exit] : @[BPEL.Activity];

	type @[BPEL.Throw] : @[BPEL.Activity] {
		FaultName_Att : Logical;
		FaultVariable_Ref : @[BPEL.Variable]?;
	};

	type @[BPEL.Wait] : @[BPEL.Activity] {
		For_ContRef : @[BPEL.Expression]?;
		Until_ContRef : @[BPEL.Expression]?;
	};

	type @[BPEL.Empty] : @[BPEL.Activity];

	type @[BPEL.Sequence] : @[BPEL.Activity] {
		Activities_ContRef : @[BPEL.Activity]+;
	};

	type @[BPEL.Switch] : @[BPEL.Activity] {
		Cases_ContRef : @[BPEL.Case]+;
		Otherwise_ContRef : @[BPEL.Otherwise]?;
	};

	type @[BPEL.Case] : @[BPEL.BPELExtensibleElement] {
		Activity_ContRef : @[BPEL.Activity];
		Condition_ContRef : @[BPEL.Condition];
	};

	type @[BPEL.While] : @[BPEL.Activity] {
		Activity_ContRef : @[BPEL.Activity];
		Condition_ContRef : @[BPEL.Condition];
	};

	type @[BPEL.Pick] : @[BPEL.Activity] {
		CreateInstance_Att : Logical;
		Messages_ContRef : @[BPEL.OnMessage]+;
		Alarm_ContRef : @[BPEL.OnAlarm]*;
	};

	type @[BPEL.Flow] : @[BPEL.Activity] {
		Activities_ContRef : @[BPEL.Activity]+;
		Links_ContRef : @[BPEL.Links]?;
		CompletionCondition_ContRef : @[BPEL.CompletionCondition]?;
	};

	type @[BPEL.OnAlarm] : @[BPEL.BPELExtensibleElement] {
		Activity_ContRef : @[BPEL.Activity];
		For_ContRef : @[BPEL.Expression]?;
		Until_ContRef : @[BPEL.Expression]?;
		RepeatEvery_ContRef : @[BPEL.Expression]?;
	};

	type @[BPEL.Assign] : @[BPEL.Activity] {
		Copy_ContRef : @[BPEL.Copy]+;
		Validate_Att : Logical;
	};

	type @[BPEL.Copy] : @[BPEL.BPELExtensibleElement] {
		To_ContRef : @[BPEL.To];
		From_ContRef : @[BPEL.From];
		KeepSrcElementName_Att : Logical;
	};

	type @[BPEL.Extension] : @[BPEL.BPELExtensibleElement] {
		Namespace_Att : Logical;
		MustUnderstand_Att : Logical;
	};

	type @[BPEL.Scope] : @[BPEL.Activity] {
		Isolated_Att : Logical;
		FaultHandlers_ContRef : @[BPEL.FaultHandler]?;
		CompensationHandler_ContRef : @[BPEL.CompensationHandler]?;
		Activity_ContRef : @[BPEL.Activity];
		Variables_ContRef : @[BPEL.Variables]?;
		CorrelationSets_ContRef : @[BPEL.CorrelationSets]?;
		EventHandlers_ContRef : @[BPEL.EventHandler]?;
		PartnerLinks_ContRef : @[BPEL.PartnerLinks]?;
		TerminationHandler_ContRef : @[BPEL.TerminationHandler]?;
	};

	type @[BPEL.Compensate] : @[BPEL.Activity] {
		Scope_Ref : @[Ecore.EObject]?;
	};

	type @[BPEL.CompensationHandler] : @[BPEL.BPELExtensibleElement] {
		Activity_ContRef : @[BPEL.Activity];
	};

	type @[BPEL.To] : @[BPEL.BPELExtensibleElement] {
		Variable_Ref : @[BPEL.Variable]?;
		Part_Ref : @[WSDL.Part]?;
		PartnerLink_Ref : @[BPEL.PartnerLink]?;
		Property_Ref : @[Messageproperties.Property]?;
		Query_ContRef : @[BPEL.BPELQuery]?;
	};

	type @[BPEL.From] : @[BPEL.To], @[BPEL.BPELExtensibleElement] {
		Opaque_Att : Logical;
		EndpointReference_Att : @[BPEL.EndpointReferenceRole]?;
		Literal_Att : Logical;
		UnsafeLiteral_Att : Logical;
		Expression_ContRef : @[BPEL.Expression]?;
		ServiceRef_ContRef : @[BPEL.ServiceRef]?;
		Type_Ref : @[XSD.XSDTypeDefinition]?;
	};

	type @[BPEL.OnMessage] : @[BPEL.BPELExtensibleElement] {
		Variable_Ref : @[BPEL.Variable]?;
		Activity_ContRef : @[BPEL.Activity]?;
		PortType_Ref : @[WSDL.PortType];
		PartnerLink_Ref : @[BPEL.PartnerLink];
		Correlations_ContRef : @[BPEL.Correlations]?;
		Operation_Ref : @[WSDL.Operation];
		FromPart_Ref : @[BPEL.FromPart]*;
	};

	type @[BPEL.Expression] : @[WSDL.ExtensibilityElement] {
		Body_Att : Logical;
		ExpressionLanguage_Att : Logical;
		Opaque_Att : Logical;
	};

	type @[BPEL.BooleanExpression] : @[BPEL.Expression];

	type @[BPEL.Correlation] : @[BPEL.BPELExtensibleElement] {
		Initiate_Att : Logical;
		Pattern_Att : @[BPEL.CorrelationPattern]?;
		Set_Ref : @[BPEL.CorrelationSet];
	};

	type @[BPEL.CorrelationPattern] {"outin", "in", "out"};

	type @[BPEL.EndpointReferenceRole] {"partnerRole", "myRole"};

	type @[BPEL.EventHandler] : @[BPEL.BPELExtensibleElement] {
		Alarm_ContRef : @[BPEL.OnAlarm]*;
		Events_ContRef : @[BPEL.OnEvent]*;
	};

	type @[BPEL.Source] : @[BPEL.BPELExtensibleElement] {
		Link_Ref : @[BPEL.Link];
		Activity_Ref : @[BPEL.Activity];
		TransitionCondition_ContRef : @[BPEL.Condition]?;
	};

	type @[BPEL.Target] : @[BPEL.BPELExtensibleElement] {
		Link_Ref : @[BPEL.Link];
		Activity_Ref : @[BPEL.Activity];
	};

	type @[BPEL.PartnerLinks] : @[BPEL.BPELExtensibleElement] {
		Children_ContRef : @[BPEL.PartnerLink]*;
	};

	type @[BPEL.Variables] : @[BPEL.BPELExtensibleElement] {
		Children_ContRef : @[BPEL.Variable]*;
	};

	type @[BPEL.CorrelationSets] : @[BPEL.BPELExtensibleElement] {
		Children_ContRef : @[BPEL.CorrelationSet]*;
	};

	type @[BPEL.Links] : @[BPEL.BPELExtensibleElement] {
		Children_ContRef : @[BPEL.Link]*;
	};

	type @[BPEL.CatchAll] : @[BPEL.BPELExtensibleElement] {
		Activity_ContRef : @[BPEL.Activity];
	};

	type @[BPEL.Correlations] : @[BPEL.BPELExtensibleElement] {
		Children_ContRef : @[BPEL.Correlation]*;
	};

	type @[BPEL.Variable] : @[BPEL.BPELExtensibleElement] {
		Name_Att : Logical;
		MessageType_Ref : @[WSDL.Message]?;
		XSDElement_Ref : @[XSD.XSDElementDeclaration]?;
		Type_Ref : @[XSD.XSDTypeDefinition]?;
		From_Ref : @[BPEL.From]?;
	};

	type @[BPEL.Otherwise] : @[BPEL.BPELExtensibleElement] {
		Activity_ContRef : @[BPEL.Activity];
	};

	type @[BPEL.UnknownExtensibilityAttribute] : @[WSDL.UnknownExtensibilityElement];

	type @[BPEL.OnEvent] : @[BPEL.BPELExtensibleElement] {
		Activity_ContRef : @[BPEL.Activity]?;
		Variable_ContRef : @[BPEL.Variable]?;
		PartnerLink_Ref : @[BPEL.PartnerLink];
		Correlations_ContRef : @[BPEL.Correlations]?;
		Operation_Ref : @[WSDL.Operation];
		PortType_Ref : @[WSDL.PortType];
		MessageType_Ref : @[WSDL.Message];
		FromPart_Ref : @[BPEL.FromPart]*;
		CorrelationSets_ContRef : @[BPEL.CorrelationSets]?;
	};

	type @[BPEL.BPELImport] {
		Namespace_Att : Logical;
		Location_Att : Logical;
		ImportType_Att : Logical;
	};

	type @[BPEL.Rethrow] : @[BPEL.Activity];

	type @[BPEL.Condition] : @[BPEL.Expression];

	type @[BPEL.Targets] : @[BPEL.BPELExtensibleElement] {
		Children_ContRef : @[BPEL.Target]*;
		JoinCondition_ContRef : @[BPEL.Condition]?;
	};

	type @[BPEL.Sources] : @[BPEL.BPELExtensibleElement] {
		Children_ContRef : @[BPEL.Source]*;
	};

	type @[BPEL.BPELQuery] {
		Value_Att : Logical;
		QueryLanguage_Att : Logical;
	};

	type @[BPEL.ServiceRef] {
		ReferenceScheme_Att : Logical;
		Value_Att : Logical;
	};

	type @[BPEL.Extensions] : @[BPEL.BPELExtensibleElement] {
		Children_ContRef : @[BPEL.Extension]*;
	};

	type @[BPEL.ExtensionActivity] : @[BPEL.Activity];

	type @[BPEL.FromPart] {
		Part_Att : Logical;
		To_Ref : @[BPEL.To]?;
	};

	type @[BPEL.ToPart] {
		Part_Att : Logical;
		From_Ref : @[BPEL.From]?;
	};

	type @[BPEL.OpaqueActivity] : @[BPEL.Activity];

	type @[BPEL.ForEach] : @[BPEL.Activity] {
		Parallel_Att : Logical;
		CounterName_ContRef : @[BPEL.Variable];
		CompletionCondition_ContRef : @[BPEL.CompletionCondition]?;
		Iterator_ContRef : @[BPEL.Iterator];
		Activity_ContRef : @[BPEL.Activity];
	};

	type @[BPEL.RepeatUntil] : @[BPEL.Activity] {
		Activity_ContRef : @[BPEL.Activity];
		Condition_ContRef : @[BPEL.Condition];
	};

	type @[BPEL.TerminationHandler] : @[BPEL.BPELExtensibleElement] {
		Activity_ContRef : @[BPEL.Activity]?;
	};

	type @[BPEL.Validate] : @[BPEL.Activity] {
		Variables_Ref : @[BPEL.Variable]*;
	};

	type @[BPEL.If] : @[BPEL.Activity] {
		Condition_ContRef : @[BPEL.Condition]?;
		Then_ContRef : @[BPEL.Then]?;
		ElseIf_ContRef : @[BPEL.ElseIf]*;
		Else_ContRef : @[BPEL.Else]?;
	};

	type @[BPEL.Then] : @[BPEL.BPELExtensibleElement] {
		Activity_ContRef : @[BPEL.Activity];
	};

	type @[BPEL.ElseIf] : @[BPEL.BPELExtensibleElement] {
		Condition_ContRef : @[BPEL.Condition]?;
		Activity_ContRef : @[BPEL.Activity];
	};

	type @[BPEL.Else] : @[BPEL.BPELExtensibleElement] {
		Activity_ContRef : @[BPEL.Activity];
	};

	type @[BPEL.CompletionCondition] {
		Branches_ContRef : @[BPEL.Branches]?;
	};

	type @[BPEL.Branches] : @[BPEL.Expression] {
		CountCompletedBranchesOnly_Att : Logical;
	};

	type @[BPEL.BPELExtensibleElement] : @[WSDL.WSDLExtensibleElement] {
		Documentation_ContRef : @[BPEL.Documentation]?;
	};

	type @[BPEL.Documentation] {
		Lang_Att : Logical;
		Source_Att : Logical;
		Value_Att : Logical;
	};

	type @[BPEL.Iterator] {
		FinalCounterValue_ContRef : @[BPEL.Expression]?;
		StartCounterValue_ContRef : @[BPEL.Expression]?;
	};

	type @[WSDL.WSDLElement] {
		DocumentationElement_Att : Logical;
		Element_Att : Logical;
	};

	type @[WSDL.PortType] : @[WSDL.WSDLElement], @[WSDL.IPortType] {
		QName_Att : Logical;
		Undefined_Att : Logical;
		Proxy_Att : Logical;
		ResourceURI_Att : Logical;
		EOperations_ContRef : @[WSDL.Operation]*;
	};

	type @[WSDL.Operation] : @[WSDL.WSDLElement], @[WSDL.IOperation] {
		Style_Att : Logical;
		Name_Att : Logical;
		Undefined_Att : Logical;
		Proxy_Att : Logical;
		ResourceURI_Att : Logical;
		EInput_ContRef : @[WSDL.Input]?;
		EOutput_ContRef : @[WSDL.Output]?;
		EFaults_ContRef : @[WSDL.Fault]*;
		EParameterOrdering_Ref : @[WSDL.Part]*;
	};

	type @[WSDL.Message] : @[WSDL.WSDLElement], @[WSDL.IMessage] {
		QName_Att : Logical;
		Undefined_Att : Logical;
		Proxy_Att : Logical;
		ResourceURI_Att : Logical;
		EParts_ContRef : @[WSDL.Part]*;
	};

	type @[WSDL.Part] : @[WSDL.WSDLElement], @[WSDL.IPart] {
		Name_Att : Logical;
		ElementName_Att : Logical;
		TypeName_Att : Logical;
		TypeDefinition_Ref : @[XSD.XSDTypeDefinition]?;
		ElementDeclaration_Ref : @[XSD.XSDElementDeclaration]?;
		EMessage_Ref : @[WSDL.Message]?;
	};

	type @[WSDL.Binding] : @[WSDL.WSDLExtensibleElement], @[WSDL.IBinding] {
		QName_Att : Logical;
		Undefined_Att : Logical;
		Proxy_Att : Logical;
		ResourceURI_Att : Logical;
		EPortType_Ref : @[WSDL.PortType];
		EBindingOperations_ContRef : @[WSDL.BindingOperation]*;
	};

	type @[WSDL.BindingOperation] : @[WSDL.WSDLExtensibleElement], @[WSDL.IBindingOperation] {
		Name_Att : Logical;
		EOperation_Ref : @[WSDL.Operation];
		EBindingInput_ContRef : @[WSDL.BindingInput]?;
		EBindingOutput_ContRef : @[WSDL.BindingOutput]?;
		EBindingFaults_ContRef : @[WSDL.BindingFault]*;
	};

	type @[WSDL.Service] : @[WSDL.WSDLExtensibleElement], @[WSDL.IService] {
		QName_Att : Logical;
		Undefined_Att : Logical;
		Proxy_Att : Logical;
		ResourceURI_Att : Logical;
		EPorts_ContRef : @[WSDL.Port]*;
	};

	type @[WSDL.Port] : @[WSDL.WSDLExtensibleElement], @[WSDL.IPort] {
		Name_Att : Logical;
		EBinding_Ref : @[WSDL.Binding];
	};

	type @[WSDL.ExtensibilityElement] : @[WSDL.WSDLElement], @[WSDL.IExtensibilityElement] {
		Required_Att : Logical;
		ElementType_Att : Logical;
	};

	type @[WSDL.Definition] : @[WSDL.WSDLExtensibleElement], @[WSDL.IDefinition] {
		TargetNamespace_Att : Logical;
		Location_Att : Logical;
		QName_Att : Logical;
		Encoding_Att : Logical;
		EImports_ContRef : @[WSDL.WSDLImport]*;
		ETypes_ContRef : @[WSDL.Types]?;
		EMessages_ContRef : @[WSDL.Message]*;
		EPortTypes_ContRef : @[WSDL.PortType]*;
		EBindings_ContRef : @[WSDL.Binding]*;
		EServices_ContRef : @[WSDL.Service]*;
		ENamespaces_ContRef : @[WSDL.Namespace]*;
	};

	type @[WSDL.WSDLImport] : @[WSDL.WSDLElement], @[WSDL.IImport] {
		NamespaceURI_Att : Logical;
		LocationURI_Att : Logical;
		EDefinition_Ref : @[WSDL.Definition]?;
		ESchema_Ref : @[XSD.XSDSchema]?;
	};

	type @[WSDL.WSDLExtensibleElement] : @[WSDL.WSDLElement] {
		EExtensibilityElements_ContRef : @[WSDL.ExtensibilityElement]*;
	};

	type @[WSDL.Input] : @[WSDL.MessageReference], @[WSDL.WSDLElement], @[WSDL.IInput];

	type @[WSDL.Output] : @[WSDL.MessageReference], @[WSDL.WSDLElement], @[WSDL.IOutput];

	type @[WSDL.Fault] : @[WSDL.MessageReference], @[WSDL.WSDLElement], @[WSDL.IFault];

	type @[WSDL.BindingInput] : @[WSDL.WSDLExtensibleElement], @[WSDL.IBindingInput] {
		Name_Att : Logical;
		EInput_Ref : @[WSDL.Input];
	};

	type @[WSDL.BindingOutput] : @[WSDL.WSDLExtensibleElement], @[WSDL.IBindingOutput] {
		Name_Att : Logical;
		EOutput_Ref : @[WSDL.Output];
	};

	type @[WSDL.BindingFault] : @[WSDL.WSDLExtensibleElement], @[WSDL.IBindingFault] {
		Name_Att : Logical;
		EFault_Ref : @[WSDL.Fault];
	};

	type @[WSDL.Namespace] {
		URI_Att : Logical;
		Prefix_Att : Logical;
	};

	type @[WSDL.IPortType];

	type @[WSDL.IOperation];

	type @[WSDL.IInput];

	type @[WSDL.IOutput];

	type @[WSDL.IFault];

	type @[WSDL.IMessage];

	type @[WSDL.IPart];

	type @[WSDL.IService];

	type @[WSDL.IPort];

	type @[WSDL.IBinding];

	type @[WSDL.IBindingOperation];

	type @[WSDL.IBindingInput];

	type @[WSDL.IBindingOutput];

	type @[WSDL.IBindingFault];

	type @[WSDL.IExtensibilityElement];

	type @[WSDL.IDefinition];

	type @[WSDL.IImport];

	type @[WSDL.IList];

	type @[WSDL.IMap];

	type @[WSDL.IURL];

	type @[WSDL.IExtensionRegistry];

	type @[WSDL.Types] : @[WSDL.WSDLExtensibleElement], @[WSDL.ITypes];

	type @[WSDL.IIterator];

	type @[WSDL.ITypes];

	type @[WSDL.UnknownExtensibilityElement] : @[WSDL.ExtensibilityElement] {
		Children_ContRef : @[WSDL.UnknownExtensibilityElement]*;
	};

	type @[WSDL.XSDSchemaExtensibilityElement] : @[WSDL.ExtensibilityElement] {
		Schema_ContRef : @[XSD.XSDSchema]?;
	};

	type @[WSDL.MessageReference] : @[WSDL.WSDLElement] {
		Name_Att : Logical;
		EMessage_Ref : @[WSDL.Message];
	};
}