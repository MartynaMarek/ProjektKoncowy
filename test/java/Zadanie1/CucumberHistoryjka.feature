Feature: Scenario: Codersguru
Scenario: Registration on page

  Given an open browser with https://tester.codersguru.pl/
  When button 'Załóż konto' is clicked
  And open the registration page
  And button'Prywatnie' is clicked
  And write down E-mail adress in 'E-mail' box
  And write down Imię in 'Imię' box
  And write down Nazwisko in 'Nazwisko' box
  And write down Hasło in 'Hasło' box
  And write down Powtórz hasło in 'Powtórz hasło' box
  And write down Miasto in 'Miasto' box
  And write down Kod pocztowy in 'Kod pocztowy' box
  And write down Ulica in 'Ulica' box
  And write down Numer domu/lokalu in 'Numer domu/lokalu' box
  And click checkbox 'Zapoznałem się z Regulaminem'
  And click 'Zarejestruj' button
  Then registered page is appeared
  And close browser