# Übung 05 – Lösungen  
Autor: Elias Jahnel  
Kurs: Einführung in die Programmierung  
Universität zu Köln

Dieses Repository enthält die Lösungen zu **Übung 05** des Kurses *Einführung in die Programmierung*.  
Alle Aufgaben wurden gemäß den Anforderungen der Übungsbeschreibung umgesetzt.  
Die Dateien befinden sich in den entsprechenden Packages (`h1`, `h2`, `h3`) und sind lauffähig.

---

## Struktur des Repositories

uebung05-elias/
├── h1/
│ └── H1_main.java
├── h2/
│ └── H2_main.java
└── h3/
└── H3_main.java

markdown
Code kopieren

Jede Klasse enthält eine `main`-Methode und erfüllt die spezifizierten Anforderungen der jeweiligen Aufgabenstellung.

---

## Hausaufgabe 1 – Reihenfolge umdrehen (15 Punkte)

**Datei:** `h1/H1_main.java`  
**Package:** `h1`

### Aufgabe:
- Ein `int`-Array `myArray` wird deklariert und initialisiert.
- Die Reihenfolge der Elemente soll vollständig umgedreht werden.
- Umsetzung erfolgt in-place ohne zusätzliches Hilfsarray.

### Ergebnis:
Die Ausgabe zeigt die umgedrehte Reihenfolge der Arrayelemente.

---

## Hausaufgabe 2 – Ziffern und Arrays (35 Punkte)

**Datei:** `h2/H2_main.java`  
**Package:** `h2`

### Aufgabe:
- `int n`: Eingabewert  
- `int digits`: Anzahl der Ziffern von `n`  
- `int[] a`: Array der Länge 9  
- Rechtsbündige Speicherung aller Ziffern von `n` (höchstwertige Ziffer links, niedrigste rechts)

### Beispiel:
Für `n = 299` lautet die Ausgabe des Arrays:
0 0 0 0 0 0 2 9 9

markdown
Code kopieren

---

## Hausaufgabe 3 – Stückzahl zu Betrag (50 Punkte)

**Datei:** `h3/H3_main.java`  
**Package:** `h3`

### Aufgabe:
- Zweidimensionales Array `einheiten[2][15]`.
  - Erste Zeile enthält feste Werte für Euro- und Cent-Beträge.
  - Zweite Zeile speichert, wie viele Einheiten jeweils benötigt werden.
- `input` enthält einen Betrag in Cent, der mit minimal vielen Scheinen/Münzen zerlegt werden soll.
- Die Berechnung erfolgt mittels Greedy-Algorithmus (größte Einheit zuerst).

### Beispiel:
Für `input = 6279` wird das Array wie folgt gefüllt (gekürzt dargestellt):
50000 20000 10000 ... 5 2 1
0 0 0 ... 1 1 0 1 2 0

yaml
Code kopieren

---

## Hinweise

- Alle Programme sind eigenständig lauffähig.
- Die verwendete Struktur entspricht den Vorgaben der Universität.
- Es wurden ausschließlich die in der Aufgabenstellung geforderten Packages und Klassennamen verwendet.

---

## Ausführung

### Kompilieren:
javac h1/H1_main.java
javac h2/H2_main.java
javac h3/H3_main.java

shell
Code kopieren

### Ausführen:
java h1.H1_main
java h2.H2_main
java h3.H3_main

yaml
Code kopieren

---

## Lizenz
Dieses Repository dient ausschließlich der Abgabe im Rahmen des Kurses *Einführung in die Programmierung* an der Universität zu Köln.
