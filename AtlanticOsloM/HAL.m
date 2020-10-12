module HAL {

	type HAL {
		Connexion_ContRef : Connexion;
		Contents_ContRef : Entry*;
	};

	type Connexion {
		Login_Att : Text;
		Password_Att : Text;
	};

	type Entry {
		AutLab_ContRef : AutLabType;
		Tampons_ContRef : TamponType*;
	};

	type Article : Entry {
		MetaArt_ContRef : MetaArtType;
	};

	type ArticleRecent : Article {
		Fichiers_ContRef : DepotsType;
	};

	type ArticleRetro : Article {
		DateRedaction_Att : Text;
		Fichiers_ContRef : AbstractDepot;
	};

	type Notice : Entry {
		MetaArtNotice_ContRef : MetaArtNoticeType;
	};

	type ReferenceBiblioType;

	type ArtRevueType : ReferenceBiblioType {
		Urldoi_Att : Text;
		Journal_Att : Text;
		Volume_Att : Text;
		Page_Att : Text;
		Annee_Att : Text;
	};

	type WorkshopType : ReferenceBiblioType {
		Urldoi_Att : Text;
		Titconf_Att : Text;
		Ville_Att : Text;
		Pays_Att : Text;
		Edcom_Att : Text;
		Annee_Att : Text;
		Page_Att : Text;
		Edsci_Att : Text;
		Serie_Att : Text;
	};

	type ArtOuvrageType : ReferenceBiblioType {
		Urldoi_Att : Text;
		Titouv_Att : Text;
		Edcom_Att : Text;
		Annee_Att : Text;
		Edsci_Att : Text;
		Serie_Att : Text;
	};

	type OuvrageType : ReferenceBiblioType {
		Urldoi_Att : Text;
		Edcom_Att : Text;
		Annee_Att : Text;
		Page_Att : Text;
	};

	type TheseType : ReferenceBiblioType {
		Orgthe_Att : Text;
		Niveau_Att : Text;
		Defencedate_Att : Text;
		Directeur_Att : Text;
		Codirecteur_Att : Text;
	};

	type BrevetType : ReferenceBiblioType {
		Datebrevet_Att : Text;
		Numbrevet_Att : Text;
		Page_Att : Text;
		Pays_Att : Text;
	};

	type AutreType : ReferenceBiblioType {
		Urldoi_Att : Text;
		Annee_Att : Text;
		Description_Att : Text;
	};

	type ArtRevue : ArtRevueType;

	type ArtJournal : ArtRevueType;

	type Workshop : WorkshopType;

	type Communication : WorkshopType;

	type Conference : WorkshopType;

	type ArtOuvrage : ArtOuvrageType;

	type Ouvrage : OuvrageType;

	type Brevet : BrevetType;

	type Autre : AutreType;

	type These : TheseType;

	type MetaType {
		Langue_Att : Text;
		Title_Att : Text;
		Comment_Att : Text;
		RefInterne_Att : Text;
		Idext_Att : Text;
		IsEpj_Att : Integer32;
		IsEpl_Att : Text;
		Classification_Att : Text;
		Collaboration_Att : Text;
		Keyword_Att : Text;
		Datevisible_Att : DateVisibleEnum?;
		Financement_Att : Text;
		Researchteam_Att : Text;
	};

	type MetaArtType : MetaType {
		Domain_Att : Text;
		Abstract_Att : Text;
		ReferenceBiblio_ContRef : ReferenceBiblioType?;
	};

	type MetaArtNoticeType : MetaType {
		Domain_Att : Text;
		Abstract_Att : Text;
		ReferenceBiblio_ContRef : ReferenceBiblioType;
	};

	type AutLabType {
		Auteurs_Ref : Auteur+;
		Laboratoires_Ref : Laboratoire+;
	};

	type Auteur {
		Nom_Att : Text;
		Prenom_Att : Text;
		AutrePrenom_Att : Text;
		Email_Att : Text;
		UrlPerso_Att : Text;
		Lab_Ref : Laboratoire?;
	};

	type Laboratoire {
		Id_Att : Integer32;
		Metas_ContRef : AbstractMetaLab;
	};

	type AbstractMetaLab;

	type MetaLab : AbstractMetaLab {
		Id_Att : Text;
	};

	type AffiliationType {
		Institution_Att : Text;
		Prive_Att : Text;
		Ecole_Att : Text;
		Universite_Att : Text;
	};

	type TamponType {
		Id_Att : Text;
	};

	type DateVisibleEnum {"15J", "1M", "3M", "1A", "2A", "JAMAIS"};

	type AbstractDepot {
		Nom_Att : Text;
	};

	type Depot : AbstractDepot {
		Format_Att : FormatEnum;
	};

	type FormatEnum {"PDF", "TEX", "DOC", "RTF", "TXT", "PS", "ANNEX"};

	type DepotWeb : AbstractDepot {
		Format_Att : FormatWebEnum;
	};

	type FormatWebEnum {"XML", "HTML", "HTM"};

	type AbstractDepotType;

	type DepotsType : AbstractDepotType {
		Depots_ContRef : AbstractDepot+;
	};

	type WebLink : AbstractDepotType {
		Identifiant_Att : Text;
		Server_ContRef : Server;
	};

	type Server;
}