CREATE TABLE ValuedElement (
	__IDValuedElement__ Integer NOT NULL,
	value text,
	PRIMARY KEY ValuedElement (__IDValuedElement__)
) ;

CREATE TABLE CDATA (
	__IDCDATA__ Integer NOT NULL,
	PRIMARY KEY CDATA (__IDCDATA__)
) ;

CREATE TABLE PCDATA (
	__IDPCDATA__ Integer NOT NULL,
	PRIMARY KEY PCDATA (__IDPCDATA__)
) ;

CREATE TABLE NMTOKEN (
	__IDNMTOKEN__ Integer NOT NULL,
	PRIMARY KEY NMTOKEN (__IDNMTOKEN__)
) ;

CREATE TABLE IDREF (
	__IDIDREF__ Integer NOT NULL,
	PRIMARY KEY IDREF (__IDIDREF__)
) ;

CREATE TABLE IDREFS (
	__IDIDREFS__ Integer NOT NULL,
	PRIMARY KEY IDREFS (__IDIDREFS__)
) ;

CREATE TABLE ID (
	__IDID__ Integer NOT NULL,
	PRIMARY KEY ID (__IDID__)
) ;

CREATE TABLE EMPTY (
	__IDEMPTY__ Integer NOT NULL,
	PRIMARY KEY EMPTY (__IDEMPTY__)
) ;

CREATE TABLE ContentType (
	__IDContentType__ Integer NOT NULL,
	PRIMARY KEY ContentType (__IDContentType__)
) ;

CREATE TABLE ContentTypes (
	__IDContentTypes__ Integer NOT NULL,
	PRIMARY KEY ContentTypes (__IDContentTypes__)
) ;

CREATE TABLE Charset (
	__IDCharset__ Integer NOT NULL,
	PRIMARY KEY Charset (__IDCharset__)
) ;

CREATE TABLE Charsets (
	__IDCharsets__ Integer NOT NULL,
	PRIMARY KEY Charsets (__IDCharsets__)
) ;

CREATE TABLE LanguageCode (
	__IDLanguageCode__ Integer NOT NULL,
	PRIMARY KEY LanguageCode (__IDLanguageCode__)
) ;

CREATE TABLE "Character" (
	__IDCharacter__ Integer NOT NULL,
	PRIMARY KEY "Character" (__IDCharacter__)
) ;

CREATE TABLE Number (
	__IDNumber__ Integer NOT NULL,
	PRIMARY KEY Number (__IDNumber__)
) ;

CREATE TABLE LinkTypes (
	__IDLinkTypes__ Integer NOT NULL,
	PRIMARY KEY LinkTypes (__IDLinkTypes__)
) ;

CREATE TABLE MediaDesc (
	__IDMediaDesc__ Integer NOT NULL,
	PRIMARY KEY MediaDesc (__IDMediaDesc__)
) ;

CREATE TABLE URI (
	__IDURI__ Integer NOT NULL,
	PRIMARY KEY URI (__IDURI__)
) ;

CREATE TABLE UriList (
	__IDUriList__ Integer NOT NULL,
	PRIMARY KEY UriList (__IDUriList__)
) ;

CREATE TABLE Datetime (
	__IDDatetime__ Integer NOT NULL,
	PRIMARY KEY Datetime (__IDDatetime__)
) ;

CREATE TABLE ScriptExpression (
	__IDScriptExpression__ Integer NOT NULL,
	PRIMARY KEY ScriptExpression (__IDScriptExpression__)
) ;

CREATE TABLE StyleSheet (
	__IDStyleSheet__ Integer NOT NULL,
	PRIMARY KEY StyleSheet (__IDStyleSheet__)
) ;

CREATE TABLE Text (
	__IDText__ Integer NOT NULL,
	PRIMARY KEY Text (__IDText__)
) ;

CREATE TABLE Length (
	__IDLength__ Integer NOT NULL,
	PRIMARY KEY Length (__IDLength__)
) ;

CREATE TABLE MultiLength (
	__IDMultiLength__ Integer NOT NULL,
	PRIMARY KEY MultiLength (__IDMultiLength__)
) ;

CREATE TABLE Pixels (
	__IDPixels__ Integer NOT NULL,
	PRIMARY KEY Pixels (__IDPixels__)
) ;

CREATE TABLE Coords (
	__IDCoords__ Integer NOT NULL,
	PRIMARY KEY Coords (__IDCoords__)
) ;

CREATE TABLE CoreAttrs (
	__IDCoreAttrs__ Integer NOT NULL,
	FOREIGN KEY id (__FKid__) REFERENCES ID (__IDID__),
	FOREIGN KEY class (__FKclass__) REFERENCES CDATA (__IDCDATA__),
	FOREIGN KEY style (__FKstyle__) REFERENCES StyleSheet (__IDStyleSheet__),
	FOREIGN KEY title (__FKtitle__) REFERENCES Text (__IDText__),
	PRIMARY KEY CoreAttrs (__IDCoreAttrs__),
	__FKid__ Integer,
	__FKstyle__ Integer,
	__FKtitle__ Integer,
	__FKclass__ Integer
) ;

CREATE TABLE I18n (
	__IDI18n__ Integer NOT NULL,
	FOREIGN KEY lang (__FKlang__) REFERENCES LanguageCode (__IDLanguageCode__),
	FOREIGN KEY "xml:lang" ("__FKxml:lang__") REFERENCES LanguageCode (__IDLanguageCode__),
	dir text,
	PRIMARY KEY I18n (__IDI18n__),
	"__FKxml:lang__" Integer,
	__FKlang__ Integer
) ;

CREATE TABLE Events (
	__IDEvents__ Integer NOT NULL,
	FOREIGN KEY onclick (__FKonclick__) REFERENCES ScriptExpression (__IDScriptExpression__),
	FOREIGN KEY ondblclick (__FKondblclick__) REFERENCES ScriptExpression (__IDScriptExpression__),
	FOREIGN KEY onmousedown (__FKonmousedown__) REFERENCES ScriptExpression (__IDScriptExpression__),
	FOREIGN KEY onmouseup (__FKonmouseup__) REFERENCES ScriptExpression (__IDScriptExpression__),
	FOREIGN KEY onmouseover (__FKonmouseover__) REFERENCES ScriptExpression (__IDScriptExpression__),
	FOREIGN KEY onmousemove (__FKonmousemove__) REFERENCES ScriptExpression (__IDScriptExpression__),
	FOREIGN KEY onmouseout (__FKonmouseout__) REFERENCES ScriptExpression (__IDScriptExpression__),
	FOREIGN KEY onkeypress (__FKonkeypress__) REFERENCES ScriptExpression (__IDScriptExpression__),
	FOREIGN KEY onkeydown (__FKonkeydown__) REFERENCES ScriptExpression (__IDScriptExpression__),
	FOREIGN KEY onkeyup (__FKonkeyup__) REFERENCES ScriptExpression (__IDScriptExpression__),
	PRIMARY KEY Events (__IDEvents__),
	__FKondblclick__ Integer,
	__FKonmouseup__ Integer,
	__FKonmousedown__ Integer,
	__FKonkeydown__ Integer,
	__FKonmouseover__ Integer,
	__FKonkeyup__ Integer,
	__FKonclick__ Integer,
	__FKonmouseout__ Integer,
	__FKonmousemove__ Integer,
	__FKonkeypress__ Integer
) ;

