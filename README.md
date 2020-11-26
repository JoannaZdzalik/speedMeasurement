My implementation of JAVA task: 

Pomiar Prędkości
Firma KarBajt prowadzi serwis samochodowy. W celach badania przyśpieszenia oraz zdolności
hamowania samochodów KarBajt montuje w nich pewne specyficzne urządzenie. Jego
zadaniem jest monitorowanie zmian prędkości. Urządzenie co sekundę zapamiętuje o ile
zmieniła się prędkość samochodu przez tą sekundę. Niestety nie jest ono w stanie określić czy
prędkość zmalała czy wzrosła (no cóż... nie jest to może najlepsze urządzenie do tego typu
pomiarów, ale przynajmniej jest tanie). Uwaga, jeżeli na przykład samochód jechał w jednej
sekundzie z prędkością 10, a w kolejnej -5 (tzn. do tyłu), to urządzenie dokona pomiaru o
wartości 15.
Pewnego dnia serwisant KarBajt'u miał stłuczkę podczas jazdy badanym samochodem. Sprawą
natychmiast zainteresowała się policja. Po dłuższych oględzinach miejsca wypadku
wywnioskowano, że serwisant jest winny tylko jeżeli przekroczył dozwoloną prędkość. Jako że
nie było naocznych świadków (poza uczestnikami wypadku) odwołano się do danych
zapamiętanych przez wspomniane urządzenie. Charakter urządzenia nie pozwala co prawda na
odczytanie dokładnej prędkości w momencie wypadku, ale można dzięki niemu jakoś
ograniczyć od góry i od dołu możliwą prędkość. Przy odrobinie szczęścia, może to być
jednoznaczny dowód niewinności albo winy serwisanta. Warto zaznaczyć, że policji nie
interesuje to czy kierowca przekroczył prędkość jadąc do przodu czy do tyłu - interesuje ich tylko
wartość bezwzględna prędkości.
Zadanie
Dla podanej liczby pomiarów oraz wartości tych pomiarów zrobionych przez urządzenie przed
wypadkiem należy określić jaka była minimalna i maksymalna możliwa wartość bezwzględna z
prędkości pojazdu w momencie ostatniego z pomiarów. Należy założyć, że w momencie
włączenia urządzenia samochód stał (miał prędkość 0).
Specyfikacja wejścia
W pierwszej linii wejścia znajduje się jedna dodatnia liczba całkowita, oznaczająca liczbę
zestawów testowych, które dalej pojawią się na wejściu. Każdy zestaw ma następującą postać.
W pierwszej linii znajduje się jedna liczba całkowita N (1 ≤ N ≤ 5.000), oznaczająca liczbę
pomiarów, które zrobiło urządzenie. W kolejnych N liniach zestawu znajduje się N nieujemnych
liczb całkowitych (każda w osobnej linii), oznaczających dokonane pomiary w kolejnych
sekundach. Można założyć, że suma wartości pomiarów nie przekracza 10.000.
Specyfikacja wyjścia
Dla każdego zestawu danych pojawiającego się na wejściu należy wypisać linię zawierającą
dwie liczby całkowite oddzielone jedną spacją. Pierwsza liczba ma oznaczać minimalną, a
druga maksymalną prędkość jaką mógł mieć samochód dla danych pomiarów.
Przykład
Wejście
2
4
10
3
5
4
5
4
11
5
5
5
Wyjście
2 22
0 30
