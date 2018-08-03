Napisz program, który będzie symulował zarządzanie szpitalem w polskich realiach. Zdefiniuj klasy:

- Person - przechowuje imię i nazwisko osoby oraz informację o wysokości wypłaty
- Doctor - rozszerza klasę Person o dodatkowe pole bonus (premia)
- Nurse (pielęgniarka) - rozszerza klasę Person o pole overtime (nadgodziny)
- Hospital - przechowuje informacje o pracownikach szpitala w tablicy typu Person[]. Powinna istnieć metoda add() pozwalająca dodać nowego pracownika do tablicy pracowników
- HospitalApp - klasa testowa

Każda z klas powinna posiadać konstruktor pozwalający zainicjować wszystkie pola danej klasy. Załóż, że w szpitalu pracują 3 osoby - 1 lekarz i 2 pielęgniarki, przypisz ich do tablicy w obiekcie Hospital. Zdefiniuj w klasie Hospital metodę toString(), która z wykorzystaniem pętli for zwróciinformacje o każdym pracowniku. W przypadku każdego z nich informacja ta powinna mówić o wszystkich polach jakie przechowuje dana klasa (wykorzystaj metodę toString()).
