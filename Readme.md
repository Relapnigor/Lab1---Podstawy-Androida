# Lab1 – Podstawy Androida

## Cel zadania

Celem zadania jest przygotowanie aplikacji Android w języku Kotlin z interfejsem opartym na XML i komponentach AndroidX. Aplikacja ma umożliwiać przeglądanie listy atrakcji turystycznych, wyświetlanie szczegółów wybranej atrakcji oraz powrót do listy.

Projekt wykorzystuje jedną aktywność i fragmenty umieszczane w `FragmentContainerView`.

## 1. Interfejs XML

Należy przygotować interfejs aplikacji w plikach XML, uwzględniając listę atrakcji turystycznych, pojedynczy element listy oraz ekran szczegółów wybranej atrakcji.

- **`activity_main.xml`** – główny układ aktywności zawierający miejsce przeznaczone do wyświetlania fragmentów.
- **`fragment_list.xml`** – układ ekranu listy atrakcji turystycznych.
- **`item_attraction.xml`** – wygląd pojedynczej pozycji na liście, prezentującej podstawowe informacje o atrakcji.
- **`fragment_details.xml`** – układ ekranu szczegółów, przeznaczony do prezentowania informacji o wybranej atrakcji.

Wygląd interfejsu, rozmieszczenie elementów oraz identyfikatory widoków należy zaprojektować samodzielnie, zgodnie z przeznaczeniem poszczególnych ekranów.

## 2. Nawigacja

Należy zaimplementować obsługę nawigacji pomiędzy listą atrakcji a ekranem szczegółów, z wykorzystaniem fragmentów i transakcji `FragmentManager`.

- **`MainActivity.kt`** – obsługa głównej aktywności aplikacji oraz inicjalizacja początkowego fragmentu.
- **`ListFragment.kt`** – prezentowanie listy atrakcji i obsługa wyboru atrakcji przez użytkownika. Plik odpowiada za przejście do ekranu szczegółów.
- **`AttractionAdapter.kt`** – powiązanie danych atrakcji z elementami listy oraz przekazywanie informacji o wybranej pozycji do obsługi kliknięcia.
- **`DetailsFragment.kt`** – odbieranie identyfikatora wybranej atrakcji, pobieranie odpowiadających mu danych i prezentowanie szczegółów.

Nawigacja powinna wykorzystywać argumenty fragmentu do przekazania identyfikatora atrakcji oraz stos powrotu umożliwiający przywrócenie listy po opuszczeniu ekranu szczegółów. Należy również uwzględnić poprawną obsługę systemowego przycisku Wstecz.


```
Lab1 - Podstawy Androida/
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/example/catalog/
│           │       ├── MainActivity.kt      # Główna aktywność
│           │       ├── ListFragment.kt      # Ekran listy atrakcji
│           │       ├── DetailsFragment.kt   # Ekran szczegółów
│           │       ├── AttractionAdapter.kt # Adapter listy
│           │       └── Attraction.kt        # Model danych atrakcji
│           ├── res/
│           │   ├── layout/
│           │   │   ├── activity_main.xml    # Główny układ aktywności
│           │   │   ├── fragment_list.xml    # Układ listy atrakcji
│           │   │   ├── item_attraction.xml  # Układ elementu listy
│           │   │   └── fragment_details.xml # Układ szczegółów
│           │   └── values/                  # Kolory, teksty i motywy
│           └── AndroidManifest.xml          # Konfiguracja aplikacji
└── Readme.md                         # Treść zadania laboratoryjnego
```