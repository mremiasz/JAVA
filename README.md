# JAVA
Wyeksportować powtarzające się elementy z zadania do odrębnych metod i klas.

### Zadanie 1.

Stwórz interfejs Figure, który powinien zawierać metody getPerimeter (zwracającą obwód) oraz getArea (zwracającą powierzchnię). Następnie utwórz klasy Circle, Triangle i Rectangle, niech każda z klas implementuje interfejs Figure. Napisz program, który pobierze od użytkownika:
   - długość promienia koła,
   - długości boków trójkąta prostokątnego (boki przy kącie prostym),
   - długość boków prostokąta.
  
Utworzy instancje tych obiektów i umieści je w tablicy Figure[]. Następnie iterując po obiektach wyświetl pole oraz obwód aktualnego obiektu.

### Zadanie 2.

Napisać funkcję liczZnakiSlowa, która zlicza:
  - liczbę linii w pliku,
  - liczbę znaków w pliku,
  - liczbę białych znaków w pliku (białe znaki to spacja, tabulator, znacznik końca wiersza),
  - liczbę słów w pliku.
Wynikiem funkcji jest tablica złożona z 4 liczb całkowitych po jednej dla wymienionych podpunktów

### Zadanie 3.

Proszę napisać funkcję: ``void szukaj(String nazwaPlikWe, String nazwaPlikWy, String slowo)``, której zadaniem jest znalezienie wszystkich wierszy w pliku, które zawierają szukane słowo. Wszystkie wiersze, które zawierają słowo powinny zostać zapisane w pliku wynikowym wraz z nr wiersza (z pierwszego pliku). Nazwa pierwszego pliku zapamiętana jest w parametrze nazwaPlikWe, nazwa pliku wynikowego podana jest w parametrze nazwaPlikWy, natomiast szukane słowo w parametrze slowo.

Przykład - plik wejściowy:
     Ala ma jutro egzamin z biologii.
     Jan myje auto.
     Eh, jutro kolejny egzamin.
     Nie lubie polityki.

Jeżeli szukanym słowem byłoby "egzamin", to plik wynikowy powinien wyglądać następująco:

1: Ala ma jutro egzamin z biologii.

3: Eh, jutro kolejny egzamin. 


### Zadanie 4.

Napisać funkcję emerytura(String nazwaPliku), która wczyta z pliku o podanej nazwie dane pracowników zapisane w kolejnych wierszach w następujący sposób:

Imię Nazwisko Płeć Wiek\
Przykład:\
Tomasz Nowak M 42\
Marta Ziobro K 41\
Jan Kowalski M 25\
Ewelina Tusk K 35

Następnie funkcja dla każdego pracownika powinna wyznaczyć ile lat pozostało do jego emerytury. Wyniki należy zapisać w następujący sposób:


Nazwisko Imię "Lata do emerytury"\
Przykład:\
Nowak Tomasz 25\
Kowalski Jan 42

Wyniki dla kobiet należy zapisać w pliku o nazwie "kobiety.txt", natomiast wyniki dla mężczyzn należy zapisać w pliku "mezczyzni.txt".

### Zadanie 5.

Wygeneruj losową 2-wymiarową tablicę liczb rzeczywistych, a następnie zapisz ją do pliku. Napisz funkcję, która pobierałaby dane z tego pliku i obliczała średnie wartości względem wierszy i kolumn.


### Zadanie 6.1

Proszę napisać klasę Money, która będzie reprezętować pewną ilość pieniędzy. Klasa ta powinna zawierać metodę zwracającą ilość pieniędzy. Dane te powinny być inicjalizowane w konstruktorze. Klasa powinna implementować następujący interfejs:
```java
  public interface IMoney {
      double getAmount();
  }
```

### Zadanie 6.2

Proszę przesłonić metodę equals() w klasie Money tak, aby poprawnie porównała dwa obiekty tej klasy bazująć jedynie na ilości pieniędzy (wartość pola amount). Przykład:\
```java
  System.out.println(new Money(7).equals(new Money(7)));
  System.out.println(new Money(7).equals(new Money(4)));
```

