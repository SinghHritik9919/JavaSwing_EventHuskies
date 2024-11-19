CREATE database EventManagement
go 
use EventManagement
go 


--Create Table Caterers
CREATE TABLE CATERER (
    CatererId INT NOT NULL IDENTITY(1,1),
    CatererName VARCHAR(255),
    Address VARCHAR(255),
    Phone VARCHAR(255),
    Ratings DECIMAL(10,2),
    PackageName VARCHAR(255),
	Price INT,
    CreatedBy VARCHAR(255),
    CreatedOn DATETIME,
    PRIMARY KEY (CatererId),
   -- FOREIGN KEY (EventHostedId) REFERENCES EVENTS_HOSTED(EventHostedId)
);

CREATE TABLE food_items (
  CatererId INT IDENTITY(1,1) NOT NULL,
  Type VARCHAR(255),
  DishName VARCHAR(255),
  Description VARCHAR(255),
  IsVegan VARCHAR(5),
  PRIMARY KEY (CatererId),
  -- FOREIGN KEY (CatererId) REFERENCES CATERER(CatererId)
);


-- Create the Property table
CREATE TABLE property_enlist (
    PropertyId INT IDENTITY(1,1) NOT NULL,
    PropertyName VARCHAR(255) NOT NULL,
    City VARCHAR(255),
    Street VARCHAR(255),
    State VARCHAR(255),
    ZipCode VARCHAR(255),
    ImgLink1 VARCHAR(255),
    ImgLink2 VARCHAR(255),
	Capacity VARCHAR(255),
	Status VARCHAR(255),
	PropertyOwner VARCHAR(255),
	Type VARCHAR(255),
	UserName VARCHAR(255),
    PRIMARY KEY (PropertyId)
);