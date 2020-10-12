module WordprocessingMLBasicDef {

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
	};

	type BlockLevelChunkElt : BlockLevelElt;

	type ParaElt : BlockLevelChunkElt {
		PPr_ContRef : ParaPrElt?;
		PContentElts_ContRef : ParaContentElt*;
	};

	type ParaPrElt {
		Ppe_pElt_Ref : ParaElt;
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

	type FontsListElt {
		Fle_wordDocument_Ref : WordDocument;
	};

	type ListsElt {
		Le_wordDocument_Ref : WordDocument;
	};

	type StylesElt {
		Se_wordDocument_Ref : WordDocument;
	};

	type SectPrElt {
		Spe_bodyElt_Ref : BodyElt;
	};

	type RunLevelElt : BlockLevelChunkElt;

	type CfChunk : BlockLevelElt;

	type SimpleFieldElt : ParaContentElt;

	type HLinkElt : ParaContentElt;

	type SubDocElt : ParaContentElt;

	type PictureType;

	type TabElt;
}