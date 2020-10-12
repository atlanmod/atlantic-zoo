module DatadiagramMLBasicDef {

	type DateTimeType {
		Year_Att : Integer32;
		Month_Att : Integer32;
		Day_Att : Integer32;
		Hour_Att : Integer32;
		Minute_Att : Integer32;
		Second_Att : Integer32;
	};

	type CellType {
		Unit_Att : Text;
		Formula_Att : Text;
		Err_Att : Text;
		Value_Att : Text;
	};

	type VisioDocument {
		Start_Att : Integer32;
		Key_Att : Text;
		Metric_Att : Logical;
		Buildnum_Att : Integer32;
		Version_Att : Text;
		DocLangId_Att : Integer32;
		DocProps_ContRef : DocumentPropertiesCollection?;
		DocSettings_ContRef : DocumentSettingsElt?;
		DocColors_ContRef : ColorsTable?;
		DocPrintSetup_ContRef : PrintSetup?;
		DocFonts_ContRef : FontsTable?;
		DocFaceNames_ContRef : FaceNamesTable?;
		DocStyleSheets_ContRef : StyleSheetsCollection?;
		DocDocumentSheet_ContRef : DocumentSheet?;
		DocMasters_ContRef : MastersCollection?;
		DocPages_ContRef : PagesCollection?;
		DocWindows_ContRef : WindowsInfo?;
		DocEventList_ContRef : EventList?;
		DocHeaderFooter_ContRef : HeaderFooter?;
		DocVBProjectData_ContRef : VBProjectData?;
		DocEmailRoutingData_ContRef : EmailRoutingData?;
		DocSolutionXML_ContRef : SolutionXML*;
	};

	type DocumentPropertiesCollection {
		Dps_visioDocument_Ref : VisioDocument;
		Title_Att : Text;
		Subject_Att : Text;
		Creator_Att : Text;
		Manager_Att : Text;
		Company_Att : Text;
		Category_Att : Text;
		Keywords_Att : Text;
		Description_Att : Text;
		HyperlinkBase_href_Att : Text;
		AlternateNames_Att : Text;
		Template_Att : Text;
		BuildNumberCreated_Att : Text;
		BuildNumberEdited_Att : Text;
		CustomProps_ContRef : CustomPropertiesCollection?;
		TimeCreated_ContRef : DateTimeType?;
		TimeSaved_ContRef : DateTimeType?;
		TimeEdited_ContRef : DateTimeType?;
		TimePrinted_ContRef : DateTimeType?;
	};

	type CustomPropertiesCollection {
		Cps_docProp_Ref : DocumentPropertiesCollection;
		Cps_customProps_ContRef : CustomProperty*;
	};

	type CustomProperty {
		Cp_customProps_Ref : CustomPropertiesCollection;
		Name_Att : Text;
		DataType_Att : Text;
	};

	type VBProjectData {
		Vpd_visioDocument_Ref : VisioDocument;
		Data_Att : Text;
	};

	type EmailRoutingData {
		Erd_visioDocument_Ref : VisioDocument;
		Data_Att : Text;
		Size_Att : Integer32;
	};

	type StyleSheetsCollection {
		Sss_visioDocument_Ref : VisioDocument;
		StylesSheets_ContRef : StyleSheet*;
	};

	type StyleSheet : Shape, IdentifiedElt, NamedElt {
		Ss_stylesSheets_Ref : StyleSheetsCollection;
	};

	type DocumentSheet : PageSheet, NamedElt {
		Ds_visioDocument_Ref : VisioDocument;
	};

	type PageSheet : Shape, UniqueIdElt, MasterElt, PageElt;

	type NamedElt {
		Name_Att : Text;
		NameU_Att : Text;
	};

	type IdentifiedElt {
		ID_Att : Integer32;
	};

	type UniqueIdElt {
		UniqueID_Att : Text;
	};

	type Shape {
		Ss_shapes_Ref : ShapesCollection;
		LineStyle_Att : Integer32;
		FillStyle_Att : Integer32;
		TextStyle_Att : Integer32;
		ShapeElts_ContRef : ShapeElt*;
	};

	type ShapeElt {
		Sse_shapeSheet_Ref : Shape;
	};

	type IXElt {
		IX_Att : Integer32;
	};

	type DelElt {
		Del_Att : Logical;
	};

	type Geom : ShapeElt, IXElt, DelElt {
		NoFill_ContRef : CellType?;
		NoLine_ContRef : CellType?;
		NoShow_ContRef : CellType?;
		NoSnap_ContRef : CellType?;
		LinesTo_ContRef : LineTo*;
		MovesTo_ContRef : MoveTo*;
		ArcsTo_ContRef : ArcTo*;
		SplineKnots_ContRef : SplineKnot*;
		PolylinesTo_ContRef : PolylineTo*;
		InfiniteLines_ContRef : InfiniteLine*;
		Ellipses_ContRef : Ellipse*;
		EllipticalArcsTo_ContRef : EllipticalArcTo*;
		SplineStarts_ContRef : SplineStart*;
		NurbsTo_ContRef : NURBSTo*;
	};

	type XYElt : IXElt, DelElt {
		X_ContRef : CellType?;
		Y_ContRef : CellType?;
	};

	type LineTo : XYElt {
		Lt_geom_Ref : Geom;
	};

	type MoveTo : XYElt {
		Mt_geom_Ref : Geom;
	};

	type XYAElt : XYElt {
		A_ContRef : CellType?;
	};

	type ArcTo : XYAElt {
		Ac_geom_Ref : Geom;
	};

	type SplineKnot : XYAElt {
		Sk_geom_Ref : Geom;
	};

	type PolylineTo : XYAElt {
		Pt_geom_Ref : Geom;
	};

	type XYABElt : XYAElt {
		B_ContRef : CellType?;
	};

	type InfiniteLine : XYABElt {
		Il_geom_Ref : Geom;
	};

	type XYABCDElt : XYABElt {
		C_ContRef : CellType?;
		D_ContRef : CellType?;
	};

	type Ellipse : XYABCDElt {
		E_geom_Ref : Geom;
	};

	type EllipticalArcTo : XYABCDElt {
		Eat_geom_Ref : Geom;
	};

	type SplineStart : XYABCDElt {
		Ss_geom_Ref : Geom;
	};

	type XYABCDEElt : XYABCDElt {
		E_ContRef : CellType?;
	};

	type NURBSTo : XYABCDEElt {
		Nt_geom_Ref : Geom;
	};

	type Text : ShapeElt {
		TextElts_ContRef : TextElt*;
	};

	type TextElt {
		Te_text_Ref : Text;
	};

	type StringElt : TextElt {
		Value_Att : Text;
	};

	type MastersCollection {
		Ms_visioDocument_Ref : VisioDocument;
		Masters_ContRef : Master*;
		MasterShortCuts_ContRef : MasterShortCut*;
	};

	type MasterShortCut : IdentifiedElt, NamedElt {
		M_masterShortCuts_Ref : MastersCollection;
		IconSize_Att : Integer32;
		PatternFlags_Att : Integer32;
		Prompt_Att : Text;
		ShortcutURL_Att : Text;
		ShortcutHelp_Att : Text;
		AlignName_Att : Integer32;
		Icons_ContRef : Icon*;
	};

	type Icon : MasterElt {
		I_masterShortCut_Ref : MasterShortCut;
		Value_Att : Text;
	};

	type Master : IdentifiedElt, UniqueIdElt, NamedElt {
		M_masters_Ref : MastersCollection;
		BaseID_Att : Text;
		MatchByName_Att : Logical;
		IconSize_Att : Integer32;
		PatternFlags_Att : Integer32;
		Prompt_Att : Text;
		Hidden_Att : Logical;
		IconUpdate_Att : Logical;
		AlignName_Att : Integer32;
		MasterElts_ContRef : MasterElt*;
	};

	type ShapesCollection : MasterElt, PageElt {
		Shapes_ContRef : Shape*;
	};

	type ConnectsCollection : MasterElt, PageElt {
		Connections_ContRef : Connect*;
	};

	type Connect {
		C_connects_Ref : ConnectsCollection;
		FromSheet_Att : Integer32;
		ToSheet_Att : Integer32;
		FromCell_Att : Text;
		ToCell_Att : Text;
		FromPart_Att : Integer32;
		ToPart_Att : Integer32;
	};

	type MasterElt {
		Me_master_Ref : Master;
	};

	type PagesCollection {
		Ps_visioDocument_Ref : VisioDocument;
		Pages_ContRef : Page*;
	};

	type Page : IdentifiedElt, NamedElt {
		P_pages_Ref : PagesCollection;
		Background_Att : Logical;
		BackPage_Att : Integer32;
		ViewScale_Att : Double;
		ViewCenterX_Att : Double;
		ViewCenterY_Att : Double;
		ReviewerID_Att : Integer32;
		AssociatedPage_Att : Integer32;
		PageElts_ContRef : PageElt*;
	};

	type PageElt {
		Pe_page_Ref : Page;
	};

	type DocumentSettingsElt {
		Dss_visioDocument_Ref : VisioDocument;
	};

	type ColorsTable {
		Cs_visioDocument_Ref : VisioDocument;
	};

	type PrintSetup {
		Ps_visioDocument_Ref : VisioDocument;
	};

	type FontsTable {
		Fs_visioDocument_Ref : VisioDocument;
	};

	type FaceNamesTable {
		Fns_visioDocument_Ref : VisioDocument;
	};

	type WindowsInfo {
		Ws_visioDocument_Ref : VisioDocument;
	};

	type EventList {
		El_visioDocument_Ref : VisioDocument;
	};

	type HeaderFooter {
		Ef_visioDocument_Ref : VisioDocument;
	};

	type SolutionXML {
		Sx_visioDocument_Ref : VisioDocument;
	};
}