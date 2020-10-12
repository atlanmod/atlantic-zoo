CREATE TABLE DateTimeType (
	__IDDateTimeType__ Integer NOT NULL,
	year Integer,
	month Integer,
	day Integer,
	hour Integer,
	minute Integer,
	second Integer,
	PRIMARY KEY DateTimeType (__IDDateTimeType__)
) ;

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
	start Integer,
	"key" text,
	metric Boolean,
	buildnum Integer,
	version text,
	docLangId Integer,
	FOREIGN KEY docProps (__FKdocProps__) REFERENCES DocumentPropertiesCollection (__IDDocumentPropertiesCollection__),
	FOREIGN KEY docSettings (__FKdocSettings__) REFERENCES DocumentSettingsElt (__IDDocumentSettingsElt__),
	FOREIGN KEY docColors (__FKdocColors__) REFERENCES ColorsTable (__IDColorsTable__),
	FOREIGN KEY docPrintSetup (__FKdocPrintSetup__) REFERENCES PrintSetup (__IDPrintSetup__),
	FOREIGN KEY docFonts (__FKdocFonts__) REFERENCES FontsTable (__IDFontsTable__),
	FOREIGN KEY docFaceNames (__FKdocFaceNames__) REFERENCES FaceNamesTable (__IDFaceNamesTable__),
	FOREIGN KEY docStyleSheets (__FKdocStyleSheets__) REFERENCES StyleSheetsCollection (__IDStyleSheetsCollection__),
	FOREIGN KEY docDocumentSheet (__FKdocDocumentSheet__) REFERENCES DocumentSheet (__IDDocumentSheet__),
	FOREIGN KEY docMasters (__FKdocMasters__) REFERENCES MastersCollection (__IDMastersCollection__),
	FOREIGN KEY docPages (__FKdocPages__) REFERENCES PagesCollection (__IDPagesCollection__),
	FOREIGN KEY docWindows (__FKdocWindows__) REFERENCES WindowsInfo (__IDWindowsInfo__),
	FOREIGN KEY docEventList (__FKdocEventList__) REFERENCES EventList (__IDEventList__),
	FOREIGN KEY docHeaderFooter (__FKdocHeaderFooter__) REFERENCES HeaderFooter (__IDHeaderFooter__),
	FOREIGN KEY docVBProjectData (__FKdocVBProjectData__) REFERENCES VBProjectData (__IDVBProjectData__),
	FOREIGN KEY docEmailRoutingData (__FKdocEmailRoutingData__) REFERENCES EmailRoutingData (__IDEmailRoutingData__),
	PRIMARY KEY VisioDocument (__IDVisioDocument__),
	__FKdocColors__ Integer,
	__FKdocDocumentSheet__ Integer,
	__FKdocVBProjectData__ Integer,
	__FKdocPages__ Integer,
	__FKdocWindows__ Integer,
	__FKdocStyleSheets__ Integer,
	__FKdocEmailRoutingData__ Integer,
	__FKdocFonts__ Integer,
	__FKdocHeaderFooter__ Integer,
	__FKdocFaceNames__ Integer,
	__FKdocSettings__ Integer,
	__FKdocProps__ Integer,
	__FKdocEventList__ Integer,
	__FKdocMasters__ Integer,
	__FKdocPrintSetup__ Integer
) ;

CREATE TABLE DocumentPropertiesCollection (
	__IDDocumentPropertiesCollection__ Integer NOT NULL,
	FOREIGN KEY dps_visioDocument (__FKdps_visioDocument__) REFERENCES VisioDocument (__IDVisioDocument__),
	title text,
	subject text,
	creator text,
	manager text,
	company text,
	category text,
	keywords text,
	description text,
	hyperlinkBase_href text,
	alternateNames text,
	template text,
	buildNumberCreated text,
	buildNumberEdited text,
	FOREIGN KEY customProps (__FKcustomProps__) REFERENCES CustomPropertiesCollection (__IDCustomPropertiesCollection__),
	FOREIGN KEY timeCreated (__FKtimeCreated__) REFERENCES DateTimeType (__IDDateTimeType__),
	FOREIGN KEY timeSaved (__FKtimeSaved__) REFERENCES DateTimeType (__IDDateTimeType__),
	FOREIGN KEY timeEdited (__FKtimeEdited__) REFERENCES DateTimeType (__IDDateTimeType__),
	FOREIGN KEY timePrinted (__FKtimePrinted__) REFERENCES DateTimeType (__IDDateTimeType__),
	PRIMARY KEY DocumentPropertiesCollection (__IDDocumentPropertiesCollection__),
	__FKtimePrinted__ Integer,
	__FKtimeEdited__ Integer,
	__FKdps_visioDocument__ Integer,
	__FKtimeCreated__ Integer,
	__FKtimeSaved__ Integer,
	__FKcustomProps__ Integer
) ;

