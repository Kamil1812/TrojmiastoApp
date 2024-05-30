package com.example.trojmiastoapp

import Attraction
import AttractionsAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GdyniaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gdynia)

        val attractions = listOf(
            Attraction("Muzeum Miasta", "Jak z maleńkiej wioski rybackiej zbudować w krótkim czasie ponad 100 tysięczne miasto z prężnie działającym portem? Właśnie taką ekspresową drogę przeszła Gdynia, a jej niezwykły rozwój możemy odkrywać między innymi w Muzeum Miasta Gdyni. Tutaj mamy okazję poznać ludzi, którzy ją stworzyli, czyli wielkich marzycieli o morzu, wolności i dobrobycie. Muzeum opowiada w niezwykle barwny sposób o historii Gdyni, a multimedialny przekaz jest dla nas zrozumiały i ciekawy.",
                R.drawable.attraction_gdynia1),
            Attraction("Akwarium", "Świetną atrakcją Gdyni szczególnie dla rodzin z dziećmi będzie wizyta w Akwarium Gdyńskim. To nietypowy ogród zoologiczny, w którym możemy zobaczyć wodne zwierzęta z całego świata. Do zwiedzenia mamy tutaj aż 3 piętra. Dodatkowo sale podzielone są na 7 tematycznych części, zobaczymy tutaj ogromne żółwie błotne, płaszczki, czy rekiny.",
                R.drawable.attraction_gdynia2),
            Attraction("Kamienna Góra", "Jednym z najlepszych punktów widokowych w Gdyni jest Kamienna Góra, która w najwyższym punkcie osiąga 52 m n.p.m. Na szczycie wzgórza znajdziemy taras widokowy oraz krzyż, który jest dobrze widoczny chociażby ze Skweru Kościuszki. Co ciekawe, na wzgórze możemy wejść wijącymi się schodkami lub wjechać kolejką, która jest darmową atrakcją Gdyni.",
                R.drawable.attraction_gdynia3),
            Attraction("Klif Orłowski", "Klif Orłowski to genialna atrakcja Gdyni, którą po prostu trzeba zobaczyć. Tym bardziej, że co roku wzburzone fale Bałtyku wciąż zabierają w swoje otchłanie część brzegu. Klif Orłowski wyróżniają strome brzegi, które są najlepszym punktem widokowym Gdyni. Klif Orłowski ciągnie się na odcinku 650 metrów, jednak żeby zobaczyć go z każdej strony najlepiej obejść klif dookoła. Najpierw warto wspiąć się na jego szczyt. Z punktu widokowego zobaczymy niezwykłą panoramę Zatoki Gdańskiej. Szlak górny po klifie liczy 1,3 km.",
                R.drawable.attraction_gdynia4),
        )

        val adapter = AttractionsAdapter(attractions)

        var recyclerViewAttractions = findViewById<RecyclerView>(R.id.recyclerViewAttractions)

        recyclerViewAttractions.adapter = adapter
        recyclerViewAttractions.layoutManager = LinearLayoutManager(this)
    }
}
