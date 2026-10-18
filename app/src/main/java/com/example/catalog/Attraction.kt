package com.example.catalog

/** Model pojedynczej atrakcji. Dane są przygotowane; nie trzeba tworzyć bazy danych. */
data class Attraction(
    val id: Int,
    val name: String,
    val location: String,
    val summary: String,
    val description: String
)

/** Repozytorium przykładowych danych dostępne dla obu fragmentów. */
object AttractionRepository {
    val attractions = listOf(
        Attraction(
            id = 1,
            name = "Rynek Główny",
            location = "Kraków",
            summary = "Historyczne centrum miasta",
            description = "Jeden z największych średniowiecznych rynków w Europie. " +
                "W jego pobliżu znajdują się Sukiennice i Bazylika Mariacka."
        ),
        Attraction(
            id = 2,
            name = "Kopalnia Soli",
            location = "Wieliczka",
            summary = "Podziemna trasa turystyczna",
            description = "Zabytkowa kopalnia soli z podziemnymi komorami, " +
                "rzeźbami solnymi i kaplicą św. Kingi."
        ),
        Attraction(
            id = 3,
            name = "Morskie Oko",
            location = "Tatry",
            summary = "Jezioro otoczone górami",
            description = "Popularne jezioro w Tatrach, położone w malowniczej " +
                "dolinie i otoczone wysokimi szczytami."
        ),
        Attraction(
            id = 4,
            name = "Zamek w Malborku",
            location = "Malbork",
            summary = "Średniowieczna twierdza krzyżacka",
            description = "Rozległy ceglany zamek nad Nogatem, będący jednym " +
                "z najbardziej znanych zabytków gotyckiej architektury obronnej."
        ),
        Attraction(
            id = 5,
            name = "Stare Miasto",
            location = "Toruń",
            summary = "Gotycka architektura i historia",
            description = "Historyczna część Torunia znana z gotyckich budowli " +
                "i tradycji wypieku pierników."
        ),
        Attraction(
            id = 6,
            name = "Bieszczadzki Park Narodowy",
            location = "Bieszczady",
            summary = "Połoniny i szlaki górskie",
            description = "Obszar chroniący górskie łąki, lasy i cenne siedliska " +
                "przyrodnicze w południowo-wschodniej Polsce."
        )
    )

    fun findById(id: Int): Attraction? = attractions.firstOrNull { it.id == id }
}