CREATE TABLE CustomPropertiesCollection (
	__IDCustomPropertiesCollection__ Integer NOT NULL,
	FOREIGN KEY cps_docProp (__FKcps_docProp__) REFERENCES DocumentPropertiesCollection (__IDDocumentPropertiesCollection__),
	PRIMARY KEY CustomPropertiesCollection (__IDCustomPropertiesCollection__),
	__FKcps_docProp__ Integer
) ;

CREATE TABLE CustomProperty (
	__IDCustomProperty__ Integer NOT NULL,
	FOREIGN KEY cp_customProps (__FKcp_customProps__) REFERENCES CustomPropertiesCollection (__IDCustomPropertiesCollection__),
	name text,
	dataType text,
	PRIMARY KEY CustomProperty (__IDCustomProperty__),
	__FKcp_customProps__ Integer
) ;

CREATE TABLE DocumentSettingsElt (
	__IDDocumentSettingsElt__ Integer NOT NULL,
	FOREIGN KEY dss_visioDocument (__FKdss_visioDocument__) REFERENCES VisioDocument (__IDVisioDocument__),
	FOREIGN KEY topPage (__FKtopPage__) REFERENCES Page (__IDPage__),
	FOREIGN KEY defaultTextStyle (__FKdefaultTextStyle__) REFERENCES StyleSheet (__IDStyleSheet__),
	FOREIGN KEY defaultLineStyle (__FKdefaultLineStyle__) REFERENCES StyleSheet (__IDStyleSheet__),
	FOREIGN KEY defaultFillStyle (__FKdefaultFillStyle__) REFERENCES StyleSheet (__IDStyleSheet__),
	FOREIGN KEY defaultGuideStyle (__FKdefaultGuideStyle__) REFERENCES StyleSheet (__IDStyleSheet__),
	glueSettings Integer,
	snapSettings Integer,
	snapExtensions Integer,
	FOREIGN KEY ds_snapAngles (__FKds_snapAngles__) REFERENCES SnapAnglesCollection (__IDSnapAnglesCollection__),
	dynamicGridEnabled Boolean,
	protectStyles Boolean,
	protectShapes Boolean,
	protectMasters Boolean,
	protectBkgnds Boolean,
	customMenusFile text,
	customToolbarsFile text,
	attachedToolbars text,
	PRIMARY KEY DocumentSettingsElt (__IDDocumentSettingsElt__),
	__FKdefaultGuideStyle__ Integer,
	__FKds_snapAngles__ Integer,
	__FKtopPage__ Integer,
	__FKdefaultLineStyle__ Integer,
	__FKdefaultTextStyle__ Integer,
	__FKdss_visioDocument__ Integer,
	__FKdefaultFillStyle__ Integer
) ;

CREATE TABLE SnapAnglesCollection (
	__IDSnapAnglesCollection__ Integer NOT NULL,
	FOREIGN KEY sa_docSettings (__FKsa_docSettings__) REFERENCES DocumentSettingsElt (__IDDocumentSettingsElt__),
	PRIMARY KEY SnapAnglesCollection (__IDSnapAnglesCollection__),
	__FKsa_docSettings__ Integer
) ;

CREATE TABLE SnapAngle (
	__IDSnapAngle__ Integer NOT NULL,
	FOREIGN KEY sa_snapAngles (__FKsa_snapAngles__) REFERENCES SnapAnglesCollection (__IDSnapAnglesCollection__),
	angleValue "Double",
	PRIMARY KEY SnapAngle (__IDSnapAngle__),
	__FKsa_snapAngles__ Integer
) ;

CREATE TABLE ColorsTable (
	__IDColorsTable__ Integer NOT NULL,
	FOREIGN KEY cs_visioDocument (__FKcs_visioDocument__) REFERENCES VisioDocument (__IDVisioDocument__),
	PRIMARY KEY ColorsTable (__IDColorsTable__),
	__FKcs_visioDocument__ Integer
) ;

