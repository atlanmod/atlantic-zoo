CREATE TABLE HAL (
	__IDHAL__ Integer NOT NULL,
	FOREIGN KEY connexion (__FKconnexion__) REFERENCES Connexion (__IDConnexion__),
	PRIMARY KEY HAL (__IDHAL__),
	__FKconnexion__ Integer
) ;

CREATE TABLE Connexion (
	__IDConnexion__ Integer NOT NULL,
	login text,
	password text,
	PRIMARY KEY Connexion (__IDConnexion__)
) ;

CREATE TABLE Entry (
	__IDEntry__ Integer NOT NULL,
	FOREIGN KEY autLab (__FKautLab__) REFERENCES AutLabType (__IDAutLabType__),
	PRIMARY KEY Entry (__IDEntry__),
	__FKautLab__ Integer
) ;

CREATE TABLE Article (
	__IDArticle__ Integer NOT NULL,
	FOREIGN KEY metaArt (__FKmetaArt__) REFERENCES MetaArtType (__IDMetaArtType__),
	PRIMARY KEY Article (__IDArticle__),
	__FKmetaArt__ Integer
) ;

CREATE TABLE ArticleRecent (
	__IDArticleRecent__ Integer NOT NULL,
	FOREIGN KEY fichiers (__FKfichiers__) REFERENCES DepotsType (__IDDepotsType__),
	PRIMARY KEY ArticleRecent (__IDArticleRecent__),
	__FKfichiers__ Integer
) ;

CREATE TABLE ArticleRetro (
	__IDArticleRetro__ Integer NOT NULL,
	dateRedaction text,
	FOREIGN KEY fichiers (__FKfichiers__) REFERENCES AbstractDepot (__IDAbstractDepot__),
	PRIMARY KEY ArticleRetro (__IDArticleRetro__),
	__FKfichiers__ Integer
) ;

CREATE TABLE Notice (
	__IDNotice__ Integer NOT NULL,
	FOREIGN KEY metaArtNotice (__FKmetaArtNotice__) REFERENCES MetaArtNoticeType (__IDMetaArtNoticeType__),
	PRIMARY KEY Notice (__IDNotice__),
	__FKmetaArtNotice__ Integer
) ;

CREATE TABLE ReferenceBiblioType (
	__IDReferenceBiblioType__ Integer NOT NULL,
	PRIMARY KEY ReferenceBiblioType (__IDReferenceBiblioType__)
) ;

CREATE TABLE ArtRevueType (
	__IDArtRevueType__ Integer NOT NULL,
	urldoi text,
	journal text,
	volume text,
	page text,
	annee text,
	PRIMARY KEY ArtRevueType (__IDArtRevueType__)
) ;

CREATE TABLE WorkshopType (
	__IDWorkshopType__ Integer NOT NULL,
	urldoi text,
	titconf text,
	ville text,
	pays text,
	edcom text,
	annee text,
	page text,
	edsci text,
	serie text,
	PRIMARY KEY WorkshopType (__IDWorkshopType__)
) ;

CREATE TABLE ArtOuvrageType (
	__IDArtOuvrageType__ Integer NOT NULL,
	urldoi text,
	titouv text,
	edcom text,
	annee text,
	edsci text,
	serie text,
	PRIMARY KEY ArtOuvrageType (__IDArtOuvrageType__)
) ;

CREATE TABLE OuvrageType (
	__IDOuvrageType__ Integer NOT NULL,
	urldoi text,
	edcom text,
	annee text,
	page text,
	PRIMARY KEY OuvrageType (__IDOuvrageType__)
) ;

CREATE TABLE TheseType (
	__IDTheseType__ Integer NOT NULL,
	orgthe text,
	niveau text,
	defencedate text,
	directeur text,
	codirecteur text,
	PRIMARY KEY TheseType (__IDTheseType__)
) ;

CREATE TABLE BrevetType (
	__IDBrevetType__ Integer NOT NULL,
	datebrevet text,
	numbrevet text,
	page text,
	pays text,
	PRIMARY KEY BrevetType (__IDBrevetType__)
) ;

CREATE TABLE AutreType (
	__IDAutreType__ Integer NOT NULL,
	urldoi text,
	annee text,
	description text,
	PRIMARY KEY AutreType (__IDAutreType__)
) ;

CREATE TABLE ArtRevue (
	__IDArtRevue__ Integer NOT NULL,
	PRIMARY KEY ArtRevue (__IDArtRevue__)
) ;

CREATE TABLE ArtJournal (
	__IDArtJournal__ Integer NOT NULL,
	PRIMARY KEY ArtJournal (__IDArtJournal__)
) ;

CREATE TABLE Workshop (
	__IDWorkshop__ Integer NOT NULL,
	PRIMARY KEY Workshop (__IDWorkshop__)
) ;

CREATE TABLE Communication (
	__IDCommunication__ Integer NOT NULL,
	PRIMARY KEY Communication (__IDCommunication__)
) ;

CREATE TABLE Conference (
	__IDConference__ Integer NOT NULL,
	PRIMARY KEY Conference (__IDConference__)
) ;

CREATE TABLE ArtOuvrage (
	__IDArtOuvrage__ Integer NOT NULL,
	PRIMARY KEY ArtOuvrage (__IDArtOuvrage__)
) ;

CREATE TABLE Ouvrage (
	__IDOuvrage__ Integer NOT NULL,
	PRIMARY KEY Ouvrage (__IDOuvrage__)
) ;

CREATE TABLE Brevet (
	__IDBrevet__ Integer NOT NULL,
	PRIMARY KEY Brevet (__IDBrevet__)
) ;

