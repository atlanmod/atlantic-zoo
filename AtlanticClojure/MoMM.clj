( defstruct ModelElement :level :name :potency :hasClass :elementTarget :elementSource :attType )
( defstruct Attribute :type :level :name :potency :hasClass :elementTarget :elementSource :attType )
( defstruct Relationship :target :source :level :name :potency :hasClass :elementTarget :elementSource :attType )
( defstruct Generalization :target :source :level :name :potency :hasClass :elementTarget :elementSource :attType )
( defstruct Association :maxSource :maxTarget :minSource :minTarget :target :source :level :name :potency :hasClass :elementTarget :elementSource :attType )
