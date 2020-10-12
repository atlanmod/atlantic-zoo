module SCADE {

	type ListString {
		Value_Att : Text;
	};

	type ListInteger {
		Value_Att : Integer32;
	};

	type Model : Object, MtcEntity {
		Library_Att : Logical;
		Pathname_Att : Text;
		Descriptor_Ref : Descriptor?;
		Project_Ref : Project?;
		FileRef_Ref : FileRef?;
		StorageUnitM_ContRef : StorageUnit*;
		EnumsBlock_ContRef : ConstBlock;
		ImportedOperator_Ref : Operator*;
		Client_Ref : Model*;
		Libraries_Ref : Model*;
		AllLibry_Ref : Model*;
		TypeM_ContRef : Type*;
		Model_Ref : Model;
		CoverageFileM_Ref : CoverageFile;
		CriterionFileM_Ref : CriterionFile;
		Root_ContRef : Instance;
		All_ContRef : Operator*;
		Application_Ref : MtcApplication;
		Reference_ContRef : Reference*;
		TmpNode_ContRef : Node*;
		ConstBlockK_ContRef : ConstBlock?;
		Node_ContRef : Node?;
		VarBlockK_ContRef : VarBlock?;
		TypeBlock_ContRef : TypeBlock?;
		Refinement_ContRef : NamedType?;
		Implementation_ContRef : Implementation?;
		Constant_Ref : Constant?;
		AllConstant_Ref : Constant?;
		Allvariable_Ref : GlobalVariable?;
		Variable_Ref : GlobalVariable?;
		AllConstVar_Ref : ConstVar?;
		ConstVar_Ref : ConstVar?;
		ConstBlock_ContRef : ConstBlock?;
		VarBlock_ContRef : VarBlock?;
		AllNamedType_ContRef : NamedType?;
		NamedType_ContRef : NamedType?;
	};

	type Implementation : Object {
		Key_Ref : Model;
		NamedTypeI_Ref : NamedType+;
	};

	type ConstBlock : ModelBlock {
		ModelC_Ref : Model;
		KeyC_Ref : Model;
		Key_Ref : Model;
		Constant_ContRef : Constant?;
	};

	type VarBlock : ModelBlock {
		Variable_ContRef : GlobalVariable?;
		KeyVB_Ref : Model;
		Key_Ref : Model;
	};

	type GlobalVariable : Variable {
		Key_Ref : VarBlock?;
	};

	type TypeBlock : ModelBlock {
		Type_ContRef : NamedType?;
		Key_Ref : Model;
	};

	type Session {
		Descriptor_Ref : Descriptor;
		Model_Ref : Model?;
		LoadsModel_Ref : Model*;
		DefinedIn_Att : Text;
		Loader_ContRef : Loader;
	};

	type Descriptor : Object {
		ModelFileName_Att : Text;
		SernFileName_Att : Text;
		SernPersistAs_Att : Text;
		RnetFileName_Att : Text;
		RnetPersistAs_Att : Text;
		OccBase_Att : Integer32;
		Size_Att : Integer32;
		NameVerify_Att : Logical;
		Checked_Att : Logical;
		LibraryModels_Ref : ListString*;
		AnnTypeFiles_Ref : ListString*;
		ModelD_Ref : Model;
	};

	type StorageUnit : Object {
		SaoFileName_Att : Text;
		AnnFileName_Att : Text;
		PersistAs_Att : Text;
		Loaded_Att : Logical;
		SaoModified_Att : Logical;
		AnnModified_Att : Logical;
		FileRef_Ref : FileRef;
		ModelS_Ref : Model;
		Element_Ref : StorageElement*;
	};

	type StorageElement : Annotable {
		StorageUnitE_Ref : StorageUnit;
	};

	type Object {
		Name_Att : Text;
		RunLine_Att : Integer32;
	};

	type Block : StorageElement {
		ZoomCoeff_Att : Integer32;
		Fromat_Att : Text;
		Lanscape_Att : Logical;
		DefaultPageFormat_Att : Logical;
	};

	type NodeBlock : Block {
		Node_Ref : Node;
	};

	type ModelBlock : Block {
		ColumnsSize_ContRef : ListInteger*;
		Model_Ref : Model;
	};

	type Expression : Object {
		Label_ContRef : Label?;
		ExprContactE_Ref : ExprContact;
		ExprCallE_Ref : ExprCall?;
		Dependance_Ref : ConstVar?;
		SubExprId_Ref : ExprId*;
		ParamArray_Ref : ParamArray?;
		Constant_Ref : Constant?;
		EquationE_Ref : Equation?;
		AssertionE_Ref : Assertion?;
	};

	type Label : Object {
		Expression_Ref : Expression;
	};

	type ExprNull : Expression;

	type ConstValue : Expression {
		Value_Att : Text;
		Kind_Ref : Object;
	};

	type ExprContact : Expression {
		BoolAct_ContRef : ExprId;
		InitValue_ContRef : Expression*;
		CalledOpr_ContRef : ExprCall;
	};

	type ExprCall : Expression {
		NumOcc_Att : Integer32;
		PredefOpr_Att : Integer32;
		Parameter_ContRef : Expression*;
		ExprContactEC_Ref : ExprContact;
		Operator_Ref : Operator?;
	};

	type Operator : StorageElement, MtcEntity {
		Category_Att : Text;
		Conversion_Att : Logical;
		State_Att : Logical;
		Index_Att : Integer32;
		Variable_Ref : LocalVariable?;
		Input_ContRef : LocalVariable*;
		Output_ContRef : LocalVariable*;
		Hidden_ContRef : LocalVariable*;
		Client_Ref : EqBlock*;
		ModelO_Ref : Model;
		ModelOp_Ref : Model;
		CriterionO_Ref : Criterion?;
		IntanceO_Ref : Instance*;
		Operator_Ref : Operator;
	};

	type ExprId : Expression {
		ExprContactEI_Ref : ExprContact;
		Reference_Ref : ConstVar;
	};

	type LocalVariable : Variable {
		Optional_Att : Logical;
		Const_Att : Logical;
		Probe_Att : Logical;
		Pure_Att : Logical;
		InitValue_Att : Text;
		OperatorI_Ref : Operator?;
		OperatorO_Ref : Operator?;
		OperatorH_Ref : Operator?;
		NodeL_Ref : Node?;
		NodeI_Ref : Node?;
	};

	type Node : Operator {
		NodeKind_Ref : Object;
		EqBlock_ContRef : EqBlock?;
		ParamBlock_ContRef : ParamBlock?;
		Local_ContRef : LocalVariable*;
		Internal_ContRef : LocalVariable*;
		Key_Ref : Model;
		StateMachine_Ref : StateMachine?;
		ModelN_Ref : Model;
	};

	type ParamBlock : NodeBlock {
		Key_Ref : Node;
		ColumnsSize_ContRef : ListInteger*;
		Array_ContRef : ParamArray+;
	};

	type ParamArray : Annotable {
		Notes_ContRef : ListString*;
		ParamBlock_Ref : ParamBlock;
		Operator_Ref : Operator;
		Value_ContRef : Expression*;
	};

	type ConstVar : Annotable {
		Kind_Ref : Object;
		Type_Ref : Type;
		Client_Ref : EqBlock*;
	};

	type Constant : ConstVar {
		Imported_Att : Logical;
		Value_ContRef : Expression?;
		Enumeration_Ref : Enumeration?;
		Key_Ref : ConstBlock?;
	};

	type Variable : ConstVar {
		Clock_Ref : Variable?;
		Definition_Ref : Equation*;
	};

	type Type : Annotable {
		UsedType_Ref : Type*;
		Model_Ref : Model;
		NamedTypeT_Ref : NamedType*;
		TableT_Ref : Table*;
		CompositeElementT_Ref : CompositeElement*;
		ConstVar_Ref : ConstVar*;
	};

	type Table : Type {
		Size_Att : Integer32;
		TypeT_Ref : Type?;
	};

	type NamedType : Type {
		Kind_Ref : Object;
		Refinement_Ref : NamedType*;
		Refined_Ref : NamedType*;
		To_Ref : Operator?;
		From_Ref : Operator?;
		Implementation_Ref : Implementation?;
		Definition_Ref : Type?;
		KeyM_Ref : Model;
		Key_Ref : TypeBlock;
	};

	type Enumeration : Type {
		Value_ContRef : Constant+;
	};

	type Composite : Type {
		Element_ContRef : CompositeElement?;
	};

	type CompositeElement : Object {
		TypeC_Ref : Type?;
		Key_Ref : Composite;
	};

	type Structure : Composite;

	type Tuple : Composite;

	type EqBlock : NodeBlock {
		Equation_ContRef : Equation+;
		Assertion_ContRef : Assertion?;
		Key_Ref : Node;
		CalledOperator_Ref : Operator*;
		ReferencedId_Ref : ConstVar*;
	};

	type Equation : Annotable {
		Rotation_Att : Integer32;
		Symetrical_Att : Logical;
		Terminator_Att : Logical;
		EqBlock_Ref : EqBlock;
		Left_Ref : Variable*;
		Right_ContRef : Expression?;
		OutEdge_ContRef : Edge*;
		Position_ContRef : RPoint?;
		Size_ContRef : RSize?;
	};

	type Assertion : Annotable {
		Key_Ref : EqBlock?;
		Expression_ContRef : Expression;
		Edge_Ref : Edge?;
		Position_ContRef : RPoint?;
	};

	type Annotable : Object {
		PropA_ContRef : Prop*;
		DefinedIn_Att : Text;
	};

	type Prop {
		Name_Att : Text;
		Values_ContRef : ListString*;
		Entity_Ref : Annotable;
		ConfigurationP_Ref : Configuration?;
	};

	type Configuration {
		Name_Att : Text;
		PropC_ContRef : Prop*;
		ProjectC_ContRef : Project;
	};

	type Project : Annotable {
		Pathname_Att : Text;
		Configuration_ContRef : Configuration*;
		FileRef_Ref : FileRef*;
		Owner_ContRef : Element*;
	};

	type Element : MtcEntity {
		Name_Att : Text;
		Derived_Att : Logical;
		Ident_Att : Text;
		Description_Att : Text;
		Root_Ref : Project?;
		Folder_Ref : Folder?;
		CriterionE_Ref : Criterion;
	};

	type FileRef : Element {
		Pathname_Att : Text;
		PersistAs_Att : Text;
		DefinedIn_Att : Text;
	};

	type Folder : Element {
		Extensions_Att : Text;
		Element_ContRef : Element*;
	};

	type Reference;

	type TypeReference : Reference;

	type OperatorReference : Reference;

	type VariableReference : Reference;

	type Error;

	type Edge : Object {
		LeftVarIndex_Att : Integer32;
		LabelOrientation_Att : Integer32;
		LeftVar_Ref : Variable;
		RightExpression_Ref : ExprId;
		SrcEquation_Ref : Equation;
		Assertion_ContRef : Assertion?;
		Position_ContRef : RPoint*;
		DstEquation_Ref : Equation;
	};

	type RPoint;

	type RSize;

	type Entity {
		DefinedIn_Att : Text;
	};

	type StateObj : Entity;

	type GraphicalObject : StateObj;

	type StInputOutput : GraphicalObject {
		Name_Att : Text;
		Type_Att : Text;
		Clock_Att : Logical;
		Const_Att : Logical;
		Optional_Att : Logical;
	};

	type StInitInput : StInputOutput;

	type StInput : StInputOutput;

	type StOutput : StInputOutput;

	type Transition : GraphicalObject {
		Conditions_Att : Text;
		TransKind_Att : Integer32;
		State1_Ref : State;
		State2_Ref : State;
	};

	type State : GraphicalObject {
		Name_Att : Text;
		Cx_Att : Double;
		Cy_Att : Double;
		Transition1_Ref : Transition*;
		Transition2_Ref : Transition*;
		StOutput_Ref : StOutput;
	};

	type InitialStPtr : GraphicalObject {
		Cx_Att : Double;
		Cy_Att : Double;
		State_Ref : State;
	};

	type StateMachine : Object {
		InitialStPtr_Ref : InitialStPtr;
		State_Ref : State*;
		Transition_Ref : Transition*;
	};

	type Base {
		DefineIn_Att : Text;
	};

	type StateBase : Base;

	type AnnNote {
		Name_Att : Text;
		Modified_Att : Logical;
		AnnNoteType_Ref : AnnNoteType;
		Annotable_Ref : Annotable;
		AnnAttValue_ContRef : AnnAttValue+;
	};

	type AnnAttValue {
		AnnNote_Ref : AnnNote;
		AnnAttDefinition_Ref : AnnAttDefinition;
	};

	type AnnNoteType {
		Name_Att : Text;
		AnnAttDefinition_ContRef : AnnAttDefinition?;
		AnnAttGroup_ContRef : AnnAttGroup?;
		Key_Ref : AnnotSchema;
	};

	type AnnAttDefinition {
		Name_Att : Text;
		Type_Att : Integer32;
		AnnAttGroup_Ref : AnnAttGroup;
		Key_Ref : AnnNoteType;
		AnnProperty_ContRef : AnnProperty?;
	};

	type AnnAttIntValue : AnnAttValue {
		Value_Att : Integer32;
	};

	type AnnAttBoolValue : AnnAttValue {
		Value_Att : Logical;
	};

	type AnnAttCharValue : AnnAttValue {
		Value_Att : Logical;
	};

	type AnnAttRealValue : AnnAttValue {
		Value_Att : Double;
	};

	type AnnAttStringValue : AnnAttValue {
		Value_Att : Text;
	};

	type AnnAttFileValue : AnnAttStringValue;

	type AnnAttDateValue : AnnAttStringValue;

	type AnnAttOidValue : AnnAttStringValue;

	type AnnAttEnumValue : AnnAttStringValue;

	type AnnProperty {
		Name_Att : Text;
		Type_Att : Integer32;
		Key_Ref : AnnAttDefinition;
	};

	type AnnPropertyInt : AnnProperty {
		Value_Att : Integer32;
	};

	type AnnPropertyBool : AnnProperty {
		Value_Att : Logical;
	};

	type AnnPropertyChar : AnnProperty {
		Value_Att : Logical;
	};

	type AnnPropertyReal : AnnProperty {
		Value_Att : Double;
	};

	type AnnPropertyString : AnnProperty {
		Value_Att : Text;
	};

	type AnnPropertyEnum : AnnProperty {
		Value_Ref : Object;
	};

	type AnnotSchema {
		Pathname_Att : Text;
		AnnNoteType_ContRef : AnnNoteType;
		AnnCategory_ContRef : AnnCategory;
	};

	type AnnCategory {
		Name_Att : Text;
		Key_Ref : AnnotSchema;
		Anootability_ContRef : Annotability*;
	};

	type Annotability {
		MinCardinality_Att : Integer32;
		MaxCardinality_Att : Integer32;
		DefaultNote_Att : Logical;
		AnnNoteType_Ref : AnnNoteType;
	};

	type AnnAttGroup {
		Name_Att : Text;
		Key_Ref : AnnNoteType;
	};

	type File : MtcEntity;

	type MtcApplication {
		CoverageFileCov_ContRef : CoverageFile*;
		CriterionFileCri_ContRef : CriterionFile*;
		ModelM_ContRef : Model;
	};

	type CoverageFile : File {
		Record_ContRef : Record?;
		ModelCov_ContRef : Model;
		Application_Ref : MtcApplication;
		RecordCov_ContRef : Record?;
	};

	type CriterionFile : File {
		Application_Ref : MtcApplication;
		ModelCri_ContRef : Model;
		CriterionC_ContRef : Criterion*;
	};

	type MtcEntity {
		File_Ref : File?;
	};

	type HistoryEntry : MtcEntity;

	type Criterion : MtcEntity {
		Ident_Att : Text;
		Name_Att : Text;
		Description_Att : Text;
		CriterionFileC_Ref : CriterionFile;
		OperatorC_Ref : Operator;
		Element_ContRef : Element*;
	};

	type Instance : MtcEntity {
		Index_Att : Integer32;
		Occ_Att : Text;
		ModelI_Ref : Model;
		OperatorI_Ref : Operator;
		AssociationClassI_Ref : AssociationClass;
		Caller_Ref : Instance;
		Called_ContRef : Instance*;
		Origin_Ref : Instance?;
		Related_Ref : Instance*;
	};

	type AssociationClass {
		ResultA_Ref : Result;
		RecordA_Ref : Record*;
		InstanceA_Ref : Instance*;
	};

	type Result : MtcEntity {
		ElementCount_Att : Integer32;
		AssociationClassRs_Ref : AssociationClass;
		Record_Ref : Record;
	};

	type Record : MtcEntity {
		Creator_Att : Text;
		Name_Att : Text;
		Date_Att : Text;
		Author_Att : Text;
		Description_Att : Text;
		Key_Ref : CoverageFile;
		AssociationClassRc_Ref : AssociationClass;
		CoverageFileR_Ref : CoverageFile;
		Result_ContRef : Result*;
	};

	type Loader {
		Descriptor_ContRef : Descriptor?;
		Session_Ref : Session;
	};
}