CREATE TABLE Attrs (
	__IDAttrs__ Integer NOT NULL,
	PRIMARY KEY Attrs (__IDAttrs__)
) ;

CREATE TABLE Focus (
	__IDFocus__ Integer NOT NULL,
	FOREIGN KEY accesskey (__FKaccesskey__) REFERENCES "Character" (__IDCharacter__),
	FOREIGN KEY tabindex (__FKtabindex__) REFERENCES Number (__IDNumber__),
	FOREIGN KEY onfocus (__FKonfocus__) REFERENCES ScriptExpression (__IDScriptExpression__),
	FOREIGN KEY onblur (__FKonblur__) REFERENCES ScriptExpression (__IDScriptExpression__),
	PRIMARY KEY Focus (__IDFocus__),
	__FKonblur__ Integer,
	__FKaccesskey__ Integer,
	__FKtabindex__ Integer,
	__FKonfocus__ Integer
) ;

CREATE TABLE Specialpre (
	__IDSpecialpre__ Integer NOT NULL,
	PRIMARY KEY Specialpre (__IDSpecialpre__)
) ;

CREATE TABLE Special (
	__IDSpecial__ Integer NOT NULL,
	PRIMARY KEY Special (__IDSpecial__)
) ;

CREATE TABLE Fontstyle (
	__IDFontstyle__ Integer NOT NULL,
	PRIMARY KEY Fontstyle (__IDFontstyle__)
) ;

CREATE TABLE Phrase (
	__IDPhrase__ Integer NOT NULL,
	PRIMARY KEY Phrase (__IDPhrase__)
) ;

CREATE TABLE Inlineforms (
	__IDInlineforms__ Integer NOT NULL,
	PRIMARY KEY Inlineforms (__IDInlineforms__)
) ;

CREATE TABLE Miscinline (
	__IDMiscinline__ Integer NOT NULL,
	PRIMARY KEY Miscinline (__IDMiscinline__)
) ;

CREATE TABLE Misc (
	__IDMisc__ Integer NOT NULL,
	PRIMARY KEY Misc (__IDMisc__)
) ;

CREATE TABLE inline (
	__IDinline__ Integer NOT NULL,
	PRIMARY KEY inline (__IDinline__)
) ;

CREATE TABLE Inline (
	__IDInline__ Integer NOT NULL,
	PRIMARY KEY Inline (__IDInline__)
) ;

CREATE TABLE Heading (
	__IDHeading__ Integer NOT NULL,
	PRIMARY KEY Heading (__IDHeading__)
) ;

CREATE TABLE Lists (
	__IDLists__ Integer NOT NULL,
	PRIMARY KEY Lists (__IDLists__)
) ;

CREATE TABLE Blocktext (
	__IDBlocktext__ Integer NOT NULL,
	PRIMARY KEY Blocktext (__IDBlocktext__)
) ;

CREATE TABLE block (
	__IDblock__ Integer NOT NULL,
	PRIMARY KEY block (__IDblock__)
) ;

CREATE TABLE Block (
	__IDBlock__ Integer NOT NULL,
	PRIMARY KEY Block (__IDBlock__)
) ;

CREATE TABLE Flow (
	__IDFlow__ Integer NOT NULL,
	PRIMARY KEY Flow (__IDFlow__)
) ;

CREATE TABLE AContent (
	__IDAContent__ Integer NOT NULL,
	PRIMARY KEY AContent (__IDAContent__)
) ;

CREATE TABLE PreContent (
	__IDPreContent__ Integer NOT NULL,
	PRIMARY KEY PreContent (__IDPreContent__)
) ;

CREATE TABLE FormContent (
	__IDFormContent__ Integer NOT NULL,
	PRIMARY KEY FormContent (__IDFormContent__)
) ;

CREATE TABLE ButtonContent (
	__IDButtonContent__ Integer NOT NULL,
	PRIMARY KEY ButtonContent (__IDButtonContent__)
) ;

CREATE TABLE Html (
	__IDHtml__ Integer NOT NULL,
	FOREIGN KEY i18n (__FKi18n__) REFERENCES I18n (__IDI18n__),
	FOREIGN KEY id (__FKid__) REFERENCES ID (__IDID__),
	FOREIGN KEY xmlns (__FKxmlns__) REFERENCES URI (__IDURI__),
	FOREIGN KEY head (__FKhead__) REFERENCES Head (__IDHead__),
	FOREIGN KEY body (__FKbody__) REFERENCES Body (__IDBody__),
	PRIMARY KEY Html (__IDHtml__),
	__FKbody__ Integer,
	__FKhead__ Integer,
	__FKid__ Integer,
	__FKi18n__ Integer,
	__FKxmlns__ Integer
) ;

CREATE TABLE HeadMisc (
	__IDHeadMisc__ Integer NOT NULL,
	PRIMARY KEY HeadMisc (__IDHeadMisc__)
) ;

CREATE TABLE Head (
	__IDHead__ Integer NOT NULL,
	FOREIGN KEY i18n (__FKi18n__) REFERENCES I18n (__IDI18n__),
	FOREIGN KEY id (__FKid__) REFERENCES ID (__IDID__),
	FOREIGN KEY profile (__FKprofile__) REFERENCES URI (__IDURI__),
	FOREIGN KEY headelement (__FKheadelement__) REFERENCES HeadElement (__IDHeadElement__),
	FOREIGN KEY html (__FKhtml__) REFERENCES Html (__IDHtml__),
	PRIMARY KEY Head (__IDHead__),
	__FKheadelement__ Integer,
	__FKprofile__ Integer,
	__FKi18n__ Integer,
	__FKhtml__ Integer,
	__FKid__ Integer
) ;

CREATE TABLE HeadElement (
	__IDHeadElement__ Integer NOT NULL,
	PRIMARY KEY HeadElement (__IDHeadElement__)
) ;

CREATE TABLE TitleHeadElement (
	__IDTitleHeadElement__ Integer NOT NULL,
	FOREIGN KEY title (__FKtitle__) REFERENCES Title (__IDTitle__),
	PRIMARY KEY TitleHeadElement (__IDTitleHeadElement__),
	__FKtitle__ Integer
) ;

CREATE TABLE BaseTitleHeadElement (
	__IDBaseTitleHeadElement__ Integer NOT NULL,
	FOREIGN KEY base (__FKbase__) REFERENCES Base (__IDBase__),
	PRIMARY KEY BaseTitleHeadElement (__IDBaseTitleHeadElement__),
	__FKbase__ Integer
) ;

CREATE TABLE BaseHeadElement (
	__IDBaseHeadElement__ Integer NOT NULL,
	FOREIGN KEY base (__FKbase__) REFERENCES Base (__IDBase__),
	PRIMARY KEY BaseHeadElement (__IDBaseHeadElement__),
	__FKbase__ Integer
) ;

