module MetaH {

	type METAHFile {
		Entries_ContRef : METAHEntry*;
	};

	type METAHEntry;

	type Package : METAHEntry {
		PackName_Att : Text;
		Data_ContRef : Data*;
	};

	type PackageImplementation : METAHEntry {
		ImplementationName_Att : Text;
		Implements_Att : Text;
		Attributes_ContRef : Attribute*;
	};

	type Data {
		DataName_Att : Text;
	};

	type Attribute {
		AttName_Att : Text;
		AttValue_Att : Integer32;
		AttValueType_Att : Text;
		AttType_Att : Text;
	};

	type ProcessDeclaration : METAHEntry {
		ProcDecName_Att : Text;
		Ports_ContRef : Port*;
	};

	type ProcessImplementation : METAHEntry {
		ProcImpName_Att : Text;
		Declaration_Att : Text;
		ProcessAttributes_ContRef : ProcessAttribute*;
	};

	type ProcessAttribute {
		AttName_Att : Text;
		AttValue_Att : Integer32;
		AttValueType_Att : Text;
	};

	type Process {
		ProcName_Att : Text;
		Periodic_Att : Text;
		Declaration_Att : Text;
		Implementation_Att : Text;
	};

	type Port {
		PortName_Att : Text;
		PortCom_Att : Text;
		PortPackage_Att : Text;
		PortType_Att : Text;
	};

	type Connection : METAHEntry {
		CompSrc_Att : Text;
		PortSrc_Att : Text;
		CompDest_Att : Text;
		PortDest_Att : Text;
	};

	type MacroDeclaration : METAHEntry {
		Name_Att : Text;
		Ports_ContRef : Port*;
	};

	type MacroImplementation : METAHEntry {
		MacroImpName_Att : Text;
		Declaration_Att : Text;
		Process_ContRef : Process*;
		Connections_ContRef : Connection*;
	};
}