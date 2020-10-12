CREATE TABLE PCDATA (
	__IDPCDATA__ Integer NOT NULL,
	value text,
	PRIMARY KEY PCDATA (__IDPCDATA__)
) ;

CREATE TABLE Any (
	__IDAny__ Integer NOT NULL,
	PRIMARY KEY Any (__IDAny__)
) ;

CREATE TABLE TitledElement (
	__IDTitledElement__ Integer NOT NULL,
	title text,
	PRIMARY KEY TitledElement (__IDTitledElement__)
) ;

CREATE TABLE IdedElement (
	__IDIdedElement__ Integer NOT NULL,
	id text,
	PRIMARY KEY IdedElement (__IDIdedElement__)
) ;

CREATE TABLE ConventionnedElement (
	__IDConventionnedElement__ Integer NOT NULL,
	convention text,
	PRIMARY KEY ConventionnedElement (__IDConventionnedElement__)
) ;

CREATE TABLE DictRefElement (
	__IDDictRefElement__ Integer NOT NULL,
	dictRef text,
	PRIMARY KEY DictRefElement (__IDDictRefElement__)
) ;

CREATE TABLE SimpleLink_Element (
	__IDSimpleLink_Element__ Integer NOT NULL,
	href text,
	PRIMARY KEY SimpleLink_Element (__IDSimpleLink_Element__)
) ;

CREATE TABLE Counted_Element (
	__IDCounted_Element__ Integer NOT NULL,
	count text,
	PRIMARY KEY Counted_Element (__IDCounted_Element__)
) ;

CREATE TABLE Sized_Element (
	__IDSized_Element__ Integer NOT NULL,
	size text,
	PRIMARY KEY Sized_Element (__IDSized_Element__)
) ;

CREATE TABLE Rows_Element (
	__IDRows_Element__ Integer NOT NULL,
	rows text,
	PRIMARY KEY Rows_Element (__IDRows_Element__)
) ;

CREATE TABLE Columns_Element (
	__IDColumns_Element__ Integer NOT NULL,
	colums text,
	PRIMARY KEY Columns_Element (__IDColumns_Element__)
) ;

CREATE TABLE Min_Element (
	__IDMin_Element__ Integer NOT NULL,
	min text,
	PRIMARY KEY Min_Element (__IDMin_Element__)
) ;

CREATE TABLE Max_Element (
	__IDMax_Element__ Integer NOT NULL,
	max text,
	PRIMARY KEY Max_Element (__IDMax_Element__)
) ;

CREATE TABLE Units_Element (
	__IDUnits_Element__ Integer NOT NULL,
	units text,
	PRIMARY KEY Units_Element (__IDUnits_Element__)
) ;

CREATE TABLE AngleUnits_Element (
	__IDAngleUnits_Element__ Integer NOT NULL,
	angleUnits text,
	PRIMARY KEY AngleUnits_Element (__IDAngleUnits_Element__)
) ;

CREATE TABLE UnitsRef_Element (
	__IDUnitsRef_Element__ Integer NOT NULL,
	unitsRef text,
	PRIMARY KEY UnitsRef_Element (__IDUnitsRef_Element__)
) ;

CREATE TABLE AtomRefs_Element (
	__IDAtomRefs_Element__ Integer NOT NULL,
	atomRefs text,
	PRIMARY KEY AtomRefs_Element (__IDAtomRefs_Element__)
) ;

CREATE TABLE _StringBuiltin (
	__ID_StringBuiltin__ Integer NOT NULL,
	builtin text,
	PRIMARY KEY _StringBuiltin (__ID_StringBuiltin__)
) ;

CREATE TABLE _String (
	__ID_String__ Integer NOT NULL,
	PRIMARY KEY _String (__ID_String__)
) ;

CREATE TABLE _Link (
	__ID_Link__ Integer NOT NULL,
	PRIMARY KEY _Link (__ID_Link__)
) ;

CREATE TABLE _FloatBuiltin (
	__ID_FloatBuiltin__ Integer NOT NULL,
	builtin text,
	PRIMARY KEY _FloatBuiltin (__ID_FloatBuiltin__)
) ;

CREATE TABLE _Float (
	__ID_Float__ Integer NOT NULL,
	PRIMARY KEY _Float (__ID_Float__)
) ;

CREATE TABLE _IntegerBuiltin (
	__ID_IntegerBuiltin__ Integer NOT NULL,
	builtin text,
	PRIMARY KEY _IntegerBuiltin (__ID_IntegerBuiltin__)
) ;

CREATE TABLE _Integer (
	__ID_Integer__ Integer NOT NULL,
	PRIMARY KEY _Integer (__ID_Integer__)
) ;

CREATE TABLE _StringArray (
	__ID_StringArray__ Integer NOT NULL,
	delimiter text,
	PRIMARY KEY _StringArray (__ID_StringArray__)
) ;

CREATE TABLE _FloatArray (
	__ID_FloatArray__ Integer NOT NULL,
	PRIMARY KEY _FloatArray (__ID_FloatArray__)
) ;

CREATE TABLE _IntegerArray (
	__ID_IntegerArray__ Integer NOT NULL,
	PRIMARY KEY _IntegerArray (__ID_IntegerArray__)
) ;