CREATE TABLE TitleBaseHeadElement (
	__IDTitleBaseHeadElement__ Integer NOT NULL,
	FOREIGN KEY title (__FKtitle__) REFERENCES Title (__IDTitle__),
	PRIMARY KEY TitleBaseHeadElement (__IDTitleBaseHeadElement__),
	__FKtitle__ Integer
) ;

CREATE TABLE Title (
	__IDTitle__ Integer NOT NULL,
	FOREIGN KEY i18n (__FKi18n__) REFERENCES I18n (__IDI18n__),
	FOREIGN KEY id (__FKid__) REFERENCES ID (__IDID__),
	PRIMARY KEY Title (__IDTitle__),
	__FKid__ Integer,
	__FKi18n__ Integer
) ;

CREATE TABLE Base (
	__IDBase__ Integer NOT NULL,
	FOREIGN KEY href (__FKhref__) REFERENCES URI (__IDURI__),
	FOREIGN KEY id (__FKid__) REFERENCES ID (__IDID__),
	PRIMARY KEY Base (__IDBase__),
	__FKid__ Integer,
	__FKhref__ Integer
) ;

CREATE TABLE Meta (
	__IDMeta__ Integer NOT NULL,
	FOREIGN KEY i18n (__FKi18n__) REFERENCES I18n (__IDI18n__),
	FOREIGN KEY id (__FKid__) REFERENCES ID (__IDID__),
	FOREIGN KEY httpequiv (__FKhttpequiv__) REFERENCES CDATA (__IDCDATA__),
	FOREIGN KEY name (__FKname__) REFERENCES CDATA (__IDCDATA__),
	FOREIGN KEY content (__FKcontent__) REFERENCES CDATA (__IDCDATA__),
	FOREIGN KEY scheme (__FKscheme__) REFERENCES CDATA (__IDCDATA__),
	PRIMARY KEY Meta (__IDMeta__),
	__FKscheme__ Integer,
	__FKcontent__ Integer,
	__FKhttpequiv__ Integer,
	__FKname__ Integer,
	__FKid__ Integer,
	__FKi18n__ Integer
) ;

CREATE TABLE Link (
	__IDLink__ Integer NOT NULL,
	FOREIGN KEY charset (__FKcharset__) REFERENCES Charset (__IDCharset__),
	FOREIGN KEY href (__FKhref__) REFERENCES URI (__IDURI__),
	FOREIGN KEY hreflang (__FKhreflang__) REFERENCES LanguageCode (__IDLanguageCode__),
	FOREIGN KEY type (__FKtype__) REFERENCES ContentType (__IDContentType__),
	FOREIGN KEY rel (__FKrel__) REFERENCES LinkTypes (__IDLinkTypes__),
	FOREIGN KEY rev (__FKrev__) REFERENCES LinkTypes (__IDLinkTypes__),
	FOREIGN KEY media (__FKmedia__) REFERENCES MediaDesc (__IDMediaDesc__),
	PRIMARY KEY Link (__IDLink__),
	__FKhref__ Integer,
	__FKmedia__ Integer,
	__FKcharset__ Integer,
	__FKrel__ Integer,
	__FKrev__ Integer,
	__FKtype__ Integer,
	__FKhreflang__ Integer
) ;