Wynik działania programu:\
``
true

false
``
### Zadanie 6.3 

Proszę utworzyć dwie klasy potomne klasy Money (dziedziczące po Money): Dollar (dolar) oraz Euro (euro). Proszę zmodyfikować metodę equals() klasy Money tak, aby dla dwóch obiektów reprezentujących tę samą wartość, ale w innej walucie zwracała ona wartość false. Przykład:


System.out.println(new Dollar(6).equals(new Euro(6))); 

Wynik działania programu:
false

### Zadanie 6.4

Proszę dodać metodę add() do klasy Dollar oraz klasy Euro. Metoda ta powinna dodawać pieniądze tej samej waluty do siebie. Przykład:

```java
Dollar dollar = new Dollar(2.7); 
System.out.println(dollar.getAmount()); 
dollar.add(new Dollar(5.3));
System.out.println(dollar.getAmount()); 
```

Wynik działania programu:
2.7
8.0

### Zadanie 6.5

Proszę utworzyć klasę Exchange (wymiana) zawierającą przeliczniki walut. Klasa ta powinna zawierać dwie metody: dollarToEuroRatio() oraz euroToDollarRatio(). Metody te powinny zwracać przelicznik dla walut. Przykład:
```java
Exchange exchange = new Exchange(0.8); 
System.out.println(exchange.dollarToEuroRatio()); 
System.out.println(exchange.euroToDollarRatio()); 
```

Wynik działania programu:
0.8
1.25

### Zadanie 6.6

Proszę dodać do klasy Exchange metody dollarToEuro() oraz euroToDollars(). Metoda dollarToEuro() powinna przeliczać dolary na euro zgodnie z ustalonym przelicznikiem. Metoda euroToDollar() powinna przeliczać euro na dolary. Przykład:

```java
Dollar dollar1 = new Dollar(6.25); 
Exchange exchange = new Exchange(0.8); 
Euro euro1 = exchange.dollarToEuro(dollar1);
System.out.println(euro1.getAmount()); 
Dollar dollar2 = exchange.euroToDollar(euro1);
System.out.println(dollar2.getAmount()); 
```

Wynik działania programu:
5.0
6.25

### Zadanie 6.7

Proszę zmodyfikować metody add() w klasie Dollar i Euro tak, aby podczas dodawania automatycznie dokonywały przewalutowania. Przykład:

```java
Dollar dollar = new Dollar(4); 
Euro euro = new Euro(7); 
dollar.add(euro); 
System.out.println(dollar); 
```

Wynik działania programu:
12.75

### Zadanie 7.

Napisz klasę ,,Human'', która będzie reprezentowała człowieka. Niech klasa ta posiada atrybuty takie jak imię, wiek, kolor oczu, kolor włosów. Niech te dwa ostatnie atrybuty będą typami wyliczeniowymi. Stwórz instancję takiej klasy. Napisz klasę ,,Human'', która będzie reprezentowała człowieka. Niech klasa ta posiada atrybuty takie jak imię, wiek, kolor oczu, kolor włosów. Niech te dwa ostatnie atrybuty będą typami wyliczeniowymi. Stwórz instancję takiej klasy.

### Zadanie 8.

Napisz wyrażenie regulane, które:

  - sprawdza czy liczba zmiennoprzecinkowa podana przez użytkownika ma poprawny format. Na przykład liczba 67,8765433 czy -15 są poprawne ale 13-9, już nie,
  - sprawdza czy numer domu jest w formacie numer\numer. Poprawnym numerem jest 211\5A, 27B\5 czy 22\12, ale już numer abc\cba nie,
  - sprawdza czy użytkownik wprowadził poprawną nazwę miasta. Na przykład Krakow, Warszawa, Kielce są ok, jednak Miedz56 już nie. Dla uproszczenia załóżmy, że żadna nazwa miejscowości nie zawiera polskich znaków.
