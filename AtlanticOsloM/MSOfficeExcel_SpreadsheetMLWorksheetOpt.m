module SpreadsheetMLWorksheetOpt {

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

	type StyledElement;

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
	};

	type ExcelWorksheetTypeType {"ewt_Worksheet", "ewt_Chart", "ewt_Macro", "ewt_Dialog"};

	type VisibleType {"vt_SheetVisible", "vt_SheetHidden", "vt_SheetVeryHidden"};

	type EnableSelectionType {"est_UnlockedCells", "est_NoSelection"};
}