CREATE TABLE Style (
	__IDStyle__ Integer NOT NULL,
	FOREIGN KEY i18n (__FKi18n__) REFERENCES I18n (__IDI18n__),
	FOREIGN KEY id (__FKid__) REFERENCES ID (__IDID__),
	FOREIGN KEY type (__FKtype__) REFERENCES ContentType (__IDContentType__),
	FOREIGN KEY media (__FKmedia__) REFERENCES MediaDesc (__IDMediaDesc__),
	FOREIGN KEY title (__FKtitle__) REFERENCES Text (__IDText__),
	"xml:space" text,
	PRIMARY KEY Style (__IDStyle__),
	__FKi18n__ Integer,
	__FKtitle__ Integer,
	__FKid__ Integer,
	__FKmedia__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE Script (
	__IDScript__ Integer NOT NULL,
	FOREIGN KEY id (__FKid__) REFERENCES ID (__IDID__),
	FOREIGN KEY charset (__FKcharset__) REFERENCES Charset (__IDCharset__),
	FOREIGN KEY type (__FKtype__) REFERENCES ContentType (__IDContentType__),
	FOREIGN KEY src (__FKsrc__) REFERENCES URI (__IDURI__),
	defer text,
	"xml:space" text,
	PRIMARY KEY Script (__IDScript__),
	__FKsrc__ Integer,
	__FKid__ Integer,
	__FKtype__ Integer,
	__FKcharset__ Integer
) ;

CREATE TABLE Noscript (
	__IDNoscript__ Integer NOT NULL,
	FOREIGN KEY block (__FKblock__) REFERENCES Block (__IDBlock__),
	PRIMARY KEY Noscript (__IDNoscript__),
	__FKblock__ Integer
) ;

CREATE TABLE Body (
	__IDBody__ Integer NOT NULL,
	FOREIGN KEY onload (__FKonload__) REFERENCES ScriptExpression (__IDScriptExpression__),
	FOREIGN KEY onunload (__FKonunload__) REFERENCES ScriptExpression (__IDScriptExpression__),
	FOREIGN KEY html (__FKhtml__) REFERENCES Html (__IDHtml__),
	PRIMARY KEY Body (__IDBody__),
	__FKhtml__ Integer,
	__FKonunload__ Integer,
	__FKonload__ Integer
) ;

CREATE TABLE "Div" (
	__IDDiv__ Integer NOT NULL,
	PRIMARY KEY "Div" (__IDDiv__)
) ;

CREATE TABLE P (
	__IDP__ Integer NOT NULL,
	PRIMARY KEY P (__IDP__)
) ;

CREATE TABLE H1 (
	__IDH1__ Integer NOT NULL,
	PRIMARY KEY H1 (__IDH1__)
) ;

CREATE TABLE H2 (
	__IDH2__ Integer NOT NULL,
	PRIMARY KEY H2 (__IDH2__)
) ;

CREATE TABLE H3 (
	__IDH3__ Integer NOT NULL,
	PRIMARY KEY H3 (__IDH3__)
) ;

CREATE TABLE H4 (
	__IDH4__ Integer NOT NULL,
	PRIMARY KEY H4 (__IDH4__)
) ;

CREATE TABLE H5 (
	__IDH5__ Integer NOT NULL,
	PRIMARY KEY H5 (__IDH5__)
) ;

CREATE TABLE H6 (
	__IDH6__ Integer NOT NULL,
	PRIMARY KEY H6 (__IDH6__)
) ;

CREATE TABLE Ul (
	__IDUl__ Integer NOT NULL,
	PRIMARY KEY Ul (__IDUl__)
) ;

CREATE TABLE Ol (
	__IDOl__ Integer NOT NULL,
	PRIMARY KEY Ol (__IDOl__)
) ;

CREATE TABLE Li (
	__IDLi__ Integer NOT NULL,
	PRIMARY KEY Li (__IDLi__)
) ;

CREATE TABLE Dl (
	__IDDl__ Integer NOT NULL,
	PRIMARY KEY Dl (__IDDl__)
) ;

CREATE TABLE DlElement (
	__IDDlElement__ Integer NOT NULL,
	PRIMARY KEY DlElement (__IDDlElement__)
) ;

CREATE TABLE Dt (
	__IDDt__ Integer NOT NULL,
	PRIMARY KEY Dt (__IDDt__)
) ;

CREATE TABLE Dd (
	__IDDd__ Integer NOT NULL,
	PRIMARY KEY Dd (__IDDd__)
) ;

CREATE TABLE Address (
	__IDAddress__ Integer NOT NULL,
	PRIMARY KEY Address (__IDAddress__)
) ;

CREATE TABLE Hr (
	__IDHr__ Integer NOT NULL,
	PRIMARY KEY Hr (__IDHr__)
) ;

CREATE TABLE Pre (
	__IDPre__ Integer NOT NULL,
	"xml:space" text,
	PRIMARY KEY Pre (__IDPre__)
) ;

CREATE TABLE Blockquote (
	__IDBlockquote__ Integer NOT NULL,
	FOREIGN KEY cite (__FKcite__) REFERENCES URI (__IDURI__),
	PRIMARY KEY Blockquote (__IDBlockquote__),
	__FKcite__ Integer
) ;

CREATE TABLE Ins (
	__IDIns__ Integer NOT NULL,
	FOREIGN KEY cite (__FKcite__) REFERENCES URI (__IDURI__),
	FOREIGN KEY datetime (__FKdatetime__) REFERENCES Datetime (__IDDatetime__),
	PRIMARY KEY Ins (__IDIns__),
	__FKcite__ Integer,
	__FKdatetime__ Integer
) ;

CREATE TABLE Del (
	__IDDel__ Integer NOT NULL,
	FOREIGN KEY cite (__FKcite__) REFERENCES URI (__IDURI__),
	FOREIGN KEY datetime (__FKdatetime__) REFERENCES Datetime (__IDDatetime__),
	PRIMARY KEY Del (__IDDel__),
	__FKcite__ Integer,
	__FKdatetime__ Integer
) ;

CREATE TABLE A (
	__IDA__ Integer NOT NULL,
	FOREIGN KEY charset (__FKcharset__) REFERENCES Charset (__IDCharset__),
	FOREIGN KEY type (__FKtype__) REFERENCES ContentType (__IDContentType__),
	FOREIGN KEY name (__FKname__) REFERENCES NMTOKEN (__IDNMTOKEN__),
	FOREIGN KEY href (__FKhref__) REFERENCES URI (__IDURI__),
	FOREIGN KEY hreflang (__FKhreflang__) REFERENCES LanguageCode (__IDLanguageCode__),
	FOREIGN KEY rel (__FKrel__) REFERENCES LinkTypes (__IDLinkTypes__),
	FOREIGN KEY rev (__FKrev__) REFERENCES LinkTypes (__IDLinkTypes__),
	shape text,
	FOREIGN KEY coords (__FKcoords__) REFERENCES Coords (__IDCoords__),
	PRIMARY KEY A (__IDA__),
	__FKrev__ Integer,
	__FKrel__ Integer,
	__FKhref__ Integer,
	__FKcoords__ Integer,
	__FKtype__ Integer,
	__FKhreflang__ Integer,
	__FKname__ Integer,
	__FKcharset__ Integer
) ;

CREATE TABLE Span (
	__IDSpan__ Integer NOT NULL,
	PRIMARY KEY Span (__IDSpan__)
) ;

CREATE TABLE Bdo (
	__IDBdo__ Integer NOT NULL,
	FOREIGN KEY lang (__FKlang__) REFERENCES LanguageCode (__IDLanguageCode__),
	FOREIGN KEY "xml:lang" ("__FKxml:lang__") REFERENCES LanguageCode (__IDLanguageCode__),
	dir text,
	PRIMARY KEY Bdo (__IDBdo__),
	__FKlang__ Integer,
	"__FKxml:lang__" Integer
) ;

CREATE TABLE Br (
	__IDBr__ Integer NOT NULL,
	PRIMARY KEY Br (__IDBr__)
) ;

CREATE TABLE Em (
	__IDEm__ Integer NOT NULL,
	PRIMARY KEY Em (__IDEm__)
) ;

CREATE TABLE Strong (
	__IDStrong__ Integer NOT NULL,
	PRIMARY KEY Strong (__IDStrong__)
) ;

CREATE TABLE Dfn (
	__IDDfn__ Integer NOT NULL,
	PRIMARY KEY Dfn (__IDDfn__)
) ;

CREATE TABLE Code (
	__IDCode__ Integer NOT NULL,
	PRIMARY KEY Code (__IDCode__)
) ;

CREATE TABLE Samp (
	__IDSamp__ Integer NOT NULL,
	PRIMARY KEY Samp (__IDSamp__)
) ;

CREATE TABLE Kbd (
	__IDKbd__ Integer NOT NULL,
	PRIMARY KEY Kbd (__IDKbd__)
) ;

CREATE TABLE Var (
	__IDVar__ Integer NOT NULL,
	PRIMARY KEY Var (__IDVar__)
) ;

CREATE TABLE Cite (
	__IDCite__ Integer NOT NULL,
	PRIMARY KEY Cite (__IDCite__)
) ;

CREATE TABLE Abbr (
	__IDAbbr__ Integer NOT NULL,
	PRIMARY KEY Abbr (__IDAbbr__)
) ;

CREATE TABLE Acronym (
	__IDAcronym__ Integer NOT NULL,
	PRIMARY KEY Acronym (__IDAcronym__)
) ;

CREATE TABLE Q (
	__IDQ__ Integer NOT NULL,
	FOREIGN KEY cite (__FKcite__) REFERENCES URI (__IDURI__),
	PRIMARY KEY Q (__IDQ__),
	__FKcite__ Integer
) ;

CREATE TABLE Sub (
	__IDSub__ Integer NOT NULL,
	PRIMARY KEY Sub (__IDSub__)
) ;

CREATE TABLE Sup (
	__IDSup__ Integer NOT NULL,
	PRIMARY KEY Sup (__IDSup__)
) ;

CREATE TABLE Tt (
	__IDTt__ Integer NOT NULL,
	PRIMARY KEY Tt (__IDTt__)
) ;

CREATE TABLE I (
	__IDI__ Integer NOT NULL,
	PRIMARY KEY I (__IDI__)
) ;

CREATE TABLE B (
	__IDB__ Integer NOT NULL,
	PRIMARY KEY B (__IDB__)
) ;

CREATE TABLE Big (
	__IDBig__ Integer NOT NULL,
	PRIMARY KEY Big (__IDBig__)
) ;

CREATE TABLE Small (
	__IDSmall__ Integer NOT NULL,
	PRIMARY KEY Small (__IDSmall__)
) ;

CREATE TABLE ObjectElement (
	__IDObjectElement__ Integer NOT NULL,
	PRIMARY KEY ObjectElement (__IDObjectElement__)
) ;

CREATE TABLE Object (
	__IDObject__ Integer NOT NULL,
	"declare" Boolean,
	FOREIGN KEY classid (__FKclassid__) REFERENCES URI (__IDURI__),
	FOREIGN KEY codebase (__FKcodebase__) REFERENCES URI (__IDURI__),
	FOREIGN KEY data (__FKdata__) REFERENCES URI (__IDURI__),
	FOREIGN KEY type (__FKtype__) REFERENCES ContentType (__IDContentType__),
	FOREIGN KEY codetype (__FKcodetype__) REFERENCES ContentType (__IDContentType__),
	FOREIGN KEY archive (__FKarchive__) REFERENCES UriList (__IDUriList__),
	FOREIGN KEY standby (__FKstandby__) REFERENCES Text (__IDText__),
	FOREIGN KEY height (__FKheight__) REFERENCES Length (__IDLength__),
	FOREIGN KEY width (__FKwidth__) REFERENCES Length (__IDLength__),
	FOREIGN KEY usemap (__FKusemap__) REFERENCES URI (__IDURI__),
	FOREIGN KEY name (__FKname__) REFERENCES NMTOKEN (__IDNMTOKEN__),
	FOREIGN KEY tabindex (__FKtabindex__) REFERENCES Number (__IDNumber__),
	PRIMARY KEY Object (__IDObject__),
	__FKarchive__ Integer,
	__FKcodebase__ Integer,
	__FKdata__ Integer,
	__FKname__ Integer,
	__FKwidth__ Integer,
	__FKclassid__ Integer,
	__FKcodetype__ Integer,
	__FKtabindex__ Integer,
	__FKheight__ Integer,
	__FKusemap__ Integer,
	__FKstandby__ Integer,
	__FKtype__ Integer
) ;

CREATE TABLE Param (
	__IDParam__ Integer NOT NULL,
	FOREIGN KEY id (__FKid__) REFERENCES ID (__IDID__),
	FOREIGN KEY name (__FKname__) REFERENCES CDATA (__IDCDATA__),
	FOREIGN KEY value (__FKvalue__) REFERENCES CDATA (__IDCDATA__),
	valuetype text,
	FOREIGN KEY type (__FKtype__) REFERENCES ContentType (__IDContentType__),
	PRIMARY KEY Param (__IDParam__),
	__FKvalue__ Integer,
	__FKtype__ Integer,
	__FKid__ Integer,
	__FKname__ Integer
) ;

CREATE TABLE Img (
	__IDImg__ Integer NOT NULL,
	FOREIGN KEY src (__FKsrc__) REFERENCES URI (__IDURI__),
	FOREIGN KEY alt (__FKalt__) REFERENCES Text (__IDText__),
	FOREIGN KEY longdesc (__FKlongdesc__) REFERENCES URI (__IDURI__),
	FOREIGN KEY height (__FKheight__) REFERENCES Length (__IDLength__),
	FOREIGN KEY width (__FKwidth__) REFERENCES Length (__IDLength__),
	FOREIGN KEY usemap (__FKusemap__) REFERENCES URI (__IDURI__),
	ismap Boolean,
	PRIMARY KEY Img (__IDImg__),
	__FKwidth__ Integer,
	__FKusemap__ Integer,
	__FKsrc__ Integer,
	__FKalt__ Integer,
	__FKlongdesc__ Integer,
	__FKheight__ Integer
) ;

CREATE TABLE MapContent (
	__IDMapContent__ Integer NOT NULL,
	PRIMARY KEY MapContent (__IDMapContent__)
) ;

CREATE TABLE MapElement (
	__IDMapElement__ Integer NOT NULL,
	PRIMARY KEY MapElement (__IDMapElement__)
) ;

CREATE TABLE MapElementContent (
	__IDMapElementContent__ Integer NOT NULL,
	PRIMARY KEY MapElementContent (__IDMapElementContent__)
) ;

CREATE TABLE Map (
	__IDMap__ Integer NOT NULL,
	FOREIGN KEY mapelement (__FKmapelement__) REFERENCES MapContent (__IDMapContent__),
	FOREIGN KEY id (__FKid__) REFERENCES ID (__IDID__),
	FOREIGN KEY class (__FKclass__) REFERENCES CDATA (__IDCDATA__),
	FOREIGN KEY style (__FKstyle__) REFERENCES StyleSheet (__IDStyleSheet__),
	FOREIGN KEY title (__FKtitle__) REFERENCES Text (__IDText__),
	FOREIGN KEY name (__FKname__) REFERENCES NMTOKEN (__IDNMTOKEN__),
	PRIMARY KEY Map (__IDMap__),
	__FKmapelement__ Integer,
	__FKclass__ Integer,
	__FKid__ Integer,
	__FKname__ Integer,
	__FKstyle__ Integer,
	__FKtitle__ Integer
) ;

CREATE TABLE Area (
	__IDArea__ Integer NOT NULL,
	shape text,
	FOREIGN KEY coords (__FKcoords__) REFERENCES Coords (__IDCoords__),
	FOREIGN KEY href (__FKhref__) REFERENCES URI (__IDURI__),
	nohref Boolean,
	FOREIGN KEY alt (__FKalt__) REFERENCES Text (__IDText__),
	PRIMARY KEY Area (__IDArea__),
	__FKhref__ Integer,
	__FKalt__ Integer,
	__FKcoords__ Integer
) ;

CREATE TABLE Form (
	__IDForm__ Integer NOT NULL,
	FOREIGN KEY action (__FKaction__) REFERENCES URI (__IDURI__),
	method text,
	FOREIGN KEY enctype (__FKenctype__) REFERENCES ContentType (__IDContentType__),
	FOREIGN KEY onsubmit (__FKonsubmit__) REFERENCES ScriptExpression (__IDScriptExpression__),
	FOREIGN KEY onreset (__FKonreset__) REFERENCES ScriptExpression (__IDScriptExpression__),
	FOREIGN KEY accept (__FKaccept__) REFERENCES ContentTypes (__IDContentTypes__),
	FOREIGN KEY "accept-charset" ("__FKaccept-charset__") REFERENCES Charsets (__IDCharsets__),
	PRIMARY KEY Form (__IDForm__),
	__FKenctype__ Integer,
	__FKonsubmit__ Integer,
	__FKaccept__ Integer,
	"__FKaccept-charset__" Integer,
	__FKonreset__ Integer,
	__FKaction__ Integer
) ;

CREATE TABLE "Label" (
	__IDLabel__ Integer NOT NULL,
	FOREIGN KEY "for" (__FKfor__) REFERENCES IDREF (__IDIDREF__),
	FOREIGN KEY accesskey (__FKaccesskey__) REFERENCES "Character" (__IDCharacter__),
	FOREIGN KEY onfocus (__FKonfocus__) REFERENCES ScriptExpression (__IDScriptExpression__),
	FOREIGN KEY onblur (__FKonblur__) REFERENCES ScriptExpression (__IDScriptExpression__),
	PRIMARY KEY "Label" (__IDLabel__),
	__FKonfocus__ Integer,
	__FKaccesskey__ Integer,
	__FKfor__ Integer,
	__FKonblur__ Integer
) ;

CREATE TABLE Input (
	__IDInput__ Integer NOT NULL,
	type text,
	FOREIGN KEY name (__FKname__) REFERENCES CDATA (__IDCDATA__),
	FOREIGN KEY value (__FKvalue__) REFERENCES CDATA (__IDCDATA__),
	checked Boolean,
	disabled Boolean,
	readonly Boolean,
	FOREIGN KEY size (__FKsize__) REFERENCES CDATA (__IDCDATA__),
	FOREIGN KEY maxlength (__FKmaxlength__) REFERENCES Number (__IDNumber__),
	FOREIGN KEY src (__FKsrc__) REFERENCES URI (__IDURI__),
	FOREIGN KEY alt (__FKalt__) REFERENCES CDATA (__IDCDATA__),
	FOREIGN KEY usemap (__FKusemap__) REFERENCES URI (__IDURI__),
	FOREIGN KEY onselect (__FKonselect__) REFERENCES ScriptExpression (__IDScriptExpression__),
	FOREIGN KEY onchange (__FKonchange__) REFERENCES ScriptExpression (__IDScriptExpression__),
	FOREIGN KEY accept (__FKaccept__) REFERENCES ContentTypes (__IDContentTypes__),
	PRIMARY KEY Input (__IDInput__),
	__FKonselect__ Integer,
	__FKaccept__ Integer,
	__FKvalue__ Integer,
	__FKonchange__ Integer,
	__FKmaxlength__ Integer,
	__FKname__ Integer,
	__FKsrc__ Integer,
	__FKusemap__ Integer,
	__FKalt__ Integer,
	__FKsize__ Integer
) ;

CREATE TABLE "Select" (
	__IDSelect__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES CDATA (__IDCDATA__),
	FOREIGN KEY size (__FKsize__) REFERENCES Number (__IDNumber__),
	multiple Boolean,
	disabled Boolean,
	FOREIGN KEY tabindex (__FKtabindex__) REFERENCES Number (__IDNumber__),
	FOREIGN KEY onfocus (__FKonfocus__) REFERENCES ScriptExpression (__IDScriptExpression__),
	FOREIGN KEY onblur (__FKonblur__) REFERENCES ScriptExpression (__IDScriptExpression__),
	FOREIGN KEY onchange (__FKonchange__) REFERENCES ScriptExpression (__IDScriptExpression__),
	PRIMARY KEY "Select" (__IDSelect__),
	__FKonchange__ Integer,
	__FKname__ Integer,
	__FKonblur__ Integer,
	__FKonfocus__ Integer,
	__FKsize__ Integer,
	__FKtabindex__ Integer
) ;

CREATE TABLE SelectElement (
	__IDSelectElement__ Integer NOT NULL,
	PRIMARY KEY SelectElement (__IDSelectElement__)
) ;

CREATE TABLE Optgroup (
	__IDOptgroup__ Integer NOT NULL,
	disabled Boolean,
	FOREIGN KEY "label" (__FKlabel__) REFERENCES Text (__IDText__),
	PRIMARY KEY Optgroup (__IDOptgroup__),
	__FKlabel__ Integer
) ;

CREATE TABLE "Option" (
	__IDOption__ Integer NOT NULL,
	selected Boolean,
	disabled Boolean,
	FOREIGN KEY "label" (__FKlabel__) REFERENCES Text (__IDText__),
	FOREIGN KEY optionvalue (__FKoptionvalue__) REFERENCES CDATA (__IDCDATA__),
	PRIMARY KEY "Option" (__IDOption__),
	__FKoptionvalue__ Integer,
	__FKlabel__ Integer
) ;

CREATE TABLE Textarea (
	__IDTextarea__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES CDATA (__IDCDATA__),
	FOREIGN KEY rows (__FKrows__) REFERENCES Number (__IDNumber__),
	FOREIGN KEY cols (__FKcols__) REFERENCES Number (__IDNumber__),
	disabled Boolean,
	readonly Boolean,
	FOREIGN KEY onselect (__FKonselect__) REFERENCES ScriptExpression (__IDScriptExpression__),
	FOREIGN KEY onchange (__FKonchange__) REFERENCES ScriptExpression (__IDScriptExpression__),
	PRIMARY KEY Textarea (__IDTextarea__),
	__FKname__ Integer,
	__FKonchange__ Integer,
	__FKonselect__ Integer,
	__FKcols__ Integer,
	__FKrows__ Integer
) ;

CREATE TABLE FieldsetElement (
	__IDFieldsetElement__ Integer NOT NULL,
	PRIMARY KEY FieldsetElement (__IDFieldsetElement__)
) ;

CREATE TABLE Fieldset (
	__IDFieldset__ Integer NOT NULL,
	PRIMARY KEY Fieldset (__IDFieldset__)
) ;

CREATE TABLE Legend (
	__IDLegend__ Integer NOT NULL,
	FOREIGN KEY accesskey (__FKaccesskey__) REFERENCES "Character" (__IDCharacter__),
	PRIMARY KEY Legend (__IDLegend__),
	__FKaccesskey__ Integer
) ;

CREATE TABLE Button (
	__IDButton__ Integer NOT NULL,
	FOREIGN KEY name (__FKname__) REFERENCES CDATA (__IDCDATA__),
	FOREIGN KEY value (__FKvalue__) REFERENCES CDATA (__IDCDATA__),
	type text,
	disabled Boolean,
	PRIMARY KEY Button (__IDButton__),
	__FKname__ Integer,
	__FKvalue__ Integer
) ;

CREATE TABLE Cellhalign (
	__IDCellhalign__ Integer NOT NULL,
	align text,
	FOREIGN KEY "char" (__FKchar__) REFERENCES "Character" (__IDCharacter__),
	FOREIGN KEY charoff (__FKcharoff__) REFERENCES Length (__IDLength__),
	PRIMARY KEY Cellhalign (__IDCellhalign__),
	__FKcharoff__ Integer,
	__FKchar__ Integer
) ;

CREATE TABLE Cellvalign (
	__IDCellvalign__ Integer NOT NULL,
	valign text,
	PRIMARY KEY Cellvalign (__IDCellvalign__)
) ;

CREATE TABLE "Table" (
	__IDTable__ Integer NOT NULL,
	FOREIGN KEY colelement (__FKcolelement__) REFERENCES ColElement (__IDColElement__),
	FOREIGN KEY thead (__FKthead__) REFERENCES Thead (__IDThead__),
	FOREIGN KEY tfoot (__FKtfoot__) REFERENCES Tfoot (__IDTfoot__),
	FOREIGN KEY tableelement (__FKtableelement__) REFERENCES TableElement (__IDTableElement__),
	FOREIGN KEY summary (__FKsummary__) REFERENCES Text (__IDText__),
	FOREIGN KEY width (__FKwidth__) REFERENCES Length (__IDLength__),
	FOREIGN KEY border (__FKborder__) REFERENCES Pixels (__IDPixels__),
	frame text,
	rules text,
	FOREIGN KEY cellspacing (__FKcellspacing__) REFERENCES Length (__IDLength__),
	FOREIGN KEY cellpadding (__FKcellpadding__) REFERENCES Length (__IDLength__),
	PRIMARY KEY "Table" (__IDTable__),
	__FKthead__ Integer,
	__FKsummary__ Integer,
	__FKtfoot__ Integer,
	__FKcolelement__ Integer,
	__FKcellpadding__ Integer,
	__FKcellspacing__ Integer,
	__FKtableelement__ Integer,
	__FKwidth__ Integer,
	__FKborder__ Integer
) ;

CREATE TABLE ColElement (
	__IDColElement__ Integer NOT NULL,
	PRIMARY KEY ColElement (__IDColElement__)
) ;

CREATE TABLE TableElement (
	__IDTableElement__ Integer NOT NULL,
	PRIMARY KEY TableElement (__IDTableElement__)
) ;

CREATE TABLE Caption (
	__IDCaption__ Integer NOT NULL,
	PRIMARY KEY Caption (__IDCaption__)
) ;

CREATE TABLE Thead (
	__IDThead__ Integer NOT NULL,
	PRIMARY KEY Thead (__IDThead__)
) ;

CREATE TABLE Tfoot (
	__IDTfoot__ Integer NOT NULL,
	PRIMARY KEY Tfoot (__IDTfoot__)
) ;

CREATE TABLE Tbody (
	__IDTbody__ Integer NOT NULL,
	PRIMARY KEY Tbody (__IDTbody__)
) ;

CREATE TABLE Colgroup (
	__IDColgroup__ Integer NOT NULL,
	FOREIGN KEY span (__FKspan__) REFERENCES Number (__IDNumber__),
	FOREIGN KEY width (__FKwidth__) REFERENCES MultiLength (__IDMultiLength__),
	PRIMARY KEY Colgroup (__IDColgroup__),
	__FKwidth__ Integer,
	__FKspan__ Integer
) ;

CREATE TABLE Col (
	__IDCol__ Integer NOT NULL,
	FOREIGN KEY span (__FKspan__) REFERENCES Number (__IDNumber__),
	FOREIGN KEY width (__FKwidth__) REFERENCES MultiLength (__IDMultiLength__),
	PRIMARY KEY Col (__IDCol__),
	__FKwidth__ Integer,
	__FKspan__ Integer
) ;

CREATE TABLE Tr (
	__IDTr__ Integer NOT NULL,
	PRIMARY KEY Tr (__IDTr__)
) ;

CREATE TABLE TrElement (
	__IDTrElement__ Integer NOT NULL,
	PRIMARY KEY TrElement (__IDTrElement__)
) ;

CREATE TABLE Th (
	__IDTh__ Integer NOT NULL,
	FOREIGN KEY abbr (__FKabbr__) REFERENCES Text (__IDText__),
	FOREIGN KEY axis (__FKaxis__) REFERENCES CDATA (__IDCDATA__),
	FOREIGN KEY headers (__FKheaders__) REFERENCES IDREFS (__IDIDREFS__),
	scope text,
	FOREIGN KEY rowspan (__FKrowspan__) REFERENCES Number (__IDNumber__),
	FOREIGN KEY colspan (__FKcolspan__) REFERENCES Number (__IDNumber__),
	PRIMARY KEY Th (__IDTh__),
	__FKaxis__ Integer,
	__FKcolspan__ Integer,
	__FKheaders__ Integer,
	__FKabbr__ Integer,
	__FKrowspan__ Integer
) ;

CREATE TABLE Td (
	__IDTd__ Integer NOT NULL,
	FOREIGN KEY abbr (__FKabbr__) REFERENCES Text (__IDText__),
	FOREIGN KEY axis (__FKaxis__) REFERENCES CDATA (__IDCDATA__),
	FOREIGN KEY headers (__FKheaders__) REFERENCES IDREFS (__IDIDREFS__),
	scope text,
	FOREIGN KEY rowspan (__FKrowspan__) REFERENCES Number (__IDNumber__),
	FOREIGN KEY colspan (__FKcolspan__) REFERENCES Number (__IDNumber__),
	PRIMARY KEY Td (__IDTd__),
	__FKabbr__ Integer,
	__FKheaders__ Integer,
	__FKcolspan__ Integer,
	__FKaxis__ Integer,
	__FKrowspan__ Integer
) ;

CREATE TABLE Optgroup_options_Option (
	__IDOptgroup__ Integer NOT NULL,
	__IDOption__ Integer NOT NULL
) ;

CREATE TABLE UriList_uris_URI (
	__IDUriList__ Integer NOT NULL,
	__IDURI__ Integer NOT NULL
) ;

CREATE TABLE H4_h4Elements_Inline (
	__IDH4__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Legend_legendelement_Inline (
	__IDLegend__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Dfn_dfnElements_Inline (
	__IDDfn__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Td_tdelement_Flow (
	__IDTd__ Integer NOT NULL,
	__IDFlow__ Integer NOT NULL
) ;

CREATE TABLE TitleBaseHeadElement_headmisc_HeadMisc (
	__IDTitleBaseHeadElement__ Integer NOT NULL,
	__IDHeadMisc__ Integer NOT NULL
) ;

CREATE TABLE ContentTypes_contentTypes_ContentType (
	__IDContentTypes__ Integer NOT NULL,
	__IDContentType__ Integer NOT NULL
) ;

CREATE TABLE Div_divElements_Flow (
	__IDDiv__ Integer NOT NULL,
	__IDFlow__ Integer NOT NULL
) ;

CREATE TABLE Body_bodyElements_Block (
	__IDBody__ Integer NOT NULL,
	__IDBlock__ Integer NOT NULL
) ;

CREATE TABLE H5_h5Elements_Inline (
	__IDH5__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Big_bigElements_Inline (
	__IDBig__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Tt_ttElements_Inline (
	__IDTt__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE H2_h2Elements_Inline (
	__IDH2__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Select_selectelement_SelectElement (
	__IDSelect__ Integer NOT NULL,
	__IDSelectElement__ Integer NOT NULL
) ;

CREATE TABLE Th_thelement_Flow (
	__IDTh__ Integer NOT NULL,
	__IDFlow__ Integer NOT NULL
) ;

CREATE TABLE TitleHeadElement_baseTitleHeadElement_BaseTitleHeadElement (
	__IDTitleHeadElement__ Integer NOT NULL,
	__IDBaseTitleHeadElement__ Integer NOT NULL
) ;

CREATE TABLE Var_varElements_Inline (
	__IDVar__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Q_qElements_Inline (
	__IDQ__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE I_iElements_Inline (
	__IDI__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Abbr_abbrElements_Inline (
	__IDAbbr__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Tfoot_tr_Tr (
	__IDTfoot__ Integer NOT NULL,
	__IDTr__ Integer NOT NULL
) ;

CREATE TABLE B_bElements_Inline (
	__IDB__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Kbd_kbdElements_Inline (
	__IDKbd__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Tbody_tr_Tr (
	__IDTbody__ Integer NOT NULL,
	__IDTr__ Integer NOT NULL
) ;

CREATE TABLE Ins_flowelement_Flow (
	__IDIns__ Integer NOT NULL,
	__IDFlow__ Integer NOT NULL
) ;

CREATE TABLE Del_flowelement_Flow (
	__IDDel__ Integer NOT NULL,
	__IDFlow__ Integer NOT NULL
) ;

CREATE TABLE Label_labelelements_Inline (
	__IDLabel__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Head_headmisc_HeadMisc (
	__IDHead__ Integer NOT NULL,
	__IDHeadMisc__ Integer NOT NULL
) ;

CREATE TABLE ColElement_cols_Col (
	__IDColElement__ Integer NOT NULL,
	__IDCol__ Integer NOT NULL
) ;

CREATE TABLE Strong_strongElements_Inline (
	__IDStrong__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Form_formelement_FormContent (
	__IDForm__ Integer NOT NULL,
	__IDFormContent__ Integer NOT NULL
) ;

CREATE TABLE MapContent_mapElements_MapElement (
	__IDMapContent__ Integer NOT NULL,
	__IDMapElement__ Integer NOT NULL
) ;

CREATE TABLE Cite_citeElements_Inline (
	__IDCite__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Colgroup_cols_Col (
	__IDColgroup__ Integer NOT NULL,
	__IDCol__ Integer NOT NULL
) ;

CREATE TABLE TableElement_tr_Tr (
	__IDTableElement__ Integer NOT NULL,
	__IDTr__ Integer NOT NULL
) ;

CREATE TABLE BaseTitleHeadElement_headmisc_HeadMisc (
	__IDBaseTitleHeadElement__ Integer NOT NULL,
	__IDHeadMisc__ Integer NOT NULL
) ;

CREATE TABLE Tr_trelements_TrElement (
	__IDTr__ Integer NOT NULL,
	__IDTrElement__ Integer NOT NULL
) ;

CREATE TABLE Em_emElements_Inline (
	__IDEm__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE TableElement_tbody_Tbody (
	__IDTableElement__ Integer NOT NULL,
	__IDTbody__ Integer NOT NULL
) ;

CREATE TABLE Sub_subElements_Inline (
	__IDSub__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE AContent_pcdataAContent_PCDATA (
	__IDAContent__ Integer NOT NULL,
	__IDPCDATA__ Integer NOT NULL
) ;

CREATE TABLE ButtonContent_pcdataButtonContent_PCDATA (
	__IDButtonContent__ Integer NOT NULL,
	__IDPCDATA__ Integer NOT NULL
) ;

CREATE TABLE H3_h3Elements_Inline (
	__IDH3__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Address_addressElements_Inline (
	__IDAddress__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Small_smallElements_Inline (
	__IDSmall__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE BaseHeadElement_headmisc_HeadMisc (
	__IDBaseHeadElement__ Integer NOT NULL,
	__IDHeadMisc__ Integer NOT NULL
) ;

CREATE TABLE Charsets_charsets_Charset (
	__IDCharsets__ Integer NOT NULL,
	__IDCharset__ Integer NOT NULL
) ;

CREATE TABLE Span_spanElements_Inline (
	__IDSpan__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Sup_supElements_Inline (
	__IDSup__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE ObjectElement_objectpcdata_PCDATA (
	__IDObjectElement__ Integer NOT NULL,
	__IDPCDATA__ Integer NOT NULL
) ;

CREATE TABLE FieldsetElement_fieldsetpcdata_PCDATA (
	__IDFieldsetElement__ Integer NOT NULL,
	__IDPCDATA__ Integer NOT NULL
) ;

CREATE TABLE Code_codeElements_Inline (
	__IDCode__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Acronym_acronymElements_Inline (
	__IDAcronym__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Table_caption_Caption (
	__IDTable__ Integer NOT NULL,
	__IDCaption__ Integer NOT NULL
) ;

CREATE TABLE Blockquote_blockquoteElements_Block (
	__IDBlockquote__ Integer NOT NULL,
	__IDBlock__ Integer NOT NULL
) ;

CREATE TABLE H6_h6Elements_Inline (
	__IDH6__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Dd_ddElements_Flow (
	__IDDd__ Integer NOT NULL,
	__IDFlow__ Integer NOT NULL
) ;

CREATE TABLE Ul_li_Li (
	__IDUl__ Integer NOT NULL,
	__IDLi__ Integer NOT NULL
) ;

CREATE TABLE PreContent_pcdataPreContent_PCDATA (
	__IDPreContent__ Integer NOT NULL,
	__IDPCDATA__ Integer NOT NULL
) ;

CREATE TABLE Bdo_bdoElements_Inline (
	__IDBdo__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Fieldset_fieldsetelements_FieldsetElement (
	__IDFieldset__ Integer NOT NULL,
	__IDFieldsetElement__ Integer NOT NULL
) ;

CREATE TABLE Thead_tr_Tr (
	__IDThead__ Integer NOT NULL,
	__IDTr__ Integer NOT NULL
) ;

CREATE TABLE Dl_dlElements_DlElement (
	__IDDl__ Integer NOT NULL,
	__IDDlElement__ Integer NOT NULL
) ;

CREATE TABLE Samp_sampElements_Inline (
	__IDSamp__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Flow_pcdataFlow_PCDATA (
	__IDFlow__ Integer NOT NULL,
	__IDPCDATA__ Integer NOT NULL
) ;

CREATE TABLE A_acontent_AContent (
	__IDA__ Integer NOT NULL,
	__IDAContent__ Integer NOT NULL
) ;

CREATE TABLE Object_objectelement_ObjectElement (
	__IDObject__ Integer NOT NULL,
	__IDObjectElement__ Integer NOT NULL
) ;

CREATE TABLE Caption_captionelement_Inline (
	__IDCaption__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Coords_lengths_Length (
	__IDCoords__ Integer NOT NULL,
	__IDLength__ Integer NOT NULL
) ;

CREATE TABLE Li_liElements_Flow (
	__IDLi__ Integer NOT NULL,
	__IDFlow__ Integer NOT NULL
) ;

CREATE TABLE TitleHeadElement_headmisc_HeadMisc (
	__IDTitleHeadElement__ Integer NOT NULL,
	__IDHeadMisc__ Integer NOT NULL
) ;

CREATE TABLE Inline_pcdataInline_PCDATA (
	__IDInline__ Integer NOT NULL,
	__IDPCDATA__ Integer NOT NULL
) ;

CREATE TABLE H1_h1Elements_Inline (
	__IDH1__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Dt_dtElements_Inline (
	__IDDt__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE Button_buttoncontent_ButtonContent (
	__IDButton__ Integer NOT NULL,
	__IDButtonContent__ Integer NOT NULL
) ;

CREATE TABLE Pre_preElements_PreContent (
	__IDPre__ Integer NOT NULL,
	__IDPreContent__ Integer NOT NULL
) ;

CREATE TABLE Ol_li_Li (
	__IDOl__ Integer NOT NULL,
	__IDLi__ Integer NOT NULL
) ;

CREATE TABLE IDREFS_idrefs_IDREF (
	__IDIDREFS__ Integer NOT NULL,
	__IDIDREF__ Integer NOT NULL
) ;

CREATE TABLE P_pElements_Inline (
	__IDP__ Integer NOT NULL,
	__IDInline__ Integer NOT NULL
) ;

CREATE TABLE ColElement_colgroup_Colgroup (
	__IDColElement__ Integer NOT NULL,
	__IDColgroup__ Integer NOT NULL
) ;

CREATE TABLE BaseHeadElement_titleBaseHeadElement_TitleBaseHeadElement (
	__IDBaseHeadElement__ Integer NOT NULL,
	__IDTitleBaseHeadElement__ Integer NOT NULL
) ;