CREATE TABLE ColorEntry (
	__IDColorEntry__ Integer NOT NULL,
	FOREIGN KEY ce_colors (__FKce_colors__) REFERENCES ColorsTable (__IDColorsTable__),
	rgb text,
	PRIMARY KEY ColorEntry (__IDColorEntry__),
	__FKce_colors__ Integer
) ;

CREATE TABLE PrintSetup (
	__IDPrintSetup__ Integer NOT NULL,
	FOREIGN KEY ps_visioDocument (__FKps_visioDocument__) REFERENCES VisioDocument (__IDVisioDocument__),
	PRIMARY KEY PrintSetup (__IDPrintSetup__),
	__FKps_visioDocument__ Integer
) ;

CREATE TABLE FontsTable (
	__IDFontsTable__ Integer NOT NULL,
	FOREIGN KEY fs_visioDocument (__FKfs_visioDocument__) REFERENCES VisioDocument (__IDVisioDocument__),
	PRIMARY KEY FontsTable (__IDFontsTable__),
	__FKfs_visioDocument__ Integer
) ;

CREATE TABLE FontEntry (
	__IDFontEntry__ Integer NOT NULL,
	FOREIGN KEY fe_fonts (__FKfe_fonts__) REFERENCES FontsTable (__IDFontsTable__),
	name text,
	charSet text,
	pitchAndFamily text,
	attributes Integer,
	weight Integer,
	unicode Boolean,
	PRIMARY KEY FontEntry (__IDFontEntry__),
	__FKfe_fonts__ Integer
) ;

CREATE TABLE FaceNamesTable (
	__IDFaceNamesTable__ Integer NOT NULL,
	FOREIGN KEY fns_visioDocument (__FKfns_visioDocument__) REFERENCES VisioDocument (__IDVisioDocument__),
	PRIMARY KEY FaceNamesTable (__IDFaceNamesTable__),
	__FKfns_visioDocument__ Integer
) ;

CREATE TABLE FaceName (
	__IDFaceName__ Integer NOT NULL,
	FOREIGN KEY fn_faceNames (__FKfn_faceNames__) REFERENCES FaceNamesTable (__IDFaceNamesTable__),
	name text,
	unicodeRanges text,
	charSet text,
	panos text,
	flags Integer,
	PRIMARY KEY FaceName (__IDFaceName__),
	__FKfn_faceNames__ Integer
) ;

CREATE TABLE VBProjectData (
	__IDVBProjectData__ Integer NOT NULL,
	FOREIGN KEY vpd_visioDocument (__FKvpd_visioDocument__) REFERENCES VisioDocument (__IDVisioDocument__),
	data text,
	PRIMARY KEY VBProjectData (__IDVBProjectData__),
	__FKvpd_visioDocument__ Integer
) ;

CREATE TABLE EmailRoutingData (
	__IDEmailRoutingData__ Integer NOT NULL,
	FOREIGN KEY erd_visioDocument (__FKerd_visioDocument__) REFERENCES VisioDocument (__IDVisioDocument__),
	data text,
	size Integer,
	PRIMARY KEY EmailRoutingData (__IDEmailRoutingData__),
	__FKerd_visioDocument__ Integer
) ;

CREATE TABLE StyleSheetsCollection (
	__IDStyleSheetsCollection__ Integer NOT NULL,
	FOREIGN KEY sss_visioDocument (__FKsss_visioDocument__) REFERENCES VisioDocument (__IDVisioDocument__),
	PRIMARY KEY StyleSheetsCollection (__IDStyleSheetsCollection__),
	__FKsss_visioDocument__ Integer
) ;

CREATE TABLE StyleSheet (
	__IDStyleSheet__ Integer NOT NULL,
	FOREIGN KEY ss_stylesSheets (__FKss_stylesSheets__) REFERENCES StyleSheetsCollection (__IDStyleSheetsCollection__),
	PRIMARY KEY StyleSheet (__IDStyleSheet__),
	__FKss_stylesSheets__ Integer
) ;

