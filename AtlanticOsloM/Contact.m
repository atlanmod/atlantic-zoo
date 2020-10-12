module Contact {

	type Contact {
		Nom_Att : Text;
		Prenom_Att : Text;
		Num_fixes_ContRef : Num_fixe*;
		Num_portables_ContRef : Num_portable*;
	};

	type Num_fixe {
		Numero_Att : Text;
		Contact_fixe_Ref : Contact;
	};

	type Num_portable {
		Numero_Att : Text;
		Contact_portable_Ref : Contact;
	};
}