CREATE TABLE CellType (
	__IDCellType__ Integer NOT NULL,
	unit text,
	formula text,
	err text,
	value text,
	PRIMARY KEY CellType (__IDCellType__)
) ;

CREATE TABLE VisioDocument (
	__IDVisioDocument__ Integer NOT NULL,
	FOREIGN KEY docMasters (__FKdocMasters__) REFERENCES MastersCollection (__IDMastersCollection__),
	FOREIGN KEY docPages (__FKdocPages__) REFERENCES PagesCollection (__IDPagesCollection__),
	PRIMARY KEY VisioDocument (__IDVisioDocument__),
	__FKdocPages__ Integer,
	__FKdocMasters__ Integer
) ;

CREATE TABLE PageSheet (
	__IDPageSheet__ Integer NOT NULL,
	PRIMARY KEY PageSheet (__IDPageSheet__)
) ;

CREATE TABLE NamedElt (
	__IDNamedElt__ Integer NOT NULL,
	name text,
	nameU text,
	PRIMARY KEY NamedElt (__IDNamedElt__)
) ;

CREATE TABLE IdentifiedElt (
	__IDIdentifiedElt__ Integer NOT NULL,
	ID Integer,
	PRIMARY KEY IdentifiedElt (__IDIdentifiedElt__)
) ;

CREATE TABLE UniqueIdElt (
	__IDUniqueIdElt__ Integer NOT NULL,
	UniqueID text,
	PRIMARY KEY UniqueIdElt (__IDUniqueIdElt__)
) ;

CREATE TABLE Shape (
	__IDShape__ Integer NOT NULL,
	FOREIGN KEY ss_shapes (__FKss_shapes__) REFERENCES ShapesCollection (__IDShapesCollection__),
	lineStyle Integer,
	fillStyle Integer,
	textStyle Integer,
	PRIMARY KEY Shape (__IDShape__),
	__FKss_shapes__ Integer
) ;

CREATE TABLE ShapeElt (
	__IDShapeElt__ Integer NOT NULL,
	FOREIGN KEY sse_shapeSheet (__FKsse_shapeSheet__) REFERENCES Shape (__IDShape__),
	PRIMARY KEY ShapeElt (__IDShapeElt__),
	__FKsse_shapeSheet__ Integer
) ;

CREATE TABLE IXElt (
	__IDIXElt__ Integer NOT NULL,
	iX Integer,
	PRIMARY KEY IXElt (__IDIXElt__)
) ;

CREATE TABLE DelElt (
	__IDDelElt__ Integer NOT NULL,
	del Boolean,
	PRIMARY KEY DelElt (__IDDelElt__)
) ;

