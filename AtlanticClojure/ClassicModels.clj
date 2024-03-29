( defstruct AddressInfo :phone :addressLine1 :addressLine2 :city :state :postalCode :country )
( defstruct Date :year :month :day )
( defstruct ClassicModels )
( defstruct ProductLine :productLineOwner :name :textDescription :htmlDescription )
( defstruct Product :productLine :code :name :scale :vendor :description :quantityInStock :buyPrice :MSRP )
( defstruct Office :officeOwner :code :territory :phone :addressLine1 :addressLine2 :city :state :postalCode :country )
( defstruct Employee :office :number :lastName :firstName :extension :email :reportsTo :jobTitle )
( defstruct Customer :customerOwner :number :salesRepEmployee :name :contactLastName :contactFirstName :creditLimit :phone :addressLine1 :addressLine2 :city :state :postalCode :country )
( defstruct Payment :customer :checkNumber :date :amount )
( defstruct Order :customer :number :date :requiredDate :status :comments )
( defstruct OrderDetail :order :product :quantityOrdered :priceEach )
