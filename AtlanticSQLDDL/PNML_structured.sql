CREATE TABLE IdedElement (
	__IDIdedElement__ Integer NOT NULL,
	id text,
	PRIMARY KEY IdedElement (__IDIdedElement__)
) ;

CREATE TABLE URI (
	__IDURI__ Integer NOT NULL,
	value text,
	PRIMARY KEY URI (__IDURI__)
) ;

CREATE TABLE Color (
	__IDColor__ Integer NOT NULL,
	PRIMARY KEY Color (__IDColor__)
) ;

CREATE TABLE AnyElement (
	__IDAnyElement__ Integer NOT NULL,
	name text,
	text text,
	PRIMARY KEY AnyElement (__IDAnyElement__)
) ;

CREATE TABLE PNMLDocument (
	__IDPNMLDocument__ Integer NOT NULL,
	FOREIGN KEY xmlns (__FKxmlns__) REFERENCES URI (__IDURI__),
	PRIMARY KEY PNMLDocument (__IDPNMLDocument__),
	__FKxmlns__ Integer
) ;

CREATE TABLE NetElement (
	__IDNetElement__ Integer NOT NULL,
	FOREIGN KEY type (__FKtype__) REFERENCES URI (__IDURI__),
	FOREIGN KEY document (__FKdocument__) REFERENCES PNMLDocument (__IDPNMLDocument__),
	FOREIGN KEY netgraphics (__FKnetgraphics__) REFERENCES NetGraphics (__IDNetGraphics__),
	FOREIGN KEY name (__FKname__) REFERENCES Name (__IDName__),
	PRIMARY KEY NetElement (__IDNetElement__),
	__FKname__ Integer,
	__FKnetgraphics__ Integer,
	__FKtype__ Integer,
	__FKdocument__ Integer
) ;

CREATE TABLE NetContent (
	__IDNetContent__ Integer NOT NULL,
	FOREIGN KEY net (__FKnet__) REFERENCES NetElement (__IDNetElement__),
	FOREIGN KEY name (__FKname__) REFERENCES Name (__IDName__),
	FOREIGN KEY page (__FKpage__) REFERENCES Page (__IDPage__),
	PRIMARY KEY NetContent (__IDNetContent__),
	__FKname__ Integer,
	__FKpage__ Integer,
	__FKnet__ Integer
) ;

CREATE TABLE ToolSpecific (
	__IDToolSpecific__ Integer NOT NULL,
	tool text,
	version text,
	FOREIGN KEY net (__FKnet__) REFERENCES NetElement (__IDNetElement__),
	FOREIGN KEY arc (__FKarc__) REFERENCES Arc (__IDArc__),
	FOREIGN KEY node (__FKnode__) REFERENCES Node (__IDNode__),
	FOREIGN KEY page (__FKpage__) REFERENCES Page (__IDPage__),
	PRIMARY KEY ToolSpecific (__IDToolSpecific__),
	__FKpage__ Integer,
	__FKnet__ Integer,
	__FKarc__ Integer,
	__FKnode__ Integer
) ;

CREATE TABLE LabeledElement (
	__IDLabeledElement__ Integer NOT NULL,
	FOREIGN KEY annotationgraphics (__FKannotationgraphics__) REFERENCES AnnotationGraphics (__IDAnnotationGraphics__),
	PRIMARY KEY LabeledElement (__IDLabeledElement__),
	__FKannotationgraphics__ Integer
) ;

CREATE TABLE "Label" (
	__IDLabel__ Integer NOT NULL,
	text text,
	FOREIGN KEY namedelement (__FKnamedelement__) REFERENCES LabeledElement (__IDLabeledElement__),
	PRIMARY KEY "Label" (__IDLabel__),
	__FKnamedelement__ Integer
) ;

CREATE TABLE Name (
	__IDName__ Integer NOT NULL,
	FOREIGN KEY net (__FKnet__) REFERENCES NetElement (__IDNetElement__),
	FOREIGN KEY netcontent (__FKnetcontent__) REFERENCES NetContent (__IDNetContent__),
	PRIMARY KEY Name (__IDName__),
	__FKnetcontent__ Integer,
	__FKnet__ Integer
) ;

