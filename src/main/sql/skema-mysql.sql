create table todo (
    id INT PRIMARY KEY AUTO_INCREMENT, 
    keterangan VARCHAR(255) NOT NULL,
    selesai BIT
) Engine=InnoDB;