CREATE TABLE _FloatMatrix (
	__ID_FloatMatrix__ Integer NOT NULL,
	PRIMARY KEY _FloatMatrix (__ID_FloatMatrix__)
) ;

CREATE TABLE _Coordinate2Builtin (
	__ID_Coordinate2Builtin__ Integer NOT NULL,
	builtin text,
	PRIMARY KEY _Coordinate2Builtin (__ID_Coordinate2Builtin__)
) ;

CREATE TABLE _Coordinate2 (
	__ID_Coordinate2__ Integer NOT NULL,
	PRIMARY KEY _Coordinate2 (__ID_Coordinate2__)
) ;

CREATE TABLE _Coordinate3Builtin (
	__ID_Coordinate3Builtin__ Integer NOT NULL,
	builtin text,
	PRIMARY KEY _Coordinate3Builtin (__ID_Coordinate3Builtin__)
) ;

CREATE TABLE _Coordinate3 (
	__ID_Coordinate3__ Integer NOT NULL,
	PRIMARY KEY _Coordinate3 (__ID_Coordinate3__)
) ;

CREATE TABLE _Angle (
	__ID_Angle__ Integer NOT NULL,
	PRIMARY KEY _Angle (__ID_Angle__)
) ;

CREATE TABLE _Torsion (
	__ID_Torsion__ Integer NOT NULL,
	PRIMARY KEY _Torsion (__ID_Torsion__)
) ;

CREATE TABLE _List (
	__ID_List__ Integer NOT NULL,
	PRIMARY KEY _List (__ID_List__)
) ;

CREATE TABLE Molecule (
	__IDMolecule__ Integer NOT NULL,
	PRIMARY KEY Molecule (__IDMolecule__)
) ;

CREATE TABLE Formula (
	__IDFormula__ Integer NOT NULL,
	PRIMARY KEY Formula (__IDFormula__)
) ;

CREATE TABLE Atom (
	__IDAtom__ Integer NOT NULL,
	PRIMARY KEY Atom (__IDAtom__)
) ;

CREATE TABLE Atom_Array (
	__IDAtom_Array__ Integer NOT NULL,
	PRIMARY KEY Atom_Array (__IDAtom_Array__)
) ;

CREATE TABLE Bond (
	__IDBond__ Integer NOT NULL,
	PRIMARY KEY Bond (__IDBond__)
) ;

CREATE TABLE Bond_Array (
	__IDBond_Array__ Integer NOT NULL,
	PRIMARY KEY Bond_Array (__IDBond_Array__)
) ;

CREATE TABLE Electron (
	__IDElectron__ Integer NOT NULL,
	PRIMARY KEY Electron (__IDElectron__)
) ;

CREATE TABLE Reaction (
	__IDReaction__ Integer NOT NULL,
	PRIMARY KEY Reaction (__IDReaction__)
) ;

CREATE TABLE Crystal (
	__IDCrystal__ Integer NOT NULL,
	PRIMARY KEY Crystal (__IDCrystal__)
) ;

CREATE TABLE Sequence (
	__IDSequence__ Integer NOT NULL,
	PRIMARY KEY Sequence (__IDSequence__)
) ;

CREATE TABLE Feature (
	__IDFeature__ Integer NOT NULL,
	PRIMARY KEY Feature (__IDFeature__)
) ;

CREATE TABLE Atom_any_Any (
	__IDAtom__ Integer NOT NULL,
	__IDAny__ Integer NOT NULL
) ;

CREATE TABLE Molecule_any_Any (
	__IDMolecule__ Integer NOT NULL,
	__IDAny__ Integer NOT NULL
) ;

CREATE TABLE Crystal_any_Any (
	__IDCrystal__ Integer NOT NULL,
	__IDAny__ Integer NOT NULL
) ;

CREATE TABLE Reaction_any_Any (
	__IDReaction__ Integer NOT NULL,
	__IDAny__ Integer NOT NULL
) ;

CREATE TABLE Sequence_any_Any (
	__IDSequence__ Integer NOT NULL,
	__IDAny__ Integer NOT NULL
) ;

CREATE TABLE Formula_any_Any (
	__IDFormula__ Integer NOT NULL,
	__IDAny__ Integer NOT NULL
) ;

CREATE TABLE Atom_Array_any_Any (
	__IDAtom_Array__ Integer NOT NULL,
	__IDAny__ Integer NOT NULL
) ;

CREATE TABLE Bond_any_Any (
	__IDBond__ Integer NOT NULL,
	__IDAny__ Integer NOT NULL
) ;

CREATE TABLE _List_any_Any (
	__ID_List__ Integer NOT NULL,
	__IDAny__ Integer NOT NULL
) ;

CREATE TABLE Bond_Array_any_Any (
	__IDBond_Array__ Integer NOT NULL,
	__IDAny__ Integer NOT NULL
) ;

CREATE TABLE Feature_any_Any (
	__IDFeature__ Integer NOT NULL,
	__IDAny__ Integer NOT NULL
) ;

CREATE TABLE Electron_any_Any (
	__IDElectron__ Integer NOT NULL,
	__IDAny__ Integer NOT NULL
) ;
