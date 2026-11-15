# AndroidStudio-Domek_INF04 – Domek w górach

Aplikacja mobilna na Androida (Kotlin + XML) wykonana na podstawie **części II** arkusza egzaminacyjnego
**INF.04-01-22.06-SG** (egzamin zawodowy, czerwiec 2022, kwalifikacja INF.04 – *Projektowanie, programowanie
i testowanie aplikacji*).

Aplikacja jest fragmentem programu do przeglądania ofert turystycznych – wyświetla ofertę „Domek w górach”
z licznikiem polubień.

## Materiały do zadania

| Plik | Opis |
|------|------|
| [`zasoby/arkusz_INF04_2022_06_01_SG.pdf`](zasoby/arkusz_INF04_2022_06_01_SG.pdf) | Arkusz egzaminacyjny z treścią zadania |
| [`zasoby/obraz.jpg`](zasoby/obraz.jpg) | Zdjęcie potrzebne do wykonania aplikacji (w arkuszu – z archiwum `zad1.zip`) |

![obraz.jpg](zasoby/obraz.jpg)

## Elementy aplikacji (wg arkusza)

- Tytuł „Domek w górach” (największa czcionka w aplikacji)
- Obraz `obraz.jpg` na całą szerokość ekranu
- Trzy przyciski obok siebie: **POLUB**, **USUŃ**, **ZAPISZ**, z białym tekstem na tle Teal (`#008080`)
- Napis z liczbą polubień, wyrównany do prawej (na start „0 polubień”)
- Szara linia pozioma (`#808080`)
- Pogrubiony napis „Opis”
- Napis „Odwiedź komfortowy domek w Sudetach, blisko do szlaków turystycznych” w kolorze Gray (`#808080`)

## Działanie

- **POLUB** – zwiększa licznik polubień o 1
- **USUŃ** – zmniejsza licznik o 1; licznik nie spada poniżej 0
- Stan licznika jest wyświetlany pod przyciskami jako „`<x>` polubień”

## Założenia z arkusza

- Interfejs zapisany w XML
- Pionowy `LinearLayout` z zagnieżdżonym poziomym `LinearLayout` dla przycisków
- Górny margines wewnętrzny (padding) całego układu: 20 dp

## Najważniejsze pliki

- [`app/src/main/res/layout/activity_main.xml`](app/src/main/res/layout/activity_main.xml) – interfejs użytkownika
- [`app/src/main/java/com/example/domek_inf04/MainActivity.kt`](app/src/main/java/com/example/domek_inf04/MainActivity.kt) – logika licznika polubień
- [`app/src/main/res/drawable/obraz.jpg`](app/src/main/res/drawable/obraz.jpg) – zdjęcie użyte w aplikacji

## Uruchomienie

1. Otwórz folder projektu w Android Studio.
2. Poczekaj na synchronizację Gradle (**File → Sync Project with Gradle Files**).
3. Uruchom aplikację na emulatorze lub telefonie (**Run ▶**). Minimalna wersja: Android 6.0 (API 23).