CREATE TABLE DocumentSheet (
	__IDDocumentSheet__ Integer NOT NULL,
	FOREIGN KEY ds_visioDocument (__FKds_visioDocument__) REFERENCES VisioDocument (__IDVisioDocument__),
	PRIMARY KEY DocumentSheet (__IDDocumentSheet__),
	__FKds_visioDocument__ Integer
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
	__FKnoShow__ Integer,
	__FKnoFill__ Integer,
	__FKnoSnap__ Integer,
	__FKnoLine__ Integer
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
	__FKc__ Integer,
	__FKd__ Integer
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

CREATE TABLE IXrequiredElt (
	__IDIXrequiredElt__ Integer NOT NULL,
	iX Integer,
	PRIMARY KEY IXrequiredElt (__IDIXrequiredElt__)
) ;

CREATE TABLE Cp (
	__IDCp__ Integer NOT NULL,
	PRIMARY KEY Cp (__IDCp__)
) ;

CREATE TABLE Pp (
	__IDPp__ Integer NOT NULL,
	PRIMARY KEY Pp (__IDPp__)
) ;

CREATE TABLE Tp (
	__IDTp__ Integer NOT NULL,
	PRIMARY KEY Tp (__IDTp__)
) ;

CREATE TABLE Fld (
	__IDFld__ Integer NOT NULL,
	PRIMARY KEY Fld (__IDFld__)
) ;

CREATE TABLE StringElt (
	__IDStringElt__ Integer NOT NULL,
	value text,
	PRIMARY KEY StringElt (__IDStringElt__)
) ;

CREATE TABLE "Char" (
	__IDChar__ Integer NOT NULL,
	FOREIGN KEY font (__FKfont__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY color (__FKcolor__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY style (__FKstyle__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY "case" (__FKcase__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY pos (__FKpos__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY fontScale (__FKfontScale__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY size (__FKsize__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY dblUnderline (__FKdblUnderline__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY overline (__FKoverline__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY strikethru (__FKstrikethru__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY doubleStrikethrough (__FKdoubleStrikethrough__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY rtlText (__FKrtlText__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY runVertical (__FKrunVertical__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY letterspace (__FKletterspace__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY colorTrans (__FKcolorTrans__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY localizeFont (__FKlocalizeFont__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY langID (__FKlangID__) REFERENCES CellType (__IDCellType__),
	PRIMARY KEY "Char" (__IDChar__),
	__FKlangID__ Integer,
	__FKletterspace__ Integer,
	__FKsize__ Integer,
	__FKstrikethru__ Integer,
	__FKfontScale__ Integer,
	__FKoverline__ Integer,
	__FKdoubleStrikethrough__ Integer,
	__FKrunVertical__ Integer,
	__FKstyle__ Integer,
	__FKlocalizeFont__ Integer,
	__FKrtlText__ Integer,
	__FKcase__ Integer,
	__FKcolor__ Integer,
	__FKcolorTrans__ Integer,
	__FKpos__ Integer,
	__FKfont__ Integer,
	__FKdblUnderline__ Integer
) ;

CREATE TABLE Para (
	__IDPara__ Integer NOT NULL,
	FOREIGN KEY indFirst (__FKindFirst__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY indLeft (__FKindLeft__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY indRight (__FKindRight__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY spLine (__FKspLine__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY spBefore (__FKspBefore__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY spAfter (__FKspAfter__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY horzAlign (__FKhorzAlign__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY bullet (__FKbullet__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY bulletStr (__FKbulletStr__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY bulletFont (__FKbulletFont__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY localizeBulletFont (__FKlocalizeBulletFont__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY bulletFontSize (__FKbulletFontSize__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY textPosAfterBullet (__FKtextPosAfterBullet__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY flags (__FKflags__) REFERENCES CellType (__IDCellType__),
	PRIMARY KEY Para (__IDPara__),
	__FKlocalizeBulletFont__ Integer,
	__FKbulletStr__ Integer,
	__FKindLeft__ Integer,
	__FKflags__ Integer,
	__FKtextPosAfterBullet__ Integer,
	__FKindRight__ Integer,
	__FKspBefore__ Integer,
	__FKhorzAlign__ Integer,
	__FKbullet__ Integer,
	__FKindFirst__ Integer,
	__FKbulletFont__ Integer,
	__FKspLine__ Integer,
	__FKbulletFontSize__ Integer,
	__FKspAfter__ Integer
) ;

CREATE TABLE TabsCollection (
	__IDTabsCollection__ Integer NOT NULL,
	PRIMARY KEY TabsCollection (__IDTabsCollection__)
) ;

CREATE TABLE Tab (
	__IDTab__ Integer NOT NULL,
	FOREIGN KEY t_tabs (__FKt_tabs__) REFERENCES TabsCollection (__IDTabsCollection__),
	FOREIGN KEY position (__FKposition__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY alignment (__FKalignment__) REFERENCES CellType (__IDCellType__),
	PRIMARY KEY Tab (__IDTab__),
	__FKposition__ Integer,
	__FKalignment__ Integer,
	__FKt_tabs__ Integer
) ;

CREATE TABLE Field (
	__IDField__ Integer NOT NULL,
	FOREIGN KEY value (__FKvalue__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY editMode (__FKeditMode__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY format (__FKformat__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY type (__FKtype__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY uiCat (__FKuiCat__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY uiCode (__FKuiCode__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY uiFmt (__FKuiFmt__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY calendar (__FKcalendar__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY objectKind (__FKobjectKind__) REFERENCES CellType (__IDCellType__),
	PRIMARY KEY Field (__IDField__),
	__FKuiCat__ Integer,
	__FKformat__ Integer,
	__FKuiCode__ Integer,
	__FKvalue__ Integer,
	__FKeditMode__ Integer,
	__FKcalendar__ Integer,
	__FKuiFmt__ Integer,
	__FKtype__ Integer,
	__FKobjectKind__ Integer
) ;

CREATE TABLE XForm (
	__IDXForm__ Integer NOT NULL,
	FOREIGN KEY pinX (__FKpinX__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY pinY (__FKpinY__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY width (__FKwidth__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY height (__FKheight__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY locPinX (__FKlocPinX__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY locPinY (__FKlocPinY__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY angle (__FKangle__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY flipX (__FKflipX__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY flipY (__FKflipY__) REFERENCES CellType (__IDCellType__),
	FOREIGN KEY resizeMode (__FKresizeMode__) REFERENCES CellType (__IDCellType__),
	PRIMARY KEY XForm (__IDXForm__),
	__FKflipY__ Integer,
	__FKlocPinX__ Integer,
	__FKflipX__ Integer,
	__FKlocPinY__ Integer,
	__FKpinY__ Integer,
	__FKwidth__ Integer,
	__FKheight__ Integer,
	__FKresizeMode__ Integer,
	__FKpinX__ Integer,
	__FKangle__ Integer
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

CREATE TABLE WindowsInfo (
	__IDWindowsInfo__ Integer NOT NULL,
	FOREIGN KEY ws_visioDocument (__FKws_visioDocument__) REFERENCES VisioDocument (__IDVisioDocument__),
	PRIMARY KEY WindowsInfo (__IDWindowsInfo__),
	__FKws_visioDocument__ Integer
) ;

CREATE TABLE EventList (
	__IDEventList__ Integer NOT NULL,
	FOREIGN KEY el_visioDocument (__FKel_visioDocument__) REFERENCES VisioDocument (__IDVisioDocument__),
	PRIMARY KEY EventList (__IDEventList__),
	__FKel_visioDocument__ Integer
) ;

CREATE TABLE HeaderFooter (
	__IDHeaderFooter__ Integer NOT NULL,
	FOREIGN KEY ef_visioDocument (__FKef_visioDocument__) REFERENCES VisioDocument (__IDVisioDocument__),
	PRIMARY KEY HeaderFooter (__IDHeaderFooter__),
	__FKef_visioDocument__ Integer
) ;

CREATE TABLE SolutionXML (
	__IDSolutionXML__ Integer NOT NULL,
	FOREIGN KEY sx_visioDocument (__FKsx_visioDocument__) REFERENCES VisioDocument (__IDVisioDocument__),
	PRIMARY KEY SolutionXML (__IDSolutionXML__),
	__FKsx_visioDocument__ Integer
) ;

CREATE TABLE Geom_splineKnots_SplineKnot (
	__IDGeom__ Integer NOT NULL,
	__IDSplineKnot__ Integer NOT NULL
) ;

CREATE TABLE PagesCollection_pages_Page (
	__IDPagesCollection__ Integer NOT NULL,
	__IDPage__ Integer NOT NULL
) ;

CREATE TABLE VisioDocument_docSolutionXML_SolutionXML (
	__IDVisioDocument__ Integer NOT NULL,
	__IDSolutionXML__ Integer NOT NULL
) ;

CREATE TABLE Shape_shapeElts_ShapeElt (
	__IDShape__ Integer NOT NULL,
	__IDShapeElt__ Integer NOT NULL
) ;

CREATE TABLE MastersCollection_masterShortCuts_MasterShortCut (
	__IDMastersCollection__ Integer NOT NULL,
	__IDMasterShortCut__ Integer NOT NULL
) ;

CREATE TABLE Geom_ellipses_Ellipse (
	__IDGeom__ Integer NOT NULL,
	__IDEllipse__ Integer NOT NULL
) ;

CREATE TABLE Geom_nurbsTo_NURBSTo (
	__IDGeom__ Integer NOT NULL,
	__IDNURBSTo__ Integer NOT NULL
) ;

CREATE TABLE FaceNamesTable_faceNameEntries_FaceName (
	__IDFaceNamesTable__ Integer NOT NULL,
	__IDFaceName__ Integer NOT NULL
) ;

CREATE TABLE Geom_ellipticalArcsTo_EllipticalArcTo (
	__IDGeom__ Integer NOT NULL,
	__IDEllipticalArcTo__ Integer NOT NULL
) ;

CREATE TABLE TabsCollection_tabs_Tab (
	__IDTabsCollection__ Integer NOT NULL,
	__IDTab__ Integer NOT NULL
) ;

CREATE TABLE Geom_movesTo_MoveTo (
	__IDGeom__ Integer NOT NULL,
	__IDMoveTo__ Integer NOT NULL
) ;

CREATE TABLE FontsTable_fontEntries_FontEntry (
	__IDFontsTable__ Integer NOT NULL,
	__IDFontEntry__ Integer NOT NULL
) ;

CREATE TABLE Page_pageElts_PageElt (
	__IDPage__ Integer NOT NULL,
	__IDPageElt__ Integer NOT NULL
) ;

CREATE TABLE SnapAnglesCollection_snapAngles_SnapAngle (
	__IDSnapAnglesCollection__ Integer NOT NULL,
	__IDSnapAngle__ Integer NOT NULL
) ;

CREATE TABLE Geom_arcsTo_ArcTo (
	__IDGeom__ Integer NOT NULL,
	__IDArcTo__ Integer NOT NULL
) ;

CREATE TABLE ColorsTable_colorEntries_ColorEntry (
	__IDColorsTable__ Integer NOT NULL,
	__IDColorEntry__ Integer NOT NULL
) ;

CREATE TABLE Text_textElts_TextElt (
	__IDText__ Integer NOT NULL,
	__IDTextElt__ Integer NOT NULL
) ;

CREATE TABLE ShapesCollection_shapes_Shape (
	__IDShapesCollection__ Integer NOT NULL,
	__IDShape__ Integer NOT NULL
) ;

CREATE TABLE Geom_polylinesTo_PolylineTo (
	__IDGeom__ Integer NOT NULL,
	__IDPolylineTo__ Integer NOT NULL
) ;

CREATE TABLE MasterShortCut_icons_Icon (
	__IDMasterShortCut__ Integer NOT NULL,
	__IDIcon__ Integer NOT NULL
) ;

CREATE TABLE StyleSheetsCollection_stylesSheets_StyleSheet (
	__IDStyleSheetsCollection__ Integer NOT NULL,
	__IDStyleSheet__ Integer NOT NULL
) ;

CREATE TABLE ConnectsCollection_connections_Connect (
	__IDConnectsCollection__ Integer NOT NULL,
	__IDConnect__ Integer NOT NULL
) ;

CREATE TABLE Geom_linesTo_LineTo (
	__IDGeom__ Integer NOT NULL,
	__IDLineTo__ Integer NOT NULL
) ;

CREATE TABLE CustomPropertiesCollection_cps_customProps_CustomProperty (
	__IDCustomPropertiesCollection__ Integer NOT NULL,
	__IDCustomProperty__ Integer NOT NULL
) ;

CREATE TABLE MastersCollection_masters_Master (
	__IDMastersCollection__ Integer NOT NULL,
	__IDMaster__ Integer NOT NULL
) ;

CREATE TABLE Master_masterElts_MasterElt (
	__IDMaster__ Integer NOT NULL,
	__IDMasterElt__ Integer NOT NULL
) ;

CREATE TABLE Geom_infiniteLines_InfiniteLine (
	__IDGeom__ Integer NOT NULL,
	__IDInfiniteLine__ Integer NOT NULL
) ;

CREATE TABLE Geom_splineStarts_SplineStart (
	__IDGeom__ Integer NOT NULL,
	__IDSplineStart__ Integer NOT NULL
) ;
