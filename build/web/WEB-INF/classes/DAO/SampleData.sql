/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  David
 * Created: 15/05/2022
 */

INSERT INTO CUSTOMERS (ID, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD)
VALUES
('1001', 'fsfsds@gmail.com', 'David', 'Dyer', 'password123'),
('1002', 'hrfsd@yahoo.com', 'Aneeka', 'Mehta', 'password123'),
('1003', 'ghjffd@gmail.com', 'Marc', 'Corrente', 'password123'),
('1004', 'tgfdd2@gmail.com', 'Aneeka', 'Mehta', 'password123'),
('1005', 'jhkhi@yahoo.com', 'Nathan', 'Nguyen', 'password123'),
('1006', 'oiphgfv@gmail.com', 'Subhashish', 'Shrestha', 'password123');
('1007', 'fvdfsdf@gmail.com', 'Sameer', 'Assol', 'password123'),
('1008', 'fgfdsdf@gmail.com', 'Runa', 'Newton', 'password123'),
('1009', 'sdfsdf@yahoo.com', 'Claudia', 'Dejen', 'password123'),
('1010', 'hjtkgfdj@gmail.com', 'Khachatur', 'Tuta', 'password123'),
('1011', 'fljgkkgjld@gmail.com', 'Briley', 'Waqay', 'password123'),
('1012', 'udusi@gmail.com', 'Xitlalli', 'Shiva', 'password123'),
('1013', 'dfgdfgd@yahoo.com', 'Agne', 'Chand', 'password123'),
('1014', 'Edfgkjdfg@gmail.com', 'Euanthe', 'Osip', 'password123'),
('1015', 'gdfdg@yahoo.com', 'Anna', 'Lewis', 'password123'),
('1016', 'fghfd@amazon.com', 'Qiu', 'Chen', 'password123'),
('1017', 'fgdfff@gmail.com', 'Xue', 'Nuan', 'password123'),
('1018', 'fddsf@yahoo.com', 'Shun', 'Mei', 'password123'),
('1019', 'fgjfg@amazon.com', 'Murad', 'Ayberk', 'password123'),
('1020', 'fdjhdfhsdj@gmail.com', 'Yawen', 'Chin', 'password123'),
('1021', 'njfdf@yahoo.com', 'Xiuying', 'Chun', 'password123');

-- Laptop, Mobile, PC, Internet Plan, Server
INSERT INTO PRODUCTS(ID, NAME, DESCRIPTION, CATEGORY, STOCK, AVAILABLE, MANUFACTURER, PRICE)
VALUES
('1001', '24-inch Laptop', 'this is the greatest product of all time', 'Devices', TRUE, '$749.99'),
('1002', '27-inch Laptop', 'this is the greatest product of all time', 'Devices', TRUE, '$799.99'),
('1003', 'Mini laptop', 'this is the greatest product of all time', 'Devices', TRUE, '$549.99'),
('1004', 'Iphone 4', 'this is the greatest product of all time', 'Mobile', FALSE, '$215.00'),
('1005', 'Iphone 5', 'this is the greatest product of all time', 'Mobile', TRUE, '$300.00'),
('1006', 'Iphone 6', 'this is the greatest product of all time', 'Mobile', TRUE, '$420.00'),
('1007', 'Iphone 7', 'this is the greatest product of all time', 'Mobile', TRUE, '$600.00'),
('1008', 'Iphone 8', 'this is the greatest product of all time', 'Mobile', TRUE, '$709.00'),
('1009', 'Iphone 9', 'this is the greatest product of all time', 'Mobile', TRUE, '$800.00'),
('1010', 'Iphone 10', 'this is the greatest product of all time', 'Mobile', TRUE, '$900.00'),
('1011', 'Iphone 10S', 'this is the greatest product of all time', 'Mobile', TRUE, '$950.00'),
('1012', 'Iphone 11', 'this is the greatest product of all time', 'Mobile', FALSE, '$1100.00'),
('1013', 'Iphone 11S', 'this is the greatest product of all time', 'Mobile', FALSE, '$1250.00'),
('1014', '3-Month Internet Bundle', 'this is the greatest product of all time', 'Plan', TRUE, '$50.00'),
('1015', '6-Month Internet Bundle', 'this is the greatest product of all time', 'Plan', TRUE, '$80.00'),
('1016', '12-Month Internet Bundle', 'this is the greatest product of all time', 'Plan', TRUE, '$99.00'),
('1017', '1GB Server Bundle', 'this is the greatest product of all time', 'Server', TRUE, '$80.00'),
('1018', '5GB Server Bundle', 'this is the greatest product of all time', 'Server', TRUE, '$120.00'),
('1019', '10GB Server Bundle', 'this is the greatest product of all time', 'Server', TRUE, '$169.00'),
('1020', '10GB Server Bundle Pro', 'this is the greatest product of all time', 'Server', TRUE, '$209.00'),
('1021', '15GB Server Bundle', 'this is the greatest product of all time', 'Server', TRUE, '$300.00'),
('1022', '15GB Server Bundle Ultimate', 'this is the greatest product of all time', 'Server', FALSE, '$400.00'),


INSERT INTO STAFF(ID, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD)
VALUES
('1001', 'quan@iotbay.com', 'Quan', 'Saori', 'admin123'),
('1003', 'yuna@iotbay.com', 'Yuna', 'Sung-Soo', 'admin123'),
('1004', 'yumiko@iotbay.com', 'Yumiko', 'Jun-Seo', 'admin123'),
('1005', 'giang@iotbay.com', 'Giang', 'Mariko', 'admin123'),
('1006', 'taro@iotbay.com', 'Taro', 'Yuka', 'admin123'),
('1007', 'kai@iotbay.com', 'Kai', 'Bao', 'admin123'),
('1008', 'thuy@iotbay.com', 'Thuy', 'Ayano', 'admin123'),
('1009', 'juro@iotbay.com', 'Juro', 'Shufen', 'admin123'),
('1011', 'moriko@iotbay.com', 'Moriko', 'Jingyi', 'admin123'),
('1012', 'huang@iotbay.com', 'Huang', 'Hyun-Woo', 'admin123'),
('1013', 'myeong@iotbay.com', 'Myeong', 'Lim', 'admin123'),
('1014', 'koji@iotbay.com', 'Koji', 'Aoi', 'admin123'),
('1015', 'mi-suk@iotbay.com', 'Mi-Suk', 'Noriaki', 'admin123'),
('1016', 'jeong@iotbay.com', 'Jeong', 'Jeong-Suk', 'admin123'),
('1017', 'loan@iotbay.com', 'Loan', 'Xinji', 'admin123'),
('1018', 'toru@iotbay.com', 'Toru', 'Xinji', 'admin123'),
('1019', 'hideki@iotbay.com', 'Hideki', 'Yukiko', 'admin123'),
('1020', 'chae-won@iotbay.com', 'Chae-Won', 'Chihiro', 'admin123'),
('1021', 'kanon@iotbay.com', 'Kanon', 'Bich', 'admin123'),
('1022', 'hideaki@iotbay.com', 'Hideaki', 'Qing', 'admin123'),
('1023', 'jong-su@iotbay.com', 'Jong-Su', 'Sho', 'admin123'),
('1024', 'yuuta@iotbay.com', 'Yuuta', 'Chikako', 'admin123'),
('1025', 'setsuko@iotbay.com', 'Setsuko', 'Souta', 'admin123'),

--Note to tutor:
--No values are inserted into Log, Order, Payment or Shipment because these tables are related to a specific customer and are always added through customer use of the website
--There should not be default values for these tabes