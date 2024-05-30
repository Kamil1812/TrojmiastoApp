package com.example.trojmiastoapp

import Attraction
import AttractionsAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GdanskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gdynia)

        val attractions = listOf(
            Attraction("Fontanna Neptuna", "Spacerując po Trakcie Królewskim nie ominiecie też Fontanny Neptuna, której obecność nie może dziwić. Przecież Gdańsk i morze związane są ze sobą od zawsze. W miejscu, gdzie dziś stoi fontanna początkowo znajdowała się studnia, jednak ówczesny burmistrz Gdańska, Bartłomiej Schachmann (mówimy o pierwszej połowie XVII wieku) postanowił zmienić lichą studnię w coś bardziej reprezentacyjnego. Udało mu się to świetnie, bo fontanna to dziś jeden z symboli Gdańska, przy którym chętnie fotografują się turyści - według Kaszubów każdy, kto pierwszy raz przyjeżdża do miasta powinien pocałować Neptuna w… cztery litery.",
                R.drawable.attraction_gdansk1),
            Attraction("Muzeum Bursztynu", "Gdańsk, czyli morze. A morze, czyli bursztyn. To właśnie Gdańsk pretendowany jest do miana światowej stolicy bursztynu. Otwierając drzwi wejściowe do Muzeum Bursztynu Waszym oczom ukaże się największa bryła tego żywicznego kruszcu na świecie, ważąca prawie 4,5 kg! Wiedzieliście, że historia tego naturalnego, żywicznego “złota” sięga ponad 40 milionów lat? Jeśli jesteście ciekawi jak powstał bursztyn, z czego jest zbudowany, czym jest las bursztynowy, czy bursztynem można leczyć, dlaczego tak często możemy spotkać zatopione w żywicy drobne zwierzęta lub fragmenty roślin czy jak pracują poławiacze bursztynu zapraszamy do Muzeum! Na ostatnim piętrze muzeum znajdziecie wyjątkową wystawę przedmiotów z bursztynu - pudełka, figurki, sztućce, biżuterię, a nawet bursztynowe szachy, które są jednym z czterech takich kompletów na świecie.",
                R.drawable.attraction_gdansk2),
            Attraction("Hevelianum i Góra Gradowa", "Hevelianum położone jest w niecodziennej scenerii dawnego fortu 46-metrowej Góry Gradowej. Sama Góra Gradowa to przede wszystkim świetny punkt widokowy, z którego podziwiać można panoramę Gdańska. Ufortyfikowane wzgórze kiedyś miało chronić miasto. Dziś znajduje się tu nowoczesne centrum nauk - Hevelianum, w którym poznamy nie tylko historię, ale i zagadnienia nauk ścisłych - matematyki, chemii, fizyki. Najmłodsi będą mogli dosłownie dotknąć nauki, a starsi będą mieli okazję w praktyce poznać zasady rządzące światem. Atrakcja mieści się w miejscu, w którym niegdyś znajdował się gdański gród, dlatego też jedna z wystaw “Wehikuł czasu - człowiek i pocisk” obrazuje epizody z czasów funkcjonowania fortu. Będziecie mogli poznać historię czarnego prochu i wojenną rzeczywistość tych, których życie toczyło się w schronach i artyleryjskich remizach. Spacer wzdłuż fortyfikacyjnych umocnień to nie tylko ciekawa lekcja historii, ale także miła wycieczka krajoznawcza z widokami na panoramę Gdańska. Inne wystawy to kolejne dziedziny - w jednej z nich na własnej skórze przekonacie się co znaczy podmuch wiatru o sile 120 km/h, będziecie mogli podziwiać zorzę polarną, wsiąść do windy, która przeniesie Was kilometry do góry i kilometry w głąb ziemi. Znajdziecie tu symulator jazdy w kilku trybach (zwykłym, deszczową nocą, zimą i pod wpływem alkoholu), dowiecie się czy można prześwietlić baterię, jakie drugie życie mają śmieci, jak wyglądają zanieczyszczenia na ziemi z kosmosu, a nawet będziecie mogli przymierzyć mundury wojów, związanych z Górą Gradową.",
                R.drawable.attraction_gdansk3),
            Attraction("Żuraw i Długie Pobrzeże  ", "Długie Pobrzeże to ciągnący się wzdłuż rzeki Motławy deptak, będący dzisiaj jedną z najchętniej uczęszczanych tras spacerowych. Przy deptaku znajdują się lokale takie jak restauracje, kawiarnie, bary. I trzeba przyznać, że sączenie kawy z widokami, jakie serwuje nam Motława jest jeszcze przyjemniejsze niż zwykle. Wzdłuż Długiego Pobrzeża znajduje się ciąg gotyckich bram wodnych, sięgających czasów średniowiecza. Jedną z nich jest słynny Żuraw - dźwig portowy, wykorzystywany kiedyś do przeładunku towarów i do stawiania masztów na statkach. Następnie wnętrze Żurawia zostało przekształcone w muzeum - jest to oddział Narodowego Muzeum Morskiego.",
                R.drawable.attraction_gdansk4),
        )

        val adapter = AttractionsAdapter(attractions)

        var recyclerViewAttractions = findViewById<RecyclerView>(R.id.recyclerViewAttractions)

        recyclerViewAttractions.adapter = adapter
        recyclerViewAttractions.layoutManager = LinearLayoutManager(this)
    }
}
