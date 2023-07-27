+--------------------+              +-----------------------+
        |     HavaYolu       |              |      Ucus            |
        +--------------------+              +-----------------------+
        | - kimlik: String   |              | - ucusKimlik: String  |
        |                    |              | - kalkisHavalanı: String|
        +--------------------+              | - inisHavalanı: String |
        | +getKimlik():String|              | - kalkisSaat: String   |
        +--------------------+              | - inisSaat: String     |
        ^                             | - pilot: Pilot         |
        |                             | - yardimciPilot: Pilot |
        |                             | - ucak: Ucak           |
        |                             +-----------------------+
        +----------------------------------+                  ^
        |                                  |                  |
        +-------------------+            +-----------------+        |
        |   HavaYoluSirketi |            |     UcusTipi    |        |
        +-------------------+            +-----------------+        |
        | - havaYoluKimlik: String         | - tipAdi: String         |
        +-------------------+            +-----------------+        |
        | + getHavaYoluKimlik(): String    | + getTipAdi(): String    |
        +-------------------+            +-----------------+        |
        |
        |
        +--------------------------------------+-----------------------------------+
        |                                                                      |
        +-------------------+                                                 +-------------------+
        |       Ucak        |                                                 |      Pilot        |
        +-------------------+                                                 +-------------------+
        | - ucakKimlik: String                                                   | - pilotKimlik: String
        | - durum: String                                                        | - adSoyad: String
        +-------------------+                                                 +-------------------+
        | + getUcakKimlik(): String                                              | + getPilotKimlik(): String
        | + getDurum(): String                                                   | + getAdSoyad(): String
        +-------------------+                                                 +-------------------+
