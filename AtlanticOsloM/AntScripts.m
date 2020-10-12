module AntScripts {

	type NamedElement {
		Name_Att : Text;
	};

	type DescribableElement {
		Description_Att : Text;
	};

	type CommentableElement {
		Comment_Att : Text;
	};

	type Project : NamedElement, DescribableElement, CommentableElement {
		Properties_ContRef : Property*;
		Targets_ContRef : Target*;
		DefaultTarget_Ref : Target?;
	};

	type Property {
		Name_Att : Text;
		Value_Att : Text;
		Location_Att : Text;
		Refid_Att : Text;
		Resource_Att : Text;
		File_Att : Text;
		Url_Att : Text;
		Environment_Att : Text;
		Classpath_Att : Text;
		Classpathref_Att : Text;
		Prefix_Att : Text;
	};

	type Target : NamedElement, DescribableElement, CommentableElement {
		If_Att : Text;
		Unless_Att : Text;
		Tasks_ContRef : Task*;
		Depends_Ref : Target*;
	};

	type TaskElement : NamedElement, CommentableElement {
		Attributes_ContRef : Attribute*;
		Elements_ContRef : TaskElement*;
	};

	type Attribute : NamedElement {
		Value_Att : Text;
	};

	type Task : TaskElement;

	type TaskParameter : TaskElement;
}