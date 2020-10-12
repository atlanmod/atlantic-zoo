module SpreadsheetMLStyles {

	type DateTimeType {
		Year_Att : Integer32;
		Month_Att : Integer32;
		Day_Att : Integer32;
		Hour_Att : Integer32;
		Minute_Att : Integer32;
		Second_Att : Integer32;
	};

	type VersionType {
		N_Att : Integer32;
		Nn_Att : Integer32;
	};

	type ValueType {
		Vt_data_Ref : Data;
	};

	type StringValue : ValueType {
		Value_Att : Text;
	};

	type NumberValue : ValueType {
		Value_Att : Double;
	};

	type DateTimeTypeValue : ValueType {
		Value_ContRef : DateTimeType;
	};

	type BooleanValue : ValueType {
		Value_Att : Logical;
	};

	type ErrorValue : ValueType;

	type DocumentPropertiesCollection {
		Dp_workbook_Ref : Workbook;
		Title_Att : Text;
		Subject_Att : Text;
		Keywords_Att : Text;
		Description_Att : Text;
		Category_Att : Text;
		Author_Att : Text;
		LastAuthor_Att : Text;
		Manager_Att : Text;
		Company_Att : Text;
		HyperlinkBase_Att : Text;
		Revision_Att : Integer32;
		PresentationFormat_Att : Text;
		Guid_Att : Text;
		AppName_Att : Text;
		Version_ContRef : VersionType?;
		TotalTime_Att : Integer32;
		LastPrinted_ContRef : DateTimeType?;
		Created_ContRef : DateTimeType?;
		LastSaved_ContRef : DateTimeType?;
		Pages_Att : Integer32;
		Words_Att : Integer32;
		Characters_Att : Integer32;
		CharactersWithSpaces_Att : Integer32;
		Bytes_Att : Integer32;
		Lines_Att : Integer32;
		Paragraphs_Att : Integer32;
	};

	type CustomDocumentPropertiesCollection {
		Cdp_workbook_Ref : Workbook;
		CustomDocumentProperties_ContRef : CustomDocumentProperty+;
	};

	type CustomDocumentProperty {
		CustomDocumentProperty_cdpe_Ref : CustomDocumentPropertiesCollection;
		Name_Att : Text;
		Value_ContRef : ValueType;
	};

	type SmartTagType {
		SmartTagType_ste_Ref : SmartTagsCollection;
		Namespaceuri_Att : Text;
		Name_Att : Text;
		Url_Att : Text;
	};

	type SmartTagsCollection {
		St_workbook_Ref : Workbook;
		St_cell_Ref : Cell;
		SmartTagTypes_ContRef : SmartTagType*;
	};

	type Workbook {
		Wb_smartTags_ContRef : SmartTagsCollection?;
		Wb_docProperties_ContRef : DocumentPropertiesCollection?;
		Wb_customDocProperties_ContRef : CustomDocumentPropertiesCollection?;
		Wb_excelWorkbook_ContRef : ExcelWorkbook?;
		Wb_styles_ContRef : StylesCollection?;
		Wb_names_ContRef : NamesType?;
		Wb_worksheets_ContRef : Worksheet*;
	};

	type Worksheet {
		Ws_workbook_Ref : Workbook;
		Ws_table_ContRef : Table?;
		Name_Att : Text;
		Protected_Att : Logical;
		RightToLeft_Att : Logical;
		W_worksheetOptions_ContRef : WorksheetOptionsElt?;
	};

	type StyledElement {
		StyleID_Ref : StyleType?;
	};

	type Table : StyledElement {
		T_worksheet_Ref : Worksheet;
		T_cols_ContRef : Column*;
		T_rows_ContRef : Row*;
		DefaultColumnWidth_Att : Double;
		DefaultRowHeight_Att : Double;
		ExpandedColumnCount_Att : Integer32;
		ExpandedRowCount_Att : Integer32;
		LeftCell_Att : Integer32;
		TopCell_Att : Integer32;
		FullColumns_Att : Logical;
		FullRows_Att : Logical;
	};

	type TableElement : StyledElement {
		Index_Att : Integer32;
	};

	type ColOrRowElement : TableElement {
		Hidden_Att : Logical;
		Span_Att : Integer32;
	};

	type Column : ColOrRowElement {
		C_table_Ref : Table;
		AutoFitWidth_Att : Logical;
		Width_Att : Double;
	};

	type Row : ColOrRowElement {
		R_table_Ref : Table;
		R_cells_ContRef : Cell*;
		AutoFitHeight_Att : Logical;
		Height_Att : Double;
	};

	type Cell : TableElement {
		C_smartTags_ContRef : SmartTagsCollection*;
		C_row_Ref : Row;
		ArrayRange_Att : Text;
		Formula_Att : Text;
		HRef_Att : Text;
		MergeAcross_Att : Double;
		MergeDown_Att : Double;
		C_data_ContRef : Data?;
		C_comment_ContRef : Comment?;
	};

	type Comment {
		C_cell_Ref : Cell;
		Com_data_ContRef : Data;
		Author_Att : Text;
		ShowAlways_Att : Logical;
	};

	type Data {
		D_cell_Ref : Cell;
		D_comment_Ref : Comment;
		Value_ContRef : ValueType;
	};

	type ExcelWorkbook {
		Ew_workbook_Ref : Workbook;
		SelectedSheets_Att : Integer32;
		WindowHidden_Att : Logical;
		HideHorizontalScrollBar_Att : Logical;
		HideVerticalScrollBar_Att : Logical;
		HideWorkbookTabs_Att : Logical;
		WindowHeight_Att : Double;
		WindowWidth_Att : Double;
		WindowTopX_Att : Double;
		WindowTopY_Att : Double;
		ActiveSheet_Att : Integer32;
		ActiveChart_Att : Text;
		FirstVisibleSheet_Att : Integer32;
		HidePivotTableFieldList_Att : Logical;
		ProtectStructure_Att : Logical;
		ProtectWindows_Att : Logical;
		DisplayInkNotes_Att : Logical;
		EmbedSaveSmartTags_Att : Logical;
		FutureVer_Att : Text;
		TabRatio_Att : Integer32;
		WindowIconic_Att : Logical;
		DisplayDrawingObjects_Att : DisplayDrawingObjectsType?;
		CreateBackup_Att : Logical;
		Calculation_Att : CalculationWorkbookType?;
		DoNotCalculateBeforeSave_Att : Logical;
		Date1904_Att : Logical;
		RefModeR1C1_Att : Logical;
		Iteration_Att : Logical;
		MaxIterations_Att : Integer32;
		MaxChange_Att : Double;
		PrecisionAsDisplayed_Att : Logical;
		DoNotSaveLinkValues_Att : Logical;
		NoAutoRecover_Att : Logical;
		AcceptLabelsInFormulas_Att : Logical;
		Uncalced_Att : Logical;
	};

	type DisplayDrawingObjectsType {"ddot_displayShapes", "ddot_placeHolders", "ddot_hideAll"};

	type CalculationWorkbookType {"cwt_automaticCalculation", "cwt_manualCalculation", "cwt_semiAutomaticCalculation"};

	type WorksheetOptionsElt {
		Wo_worksheet_Ref : Worksheet;
		FitToPage_Att : Logical;
		DoNotDisplayColHeaders_Att : Logical;
		DoNotDisplayRowHeaders_Att : Logical;
		GridlineColor_Att : Text;
		Name_Att : Text;
		ExcelWorksheetType_Att : ExcelWorksheetTypeType?;
		IntlMacro_Att : Logical;
		Unsynced_Att : Logical;
		Selected_Att : Logical;
		CodeName_Att : Text;
		DisplayPageBreak_Att : Logical;
		TransitionExpressionEvaluation_Att : Logical;
		TransitionFormulaEntry_Att : Logical;
		Zoom_Att : Integer32;
		PageBreakZoom_Att : Integer32;
		ShowPageBreakZoom_Att : Logical;
		DefaultRowHeight_Att : Integer32;
		DefaultColumnWidth_Att : Integer32;
		StandardWidth_Att : Integer32;
		Visible_Att : VisibleType?;
		LeftColumnVisible_Att : Integer32;
		DisplayRightToLeft_Att : Logical;
		GridlineColorIndex_Att : Integer32;
		DisplayFormulas_Att : Logical;
		DoNotDisplayGridlines_Att : Logical;
		DoNotDisplayHeadings_Att : Logical;
		DoNotDisplayOutline_Att : Logical;
		ApplyAutomaticOutlineStyles_Att : Logical;
		NoSummaryRowsBelowDetail_Att : Logical;
		NoSummaryColumnsRightDetail_Att : Logical;
		DoNotDisplayZeros_Att : Logical;
		ActiveRow_Att : Integer32;
		ActiveColumn_Att : Integer32;
		FilterOn_Att : Logical;
		RangeSelection_Att : Text;
		TopRowVisible_Att : Integer32;
		TopRowBottomPane_Att : Integer32;
		LeftColumnRightPane_Att : Integer32;
		ActivePane_Att : Integer32;
		SplitHorizontal_Att : Integer32;
		SplitVertical_Att : Integer32;
		FreezePanes_Att : Logical;
		FrozenNoSplit_Att : Logical;
		TabColorIndex_Att : Integer32;
		ProtectContentst_Att : Logical;
		ProtectObjects_Att : Logical;
		ProtectScenarios_Att : Logical;
		EnableSelection_Att : EnableSelectionType?;
		AllowFormatCells_Att : Logical;
		AllowSizeCols_Att : Logical;
		AllowSizeRows_Att : Logical;
		AllowInsertCols_Att : Logical;
		AllowInsertRows_Att : Logical;
		AllowInsertHyperlinks_Att : Logical;
		AllowDeleteCols_Att : Logical;
		AllowDeleteRows_Att : Logical;
		AllowSort_Att : Logical;
		AllowFilter_Att : Logical;
		AllowUsePivotTables_Att : Logical;
		Wo_pageSetup_ContRef : PageSetup?;
		Wo_print_ContRef : Print?;
	};

	type ExcelWorksheetTypeType {"ewt_Worksheet", "ewt_Chart", "ewt_Macro", "ewt_Dialog"};

	type VisibleType {"vt_SheetVisible", "vt_SheetHidden", "vt_SheetVeryHidden"};

	type EnableSelectionType {"est_UnlockedCells", "est_NoSelection"};

	type PageSetup {
		Ps_worksheetOptions_Ref : WorksheetOptionsElt;
		Ps_layout_ContRef : Layout?;
		Ps_header_ContRef : Header?;
		Ps_footer_ContRef : Footer?;
		Ps_pageMargins_ContRef : PageMarginsInfo?;
	};

	type Layout {
		L_pageSetup_Ref : PageSetup;
		Orientation_Att : OrientationType?;
		CenterHorizontal_Att : Logical;
		CenterVertical_Att : Logical;
		StartPageNumber_Att : Text;
	};

	type OrientationType {"ot_Landscape", "ot_Portrait"};

	type HeaderOrFooterElt {
		Margin_Att : Double;
		Data_Att : Text;
	};

	type Header : HeaderOrFooterElt {
		H_pageSetup_Ref : PageSetup;
	};

	type Footer : HeaderOrFooterElt {
		F_pageSetup_Ref : PageSetup;
	};

	type PageMarginsInfo {
		Pm_pageSetup_Ref : PageSetup;
		Left_Att : Double;
		Right_Att : Double;
		Top_Att : Double;
		Bottom_Att : Double;
	};

	type Print {
		P_worksheetOptions_Ref : WorksheetOptionsElt;
		FitWidth_Att : Integer32;
		FitHeight_Att : Integer32;
		LeftToRight_Att : Logical;
		BlackAndWhite_Att : Logical;
		DraftQuality_Att : Logical;
		CommentsLayout_Att : CommentsLayoutType?;
		Scale_Att : Integer32;
		PrintErrors_Att : Text;
		ValidPrinterInfo_Att : Logical;
		PaperSizeIndex_Att : Integer32;
		HorizontalResolution_Att : Integer32;
		VerticalResolution_Att : Integer32;
		Gridlines_Att : Logical;
		NumberOfCopies_Att : Integer32;
		RowColHeadings_Att : Logical;
	};

	type CommentsLayoutType {"clt_InPlace", "clt_PrintNone", "clt_SheetEnd"};

	type StylesCollection {
		S_workbook_Ref : Workbook;
		Style_ContRef : StyleType*;
	};

	type StyleType {
		St_styles_Ref : StylesCollection;
		St_styledElement_Ref : StyledElement;
		Id_Att : Text;
		Name_Att : Text;
		Parent_Ref : StyleType?;
		St_parent_Ref : StyleType;
		Alignment_ContRef : AlignmentType?;
		Borders_ContRef : BordersType?;
		Font_ContRef : FontType?;
		Interior_ContRef : InteriorType?;
		NumberFormat_ContRef : NumberFormatType?;
		Protection_ContRef : ProtectionType?;
	};

	type ProtectionType {
		Pt_styleType_Ref : StyleType;
		Protected_Att : Logical;
	};

	type AlignmentType {
		At_styleType_Ref : StyleType;
		Horizontal_Att : HorizontalAlignementType?;
		ReadingOrder_Att : ReadingOrderType?;
		Indent_Att : Double;
		Rotate_Att : Double;
		ShrinkToFit_Att : Logical;
		Vertical_Att : VerticalAlignementType?;
		VerticalText_Att : Logical;
		WrapText_Att : Logical;
	};

	type HorizontalAlignementType {"hat_CenterAcrossSelection", "hat_Fill", "hat_Left", "hat_Right", "hat_Justify", "hat_Distributed", "hat_Center", "hat_Automatic", "hat_JustifyDistributed"};

	type ReadingOrderType {"rot_RightToLeft", "rot_LeftToRight", "rot_Context"};

	type VerticalAlignementType {"vat_Top", "vat_Bottom", "vat_Justify", "vat_Distributed", "vat_Center", "vat_Automatic", "vat_JustifyDistributed"};

	type BordersType {
		Bt_styleType_Ref : StyleType;
		Border_ContRef : BorderType#0 .. 6;
	};

	type BorderType {
		Bt_bordersType_Ref : BordersType;
		Position_Att : PositionType;
		Color_Att : Text;
		LineStyle_Att : LineStyleType?;
		Weight_Att : Double;
	};

	type PositionType {"pt_Left", "pt_Top", "pt_Right", "pt_Bottom", "pt_DiagonalLeft", "pt_DiagonalRight"};

	type LineStyleType {"lst_None", "lst_Continuous", "lst_Dash", "lst_Dot", "lst_DashDot", "lst_DashDotDot", "lst_SlantDashDot", "lst_Double"};

	type FontType {
		Ft_styleType_Ref : StyleType;
		Bold_Att : Logical;
		Color_Att : Text;
		FontName_Att : Text;
		Italic_Att : Logical;
		Outline_Att : Logical;
		Shadow_Att : Logical;
		Size_Att : Double;
		StrikeThrough_Att : Logical;
		Underline_Att : UnderlineType?;
		VerticalAlign_Att : VerticalAlignType?;
	};

	type UnderlineType {"ut_None", "ut_Single", "ut_Double", "ut_SingleAccounting", "ut_DoubleAccounting"};

	type VerticalAlignType {"vat_None", "vat_Subscript", "vat_Superscript"};

	type InteriorType {
		It_styleType_Ref : StyleType;
		Color_Att : Text;
		Pattern_Att : PatternType?;
		PatternColor_Att : Text;
	};

	type PatternType {"pt_None", "pt_Solid", "pt_Gray75", "pt_Gray50", "pt_Gray25", "pt_Gray125", "pt_Gray0625", "pt_HorzStripe", "pt_VertStripe", "pt_ReverseDiagStripe", "pt_DiagStripe", "pt_DiagCross", "pt_ThickDiagCross", "pt_ThinHorzStripe", "pt_ThinVertStripe", "pt_ThinReverseDiagStripe", "pt_ThinDiagStripe", "pt_ThinHorzCross", "pt_ThinDiagCross"};

	type NumberFormatType {
		Nft_styleType_Ref : StyleType;
		Format_Att : ExcelNumberFormatType?;
	};

	type ExcelNumberFormatType {"enft_General", "enft_General_Number", "enft_General_Date", "enft_Long_Date", "enft_Medium_Date", "enft_Short_Date", "enft_Long_Time", "enft_Medium_Time", "enft_Short_Time", "enft_Currency", "enft_Euro_Currency", "enft_Fixed", "enft_Standard", "enft_Percent", "enft_Scientific", "enft_Yes_No", "enft_True_False", "enft_On_Off"};

	type NamesType {
		Nt_workbook_Ref : Workbook;
		NamedRanges_ContRef : NamedRange*;
	};

	type NamedRange {
		Nr_namesType_Ref : NamesType;
		Name_Att : Text;
		RefersTo_Att : Text;
		Hidden_Att : Logical;
	};
}