CREATE TABLE Inscription (
	__IDInscription__ Integer NOT NULL,
	FOREIGN KEY arc (__FKarc__) REFERENCES Arc (__IDArc__),
	PRIMARY KEY Inscription (__IDInscription__),
	__FKarc__ Integer
) ;

CREATE TABLE InitialMarking (
	__IDInitialMarking__ Integer NOT NULL,
	FOREIGN KEY place (__FKplace__) REFERENCES Place (__IDPlace__),
	PRIMARY KEY InitialMarking (__IDInitialMarking__),
	__FKplace__ Integer
) ;

CREATE TABLE NetContentElement (
	__IDNetContentElement__ Integer NOT NULL,
	FOREIGN KEY node (__FKnode__) REFERENCES Node (__IDNode__),
	PRIMARY KEY NetContentElement (__IDNetContentElement__),
	__FKnode__ Integer
) ;

CREATE TABLE Arc (
	__IDArc__ Integer NOT NULL,
	FOREIGN KEY source (__FKsource__) REFERENCES NetContentElement (__IDNetContentElement__),
	FOREIGN KEY target (__FKtarget__) REFERENCES NetContentElement (__IDNetContentElement__),
	FOREIGN KEY edgegraphics (__FKedgegraphics__) REFERENCES EdgeGraphics (__IDEdgeGraphics__),
	FOREIGN KEY inscription (__FKinscription__) REFERENCES Inscription (__IDInscription__),
	PRIMARY KEY Arc (__IDArc__),
	__FKinscription__ Integer,
	__FKtarget__ Integer,
	__FKsource__ Integer,
	__FKedgegraphics__ Integer
) ;

CREATE TABLE Page (
	__IDPage__ Integer NOT NULL,
	FOREIGN KEY pagegraphics (__FKpagegraphics__) REFERENCES PageGraphics (__IDPageGraphics__),
	PRIMARY KEY Page (__IDPage__),
	__FKpagegraphics__ Integer
) ;

CREATE TABLE Reference (
	__IDReference__ Integer NOT NULL,
	FOREIGN KEY ref (__FKref__) REFERENCES Node (__IDNode__),
	PRIMARY KEY Reference (__IDReference__),
	__FKref__ Integer
) ;

CREATE TABLE ReferencePlace (
	__IDReferencePlace__ Integer NOT NULL,
	PRIMARY KEY ReferencePlace (__IDReferencePlace__)
) ;

CREATE TABLE ReferenceTransition (
	__IDReferenceTransition__ Integer NOT NULL,
	PRIMARY KEY ReferenceTransition (__IDReferenceTransition__)
) ;

CREATE TABLE Node (
	__IDNode__ Integer NOT NULL,
	FOREIGN KEY netcontentelement (__FKnetcontentelement__) REFERENCES NetContentElement (__IDNetContentElement__),
	FOREIGN KEY nodegraphics (__FKnodegraphics__) REFERENCES NodeGraphics (__IDNodeGraphics__),
	PRIMARY KEY Node (__IDNode__),
	__FKnodegraphics__ Integer,
	__FKnetcontentelement__ Integer
) ;

CREATE TABLE Place (
	__IDPlace__ Integer NOT NULL,
	FOREIGN KEY initialmarking (__FKinitialmarking__) REFERENCES InitialMarking (__IDInitialMarking__),
	PRIMARY KEY Place (__IDPlace__),
	__FKinitialmarking__ Integer
) ;

CREATE TABLE Transition (
	__IDTransition__ Integer NOT NULL,
	PRIMARY KEY Transition (__IDTransition__)
) ;

CREATE TABLE Graphics (
	__IDGraphics__ Integer NOT NULL,
	PRIMARY KEY Graphics (__IDGraphics__)
) ;

CREATE TABLE NetGraphics (
	__IDNetGraphics__ Integer NOT NULL,
	FOREIGN KEY net (__FKnet__) REFERENCES NetElement (__IDNetElement__),
	PRIMARY KEY NetGraphics (__IDNetGraphics__),
	__FKnet__ Integer
) ;

