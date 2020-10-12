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
	FOREIGN KEY ignoreSubtree (__FKignoreSubtree__) REFERENCES StringProperty (__IDStringProperty__),
	FOREIGN KEY ignoreElements (__FKignoreElements__) REFERENCES StringProperty (__IDStringProperty__),
	FOREIGN KEY body (__FKbody__) REFERENCES BodyElt (__IDBodyElt__),
	PRIMARY KEY WordDocument (__IDWordDocument__),
	__FKignoreSubtree__ Integer,
	__FKbody__ Integer,
	__FKignoreElements__ Integer
) ;

CREATE TABLE BodyElt (
	__IDBodyElt__ Integer NOT NULL,
	FOREIGN KEY be_wordDocument (__FKbe_wordDocument__) REFERENCES WordDocument (__IDWordDocument__),
	PRIMARY KEY BodyElt (__IDBodyElt__),
	__FKbe_wordDocument__ Integer
) ;

CREATE TABLE BlockLevelElt (
	__IDBlockLevelElt__ Integer NOT NULL,
	FOREIGN KEY ble_bodyElt (__FKble_bodyElt__) REFERENCES BodyElt (__IDBodyElt__),
	FOREIGN KEY ble_note (__FKble_note__) REFERENCES NoteElt (__IDNoteElt__),
	PRIMARY KEY BlockLevelElt (__IDBlockLevelElt__),
	__FKble_note__ Integer,
	__FKble_bodyElt__ Integer
) ;

CREATE TABLE BlockLevelChunkElt (
	__IDBlockLevelChunkElt__ Integer NOT NULL,
	PRIMARY KEY BlockLevelChunkElt (__IDBlockLevelChunkElt__)
) ;

CREATE TABLE ParaElt (
	__IDParaElt__ Integer NOT NULL,
	PRIMARY KEY ParaElt (__IDParaElt__)
) ;

CREATE TABLE ParaContentElt (
	__IDParaContentElt__ Integer NOT NULL,
	FOREIGN KEY pce_pElt (__FKpce_pElt__) REFERENCES ParaElt (__IDParaElt__),
	PRIMARY KEY ParaContentElt (__IDParaContentElt__),
	__FKpce_pElt__ Integer
) ;

CREATE TABLE RunElt (
	__IDRunElt__ Integer NOT NULL,
	PRIMARY KEY RunElt (__IDRunElt__)
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
	__FKfont__ Integer,
	__FKchar__ Integer
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

CREATE TABLE BodyElt_blockLevelElts_BlockLevelElt (
	__IDBodyElt__ Integer NOT NULL,
	__IDBlockLevelElt__ Integer NOT NULL
) ;

CREATE TABLE ParaElt_pContentElts_ParaContentElt (
	__IDParaElt__ Integer NOT NULL,
	__IDParaContentElt__ Integer NOT NULL
) ;

CREATE TABLE NoteElt_n_blockLevelElts_BlockLevelElt (
	__IDNoteElt__ Integer NOT NULL,
	__IDBlockLevelElt__ Integer NOT NULL
) ;

CREATE TABLE RunElt_rContentElts_RunContentElt (
	__IDRunElt__ Integer NOT NULL,
	__IDRunContentElt__ Integer NOT NULL
) ;
