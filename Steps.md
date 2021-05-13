* Frame it First (:movie_camera:)
    - add a test, add a class a method, return null
      SalesRecord, bonus, run and see passing
* pokazać ze to wystarczy na frame it first
   - co teraz jaki następny krok
    - dodać resztę parametrów, zeby mieć wszystkie wymagania: - pokazac przykład jak testować wszystko na raz
* Start with Basics (:movie_camera:)
    - decide what is basic, tax, data, commission
    - rysowanie  
    - basic is Quota vs Sales
    - decide to start with that
* Test the Obvious (:movie_camera:)
    - add test equals quota
    -run it should fail
* do the simplest thing that could work (:movie_camera:)
    - go to implementation
    - why  - because we are not allowed to add more code than is necessary to pass a test, we cannot refactor test is not passing.
    - return 0
* First test passing  
* Again Test the obvious 
   - sales - with sales greater that quota - test and implementation
* Brake it till you make it (:movie_camera:)
  * pytanie jak zepsuć moją implementację
  * quota bigger than sales - munis value and implementation
* going back to test - other tactics for writing tests
  - start with name (:movie_camera:)
  - start with assertions (:movie_camera:)
* more tests adding commision - starting with name
* reafactoring tests - extract method z pierwszego testu, extract parameters 
* more tests adding tax
* pokazać że uciekaliśmy od ostatecznej implementacji, rozwiązanie nie jest generyczne działa tylko dla okreslonych przypadków  
* Specific to Generics (:movie_camera:) whole time on one variable
  * see that we have only variable to hold sales
  * examples - one element instead of list, działanie dl liczb całkowitych zmaiast wszystkich, dzianie dla określonej defaultowej wartości, 3 ify zamiast pętli   
  * add test for many sales
  - renme sales to totalSale
  - add to sales collection
* jesteśmy w bardzo komfortowej sytuacji  
* Refactoring (:movie_camera:)