CREATE TABLE Geom (
	__IDGeom__ Integer NOT NULL,
	FOREIGN KEY noFill (__FKnoFill__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY noLine (__FKnoLine__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY noShow (__FKnoShow__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY noSnap (__FKnoSnap__) REFERENCES CellType (__IDCellType__),
	PRIMARY KEY Geom (__IDGeom__),
	__FKnoFill__ Integer,
	__FKnoShow__ Integer,
	__FKnoLine__ Integer,
	__FKnoSnap__ Integer
) ;

CREATE TABLE XYElt (
	__IDXYElt__ Integer NOT NULL,
	FOREIGN KEY x (__FKx__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY y (__FKy__) REFERENCES CellType (__IDCellType__),
	PRIMARY KEY XYElt (__IDXYElt__),
	__FKx__ Integer,
	__FKy__ Integer
) ;

CREATE TABLE LineTo (
	__IDLineTo__ Integer NOT NULL,
	FOREIGN KEY lt_geom (__FKlt_geom__) REFERENCES Geom (__IDGeom__),
	PRIMARY KEY LineTo (__IDLineTo__),
	__FKlt_geom__ Integer
) ;

CREATE TABLE MoveTo (
	__IDMoveTo__ Integer NOT NULL,
	FOREIGN KEY mt_geom (__FKmt_geom__) REFERENCES Geom (__IDGeom__),
	PRIMARY KEY MoveTo (__IDMoveTo__),
	__FKmt_geom__ Integer
) ;

CREATE TABLE XYAElt (
	__IDXYAElt__ Integer NOT NULL,
	FOREIGN KEY a (__FKa__) REFERENCES CellType (__IDCellType__),
	PRIMARY KEY XYAElt (__IDXYAElt__),
	__FKa__ Integer
) ;

CREATE TABLE ArcTo (
	__IDArcTo__ Integer NOT NULL,
	FOREIGN KEY ac_geom (__FKac_geom__) REFERENCES Geom (__IDGeom__),
	PRIMARY KEY ArcTo (__IDArcTo__),
	__FKac_geom__ Integer
) ;

CREATE TABLE SplineKnot (
	__IDSplineKnot__ Integer NOT NULL,
	FOREIGN KEY sk_geom (__FKsk_geom__) REFERENCES Geom (__IDGeom__),
	PRIMARY KEY SplineKnot (__IDSplineKnot__),
	__FKsk_geom__ Integer
) ;

CREATE TABLE PolylineTo (
	__IDPolylineTo__ Integer NOT NULL,
	FOREIGN KEY pt_geom (__FKpt_geom__) REFERENCES Geom (__IDGeom__),
	PRIMARY KEY PolylineTo (__IDPolylineTo__),
	__FKpt_geom__ Integer
) ;

CREATE TABLE XYABElt (
	__IDXYABElt__ Integer NOT NULL,
	FOREIGN KEY b (__FKb__) REFERENCES CellType (__IDCellType__),
	PRIMARY KEY XYABElt (__IDXYABElt__),
	__FKb__ Integer
) ;

CREATE TABLE InfiniteLine (
	__IDInfiniteLine__ Integer NOT NULL,
	FOREIGN KEY il_geom (__FKil_geom__) REFERENCES Geom (__IDGeom__),
	PRIMARY KEY InfiniteLine (__IDInfiniteLine__),
	__FKil_geom__ Integer
) ;

CREATE TABLE XYABCDElt (
	__IDXYABCDElt__ Integer NOT NULL,
	FOREIGN KEY c (__FKc__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY d (__FKd__) REFERENCES CellType (__IDCellType__),
	PRIMARY KEY XYABCDElt (__IDXYABCDElt__),
	__FKd__ Integer,
	__FKc__ Integer
) ;

CREATE TABLE Ellipse (
	__IDEllipse__ Integer NOT NULL,
	FOREIGN KEY e_geom (__FKe_geom__) REFERENCES Geom (__IDGeom__),
	PRIMARY KEY Ellipse (__IDEllipse__),
	__FKe_geom__ Integer
) ;

CREATE TABLE EllipticalArcTo (
	__IDEllipticalArcTo__ Integer NOT NULL,
	FOREIGN KEY eat_geom (__FKeat_geom__) REFERENCES Geom (__IDGeom__),
	PRIMARY KEY EllipticalArcTo (__IDEllipticalArcTo__),
	__FKeat_geom__ Integer
) ;

CREATE TABLE SplineStart (
	__IDSplineStart__ Integer NOT NULL,
	FOREIGN KEY ss_geom (__FKss_geom__) REFERENCES Geom (__IDGeom__),
	PRIMARY KEY SplineStart (__IDSplineStart__),
	__FKss_geom__ Integer
) ;

CREATE TABLE XYABCDEElt (
	__IDXYABCDEElt__ Integer NOT NULL,
	FOREIGN KEY e (__FKe__) REFERENCES CellType (__IDCellType__),
	PRIMARY KEY XYABCDEElt (__IDXYABCDEElt__),
	__FKe__ Integer
) ;

CREATE TABLE NURBSTo (
	__IDNURBSTo__ Integer NOT NULL,
	FOREIGN KEY nt_geom (__FKnt_geom__) REFERENCES Geom (__IDGeom__),
	PRIMARY KEY NURBSTo (__IDNURBSTo__),
	__FKnt_geom__ Integer
) ;

CREATE TABLE Text (
	__IDText__ Integer NOT NULL,
	PRIMARY KEY Text (__IDText__)
) ;

CREATE TABLE TextElt (
	__IDTextElt__ Integer NOT NULL,
	FOREIGN KEY te_text (__FKte_text__) REFERENCES Text (__IDText__),
	PRIMARY KEY TextElt (__IDTextElt__),
	__FKte_text__ Integer
) ;

CREATE TABLE StringElt (
	__IDStringElt__ Integer NOT NULL,
	value text,
	PRIMARY KEY StringElt (__IDStringElt__)
) ;

CREATE TABLE MastersCollection (
	__IDMastersCollection__ Integer NOT NULL,
	FOREIGN KEY ms_visioDocument (__FKms_visioDocument__) REFERENCES VisioDocument (__IDVisioDocument__),
	PRIMARY KEY MastersCollection (__IDMastersCollection__),
	__FKms_visioDocument__ Integer
) ;

CREATE TABLE MasterShortCut (
	__IDMasterShortCut__ Integer NOT NULL,
	FOREIGN KEY m_masterShortCuts (__FKm_masterShortCuts__) REFERENCES MastersCollection (__IDMastersCollection__),
	iconSize Integer,
	patternFlags Integer,
	prompt text,
	shortcutURL text,
	shortcutHelp text,
	alignName Integer,
	PRIMARY KEY MasterShortCut (__IDMasterShortCut__),
	__FKm_masterShortCuts__ Integer
) ;

CREATE TABLE Icon (
	__IDIcon__ Integer NOT NULL,
	FOREIGN KEY i_masterShortCut (__FKi_masterShortCut__) REFERENCES MasterShortCut (__IDMasterShortCut__),
	value text,
	PRIMARY KEY Icon (__IDIcon__),
	__FKi_masterShortCut__ Integer
) ;

CREATE TABLE Master (
	__IDMaster__ Integer NOT NULL,
	FOREIGN KEY m_masters (__FKm_masters__) REFERENCES MastersCollection (__IDMastersCollection__),
	baseID text,
	matchByName Boolean,
	iconSize Integer,
	patternFlags Integer,
	prompt text,
	hidden Boolean,
	iconUpdate Boolean,
	alignName Integer,
	PRIMARY KEY Master (__IDMaster__),
	__FKm_masters__ Integer
) ;

CREATE TABLE ShapesCollection (
	__IDShapesCollection__ Integer NOT NULL,
	PRIMARY KEY ShapesCollection (__IDShapesCollection__)
) ;

CREATE TABLE ConnectsCollection (
	__IDConnectsCollection__ Integer NOT NULL,
	PRIMARY KEY ConnectsCollection (__IDConnectsCollection__)
) ;

CREATE TABLE Connect (
	__IDConnect__ Integer NOT NULL,
	FOREIGN KEY c_connects (__FKc_connects__) REFERENCES ConnectsCollection (__IDConnectsCollection__),
	fromSheet Integer,
	toSheet Integer,
	fromCell text,
	toCell text,
	fromPart Integer,
	toPart Integer,
	PRIMARY KEY Connect (__IDConnect__),
	__FKc_connects__ Integer
) ;

CREATE TABLE MasterElt (
	__IDMasterElt__ Integer NOT NULL,
	FOREIGN KEY me_master (__FKme_master__) REFERENCES Master (__IDMaster__),
	PRIMARY KEY MasterElt (__IDMasterElt__),
	__FKme_master__ Integer
) ;

CREATE TABLE PagesCollection (
	__IDPagesCollection__ Integer NOT NULL,
	FOREIGN KEY ps_visioDocument (__FKps_visioDocument__) REFERENCES VisioDocument (__IDVisioDocument__),
	PRIMARY KEY PagesCollection (__IDPagesCollection__),
	__FKps_visioDocument__ Integer
) ;

CREATE TABLE Page (
	__IDPage__ Integer NOT NULL,
	FOREIGN KEY p_pages (__FKp_pages__) REFERENCES PagesCollection (__IDPagesCollection__),
	background Boolean,
	backPage Integer,
	viewScale "Double",
	viewCenterX "Double",
	ViewCenterY "Double",
	reviewerID Integer,
	associatedPage Integer,
	PRIMARY KEY Page (__IDPage__),
	__FKp_pages__ Integer
) ;

CREATE TABLE PageElt (
	__IDPageElt__ Integer NOT NULL,
	FOREIGN KEY pe_page (__FKpe_page__) REFERENCES Page (__IDPage__),
	PRIMARY KEY PageElt (__IDPageElt__),
	__FKpe_page__ Integer
) ;

CREATE TABLE Master_masterElts_MasterElt (
	__IDMaster__ Integer NOT NULL,
	__IDMasterElt__ Integer NOT NULL
) ;

CREATE TABLE Page_pageElts_PageElt (
	__IDPage__ Integer NOT NULL,
	__IDPageElt__ Integer NOT NULL
) ;

CREATE TABLE MastersCollection_masterShortCuts_MasterShortCut (
	__IDMastersCollection__ Integer NOT NULL,
	__IDMasterShortCut__ Integer NOT NULL
) ;

CREATE TABLE Geom_infiniteLines_InfiniteLine (
	__IDGeom__ Integer NOT NULL,
	__IDInfiniteLine__ Integer NOT NULL
) ;

CREATE TABLE Geom_splineStarts_SplineStart (
	__IDGeom__ Integer NOT NULL,
	__IDSplineStart__ Integer NOT NULL
) ;

CREATE TABLE Geom_arcsTo_ArcTo (
	__IDGeom__ Integer NOT NULL,
	__IDArcTo__ Integer NOT NULL
) ;

CREATE TABLE Geom_ellipses_Ellipse (
	__IDGeom__ Integer NOT NULL,
	__IDEllipse__ Integer NOT NULL
) ;

CREATE TABLE MastersCollection_masters_Master (
	__IDMastersCollection__ Integer NOT NULL,
	__IDMaster__ Integer NOT NULL
) ;

CREATE TABLE Geom_linesTo_LineTo (
	__IDGeom__ Integer NOT NULL,
	__IDLineTo__ Integer NOT NULL
) ;

CREATE TABLE ShapesCollection_shapes_Shape (
	__IDShapesCollection__ Integer NOT NULL,
	__IDShape__ Integer NOT NULL
) ;

CREATE TABLE Geom_splineKnots_SplineKnot (
	__IDGeom__ Integer NOT NULL,
	__IDSplineKnot__ Integer NOT NULL
) ;

CREATE TABLE Geom_movesTo_MoveTo (
	__IDGeom__ Integer NOT NULL,
	__IDMoveTo__ Integer NOT NULL
) ;

CREATE TABLE Geom_nurbsTo_NURBSTo (
	__IDGeom__ Integer NOT NULL,
	__IDNURBSTo__ Integer NOT NULL
) ;

CREATE TABLE PagesCollection_pages_Page (
	__IDPagesCollection__ Integer NOT NULL,
	__IDPage__ Integer NOT NULL
) ;

CREATE TABLE Text_textElts_TextElt (
	__IDText__ Integer NOT NULL,
	__IDTextElt__ Integer NOT NULL
) ;

CREATE TABLE ConnectsCollection_connections_Connect (
	__IDConnectsCollection__ Integer NOT NULL,
	__IDConnect__ Integer NOT NULL
) ;

CREATE TABLE Geom_polylinesTo_PolylineTo (
	__IDGeom__ Integer NOT NULL,
	__IDPolylineTo__ Integer NOT NULL
) ;

CREATE TABLE MasterShortCut_icons_Icon (
	__IDMasterShortCut__ Integer NOT NULL,
	__IDIcon__ Integer NOT NULL
) ;

CREATE TABLE Geom_ellipticalArcsTo_EllipticalArcTo (
	__IDGeom__ Integer NOT NULL,
	__IDEllipticalArcTo__ Integer NOT NULL
) ;

CREATE TABLE Shape_shapeElts_ShapeElt (
	__IDShape__ Integer NOT NULL,
	__IDShapeElt__ Integer NOT NULL
) ;
