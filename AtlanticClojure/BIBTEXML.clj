( defstruct BibtexFile )
( defstruct Author :name )
( defstruct Entry :id )
( defstruct AuthoredEntry :authors :id )
( defstruct BookTitledEntry :booktitle :id )
( defstruct InstitutionEntry :institution :id )
( defstruct EditoredEntry :editor :id )
( defstruct DatedEntry :year :id )
( defstruct JournalEntry :journal :id )
( defstruct TitledEntry :title :id )
( defstruct NotedEntry :note :id )
( defstruct PublisheredEntry :publisher :id )
( defstruct SchoolEntry :school :id )
( defstruct Article :authors :id :year :id :title :id :journal :id )
( defstruct Book :authors :id :editor :id :publisher :id :year :id :title :id )
( defstruct Booklet :howpublished :year :id :title :id )
( defstruct InBook :chapter :type :authors :id :editor :id :publisher :id :year :id :title :id )
( defstruct InCollection :authors :id :editor :id :publisher :id :year :id :title :id :booktitle :id )
( defstruct Manual :title :id :authors :id :year :id )
( defstruct TechReport :authors :id :institution :id :year :id :title :id )
( defstruct ThesisEntry :authors :id :year :id :title :id :school :id )
( defstruct PhdThesis :authors :id :year :id :title :id :school :id )
( defstruct MastersThesis :authors :id :year :id :title :id :school :id )
( defstruct Proceedings :year :id :title :id )
( defstruct InProceedings :authors :id :booktitle :id :year :id :title :id )
( defstruct Conference :authors :id :booktitle :id :year :id :title :id )
( defstruct Unpublished :authors :id :title :id :note :id :year :id )
( defstruct Misc :id )
