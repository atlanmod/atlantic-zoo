module WordprocessingMLStyles {

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

	type ValueType;

	type StringValue : ValueType {
		Value_Att : Text;
	};

	type FloatValue : ValueType {
		Value_Att : Double;
	};

	type DateTimeTypeValue : ValueType {
		Value_Ref : DateTimeType;
	};

	type BooleanValue : ValueType {
		Value_Att : Logical;
	};

	type DocumentPropertiesCollection {
		Dp_wordDocument_Ref : WordDocument;
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
		Cdp_wordDocument_Ref : WordDocument;
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
		St_wordDocument_Ref : WordDocument;
		SmartTagTypes_ContRef : SmartTagType*;
	};

	type StringProperty : StringType;

	type StringType {
		Val_Att : Text;
	};

	type BreakType {"bt_page", "bt_column", "bt_text_wrapping"};

	type NoteValue {"ftn_normal", "ftn_separator", "ftn_continuation_separator", "ftn_continuation_notice"};

	type OnOffType {"oot_on", "oot_off"};

	type FldCharTypeProperty {"fctp_begin", "fctp_separate", "fctp_end"};

	type HintType {"ht_default", "ht_fareast", "ht_cs"};

	type StyleKindValue {"skv_paragraph", "skv_character", "skv_table", "skv_list"};

	type UnderlineProperty {
		Val_Att : UnderlineValues?;
		Color_Att : Text;
	};

	type UnderlineValues {"uv_single", "uv_words", "uv_double", "uv_thick", "uv_dotted", "uv_dotted_heavy", "uv_dash", "uv_dashed_heavy", "uv_dash_long", "uv_dash_long_heavy", "uv_dot_dash", "uv_dash_dot_heavy", "uv_dot_dot_dash", "uv_dash_dot_dot_heavy", "uv_wave", "uv_wavy_heavy", "uv_wavy_double", "uv_none"};

	type HighlightColorValues {"hcv_black", "hcv_blue", "hcv_cyan", "hcv_green", "hcv_magenta", "hcv_red", "hcv_yellow", "hcv_white", "hcv_dark_blue", "hcv_dark_cyan", "hcv_dark_green", "hcv_dark_magenta", "hcv_dark_red", "hcv_dark_yellow", "hcv_dark_gray", "hcv_light_gray", "hcv_none"};

	type VerticalAlignRunType {"vart_baseline", "vart_superscript", "vart_subscript"};

	type JustificationValue {"jv_left", "jv_center", "jv_right", "jv_both"};

	type WordDocument {
		Wd_smartTags_ContRef : SmartTagsCollection?;
		Wd_docProperties_ContRef : DocumentPropertiesCollection?;
		Wd_customDocProperties_ContRef : CustomDocumentPropertiesCollection?;
		IgnoreSubtree_ContRef : StringProperty?;
		IgnoreElements_ContRef : StringProperty?;
		Fonts_ContRef : FontsListElt?;
		Lists_ContRef : ListsElt?;
		Styles_ContRef : StylesElt?;
		DocPr_ContRef : DocPrElt?;
		Body_ContRef : BodyElt;
	};

	type DocPrElt {
		Dpe_wordDocument_Ref : WordDocument;
	};

	type BodyElt {
		Be_wordDocument_Ref : WordDocument;
		BlockLevelElts_ContRef : BlockLevelElt*;
		SectPr_ContRef : SectPrElt?;
	};

	type BlockLevelElt {
		Ble_bodyElt_Ref : BodyElt;
		Ble_note_Ref : NoteElt;
		Ble_tableCellElt_Ref : TableCellElt;
	};

	type BlockLevelChunkElt : BlockLevelElt;

	type ParaElt : BlockLevelChunkElt {
		PPr_ContRef : ParaPrElt?;
		PContentElts_ContRef : ParaContentElt*;
	};

	type ParaPrElt {
		Ppe_pElt_Ref : ParaElt;
		Ppe_styleElt_Ref : StyleElt;
		PStyle_ContRef : StringProperty?;
		KeepNext_Att : OnOffType?;
		KeepLines_Att : OnOffType?;
		PageBreakBefore_Att : OnOffType?;
		SupressLineNumbers_Att : OnOffType?;
		SuppressAutoHyphens_Att : OnOffType?;
		ContextualSpacing_Att : OnOffType?;
		Bidi_Att : OnOffType?;
		Justification_Att : JustificationValue?;
	};

	type ParaContentElt {
		Pce_pElt_Ref : ParaElt;
	};

	type RunElt : ParaContentElt {
		RPr_ContRef : RunPrElt?;
		RContentElts_ContRef : RunContentElt*;
	};

	type RunPrElt {
		Rpe_rElt_Ref : RunElt;
		Rpe_styleElt_Ref : StyleElt;
		RStyle_ContRef : StringProperty?;
		RFonts_ContRef : FontsElt?;
		Bold_Att : OnOffType?;
		Bold_cs_Att : OnOffType?;
		Italic_Att : OnOffType?;
		Italic_cs_Att : OnOffType?;
		Capitals_Att : OnOffType?;
		SmallCapitals_Att : OnOffType?;
		Strike_Att : OnOffType?;
		DoubleStrike_Att : OnOffType?;
		Outline_Att : OnOffType?;
		Shadow_Att : OnOffType?;
		Emboss_Att : OnOffType?;
		Imprint_Att : OnOffType?;
		NoProof_Att : OnOffType?;
		Vanish_Att : OnOffType?;
		SpecVanish_Att : OnOffType?;
		Rtl_Att : OnOffType?;
		Cs_Att : OnOffType?;
		Underline_Ref : UnderlineProperty?;
		Color_Att : Text;
		Highlight_Att : HighlightColorValues?;
		VerticalAlign_Att : VerticalAlignRunType?;
		Language_Ref : LangElt?;
	};

	type LangElt {
		Le_runPrElt_Ref : RunPrElt;
		Val_Att : Text;
		Bidi_Att : Text;
	};

	type RunContentElt {
		Rce_rElt_Ref : RunElt;
	};

	type BreakElt : RunContentElt {
		Type_Att : BreakType?;
	};

	type Text : RunContentElt, StringType;

	type DelText : RunContentElt, StringType;

	type InstrText : RunContentElt, StringType;

	type DelInstrText : RunContentElt, StringType;

	type NoBreakHyphen : RunContentElt;

	type SoftHyphen : RunContentElt;

	type AnnotationRef : RunContentElt;

	type FootnoteRef : RunContentElt;

	type EndnoteRef : RunContentElt;

	type Separator : RunContentElt;

	type ContinuationSeparator : RunContentElt;

	type PgNum : RunContentElt;

	type Cr : RunContentElt;

	type Footnote : RunContentElt, NoteElt;

	type Endnote : RunContentElt, NoteElt;

	type NoteElt {
		N_blockLevelElts_ContRef : BlockLevelElt+;
		Type_Att : NoteValue?;
		SuppressRef_Att : OnOffType?;
	};

	type Picture : RunContentElt, PictureType;

	type Symbol : RunContentElt, SymElt;

	type SymElt {
		Font_ContRef : StringType;
		Char_ContRef : StringType;
	};

	type Tab : RunContentElt, TabElt;

	type FldChar : RunContentElt, FldCharElt;

	type FldCharElt {
		FldData_ContRef : StringType?;
		FldCharType_Att : FldCharTypeProperty;
		FldLock_Att : OnOffType;
	};

	type TableElt : BlockLevelChunkElt {
		TblPr_ContRef : TablePrElt;
		TblGrid_ContRef : TableGridElt;
		TblContent_ContRef : TableContentElt+;
	};

	type TablePrElt {
		Tpe_tblElt_Ref : TableElt;
		Tpe_styleElt_Ref : StyleElt;
	};

	type TableGridElt {
		Tge_tblElt_Ref : TableElt;
	};

	type TableContentElt {
		Tce_tblElt_Ref : TableElt;
		Tr_ContRef : RowElt*;
		Tce_runLevelElts_ContRef : RunLevelElt?;
	};

	type RowElt {
		Re_tblContentElt_Ref : TableContentElt;
		TblPrEx_ContRef : TablePrExElt?;
		TrPr_ContRef : TableRowPrElt?;
		RowContent_ContRef : RowContentElt+;
	};

	type TablePrExElt {
		Tpee_rowElt_Ref : RowElt;
	};

	type TableRowPrElt {
		Tpe_rowElt_Ref : RowElt;
		Trpe_styleElt_Ref : StyleElt;
	};

	type RowContentElt {
		Rce_rowElt_Ref : RowElt;
		Tc_ContRef : TableCellElt*;
		Rce_runLevelElts_ContRef : RunLevelElt?;
	};

	type TableCellElt {
		Tce_rowContentElt_Ref : RowContentElt;
		TcPr_ContRef : TableCellPrElt?;
		Tce_content_ContRef : BlockLevelElt+;
	};

	type TableCellPrElt {
		Tcpe_tableCellElt_Ref : TableCellElt;
		Tcpe_styleElt_Ref : StyleElt;
	};

	type FontsListElt {
		Fle_wordDocument_Ref : WordDocument;
		DefaultFonts_ContRef : FontsElt?;
		Fonts_ContRef : FontElt*;
	};

	type FontsElt {
		Fse_fontsListElt_Ref : FontsListElt;
		Fse_runPrElt_Ref : RunPrElt;
		Hint_Att : HintType;
		Ascii_ContRef : StringType;
		H_ansi_ContRef : StringType;
		Fareast_ContRef : StringType;
		Cs_ContRef : StringType;
	};

	type FontElt {
		Fe_fontsListElt_Ref : FontsListElt;
		Name_ContRef : StringType;
		AltName_ContRef : StringProperty?;
	};

	type StylesElt {
		Se_wordDocument_Ref : WordDocument;
		VersionOfBuiltInStylenames_Att : Double;
		Styles_Ref : StyleElt*;
	};

	type StyleElt {
		Se_stylesElt_Ref : StylesElt;
		Type_Att : StyleKindValue?;
		StyleId_ContRef : StringType?;
		Default_Att : OnOffType?;
		Name_ContRef : StringProperty?;
		Aliases_ContRef : StringProperty?;
		Sti_Att : Double;
		BasedOn_ContRef : StringProperty?;
		Next_ContRef : StringProperty?;
		Link_ContRef : StringProperty?;
		AutoRedefine_Att : OnOffType?;
		Hidden_Att : OnOffType?;
		SemiHidden_Att : OnOffType?;
		Locked_Att : OnOffType?;
		Personal_Att : OnOffType?;
		PersonalCompose_Att : OnOffType?;
		PersonalReply_Att : OnOffType?;
		Rsid_ContRef : StringType?;
		Se_pPr_Ref : ParaPrElt?;
		Se_rPr_Ref : RunPrElt?;
		Se_tblPr_Ref : TablePrElt?;
		Se_trPr_Ref : TableRowPrElt?;
		Se_tcPr_Ref : TableCellPrElt?;
	};

	type ListsElt {
		Le_wordDocument_Ref : WordDocument;
	};

	type SectPrElt {
		Spe_bodyElt_Ref : BodyElt;
	};

	type RunLevelElt : BlockLevelChunkElt {
		Rle_tblContentElt_Ref : TableContentElt;
		Rle_rowContentElt_Ref : RowContentElt;
	};

	type CfChunk : BlockLevelElt;

	type SimpleFieldElt : ParaContentElt;

	type HLinkElt : ParaContentElt;

	type SubDocElt : ParaContentElt;

	type PictureType;

	type TabElt;
}