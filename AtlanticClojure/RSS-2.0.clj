( defstruct RSS :version :channel )
( defstruct Channel :title :link :description :rss )
( defstruct Item :title :link :description :channel )
( defstruct Image :url :title :link :channel )
( defstruct TextInput :title :description :name :link :channel )
( defstruct Cloud :domain :port :path :registerProcedure :protocol :channel )
( defstruct Category :domain :value )
( defstruct Enclosure :url :lenght :type )
( defstruct Source :url :value )
( defstruct Date :eDay :day :month :year :hours :minutes :seconds )
