CREATE TABLE `cliente` (
	`idcliente`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	`nome`	TEXT NOT NULL,
	`nascimento`	INTEGER NOT NULL
);

CREATE TABLE `produto` (
	`idproduto`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	`descricao`	TEXT NOT NULL,
	`preco`	REAL NOT NULL
);