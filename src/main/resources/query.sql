-- insert into meals
insert into meals(description, picture, preparation_time, price) values('pizza', 'pizza.jpg', 30, 5100) ;
insert into meals(description, picture, preparation_time, price) values('French Toast', 'FrenchToast.jpg', 10, 1100);
insert into meals(description, picture, preparation_time, price) values('Omelet', 'omelet.jpg', 15, 1400) ;
insert into meals(description, picture, preparation_time, price) values('Italian Chippy', 'italie.jpg', 40, 2900) ;
insert into meals(description, picture, preparation_time, price) values('Sphagetti', 'sphagetti.jpg', 35, 2500)  ;

-- insert into service provider
INSERT INTO SERVICE_PROVIDER (CITY, EMAIL, NAME, PHONE_NUMBER) VALUES ('ABUJA', 'sheraton@mail.com', 'Sheraton', '080123456');
INSERT INTO SERVICE_PROVIDER (CITY, EMAIL, NAME, PHONE_NUMBER) VALUES ('ABUJA', 'pinnacle@mail.com', 'Pinnacle', '080234456');
INSERT INTO SERVICE_PROVIDER (CITY, EMAIL, NAME, PHONE_NUMBER) VALUES ('ABUJA', 'niconhilton@mail.com', 'Nicon Hilton', '080123456');
INSERT INTO SERVICE_PROVIDER (CITY, EMAIL, NAME, PHONE_NUMBER) VALUES ('ABUJA', 'empresshills@mail.com', 'Empress Hills', '080123456');
INSERT INTO SERVICE_PROVIDER (CITY, EMAIL, NAME, PHONE_NUMBER) VALUES ('ABUJA', 'gurumaraj@mail.com', 'Guru Maraj Restaurants', '0809302256');
INSERT INTO SERVICE_PROVIDER (CITY, EMAIL, NAME, PHONE_NUMBER) VALUES ('ABUJA', 'barcelonahotels@mail.com', 'Barcelona Hotels', '080873256');
INSERT INTO SERVICE_PROVIDER (CITY, EMAIL, NAME, PHONE_NUMBER) VALUES ('LAGOS', 'sheraton@mail.com', 'Sheraton', '080222456');
INSERT INTO SERVICE_PROVIDER (CITY, EMAIL, NAME, PHONE_NUMBER) VALUES ('LAGOS', 'oasis@mail.com', 'Oasis Restaurant', '0809383456');

-- insert into joining tables
insert into meal_service_provider values(1,1);
insert into meal_service_provider values(1,2);
insert into meal_service_provider values(1,3);
insert into meal_service_provider values(1,4);
insert into meal_service_provider values(1,5);
insert into meal_service_provider values(2,1);
insert into meal_service_provider values(2,3);
insert into meal_service_provider values(2,5);
insert into meal_service_provider values(3,1);
insert into meal_service_provider values(3,3);
insert into meal_service_provider values(4,3);
insert into meal_service_provider values(4,4);
insert into meal_service_provider values(4,1);
insert into meal_service_provider values(5,1);
insert into meal_service_provider values(5,2);
insert into meal_service_provider values(6,2);
insert into meal_service_provider values(6,1);
insert into meal_service_provider values(6,3);
insert into meal_service_provider values(7,2);
insert into meal_service_provider values(7,1);
insert into meal_service_provider values(7,5);
insert into meal_service_provider values(8,4);
insert into meal_service_provider values(8,3);
insert into meal_service_provider values(8,2);
insert into meal_service_provider values(8,1);