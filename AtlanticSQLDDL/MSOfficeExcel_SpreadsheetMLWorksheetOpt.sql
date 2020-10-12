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

CREATE TABLE VersionType (
	__IDVersionType__ Integer NOT NULL,
	n Integer,
	nn Integer,
	PRIMARY KEY VersionType (__IDVersionType__)
) ;

CREATE TABLE ValueType (
	__IDValueType__ Integer NOT NULL,
	FOREIGN KEY vt_data (__FKvt_data__) REFERENCES Data (__IDData__),
	PRIMARY KEY ValueType (__IDValueType__),
	__FKvt_data__ Integer
) ;

CREATE TABLE StringValue (
	__IDStringValue__ Integer NOT NULL,
	value text,
	PRIMARY KEY StringValue (__IDStringValue__)
) ;

CREATE TABLE NumberValue (
	__IDNumberValue__ Integer NOT NULL,
	value "Double",
	PRIMARY KEY NumberValue (__IDNumberValue__)
) ;

CREATE TABLE DateTimeTypeValue (
	__IDDateTimeTypeValue__ Integer NOT NULL,
	FOREIGN KEY value (__FKvalue__) REFERENCES DateTimeType (__IDDateTimeType__),
	PRIMARY KEY DateTimeTypeValue (__IDDateTimeTypeValue__),
	__FKvalue__ Integer
) ;

CREATE TABLE BooleanValue (
	__IDBooleanValue__ Integer NOT NULL,
	value Boolean,
	PRIMARY KEY BooleanValue (__IDBooleanValue__)
) ;

CREATE TABLE ErrorValue (
	__IDErrorValue__ Integer NOT NULL,
	PRIMARY KEY ErrorValue (__IDErrorValue__)
) ;

CREATE TABLE DocumentPropertiesCollection (
	__IDDocumentPropertiesCollection__ Integer NOT NULL,
	FOREIGN KEY dp_workbook (__FKdp_workbook__) REFERENCES Workbook (__IDWorkbook__),
	title text,
	subject text,
	keywords text,
	description text,
	category text,
	author text,
	lastAuthor text,
	manager text,
	company text,
	hyperlinkBase text,
	revision Integer,
	presentationFormat text,
	guid text,
	appName text,
	FOREIGN KEY version (__FKversion__) REFERENCES VersionType (__IDVersionType__),
	totalTime Integer,
	FOREIGN KEY lastPrinted (__FKlastPrinted__) REFERENCES DateTimeType (__IDDateTimeType__),
	FOREIGN KEY created (__FKcreated__) REFERENCES DateTimeType (__IDDateTimeType__),
	FOREIGN KEY lastSaved (__FKlastSaved__) REFERENCES DateTimeType (__IDDateTimeType__),
	pages Integer,
	words Integer,
	characters Integer,
	charactersWithSpaces Integer,
	bytes Integer,
	"lines" Integer,
	paragraphs Integer,
	PRIMARY KEY DocumentPropertiesCollection (__IDDocumentPropertiesCollection__),
	__FKdp_workbook__ Integer,
	__FKlastPrinted__ Integer,
	__FKversion__ Integer,
	__FKcreated__ Integer,
	__FKlastSaved__ Integer
) ;

CREATE TABLE CustomDocumentPropertiesCollection (
	__IDCustomDocumentPropertiesCollection__ Integer NOT NULL,
	FOREIGN KEY cdp_workbook (__FKcdp_workbook__) REFERENCES Workbook (__IDWorkbook__),
	PRIMARY KEY CustomDocumentPropertiesCollection (__IDCustomDocumentPropertiesCollection__),
	__FKcdp_workbook__ Integer
) ;

