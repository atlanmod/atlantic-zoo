CREATE TABLE LocatedElement (
	__IDLocatedElement__ Integer NOT NULL,
	location text,
	PRIMARY KEY LocatedElement (__IDLocatedElement__)
) ;

CREATE TABLE Named (
	__IDNamed__ Integer NOT NULL,
	name text,
	PRIMARY KEY Named (__IDNamed__)
) ;

CREATE TABLE GUI (
	__IDGUI__ Integer NOT NULL,
	PRIMARY KEY GUI (__IDGUI__)
) ;

CREATE TABLE Tab (
	__IDTab__ Integer NOT NULL,
	title text,
	FOREIGN KEY gui (__FKgui__) REFERENCES GUI (__IDGUI__),
	FOREIGN KEY "group" (__FKgroup__) REFERENCES "Group" (__IDGroup__),
	PRIMARY KEY Tab (__IDTab__),
	__FKgroup__ Integer,
	__FKgui__ Integer
) ;

CREATE TABLE Composant (
	__IDComposant__ Integer NOT NULL,
	FOREIGN KEY composantGroup (__FKcomposantGroup__) REFERENCES "Group" (__IDGroup__),
	PRIMARY KEY Composant (__IDComposant__),
	__FKcomposantGroup__ Integer
) ;

CREATE TABLE "Group" (
	__IDGroup__ Integer NOT NULL,
	title text,
	layout text,
	description text,
	FOREIGN KEY tabGroup (__FKtabGroup__) REFERENCES Tab (__IDTab__),
	PRIMARY KEY "Group" (__IDGroup__),
	__FKtabGroup__ Integer
) ;

CREATE TABLE "Label" (
	__IDLabel__ Integer NOT NULL,
	text text,
	PRIMARY KEY "Label" (__IDLabel__)
) ;

CREATE TABLE TextArea (
	__IDTextArea__ Integer NOT NULL,
	text text,
	nbRows Integer,
	PRIMARY KEY TextArea (__IDTextArea__)
) ;

CREATE TABLE "Table" (
	__IDTable__ Integer NOT NULL,
	PRIMARY KEY "Table" (__IDTable__)
) ;

CREATE TABLE "Column" (
	__IDColumn__ Integer NOT NULL,
	title text,
	FOREIGN KEY columnTab (__FKcolumnTab__) REFERENCES "Table" (__IDTable__),
	PRIMARY KEY "Column" (__IDColumn__),
	__FKcolumnTab__ Integer
) ;

CREATE TABLE ComboBox (
	__IDComboBox__ Integer NOT NULL,
	PRIMARY KEY ComboBox (__IDComboBox__)
) ;

CREATE TABLE Row (
	__IDRow__ Integer NOT NULL,
	FOREIGN KEY rowList (__FKrowList__) REFERENCES ComboBox (__IDComboBox__),
	text text,
	PRIMARY KEY Row (__IDRow__),
	__FKrowList__ Integer
) ;

CREATE TABLE Item (
	__IDItem__ Integer NOT NULL,
	FOREIGN KEY itemList (__FKitemList__) REFERENCES Row (__IDRow__),
	text text,
	PRIMARY KEY Item (__IDItem__),
	__FKitemList__ Integer
) ;

CREATE TABLE Button (
	__IDButton__ Integer NOT NULL,
	title text,
	PRIMARY KEY Button (__IDButton__)
) ;

CREATE TABLE Group_composants_Composant (
	__IDGroup__ Integer NOT NULL,
	__IDComposant__ Integer NOT NULL
) ;

CREATE TABLE Table_tabColumns_Column (
	__IDTable__ Integer NOT NULL,
	__IDColumn__ Integer NOT NULL
) ;

CREATE TABLE ComboBox_listRows_Row (
	__IDComboBox__ Integer NOT NULL,
	__IDRow__ Integer NOT NULL
) ;

CREATE TABLE GUI_guiTabs_Tab (
	__IDGUI__ Integer NOT NULL,
	__IDTab__ Integer NOT NULL
) ;

CREATE TABLE Row_listItems_Item (
	__IDRow__ Integer NOT NULL,
	__IDItem__ Integer NOT NULL
) ;
