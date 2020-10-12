CREATE TABLE UIModel (
	__IDUIModel__ Integer NOT NULL,
	FOREIGN KEY windows (__FKwindows__) REFERENCES Windows (__IDWindows__),
	PRIMARY KEY UIModel (__IDUIModel__),
	__FKwindows__ Integer
) ;

CREATE TABLE Windows (
	__IDWindows__ Integer NOT NULL,
	id text,
	title text,
	orient text,
	style text,
	PRIMARY KEY Windows (__IDWindows__)
) ;

CREATE TABLE Button (
	__IDButton__ Integer NOT NULL,
	tooltiptext text,
	image text,
	PRIMARY KEY Button (__IDButton__)
) ;

CREATE TABLE Image (
	__IDImage__ Integer NOT NULL,
	src text,
	PRIMARY KEY Image (__IDImage__)
) ;

CREATE TABLE RadioGroup (
	__IDRadioGroup__ Integer NOT NULL,
	PRIMARY KEY RadioGroup (__IDRadioGroup__)
) ;

CREATE TABLE Radio (
	__IDRadio__ Integer NOT NULL,
	id text,
	"label" text,
	selected Boolean,
	disabled Boolean,
	PRIMARY KEY Radio (__IDRadio__)
) ;

CREATE TABLE ListBox (
	__IDListBox__ Integer NOT NULL,
	rows Integer,
	PRIMARY KEY ListBox (__IDListBox__)
) ;

CREATE TABLE ListItem (
	__IDListItem__ Integer NOT NULL,
	"label" text,
	value text,
	PRIMARY KEY ListItem (__IDListItem__)
) ;

CREATE TABLE MenuList (
	__IDMenuList__ Integer NOT NULL,
	PRIMARY KEY MenuList (__IDMenuList__)
) ;

CREATE TABLE MenuItem (
	__IDMenuItem__ Integer NOT NULL,
	"label" text,
	PRIMARY KEY MenuItem (__IDMenuItem__)
) ;

CREATE TABLE vbox (
	__IDvbox__ Integer NOT NULL,
	PRIMARY KEY vbox (__IDvbox__)
) ;

CREATE TABLE hbox (
	__IDhbox__ Integer NOT NULL,
	PRIMARY KEY hbox (__IDhbox__)
) ;

CREATE TABLE Containement (
	__IDContainement__ Integer NOT NULL,
	style text,
	accesskey text,
	class text,
	maxlength Integer,
	"label" text,
	orient text,
	minlength text,
	onclick text,
	disabled text,
	PRIMARY KEY Containement (__IDContainement__)
) ;

CREATE TABLE GroupBox (
	__IDGroupBox__ Integer NOT NULL,
	PRIMARY KEY GroupBox (__IDGroupBox__)
) ;

CREATE TABLE Container (
	__IDContainer__ Integer NOT NULL,
	PRIMARY KEY Container (__IDContainer__)
) ;

CREATE TABLE Interactor (
	__IDInteractor__ Integer NOT NULL,
	flex Integer,
	id text,
	stat text,
	style text,
	PRIMARY KEY Interactor (__IDInteractor__)
) ;

CREATE TABLE TabBox (
	__IDTabBox__ Integer NOT NULL,
	PRIMARY KEY TabBox (__IDTabBox__)
) ;

CREATE TABLE TextBox (
	__IDTextBox__ Integer NOT NULL,
	multiline Boolean,
	value text,
	PRIMARY KEY TextBox (__IDTextBox__)
) ;

CREATE TABLE Spacer (
	__IDSpacer__ Integer NOT NULL,
	PRIMARY KEY Spacer (__IDSpacer__)
) ;

CREATE TABLE "Label" (
	__IDLabel__ Integer NOT NULL,
	value text,
	control text,
	PRIMARY KEY "Label" (__IDLabel__)
) ;

CREATE TABLE Grid (
	__IDGrid__ Integer NOT NULL,
	PRIMARY KEY Grid (__IDGrid__)
) ;

CREATE TABLE row (
	__IDrow__ Integer NOT NULL,
	PRIMARY KEY row (__IDrow__)
) ;

