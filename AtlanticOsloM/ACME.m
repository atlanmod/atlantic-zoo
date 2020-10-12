module ACME {

	type ACMEFile {
		Entries_ContRef : ACMEEntry*;
	};

	type ACMEEntry;

	type Element {
		Name_Att : Text;
		Representations_ContRef : Representation*;
		Property_ContRef : Property*;
	};

	type Type : Element;

	type System : Element, ACMEEntry {
		ComponentDeclaration_ContRef : ComponentInstance*;
		ConnectorDeclaration_ContRef : Connector*;
		Attachments_ContRef : Link*;
		Bindings_ContRef : Link*;
	};

	type Representation {
		Systems_ContRef : System*;
	};

	type Component : Element {
		Ports_ContRef : Port*;
	};

	type ComponentInstance : Component {
		InstanceOf_Att : Text;
	};

	type ComponentType : Component, ACMEEntry {
		Extend_Att : Text;
	};

	type Port : Element;

	type Connector : Element {
		Roles_ContRef : Role*;
		System_Ref : System;
	};

	type Role : Element;

	type Property {
		Name_Att : Text;
		Val_Att : Text;
	};

	type Link {
		SystemBinding_Ref : System;
		SystemAttachment_Ref : System;
	};

	type Attachment : Link {
		Comp_Att : Text;
		Port_Att : Text;
		Con_Att : Text;
		Role_Att : Text;
	};

	type Binding : Link {
		CompSrc_Att : Text;
		PortSrc_Att : Text;
		CompDest_Att : Text;
		PortDest_Att : Text;
	};
}