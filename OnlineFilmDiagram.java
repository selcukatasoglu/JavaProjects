
+----------------------+             +-----------------------+
        |      Kullanici      |             |        Film           |
        +----------------------+             +-----------------------+
        | - kullaniciID: int  |             | - filmID: int          |
        | - kullaniciAdi: str |             | - filmAdi: str         |
        | - aboneMi: bool     |             | - krediBedeli: int     |
        | - krediMiktari: int |             | - mevcutMu: bool       |
        +----------------------+             +-----------------------+
        | + krediSatinAl(): void            | + filmKirala(): bool    |
        | + filmSatinAl(): bool             | + filmTalepEt(): void   |
        +----------------------+             +-----------------------+
        ^                                     ^
        |                                     |
        |                                     |
        +-------------------+                +----------------------------+
        |   NormalKullanici |                |      AboneKullanici        |
        +-------------------+                +----------------------------+
        |                   |                |                            |
        |                   |                |                            |
        +-------------------+                +----------------------------+
        | + filmSatinAl(): bool              | + filmKirala(): bool       |
        +-------------------+                +----------------------------+
