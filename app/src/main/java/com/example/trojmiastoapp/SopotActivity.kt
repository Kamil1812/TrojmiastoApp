package com.example.trojmiastoapp

import Attraction
import AttractionsAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SopotActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gdynia)

        val attractions = listOf(
            Attraction("Molo", "Molo w Sopocie to symbol miasta i najdłuższe molo nad Morzem Bałtyckim. Trasa liczy pół kilometra i stanowi punkt obowiązkowy podczas każdej wizyty. Spacer ma na nie tylko charakter rekreacyjny, ale również zdrowotny - im dalej od lądu tym stężenie jodu jest wyższe. Atrakcja wSopocie to pierwszy punkt na mapie dla wielu turystów.",
                R.drawable.attraction_sopot1),
            Attraction("Krzywy Domek", "Krzywy Domek to kolejny symbol i atrakcja Sopotu znana na całym świecie. Powstał w 2004 r. z inicjatywy architektów Szotyńskich, którzy zainspirowali się pracami Jana Marcina Szancera. Obecnie Krzywy Domek to miejsce spotkań biznesu, handlu, gastronomii i rozrywki.",
                R.drawable.attraction_sopot2),
            Attraction("Grand Hotel", "Kolejny charakterystyczny budynek w centrum Sopotu, niedaleko plaży. Obecnie Sofitel Grand Sopot zapisał się w historii Polski przede wszystkim w okresie II wojny światowej, m.in. w 1939 roku pełnił funkcję Kwatery Głównej Adolfa Hitlera. Pięciogwiazdkowy hotel przyciąga turystów z całego świata niepowtarzalnym klimatem.",
                R.drawable.attraction_sopot3),
            Attraction("Opera Leśna", "Opera Leśna, czyli sopocki amfiteatr mieści się na terenie 4 ha i został otwarty w 1909 roku. Lokalizacja w Trójmiejskim Parku Krajobrazowym zapewnia niepowtarzalny charakter. W Operze Leśnej odbywają się cykliczne festiwale i koncerty.",
                R.drawable.attraction_sopot4),
        )

        val adapter = AttractionsAdapter(attractions)

        var recyclerViewAttractions = findViewById<RecyclerView>(R.id.recyclerViewAttractions)

        recyclerViewAttractions.adapter = adapter
        recyclerViewAttractions.layoutManager = LinearLayoutManager(this)
    }
}
