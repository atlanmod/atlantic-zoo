module WordprocessingMLBasicDef {

	type StringProperty : StringType;

	type StringType {
		Val_Att : Text;
	};

	type BreakType {"bt_page", "bt_column", "bt_text_wrapping"};

	type NoteValue {"ftn_normal", "ftn_separator", "ftn_continuation_separator", "ftn_continuation_notice"};

	type OnOffType {"oot_on", "oot_off"};

	type FldCharTypeProperty {"fctp_begin", "fctp_separate", "fctp_end"};

	type WordDocument {
		IgnoreSubtree_ContRef : StringProperty?;
		IgnoreElements_ContRef : StringProperty?;
		Body_ContRef : BodyElt;
	};

	type BodyElt {
		Be_wordDocument_Ref : WordDocument;
		BlockLevelElts_ContRef : BlockLevelElt*;
	};

	type BlockLevelElt {
		Ble_bodyElt_Ref : BodyElt;
		Ble_note_Ref : NoteElt;
	};

	type BlockLevelChunkElt : BlockLevelElt;

	type ParaElt : BlockLevelChunkElt {
		PContentElts_ContRef : ParaContentElt*;
	};

	type ParaContentElt {
		Pce_pElt_Ref : ParaElt;
	};

	type RunElt : ParaContentElt {
		RContentElts_ContRef : RunContentElt*;
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

	type Picture : RunContentElt;

	type Symbol : RunContentElt, SymElt;

	type SymElt {
		Font_ContRef : StringType;
		Char_ContRef : StringType;
	};

	type Tab : RunContentElt;

	type FldChar : RunContentElt, FldCharElt;

	type FldCharElt {
		FldData_ContRef : StringType?;
		FldCharType_Att : FldCharTypeProperty;
		FldLock_Att : OnOffType;
	};
}