CREATE TABLE CustomDocumentProperty (
	__IDCustomDocumentProperty__ Integer NOT NULL,
	FOREIGN KEY customDocumentProperty_cdpe (__FKcustomDocumentProperty_cdpe__) REFERENCES CustomDocumentPropertiesCollection (__IDCustomDocumentPropertiesCollection__),
	name text,
	FOREIGN KEY value (__FKvalue__) REFERENCES ValueType (__IDValueType__),
	PRIMARY KEY CustomDocumentProperty (__IDCustomDocumentProperty__),
	__FKcustomDocumentProperty_cdpe__ Integer,
	__FKvalue__ Integer
) ;

CREATE TABLE SmartTagType (
	__IDSmartTagType__ Integer NOT NULL,
	FOREIGN KEY smartTagType_ste (__FKsmartTagType_ste__) REFERENCES SmartTagsCollection (__IDSmartTagsCollection__),
	namespaceuri text,
	name text,
	url text,
	PRIMARY KEY SmartTagType (__IDSmartTagType__),
	__FKsmartTagType_ste__ Integer
) ;

CREATE TABLE SmartTagsCollection (
	__IDSmartTagsCollection__ Integer NOT NULL,
	FOREIGN KEY st_workbook (__FKst_workbook__) REFERENCES Workbook (__IDWorkbook__),
	FOREIGN KEY st_cell (__FKst_cell__) REFERENCES Cell (__IDCell__),
	PRIMARY KEY SmartTagsCollection (__IDSmartTagsCollection__),
	__FKst_workbook__ Integer,
	__FKst_cell__ Integer
) ;

CREATE TABLE Workbook (
	__IDWorkbook__ Integer NOT NULL,
	FOREIGN KEY wb_smartTags (__FKwb_smartTags__) REFERENCES SmartTagsCollection (__IDSmartTagsCollection__),
	FOREIGN KEY wb_docProperties (__FKwb_docProperties__) REFERENCES DocumentPropertiesCollection (__IDDocumentPropertiesCollection__),
	FOREIGN KEY wb_customDocProperties (__FKwb_customDocProperties__) REFERENCES CustomDocumentPropertiesCollection (__IDCustomDocumentPropertiesCollection__),
	FOREIGN KEY wb_excelWorkbook (__FKwb_excelWorkbook__) REFERENCES ExcelWorkbook (__IDExcelWorkbook__),
	PRIMARY KEY Workbook (__IDWorkbook__),
	__FKwb_customDocProperties__ Integer,
	__FKwb_smartTags__ Integer,
	__FKwb_excelWorkbook__ Integer,
	__FKwb_docProperties__ Integer
) ;

CREATE TABLE Worksheet (
	__IDWorksheet__ Integer NOT NULL,
	FOREIGN KEY ws_workbook (__FKws_workbook__) REFERENCES Workbook (__IDWorkbook__),
	FOREIGN KEY ws_table (__FKws_table__) REFERENCES "Table" (__IDTable__),
	name text,
	protected Boolean,
	rightToLeft Boolean,
	FOREIGN KEY w_worksheetOptions (__FKw_worksheetOptions__) REFERENCES WorksheetOptionsElt (__IDWorksheetOptionsElt__),
	PRIMARY KEY Worksheet (__IDWorksheet__),
	__FKws_table__ Integer,
	__FKw_worksheetOptions__ Integer,
	__FKws_workbook__ Integer
) ;

CREATE TABLE StyledElement (
	__IDStyledElement__ Integer NOT NULL,
	PRIMARY KEY StyledElement (__IDStyledElement__)
) ;

CREATE TABLE "Table" (
	__IDTable__ Integer NOT NULL,
	FOREIGN KEY t_worksheet (__FKt_worksheet__) REFERENCES Worksheet (__IDWorksheet__),
	defaultColumnWidth "Double",
	defaultRowHeight "Double",
	expandedColumnCount Integer,
	expandedRowCount Integer,
	leftCell Integer,
	topCell Integer,
	fullColumns Boolean,
	fullRows Boolean,
	PRIMARY KEY "Table" (__IDTable__),
	__FKt_worksheet__ Integer
) ;

