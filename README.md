# SEM-1-EXAM-4

# 4. Køb blomster

I dette program skal brugeren præsenteres for en liste med 10 blomsternavne. Ud for hvert blomsternavn, vises et tal og brugeren skriver tallet for at vælge en bestemt blomst. Brugeren skal vælge i alt 3 blomster. Den samme blomst må gerne vælges mere end én gang. Derefter skal brugeren spørges om blomsterne skal sammensættes til en buket. Til sidst skal der vises en pris.
Du kan vælge at strukturere koden således:

1.	Opret en FlowerShop klasse.
- Tilføj en attribut som er en liste med Strings.
  I klassens konstruktor fylder du 10 blomsternavene i listen.
- En anden attribut, `total` holder styr på hvor mange penge brugeren har foretaget valg for.


2. Lav en metode i FlowerShop der præsenterer listen med blomster for brugeren, og viser en prisliste:
 ``` 
Prisliste:
   Blomst 1-4: 20kr
   Blomst 5-7: 40kr
   Blomst 8-10: 80kr
   Buket: 50kr
 ```


3. Lav en runDialog() metode i FlowerShop som 3 gange beder brugeren vælge en blomst fra listen.
   Opdater `total` attributten hver gang der er foretaget et valg.
   fx. hvis brugeren vælger blomst nr. 5 skal der lægges 40 kr til `total`.

4. Når de tre blomster er valgt, skal brugeren spørges om han/hun vil have dem bundet i en buket.
   `total`, justeres alt efter hvad der svares.

5. Instantiér FlowerShop og kald runDialog() metoden fra main. Du bestemmer selv hvornår i flowet blomsternavne og prisliste skal vises.