CREATE TABLE NodeGraphics (
	__IDNodeGraphics__ Integer NOT NULL,
	FOREIGN KEY node (__FKnode__) REFERENCES Node (__IDNode__),
	FOREIGN KEY position (__FKposition__) REFERENCES Position (__IDPosition__),
	FOREIGN KEY dimension (__FKdimension__) REFERENCES Dimension (__IDDimension__),
	FOREIGN KEY fill (__FKfill__) REFERENCES Fill (__IDFill__),
	FOREIGN KEY line (__FKline__) REFERENCES Line (__IDLine__),
	PRIMARY KEY NodeGraphics (__IDNodeGraphics__),
	__FKline__ Integer,
	__FKdimension__ Integer,
	__FKposition__ Integer,
	__FKnode__ Integer,
	__FKfill__ Integer
) ;

CREATE TABLE EdgeGraphics (
	__IDEdgeGraphics__ Integer NOT NULL,
	FOREIGN KEY arc (__FKarc__) REFERENCES Arc (__IDArc__),
	FOREIGN KEY fill (__FKfill__) REFERENCES Fill (__IDFill__),
	FOREIGN KEY line (__FKline__) REFERENCES Line (__IDLine__),
	PRIMARY KEY EdgeGraphics (__IDEdgeGraphics__),
	__FKfill__ Integer,
	__FKarc__ Integer,
	__FKline__ Integer
) ;

CREATE TABLE AnnotationGraphics (
	__IDAnnotationGraphics__ Integer NOT NULL,
	FOREIGN KEY namedelement (__FKnamedelement__) REFERENCES LabeledElement (__IDLabeledElement__),
	FOREIGN KEY offset (__FKoffset__) REFERENCES Offset (__IDOffset__),
	FOREIGN KEY font (__FKfont__) REFERENCES Font (__IDFont__),
	FOREIGN KEY fill (__FKfill__) REFERENCES Fill (__IDFill__),
	FOREIGN KEY line (__FKline__) REFERENCES Line (__IDLine__),
	PRIMARY KEY AnnotationGraphics (__IDAnnotationGraphics__),
	__FKfill__ Integer,
	__FKoffset__ Integer,
	__FKfont__ Integer,
	__FKline__ Integer,
	__FKnamedelement__ Integer
) ;

CREATE TABLE PageGraphics (
	__IDPageGraphics__ Integer NOT NULL,
	FOREIGN KEY page (__FKpage__) REFERENCES Page (__IDPage__),
	PRIMARY KEY PageGraphics (__IDPageGraphics__),
	__FKpage__ Integer
) ;

CREATE TABLE Coordinate (
	__IDCoordinate__ Integer NOT NULL,
	x Integer,
	y Integer,
	PRIMARY KEY Coordinate (__IDCoordinate__)
) ;

CREATE TABLE Position (
	__IDPosition__ Integer NOT NULL,
	FOREIGN KEY nodegraphics (__FKnodegraphics__) REFERENCES NodeGraphics (__IDNodeGraphics__),
	FOREIGN KEY edgegraphics (__FKedgegraphics__) REFERENCES EdgeGraphics (__IDEdgeGraphics__),
	PRIMARY KEY Position (__IDPosition__),
	__FKedgegraphics__ Integer,
	__FKnodegraphics__ Integer
) ;

CREATE TABLE Offset (
	__IDOffset__ Integer NOT NULL,
	FOREIGN KEY annotationgraphics (__FKannotationgraphics__) REFERENCES AnnotationGraphics (__IDAnnotationGraphics__),
	PRIMARY KEY Offset (__IDOffset__),
	__FKannotationgraphics__ Integer
) ;

CREATE TABLE Dimension (
	__IDDimension__ Integer NOT NULL,
	width Integer,
	height Integer,
	FOREIGN KEY nodegraphics (__FKnodegraphics__) REFERENCES NodeGraphics (__IDNodeGraphics__),
	PRIMARY KEY Dimension (__IDDimension__),
	__FKnodegraphics__ Integer
) ;

