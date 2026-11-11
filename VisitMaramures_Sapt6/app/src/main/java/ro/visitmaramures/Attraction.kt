package ro.visitmaramures

data class Attraction(
    val name: String,
    val category: String,
    val location: String,
    val description: String
)

val attractions = listOf(
    Attraction("Mănăstirea Bârsana", "Spiritual", "Bârsana",
        "Complex monahal cunoscut pentru arhitectura tradițională din lemn și peisajul său."),
    Attraction("Cimitirul Vesel", "Culture", "Săpânța",
        "Cimitir renumit pentru crucile colorate și epitafurile care prezintă într-un mod aparte povești de viață."),
    Attraction("Mocănița de pe Valea Vaserului", "Adventure", "Vișeu de Sus",
        "Tren cu abur care traversează peisajele forestiere ale Văii Vaserului."),
    Attraction("Biserica de lemn din Ieud", "Culture", "Ieud",
        "Biserică tradițională din lemn, reprezentativă pentru patrimoniul Maramureșului."),
    Attraction("Cascada Cailor", "Nature", "Borșa",
        "Cascadă montană situată în zona Munților Rodnei.")
)