CREATE TABLE "column" (
	__IDcolumn__ Integer NOT NULL,
	PRIMARY KEY "column" (__IDcolumn__)
) ;

CREATE TABLE CheckBox (
	__IDCheckBox__ Integer NOT NULL,
	checked Boolean,
	PRIMARY KEY CheckBox (__IDCheckBox__)
) ;

CREATE TABLE Caption (
	__IDCaption__ Integer NOT NULL,
	"label" text,
	PRIMARY KEY Caption (__IDCaption__)
) ;

CREATE TABLE Description (
	__IDDescription__ Integer NOT NULL,
	value text,
	PRIMARY KEY Description (__IDDescription__)
) ;

CREATE TABLE HeaderCss (
	__IDHeaderCss__ Integer NOT NULL,
	ref text,
	type text,
	PRIMARY KEY HeaderCss (__IDHeaderCss__)
) ;

CREATE TABLE HeaderJScript (
	__IDHeaderJScript__ Integer NOT NULL,
	ref text,
	PRIMARY KEY HeaderJScript (__IDHeaderJScript__)
) ;

CREATE TABLE TabPanel (
	__IDTabPanel__ Integer NOT NULL,
	id text,
	orient text,
	PRIMARY KEY TabPanel (__IDTabPanel__)
) ;

CREATE TABLE Event (
	__IDEvent__ Integer NOT NULL,
	functionCalledName text,
	name text,
	PRIMARY KEY Event (__IDEvent__)
) ;

CREATE TABLE Parameter (
	__IDParameter__ Integer NOT NULL,
	value text,
	name text,
	PRIMARY KEY Parameter (__IDParameter__)
) ;

CREATE TABLE onClick (
	__IDonClick__ Integer NOT NULL,
	PRIMARY KEY onClick (__IDonClick__)
) ;

CREATE TABLE Function (
	__IDFunction__ Integer NOT NULL,
	name text,
	FOREIGN KEY functionUIModel (__FKfunctionUIModel__) REFERENCES UIModel (__IDUIModel__),
	body text,
	PRIMARY KEY Function (__IDFunction__),
	__FKfunctionUIModel__ Integer
) ;

CREATE TABLE UIModel_functions_Function (
	__IDUIModel__ Integer NOT NULL,
	__IDFunction__ Integer NOT NULL
) ;

CREATE TABLE Windows_headers_HeaderCss (
	__IDWindows__ Integer NOT NULL,
	__IDHeaderCss__ Integer NOT NULL
) ;

CREATE TABLE Windows_headersJScript_HeaderJScript (
	__IDWindows__ Integer NOT NULL,
	__IDHeaderJScript__ Integer NOT NULL
) ;

CREATE TABLE RadioGroup_radiobuttons_Radio (
	__IDRadioGroup__ Integer NOT NULL,
	__IDRadio__ Integer NOT NULL
) ;

CREATE TABLE ListBox_listitems_ListItem (
	__IDListBox__ Integer NOT NULL,
	__IDListItem__ Integer NOT NULL
) ;

CREATE TABLE MenuList_menuitems_MenuItem (
	__IDMenuList__ Integer NOT NULL,
	__IDMenuItem__ Integer NOT NULL
) ;

CREATE TABLE Container_xulInteractors_Interactor (
	__IDContainer__ Integer NOT NULL,
	__IDInteractor__ Integer NOT NULL
) ;

CREATE TABLE Interactor_events_Event (
	__IDInteractor__ Integer NOT NULL,
	__IDEvent__ Integer NOT NULL
) ;

CREATE TABLE TabBox_tabPanels_Interactor (
	__IDTabBox__ Integer NOT NULL,
	__IDInteractor__ Integer NOT NULL
) ;

CREATE TABLE Grid_columns_column (
	__IDGrid__ Integer NOT NULL,
	__IDcolumn__ Integer NOT NULL
) ;

CREATE TABLE Grid_rows_row (
	__IDGrid__ Integer NOT NULL,
	__IDrow__ Integer NOT NULL
) ;

CREATE TABLE Event_functionCallParameters_Parameter (
	__IDEvent__ Integer NOT NULL,
	__IDParameter__ Integer NOT NULL
) ;
