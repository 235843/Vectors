# Vectors

Napisz program proszący o podanie 2 wektorów (wektor to ciąg liczb). Koniec wektora oznacza się za pomocą wciśnięcia klawisza enter. Jeżeli podany ciąg nie jest liczbą, jest ignorowany. Następnie należy spróbować dodać wektory, jeżeli są równej długości (są równej długości jeśli mają tę samą liczbę elementów). 
Jeżeli nie są, rzucany jest własny wyjątek WektoryRoznejDlugosciException, za pomocą którego można podać a następnie odczytać długości tych wektorów (należy tak skonstruować wyjątek, aby możliwe było skonstruowanie zdania po jego przechwyceniu : "Długość pierwszego wektora to AA a drugiego to BB" lub dowolnego innego zdania wykorzystującego wartości AA i BB, np. określającego różnicę w długościach). 
Jeżeli są równej długości, wynik dodawania zapisywany jest do pliku. Jeżeli nie są równej długości, użytkownik jest proszony o ponowne wprowadzenie tych wektorów.
