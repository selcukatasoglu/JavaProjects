+------------------+
        |     Hayvan       |
        +------------------+
        | - turAdi: String |
        | - agirlik: float |
        | - yas: int       |
        +------------------+
        | + getDosage(): float
        | + getFeedSchedule(): String
        +------------------+
        ^
        |
        |
        |
        +----------------------------+
        |                            |
        +--------------------+      +---------------------+
        |      Atlar         |      |      Kedigiller     |
        +--------------------+      +---------------------+
        |                    |      |                     |
        |                    |      |                     |
        +--------------------+      +---------------------+
        | + getDosage(): float      | + getDosage(): float |
        | + getFeedSchedule(): String| + getFeedSchedule(): String
        +--------------------+      +---------------------+
        ^
        |
        |
        |
        +-------------------+
        |    Kemirgenler    |
        +-------------------+
        |                   |
        |                   |
        +-------------------+
        | + getDosage(): float
        | + getFeedSchedule(): String
        +-------------------+
