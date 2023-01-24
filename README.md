# tdd-kurs
G-uppgift
För G krävs att följande utvecklas testdrivet.
* En användarklass
* Fält för användarnamn och lösenord.
* Getter-metod, equals-metod så att ett användarobjekt skall räknas som lika (samma anvnamn).
* En serviceklass för autentisering, m inloggningsmetod
* Inloggningsmetoden skall ta in ett namn samt ett lösenord, kunna göra ett anrop till en (mockad)
  databas, hämta en användare med det givna användarnamnet och returnera true om det finns en
  sådan användare med det angivna lösenordet. Om användaren inte finns eller om lösenordet inte
  finns skall ett exception throwas.





---

Original

G-uppgift
För G krävs att följande utvecklas testdrivet.
* En användarklass, där användare har fält för användarnamn och lösenord. Getter-metod för att
  hämta värdena samt en equals-metod så att ett användarobjekt med samma användarnamn som ett
  annat, skall räknas som lika vid jämförelse.
* En serviceklass för att hantera autentisering, som i sin tur har en inloggningsmetod
* Inloggningsmetoden skall ta in ett namn samt ett lösenord, kunna göra ett anrop till en (mockad)
  databas, hämta en användare med det givna användarnamnet och returnera true om det finns en
  sådan användare med det angivna lösenordet. Om användaren inte finns eller om lösenordet inte
  finns skall ett exception throwas.