CREATE TABLE Fill (
	__IDFill__ Integer NOT NULL,
	gradientrotation text,
	FOREIGN KEY interiorcolor (__FKinteriorcolor__) REFERENCES Color (__IDColor__),
	FOREIGN KEY gradientcolor (__FKgradientcolor__) REFERENCES Color (__IDColor__),
	FOREIGN KEY image (__FKimage__) REFERENCES URI (__IDURI__),
	FOREIGN KEY nodegraphics (__FKnodegraphics__) REFERENCES NodeGraphics (__IDNodeGraphics__),
	FOREIGN KEY edgegraphics (__FKedgegraphics__) REFERENCES EdgeGraphics (__IDEdgeGraphics__),
	FOREIGN KEY annotationgraphics (__FKannotationgraphics__) REFERENCES AnnotationGraphics (__IDAnnotationGraphics__),
	PRIMARY KEY Fill (__IDFill__),
	__FKinteriorcolor__ Integer,
	__FKnodegraphics__ Integer,
	__FKannotationgraphics__ Integer,
	__FKedgegraphics__ Integer,
	__FKgradientcolor__ Integer,
	__FKimage__ Integer
) ;

CREATE TABLE Line (
	__IDLine__ Integer NOT NULL,
	FOREIGN KEY color (__FKcolor__) REFERENCES Color (__IDColor__),
	width Integer,
	shape text,
	style text,
	FOREIGN KEY nodegraphics (__FKnodegraphics__) REFERENCES NodeGraphics (__IDNodeGraphics__),
	FOREIGN KEY edgegraphics (__FKedgegraphics__) REFERENCES EdgeGraphics (__IDEdgeGraphics__),
	FOREIGN KEY annotationgraphics (__FKannotationgraphics__) REFERENCES AnnotationGraphics (__IDAnnotationGraphics__),
	PRIMARY KEY Line (__IDLine__),
	__FKedgegraphics__ Integer,
	__FKnodegraphics__ Integer,
	__FKcolor__ Integer,
	__FKannotationgraphics__ Integer
) ;

CREATE TABLE Font (
	__IDFont__ Integer NOT NULL,
	family text,
	style text,
	weight text,
	size text,
	decoration text,
	align text,
	rotation Integer,
	FOREIGN KEY annotationgraphics (__FKannotationgraphics__) REFERENCES AnnotationGraphics (__IDAnnotationGraphics__),
	PRIMARY KEY Font (__IDFont__),
	__FKannotationgraphics__ Integer
) ;

CREATE TABLE PNMLDocument_nets_NetElement (
	__IDPNMLDocument__ Integer NOT NULL,
	__IDNetElement__ Integer NOT NULL
) ;

CREATE TABLE NetElement_contents_NetContent (
	__IDNetElement__ Integer NOT NULL,
	__IDNetContent__ Integer NOT NULL
) ;

CREATE TABLE Page_tools_ToolSpecific (
	__IDPage__ Integer NOT NULL,
	__IDToolSpecific__ Integer NOT NULL
) ;

CREATE TABLE LabeledElement_labels_Label (
	__IDLabeledElement__ Integer NOT NULL,
	__IDLabel__ Integer NOT NULL
) ;

CREATE TABLE NetElement_tools_ToolSpecific (
	__IDNetElement__ Integer NOT NULL,
	__IDToolSpecific__ Integer NOT NULL
) ;

CREATE TABLE Arc_tools_ToolSpecific (
	__IDArc__ Integer NOT NULL,
	__IDToolSpecific__ Integer NOT NULL
) ;

CREATE TABLE EdgeGraphics_position_Position (
	__IDEdgeGraphics__ Integer NOT NULL,
	__IDPosition__ Integer NOT NULL
) ;

CREATE TABLE Page_contents_NetContent (
	__IDPage__ Integer NOT NULL,
	__IDNetContent__ Integer NOT NULL
) ;

CREATE TABLE ToolSpecific_anyelement_AnyElement (
	__IDToolSpecific__ Integer NOT NULL,
	__IDAnyElement__ Integer NOT NULL
) ;

CREATE TABLE Node_tools_ToolSpecific (
	__IDNode__ Integer NOT NULL,
	__IDToolSpecific__ Integer NOT NULL
) ;
