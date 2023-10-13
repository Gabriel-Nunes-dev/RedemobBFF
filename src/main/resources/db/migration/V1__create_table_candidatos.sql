CREATE TABLE candidatos (
                            id BIGSERIAL PRIMARY KEY,
                            name VARCHAR(255) NOT NULL,
                            birth_date DATE NOT NULL,
                            cpf VARCHAR(11) NOT NULL,
                            mother_name VARCHAR(255) NOT NULL,
                            face_photo BIGINT,
                            id_document_front BIGINT,
                            id_document_back BIGINT,
                            address_document_front BIGINT,
                            address_document_back BIGINT
);
