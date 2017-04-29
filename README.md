# DESCRIZIONE PROGRAMMA TICTACTOE
Il programma è formato da una classe denominata Esercizio1,una classe TicTacToe che implementa un'interfaccia Runnable, un main che è il thread principale da cui vengono creati e avviati tutti gli altri threads.
- è presente la classe principale Esercizio 1 che conterrà il main 
- il main creerà 3 thread. 
- Il primo chiamato TIC che verrà avviato subito dopo.
Il secondo chiamato TAC che verrà avviato dopo il thread TIC.
- Il terzo chiamato TOE che verrà avviato dopo il thread TAC.
Dopodichè utilizzero per questi 3 thread il comando join per aspettare che tutti i 3 threads terminino e quindi stampare sullo schermo il punteggio finale.
- è presente la classe TicTacToe che implementa l'interfaccia Runnable dove verranno dichiarate le variabili "t" (threads) e "msg" (variabile d'appoggio) come stringhe, una variabile "c" di tipo boolean impostata a false (se il thread è TAC diventa true mentre se il Thread è TOE diventa False), una variabile contatore impostata a 0 (conta quante volte il thread TOE viene dopo TAC), 
- è presente il costruttore TicTacToe ( il costruttore serve per passare dei parametri al thread) dove viene assegnata la stringa "s" alla variabile "t".
- è presente il run dove si trova il for che eseguirà un ciclo da 10 a 0 , con un if (condizione) verificheremo che "TAC" sia uguale alla variabile "t", e se così fosse assegneremo a c il valore true, dopodichè assegneremo a una nuova variabile "msg" la variabile "t". Genereremo il tempo di "sleep" che dovrà essere random tra 100ms e 300ms e iniziamo a stamperemo "t" (ovvero i threads), dopodichè eseguiremo un altro if (condizione) e verificheremo che "TOE" sia uguale a "t" e che "c" sia uguale a true; in questo caso incrementeremo di 1 il contatore, in caso contrario ri-assegneremo false a "c".
Infine stamperemo "msg" e il contatore.