CREATE TABLE Autre (
	__IDAutre__ Integer NOT NULL,
	PRIMARY KEY Autre (__IDAutre__)
) ;

CREATE TABLE These (
	__IDThese__ Integer NOT NULL,
	PRIMARY KEY These (__IDThese__)
) ;

CREATE TABLE MetaType (
	__IDMetaType__ Integer NOT NULL,
	langue text,
	title text,
	comment text,
	refInterne text,
	idext text,
	isEpj Integer,
	isEpl text,
	classification text,
	collaboration text,
	keyword text,
	datevisible text,
	financement text,
	researchteam text,
	PRIMARY KEY MetaType (__IDMetaType__)
) ;

CREATE TABLE MetaArtType (
	__IDMetaArtType__ Integer NOT NULL,
	domain text,
	abstract text,
	FOREIGN KEY referenceBiblio (__FKreferenceBiblio__) REFERENCES ReferenceBiblioType (__IDReferenceBiblioType__),
	PRIMARY KEY MetaArtType (__IDMetaArtType__),
	__FKreferenceBiblio__ Integer
) ;

CREATE TABLE MetaArtNoticeType (
	__IDMetaArtNoticeType__ Integer NOT NULL,
	domain text,
	abstract text,
	FOREIGN KEY referenceBiblio (__FKreferenceBiblio__) REFERENCES ReferenceBiblioType (__IDReferenceBiblioType__),
	PRIMARY KEY MetaArtNoticeType (__IDMetaArtNoticeType__),
	__FKreferenceBiblio__ Integer
) ;

CREATE TABLE AutLabType (
	__IDAutLabType__ Integer NOT NULL,
	PRIMARY KEY AutLabType (__IDAutLabType__)
) ;

CREATE TABLE Auteur (
	__IDAuteur__ Integer NOT NULL,
	nom text,
	prenom text,
	autrePrenom text,
	email text,
	urlPerso text,
	FOREIGN KEY lab (__FKlab__) REFERENCES Laboratoire (__IDLaboratoire__),
	PRIMARY KEY Auteur (__IDAuteur__),
	__FKlab__ Integer
) ;

CREATE TABLE Laboratoire (
	__IDLaboratoire__ Integer NOT NULL,
	id Integer,
	FOREIGN KEY metas (__FKmetas__) REFERENCES AbstractMetaLab (__IDAbstractMetaLab__),
	PRIMARY KEY Laboratoire (__IDLaboratoire__),
	__FKmetas__ Integer
) ;

CREATE TABLE AbstractMetaLab (
	__IDAbstractMetaLab__ Integer NOT NULL,
	PRIMARY KEY AbstractMetaLab (__IDAbstractMetaLab__)
) ;

CREATE TABLE MetaLab (
	__IDMetaLab__ Integer NOT NULL,
	id text,
	PRIMARY KEY MetaLab (__IDMetaLab__)
) ;

CREATE TABLE AffiliationType (
	__IDAffiliationType__ Integer NOT NULL,
	PRIMARY KEY AffiliationType (__IDAffiliationType__)
) ;

CREATE TABLE TamponType (
	__IDTamponType__ Integer NOT NULL,
	id text,
	PRIMARY KEY TamponType (__IDTamponType__)
) ;

CREATE TABLE AbstractDepot (
	__IDAbstractDepot__ Integer NOT NULL,
	nom text,
	PRIMARY KEY AbstractDepot (__IDAbstractDepot__)
) ;

CREATE TABLE Depot (
	__IDDepot__ Integer NOT NULL,
	format text,
	PRIMARY KEY Depot (__IDDepot__)
) ;

CREATE TABLE DepotWeb (
	__IDDepotWeb__ Integer NOT NULL,
	format text,
	PRIMARY KEY DepotWeb (__IDDepotWeb__)
) ;

CREATE TABLE AbstractDepotType (
	__IDAbstractDepotType__ Integer NOT NULL,
	PRIMARY KEY AbstractDepotType (__IDAbstractDepotType__)
) ;

CREATE TABLE DepotsType (
	__IDDepotsType__ Integer NOT NULL,
	PRIMARY KEY DepotsType (__IDDepotsType__)
) ;

CREATE TABLE WebLink (
	__IDWebLink__ Integer NOT NULL,
	identifiant text,
	FOREIGN KEY server (__FKserver__) REFERENCES Server (__IDServer__),
	PRIMARY KEY WebLink (__IDWebLink__),
	__FKserver__ Integer
) ;

CREATE TABLE Server (
	__IDServer__ Integer NOT NULL,
	PRIMARY KEY Server (__IDServer__)
) ;

CREATE TABLE HAL_contents_Entry (
	__IDHAL__ Integer NOT NULL,
	__IDEntry__ Integer NOT NULL
) ;

CREATE TABLE DepotsType_depots_AbstractDepot (
	__IDDepotsType__ Integer NOT NULL,
	__IDAbstractDepot__ Integer NOT NULL
) ;

CREATE TABLE AutLabType_auteurs_Auteur (
	__IDAutLabType__ Integer NOT NULL,
	__IDAuteur__ Integer NOT NULL
) ;

CREATE TABLE AutLabType_laboratoires_Laboratoire (
	__IDAutLabType__ Integer NOT NULL,
	__IDLaboratoire__ Integer NOT NULL
) ;

CREATE TABLE Entry_tampons_TamponType (
	__IDEntry__ Integer NOT NULL,
	__IDTamponType__ Integer NOT NULL
) ;
