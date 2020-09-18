# Progetto Pieragostini Alessandro
Progetto di Programmazione a Oggetti AA2019/2020

# FUNZIONAMENTO
La mia applicazione permette di effettuare un' analisi dei files presenti all'interno di cartelle e relative sottocartelle presenti in un account Dropbox al fine di verificare la presenza di files e le loro dimensioni, di elementi cancellati e le relative dimensioni, all'interno di cartelle e relative sottocartelle.
Permette inoltre di effettuare delle statistiche, andando a riportare quanti file hanno una dimensione maggiore di una certa grandezza inserita dall' utente, oppure andando ad analizzare i tipi di files (sia presenti che cancellati, potendo anche fare distinzione) traendone per ogni tipo il numero di files.

# COME ESEGUIRE RICHIESTE
Si possono eseguire le richieste avviando il programma e utilizzando un ambiente di sviluppo API, ad esempio Postman, con la possibilità di effettuare le seguenti richieste:
- GET /GetFiles , visualizza tutti i files, anche di sottocartelle, con relativi nomi, dimensioni e tipologia (cartella, file o file eliminato);
- POST /StatsType , visualizza il numero di files presenti divisi per tipo (Word, Excel, Power Point, ecc.), con distinzione tra file canecellati e presenti;
- POST /StatsSize , visualizza il numero di files superiori ad una certa grandezza data dall' utente;
- POST /Metadata , ci verranno restituiti i metadati.

# COME UTILIZZARE LE RICHIESTE
Alcune info sul funzionamento delle richieste:
- /GetFiles : basta inserire la richiesta in Postman ed uscirà la lista completa dei files;
- /StatsType : per decidere se visualizzare i files presenti o cancellati bisogna andare sul body ed inserire "ND" se si vogliono visualizzare i files presenti (not deleted) oppure "D" se si vogliono visualizzare i files cancellati (deleted). Una volta lanciata la richiesta con il comando sul body andare sulla voce statistics se è stato digitato "ND", altrimenti statisticsDel se è stato digitato "D";
- /StatsSize : inserire nel body la grandezza di riferimento (in byte) da cui trarre il numero di files che hanno grandezza maggiore di quella digitata, e nella risposta leggere la voce "info" su "SizeStat";
- /Metadata : visualizza i metadati.

# NOTE 
Il programma usufruisce di una funzione della libreria Google Guava, è quindi necessario includerla nella libreria.

# AUTORE 
Alessandro Pieragostini
