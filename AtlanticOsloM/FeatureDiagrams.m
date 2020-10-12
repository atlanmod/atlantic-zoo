module FeatureDiagrams {

	type Node {
		Description_Att : Text;
		Preliminary_Att : Logical;
		Object_Att : Text;
		Attributes_ContRef : Attribute*;
		No_dst_Ref : ORGroup*;
		Nx_dst_Ref : XORGroup*;
		Cn_dst_Ref : Child*;
	};

	type Attribute {
		Description_Att : Text;
		Editable_Att : Logical;
		Key_Att : Logical;
		Value_Att : Text;
		Name_Att : Text;
		Node_Ref : Node;
	};

	type Root : Node;

	type Child : Node {
		Cn_src_Ref : Node*;
		Cx_src_Ref : XORGroup*;
		Co_src_Ref : ORGroup*;
	};

	type XORGroup {
		Preliminary_Att : Logical;
		Name_Att : Text;
		Nx_src_Ref : Node*;
		Cx_dst_Ref : Child*;
	};

	type ORGroup {
		Preliminary_Att : Logical;
		Name_Att : Text;
		No_src_Ref : Node*;
		Co_dst_Ref : Child*;
	};
}