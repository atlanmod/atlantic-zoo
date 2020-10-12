CREATE TABLE "Label" (
	__IDLabel__ Integer NOT NULL,
	FOREIGN KEY element (__FKelement__) REFERENCES GraphElement (__IDGraphElement__),
	PRIMARY KEY "Label" (__IDLabel__),
	__FKelement__ Integer
) ;

CREATE TABLE SimpleLabel (
	__IDSimpleLabel__ Integer NOT NULL,
	content text,
	PRIMARY KEY SimpleLabel (__IDSimpleLabel__)
) ;

CREATE TABLE ComplexLabel (
	__IDComplexLabel__ Integer NOT NULL,
	PRIMARY KEY ComplexLabel (__IDComplexLabel__)
) ;

CREATE TABLE Compartment (
	__IDCompartment__ Integer NOT NULL,
	FOREIGN KEY complexLabel (__FKcomplexLabel__) REFERENCES ComplexLabel (__IDComplexLabel__),
	FOREIGN KEY compartments (__FKcompartments__) REFERENCES Compartment (__IDCompartment__),
	FOREIGN KEY anchor (__FKanchor__) REFERENCES Anchor (__IDAnchor__),
	PRIMARY KEY Compartment (__IDCompartment__),
	__FKcompartments__ Integer,
	__FKcomplexLabel__ Integer,
	__FKanchor__ Integer
) ;

CREATE TABLE VerticalCompartment (
	__IDVerticalCompartment__ Integer NOT NULL,
	PRIMARY KEY VerticalCompartment (__IDVerticalCompartment__)
) ;

CREATE TABLE HorizontalCompartment (
	__IDHorizontalCompartment__ Integer NOT NULL,
	PRIMARY KEY HorizontalCompartment (__IDHorizontalCompartment__)
) ;

CREATE TABLE SimpleCompartment (
	__IDSimpleCompartment__ Integer NOT NULL,
	content text,
	PRIMARY KEY SimpleCompartment (__IDSimpleCompartment__)
) ;

CREATE TABLE Anchor (
	__IDAnchor__ Integer NOT NULL,
	name text,
	FOREIGN KEY source (__FKsource__) REFERENCES Compartment (__IDCompartment__),
	PRIMARY KEY Anchor (__IDAnchor__),
	__FKsource__ Integer
) ;

CREATE TABLE GraphElement (
	__IDGraphElement__ Integer NOT NULL,
	name text,
	FOREIGN KEY "label" (__FKlabel__) REFERENCES "Label" (__IDLabel__),
	style text,
	color text,
	PRIMARY KEY GraphElement (__IDGraphElement__),
	__FKlabel__ Integer
) ;

CREATE TABLE Graph (
	__IDGraph__ Integer NOT NULL,
	type text,
	rankDir text,
	labeljust text,
	labelloc text,
	concentrate Boolean,
	boundingBox text,
	compound Boolean,
	nodeSeparation "Double",
	ordering text,
	size text,
	ratio text,
	center Boolean,
	PRIMARY KEY Graph (__IDGraph__)
) ;

CREATE TABLE Layer (
	__IDLayer__ Integer NOT NULL,
	FOREIGN KEY graph (__FKgraph__) REFERENCES Graph (__IDGraph__),
	layerSeparator text,
	PRIMARY KEY Layer (__IDLayer__),
	__FKgraph__ Integer
) ;

CREATE TABLE Nodelike (
	__IDNodelike__ Integer NOT NULL,
	FOREIGN KEY owner (__FKowner__) REFERENCES SubGraph (__IDSubGraph__),
	FOREIGN KEY graph (__FKgraph__) REFERENCES Graph (__IDGraph__),
	PRIMARY KEY Nodelike (__IDNodelike__),
	__FKowner__ Integer,
	__FKgraph__ Integer
) ;

CREATE TABLE SubGraph (
	__IDSubGraph__ Integer NOT NULL,
	labelloc text,
	PRIMARY KEY SubGraph (__IDSubGraph__)
) ;

CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	fixedSize Boolean,
	fontname text,
	fontsize Integer,
	height Integer,
	width Integer,
	FOREIGN KEY shape (__FKshape__) REFERENCES NodeShape (__IDNodeShape__),
	PRIMARY KEY Node (__IDNode__),
	__FKshape__ Integer
) ;

CREATE TABLE Arc (
	__IDArc__ Integer NOT NULL,
	FOREIGN KEY fromNode (__FKfromNode__) REFERENCES Nodelike (__IDNodelike__),
	FOREIGN KEY toNode (__FKtoNode__) REFERENCES Nodelike (__IDNodelike__),
	"constraint" Boolean,
	"group" text,
	minlen Integer,
	sameHead text,
	sameTail text,
	FOREIGN KEY lhead (__FKlhead__) REFERENCES Nodelike (__IDNodelike__),
	FOREIGN KEY ltail (__FKltail__) REFERENCES Nodelike (__IDNodelike__),
	decorate Boolean,
	PRIMARY KEY Arc (__IDArc__),
	__FKlhead__ Integer,
	__FKfromNode__ Integer,
	__FKltail__ Integer,
	__FKtoNode__ Integer
) ;

