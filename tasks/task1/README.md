## Treść zadania
Napisz program który wczyta plik "input.txt" i na jego podstawie wygeneruje plik wyjściowy "output.txt".

Plik "input.txt" zawiera zapisane binarnie informacje o obiektach reprezentowanych przez 8 kolejnych bitów, składających się z 3 pól:

- 4 pierwsze bity reprezentują numer identyfikacyjny obiektu zapisany binarnie

- 3 kolejne bity reprezentują wiadomość

- 1 ostatni bit jest bitem kontrolnym - jeśli numer obiektu jest parzysty, to ten bit będzie miał wartość 0, w przeciwnym przypadku będzie równy 1

 

W pliku wyjściowym mają się znaleźć informacje:

- w pierwszej linii liczba wszystkich wczytanych obiektów

- w drugiej linii ilość obiektów zawierających błędy

- w trzeciej linii wszystkie obiekty które nie zawierały błędów, zapisane w formie i kolejności, w jakiej wystąpiły w pliku "input.txt"

 

Obiekt zawiera błędy, jeśli:

- wiadomość składa się wyłącznie z bitów równych 0

- bit kontrolny ma błędną wartość

## Objasnienie
Klasa FileScannerService posiada metodę start(), która przyjmuje w argumentach nazwę pliku wejściowego oraz nazwę pliku wyjściowego.
Aplikacja zczytuje po 8 bitów z pliku. Jeśli obiekt jest poprawny dodawany jest do listy poprawnych obiektów. Aplikacja nie wczytuje na raz całego pliku, aby nie przetrzymywać w pamięci programu wszystkich obiektów.
Aplikacja zakłada, że ośmiobitowy obiekt jest błędny, jeśli wiadomość składa się wyłącznie z bitów równych 0 oraz gdy bit kontrolny ma błędną wartość. 

