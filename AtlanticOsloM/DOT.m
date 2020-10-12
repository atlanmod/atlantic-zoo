module DOT {

	type Label {
		Element_Ref : GraphElement;
	};

	type SimpleLabel : Label {
		Content_Att : Text;
	};

	type ComplexLabel : Label {
		Compartments_ContRef : Compartment+;
	};

	type Compartment {
		ComplexLabel_Ref : ComplexLabel;
		Compartments_ContRef : Compartment?;
		Anchor_Ref : Anchor?;
	};

	type VerticalCompartment : Compartment;

	type HorizontalCompartment : Compartment;

	type SimpleCompartment : Compartment {
		Content_Att : Text;
	};

	type Anchor {
		Name_Att : Text;
		Source_Ref : Compartment?;
	};

	type GraphElement {
		Name_Att : Text;
		Label_ContRef : Label?;
		Style_Att : Text;
		Color_Att : Text;
	};

	type Graph : GraphElement {
		Type_Att : Text;
		RankDir_Att : Text;
		Labeljust_Att : Text;
		Labelloc_Att : Text;
		Concentrate_Att : Logical;
		Nodes_ContRef : Nodelike*;
		BoundingBox_Att : Text;
		Compound_Att : Logical;
		Layers_ContRef : Layer*;
		NodeSeparation_Att : Double;
		Ordering_Att : Text;
		Size_Att : Text;
		Ratio_Att : Text;
		Center_Att : Logical;
	};

	type Layer : GraphElement {
		Nodes_Ref : Nodelike*;
		Arcs_Ref : Arc*;
		Graph_Ref : Graph;
		LayerSeparator_Att : Text;
	};

	type Nodelike : GraphElement {
		Owner_Ref : SubGraph?;
		Refers_Ref : Arc*;
		ReferredBy_Ref : Arc*;
		Graph_Ref : Graph?;
		Layers_Ref : Layer*;
	};

	type SubGraph : Nodelike {
		Nodes_ContRef : Nodelike*;
		Labelloc_Att : Text;
	};

	type Node : Nodelike {
		FixedSize_Att : Logical;
		Fontname_Att : Text;
		Fontsize_Att : Integer32;
		Height_Att : Integer32;
		Width_Att : Integer32;
		Shape_ContRef : NodeShape?;
	};

	type Arc : GraphElement {
		FromNode_Ref : Nodelike;
		ToNode_Ref : Nodelike;
		Layers_Ref : Layer*;
		Constraint_Att : Logical;
		Group_Att : Text;
		Minlen_Att : Integer32;
		SameHead_Att : Text;
		SameTail_Att : Text;
		Lhead_Ref : Nodelike?;
		Ltail_Ref : Nodelike?;
		Decorate_Att : Logical;
	};

	type DirectedArc : Arc {
		ArrowHead_ContRef : ArrowShape?;
		Headlabel_Ref : Label?;
		Taillabel_Ref : Label?;
		ArrowTail_ContRef : ArrowShape?;
		Tail_lp_Att : Double;
		Head_lp_Att : Double;
	};

	type UndirectedArc : Arc;

	type Shape : GraphElement {
		Width_Att : Integer32;
		Height_Att : Integer32;
		Peripheries_Att : Integer32;
	};

	type NodeShape : Shape;

	type SimpleNodeShape : NodeShape;

	type PointNodeShape : NodeShape;

	type ComplexNodeShape : NodeShape;

	type PolygonNodeShape : ComplexNodeShape {
		Sides_Att : Integer32;
		Skew_Att : Integer32;
		Distortion_Att : Integer32;
		IsRegular_Att : Logical;
		Orientation_Att : Integer32;
	};

	type MNodeShape : ComplexNodeShape {
		Toplabel_ContRef : Label?;
		Bottomlabel_ContRef : Label?;
	};

	type RecordNodeShape : ComplexNodeShape;

	type ArrowShape : Shape {
		Clipping_Att : Text;
		IsPlain_Att : Logical;
		Size_Att : Integer32;
	};
}