CREATE TABLE DirectedArc (
	__IDDirectedArc__ Integer NOT NULL,
	FOREIGN KEY arrowHead (__FKarrowHead__) REFERENCES ArrowShape (__IDArrowShape__),
	FOREIGN KEY headlabel (__FKheadlabel__) REFERENCES "Label" (__IDLabel__),
	FOREIGN KEY taillabel (__FKtaillabel__) REFERENCES "Label" (__IDLabel__),
	FOREIGN KEY arrowTail (__FKarrowTail__) REFERENCES ArrowShape (__IDArrowShape__),
	tail_lp "Double",
	head_lp "Double",
	PRIMARY KEY DirectedArc (__IDDirectedArc__),
	__FKheadlabel__ Integer,
	__FKtaillabel__ Integer,
	__FKarrowTail__ Integer,
	__FKarrowHead__ Integer
) ;

CREATE TABLE UndirectedArc (
	__IDUndirectedArc__ Integer NOT NULL,
	PRIMARY KEY UndirectedArc (__IDUndirectedArc__)
) ;

CREATE TABLE Shape (
	__IDShape__ Integer NOT NULL,
	width Integer,
	height Integer,
	peripheries Integer,
	PRIMARY KEY Shape (__IDShape__)
) ;

CREATE TABLE NodeShape (
	__IDNodeShape__ Integer NOT NULL,
	PRIMARY KEY NodeShape (__IDNodeShape__)
) ;

CREATE TABLE SimpleNodeShape (
	__IDSimpleNodeShape__ Integer NOT NULL,
	PRIMARY KEY SimpleNodeShape (__IDSimpleNodeShape__)
) ;

CREATE TABLE PointNodeShape (
	__IDPointNodeShape__ Integer NOT NULL,
	PRIMARY KEY PointNodeShape (__IDPointNodeShape__)
) ;

CREATE TABLE ComplexNodeShape (
	__IDComplexNodeShape__ Integer NOT NULL,
	PRIMARY KEY ComplexNodeShape (__IDComplexNodeShape__)
) ;

CREATE TABLE PolygonNodeShape (
	__IDPolygonNodeShape__ Integer NOT NULL,
	sides Integer,
	skew Integer,
	distortion Integer,
	isRegular Boolean,
	orientation Integer,
	PRIMARY KEY PolygonNodeShape (__IDPolygonNodeShape__)
) ;

CREATE TABLE MNodeShape (
	__IDMNodeShape__ Integer NOT NULL,
	FOREIGN KEY toplabel (__FKtoplabel__) REFERENCES "Label" (__IDLabel__),
	FOREIGN KEY bottomlabel (__FKbottomlabel__) REFERENCES "Label" (__IDLabel__),
	PRIMARY KEY MNodeShape (__IDMNodeShape__),
	__FKbottomlabel__ Integer,
	__FKtoplabel__ Integer
) ;

CREATE TABLE RecordNodeShape (
	__IDRecordNodeShape__ Integer NOT NULL,
	PRIMARY KEY RecordNodeShape (__IDRecordNodeShape__)
) ;

CREATE TABLE ArrowShape (
	__IDArrowShape__ Integer NOT NULL,
	clipping text,
	isPlain Boolean,
	size Integer,
	PRIMARY KEY ArrowShape (__IDArrowShape__)
) ;

CREATE TABLE Nodelike_refers_Arc (
	__IDNodelike__ Integer NOT NULL,
	__IDArc__ Integer NOT NULL
) ;

CREATE TABLE Graph_nodes_Nodelike (
	__IDGraph__ Integer NOT NULL,
	__IDNodelike__ Integer NOT NULL
) ;

CREATE TABLE SubGraph_nodes_Nodelike (
	__IDSubGraph__ Integer NOT NULL,
	__IDNodelike__ Integer NOT NULL
) ;

CREATE TABLE ComplexLabel_compartments_Compartment (
	__IDComplexLabel__ Integer NOT NULL,
	__IDCompartment__ Integer NOT NULL
) ;

CREATE TABLE Layer_nodes_Nodelike (
	__IDLayer__ Integer NOT NULL,
	__IDNodelike__ Integer NOT NULL
) ;

CREATE TABLE Graph_layers_Layer (
	__IDGraph__ Integer NOT NULL,
	__IDLayer__ Integer NOT NULL
) ;

CREATE TABLE Layer_arcs_Arc (
	__IDLayer__ Integer NOT NULL,
	__IDArc__ Integer NOT NULL
) ;

CREATE TABLE Nodelike_referredBy_Arc (
	__IDNodelike__ Integer NOT NULL,
	__IDArc__ Integer NOT NULL
) ;

CREATE TABLE Arc_layers_Layer (
	__IDArc__ Integer NOT NULL,
	__IDLayer__ Integer NOT NULL
) ;

CREATE TABLE Nodelike_layers_Layer (
	__IDNodelike__ Integer NOT NULL,
	__IDLayer__ Integer NOT NULL
) ;