CREATE TABLE TableElement (
	__IDTableElement__ Integer NOT NULL,
	"index" Integer,
	PRIMARY KEY TableElement (__IDTableElement__)
) ;

CREATE TABLE ColOrRowElement (
	__IDColOrRowElement__ Integer NOT NULL,
	hidden Boolean,
	span Integer,
	PRIMARY KEY ColOrRowElement (__IDColOrRowElement__)
) ;

CREATE TABLE "Column" (
	__IDColumn__ Integer NOT NULL,
	FOREIGN KEY c_table (__FKc_table__) REFERENCES "Table" (__IDTable__),
	autoFitWidth Boolean,
	width "Double",
	PRIMARY KEY "Column" (__IDColumn__),
	__FKc_table__ Integer
) ;

CREATE TABLE Row (
	__IDRow__ Integer NOT NULL,
	FOREIGN KEY r_table (__FKr_table__) REFERENCES "Table" (__IDTable__),
	autoFitHeight Boolean,
	height "Double",
	PRIMARY KEY Row (__IDRow__),
	__FKr_table__ Integer
) ;

CREATE TABLE Cell (
	__IDCell__ Integer NOT NULL,
	FOREIGN KEY c_row (__FKc_row__) REFERENCES Row (__IDRow__),
	arrayRange text,
	formula text,
	hRef text,
	mergeAcross "Double",
	mergeDown "Double",
	FOREIGN KEY c_data (__FKc_data__) REFERENCES Data (__IDData__),
	FOREIGN KEY c_comment (__FKc_comment__) REFERENCES Comment (__IDComment__),
	PRIMARY KEY Cell (__IDCell__),
	__FKc_comment__ Integer,
	__FKc_row__ Integer,
	__FKc_data__ Integer
) ;

CREATE TABLE Comment (
	__IDComment__ Integer NOT NULL,
	FOREIGN KEY c_cell (__FKc_cell__) REFERENCES Cell (__IDCell__),
	FOREIGN KEY com_data (__FKcom_data__) REFERENCES Data (__IDData__),
	author text,
	showAlways Boolean,
	PRIMARY KEY Comment (__IDComment__),
	__FKcom_data__ Integer,
	__FKc_cell__ Integer
) ;

CREATE TABLE Data (
	__IDData__ Integer NOT NULL,
	FOREIGN KEY d_cell (__FKd_cell__) REFERENCES Cell (__IDCell__),
	FOREIGN KEY d_comment (__FKd_comment__) REFERENCES Comment (__IDComment__),
	FOREIGN KEY value (__FKvalue__) REFERENCES ValueType (__IDValueType__),
	PRIMARY KEY Data (__IDData__),
	__FKd_comment__ Integer,
	__FKvalue__ Integer,
	__FKd_cell__ Integer
) ;

CREATE TABLE ExcelWorkbook (
	__IDExcelWorkbook__ Integer NOT NULL,
	FOREIGN KEY ew_workbook (__FKew_workbook__) REFERENCES Workbook (__IDWorkbook__),
	selectedSheets Integer,
	windowHidden Boolean,
	hideHorizontalScrollBar Boolean,
	hideVerticalScrollBar Boolean,
	hideWorkbookTabs Boolean,
	windowHeight "Double",
	windowWidth "Double",
	windowTopX "Double",
	windowTopY "Double",
	activeSheet Integer,
	activeChart text,
	firstVisibleSheet Integer,
	hidePivotTableFieldList Boolean,
	protectStructure Boolean,
	protectWindows Boolean,
	displayInkNotes Boolean,
	embedSaveSmartTags Boolean,
	futureVer text,
	tabRatio Integer,
	windowIconic Boolean,
	displayDrawingObjects text,
	createBackup Boolean,
	calculation text,
	doNotCalculateBeforeSave Boolean,
	date1904 Boolean,
	refModeR1C1 Boolean,
	iteration Boolean,
	maxIterations Integer,
	maxChange "Double",
	precisionAsDisplayed Boolean,
	doNotSaveLinkValues Boolean,
	noAutoRecover Boolean,
	acceptLabelsInFormulas Boolean,
	uncalced Boolean,
	PRIMARY KEY ExcelWorkbook (__IDExcelWorkbook__),
	__FKew_workbook__ Integer
) ;

