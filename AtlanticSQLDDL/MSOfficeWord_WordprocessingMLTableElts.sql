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
	PRIMARY KEY ValueType (__IDValueType__)
) ;

CREATE TABLE StringValue (
	__IDStringValue__ Integer NOT NULL,
	value text,
	PRIMARY KEY StringValue (__IDStringValue__)
) ;

CREATE TABLE FloatValue (
	__IDFloatValue__ Integer NOT NULL,
	value "Double",
	PRIMARY KEY FloatValue (__IDFloatValue__)
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

CREATE TABLE DocumentPropertiesCollection (
	__IDDocumentPropertiesCollection__ Integer NOT NULL,
	FOREIGN KEY dp_wordDocument (__FKdp_wordDocument__) REFERENCES WordDocument (__IDWordDocument__),
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
	__FKversion__ Integer,
	__FKlastPrinted__ Integer,
	__FKcreated__ Integer,
	__FKdp_wordDocument__ Integer,
	__FKlastSaved__ Integer
) ;

CREATE TABLE CustomDocumentPropertiesCollection (
	__IDCustomDocumentPropertiesCollection__ Integer NOT NULL,
	FOREIGN KEY cdp_wordDocument (__FKcdp_wordDocument__) REFERENCES WordDocument (__IDWordDocument__),
	PRIMARY KEY CustomDocumentPropertiesCollection (__IDCustomDocumentPropertiesCollection__),
	__FKcdp_wordDocument__ Integer
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
	FOREIGN KEY st_wordDocument (__FKst_wordDocument__) REFERENCES WordDocument (__IDWordDocument__),
	PRIMARY KEY SmartTagsCollection (__IDSmartTagsCollection__),
	__FKst_wordDocument__ Integer
) ;

CREATE TABLE StringProperty (
	__IDStringProperty__ Integer NOT NULL,
	PRIMARY KEY StringProperty (__IDStringProperty__)
) ;

CREATE TABLE StringType (
	__IDStringType__ Integer NOT NULL,
	val text,
	PRIMARY KEY StringType (__IDStringType__)
) ;

CREATE TABLE WordDocument (
	__IDWordDocument__ Integer NOT NULL,
	FOREIGN KEY wd_smartTags (__FKwd_smartTags__) REFERENCES SmartTagsCollection (__IDSmartTagsCollection__),
	FOREIGN KEY wd_docProperties (__FKwd_docProperties__) REFERENCES DocumentPropertiesCollection (__IDDocumentPropertiesCollection__),
	FOREIGN KEY wd_customDocProperties (__FKwd_customDocProperties__) REFERENCES CustomDocumentPropertiesCollection (__IDCustomDocumentPropertiesCollection__),
	FOREIGN KEY ignoreSubtree (__FKignoreSubtree__) REFERENCES StringProperty (__IDStringProperty__),
	FOREIGN KEY ignoreElements (__FKignoreElements__) REFERENCES StringProperty (__IDStringProperty__),
	FOREIGN KEY fonts (__FKfonts__) REFERENCES FontsListElt (__IDFontsListElt__),
	FOREIGN KEY lists (__FKlists__) REFERENCES ListsElt (__IDListsElt__),
	FOREIGN KEY styles (__FKstyles__) REFERENCES StylesElt (__IDStylesElt__),
	FOREIGN KEY docPr (__FKdocPr__) REFERENCES DocPrElt (__IDDocPrElt__),
	FOREIGN KEY body (__FKbody__) REFERENCES BodyElt (__IDBodyElt__),
	PRIMARY KEY WordDocument (__IDWordDocument__),
	__FKignoreElements__ Integer,
	__FKlists__ Integer,
	__FKstyles__ Integer,
	__FKwd_docProperties__ Integer,
	__FKbody__ Integer,
	__FKdocPr__ Integer,
	__FKfonts__ Integer,
	__FKignoreSubtree__ Integer,
	__FKwd_smartTags__ Integer,
	__FKwd_customDocProperties__ Integer
) ;

CREATE TABLE DocPrElt (
	__IDDocPrElt__ Integer NOT NULL,
	FOREIGN KEY dpe_wordDocument (__FKdpe_wordDocument__) REFERENCES WordDocument (__IDWordDocument__),
	PRIMARY KEY DocPrElt (__IDDocPrElt__),
	__FKdpe_wordDocument__ Integer
) ;

CREATE TABLE BodyElt (
	__IDBodyElt__ Integer NOT NULL,
	FOREIGN KEY be_wordDocument (__FKbe_wordDocument__) REFERENCES WordDocument (__IDWordDocument__),
	FOREIGN KEY sectPr (__FKsectPr__) REFERENCES SectPrElt (__IDSectPrElt__),
	PRIMARY KEY BodyElt (__IDBodyElt__),
	__FKbe_wordDocument__ Integer,
	__FKsectPr__ Integer
) ;

CREATE TABLE BlockLevelElt (
	__IDBlockLevelElt__ Integer NOT NULL,
	FOREIGN KEY ble_bodyElt (__FKble_bodyElt__) REFERENCES BodyElt (__IDBodyElt__),
	FOREIGN KEY ble_note (__FKble_note__) REFERENCES NoteElt (__IDNoteElt__),
	FOREIGN KEY ble_tableCellElt (__FKble_tableCellElt__) REFERENCES TableCellElt (__IDTableCellElt__),
	PRIMARY KEY BlockLevelElt (__IDBlockLevelElt__),
	__FKble_tableCellElt__ Integer,
	__FKble_note__ Integer,
	__FKble_bodyElt__ Integer
) ;

CREATE TABLE BlockLevelChunkElt (
	__IDBlockLevelChunkElt__ Integer NOT NULL,
	PRIMARY KEY BlockLevelChunkElt (__IDBlockLevelChunkElt__)
) ;

CREATE TABLE ParaElt (
	__IDParaElt__ Integer NOT NULL,
	FOREIGN KEY pPr (__FKpPr__) REFERENCES ParaPrElt (__IDParaPrElt__),
	PRIMARY KEY ParaElt (__IDParaElt__),
	__FKpPr__ Integer
) ;

CREATE TABLE ParaPrElt (
	__IDParaPrElt__ Integer NOT NULL,
	FOREIGN KEY ppe_pElt (__FKppe_pElt__) REFERENCES ParaElt (__IDParaElt__),
	PRIMARY KEY ParaPrElt (__IDParaPrElt__),
	__FKppe_pElt__ Integer
) ;

CREATE TABLE ParaContentElt (
	__IDParaContentElt__ Integer NOT NULL,
	FOREIGN KEY pce_pElt (__FKpce_pElt__) REFERENCES ParaElt (__IDParaElt__),
	PRIMARY KEY ParaContentElt (__IDParaContentElt__),
	__FKpce_pElt__ Integer
) ;

CREATE TABLE RunElt (
	__IDRunElt__ Integer NOT NULL,
	FOREIGN KEY rPr (__FKrPr__) REFERENCES RunPrElt (__IDRunPrElt__),
	PRIMARY KEY RunElt (__IDRunElt__),
	__FKrPr__ Integer
) ;

CREATE TABLE RunPrElt (
	__IDRunPrElt__ Integer NOT NULL,
	FOREIGN KEY rpe_rElt (__FKrpe_rElt__) REFERENCES RunElt (__IDRunElt__),
	PRIMARY KEY RunPrElt (__IDRunPrElt__),
	__FKrpe_rElt__ Integer
) ;

CREATE TABLE RunContentElt (
	__IDRunContentElt__ Integer NOT NULL,
	FOREIGN KEY rce_rElt (__FKrce_rElt__) REFERENCES RunElt (__IDRunElt__),
	PRIMARY KEY RunContentElt (__IDRunContentElt__),
	__FKrce_rElt__ Integer
) ;

CREATE TABLE BreakElt (
	__IDBreakElt__ Integer NOT NULL,
	type text,
	PRIMARY KEY BreakElt (__IDBreakElt__)
) ;

CREATE TABLE Text (
	__IDText__ Integer NOT NULL,
	PRIMARY KEY Text (__IDText__)
) ;

CREATE TABLE DelText (
	__IDDelText__ Integer NOT NULL,
	PRIMARY KEY DelText (__IDDelText__)
) ;

CREATE TABLE InstrText (
	__IDInstrText__ Integer NOT NULL,
	PRIMARY KEY InstrText (__IDInstrText__)
) ;

CREATE TABLE DelInstrText (
	__IDDelInstrText__ Integer NOT NULL,
	PRIMARY KEY DelInstrText (__IDDelInstrText__)
) ;

CREATE TABLE NoBreakHyphen (
	__IDNoBreakHyphen__ Integer NOT NULL,
	PRIMARY KEY NoBreakHyphen (__IDNoBreakHyphen__)
) ;

CREATE TABLE SoftHyphen (
	__IDSoftHyphen__ Integer NOT NULL,
	PRIMARY KEY SoftHyphen (__IDSoftHyphen__)
) ;

CREATE TABLE AnnotationRef (
	__IDAnnotationRef__ Integer NOT NULL,
	PRIMARY KEY AnnotationRef (__IDAnnotationRef__)
) ;

CREATE TABLE FootnoteRef (
	__IDFootnoteRef__ Integer NOT NULL,
	PRIMARY KEY FootnoteRef (__IDFootnoteRef__)
) ;

CREATE TABLE EndnoteRef (
	__IDEndnoteRef__ Integer NOT NULL,
	PRIMARY KEY EndnoteRef (__IDEndnoteRef__)
) ;

CREATE TABLE "Separator" (
	__IDSeparator__ Integer NOT NULL,
	PRIMARY KEY "Separator" (__IDSeparator__)
) ;

CREATE TABLE ContinuationSeparator (
	__IDContinuationSeparator__ Integer NOT NULL,
	PRIMARY KEY ContinuationSeparator (__IDContinuationSeparator__)
) ;

CREATE TABLE PgNum (
	__IDPgNum__ Integer NOT NULL,
	PRIMARY KEY PgNum (__IDPgNum__)
) ;

CREATE TABLE Cr (
	__IDCr__ Integer NOT NULL,
	PRIMARY KEY Cr (__IDCr__)
) ;

CREATE TABLE Footnote (
	__IDFootnote__ Integer NOT NULL,
	PRIMARY KEY Footnote (__IDFootnote__)
) ;

CREATE TABLE Endnote (
	__IDEndnote__ Integer NOT NULL,
	PRIMARY KEY Endnote (__IDEndnote__)
) ;

CREATE TABLE NoteElt (
	__IDNoteElt__ Integer NOT NULL,
	type text,
	suppressRef text,
	PRIMARY KEY NoteElt (__IDNoteElt__)
) ;

CREATE TABLE Picture (
	__IDPicture__ Integer NOT NULL,
	PRIMARY KEY Picture (__IDPicture__)
) ;

CREATE TABLE Symbol (
	__IDSymbol__ Integer NOT NULL,
	PRIMARY KEY Symbol (__IDSymbol__)
) ;

CREATE TABLE SymElt (
	__IDSymElt__ Integer NOT NULL,
	FOREIGN KEY font (__FKfont__) REFERENCES StringType (__IDStringType__),
	FOREIGN KEY "char" (__FKchar__) REFERENCES StringType (__IDStringType__),
	PRIMARY KEY SymElt (__IDSymElt__),
	__FKchar__ Integer,
	__FKfont__ Integer
) ;

CREATE TABLE Tab (
	__IDTab__ Integer NOT NULL,
	PRIMARY KEY Tab (__IDTab__)
) ;

CREATE TABLE FldChar (
	__IDFldChar__ Integer NOT NULL,
	PRIMARY KEY FldChar (__IDFldChar__)
) ;

CREATE TABLE FldCharElt (
	__IDFldCharElt__ Integer NOT NULL,
	FOREIGN KEY fldData (__FKfldData__) REFERENCES StringType (__IDStringType__),
	fldCharType text,
	fldLock text,
	PRIMARY KEY FldCharElt (__IDFldCharElt__),
	__FKfldData__ Integer
) ;

CREATE TABLE TableElt (
	__IDTableElt__ Integer NOT NULL,
	FOREIGN KEY tblPr (__FKtblPr__) REFERENCES TablePrElt (__IDTablePrElt__),
	FOREIGN KEY tblGrid (__FKtblGrid__) REFERENCES TableGridElt (__IDTableGridElt__),
	PRIMARY KEY TableElt (__IDTableElt__),
	__FKtblPr__ Integer,
	__FKtblGrid__ Integer
) ;

CREATE TABLE TablePrElt (
	__IDTablePrElt__ Integer NOT NULL,
	FOREIGN KEY tpe_tblElt (__FKtpe_tblElt__) REFERENCES TableElt (__IDTableElt__),
	PRIMARY KEY TablePrElt (__IDTablePrElt__),
	__FKtpe_tblElt__ Integer
) ;

CREATE TABLE TableGridElt (
	__IDTableGridElt__ Integer NOT NULL,
	FOREIGN KEY tge_tblElt (__FKtge_tblElt__) REFERENCES TableElt (__IDTableElt__),
	PRIMARY KEY TableGridElt (__IDTableGridElt__),
	__FKtge_tblElt__ Integer
) ;

CREATE TABLE TableContentElt (
	__IDTableContentElt__ Integer NOT NULL,
	FOREIGN KEY tce_tblElt (__FKtce_tblElt__) REFERENCES TableElt (__IDTableElt__),
	FOREIGN KEY tce_runLevelElts (__FKtce_runLevelElts__) REFERENCES RunLevelElt (__IDRunLevelElt__),
	PRIMARY KEY TableContentElt (__IDTableContentElt__),
	__FKtce_tblElt__ Integer,
	__FKtce_runLevelElts__ Integer
) ;

CREATE TABLE RowElt (
	__IDRowElt__ Integer NOT NULL,
	FOREIGN KEY re_tblContentElt (__FKre_tblContentElt__) REFERENCES TableContentElt (__IDTableContentElt__),
	FOREIGN KEY tblPrEx (__FKtblPrEx__) REFERENCES TablePrExElt (__IDTablePrExElt__),
	FOREIGN KEY trPr (__FKtrPr__) REFERENCES TableRowPrElt (__IDTableRowPrElt__),
	PRIMARY KEY RowElt (__IDRowElt__),
	__FKtrPr__ Integer,
	__FKre_tblContentElt__ Integer,
	__FKtblPrEx__ Integer
) ;

CREATE TABLE TablePrExElt (
	__IDTablePrExElt__ Integer NOT NULL,
	FOREIGN KEY tpee_rowElt (__FKtpee_rowElt__) REFERENCES RowElt (__IDRowElt__),
	PRIMARY KEY TablePrExElt (__IDTablePrExElt__),
	__FKtpee_rowElt__ Integer
) ;

CREATE TABLE TableRowPrElt (
	__IDTableRowPrElt__ Integer NOT NULL,
	FOREIGN KEY tpe_rowElt (__FKtpe_rowElt__) REFERENCES RowElt (__IDRowElt__),
	PRIMARY KEY TableRowPrElt (__IDTableRowPrElt__),
	__FKtpe_rowElt__ Integer
) ;

CREATE TABLE RowContentElt (
	__IDRowContentElt__ Integer NOT NULL,
	FOREIGN KEY rce_rowElt (__FKrce_rowElt__) REFERENCES RowElt (__IDRowElt__),
	FOREIGN KEY rce_runLevelElts (__FKrce_runLevelElts__) REFERENCES RunLevelElt (__IDRunLevelElt__),
	PRIMARY KEY RowContentElt (__IDRowContentElt__),
	__FKrce_rowElt__ Integer,
	__FKrce_runLevelElts__ Integer
) ;

CREATE TABLE TableCellElt (
	__IDTableCellElt__ Integer NOT NULL,
	FOREIGN KEY tce_rowContentElt (__FKtce_rowContentElt__) REFERENCES RowContentElt (__IDRowContentElt__),
	FOREIGN KEY tcPr (__FKtcPr__) REFERENCES TableCellPrElt (__IDTableCellPrElt__),
	PRIMARY KEY TableCellElt (__IDTableCellElt__),
	__FKtce_rowContentElt__ Integer,
	__FKtcPr__ Integer
) ;

CREATE TABLE TableCellPrElt (
	__IDTableCellPrElt__ Integer NOT NULL,
	FOREIGN KEY tcpe_tableCellElt (__FKtcpe_tableCellElt__) REFERENCES TableCellElt (__IDTableCellElt__),
	PRIMARY KEY TableCellPrElt (__IDTableCellPrElt__),
	__FKtcpe_tableCellElt__ Integer
) ;

CREATE TABLE FontsListElt (
	__IDFontsListElt__ Integer NOT NULL,
	FOREIGN KEY fle_wordDocument (__FKfle_wordDocument__) REFERENCES WordDocument (__IDWordDocument__),
	PRIMARY KEY FontsListElt (__IDFontsListElt__),
	__FKfle_wordDocument__ Integer
) ;

CREATE TABLE ListsElt (
	__IDListsElt__ Integer NOT NULL,
	FOREIGN KEY le_wordDocument (__FKle_wordDocument__) REFERENCES WordDocument (__IDWordDocument__),
	PRIMARY KEY ListsElt (__IDListsElt__),
	__FKle_wordDocument__ Integer
) ;

CREATE TABLE StylesElt (
	__IDStylesElt__ Integer NOT NULL,
	FOREIGN KEY se_wordDocument (__FKse_wordDocument__) REFERENCES WordDocument (__IDWordDocument__),
	PRIMARY KEY StylesElt (__IDStylesElt__),
	__FKse_wordDocument__ Integer
) ;

CREATE TABLE SectPrElt (
	__IDSectPrElt__ Integer NOT NULL,
	FOREIGN KEY spe_bodyElt (__FKspe_bodyElt__) REFERENCES BodyElt (__IDBodyElt__),
	PRIMARY KEY SectPrElt (__IDSectPrElt__),
	__FKspe_bodyElt__ Integer
) ;

CREATE TABLE RunLevelElt (
	__IDRunLevelElt__ Integer NOT NULL,
	FOREIGN KEY rle_tblContentElt (__FKrle_tblContentElt__) REFERENCES TableContentElt (__IDTableContentElt__),
	FOREIGN KEY rle_rowContentElt (__FKrle_rowContentElt__) REFERENCES RowContentElt (__IDRowContentElt__),
	PRIMARY KEY RunLevelElt (__IDRunLevelElt__),
	__FKrle_tblContentElt__ Integer,
	__FKrle_rowContentElt__ Integer
) ;

CREATE TABLE CfChunk (
	__IDCfChunk__ Integer NOT NULL,
	PRIMARY KEY CfChunk (__IDCfChunk__)
) ;

CREATE TABLE SimpleFieldElt (
	__IDSimpleFieldElt__ Integer NOT NULL,
	PRIMARY KEY SimpleFieldElt (__IDSimpleFieldElt__)
) ;

CREATE TABLE HLinkElt (
	__IDHLinkElt__ Integer NOT NULL,
	PRIMARY KEY HLinkElt (__IDHLinkElt__)
) ;

CREATE TABLE SubDocElt (
	__IDSubDocElt__ Integer NOT NULL,
	PRIMARY KEY SubDocElt (__IDSubDocElt__)
) ;

CREATE TABLE PictureType (
	__IDPictureType__ Integer NOT NULL,
	PRIMARY KEY PictureType (__IDPictureType__)
) ;

CREATE TABLE TabElt (
	__IDTabElt__ Integer NOT NULL,
	PRIMARY KEY TabElt (__IDTabElt__)
) ;

CREATE TABLE RowElt_rowContent_RowContentElt (
	__IDRowElt__ Integer NOT NULL,
	__IDRowContentElt__ Integer NOT NULL
) ;

CREATE TABLE SmartTagsCollection_smartTagTypes_SmartTagType (
	__IDSmartTagsCollection__ Integer NOT NULL,
	__IDSmartTagType__ Integer NOT NULL
) ;

CREATE TABLE NoteElt_n_blockLevelElts_BlockLevelElt (
	__IDNoteElt__ Integer NOT NULL,
	__IDBlockLevelElt__ Integer NOT NULL
) ;

CREATE TABLE TableElt_tblContent_TableContentElt (
	__IDTableElt__ Integer NOT NULL,
	__IDTableContentElt__ Integer NOT NULL
) ;

CREATE TABLE BodyElt_blockLevelElts_BlockLevelElt (
	__IDBodyElt__ Integer NOT NULL,
	__IDBlockLevelElt__ Integer NOT NULL
) ;

CREATE TABLE RowContentElt_tc_TableCellElt (
	__IDRowContentElt__ Integer NOT NULL,
	__IDTableCellElt__ Integer NOT NULL
) ;

CREATE TABLE RunElt_rContentElts_RunContentElt (
	__IDRunElt__ Integer NOT NULL,
	__IDRunContentElt__ Integer NOT NULL
) ;

CREATE TABLE TableContentElt_tr_RowElt (
	__IDTableContentElt__ Integer NOT NULL,
	__IDRowElt__ Integer NOT NULL
) ;

CREATE TABLE CustomDocumentPropertiesCollection_customDocumentProperties_CustomDocumentProperty (
	__IDCustomDocumentPropertiesCollection__ Integer NOT NULL,
	__IDCustomDocumentProperty__ Integer NOT NULL
) ;

CREATE TABLE ParaElt_pContentElts_ParaContentElt (
	__IDParaElt__ Integer NOT NULL,
	__IDParaContentElt__ Integer NOT NULL
) ;

CREATE TABLE TableCellElt_tce_content_BlockLevelElt (
	__IDTableCellElt__ Integer NOT NULL,
	__IDBlockLevelElt__ Integer NOT NULL
) ;
