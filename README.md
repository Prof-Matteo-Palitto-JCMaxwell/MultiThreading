# MULTITHREAD

# funzionamento:
il programma è composto da 3 threads che vengono fatti partire con un tempo di attesa casuale e fanno un countdown partendo da 10 e arrivando a 0.
alla "morte" di tutti i threads il programma mostra a schermo il numero di volte le quali il thread TOE è partio subito dopo di TAC.

# composizione:
il programma è conposto da 2 classi
- main
- TicTacToe
nel **main** vengono dichiarati i threads e fatti partire
in **TicTacToe** si gestisce il ciclo del thread (stampa della stringa di countdown) 
