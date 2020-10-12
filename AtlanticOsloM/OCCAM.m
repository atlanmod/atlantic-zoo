module OCCAM {

	type OCCAM_Program {
		Occam_Elements_ContRef : OCCAM_Element*;
		Files_ContRef : File*;
	};

	type OCCAM_Element {
		Name_Att : Text;
	};

	type Process : OCCAM_Element {
		Declaration_ContRef : Declaration;
		Constructors_ContRef : Constructor*;
		Parameters_Ref : DataType*;
		Libraries_Ref : Library*;
		ToChannel_Ref : Channel;
	};

	type Channel {
		Name_Att : Text;
		Type_Att : Text;
		ToServer_Ref : Server;
		ToProcess_Ref : Process;
	};

	type Action : OCCAM_Element {
		Constructor_Ref : Constructor;
		While_Ref : While;
		If_Ref : If;
	};

	type Assignment : Action;

	type Input : Action;

	type Output : Action;

	type Constructor : OCCAM_Element {
		Process_Ref : Process;
		Actions_ContRef : Action*;
		Buckels_ContRef : Buckel*;
		Childrens_ContRef : Constructor*;
	};

	type Buckel {
		Constructor_Ref : Constructor;
	};

	type If : Buckel {
		Conditions_ContRef : Condition*;
		Actions_ContRef : Action*;
	};

	type While : Buckel {
		Conditions_ContRef : Condition*;
		Actions_ContRef : Action*;
	};

	type Condition {
		ElementRight_Att : Text;
		ElementLeft_Att : Text;
		TypeCondition_Att : Text;
		If_Ref : If;
		While_Ref : While;
	};

	type Sequential : Constructor;

	type Parallel : Constructor;

	type Alternative : Constructor;

	type DataType : OCCAM_Element {
		DataType_Att : Text;
	};

	type Library {
		Name_Att : Text;
	};

	type File {
		Name_Att : Text;
	};

	type Server {
		Name_Att : Text;
		ToChannel_Ref : Channel;
	};

	type Declaration {
		Name_Att : Text;
		Process_Ref : Process;
		Elements_ContRef : DataType*;
	};
}