CREATE TABLE WorksheetOptionsElt (
	__IDWorksheetOptionsElt__ Integer NOT NULL,
	FOREIGN KEY wo_worksheet (__FKwo_worksheet__) REFERENCES Worksheet (__IDWorksheet__),
	fitToPage Boolean,
	doNotDisplayColHeaders Boolean,
	doNotDisplayRowHeaders Boolean,
	gridlineColor text,
	name text,
	excelWorksheetType text,
	intlMacro Boolean,
	unsynced Boolean,
	selected Boolean,
	codeName text,
	displayPageBreak Boolean,
	transitionExpressionEvaluation Boolean,
	transitionFormulaEntry Boolean,
	zoom Integer,
	pageBreakZoom Integer,
	showPageBreakZoom Boolean,
	defaultRowHeight Integer,
	defaultColumnWidth Integer,
	standardWidth Integer,
	visible text,
	leftColumnVisible Integer,
	displayRightToLeft Boolean,
	gridlineColorIndex Integer,
	displayFormulas Boolean,
	doNotDisplayGridlines Boolean,
	doNotDisplayHeadings Boolean,
	doNotDisplayOutline Boolean,
	applyAutomaticOutlineStyles Boolean,
	noSummaryRowsBelowDetail Boolean,
	noSummaryColumnsRightDetail Boolean,
	doNotDisplayZeros Boolean,
	activeRow Integer,
	activeColumn Integer,
	filterOn Boolean,
	rangeSelection text,
	topRowVisible Integer,
	topRowBottomPane Integer,
	leftColumnRightPane Integer,
	activePane Integer,
	splitHorizontal Integer,
	splitVertical Integer,
	freezePanes Boolean,
	frozenNoSplit Boolean,
	tabColorIndex Integer,
	protectContentst Boolean,
	protectObjects Boolean,
	protectScenarios Boolean,
	enableSelection text,
	allowFormatCells Boolean,
	allowSizeCols Boolean,
	allowSizeRows Boolean,
	allowInsertCols Boolean,
	allowInsertRows Boolean,
	allowInsertHyperlinks Boolean,
	allowDeleteCols Boolean,
	allowDeleteRows Boolean,
	allowSort Boolean,
	allowFilter Boolean,
	allowUsePivotTables Boolean,
	PRIMARY KEY WorksheetOptionsElt (__IDWorksheetOptionsElt__),
	__FKwo_worksheet__ Integer
) ;

CREATE TABLE Table_t_cols_Column (
	__IDTable__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;

CREATE TABLE Table_t_rows_Row (
	__IDTable__ Integer NOT NULL,
	__IDRow__ Integer NOT NULL
) ;

CREATE TABLE Cell_c_smartTags_SmartTagsCollection (
	__IDCell__ Integer NOT NULL,
	__IDSmartTagsCollection__ Integer NOT NULL
) ;

CREATE TABLE Workbook_wb_worksheets_Worksheet (
	__IDWorkbook__ Integer NOT NULL,
	__IDWorksheet__ Integer NOT NULL
) ;

CREATE TABLE SmartTagsCollection_smartTagTypes_SmartTagType (
	__IDSmartTagsCollection__ Integer NOT NULL,
	__IDSmartTagType__ Integer NOT NULL
) ;

CREATE TABLE CustomDocumentPropertiesCollection_customDocumentProperties_CustomDocumentProperty (
	__IDCustomDocumentPropertiesCollection__ Integer NOT NULL,
	__IDCustomDocumentProperty__ Integer NOT NULL
) ;

CREATE TABLE Row_r_cells_Cell (
	__IDRow__ Integer NOT NULL,
	__IDCell__ Integer NOT NULL
) ;
