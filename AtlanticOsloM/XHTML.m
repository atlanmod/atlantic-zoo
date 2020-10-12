module XHTML {

	type ValuedElement {
		Value_Att : Text;
	};

	type CDATA : ValuedElement;

	type PCDATA : ValuedElement;

	type NMTOKEN : ValuedElement;

	type IDREF : ValuedElement;

	type IDREFS {
		Idrefs_Ref : IDREF*;
	};

	type ID : ValuedElement;

	type EMPTY;

	type ContentType : CDATA;

	type ContentTypes {
		ContentTypes_ContRef : ContentType#2 ..;
	};

	type Charset : CDATA;

	type Charsets {
		Charsets_ContRef : Charset#2 ..;
	};

	type LanguageCode : NMTOKEN;

	type Character : CDATA;

	type Number : CDATA;

	type LinkTypes : CDATA;

	type MediaDesc : CDATA;

	type URI : CDATA;

	type UriList {
		Uris_Ref : URI#2 ..;
	};

	type Datetime : CDATA;

	type ScriptExpression : CDATA;

	type StyleSheet : CDATA;

	type Text : CDATA;

	type Length : CDATA;

	type MultiLength : CDATA;

	type Pixels : CDATA;

	type Shape {"rect", "circle", "poly", "default"};

	type Coords {
		Lengths_ContRef : Length#2 ..;
	};

	type CoreAttrs {
		Id_ContRef : ID?;
		Class_ContRef : CDATA?;
		Style_ContRef : StyleSheet?;
		Title_ContRef : Text?;
	};

	type Direction {"ltr", "rtl"};

	type I18n {
		Lang_ContRef : LanguageCode?;
		@[Xml:lang_ContRef] : LanguageCode?;
		Dir_Att : Direction?;
	};

	type Events {
		Onclick_ContRef : ScriptExpression?;
		Ondblclick_ContRef : ScriptExpression?;
		Onmousedown_ContRef : ScriptExpression?;
		Onmouseup_ContRef : ScriptExpression?;
		Onmouseover_ContRef : ScriptExpression?;
		Onmousemove_ContRef : ScriptExpression?;
		Onmouseout_ContRef : ScriptExpression?;
		Onkeypress_ContRef : ScriptExpression?;
		Onkeydown_ContRef : ScriptExpression?;
		Onkeyup_ContRef : ScriptExpression?;
	};

	type Attrs : CoreAttrs, I18n, Events;

	type Focus {
		Accesskey_ContRef : Character?;
		Tabindex_ContRef : Number?;
		Onfocus_ContRef : ScriptExpression?;
		Onblur_ContRef : ScriptExpression?;
	};

	type Specialpre : Special, PreContent;

	type Special : Inline, ButtonContent;

	type Fontstyle : Inline, AContent, PreContent, ButtonContent;

	type Phrase : Inline, AContent, PreContent, ButtonContent;

	type Inlineforms : Inline, AContent, PreContent;

	type Miscinline : Misc, Inline, AContent, PreContent;

	type Misc : Block, Flow, FormContent, ButtonContent, ObjectElement, MapElementContent, FieldsetElement;

	type Inline : Inline;

	type Inline : Flow, ObjectElement, FieldsetElement {
		PcdataInline_ContRef : PCDATA*;
	};

	type Heading : Block, ButtonContent;

	type Lists : Block, ButtonContent;

	type Blocktext : Block, ButtonContent;

	type Block : Block, Flow, FormContent, ObjectElement, MapElementContent, FieldsetElement;

	type Block;

	type Flow {
		PcdataFlow_ContRef : PCDATA*;
	};

	type AContent {
		PcdataAContent_ContRef : PCDATA*;
	};

	type PreContent {
		PcdataPreContent_ContRef : PCDATA*;
	};

	type FormContent;

	type ButtonContent {
		PcdataButtonContent_ContRef : PCDATA*;
	};

	type Html {
		I18n_ContRef : I18n;
		Id_ContRef : ID?;
		Xmlns_ContRef : URI;
		Head_ContRef : Head;
		Body_ContRef : Body;
	};

	type HeadMisc;

	type Head {
		I18n_ContRef : I18n;
		Id_ContRef : ID?;
		Profile_ContRef : URI?;
		Headmisc_ContRef : HeadMisc*;
		Headelement_ContRef : HeadElement;
		Html_Ref : Html;
	};

	type HeadElement;

	type TitleHeadElement : HeadElement {
		Title_ContRef : Title;
		Headmisc_ContRef : HeadMisc*;
		BaseTitleHeadElement_ContRef : BaseTitleHeadElement+;
	};

	type BaseTitleHeadElement {
		Base_ContRef : Base;
		Headmisc_ContRef : HeadMisc*;
	};

	type BaseHeadElement : HeadElement {
		Base_ContRef : Base;
		Headmisc_ContRef : HeadMisc*;
		TitleBaseHeadElement_ContRef : TitleBaseHeadElement+;
	};

	type TitleBaseHeadElement {
		Title_ContRef : Title;
		Headmisc_ContRef : HeadMisc*;
	};

	type Title : PCDATA {
		I18n_ContRef : I18n;
		Id_ContRef : ID?;
	};

	type Base : EMPTY {
		Href_ContRef : URI;
		Id_ContRef : ID?;
	};

	type Meta : EMPTY, HeadMisc {
		I18n_ContRef : I18n;
		Id_ContRef : ID?;
		Httpequiv_ContRef : CDATA?;
		Name_ContRef : CDATA?;
		Content_ContRef : CDATA?;
		Scheme_ContRef : CDATA?;
	};

	type Link : EMPTY, Attrs, HeadMisc {
		Charset_ContRef : Charset?;
		Href_ContRef : URI?;
		Hreflang_ContRef : LanguageCode?;
		Type_ContRef : ContentType?;
		Rel_ContRef : LinkTypes?;
		Rev_ContRef : LinkTypes?;
		Media_ContRef : MediaDesc?;
	};

	type Style : PCDATA, HeadMisc {
		I18n_ContRef : I18n;
		Id_ContRef : ID?;
		Type_ContRef : ContentType;
		Media_ContRef : MediaDesc?;
		Title_ContRef : Text?;
		@[Xml:space_Att] : Text;
	};

	type Script : PCDATA, Miscinline, HeadMisc {
		Id_ContRef : ID?;
		Charset_ContRef : Charset?;
		Type_ContRef : ContentType;
		Src_ContRef : URI?;
		Defer_Att : Text;
		@[Xml:space_Att] : Text;
	};

	type Noscript : Attrs, Misc {
		Block_ContRef : Block;
	};

	type Body : Attrs {
		BodyElements_ContRef : Block*;
		Onload_ContRef : ScriptExpression?;
		Onunload_ContRef : ScriptExpression?;
		Html_Ref : Html;
	};

	type Div : Attrs, Block, ButtonContent {
		DivElements_ContRef : Flow*;
	};

	type P : Attrs, Block, ButtonContent {
		PElements_ContRef : Inline*;
	};

	type H1 : Attrs, Heading {
		H1Elements_ContRef : Inline*;
	};

	type H2 : Attrs, Heading {
		H2Elements_ContRef : Inline*;
	};

	type H3 : Attrs, Heading {
		H3Elements_ContRef : Inline*;
	};

	type H4 : Attrs, Heading {
		H4Elements_ContRef : Inline*;
	};

	type H5 : Attrs, Heading {
		H5Elements_ContRef : Inline*;
	};

	type H6 : Attrs, Heading {
		H6Elements_ContRef : Inline*;
	};

	type Ul : Attrs, Lists {
		Li_ContRef : Li+;
	};

	type Ol : Attrs, Lists {
		Li_ContRef : Li+;
	};

	type Li : Attrs {
		LiElements_ContRef : Flow*;
	};

	type Dl : Attrs, Lists {
		DlElements_ContRef : DlElement+;
	};

	type DlElement : Attrs;

	type Dt : DlElement {
		DtElements_ContRef : Inline*;
	};

	type Dd : DlElement {
		DdElements_ContRef : Flow*;
	};

	type Address : Attrs, Blocktext {
		AddressElements_ContRef : Inline*;
	};

	type Hr : EMPTY, Attrs, Blocktext;

	type Pre : Attrs, Blocktext {
		PreElements_ContRef : PreContent*;
		@[Xml:space_Att] : Text;
	};

	type Blockquote : Attrs, Blocktext {
		BlockquoteElements_ContRef : Block*;
		Cite_ContRef : URI?;
	};

	type Ins : Attrs, Miscinline {
		Flowelement_ContRef : Flow*;
		Cite_ContRef : URI?;
		Datetime_ContRef : Datetime?;
	};

	type Del : Attrs, Miscinline {
		Flowelement_ContRef : Flow*;
		Cite_ContRef : URI?;
		Datetime_ContRef : Datetime?;
	};

	type A : Attrs, Focus, Inline, PreContent {
		Acontent_ContRef : AContent*;
		Charset_ContRef : Charset?;
		Type_ContRef : ContentType?;
		Name_ContRef : NMTOKEN?;
		Href_ContRef : URI?;
		Hreflang_ContRef : LanguageCode?;
		Rel_ContRef : LinkTypes?;
		Rev_ContRef : LinkTypes?;
		Shape_Att : Shape;
		Coords_ContRef : Coords?;
	};

	type Span : Attrs, Specialpre {
		SpanElements_Ref : Inline*;
	};

	type Bdo : CoreAttrs, Events, Specialpre {
		BdoElements_ContRef : Inline*;
		Lang_ContRef : LanguageCode?;
		@[Xml:lang_ContRef] : LanguageCode?;
		Dir_Att : Direction;
	};

	type Br : EMPTY, CoreAttrs, Specialpre;

	type Em : Attrs, Phrase {
		EmElements_ContRef : Inline*;
	};

	type Strong : Attrs, Phrase {
		StrongElements_ContRef : Inline*;
	};

	type Dfn : Attrs, Phrase {
		DfnElements_ContRef : Inline*;
	};

	type Code : Attrs, Phrase {
		CodeElements_ContRef : Inline*;
	};

	type Samp : Attrs, Phrase {
		SampElements_ContRef : Inline*;
	};

	type Kbd : Attrs, Phrase {
		KbdElements_ContRef : Inline*;
	};

	type Var : Attrs, Phrase {
		VarElements_ContRef : Inline*;
	};

	type Cite : Attrs, Phrase {
		CiteElements_ContRef : Inline*;
	};

	type Abbr : Attrs, Phrase {
		AbbrElements_ContRef : Inline*;
	};

	type Acronym : Attrs, Phrase {
		AcronymElements_ContRef : Inline*;
	};

	type Q : Attrs, Phrase {
		QElements_ContRef : Inline*;
		Cite_ContRef : URI?;
	};

	type Sub : Attrs, Phrase {
		SubElements_ContRef : Inline*;
	};

	type Sup : Attrs, Phrase {
		SupElements_ContRef : Inline*;
	};

	type Tt : Attrs, Fontstyle {
		TtElements_ContRef : Inline*;
	};

	type I : Attrs, Fontstyle {
		IElements_ContRef : Inline*;
	};

	type B : Attrs, Fontstyle {
		BElements_ContRef : Inline*;
	};

	type Big : Attrs, Fontstyle {
		BigElements_ContRef : Inline*;
	};

	type Small : Attrs, Fontstyle {
		SmallElements_ContRef : Inline*;
	};

	type ObjectElement {
		Objectpcdata_ContRef : PCDATA*;
	};

	type Object : Attrs, Special, HeadMisc {
		Objectelement_ContRef : ObjectElement*;
		Declare_Att : Logical;
		Classid_ContRef : URI?;
		Codebase_ContRef : URI?;
		Data_ContRef : URI?;
		Type_ContRef : ContentType?;
		Codetype_ContRef : ContentType?;
		Archive_ContRef : UriList?;
		Standby_ContRef : Text?;
		Height_ContRef : Length?;
		Width_ContRef : Length?;
		Usemap_ContRef : URI?;
		Name_ContRef : NMTOKEN?;
		Tabindex_ContRef : Number?;
	};

	type ValueType {"data", "ref", "object"};

	type Param : EMPTY, ObjectElement {
		Id_ContRef : ID?;
		Name_ContRef : CDATA?;
		Value_ContRef : CDATA?;
		Valuetype_Att : ValueType;
		Type_ContRef : ContentType?;
	};

	type Img : EMPTY, Attrs, Special {
		Src_ContRef : URI;
		Alt_ContRef : Text;
		Longdesc_ContRef : URI?;
		Height_ContRef : Length?;
		Width_ContRef : Length?;
		Usemap_ContRef : URI?;
		Ismap_Att : Logical;
	};

	type MapContent {
		MapElements_ContRef : MapElement+;
	};

	type MapElement;

	type MapElementContent;

	type Map : I18n, Events, Specialpre {
		Mapelement_ContRef : MapContent;
		Id_ContRef : ID;
		Class_ContRef : CDATA?;
		Style_ContRef : StyleSheet?;
		Title_ContRef : Text?;
		Name_ContRef : NMTOKEN?;
	};

	type Area : EMPTY, Attrs, Focus, MapElement {
		Shape_Att : Shape;
		Coords_ContRef : Coords?;
		Href_ContRef : URI?;
		Nohref_Att : Logical;
		Alt_ContRef : Text;
	};

	type FomeMethod {"get", "post"};

	type Form : Attrs, Block, ObjectElement, MapElementContent, FieldsetElement {
		Formelement_ContRef : FormContent*;
		Action_ContRef : URI;
		Method_Att : FomeMethod;
		Enctype_ContRef : ContentType;
		Onsubmit_ContRef : ScriptExpression?;
		Onreset_ContRef : ScriptExpression?;
		Accept_ContRef : ContentTypes?;
		@[Accept-charset_ContRef] : Charsets?;
	};

	type Label : Attrs, Inlineforms {
		Labelelements_ContRef : Inline*;
		For_ContRef : IDREF;
		Accesskey_ContRef : Character?;
		Onfocus_ContRef : ScriptExpression?;
		Onblur_ContRef : ScriptExpression?;
	};

	type InputType {"text", "password", "checkbox", "radio", "submit", "reset", "file", "hidden", "image", "button"};

	type Input : EMPTY, Attrs, Focus, Inlineforms {
		Type_Att : InputType;
		Name_ContRef : CDATA?;
		Value_ContRef : CDATA?;
		Checked_Att : Logical;
		Disabled_Att : Logical;
		Readonly_Att : Logical;
		Size_ContRef : CDATA?;
		Maxlength_ContRef : Number?;
		Src_ContRef : URI?;
		Alt_ContRef : CDATA?;
		Usemap_ContRef : URI?;
		Onselect_ContRef : ScriptExpression?;
		Onchange_ContRef : ScriptExpression?;
		Accept_ContRef : ContentTypes?;
	};

	type Select : Attrs, Inlineforms {
		Selectelement_ContRef : SelectElement+;
		Name_ContRef : CDATA?;
		Size_ContRef : Number?;
		Multiple_Att : Logical;
		Disabled_Att : Logical;
		Tabindex_ContRef : Number?;
		Onfocus_ContRef : ScriptExpression?;
		Onblur_ContRef : ScriptExpression?;
		Onchange_ContRef : ScriptExpression?;
	};

	type SelectElement;

	type Optgroup : SelectElement, Attrs {
		Options_ContRef : Option+;
		Disabled_Att : Logical;
		Label_ContRef : Text;
	};

	type Option : SelectElement, PCDATA, Attrs {
		Selected_Att : Logical;
		Disabled_Att : Logical;
		Label_ContRef : Text?;
		Optionvalue_ContRef : CDATA?;
	};

	type Textarea : PCDATA, Attrs, Focus, Inlineforms {
		Name_ContRef : CDATA?;
		Rows_ContRef : Number;
		Cols_ContRef : Number;
		Disabled_Att : Logical;
		Readonly_Att : Logical;
		Onselect_ContRef : ScriptExpression?;
		Onchange_ContRef : ScriptExpression?;
	};

	type FieldsetElement {
		Fieldsetpcdata_ContRef : PCDATA*;
	};

	type Fieldset : Attrs, Block {
		Fieldsetelements_ContRef : FieldsetElement*;
	};

	type Legend : Attrs, FieldsetElement {
		Legendelement_ContRef : Inline*;
		Accesskey_ContRef : Character?;
	};

	type ButtonType {"button", "submit", "reset"};

	type Button : Attrs, Focus, Inlineforms {
		Buttoncontent_ContRef : ButtonContent*;
		Name_ContRef : CDATA?;
		Value_ContRef : CDATA?;
		Type_Att : ButtonType;
		Disabled_Att : Logical;
	};

	type TFrame {"void", "above", "below", "hsides", "lhs", "rhs", "vsides", "box", "border"};

	type TRules {"none", "groups", "rows", "cols", "all"};

	type CellHAlign {"left", "center", "right", "justify", "char"};

	type Cellhalign {
		Align_Att : CellHAlign?;
		Char_ContRef : Character?;
		Charoff_ContRef : Length?;
	};

	type CellVAlign {"top", "middle", "bottom", "baseline"};

	type Cellvalign {
		Valign_Att : CellVAlign?;
	};

	type Table : Attrs, Block, ButtonContent {
		Caption_ContRef : Caption+;
		Colelement_ContRef : ColElement;
		Thead_ContRef : Thead;
		Tfoot_ContRef : Tfoot;
		Tableelement_ContRef : TableElement;
		Summary_ContRef : Text?;
		Width_ContRef : Length?;
		Border_ContRef : Pixels?;
		Frame_Att : TFrame?;
		Rules_Att : TRules?;
		Cellspacing_ContRef : Length?;
		Cellpadding_ContRef : Length?;
	};

	type ColElement {
		Cols_ContRef : Col*;
		Colgroup_ContRef : Colgroup*;
	};

	type TableElement {
		Tbody_ContRef : Tbody+;
		Tr_ContRef : Tr+;
	};

	type Caption : Attrs {
		Captionelement_ContRef : Inline*;
	};

	type Thead : Attrs, Cellhalign, Cellvalign {
		Tr_ContRef : Tr+;
	};

	type Tfoot : Attrs, Cellhalign, Cellvalign {
		Tr_ContRef : Tr+;
	};

	type Tbody : Attrs, Cellhalign, Cellvalign {
		Tr_ContRef : Tr+;
	};

	type Colgroup : Attrs, Cellhalign, Cellvalign {
		Cols_ContRef : Col*;
		Span_ContRef : Number;
		Width_ContRef : MultiLength?;
	};

	type Col : EMPTY, Attrs, Cellhalign, Cellvalign {
		Span_ContRef : Number;
		Width_ContRef : MultiLength?;
	};

	type Tr : Attrs, Cellhalign, Cellvalign {
		Trelements_ContRef : TrElement+;
	};

	type TrElement;

	type Scope {"row", "col", "rowgroup", "colgroup"};

	type Th : TrElement, Attrs, Cellvalign, Cellhalign {
		Thelement_ContRef : Flow*;
		Abbr_ContRef : Text?;
		Axis_ContRef : CDATA?;
		Headers_ContRef : IDREFS?;
		Scope_Att : Scope?;
		Rowspan_ContRef : Number;
		Colspan_ContRef : Number;
	};

	type Td : TrElement, Attrs, Cellvalign, Cellhalign {
		Tdelement_ContRef : Flow*;
		Abbr_ContRef : Text?;
		Axis_ContRef : CDATA?;
		Headers_ContRef : IDREFS?;
		Scope_Att : Scope?;
		Rowspan_ContRef : Number;
		Colspan_ContRef : Number;
	};
}