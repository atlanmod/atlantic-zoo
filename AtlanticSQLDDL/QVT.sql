CREATE TABLE TemplateExp (
	__IDTemplateExp__ Integer NOT NULL,
	FOREIGN KEY bindsTo (__FKbindsTo__) REFERENCES Variable (__IDVariable__),
	FOREIGN KEY "where" (__FKwhere__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY TemplateExp (__IDTemplateExp__),
	__FKbindsTo__ Integer,
	__FKwhere__ Integer
) ;

CREATE TABLE ObjectTemplateExp (
	__IDObjectTemplateExp__ Integer NOT NULL,
	FOREIGN KEY referredClass (__FKreferredClass__) REFERENCES Class (__IDClass__),
	PRIMARY KEY ObjectTemplateExp (__IDObjectTemplateExp__),
	__FKreferredClass__ Integer
) ;

CREATE TABLE CollectionTemplateExp (
	__IDCollectionTemplateExp__ Integer NOT NULL,
	kind text,
	FOREIGN KEY referredCollectionType (__FKreferredCollectionType__) REFERENCES CollectionType (__IDCollectionType__),
	FOREIGN KEY "match" (__FKmatch__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY CollectionTemplateExp (__IDCollectionTemplateExp__),
	__FKreferredCollectionType__ Integer,
	__FKmatch__ Integer
) ;

CREATE TABLE PropertyTemplateItem (
	__IDPropertyTemplateItem__ Integer NOT NULL,
	FOREIGN KEY objContainer (__FKobjContainer__) REFERENCES ObjectTemplateExp (__IDObjectTemplateExp__),
	FOREIGN KEY value (__FKvalue__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY referredProperty (__FKreferredProperty__) REFERENCES Property (__IDProperty__),
	PRIMARY KEY PropertyTemplateItem (__IDPropertyTemplateItem__),
	__FKobjContainer__ Integer,
	__FKvalue__ Integer,
	__FKreferredProperty__ Integer
) ;

CREATE TABLE ImperativeIterateExp (
	__IDImperativeIterateExp__ Integer NOT NULL,
	FOREIGN KEY target (__FKtarget__) REFERENCES Variable (__IDVariable__),
	PRIMARY KEY ImperativeIterateExp (__IDImperativeIterateExp__),
	__FKtarget__ Integer
) ;

CREATE TABLE AssignExp (
	__IDAssignExp__ Integer NOT NULL,
	FOREIGN KEY "left" (__FKleft__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY defaultValue (__FKdefaultValue__) REFERENCES OclExpression (__IDOclExpression__),
	isReset Boolean,
	PRIMARY KEY AssignExp (__IDAssignExp__),
	__FKleft__ Integer,
	__FKdefaultValue__ Integer
) ;

CREATE TABLE BlockExp (
	__IDBlockExp__ Integer NOT NULL,
	PRIMARY KEY BlockExp (__IDBlockExp__)
) ;

CREATE TABLE SwitchExp (
	__IDSwitchExp__ Integer NOT NULL,
	FOREIGN KEY elsePart (__FKelsePart__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY SwitchExp (__IDSwitchExp__),
	__FKelsePart__ Integer
) ;

CREATE TABLE VariableInitExp (
	__IDVariableInitExp__ Integer NOT NULL,
	FOREIGN KEY referredVariable (__FKreferredVariable__) REFERENCES Variable (__IDVariable__),
	withResult Boolean,
	PRIMARY KEY VariableInitExp (__IDVariableInitExp__),
	__FKreferredVariable__ Integer
) ;

CREATE TABLE WhileExp (
	__IDWhileExp__ Integer NOT NULL,
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY body (__FKbody__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY WhileExp (__IDWhileExp__),
	__FKcondition__ Integer,
	__FKbody__ Integer
) ;

CREATE TABLE ComputeExp (
	__IDComputeExp__ Integer NOT NULL,
	FOREIGN KEY returnedElement (__FKreturnedElement__) REFERENCES Variable (__IDVariable__),
	FOREIGN KEY body (__FKbody__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY ComputeExp (__IDComputeExp__),
	__FKreturnedElement__ Integer,
	__FKbody__ Integer
) ;

CREATE TABLE AltExp (
	__IDAltExp__ Integer NOT NULL,
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY body (__FKbody__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY AltExp (__IDAltExp__),
	__FKcondition__ Integer,
	__FKbody__ Integer
) ;

CREATE TABLE UnlinkExp (
	__IDUnlinkExp__ Integer NOT NULL,
	FOREIGN KEY target (__FKtarget__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY item (__FKitem__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY UnlinkExp (__IDUnlinkExp__),
	__FKtarget__ Integer,
	__FKitem__ Integer
) ;

CREATE TABLE ReturnExp (
	__IDReturnExp__ Integer NOT NULL,
	FOREIGN KEY value (__FKvalue__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY ReturnExp (__IDReturnExp__),
	__FKvalue__ Integer
) ;

CREATE TABLE BreakExp (
	__IDBreakExp__ Integer NOT NULL,
	PRIMARY KEY BreakExp (__IDBreakExp__)
) ;

CREATE TABLE TryExp (
	__IDTryExp__ Integer NOT NULL,
	FOREIGN KEY tryBody (__FKtryBody__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY exceptBody (__FKexceptBody__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY TryExp (__IDTryExp__),
	__FKtryBody__ Integer,
	__FKexceptBody__ Integer
) ;

CREATE TABLE RaiseExp (
	__IDRaiseExp__ Integer NOT NULL,
	FOREIGN KEY exception (__FKexception__) REFERENCES Type (__IDType__),
	PRIMARY KEY RaiseExp (__IDRaiseExp__),
	__FKexception__ Integer
) ;

CREATE TABLE ContinueExp (
	__IDContinueExp__ Integer NOT NULL,
	PRIMARY KEY ContinueExp (__IDContinueExp__)
) ;

CREATE TABLE ForExp (
	__IDForExp__ Integer NOT NULL,
	PRIMARY KEY ForExp (__IDForExp__)
) ;

CREATE TABLE TupleExp (
	__IDTupleExp__ Integer NOT NULL,
	PRIMARY KEY TupleExp (__IDTupleExp__)
) ;

CREATE TABLE Typedef (
	__IDTypedef__ Integer NOT NULL,
	FOREIGN KEY base (__FKbase__) REFERENCES Type (__IDType__),
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY Typedef (__IDTypedef__),
	__FKbase__ Integer,
	__FKcondition__ Integer
) ;

CREATE TABLE InstantiationExp (
	__IDInstantiationExp__ Integer NOT NULL,
	FOREIGN KEY instantiatedClass (__FKinstantiatedClass__) REFERENCES Class (__IDClass__),
	FOREIGN KEY extent (__FKextent__) REFERENCES Variable (__IDVariable__),
	PRIMARY KEY InstantiationExp (__IDInstantiationExp__),
	__FKinstantiatedClass__ Integer,
	__FKextent__ Integer
) ;

CREATE TABLE DictionaryType (
	__IDDictionaryType__ Integer NOT NULL,
	FOREIGN KEY keyType (__FKkeyType__) REFERENCES Type (__IDType__),
	PRIMARY KEY DictionaryType (__IDDictionaryType__),
	__FKkeyType__ Integer
) ;

CREATE TABLE DictLiteralExp (
	__IDDictLiteralExp__ Integer NOT NULL,
	PRIMARY KEY DictLiteralExp (__IDDictLiteralExp__)
) ;

CREATE TABLE DictLiteralPart (
	__IDDictLiteralPart__ Integer NOT NULL,
	FOREIGN KEY "key" (__FKkey__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY value (__FKvalue__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY DictLiteralPart (__IDDictLiteralPart__),
	__FKkey__ Integer,
	__FKvalue__ Integer
) ;

CREATE TABLE TemplateParameterType (
	__IDTemplateParameterType__ Integer NOT NULL,
	specification text,
	PRIMARY KEY TemplateParameterType (__IDTemplateParameterType__)
) ;

CREATE TABLE LogExp (
	__IDLogExp__ Integer NOT NULL,
	text text,
	level Integer,
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY element (__FKelement__) REFERENCES Element (__IDElement__),
	PRIMARY KEY LogExp (__IDLogExp__),
	__FKcondition__ Integer,
	__FKelement__ Integer
) ;

CREATE TABLE AssertExp (
	__IDAssertExp__ Integer NOT NULL,
	severity text,
	FOREIGN KEY log (__FKlog__) REFERENCES LogExp (__IDLogExp__),
	FOREIGN KEY assertion (__FKassertion__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY AssertExp (__IDAssertExp__),
	__FKlog__ Integer,
	__FKassertion__ Integer
) ;

CREATE TABLE ImperativeLoopExp (
	__IDImperativeLoopExp__ Integer NOT NULL,
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY ImperativeLoopExp (__IDImperativeLoopExp__),
	__FKcondition__ Integer
) ;

CREATE TABLE CollectorExp (
	__IDCollectorExp__ Integer NOT NULL,
	FOREIGN KEY target (__FKtarget__) REFERENCES Variable (__IDVariable__),
	PRIMARY KEY CollectorExp (__IDCollectorExp__),
	__FKtarget__ Integer
) ;

CREATE TABLE ImperativeExpression (
	__IDImperativeExpression__ Integer NOT NULL,
	PRIMARY KEY ImperativeExpression (__IDImperativeExpression__)
) ;

CREATE TABLE UnpackExp (
	__IDUnpackExp__ Integer NOT NULL,
	PRIMARY KEY UnpackExp (__IDUnpackExp__)
) ;

CREATE TABLE AnonymousTupleType (
	__IDAnonymousTupleType__ Integer NOT NULL,
	PRIMARY KEY AnonymousTupleType (__IDAnonymousTupleType__)
) ;

CREATE TABLE AnonymousTupleLiteralExp (
	__IDAnonymousTupleLiteralExp__ Integer NOT NULL,
	PRIMARY KEY AnonymousTupleLiteralExp (__IDAnonymousTupleLiteralExp__)
) ;

CREATE TABLE AnonymousTupleLiteralPart (
	__IDAnonymousTupleLiteralPart__ Integer NOT NULL,
	PRIMARY KEY AnonymousTupleLiteralPart (__IDAnonymousTupleLiteralPart__)
) ;

CREATE TABLE ListType (
	__IDListType__ Integer NOT NULL,
	PRIMARY KEY ListType (__IDListType__)
) ;

CREATE TABLE Class (
	__IDClass__ Integer NOT NULL,
	isAbstract Boolean,
	PRIMARY KEY Class (__IDClass__)
) ;

CREATE TABLE DataType (
	__IDDataType__ Integer NOT NULL,
	PRIMARY KEY DataType (__IDDataType__)
) ;

CREATE TABLE Element (
	__IDElement__ Integer NOT NULL,
	PRIMARY KEY Element (__IDElement__)
) ;

CREATE TABLE Tag (
	__IDTag__ Integer NOT NULL,
	FOREIGN KEY transformation (__FKtransformation__) REFERENCES Transformation (__IDTransformation__),
	FOREIGN KEY owner (__FKowner__) REFERENCES Module (__IDModule__),
	value text,
	name text,
	PRIMARY KEY Tag (__IDTag__),
	__FKtransformation__ Integer,
	__FKowner__ Integer
) ;

CREATE TABLE Enumeration (
	__IDEnumeration__ Integer NOT NULL,
	PRIMARY KEY Enumeration (__IDEnumeration__)
) ;

CREATE TABLE NamedElement (
	__IDNamedElement__ Integer NOT NULL,
	name text,
	PRIMARY KEY NamedElement (__IDNamedElement__)
) ;

CREATE TABLE Extent (
	__IDExtent__ Integer NOT NULL,
	PRIMARY KEY Extent (__IDExtent__)
) ;

CREATE TABLE Object (
	__IDObject__ Integer NOT NULL,
	PRIMARY KEY Object (__IDObject__)
) ;

CREATE TABLE Operation (
	__IDOperation__ Integer NOT NULL,
	FOREIGN KEY class (__FKclass__) REFERENCES Class (__IDClass__),
	PRIMARY KEY Operation (__IDOperation__),
	__FKclass__ Integer
) ;

CREATE TABLE MultiplicityElement (
	__IDMultiplicityElement__ Integer NOT NULL,
	isOrdered Boolean,
	isUnique Boolean,
	lower Integer,
	upper text,
	PRIMARY KEY MultiplicityElement (__IDMultiplicityElement__)
) ;

CREATE TABLE Package (
	__IDPackage__ Integer NOT NULL,
	uri text,
	PRIMARY KEY Package (__IDPackage__)
) ;

CREATE TABLE Type (
	__IDType__ Integer NOT NULL,
	FOREIGN KEY package (__FKpackage__) REFERENCES Package (__IDPackage__),
	PRIMARY KEY Type (__IDType__),
	__FKpackage__ Integer
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	FOREIGN KEY operation (__FKoperation__) REFERENCES Operation (__IDOperation__),
	PRIMARY KEY Parameter (__IDParameter__),
	__FKoperation__ Integer
) ;

CREATE TABLE EnumerationLiteral (
	__IDEnumerationLiteral__ Integer NOT NULL,
	FOREIGN KEY enumeration (__FKenumeration__) REFERENCES Enumeration (__IDEnumeration__),
	PRIMARY KEY EnumerationLiteral (__IDEnumerationLiteral__),
	__FKenumeration__ Integer
) ;

CREATE TABLE Property (
	__IDProperty__ Integer NOT NULL,
	FOREIGN KEY Class (__FKClass__) REFERENCES Class (__IDClass__),
	FOREIGN KEY opposite (__FKopposite__) REFERENCES Property (__IDProperty__),
	FOREIGN KEY module (__FKmodule__) REFERENCES Module (__IDModule__),
	isReadOnly Boolean,
	isDerived Boolean,
	isComposite Boolean,
	isId Boolean,
	"default" text,
	PRIMARY KEY Property (__IDProperty__),
	__FKClass__ Integer,
	__FKopposite__ Integer,
	__FKmodule__ Integer
) ;

CREATE TABLE TypedElement (
	__IDTypedElement__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES Type (__IDType__),
	PRIMARY KEY TypedElement (__IDTypedElement__),
	__FKtype__ Integer
) ;

CREATE TABLE PrimitiveType (
	__IDPrimitiveType__ Integer NOT NULL,
	PRIMARY KEY PrimitiveType (__IDPrimitiveType__)
) ;

CREATE TABLE URIExtent (
	__IDURIExtent__ Integer NOT NULL,
	PRIMARY KEY URIExtent (__IDURIExtent__)
) ;

CREATE TABLE Comment (
	__IDComment__ Integer NOT NULL,
	PRIMARY KEY Comment (__IDComment__)
) ;

CREATE TABLE MappingBody (
	__IDMappingBody__ Integer NOT NULL,
	PRIMARY KEY MappingBody (__IDMappingBody__)
) ;

CREATE TABLE Helper (
	__IDHelper__ Integer NOT NULL,
	isQuery Boolean,
	PRIMARY KEY Helper (__IDHelper__)
) ;

CREATE TABLE ResolveExp (
	__IDResolveExp__ Integer NOT NULL,
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES OclExpression (__IDOclExpression__),
	one Boolean,
	isInverse Boolean,
	isDeferred Boolean,
	PRIMARY KEY ResolveExp (__IDResolveExp__),
	__FKcondition__ Integer
) ;

CREATE TABLE ResolveInExp (
	__IDResolveInExp__ Integer NOT NULL,
	FOREIGN KEY inMapping (__FKinMapping__) REFERENCES MappingOperation (__IDMappingOperation__),
	PRIMARY KEY ResolveInExp (__IDResolveInExp__),
	__FKinMapping__ Integer
) ;

CREATE TABLE OperationalTransformation (
	__IDOperationalTransformation__ Integer NOT NULL,
	FOREIGN KEY refined (__FKrefined__) REFERENCES Transformation (__IDTransformation__),
	FOREIGN KEY entry (__FKentry__) REFERENCES EntryOperation (__IDEntryOperation__),
	PRIMARY KEY OperationalTransformation (__IDOperationalTransformation__),
	__FKrefined__ Integer,
	__FKentry__ Integer
) ;

CREATE TABLE MappingParameter (
	__IDMappingParameter__ Integer NOT NULL,
	FOREIGN KEY refinedDomain (__FKrefinedDomain__) REFERENCES RelationDomain (__IDRelationDomain__),
	FOREIGN KEY extent (__FKextent__) REFERENCES ModelParameter (__IDModelParameter__),
	PRIMARY KEY MappingParameter (__IDMappingParameter__),
	__FKrefinedDomain__ Integer,
	__FKextent__ Integer
) ;

CREATE TABLE MappingOperation (
	__IDMappingOperation__ Integer NOT NULL,
	FOREIGN KEY refinedRelation (__FKrefinedRelation__) REFERENCES Relation (__IDRelation__),
	PRIMARY KEY MappingOperation (__IDMappingOperation__),
	__FKrefinedRelation__ Integer
) ;

CREATE TABLE MappingCallExp (
	__IDMappingCallExp__ Integer NOT NULL,
	isStrict Boolean,
	PRIMARY KEY MappingCallExp (__IDMappingCallExp__)
) ;

CREATE TABLE Constructor (
	__IDConstructor__ Integer NOT NULL,
	PRIMARY KEY Constructor (__IDConstructor__)
) ;

CREATE TABLE ContextualProperty (
	__IDContextualProperty__ Integer NOT NULL,
	FOREIGN KEY context (__FKcontext__) REFERENCES Class (__IDClass__),
	FOREIGN KEY overridden (__FKoverridden__) REFERENCES Property (__IDProperty__),
	PRIMARY KEY ContextualProperty (__IDContextualProperty__),
	__FKcontext__ Integer,
	__FKoverridden__ Integer
) ;

CREATE TABLE EntryOperation (
	__IDEntryOperation__ Integer NOT NULL,
	PRIMARY KEY EntryOperation (__IDEntryOperation__)
) ;

CREATE TABLE ImperativeCallExp (
	__IDImperativeCallExp__ Integer NOT NULL,
	isVirtual Boolean,
	PRIMARY KEY ImperativeCallExp (__IDImperativeCallExp__)
) ;

CREATE TABLE ImperativeOperation (
	__IDImperativeOperation__ Integer NOT NULL,
	FOREIGN KEY context (__FKcontext__) REFERENCES VarParameter (__IDVarParameter__),
	FOREIGN KEY overridden (__FKoverridden__) REFERENCES ImperativeOperation (__IDImperativeOperation__),
	FOREIGN KEY body (__FKbody__) REFERENCES OperationBody (__IDOperationBody__),
	isBlackbox Boolean,
	PRIMARY KEY ImperativeOperation (__IDImperativeOperation__),
	__FKcontext__ Integer,
	__FKoverridden__ Integer,
	__FKbody__ Integer
) ;

CREATE TABLE Library (
	__IDLibrary__ Integer NOT NULL,
	PRIMARY KEY Library (__IDLibrary__)
) ;

CREATE TABLE ModelParameter (
	__IDModelParameter__ Integer NOT NULL,
	PRIMARY KEY ModelParameter (__IDModelParameter__)
) ;

CREATE TABLE ModelType (
	__IDModelType__ Integer NOT NULL,
	conformanceKind text,
	PRIMARY KEY ModelType (__IDModelType__)
) ;

CREATE TABLE Module (
	__IDModule__ Integer NOT NULL,
	isBlackbox Boolean,
	PRIMARY KEY Module (__IDModule__)
) ;

CREATE TABLE ModuleImport (
	__IDModuleImport__ Integer NOT NULL,
	FOREIGN KEY module (__FKmodule__) REFERENCES Module (__IDModule__),
	FOREIGN KEY importedModule (__FKimportedModule__) REFERENCES Module (__IDModule__),
	kind text,
	PRIMARY KEY ModuleImport (__IDModuleImport__),
	__FKmodule__ Integer,
	__FKimportedModule__ Integer
) ;

CREATE TABLE VarParameter (
	__IDVarParameter__ Integer NOT NULL,
	FOREIGN KEY ctxOwner (__FKctxOwner__) REFERENCES ImperativeOperation (__IDImperativeOperation__),
	FOREIGN KEY resOwner (__FKresOwner__) REFERENCES ImperativeOperation (__IDImperativeOperation__),
	kind text,
	PRIMARY KEY VarParameter (__IDVarParameter__),
	__FKctxOwner__ Integer,
	__FKresOwner__ Integer
) ;

CREATE TABLE OperationBody (
	__IDOperationBody__ Integer NOT NULL,
	FOREIGN KEY operation (__FKoperation__) REFERENCES ImperativeOperation (__IDImperativeOperation__),
	PRIMARY KEY OperationBody (__IDOperationBody__),
	__FKoperation__ Integer
) ;

CREATE TABLE ConstructorBody (
	__IDConstructorBody__ Integer NOT NULL,
	PRIMARY KEY ConstructorBody (__IDConstructorBody__)
) ;

CREATE TABLE ObjectExp (
	__IDObjectExp__ Integer NOT NULL,
	FOREIGN KEY referredObject (__FKreferredObject__) REFERENCES Variable (__IDVariable__),
	FOREIGN KEY body (__FKbody__) REFERENCES ConstructorBody (__IDConstructorBody__),
	PRIMARY KEY ObjectExp (__IDObjectExp__),
	__FKreferredObject__ Integer,
	__FKbody__ Integer
) ;

CREATE TABLE Area (
	__IDArea__ Integer NOT NULL,
	FOREIGN KEY guardPattern (__FKguardPattern__) REFERENCES GuardPattern (__IDGuardPattern__),
	FOREIGN KEY bottomPattern (__FKbottomPattern__) REFERENCES BottomPattern (__IDBottomPattern__),
	PRIMARY KEY Area (__IDArea__),
	__FKguardPattern__ Integer,
	__FKbottomPattern__ Integer
) ;

CREATE TABLE Assignment (
	__IDAssignment__ Integer NOT NULL,
	FOREIGN KEY bottomPattern (__FKbottomPattern__) REFERENCES BottomPattern (__IDBottomPattern__),
	FOREIGN KEY slotExpression (__FKslotExpression__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY value (__FKvalue__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY targetProperty (__FKtargetProperty__) REFERENCES Property (__IDProperty__),
	isDefault Boolean,
	PRIMARY KEY Assignment (__IDAssignment__),
	__FKbottomPattern__ Integer,
	__FKslotExpression__ Integer,
	__FKvalue__ Integer,
	__FKtargetProperty__ Integer
) ;

CREATE TABLE BottomPattern (
	__IDBottomPattern__ Integer NOT NULL,
	FOREIGN KEY area (__FKarea__) REFERENCES Area (__IDArea__),
	PRIMARY KEY BottomPattern (__IDBottomPattern__),
	__FKarea__ Integer
) ;

CREATE TABLE GuardPattern (
	__IDGuardPattern__ Integer NOT NULL,
	FOREIGN KEY area (__FKarea__) REFERENCES Area (__IDArea__),
	PRIMARY KEY GuardPattern (__IDGuardPattern__),
	__FKarea__ Integer
) ;

CREATE TABLE Mapping (
	__IDMapping__ Integer NOT NULL,
	FOREIGN KEY context (__FKcontext__) REFERENCES Mapping (__IDMapping__),
	PRIMARY KEY Mapping (__IDMapping__),
	__FKcontext__ Integer
) ;

CREATE TABLE RealizedVariable (
	__IDRealizedVariable__ Integer NOT NULL,
	PRIMARY KEY RealizedVariable (__IDRealizedVariable__)
) ;

CREATE TABLE CoreDomain (
	__IDCoreDomain__ Integer NOT NULL,
	PRIMARY KEY CoreDomain (__IDCoreDomain__)
) ;

CREATE TABLE CorePattern (
	__IDCorePattern__ Integer NOT NULL,
	PRIMARY KEY CorePattern (__IDCorePattern__)
) ;

CREATE TABLE EnforcementOperation (
	__IDEnforcementOperation__ Integer NOT NULL,
	enforcementMode text,
	FOREIGN KEY bottomPattern (__FKbottomPattern__) REFERENCES BottomPattern (__IDBottomPattern__),
	FOREIGN KEY operationCallExp (__FKoperationCallExp__) REFERENCES OperationCallExp (__IDOperationCallExp__),
	PRIMARY KEY EnforcementOperation (__IDEnforcementOperation__),
	__FKbottomPattern__ Integer,
	__FKoperationCallExp__ Integer
) ;

CREATE TABLE Domain (
	__IDDomain__ Integer NOT NULL,
	isCheckable Boolean,
	isEnforceable Boolean,
	FOREIGN KEY rule (__FKrule__) REFERENCES Rule (__IDRule__),
	FOREIGN KEY typedModel (__FKtypedModel__) REFERENCES TypedModel (__IDTypedModel__),
	PRIMARY KEY Domain (__IDDomain__),
	__FKrule__ Integer,
	__FKtypedModel__ Integer
) ;

CREATE TABLE Transformation (
	__IDTransformation__ Integer NOT NULL,
	FOREIGN KEY extends (__FKextends__) REFERENCES Transformation (__IDTransformation__),
	PRIMARY KEY Transformation (__IDTransformation__),
	__FKextends__ Integer
) ;

CREATE TABLE TypedModel (
	__IDTypedModel__ Integer NOT NULL,
	FOREIGN KEY transformation (__FKtransformation__) REFERENCES Transformation (__IDTransformation__),
	PRIMARY KEY TypedModel (__IDTypedModel__),
	__FKtransformation__ Integer
) ;

CREATE TABLE Rule (
	__IDRule__ Integer NOT NULL,
	FOREIGN KEY transformation (__FKtransformation__) REFERENCES Transformation (__IDTransformation__),
	FOREIGN KEY overrides (__FKoverrides__) REFERENCES Rule (__IDRule__),
	PRIMARY KEY Rule (__IDRule__),
	__FKtransformation__ Integer,
	__FKoverrides__ Integer
) ;

CREATE TABLE Pattern (
	__IDPattern__ Integer NOT NULL,
	FOREIGN KEY whenOwner (__FKwhenOwner__) REFERENCES Relation (__IDRelation__),
	FOREIGN KEY whereOwner (__FKwhereOwner__) REFERENCES Relation (__IDRelation__),
	PRIMARY KEY Pattern (__IDPattern__),
	__FKwhenOwner__ Integer,
	__FKwhereOwner__ Integer
) ;

CREATE TABLE Predicate (
	__IDPredicate__ Integer NOT NULL,
	FOREIGN KEY conditionExpression (__FKconditionExpression__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY pattern (__FKpattern__) REFERENCES Pattern (__IDPattern__),
	PRIMARY KEY Predicate (__IDPredicate__),
	__FKconditionExpression__ Integer,
	__FKpattern__ Integer
) ;

CREATE TABLE Function (
	__IDFunction__ Integer NOT NULL,
	FOREIGN KEY queryExpression (__FKqueryExpression__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY Function (__IDFunction__),
	__FKqueryExpression__ Integer
) ;

CREATE TABLE FunctionParameter (
	__IDFunctionParameter__ Integer NOT NULL,
	PRIMARY KEY FunctionParameter (__IDFunctionParameter__)
) ;

CREATE TABLE RelationalTransformation (
	__IDRelationalTransformation__ Integer NOT NULL,
	PRIMARY KEY RelationalTransformation (__IDRelationalTransformation__)
) ;

CREATE TABLE Relation (
	__IDRelation__ Integer NOT NULL,
	isTopLevel Boolean,
	FOREIGN KEY "where" (__FKwhere__) REFERENCES Pattern (__IDPattern__),
	FOREIGN KEY "when" (__FKwhen__) REFERENCES Pattern (__IDPattern__),
	PRIMARY KEY Relation (__IDRelation__),
	__FKwhere__ Integer,
	__FKwhen__ Integer
) ;

CREATE TABLE RelationDomain (
	__IDRelationDomain__ Integer NOT NULL,
	FOREIGN KEY pattern (__FKpattern__) REFERENCES DomainPattern (__IDDomainPattern__),
	FOREIGN KEY rootVariable (__FKrootVariable__) REFERENCES Variable (__IDVariable__),
	PRIMARY KEY RelationDomain (__IDRelationDomain__),
	__FKpattern__ Integer,
	__FKrootVariable__ Integer
) ;

CREATE TABLE DomainPattern (
	__IDDomainPattern__ Integer NOT NULL,
	FOREIGN KEY templateExpression (__FKtemplateExpression__) REFERENCES TemplateExp (__IDTemplateExp__),
	PRIMARY KEY DomainPattern (__IDDomainPattern__),
	__FKtemplateExpression__ Integer
) ;

CREATE TABLE RelationImplementation (
	__IDRelationImplementation__ Integer NOT NULL,
	FOREIGN KEY relation (__FKrelation__) REFERENCES Relation (__IDRelation__),
	FOREIGN KEY impl (__FKimpl__) REFERENCES Operation (__IDOperation__),
	FOREIGN KEY inDirectionOf (__FKinDirectionOf__) REFERENCES TypedModel (__IDTypedModel__),
	PRIMARY KEY RelationImplementation (__IDRelationImplementation__),
	__FKrelation__ Integer,
	__FKimpl__ Integer,
	__FKinDirectionOf__ Integer
) ;

CREATE TABLE "Key" (
	__IDKey__ Integer NOT NULL,
	FOREIGN KEY identifies (__FKidentifies__) REFERENCES Class (__IDClass__),
	FOREIGN KEY transformation (__FKtransformation__) REFERENCES RelationalTransformation (__IDRelationalTransformation__),
	PRIMARY KEY "Key" (__IDKey__),
	__FKidentifies__ Integer,
	__FKtransformation__ Integer
) ;

CREATE TABLE BooleanLiteralExp (
	__IDBooleanLiteralExp__ Integer NOT NULL,
	booleanSymbol Boolean,
	PRIMARY KEY BooleanLiteralExp (__IDBooleanLiteralExp__)
) ;

CREATE TABLE CallExp (
	__IDCallExp__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY CallExp (__IDCallExp__),
	__FKsource__ Integer
) ;

CREATE TABLE OclExpression (
	__IDOclExpression__ Integer NOT NULL,
	FOREIGN KEY tryBodyOwner (__FKtryBodyOwner__) REFERENCES TryExp (__IDTryExp__),
	PRIMARY KEY OclExpression (__IDOclExpression__),
	__FKtryBodyOwner__ Integer
) ;

CREATE TABLE UnlimitedNaturalExp (
	__IDUnlimitedNaturalExp__ Integer NOT NULL,
	symbol text,
	PRIMARY KEY UnlimitedNaturalExp (__IDUnlimitedNaturalExp__)
) ;

CREATE TABLE IfExp (
	__IDIfExp__ Integer NOT NULL,
	FOREIGN KEY "condition" (__FKcondition__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY thenExpression (__FKthenExpression__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY elseExpression (__FKelseExpression__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY IfExp (__IDIfExp__),
	__FKcondition__ Integer,
	__FKthenExpression__ Integer,
	__FKelseExpression__ Integer
) ;

CREATE TABLE LetExp (
	__IDLetExp__ Integer NOT NULL,
	FOREIGN KEY variable (__FKvariable__) REFERENCES Variable (__IDVariable__),
	PRIMARY KEY LetExp (__IDLetExp__),
	__FKvariable__ Integer
) ;

CREATE TABLE Variable (
	__IDVariable__ Integer NOT NULL,
	FOREIGN KEY initExpression (__FKinitExpression__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY LetExp (__FKLetExp__) REFERENCES LetExp (__IDLetExp__),
	FOREIGN KEY computeOwner (__FKcomputeOwner__) REFERENCES ComputeExp (__IDComputeExp__),
	FOREIGN KEY bindParameter (__FKbindParameter__) REFERENCES Parameter (__IDParameter__),
	PRIMARY KEY Variable (__IDVariable__),
	__FKinitExpression__ Integer,
	__FKLetExp__ Integer,
	__FKcomputeOwner__ Integer,
	__FKbindParameter__ Integer
) ;

CREATE TABLE PropertyCallExp (
	__IDPropertyCallExp__ Integer NOT NULL,
	FOREIGN KEY referredProperty (__FKreferredProperty__) REFERENCES Property (__IDProperty__),
	PRIMARY KEY PropertyCallExp (__IDPropertyCallExp__),
	__FKreferredProperty__ Integer
) ;

CREATE TABLE VariableExp (
	__IDVariableExp__ Integer NOT NULL,
	FOREIGN KEY referredVariable (__FKreferredVariable__) REFERENCES Variable (__IDVariable__),
	PRIMARY KEY VariableExp (__IDVariableExp__),
	__FKreferredVariable__ Integer
) ;

CREATE TABLE TypeExp (
	__IDTypeExp__ Integer NOT NULL,
	FOREIGN KEY referredType (__FKreferredType__) REFERENCES Type (__IDType__),
	PRIMARY KEY TypeExp (__IDTypeExp__),
	__FKreferredType__ Integer
) ;

CREATE TABLE LoopExp (
	__IDLoopExp__ Integer NOT NULL,
	FOREIGN KEY body (__FKbody__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY LoopExp (__IDLoopExp__),
	__FKbody__ Integer
) ;

CREATE TABLE IteratorExp (
	__IDIteratorExp__ Integer NOT NULL,
	PRIMARY KEY IteratorExp (__IDIteratorExp__)
) ;

CREATE TABLE StringLiteralExp (
	__IDStringLiteralExp__ Integer NOT NULL,
	stringSymbol text,
	PRIMARY KEY StringLiteralExp (__IDStringLiteralExp__)
) ;

CREATE TABLE IntegerLiteralExp (
	__IDIntegerLiteralExp__ Integer NOT NULL,
	integerSymbol Integer,
	PRIMARY KEY IntegerLiteralExp (__IDIntegerLiteralExp__)
) ;

CREATE TABLE OperationCallExp (
	__IDOperationCallExp__ Integer NOT NULL,
	FOREIGN KEY referredOperation (__FKreferredOperation__) REFERENCES Operation (__IDOperation__),
	PRIMARY KEY OperationCallExp (__IDOperationCallExp__),
	__FKreferredOperation__ Integer
) ;

CREATE TABLE RealLiteralExp (
	__IDRealLiteralExp__ Integer NOT NULL,
	realSymbol text,
	PRIMARY KEY RealLiteralExp (__IDRealLiteralExp__)
) ;

CREATE TABLE LiteralExp (
	__IDLiteralExp__ Integer NOT NULL,
	PRIMARY KEY LiteralExp (__IDLiteralExp__)
) ;

CREATE TABLE IterateExp (
	__IDIterateExp__ Integer NOT NULL,
	FOREIGN KEY result (__FKresult__) REFERENCES Variable (__IDVariable__),
	PRIMARY KEY IterateExp (__IDIterateExp__),
	__FKresult__ Integer
) ;

CREATE TABLE PrimitiveLiteralExp (
	__IDPrimitiveLiteralExp__ Integer NOT NULL,
	PRIMARY KEY PrimitiveLiteralExp (__IDPrimitiveLiteralExp__)
) ;

CREATE TABLE NumericLiteralExp (
	__IDNumericLiteralExp__ Integer NOT NULL,
	PRIMARY KEY NumericLiteralExp (__IDNumericLiteralExp__)
) ;

CREATE TABLE CollectionLiteralExp (
	__IDCollectionLiteralExp__ Integer NOT NULL,
	kind text,
	PRIMARY KEY CollectionLiteralExp (__IDCollectionLiteralExp__)
) ;

CREATE TABLE CollectionLiteralPart (
	__IDCollectionLiteralPart__ Integer NOT NULL,
	FOREIGN KEY CollectionLiteralExp (__FKCollectionLiteralExp__) REFERENCES CollectionLiteralExp (__IDCollectionLiteralExp__),
	PRIMARY KEY CollectionLiteralPart (__IDCollectionLiteralPart__),
	__FKCollectionLiteralExp__ Integer
) ;

CREATE TABLE CollectionItem (
	__IDCollectionItem__ Integer NOT NULL,
	FOREIGN KEY item (__FKitem__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY CollectionItem (__IDCollectionItem__),
	__FKitem__ Integer
) ;

CREATE TABLE CollectionRange (
	__IDCollectionRange__ Integer NOT NULL,
	FOREIGN KEY first (__FKfirst__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY last (__FKlast__) REFERENCES OclExpression (__IDOclExpression__),
	PRIMARY KEY CollectionRange (__IDCollectionRange__),
	__FKfirst__ Integer,
	__FKlast__ Integer
) ;

CREATE TABLE TupleLiteralExp (
	__IDTupleLiteralExp__ Integer NOT NULL,
	PRIMARY KEY TupleLiteralExp (__IDTupleLiteralExp__)
) ;

CREATE TABLE NullLiteralExp (
	__IDNullLiteralExp__ Integer NOT NULL,
	PRIMARY KEY NullLiteralExp (__IDNullLiteralExp__)
) ;

CREATE TABLE ExpressionInOcl (
	__IDExpressionInOcl__ Integer NOT NULL,
	FOREIGN KEY bodyExpression (__FKbodyExpression__) REFERENCES OclExpression (__IDOclExpression__),
	FOREIGN KEY context (__FKcontext__) REFERENCES Variable (__IDVariable__),
	FOREIGN KEY resultVariable (__FKresultVariable__) REFERENCES Variable (__IDVariable__),
	FOREIGN KEY parameterVariable (__FKparameterVariable__) REFERENCES Variable (__IDVariable__),
	PRIMARY KEY ExpressionInOcl (__IDExpressionInOcl__),
	__FKbodyExpression__ Integer,
	__FKcontext__ Integer,
	__FKresultVariable__ Integer,
	__FKparameterVariable__ Integer
) ;

CREATE TABLE OpaqueExpression (
	__IDOpaqueExpression__ Integer NOT NULL,
	PRIMARY KEY OpaqueExpression (__IDOpaqueExpression__)
) ;

CREATE TABLE InvalidLiteralExp (
	__IDInvalidLiteralExp__ Integer NOT NULL,
	PRIMARY KEY InvalidLiteralExp (__IDInvalidLiteralExp__)
) ;

CREATE TABLE FeaturePropertyCall (
	__IDFeaturePropertyCall__ Integer NOT NULL,
	PRIMARY KEY FeaturePropertyCall (__IDFeaturePropertyCall__)
) ;

CREATE TABLE TupleLiteralPart (
	__IDTupleLiteralPart__ Integer NOT NULL,
	FOREIGN KEY TupleLiteralExp (__FKTupleLiteralExp__) REFERENCES TupleLiteralExp (__IDTupleLiteralExp__),
	FOREIGN KEY attribute (__FKattribute__) REFERENCES Property (__IDProperty__),
	PRIMARY KEY TupleLiteralPart (__IDTupleLiteralPart__),
	__FKTupleLiteralExp__ Integer,
	__FKattribute__ Integer
) ;

CREATE TABLE BagType (
	__IDBagType__ Integer NOT NULL,
	PRIMARY KEY BagType (__IDBagType__)
) ;

CREATE TABLE CollectionType (
	__IDCollectionType__ Integer NOT NULL,
	FOREIGN KEY elementType (__FKelementType__) REFERENCES Type (__IDType__),
	PRIMARY KEY CollectionType (__IDCollectionType__),
	__FKelementType__ Integer
) ;

CREATE TABLE EnumLiteralExp (
	__IDEnumLiteralExp__ Integer NOT NULL,
	FOREIGN KEY referredEnumLiteral (__FKreferredEnumLiteral__) REFERENCES EnumerationLiteral (__IDEnumerationLiteral__),
	PRIMARY KEY EnumLiteralExp (__IDEnumLiteralExp__),
	__FKreferredEnumLiteral__ Integer
) ;

CREATE TABLE InvalidType (
	__IDInvalidType__ Integer NOT NULL,
	PRIMARY KEY InvalidType (__IDInvalidType__)
) ;

CREATE TABLE OrderedSetType (
	__IDOrderedSetType__ Integer NOT NULL,
	PRIMARY KEY OrderedSetType (__IDOrderedSetType__)
) ;

CREATE TABLE SequenceType (
	__IDSequenceType__ Integer NOT NULL,
	PRIMARY KEY SequenceType (__IDSequenceType__)
) ;

CREATE TABLE SetType (
	__IDSetType__ Integer NOT NULL,
	PRIMARY KEY SetType (__IDSetType__)
) ;

CREATE TABLE TupleType (
	__IDTupleType__ Integer NOT NULL,
	PRIMARY KEY TupleType (__IDTupleType__)
) ;

CREATE TABLE VoidType (
	__IDVoidType__ Integer NOT NULL,
	PRIMARY KEY VoidType (__IDVoidType__)
) ;

CREATE TABLE AnyType (
	__IDAnyType__ Integer NOT NULL,
	PRIMARY KEY AnyType (__IDAnyType__)
) ;

CREATE TABLE ObjectTemplateExp_part_PropertyTemplateItem (
	__IDObjectTemplateExp__ Integer NOT NULL,
	__IDPropertyTemplateItem__ Integer NOT NULL
) ;

CREATE TABLE CollectionTemplateExp_part_OclExpression (
	__IDCollectionTemplateExp__ Integer NOT NULL,
	__IDOclExpression__ Integer NOT NULL
) ;

CREATE TABLE AssignExp_value_OclExpression (
	__IDAssignExp__ Integer NOT NULL,
	__IDOclExpression__ Integer NOT NULL
) ;

CREATE TABLE BlockExp_body_OclExpression (
	__IDBlockExp__ Integer NOT NULL,
	__IDOclExpression__ Integer NOT NULL
) ;

CREATE TABLE SwitchExp_alternativePart_AltExp (
	__IDSwitchExp__ Integer NOT NULL,
	__IDAltExp__ Integer NOT NULL
) ;

CREATE TABLE TryExp_exception_Type (
	__IDTryExp__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE TupleExp_element_OclExpression (
	__IDTupleExp__ Integer NOT NULL,
	__IDOclExpression__ Integer NOT NULL
) ;

CREATE TABLE InstantiationExp_argument_OclExpression (
	__IDInstantiationExp__ Integer NOT NULL,
	__IDOclExpression__ Integer NOT NULL
) ;

CREATE TABLE DictLiteralExp_part_DictLiteralPart (
	__IDDictLiteralExp__ Integer NOT NULL,
	__IDDictLiteralPart__ Integer NOT NULL
) ;

CREATE TABLE UnpackExp_variable_Variable (
	__IDUnpackExp__ Integer NOT NULL,
	__IDVariable__ Integer NOT NULL
) ;

CREATE TABLE AnonymousTupleType_elementType_Type (
	__IDAnonymousTupleType__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE AnonymousTupleLiteralExp_part_AnonymousTupleLiteralPart (
	__IDAnonymousTupleLiteralExp__ Integer NOT NULL,
	__IDAnonymousTupleLiteralPart__ Integer NOT NULL
) ;

CREATE TABLE AnonymousTupleLiteralPart_value_OclExpression (
	__IDAnonymousTupleLiteralPart__ Integer NOT NULL,
	__IDOclExpression__ Integer NOT NULL
) ;

CREATE TABLE Class_ownedAttribute_Property (
	__IDClass__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Class_ownedOperation_Operation (
	__IDClass__ Integer NOT NULL,
	__IDOperation__ Integer NOT NULL
) ;

CREATE TABLE Class_superClass_Class (
	__IDClass__ Integer NOT NULL,
	__IDClass__ Integer NOT NULL
) ;

CREATE TABLE Element_tag_Tag (
	__IDElement__ Integer NOT NULL,
	__IDTag__ Integer NOT NULL
) ;

CREATE TABLE Element_ownedComment_Comment (
	__IDElement__ Integer NOT NULL,
	__IDComment__ Integer NOT NULL
) ;

CREATE TABLE Tag_element_Element (
	__IDTag__ Integer NOT NULL,
	__IDElement__ Integer NOT NULL
) ;

CREATE TABLE Enumeration_ownedLiteral_EnumerationLiteral (
	__IDEnumeration__ Integer NOT NULL,
	__IDEnumerationLiteral__ Integer NOT NULL
) ;

CREATE TABLE Operation_ownedParameter_Parameter (
	__IDOperation__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;

CREATE TABLE Operation_raisedException_Type (
	__IDOperation__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE Package_ownedType_Type (
	__IDPackage__ Integer NOT NULL,
	__IDType__ Integer NOT NULL
) ;

CREATE TABLE Package_nestedPackage_Package (
	__IDPackage__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;

CREATE TABLE Comment_annotatedElement_NamedElement (
	__IDComment__ Integer NOT NULL,
	__IDNamedElement__ Integer NOT NULL
) ;

CREATE TABLE MappingBody_initSection_OclExpression (
	__IDMappingBody__ Integer NOT NULL,
	__IDOclExpression__ Integer NOT NULL
) ;

CREATE TABLE MappingBody_endSection_OclExpression (
	__IDMappingBody__ Integer NOT NULL,
	__IDOclExpression__ Integer NOT NULL
) ;

CREATE TABLE OperationalTransformation_intermediateClass_Class (
	__IDOperationalTransformation__ Integer NOT NULL,
	__IDClass__ Integer NOT NULL
) ;

CREATE TABLE OperationalTransformation_intermediateProperty_Property (
	__IDOperationalTransformation__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE OperationalTransformation_modelParameter_ModelParameter (
	__IDOperationalTransformation__ Integer NOT NULL,
	__IDModelParameter__ Integer NOT NULL
) ;

CREATE TABLE OperationalTransformation_relation_Relation (
	__IDOperationalTransformation__ Integer NOT NULL,
	__IDRelation__ Integer NOT NULL
) ;

CREATE TABLE MappingOperation_disjunct_MappingOperation (
	__IDMappingOperation__ Integer NOT NULL,
	__IDMappingOperation__ Integer NOT NULL
) ;

CREATE TABLE MappingOperation_merged_MappingOperation (
	__IDMappingOperation__ Integer NOT NULL,
	__IDMappingOperation__ Integer NOT NULL
) ;

CREATE TABLE MappingOperation_inherited_MappingOperation (
	__IDMappingOperation__ Integer NOT NULL,
	__IDMappingOperation__ Integer NOT NULL
) ;

CREATE TABLE MappingOperation_when_OclExpression (
	__IDMappingOperation__ Integer NOT NULL,
	__IDOclExpression__ Integer NOT NULL
) ;

CREATE TABLE ImperativeOperation_result_VarParameter (
	__IDImperativeOperation__ Integer NOT NULL,
	__IDVarParameter__ Integer NOT NULL
) ;

CREATE TABLE ModelType_metamodel_Package (
	__IDModelType__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;

CREATE TABLE ModelType_additionalCondition_OclExpression (
	__IDModelType__ Integer NOT NULL,
	__IDOclExpression__ Integer NOT NULL
) ;

CREATE TABLE Module_ownedTag_Tag (
	__IDModule__ Integer NOT NULL,
	__IDTag__ Integer NOT NULL
) ;

CREATE TABLE Module_configProperty_Property (
	__IDModule__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE Module_moduleImport_ModuleImport (
	__IDModule__ Integer NOT NULL,
	__IDModuleImport__ Integer NOT NULL
) ;

CREATE TABLE Module_usedModelType_ModelType (
	__IDModule__ Integer NOT NULL,
	__IDModelType__ Integer NOT NULL
) ;

CREATE TABLE ModuleImport_binding_ModelType (
	__IDModuleImport__ Integer NOT NULL,
	__IDModelType__ Integer NOT NULL
) ;

CREATE TABLE OperationBody_content_OclExpression (
	__IDOperationBody__ Integer NOT NULL,
	__IDOclExpression__ Integer NOT NULL
) ;

CREATE TABLE BottomPattern_assignment_Assignment (
	__IDBottomPattern__ Integer NOT NULL,
	__IDAssignment__ Integer NOT NULL
) ;

CREATE TABLE BottomPattern_realizedVariable_RealizedVariable (
	__IDBottomPattern__ Integer NOT NULL,
	__IDRealizedVariable__ Integer NOT NULL
) ;

CREATE TABLE BottomPattern_enforcementOperation_EnforcementOperation (
	__IDBottomPattern__ Integer NOT NULL,
	__IDEnforcementOperation__ Integer NOT NULL
) ;

CREATE TABLE Mapping_specification_Mapping (
	__IDMapping__ Integer NOT NULL,
	__IDMapping__ Integer NOT NULL
) ;

CREATE TABLE Mapping_local_Mapping (
	__IDMapping__ Integer NOT NULL,
	__IDMapping__ Integer NOT NULL
) ;

CREATE TABLE Transformation_ownedTag_Tag (
	__IDTransformation__ Integer NOT NULL,
	__IDTag__ Integer NOT NULL
) ;

CREATE TABLE Transformation_modelParameter_TypedModel (
	__IDTransformation__ Integer NOT NULL,
	__IDTypedModel__ Integer NOT NULL
) ;

CREATE TABLE Transformation_rule_Rule (
	__IDTransformation__ Integer NOT NULL,
	__IDRule__ Integer NOT NULL
) ;

CREATE TABLE TypedModel_usedPackage_Package (
	__IDTypedModel__ Integer NOT NULL,
	__IDPackage__ Integer NOT NULL
) ;

CREATE TABLE TypedModel_dependsOn_TypedModel (
	__IDTypedModel__ Integer NOT NULL,
	__IDTypedModel__ Integer NOT NULL
) ;

CREATE TABLE Rule_domain_Domain (
	__IDRule__ Integer NOT NULL,
	__IDDomain__ Integer NOT NULL
) ;

CREATE TABLE Pattern_predicate_Predicate (
	__IDPattern__ Integer NOT NULL,
	__IDPredicate__ Integer NOT NULL
) ;

CREATE TABLE Pattern_bindsTo_Variable (
	__IDPattern__ Integer NOT NULL,
	__IDVariable__ Integer NOT NULL
) ;

CREATE TABLE RelationalTransformation_ownedKey_Key (
	__IDRelationalTransformation__ Integer NOT NULL,
	__IDKey__ Integer NOT NULL
) ;

CREATE TABLE Relation_variable_Variable (
	__IDRelation__ Integer NOT NULL,
	__IDVariable__ Integer NOT NULL
) ;

CREATE TABLE Relation_operationalImpl_RelationImplementation (
	__IDRelation__ Integer NOT NULL,
	__IDRelationImplementation__ Integer NOT NULL
) ;

CREATE TABLE Key_part_Property (
	__IDKey__ Integer NOT NULL,
	__IDProperty__ Integer NOT NULL
) ;

CREATE TABLE LetExp_in_OclExpression (
	__IDLetExp__ Integer NOT NULL,
	__IDOclExpression__ Integer NOT NULL
) ;

CREATE TABLE LoopExp_iterator_Variable (
	__IDLoopExp__ Integer NOT NULL,
	__IDVariable__ Integer NOT NULL
) ;

CREATE TABLE OperationCallExp_argument_OclExpression (
	__IDOperationCallExp__ Integer NOT NULL,
	__IDOclExpression__ Integer NOT NULL
) ;

CREATE TABLE CollectionLiteralExp_part_CollectionLiteralPart (
	__IDCollectionLiteralExp__ Integer NOT NULL,
	__IDCollectionLiteralPart__ Integer NOT NULL
) ;

CREATE TABLE TupleLiteralExp_part_TupleLiteralPart (
	__IDTupleLiteralExp__ Integer NOT NULL,
	__IDTupleLiteralPart__ Integer NOT NULL
) ;
