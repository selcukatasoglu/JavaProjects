+----------------------+    1   +---------------------+
        |     Asansor          |--------|   AsansorKontrol    |
        +----------------------+    *   +---------------------+
        | - kapasite: int      |        | - asansorler: Asansor[]|
        | - yolcuSayisi: int   |        | - saat: Saat           |
        | - hedefKatlar: Set<int>|      +---------------------+
        | - kat: int           |               ^
        | - yon: enum          |               |
        +----------------------+               |
        | + hareketEt(): void                 |
        | + durakla(): void                   |
        | + yolcuBin(int): void               |
        | + yolcuInis(int): void              |
        +----------------------+               |
        |
        |
        +--------------+
        |   AsansorKapi |
        +--------------+
        |              |
        |              |
        +--------------+
        | +ac(): void  |
        | +kapat(): void|
        +--------------+
        ^
        |
        |
        +------------------|-------------------+
        |                  |                   |
        +-------------------+   +----------------+  +-------------------+
        |   AsansorDugme   |   |   AsansorGozluk |  |    AsansorIsci   |
        +-------------------+   +----------------+  +-------------------+
        | - yon: enum       |   | - yon: enum    |  | - yon: enum       |
        | - kat: int        |   | - kat: int     |  | - kat: int        |
        +-------------------+   +----------------+  +-------------------+
        | +bas(): void      |   | +isikYandimi(): bool| + hareketEt(): void|
        |                   |   |                   | + durakla(): void  |
        +-------------------+   +----------------+  +-------------------+
