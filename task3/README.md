Treść zadania
Stwórz aplikację konsolową, która poprzez wyświetlanie logów w konsoli, będzie symulować w czasie rzeczywistym działanie komputera pokładowego samochodu, logującego podstawową telemetrię w trakcie jazdy (np. prędkość, promień skrętu kierownicy, temp. silnika itp.) z różnymi częstotliwościami próbkowania, na poziomie sekund.

-----------------------------------
Klasa Car posiada takie obiekty jak: Engine, SteeringLimitSwitch, Speedometer, którę symulują ruch samochodu (generują przykładowe wartości, np. prędkość). Klasa OnBoardComputer posiada obiekty zbierające dane z telemetrii pojazdu i próbkujące go z zadaną częstotliwością.
Częstotliwość jest podana w sekundach w stałych, np. VELOCITY_UPDATE_INTERVAL =1;
ScheduledExecutorService obsługuje wykonywane zadania z zadaną częstotliwością. 